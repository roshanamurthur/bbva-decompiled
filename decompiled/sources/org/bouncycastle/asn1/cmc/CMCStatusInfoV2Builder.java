package org.bouncycastle.asn1.cmc;

import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERUTF8String;

/* JADX INFO: loaded from: classes12.dex */
public class CMCStatusInfoV2Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CMCStatus f86661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DERSequence f86662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DERUTF8String f86663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OtherStatusInfo f86664d;

    public CMCStatusInfoV2Builder(CMCStatus cMCStatus, BodyPartID bodyPartID) {
        this.f86661a = cMCStatus;
        this.f86662b = new DERSequence(bodyPartID);
    }

    public CMCStatusInfoV2 build() {
        return new CMCStatusInfoV2(this.f86661a, this.f86662b, this.f86663c, this.f86664d);
    }

    public CMCStatusInfoV2Builder setOtherInfo(CMCFailInfo cMCFailInfo) {
        this.f86664d = new OtherStatusInfo(cMCFailInfo, null, null);
        return this;
    }

    public CMCStatusInfoV2Builder setStatusString(String str) {
        this.f86663c = new DERUTF8String(str);
        return this;
    }

    public CMCStatusInfoV2Builder(CMCStatus cMCStatus, BodyPartID[] bodyPartIDArr) {
        this.f86661a = cMCStatus;
        this.f86662b = new DERSequence(bodyPartIDArr);
    }

    public CMCStatusInfoV2Builder setOtherInfo(ExtendedFailInfo extendedFailInfo) {
        this.f86664d = new OtherStatusInfo(null, null, extendedFailInfo);
        return this;
    }

    public CMCStatusInfoV2Builder setOtherInfo(PendInfo pendInfo) {
        this.f86664d = new OtherStatusInfo(null, pendInfo, null);
        return this;
    }
}
