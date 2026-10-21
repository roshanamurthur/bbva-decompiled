package h0;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.material.TextFieldImplKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
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
import androidx.compose.ui.util.MathHelpersKt;
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

/* JADX INFO: compiled from: OutlinedTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldMeasurePolicy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,973:1\n1#2:974\n223#3,2:975\n223#3,2:977\n223#3,2:979\n223#3,2:981\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldMeasurePolicy\n*L\n621#1:975,2\n653#1:977,2\n722#1:979,2\n754#1:981,2\n*E\n"})
public final class c2 implements MeasurePolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<Size, Unit> f68686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f68687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f68688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PaddingValues f68689d;

    /* JADX INFO: compiled from: OutlinedTextField.kt */
    public static final class a extends Lambda implements Function2<IntrinsicMeasurable, Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f68690p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            IntrinsicMeasurable intrinsicMeasurable2 = intrinsicMeasurable;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(intrinsicMeasurable2, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable2.maxIntrinsicHeight(iIntValue));
        }
    }

    /* JADX INFO: compiled from: OutlinedTextField.kt */
    public static final class b extends Lambda implements Function2<IntrinsicMeasurable, Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f68691p0 = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            IntrinsicMeasurable intrinsicMeasurable2 = intrinsicMeasurable;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(intrinsicMeasurable2, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable2.maxIntrinsicWidth(iIntValue));
        }
    }

    /* JADX INFO: compiled from: OutlinedTextField.kt */
    public static final class c extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f68692p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f68693q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Placeable f68694r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Placeable f68695s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Placeable f68696t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Placeable f68697u0;
        public final /* synthetic */ Placeable v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Placeable f68698w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ c2 f68699x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ MeasureScope f68700y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, int i11, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, c2 c2Var, MeasureScope measureScope) {
            super(1);
            this.f68692p0 = i10;
            this.f68693q0 = i11;
            this.f68694r0 = placeable;
            this.f68695s0 = placeable2;
            this.f68696t0 = placeable3;
            this.f68697u0 = placeable4;
            this.v0 = placeable5;
            this.f68698w0 = placeable6;
            this.f68699x0 = c2Var;
            this.f68700y0 = measureScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            int i10 = this.f68692p0;
            int i11 = this.f68693q0;
            Placeable placeable = this.f68694r0;
            Placeable placeable2 = this.f68695s0;
            Placeable placeable3 = this.f68696t0;
            Placeable placeable4 = this.f68697u0;
            Placeable placeable5 = this.v0;
            Placeable placeable6 = this.f68698w0;
            c2 c2Var = this.f68699x0;
            float f6 = c2Var.f68688c;
            boolean z10 = c2Var.f68687b;
            MeasureScope measureScope = this.f68700y0;
            OutlinedTextFieldKt.access$place(layout, i10, i11, placeable, placeable2, placeable3, placeable4, placeable5, placeable6, f6, z10, measureScope.getDensity(), measureScope.getLayoutDirection(), c2Var.f68689d);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: OutlinedTextField.kt */
    public static final class d extends Lambda implements Function2<IntrinsicMeasurable, Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f68701p0 = new d(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            IntrinsicMeasurable intrinsicMeasurable2 = intrinsicMeasurable;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(intrinsicMeasurable2, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable2.minIntrinsicHeight(iIntValue));
        }
    }

    /* JADX INFO: compiled from: OutlinedTextField.kt */
    public static final class e extends Lambda implements Function2<IntrinsicMeasurable, Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f68702p0 = new e(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            IntrinsicMeasurable intrinsicMeasurable2 = intrinsicMeasurable;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(intrinsicMeasurable2, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable2.minIntrinsicWidth(iIntValue));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c2(@NotNull Function1<? super Size, Unit> onLabelMeasured, boolean z10, float f6, @NotNull PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(onLabelMeasured, "onLabelMeasured");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        this.f68686a = onLabelMeasured;
        this.f68687b = z10;
        this.f68688c = f6;
        this.f68689d = paddingValues;
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
                return OutlinedTextFieldKt.m794access$calculateHeightO3s9Psw(iIntValue4, iIntValue3, iIntValue, iIntValue2, intrinsicMeasurable4 != null ? function2.invoke(intrinsicMeasurable4, Integer.valueOf(i10)).intValue() : 0, this.f68688c, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.f68689d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
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
                return OutlinedTextFieldKt.m795access$calculateWidthO3s9Psw(iIntValue4, iIntValue3, iIntValue, iIntValue2, intrinsicMeasurable4 != null ? function2.invoke(intrinsicMeasurable4, Integer.valueOf(i10)).intValue() : 0, this.f68688c, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.f68689d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return a(intrinsicMeasureScope, measurables, i10, a.f68690p0);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return b(intrinsicMeasureScope, measurables, i10, b.f68691p0);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo113measure3p2s80s(@NotNull MeasureScope measure, @NotNull List<? extends Measurable> measurables, long j10) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        PaddingValues paddingValues = this.f68689d;
        int iMo413roundToPx0680j_4 = measure.mo413roundToPx0680j_4(paddingValues.getBottom());
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
        int iMo413roundToPx0680j_5 = measure.mo413roundToPx0680j_4(paddingValues.mo303calculateRightPaddingu2uoSUM(measure.getLayoutDirection())) + measure.mo413roundToPx0680j_4(paddingValues.mo302calculateLeftPaddingu2uoSUM(measure.getLayoutDirection()));
        int i10 = -iWidthOrZero2;
        int i11 = -iMo413roundToPx0680j_4;
        long jM4373offsetNN6EwU = ConstraintsKt.m4373offsetNN6EwU(jM4349copyZbe2FdA$default, MathHelpersKt.lerp(i10 - iMo413roundToPx0680j_5, -iMo413roundToPx0680j_5, this.f68688c), i11);
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
            this.f68686a.invoke(Size.m2332boximpl(SizeKt.Size(placeableMo3575measureBRTryo2.getWidth(), placeableMo3575measureBRTryo2.getHeight())));
        }
        long jM4349copyZbe2FdA$default2 = Constraints.m4349copyZbe2FdA$default(ConstraintsKt.m4373offsetNN6EwU(j10, i10, i11 - Math.max(TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo2) / 2, measure.mo413roundToPx0680j_4(paddingValues.getTop()))), 0, 0, 0, 0, 11, null);
        for (Measurable measurable4 : list) {
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), "TextField")) {
                Placeable placeableMo3575measureBRTryo3 = measurable4.mo3575measureBRTryo0(jM4349copyZbe2FdA$default2);
                long jM4349copyZbe2FdA$default3 = Constraints.m4349copyZbe2FdA$default(jM4349copyZbe2FdA$default2, 0, 0, 0, 0, 14, null);
                Iterator<T> it4 = list.iterator();
                do {
                    if (!it4.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it4.next();
                } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next4), "Hint"));
                Measurable measurable5 = (Measurable) next4;
                Placeable placeableMo3575measureBRTryo4 = measurable5 != null ? measurable5.mo3575measureBRTryo0(jM4349copyZbe2FdA$default3) : null;
                int iM795access$calculateWidthO3s9Psw = OutlinedTextFieldKt.m795access$calculateWidthO3s9Psw(TextFieldImplKt.widthOrZero(placeableMo3575measureBRTryo0), TextFieldImplKt.widthOrZero(placeableMo3575measureBRTryo1), placeableMo3575measureBRTryo3.getWidth(), TextFieldImplKt.widthOrZero(placeableMo3575measureBRTryo2), TextFieldImplKt.widthOrZero(placeableMo3575measureBRTryo4), this.f68688c, j10, measure.getDensity(), this.f68689d);
                int iM794access$calculateHeightO3s9Psw = OutlinedTextFieldKt.m794access$calculateHeightO3s9Psw(TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo0), TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo1), placeableMo3575measureBRTryo3.getHeight(), TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo2), TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo4), this.f68688c, j10, measure.getDensity(), this.f68689d);
                for (Measurable measurable6 : list) {
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable6), OutlinedTextFieldKt.BorderId)) {
                        return MeasureScope.CC.q(measure, iM795access$calculateWidthO3s9Psw, iM794access$calculateHeightO3s9Psw, null, new c(iM794access$calculateHeightO3s9Psw, iM795access$calculateWidthO3s9Psw, placeableMo3575measureBRTryo0, placeableMo3575measureBRTryo1, placeableMo3575measureBRTryo3, placeableMo3575measureBRTryo2, placeableMo3575measureBRTryo4, measurable6.mo3575measureBRTryo0(ConstraintsKt.Constraints(iM795access$calculateWidthO3s9Psw != Integer.MAX_VALUE ? iM795access$calculateWidthO3s9Psw : 0, iM795access$calculateWidthO3s9Psw, iM794access$calculateHeightO3s9Psw != Integer.MAX_VALUE ? iM794access$calculateHeightO3s9Psw : 0, iM794access$calculateHeightO3s9Psw)), this, measure), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return a(intrinsicMeasureScope, measurables, i10, d.f68701p0);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return b(intrinsicMeasureScope, measurables, i10, e.f68702p0);
    }
}
