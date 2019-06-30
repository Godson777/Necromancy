package prisma.necromancy.Blocks;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;

import java.util.List;

public class RitualCenterTile extends TileEntity implements ITickableTileEntity {
    public RitualCenterTile() {
        super(ModBlocks.RITUALTILE);
    }

    @Override
    public void tick() {
        if (this.world.isRemote) {
            ritualBasic();
        }
    }

    public void ritualBasic() { //int xPos, int yPos, int zPos <--- goes into brackets later :D

        // sets up a bounding box in the space of the center ritual chalk
        double posX = this.getPos().getX();
        double posY = this.getPos().getY();
        double posZ = this.getPos().getZ();
        AxisAlignedBB scanAbove = new AxisAlignedBB(posX + 1.0D , posY + 1.0D, posZ + 1.0D, posX, posY, posZ);

        //checks bounding box for Entities and creates a list of then
        List<Entity> entities = this.world.getEntitiesWithinAABB(Entity.class, scanAbove); //<---- WORKS :D MAKES DA LIST

        if (!entities.isEmpty())
            for (Entity entity : entities) {
                if (entity instanceof PlayerEntity) {
                    System.out.println("FOUND THE Thing"); /// <----- This code can search for stuff in list
                        System.out.println(((PlayerEntity) entity).getGameProfile().getId());
                }
            }
        /**
         * TODO: Iterate through the list, find Entities, and do stuff with them.
         *
         */

    }

}
