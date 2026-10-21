package com.mastercard.mpsdk.mcbp.mcmlite.profile;

/* JADX INFO: loaded from: classes10.dex */
public interface Record {
    byte getRecordNumber();

    byte[] getRecordValue();

    byte getSfi();

    void wipe();
}
