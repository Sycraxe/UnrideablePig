package dev.sycraxe.unrideablepig.mixins;

import net.minecraft.world.entity.animal.Pig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Pig.class)
public abstract class PigMixin {

    @Inject(method = "isSaddleable", at = @At("HEAD"), cancellable = true)
    private static void injectIsSaddleable(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }

}