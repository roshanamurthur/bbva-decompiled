package com.noknok.android.client.asm.authenticator;

import android.security.keystore.StrongBoxUnavailableException;
import java.security.ProviderException;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ boolean a(ProviderException providerException) {
        return providerException instanceof StrongBoxUnavailableException;
    }
}
