package com.mcjty.mytutorial.dimension.chunkgen.surfacebuilders;

import com.mcjty.mytutorial.MyTutorial;
import com.mcjty.mytutorial.dimension.surfacebuilders.FDZSurfaceBuilders;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;


public class FDZConfiguredSurfaceBuilders {

    // misc stub, not in use

    //    public static final ConfiguredSurfaceBuilder<SurfaceBuilderConfig> FDZ_TEST = register("fdz_test", new ConfiguredSurfaceBuilder(FDZSurfaceBuilders.DEFAULT_FDZ.get(), FDZSurfaceBuilders.DEFAULT_FDZ.));
    private static <C extends ISurfaceBuilderConfig, F extends ConfiguredSurfaceBuilder<C>> F register(String key, F builder)
    {
        return Registry.register(WorldGenRegistries.CONFIGURED_SURFACE_BUILDER, new ResourceLocation(MyTutorial.MODID, key), builder);
    }
}
