package com.google.firebase.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class InternalTokenResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f48515a;

    @KeepForSdk
    public InternalTokenResult(@Nullable String str) {
        this.f48515a = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof InternalTokenResult) {
            return Objects.equal(this.f48515a, ((InternalTokenResult) obj).f48515a);
        }
        return false;
    }

    @Nullable
    @KeepForSdk
    public String getToken() {
        return this.f48515a;
    }

    public int hashCode() {
        return Objects.hashCode(this.f48515a);
    }

    @NonNull
    public String toString() {
        return Objects.toStringHelper(this).add("token", this.f48515a).toString();
    }
}
