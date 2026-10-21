package x;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: FlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends Lambda implements Function3<IntrinsicMeasurable, Integer, Integer, Integer> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int[] f94313p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(int[] iArr) {
        super(3);
        this.f94313p0 = iArr;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
        IntrinsicMeasurable intrinsicCrossAxisSize = intrinsicMeasurable;
        int iIntValue = num.intValue();
        num2.intValue();
        Intrinsics.checkNotNullParameter(intrinsicCrossAxisSize, "$this$intrinsicCrossAxisSize");
        return Integer.valueOf(this.f94313p0[iIntValue]);
    }
}
