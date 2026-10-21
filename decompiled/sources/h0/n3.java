package h0;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.TextFieldImplKt;
import androidx.compose.material.TextFieldKt;
import androidx.compose.ui.layout.AlignmentLineKt;
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
@SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldMeasurePolicy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,929:1\n1#2:930\n223#3,2:931\n223#3,2:933\n223#3,2:935\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldMeasurePolicy\n*L\n599#1:931,2\n704#1:933,2\n733#1:935,2\n*E\n"})
public final class n3 implements MeasurePolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f68948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f68949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PaddingValues f68950c;

    /* JADX INFO: compiled from: TextField.kt */
    public static final class a extends Lambda implements Function2<IntrinsicMeasurable, Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f68951p0 = new a(2);

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
        public static final b f68952p0 = new b(2);

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
        public final /* synthetic */ int E0;
        public final /* synthetic */ int F0;
        public final /* synthetic */ MeasureScope G0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable f68953p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f68954q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f68955r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f68956s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f68957t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Placeable f68958u0;
        public final /* synthetic */ Placeable v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Placeable f68959w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Placeable f68960x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ n3 f68961y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Placeable placeable, int i10, int i11, int i12, int i13, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, n3 n3Var, int i14, int i15, MeasureScope measureScope) {
            super(1);
            this.f68953p0 = placeable;
            this.f68954q0 = i10;
            this.f68955r0 = i11;
            this.f68956s0 = i12;
            this.f68957t0 = i13;
            this.f68958u0 = placeable2;
            this.v0 = placeable3;
            this.f68959w0 = placeable4;
            this.f68960x0 = placeable5;
            this.f68961y0 = n3Var;
            this.E0 = i14;
            this.F0 = i15;
            this.G0 = measureScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable placeable = this.f68953p0;
            MeasureScope measureScope = this.G0;
            n3 n3Var = this.f68961y0;
            if (placeable != null) {
                TextFieldKt.access$placeWithLabel(layout, this.f68956s0, this.f68957t0, this.f68958u0, this.f68953p0, this.v0, this.f68959w0, this.f68960x0, n3Var.f68948a, kotlin.ranges.c.coerceAtLeast(this.f68954q0 - this.f68955r0, 0), this.E0 + this.F0, n3Var.f68949b, measureScope.getDensity());
            } else {
                TextFieldKt.access$placeWithoutLabel(layout, this.f68956s0, this.f68957t0, this.f68958u0, this.v0, this.f68959w0, this.f68960x0, n3Var.f68948a, measureScope.getDensity(), n3Var.f68950c);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TextField.kt */
    public static final class d extends Lambda implements Function2<IntrinsicMeasurable, Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f68962p0 = new d(2);

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
        public static final e f68963p0 = new e(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            IntrinsicMeasurable intrinsicMeasurable2 = intrinsicMeasurable;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(intrinsicMeasurable2, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable2.minIntrinsicWidth(iIntValue));
        }
    }

    public n3(boolean z10, float f6, @NotNull PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        this.f68948a = z10;
        this.f68949b = f6;
        this.f68950c = paddingValues;
    }

    public static int b(List list, int i10, Function2 function2) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
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
                } while (!Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next3), "Leading"));
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) next3;
                int iIntValue4 = intrinsicMeasurable3 != null ? ((Number) function2.invoke(intrinsicMeasurable3, Integer.valueOf(i10))).intValue() : 0;
                for (Object obj3 : list2) {
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj3), "Hint")) {
                        obj = obj3;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj;
                return Math.max(Math.max(iIntValue, Math.max(iIntValue2, intrinsicMeasurable4 != null ? ((Number) function2.invoke(intrinsicMeasurable4, Integer.valueOf(i10))).intValue() : 0)) + iIntValue4 + iIntValue3, Constraints.m4359getMinWidthimpl(TextFieldImplKt.getZeroConstraints()));
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
                for (Object obj3 : list2) {
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj3), "Hint")) {
                        obj = obj3;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj;
                return TextFieldKt.m876access$calculateHeightO3s9Psw(iIntValue, iIntValue2 > 0, iIntValue2, iIntValue4, iIntValue3, intrinsicMeasurable4 != null ? function2.invoke(intrinsicMeasurable4, Integer.valueOf(i10)).intValue() : 0, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.f68950c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return a(intrinsicMeasureScope, measurables, i10, a.f68951p0);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return b(measurables, i10, b.f68952p0);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo113measure3p2s80s(@NotNull MeasureScope measure, @NotNull List<? extends Measurable> measurables, long j10) {
        Object next;
        Object next2;
        Object next3;
        int height;
        Object next4;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        PaddingValues paddingValues = this.f68950c;
        int iMo413roundToPx0680j_4 = measure.mo413roundToPx0680j_4(paddingValues.getTop());
        int iMo413roundToPx0680j_5 = measure.mo413roundToPx0680j_4(paddingValues.getBottom());
        int iMo413roundToPx0680j_6 = measure.mo413roundToPx0680j_4(TextFieldKt.getTextFieldTopPadding());
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
        int i10 = -iMo413roundToPx0680j_5;
        int i11 = -iWidthOrZero2;
        long jM4373offsetNN6EwU = ConstraintsKt.m4373offsetNN6EwU(jM4349copyZbe2FdA$default, i11, i10);
        Iterator<T> it3 = list.iterator();
        do {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
        } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next3), "Label"));
        Measurable measurable3 = (Measurable) next3;
        Placeable placeableMo3575measureBRTryo2 = measurable3 != null ? measurable3.mo3575measureBRTryo0(jM4373offsetNN6EwU) : null;
        if (placeableMo3575measureBRTryo2 != null) {
            height = placeableMo3575measureBRTryo2.get(AlignmentLineKt.getLastBaseline());
            if (height == Integer.MIN_VALUE) {
                height = placeableMo3575measureBRTryo2.getHeight();
            }
        } else {
            height = 0;
        }
        int iMax = Math.max(height, iMo413roundToPx0680j_4);
        long jM4373offsetNN6EwU2 = ConstraintsKt.m4373offsetNN6EwU(Constraints.m4349copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null), i11, placeableMo3575measureBRTryo2 != null ? (i10 - iMo413roundToPx0680j_6) - iMax : (-iMo413roundToPx0680j_4) - iMo413roundToPx0680j_5);
        for (Measurable measurable4 : list) {
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), "TextField")) {
                Placeable placeableMo3575measureBRTryo3 = measurable4.mo3575measureBRTryo0(jM4373offsetNN6EwU2);
                long jM4349copyZbe2FdA$default2 = Constraints.m4349copyZbe2FdA$default(jM4373offsetNN6EwU2, 0, 0, 0, 0, 14, null);
                Iterator<T> it4 = list.iterator();
                do {
                    if (!it4.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it4.next();
                } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next4), "Hint"));
                Measurable measurable5 = (Measurable) next4;
                Placeable placeableMo3575measureBRTryo4 = measurable5 != null ? measurable5.mo3575measureBRTryo0(jM4349copyZbe2FdA$default2) : null;
                int iMax2 = Math.max(Math.max(placeableMo3575measureBRTryo3.getWidth(), Math.max(TextFieldImplKt.widthOrZero(placeableMo3575measureBRTryo2), TextFieldImplKt.widthOrZero(placeableMo3575measureBRTryo4))) + TextFieldImplKt.widthOrZero(placeableMo3575measureBRTryo0) + TextFieldImplKt.widthOrZero(placeableMo3575measureBRTryo1), Constraints.m4359getMinWidthimpl(j10));
                int iM876access$calculateHeightO3s9Psw = TextFieldKt.m876access$calculateHeightO3s9Psw(placeableMo3575measureBRTryo3.getHeight(), placeableMo3575measureBRTryo2 != null, iMax, TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo0), TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo1), TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo4), j10, measure.getDensity(), this.f68950c);
                return MeasureScope.CC.q(measure, iMax2, iM876access$calculateHeightO3s9Psw, null, new c(placeableMo3575measureBRTryo2, iMo413roundToPx0680j_4, height, iMax2, iM876access$calculateHeightO3s9Psw, placeableMo3575measureBRTryo3, placeableMo3575measureBRTryo4, placeableMo3575measureBRTryo0, placeableMo3575measureBRTryo1, this, iMax, iMo413roundToPx0680j_6, measure), 4, null);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return a(intrinsicMeasureScope, measurables, i10, d.f68962p0);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return b(measurables, i10, e.f68963p0);
    }
}
