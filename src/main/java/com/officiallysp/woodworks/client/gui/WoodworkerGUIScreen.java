package com.officiallysp.woodworks.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.officiallysp.woodworks.world.inventory.WoodworkerGUIMenu;
import com.officiallysp.woodworks.network.WoodworkerGUIButtonMessage;
import com.officiallysp.woodworks.WoodworksMod;

import com.mojang.blaze3d.systems.RenderSystem;

public class WoodworkerGUIScreen extends AbstractContainerScreen<WoodworkerGUIMenu> {
	private final static HashMap<String, Object> guistate = WoodworkerGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox STATUS;
	Button button_process;

	public WoodworkerGUIScreen(WoodworkerGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 175;
		this.imageHeight = 145;
	}

	private static final ResourceLocation texture = new ResourceLocation("woodworks:textures/screens/woodworker_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		STATUS.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (STATUS.isFocused())
			return STATUS.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		STATUS.tick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.woodworks.woodworker_gui.label_woodworking"), 6, 5, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		STATUS = new EditBox(this.font, this.leftPos + 79, this.topPos + 6, 88, 18, Component.translatable("gui.woodworks.woodworker_gui.STATUS")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.woodworks.woodworker_gui.STATUS").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.woodworks.woodworker_gui.STATUS").getString());
				else
					setSuggestion(null);
			}
		};
		STATUS.setSuggestion(Component.translatable("gui.woodworks.woodworker_gui.STATUS").getString());
		STATUS.setMaxLength(32767);
		guistate.put("text:STATUS", STATUS);
		this.addWidget(this.STATUS);
		button_process = Button.builder(Component.translatable("gui.woodworks.woodworker_gui.button_process"), e -> {
			if (true) {
				WoodworksMod.PACKET_HANDLER.sendToServer(new WoodworkerGUIButtonMessage(0, x, y, z));
				WoodworkerGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 60, this.topPos + 32, 63, 20).build();
		guistate.put("button:button_process", button_process);
		this.addRenderableWidget(button_process);
	}
}
