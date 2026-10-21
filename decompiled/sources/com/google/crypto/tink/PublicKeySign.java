package com.google.crypto.tink;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
public interface PublicKeySign {
    byte[] sign(byte[] bArr) throws GeneralSecurityException;
}
