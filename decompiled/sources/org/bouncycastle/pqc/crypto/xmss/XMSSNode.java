package org.bouncycastle.pqc.crypto.xmss;

import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class XMSSNode implements Serializable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f91373p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f91374q0;

    public XMSSNode(int i10, byte[] bArr) {
        this.f91373p0 = i10;
        this.f91374q0 = bArr;
    }

    public int getHeight() {
        return this.f91373p0;
    }

    public byte[] getValue() {
        return XMSSUtil.cloneArray(this.f91374q0);
    }
}
