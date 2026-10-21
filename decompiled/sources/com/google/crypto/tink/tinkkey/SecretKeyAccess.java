package com.google.crypto.tink.tinkkey;

import com.google.errorprone.annotations.Immutable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
@Deprecated
public final class SecretKeyAccess {
    public static KeyAccess insecureSecretAccess() {
        return new KeyAccess(true);
    }
}
