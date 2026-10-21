package com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.input;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;

/* JADX INFO: loaded from: classes10.dex */
public final class TerminalCapabilities {
    public static final int CVM_CAPABILITY_BYTE = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f51020a;

    public TerminalCapabilities(byte[] bArr) {
        this.f51020a = bArr;
    }

    public static TerminalCapabilities of(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new TerminalCapabilities(bArr);
    }

    public final boolean isCvmOtherThanNoCvmSupported() {
        return (this.f51020a[1] & Constants.CVR_B2b8765_1111_APP_DISABLED) != 0;
    }

    public final boolean isNoCvmOnlySupported() {
        return this.f51020a[1] == 8;
    }

    public final boolean isNoCvmSupported() {
        return (this.f51020a[1] & 15) == 8;
    }

    public final boolean isOnlinePinAndSignature() {
        return (this.f51020a[1] & Constants.CVR_B1b85_0110_TERMINAL) == 96;
    }

    public final boolean isOnlinePinOnly() {
        return (this.f51020a[1] & 248) == 64;
    }

    public final boolean isSignatureOnly() {
        return (this.f51020a[1] & 248) == 32;
    }

    public final boolean isSupportedByTheTerminal() {
        return this.f51020a[1] != 0;
    }
}
