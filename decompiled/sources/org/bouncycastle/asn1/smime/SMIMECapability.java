package org.bouncycastle.asn1.smime;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;

/* JADX INFO: loaded from: classes12.dex */
public class SMIMECapability extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1ObjectIdentifier f87472p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1Encodable f87473q0;
    public static final ASN1ObjectIdentifier preferSignedData = PKCSObjectIdentifiers.preferSignedData;
    public static final ASN1ObjectIdentifier canNotDecryptAny = PKCSObjectIdentifiers.canNotDecryptAny;
    public static final ASN1ObjectIdentifier sMIMECapabilitiesVersions = PKCSObjectIdentifiers.sMIMECapabilitiesVersions;
    public static final ASN1ObjectIdentifier dES_CBC = new ASN1ObjectIdentifier("1.3.14.3.2.7");
    public static final ASN1ObjectIdentifier dES_EDE3_CBC = PKCSObjectIdentifiers.des_EDE3_CBC;
    public static final ASN1ObjectIdentifier rC2_CBC = PKCSObjectIdentifiers.RC2_CBC;
    public static final ASN1ObjectIdentifier aES128_CBC = NISTObjectIdentifiers.id_aes128_CBC;
    public static final ASN1ObjectIdentifier aES192_CBC = NISTObjectIdentifiers.id_aes192_CBC;
    public static final ASN1ObjectIdentifier aES256_CBC = NISTObjectIdentifiers.id_aes256_CBC;

    public SMIMECapability(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f87472p0 = aSN1ObjectIdentifier;
        this.f87473q0 = aSN1Encodable;
    }

    public static SMIMECapability getInstance(Object obj) {
        if (obj == null || (obj instanceof SMIMECapability)) {
            return (SMIMECapability) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new SMIMECapability((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException("Invalid SMIMECapability");
    }

    public ASN1ObjectIdentifier getCapabilityID() {
        return this.f87472p0;
    }

    public ASN1Encodable getParameters() {
        return this.f87473q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87472p0);
        ASN1Encodable aSN1Encodable = this.f87473q0;
        if (aSN1Encodable != null) {
            aSN1EncodableVector.add(aSN1Encodable);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public SMIMECapability(ASN1Sequence aSN1Sequence) {
        this.f87472p0 = (ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        if (aSN1Sequence.size() > 1) {
            this.f87473q0 = (ASN1Primitive) aSN1Sequence.getObjectAt(1);
        }
    }
}
