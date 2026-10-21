package com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.input;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.DolValues;

/* JADX INFO: loaded from: classes10.dex */
public final class MobileSupportIndicator {
    public static final String MOBILE_SUPPORT_INDICATOR_TAG = "9F7E";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f51019a;

    public MobileSupportIndicator(byte b10) {
        this.f51019a = b10;
    }

    public static MobileSupportIndicator of(byte b10) {
        return new MobileSupportIndicator(b10);
    }

    public final boolean isCdCvmRequired() {
        return (this.f51019a & 2) == 2;
    }

    public final boolean isMobileSupported() {
        return (this.f51019a & 1) == 1;
    }

    public final boolean isSupportedByTheTerminal() {
        return (this.f51019a & 3) != 0;
    }

    public static MobileSupportIndicator of(DolValues dolValues) {
        byte[] valueByTag = dolValues.getValueByTag("9F7E");
        byte b10 = 0;
        if (valueByTag != null && valueByTag.length >= 1) {
            b10 = valueByTag[0];
        }
        return of(b10);
    }
}
