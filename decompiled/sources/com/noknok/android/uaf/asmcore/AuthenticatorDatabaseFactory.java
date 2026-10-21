package com.noknok.android.uaf.asmcore;

import android.content.Context;
import com.fido.android.framework.tm.core.inf.ICryptoModule;

/* JADX INFO: loaded from: classes11.dex */
public class AuthenticatorDatabaseFactory {
    public static AuthenticatorDatabase createAuthenticatorStore(boolean z10, String str, ICryptoModule iCryptoModule, Context context, AKProcessor aKProcessor) {
        return z10 ? new RoamingAuthenticatorDatabase(aKProcessor) : BoundAuthenticatorDatabase.getInstance(str, iCryptoModule, context);
    }
}
