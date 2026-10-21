package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgz {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzgy zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    static {
        boolean z10;
        boolean z11;
        zzgy zzgyVar;
        Unsafe unsafeZzg = zzg();
        zzc = unsafeZzg;
        zzd = zzcn.zza();
        Class<?> cls = Long.TYPE;
        boolean zZzv = zzv(cls);
        zze = zZzv;
        boolean zZzv2 = zzv(Integer.TYPE);
        zzgy zzgwVar = null;
        if (unsafeZzg != null) {
            if (zZzv) {
                zzgwVar = new zzgx(unsafeZzg);
            } else if (zZzv2) {
                zzgwVar = new zzgw(unsafeZzg);
            }
        }
        zzf = zzgwVar;
        if (zzgwVar == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls2 = zzgwVar.zza.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
                if (zzB() == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } catch (Throwable th2) {
                zzh(th2);
            }
        }
        zzg = z10;
        zzgy zzgyVar2 = zzf;
        if (zzgyVar2 == null) {
            z11 = false;
        } else {
            try {
                Class<?> cls3 = zzgyVar2.zza.getClass();
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
        zzh = z11;
        zza = zzz(byte[].class);
        zzz(boolean[].class);
        zzA(boolean[].class);
        zzz(int[].class);
        zzA(int[].class);
        zzz(long[].class);
        zzA(long[].class);
        zzz(float[].class);
        zzA(float[].class);
        zzz(double[].class);
        zzA(double[].class);
        zzz(Object[].class);
        zzA(Object[].class);
        Field fieldZzB = zzB();
        if (fieldZzB != null && (zzgyVar = zzf) != null) {
            zzgyVar.zzl(fieldZzB);
        }
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzgz() {
    }

    private static int zzA(Class cls) {
        if (zzh) {
            return zzf.zzi(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i10 = zzcn.zza;
        Field fieldZzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (fieldZzC != null) {
            return fieldZzC;
        }
        Field fieldZzC2 = zzC(Buffer.class, "address");
        if (fieldZzC2 == null || fieldZzC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzC2;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        zzgy zzgyVar = zzf;
        int iZzj = zzgyVar.zzj(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        zzgyVar.zzn(obj, j11, ((255 & b10) << i10) | (iZzj & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        zzgy zzgyVar = zzf;
        int i10 = (((int) j10) & 3) << 3;
        zzgyVar.zzn(obj, j11, ((255 & b10) << i10) | (zzgyVar.zzj(obj, j11) & (~(255 << i10))));
    }

    public static double zza(Object obj, long j10) {
        return zzf.zza(obj, j10);
    }

    public static float zzb(Object obj, long j10) {
        return zzf.zzb(obj, j10);
    }

    public static int zzc(Object obj, long j10) {
        return zzf.zzj(obj, j10);
    }

    public static long zzd(Object obj, long j10) {
        return zzf.zzk(obj, j10);
    }

    public static Object zze(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(e5);
        }
    }

    public static Object zzf(Object obj, long j10) {
        return zzf.zzm(obj, j10);
    }

    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzgv());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void zzh(Throwable th2) {
        Logger.getLogger(zzgz.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    public static void zzm(Object obj, long j10, boolean z10) {
        zzf.zzc(obj, j10, z10);
    }

    public static void zzn(byte[] bArr, long j10, byte b10) {
        zzf.zzd(bArr, zza + j10, b10);
    }

    public static void zzo(Object obj, long j10, double d2) {
        zzf.zze(obj, j10, d2);
    }

    public static void zzp(Object obj, long j10, float f6) {
        zzf.zzf(obj, j10, f6);
    }

    public static void zzq(Object obj, long j10, int i10) {
        zzf.zzn(obj, j10, i10);
    }

    public static void zzr(Object obj, long j10, long j11) {
        zzf.zzo(obj, j10, j11);
    }

    public static void zzs(Object obj, long j10, Object obj2) {
        zzf.zzp(obj, j10, obj2);
    }

    public static /* synthetic */ boolean zzt(Object obj, long j10) {
        return ((byte) ((zzf.zzj(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean zzu(Object obj, long j10) {
        return ((byte) ((zzf.zzj(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zzv(Class cls) {
        int i10 = zzcn.zza;
        try {
            Class cls2 = zzd;
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

    public static boolean zzw(Object obj, long j10) {
        return zzf.zzg(obj, j10);
    }

    public static boolean zzx() {
        return zzh;
    }

    public static boolean zzy() {
        return zzg;
    }

    private static int zzz(Class cls) {
        if (zzh) {
            return zzf.zzh(cls);
        }
        return -1;
    }
}
