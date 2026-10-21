package com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.contactless;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GetProcessingOptionsCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ResponseApduFactory;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.McmLiteInvalidInput;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.ContactlessLogicException;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.state.ContactlessContext;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class GetProcessingOptions {
    private static final /* synthetic */ GetProcessingOptions[] $VALUES;
    public static final byte GPO_AIP_LENGTH = 2;
    private static final char GPO_AIP_MASK = 65407;
    public static final byte GPO_AIP_OFFSET = 4;
    public static final GetProcessingOptions INSTANCE;
    public static final byte[] NO_COUNTRY_CODE;
    public static final byte[] US_COUNTRY_CODE;
    private static ContactlessContext sContext;

    static {
        GetProcessingOptions getProcessingOptions = new GetProcessingOptions("INSTANCE", 0);
        INSTANCE = getProcessingOptions;
        $VALUES = new GetProcessingOptions[]{getProcessingOptions};
        US_COUNTRY_CODE = new byte[]{8, 64};
        NO_COUNTRY_CODE = new byte[]{0, 0};
        sContext = null;
    }

    public GetProcessingOptions() {
        throw null;
    }

    public static byte[] a(GetProcessingOptionsCommandApdu getProcessingOptionsCommandApdu) {
        byte[] terminalRiskManagementData;
        byte[] bArrB = b();
        int length = b().length;
        byte[] bArr = new byte[length];
        System.arraycopy(bArrB, 0, bArr, 0, length);
        byte[] terminalCountryCode = getProcessingOptionsCommandApdu.getTerminalCountryCode();
        if (terminalCountryCode != null && terminalCountryCode.length != 0 && ((Arrays.equals(terminalCountryCode, US_COUNTRY_CODE) || Arrays.equals(terminalCountryCode, NO_COUNTRY_CODE)) && sContext.isMaskMchipInAipForUsTransactions())) {
            ContactlessPaymentData contactlessPaymentData = sContext.getCardProfile().getContactlessPaymentData();
            byte[] ciacDeclineOnPpms = contactlessPaymentData.getCiacDeclineOnPpms();
            byte[] pinIvCvc3Track2 = contactlessPaymentData.getPinIvCvc3Track2();
            if (ciacDeclineOnPpms != null && ciacDeclineOnPpms.length != 0 && pinIvCvc3Track2 != null && pinIvCvc3Track2.length != 0 && ((terminalRiskManagementData = getProcessingOptionsCommandApdu.getTerminalRiskManagementData()) == null || terminalRiskManagementData.length == 0 || Arrays.equals(terminalRiskManagementData, new byte[terminalRiskManagementData.length]))) {
                bArr[4] = (byte) (bArr[4] & 255);
                bArr[5] = (byte) (bArr[5] & 127);
            }
        }
        ContactlessTransactionContext transactionContext = sContext.getTransactionContext();
        byte[] bArr2 = new byte[2];
        System.arraycopy(bArr, 4, bArr2, 0, 2);
        transactionContext.setAip(bArr2);
        return bArr;
    }

    public static byte[] b() {
        ContactlessPaymentData contactlessPaymentData = sContext.getCardProfile().getContactlessPaymentData();
        return sContext.getTransactionContext().isAlternateAid() ? contactlessPaymentData.getAlternateContactlessPaymentData().getGpoResponse() : contactlessPaymentData.getGpoResponse();
    }

    public static synchronized byte[] response(GetProcessingOptionsCommandApdu getProcessingOptionsCommandApdu, ContactlessContext contactlessContext) {
        byte[] bArrSuccessfulProcessing;
        sContext = contactlessContext;
        contactlessContext.getTransactionContext().setPdolData(getProcessingOptionsCommandApdu.getPdol());
        try {
            bArrSuccessfulProcessing = ResponseApduFactory.successfulProcessing(a(getProcessingOptionsCommandApdu));
            contactlessContext.setContactlessInitiatedState();
            sContext = null;
        } catch (McmLiteInvalidInput | NullPointerException unused) {
            sContext = null;
            throw new ContactlessLogicException("Invalid GPO Response");
        }
        return bArrSuccessfulProcessing;
    }

    public static GetProcessingOptions valueOf(String str) {
        return (GetProcessingOptions) Enum.valueOf(GetProcessingOptions.class, str);
    }

    public static GetProcessingOptions[] values() {
        return (GetProcessingOptions[]) $VALUES.clone();
    }
}
