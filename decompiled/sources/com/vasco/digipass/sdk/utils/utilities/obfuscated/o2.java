package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.crypto.params.ECDomainParameters;
import bc.org.bouncycastle.math.ec.ECCurve;
import bc.org.bouncycastle.math.ec.ECPoint;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class o2 extends ECDomainParameters {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p f66241f;

    public o2(p pVar, ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        super(eCCurve, eCPoint, bigInteger, bigInteger2, bArr);
        this.f66241f = pVar;
    }
}
