package com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.input;

import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.ContactlessLogicException;

/* JADX INFO: loaded from: classes10.dex */
public final class CvmResults {
    public static final int CVM_RESULTS_BYTE = 0;
    public static final int RESULT_OF_LAST_CVM_PERFORMED_BYTE = 2;
    public final int CVM_RESULT_LENGTH = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f51017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MobileSupportIndicator f51018b;

    public CvmResults(byte[] bArr, MobileSupportIndicator mobileSupportIndicator) {
        if (bArr.length == 3) {
            this.f51017a = bArr;
            this.f51018b = mobileSupportIndicator;
        } else {
            throw new ContactlessLogicException("Invalid CVM Result length: " + bArr.length);
        }
    }

    public static CvmResults of(byte[] bArr, MobileSupportIndicator mobileSupportIndicator) {
        if (bArr != null) {
            return new CvmResults(bArr, mobileSupportIndicator);
        }
        throw new ContactlessLogicException("Invalid CVM Results data");
    }

    public final boolean isCdCvmAndSignatureToBePerformed() {
        if (!isCvmResultSuccess() && !isCvmResultUnknown()) {
            return false;
        }
        byte b10 = this.f51017a[0];
        return (b10 & 63) == 3 || (b10 & 63) == 5;
    }

    public final boolean isCdCvmOnlyToBePerformed() {
        if (!isCvmResultSuccess()) {
            return false;
        }
        byte b10 = this.f51017a[0];
        return (b10 & 63) == 1 || (b10 & 63) == 4;
    }

    public final boolean isCdCvmToBePerformed() {
        return isCdCvmAndSignatureToBePerformed() || isCdCvmOnlyToBePerformed();
    }

    public final boolean isCvmResultSuccess() {
        return this.f51017a[2] == 2;
    }

    public final boolean isCvmResultUnknown() {
        return this.f51017a[2] == 0;
    }

    public final boolean isNoCvmToBePerformed() {
        boolean zIsSupportedByTheTerminal = this.f51018b.isSupportedByTheTerminal();
        byte[] bArr = this.f51017a;
        if (zIsSupportedByTheTerminal) {
            return isCvmResultSuccess() && (bArr[0] & 31) == 31;
        }
        return (isCvmResultSuccess() || isCvmResultUnknown()) && (bArr[0] & 63) == 31;
    }

    public final boolean isOnlinePinToBePerformed() {
        return isCvmResultUnknown() && (this.f51017a[0] & 63) == 2;
    }

    public final boolean isSignatureOnlyToBePerformed() {
        return isCvmResultUnknown() && (this.f51017a[0] & 63) == 30;
    }

    public final boolean isSignatureToBePerformed() {
        return isSignatureOnlyToBePerformed() || isCdCvmAndSignatureToBePerformed();
    }

    public boolean isSupportedByTheTerminal() {
        for (byte b10 : this.f51017a) {
            if (b10 != 0) {
                return true;
            }
        }
        return false;
    }
}
