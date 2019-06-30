package prisma.necromancy.Items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraftforge.fml.common.Mod;
import prisma.necromancy.Blocks.RitualCircleBlock;

@Mod.EventBusSubscriber
public class ChalkItem extends Item {
    public ChalkItem() {
        super(new Properties()
                .maxStackSize(1)
                .maxDamage(20)
                .setNoRepair());
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext use) {
        RitualCircleBlock circleblock = new RitualCircleBlock();
        return null;
    }

}
