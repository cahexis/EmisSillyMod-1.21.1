package net.emi.emissillymod.item.custom;

import net.emi.emissillymod.block.ModBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.Map;

public class WitheredPowderItem extends Item {
    private static final Map<Block, Block> WITHERED_POWDER_MAP =
            Map.of(
                    Blocks.TORCHFLOWER, ModBlocks.DEATHS_TOUCH.get(),
                    Blocks.POPPY, ModBlocks.DEATHS_TOUCH.get()
            );

    public WitheredPowderItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if(WITHERED_POWDER_MAP.containsKey(clickedBlock)) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), WITHERED_POWDER_MAP.get(clickedBlock).defaultBlockState());

                context.getItemInHand().consume(1, context.getPlayer());

                level.playSound(null, context.getClickedPos(), SoundEvents.SOUL_SAND_PLACE, SoundSource.BLOCKS);
            }
        }

        return InteractionResult.SUCCESS;
    }
}
