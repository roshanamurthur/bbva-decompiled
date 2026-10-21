package com.google.crypto.tink.config;

import com.google.crypto.tink.Registry;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
public final class TinkFips {
    public static void restrictToFips() throws GeneralSecurityException {
        Registry.restrictToFipsIfEmpty();
    }

    public static boolean useOnlyFips() {
        return TinkFipsUtil.useOnlyFips();
    }
}
