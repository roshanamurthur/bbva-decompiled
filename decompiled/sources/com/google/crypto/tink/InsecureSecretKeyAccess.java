package com.google.crypto.tink;

import com.google.crypto.tink.annotations.Alpha;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.Immutable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
@CheckReturnValue
@Alpha
public final class InsecureSecretKeyAccess {
    public static SecretKeyAccess get() {
        return SecretKeyAccess.f46459a;
    }
}
