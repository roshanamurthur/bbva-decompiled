package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class BasicConstraints extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Boolean f87585p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Integer f87586q0;

    public BasicConstraints(int i10) {
        this.f87585p0 = ASN1Boolean.getInstance(false);
        this.f87586q0 = null;
        this.f87585p0 = ASN1Boolean.getInstance(true);
        this.f87586q0 = new ASN1Integer(i10);
    }

    public static BasicConstraints fromExtensions(Extensions extensions) {
        return getInstance(Extensions.getExtensionParsedValue(extensions, Extension.basicConstraints));
    }

    public static BasicConstraints getInstance(Object obj) {
        if (obj instanceof BasicConstraints) {
            return (BasicConstraints) obj;
        }
        if (obj instanceof X509Extension) {
            return getInstance(X509Extension.convertValueToObject((X509Extension) obj));
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        BasicConstraints basicConstraints = new BasicConstraints();
        basicConstraints.f87585p0 = ASN1Boolean.getInstance(false);
        basicConstraints.f87586q0 = null;
        if (aSN1Sequence.size() == 0) {
            basicConstraints.f87585p0 = null;
            basicConstraints.f87586q0 = null;
        } else {
            if (aSN1Sequence.getObjectAt(0) instanceof ASN1Boolean) {
                basicConstraints.f87585p0 = ASN1Boolean.getInstance(aSN1Sequence.getObjectAt(0));
            } else {
                basicConstraints.f87585p0 = null;
                basicConstraints.f87586q0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
            }
            if (aSN1Sequence.size() > 1) {
                if (basicConstraints.f87585p0 == null) {
                    throw new IllegalArgumentException("wrong sequence in constructor");
                }
                basicConstraints.f87586q0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
            }
        }
        return basicConstraints;
    }

    public BigInteger getPathLenConstraint() {
        ASN1Integer aSN1Integer = this.f87586q0;
        if (aSN1Integer != null) {
            return aSN1Integer.getValue();
        }
        return null;
    }

    public boolean isCA() {
        ASN1Boolean aSN1Boolean = this.f87585p0;
        return aSN1Boolean != null && aSN1Boolean.isTrue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        ASN1Boolean aSN1Boolean = this.f87585p0;
        if (aSN1Boolean != null) {
            aSN1EncodableVector.add(aSN1Boolean);
        }
        ASN1Integer aSN1Integer = this.f87586q0;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        ASN1Integer aSN1Integer = this.f87586q0;
        if (aSN1Integer == null) {
            return "BasicConstraints: isCa(" + isCA() + ")";
        }
        return "BasicConstraints: isCa(" + isCA() + "), pathLenConstraint = " + aSN1Integer.getValue();
    }

    public BasicConstraints(boolean z10) {
        this.f87585p0 = ASN1Boolean.getInstance(false);
        this.f87586q0 = null;
        if (z10) {
            this.f87585p0 = ASN1Boolean.getInstance(true);
        } else {
            this.f87585p0 = null;
        }
        this.f87586q0 = null;
    }

    public static BasicConstraints getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
