package org.bouncycastle.pqc.crypto.qtesla;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public final class QTESLAPrivateKeyParameters extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f91208q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f91209r0;

    public QTESLAPrivateKeyParameters(int i10, byte[] bArr) {
        super(true);
        if (bArr.length != QTESLASecurityCategory.a(i10)) {
            throw new IllegalArgumentException("invalid key size for security category");
        }
        this.f91208q0 = i10;
        this.f91209r0 = Arrays.clone(bArr);
    }

    public byte[] getSecret() {
        return Arrays.clone(this.f91209r0);
    }

    public int getSecurityCategory() {
        return this.f91208q0;
    }
}
