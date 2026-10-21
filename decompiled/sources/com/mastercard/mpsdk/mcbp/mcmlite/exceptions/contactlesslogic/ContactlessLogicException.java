package com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ResponseApduFactory;

/* JADX INFO: loaded from: classes10.dex */
public class ContactlessLogicException extends RuntimeException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f50809p0;

    public ContactlessLogicException(String str) {
        super(str);
        this.f50809p0 = ResponseApduFactory.softwareUnknown();
    }

    public final byte[] getIso7816StatusWordApdu() {
        return this.f50809p0;
    }

    public ContactlessLogicException(String str, byte[] bArr) {
        super(str);
        this.f50809p0 = bArr;
    }
}
