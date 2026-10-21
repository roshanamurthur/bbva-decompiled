package org.bouncycastle.asn1.cmc;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.CRLReason;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class RevokeRequest extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final X500Name f86724p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1Integer f86725q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final CRLReason f86726r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ASN1GeneralizedTime f86727s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ASN1OctetString f86728t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public DERUTF8String f86729u0;

    public RevokeRequest(ASN1Sequence aSN1Sequence) {
        int i10 = 3;
        if (aSN1Sequence.size() < 3 || aSN1Sequence.size() > 6) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.f86724p0 = X500Name.getInstance(aSN1Sequence.getObjectAt(0));
        this.f86725q0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
        this.f86726r0 = CRLReason.getInstance(aSN1Sequence.getObjectAt(2));
        if (aSN1Sequence.size() > 3 && (aSN1Sequence.getObjectAt(3).toASN1Primitive() instanceof ASN1GeneralizedTime)) {
            this.f86727s0 = ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(3));
            i10 = 4;
        }
        if (aSN1Sequence.size() > i10 && (aSN1Sequence.getObjectAt(i10).toASN1Primitive() instanceof ASN1OctetString)) {
            this.f86728t0 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i10));
            i10++;
        }
        if (aSN1Sequence.size() <= i10 || !(aSN1Sequence.getObjectAt(i10).toASN1Primitive() instanceof DERUTF8String)) {
            return;
        }
        this.f86729u0 = DERUTF8String.getInstance(aSN1Sequence.getObjectAt(i10));
    }

    public static RevokeRequest getInstance(Object obj) {
        if (obj instanceof RevokeRequest) {
            return (RevokeRequest) obj;
        }
        if (obj != null) {
            return new RevokeRequest(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public DERUTF8String getComment() {
        return this.f86729u0;
    }

    public ASN1GeneralizedTime getInvalidityDate() {
        return this.f86727s0;
    }

    public X500Name getName() {
        return this.f86724p0;
    }

    public byte[] getPassPhrase() {
        ASN1OctetString aSN1OctetString = this.f86728t0;
        if (aSN1OctetString != null) {
            return Arrays.clone(aSN1OctetString.getOctets());
        }
        return null;
    }

    public ASN1OctetString getPassphrase() {
        return this.f86728t0;
    }

    public CRLReason getReason() {
        return this.f86726r0;
    }

    public BigInteger getSerialNumber() {
        return this.f86725q0.getValue();
    }

    public void setComment(DERUTF8String dERUTF8String) {
        this.f86729u0 = dERUTF8String;
    }

    public void setInvalidityDate(ASN1GeneralizedTime aSN1GeneralizedTime) {
        this.f86727s0 = aSN1GeneralizedTime;
    }

    public void setPassphrase(ASN1OctetString aSN1OctetString) {
        this.f86728t0 = aSN1OctetString;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.f86724p0);
        aSN1EncodableVector.add(this.f86725q0);
        aSN1EncodableVector.add(this.f86726r0);
        ASN1GeneralizedTime aSN1GeneralizedTime = this.f86727s0;
        if (aSN1GeneralizedTime != null) {
            aSN1EncodableVector.add(aSN1GeneralizedTime);
        }
        ASN1OctetString aSN1OctetString = this.f86728t0;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(aSN1OctetString);
        }
        DERUTF8String dERUTF8String = this.f86729u0;
        if (dERUTF8String != null) {
            aSN1EncodableVector.add(dERUTF8String);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public RevokeRequest(X500Name x500Name, ASN1Integer aSN1Integer, CRLReason cRLReason, ASN1GeneralizedTime aSN1GeneralizedTime, ASN1OctetString aSN1OctetString, DERUTF8String dERUTF8String) {
        this.f86724p0 = x500Name;
        this.f86725q0 = aSN1Integer;
        this.f86726r0 = cRLReason;
        this.f86727s0 = aSN1GeneralizedTime;
        this.f86728t0 = aSN1OctetString;
        this.f86729u0 = dERUTF8String;
    }
}
