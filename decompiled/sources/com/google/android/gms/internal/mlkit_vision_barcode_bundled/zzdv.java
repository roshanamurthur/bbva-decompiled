package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzdv implements zzfj {
    private static final zzdv zza = new zzdv();

    private zzdv() {
    }

    public static zzdv zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfj
    public final zzfi zzb(Class cls) {
        if (!zzec.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (zzfi) zzec.zzI(cls.asSubclass(zzec.class)).zzg(3, null, null);
        } catch (Exception e5) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e5);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfj
    public final boolean zzc(Class cls) {
        return zzec.class.isAssignableFrom(cls);
    }
}
