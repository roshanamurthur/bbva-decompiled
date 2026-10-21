package l0;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.TextFieldImplKt;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TextField.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldMeasurePolicy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1121:1\n1#2:1122\n223#3,2:1123\n223#3,2:1125\n223#3,2:1127\n223#3,2:1129\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldMeasurePolicy\n*L\n689#1:1123,2\n738#1:1125,2\n829#1:1127,2\n866#1:1129,2\n*E\n"})
public final class n4 implements MeasurePolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f82728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f82729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PaddingValues f82730c;

    /* JADX INFO: compiled from: TextField.kt */
    public static final class a extends Lambda implements Function2<IntrinsicMeasurable, Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f82731p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            IntrinsicMeasurable intrinsicMeasurable2 = intrinsicMeasurable;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(intrinsicMeasurable2, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable2.maxIntrinsicHeight(iIntValue));
        }
    }

    /* JADX INFO: compiled from: TextField.kt */
    public static final class b extends Lambda implements Function2<IntrinsicMeasurable, Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f82732p0 = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            IntrinsicMeasurable intrinsicMeasurable2 = intrinsicMeasurable;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(intrinsicMeasurable2, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable2.maxIntrinsicWidth(iIntValue));
        }
    }

    /* JADX INFO: compiled from: TextField.kt */
    public static final class c extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
        public final /* synthetic */ Placeable E0;
        public final /* synthetic */ n4 F0;
        public final /* synthetic */ int G0;
        public final /* synthetic */ MeasureScope H0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable f82733p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f82734q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f82735r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Placeable f82736s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Placeable f82737t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Placeable f82738u0;
        public final /* synthetic */ Placeable v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Placeable f82739w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Placeable f82740x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Placeable f82741y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Placeable placeable, int i10, int i11, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, n4 n4Var, int i12, MeasureScope measureScope) {
            super(1);
            this.f82733p0 = placeable;
            this.f82734q0 = i10;
            this.f82735r0 = i11;
            this.f82736s0 = placeable2;
            this.f82737t0 = placeable3;
            this.f82738u0 = placeable4;
            this.v0 = placeable5;
            this.f82739w0 = placeable6;
            this.f82740x0 = placeable7;
            this.f82741y0 = placeable8;
            this.E0 = placeable9;
            this.F0 = n4Var;
            this.G0 = i12;
            this.H0 = measureScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable placeable = this.f82733p0;
            MeasureScope measureScope = this.H0;
            n4 n4Var = this.F0;
            if (placeable != null) {
                int i10 = this.f82734q0;
                int i11 = this.f82735r0;
                Placeable placeable2 = this.f82736s0;
                Placeable placeable3 = this.f82737t0;
                Placeable placeable4 = this.f82738u0;
                Placeable placeable5 = this.v0;
                Placeable placeable6 = this.f82739w0;
                Placeable placeable7 = this.f82740x0;
                Placeable placeable8 = this.f82741y0;
                Placeable placeable9 = this.E0;
                boolean z10 = n4Var.f82728a;
                int i12 = this.G0;
                TextFieldKt.access$placeWithLabel(layout, i10, i11, placeable2, placeable, placeable3, placeable4, placeable5, placeable6, placeable7, placeable8, placeable9, z10, i12, placeable.getHeight() + i12, n4Var.f82729b, measureScope.getDensity());
            } else {
                TextFieldKt.access$placeWithoutLabel(layout, this.f82734q0, this.f82735r0, this.f82736s0, this.f82737t0, this.f82738u0, this.v0, this.f82739w0, this.f82740x0, this.f82741y0, this.E0, n4Var.f82728a, measureScope.getDensity(), n4Var.f82730c);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TextField.kt */
    public static final class d extends Lambda implements Function2<IntrinsicMeasurable, Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f82742p0 = new d(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            IntrinsicMeasurable intrinsicMeasurable2 = intrinsicMeasurable;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(intrinsicMeasurable2, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable2.minIntrinsicHeight(iIntValue));
        }
    }

    /* JADX INFO: compiled from: TextField.kt */
    public static final class e extends Lambda implements Function2<IntrinsicMeasurable, Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f82743p0 = new e(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            IntrinsicMeasurable intrinsicMeasurable2 = intrinsicMeasurable;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(intrinsicMeasurable2, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable2.minIntrinsicWidth(iIntValue));
        }
    }

    public n4(boolean z10, float f6, @NotNull PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        this.f82728a = z10;
        this.f82729b = f6;
        this.f82730c = paddingValues;
    }

    public static int b(List list, int i10, Function2 function2) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        List list2 = list;
        for (Object obj2 : list2) {
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj2), "TextField")) {
                int iIntValue = ((Number) function2.invoke(obj2, Integer.valueOf(i10))).intValue();
                Iterator it = list2.iterator();
                do {
                    obj = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next), "Label"));
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) next;
                int iIntValue2 = intrinsicMeasurable != null ? ((Number) function2.invoke(intrinsicMeasurable, Integer.valueOf(i10))).intValue() : 0;
                Iterator it2 = list2.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next2), "Trailing"));
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) next2;
                int iIntValue3 = intrinsicMeasurable2 != null ? ((Number) function2.invoke(intrinsicMeasurable2, Integer.valueOf(i10))).intValue() : 0;
                Iterator it3 = list2.iterator();
                do {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                } while (!Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next3), TextFieldImplKt.PrefixId));
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) next3;
                int iIntValue4 = intrinsicMeasurable3 != null ? ((Number) function2.invoke(intrinsicMeasurable3, Integer.valueOf(i10))).intValue() : 0;
                Iterator it4 = list2.iterator();
                do {
                    if (!it4.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it4.next();
                } while (!Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next4), TextFieldImplKt.SuffixId));
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) next4;
                int iIntValue5 = intrinsicMeasurable4 != null ? ((Number) function2.invoke(intrinsicMeasurable4, Integer.valueOf(i10))).intValue() : 0;
                Iterator it5 = list2.iterator();
                do {
                    if (!it5.hasNext()) {
                        next5 = null;
                        break;
                    }
                    next5 = it5.next();
                } while (!Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next5), "Leading"));
                IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) next5;
                int iIntValue6 = intrinsicMeasurable5 != null ? ((Number) function2.invoke(intrinsicMeasurable5, Integer.valueOf(i10))).intValue() : 0;
                for (Object obj3 : list2) {
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj3), "Hint")) {
                        obj = obj3;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable6 = (IntrinsicMeasurable) obj;
                return TextFieldKt.m1387access$calculateWidthyeHjK3Y(iIntValue6, iIntValue3, iIntValue4, iIntValue5, iIntValue, iIntValue2, intrinsicMeasurable6 != null ? ((Number) function2.invoke(intrinsicMeasurable6, Integer.valueOf(i10))).intValue() : 0, TextFieldImplKt.getZeroConstraints());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Object next6;
        List<? extends IntrinsicMeasurable> list2 = list;
        for (Object obj2 : list2) {
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj2), "TextField")) {
                int iIntValue = function2.invoke(obj2, Integer.valueOf(i10)).intValue();
                Iterator<T> it = list2.iterator();
                do {
                    obj = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next), "Label"));
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) next;
                int iIntValue2 = intrinsicMeasurable != null ? function2.invoke(intrinsicMeasurable, Integer.valueOf(i10)).intValue() : 0;
                Iterator<T> it2 = list2.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next2), "Trailing"));
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) next2;
                int iIntValue3 = intrinsicMeasurable2 != null ? function2.invoke(intrinsicMeasurable2, Integer.valueOf(i10)).intValue() : 0;
                Iterator<T> it3 = list2.iterator();
                do {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                } while (!Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next3), "Leading"));
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) next3;
                int iIntValue4 = intrinsicMeasurable3 != null ? function2.invoke(intrinsicMeasurable3, Integer.valueOf(i10)).intValue() : 0;
                Iterator<T> it4 = list2.iterator();
                do {
                    if (!it4.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it4.next();
                } while (!Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next4), TextFieldImplKt.PrefixId));
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) next4;
                int iIntValue5 = intrinsicMeasurable4 != null ? function2.invoke(intrinsicMeasurable4, Integer.valueOf(i10)).intValue() : 0;
                Iterator<T> it5 = list2.iterator();
                do {
                    if (!it5.hasNext()) {
                        next5 = null;
                        break;
                    }
                    next5 = it5.next();
                } while (!Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next5), TextFieldImplKt.SuffixId));
                IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) next5;
                int iIntValue6 = intrinsicMeasurable5 != null ? function2.invoke(intrinsicMeasurable5, Integer.valueOf(i10)).intValue() : 0;
                Iterator<T> it6 = list2.iterator();
                do {
                    if (!it6.hasNext()) {
                        next6 = null;
                        break;
                    }
                    next6 = it6.next();
                } while (!Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next6), "Hint"));
                IntrinsicMeasurable intrinsicMeasurable6 = (IntrinsicMeasurable) next6;
                int iIntValue7 = intrinsicMeasurable6 != null ? function2.invoke(intrinsicMeasurable6, Integer.valueOf(i10)).intValue() : 0;
                for (Object obj3 : list2) {
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj3), TextFieldImplKt.SupportingId)) {
                        obj = obj3;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable7 = (IntrinsicMeasurable) obj;
                return TextFieldKt.m1386access$calculateHeightmKXJcVc(iIntValue, iIntValue2, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue7, intrinsicMeasurable7 != null ? function2.invoke(intrinsicMeasurable7, Integer.valueOf(i10)).intValue() : 0, this.f82729b == 1.0f, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.f82730c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return a(intrinsicMeasureScope, measurables, i10, a.f82731p0);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return b(measurables, i10, b.f82732p0);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo113measure3p2s80s(@NotNull MeasureScope measure, @NotNull List<? extends Measurable> measurables, long j10) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Object obj;
        Object next6;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        PaddingValues paddingValues = this.f82730c;
        int iMo413roundToPx0680j_4 = measure.mo413roundToPx0680j_4(paddingValues.getTop());
        int iMo413roundToPx0680j_5 = measure.mo413roundToPx0680j_4(paddingValues.getBottom());
        long jM4349copyZbe2FdA$default = Constraints.m4349copyZbe2FdA$default(j10, 0, 0, 0, 0, 10, null);
        List<? extends Measurable> list = measurables;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next), "Leading"));
        Measurable measurable = (Measurable) next;
        Placeable placeableMo3575measureBRTryo0 = measurable != null ? measurable.mo3575measureBRTryo0(jM4349copyZbe2FdA$default) : null;
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeableMo3575measureBRTryo0);
        int iMax = Math.max(0, TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo0));
        Iterator<T> it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next2), "Trailing"));
        Measurable measurable2 = (Measurable) next2;
        Placeable placeableMo3575measureBRTryo1 = measurable2 != null ? measurable2.mo3575measureBRTryo0(ConstraintsKt.m4374offsetNN6EwU$default(jM4349copyZbe2FdA$default, -iWidthOrZero, 0, 2, null)) : null;
        int iWidthOrZero2 = TextFieldImplKt.widthOrZero(placeableMo3575measureBRTryo1) + iWidthOrZero;
        int iMax2 = Math.max(iMax, TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo1));
        Iterator<T> it3 = list.iterator();
        do {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
        } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next3), TextFieldImplKt.PrefixId));
        Measurable measurable3 = (Measurable) next3;
        Placeable placeableMo3575measureBRTryo2 = measurable3 != null ? measurable3.mo3575measureBRTryo0(ConstraintsKt.m4374offsetNN6EwU$default(jM4349copyZbe2FdA$default, -iWidthOrZero2, 0, 2, null)) : null;
        int iWidthOrZero3 = TextFieldImplKt.widthOrZero(placeableMo3575measureBRTryo2) + iWidthOrZero2;
        int iMax3 = Math.max(iMax2, TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo2));
        Iterator<T> it4 = list.iterator();
        do {
            if (!it4.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it4.next();
        } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next4), TextFieldImplKt.SuffixId));
        Measurable measurable4 = (Measurable) next4;
        Placeable placeableMo3575measureBRTryo3 = measurable4 != null ? measurable4.mo3575measureBRTryo0(ConstraintsKt.m4374offsetNN6EwU$default(jM4349copyZbe2FdA$default, -iWidthOrZero3, 0, 2, null)) : null;
        int iWidthOrZero4 = TextFieldImplKt.widthOrZero(placeableMo3575measureBRTryo3) + iWidthOrZero3;
        int iMax4 = Math.max(iMax3, TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo3));
        int i10 = -iWidthOrZero4;
        long jM4373offsetNN6EwU = ConstraintsKt.m4373offsetNN6EwU(jM4349copyZbe2FdA$default, i10, -iMo413roundToPx0680j_5);
        Iterator it5 = list.iterator();
        while (true) {
            if (!it5.hasNext()) {
                next5 = null;
                break;
            }
            next5 = it5.next();
            Iterator it6 = it5;
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next5), "Label")) {
                break;
            }
            it5 = it6;
        }
        Measurable measurable5 = (Measurable) next5;
        Placeable placeableMo3575measureBRTryo4 = measurable5 != null ? measurable5.mo3575measureBRTryo0(jM4373offsetNN6EwU) : null;
        int iHeightOrZero = TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo4) + iMo413roundToPx0680j_4;
        long jM4373offsetNN6EwU2 = ConstraintsKt.m4373offsetNN6EwU(Constraints.m4349copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null), i10, (-iHeightOrZero) - iMo413roundToPx0680j_5);
        Iterator it7 = list.iterator();
        while (true) {
            int i11 = iMo413roundToPx0680j_4;
            if (!it7.hasNext()) {
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            Measurable measurable6 = (Measurable) it7.next();
            Iterator it8 = it7;
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable6), "TextField")) {
                Placeable placeableMo3575measureBRTryo5 = measurable6.mo3575measureBRTryo0(jM4373offsetNN6EwU2);
                long jM4349copyZbe2FdA$default2 = Constraints.m4349copyZbe2FdA$default(jM4373offsetNN6EwU2, 0, 0, 0, 0, 14, null);
                Iterator it9 = list.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        obj = null;
                        break;
                    }
                    Object next7 = it9.next();
                    Iterator it10 = it9;
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next7), "Hint")) {
                        obj = next7;
                        break;
                    }
                    it9 = it10;
                }
                Measurable measurable7 = (Measurable) obj;
                Placeable placeableMo3575measureBRTryo6 = measurable7 != null ? measurable7.mo3575measureBRTryo0(jM4349copyZbe2FdA$default2) : null;
                long jM4349copyZbe2FdA$default3 = Constraints.m4349copyZbe2FdA$default(ConstraintsKt.m4374offsetNN6EwU$default(jM4349copyZbe2FdA$default, 0, -Math.max(iMax4, Math.max(TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo5), TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo6)) + iHeightOrZero + iMo413roundToPx0680j_5), 1, null), 0, 0, 0, 0, 11, null);
                Iterator<T> it11 = list.iterator();
                do {
                    if (!it11.hasNext()) {
                        next6 = null;
                        break;
                    }
                    next6 = it11.next();
                } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next6), TextFieldImplKt.SupportingId));
                Measurable measurable8 = (Measurable) next6;
                Placeable placeableMo3575measureBRTryo7 = measurable8 != null ? measurable8.mo3575measureBRTryo0(jM4349copyZbe2FdA$default3) : null;
                int iHeightOrZero2 = TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo7);
                int iM1387access$calculateWidthyeHjK3Y = TextFieldKt.m1387access$calculateWidthyeHjK3Y(TextFieldImplKt.widthOrZero(placeableMo3575measureBRTryo0), TextFieldImplKt.widthOrZero(placeableMo3575measureBRTryo1), TextFieldImplKt.widthOrZero(placeableMo3575measureBRTryo2), TextFieldImplKt.widthOrZero(placeableMo3575measureBRTryo3), placeableMo3575measureBRTryo5.getWidth(), TextFieldImplKt.widthOrZero(placeableMo3575measureBRTryo4), TextFieldImplKt.widthOrZero(placeableMo3575measureBRTryo6), j10);
                int iM1386access$calculateHeightmKXJcVc = TextFieldKt.m1386access$calculateHeightmKXJcVc(placeableMo3575measureBRTryo5.getHeight(), TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo4), TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo0), TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo1), TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo2), TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo3), TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo6), TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo7), this.f82729b == 1.0f, j10, measure.getDensity(), this.f82730c);
                int i12 = iM1386access$calculateHeightmKXJcVc - iHeightOrZero2;
                for (Measurable measurable9 : list) {
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable9), TextFieldImplKt.ContainerId)) {
                        return MeasureScope.CC.q(measure, iM1387access$calculateWidthyeHjK3Y, iM1386access$calculateHeightmKXJcVc, null, new c(placeableMo3575measureBRTryo4, iM1387access$calculateWidthyeHjK3Y, iM1386access$calculateHeightmKXJcVc, placeableMo3575measureBRTryo5, placeableMo3575measureBRTryo6, placeableMo3575measureBRTryo0, placeableMo3575measureBRTryo1, placeableMo3575measureBRTryo2, placeableMo3575measureBRTryo3, measurable9.mo3575measureBRTryo0(ConstraintsKt.Constraints(iM1387access$calculateWidthyeHjK3Y != Integer.MAX_VALUE ? iM1387access$calculateWidthyeHjK3Y : 0, iM1387access$calculateWidthyeHjK3Y, i12 != Integer.MAX_VALUE ? i12 : 0, i12)), placeableMo3575measureBRTryo7, this, i11, measure), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            it7 = it8;
            iMo413roundToPx0680j_4 = i11;
        }
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return a(intrinsicMeasureScope, measurables, i10, d.f82742p0);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return b(measurables, i10, e.f82743p0);
    }
}
