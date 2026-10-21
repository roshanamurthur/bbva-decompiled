package com.mastercard.mpsdk.mcbp.mcmlite.profile;

import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class McmLiteProfileBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f50972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f50973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f50974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f50975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f50976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f50977f = new ArrayList();

    public class d implements IccPrivateKeyCrtComponents {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f50991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ byte[] f50992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte[] f50993c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ byte[] f50994d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ byte[] f50995e;

        public d(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
            this.f50991a = bArr;
            this.f50992b = bArr2;
            this.f50993c = bArr3;
            this.f50994d = bArr4;
            this.f50995e = bArr5;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.IccPrivateKeyCrtComponents
        public final byte[] getDp() {
            return this.f50993c;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.IccPrivateKeyCrtComponents
        public final byte[] getDq() {
            return this.f50994d;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.IccPrivateKeyCrtComponents
        public final byte[] getP() {
            return this.f50991a;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.IccPrivateKeyCrtComponents
        public final byte[] getQ() {
            return this.f50992b;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.IccPrivateKeyCrtComponents
        public final byte[] getU() {
            return this.f50995e;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.IccPrivateKeyCrtComponents
        public final void wipe() {
            McmLiteUtils.clearByteArray(this.f50991a);
            McmLiteUtils.clearByteArray(this.f50992b);
            McmLiteUtils.clearByteArray(this.f50993c);
            McmLiteUtils.clearByteArray(this.f50994d);
            McmLiteUtils.clearByteArray(this.f50995e);
        }
    }

    public class f implements McmLiteProfile {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ContactlessPaymentData f51001a;

        public f(com.mastercard.mpsdk.mcbp.mcmlite.profile.a aVar) {
            this.f51001a = aVar;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.McmLiteProfile
        public final CardRiskManagementData getCardRiskManagementData() {
            return McmLiteProfileBuilder.this.f50974c;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.McmLiteProfile
        public final ContactlessPaymentData getContactlessPaymentData() {
            return this.f51001a;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.McmLiteProfile
        public final RemotePaymentData getRemotePaymentData() {
            return McmLiteProfileBuilder.this.f50972a;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.McmLiteProfile
        public final void wipe() {
            this.f51001a.wipe();
            McmLiteProfileBuilder mcmLiteProfileBuilder = McmLiteProfileBuilder.this;
            mcmLiteProfileBuilder.f50972a.getClass();
            mcmLiteProfileBuilder.f50974c.getClass();
        }
    }

    public class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f51003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f51004b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f51005c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f51006d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f51007e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final byte[] f51008f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final byte[] f51009g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final byte[] f51010h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final byte[] f51011i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final byte[] f51012j;

        public g(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte[] bArr9) {
            this.f51003a = bArr;
            this.f51004b = bArr2;
            this.f51005c = i10;
            this.f51006d = bArr3;
            this.f51007e = bArr4;
            this.f51008f = bArr5;
            this.f51009g = bArr6;
            this.f51010h = bArr7;
            this.f51011i = bArr8;
            this.f51012j = bArr9;
        }
    }

    public McmLiteProfile build() {
        ArrayList arrayList = this.f50977f;
        int size = arrayList.size();
        Record[] recordArr = new Record[size];
        for (int i10 = 0; i10 < size; i10++) {
            recordArr[i10] = (Record) arrayList.get(i10);
        }
        return new f(new com.mastercard.mpsdk.mcbp.mcmlite.profile.a(this, recordArr));
    }

    public McmLiteProfileBuilder withAlternateContactlessPaymentData(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f50975d = new e(bArr, bArr2, bArr3, bArr4, bArr5);
        return this;
    }

    public McmLiteProfileBuilder withCardRiskManagementData(byte[] bArr, byte[] bArr2) {
        this.f50974c = new a(bArr, bArr2);
        return this;
    }

    public McmLiteProfileBuilder withContactlessPaymentData(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte[] bArr9) {
        this.f50976e = new g(bArr, bArr2, i10, bArr3, bArr4, bArr5, bArr6, bArr7, bArr8, bArr9);
        return this;
    }

    public McmLiteProfileBuilder withIccPrivateKeyComponents(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f50973b = new d(bArr, bArr2, bArr3, bArr4, bArr5);
        return this;
    }

    public McmLiteProfileBuilder withRecord(byte b10, byte b11, byte[] bArr) {
        this.f50977f.add(new c(b10, b11, bArr));
        return this;
    }

    public McmLiteProfileBuilder withRemotePaymentData(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8) {
        this.f50972a = new b(bArr, bArr2, bArr3, bArr4, bArr5, bArr6, bArr7, bArr8);
        return this;
    }

    public class a implements CardRiskManagementData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f50978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ byte[] f50979b;

        public a(byte[] bArr, byte[] bArr2) {
            this.f50978a = bArr;
            this.f50979b = bArr2;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.CardRiskManagementData
        public final byte[] getAdditionalCheckTable() {
            return this.f50978a;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.CardRiskManagementData
        public final byte[] getCrmCountryCode() {
            return this.f50979b;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.CardRiskManagementData
        public final void wipe() {
        }
    }

    public class b implements RemotePaymentData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f50980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ byte[] f50981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte[] f50982c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ byte[] f50983d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ byte[] f50984e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ byte[] f50985f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ byte[] f50986g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ byte[] f50987h;

        public b(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8) {
            this.f50980a = bArr;
            this.f50981b = bArr2;
            this.f50982c = bArr3;
            this.f50983d = bArr4;
            this.f50984e = bArr5;
            this.f50985f = bArr6;
            this.f50986g = bArr7;
            this.f50987h = bArr8;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.RemotePaymentData
        public final byte[] getAip() {
            return this.f50987h;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.RemotePaymentData
        public final byte[] getApplicationExpiryDate() {
            return this.f50983d;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.RemotePaymentData
        public final byte[] getCiacDecline() {
            return this.f50986g;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.RemotePaymentData
        public final byte[] getCvrMaskAnd() {
            return this.f50982c;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.RemotePaymentData
        public final byte[] getIssuerApplicationData() {
            return this.f50981b;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.RemotePaymentData
        public final byte[] getPan() {
            return this.f50980a;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.RemotePaymentData
        public final byte[] getPanSequenceNumber() {
            return this.f50985f;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.RemotePaymentData
        public final byte[] getTrack2EquivalentData() {
            return this.f50984e;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.RemotePaymentData
        public final void wipe() {
        }
    }

    public class c implements Record {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte f50988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ byte f50989b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte[] f50990c;

        public c(byte b10, byte b11, byte[] bArr) {
            this.f50988a = b10;
            this.f50989b = b11;
            this.f50990c = bArr;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.Record
        public final byte getRecordNumber() {
            return this.f50988a;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.Record
        public final byte[] getRecordValue() {
            return this.f50990c;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.Record
        public final byte getSfi() {
            return this.f50989b;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.Record
        public final void wipe() {
        }
    }

    public class e implements AlternateContactlessPaymentData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f50996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ byte[] f50997b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte[] f50998c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ byte[] f50999d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ byte[] f51000e;

        public e(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
            this.f50996a = bArr;
            this.f50997b = bArr2;
            this.f50998c = bArr3;
            this.f50999d = bArr4;
            this.f51000e = bArr5;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.AlternateContactlessPaymentData
        public final byte[] getAid() {
            return this.f50999d;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.AlternateContactlessPaymentData
        public final byte[] getCiacDecline() {
            return this.f51000e;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.AlternateContactlessPaymentData
        public final byte[] getCvrMaskAnd() {
            return this.f50998c;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.AlternateContactlessPaymentData
        public final byte[] getGpoResponse() {
            return this.f50997b;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.AlternateContactlessPaymentData
        public final byte[] getPaymentFci() {
            return this.f50996a;
        }

        @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.AlternateContactlessPaymentData
        public final void wipe() {
        }
    }
}
