package org.bouncycastle.asn1.x9;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class X9ECPoint extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final DEROctetString f87842p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ECCurve f87843q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ECPoint f87844r0;

    public X9ECPoint(ECCurve eCCurve, ASN1OctetString aSN1OctetString) {
        this(eCCurve, aSN1OctetString.getOctets());
    }

    public synchronized ECPoint getPoint() {
        try {
            if (this.f87844r0 == null) {
                this.f87844r0 = this.f87843q0.decodePoint(this.f87842p0.getOctets()).normalize();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f87844r0;
    }

    public byte[] getPointEncoding() {
        return Arrays.clone(this.f87842p0.getOctets());
    }

    public boolean isPointCompressed() {
        byte[] octets = this.f87842p0.getOctets();
        if (octets == null || octets.length <= 0) {
            return false;
        }
        byte b10 = octets[0];
        return b10 == 2 || b10 == 3;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87842p0;
    }

    public X9ECPoint(ECCurve eCCurve, byte[] bArr) {
        this.f87843q0 = eCCurve;
        this.f87842p0 = new DEROctetString(Arrays.clone(bArr));
    }

    public X9ECPoint(ECPoint eCPoint, boolean z10) {
        this.f87844r0 = eCPoint.normalize();
        this.f87842p0 = new DEROctetString(eCPoint.getEncoded(z10));
    }
}
