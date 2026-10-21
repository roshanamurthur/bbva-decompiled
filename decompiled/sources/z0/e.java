package z0;

import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;
import com.noknok.android.client.utils.Promise;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements DoubleFunction, Promise.Listener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f94925p0;

    public /* synthetic */ e(Object obj) {
        this.f94925p0 = obj;
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d2) {
        TransferParameters function = (TransferParameters) this.f94925p0;
        Rgb.Companion companion = Rgb.INSTANCE;
        Intrinsics.checkNotNullParameter(function, "$function");
        return ColorSpaceKt.response(d2, function.getA(), function.getB(), function.getC(), function.getD(), function.getE(), function.getF(), function.getGamma());
    }

    @Override // com.noknok.android.client.utils.Promise.Listener
    public final Object onDone(Object obj) {
        return ((Promise) this.f94925p0).a(obj);
    }
}
