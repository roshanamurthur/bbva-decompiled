package l0;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldImplKt;
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
@SourceDebugExtension({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldMeasurePolicy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1124:1\n1#2:1125\n223#3,2:1126\n223#3,2:1128\n223#3,2:1130\n223#3,2:1132\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldMeasurePolicy\n*L\n705#1:1126,2\n756#1:1128,2\n828#1:1130,2\n868#1:1132,2\n*E\n"})
public final class s2 implements MeasurePolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<Size, Unit> f82865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f82866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f82867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PaddingValues f82868d;

    /* JADX INFO: compiled from: OutlinedTextField.kt */
    public static final class a extends Lambda implements Function2<IntrinsicMeasurable, Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f82869p0 = new a(2);

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
        public static final b f82870p0 = new b(2);

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
        public final /* synthetic */ Placeable E0;
        public final /* synthetic */ s2 F0;
        public final /* synthetic */ MeasureScope G0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f82871p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f82872q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Placeable f82873r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Placeable f82874s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Placeable f82875t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Placeable f82876u0;
        public final /* synthetic */ Placeable v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Placeable f82877w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Placeable f82878x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Placeable f82879y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, int i11, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, s2 s2Var, MeasureScope measureScope) {
            super(1);
            this.f82871p0 = i10;
            this.f82872q0 = i11;
            this.f82873r0 = placeable;
            this.f82874s0 = placeable2;
            this.f82875t0 = placeable3;
            this.f82876u0 = placeable4;
            this.v0 = placeable5;
            this.f82877w0 = placeable6;
            this.f82878x0 = placeable7;
            this.f82879y0 = placeable8;
            this.E0 = placeable9;
            this.F0 = s2Var;
            this.G0 = measureScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            int i10 = this.f82871p0;
            int i11 = this.f82872q0;
            Placeable placeable = this.f82873r0;
            Placeable placeable2 = this.f82874s0;
            Placeable placeable3 = this.f82875t0;
            Placeable placeable4 = this.f82876u0;
            Placeable placeable5 = this.v0;
            Placeable placeable6 = this.f82877w0;
            Placeable placeable7 = this.f82878x0;
            Placeable placeable8 = this.f82879y0;
            Placeable placeable9 = this.E0;
            s2 s2Var = this.F0;
            float f6 = s2Var.f82867c;
            boolean z10 = s2Var.f82866b;
            MeasureScope measureScope = this.G0;
            OutlinedTextFieldKt.access$place(layout, i10, i11, placeable, placeable2, placeable3, placeable4, placeable5, placeable6, placeable7, placeable8, placeable9, f6, z10, measureScope.getDensity(), measureScope.getLayoutDirection(), s2Var.f82868d);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: OutlinedTextField.kt */
    public static final class d extends Lambda implements Function2<IntrinsicMeasurable, Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f82880p0 = new d(2);

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
        public static final e f82881p0 = new e(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            IntrinsicMeasurable intrinsicMeasurable2 = intrinsicMeasurable;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(intrinsicMeasurable2, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable2.minIntrinsicWidth(iIntValue));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s2(@NotNull Function1<? super Size, Unit> onLabelMeasured, boolean z10, float f6, @NotNull PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(onLabelMeasured, "onLabelMeasured");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        this.f82865a = onLabelMeasured;
        this.f82866b = z10;
        this.f82867c = f6;
        this.f82868d = paddingValues;
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
                return OutlinedTextFieldKt.m1199access$calculateHeightDHJA7U0(iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, iIntValue7, intrinsicMeasurable7 != null ? function2.invoke(intrinsicMeasurable7, Integer.valueOf(i10)).intValue() : 0, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.f82868d);
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
        Object next4;
        Object next5;
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
                for (Object obj3 : list2) {
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj3), "Hint")) {
                        obj = obj3;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable6 = (IntrinsicMeasurable) obj;
                return OutlinedTextFieldKt.m1200access$calculateWidthDHJA7U0(iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, intrinsicMeasurable6 != null ? function2.invoke(intrinsicMeasurable6, Integer.valueOf(i10)).intValue() : 0, this.f82867c < 1.0f, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.f82868d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return a(intrinsicMeasureScope, measurables, i10, a.f82869p0);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return b(intrinsicMeasureScope, measurables, i10, b.f82870p0);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo113measure3p2s80s(@NotNull MeasureScope measure, @NotNull List<? extends Measurable> measurables, long j10) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Placeable placeable;
        Placeable placeable2;
        Object next5;
        Object obj;
        Object next6;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        PaddingValues paddingValues = this.f82868d;
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
        boolean z10 = this.f82867c < 1.0f;
        int iMo413roundToPx0680j_5 = measure.mo413roundToPx0680j_4(paddingValues.mo303calculateRightPaddingu2uoSUM(measure.getLayoutDirection())) + measure.mo413roundToPx0680j_4(paddingValues.mo302calculateLeftPaddingu2uoSUM(measure.getLayoutDirection()));
        int i10 = z10 ? (-iWidthOrZero4) - iMo413roundToPx0680j_5 : -iMo413roundToPx0680j_5;
        int i11 = -iMo413roundToPx0680j_4;
        Placeable placeable3 = placeableMo3575measureBRTryo3;
        long jM4373offsetNN6EwU = ConstraintsKt.m4373offsetNN6EwU(jM4349copyZbe2FdA$default, i10, i11);
        Iterator<T> it5 = list.iterator();
        while (true) {
            if (!it5.hasNext()) {
                placeable = placeableMo3575measureBRTryo2;
                placeable2 = placeable3;
                next5 = null;
                break;
            }
            next5 = it5.next();
            placeable2 = placeable3;
            placeable = placeableMo3575measureBRTryo2;
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next5), "Label")) {
                break;
            }
            placeable3 = placeable2;
            placeableMo3575measureBRTryo2 = placeable;
        }
        Measurable measurable5 = (Measurable) next5;
        Placeable placeableMo3575measureBRTryo4 = measurable5 != null ? measurable5.mo3575measureBRTryo0(jM4373offsetNN6EwU) : null;
        if (placeableMo3575measureBRTryo4 != null) {
            this.f82865a.invoke(Size.m2332boximpl(SizeKt.Size(placeableMo3575measureBRTryo4.getWidth(), placeableMo3575measureBRTryo4.getHeight())));
        }
        int iMax5 = Math.max(TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo4) / 2, measure.mo413roundToPx0680j_4(paddingValues.getTop()));
        long jM4349copyZbe2FdA$default2 = Constraints.m4349copyZbe2FdA$default(ConstraintsKt.m4373offsetNN6EwU(j10, -iWidthOrZero4, i11 - iMax5), 0, 0, 0, 0, 11, null);
        Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            Measurable measurable6 = (Measurable) it6.next();
            Iterator it7 = it6;
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable6), "TextField")) {
                Placeable placeableMo3575measureBRTryo5 = measurable6.mo3575measureBRTryo0(jM4349copyZbe2FdA$default2);
                long jM4349copyZbe2FdA$default3 = Constraints.m4349copyZbe2FdA$default(jM4349copyZbe2FdA$default2, 0, 0, 0, 0, 14, null);
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        obj = null;
                        break;
                    }
                    Object next7 = it8.next();
                    Iterator it9 = it8;
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next7), "Hint")) {
                        obj = next7;
                        break;
                    }
                    it8 = it9;
                }
                Measurable measurable7 = (Measurable) obj;
                Placeable placeableMo3575measureBRTryo6 = measurable7 != null ? measurable7.mo3575measureBRTryo0(jM4349copyZbe2FdA$default3) : null;
                long jM4349copyZbe2FdA$default4 = Constraints.m4349copyZbe2FdA$default(ConstraintsKt.m4374offsetNN6EwU$default(jM4349copyZbe2FdA$default, 0, -Math.max(iMax4, Math.max(TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo5), TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo6)) + iMax5 + iMo413roundToPx0680j_4), 1, null), 0, 0, 0, 0, 11, null);
                Iterator<T> it10 = list.iterator();
                do {
                    if (!it10.hasNext()) {
                        next6 = null;
                        break;
                    }
                    next6 = it10.next();
                } while (!Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next6), TextFieldImplKt.SupportingId));
                Measurable measurable8 = (Measurable) next6;
                Placeable placeableMo3575measureBRTryo7 = measurable8 != null ? measurable8.mo3575measureBRTryo0(jM4349copyZbe2FdA$default4) : null;
                int iHeightOrZero = TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo7);
                int iM1200access$calculateWidthDHJA7U0 = OutlinedTextFieldKt.m1200access$calculateWidthDHJA7U0(TextFieldImplKt.widthOrZero(placeableMo3575measureBRTryo0), TextFieldImplKt.widthOrZero(placeableMo3575measureBRTryo1), TextFieldImplKt.widthOrZero(placeable), TextFieldImplKt.widthOrZero(placeable2), placeableMo3575measureBRTryo5.getWidth(), TextFieldImplKt.widthOrZero(placeableMo3575measureBRTryo4), TextFieldImplKt.widthOrZero(placeableMo3575measureBRTryo6), z10, j10, measure.getDensity(), this.f82868d);
                int iM1199access$calculateHeightDHJA7U0 = OutlinedTextFieldKt.m1199access$calculateHeightDHJA7U0(TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo0), TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo1), TextFieldImplKt.heightOrZero(placeable), TextFieldImplKt.heightOrZero(placeable2), placeableMo3575measureBRTryo5.getHeight(), TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo4), TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo6), TextFieldImplKt.heightOrZero(placeableMo3575measureBRTryo7), j10, measure.getDensity(), this.f82868d);
                int i12 = iM1199access$calculateHeightDHJA7U0 - iHeightOrZero;
                for (Measurable measurable9 : list) {
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable9), TextFieldImplKt.ContainerId)) {
                        return MeasureScope.CC.q(measure, iM1200access$calculateWidthDHJA7U0, iM1199access$calculateHeightDHJA7U0, null, new c(iM1199access$calculateHeightDHJA7U0, iM1200access$calculateWidthDHJA7U0, placeableMo3575measureBRTryo0, placeableMo3575measureBRTryo1, placeable, placeable2, placeableMo3575measureBRTryo5, placeableMo3575measureBRTryo4, placeableMo3575measureBRTryo6, measurable9.mo3575measureBRTryo0(ConstraintsKt.Constraints(iM1200access$calculateWidthDHJA7U0 != Integer.MAX_VALUE ? iM1200access$calculateWidthDHJA7U0 : 0, iM1200access$calculateWidthDHJA7U0, i12 != Integer.MAX_VALUE ? i12 : 0, i12)), placeableMo3575measureBRTryo7, this, measure), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            it6 = it7;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return a(intrinsicMeasureScope, measurables, i10, d.f82880p0);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return b(intrinsicMeasureScope, measurables, i10, e.f82881p0);
    }
}
