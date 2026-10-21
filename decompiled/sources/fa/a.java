package fa;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.FragmentResultListener;
import com.bbva.component.root.checker.RootCheckerComponent;
import com.bbva.glomohybrid.infoscreen.root.RootFragment;
import com.bbva.glomohybrid.splash.presentation.view.SplashActivity;
import com.bbva.glomohybrid.splash.presentation.viewmodel.SplashGlobalViewModel;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.GmsRpc;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.k;
import com.veridas.camera.CameraAction;
import com.veridas.camera.one.CameraOneCamera;
import com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.PinPadSdk;
import com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.ResponseData;
import com.viergegroup.sdk.taptophone.vierge.models.BackendViergeResponseData;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements FragmentResultListener, Continuation, CameraAction, ResponseData {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f68394p0;

    public /* synthetic */ a(Object obj) {
        this.f68394p0 = obj;
    }

    @Override // com.veridas.camera.CameraAction
    public final void execute(boolean z10) {
        CameraOneCamera.this.fireOnPreviewStopped();
    }

    @Override // androidx.fragment.app.FragmentResultListener
    public final void onFragmentResult(String str, Bundle bundle) {
        SplashActivity this$0 = (SplashActivity) this.f68394p0;
        SplashActivity.Companion companion = SplashActivity.INSTANCE;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (bundle.getBoolean(RootFragment.SHOULD_CONTINUE)) {
            SplashGlobalViewModel.markAsPerformed$default(this$0.i(), RootCheckerComponent.ACTION_ROOTED, null, 2, null);
        }
    }

    @Override // com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.ResponseData
    public final void responseInitilizeTerminal(BackendViergeResponseData backendViergeResponseData) {
        ((PinPadSdk) this.f68394p0).lambda$executeCommandI51$0(backendViergeResponseData);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) throws IOException {
        ((k) this.f68394p0).getClass();
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle == null) {
            throw new IOException(GmsRpc.ERROR_SERVICE_NOT_AVAILABLE);
        }
        String string = bundle.getString("registration_id");
        if (string != null || (string = bundle.getString("unregistered")) != null) {
            return string;
        }
        String string2 = bundle.getString("error");
        if ("RST".equals(string2)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string2 != null) {
            throw new IOException(string2);
        }
        Log.w(Constants.TAG, "Unexpected response: " + bundle, new Throwable());
        throw new IOException(GmsRpc.ERROR_SERVICE_NOT_AVAILABLE);
    }
}
