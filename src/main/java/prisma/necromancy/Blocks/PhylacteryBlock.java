package prisma.necromancy.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class PhylacteryBlock extends Block {
    public PhylacteryBlock() {
        super(Properties.create(Material.IRON)
                .sound(SoundType.METAL)
                .lightValue(1)
                .hardnessAndResistance(3.0F));
        this.setRegistryName("phylactery");
    }


    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new PhylacteryTile();
    }


}
