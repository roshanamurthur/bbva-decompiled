package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPositionInLayoutKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.bbva.androidtoolkit.utils.PluginUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PagerMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aä\u0001\u0010'\u001a\u00020$*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b2/\u0010#\u001a+\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001e¢\u0006\u0002\b!\u0012\u0004\u0012\u00020\"0\u001dH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "", "pageCount", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "pagerItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenPages", "firstVisiblePage", "firstVisiblePageOffset", "", "scrollToBeConsumed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "", "reverseLayout", "Landroidx/compose/ui/unit/IntOffset;", "visualPageOffset", "pageAvailableSize", "beyondBoundsPageCount", "", "pinnedPages", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", PluginUtils.IDENTIFIER_LAYOUT, "Landroidx/compose/foundation/pager/PagerMeasureResult;", "measurePager-ntgEbfI", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;ILandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;IIIIIIFJLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ZJIILjava/util/List;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/pager/PagerMeasureResult;", "measurePager", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPagerMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,581:1\n578#1,4:582\n33#2,6:586\n33#2,6:592\n33#2,6:598\n33#2,4:607\n38#2:613\n171#2,13:615\n33#2,6:628\n33#2,6:634\n33#2,6:641\n33#2,6:647\n33#2,6:653\n36#3,3:604\n39#3,2:611\n41#3:614\n1#4:640\n*S KotlinDebug\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n*L\n65#1:582,4\n174#1:586,6\n302#1:592,6\n328#1:598,6\n368#1:607,4\n368#1:613\n373#1:615,13\n427#1:628,6\n452#1:634,6\n554#1:641,6\n561#1:647,6\n567#1:653,6\n368#1:604,3\n368#1:611,2\n368#1:614\n*E\n"})
public final class PagerMeasureKt {

