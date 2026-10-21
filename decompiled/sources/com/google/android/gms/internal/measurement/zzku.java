package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzku implements zzlo {
    private static final zzla zza = new zzks();
    private final zzla zzb;

    public zzku() {
        zzla zzlaVar;
        zzla[] zzlaVarArr = new zzla[2];
        zzlaVarArr[0] = zzjs.zza();
        try {
            zzlaVar = (zzla) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzlaVar = zza;
        }
        zzlaVarArr[1] = zzlaVar;
        zzkt zzktVar = new zzkt(zzlaVarArr);
        zzkf.zzf(zzktVar, "messageInfoFactory");
        this.zzb = zzktVar;
    }

    private static boolean zzb(zzkz zzkzVar) {
        return zzkzVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzlo
    public final zzln zza(Class cls) {
        zzlp.zzG(cls);
        zzkz zzkzVarZzb = this.zzb.zzb(cls);
        if (zzkzVarZzb.zzb()) {
            return zzjx.class.isAssignableFrom(cls) ? zzlg.zzc(zzlp.zzB(), zzjm.zzb(), zzkzVarZzb.zza()) : zzlg.zzc(zzlp.zzz(), zzjm.zza(), zzkzVarZzb.zza());
        }
        if (zzjx.class.isAssignableFrom(cls)) {
            return zzb(zzkzVarZzb) ? zzlf.zzk(cls, zzkzVarZzb, zzli.zzb(), zzkq.zzd(), zzlp.zzB(), zzjm.zzb(), zzky.zzb()) : zzlf.zzk(cls, zzkzVarZzb, zzli.zzb(), zzkq.zzd(), zzlp.zzB(), null, zzky.zzb());
        }
        return zzb(zzkzVarZzb) ? zzlf.zzk(cls, zzkzVarZzb, zzli.zza(), zzkq.zzc(), zzlp.zzz(), zzjm.zza(), zzky.zza()) : zzlf.zzk(cls, zzkzVarZzb, zzli.zza(), zzkq.zzc(), zzlp.zzA(), null, zzky.zza());
    }
}
