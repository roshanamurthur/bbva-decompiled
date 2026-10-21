package androidx.compose.animation;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Lambda implements Function3<MeasureScope, Measurable, Constraints, MeasureResult> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ContentTransform f2826p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ContentTransform contentTransform) {
        super(3);
        this.f2826p0 = contentTransform;
    }

    @Override // kotlin.jvm.functions.Function3
    public final MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        MeasureScope layout = measureScope;
        Measurable measurable2 = measurable;
        long f18296a = constraints.getF18296a();
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Intrinsics.checkNotNullParameter(measurable2, "measurable");
        Placeable placeableMo3575measureBRTryo0 = measurable2.mo3575measureBRTryo0(f18296a);
        return MeasureScope.CC.q(layout, placeableMo3575measureBRTryo0.getWidth(), placeableMo3575measureBRTryo0.getHeight(), null, new a(placeableMo3575measureBRTryo0, this.f2826p0), 4, null);
    }
}
