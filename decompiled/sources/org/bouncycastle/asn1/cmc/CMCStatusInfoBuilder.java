package org.bouncycastle.asn1.cmc;

import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERUTF8String;

/* JADX INFO: loaded from: classes12.dex */
public class CMCStatusInfoBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CMCStatus f86653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DERSequence f86654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DERUTF8String f86655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CMCStatusInfo.OtherInfo f86656d;

    public CMCStatusInfoBuilder(CMCStatus cMCStatus, BodyPartID bodyPartID) {
        this.f86653a = cMCStatus;
        this.f86654b = new DERSequence(bodyPartID);
    }

    public CMCStatusInfo build() {
        return new CMCStatusInfo(this.f86653a, this.f86654b, this.f86655c, this.f86656d);
    }

    public CMCStatusInfoBuilder setOtherInfo(CMCFailInfo cMCFailInfo) {
        this.f86656d = new CMCStatusInfo.OtherInfo(cMCFailInfo, null);
        return this;
    }

    public CMCStatusInfoBuilder setStatusString(String str) {
        this.f86655c = new DERUTF8String(str);
        return this;
    }

    public CMCStatusInfoBuilder(CMCStatus cMCStatus, BodyPartID[] bodyPartIDArr) {
        this.f86653a = cMCStatus;
        this.f86654b = new DERSequence(bodyPartIDArr);
    }

    public CMCStatusInfoBuilder setOtherInfo(PendInfo pendInfo) {
        this.f86656d = new CMCStatusInfo.OtherInfo(null, pendInfo);
        return this;
    }
}
