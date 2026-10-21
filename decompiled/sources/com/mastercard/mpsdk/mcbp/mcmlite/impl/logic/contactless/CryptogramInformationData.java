package com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.contactless;

/* JADX INFO: loaded from: classes10.dex */
public class CryptogramInformationData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f50841a = 0;

    public byte getValue() {
        return this.f50841a;
    }

    public void indicateDecline() {
        this.f50841a = (byte) 0;
    }

    public void indicateOnlineDecision() {
        this.f50841a = (byte) -128;
    }
}
