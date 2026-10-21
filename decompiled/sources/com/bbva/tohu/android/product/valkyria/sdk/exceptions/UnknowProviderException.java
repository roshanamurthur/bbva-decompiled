package com.bbva.tohu.android.product.valkyria.sdk.exceptions;

import androidx.camera.core.processing.f;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;

/* JADX INFO: loaded from: classes6.dex */
public class UnknowProviderException extends TohuSdkException {
    public UnknowProviderException(Exception exc) {
        super(exc);
    }

    public UnknowProviderException(String str) {
        super(new Exception(f.d("Unknow Provider: ", str)));
    }

    public UnknowProviderException() {
    }
}
