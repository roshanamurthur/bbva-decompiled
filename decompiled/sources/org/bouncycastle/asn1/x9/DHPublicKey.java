package org.bouncycastle.asn1.x9;

import androidx.emoji2.text.flatbuffer.a;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class DHPublicKey extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f87813p0;

    public DHPublicKey(BigInteger bigInteger) {
        if (bigInteger == null) {
            throw new IllegalArgumentException("'y' cannot be null");
        }
        this.f87813p0 = new ASN1Integer(bigInteger);
    }

    public static DHPublicKey getInstance(Object obj) {
        if (obj == null || (obj instanceof DHPublicKey)) {
            return (DHPublicKey) obj;
        }
        if (!(obj instanceof ASN1Integer)) {
            throw new IllegalArgumentException(a.c(obj, "Invalid DHPublicKey: "));
        }
        DHPublicKey dHPublicKey = new DHPublicKey();
        dHPublicKey.f87813p0 = (ASN1Integer) obj;
        return dHPublicKey;
    }

    public BigInteger getY() {
        return this.f87813p0.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87813p0;
    }

    public static DHPublicKey getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Integer.getInstance(aSN1TaggedObject, z10));
    }
}
