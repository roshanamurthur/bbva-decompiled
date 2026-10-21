package org.bouncycastle.asn1.misc;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class IDEACBCPar extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1OctetString f87313p0;

    public IDEACBCPar(byte[] bArr) {
        this.f87313p0 = new DEROctetString(bArr);
    }

    public static IDEACBCPar getInstance(Object obj) {
        if (obj instanceof IDEACBCPar) {
            return (IDEACBCPar) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        IDEACBCPar iDEACBCPar = new IDEACBCPar();
        if (aSN1Sequence.size() == 1) {
            iDEACBCPar.f87313p0 = (ASN1OctetString) aSN1Sequence.getObjectAt(0);
        } else {
            iDEACBCPar.f87313p0 = null;
        }
        return iDEACBCPar;
    }

    public byte[] getIV() {
        ASN1OctetString aSN1OctetString = this.f87313p0;
        if (aSN1OctetString != null) {
            return Arrays.clone(aSN1OctetString.getOctets());
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(1);
        ASN1OctetString aSN1OctetString = this.f87313p0;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(aSN1OctetString);
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
