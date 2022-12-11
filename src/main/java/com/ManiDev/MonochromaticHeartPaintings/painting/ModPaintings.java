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
    public static final RegistryObject<PaintingVariant> CAVE2 = PAINTING_VARIANTS.register("cave2", 
        () -> new PaintingVariant(128, 64));
    public static final RegistryObject<PaintingVariant> ENDERMAN = PAINTING_VARIANTS.register("enderman", 
        () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> FIGHTING1 = PAINTING_VARIANTS.register("fighting1", 
        () -> new PaintingVariant(128, 64));
    public static final RegistryObject<PaintingVariant> FIGHTING2 = PAINTING_VARIANTS.register("fighting2", 
        () -> new PaintingVariant(128, 64));
    public static final RegistryObject<PaintingVariant> FIGHTING3 = PAINTING_VARIANTS.register("fighting3", 
        () -> new PaintingVariant(128, 64));
    public static final RegistryObject<PaintingVariant> HOUSE1 = PAINTING_VARIANTS.register("house1", 
        () -> new PaintingVariant(128, 64));
    public static final RegistryObject<PaintingVariant> HOUSE2 = PAINTING_VARIANTS.register("house2", 
        () -> new PaintingVariant(128, 64));
    public static final RegistryObject<PaintingVariant> POND = PAINTING_VARIANTS.register("pond", 
        () -> new PaintingVariant(128, 64));
    public static final RegistryObject<PaintingVariant> PORTAL1 = PAINTING_VARIANTS.register("portal1", 
        () -> new PaintingVariant(128, 64));
    public static final RegistryObject<PaintingVariant> PORTAL2 = PAINTING_VARIANTS.register("portal2", 
        () -> new PaintingVariant(128, 64));
    public static final RegistryObject<PaintingVariant> PORTRAIT = PAINTING_VARIANTS.register("portrait", 
        () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> SLEEPING = PAINTING_VARIANTS.register("sleeping", 
        () -> new PaintingVariant(128, 64));
    public static final RegistryObject<PaintingVariant> SUNRISE1 = PAINTING_VARIANTS.register("sunrise1", 
        () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> SUNRISE2 = PAINTING_VARIANTS.register("sunrise2", 
        () -> new PaintingVariant(128, 64));
    public static final RegistryObject<PaintingVariant> SUNRISE3 = PAINTING_VARIANTS.register("sunrise3", 
        () -> new PaintingVariant(128, 64));

    public static void register(IEventBus eventbus) {
        PAINTING_VARIANTS.register(eventbus);
    }
}
