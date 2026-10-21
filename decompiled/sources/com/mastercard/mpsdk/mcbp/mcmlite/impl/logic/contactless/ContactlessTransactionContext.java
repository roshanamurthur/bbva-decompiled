package com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.contactless;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.DolRequestList;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.DolValues;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.output.TransactionSummary;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;

/* JADX INFO: loaded from: classes10.dex */
public final class ContactlessTransactionContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f50826a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f50827b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f50828c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f50829d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f50830e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f50831f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f50832g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TransactionSummary f50833h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f50834i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f50835j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f50836k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public DolRequestList f50837l;
    public DolRequestList m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f50838n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public DolRequestList f50839o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public byte[] f50840p;

    public final byte[] getAip() {
        return this.f50835j;
    }

    public final byte[] getAmount() {
        return this.f50827b;
    }

    public final byte[] getAtc() {
        return this.f50826a;
    }

    public final DolValues getCdolValues() {
        return DolValues.of(this.f50839o, this.f50840p);
    }

    public final byte[] getCryptogram() {
        return this.f50832g;
    }

    public final byte[] getCurrencyCode() {
        return this.f50828c;
    }

    public final byte[] getPdolData() {
        return this.f50836k;
    }

    public final DolRequestList getPdolList() {
        return this.f50837l;
    }

    public final DolValues getPdolValues() {
        return DolValues.of(this.f50837l, this.f50836k);
    }

    public final TransactionSummary getResult() {
        return this.f50833h;
    }

    public final byte[] getTrxDate() {
        return this.f50829d;
    }

    public final DolRequestList getUdolList() {
        return this.m;
    }

    public final DolValues getUdolValues() {
        return DolValues.of(this.m, this.f50838n);
    }

    public final byte[] getUnpredictableNumber() {
        return this.f50831f;
    }

    public final boolean isAlternateAid() {
        return this.f50834i;
    }

    public final void setAip(byte[] bArr) {
        this.f50835j = bArr;
    }

    public final void setAlternateAid(boolean z10) {
        this.f50834i = z10;
    }

    public final void setAmount(byte[] bArr) {
        this.f50827b = bArr;
    }

    public final void setAtc(byte[] bArr) {
        byte[] bArr2 = this.f50826a;
        if (bArr2 != null) {
            McmLiteUtils.clearByteArray(bArr2);
        }
        this.f50826a = McmLiteUtils.copyValue(bArr);
    }

    public final void setCdolData(byte[] bArr) {
        this.f50840p = bArr;
    }

    public final void setCdolList(DolRequestList dolRequestList) {
        this.f50839o = dolRequestList;
    }

    public final void setCryptogram(byte[] bArr) {
        this.f50832g = bArr;
    }

    public final void setCurrencyCode(byte[] bArr) {
        this.f50828c = bArr;
    }

    public final void setPdolData(byte[] bArr) {
        this.f50836k = bArr;
    }

    public final void setPdolList(DolRequestList dolRequestList) {
        this.f50837l = dolRequestList;
    }

    public final void setResult(TransactionSummary transactionSummary) {
        this.f50833h = transactionSummary;
    }

    public final void setTrxDate(byte[] bArr) {
        this.f50829d = bArr;
    }

    public final void setTrxType(byte[] bArr) {
        this.f50830e = bArr;
    }

    public final void setUdolData(byte[] bArr) {
        this.f50838n = bArr;
    }

    public final void setUdolList(DolRequestList dolRequestList) {
        this.m = dolRequestList;
    }

    public final void setUnpredictableNumber(byte[] bArr) {
        this.f50831f = bArr;
    }

    public final void wipe() {
        McmLiteUtils.clearByteArray(this.f50826a);
        McmLiteUtils.clearByteArray(this.f50827b);
        McmLiteUtils.clearByteArray(this.f50828c);
        McmLiteUtils.clearByteArray(this.f50829d);
        McmLiteUtils.clearByteArray(this.f50830e);
        McmLiteUtils.clearByteArray(this.f50831f);
        McmLiteUtils.clearByteArray(this.f50832g);
        McmLiteUtils.clearByteArray(this.f50835j);
        McmLiteUtils.clearByteArray(this.f50836k);
    }
}
