package org.bouncycastle.pqc.crypto.newhope;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class NHPublicKeyParameters extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f91199q0;

    public NHPublicKeyParameters(byte[] bArr) {
        super(false);
        this.f91199q0 = Arrays.clone(bArr);
    }

    public byte[] getPubData() {
        return Arrays.clone(this.f91199q0);
    }
}
