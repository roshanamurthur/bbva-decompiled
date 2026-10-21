package com.mastercard.mpsdk.mcbp.mcmlite.crypto;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
public interface McmLiteCrypto {

    public static class TransactionCryptograms {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f50807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f50808b;

        public TransactionCryptograms(byte[] bArr, byte[] bArr2) {
            this.f50807a = bArr;
            this.f50808b = bArr2;
        }

        public byte[] getMdCryptogram() {
            return this.f50808b;
        }

        public byte[] getUmdCryptogram() {
            return this.f50807a;
        }
    }

    TransactionCryptograms buildComputeCcCryptograms(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException;

    TransactionCryptograms buildGenerateAcCryptograms(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException;

    int initRsaPrivateKey(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) throws GeneralSecurityException;

    byte[] rsa(byte[] bArr) throws GeneralSecurityException;
}
