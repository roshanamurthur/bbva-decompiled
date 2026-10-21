package com.huawei.hms.feature.broadcast;

/* JADX INFO: loaded from: classes10.dex */
public class ActionType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f50159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f50160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f50161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f50162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f50163e;

    public ActionType(String str, String str2, String str3, String str4, String str5) {
        this.f50159a = str;
        this.f50160b = str2;
        this.f50161c = str3;
        this.f50162d = str4;
        this.f50163e = str5;
    }

    public String getBigPackageAction() {
        return this.f50159a;
    }

    public String getDownloadCompleteAction() {
        return this.f50162d;
    }

    public String getDownloadProcessAction() {
        return this.f50161c;
    }

    public String getInstallCompleteAction() {
        return this.f50163e;
    }

    public String getPersonAgreementAction() {
        return this.f50160b;
    }
}
