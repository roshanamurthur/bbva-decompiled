package androidx.camera.camera2.interop;

import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.dasnano.vddocumentcapture.managers.CameraManagerBase;
import com.veridas.camera.CameraAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements CallbackToFutureAdapter.Resolver, DoubleFunction, CameraAction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f2035p0;

    public /* synthetic */ f(Object obj) {
        this.f2035p0 = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((Camera2CameraControl) this.f2035p0).lambda$setCaptureRequestOptions$2(completer);
    }

    @Override // com.veridas.camera.CameraAction
    public final void execute(boolean z10) {
        CameraManagerBase.a((CameraManagerBase) this.f2035p0);
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d2) {
        Rgb this$0 = (Rgb) this.f2035p0;
        Rgb.Companion companion = Rgb.INSTANCE;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.eotfOrig.invoke(kotlin.ranges.c.coerceIn(d2, this$0.f15825e, this$0.f15826f));
    }
}
