package org.bouncycastle.asn1.x500.style;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.x500.AttributeTypeAndValue;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractX500NameStyle implements X500NameStyle {
    public static Hashtable copyHashTable(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            Object objNextElement = enumerationKeys.nextElement();
            hashtable2.put(objNextElement, hashtable.get(objNextElement));
        }
        return hashtable2;
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public boolean areEqual(X500Name x500Name, X500Name x500Name2) {
        RDN[] rDNs = x500Name.getRDNs();
        RDN[] rDNs2 = x500Name2.getRDNs();
        if (rDNs.length != rDNs2.length) {
            return false;
        }
        boolean z10 = (rDNs[0].getFirst() == null || rDNs2[0].getFirst() == null) ? false : !rDNs[0].getFirst().getType().equals((ASN1Primitive) rDNs2[0].getFirst().getType());
        for (int i10 = 0; i10 != rDNs.length; i10++) {
            RDN rdn = rDNs[i10];
            if (z10) {
                for (int length = rDNs2.length - 1; length >= 0; length--) {
                    RDN rdn2 = rDNs2[length];
                    if (rdn2 != null && rdnAreEqual(rdn, rdn2)) {
                        rDNs2[length] = null;
                    }
                }
                return false;
            }
            for (int i11 = 0; i11 != rDNs2.length; i11++) {
                RDN rdn3 = rDNs2[i11];
                if (rdn3 != null && rdnAreEqual(rdn, rdn3)) {
                    rDNs2[i11] = null;
                }
            }
            return false;
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public int calculateHashCode(X500Name x500Name) {
        RDN[] rDNs = x500Name.getRDNs();
        int iHashCode = 0;
        for (int i10 = 0; i10 != rDNs.length; i10++) {
            if (rDNs[i10].isMultiValued()) {
                AttributeTypeAndValue[] typesAndValues = rDNs[i10].getTypesAndValues();
                for (int i11 = 0; i11 != typesAndValues.length; i11++) {
                    iHashCode = (iHashCode ^ typesAndValues[i11].getType().hashCode()) ^ IETFUtils.canonicalString(typesAndValues[i11].getValue()).hashCode();
                }
            } else {
                iHashCode = (iHashCode ^ rDNs[i10].getFirst().getType().hashCode()) ^ IETFUtils.canonicalString(rDNs[i10].getFirst().getValue()).hashCode();
            }
        }
        return iHashCode;
    }

    public ASN1Encodable encodeStringValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        return new DERUTF8String(str);
    }

    public boolean rdnAreEqual(RDN rdn, RDN rdn2) {
        return IETFUtils.rDNAreEqual(rdn, rdn2);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public ASN1Encodable stringToValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        if (str.length() == 0 || str.charAt(0) != '#') {
            if (str.length() != 0 && str.charAt(0) == '\\') {
                str = str.substring(1);
            }
            return encodeStringValue(aSN1ObjectIdentifier, str);
        }
        try {
            return IETFUtils.valueFromHexString(str, 1);
        } catch (IOException unused) {
            throw new ASN1ParsingException("can't recode value for oid " + aSN1ObjectIdentifier.getId());
        }
    }
}
