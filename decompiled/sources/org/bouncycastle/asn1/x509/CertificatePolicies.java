package org.bouncycastle.asn1.x509;

import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class CertificatePolicies extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final PolicyInformation[] f87604p0;

    public CertificatePolicies(ASN1Sequence aSN1Sequence) {
        this.f87604p0 = new PolicyInformation[aSN1Sequence.size()];
        for (int i10 = 0; i10 != aSN1Sequence.size(); i10++) {
            this.f87604p0[i10] = PolicyInformation.getInstance(aSN1Sequence.getObjectAt(i10));
        }
    }

    public static CertificatePolicies fromExtensions(Extensions extensions) {
        return getInstance(Extensions.getExtensionParsedValue(extensions, Extension.certificatePolicies));
    }

    public static CertificatePolicies getInstance(Object obj) {
        if (obj instanceof CertificatePolicies) {
            return (CertificatePolicies) obj;
        }
        if (obj != null) {
            return new CertificatePolicies(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public PolicyInformation getPolicyInformation(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int i10 = 0;
        while (true) {
            PolicyInformation[] policyInformationArr = this.f87604p0;
            if (i10 == policyInformationArr.length) {
                return null;
            }
            if (aSN1ObjectIdentifier.equals((ASN1Primitive) policyInformationArr[i10].getPolicyIdentifier())) {
                return policyInformationArr[i10];
            }
            i10++;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.f87604p0);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        int i10 = 0;
        while (true) {
            PolicyInformation[] policyInformationArr = this.f87604p0;
            if (i10 >= policyInformationArr.length) {
                return "CertificatePolicies: [" + ((Object) stringBuffer) + Constant.BRACKET_CLOSE;
            }
            if (stringBuffer.length() != 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(policyInformationArr[i10]);
            i10++;
        }
    }

    public CertificatePolicies(PolicyInformation policyInformation) {
        this.f87604p0 = new PolicyInformation[]{policyInformation};
    }

    public static CertificatePolicies getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }

    public PolicyInformation[] getPolicyInformation() {
        PolicyInformation[] policyInformationArr = this.f87604p0;
        PolicyInformation[] policyInformationArr2 = new PolicyInformation[policyInformationArr.length];
        System.arraycopy(policyInformationArr, 0, policyInformationArr2, 0, policyInformationArr.length);
        return policyInformationArr2;
    }

    public CertificatePolicies(PolicyInformation[] policyInformationArr) {
        PolicyInformation[] policyInformationArr2 = new PolicyInformation[policyInformationArr.length];
        System.arraycopy(policyInformationArr, 0, policyInformationArr2, 0, policyInformationArr.length);
        this.f87604p0 = policyInformationArr2;
    }
}
