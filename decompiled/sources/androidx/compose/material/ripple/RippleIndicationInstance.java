package androidx.compose.material.ripple;

import a1.b;
import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.ArrayList;
import java.util.List;
import k0.f;
import k0.g;
import k0.h;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0014\u001a\u00020\u0006*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/material/ripple/RippleIndicationInstance;", "Landroidx/compose/foundation/IndicationInstance;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "interaction", "Lkotlinx/coroutines/CoroutineScope;", "scope", "", "addRipple", "removeRipple", "Landroidx/compose/foundation/interaction/Interaction;", "updateStateLayer$material_ripple_release", "(Landroidx/compose/foundation/interaction/Interaction;Lkotlinx/coroutines/CoroutineScope;)V", "updateStateLayer", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/ui/graphics/Color;", "color", "drawStateLayer-H2RKhps", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJ)V", "drawStateLayer", "", "bounded", "Landroidx/compose/runtime/State;", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "<init>", "(ZLandroidx/compose/runtime/State;)V", "material-ripple_release"}, k = 1, mv = {1, 8, 0})
public abstract class RippleIndicationInstance implements IndicationInstance {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final h f8985p0;

    public RippleIndicationInstance(boolean z10, @NotNull State<RippleAlpha> rippleAlpha) {
        Intrinsics.checkNotNullParameter(rippleAlpha, "rippleAlpha");
        this.f8985p0 = new h(z10, rippleAlpha);
    }

    public abstract void addRipple(@NotNull PressInteraction.Press interaction, @NotNull CoroutineScope scope);

    /* JADX INFO: renamed from: drawStateLayer-H2RKhps, reason: not valid java name */
    public final void m899drawStateLayerH2RKhps(@NotNull DrawScope drawStateLayer, float f6, long j10) {
        Intrinsics.checkNotNullParameter(drawStateLayer, "$this$drawStateLayer");
        h hVar = this.f8985p0;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(drawStateLayer, "$this$drawStateLayer");
        boolean zIsNaN = Float.isNaN(f6);
        boolean z10 = hVar.f79167a;
        float fM895getRippleEndRadiuscSwnlzA = zIsNaN ? RippleAnimationKt.m895getRippleEndRadiuscSwnlzA(drawStateLayer, z10, drawStateLayer.mo2909getSizeNHjbRc()) : drawStateLayer.mo415toPx0680j_4(f6);
        float fFloatValue = hVar.f79169c.getValue().floatValue();
        if (fFloatValue > 0.0f) {
            long jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(j10, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (!z10) {
                b.x(drawStateLayer, jM2507copywmQWz5c$default, fM895getRippleEndRadiuscSwnlzA, 0L, 0.0f, null, null, 0, 124, null);
                return;
            }
            float fM2344getWidthimpl = Size.m2344getWidthimpl(drawStateLayer.mo2909getSizeNHjbRc());
            float fM2341getHeightimpl = Size.m2341getHeightimpl(drawStateLayer.mo2909getSizeNHjbRc());
            int iM2497getIntersectrtfAjoo = ClipOp.INSTANCE.m2497getIntersectrtfAjoo();
            DrawContext drawContext = drawStateLayer.getDrawContext();
            long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo2918clipRectN_I0leg(0.0f, 0.0f, fM2344getWidthimpl, fM2341getHeightimpl, iM2497getIntersectrtfAjoo);
            b.x(drawStateLayer, jM2507copywmQWz5c$default, fM895getRippleEndRadiuscSwnlzA, 0L, 0.0f, null, null, 0, 124, null);
            drawContext.getCanvas().restore();
            drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
        }
    }

    public abstract void removeRipple(@NotNull PressInteraction.Press interaction);

    public final void updateStateLayer$material_ripple_release(@NotNull Interaction interaction, @NotNull CoroutineScope scope) {
        float draggedAlpha;
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(scope, "scope");
        h hVar = this.f8985p0;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(scope, "scope");
        boolean z10 = interaction instanceof HoverInteraction.Enter;
        ArrayList arrayList = hVar.f79170d;
        if (z10) {
            arrayList.add(interaction);
        } else if (interaction instanceof HoverInteraction.Exit) {
            arrayList.remove(((HoverInteraction.Exit) interaction).getEnter());
        } else if (interaction instanceof FocusInteraction.Focus) {
            arrayList.add(interaction);
        } else if (interaction instanceof FocusInteraction.Unfocus) {
            arrayList.remove(((FocusInteraction.Unfocus) interaction).getFocus());
        } else if (interaction instanceof DragInteraction.Start) {
            arrayList.add(interaction);
        } else if (interaction instanceof DragInteraction.Stop) {
            arrayList.remove(((DragInteraction.Stop) interaction).getCom.adobe.marketing.mobile.EventDataKeys.Lifecycle.LIFECYCLE_START java.lang.String());
        } else if (!(interaction instanceof DragInteraction.Cancel)) {
            return;
        } else {
            arrayList.remove(((DragInteraction.Cancel) interaction).getCom.adobe.marketing.mobile.EventDataKeys.Lifecycle.LIFECYCLE_START java.lang.String());
        }
        Interaction interaction2 = (Interaction) CollectionsKt___CollectionsKt.lastOrNull((List) arrayList);
        if (Intrinsics.areEqual(hVar.f79171e, interaction2)) {
            return;
        }
        if (interaction2 != null) {
            State<RippleAlpha> state = hVar.f79168b;
            if (z10) {
                draggedAlpha = state.getValue().getHoveredAlpha();
            } else if (interaction instanceof FocusInteraction.Focus) {
                draggedAlpha = state.getValue().getFocusedAlpha();
            } else {
                draggedAlpha = interaction instanceof DragInteraction.Start ? state.getValue().getDraggedAlpha() : 0.0f;
            }
            BuildersKt__Builders_commonKt.launch$default(scope, null, null, new f(hVar, draggedAlpha, RippleKt.access$incomingStateLayerAnimationSpecFor(interaction2), null), 3, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(scope, null, null, new g(hVar, RippleKt.access$outgoingStateLayerAnimationSpecFor(hVar.f79171e), null), 3, null);
        }
        hVar.f79171e = interaction2;
    }
}
