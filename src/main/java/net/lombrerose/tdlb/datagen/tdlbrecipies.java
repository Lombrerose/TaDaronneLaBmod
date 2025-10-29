package net.lombrerose.tdlb.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.lombrerose.tdlb.TaDaronneLaB;
import net.lombrerose.tdlb.item.tdlbitem;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class tdlbrecipies extends FabricRecipeProvider {
    public tdlbrecipies(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, tdlbitem.PIOCHE_DIVINE)
                .pattern("TTT")
                .pattern(" S ")
                .pattern(" S ")
                .input('T', tdlbitem.TABLEAU_DIVIN)
                .input('S', Items.STICK)
                .criterion(hasItem(tdlbitem.TABLEAU_DIVIN), conditionsFromItem(tdlbitem.TABLEAU_DIVIN)).offerTo(recipeExporter, Identifier.of(TaDaronneLaB.MOD_ID, "pioche_divine"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, tdlbitem.HACHE_DIVINE)
                .pattern("TT")
                .pattern("ST")
                .pattern("S ")
                .input('T', tdlbitem.TABLEAU_DIVIN)
                .input('S', Items.STICK)
                .criterion(hasItem(tdlbitem.TABLEAU_DIVIN), conditionsFromItem(tdlbitem.TABLEAU_DIVIN)).offerTo(recipeExporter, Identifier.of(TaDaronneLaB.MOD_ID, "hache_divine"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, tdlbitem.EPEE_DIVINE)
                .pattern("T")
                .pattern("T")
                .pattern("S")
                .input('T', tdlbitem.TABLEAU_DIVIN)
                .input('S', Items.STICK)
                .criterion(hasItem(tdlbitem.TABLEAU_DIVIN), conditionsFromItem(tdlbitem.TABLEAU_DIVIN)).offerTo(recipeExporter, Identifier.of(TaDaronneLaB.MOD_ID, "epee_divine"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, tdlbitem.FAUX_DIVINE)
                .pattern("TT")
                .pattern("S ")
                .pattern("S ")
                .input('T', tdlbitem.TABLEAU_DIVIN)
                .input('S', Items.STICK)
                .criterion(hasItem(tdlbitem.TABLEAU_DIVIN), conditionsFromItem(tdlbitem.TABLEAU_DIVIN)).offerTo(recipeExporter, Identifier.of(TaDaronneLaB.MOD_ID, "faux_divine"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, tdlbitem.PELLE_DIVINE)
                .pattern("T")
                .pattern("S")
                .pattern("S")
                .input('T', tdlbitem.TABLEAU_DIVIN)
                .input('S', Items.STICK)
                .criterion(hasItem(tdlbitem.TABLEAU_DIVIN), conditionsFromItem(tdlbitem.TABLEAU_DIVIN)).offerTo(recipeExporter, Identifier.of(TaDaronneLaB.MOD_ID, "pelle_divine"));
    }
}
