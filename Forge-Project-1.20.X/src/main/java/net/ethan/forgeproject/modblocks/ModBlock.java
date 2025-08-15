package net.ethan.forgeproject.modblocks;

import net.ethan.forgeproject.ForgeProject;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlock {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ForgeProject.MOD_ID);
}
