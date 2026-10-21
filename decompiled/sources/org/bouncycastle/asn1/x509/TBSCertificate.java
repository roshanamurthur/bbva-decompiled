package org.bouncycastle.asn1.x509;

import androidx.camera.core.impl.utils.b;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Properties;

/* JADX INFO: loaded from: classes12.dex */
public class TBSCertificate extends ASN1Object {
    public DERBitString E0;
    public Extensions F0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f87699p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Integer f87700q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Integer f87701r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public AlgorithmIdentifier f87702s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public X500Name f87703t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Time f87704u0;
    public Time v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public X500Name f87705w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public SubjectPublicKeyInfo f87706x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public DERBitString f87707y0;

    public static TBSCertificate getInstance(Object obj) {
        int i10;
        boolean z10;
        boolean z11;
        if (obj instanceof TBSCertificate) {
            return (TBSCertificate) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        TBSCertificate tBSCertificate = new TBSCertificate();
        tBSCertificate.f87699p0 = aSN1Sequence;
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1TaggedObject) {
            tBSCertificate.f87700q0 = ASN1Integer.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(0), true);
            i10 = 0;
        } else {
            tBSCertificate.f87700q0 = new ASN1Integer(0L);
            i10 = -1;
        }
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        ASN1Integer aSN1Integer = tBSCertificate.f87700q0;
        if (aSN1Integer.hasValue(bigIntegerValueOf)) {
            z11 = false;
            z10 = true;
        } else if (aSN1Integer.hasValue(BigInteger.valueOf(1L))) {
            z10 = false;
            z11 = true;
        } else {
            if (!aSN1Integer.hasValue(BigInteger.valueOf(2L))) {
                throw new IllegalArgumentException("version number not recognised");
            }
            z10 = false;
            z11 = false;
        }
        tBSCertificate.f87701r0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i10 + 1));
        tBSCertificate.f87702s0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i10 + 2));
        tBSCertificate.f87703t0 = X500Name.getInstance(aSN1Sequence.getObjectAt(i10 + 3));
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(i10 + 4);
        tBSCertificate.f87704u0 = Time.getInstance(aSN1Sequence2.getObjectAt(0));
        tBSCertificate.v0 = Time.getInstance(aSN1Sequence2.getObjectAt(1));
        tBSCertificate.f87705w0 = X500Name.getInstance(aSN1Sequence.getObjectAt(i10 + 5));
        int i11 = i10 + 6;
        tBSCertificate.f87706x0 = SubjectPublicKeyInfo.getInstance(aSN1Sequence.getObjectAt(i11));
        int size = (aSN1Sequence.size() - i11) - 1;
        if (size != 0 && z10) {
            throw new IllegalArgumentException("version 1 certificate contains extra data");
        }
        while (size > 0) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.getObjectAt(i11 + size);
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 1) {
                tBSCertificate.f87707y0 = DERBitString.getInstance(aSN1TaggedObject, false);
            } else if (tagNo == 2) {
                tBSCertificate.E0 = DERBitString.getInstance(aSN1TaggedObject, false);
            } else {
                if (tagNo != 3) {
                    throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("Unknown tag encountered in structure: ")));
                }
                if (z11) {
                    throw new IllegalArgumentException("version 2 certificate cannot contain extensions");
                }
                tBSCertificate.F0 = Extensions.getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, true));
            }
            size--;
        }
        return tBSCertificate;
    }

    public Time getEndDate() {
        return this.v0;
    }

    public Extensions getExtensions() {
        return this.F0;
    }

    public X500Name getIssuer() {
        return this.f87703t0;
    }

    public DERBitString getIssuerUniqueId() {
        return this.f87707y0;
    }

    public ASN1Integer getSerialNumber() {
        return this.f87701r0;
    }

    public AlgorithmIdentifier getSignature() {
        return this.f87702s0;
    }

    public Time getStartDate() {
        return this.f87704u0;
    }

    public X500Name getSubject() {
        return this.f87705w0;
    }

    public SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return this.f87706x0;
    }

    public DERBitString getSubjectUniqueId() {
        return this.E0;
    }

    public ASN1Integer getVersion() {
        return this.f87700q0;
    }

    public int getVersionNumber() {
        return this.f87700q0.intValueExact() + 1;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        String propertyValue = Properties.getPropertyValue("org.bouncycastle.x509.allow_non-der_tbscert");
        ASN1Sequence aSN1Sequence = this.f87699p0;
        if (propertyValue == null || Properties.isOverrideSet("org.bouncycastle.x509.allow_non-der_tbscert")) {
            return aSN1Sequence;
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        BigInteger bigInteger = BigIntegers.ZERO;
        ASN1Integer aSN1Integer = this.f87700q0;
        if (!aSN1Integer.hasValue(bigInteger)) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, aSN1Integer));
        }
        aSN1EncodableVector.add(this.f87701r0);
        aSN1EncodableVector.add(this.f87702s0);
        aSN1EncodableVector.add(this.f87703t0);
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(2);
        aSN1EncodableVector2.add(this.f87704u0);
        aSN1EncodableVector2.add(this.v0);
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        ASN1Encodable dERSequence = this.f87705w0;
        if (dERSequence == null) {
            dERSequence = new DERSequence();
        }
        aSN1EncodableVector.add(dERSequence);
        aSN1EncodableVector.add(this.f87706x0);
        DERBitString dERBitString = this.f87707y0;
        if (dERBitString != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, dERBitString));
        }
        DERBitString dERBitString2 = this.E0;
        if (dERBitString2 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 2, dERBitString2));
        }
        Extensions extensions = this.F0;
        if (extensions != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 3, extensions));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static TBSCertificate getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
