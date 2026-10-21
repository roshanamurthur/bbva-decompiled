package org.bouncycastle.asn1.icao;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class DataGroupHash extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f87274p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1OctetString f87275q0;

    public DataGroupHash(int i10, ASN1OctetString aSN1OctetString) {
        this.f87274p0 = new ASN1Integer(i10);
        this.f87275q0 = aSN1OctetString;
    }

    public static DataGroupHash getInstance(Object obj) {
        if (obj instanceof DataGroupHash) {
            return (DataGroupHash) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        DataGroupHash dataGroupHash = new DataGroupHash();
        Enumeration objects = aSN1Sequence.getObjects();
        dataGroupHash.f87274p0 = ASN1Integer.getInstance(objects.nextElement());
        dataGroupHash.f87275q0 = ASN1OctetString.getInstance(objects.nextElement());
        return dataGroupHash;
    }

    public ASN1OctetString getDataGroupHashValue() {
        return this.f87275q0;
    }

    public int getDataGroupNumber() {
        return this.f87274p0.intValueExact();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87274p0);
        aSN1EncodableVector.add(this.f87275q0);
        return new DERSequence(aSN1EncodableVector);
    }
}
