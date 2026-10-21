package org.bouncycastle.asn1.esf;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.X500Name;

/* JADX INFO: loaded from: classes12.dex */
public class CrlIdentifier extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public X500Name f87200p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1UTCTime f87201q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Integer f87202r0;

    public CrlIdentifier(X500Name x500Name, ASN1UTCTime aSN1UTCTime) {
        this(x500Name, aSN1UTCTime, null);
    }

    public static CrlIdentifier getInstance(Object obj) {
        if (obj instanceof CrlIdentifier) {
            return (CrlIdentifier) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CrlIdentifier crlIdentifier = new CrlIdentifier();
        if (aSN1Sequence.size() < 2 || aSN1Sequence.size() > 3) {
            throw new IllegalArgumentException();
        }
        crlIdentifier.f87200p0 = X500Name.getInstance(aSN1Sequence.getObjectAt(0));
        crlIdentifier.f87201q0 = ASN1UTCTime.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() > 2) {
            crlIdentifier.f87202r0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(2));
        }
        return crlIdentifier;
    }

    public ASN1UTCTime getCrlIssuedTime() {
        return this.f87201q0;
    }

    public X500Name getCrlIssuer() {
        return this.f87200p0;
    }

    public BigInteger getCrlNumber() {
        ASN1Integer aSN1Integer = this.f87202r0;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f87200p0.toASN1Primitive());
        aSN1EncodableVector.add(this.f87201q0);
        ASN1Integer aSN1Integer = this.f87202r0;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public CrlIdentifier(X500Name x500Name, ASN1UTCTime aSN1UTCTime, BigInteger bigInteger) {
        this.f87200p0 = x500Name;
        this.f87201q0 = aSN1UTCTime;
        if (bigInteger != null) {
            this.f87202r0 = new ASN1Integer(bigInteger);
        }
    }
}
