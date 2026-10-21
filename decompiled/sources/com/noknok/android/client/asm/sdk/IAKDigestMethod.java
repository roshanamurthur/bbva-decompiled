package com.noknok.android.client.asm.sdk;

/* JADX INFO: loaded from: classes11.dex */
public interface IAKDigestMethod {
    byte[] digest();

    byte[] digest(byte[] bArr);

    String getAlgorithm();

    void update(byte[] bArr);
}
