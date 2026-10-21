package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;

/* JADX INFO: loaded from: classes5.dex */
public class ISO18033KDFParameters implements DerivationParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f89316a;

    public ISO18033KDFParameters(byte[] bArr) {
        this.f89316a = bArr;
    }

    public byte[] getSeed() {
        return this.f89316a;
    }
}
