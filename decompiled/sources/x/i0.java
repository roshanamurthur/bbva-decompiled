package x;

import androidx.compose.foundation.layout.LayoutOrientation;
import androidx.compose.foundation.layout.RowColumnImplKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f94336a = d.f94347p0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final h f94337b = h.f94351p0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final c f94338c = c.f94346p0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final g f94339d = g.f94350p0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final b f94340e = b.f94345p0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final f f94341f = f.f94349p0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f94342g = a.f94344p0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final e f94343h = e.f94348p0;

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    public static final class a extends Lambda implements Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f94344p0 = new a(3);

        @Override // kotlin.jvm.functions.Function3
        public final Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            List<? extends IntrinsicMeasurable> measurables = list;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return Integer.valueOf(RowColumnImplKt.access$intrinsicSize(measurables, g0.f94331p0, h0.f94334p0, iIntValue, iIntValue2, LayoutOrientation.Horizontal, LayoutOrientation.Vertical));
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    public static final class b extends Lambda implements Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f94345p0 = new b(3);

        @Override // kotlin.jvm.functions.Function3
        public final Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            List<? extends IntrinsicMeasurable> measurables = list;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            j0 j0Var = j0.f94358p0;
            k0 k0Var = k0.f94360p0;
            LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
            return Integer.valueOf(RowColumnImplKt.access$intrinsicSize(measurables, j0Var, k0Var, iIntValue, iIntValue2, layoutOrientation, layoutOrientation));
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    public static final class c extends Lambda implements Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f94346p0 = new c(3);

        @Override // kotlin.jvm.functions.Function3
        public final Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            List<? extends IntrinsicMeasurable> measurables = list;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return Integer.valueOf(RowColumnImplKt.access$intrinsicSize(measurables, l0.f94364p0, m0.f94371p0, iIntValue, iIntValue2, LayoutOrientation.Horizontal, LayoutOrientation.Vertical));
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    public static final class d extends Lambda implements Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f94347p0 = new d(3);

        @Override // kotlin.jvm.functions.Function3
        public final Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            List<? extends IntrinsicMeasurable> measurables = list;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            n0 n0Var = n0.f94378p0;
            o0 o0Var = o0.f94380p0;
            LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
            return Integer.valueOf(RowColumnImplKt.access$intrinsicSize(measurables, n0Var, o0Var, iIntValue, iIntValue2, layoutOrientation, layoutOrientation));
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    public static final class e extends Lambda implements Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f94348p0 = new e(3);

        @Override // kotlin.jvm.functions.Function3
        public final Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            List<? extends IntrinsicMeasurable> measurables = list;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            p0 p0Var = p0.f94384p0;
            q0 q0Var = q0.f94388p0;
            LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
            return Integer.valueOf(RowColumnImplKt.access$intrinsicSize(measurables, p0Var, q0Var, iIntValue, iIntValue2, layoutOrientation, layoutOrientation));
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    public static final class f extends Lambda implements Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f94349p0 = new f(3);

        @Override // kotlin.jvm.functions.Function3
        public final Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            List<? extends IntrinsicMeasurable> measurables = list;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return Integer.valueOf(RowColumnImplKt.access$intrinsicSize(measurables, r0.f94395p0, s0.f94401p0, iIntValue, iIntValue2, LayoutOrientation.Vertical, LayoutOrientation.Horizontal));
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    public static final class g extends Lambda implements Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f94350p0 = new g(3);

        @Override // kotlin.jvm.functions.Function3
        public final Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            List<? extends IntrinsicMeasurable> measurables = list;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            t0 t0Var = t0.f94404p0;
            u0 u0Var = u0.f94406p0;
            LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
            return Integer.valueOf(RowColumnImplKt.access$intrinsicSize(measurables, t0Var, u0Var, iIntValue, iIntValue2, layoutOrientation, layoutOrientation));
        }
    }

    /* JADX INFO: compiled from: RowColumnImpl.kt */
    public static final class h extends Lambda implements Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f94351p0 = new h(3);

        @Override // kotlin.jvm.functions.Function3
        public final Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            List<? extends IntrinsicMeasurable> measurables = list;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return Integer.valueOf(RowColumnImplKt.access$intrinsicSize(measurables, v0.f94462p0, w0.f94465p0, iIntValue, iIntValue2, LayoutOrientation.Vertical, LayoutOrientation.Horizontal));
        }
    }
}
