package net.jorgev96.jroleitems.world.feature;
import net.jorgev96.jroleitems.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class ModConfiguredFeatures {
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> ANCESTRAL_TREE_BLUE =
            FeatureUtils.register("ancestral_tree_blue", Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(
                            BlockStateProvider.simple(ModBlocks.ANCESTRAL_LOG_BLUE.get()),
                            new StraightTrunkPlacer(5, 6, 3),
                            BlockStateProvider.simple(ModBlocks.ANCESTRAL_LEAVES_BLUE.get()),
                            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                            new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> ANCESTRAL_TREE_ORANGE =
            FeatureUtils.register("ancestral_tree_orange", Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(
                            BlockStateProvider.simple(ModBlocks.ANCESTRAL_LOG_ORANGE.get()),
                            new StraightTrunkPlacer(5, 6, 3),
                            BlockStateProvider.simple(ModBlocks.ANCESTRAL_LEAVES_ORANGE.get()),
                            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                            new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> ANCESTRAL_TREE_PURPLE =
            FeatureUtils.register("ancestral_tree_purple", Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(
                            BlockStateProvider.simple(ModBlocks.ANCESTRAL_LOG_PURPLE.get()),
                            new StraightTrunkPlacer(5, 6, 3),
                            BlockStateProvider.simple(ModBlocks.ANCESTRAL_LEAVES_PURPLE.get()),
                            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                            new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final Holder<PlacedFeature> ANCESTRAL_TREE_BLUE_CHECKED =
            PlacementUtils.register("ancestral_tree_blue_checked", ANCESTRAL_TREE_BLUE,
            PlacementUtils.filteredByBlockSurvival(ModBlocks.ANCESTRAL_SAPLING_BLUE.get()));

    public static final Holder<PlacedFeature> ANCESTRAL_TREE_ORANGE_CHECKED =
            PlacementUtils.register("ancestral_tree_orange_checked", ANCESTRAL_TREE_ORANGE,
                    PlacementUtils.filteredByBlockSurvival(ModBlocks.ANCESTRAL_SAPLING_ORANGE.get()));

    public static final Holder<PlacedFeature> ANCESTRAL_TREE_PURPLE_CHECKED =
            PlacementUtils.register("ancestral_tree_purple_checked", ANCESTRAL_TREE_PURPLE,
                    PlacementUtils.filteredByBlockSurvival(ModBlocks.ANCESTRAL_SAPLING_PURPLE.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> ANCESTRAL_SPAWN_BLUE =
            FeatureUtils.register("ancestral_spawn_blue", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(ANCESTRAL_TREE_BLUE_CHECKED,
                            0.5F)), ANCESTRAL_TREE_BLUE_CHECKED));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> ANCESTRAL_SPAWN_ORANGE =
            FeatureUtils.register("ancestral_spawn_orange", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(ANCESTRAL_TREE_ORANGE_CHECKED,
                            0.5F)), ANCESTRAL_TREE_ORANGE_CHECKED));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> ANCESTRAL_SPAWN_PURPLE =
            FeatureUtils.register("ancestral_spawn_purple", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(ANCESTRAL_TREE_PURPLE_CHECKED,
                            0.5F)), ANCESTRAL_TREE_PURPLE_CHECKED));
    
}
