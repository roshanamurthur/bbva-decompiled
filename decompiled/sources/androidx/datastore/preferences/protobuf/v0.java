package androidx.datastore.preferences.protobuf;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: UnsafeUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f21148a = Logger.getLogger(v0.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Unsafe f21149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class<?> f21150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f21151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f21152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f21153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f21154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f21155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f21156i;

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public static class a implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() throws Exception {
            for (java.lang.reflect.Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
            return a();
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public static final class b extends e {
        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final void d(byte[] bArr, long j10, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final boolean e(long j10, Object obj) {
            if (v0.f21156i) {
                return v0.i(j10, obj) != 0;
            }
            return v0.j(j10, obj) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final byte f(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final byte g(long j10, Object obj) {
            return v0.f21156i ? v0.i(j10, obj) : v0.j(j10, obj);
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final double h(long j10, Object obj) {
            return Double.longBitsToDouble(l(j10, obj));
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final float i(long j10, Object obj) {
            return Float.intBitsToFloat(j(j10, obj));
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final long k(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final void o(Object obj, long j10, boolean z10) {
            if (v0.f21156i) {
                v0.r(obj, j10, z10 ? (byte) 1 : (byte) 0);
            } else {
                v0.s(obj, j10, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final void p(long j10, byte b10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final void q(Object obj, long j10, byte b10) {
            if (v0.f21156i) {
                v0.r(obj, j10, b10);
            } else {
                v0.s(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final void r(Object obj, long j10, double d2) {
            u(obj, j10, Double.doubleToLongBits(d2));
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final void s(Object obj, long j10, float f6) {
            t(Float.floatToIntBits(f6), j10, obj);
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public static final class c extends e {
        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final void d(byte[] bArr, long j10, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final boolean e(long j10, Object obj) {
            if (v0.f21156i) {
                return v0.i(j10, obj) != 0;
            }
            return v0.j(j10, obj) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final byte f(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final byte g(long j10, Object obj) {
            return v0.f21156i ? v0.i(j10, obj) : v0.j(j10, obj);
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final double h(long j10, Object obj) {
            return Double.longBitsToDouble(l(j10, obj));
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final float i(long j10, Object obj) {
            return Float.intBitsToFloat(j(j10, obj));
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final long k(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final void o(Object obj, long j10, boolean z10) {
            if (v0.f21156i) {
                v0.r(obj, j10, z10 ? (byte) 1 : (byte) 0);
            } else {
                v0.s(obj, j10, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final void p(long j10, byte b10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final void q(Object obj, long j10, byte b10) {
            if (v0.f21156i) {
                v0.r(obj, j10, b10);
            } else {
                v0.s(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final void r(Object obj, long j10, double d2) {
            u(obj, j10, Double.doubleToLongBits(d2));
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final void s(Object obj, long j10, float f6) {
            t(Float.floatToIntBits(f6), j10, obj);
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public static final class d extends e {
        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final void c(long j10, byte[] bArr, long j11, long j12) {
            this.f21157a.copyMemory((Object) null, j10, bArr, v0.f21154g + j11, j12);
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final void d(byte[] bArr, long j10, long j11, long j12) {
            this.f21157a.copyMemory(bArr, v0.f21154g + j10, (Object) null, j11, j12);
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final boolean e(long j10, Object obj) {
            return this.f21157a.getBoolean(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final byte f(long j10) {
            return this.f21157a.getByte(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final byte g(long j10, Object obj) {
            return this.f21157a.getByte(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final double h(long j10, Object obj) {
            return this.f21157a.getDouble(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final float i(long j10, Object obj) {
            return this.f21157a.getFloat(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final long k(long j10) {
            return this.f21157a.getLong(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final void o(Object obj, long j10, boolean z10) {
            this.f21157a.putBoolean(obj, j10, z10);
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final void p(long j10, byte b10) {
            this.f21157a.putByte(j10, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final void q(Object obj, long j10, byte b10) {
            this.f21157a.putByte(obj, j10, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final void r(Object obj, long j10, double d2) {
            this.f21157a.putDouble(obj, j10, d2);
        }

        @Override // androidx.datastore.preferences.protobuf.v0.e
        public final void s(Object obj, long j10, float f6) {
            this.f21157a.putFloat(obj, j10, f6);
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Unsafe f21157a;

        public e(Unsafe unsafe) {
            this.f21157a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f21157a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f21157a.arrayIndexScale(cls);
        }

        public abstract void c(long j10, byte[] bArr, long j11, long j12);

        public abstract void d(byte[] bArr, long j10, long j11, long j12);

        public abstract boolean e(long j10, Object obj);

        public abstract byte f(long j10);

        public abstract byte g(long j10, Object obj);

        public abstract double h(long j10, Object obj);

        public abstract float i(long j10, Object obj);

        public final int j(long j10, Object obj) {
            return this.f21157a.getInt(obj, j10);
        }

        public abstract long k(long j10);

        public final long l(long j10, Object obj) {
            return this.f21157a.getLong(obj, j10);
        }

        public final Object m(long j10, Object obj) {
            return this.f21157a.getObject(obj, j10);
        }

        public final long n(java.lang.reflect.Field field) {
            return this.f21157a.objectFieldOffset(field);
        }

        public abstract void o(Object obj, long j10, boolean z10);

        public abstract void p(long j10, byte b10);

        public abstract void q(Object obj, long j10, byte b10);

        public abstract void r(Object obj, long j10, double d2);

        public abstract void s(Object obj, long j10, float f6);

        public final void t(int i10, long j10, Object obj) {
            this.f21157a.putInt(obj, j10, i10);
        }

        public final void u(Object obj, long j10, long j11) {
            this.f21157a.putLong(obj, j10, j11);
        }

        public final void v(long j10, Object obj, Object obj2) {
            this.f21157a.putObject(obj, j10, obj2);
        }
    }

    static {
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        e eVar;
        Unsafe unsafeN = n();
        f21149b = unsafeN;
        f21150c = androidx.datastore.preferences.protobuf.b.f21015a;
        Class<?> cls = Long.TYPE;
        boolean zG = g(cls);
        Class<?> cls2 = Integer.TYPE;
        boolean zG2 = g(cls2);
        e dVar = null;
        if (unsafeN != null) {
            if (!androidx.datastore.preferences.protobuf.b.a()) {
                dVar = new d(unsafeN);
            } else if (zG) {
                dVar = new c(unsafeN);
            } else if (zG2) {
                dVar = new b(unsafeN);
            }
        }
        f21151d = dVar;
        if (unsafeN == null) {
            str = "getByte";
            z10 = false;
        } else {
            try {
                Class<?> cls3 = unsafeN.getClass();
                cls3.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (e() == null) {
                    str = "getByte";
                    z10 = false;
                } else {
                    if (androidx.datastore.preferences.protobuf.b.a()) {
                        str = "getByte";
                    } else {
                        cls3.getMethod("getByte", cls);
                        Class<?>[] clsArr = new Class[2];
                        clsArr[0] = cls;
                        str = "getByte";
                        try {
                            clsArr[1] = Byte.TYPE;
                            cls3.getMethod("putByte", clsArr);
                            cls3.getMethod("getInt", cls);
                            cls3.getMethod("putInt", cls, cls2);
                            cls3.getMethod("getLong", cls);
                            cls3.getMethod("putLong", cls, cls);
                            cls3.getMethod("copyMemory", cls, cls, cls);
                            cls3.getMethod("copyMemory", Object.class, cls, Object.class, cls, cls);
                        } catch (Throwable th2) {
                            th = th2;
                            f21148a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
                            z10 = false;
                        }
                    }
                    z10 = true;
                }
            } catch (Throwable th3) {
                th = th3;
                str = "getByte";
            }
        }
        f21152e = z10;
        Unsafe unsafe = f21149b;
        if (unsafe == null) {
            z12 = false;
            z11 = true;
        } else {
            try {
                Class<?> cls4 = unsafe.getClass();
                try {
                    cls4.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                    cls4.getMethod("arrayBaseOffset", Class.class);
                    Class<?>[] clsArr2 = new Class[1];
                    clsArr2[0] = Class.class;
                    cls4.getMethod("arrayIndexScale", clsArr2);
                    Class<?>[] clsArr3 = new Class[2];
                    clsArr3[0] = Object.class;
                    Class<?> cls5 = Long.TYPE;
                    boolean z13 = true;
                    try {
                        clsArr3[1] = cls5;
                        cls4.getMethod("getInt", clsArr3);
                        Class<?>[] clsArr4 = new Class[3];
                        clsArr4[0] = Object.class;
                        clsArr4[1] = cls5;
                        clsArr4[2] = Integer.TYPE;
                        cls4.getMethod("putInt", clsArr4);
                        Class<?>[] clsArr5 = new Class[2];
                        clsArr5[0] = Object.class;
                        clsArr5[1] = cls5;
                        cls4.getMethod("getLong", clsArr5);
                        Class<?>[] clsArr6 = new Class[3];
                        clsArr6[0] = Object.class;
                        clsArr6[1] = cls5;
                        clsArr6[2] = cls5;
                        cls4.getMethod("putLong", clsArr6);
                        Class<?>[] clsArr7 = new Class[2];
                        clsArr7[0] = Object.class;
                        clsArr7[1] = cls5;
                        cls4.getMethod("getObject", clsArr7);
                        Class<?>[] clsArr8 = new Class[3];
                        clsArr8[0] = Object.class;
                        clsArr8[1] = cls5;
                        clsArr8[2] = Object.class;
                        cls4.getMethod("putObject", clsArr8);
                        if (androidx.datastore.preferences.protobuf.b.a()) {
                            z11 = true;
                            z12 = true;
                        } else {
                            Class<?>[] clsArr9 = new Class[2];
                            clsArr9[0] = Object.class;
                            z13 = true;
                            clsArr9[1] = cls5;
                            cls4.getMethod(str, clsArr9);
                            Class<?>[] clsArr10 = new Class[3];
                            clsArr10[0] = Object.class;
                            clsArr10[1] = cls5;
                            clsArr10[2] = Byte.TYPE;
                            cls4.getMethod("putByte", clsArr10);
                            Class<?>[] clsArr11 = new Class[2];
                            clsArr11[0] = Object.class;
                            boolean z14 = true;
                            try {
                                clsArr11[1] = cls5;
                                cls4.getMethod("getBoolean", clsArr11);
                                Class<?>[] clsArr12 = new Class[3];
                                clsArr12[0] = Object.class;
                                clsArr12[1] = cls5;
                                clsArr12[2] = Boolean.TYPE;
                                cls4.getMethod("putBoolean", clsArr12);
                                Class<?>[] clsArr13 = new Class[2];
                                clsArr13[0] = Object.class;
                                z14 = true;
                                clsArr13[1] = cls5;
                                cls4.getMethod("getFloat", clsArr13);
                                Class<?>[] clsArr14 = new Class[3];
                                clsArr14[0] = Object.class;
                                clsArr14[1] = cls5;
                                clsArr14[2] = Float.TYPE;
                                cls4.getMethod("putFloat", clsArr14);
                                Class<?>[] clsArr15 = new Class[2];
                                clsArr15[0] = Object.class;
                                z11 = true;
                                try {
                                    clsArr15[1] = cls5;
                                    cls4.getMethod("getDouble", clsArr15);
                                    cls4.getMethod("putDouble", Object.class, cls5, Double.TYPE);
                                    z12 = true;
                                } catch (Throwable th4) {
                                    th = th4;
                                    f21148a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
                                    z12 = false;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                z11 = z14;
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        z11 = z13;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    z11 = true;
                }
            } catch (Throwable th8) {
                th = th8;
                z11 = true;
            }
        }
        f21153f = z12;
        f21154g = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        java.lang.reflect.Field fieldE = e();
        f21155h = (fieldE == null || (eVar = f21151d) == null) ? -1L : eVar.n(fieldE);
        f21156i = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN ? z11 : false;
    }

    public static long a(ByteBuffer byteBuffer) {
        return f21151d.l(f21155h, byteBuffer);
    }

    public static <T> T b(Class<T> cls) {
        try {
            return (T) f21149b.allocateInstance(cls);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(e5);
        }
    }

    public static int c(Class<?> cls) {
        if (f21153f) {
            return f21151d.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f21153f) {
            f21151d.b(cls);
        }
    }

    public static java.lang.reflect.Field e() {
        java.lang.reflect.Field declaredField;
        java.lang.reflect.Field declaredField2;
        if (androidx.datastore.preferences.protobuf.b.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static void f(long j10, byte[] bArr, long j11, long j12) {
        f21151d.c(j10, bArr, j11, j12);
    }

    public static boolean g(Class<?> cls) {
        if (!androidx.datastore.preferences.protobuf.b.a()) {
            return false;
        }
        try {
            Class<?> cls2 = f21150c;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
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

    public static byte h(long j10, byte[] bArr) {
        return f21151d.g(f21154g + j10, bArr);
    }

    public static byte i(long j10, Object obj) {
        return (byte) ((f21151d.j((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static byte j(long j10, Object obj) {
        return (byte) ((f21151d.j((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    public static int k(long j10, Object obj) {
        return f21151d.j(j10, obj);
    }

    public static long l(long j10, Object obj) {
        return f21151d.l(j10, obj);
    }

    public static Object m(long j10, Object obj) {
        return f21151d.m(j10, obj);
    }

    public static Unsafe n() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void o(Object obj, long j10, boolean z10) {
        f21151d.o(obj, j10, z10);
    }

    public static void p(long j10, byte b10) {
        f21151d.p(j10, b10);
    }

    public static void q(byte[] bArr, long j10, byte b10) {
        f21151d.q(bArr, f21154g + j10, b10);
    }

    public static void r(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iJ = f21151d.j(j11, obj);
        int i10 = ((~((int) j10)) & 3) << 3;
        v(((255 & b10) << i10) | (iJ & (~(255 << i10))), j11, obj);
    }

    public static void s(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        v(((255 & b10) << i10) | (f21151d.j(j11, obj) & (~(255 << i10))), j11, obj);
    }

    public static void t(Object obj, long j10, double d2) {
        f21151d.r(obj, j10, d2);
    }

    public static void u(Object obj, long j10, float f6) {
        f21151d.s(obj, j10, f6);
    }

    public static void v(int i10, long j10, Object obj) {
        f21151d.t(i10, j10, obj);
    }

    public static void w(Object obj, long j10, long j11) {
        f21151d.u(obj, j10, j11);
    }

    public static void x(long j10, Object obj, Object obj2) {
        f21151d.v(j10, obj, obj2);
    }
}
