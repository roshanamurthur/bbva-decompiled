package com.noknok.android.client.asm.core;

import com.noknok.android.client.asm.sdk.IAKDigestMethod;
import com.noknok.android.client.utils.CryptoProviderHelper;
import com.noknok.android.client.utils.Logger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

/* JADX INFO: loaded from: classes11.dex */
public class AKDigestMethod implements IAKDigestMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MessageDigest f63225a;

    public AKDigestMethod() {
        try {
            this.f63225a = CryptoProviderHelper.getMessageDigestInstance("SHA-256");
        } catch (NoSuchAlgorithmException | NoSuchProviderException e5) {
            Logger.e("AKDigestMethod", "Failed to getting digest algorithm for AK", e5);
        }
    }

    @Override // com.noknok.android.client.asm.sdk.IAKDigestMethod
    public byte[] digest() {
        return this.f63225a.digest();
    }

    @Override // com.noknok.android.client.asm.sdk.IAKDigestMethod
    public String getAlgorithm() {
        return "SHA-256";
    }

    @Override // com.noknok.android.client.asm.sdk.IAKDigestMethod
    public void update(byte[] bArr) {
        this.f63225a.update(bArr);
    }

    @Override // com.noknok.android.client.asm.sdk.IAKDigestMethod
    public byte[] digest(byte[] bArr) {
        return this.f63225a.digest(bArr);
    }
}
