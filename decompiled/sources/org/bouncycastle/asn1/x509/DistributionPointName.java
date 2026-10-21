package org.bouncycastle.asn1.x509;

import androidx.emoji2.text.flatbuffer.a;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes12.dex */
public class DistributionPointName extends ASN1Object implements ASN1Choice {
    public static final int FULL_NAME = 0;
    public static final int NAME_RELATIVE_TO_CRL_ISSUER = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Encodable f87614p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f87615q0;

    public DistributionPointName(int i10, ASN1Encodable aSN1Encodable) {
        this.f87615q0 = i10;
        this.f87614p0 = aSN1Encodable;
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

    public static DistributionPointName getInstance(Object obj) {
        if (obj == null || (obj instanceof DistributionPointName)) {
            return (DistributionPointName) obj;
        }
        if (obj instanceof ASN1TaggedObject) {
            return new DistributionPointName((ASN1TaggedObject) obj);
        }
        throw new IllegalArgumentException(a.c(obj, "unknown object in factory: "));
    }

    public ASN1Encodable getName() {
        return this.f87614p0;
    }

    public int getType() {
        return this.f87615q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(false, this.f87615q0, this.f87614p0);
    }

    public String toString() {
        String strLineSeparator = Strings.lineSeparator();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPointName: [");
        stringBuffer.append(strLineSeparator);
        a(stringBuffer, strLineSeparator, this.f87615q0 == 0 ? IAppSDKPlus.EXTRA_KEY_SIGN_UP_FULL_NAME : "nameRelativeToCRLIssuer", this.f87614p0.toString());
        stringBuffer.append(Constant.BRACKET_CLOSE);
        stringBuffer.append(strLineSeparator);
        return stringBuffer.toString();
    }

    public DistributionPointName(ASN1TaggedObject aSN1TaggedObject) {
        int tagNo = aSN1TaggedObject.getTagNo();
        this.f87615q0 = tagNo;
        this.f87614p0 = tagNo == 0 ? GeneralNames.getInstance(aSN1TaggedObject, false) : ASN1Set.getInstance(aSN1TaggedObject, false);
    }

    public DistributionPointName(GeneralNames generalNames) {
        this(0, generalNames);
    }

    public static DistributionPointName getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1TaggedObject.getInstance(aSN1TaggedObject, true));
    }
}
