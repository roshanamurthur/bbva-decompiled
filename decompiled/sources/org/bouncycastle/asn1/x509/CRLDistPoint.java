package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes12.dex */
public class CRLDistPoint extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f87587p0;

    public CRLDistPoint(DistributionPoint[] distributionPointArr) {
        this.f87587p0 = null;
        this.f87587p0 = new DERSequence(distributionPointArr);
    }

    public static CRLDistPoint fromExtensions(Extensions extensions) {
        return getInstance(Extensions.getExtensionParsedValue(extensions, Extension.cRLDistributionPoints));
    }

    public static CRLDistPoint getInstance(Object obj) {
        if (obj instanceof CRLDistPoint) {
            return (CRLDistPoint) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CRLDistPoint cRLDistPoint = new CRLDistPoint();
        cRLDistPoint.f87587p0 = aSN1Sequence;
        return cRLDistPoint;
    }

    public DistributionPoint[] getDistributionPoints() {
        ASN1Sequence aSN1Sequence = this.f87587p0;
        DistributionPoint[] distributionPointArr = new DistributionPoint[aSN1Sequence.size()];
        for (int i10 = 0; i10 != aSN1Sequence.size(); i10++) {
            distributionPointArr[i10] = DistributionPoint.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return distributionPointArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87587p0;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("CRLDistPoint:");
        String strLineSeparator = Strings.lineSeparator();
        stringBuffer.append(strLineSeparator);
        DistributionPoint[] distributionPoints = getDistributionPoints();
        for (int i10 = 0; i10 != distributionPoints.length; i10++) {
            stringBuffer.append("    ");
            stringBuffer.append(distributionPoints[i10]);
            stringBuffer.append(strLineSeparator);
        }
        return stringBuffer.toString();
    }

    public static CRLDistPoint getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
