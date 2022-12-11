package com.ManiDev.MonochromaticHeartPaintings.painting;

import com.ManiDev.MonochromaticHeartPaintings.MonochromaticHeartPaintings;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS = 
        DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, MonochromaticHeartPaintings.MODID);

    public static final RegistryObject<PaintingVariant> CAVE1 = PAINTING_VARIANTS.register("cave1", 
        () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> ENDERMAN = PAINTING_VARIANTS.register("enderman", 
        () -> new PaintingVariant(64, 64));

    public static void register(IEventBus eventbus) {
        PAINTING_VARIANTS.register(eventbus);
    }
}
