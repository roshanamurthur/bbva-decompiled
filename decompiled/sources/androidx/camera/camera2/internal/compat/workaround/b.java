package androidx.camera.camera2.internal.compat.workaround;

import android.os.Bundle;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.fragment.app.FragmentResultListener;
import com.bbva.glomohybrid.infoscreen.networkerror.NetworkErrorFragment;
import com.bbva.glomohybrid.splash.presentation.view.SplashActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements CallbackToFutureAdapter.Resolver, FragmentResultListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f1878p0;

    public /* synthetic */ b(Object obj) {
        this.f1878p0 = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((WaitForRepeatingRequestStart) this.f1878p0).lambda$new$0(completer);
    }

    @Override // androidx.fragment.app.FragmentResultListener
    public final void onFragmentResult(String str, Bundle bundle) {
        SplashActivity this$0 = (SplashActivity) this.f1878p0;
        SplashActivity.Companion companion = SplashActivity.Companion;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (bundle.getBoolean(NetworkErrorFragment.IS_SUCCESS)) {
            this$0.k();
        }
    }
}
