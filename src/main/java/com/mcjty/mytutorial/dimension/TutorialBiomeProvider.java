package com.mcjty.mytutorial.dimension;

import com.mcjty.mytutorial.dimension.biomes.FDZBiomes;
import com.mojang.serialization.Codec;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryLookupCodec;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.gen.feature.structure.Structure;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TutorialBiomeProvider extends BiomeProvider {

    public static final Codec<TutorialBiomeProvider> CODEC = RegistryLookupCodec.create(Registry.BIOME_REGISTRY)
            .xmap(TutorialBiomeProvider::new, TutorialBiomeProvider::getBiomeRegistry).codec();

    private final Biome biome;
    private final Registry<Biome> biomeRegistry;
    private static List<RegistryKey<Biome>> SPAWN = null;

    public TutorialBiomeProvider(Registry<Biome> biomeRegistry) {
        super(getStartBiomes(biomeRegistry));
        this.biomeRegistry = biomeRegistry;
        biome = biomeRegistry.get(FDZBiomes.getBiome("evillakeb").location());
    }

    private static List<Biome> getStartBiomes(Registry<Biome> registry) {
        if(SPAWN == null) {
            SPAWN = new java.util.ArrayList<RegistryKey<Biome>>();
            SPAWN.add(Biomes.PLAINS);
            SPAWN.add(FDZBiomes.getBiome("evillake"));
            SPAWN.add(FDZBiomes.getBiome("evillakeb"));
        }

        return SPAWN.stream().map(s -> registry.get(s.location())).collect(Collectors.toList());
    }

    public Registry<Biome> getBiomeRegistry() {
        return biomeRegistry;
    }

    @Override
    public boolean canGenerateStructure(Structure<?> structure) {
        return false;
    }

    @Override
    protected Codec<? extends BiomeProvider> codec() {
        return CODEC;
    }

    @Override
    public BiomeProvider withSeed(long seed) {
        return this;
    }

    @Override
    public Biome getNoiseBiome(int x, int y, int z) {
        return biomeRegistry.get(SPAWN.get(MathHelper.abs(MathHelper.floor(x/10))%SPAWN.size()).location());
//        return biome;
    }
}
