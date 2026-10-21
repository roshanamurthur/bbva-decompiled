package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LookaheadScope.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c {

    /* JADX INFO: compiled from: LookaheadScope.kt */
    public static final class a extends Lambda implements Function3<IntermediateMeasureScope, Measurable, Constraints, MeasureResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function4<MeasureScope, Measurable, Constraints, IntSize, MeasureResult> f16709p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function4<? super MeasureScope, ? super Measurable, ? super Constraints, ? super IntSize, ? extends MeasureResult> function4) {
            super(3);
            this.f16709p0 = function4;
        }

        @Override // kotlin.jvm.functions.Function3
        public final MeasureResult invoke(IntermediateMeasureScope intermediateMeasureScope, Measurable measurable, Constraints constraints) {
            IntermediateMeasureScope intermediateLayout = intermediateMeasureScope;
            Measurable measurable2 = measurable;
            long f18296a = constraints.getF18296a();
            Intrinsics.checkNotNullParameter(intermediateLayout, "$this$intermediateLayout");
            Intrinsics.checkNotNullParameter(measurable2, "measurable");
            return this.f16709p0.invoke(intermediateLayout, measurable2, Constraints.m4346boximpl(f18296a), IntSize.m4541boximpl(intermediateLayout.mo3577getLookaheadSizeYbymL2g()));
        }
    }

    @Deprecated(message = "", replaceWith = @ReplaceWith(expression = "intermediateLayout { measurable, constraints ->measure.invoke(this, measurable, constraints, lookaheadSize)}", imports = {}))
    @NotNull
    public static Modifier a(LookaheadScope lookaheadScope, @NotNull Modifier modifier, @NotNull Function4 measure) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(measure, "measure");
        return LookaheadScopeKt.intermediateLayout(modifier, new a(measure));
    }

    public static long b(LookaheadScope lookaheadScope, @NotNull LayoutCoordinates localLookaheadPositionOf, @NotNull LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(localLookaheadPositionOf, "$this$localLookaheadPositionOf");
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        return lookaheadScope.toLookaheadCoordinates(localLookaheadPositionOf).mo3582localPositionOfR5De75A(lookaheadScope.toLookaheadCoordinates(coordinates), Offset.INSTANCE.m2291getZeroF1C5BW0());
    }
}
