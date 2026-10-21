package com.esotericsoftware.kryo.unsafe;

import androidx.camera.core.impl.v;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.util.Util;
import com.esotericsoftware.minlog.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import sun.misc.Unsafe;
import sun.nio.ch.DirectBuffer;

/* JADX INFO: loaded from: classes9.dex */
public class UnsafeUtil {
    public static final long booleanArrayBaseOffset;
    public static final long byteArrayBaseOffset;
    public static final long charArrayBaseOffset;
    private static Method cleanMethod;
    private static Method cleanerMethod;
    private static Constructor<? extends ByteBuffer> directByteBufferConstructor;
    public static final long doubleArrayBaseOffset;
    public static final long floatArrayBaseOffset;
    public static final long intArrayBaseOffset;
    public static final long longArrayBaseOffset;
    public static final long shortArrayBaseOffset;
    public static final Unsafe unsafe;

    /* JADX WARN: Code duplicated, block: B:52:0x00cc  */
    static {
        long jArrayBaseOffset;
        long j10;
        Unsafe unsafe2;
        long jArrayBaseOffset2;
        long jArrayBaseOffset3;
        long jArrayBaseOffset4;
        long jArrayBaseOffset5;
        long j11;
        long j12;
        long j13;
        long j14;
        long jArrayBaseOffset6;
        long j15;
        try {
            if (Util.isAndroid) {
                if (Log.DEBUG) {
                    Log.debug("kryo", "Unsafe is not available on Android.");
                }
                jArrayBaseOffset = 0;
                j13 = 0;
                unsafe2 = null;
                jArrayBaseOffset3 = 0;
                jArrayBaseOffset4 = 0;
                jArrayBaseOffset5 = 0;
                jArrayBaseOffset6 = 0;
                j15 = 0;
                j11 = 0;
            } else {
                Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                unsafe2 = (Unsafe) declaredField.get(null);
                try {
                    jArrayBaseOffset2 = unsafe2.arrayBaseOffset(byte[].class);
                    try {
                        jArrayBaseOffset3 = unsafe2.arrayBaseOffset(char[].class);
                        try {
                            jArrayBaseOffset4 = unsafe2.arrayBaseOffset(short[].class);
                            try {
                                jArrayBaseOffset5 = unsafe2.arrayBaseOffset(int[].class);
                                try {
                                    long jArrayBaseOffset7 = unsafe2.arrayBaseOffset(float[].class);
                                    try {
                                        j15 = jArrayBaseOffset7;
                                        long jArrayBaseOffset8 = unsafe2.arrayBaseOffset(long[].class);
                                        try {
                                            j11 = jArrayBaseOffset8;
                                            jArrayBaseOffset = unsafe2.arrayBaseOffset(double[].class);
                                            try {
                                                jArrayBaseOffset6 = unsafe2.arrayBaseOffset(boolean[].class);
                                                unsafe2 = unsafe2;
                                                j13 = jArrayBaseOffset2;
                                            } catch (Exception e5) {
                                                e = e5;
                                                j10 = j15;
                                                if (Log.DEBUG) {
                                                    Log.debug("kryo", "Unsafe is not available.", e);
                                                }
                                                j12 = 0;
                                                long j16 = j10;
                                                j13 = jArrayBaseOffset2;
                                                j14 = j16;
                                            }
                                        } catch (Exception e7) {
                                            e = e7;
                                            j11 = jArrayBaseOffset8;
                                            j10 = j15;
                                            jArrayBaseOffset = 0;
                                        }
                                    } catch (Exception e10) {
                                        e = e10;
                                        j10 = jArrayBaseOffset7;
                                        jArrayBaseOffset = 0;
                                        j11 = 0;
                                        if (Log.DEBUG) {
                                            Log.debug("kryo", "Unsafe is not available.", e);
                                        }
                                        j12 = 0;
                                        long j17 = j10;
                                        j13 = jArrayBaseOffset2;
                                        j14 = j17;
                                        byteArrayBaseOffset = j13;
                                        charArrayBaseOffset = jArrayBaseOffset3;
                                        shortArrayBaseOffset = jArrayBaseOffset4;
                                        intArrayBaseOffset = jArrayBaseOffset5;
                                        floatArrayBaseOffset = j14;
                                        longArrayBaseOffset = j11;
                                        doubleArrayBaseOffset = jArrayBaseOffset;
                                        booleanArrayBaseOffset = j12;
                                        unsafe = unsafe2;
                                        Constructor declaredConstructor = ByteBuffer.allocateDirect(1).getClass().getDeclaredConstructor(Long.TYPE, Integer.TYPE);
                                        directByteBufferConstructor = declaredConstructor;
                                        declaredConstructor.setAccessible(true);
                                        Method method = DirectBuffer.class.getMethod("cleaner", new Class[0]);
                                        cleanerMethod = method;
                                        method.setAccessible(true);
                                        cleanMethod = cleanerMethod.getReturnType().getMethod("clean", new Class[0]);
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    jArrayBaseOffset = 0;
                                    j10 = 0;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                jArrayBaseOffset = 0;
                                j10 = 0;
                                jArrayBaseOffset5 = 0;
                                j11 = 0;
                                if (Log.DEBUG) {
                                    Log.debug("kryo", "Unsafe is not available.", e);
                                }
                                j12 = 0;
                                long j18 = j10;
                                j13 = jArrayBaseOffset2;
                                j14 = j18;
                                byteArrayBaseOffset = j13;
                                charArrayBaseOffset = jArrayBaseOffset3;
                                shortArrayBaseOffset = jArrayBaseOffset4;
                                intArrayBaseOffset = jArrayBaseOffset5;
                                floatArrayBaseOffset = j14;
                                longArrayBaseOffset = j11;
                                doubleArrayBaseOffset = jArrayBaseOffset;
                                booleanArrayBaseOffset = j12;
                                unsafe = unsafe2;
                                Constructor declaredConstructor2 = ByteBuffer.allocateDirect(1).getClass().getDeclaredConstructor(Long.TYPE, Integer.TYPE);
                                directByteBufferConstructor = declaredConstructor2;
                                declaredConstructor2.setAccessible(true);
                                Method method2 = DirectBuffer.class.getMethod("cleaner", new Class[0]);
                                cleanerMethod = method2;
                                method2.setAccessible(true);
                                cleanMethod = cleanerMethod.getReturnType().getMethod("clean", new Class[0]);
                            }
                        } catch (Exception e13) {
                            e = e13;
                            jArrayBaseOffset = 0;
                            j10 = 0;
                            jArrayBaseOffset4 = 0;
                            jArrayBaseOffset5 = 0;
                            j11 = 0;
                            if (Log.DEBUG) {
                                Log.debug("kryo", "Unsafe is not available.", e);
                            }
                            j12 = 0;
                            long j19 = j10;
                            j13 = jArrayBaseOffset2;
                            j14 = j19;
                            byteArrayBaseOffset = j13;
                            charArrayBaseOffset = jArrayBaseOffset3;
                            shortArrayBaseOffset = jArrayBaseOffset4;
                            intArrayBaseOffset = jArrayBaseOffset5;
                            floatArrayBaseOffset = j14;
                            longArrayBaseOffset = j11;
                            doubleArrayBaseOffset = jArrayBaseOffset;
                            booleanArrayBaseOffset = j12;
                            unsafe = unsafe2;
                            Constructor declaredConstructor3 = ByteBuffer.allocateDirect(1).getClass().getDeclaredConstructor(Long.TYPE, Integer.TYPE);
                            directByteBufferConstructor = declaredConstructor3;
                            declaredConstructor3.setAccessible(true);
                            Method method3 = DirectBuffer.class.getMethod("cleaner", new Class[0]);
                            cleanerMethod = method3;
                            method3.setAccessible(true);
                            cleanMethod = cleanerMethod.getReturnType().getMethod("clean", new Class[0]);
                        }
                    } catch (Exception e14) {
                        e = e14;
                        jArrayBaseOffset = 0;
                        j10 = 0;
                        jArrayBaseOffset3 = 0;
                        jArrayBaseOffset4 = 0;
                        jArrayBaseOffset5 = 0;
                        j11 = 0;
                        if (Log.DEBUG) {
                            Log.debug("kryo", "Unsafe is not available.", e);
                        }
                        j12 = 0;
                        long j110 = j10;
                        j13 = jArrayBaseOffset2;
                        j14 = j110;
                        byteArrayBaseOffset = j13;
                        charArrayBaseOffset = jArrayBaseOffset3;
                        shortArrayBaseOffset = jArrayBaseOffset4;
                        intArrayBaseOffset = jArrayBaseOffset5;
                        floatArrayBaseOffset = j14;
                        longArrayBaseOffset = j11;
                        doubleArrayBaseOffset = jArrayBaseOffset;
                        booleanArrayBaseOffset = j12;
                        unsafe = unsafe2;
                        Constructor declaredConstructor4 = ByteBuffer.allocateDirect(1).getClass().getDeclaredConstructor(Long.TYPE, Integer.TYPE);
                        directByteBufferConstructor = declaredConstructor4;
                        declaredConstructor4.setAccessible(true);
                        Method method4 = DirectBuffer.class.getMethod("cleaner", new Class[0]);
                        cleanerMethod = method4;
                        method4.setAccessible(true);
                        cleanMethod = cleanerMethod.getReturnType().getMethod("clean", new Class[0]);
                    }
                } catch (Exception e15) {
                    e = e15;
                    jArrayBaseOffset = 0;
                    j10 = 0;
                    jArrayBaseOffset2 = 0;
                    jArrayBaseOffset3 = 0;
                    jArrayBaseOffset4 = 0;
                    jArrayBaseOffset5 = 0;
                    j11 = 0;
                    if (Log.DEBUG) {
                        Log.debug("kryo", "Unsafe is not available.", e);
                    }
                    j12 = 0;
                    long j111 = j10;
                    j13 = jArrayBaseOffset2;
                    j14 = j111;
                    byteArrayBaseOffset = j13;
                    charArrayBaseOffset = jArrayBaseOffset3;
                    shortArrayBaseOffset = jArrayBaseOffset4;
                    intArrayBaseOffset = jArrayBaseOffset5;
                    floatArrayBaseOffset = j14;
                    longArrayBaseOffset = j11;
                    doubleArrayBaseOffset = jArrayBaseOffset;
                    booleanArrayBaseOffset = j12;
                    unsafe = unsafe2;
                    Constructor declaredConstructor5 = ByteBuffer.allocateDirect(1).getClass().getDeclaredConstructor(Long.TYPE, Integer.TYPE);
                    directByteBufferConstructor = declaredConstructor5;
                    declaredConstructor5.setAccessible(true);
                    Method method5 = DirectBuffer.class.getMethod("cleaner", new Class[0]);
                    cleanerMethod = method5;
                    method5.setAccessible(true);
                    cleanMethod = cleanerMethod.getReturnType().getMethod("clean", new Class[0]);
                }
            }
            j14 = j15;
            j12 = jArrayBaseOffset6;
        } catch (Exception e16) {
            e = e16;
            jArrayBaseOffset = 0;
            j10 = 0;
            unsafe2 = null;
        }
        byteArrayBaseOffset = j13;
        charArrayBaseOffset = jArrayBaseOffset3;
        shortArrayBaseOffset = jArrayBaseOffset4;
        intArrayBaseOffset = jArrayBaseOffset5;
        floatArrayBaseOffset = j14;
        longArrayBaseOffset = j11;
        doubleArrayBaseOffset = jArrayBaseOffset;
        booleanArrayBaseOffset = j12;
        unsafe = unsafe2;
        try {
            Constructor declaredConstructor6 = ByteBuffer.allocateDirect(1).getClass().getDeclaredConstructor(Long.TYPE, Integer.TYPE);
            directByteBufferConstructor = declaredConstructor6;
            declaredConstructor6.setAccessible(true);
        } catch (Exception e17) {
            if (Log.DEBUG) {
                Log.debug("kryo", "No direct ByteBuffer constructor is available.", e17);
            }
            directByteBufferConstructor = null;
        }
        try {
            Method method6 = DirectBuffer.class.getMethod("cleaner", new Class[0]);
            cleanerMethod = method6;
            method6.setAccessible(true);
            cleanMethod = cleanerMethod.getReturnType().getMethod("clean", new Class[0]);
        } catch (Exception e18) {
            if (Log.DEBUG) {
                Log.debug("kryo", "No direct ByteBuffer clean method is available.", e18);
            }
            cleanerMethod = null;
        }
    }

    public static void dispose(ByteBuffer byteBuffer) {
        Method method;
        if ((byteBuffer instanceof DirectBuffer) && (method = cleanerMethod) != null) {
            try {
                cleanMethod.invoke(method.invoke(byteBuffer, new Object[0]), new Object[0]);
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean isNewDirectBufferAvailable() {
        return directByteBufferConstructor != null;
    }

    public static ByteBuffer newDirectBuffer(long j10, int i10) {
        Constructor<? extends ByteBuffer> constructor = directByteBufferConstructor;
        if (constructor == null) {
            throw new UnsupportedOperationException("No direct ByteBuffer constructor is available.");
        }
        try {
            return constructor.newInstance(Long.valueOf(j10), Integer.valueOf(i10));
        } catch (Exception e5) {
            throw new KryoException(v.c("Error creating a ByteBuffer at address: ", j10), e5);
        }
    }
}
