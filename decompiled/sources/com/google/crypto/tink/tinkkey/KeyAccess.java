package com.google.crypto.tink.tinkkey;

import com.google.errorprone.annotations.Immutable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
@Deprecated
public final class KeyAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f47517a;

    public KeyAccess(boolean z10) {
        this.f47517a = z10;
    }

    public static KeyAccess publicAccess() {
        return new KeyAccess(false);
    }

    public boolean canAccessSecret() {
        return this.f47517a;
    }
}
