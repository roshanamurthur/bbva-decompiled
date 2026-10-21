package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzlg implements zzln {
    private final zzlc zza;
    private final zzmb zzb;
    private final boolean zzc;
    private final zzjk zzd;

    private zzlg(zzmb zzmbVar, zzjk zzjkVar, zzlc zzlcVar) {
        this.zzb = zzmbVar;
        this.zzc = zzjkVar.zzc(zzlcVar);
        this.zzd = zzjkVar;
        this.zza = zzlcVar;
    }

    public static zzlg zzc(zzmb zzmbVar, zzjk zzjkVar, zzlc zzlcVar) {
        return new zzlg(zzmbVar, zzjkVar, zzlcVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final int zza(Object obj) {
        zzmb zzmbVar = this.zzb;
        int iZzb = zzmbVar.zzb(zzmbVar.zzc(obj));
        if (!this.zzc) {
            return iZzb;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final int zzb(Object obj) {
        int iHashCode = this.zzb.zzc(obj).hashCode();
        if (!this.zzc) {
            return iHashCode;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final Object zze() {
        return this.zza.zzbA().zzaA();
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final void zzf(Object obj) {
        this.zzb.zzg(obj);
        this.zzd.zzb(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final void zzg(Object obj, Object obj2) {
        zzlp.zzF(this.zzb, obj, obj2);
        if (this.zzc) {
            zzlp.zzE(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final void zzh(Object obj, byte[] bArr, int i10, int i11, zzik zzikVar) throws IOException {
        zzjx zzjxVar = (zzjx) obj;
        if (zzjxVar.zzc == zzmc.zzc()) {
            zzjxVar.zzc = zzmc.zze();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final boolean zzi(Object obj, Object obj2) {
        if (!this.zzb.zzc(obj).equals(this.zzb.zzc(obj2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zza(obj);
        this.zzd.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final boolean zzj(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzln
    public final void zzm(Object obj, zzjf zzjfVar) throws IOException {
        this.zzd.zza(obj);
        throw null;
    }
}
