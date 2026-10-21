package com.google.android.play.core.appupdate;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f46108a;

    public final zza zza() {
        b bVar = this.f46108a;
        if (bVar != null) {
            return new l(bVar);
        }
        throw new IllegalStateException(String.valueOf(b.class.getCanonicalName()).concat(" must be set"));
    }

    public final zzab zzb(b bVar) {
        this.f46108a = bVar;
        return this;
    }
}