    /* JADX INFO: compiled from: PagerMeasure.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f5437p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope invoke = placementScope;
            Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: PagerMeasure.kt */
    @SourceDebugExtension({"SMAP\nPagerMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt$measurePager$6\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,581:1\n33#2,6:582\n*S KotlinDebug\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt$measurePager$6\n*L\n393#1:582,6\n*E\n"})
    public static final class b extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ List<MeasuredPage> f5438p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ArrayList arrayList) {
            super(1);
            this.f5438p0 = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope invoke = placementScope;
            Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
            List<MeasuredPage> list = this.f5438p0;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).place(invoke);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: PagerMeasure.kt */
    public static final class c extends Lambda implements Function1<Integer, MeasuredPage> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LazyLayoutMeasureScope f5439p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f5440q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PagerLazyLayoutItemProvider f5441r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f5442s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Orientation f5443t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Alignment.Horizontal f5444u0;
        public final /* synthetic */ Alignment.Vertical v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ boolean f5445w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f5446x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j10, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j11, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, boolean z10, int i10) {
            super(1);
            this.f5439p0 = lazyLayoutMeasureScope;
            this.f5440q0 = j10;
            this.f5441r0 = pagerLazyLayoutItemProvider;
            this.f5442s0 = j11;
            this.f5443t0 = orientation;
            this.f5444u0 = horizontal;
            this.v0 = vertical;
            this.f5445w0 = z10;
            this.f5446x0 = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final MeasuredPage invoke(Integer num) {
            int iIntValue = num.intValue();
            long j10 = this.f5440q0;
            PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider = this.f5441r0;
            long j11 = this.f5442s0;
            Orientation orientation = this.f5443t0;
            Alignment.Horizontal horizontal = this.f5444u0;
            Alignment.Vertical vertical = this.v0;
            LazyLayoutMeasureScope lazyLayoutMeasureScope = this.f5439p0;
            return PagerMeasureKt.a(lazyLayoutMeasureScope, iIntValue, j10, pagerLazyLayoutItemProvider, j11, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), this.f5445w0, this.f5446x0);
        }
    }

    /* JADX INFO: compiled from: PagerMeasure.kt */
    public static final class d extends Lambda implements Function1<Integer, MeasuredPage> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LazyLayoutMeasureScope f5447p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f5448q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PagerLazyLayoutItemProvider f5449r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f5450s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Orientation f5451t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Alignment.Horizontal f5452u0;
        public final /* synthetic */ Alignment.Vertical v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ boolean f5453w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f5454x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j10, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j11, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, boolean z10, int i10) {
            super(1);
            this.f5447p0 = lazyLayoutMeasureScope;
            this.f5448q0 = j10;
            this.f5449r0 = pagerLazyLayoutItemProvider;
            this.f5450s0 = j11;
            this.f5451t0 = orientation;
            this.f5452u0 = horizontal;
            this.v0 = vertical;
            this.f5453w0 = z10;
            this.f5454x0 = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final MeasuredPage invoke(Integer num) {
            int iIntValue = num.intValue();
            long j10 = this.f5448q0;
            PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider = this.f5449r0;
            long j11 = this.f5450s0;
            Orientation orientation = this.f5451t0;
            Alignment.Horizontal horizontal = this.f5452u0;
            Alignment.Vertical vertical = this.v0;
            LazyLayoutMeasureScope lazyLayoutMeasureScope = this.f5447p0;
            return PagerMeasureKt.a(lazyLayoutMeasureScope, iIntValue, j10, pagerLazyLayoutItemProvider, j11, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), this.f5453w0, this.f5454x0);
        }
    }

    public static final MeasuredPage a(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i10, long j10, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j11, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z10, int i11) {
        return new MeasuredPage(i10, i11, lazyLayoutMeasureScope.mo403measure0kLqBqw(i10, j10), j11, pagerLazyLayoutItemProvider.getKey(i10), orientation, horizontal, vertical, layoutDirection, z10, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: measurePager-ntgEbfI, reason: not valid java name */
    public static final PagerMeasureResult m451measurePagerntgEbfI(@NotNull LazyLayoutMeasureScope measurePager, int i10, @NotNull PagerLazyLayoutItemProvider pagerItemProvider, int i11, int i12, int i13, int i14, int i15, int i16, float f6, long j10, @NotNull Orientation orientation, @Nullable Alignment.Vertical vertical, @Nullable Alignment.Horizontal horizontal, boolean z10, long j11, int i17, int i18, @NotNull List<Integer> pinnedPages, @NotNull Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> layout) {
        int i19;
        int i20;
        ArrayDeque arrayDeque;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        MeasuredPage measuredPage;
        int i28;
        MeasuredPage measuredPage2;
        ArrayDeque arrayDeque2;
        ArrayList arrayList;
        boolean z11;
        boolean z12;
        ArrayList arrayList2;
        int[] iArr;
        int i29;
        int i30;
        ArrayDeque arrayDeque3;
        Intrinsics.checkNotNullParameter(measurePager, "$this$measurePager");
        Intrinsics.checkNotNullParameter(pagerItemProvider, "pagerItemProvider");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(pinnedPages, "pinnedPages");
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (i12 < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i31 = i17 + i14;
        int i32 = 0;
        int iCoerceAtLeast = kotlin.ranges.c.coerceAtLeast(i31, 0);
        if (i10 <= 0) {
            return new PagerMeasureResult(CollectionsKt__CollectionsKt.emptyList(), 0, i17, i14, i13, orientation, -i12, i11 + i13, false, 0.0f, null, null, 0, false, layout.invoke(Integer.valueOf(Constraints.m4359getMinWidthimpl(j10)), Integer.valueOf(Constraints.m4358getMinHeightimpl(j10)), a.f5437p0));
        }
        Orientation orientation2 = Orientation.Vertical;
        long jConstraints$default = ConstraintsKt.Constraints$default(0, orientation == orientation2 ? Constraints.m4357getMaxWidthimpl(j10) : i17, 0, orientation != orientation2 ? Constraints.m4356getMaxHeightimpl(j10) : i17, 5, null);
        int i33 = i15;
        if (i33 >= i10) {
            i33 = i10 - 1;
            i19 = 0;
        } else {
            i19 = i16;
        }
        int iRoundToInt = mk.c.roundToInt(f6);
        int i34 = i19 - iRoundToInt;
        if (i33 == 0 && i34 < 0) {
            iRoundToInt += i34;
            i34 = 0;
        }
        ArrayDeque arrayDeque4 = new ArrayDeque();
        int i35 = -i12;
        int i36 = i35 + (i14 < 0 ? i14 : 0);
        int i37 = i34 + i36;
        int iMax = 0;
        while (i37 < 0 && i33 > 0) {
            int i38 = i33 - 1;
            int i39 = i36;
            int i40 = iCoerceAtLeast;
            int i41 = i32;
            MeasuredPage measuredPageA = a(measurePager, i38, jConstraints$default, pagerItemProvider, j11, orientation, horizontal, vertical, measurePager.getLayoutDirection(), z10, i17);
            arrayDeque4.add(i41, measuredPageA);
            iMax = Math.max(iMax, measuredPageA.getCrossAxisSize());
            i37 += i40;
            iCoerceAtLeast = i40;
            i32 = i41;
            i33 = i38;
            i31 = i31;
            i36 = i39;
        }
        int i42 = iCoerceAtLeast;
        int i43 = i31;
        int i44 = i36;
        int i45 = i32;
        int i46 = i37;
        if (i46 < i44) {
            iRoundToInt += i46;
            i46 = i44;
        }
        int i47 = i46 - i44;
        int i48 = i11;
        int i49 = i44;
        int i50 = i48 + i13;
        int iCoerceAtLeast2 = kotlin.ranges.c.coerceAtLeast(i50, i45);
        int i51 = -i47;
        int size = arrayDeque4.size();
        int i52 = i33;
        for (int i53 = i45; i53 < size; i53++) {
            i52++;
            i51 += i42;
        }
        int i54 = i10;
        int i55 = i51;
        int i56 = iMax;
        int i57 = i33;
        int i58 = i47;
        while (true) {
            if (i52 >= i54) {
                i20 = i11;
                break;
            }
            if (i55 >= iCoerceAtLeast2 && i55 > 0 && !arrayDeque4.isEmpty()) {
                i20 = i48;
                break;
            }
            ArrayDeque arrayDeque5 = arrayDeque4;
            int i59 = i57;
            int i60 = i52;
            int i61 = i56;
            int i62 = iCoerceAtLeast2;
            int i63 = i50;
            int i64 = i49;
            int i65 = i42;
            MeasuredPage measuredPageA2 = a(measurePager, i52, jConstraints$default, pagerItemProvider, j11, orientation, horizontal, vertical, measurePager.getLayoutDirection(), z10, i17);
            i55 += i65;
            if (i55 <= i64) {
                i42 = i65;
                i30 = i10;
                i29 = i60;
                if (i29 != i30 - 1) {
                    i58 -= i42;
                    arrayDeque3 = arrayDeque5;
                    i57 = i29 + 1;
                    i56 = i61;
                }
                i52 = i29 + 1;
                i48 = i11;
                i54 = i30;
                iCoerceAtLeast2 = i62;
                i50 = i63;
                arrayDeque4 = arrayDeque3;
                i49 = i64;
            } else {
                i42 = i65;
                i29 = i60;
                i30 = i10;
            }
            int iMax2 = Math.max(i61, measuredPageA2.getCrossAxisSize());
            arrayDeque3 = arrayDeque5;
            arrayDeque3.add(measuredPageA2);
            i57 = i59;
            i56 = iMax2;
            i52 = i29 + 1;
            i48 = i11;
            i54 = i30;
            iCoerceAtLeast2 = i62;
            i50 = i63;
            arrayDeque4 = arrayDeque3;
            i49 = i64;
        }
        if (i55 < i20) {
            int i66 = i20 - i55;
            int i67 = i55 + i66;
            int i68 = i57;
            int iMax3 = i56;
            int i69 = i58 - i66;
            while (i69 < i12 && i68 > 0) {
                int i70 = i68 - 1;
                ArrayDeque arrayDeque6 = arrayDeque4;
                int i71 = i67;
                int i72 = i42;
                MeasuredPage measuredPageA3 = a(measurePager, i70, jConstraints$default, pagerItemProvider, j11, orientation, horizontal, vertical, measurePager.getLayoutDirection(), z10, i17);
                arrayDeque6.add(0, measuredPageA3);
                iMax3 = Math.max(iMax3, measuredPageA3.getCrossAxisSize());
                i69 += i72;
                i42 = i72;
                arrayDeque4 = arrayDeque6;
                i68 = i70;
                i52 = i52;
                i67 = i71;
            }
            i24 = iMax3;
            int i73 = i69;
            arrayDeque = arrayDeque4;
            i21 = i52;
            int i74 = i67;
            i22 = i42;
            int i75 = iRoundToInt + i66;
            if (i73 < 0) {
                i75 += i73;
                i23 = i74 + i73;
                i26 = 0;
            } else {
                i23 = i74;
                i26 = i73;
            }
            int i76 = i75;
            i27 = i68;
            i25 = i76;
        } else {
            arrayDeque = arrayDeque4;
            i21 = i52;
            i22 = i42;
            i23 = i55;
            i24 = i56;
            i25 = iRoundToInt;
            i26 = i58;
            i27 = i57;
        }
        float f10 = (mk.c.getSign(mk.c.roundToInt(f6)) != mk.c.getSign(i25) || Math.abs(mk.c.roundToInt(f6)) < Math.abs(i25)) ? f6 : i25;
        if (i26 < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i77 = -i26;
        MeasuredPage measuredPage3 = (MeasuredPage) arrayDeque.first();
        if (i12 > 0 || i14 < 0) {
            int size2 = arrayDeque.size();
            int i78 = i26;
            int i79 = 0;
            while (i79 < size2 && i78 != 0 && i22 <= i78 && i79 != CollectionsKt__CollectionsKt.getLastIndex(arrayDeque)) {
                i78 -= i22;
                i79++;
                measuredPage3 = (MeasuredPage) arrayDeque.get(i79);
            }
            measuredPage = measuredPage3;
            i28 = i78;
        } else {
            measuredPage = measuredPage3;
            i28 = i26;
        }
        int i80 = i24;
        d dVar = new d(measurePager, jConstraints$default, pagerItemProvider, j11, orientation, horizontal, vertical, z10, i17);
        int iMax4 = Math.max(0, i27 - i18);
        int i81 = i27 - 1;
        Object obj = null;
        ArrayList arrayList3 = null;
        if (iMax4 <= i81) {
            while (true) {
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                }
                arrayList3.add(dVar.invoke(Integer.valueOf(i81)));
                if (i81 == iMax4) {
                    break;
                }
                i81--;
            }
        }
        int size3 = pinnedPages.size();
        List listEmptyList = arrayList3;
        for (int i82 = 0; i82 < size3; i82++) {
            int iIntValue = pinnedPages.get(i82).intValue();
            if (iIntValue < iMax4) {
                if (listEmptyList == null) {
                    listEmptyList = new ArrayList();
                }
                listEmptyList.add(dVar.invoke(Integer.valueOf(iIntValue)));
            }
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        int size4 = list.size();
        int iMax5 = i80;
        for (int i83 = 0; i83 < size4; i83++) {
            iMax5 = Math.max(iMax5, ((MeasuredPage) list.get(i83)).getCrossAxisSize());
        }
        int index = ((MeasuredPage) arrayDeque.last()).getIndex();
        ArrayDeque arrayDeque7 = arrayDeque;
        int i84 = iMax5;
        int i85 = i23;
        c cVar = new c(measurePager, jConstraints$default, pagerItemProvider, j11, orientation, horizontal, vertical, z10, i17);
        int iMin = Math.min(index + i18, i10 - 1);
        int i86 = index + 1;
        ArrayList arrayList4 = null;
        if (i86 <= iMin) {
            while (true) {
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                arrayList4.add(cVar.invoke(Integer.valueOf(i86)));
                if (i86 == iMin) {
                    break;
                }
                i86++;
            }
        }
        int size5 = pinnedPages.size();
        List listEmptyList2 = arrayList4;
        for (int i87 = 0; i87 < size5; i87++) {
            int iIntValue2 = pinnedPages.get(i87).intValue();
            if (iMin + 1 <= iIntValue2 && iIntValue2 < i10) {
                if (listEmptyList2 == null) {
                    listEmptyList2 = new ArrayList();
                }
                listEmptyList2.add(cVar.invoke(Integer.valueOf(iIntValue2)));
            }
        }
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
        }
        int size6 = listEmptyList2.size();
        int iMax6 = i84;
        for (int i88 = 0; i88 < size6; i88++) {
            iMax6 = Math.max(iMax6, ((MeasuredPage) listEmptyList2.get(i88)).getCrossAxisSize());
        }
        boolean z13 = Intrinsics.areEqual(measuredPage, arrayDeque7.first()) && list.isEmpty() && listEmptyList2.isEmpty();
        Orientation orientation3 = Orientation.Vertical;
        int iM4371constrainWidthK40F9xA = ConstraintsKt.m4371constrainWidthK40F9xA(j10, orientation == orientation3 ? iMax6 : i85);
        if (orientation == orientation3) {
            iMax6 = i85;
        }
        int iM4370constrainHeightK40F9xA = ConstraintsKt.m4370constrainHeightK40F9xA(j10, iMax6);
        int i89 = orientation == orientation3 ? iM4370constrainHeightK40F9xA : iM4371constrainWidthK40F9xA;
        boolean z14 = i85 < Math.min(i89, i11);
        if (z14 && i77 != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        ArrayList arrayList5 = new ArrayList(listEmptyList2.size() + list.size() + arrayDeque7.size());
        if (!z14) {
            arrayList5 = arrayList5;
            measuredPage2 = measuredPage;
            arrayDeque2 = arrayDeque7;
            int size7 = list.size();
            int i90 = i77;
            for (int i91 = 0; i91 < size7; i91++) {
                MeasuredPage measuredPage4 = (MeasuredPage) list.get(i91);
                i90 -= i43;
                measuredPage4.position(i90, iM4371constrainWidthK40F9xA, iM4370constrainHeightK40F9xA);
                arrayList5.add(measuredPage4);
            }
            int size8 = arrayDeque2.size();
            int i92 = i77;
            for (int i93 = 0; i93 < size8; i93++) {
                MeasuredPage measuredPage5 = (MeasuredPage) arrayDeque2.get(i93);
                measuredPage5.position(i92, iM4371constrainWidthK40F9xA, iM4370constrainHeightK40F9xA);
                arrayList5.add(measuredPage5);
                i92 += i43;
            }
            int size9 = listEmptyList2.size();
            for (int i94 = 0; i94 < size9; i94++) {
                MeasuredPage measuredPage6 = (MeasuredPage) listEmptyList2.get(i94);
                measuredPage6.position(i92, iM4371constrainWidthK40F9xA, iM4370constrainHeightK40F9xA);
                arrayList5.add(measuredPage6);
                i92 += i43;
            }
        } else {
            if (!list.isEmpty() || !listEmptyList2.isEmpty()) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int size10 = arrayDeque7.size();
            int[] iArr2 = new int[size10];
            for (int i95 = 0; i95 < size10; i95++) {
                iArr2[i95] = i17;
            }
            int[] iArr3 = new int[size10];
            for (int i96 = 0; i96 < size10; i96++) {
                iArr3[i96] = 0;
            }
            measuredPage2 = measuredPage;
            arrayDeque2 = arrayDeque7;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM249spacedBy0680j_4 = Arrangement.Absolute.INSTANCE.m249spacedBy0680j_4(measurePager.mo406toDpu2uoSUM(i17));
            if (orientation == Orientation.Vertical) {
                horizontalOrVerticalM249spacedBy0680j_4.arrange(measurePager, i89, iArr2, iArr3);
                iArr = iArr3;
            } else {
                iArr = iArr3;
                horizontalOrVerticalM249spacedBy0680j_4.arrange(measurePager, i89, iArr2, LayoutDirection.Ltr, iArr);
            }
            IntProgression indices = ArraysKt___ArraysKt.getIndices(iArr);
            if (z10) {
                indices = kotlin.ranges.c.reversed(indices);
            }
            int first = indices.getFirst();
            int last = indices.getLast();
            int step = indices.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int size11 = iArr[first];
                    MeasuredPage measuredPage7 = (MeasuredPage) arrayDeque2.get(!z10 ? first : (size10 - first) - 1);
                    if (z10) {
                        size11 = (i89 - size11) - measuredPage7.getSize();
                    }
                    measuredPage7.position(size11, iM4371constrainWidthK40F9xA, iM4370constrainHeightK40F9xA);
                    arrayList5.add(measuredPage7);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        }
        if (z13) {
            arrayList = arrayList5;
        } else {
            ArrayList arrayList6 = new ArrayList(arrayList5.size());
            int size12 = arrayList5.size();
            for (int i97 = 0; i97 < size12; i97++) {
                Object obj2 = arrayList5.get(i97);
                MeasuredPage measuredPage8 = (MeasuredPage) obj2;
                if (measuredPage8.getIndex() >= ((MeasuredPage) arrayDeque2.first()).getIndex() && measuredPage8.getIndex() <= ((MeasuredPage) arrayDeque2.last()).getIndex()) {
                    arrayList6.add(obj2);
                }
            }
            arrayList = arrayList6;
        }
        int i98 = orientation == Orientation.Vertical ? iM4370constrainHeightK40F9xA : iM4371constrainWidthK40F9xA;
        if (arrayList.isEmpty()) {
            arrayList2 = arrayList;
            z11 = false;
            z12 = true;
        } else {
            Object obj3 = arrayList.get(0);
            MeasuredPage measuredPage9 = (MeasuredPage) obj3;
            z11 = false;
            float f11 = -Math.abs(SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(measurePager, i98, i12, i13, i17, measuredPage9.getOffset(), measuredPage9.getIndex(), PagerStateKt.getSnapAlignmentStartToStart()));
            int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
            boolean z15 = true;
            if (1 <= lastIndex) {
                float f12 = f11;
                int i99 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i99);
                    MeasuredPage measuredPage10 = (MeasuredPage) obj4;
                    int i100 = i99;
                    arrayList2 = arrayList;
                    float f13 = f12;
                    z12 = z15;
                    int i101 = lastIndex;
                    float f14 = -Math.abs(SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(measurePager, i98, i12, i13, i17, measuredPage10.getOffset(), measuredPage10.getIndex(), PagerStateKt.getSnapAlignmentStartToStart()));
                    if (Float.compare(f13, f14) < 0) {
                        f12 = f14;
                        obj3 = obj4;
                    } else {
                        f12 = f13;
                    }
                    if (i100 == i101) {
                        break;
                    }
                    i99 = i100 + 1;
                    arrayList = arrayList2;
                    lastIndex = i101;
                    z15 = z12;
                }
            } else {
                z12 = true;
                arrayList2 = arrayList;
            }
            obj = obj3;
        }
        return new PagerMeasureResult(arrayList2, i10, i17, i14, i13, orientation, i35, i50, z10, f10, measuredPage2, (MeasuredPage) obj, i28, (i21 < i10 || i85 > i11) ? z12 : z11, layout.invoke(Integer.valueOf(iM4371constrainWidthK40F9xA), Integer.valueOf(iM4370constrainHeightK40F9xA), new b(arrayList5)));
    }
}
