package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import g1.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MeasurePolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bç\u0080\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\"\u0010\t\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\u0003H\u0016J/\u0010\u000b\u001a\u00020\f*\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u000f\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0013\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\"\u0010\u0014\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\u0003H\u0016ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/MeasurePolicy;", "", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurePolicy.kt\nandroidx/compose/ui/layout/MeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,163:1\n151#2,3:164\n33#2,4:167\n154#2,2:171\n38#2:173\n156#2:174\n151#2,3:175\n33#2,4:178\n154#2,2:182\n38#2:184\n156#2:185\n151#2,3:186\n33#2,4:189\n154#2,2:193\n38#2:195\n156#2:196\n151#2,3:197\n33#2,4:200\n154#2,2:204\n38#2:206\n156#2:207\n*S KotlinDebug\n*F\n+ 1 MeasurePolicy.kt\nandroidx/compose/ui/layout/MeasurePolicy\n*L\n102#1:164,3\n102#1:167,4\n102#1:171,2\n102#1:173\n102#1:174\n120#1:175,3\n120#1:178,4\n120#1:182,2\n120#1:184\n120#1:185\n137#1:186,3\n137#1:189,4\n137#1:193,2\n137#1:195\n137#1:196\n154#1:197,3\n154#1:200,4\n154#1:204,2\n154#1:206\n154#1:207\n*E\n"})
public interface MeasurePolicy {

    /* JADX INFO: compiled from: MeasurePolicy.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static int maxIntrinsicHeight(@NotNull MeasurePolicy measurePolicy, @NotNull IntrinsicMeasureScope receiver, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return f.a(measurePolicy, receiver, measurables, i10);
        }

        @Deprecated
        public static int maxIntrinsicWidth(@NotNull MeasurePolicy measurePolicy, @NotNull IntrinsicMeasureScope receiver, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return f.b(measurePolicy, receiver, measurables, i10);
        }

        @Deprecated
        public static int minIntrinsicHeight(@NotNull MeasurePolicy measurePolicy, @NotNull IntrinsicMeasureScope receiver, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return f.c(measurePolicy, receiver, measurables, i10);
        }

        @Deprecated
        public static int minIntrinsicWidth(@NotNull MeasurePolicy measurePolicy, @NotNull IntrinsicMeasureScope receiver, @NotNull List<? extends IntrinsicMeasurable> measurables, int i10) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return f.d(measurePolicy, receiver, measurables, i10);
        }
    }

    int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i10);

    int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i10);

    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    MeasureResult mo113measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j10);

    int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i10);

    int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i10);
}
