package org.bouncycastle.asn1.x509;

import androidx.camera.core.impl.utils.b;
import androidx.emoji2.text.flatbuffer.a;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import mx.openpay.library.domain.util.Constant;
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
public class DistributionPoint extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final DistributionPointName f87611p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ReasonFlags f87612q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final GeneralNames f87613r0;

    public DistributionPoint(ASN1Sequence aSN1Sequence) {
        for (int i10 = 0; i10 != aSN1Sequence.size(); i10++) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i10));
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                this.f87611p0 = DistributionPointName.getInstance(aSN1TaggedObject, true);
            } else if (tagNo == 1) {
                this.f87612q0 = new ReasonFlags(DERBitString.getInstance(aSN1TaggedObject, false));
            } else {
                if (tagNo != 2) {
                    throw new IllegalArgumentException(b.c(aSN1TaggedObject, new StringBuilder("Unknown tag encountered in structure: ")));
                }
                this.f87613r0 = GeneralNames.getInstance(aSN1TaggedObject, false);
            }
        }
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

    public static DistributionPoint getInstance(Object obj) {
        if (obj == null || (obj instanceof DistributionPoint)) {
            return (DistributionPoint) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new DistributionPoint((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException(a.c(obj, "Invalid DistributionPoint: "));
    }

    public GeneralNames getCRLIssuer() {
        return this.f87613r0;
    }

    public DistributionPointName getDistributionPoint() {
        return this.f87611p0;
    }

    public ReasonFlags getReasons() {
        return this.f87612q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        DistributionPointName distributionPointName = this.f87611p0;
        if (distributionPointName != null) {
            aSN1EncodableVector.add(new DERTaggedObject(0, distributionPointName));
        }
        ReasonFlags reasonFlags = this.f87612q0;
        if (reasonFlags != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, reasonFlags));
        }
        GeneralNames generalNames = this.f87613r0;
        if (generalNames != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 2, generalNames));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        String strLineSeparator = Strings.lineSeparator();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPoint: [");
        stringBuffer.append(strLineSeparator);
        DistributionPointName distributionPointName = this.f87611p0;
        if (distributionPointName != null) {
            a(stringBuffer, strLineSeparator, "distributionPoint", distributionPointName.toString());
        }
        ReasonFlags reasonFlags = this.f87612q0;
        if (reasonFlags != null) {
            a(stringBuffer, strLineSeparator, "reasons", reasonFlags.toString());
        }
        GeneralNames generalNames = this.f87613r0;
        if (generalNames != null) {
            a(stringBuffer, strLineSeparator, "cRLIssuer", generalNames.toString());
        }
        stringBuffer.append(Constant.BRACKET_CLOSE);
        stringBuffer.append(strLineSeparator);
        return stringBuffer.toString();
    }

    public DistributionPoint(DistributionPointName distributionPointName, ReasonFlags reasonFlags, GeneralNames generalNames) {
        this.f87611p0 = distributionPointName;
        this.f87612q0 = reasonFlags;
        this.f87613r0 = generalNames;
    }

    public static DistributionPoint getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
