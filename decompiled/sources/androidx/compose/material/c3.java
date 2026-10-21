package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c3 extends Lambda implements Function1<Size, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ float f8406p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Size> f8407q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(MutableState mutableState, float f6) {
        super(1);
        this.f8406p0 = f6;
        this.f8407q0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Size size) {
        long f15551a = size.getF15551a();
        float fM2344getWidthimpl = Size.m2344getWidthimpl(f15551a);
        float f6 = this.f8406p0;
        float f10 = fM2344getWidthimpl * f6;
        float fM2341getHeightimpl = Size.m2341getHeightimpl(f15551a) * f6;
        MutableState<Size> mutableState = this.f8407q0;
        if (Size.m2344getWidthimpl(mutableState.getValue().getF15551a()) != f10 || Size.m2341getHeightimpl(mutableState.getValue().getF15551a()) != fM2341getHeightimpl) {
            mutableState.setValue(Size.m2332boximpl(SizeKt.Size(f10, fM2341getHeightimpl)));
        }
        return Unit.INSTANCE;
    }
}
