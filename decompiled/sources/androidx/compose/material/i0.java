package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends Lambda implements Function1<Density, IntOffset> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ BottomDrawerState f8503p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(BottomDrawerState bottomDrawerState) {
        super(1);
        this.f8503p0 = bottomDrawerState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final IntOffset invoke(Density density) {
        Density offset = density;
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m4498boximpl(IntOffsetKt.IntOffset(0, mk.c.roundToInt(this.f8503p0.requireOffset$material_release())));
    }
}
