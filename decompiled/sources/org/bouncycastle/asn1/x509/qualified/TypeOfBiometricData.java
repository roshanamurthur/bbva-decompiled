package org.bouncycastle.asn1.x509.qualified;

import androidx.appcompat.widget.g0;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;

/* JADX INFO: loaded from: classes12.dex */
public class TypeOfBiometricData extends ASN1Object implements ASN1Choice {
    public static final int HANDWRITTEN_SIGNATURE = 1;
    public static final int PICTURE = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Primitive f87798p0;

    public TypeOfBiometricData(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(g0.c("unknow PredefinedBiometricType : ", i10));
        }
        this.f87798p0 = new ASN1Integer(i10);
    }

    public static TypeOfBiometricData getInstance(Object obj) {
        if (obj == null || (obj instanceof TypeOfBiometricData)) {
            return (TypeOfBiometricData) obj;
        }
        if (obj instanceof ASN1Integer) {
            return new TypeOfBiometricData(ASN1Integer.getInstance(obj).intValueExact());
        }
        if (obj instanceof ASN1ObjectIdentifier) {
            return new TypeOfBiometricData(ASN1ObjectIdentifier.getInstance(obj));
        }
        throw new IllegalArgumentException("unknown object in getInstance");
    }

    public ASN1ObjectIdentifier getBiometricDataOid() {
        return (ASN1ObjectIdentifier) this.f87798p0;
    }

    public int getPredefinedBiometricType() {
        return ((ASN1Integer) this.f87798p0).intValueExact();
    }

    public boolean isPredefined() {
        return this.f87798p0 instanceof ASN1Integer;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87798p0.toASN1Primitive();
    }

    public TypeOfBiometricData(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f87798p0 = aSN1ObjectIdentifier;
    }
}
