package prisma.necromancy.Blocks;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

public class ModBlocks {

    @ObjectHolder("necromancy:ritualcenter")
    public static RitualCenterBlock RITUALCENTER;

    @ObjectHolder("necromancy:ritualcenter")
    public static TileEntityType<RitualCenterTile> RITUALTILE;

    @ObjectHolder("necromancy:phylactery")
    public static PhylacteryBlock PHYLACTERY;

    @ObjectHolder("necromancy:phylactery")
    public static TileEntityType<PhylacteryTile> PHYLACTERYTILE;

}
