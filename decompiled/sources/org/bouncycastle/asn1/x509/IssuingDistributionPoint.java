package org.bouncycastle.asn1.x509;

import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes12.dex */
public class IssuingDistributionPoint extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public DistributionPointName f87643p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f87644q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f87645r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ReasonFlags f87646s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f87647t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f87648u0;
    public ASN1Sequence v0;

    public IssuingDistributionPoint(DistributionPointName distributionPointName, boolean z10, boolean z11) {
        this(distributionPointName, false, false, null, z10, z11);
    }

    public static void a(StringBuffer stringBuffer, String str, String str2, String str3) {
        stringBuffer.append("    ");
        stringBuffer.append(str2);
        stringBuffer.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
        stringBuffer.append(str);
        stringBuffer.append("    ");
        stringBuffer.append("    ");
        stringBuffer.append(str3);
        stringBuffer.append(str);
    }

    public static IssuingDistributionPoint getInstance(Object obj) {
        if (obj instanceof IssuingDistributionPoint) {
            return (IssuingDistributionPoint) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        IssuingDistributionPoint issuingDistributionPoint = new IssuingDistributionPoint();
        issuingDistributionPoint.v0 = aSN1Sequence;
        for (int i10 = 0; i10 != aSN1Sequence.size(); i10++) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i10));
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                issuingDistributionPoint.f87643p0 = DistributionPointName.getInstance(aSN1TaggedObject, true);
            } else if (tagNo == 1) {
                issuingDistributionPoint.f87644q0 = ASN1Boolean.getInstance(aSN1TaggedObject, false).isTrue();
            } else if (tagNo == 2) {
                issuingDistributionPoint.f87645r0 = ASN1Boolean.getInstance(aSN1TaggedObject, false).isTrue();
            } else if (tagNo == 3) {
                issuingDistributionPoint.f87646s0 = new ReasonFlags(DERBitString.getInstance(aSN1TaggedObject, false));
            } else if (tagNo == 4) {
                issuingDistributionPoint.f87647t0 = ASN1Boolean.getInstance(aSN1TaggedObject, false).isTrue();
            } else {
                if (tagNo != 5) {
                    throw new IllegalArgumentException("unknown tag in IssuingDistributionPoint");
                }
                issuingDistributionPoint.f87648u0 = ASN1Boolean.getInstance(aSN1TaggedObject, false).isTrue();
            }
        }
        return issuingDistributionPoint;
    }

    public DistributionPointName getDistributionPoint() {
        return this.f87643p0;
    }

    public ReasonFlags getOnlySomeReasons() {
        return this.f87646s0;
    }

    public boolean isIndirectCRL() {
        return this.f87647t0;
    }

    public boolean onlyContainsAttributeCerts() {
        return this.f87648u0;
    }

    public boolean onlyContainsCACerts() {
        return this.f87645r0;
    }

    public boolean onlyContainsUserCerts() {
        return this.f87644q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.v0;
    }

    public String toString() {
        String strLineSeparator = Strings.lineSeparator();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("IssuingDistributionPoint: [");
        stringBuffer.append(strLineSeparator);
        DistributionPointName distributionPointName = this.f87643p0;
        if (distributionPointName != null) {
            a(stringBuffer, strLineSeparator, "distributionPoint", distributionPointName.toString());
        }
        boolean z10 = this.f87644q0;
        if (z10) {
            a(stringBuffer, strLineSeparator, "onlyContainsUserCerts", z10 ? "true" : "false");
        }
        boolean z11 = this.f87645r0;
        if (z11) {
            a(stringBuffer, strLineSeparator, "onlyContainsCACerts", z11 ? "true" : "false");
        }
        ReasonFlags reasonFlags = this.f87646s0;
        if (reasonFlags != null) {
            a(stringBuffer, strLineSeparator, "onlySomeReasons", reasonFlags.toString());
        }
        boolean z12 = this.f87648u0;
        if (z12) {
            a(stringBuffer, strLineSeparator, "onlyContainsAttributeCerts", z12 ? "true" : "false");
        }
        boolean z13 = this.f87647t0;
        if (z13) {
            a(stringBuffer, strLineSeparator, "indirectCRL", z13 ? "true" : "false");
        }
        stringBuffer.append(Constant.BRACKET_CLOSE);
        stringBuffer.append(strLineSeparator);
        return stringBuffer.toString();
    }

    public IssuingDistributionPoint(DistributionPointName distributionPointName, boolean z10, boolean z11, ReasonFlags reasonFlags, boolean z12, boolean z13) {
        this.f87643p0 = distributionPointName;
        this.f87647t0 = z12;
        this.f87648u0 = z13;
        this.f87645r0 = z11;
        this.f87644q0 = z10;
        this.f87646s0 = reasonFlags;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        if (distributionPointName != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, distributionPointName));
        }
        if (z10) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, ASN1Boolean.getInstance(true)));
        }
        if (z11) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 2, ASN1Boolean.getInstance(true)));
        }
        if (reasonFlags != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 3, reasonFlags));
        }
        if (z12) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 4, ASN1Boolean.getInstance(true)));
        }
        if (z13) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 5, ASN1Boolean.getInstance(true)));
        }
        this.v0 = new DERSequence(aSN1EncodableVector);
    }

    public static IssuingDistributionPoint getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
