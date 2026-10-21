package org.bouncycastle.asn1.dvcs;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cmp.PKIStatusInfo;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.PolicyInformation;

/* JADX INFO: loaded from: classes12.dex */
public class DVCSCertInfoBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f87107a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DVCSRequestInformation f87108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DigestInfo f87109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ASN1Integer f87110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DVCSTime f87111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PKIStatusInfo f87112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PolicyInformation f87113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ASN1Set f87114h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DERSequence f87115i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Extensions f87116j;

    public DVCSCertInfoBuilder(DVCSRequestInformation dVCSRequestInformation, DigestInfo digestInfo, ASN1Integer aSN1Integer, DVCSTime dVCSTime) {
        this.f87108b = dVCSRequestInformation;
        this.f87109c = digestInfo;
        this.f87110d = aSN1Integer;
        this.f87111e = dVCSTime;
    }

    public DVCSCertInfo build() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(10);
        int i10 = this.f87107a;
        if (i10 != 1) {
            aSN1EncodableVector.add(new ASN1Integer(i10));
        }
        aSN1EncodableVector.add(this.f87108b);
        aSN1EncodableVector.add(this.f87109c);
        aSN1EncodableVector.add(this.f87110d);
        aSN1EncodableVector.add(this.f87111e);
        PKIStatusInfo pKIStatusInfo = this.f87112f;
        if (pKIStatusInfo != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, pKIStatusInfo));
        }
        PolicyInformation policyInformation = this.f87113g;
        if (policyInformation != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, policyInformation));
        }
        ASN1Set aSN1Set = this.f87114h;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 2, aSN1Set));
        }
        DERSequence dERSequence = this.f87115i;
        if (dERSequence != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 3, dERSequence));
        }
        Extensions extensions = this.f87116j;
        if (extensions != null) {
            aSN1EncodableVector.add(extensions);
        }
        return DVCSCertInfo.getInstance(new DERSequence(aSN1EncodableVector));
    }

    public void setCerts(TargetEtcChain[] targetEtcChainArr) {
        this.f87115i = new DERSequence(targetEtcChainArr);
    }

    public void setDvReqInfo(DVCSRequestInformation dVCSRequestInformation) {
        this.f87108b = dVCSRequestInformation;
    }

    public void setDvStatus(PKIStatusInfo pKIStatusInfo) {
        this.f87112f = pKIStatusInfo;
    }

    public void setExtensions(Extensions extensions) {
        this.f87116j = extensions;
    }

    public void setMessageImprint(DigestInfo digestInfo) {
        this.f87109c = digestInfo;
    }

    public void setPolicy(PolicyInformation policyInformation) {
        this.f87113g = policyInformation;
    }

    public void setReqSignature(ASN1Set aSN1Set) {
        this.f87114h = aSN1Set;
    }

    public void setResponseTime(DVCSTime dVCSTime) {
        this.f87111e = dVCSTime;
    }

    public void setSerialNumber(ASN1Integer aSN1Integer) {
        this.f87110d = aSN1Integer;
    }

    public void setVersion(int i10) {
        this.f87107a = i10;
    }
}
