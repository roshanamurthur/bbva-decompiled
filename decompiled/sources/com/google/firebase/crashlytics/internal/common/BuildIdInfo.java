package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes10.dex */
public class BuildIdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47716c;

    public BuildIdInfo(String str, String str2, String str3) {
        this.f47714a = str;
        this.f47715b = str2;
        this.f47716c = str3;
    }

    public String getArch() {
        return this.f47715b;
    }

    public String getBuildId() {
        return this.f47716c;
    }

    public String getLibraryName() {
        return this.f47714a;
    }
}
