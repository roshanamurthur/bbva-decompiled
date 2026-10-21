package com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.input.CvmResults;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.input.MobileSupportIndicator;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.input.TerminalCapabilities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class ExpectedUserActionOnPoi {
    private static final /* synthetic */ ExpectedUserActionOnPoi[] $VALUES;
    public static final ExpectedUserActionOnPoi NONE;
    public static final ExpectedUserActionOnPoi ONLINE_PIN;
    public static final ExpectedUserActionOnPoi ONLINE_PIN_OR_SIGNATURE;
    public static final ExpectedUserActionOnPoi SIGNATURE;
    public static final ExpectedUserActionOnPoi UNKNOWN;

    static {
        ExpectedUserActionOnPoi expectedUserActionOnPoi = new ExpectedUserActionOnPoi(ExpectedUserActionOnPoiTypes.NONE, 0);
        NONE = expectedUserActionOnPoi;
        ExpectedUserActionOnPoi expectedUserActionOnPoi2 = new ExpectedUserActionOnPoi(ExpectedUserActionOnPoiTypes.ONLINE_PIN, 1);
        ONLINE_PIN = expectedUserActionOnPoi2;
        ExpectedUserActionOnPoi expectedUserActionOnPoi3 = new ExpectedUserActionOnPoi(ExpectedUserActionOnPoiTypes.SIGNATURE, 2);
        SIGNATURE = expectedUserActionOnPoi3;
        ExpectedUserActionOnPoi expectedUserActionOnPoi4 = new ExpectedUserActionOnPoi("ONLINE_PIN_OR_SIGNATURE", 3);
        ONLINE_PIN_OR_SIGNATURE = expectedUserActionOnPoi4;
        ExpectedUserActionOnPoi expectedUserActionOnPoi5 = new ExpectedUserActionOnPoi("UNKNOWN", 4);
        UNKNOWN = expectedUserActionOnPoi5;
        $VALUES = new ExpectedUserActionOnPoi[]{expectedUserActionOnPoi, expectedUserActionOnPoi2, expectedUserActionOnPoi3, expectedUserActionOnPoi4, expectedUserActionOnPoi5};
    }

    public ExpectedUserActionOnPoi() {
        throw null;
    }

    public static ExpectedUserActionOnPoi forMagstripe(MobileSupportIndicator mobileSupportIndicator, TerminalCapabilities terminalCapabilities) {
        if (terminalCapabilities == null) {
            return mobileSupportIndicator.isCdCvmRequired() ? NONE : UNKNOWN;
        }
        if (terminalCapabilities.isNoCvmOnlySupported() || mobileSupportIndicator.isCdCvmRequired()) {
            return NONE;
        }
        if (terminalCapabilities.isOnlinePinAndSignature()) {
            return ONLINE_PIN_OR_SIGNATURE;
        }
        if (terminalCapabilities.isOnlinePinOnly()) {
            return ONLINE_PIN;
        }
        return terminalCapabilities.isSignatureOnly() ? SIGNATURE : UNKNOWN;
    }

    public static ExpectedUserActionOnPoi forMchip(CvmResults cvmResults) {
        if (cvmResults == null) {
            return UNKNOWN;
        }
        if (cvmResults.isNoCvmToBePerformed() || cvmResults.isCdCvmOnlyToBePerformed()) {
            return NONE;
        }
        if (cvmResults.isOnlinePinToBePerformed()) {
            return ONLINE_PIN;
        }
        return cvmResults.isSignatureToBePerformed() ? SIGNATURE : UNKNOWN;
    }

    public static ExpectedUserActionOnPoi forRemotePayment() {
        return NONE;
    }

    public static ExpectedUserActionOnPoi valueOf(String str) {
        return (ExpectedUserActionOnPoi) Enum.valueOf(ExpectedUserActionOnPoi.class, str);
    }

    public static ExpectedUserActionOnPoi[] values() {
        return (ExpectedUserActionOnPoi[]) $VALUES.clone();
    }
}
