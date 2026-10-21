package x;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: FlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class x extends Lambda implements Function3<IntrinsicMeasurable, Integer, Integer, Integer> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final x f94471p0 = new x(3);

    @Override // kotlin.jvm.functions.Function3
    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
        IntrinsicMeasurable intrinsicMeasurable2 = intrinsicMeasurable;
        num.intValue();
        int iIntValue = num2.intValue();
        Intrinsics.checkNotNullParameter(intrinsicMeasurable2, "$this$null");
        return Integer.valueOf(intrinsicMeasurable2.minIntrinsicHeight(iIntValue));
    }
}
