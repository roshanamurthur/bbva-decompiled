package com.google.mlkit.common.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.mlkit_common.zzq;
import com.google.android.gms.internal.mlkit_common.zzr;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class RemoteModelSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f49401a;

    @KeepForSdk
    public RemoteModelSource(@Nullable String str) {
        this.f49401a = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass().equals(getClass())) {
            return Objects.equal(this.f49401a, ((RemoteModelSource) obj).f49401a);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f49401a);
    }

    @NonNull
    public String toString() {
        zzq zzqVarZzb = zzr.zzb("RemoteModelSource");
        zzqVarZzb.zza("firebaseModelName", this.f49401a);
        return zzqVarZzb.toString();
    }

    @Nullable
    public final String zza() {
        return this.f49401a;
    }
}
