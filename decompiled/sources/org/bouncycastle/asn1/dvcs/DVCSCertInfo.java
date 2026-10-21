package org.bouncycastle.asn1.dvcs;

import androidx.appcompat.widget.g0;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cmp.PKIStatusInfo;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.PolicyInformation;

/* JADX INFO: loaded from: classes12.dex */
public class DVCSCertInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f87098p0 = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public DVCSRequestInformation f87099q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public DigestInfo f87100r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ASN1Integer f87101s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public DVCSTime f87102t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public PKIStatusInfo f87103u0;
    public PolicyInformation v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ASN1Set f87104w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ASN1Sequence f87105x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public Extensions f87106y0;

    public DVCSCertInfo(DVCSRequestInformation dVCSRequestInformation, DigestInfo digestInfo, ASN1Integer aSN1Integer, DVCSTime dVCSTime) {
        this.f87099q0 = dVCSRequestInformation;
        this.f87100r0 = digestInfo;
        this.f87101s0 = aSN1Integer;
        this.f87102t0 = dVCSTime;
    }

    public static DVCSCertInfo getInstance(Object obj) {
        int i10;
        if (obj instanceof DVCSCertInfo) {
            return (DVCSCertInfo) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        DVCSCertInfo dVCSCertInfo = new DVCSCertInfo();
        dVCSCertInfo.f87098p0 = 1;
        ASN1Encodable objectAt = aSN1Sequence.getObjectAt(0);
        try {
            dVCSCertInfo.f87098p0 = ASN1Integer.getInstance(objectAt).intValueExact();
            try {
                objectAt = aSN1Sequence.getObjectAt(1);
            } catch (IllegalArgumentException unused) {
            }
            i10 = 2;
        } catch (IllegalArgumentException unused2) {
            i10 = 1;
        }
        dVCSCertInfo.f87099q0 = DVCSRequestInformation.getInstance(objectAt);
        dVCSCertInfo.f87100r0 = DigestInfo.getInstance(aSN1Sequence.getObjectAt(i10));
        int i11 = i10 + 2;
        dVCSCertInfo.f87101s0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i10 + 1));
        int i12 = i10 + 3;
        dVCSCertInfo.f87102t0 = DVCSTime.getInstance(aSN1Sequence.getObjectAt(i11));
        while (i12 < aSN1Sequence.size()) {
            int i13 = i12 + 1;
            ASN1Encodable objectAt2 = aSN1Sequence.getObjectAt(i12);
            if (objectAt2 instanceof ASN1TaggedObject) {
                ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objectAt2);
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    dVCSCertInfo.f87103u0 = PKIStatusInfo.getInstance(aSN1TaggedObject, false);
                } else if (tagNo == 1) {
                    dVCSCertInfo.v0 = PolicyInformation.getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, false));
                } else if (tagNo == 2) {
                    dVCSCertInfo.f87104w0 = ASN1Set.getInstance(aSN1TaggedObject, false);
                } else {
                    if (tagNo != 3) {
                        throw new IllegalArgumentException(g0.c("Unknown tag encountered: ", tagNo));
                    }
                    dVCSCertInfo.f87105x0 = ASN1Sequence.getInstance(aSN1TaggedObject, false);
                }
            } else {
                try {
                    dVCSCertInfo.f87106y0 = Extensions.getInstance(objectAt2);
                } catch (IllegalArgumentException unused3) {
                }
            }
            i12 = i13;
        }
        return dVCSCertInfo;
    }

    public TargetEtcChain[] getCerts() {
        ASN1Sequence aSN1Sequence = this.f87105x0;
        if (aSN1Sequence != null) {
            return TargetEtcChain.arrayFromSequence(aSN1Sequence);
        }
        return null;
    }

    public DVCSRequestInformation getDvReqInfo() {
        return this.f87099q0;
    }

    public PKIStatusInfo getDvStatus() {
        return this.f87103u0;
    }

    public Extensions getExtensions() {
        return this.f87106y0;
    }

    public DigestInfo getMessageImprint() {
        return this.f87100r0;
    }

    public PolicyInformation getPolicy() {
        return this.v0;
    }

    public ASN1Set getReqSignature() {
        return this.f87104w0;
    }

    public DVCSTime getResponseTime() {
        return this.f87102t0;
    }

    public ASN1Integer getSerialNumber() {
        return this.f87101s0;
    }

    public int getVersion() {
        return this.f87098p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(10);
        int i10 = this.f87098p0;
        if (i10 != 1) {
            aSN1EncodableVector.add(new ASN1Integer(i10));
        }
        aSN1EncodableVector.add(this.f87099q0);
        aSN1EncodableVector.add(this.f87100r0);
        aSN1EncodableVector.add(this.f87101s0);
        aSN1EncodableVector.add(this.f87102t0);
        PKIStatusInfo pKIStatusInfo = this.f87103u0;
        if (pKIStatusInfo != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, pKIStatusInfo));
        }
        PolicyInformation policyInformation = this.v0;
        if (policyInformation != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, policyInformation));
        }
        ASN1Set aSN1Set = this.f87104w0;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 2, aSN1Set));
        }
        ASN1Sequence aSN1Sequence = this.f87105x0;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 3, aSN1Sequence));
        }
        Extensions extensions = this.f87106y0;
        if (extensions != null) {
            aSN1EncodableVector.add(extensions);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("DVCSCertInfo {\n");
        int i10 = this.f87098p0;
        if (i10 != 1) {
            stringBuffer.append("version: " + i10 + RootService.LINE_BREAK);
        }
        stringBuffer.append("dvReqInfo: " + this.f87099q0 + RootService.LINE_BREAK);
        stringBuffer.append("messageImprint: " + this.f87100r0 + RootService.LINE_BREAK);
        stringBuffer.append("serialNumber: " + this.f87101s0 + RootService.LINE_BREAK);
        stringBuffer.append("responseTime: " + this.f87102t0 + RootService.LINE_BREAK);
        PKIStatusInfo pKIStatusInfo = this.f87103u0;
        if (pKIStatusInfo != null) {
            stringBuffer.append("dvStatus: " + pKIStatusInfo + RootService.LINE_BREAK);
        }
        PolicyInformation policyInformation = this.v0;
        if (policyInformation != null) {
            stringBuffer.append("policy: " + policyInformation + RootService.LINE_BREAK);
        }
        ASN1Set aSN1Set = this.f87104w0;
        if (aSN1Set != null) {
            stringBuffer.append("reqSignature: " + aSN1Set + RootService.LINE_BREAK);
        }
        ASN1Sequence aSN1Sequence = this.f87105x0;
        if (aSN1Sequence != null) {
            stringBuffer.append("certs: " + aSN1Sequence + RootService.LINE_BREAK);
        }
        Extensions extensions = this.f87106y0;
        if (extensions != null) {
            stringBuffer.append("extensions: " + extensions + RootService.LINE_BREAK);
        }
        stringBuffer.append("}\n");
        return stringBuffer.toString();
    }

    public static DVCSCertInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
