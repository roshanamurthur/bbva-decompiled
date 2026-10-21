package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,748:1\n36#2:749\n50#2:756\n49#2:757\n1097#3,6:750\n1097#3,6:758\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1\n*L\n457#1:749\n470#1:756\n470#1:757\n457#1:750,6\n470#1:758,6\n*E\n"})
public final class w extends Lambda implements Function3<Integer, Composer, Integer, Unit> {
    public final /* synthetic */ int E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f9067p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ BottomSheetScaffoldState f9068q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ float f9069r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ float f9070s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Shape f9071t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ float f9072u0;
    public final /* synthetic */ long v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ long f9073w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f9074x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ int f9075y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(boolean z10, BottomSheetScaffoldState bottomSheetScaffoldState, float f6, float f10, Shape shape, float f11, long j10, long j11, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
        super(3);
        this.f9067p0 = z10;
        this.f9068q0 = bottomSheetScaffoldState;
        this.f9069r0 = f6;
        this.f9070s0 = f10;
        this.f9071t0 = shape;
        this.f9072u0 = f11;
        this.v0 = j10;
        this.f9073w0 = j11;
        this.f9074x0 = function3;
        this.f9075y0 = i10;
        this.E0 = i11;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(Integer num, Composer composer, Integer num2) {
        Modifier modifierNestedScroll$default;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 14) == 0) {
            iIntValue2 |= composer2.changed(iIntValue) ? 4 : 2;
        }
        if ((iIntValue2 & 91) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1378534681, iIntValue2, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:452)");
            }
            composer2.startReplaceableGroup(-816851374);
            boolean z10 = this.f9067p0;
            BottomSheetScaffoldState bottomSheetScaffoldState = this.f9068q0;
            if (z10) {
                Modifier.Companion companion = Modifier.INSTANCE;
                AnchoredDraggableState<BottomSheetValue> anchoredDraggableState$material_release = bottomSheetScaffoldState.getBottomSheetState().getAnchoredDraggableState$material_release();
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged = composer2.changed(anchoredDraggableState$material_release);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = BottomSheetScaffoldKt.access$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(bottomSheetScaffoldState.getBottomSheetState().getAnchoredDraggableState$material_release(), Orientation.Vertical);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(companion, (NestedScrollConnection) objRememberedValue, null, 2, null);
            } else {
                modifierNestedScroll$default = Modifier.INSTANCE;
            }
            composer2.endReplaceableGroup();
            BottomSheetState bottomSheetState = bottomSheetScaffoldState.getBottomSheetState();
            Modifier modifierM326requiredHeightInVpY3zN4$default = SizeKt.m326requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(modifierNestedScroll$default, 0.0f, 1, null), this.f9069r0, 0.0f, 2, null);
            boolean z11 = this.f9067p0;
            Integer numValueOf = Integer.valueOf(iIntValue);
            float f6 = this.f9070s0;
            Float fValueOf = Float.valueOf(f6);
            composer2.startReplaceableGroup(511388516);
            boolean zChanged2 = composer2.changed(numValueOf) | composer2.changed(fValueOf);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new v(iIntValue, f6);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            Function1 function1 = (Function1) objRememberedValue2;
            Shape shape = this.f9071t0;
            float f10 = this.f9072u0;
            long j10 = this.v0;
            long j11 = this.f9073w0;
            Function3<ColumnScope, Composer, Integer, Unit> function3 = this.f9074x0;
            int i10 = this.f9075y0;
            int i11 = i10 >> 15;
            int i12 = this.E0 << 15;
            BottomSheetScaffoldKt.m678access$BottomSheet0cLKjW4(bottomSheetState, z11, function1, shape, f10, j10, j11, modifierM326requiredHeightInVpY3zN4$default, function3, composer2, (i11 & 7168) | ((i10 >> 18) & 112) | (57344 & i11) | (458752 & i12) | (i12 & 3670016) | ((i10 << 24) & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
