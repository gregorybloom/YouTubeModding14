package com.mcjty.mytutorial.dimension.surfacebuilders;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

import java.util.Random;

public class FDZDefaultSurfaceBuilder extends SurfaceBuilder<SurfaceBuilderConfig> {

    public FDZDefaultSurfaceBuilder(Codec<SurfaceBuilderConfig> p_i232124_1_) {
        super(p_i232124_1_);
    }

    public void buildSurfaceAndBedrock(Random random, IChunk chunkIn, Biome biomeIn, int x, int z, int startHeight, double noise, BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, SurfaceBuilderConfig config) {
        System.out.println("@@@@@@@@@@@@@@@ CHK @@@@@@@@@@@@@@@@");
        this.apply(random,chunkIn,biomeIn,x,z,startHeight,noise,defaultBlock,defaultFluid,seaLevel,seed,config);
    }

    @Override
    public void apply(Random random, IChunk chunkIn, Biome biomeIn, int x, int z, int startHeight, double noise, BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, SurfaceBuilderConfig config) {
        System.out.println("@@@@@@@@@@@@@@@ BOOGIE @@@@@@@@@@@@@@@@");
        this.apply(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, config.getTopMaterial(), config.getUnderMaterial(), config.getUnderwaterMaterial(), seaLevel);
    }

    protected void apply(Random random, IChunk chunkIn, Biome biomeIn, int x, int z, int startHeight, double noise, BlockState defaultBlock, BlockState defaultFluid, BlockState top, BlockState middle, BlockState bottom, int sealevel) {

        BlockState topState = top;
        BlockState middleState = middle;
        int generatedDirtDepth = -1;
        int dirtDepth = (int) (noise / 3.0D + 3.0D + random.nextDouble() * 0.25D);
        int localX = x & 15;
        int localZ = z & 15;
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        boolean generateBedrock = true;

        System.out.println("@@@@@@@@@@@@@@@ APPLY @@@@@@@@@@@@@@@@");
    }
}
