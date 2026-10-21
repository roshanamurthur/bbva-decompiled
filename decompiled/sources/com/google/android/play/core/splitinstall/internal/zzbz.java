package com.google.android.play.core.splitinstall.internal;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzbz implements zzcb, zzby {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f46312c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile zzcb f46313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f46314b = f46312c;

    public zzbz(zzcb zzcbVar) {
        this.f46313a = zzcbVar;
    }

    public static zzby zzb(zzcb zzcbVar) {
        return zzcbVar instanceof zzby ? (zzby) zzcbVar : new zzbz(zzcbVar);
    }

    public static zzcb zzc(zzcb zzcbVar) {
        zzcbVar.getClass();
        return zzcbVar instanceof zzbz ? zzcbVar : new zzbz(zzcbVar);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzcb, com.google.android.play.core.splitinstall.internal.zzby
    public final Object zza() {
        Object objZza = this.f46314b;
        Object obj = f46312c;
        if (objZza == obj) {
            synchronized (this) {
                try {
                    objZza = this.f46314b;
                    if (objZza == obj) {
                        objZza = this.f46313a.zza();
                        Object obj2 = this.f46314b;
                        if (obj2 != obj && obj2 != objZza) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objZza + ". This is likely due to a circular dependency.");
                        }
                        this.f46314b = objZza;
                        this.f46313a = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return objZza;
    }
}
