package com.google.crypto.tink.shaded.protobuf;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: UnsafeUtil.java */
/* JADX INFO: loaded from: classes10.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f47306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?> f47307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f47308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f47309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f47310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f47311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f47312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f47313h;

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public class a implements PrivilegedExceptionAction<Unsafe> {
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
        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final void d(byte[] bArr, long j10, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final boolean e(long j10, Object obj) {
            if (x0.f47313h) {
                return x0.j(j10, obj) != 0;
            }
            return x0.k(j10, obj) != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final byte f(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final byte g(long j10, Object obj) {
            return x0.f47313h ? x0.j(j10, obj) : x0.k(j10, obj);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final double h(long j10, Object obj) {
            return Double.longBitsToDouble(l(j10, obj));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final float i(long j10, Object obj) {
            return Float.intBitsToFloat(j(j10, obj));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final long k(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final void o(Object obj, long j10, boolean z10) {
            if (x0.f47313h) {
                x0.s(obj, j10, z10 ? (byte) 1 : (byte) 0);
            } else {
                x0.t(obj, j10, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final void p(long j10, byte b10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final void q(Object obj, long j10, byte b10) {
            if (x0.f47313h) {
                x0.s(obj, j10, b10);
            } else {
                x0.t(obj, j10, b10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final void r(Object obj, long j10, double d2) {
            u(obj, j10, Double.doubleToLongBits(d2));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final void s(Object obj, long j10, float f6) {
            t(Float.floatToIntBits(f6), j10, obj);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final boolean x() {
            return false;
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public static final class c extends e {
        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final void c(long j10, byte[] bArr, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final void d(byte[] bArr, long j10, long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final boolean e(long j10, Object obj) {
            if (x0.f47313h) {
                return x0.j(j10, obj) != 0;
            }
            return x0.k(j10, obj) != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final byte f(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final byte g(long j10, Object obj) {
            return x0.f47313h ? x0.j(j10, obj) : x0.k(j10, obj);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final double h(long j10, Object obj) {
            return Double.longBitsToDouble(l(j10, obj));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final float i(long j10, Object obj) {
            return Float.intBitsToFloat(j(j10, obj));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final long k(long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final void o(Object obj, long j10, boolean z10) {
            if (x0.f47313h) {
                x0.s(obj, j10, z10 ? (byte) 1 : (byte) 0);
            } else {
                x0.t(obj, j10, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final void p(long j10, byte b10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final void q(Object obj, long j10, byte b10) {
            if (x0.f47313h) {
                x0.s(obj, j10, b10);
            } else {
                x0.t(obj, j10, b10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final void r(Object obj, long j10, double d2) {
            u(obj, j10, Double.doubleToLongBits(d2));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final void s(Object obj, long j10, float f6) {
            t(Float.floatToIntBits(f6), j10, obj);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final boolean x() {
            return false;
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public static final class d extends e {
        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final void c(long j10, byte[] bArr, long j11, long j12) {
            this.f47314a.copyMemory((Object) null, j10, bArr, x0.f47311f + j11, j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final void d(byte[] bArr, long j10, long j11, long j12) {
            this.f47314a.copyMemory(bArr, x0.f47311f + j10, (Object) null, j11, j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final boolean e(long j10, Object obj) {
            return this.f47314a.getBoolean(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final byte f(long j10) {
            return this.f47314a.getByte(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final byte g(long j10, Object obj) {
            return this.f47314a.getByte(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final double h(long j10, Object obj) {
            return this.f47314a.getDouble(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final float i(long j10, Object obj) {
            return this.f47314a.getFloat(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final long k(long j10) {
            return this.f47314a.getLong(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final void o(Object obj, long j10, boolean z10) {
            this.f47314a.putBoolean(obj, j10, z10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final void p(long j10, byte b10) {
            this.f47314a.putByte(j10, b10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final void q(Object obj, long j10, byte b10) {
            this.f47314a.putByte(obj, j10, b10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final void r(Object obj, long j10, double d2) {
            this.f47314a.putDouble(obj, j10, d2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final void s(Object obj, long j10, float f6) {
            this.f47314a.putFloat(obj, j10, f6);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final boolean w() {
            if (!super.w()) {
                return false;
            }
            try {
                Class<?> cls = this.f47314a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th2) {
                x0.a(th2);
                return false;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0.e
        public final boolean x() {
            Unsafe unsafe = this.f47314a;
            if (unsafe != null) {
                try {
                    Class<?> cls = unsafe.getClass();
                    cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                    Class<?> cls2 = Long.TYPE;
                    cls.getMethod("getLong", Object.class, cls2);
                    if (x0.f() != null) {
                        try {
                            Class<?> cls3 = unsafe.getClass();
                            cls3.getMethod("getByte", cls2);
                            cls3.getMethod("putByte", cls2, Byte.TYPE);
                            cls3.getMethod("getInt", cls2);
                            cls3.getMethod("putInt", cls2, Integer.TYPE);
                            cls3.getMethod("getLong", cls2);
                            cls3.getMethod("putLong", cls2, cls2);
                            cls3.getMethod("copyMemory", cls2, cls2, cls2);
                            cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                            return true;
                        } catch (Throwable th2) {
                            x0.a(th2);
                            return false;
                        }
                    }
                } catch (Throwable th3) {
                    x0.a(th3);
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: UnsafeUtil.java */
    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Unsafe f47314a;

        public e(Unsafe unsafe) {
            this.f47314a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f47314a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f47314a.arrayIndexScale(cls);
        }

        public abstract void c(long j10, byte[] bArr, long j11, long j12);

        public abstract void d(byte[] bArr, long j10, long j11, long j12);

        public abstract boolean e(long j10, Object obj);

        public abstract byte f(long j10);

        public abstract byte g(long j10, Object obj);

        public abstract double h(long j10, Object obj);

        public abstract float i(long j10, Object obj);

        public final int j(long j10, Object obj) {
            return this.f47314a.getInt(obj, j10);
        }

        public abstract long k(long j10);

        public final long l(long j10, Object obj) {
            return this.f47314a.getLong(obj, j10);
        }

        public final Object m(long j10, Object obj) {
            return this.f47314a.getObject(obj, j10);
        }

        public final long n(java.lang.reflect.Field field) {
            return this.f47314a.objectFieldOffset(field);
        }

        public abstract void o(Object obj, long j10, boolean z10);

        public abstract void p(long j10, byte b10);

        public abstract void q(Object obj, long j10, byte b10);

        public abstract void r(Object obj, long j10, double d2);

        public abstract void s(Object obj, long j10, float f6);

        public final void t(int i10, long j10, Object obj) {
            this.f47314a.putInt(obj, j10, i10);
        }

        public final void u(Object obj, long j10, long j11) {
            this.f47314a.putLong(obj, j10, j11);
        }

        public final void v(long j10, Object obj, Object obj2) {
            this.f47314a.putObject(obj, j10, obj2);
        }

        public boolean w() {
            Unsafe unsafe = this.f47314a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th2) {
                x0.a(th2);
                return false;
            }
        }

        public abstract boolean x();
    }

    static {
        Unsafe unsafeO = o();
        f47306a = unsafeO;
        f47307b = com.google.crypto.tink.shaded.protobuf.b.f47179a;
        boolean zH = h(Long.TYPE);
        boolean zH2 = h(Integer.TYPE);
        e dVar = null;
        if (unsafeO != null) {
            if (!com.google.crypto.tink.shaded.protobuf.b.a()) {
                dVar = new d(unsafeO);
            } else if (zH) {
                dVar = new c(unsafeO);
            } else if (zH2) {
                dVar = new b(unsafeO);
            }
        }
        f47308c = dVar;
        f47309d = dVar == null ? false : dVar.x();
        f47310e = dVar == null ? false : dVar.w();
        f47311f = d(byte[].class);
        d(boolean[].class);
        e(boolean[].class);
        d(int[].class);
        e(int[].class);
        d(long[].class);
        e(long[].class);
        d(float[].class);
        e(float[].class);
        d(double[].class);
        e(double[].class);
        d(Object[].class);
        e(Object[].class);
        java.lang.reflect.Field fieldF = f();
        f47312g = (fieldF == null || dVar == null) ? -1L : dVar.n(fieldF);
        f47313h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th2) {
        Logger.getLogger(x0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static long b(ByteBuffer byteBuffer) {
        return f47308c.l(f47312g, byteBuffer);
    }

    public static <T> T c(Class<T> cls) {
        try {
            return (T) f47306a.allocateInstance(cls);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(e5);
        }
    }

    public static int d(Class<?> cls) {
        if (f47310e) {
            return f47308c.a(cls);
        }
        return -1;
    }

    public static void e(Class cls) {
        if (f47310e) {
            f47308c.b(cls);
        }
    }

    public static java.lang.reflect.Field f() {
        java.lang.reflect.Field declaredField;
        java.lang.reflect.Field declaredField2;
        if (com.google.crypto.tink.shaded.protobuf.b.a()) {
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

    public static void g(long j10, byte[] bArr, long j11, long j12) {
        f47308c.c(j10, bArr, j11, j12);
    }

    public static boolean h(Class<?> cls) {
        if (!com.google.crypto.tink.shaded.protobuf.b.a()) {
            return false;
        }
        try {
            Class<?> cls2 = f47307b;
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

    public static byte i(long j10, byte[] bArr) {
        return f47308c.g(f47311f + j10, bArr);
    }

    public static byte j(long j10, Object obj) {
        return (byte) ((f47308c.j((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static byte k(long j10, Object obj) {
        return (byte) ((f47308c.j((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    public static int l(long j10, Object obj) {
        return f47308c.j(j10, obj);
    }

    public static long m(long j10, Object obj) {
        return f47308c.l(j10, obj);
    }

    public static Object n(long j10, Object obj) {
        return f47308c.m(j10, obj);
    }

    public static Unsafe o() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void p(Object obj, long j10, boolean z10) {
        f47308c.o(obj, j10, z10);
    }

    public static void q(long j10, byte b10) {
        f47308c.p(j10, b10);
    }

    public static void r(byte[] bArr, long j10, byte b10) {
        f47308c.q(bArr, f47311f + j10, b10);
    }

    public static void s(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iJ = f47308c.j(j11, obj);
        int i10 = ((~((int) j10)) & 3) << 3;
        w(((255 & b10) << i10) | (iJ & (~(255 << i10))), j11, obj);
    }

    public static void t(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        w(((255 & b10) << i10) | (f47308c.j(j11, obj) & (~(255 << i10))), j11, obj);
    }

    public static void u(Object obj, long j10, double d2) {
        f47308c.r(obj, j10, d2);
    }

    public static void v(Object obj, long j10, float f6) {
        f47308c.s(obj, j10, f6);
    }

    public static void w(int i10, long j10, Object obj) {
        f47308c.t(i10, j10, obj);
    }

    public static void x(Object obj, long j10, long j11) {
        f47308c.u(obj, j10, j11);
    }

    public static void y(long j10, Object obj, Object obj2) {
        f47308c.v(j10, obj, obj2);
    }
}
