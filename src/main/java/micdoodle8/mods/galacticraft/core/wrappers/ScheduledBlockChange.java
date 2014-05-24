package micdoodle8.mods.galacticraft.core.wrappers;

import micdoodle8.mods.galacticraft.api.vector.BlockVec3;
<<<<<<< HEAD:src/main/java/micdoodle8/mods/galacticraft/core/wrappers/ScheduledBlockChange.java
import net.minecraft.block.Block;
=======
>>>>>>> 58f48f8b7e9a89c745a63e4440ff91be6c07e9bf:common/micdoodle8/mods/galacticraft/core/wrappers/ScheduledBlockChange.java

public class ScheduledBlockChange
{
	private BlockVec3 changePosition;
	private Block change;
	private int changeMeta;
	private int changeFlag;

	public ScheduledBlockChange(BlockVec3 changePosition, Block change, int changeMeta)
	{
		this(changePosition, change, changeMeta, 3);
	}

	public ScheduledBlockChange(BlockVec3 changePosition, Block changeID, int changeMeta, int changeFlag)
	{
		this.changePosition = changePosition;
		this.change = changeID;
		this.changeMeta = changeMeta;
		this.changeFlag = changeFlag;
	}

	public BlockVec3 getChangePosition()
	{
		return this.changePosition;
	}

	public void setChangePosition(BlockVec3 changePosition)
	{
		this.changePosition = changePosition;
	}

	public Block getChangeID()
	{
		return this.change;
	}

	public void setChangeID(Block change)
	{
		this.change = change;
	}

	public int getChangeMeta()
	{
		return this.changeMeta;
	}

	public void setChangeMeta(int changeMeta)
	{
		this.changeMeta = changeMeta;
	}

	public int getChangeFlag()
	{
		return this.changeFlag;
	}

	public void setChangeFlag(int changeFlag)
	{
		this.changeFlag = changeFlag;
	}
}
