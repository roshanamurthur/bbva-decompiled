package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzjm {
    private static final zzjk zza = new zzjl();
    private static final zzjk zzb;

    static {
        zzjk zzjkVar;
        try {
            zzjkVar = (zzjk) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzjkVar = null;
        }
        zzb = zzjkVar;
    }

    public static zzjk zza() {
        zzjk zzjkVar = zzb;
        if (zzjkVar != null) {
            return zzjkVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzjk zzb() {
        return zza;
    }
}
