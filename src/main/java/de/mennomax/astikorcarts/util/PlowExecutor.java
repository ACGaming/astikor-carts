package de.mennomax.astikorcarts.util;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;

public interface PlowExecutor {

    public void tillBlock(PlayerEntity player, BlockPos pos);

}
