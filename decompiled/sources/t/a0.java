package t;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EdgeEffectCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nEdgeEffectCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EdgeEffectCompat.kt\nandroidx/compose/foundation/GlowEdgeEffectCompat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,156:1\n1#2:157\n154#3:158\n*S KotlinDebug\n*F\n+ 1 EdgeEffectCompat.kt\nandroidx/compose/foundation/GlowEdgeEffectCompat\n*L\n88#1:158\n*E\n"})
public final class a0 extends EdgeEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f93347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f93348b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f93347a = AndroidDensity_androidKt.Density(context).mo415toPx0680j_4(Dp.m4389constructorimpl(1));
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i10) {
        this.f93348b = 0.0f;
        super.onAbsorb(i10);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f6, float f10) {
        this.f93348b = 0.0f;
        super.onPull(f6, f10);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f93348b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f6) {
        this.f93348b = 0.0f;
        super.onPull(f6);
    }
}
