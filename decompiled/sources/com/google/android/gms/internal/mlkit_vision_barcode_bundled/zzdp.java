package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzdp extends zzdo {
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo
    public final int zza(Map.Entry entry) {
        return ((zzdz) entry.getKey()).zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo
    public final zzds zzb(Object obj) {
        return ((zzdy) obj).zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo
    public final zzds zzc(Object obj) {
        return ((zzdy) obj).zzc();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo
    public final Object zzd(zzdn zzdnVar, zzfl zzflVar, int i10) {
        return zzdnVar.zzb(zzflVar, i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo
    public final void zze(Object obj) {
        ((zzdy) obj).zza.zzg();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo
    public final boolean zzf(zzfl zzflVar) {
        return zzflVar instanceof zzdy;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo
    public final void zzg(zzdj zzdjVar, Map.Entry entry) throws IOException {
        zzdz zzdzVar = (zzdz) entry.getKey();
        zzhf zzhfVar = zzhf.zza;
        switch (zzdzVar.zzb.ordinal()) {
            case 0:
                zzdjVar.zzf(zzdzVar.zza, ((Double) entry.getValue()).doubleValue());
                break;
            case 1:
                zzdjVar.zzo(zzdzVar.zza, ((Float) entry.getValue()).floatValue());
                break;
            case 2:
                zzdjVar.zzt(zzdzVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                zzdjVar.zzK(zzdzVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                zzdjVar.zzr(zzdzVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                zzdjVar.zzm(zzdzVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                zzdjVar.zzk(zzdzVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                zzdjVar.zzb(zzdzVar.zza, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                zzdjVar.zzG(zzdzVar.zza, (String) entry.getValue());
                break;
            case 9:
                zzdjVar.zzq(zzdzVar.zza, entry.getValue(), zzfu.zza().zzb(entry.getValue().getClass()));
                break;
            case 10:
                zzdjVar.zzv(zzdzVar.zza, entry.getValue(), zzfu.zza().zzb(entry.getValue().getClass()));
                break;
            case 11:
                zzdjVar.zzd(zzdzVar.zza, (zzdb) entry.getValue());
                break;
            case 12:
                zzdjVar.zzI(zzdzVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                zzdjVar.zzr(zzdzVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 14:
                zzdjVar.zzx(zzdzVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                zzdjVar.zzz(zzdzVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                zzdjVar.zzB(zzdzVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 17:
                zzdjVar.zzD(zzdzVar.zza, ((Long) entry.getValue()).longValue());
                break;
        }
    }
}
