package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfh {
    private static final zzfg zza;
    private static final zzfg zzb;

    static {
        zzfg zzfgVar;
        try {
            zzfgVar = (zzfg) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzfgVar = null;
        }
        zza = zzfgVar;
        zzb = new zzfg();
    }

    public static zzfg zza() {
        return zza;
    }

    public static zzfg zzb() {
        return zzb;
    }
}
