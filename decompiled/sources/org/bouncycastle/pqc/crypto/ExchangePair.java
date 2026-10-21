package org.bouncycastle.pqc.crypto;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class ExchangePair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsymmetricKeyParameter f90961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f90962b;

    public ExchangePair(AsymmetricKeyParameter asymmetricKeyParameter, byte[] bArr) {
        this.f90961a = asymmetricKeyParameter;
        this.f90962b = Arrays.clone(bArr);
    }

    public AsymmetricKeyParameter getPublicKey() {
        return this.f90961a;
    }

    public byte[] getSharedValue() {
        return Arrays.clone(this.f90962b);
    }
}
