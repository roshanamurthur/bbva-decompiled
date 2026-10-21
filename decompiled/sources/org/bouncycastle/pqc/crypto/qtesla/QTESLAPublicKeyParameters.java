package org.bouncycastle.pqc.crypto.qtesla;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public final class QTESLAPublicKeyParameters extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f91210q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f91211r0;

    public QTESLAPublicKeyParameters(int i10, byte[] bArr) {
        super(false);
        if (bArr.length != QTESLASecurityCategory.b(i10)) {
            throw new IllegalArgumentException("invalid key size for security category");
        }
        this.f91210q0 = i10;
        this.f91211r0 = Arrays.clone(bArr);
    }

    public byte[] getPublicData() {
        return Arrays.clone(this.f91211r0);
    }

    public int getSecurityCategory() {
        return this.f91210q0;
    }
}
