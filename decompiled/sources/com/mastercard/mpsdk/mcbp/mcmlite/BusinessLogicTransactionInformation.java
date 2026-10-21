package com.mastercard.mpsdk.mcbp.mcmlite;

/* JADX INFO: loaded from: classes10.dex */
public final class BusinessLogicTransactionInformation {
    public static final long MAX_AMOUNT = 999999999999L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f50762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f50764c;

    public BusinessLogicTransactionInformation() {
    }

    public final long getAmount() {
        return this.f50762a;
    }

    public final int getCurrencyCode() {
        return this.f50763b;
    }

    public final boolean isExactAmount() {
        return this.f50764c;
    }

    public final void setAmount(long j10) {
        this.f50762a = j10;
    }

    public final void setCurrencyCode(int i10) {
        this.f50763b = i10;
    }

    public final void setExactAmount(boolean z10) {
        this.f50764c = z10;
    }

    public BusinessLogicTransactionInformation(long j10, int i10, boolean z10) {
        this.f50762a = j10;
        this.f50763b = i10;
        this.f50764c = z10;
    }
}
