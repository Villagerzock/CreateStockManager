package net.villagerzock.createstockmanager.client.screens;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.villagerzock.createstockmanager.CreateStockManager;

public class StockManagerScreen extends AbstractContainerScreen {
    public static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(CreateStockManager.MODID,"textures/gui/stock_manager.png");
    private final boolean hasCraftingField;

    public StockManagerScreen(AbstractContainerMenu menu, Inventory playerInventory, Component title,boolean hasCraftingField) {
        super(menu, playerInventory, title);
        this.hasCraftingField = hasCraftingField;
    }


    @Override
    protected void renderBg(GuiGraphics guiGraphics, float v, int i, int i1) {
        int height = this.minecraft.getWindow().getGuiScaledHeight();
        int x = this.minecraft.getWindow().getGuiScaledWidth() / 2 - 112;
        AllGuiTextures.STOCK_MANAGER_HEADER.render(guiGraphics,getGuiLeft() - 15, getGuiTop());
    }
}
