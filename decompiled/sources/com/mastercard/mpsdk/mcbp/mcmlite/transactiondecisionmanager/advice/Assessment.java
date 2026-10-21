package com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice;

/* JADX INFO: loaded from: classes10.dex */
public enum Assessment {
    ABORT(2),
    AGREE(1),
    DECLINE(3),
    ERROR(4);

    private int mPriority;

    Assessment(int i10) {
        this.mPriority = i10;
    }

    public int getSeverityLevel() {
        return this.mPriority;
    }
}
