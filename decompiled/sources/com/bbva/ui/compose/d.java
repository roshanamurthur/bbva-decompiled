package com.bbva.ui.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class d extends Lambda implements Function1<DrawScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Animatable<Float, AnimationVector1D> f37293p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ float f37294q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ long f37295r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ MutableFloatState f37296s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Animatable<Float, AnimationVector1D> animatable, float f6, long j10, MutableFloatState mutableFloatState) {
        super(1);
        this.f37293p0 = animatable;
        this.f37294q0 = f6;
        this.f37295r0 = j10;
        this.f37296s0 = mutableFloatState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DrawScope drawScope) {
        DrawScope Canvas = drawScope;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        Path Path = AndroidPath_androidKt.Path();
        Animatable<Float, AnimationVector1D> animatable = this.f37293p0;
        Path.moveTo(animatable.getValue().floatValue(), 0.0f);
        float fFloatValue = animatable.getValue().floatValue() - this.f37294q0;
        MutableFloatState mutableFloatState = this.f37296s0;
        Path.lineTo(fFloatValue, mutableFloatState.getFloatValue());
        Path.lineTo(0.0f, mutableFloatState.getFloatValue());
        Path.lineTo(0.0f, 0.0f);
        a1.b.F(Canvas, Path, new SolidColor(this.f37295r0, null), 0.0f, null, null, 0, 60, null);
        return Unit.INSTANCE;
    }
}
