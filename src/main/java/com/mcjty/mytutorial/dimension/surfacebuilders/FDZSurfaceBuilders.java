package com.mcjty.mytutorial.dimension.surfacebuilders;

import com.mcjty.mytutorial.MyTutorial;
import com.mcjty.mytutorial.dimension.TutorialChunkGenerator;
import com.mojang.serialization.Codec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.util.LazyValue;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = MyTutorial.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FDZSurfaceBuilders {
    public static final DeferredRegister<SurfaceBuilder<?>> SURFACE_BUILDERS = DeferredRegister.create(ForgeRegistries.SURFACE_BUILDERS, MyTutorial.MODID);

    // Biomes are registered before surface builders and need the raw objects. So don't use DeferredRegister here.
    public static final RegistryObject<SurfaceBuilder<?>> EMPTY_FDZ = SURFACE_BUILDERS.register("fdz_empty_surfacebuilder_class", () -> new FDZEmptySurfaceBuilder(SurfaceBuilderConfig.CODEC));
    public static final RegistryObject<SurfaceBuilder<?>> DEFAULT_FDZ = SURFACE_BUILDERS.register("fdz_default_surfacebuilder_class", () -> new FDZDefaultSurfaceBuilder(SurfaceBuilderConfig.CODEC));

}
