package com.mortimyrrh.mycelia.dimension;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.data.report.BiomeListProvider;
import net.minecraft.world.*;
import net.minecraft.world.biome.source.BiomeSource;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.StructureAccessor;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.chunk.StructuresConfig;
import net.minecraft.world.gen.chunk.VerticalBlockSample;

import java.util.Collections;
import java.util.Optional;

public class MycelialNetworkGen extends ChunkGenerator {

    public static final Codec<MycelialNetworkGen> CODEC = RecordCodecBuilder.create((instance) ->
            instance.group(
                    BiomeSource.CODEC.fieldOf("biome_source")
                            .forGetter((generator) -> generator.biomeSource)
            ).apply(instance, instance.stable(MycelialNetworkGen::new))
    );

    public MycelialNetworkGen(BiomeSource biomeSource) {
        super(biomeSource, new StructuresConfig(Optional.empty(), Collections.emptyMap()));
    }

    @Override
    protected Codec<? extends ChunkGenerator> getCodec() {
        return CODEC;
    }

    @Override
    public ChunkGenerator withSeed(long seed) {
        return this;
    }

    @Override
    public void buildSurface(ChunkRegion region, Chunk chunk) {}

    @Override
    public void populateNoise(WorldAccess world, StructureAccessor accessor, Chunk chunk) {}

    @Override
    public int getHeight(int x, int z, Heightmap.Type heightmapType) {
        return 0;
    }

    @Override
    public BlockView getColumnSample(int x, int z) {
        return new VerticalBlockSample(new BlockState[0]);
    }

    @Override
    public int getSeaLevel() { return 4; }
}
