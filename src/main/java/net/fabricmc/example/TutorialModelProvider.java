package net.fabricmc.example;

import net.fabricmc.fabric.api.client.model.ModelProviderContext;
import net.fabricmc.fabric.api.client.model.ModelProviderException;
import net.fabricmc.fabric.api.client.model.ModelResourceProvider;
import net.minecraft.client.render.model.UnbakedModel;
import net.minecraft.util.Identifier;

public class TutorialModelProvider implements ModelResourceProvider {
    public static final FourSidedFurnaceModel FOUR_SIDED_FURNACE_MODEL = new FourSidedFurnaceModel();
    public static final Identifier FOUR_SIDED_FURNACE_MODEL_BLOCK = new Identifier("tutorial:block/four_sided_furnace");
    public static final Identifier FOUR_SIDED_FURNACE_MODEL_ITEM = new Identifier("tutorial:item/four_sided_furnace");

    @Override
    public UnbakedModel loadModelResource(Identifier identifier, ModelProviderContext modelProviderContext) throws ModelProviderException {
        if(identifier.equals(FOUR_SIDED_FURNACE_MODEL_BLOCK) || identifier.equals(FOUR_SIDED_FURNACE_MODEL_ITEM)) {
            return FOUR_SIDED_FURNACE_MODEL;
        } else {
            return null;
        }
    }
}
