package x;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends Lambda implements Function2<IntrinsicMeasurable, Integer, Integer> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final r0 f94395p0 = new r0(2);

    @Override // kotlin.jvm.functions.Function2
    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
        IntrinsicMeasurable intrinsicSize = intrinsicMeasurable;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(intrinsicSize, "$this$intrinsicSize");
        return Integer.valueOf(intrinsicSize.maxIntrinsicWidth(iIntValue));
    }
}
