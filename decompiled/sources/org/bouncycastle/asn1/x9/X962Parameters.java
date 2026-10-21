package org.bouncycastle.asn1.x9;

import ci.a;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class X962Parameters extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Primitive f87831p0;

    public X962Parameters(ASN1Null aSN1Null) {
        this.f87831p0 = aSN1Null;
    }

    public static X962Parameters getInstance(Object obj) {
        if (obj == null || (obj instanceof X962Parameters)) {
            return (X962Parameters) obj;
        }
        if (obj instanceof ASN1Primitive) {
            return new X962Parameters((ASN1Primitive) obj);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance()");
        }
        try {
            return new X962Parameters(ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (Exception e5) {
            throw new IllegalArgumentException(a.b(e5, new StringBuilder("unable to parse encoded data: ")));
        }
    }

    public ASN1Primitive getParameters() {
        return this.f87831p0;
    }

    public boolean isImplicitlyCA() {
        return this.f87831p0 instanceof ASN1Null;
    }

    public boolean isNamedCurve() {
        return this.f87831p0 instanceof ASN1ObjectIdentifier;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87831p0;
    }

    public X962Parameters(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f87831p0 = aSN1ObjectIdentifier;
    }

    public X962Parameters(ASN1Primitive aSN1Primitive) {
        this.f87831p0 = aSN1Primitive;
    }

    public X962Parameters(X9ECParameters x9ECParameters) {
        this.f87831p0 = null;
        this.f87831p0 = x9ECParameters.toASN1Primitive();
    }

    public static X962Parameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(aSN1TaggedObject.getObject());
    }
}
