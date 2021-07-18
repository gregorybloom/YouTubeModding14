package com.mcjty.mytutorial.dimension.features;

import com.mcjty.mytutorial.MyTutorial;
import com.mcjty.mytutorial.blocks.FirstBlock;
import com.mcjty.mytutorial.dimension.surfacebuilders.FDZDefaultSurfaceBuilder;
import com.mcjty.mytutorial.dimension.surfacebuilders.FDZEmptySurfaceBuilder;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FDZFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, MyTutorial.MODID);

//    public static final RegistryObject<Feature<NoFeatureConfig>> WHACKTREE_FDZ = FEATURES.register("basictree", () -> new FDZBasicTreeFeature(NoFeatureConfig.CODEC));

//    public static final RegistryObject<Feature<BlockStateFeatureConfig>> TEST_LAKE = FEATURES.register("feature_test_lake", () -> new TestLake(BlockStateFeatureConfig::deserialize));


}
