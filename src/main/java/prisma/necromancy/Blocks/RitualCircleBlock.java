package prisma.necromancy.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RitualCircleBlock extends Block {
    public RitualCircleBlock() {
        super(Properties.create(Material.REDSTONE_LIGHT)
                .hardnessAndResistance(0.1F)
                .doesNotBlockMovement()
                .sound(SoundType.STONE));
        this.setRegistryName("ritualcircle");
    }
}
