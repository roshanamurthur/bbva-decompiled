package androidx.camera.camera2.interop;

import android.animation.Animator;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.bbva.glomohybrid.inappupdate.GoogleInAppUpdatesHandler;
import com.google.android.material.animation.AnimatableView;
import com.google.android.play.core.appupdate.AppUpdateManager;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements CallbackToFutureAdapter.Resolver, DoubleFunction, ActivityResultCallback, AnimatableView.Listener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f2032p0;

    public /* synthetic */ c(Object obj) {
        this.f2032p0 = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((Camera2CameraControl) this.f2032p0).lambda$clearCaptureRequestOptions$6(completer);
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d2) {
        Function1 oetf = (Function1) this.f2032p0;
        Rgb.Companion companion = Rgb.INSTANCE;
        Intrinsics.checkNotNullParameter(oetf, "$oetf");
        return ((Number) oetf.invoke(Double.valueOf(d2))).doubleValue();
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        GoogleInAppUpdatesHandler this$0 = (GoogleInAppUpdatesHandler) this.f2032p0;
        ActivityResult result = (ActivityResult) obj;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        int resultCode = result.getResultCode();
        if (this$0.f32189u0) {
            if (resultCode == -1) {
                this$0.v0 = true;
                return;
            }
            AppUpdateManager appUpdateManager = this$0.f32185q0;
            u8.a aVar = this$0.f32187s0;
            if (resultCode != 0) {
                this$0.f32189u0 = false;
                appUpdateManager.unregisterListener(aVar);
            } else {
                this$0.v0 = true;
                this$0.f32189u0 = false;
                appUpdateManager.unregisterListener(aVar);
            }
        }
    }

    @Override // com.google.android.material.animation.AnimatableView.Listener
    public final void onAnimationEnd() {
        ((Animator) this.f2032p0).start();
    }
}
