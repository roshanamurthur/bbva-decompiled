package com.sun.activation.registries;

/* JADX INFO: loaded from: classes9.dex */
public class MimeTypeEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65219b;

    public MimeTypeEntry(String str, String str2) {
        this.f65218a = str;
        this.f65219b = str2;
    }

    public String getFileExtension() {
        return this.f65219b;
    }

    public String getMIMEType() {
        return this.f65218a;
    }

    public String toString() {
        return "MIMETypeEntry: " + this.f65218a + ", " + this.f65219b;
    }
}
