package com.bbva.androidtoolkit.plugin.permission;

/* JADX INFO: loaded from: classes2.dex */
public class Permission {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f26536b;

    public Permission(String str, boolean z10) {
        this.f26535a = str;
        this.f26536b = z10;
    }

    public String getName() {
        return this.f26535a;
    }

    public boolean isPermanentlyDenied() {
        return this.f26536b;
    }
}
