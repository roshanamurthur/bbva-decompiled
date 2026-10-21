package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzli {
    private static final zzlh zza;
    private static final zzlh zzb;

    static {
        zzlh zzlhVar;
        try {
            zzlhVar = (zzlh) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzlhVar = null;
        }
        zza = zzlhVar;
        zzb = new zzlh();
    }

    public static zzlh zza() {
        return zza;
    }

    public static zzlh zzb() {
        return zzb;
    }
}
