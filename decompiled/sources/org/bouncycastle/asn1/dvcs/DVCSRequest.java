package org.bouncycastle.asn1.dvcs;

import ad.d;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.GeneralName;

/* JADX INFO: loaded from: classes12.dex */
public class DVCSRequest extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public DVCSRequestInformation f87119p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Data f87120q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public GeneralName f87121r0;

    public DVCSRequest(DVCSRequestInformation dVCSRequestInformation, Data data) {
        this(dVCSRequestInformation, data, null);
    }

    public static DVCSRequest getInstance(Object obj) {
        if (obj instanceof DVCSRequest) {
            return (DVCSRequest) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        DVCSRequest dVCSRequest = new DVCSRequest();
        dVCSRequest.f87119p0 = DVCSRequestInformation.getInstance(aSN1Sequence.getObjectAt(0));
        dVCSRequest.f87120q0 = Data.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() > 2) {
            dVCSRequest.f87121r0 = GeneralName.getInstance(aSN1Sequence.getObjectAt(2));
        }
        return dVCSRequest;
    }

    public Data getData() {
        return this.f87120q0;
    }

    public DVCSRequestInformation getRequestInformation() {
        return this.f87119p0;
    }

    public GeneralName getTransactionIdentifier() {
        return this.f87121r0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f87119p0);
        aSN1EncodableVector.add(this.f87120q0);
        GeneralName generalName = this.f87121r0;
        if (generalName != null) {
            aSN1EncodableVector.add(generalName);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DVCSRequest {\nrequestInformation: ");
        sb2.append(this.f87119p0);
        sb2.append("\ndata: ");
        sb2.append(this.f87120q0);
        sb2.append(RootService.LINE_BREAK);
        GeneralName generalName = this.f87121r0;
        if (generalName != null) {
            str = "transactionIdentifier: " + generalName + RootService.LINE_BREAK;
        } else {
            str = "";
        }
        return d.f(sb2, str, "}\n");
    }

    public DVCSRequest(DVCSRequestInformation dVCSRequestInformation, Data data, GeneralName generalName) {
        this.f87119p0 = dVCSRequestInformation;
        this.f87120q0 = data;
        this.f87121r0 = generalName;
    }

    public static DVCSRequest getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
