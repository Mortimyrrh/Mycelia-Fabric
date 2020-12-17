package com.mortimyrrh.mycelia.dimension.biome;

import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilder.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public class MycelialPlanesBiome {

    public static final RegistryKey<Biome> MYCELIAL_PLANES_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("mycelia", "mycelial_planes"));

    // registers Biomes and surfaces
    public static void registerBiome() {
        Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new Identifier("mycelia", "mycelial_planes"), MYCELIAL_PLANES_SURFACE_BUILDER);
        Registry.register(BuiltinRegistries.BIOME, MYCELIAL_PLANES_KEY.getValue(), MYCELIAL_PLANES);
    }


    // SurfaceBuilder defines how the surface of your biome looks.
    // We use custom surface builder for our biome to cover surface with stuff.
    public static final ConfiguredSurfaceBuilder<TernarySurfaceConfig> MYCELIAL_PLANES_SURFACE_BUILDER = SurfaceBuilder.DEFAULT
            .withConfig(new TernarySurfaceConfig(
                    Blocks.END_STONE_BRICKS.getDefaultState(),
                    Blocks.DIRT.getDefaultState(),
                    Blocks.GRAVEL.getDefaultState()));

    public static final Biome MYCELIAL_PLANES = createMycelialPlanes();

    public static Biome createMycelialPlanes() {
        // We specify what entities spawn and what features generate in the biome.
        // Aside from some structures, trees, rocks, plants and
        //   custom entities, these are mostly the same for each biome.
        // Vanilla configured features for biomes are defined in DefaultBiomeFeatures.

        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(spawnSettings);
        DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100);

        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();
        generationSettings.surfaceBuilder(MYCELIAL_PLANES_SURFACE_BUILDER);
        DefaultBiomeFeatures.addDefaultUndergroundStructures(generationSettings);
        DefaultBiomeFeatures.addLandCarvers(generationSettings);
        DefaultBiomeFeatures.addDefaultLakes(generationSettings);
        DefaultBiomeFeatures.addDungeons(generationSettings);
        DefaultBiomeFeatures.addMineables(generationSettings);
        DefaultBiomeFeatures.addDefaultOres(generationSettings);
        DefaultBiomeFeatures.addDefaultDisks(generationSettings);
        DefaultBiomeFeatures.addSprings(generationSettings);
        DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);

        return (new Biome.Builder())
                .precipitation(Biome.Precipitation.RAIN)
                .category(Biome.Category.NONE)
                .depth(0.125F)
                .scale(0.05F)
                .temperature(0.8F)
                .downfall(0.4F)
                .effects((new BiomeEffects.Builder())
                        .waterColor(0x3f76e4)
                        .waterFogColor(0x050533)
                        .fogColor(0xc0d8ff)
                        .skyColor(0x77adff)
                        .build())
                .spawnSettings(spawnSettings.build())
                .generationSettings(generationSettings.build())
                .build();
    }
}