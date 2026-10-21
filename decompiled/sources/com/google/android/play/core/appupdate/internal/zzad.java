package com.google.android.play.core.appupdate.internal;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzad implements zzaf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f46062c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile zzaf f46063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f46064b;

    public static zzaf zzb(zzaf zzafVar) {
        zzafVar.getClass();
        if (zzafVar instanceof zzad) {
            return zzafVar;
        }
        zzad zzadVar = new zzad();
        zzadVar.f46064b = f46062c;
        zzadVar.f46063a = zzafVar;
        return zzadVar;
    }

    @Override // com.google.android.play.core.appupdate.internal.zzaf
    public final Object zza() {
        Object objZza = this.f46064b;
        Object obj = f46062c;
        if (objZza == obj) {
            synchronized (this) {
                try {
                    objZza = this.f46064b;
                    if (objZza == obj) {
                        objZza = this.f46063a.zza();
                        Object obj2 = this.f46064b;
                        if (obj2 != obj && obj2 != objZza) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objZza + ". This is likely due to a circular dependency.");
                        }
                        this.f46064b = objZza;
                        this.f46063a = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return objZza;
    }
}
