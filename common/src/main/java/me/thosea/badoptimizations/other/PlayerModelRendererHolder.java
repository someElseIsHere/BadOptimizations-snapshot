package me.thosea.badoptimizations.other;

import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.entity.player.PlayerEntity;

public final class PlayerModelRendererHolder {
	private PlayerModelRendererHolder() {}

	public static EntityRenderer<? extends PlayerEntity, ? extends PlayerEntityRenderState> WIDE_RENDERER;
	public static EntityRenderer<? extends PlayerEntity, ? extends PlayerEntityRenderState> SLIM_RENDERER;
}
