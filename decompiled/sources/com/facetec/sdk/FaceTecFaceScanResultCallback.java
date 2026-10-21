package com.facetec.sdk;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public interface FaceTecFaceScanResultCallback {
    void cancel();

    boolean proceedToNextStep(@NonNull String str);

    boolean proceedToNextStep(@NonNull String str, FaceTecIDScanNextStep faceTecIDScanNextStep);

    @Deprecated
    void retry();

    @Deprecated
    void succeed();

    @Deprecated
    void succeed(FaceTecIDScanNextStep faceTecIDScanNextStep);

    void uploadMessageOverride(String str);

    void uploadProgress(float f6);
}
