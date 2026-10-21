package com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement;

import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu.ConditionsOfUseNotSatisfied;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;

/* JADX INFO: loaded from: classes10.dex */
public final class CardVerificationResults {
    public static final byte AAC_RETURNED_IN_FIRST_GAC = -128;
    public static final byte ARQC_CVR_DD_AAC_RETURNED = 64;
    public static final byte ARQC_RETURNED_IN_FIRST_GAC = -96;
    public static final byte CVM_REQUIRED_NOT_SATISFIED = 8;
    public static final byte DOMESTIC_TRANSACTION = 2;
    public static final byte INTERNATIONAL_TRANSACTION = 4;
    public static final byte OFFLINE_PIN_NOT_PERFORMED = 32;
    public static final byte OFFLINE_PIN_OK = 5;
    public static final byte TERMINAL_ERRONEOUSLY_CONSIDERS_OFFLINE_PIN_OK = 1;
    public static final int TRANSACTION_TYPE_OFFSET = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f50811a;
    public final int CVR_LENGTH = 6;
    public final int CIAC_DECLINE_LENGTH = 3;

    public CardVerificationResults(byte[] bArr) {
        byte[] bArr2 = new byte[6];
        this.f50811a = bArr2;
        System.arraycopy(bArr, 3, bArr2, 1, 1);
        bArr2[1] = (byte) (bArr2[1] & 3);
    }

    public static CardVerificationResults withIssuerApplicationData(byte[] bArr) {
        if (bArr == null || bArr.length != 18) {
            throw new ConditionsOfUseNotSatisfied("Invalid Issuer Application Data");
        }
        return new CardVerificationResults(bArr);
    }

    public final void applyMaskAnd(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = this.f50811a;
            if (i10 >= bArr2.length) {
                return;
            }
            bArr2[i10] = (byte) (bArr2[i10] & bArr[i10]);
            i10++;
        }
    }

    public final byte[] getBytes() {
        return this.f50811a;
    }

    public final void indicateAacReturnedInFirstAndAcNotRequestedInSecondGenerateAc() {
        byte[] bArr = this.f50811a;
        bArr[0] = (byte) (bArr[0] | (-128));
    }

    public final void indicateArqcReturnedInFirstAndAcNotRequestedInSecondGenerateAc() {
        byte[] bArr = this.f50811a;
        bArr[0] = (byte) (bArr[0] | (-96));
    }

    public final void indicateCdCvmNotPerformed() {
        byte[] bArr = this.f50811a;
        bArr[3] = (byte) (bArr[3] | 32);
    }

    public final void indicateCdCvmPerformed() {
        byte[] bArr = this.f50811a;
        bArr[0] = (byte) (bArr[0] | 5);
    }

    public final void indicateCombinedDdaAcGenerationReturnedInFirstGenerateAc() {
        byte[] bArr = this.f50811a;
        bArr[1] = (byte) (bArr[1] | 64);
    }

    public final void indicateCvmRequiredNotSatisfied() {
        byte[] bArr = this.f50811a;
        bArr[5] = (byte) (bArr[5] | 8);
    }

    public final void indicateDomesticTransaction() {
        byte[] bArr = this.f50811a;
        bArr[3] = (byte) (bArr[3] | 2);
    }

    public final void indicateMatchFoundInAdditionalCheckTable() {
        byte[] bArr = this.f50811a;
        bArr[5] = (byte) (bArr[5] | 2);
    }

    public final void indicateMatchNotFoundInAdditionalCheckTable() {
        byte[] bArr = this.f50811a;
        bArr[5] = (byte) (bArr[5] | 1);
    }

    public final void indicateTerminalErroneouslyConsiderOfflinePinOk() {
        byte[] bArr = this.f50811a;
        bArr[3] = (byte) (bArr[3] | 1);
    }

    public final void indicatedInternationalTransaction() {
        byte[] bArr = this.f50811a;
        bArr[3] = (byte) (bArr[3] | 4);
    }

    public final boolean isCiacDeclineMatchFound(byte[] bArr) {
        if (bArr == null || bArr.length != 3) {
            throw new ConditionsOfUseNotSatisfied("CIAC decline");
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if ((this.f50811a[i10 + 3] & bArr[i10]) != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean isCombinedDdaAcGenerationReturnedInFirstGenerateAc() {
        return (this.f50811a[1] & 64) == 64;
    }

    public final void setFlagsForApproval() {
        byte[] bArr = this.f50811a;
        bArr[3] = (byte) (bArr[3] & 254);
        bArr[5] = (byte) (bArr[5] & 247);
    }

    public void wipe() {
        McmLiteUtils.clearByteArray(this.f50811a);
    }
}
