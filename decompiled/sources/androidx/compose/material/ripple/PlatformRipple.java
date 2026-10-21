package androidx.compose.material.ripple;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.collection.j;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Ripple.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012JI\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/ripple/PlatformRipple;", "Landroidx/compose/material/ripple/Ripple;", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "rememberUpdatedRippleInstance-942rkJo", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ripple/RippleIndicationInstance;", "rememberUpdatedRippleInstance", "<init>", "(ZFLandroidx/compose/runtime/State;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "material-ripple_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRipple.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/PlatformRipple\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,253:1\n50#2:254\n49#2:255\n67#2,3:262\n66#2:265\n1097#3,6:256\n1097#3,6:266\n76#4:272\n*S KotlinDebug\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/PlatformRipple\n*L\n68#1:254\n68#1:255\n91#1:262,3\n91#1:265\n68#1:256,6\n91#1:266,6\n106#1:272\n*E\n"})
public final class PlatformRipple extends Ripple {
    public PlatformRipple() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformRipple(boolean z10, float f6, State color, DefaultConstructorMarker defaultConstructorMarker) {
        super(z10, f6, color, null);
        Intrinsics.checkNotNullParameter(color, "color");
    }

    @Override // androidx.compose.material.ripple.Ripple
    @Composable
    @NotNull
    /* JADX INFO: renamed from: rememberUpdatedRippleInstance-942rkJo */
    public RippleIndicationInstance mo893rememberUpdatedRippleInstance942rkJo(@NotNull InteractionSource interactionSource, boolean z10, float f6, @NotNull State<Color> color, @NotNull State<RippleAlpha> rippleAlpha, @Nullable Composer composer, int i10) {
        View rippleContainer;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(rippleAlpha, "rippleAlpha");
        composer.startReplaceableGroup(331259447);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(331259447, i10, -1, "androidx.compose.material.ripple.PlatformRipple.rememberUpdatedRippleInstance (Ripple.android.kt:57)");
        }
        int i11 = (i10 >> 15) & 14;
        composer.startReplaceableGroup(-1737891121);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1737891121, i11, -1, "androidx.compose.material.ripple.PlatformRipple.findNearestViewGroup (Ripple.android.kt:104)");
        }
        Object objConsume = composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        while (!(objConsume instanceof ViewGroup)) {
            ViewParent parent = ((View) objConsume).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(j.b("Couldn't find a valid parent for ", objConsume, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            Intrinsics.checkNotNullExpressionValue(parent, "parent");
            objConsume = parent;
        }
        ViewGroup viewGroup = (ViewGroup) objConsume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(1643267286);
        if (viewGroup.isInEditMode()) {
            composer.startReplaceableGroup(511388516);
            boolean zChanged = composer.changed(interactionSource) | composer.changed(this);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new CommonRippleIndicationInstance(z10, f6, color, rippleAlpha, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            CommonRippleIndicationInstance commonRippleIndicationInstance = (CommonRippleIndicationInstance) objRememberedValue;
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return commonRippleIndicationInstance;
        }
        composer.endReplaceableGroup();
        int childCount = viewGroup.getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount) {
                rippleContainer = null;
                break;
            }
            rippleContainer = viewGroup.getChildAt(i12);
            if (rippleContainer instanceof RippleContainer) {
                break;
            }
            i12++;
        }
        if (rippleContainer == null) {
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            rippleContainer = new RippleContainer(context);
            viewGroup.addView(rippleContainer);
        }
        composer.startReplaceableGroup(1618982084);
        boolean zChanged2 = composer.changed(interactionSource) | composer.changed(this) | composer.changed(rippleContainer);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new AndroidRippleIndicationInstance(z10, f6, color, rippleAlpha, (RippleContainer) rippleContainer, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        AndroidRippleIndicationInstance androidRippleIndicationInstance = (AndroidRippleIndicationInstance) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return androidRippleIndicationInstance;
    }
}
