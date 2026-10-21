package com.google.android.play.core.splitinstall.internal;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class q extends zzp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46279b;

    public q(int i10, long j10) {
        this.f46278a = i10;
        this.f46279b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzp) {
            zzp zzpVar = (zzp) obj;
            if (this.f46278a == zzpVar.zza() && this.f46279b == zzpVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f46278a ^ 1000003;
        long j10 = this.f46279b;
        return (i10 * 1000003) ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f46278a + ", eventTimestamp=" + this.f46279b + "}";
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzp
    public final int zza() {
        return this.f46278a;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzp
    public final long zzb() {
        return this.f46279b;
    }
}
