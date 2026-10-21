package org.bouncycastle.asn1.est;

import androidx.emoji2.text.flatbuffer.a;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.pkcs.Attribute;

/* JADX INFO: loaded from: classes12.dex */
public class AttrOrOID extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1ObjectIdentifier f87257p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Attribute f87258q0;

    public AttrOrOID(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f87257p0 = aSN1ObjectIdentifier;
        this.f87258q0 = null;
    }

    public static AttrOrOID getInstance(Object obj) {
        if (obj instanceof AttrOrOID) {
            return (AttrOrOID) obj;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1ObjectIdentifier) {
                return new AttrOrOID(ASN1ObjectIdentifier.getInstance(aSN1Primitive));
            }
            if (aSN1Primitive instanceof ASN1Sequence) {
                return new AttrOrOID(Attribute.getInstance(aSN1Primitive));
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(a.c(obj, "unknown object in getInstance(): "));
        }
        try {
            return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (IOException unused) {
            throw new IllegalArgumentException("unknown encoding in getInstance()");
        }
    }

    public Attribute getAttribute() {
        return this.f87258q0;
    }

    public ASN1ObjectIdentifier getOid() {
        return this.f87257p0;
    }

    public boolean isOid() {
        return this.f87257p0 != null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.f87257p0;
        return aSN1ObjectIdentifier != null ? aSN1ObjectIdentifier : this.f87258q0.toASN1Primitive();
    }

    public AttrOrOID(Attribute attribute) {
        this.f87257p0 = null;
        this.f87258q0 = attribute;
    }
}
