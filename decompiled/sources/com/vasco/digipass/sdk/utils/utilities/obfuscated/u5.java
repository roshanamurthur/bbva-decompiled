package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.math.ec.ECCurve;
import bc.org.bouncycastle.math.ec.ECPoint;
import bc.org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class u5 extends o {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final q f66396p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private ECCurve f66397q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private ECPoint f66398r0;

    public u5(ECPoint eCPoint) {
        this(eCPoint, false);
    }

    public synchronized ECPoint c() {
        try {
            if (this.f66398r0 == null) {
                this.f66398r0 = this.f66397q0.decodePoint(this.f66396p0.g()).normalize();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f66398r0;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.o, com.vasco.digipass.sdk.utils.utilities.obfuscated.g
    public u toASN1Primitive() {
        return this.f66396p0;
    }

    public u5(ECPoint eCPoint, boolean z10) {
        this.f66398r0 = eCPoint.normalize();
        this.f66396p0 = new e1(eCPoint.getEncoded(z10));
    }

    public u5(ECCurve eCCurve, byte[] bArr) {
        this.f66397q0 = eCCurve;
        this.f66396p0 = new e1(Arrays.clone(bArr));
    }

    public u5(ECCurve eCCurve, q qVar) {
        this(eCCurve, qVar.g());
    }
}
