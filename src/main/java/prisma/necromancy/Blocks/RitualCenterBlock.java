package prisma.necromancy.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class RitualCenterBlock extends Block {

    public RitualCenterBlock() {
        super(Properties.create(Material.REDSTONE_LIGHT)
                .hardnessAndResistance(0.1F)
                .doesNotBlockMovement()
                .sound(SoundType.STONE));
        this.setRegistryName("ritualcenter");
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new RitualCenterTile();
    }

}
