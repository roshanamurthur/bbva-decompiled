package com.facetec.sdk;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.adobe.marketing.mobile.EventDataKeys;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes9.dex */
final class bc implements FaceTecFaceScanResultCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference<be> f40493c;

    public bc(be beVar) {
        this.f40493c = new WeakReference<>(beVar);
    }

    private be d(boolean z10) {
        be beVar = this.f40493c.get();
        if (z10) {
            this.f40493c.clear();
        }
        return beVar;
    }

    @Override // com.facetec.sdk.FaceTecFaceScanResultCallback
    public final void cancel() throws Throwable {
        FaceTecSDK.f40112j++;
        be beVarD = d(true);
        if (ay.d((Activity) beVarD)) {
            beVarD.f40520q = true;
            t.c(beVarD, e.DEVELOPER_USED_FACESCAN_CALLBACK, EventDataKeys.DEEPLINK_SCHEME_PATH_CANCEL);
            beVarD.a(beVarD.f40519p.getStatus());
        }
    }

    @Override // com.facetec.sdk.FaceTecFaceScanResultCallback
    public final boolean proceedToNextStep(@NonNull String str) {
        return proceedToNextStep(str, FaceTecIDScanNextStep.SELECTION_SCREEN);
    }

    @Override // com.facetec.sdk.FaceTecFaceScanResultCallback
    public final void retry() throws Throwable {
        FaceTecSDK.f40111h++;
        be beVarD = d(true);
        if (ay.d((Activity) beVarD)) {
            beVarD.z();
        }
    }

    @Override // com.facetec.sdk.FaceTecFaceScanResultCallback
    public final void succeed() throws Throwable {
        succeed(FaceTecIDScanNextStep.SELECTION_SCREEN);
    }

    @Override // com.facetec.sdk.FaceTecFaceScanResultCallback
    public final void uploadMessageOverride(String str) {
        be beVarD = d(false);
        if (ay.d((Activity) beVarD)) {
            beVarD.c(str);
        }
    }

    @Override // com.facetec.sdk.FaceTecFaceScanResultCallback
    public final void uploadProgress(float f6) {
        be beVarD = d(false);
        if (ay.d((Activity) beVarD)) {
            beVarD.c(f6);
        }
    }

    @Override // com.facetec.sdk.FaceTecFaceScanResultCallback
    public final boolean proceedToNextStep(@NonNull String str, FaceTecIDScanNextStep faceTecIDScanNextStep) {
        be beVarD = d(true);
        if (ay.d((Activity) beVarD)) {
            return beVarD.a(str, faceTecIDScanNextStep);
        }
        return false;
    }

    @Override // com.facetec.sdk.FaceTecFaceScanResultCallback
    public final void succeed(FaceTecIDScanNextStep faceTecIDScanNextStep) throws Throwable {
        FaceTecSDK.f40110e++;
        be beVarD = d(true);
        if (ay.d((Activity) beVarD)) {
            beVarD.d(faceTecIDScanNextStep);
        }
    }
}
