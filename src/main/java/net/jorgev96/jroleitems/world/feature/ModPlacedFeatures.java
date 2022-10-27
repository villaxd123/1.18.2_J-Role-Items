package net.jorgev96.jroleitems.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> ANCESTRAL_PLACED_BLUE =
            PlacementUtils.register("ancestral_placed_blue",
                    ModConfiguredFeatures.ANCESTRAL_SPAWN_BLUE, VegetationPlacements.treePlacement(
                            PlacementUtils.countExtra(1, 0.1F, 4)));

    public static final Holder<PlacedFeature> ANCESTRAL_PLACED_ORANGE =
            PlacementUtils.register("ancestral_placed_orange",
                    ModConfiguredFeatures.ANCESTRAL_SPAWN_ORANGE, VegetationPlacements.treePlacement(
                            PlacementUtils.countExtra(1, 0.1F, 4)));

    public static final Holder<PlacedFeature> ANCESTRAL_PLACED_PURPLE =
            PlacementUtils.register("ancestral_placed_purple",
                    ModConfiguredFeatures.ANCESTRAL_SPAWN_PURPLE, VegetationPlacements.treePlacement(
                            PlacementUtils.countExtra(1, 0.1F, 4)));
}
