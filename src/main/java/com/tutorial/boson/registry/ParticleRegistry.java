package com.tutorial.boson.registry;

import com.tutorial.boson.Utils;
import com.tutorial.boson.particle.ObsidianParticleData;
import com.tutorial.boson.particle.ObsidianParticleType;
import net.minecraft.particles.ParticleType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ParticleRegistry {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, Utils.MOD_ID);
    public static final RegistryObject<ParticleType<ObsidianParticleData>> obsidianParticle = PARTICLE_TYPES.register("obsidian_particle", ObsidianParticleType::new);
}
