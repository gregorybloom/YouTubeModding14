package com.mcjty.mytutorial.dimension.chunkgen.surfacebuilders;

import com.mcjty.mytutorial.MyTutorial;
import com.mcjty.mytutorial.dimension.TutorialChunkGenerator;
import com.mcjty.mytutorial.dimension.surfacebuilders.FDZDefaultSurfaceBuilder;
import com.mcjty.mytutorial.dimension.surfacebuilders.FDZSurfaceBuilders;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.surfacebuilders.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

//  https://github.com/TelepathicGrunt/UltraAmplifiedDimension-Forge/blob/latest-released/src/main/java/com/telepathicgrunt/ultraamplifieddimension/world/surfacebuilder/configs/QuadrarySurfaceBuilderConfig.java

public class FDZConfiguredSurfaceBuilders {

    // misc stub, not in use

    public static final SurfaceBuilderConfig BUILDER_BASIC_CONFIG = new SurfaceBuilderConfig(Blocks.PODZOL.defaultBlockState(), Blocks.COARSE_DIRT.defaultBlockState(), Blocks.GRASS.defaultBlockState());

    private static <C extends ISurfaceBuilderConfig, F extends ConfiguredSurfaceBuilder<C>> F register(String key, F builder) {
        return Registry.register(WorldGenRegistries.CONFIGURED_SURFACE_BUILDER, new ResourceLocation(MyTutorial.MODID, key), builder);
    }

    public static void register(String name, Registry<ConfiguredSurfaceBuilder<?>> register) {
        Registry.register(register, new ResourceLocation(MyTutorial.MODID,name), ConfiguredSurfaceBuilders.BASALT_DELTAS);
    }

};