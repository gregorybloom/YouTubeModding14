package com.mcjty.mytutorial.dimension;

import com.mcjty.mytutorial.MyTutorial;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;

public class ModDimensions {

    //      /execute in yourmodid:dimension_id run tp @a ~ ~ ~

    public static final RegistryKey<DimensionType> TUTDIM_TYPE = RegistryKey.create(Registry.DIMENSION_TYPE_REGISTRY, new ResourceLocation(MyTutorial.MODID, "tutdim_type1"));

    public static final RegistryKey<World> TUTDIM1 = RegistryKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(MyTutorial.MODID, "tutdim1"));
    public static final RegistryKey<World> TUTDIM2 = RegistryKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(MyTutorial.MODID, "tutdim2"));
}
