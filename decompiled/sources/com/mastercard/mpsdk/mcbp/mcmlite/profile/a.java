package com.mastercard.mpsdk.mcbp.mcmlite.profile;

/* JADX INFO: compiled from: McmLiteProfileBuilder.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements ContactlessPaymentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Record[] f51013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ McmLiteProfileBuilder f51014b;

    public a(McmLiteProfileBuilder mcmLiteProfileBuilder, Record[] recordArr) {
        this.f51014b = mcmLiteProfileBuilder;
        this.f51013a = recordArr;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public final byte[] getAid() {
        return this.f51014b.f50976e.f51011i;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public final AlternateContactlessPaymentData getAlternateContactlessPaymentData() {
        return this.f51014b.f50975d;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public final int getCdol1RelatedDataLength() {
        return this.f51014b.f50976e.f51005c;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public final byte[] getCiacDecline() {
        return this.f51014b.f50976e.f51006d;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public final byte[] getCiacDeclineOnPpms() {
        return this.f51014b.f50976e.f51007e;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public final byte[] getCvrMaskAnd() {
        return this.f51014b.f50976e.f51010h;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public final byte[] getGpoResponse() {
        return this.f51014b.f50976e.f51004b;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public final IccPrivateKeyCrtComponents getIccPrivateKeyCrtComponents() {
        return this.f51014b.f50973b;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public final byte[] getIssuerApplicationData() {
        return this.f51014b.f50976e.f51003a;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public final byte[] getPaymentFci() {
        return this.f51014b.f50976e.f51008f;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public final byte[] getPinIvCvc3Track2() {
        return this.f51014b.f50976e.f51012j;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public final byte[] getPpseFci() {
        return this.f51014b.f50976e.f51009g;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public final Record[] getRecords() {
        return this.f51013a;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public final boolean isAlternateAidMchipDataValid() {
        byte[] bArr;
        byte[] bArr2;
        McmLiteProfileBuilder.e eVar = this.f51014b.f50975d;
        return eVar != null && (bArr = eVar.f51000e) != null && bArr.length == 3 && (bArr2 = eVar.f50998c) != null && bArr2.length == 6 && isPrimaryAidMchipDataValid();
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public final boolean isMagstripeDataValid() {
        byte[] bArr;
        McmLiteProfileBuilder.g gVar = this.f51014b.f50976e;
        byte[] bArr2 = gVar.f51012j;
        return bArr2 != null && bArr2.length == 2 && (bArr = gVar.f51007e) != null && bArr.length == 2;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public final boolean isPrimaryAidMchipDataValid() {
        byte[] bArr;
        byte[] bArr2;
        McmLiteProfileBuilder.d dVar;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        McmLiteProfileBuilder mcmLiteProfileBuilder = this.f51014b;
        McmLiteProfileBuilder.g gVar = mcmLiteProfileBuilder.f50976e;
        byte[] bArr8 = gVar.f51006d;
        return (bArr8 == null || bArr8.length != 3 || (bArr = gVar.f51010h) == null || bArr.length != 6 || gVar.f51005c < 45 || (bArr2 = gVar.f51003a) == null || bArr2.length != 18 || (dVar = mcmLiteProfileBuilder.f50973b) == null || (bArr3 = dVar.f50991a) == null || bArr3.length == 0 || (bArr4 = dVar.f50992b) == null || bArr4.length == 0 || (bArr5 = dVar.f50993c) == null || bArr5.length == 0 || (bArr6 = dVar.f50994d) == null || bArr6.length == 0 || (bArr7 = dVar.f50995e) == null || bArr7.length == 0) ? false : true;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData
    public final void wipe() {
    }
}
