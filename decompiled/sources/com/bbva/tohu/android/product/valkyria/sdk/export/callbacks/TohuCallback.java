package com.bbva.tohu.android.product.valkyria.sdk.export.callbacks;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TohuCallback extends TohuCallbackErrors {
    public static final String CARD_NOT_ELIGIBLE_RESULT = "cardNotEligibleResult";
    public static final String DEVICE_NOT_ELIGIBLE_RESULT = "deviceNotEligibleResult";
    public static final String IN_PROGRESS_RESULT = "inProgress";
    public static final String OK_RESULT = "ok";
    public static final String RESULT_KEY = "result";

    public abstract void callbackResultSuccess(Bundle bundle);

    @Override // com.bbva.tohu.android.product.valkyria.sdk.export.callbacks.TohuCallbackErrors, android.os.ResultReceiver
    public void onReceiveResult(int i10, Bundle bundle) {
        if (i10 == 4) {
            callbackResultSuccess(bundle);
        } else {
            super.onReceiveResult(i10, bundle);
        }
    }
}
