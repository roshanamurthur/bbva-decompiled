package com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel;

/* JADX INFO: loaded from: classes10.dex */
public class DsrpResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsrpOutputData f50962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RemotePaymentResultCode f50963b;

    public DsrpResult(RemotePaymentResultCode remotePaymentResultCode, DsrpOutputData dsrpOutputData) {
        this.f50962a = dsrpOutputData;
        this.f50963b = remotePaymentResultCode;
    }

    public RemotePaymentResultCode getCode() {
        return this.f50963b;
    }

    public DsrpOutputData getData() {
        return this.f50962a;
    }
}
