package org.bouncycastle.asn1.eac;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class PublicKeyDataObject extends ASN1Object {
    public static PublicKeyDataObject getInstance(Object obj) {
        if (obj instanceof PublicKeyDataObject) {
            return (PublicKeyDataObject) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        if (!ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0)).on(EACObjectIdentifiers.id_TA_ECDSA)) {
            RSAPublicKey rSAPublicKey = new RSAPublicKey();
            rSAPublicKey.f87192s0 = 0;
            Enumeration objects = aSN1Sequence.getObjects();
            rSAPublicKey.f87189p0 = ASN1ObjectIdentifier.getInstance(objects.nextElement());
            while (objects.hasMoreElements()) {
                UnsignedInteger unsignedInteger = UnsignedInteger.getInstance(objects.nextElement());
                int tagNo = unsignedInteger.getTagNo();
                if (tagNo == 1) {
                    int i10 = rSAPublicKey.f87192s0;
                    if ((i10 & 1) != 0) {
                        throw new IllegalArgumentException("Modulus already set");
                    }
                    rSAPublicKey.f87192s0 = i10 | 1;
                    rSAPublicKey.f87190q0 = unsignedInteger.getValue();
                } else {
                    if (tagNo != 2) {
                        throw new IllegalArgumentException("Unknown DERTaggedObject :" + unsignedInteger.getTagNo() + "-> not an Iso7816RSAPublicKeyStructure");
                    }
                    int i11 = rSAPublicKey.f87192s0;
                    if ((i11 & 2) != 0) {
                        throw new IllegalArgumentException("Exponent already set");
                    }
                    rSAPublicKey.f87192s0 = i11 | 2;
                    rSAPublicKey.f87191r0 = unsignedInteger.getValue();
                }
            }
            if (rSAPublicKey.f87192s0 == 3) {
                return rSAPublicKey;
            }
            throw new IllegalArgumentException("missing argument -> not an Iso7816RSAPublicKeyStructure");
        }
        ECDSAPublicKey eCDSAPublicKey = new ECDSAPublicKey();
        Enumeration objects2 = aSN1Sequence.getObjects();
        eCDSAPublicKey.f87179p0 = ASN1ObjectIdentifier.getInstance(objects2.nextElement());
        eCDSAPublicKey.f87186x0 = 0;
        while (objects2.hasMoreElements()) {
            Object objNextElement = objects2.nextElement();
            if (!(objNextElement instanceof ASN1TaggedObject)) {
                throw new IllegalArgumentException("Unknown Object Identifier!");
            }
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objNextElement;
            switch (aSN1TaggedObject.getTagNo()) {
                case 1:
                    BigInteger value = UnsignedInteger.getInstance(aSN1TaggedObject).getValue();
                    int i12 = eCDSAPublicKey.f87186x0;
                    if ((i12 & 1) != 0) {
                        throw new IllegalArgumentException("Prime Modulus P already set");
                    }
                    eCDSAPublicKey.f87186x0 = i12 | 1;
                    eCDSAPublicKey.f87180q0 = value;
                    break;
                    break;
                case 2:
                    BigInteger value2 = UnsignedInteger.getInstance(aSN1TaggedObject).getValue();
                    int i13 = eCDSAPublicKey.f87186x0;
                    if ((i13 & 2) != 0) {
                        throw new IllegalArgumentException("First Coef A already set");
                    }
                    eCDSAPublicKey.f87186x0 = i13 | 2;
                    eCDSAPublicKey.f87181r0 = value2;
                    break;
                    break;
                case 3:
                    BigInteger value3 = UnsignedInteger.getInstance(aSN1TaggedObject).getValue();
                    int i14 = eCDSAPublicKey.f87186x0;
                    if ((i14 & 4) != 0) {
                        throw new IllegalArgumentException("Second Coef B already set");
                    }
                    eCDSAPublicKey.f87186x0 = i14 | 4;
                    eCDSAPublicKey.f87182s0 = value3;
                    break;
                    break;
                case 4:
                    ASN1OctetString aSN1OctetString = ASN1OctetString.getInstance(aSN1TaggedObject, false);
                    int i15 = eCDSAPublicKey.f87186x0;
                    if ((i15 & 8) != 0) {
                        throw new IllegalArgumentException("Base Point G already set");
                    }
                    eCDSAPublicKey.f87186x0 = i15 | 8;
                    eCDSAPublicKey.f87183t0 = aSN1OctetString.getOctets();
                    break;
                    break;
                case 5:
                    BigInteger value4 = UnsignedInteger.getInstance(aSN1TaggedObject).getValue();
                    int i16 = eCDSAPublicKey.f87186x0;
                    if ((i16 & 16) != 0) {
                        throw new IllegalArgumentException("Order of base point R already set");
                    }
                    eCDSAPublicKey.f87186x0 = i16 | 16;
                    eCDSAPublicKey.f87184u0 = value4;
                    break;
                    break;
                case 6:
                    eCDSAPublicKey.a(ASN1OctetString.getInstance(aSN1TaggedObject, false));
                    break;
                case 7:
                    BigInteger value5 = UnsignedInteger.getInstance(aSN1TaggedObject).getValue();
                    int i17 = eCDSAPublicKey.f87186x0;
                    if ((i17 & 64) != 0) {
                        throw new IllegalArgumentException("Cofactor F already set");
                    }
                    eCDSAPublicKey.f87186x0 = i17 | 64;
                    eCDSAPublicKey.f87185w0 = value5;
                    break;
                    break;
                default:
                    eCDSAPublicKey.f87186x0 = 0;
                    throw new IllegalArgumentException("Unknown Object Identifier!");
            }
        }
        int i18 = eCDSAPublicKey.f87186x0;
        if (i18 == 32 || i18 == 127) {
            return eCDSAPublicKey;
        }
        throw new IllegalArgumentException("All options must be either present or absent!");
    }

    public abstract ASN1ObjectIdentifier getUsage();
}
