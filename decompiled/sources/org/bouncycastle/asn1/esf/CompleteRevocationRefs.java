package org.bouncycastle.asn1.esf;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class CompleteRevocationRefs extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f87199p0;

    public CompleteRevocationRefs(CrlOcspRef[] crlOcspRefArr) {
        this.f87199p0 = new DERSequence(crlOcspRefArr);
    }

    public static CompleteRevocationRefs getInstance(Object obj) {
        if (obj instanceof CompleteRevocationRefs) {
            return (CompleteRevocationRefs) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CompleteRevocationRefs completeRevocationRefs = new CompleteRevocationRefs();
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            CrlOcspRef.getInstance(objects.nextElement());
        }
        completeRevocationRefs.f87199p0 = aSN1Sequence;
        return completeRevocationRefs;
    }

    public CrlOcspRef[] getCrlOcspRefs() {
        ASN1Sequence aSN1Sequence = this.f87199p0;
        int size = aSN1Sequence.size();
        CrlOcspRef[] crlOcspRefArr = new CrlOcspRef[size];
        for (int i10 = 0; i10 < size; i10++) {
            crlOcspRefArr[i10] = CrlOcspRef.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return crlOcspRefArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87199p0;
    }
}
