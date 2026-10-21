package com.bbva.tohu.android.product.valkyria.sdk.export.callbacks;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TohuCallbackRegister extends TohuCallbackWithAsoAuthentication {
    @Override // com.bbva.tohu.android.product.valkyria.sdk.export.callbacks.TohuCallbackWithAsoAuthentication, com.bbva.tohu.android.product.valkyria.sdk.export.callbacks.TohuCallback, com.bbva.tohu.android.product.valkyria.sdk.export.callbacks.TohuCallbackErrors, android.os.ResultReceiver
    public void onReceiveResult(int i10, Bundle bundle) {
        if (i10 == 6) {
            writePermissionNeeded(bundle);
            return;
        }
        if (i10 == 7) {
            wrongFingerprint(bundle);
        } else if (i10 == 8) {
            registerNeeded(bundle);
        } else {
            super.onReceiveResult(i10, bundle);
        }
    }

    public abstract void registerNeeded(Bundle bundle);

    public abstract void writePermissionNeeded(Bundle bundle);

    public abstract void wrongFingerprint(Bundle bundle);
}
