package com.nimbusds.jose;

/* JADX INFO: loaded from: classes10.dex */
public interface JWEEncrypter extends JWEProvider {
    JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr) throws JOSEException;
}
