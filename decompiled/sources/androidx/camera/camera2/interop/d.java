package androidx.camera.camera2.interop;

import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.dasnano.vddocumentcapture.managers.CameraManagerBase;
import com.veridas.camera.CameraAction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements CallbackToFutureAdapter.Resolver, DoubleFunction, CameraAction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f2033p0;

    public /* synthetic */ d(Object obj) {
        this.f2033p0 = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((Camera2CameraControl) this.f2033p0).lambda$addCaptureRequestOptions$4(completer);
    }

    @Override // com.veridas.camera.CameraAction
    public final void execute(boolean z10) {
        CameraManagerBase.f((CameraManagerBase) this.f2033p0);
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d2) {
        Function1 eotf = (Function1) this.f2033p0;
        Rgb.Companion companion = Rgb.INSTANCE;
        Intrinsics.checkNotNullParameter(eotf, "$eotf");
        return ((Number) eotf.invoke(Double.valueOf(d2))).doubleValue();
    }
}
