package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SelectionManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i extends Lambda implements Function1<DpSize, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Density f6479p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MutableState<IntSize> f6480q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Density density, MutableState<IntSize> mutableState) {
        super(1);
        this.f6479p0 = density;
        this.f6480q0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DpSize dpSize) {
        long f18310a = dpSize.getF18310a();
        float fM4487getWidthD9Ej5fM = DpSize.m4487getWidthD9Ej5fM(f18310a);
        Density density = this.f6479p0;
        this.f6480q0.setValue(IntSize.m4541boximpl(IntSizeKt.IntSize(density.mo413roundToPx0680j_4(fM4487getWidthD9Ej5fM), density.mo413roundToPx0680j_4(DpSize.m4485getHeightD9Ej5fM(f18310a)))));
        return Unit.INSTANCE;
    }
}
