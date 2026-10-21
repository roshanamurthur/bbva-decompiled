package org.bouncycastle.pqc.crypto.sphincs;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class SPHINCSPublicKeyParameters extends SPHINCSKeyParameters {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f91263r0;

    public SPHINCSPublicKeyParameters(byte[] bArr) {
        super(false, null);
        this.f91263r0 = Arrays.clone(bArr);
    }

    public byte[] getKeyData() {
        return Arrays.clone(this.f91263r0);
    }

    public SPHINCSPublicKeyParameters(byte[] bArr, String str) {
        super(false, str);
        this.f91263r0 = Arrays.clone(bArr);
    }
}
