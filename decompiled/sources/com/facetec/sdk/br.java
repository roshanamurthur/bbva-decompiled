package com.facetec.sdk;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes9.dex */
final class br implements FaceTecIDScanResultCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<be> f40700b;

    public br(be beVar) {
        this.f40700b = new WeakReference<>(beVar);
    }

    @Override // com.facetec.sdk.FaceTecIDScanResultCallback
    public final void cancel() throws Throwable {
        be beVar = this.f40700b.get();
        if (ay.d((Activity) beVar)) {
            this.f40700b.clear();
            beVar.f40520q = true;
            beVar.A();
        }
    }

    @Override // com.facetec.sdk.FaceTecIDScanResultCallback
    public final boolean proceedToNextStep(String str) {
        be beVar = this.f40700b.get();
        if (ay.d((Activity) beVar)) {
            return beVar.e(str);
        }
        return false;
    }

    @Override // com.facetec.sdk.FaceTecIDScanResultCallback
    public final void uploadMessageOverride(String str) {
        be beVar = this.f40700b.get();
        if (ay.d((Activity) beVar)) {
            beVar.c(str);
        }
    }

    @Override // com.facetec.sdk.FaceTecIDScanResultCallback
    public final void uploadProgress(float f6) {
        be beVar = this.f40700b.get();
        if (ay.d((Activity) beVar)) {
            beVar.c(f6);
        }
    }
}
