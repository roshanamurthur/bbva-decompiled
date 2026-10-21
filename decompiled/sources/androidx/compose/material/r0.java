package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends Lambda implements Function1<Density, IntOffset> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ DrawerState f8920p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(DrawerState drawerState) {
        super(1);
        this.f8920p0 = drawerState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final IntOffset invoke(Density density) {
        Density offset = density;
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m4498boximpl(IntOffsetKt.IntOffset(mk.c.roundToInt(this.f8920p0.requireOffset$material_release()), 0));
    }
}
