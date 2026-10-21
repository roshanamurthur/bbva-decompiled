package com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal;

import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.input.CvmResults;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.input.MobileSupportIndicator;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.input.TerminalRiskManagementData;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class CdCvmSupport {
    private static final /* synthetic */ CdCvmSupport[] $VALUES;
    public static final CdCvmSupport NO;
    public static final CdCvmSupport UNKNOWN;
    public static final CdCvmSupport YES;

    static {
        CdCvmSupport cdCvmSupport = new CdCvmSupport("YES", 0);
        YES = cdCvmSupport;
        CdCvmSupport cdCvmSupport2 = new CdCvmSupport("NO", 1);
        NO = cdCvmSupport2;
        CdCvmSupport cdCvmSupport3 = new CdCvmSupport("UNKNOWN", 2);
        UNKNOWN = cdCvmSupport3;
        $VALUES = new CdCvmSupport[]{cdCvmSupport, cdCvmSupport2, cdCvmSupport3};
    }

    public CdCvmSupport() {
        throw null;
    }

    public static CdCvmSupport forMagstripe(MobileSupportIndicator mobileSupportIndicator, TerminalRiskManagementData terminalRiskManagementData) {
        boolean zIsCdCvmRequired = mobileSupportIndicator.isCdCvmRequired();
        if (terminalRiskManagementData != null) {
            if (terminalRiskManagementData.isCdCvmSupported()) {
                return YES;
            }
            if (zIsCdCvmRequired) {
                return YES;
            }
            if (terminalRiskManagementData.isSupportedByTheTerminal()) {
                return NO;
            }
        }
        return zIsCdCvmRequired ? YES : NO;
    }

    public static CdCvmSupport forMchip(CvmResults cvmResults, TerminalRiskManagementData terminalRiskManagementData) {
        boolean zIsCdCvmToBePerformed = cvmResults.isCdCvmToBePerformed();
        if (terminalRiskManagementData == null) {
            return zIsCdCvmToBePerformed ? YES : UNKNOWN;
        }
        if (terminalRiskManagementData.isCdCvmSupported()) {
            return YES;
        }
        return zIsCdCvmToBePerformed ? YES : NO;
    }

    public static CdCvmSupport valueOf(String str) {
        return (CdCvmSupport) Enum.valueOf(CdCvmSupport.class, str);
    }

    public static CdCvmSupport[] values() {
        return (CdCvmSupport[]) $VALUES.clone();
    }
}
