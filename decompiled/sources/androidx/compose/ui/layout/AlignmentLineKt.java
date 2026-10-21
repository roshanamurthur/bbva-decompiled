package androidx.compose.ui.layout;

import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AlignmentLine.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001c\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\"\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/layout/AlignmentLine;", "", "position1", "position2", "merge", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "a", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "getFirstBaseline", "()Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "FirstBaseline", "b", "getLastBaseline", "LastBaseline", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class AlignmentLineKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final HorizontalAlignmentLine f16517a = new HorizontalAlignmentLine(a.f16519p0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final HorizontalAlignmentLine f16518b = new HorizontalAlignmentLine(b.f16520p0);

    /* JADX INFO: compiled from: AlignmentLine.kt */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function2<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f16519p0 = new a();

        public a() {
            super(2, MathKt.class, "min", "min(II)I", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.min(num.intValue(), num2.intValue()));
        }
    }

    /* JADX INFO: compiled from: AlignmentLine.kt */
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function2<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f16520p0 = new b();

        public b() {
            super(2, MathKt.class, VDVideoSelfieConfiguration.MAX, "max(II)I", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.max(num.intValue(), num2.intValue()));
        }
    }

    @NotNull
    public static final HorizontalAlignmentLine getFirstBaseline() {
        return f16517a;
    }

    @NotNull
    public static final HorizontalAlignmentLine getLastBaseline() {
        return f16518b;
    }

    public static final int merge(@NotNull AlignmentLine alignmentLine, int i10, int i11) {
        Intrinsics.checkNotNullParameter(alignmentLine, "<this>");
        return alignmentLine.getMerger$ui_release().invoke(Integer.valueOf(i10), Integer.valueOf(i11)).intValue();
    }
}
