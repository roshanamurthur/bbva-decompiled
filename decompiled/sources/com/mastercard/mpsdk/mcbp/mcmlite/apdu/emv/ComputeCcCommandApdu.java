package com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.CommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu.InvalidCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu.InvalidLc;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu.InvalidP1;

/* JADX INFO: loaded from: classes10.dex */
public class ComputeCcCommandApdu extends CommandApdu {
    public static final String AUTHORIZED_AMOUNT_TAG = "9F02";
    public static final byte EXPECTED_LE = 0;
    public static final byte EXPECTED_P1 = -114;
    public static final byte EXPECTED_P2 = -128;
    public static final String MERCHANT_CATEGORY_CODE_TAG = "9F15";
    public static final String MOBILE_SUPPORT_INDICATOR_TAG = "9F7E";
    public static final String TERMINAL_COUNTRY_CODE_TAG = "9F1A";
    public static final String TERMINAL_RISK_MANAGEMENT_DATA = "9F1D";
    public static final String TERMINAL_TYPE_TAG = "9F35";
    public static final String TRANSACTION_CURRENCY_CODE_TAG = "5F2A";
    public static final String TRANSACTION_DATE_TAG = "9A";
    public static final String TRANSACTION_TYPE_TAG = "9C";
    public static final String UNPREDICTABLE_NUMBER_TAG = "9F6A";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f50768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte f50769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f50770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f50771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f50772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte f50773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f50774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f50775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte f50776k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final byte[] f50777l;
    public final byte[] m;

    public ComputeCcCommandApdu(byte[] bArr, DolRequestList dolRequestList) {
        super(bArr);
        if (getType() != CommandApdu.Type.COMPUTE_CRYPTOGRAPHIC_CHECKSUM) {
            throw new InvalidCommandApdu("Expected a COMPUTE CC C-APDU, found: " + getType());
        }
        if (getP1() != -114 || getP2() != -128) {
            throw new InvalidP1("Invalid P1/P2 parameter: " + ((int) getP1()) + ", " + ((int) getP2()));
        }
        if (bArr[bArr.length - 1] != 0) {
            throw new InvalidCommandApdu("Invalid LE value for the Compute CC C-APDU");
        }
        int i10 = (short) (bArr[4] & 255);
        if (bArr.length != i10 + 6) {
            throw new InvalidLc("Invalid length (does not match LC)");
        }
        byte[] bArr2 = new byte[i10];
        this.m = bArr2;
        System.arraycopy(bArr, 5, bArr2, 0, i10);
        DolValues dolValuesOf = DolValues.of(dolRequestList, bArr2);
        if (dolRequestList == null) {
            throw new InvalidLc("ComputeCC C-APDU: Invalid UDOL list length");
        }
        if (dolRequestList.getExpectedDolLength() != i10) {
            throw new InvalidLc("ComputeCC C-APDU: Invalid UDOL list length");
        }
        this.f50772g = dolValuesOf.getValueByTag(UNPREDICTABLE_NUMBER_TAG);
        this.f50769d = dolValuesOf.getValueByTag("9F7E")[0];
        this.f50768c = dolValuesOf.getValueByTag("9F02");
        this.f50771f = dolValuesOf.getValueByTag("5F2A");
        this.f50770e = dolValuesOf.getValueByTag("9F1A");
        this.f50776k = dolValuesOf.getValueByTag("9C")[0];
        this.f50774i = dolValuesOf.getValueByTag("9A");
        this.f50775j = dolValuesOf.getValueByTag(MERCHANT_CATEGORY_CODE_TAG);
        this.f50773h = dolValuesOf.getValueByTag("9F35")[0];
        this.f50777l = dolValuesOf.getValueByTag("9F1D");
    }

    public final byte[] getAuthorizedAmount() {
        return this.f50768c;
    }

    public final byte[] getMerchantCategoryCode() {
        return this.f50775j;
    }

    public final byte getMobileSupportIndicator() {
        return this.f50769d;
    }

    public final byte[] getTerminalCountryCode() {
        return this.f50770e;
    }

    public final byte[] getTerminalRiskManagementData() {
        return this.f50777l;
    }

    public byte getTerminalType() {
        return this.f50773h;
    }

    public final byte[] getTransactionCurrencyCode() {
        return this.f50771f;
    }

    public final byte[] getTransactionDate() {
        return this.f50774i;
    }

    public final byte getTransactionType() {
        return this.f50776k;
    }

    public final byte[] getUdol() {
        return this.m;
    }

    public final byte[] getUnpredictableNumber() {
        return this.f50772g;
    }
}
