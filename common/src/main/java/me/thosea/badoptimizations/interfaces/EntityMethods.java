package me.thosea.badoptimizations.interfaces;

import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.entity.Entity;

public interface EntityMethods {
	void bo$refreshEntityData(int data);

	<T extends Entity, S extends EntityRenderState> EntityRenderer<T, S> bo$getRenderer();
}
