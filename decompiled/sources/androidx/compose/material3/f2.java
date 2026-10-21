package androidx.compose.material3;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheet$2$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,571:1\n36#2:572\n36#2:579\n36#2:586\n36#2:593\n1114#3,6:573\n1114#3,6:580\n1114#3,6:587\n1114#3,6:594\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheet$2$1\n*L\n191#1:572\n192#1:579\n201#1:586\n213#1:593\n191#1:573,6\n192#1:580,6\n201#1:587,6\n213#1:594,6\n*E\n"})
public final class f2 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    public final /* synthetic */ float E0;
    public final /* synthetic */ Function2<Composer, Integer, Unit> F0;
    public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> G0;
    public final /* synthetic */ int H0;
    public final /* synthetic */ CoroutineScope I0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ long f12819p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f12820q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ SheetState f12821r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f12822s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Modifier f12823t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ AnchorChangeHandler<SheetValue> f12824u0;
    public final /* synthetic */ Function1<Float, Unit> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ Shape f12825w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ long f12826x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ long f12827y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f2(long j10, Function0<Unit> function0, SheetState sheetState, int i10, Modifier modifier, AnchorChangeHandler<SheetValue> anchorChangeHandler, Function1<? super Float, Unit> function1, Shape shape, long j11, long j12, float f6, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i11, CoroutineScope coroutineScope) {
        super(3);
        this.f12819p0 = j10;
        this.f12820q0 = function0;
        this.f12821r0 = sheetState;
        this.f12822s0 = i10;
        this.f12823t0 = modifier;
        this.f12824u0 = anchorChangeHandler;
        this.v0 = function1;
        this.f12825w0 = shape;
        this.f12826x0 = j11;
        this.f12827y0 = j12;
        this.E0 = f6;
        this.F0 = function2;
        this.G0 = function3;
        this.H0 = i11;
        this.I0 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        int i10;
        BoxWithConstraintsScope BoxWithConstraints = boxWithConstraintsScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((iIntValue & 14) == 0) {
            i10 = (composer2.changed(BoxWithConstraints) ? 4 : 2) | iIntValue;
        } else {
            i10 = iIntValue;
        }
        if ((i10 & 91) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(574030426, iIntValue, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:177)");
            }
            int iM4356getMaxHeightimpl = Constraints.m4356getMaxHeightimpl(BoxWithConstraints.mo260getConstraintsmsEJaDk());
            long j10 = this.f12819p0;
            Function0<Unit> function0 = this.f12820q0;
            SheetState sheetState = this.f12821r0;
            boolean z10 = sheetState.getTargetValue() != SheetValue.Hidden;
            int i11 = this.f12822s0;
            ModalBottomSheet_androidKt.m1171access$Scrim3JVO9M(j10, function0, z10, composer2, (i11 >> 21) & 14);
            String strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1260getBottomSheetPaneTitleadMyvUU(), composer2, 6);
            Modifier modifierAlign = BoxWithConstraints.align(SizeKt.fillMaxWidth$default(SizeKt.m342widthInVpY3zN4$default(this.f12823t0, 0.0f, SheetDefaultsKt.getBottomSheetMaxWidth(), 1, null), 0.0f, 1, null), Alignment.INSTANCE.getTopCenter());
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged = composer2.changed(strM1320getStringNWtq28);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new v1(strM1320getStringNWtq28);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierAlign, false, (Function1) objRememberedValue, 1, null);
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged2 = composer2.changed(sheetState);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new w1(sheetState);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            Modifier modifierOffset = OffsetKt.offset(modifierSemantics$default, (Function1) objRememberedValue2);
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged3 = composer2.changed(sheetState);
            Object objRememberedValue3 = composer2.rememberedValue();
            Function1<Float, Unit> function1 = this.v0;
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState, Orientation.Vertical, function1);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceableGroup();
            Modifier modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifierOffset, (NestedScrollConnection) objRememberedValue3, null, 2, null);
            float f6 = iM4356getMaxHeightimpl;
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged4 = composer2.changed(function1);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new x1(function1);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceableGroup();
            int i12 = i11 >> 6;
            SurfaceKt.m1329SurfaceT9BRK9s(SwipeableV2Kt.swipeAnchors(DraggableKt.draggable(modifierNestedScroll$default, sheetState.getSwipeableState$material3_release().getSwipeDraggableState$material3_release(), Orientation.Vertical, (32 & 4) != 0 ? true : sheetState.isVisible(), (32 & 8) != 0 ? null : null, (32 & 16) != 0 ? false : sheetState.getSwipeableState$material3_release().isAnimationRunning(), (32 & 32) != 0 ? new DraggableKt.a(3, null) : null, (32 & 64) != 0 ? new DraggableKt.b(3, null) : new l0.l2((Function2) objRememberedValue4), (32 & 128) != 0 ? false : false), sheetState.getSwipeableState$material3_release(), bk.w.setOf((Object[]) new SheetValue[]{SheetValue.Hidden, SheetValue.PartiallyExpanded, SheetValue.Expanded}), this.f12824u0, new Function2<SheetValue, IntSize, Float>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$modalBottomSheetSwipeable$2

                /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[SheetValue.values().length];
                        try {
                            iArr[SheetValue.Hidden.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[SheetValue.Expanded.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Float invoke(SheetValue sheetValue, IntSize intSize) {
                    SheetValue value = sheetValue;
                    long f18319a = intSize.getF18319a();
                    Intrinsics.checkNotNullParameter(value, "value");
                    int i13 = WhenMappings.$EnumSwitchMapping$0[value.ordinal()];
                    float f10 = f6;
                    if (i13 == 1) {
                        return Float.valueOf(f10);
                    }
                    if (i13 == 2) {
                        if (IntSize.m4548getHeightimpl(f18319a) >= f10 / 2 && !sheetState.getSkipPartiallyExpanded()) {
                            return Float.valueOf(f10 / 2.0f);
                        }
                        return null;
                    }
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (IntSize.m4548getHeightimpl(f18319a) != 0) {
                        return Float.valueOf(Math.max(0.0f, f10 - IntSize.m4548getHeightimpl(f18319a)));
                    }
                    return null;
                }
            }), this.f12825w0, this.f12826x0, this.f12827y0, this.E0, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, 1371274015, true, new e2(this.F0, this.G0, this.H0, this.f12821r0, this.f12820q0, this.I0, this.f12822s0)), composer2, (i12 & 112) | 12582912 | (i12 & 896) | (i12 & 7168) | (i12 & 57344), 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
