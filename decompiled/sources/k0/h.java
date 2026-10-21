package k0;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.runtime.State;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/StateLayer\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,355:1\n137#2:356\n214#3,8:357\n261#3,11:365\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/StateLayer\n*L\n304#1:356\n316#1:357,8\n316#1:365,11\n*E\n"})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f79167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final State<RippleAlpha> f79168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Animatable<Float, AnimationVector1D> f79169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ArrayList f79170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Interaction f79171e;

    public h(boolean z10, @NotNull State<RippleAlpha> rippleAlpha) {
        Intrinsics.checkNotNullParameter(rippleAlpha, "rippleAlpha");
        this.f79167a = z10;
        this.f79168b = rippleAlpha;
        this.f79169c = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.f79170d = new ArrayList();
    }
}
