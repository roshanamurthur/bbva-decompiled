package org.bouncycastle.pqc.crypto.sphincs;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class SPHINCSPrivateKeyParameters extends SPHINCSKeyParameters {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f91262r0;

    public SPHINCSPrivateKeyParameters(byte[] bArr) {
        super(true, null);
        this.f91262r0 = Arrays.clone(bArr);
    }

    public byte[] getKeyData() {
        return Arrays.clone(this.f91262r0);
    }

    public SPHINCSPrivateKeyParameters(byte[] bArr, String str) {
        super(true, str);
        this.f91262r0 = Arrays.clone(bArr);
    }
}
