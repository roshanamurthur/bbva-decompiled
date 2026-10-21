package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SheetDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a;\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004H\u0000\u001aC\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\"\u001d\u0010\u001a\u001a\u00020\u00158\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/material3/SheetState;", "sheetState", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "velocity", "", "onFling", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "", "skipPartiallyExpanded", "Landroidx/compose/material3/SheetValue;", "confirmValueChange", "initialValue", "skipHiddenState", "rememberSheetState", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/material3/SheetValue;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getBottomSheetMaxWidth", "()F", "BottomSheetMaxWidth", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSheetDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/SheetDefaultsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,429:1\n83#2,3:430\n1114#3,6:433\n154#4:439\n154#4:440\n*S KotlinDebug\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/SheetDefaultsKt\n*L\n423#1:430,3\n423#1:433,6\n428#1:439\n429#1:440\n*E\n"})
public final class SheetDefaultsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f11280a = Dp.m4389constructorimpl(22);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f11281b = Dp.m4389constructorimpl(640);

    /* JADX INFO: compiled from: SheetDefaults.kt */
    public static final class a extends Lambda implements Function1<SheetValue, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f11285p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(SheetValue sheetValue) {
            SheetValue it = sheetValue;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: SheetDefaults.kt */
    public static final class b extends Lambda implements Function0<SheetState> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f11286p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SheetValue f11287q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<SheetValue, Boolean> f11288r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f11289s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z10, SheetValue sheetValue, Function1<? super SheetValue, Boolean> function1, boolean z11) {
            super(0);
            this.f11286p0 = z10;
            this.f11287q0 = sheetValue;
            this.f11288r0 = function1;
            this.f11289s0 = z11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SheetState invoke() {
            return new SheetState(this.f11286p0, this.f11287q0, this.f11288r0, this.f11289s0);
        }
    }

    @NotNull
    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(@NotNull final SheetState sheetState, @NotNull final Orientation orientation, @NotNull final Function1<? super Float, Unit> onFling) {
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(onFling, "onFling");
        return new NestedScrollConnection() { // from class: androidx.compose.material3.SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection.1
            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            @Nullable
            /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
            public Object mo218onPostFlingRZ2iAVY(long j10, long j11, @NotNull Continuation<? super Velocity> continuation) {
                onFling.invoke(Boxing.boxFloat(orientation == Orientation.Horizontal ? Velocity.m4614getXimpl(j11) : Velocity.m4615getYimpl(j11)));
                return Velocity.m4605boximpl(j11);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
            public long mo219onPostScrollDzOQY0M(long consumed, long available, int source) {
                if (!NestedScrollSource.m3387equalsimpl0(source, NestedScrollSource.INSTANCE.m3392getDragWNlRxjI())) {
                    return Offset.INSTANCE.m2291getZeroF1C5BW0();
                }
                SwipeableV2State<SheetValue> swipeableState$material3_release = sheetState.getSwipeableState$material3_release();
                Orientation orientation2 = Orientation.Horizontal;
                Orientation orientation3 = orientation;
                float fDispatchRawDelta = swipeableState$material3_release.dispatchRawDelta(orientation3 == orientation2 ? Offset.m2275getXimpl(available) : Offset.m2276getYimpl(available));
                float f6 = orientation3 == orientation2 ? fDispatchRawDelta : 0.0f;
                if (orientation3 != Orientation.Vertical) {
                    fDispatchRawDelta = 0.0f;
                }
                return OffsetKt.Offset(f6, fDispatchRawDelta);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            @Nullable
            /* JADX INFO: renamed from: onPreFling-QWom1Mo */
            public Object mo220onPreFlingQWom1Mo(long j10, @NotNull Continuation<? super Velocity> continuation) {
                float fM4614getXimpl = orientation == Orientation.Horizontal ? Velocity.m4614getXimpl(j10) : Velocity.m4615getYimpl(j10);
                SheetState sheetState2 = sheetState;
                float fRequireOffset = sheetState2.requireOffset();
                if (fM4614getXimpl >= 0.0f || fRequireOffset <= sheetState2.getSwipeableState$material3_release().getMinOffset()) {
                    j10 = Velocity.INSTANCE.m4625getZero9UxMQ8M();
                } else {
                    onFling.invoke(Boxing.boxFloat(fM4614getXimpl));
                }
                return Velocity.m4605boximpl(j10);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
            public long mo221onPreScrollOzD1aCk(long available, int source) {
                Orientation orientation2 = Orientation.Horizontal;
                Orientation orientation3 = orientation;
                float fM2275getXimpl = orientation3 == orientation2 ? Offset.m2275getXimpl(available) : Offset.m2276getYimpl(available);
                if (fM2275getXimpl >= 0.0f || !NestedScrollSource.m3387equalsimpl0(source, NestedScrollSource.INSTANCE.m3392getDragWNlRxjI())) {
                    return Offset.INSTANCE.m2291getZeroF1C5BW0();
                }
                float fDispatchRawDelta = sheetState.getSwipeableState$material3_release().dispatchRawDelta(fM2275getXimpl);
                return OffsetKt.Offset(orientation3 == orientation2 ? fDispatchRawDelta : 0.0f, orientation3 == Orientation.Vertical ? fDispatchRawDelta : 0.0f);
            }
        };
    }

    public static final float getBottomSheetMaxWidth() {
        return f11281b;
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public static final SheetState rememberSheetState(boolean z10, @Nullable Function1<? super SheetValue, Boolean> function1, @Nullable SheetValue sheetValue, boolean z11, @Nullable Composer composer, int i10, int i11) {
        composer.startReplaceableGroup(1032784200);
        boolean z12 = (i11 & 1) != 0 ? false : z10;
        Function1<? super SheetValue, Boolean> function2 = (i11 & 2) != 0 ? a.f11285p0 : function1;
        SheetValue sheetValue2 = (i11 & 4) != 0 ? SheetValue.Hidden : sheetValue;
        boolean z13 = (i11 & 8) != 0 ? false : z11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1032784200, i10, -1, "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:410)");
        }
        Object[] objArr = {Boolean.valueOf(z12), function2};
        Saver<SheetState, SheetValue> Saver = SheetState.INSTANCE.Saver(z12, function2);
        Object[] objArr2 = {Boolean.valueOf(z12), sheetValue2, function2, Boolean.valueOf(z13)};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i12 = 0; i12 < 4; i12++) {
            zChanged |= composer.changed(objArr2[i12]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new b(z12, sheetValue2, function2, z13);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        SheetState sheetState = (SheetState) RememberSaveableKt.m2165rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sheetState;
    }
}
