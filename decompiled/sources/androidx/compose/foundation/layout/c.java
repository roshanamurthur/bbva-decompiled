package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: FlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Lambda implements Function5<Integer, int[], LayoutDirection, Density, int[], Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Arrangement.Vertical f4487p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Arrangement.Vertical vertical) {
        super(5);
        this.f4487p0 = vertical;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Unit invoke(Integer num, int[] iArr, LayoutDirection layoutDirection, Density density, int[] iArr2) {
        int iIntValue = num.intValue();
        int[] size = iArr;
        Density density2 = density;
        int[] outPosition = iArr2;
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 2>");
        Intrinsics.checkNotNullParameter(density2, "density");
        Intrinsics.checkNotNullParameter(outPosition, "outPosition");
        this.f4487p0.arrange(density2, iIntValue, size, outPosition);
        return Unit.INSTANCE;
    }
}
