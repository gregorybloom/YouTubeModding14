package com.mcjty.mytutorial.dimension.biomes;

import com.google.gson.JsonObject;
import com.mcjty.mytutorial.MyTutorial;
import com.mcjty.mytutorial.dimension.TutorialBiomeProvider;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTDynamicOps;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryLookupCodec;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import com.mojang.serialization.JsonOps;

import java.util.Hashtable;
import java.util.Map;

public class FDZBiomes {

    private static Map<String,RegistryKey<Biome>> biomeList = new Hashtable<>();
    public static Map<String,ResourceLocation> biomeRegLocList = new Hashtable<>();

    private static RegistryKey<Biome> makeKey(String name) {
        if(!biomeRegLocList.containsKey(name))
        {
            biomeRegLocList.put(name, new ResourceLocation(MyTutorial.MODID, name));
        }
        return RegistryKey.create(Registry.BIOME_REGISTRY, biomeRegLocList.get(name));
    }
    public static RegistryKey<Biome> getBiome(String name) {
        if(!biomeList.containsKey(name))
        {
            biomeList.put(name, makeKey(name));
        }
        return biomeList.get(name);
    }

    public static final BiomeDictionary.Type TUTDIM1_BIOMES = BiomeDictionary.Type.getType("tutdim1_biomes");
    public static final BiomeDictionary.Type TUTDIM2_BIOMES = BiomeDictionary.Type.getType("tutdim2_biomes");

    public static void addBiomeTypes() {
        for (String key : biomeList.keySet()) {
            BiomeDictionary.addTypes(biomeList.get(key), TUTDIM2_BIOMES, BiomeDictionary.Type.OCEAN);
        }
    }

}