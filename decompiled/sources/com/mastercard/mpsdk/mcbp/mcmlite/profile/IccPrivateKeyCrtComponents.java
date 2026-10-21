package com.mastercard.mpsdk.mcbp.mcmlite.profile;

/* JADX INFO: loaded from: classes10.dex */
public interface IccPrivateKeyCrtComponents {
    byte[] getDp();

    byte[] getDq();

    byte[] getP();

    byte[] getQ();

    byte[] getU();

    void wipe();
}
