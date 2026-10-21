package com.bbva.tohu.android.core.exceptions;

import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;

/* JADX INFO: loaded from: classes6.dex */
public class LoginNeededException extends TohuSdkException {
    public LoginNeededException() {
        super("TOHU_LOGIN_NEEDED", 0);
    }

    public LoginNeededException(Exception exc) {
        super("TOHU_LOGIN_NEEDED", 0, exc);
    }

    public LoginNeededException(String str, Exception exc) {
        super(str, 0, exc);
    }
}
