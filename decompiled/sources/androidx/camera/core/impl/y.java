package androidx.camera.core.impl;

import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.dasnano.vdvideoselfiecapture.fragments.VideoFragment;
import com.veridas.camera.CameraAction;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements CallbackToFutureAdapter.Resolver, DoubleFunction, CameraAction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f2145p0;

    public /* synthetic */ y(Object obj) {
        this.f2145p0 = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((LiveDataObservable) this.f2145p0).lambda$fetchData$1(completer);
    }

    @Override // com.veridas.camera.CameraAction
    public final void execute(boolean z10) {
        VideoFragment videoFragment = VideoFragment.this;
        String str = VideoFragment.VIDEO_FRAGMENT_VIDEO_CAPTURED;
        videoFragment.B();
        String str2 = videoFragment.f39751m2;
        String str3 = videoFragment.f39753n2;
        VDLogger.log(Logger.Tag.ERROR_TIMEOUT, "User has reached max time available");
        videoFragment.runOnUiThread(new com.dasnano.vdvideoselfiecapture.fragments.d(videoFragment, str3, str2));
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d2) {
        Function1 eotf = (Function1) this.f2145p0;
        Rgb.Companion companion = Rgb.INSTANCE;
        Intrinsics.checkNotNullParameter(eotf, "$eotf");
        return ((Number) eotf.invoke(Double.valueOf(d2))).doubleValue();
    }
}
