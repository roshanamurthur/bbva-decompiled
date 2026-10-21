package org.bouncycastle.asn1.pkcs;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class PBES2Parameters extends ASN1Object implements PKCSObjectIdentifiers {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public KeyDerivationFunc f87406p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public EncryptionScheme f87407q0;

    public PBES2Parameters(KeyDerivationFunc keyDerivationFunc, EncryptionScheme encryptionScheme) {
        this.f87406p0 = keyDerivationFunc;
        this.f87407q0 = encryptionScheme;
    }

    public static PBES2Parameters getInstance(Object obj) {
        if (obj instanceof PBES2Parameters) {
            return (PBES2Parameters) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        PBES2Parameters pBES2Parameters = new PBES2Parameters();
        Enumeration objects = aSN1Sequence.getObjects();
        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(((ASN1Encodable) objects.nextElement()).toASN1Primitive());
        ASN1Encodable objectAt = aSN1Sequence2.getObjectAt(0);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.id_PBKDF2;
        if (objectAt.equals(aSN1ObjectIdentifier)) {
            pBES2Parameters.f87406p0 = new KeyDerivationFunc(aSN1ObjectIdentifier, PBKDF2Params.getInstance(aSN1Sequence2.getObjectAt(1)));
        } else {
            pBES2Parameters.f87406p0 = KeyDerivationFunc.getInstance(aSN1Sequence2);
        }
        pBES2Parameters.f87407q0 = EncryptionScheme.getInstance(objects.nextElement());
        return pBES2Parameters;
    }

    public EncryptionScheme getEncryptionScheme() {
        return this.f87407q0;
    }

    public KeyDerivationFunc getKeyDerivationFunc() {
        return this.f87406p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87406p0);
        aSN1EncodableVector.add(this.f87407q0);
        return new DERSequence(aSN1EncodableVector);
    }
}
