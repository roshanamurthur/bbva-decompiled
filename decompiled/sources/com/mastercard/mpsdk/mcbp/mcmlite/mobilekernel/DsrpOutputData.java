package com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel;

import com.mastercard.mpsdk.mcbp.mcmlite.utils.Date;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;

/* JADX INFO: loaded from: classes10.dex */
public class DsrpOutputData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Date f50952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f50953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f50954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CryptogramType f50955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f50956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f50957h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f50958i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f50959j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f50960k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f50961l;

    public DsrpOutputData(String str, int i10, Date date, byte[] bArr, byte[] bArr2, int i11, long j10, int i12, int i13, long j11, CryptogramType cryptogramType, String str2) {
        this.f50950a = str;
        this.f50951b = i10;
        this.f50952c = date;
        this.f50953d = bArr;
        this.f50954e = bArr2;
        this.f50956g = i11;
        this.f50957h = j10;
        this.f50958i = i12;
        this.f50959j = i13;
        this.f50960k = j11;
        this.f50955f = cryptogramType;
        this.f50961l = str2;
    }

    public int getAtc() {
        return this.f50959j;
    }

    public byte[] getCryptogram() {
        return this.f50953d;
    }

    public CryptogramType getCryptogramType() {
        return this.f50955f;
    }

    public int getCurrencyCode() {
        return this.f50958i;
    }

    public Date getExpiryDate() {
        return this.f50952c;
    }

    public String getPan() {
        return this.f50950a;
    }

    public int getPanSequenceNumber() {
        return this.f50951b;
    }

    public String getTrack2Data() {
        return this.f50961l;
    }

    public long getTransactionAmount() {
        return this.f50957h;
    }

    public byte[] getTransactionCryptogramData() {
        return this.f50954e;
    }

    public int getUcafVersion() {
        return this.f50956g;
    }

    public long getUnpredictableNumber() {
        return this.f50960k;
    }

    public void wipe() {
        McmLiteUtils.clearByteArray(this.f50953d);
        McmLiteUtils.clearByteArray(this.f50954e);
    }
}
