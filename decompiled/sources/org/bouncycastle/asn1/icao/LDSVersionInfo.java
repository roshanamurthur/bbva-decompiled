package org.bouncycastle.asn1.icao;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class LDSVersionInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public DERPrintableString f87280p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public DERPrintableString f87281q0;

    public LDSVersionInfo(String str, String str2) {
        this.f87280p0 = new DERPrintableString(str);
        this.f87281q0 = new DERPrintableString(str2);
    }

    public static LDSVersionInfo getInstance(Object obj) {
        if (obj instanceof LDSVersionInfo) {
            return (LDSVersionInfo) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        LDSVersionInfo lDSVersionInfo = new LDSVersionInfo();
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException("sequence wrong size for LDSVersionInfo");
        }
        lDSVersionInfo.f87280p0 = DERPrintableString.getInstance(aSN1Sequence.getObjectAt(0));
        lDSVersionInfo.f87281q0 = DERPrintableString.getInstance(aSN1Sequence.getObjectAt(1));
        return lDSVersionInfo;
    }

    public String getLdsVersion() {
        return this.f87280p0.getString();
    }

    public String getUnicodeVersion() {
        return this.f87281q0.getString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87280p0);
        aSN1EncodableVector.add(this.f87281q0);
        return new DERSequence(aSN1EncodableVector);
    }
}
