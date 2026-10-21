package org.bouncycastle.asn1.dvcs;

import androidx.appcompat.widget.g0;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.PolicyInformation;

/* JADX INFO: loaded from: classes12.dex */
public class DVCSRequestInformation extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f87122p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ServiceType f87123q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public BigInteger f87124r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public DVCSTime f87125s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public GeneralNames f87126t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public PolicyInformation f87127u0;
    public GeneralNames v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public GeneralNames f87128w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Extensions f87129x0;

    public static DVCSRequestInformation getInstance(Object obj) {
        int i10;
        if (obj instanceof DVCSRequestInformation) {
            return (DVCSRequestInformation) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        DVCSRequestInformation dVCSRequestInformation = new DVCSRequestInformation();
        dVCSRequestInformation.f87122p0 = 1;
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1Integer) {
            dVCSRequestInformation.f87122p0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).intValueExact();
            i10 = 1;
        } else {
            dVCSRequestInformation.f87122p0 = 1;
            i10 = 0;
        }
        dVCSRequestInformation.f87123q0 = ServiceType.getInstance(aSN1Sequence.getObjectAt(i10));
        for (int i11 = i10 + 1; i11 < aSN1Sequence.size(); i11++) {
            ASN1Encodable objectAt = aSN1Sequence.getObjectAt(i11);
            if (objectAt instanceof ASN1Integer) {
                dVCSRequestInformation.f87124r0 = ASN1Integer.getInstance(objectAt).getValue();
            } else if (!(objectAt instanceof ASN1GeneralizedTime) && (objectAt instanceof ASN1TaggedObject)) {
                ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objectAt);
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    dVCSRequestInformation.f87126t0 = GeneralNames.getInstance(aSN1TaggedObject, false);
                } else if (tagNo == 1) {
                    dVCSRequestInformation.f87127u0 = PolicyInformation.getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, false));
                } else if (tagNo == 2) {
                    dVCSRequestInformation.v0 = GeneralNames.getInstance(aSN1TaggedObject, false);
                } else if (tagNo == 3) {
                    dVCSRequestInformation.f87128w0 = GeneralNames.getInstance(aSN1TaggedObject, false);
                } else {
                    if (tagNo != 4) {
                        throw new IllegalArgumentException(g0.c("unknown tag number encountered: ", tagNo));
                    }
                    dVCSRequestInformation.f87129x0 = Extensions.getInstance(aSN1TaggedObject, false);
                }
            } else {
                dVCSRequestInformation.f87125s0 = DVCSTime.getInstance(objectAt);
            }
        }
        return dVCSRequestInformation;
    }

    public GeneralNames getDVCS() {
        return this.v0;
    }

    public GeneralNames getDataLocations() {
        return this.f87128w0;
    }

    public Extensions getExtensions() {
        return this.f87129x0;
    }

    public BigInteger getNonce() {
        return this.f87124r0;
    }

    public PolicyInformation getRequestPolicy() {
        return this.f87127u0;
    }

    public DVCSTime getRequestTime() {
        return this.f87125s0;
    }

    public GeneralNames getRequester() {
        return this.f87126t0;
    }

    public ServiceType getService() {
        return this.f87123q0;
    }

    public int getVersion() {
        return this.f87122p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(9);
        int i10 = this.f87122p0;
        if (i10 != 1) {
            aSN1EncodableVector.add(new ASN1Integer(i10));
        }
        aSN1EncodableVector.add(this.f87123q0);
        BigInteger bigInteger = this.f87124r0;
        if (bigInteger != null) {
            aSN1EncodableVector.add(new ASN1Integer(bigInteger));
        }
        DVCSTime dVCSTime = this.f87125s0;
        if (dVCSTime != null) {
            aSN1EncodableVector.add(dVCSTime);
        }
        int[] iArr = {0, 1, 2, 3, 4};
        ASN1Encodable[] aSN1EncodableArr = {this.f87126t0, this.f87127u0, this.v0, this.f87128w0, this.f87129x0};
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            ASN1Encodable aSN1Encodable = aSN1EncodableArr[i11];
            if (aSN1Encodable != null) {
                aSN1EncodableVector.add(new DERTaggedObject(false, i12, aSN1Encodable));
            }
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("DVCSRequestInformation {\n");
        int i10 = this.f87122p0;
        if (i10 != 1) {
            stringBuffer.append("version: " + i10 + RootService.LINE_BREAK);
        }
        stringBuffer.append("service: " + this.f87123q0 + RootService.LINE_BREAK);
        BigInteger bigInteger = this.f87124r0;
        if (bigInteger != null) {
            stringBuffer.append("nonce: " + bigInteger + RootService.LINE_BREAK);
        }
        DVCSTime dVCSTime = this.f87125s0;
        if (dVCSTime != null) {
            stringBuffer.append("requestTime: " + dVCSTime + RootService.LINE_BREAK);
        }
        GeneralNames generalNames = this.f87126t0;
        if (generalNames != null) {
            stringBuffer.append("requester: " + generalNames + RootService.LINE_BREAK);
        }
        PolicyInformation policyInformation = this.f87127u0;
        if (policyInformation != null) {
            stringBuffer.append("requestPolicy: " + policyInformation + RootService.LINE_BREAK);
        }
        GeneralNames generalNames2 = this.v0;
        if (generalNames2 != null) {
            stringBuffer.append("dvcs: " + generalNames2 + RootService.LINE_BREAK);
        }
        GeneralNames generalNames3 = this.f87128w0;
        if (generalNames3 != null) {
            stringBuffer.append("dataLocations: " + generalNames3 + RootService.LINE_BREAK);
        }
        Extensions extensions = this.f87129x0;
        if (extensions != null) {
            stringBuffer.append("extensions: " + extensions + RootService.LINE_BREAK);
        }
        stringBuffer.append("}\n");
        return stringBuffer.toString();
    }

    public static DVCSRequestInformation getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
