package com.google.crypto.tink.prf;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public interface Prf {
    byte[] compute(byte[] bArr, int i10) throws GeneralSecurityException;
}
