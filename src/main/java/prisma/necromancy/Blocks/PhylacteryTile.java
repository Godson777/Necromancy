package prisma.necromancy.Blocks;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;

import java.util.UUID;

public class PhylacteryTile extends TileEntity implements ITickableTileEntity {
    public PhylacteryTile() {
        super(ModBlocks.PHYLACTERYTILE);
    }

    UUID playerid = new UUID(0L,0L);

    public void setPlayer(PlayerEntity player) {
        playerid = player.getGameProfile().getId();
        markDirty();
    }

    @Override
    public void tick() {

    }

    public PlayerEntity getPlayer(PlayerEntity player) {
        if (this.world.isRemote()) {
            player = this.world.getPlayerByUuid(playerid);
        }
        return player;
    }

    @Override
    public void read(CompoundNBT tag) {
        playerid = tag.getUniqueId("savedPlayerId");
        super.read(tag);
    }

    @Override
    public CompoundNBT write(CompoundNBT tag) {
        tag.putUniqueId("savedPlayerId", playerid);
        return super.write(tag);
    }


}
