package com.huawei.secure.android.common.util;

/* JADX INFO: loaded from: classes10.dex */
public class SecurityCommonException extends Exception {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f50673c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f50674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f50675b;

    public SecurityCommonException() {
    }

    public String getMsgDes() {
        return this.f50675b;
    }

    public String getRetCd() {
        return this.f50674a;
    }

    public SecurityCommonException(Throwable th2) {
        super(th2);
    }

    public SecurityCommonException(String str, Throwable th2) {
        super(str, th2);
    }

    public SecurityCommonException(String str) {
        super(str);
        this.f50675b = str;
    }

    public SecurityCommonException(String str, String str2) {
        this.f50674a = str;
        this.f50675b = str2;
    }
}
