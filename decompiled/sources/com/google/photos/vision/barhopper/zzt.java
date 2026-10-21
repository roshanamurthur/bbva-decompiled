package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzt extends zzec implements zzfm {
    private static final zzt zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private String zzn = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";

    static {
        zzt zztVar = new zzt();
        zza = zztVar;
        zzec.zzS(zzt.class, zztVar);
    }

    public static zzt zzb() {
        return zza;
    }

    public final String zzc() {
        return this.zzl;
    }

    public final String zzd() {
        return this.zzm;
    }

    public final String zze() {
        return this.zzk;
    }

    public final String zzf() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object zzg(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzec.zzR(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i11 == 3) {
            return new zzt();
        }
        if (i11 == 4) {
            return new zzs(zza);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final String zzh() {
        return this.zzr;
    }

    public final String zzi() {
        return this.zzf;
    }

    public final String zzj() {
        return this.zzq;
    }

    public final String zzk() {
        return this.zzg;
    }

    public final String zzl() {
        return this.zzj;
    }

    public final String zzm() {
        return this.zzp;
    }

    public final String zzn() {
        return this.zzs;
    }

    public final String zzo() {
        return this.zzi;
    }

    public final String zzp() {
        return this.zzo;
    }

    public final String zzq() {
        return this.zzh;
    }
}
