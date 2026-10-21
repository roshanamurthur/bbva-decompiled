package org.bouncycastle.asn1.dvcs;

import ad.d;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cmp.PKIStatusInfo;
import org.bouncycastle.asn1.x509.GeneralName;

/* JADX INFO: loaded from: classes12.dex */
public class DVCSErrorNotice extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public PKIStatusInfo f87117p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public GeneralName f87118q0;

    public DVCSErrorNotice(PKIStatusInfo pKIStatusInfo) {
        this(pKIStatusInfo, null);
    }

    public static DVCSErrorNotice getInstance(Object obj) {
        if (obj instanceof DVCSErrorNotice) {
            return (DVCSErrorNotice) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        DVCSErrorNotice dVCSErrorNotice = new DVCSErrorNotice();
        dVCSErrorNotice.f87117p0 = PKIStatusInfo.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            dVCSErrorNotice.f87118q0 = GeneralName.getInstance(aSN1Sequence.getObjectAt(1));
        }
        return dVCSErrorNotice;
    }

    public GeneralName getTransactionIdentifier() {
        return this.f87118q0;
    }

    public PKIStatusInfo getTransactionStatus() {
        return this.f87117p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87117p0);
        GeneralName generalName = this.f87118q0;
        if (generalName != null) {
            aSN1EncodableVector.add(generalName);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DVCSErrorNotice {\ntransactionStatus: ");
        sb2.append(this.f87117p0);
        sb2.append(RootService.LINE_BREAK);
        GeneralName generalName = this.f87118q0;
        if (generalName != null) {
            str = "transactionIdentifier: " + generalName + RootService.LINE_BREAK;
        } else {
            str = "";
        }
        return d.f(sb2, str, "}\n");
    }

    public DVCSErrorNotice(PKIStatusInfo pKIStatusInfo, GeneralName generalName) {
        this.f87117p0 = pKIStatusInfo;
        this.f87118q0 = generalName;
    }

    public static DVCSErrorNotice getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
