package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import mk.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Ripple.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B>\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u0006\u0010\u000f\u001a\u00020\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/material/ripple/AndroidRippleIndicationInstance;", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "drawIndication", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "interaction", "Lkotlinx/coroutines/CoroutineScope;", "scope", "addRipple", "removeRipple", "onRemembered", "onForgotten", "onAbandoned", "resetHostView", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "Landroidx/compose/material/ripple/RippleContainer;", "rippleContainer", "<init>", "(ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/material/ripple/RippleContainer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "material-ripple_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRipple.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleIndicationInstance\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,253:1\n81#2:254\n107#2,2:255\n81#2:257\n107#2,2:258\n137#3:260\n245#4:261\n*S KotlinDebug\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleIndicationInstance\n*L\n139#1:254\n139#1:255,2\n147#1:257\n147#1:258,2\n172#1:260\n186#1:261\n*E\n"})
public final class AndroidRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver {

    @NotNull
    public final k0.a E0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f8927q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final float f8928r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final State<Color> f8929s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final State<RippleAlpha> f8930t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final RippleContainer f8931u0;

    @NotNull
    public final MutableState v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final MutableState f8932w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public long f8933x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f8934y0;

    public AndroidRippleIndicationInstance() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidRippleIndicationInstance(boolean z10, float f6, State color, State rippleAlpha, RippleContainer rippleContainer, DefaultConstructorMarker defaultConstructorMarker) {
        super(z10, rippleAlpha);
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(rippleAlpha, "rippleAlpha");
        Intrinsics.checkNotNullParameter(rippleContainer, "rippleContainer");
        this.f8927q0 = z10;
        this.f8928r0 = f6;
        this.f8929s0 = color;
        this.f8930t0 = rippleAlpha;
        this.f8931u0 = rippleContainer;
        this.v0 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f8932w0 = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.f8933x0 = Size.INSTANCE.m2353getZeroNHjbRc();
        this.f8934y0 = -1;
        this.E0 = new k0.a(this);
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void addRipple(@NotNull PressInteraction.Press interaction, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(scope, "scope");
        RippleHostView rippleHostView = this.f8931u0.getRippleHostView(this);
        rippleHostView.m897addRippleKOepWvA(interaction, this.f8927q0, this.f8933x0, this.f8934y0, this.f8929s0.getValue().m2518unboximpl(), this.f8930t0.getValue().getPressedAlpha(), this.E0);
        this.v0.setValue(rippleHostView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.IndicationInstance
    public void drawIndication(@NotNull ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        this.f8933x0 = contentDrawScope.mo2909getSizeNHjbRc();
        float f6 = this.f8928r0;
        this.f8934y0 = Float.isNaN(f6) ? c.roundToInt(RippleAnimationKt.m895getRippleEndRadiuscSwnlzA(contentDrawScope, this.f8927q0, contentDrawScope.mo2909getSizeNHjbRc())) : contentDrawScope.mo413roundToPx0680j_4(f6);
        long jM2518unboximpl = this.f8929s0.getValue().m2518unboximpl();
        float pressedAlpha = this.f8930t0.getValue().getPressedAlpha();
        contentDrawScope.drawContent();
        m899drawStateLayerH2RKhps(contentDrawScope, f6, jM2518unboximpl);
        Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
        ((Boolean) this.f8932w0.getValue()).booleanValue();
        RippleHostView rippleHostView = (RippleHostView) this.v0.getValue();
        if (rippleHostView != null) {
            rippleHostView.m898updateRipplePropertiesbiQXAtU(contentDrawScope.mo2909getSizeNHjbRc(), this.f8934y0, jM2518unboximpl, pressedAlpha);
            rippleHostView.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        this.f8931u0.disposeRippleIfNeeded(this);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.f8931u0.disposeRippleIfNeeded(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void removeRipple(@NotNull PressInteraction.Press interaction) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        RippleHostView rippleHostView = (RippleHostView) this.v0.getValue();
        if (rippleHostView != null) {
            rippleHostView.removeRipple();
        }
    }

    public final void resetHostView() {
        this.v0.setValue(null);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
