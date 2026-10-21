package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes9.dex */
final class zzhj {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class zzc;
    private static final boolean zzd;
    private static final zzhi zze;
    private static final boolean zzf;
    private static final boolean zzg;

    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    static {
        boolean z10;
        boolean z11;
        zzhi zzhiVar;
        Unsafe unsafeZzg = zzg();
        zzb = unsafeZzg;
        int i10 = zzds.zza;
        zzc = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean zZzs = zzs(cls);
        zzd = zZzs;
        boolean zZzs2 = zzs(Integer.TYPE);
        zzhi zzhgVar = null;
        if (unsafeZzg != null) {
            if (zZzs) {
                zzhgVar = new zzhh(unsafeZzg);
            } else if (zZzs2) {
                zzhgVar = new zzhg(unsafeZzg);
            }
        }
        zze = zzhgVar;
        if (zzhgVar == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls2 = zzhgVar.zza.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
                if (zzy() == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } catch (Throwable th2) {
                zzh(th2);
            }
        }
        zzf = z10;
        zzhi zzhiVar2 = zze;
        if (zzhiVar2 == null) {
            z11 = false;
        } else {
            try {
                Class<?> cls3 = zzhiVar2.zza.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("arrayBaseOffset", Class.class);
                cls3.getMethod("arrayIndexScale", Class.class);
                Class<?> cls4 = Long.TYPE;
                cls3.getMethod("getInt", Object.class, cls4);
                cls3.getMethod("putInt", Object.class, cls4, Integer.TYPE);
                cls3.getMethod("getLong", Object.class, cls4);
                cls3.getMethod("putLong", Object.class, cls4, cls4);
                cls3.getMethod("getObject", Object.class, cls4);
                cls3.getMethod("putObject", Object.class, cls4, Object.class);
                z11 = true;
            } catch (Throwable th3) {
                zzh(th3);
                z11 = false;
            }
        }
        zzg = z11;
        zzw(byte[].class);
        zzw(boolean[].class);
        zzx(boolean[].class);
        zzw(int[].class);
        zzx(int[].class);
        zzw(long[].class);
        zzx(long[].class);
        zzw(float[].class);
        zzx(float[].class);
        zzw(double[].class);
        zzx(double[].class);
        zzw(Object[].class);
        zzx(Object[].class);
        Field fieldZzy = zzy();
        if (fieldZzy != null && (zzhiVar = zze) != null) {
            zzhiVar.zza.objectFieldOffset(fieldZzy);
        }
        zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzhj() {
    }

    public static double zza(Object obj, long j10) {
        return zze.zza(obj, j10);
    }

    public static float zzb(Object obj, long j10) {
        return zze.zzb(obj, j10);
    }

    public static int zzc(Object obj, long j10) {
        return zze.zza.getInt(obj, j10);
    }

    public static long zzd(Object obj, long j10) {
        return zze.zza.getLong(obj, j10);
    }

    public static Object zze(Class cls) {
        try {
            return zzb.allocateInstance(cls);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(e5);
        }
    }

    public static Object zzf(Object obj, long j10) {
        return zze.zza.getObject(obj, j10);
    }

    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhf());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzh(Throwable th2) {
        Logger.getLogger(zzhj.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    public static /* synthetic */ void zzi(Object obj, long j10, boolean z10) {
        zzhi zzhiVar = zze;
        long j11 = (-4) & j10;
        int i10 = zzhiVar.zza.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        zzhiVar.zza.putInt(obj, j11, ((z10 ? 1 : 0) << i11) | ((~(255 << i11)) & i10));
    }

    public static /* synthetic */ void zzj(Object obj, long j10, boolean z10) {
        zzhi zzhiVar = zze;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        zzhiVar.zza.putInt(obj, j11, ((z10 ? 1 : 0) << i10) | ((~(255 << i10)) & zzhiVar.zza.getInt(obj, j11)));
    }

    public static void zzk(Object obj, long j10, boolean z10) {
        zze.zzc(obj, j10, z10);
    }

    public static void zzl(Object obj, long j10, double d2) {
        zze.zzd(obj, j10, d2);
    }

    public static void zzm(Object obj, long j10, float f6) {
        zze.zze(obj, j10, f6);
    }

    public static void zzn(Object obj, long j10, int i10) {
        zze.zza.putInt(obj, j10, i10);
    }

    public static void zzo(Object obj, long j10, long j11) {
        zze.zza.putLong(obj, j10, j11);
    }

    public static void zzp(Object obj, long j10, Object obj2) {
        zze.zza.putObject(obj, j10, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzq(Object obj, long j10) {
        return ((byte) ((zze.zza.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzr(Object obj, long j10) {
        return ((byte) ((zze.zza.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zzs(Class cls) {
        int i10 = zzds.zza;
        try {
            Class cls2 = zzc;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean zzt(Object obj, long j10) {
        return zze.zzf(obj, j10);
    }

    public static boolean zzu() {
        return zzg;
    }

    public static boolean zzv() {
        return zzf;
    }

    private static int zzw(Class cls) {
        if (zzg) {
            return zze.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzx(Class cls) {
        if (zzg) {
            return zze.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzy() {
        int i10 = zzds.zza;
        Field fieldZzz = zzz(Buffer.class, "effectiveDirectAddress");
        if (fieldZzz != null) {
            return fieldZzz;
        }
        Field fieldZzz2 = zzz(Buffer.class, "address");
        if (fieldZzz2 == null || fieldZzz2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzz2;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
