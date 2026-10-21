package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ=\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Landroidx/compose/material/FloatingActionButtonDefaults;", "", "()V", "elevation", "Landroidx/compose/material/FloatingActionButtonElevation;", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "elevation-ixp7dh8", "(FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/FloatingActionButtonElevation;", "hoveredElevation", "focusedElevation", "elevation-xZ9-QkE", "(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/FloatingActionButtonElevation;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,336:1\n154#2:337\n154#2:338\n154#2:339\n154#2:340\n154#2:341\n154#2:342\n154#2:343\n154#2:344\n83#3,3:345\n1097#4,6:348\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonDefaults\n*L\n221#1:337\n222#1:338\n226#1:339\n227#1:340\n246#1:341\n247#1:342\n248#1:343\n249#1:344\n251#1:345,3\n251#1:348,6\n*E\n"})
public final class FloatingActionButtonDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final FloatingActionButtonDefaults INSTANCE = new FloatingActionButtonDefaults();

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another overload of elevation")
    @Composable
    /* JADX INFO: renamed from: elevation-ixp7dh8, reason: not valid java name */
    public final /* synthetic */ FloatingActionButtonElevation m775elevationixp7dh8(float f6, float f10, Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(-654132828);
        float fM4389constructorimpl = (i11 & 1) != 0 ? Dp.m4389constructorimpl(6) : f6;
        float fM4389constructorimpl2 = (i11 & 2) != 0 ? Dp.m4389constructorimpl(12) : f10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-654132828, i10, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:219)");
        }
        float f11 = 8;
        FloatingActionButtonElevation floatingActionButtonElevationM776elevationxZ9QkE = m776elevationxZ9QkE(fM4389constructorimpl, fM4389constructorimpl2, Dp.m4389constructorimpl(f11), Dp.m4389constructorimpl(f11), composer, (i10 & 14) | 3456 | (i10 & 112) | ((i10 << 6) & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return floatingActionButtonElevationM776elevationxZ9QkE;
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: elevation-xZ9-QkE, reason: not valid java name */
    public final FloatingActionButtonElevation m776elevationxZ9QkE(float f6, float f10, float f11, float f12, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(380403812);
        if ((i11 & 1) != 0) {
            f6 = Dp.m4389constructorimpl(6);
        }
        if ((i11 & 2) != 0) {
            f10 = Dp.m4389constructorimpl(12);
        }
        if ((i11 & 4) != 0) {
            f11 = Dp.m4389constructorimpl(8);
        }
        if ((i11 & 8) != 0) {
            f12 = Dp.m4389constructorimpl(8);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(380403812, i10, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:244)");
        }
        Object[] objArr = {Dp.m4387boximpl(f6), Dp.m4387boximpl(f10), Dp.m4387boximpl(f11), Dp.m4387boximpl(f12)};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i12 = 0; i12 < 4; i12++) {
            zChanged |= composer.changed(objArr[i12]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new h0.i0(f6, f10, f11, f12);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        h0.i0 i0Var = (h0.i0) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return i0Var;
    }
}
