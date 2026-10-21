package com.google.firebase.emulators;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public final class EmulatedServiceSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48359b;

    public EmulatedServiceSettings(@NonNull String str, int i10) {
        this.f48358a = str;
        this.f48359b = i10;
    }

    public String getHost() {
        return this.f48358a;
    }

    public int getPort() {
        return this.f48359b;
    }
}
