package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TextFieldSize.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends Lambda implements Function3<MeasureScope, Measurable, Constraints, MeasureResult> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ e0.k f6137p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(e0.k kVar) {
        super(3);
        this.f6137p0 = kVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        MeasureScope layout = measureScope;
        Measurable measurable2 = measurable;
        long f18296a = constraints.getF18296a();
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Intrinsics.checkNotNullParameter(measurable2, "measurable");
        SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, 0.0f, 3, null);
        long j10 = this.f6137p0.f68244f;
        Placeable placeableMo3575measureBRTryo0 = measurable2.mo3575measureBRTryo0(Constraints.m4349copyZbe2FdA$default(f18296a, kotlin.ranges.c.coerceIn(IntSize.m4549getWidthimpl(j10), Constraints.m4359getMinWidthimpl(f18296a), Constraints.m4357getMaxWidthimpl(f18296a)), 0, kotlin.ranges.c.coerceIn(IntSize.m4548getHeightimpl(j10), Constraints.m4358getMinHeightimpl(f18296a), Constraints.m4356getMaxHeightimpl(f18296a)), 0, 10, null));
        return MeasureScope.CC.q(layout, placeableMo3575measureBRTryo0.getWidth(), placeableMo3575measureBRTryo0.getHeight(), null, new e0(placeableMo3575measureBRTryo0), 4, null);
    }
}
