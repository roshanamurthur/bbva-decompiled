package com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.input;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.DolValues;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.ContactlessLogicException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class TerminalRiskManagementData {
    public static final String TERMINAL_RISK_MANAGEMENT_DATA_TAG = "9F1D";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f51021a;

    public TerminalRiskManagementData(byte[] bArr) {
        if (bArr == null || bArr.length != 8) {
            throw new ContactlessLogicException("Invalid Terminal Risk Management Data");
        }
        this.f51021a = bArr;
    }

    public static TerminalRiskManagementData of(DolValues dolValues) {
        return of(dolValues.getValueByTag("9F1D"));
    }

    public final boolean isCdCvmSupported() {
        return (this.f51021a[0] & 4) == 4;
    }

    public final boolean isSupportedByTheTerminal() {
        return !Arrays.equals(this.f51021a, new byte[8]);
    }

    public static TerminalRiskManagementData of(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new TerminalRiskManagementData(bArr);
    }
}
