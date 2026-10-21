package org.bouncycastle.asn1.cmc;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

/* JADX INFO: loaded from: classes12.dex */
public class BodyPartID extends ASN1Object {
    public static final long bodyIdMax = 4294967295L;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f86635p0;

    public BodyPartID(long j10) {
        if (j10 < 0 || j10 > 4294967295L) {
            throw new IllegalArgumentException("id out of range");
        }
        this.f86635p0 = j10;
    }

    public static BodyPartID getInstance(Object obj) {
        if (obj instanceof BodyPartID) {
            return (BodyPartID) obj;
        }
        if (obj == null) {
            return null;
        }
        BigInteger value = ASN1Integer.getInstance(obj).getValue();
        if (value.bitLength() <= 32) {
            return new BodyPartID(value.longValue());
        }
        throw new IllegalArgumentException("id out of range");
    }

    public long getID() {
        return this.f86635p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new ASN1Integer(this.f86635p0);
    }
}
