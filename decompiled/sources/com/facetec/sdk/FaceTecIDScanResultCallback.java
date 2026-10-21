package com.facetec.sdk;

/* JADX INFO: loaded from: classes9.dex */
public interface FaceTecIDScanResultCallback {
    void cancel();

    boolean proceedToNextStep(String str);

    void uploadMessageOverride(String str);

    void uploadProgress(float f6);
}
