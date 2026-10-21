package com.mypinpad.tsdk.isolation;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.PointerIconCompat;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class getValidUntil implements SensorEventListener {
    public static int E0;
    public static int F0;
    public static int G0;
    public static int H0;
    public static final byte[] I0 = null;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final char[] f55976y0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final SensorManager f55977p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Function2<setWillNotCacheDrawing, getValidUntil, Unit> f55978q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Date f55979r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public HandlerThread f55980s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public final Sensor f55981t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public final Sensor f55982u0;

    @Nullable
    public final Sensor v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Nullable
    public final Sensor f55983w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Nullable
    public final Sensor f55984x0;

    static {
        d();
        G0 = 0;
        H0 = 1;
        E0 = 0;
        F0 = 1;
        f55976y0 = new char[]{59122, 58966, 58922, 58963, 58975, 58962, 59063, 59084, 59131, 59111, 59107, 59097, 59092, 59132, 59128, 59129, 59133, 59121, 59134, 59131, 59129, 59131, 59090, 59092, 59127, 59122, 59103, 59096, 59103, 59092, 59126, 59095, 59100, 59134, 59121, 59129, 59129, 59121, 59121, 59100};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getValidUntil(@NotNull SensorManager sensorManager, @NotNull Function2<? super setWillNotCacheDrawing, ? super getValidUntil, Unit> function2) {
        Intrinsics.checkNotNullParameter(sensorManager, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.f55977p0 = sensorManager;
        this.f55978q0 = function2;
        this.f55981t0 = a(1);
        this.f55982u0 = a(9);
        this.v0 = a(10);
        this.f55983w0 = a(11);
        this.f55984x0 = a(5);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0109  */
    /* JADX WARN: Code duplicated, block: B:33:0x010a A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:7:0x0032, B:11:0x0096, B:10:0x0050, B:30:0x00eb, B:34:0x014f, B:44:0x01e0, B:48:0x023c, B:47:0x01f8, B:33:0x010a, B:37:0x0163, B:41:0x01cc, B:40:0x0183), top: B:78:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0160  */
    /* JADX WARN: Code duplicated, block: B:39:0x0182  */
    /* JADX WARN: Code duplicated, block: B:40:0x0183 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:7:0x0032, B:11:0x0096, B:10:0x0050, B:30:0x00eb, B:34:0x014f, B:44:0x01e0, B:48:0x023c, B:47:0x01f8, B:33:0x010a, B:37:0x0163, B:41:0x01cc, B:40:0x0183), top: B:78:0x0032 }] */
    public static void b(String str, boolean z10, int[] iArr, Object[] objArr) throws Throwable {
        int i10;
        int i11;
        char c10;
        Map map;
        Object method;
        Map map2;
        Object method2;
        int i12 = H0 + 73;
        G0 = i12 % 128;
        int i13 = i12 % 2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener();
        char c11 = 0;
        int i14 = iArr[0];
        int i15 = 1;
        int i16 = iArr[1];
        int i17 = iArr[2];
        int i18 = iArr[3];
        char[] cArr = f55976y0;
        long j10 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i19 = 0;
            while (i19 < length) {
                try {
                    Object[] objArr2 = new Object[i15];
                    objArr2[c11] = Integer.valueOf(cArr[i19]);
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(-637734149);
                    if (method3 == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (SystemClock.elapsedRealtime() > j10 ? 1 : (SystemClock.elapsedRealtime() == j10 ? 0 : -1)) + 36, 609 - KeyEvent.getDeadChar(0, 0));
                        byte b10 = (byte) (-1);
                        byte b11 = (byte) (b10 + 4);
                        Object[] objArr3 = new Object[1];
                        c(b10, b11, (byte) (b11 - 3), objArr3);
                        method3 = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map3.put(-637734149, method3);
                    }
                    cArr2[i19] = ((Character) ((Method) method3).invoke(null, objArr2)).charValue();
                    i19++;
                    length = length;
                    cArr = cArr;
                    i17 = i17;
                    c11 = 0;
                    i15 = 1;
                    j10 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            i10 = i17;
            cArr = cArr2;
        } else {
            i10 = i17;
        }
        char[] cArr3 = new char[i16];
        System.arraycopy(cArr, i14, cArr3, 0, i16);
        if (bytes != null) {
            char[] cArr4 = new char[i16];
            setnavigationonclicklistener.setX = 0;
            char c12 = 0;
            while (true) {
                int i20 = setnavigationonclicklistener.setX;
                if (i20 >= i16) {
                    break;
                }
                int i21 = G0 + 65;
                H0 = i21 % 128;
                if (i21 % 2 != 0) {
                    c10 = 1;
                    if (bytes[i20] == 1) {
                        char c13 = cArr3[i20];
                        Object[] objArr4 = new Object[2];
                        objArr4[c10] = Integer.valueOf(c12);
                        objArr4[0] = Integer.valueOf(c13);
                        map2 = setTextScaleX.setMaxEms;
                        method2 = map2.get(1737824323);
                        if (method2 != null) {
                            Class cls2 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4449), View.getDefaultSize(0, 0) + 42, TextUtils.getTrimmedLength("") + PointerIconCompat.TYPE_GRABBING);
                            byte b12 = (byte) (-1);
                            byte b13 = (byte) (b12 + 1);
                            Object[] objArr5 = new Object[1];
                            c(b12, b13, b13, objArr5);
                            String str2 = (String) objArr5[0];
                            Class<?> cls3 = Integer.TYPE;
                            method2 = cls2.getMethod(str2, cls3, cls3);
                            map2.put(1737824323, method2);
                        }
                        cArr4[i20] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    } else {
                        Object[] objArr6 = {Integer.valueOf(cArr3[i20]), Integer.valueOf(c12)};
                        map = setTextScaleX.setMaxEms;
                        method = map.get(-504758789);
                        if (method != null) {
                            Class cls4 = (Class) setTextScaleX.setX((char) View.MeasureSpec.getSize(0), 44 - TextUtils.lastIndexOf("", '0'), 2628 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                            byte length2 = (byte) I0.length;
                            Object[] objArr7 = new Object[1];
                            c((byte) (-1), length2, (byte) (length2 - 4), objArr7);
                            String str3 = (String) objArr7[0];
                            Class<?> cls5 = Integer.TYPE;
                            method = cls4.getMethod(str3, cls5, cls5);
                            map.put(-504758789, method);
                        }
                        cArr4[i20] = ((Character) ((Method) method).invoke(null, objArr6)).charValue();
                    }
                } else if (bytes[i20] == 0) {
                    c10 = 1;
                    char c14 = cArr3[i20];
                    Object[] objArr8 = new Object[2];
                    objArr8[c10] = Integer.valueOf(c12);
                    objArr8[0] = Integer.valueOf(c14);
                    map2 = setTextScaleX.setMaxEms;
                    method2 = map2.get(1737824323);
                    if (method2 != null) {
                        Class cls6 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4449), View.getDefaultSize(0, 0) + 42, TextUtils.getTrimmedLength("") + PointerIconCompat.TYPE_GRABBING);
                        byte b14 = (byte) (-1);
                        byte b15 = (byte) (b14 + 1);
                        Object[] objArr9 = new Object[1];
                        c(b14, b15, b15, objArr9);
                        String str4 = (String) objArr9[0];
                        Class<?> cls7 = Integer.TYPE;
                        method2 = cls6.getMethod(str4, cls7, cls7);
                        map2.put(1737824323, method2);
                    }
                    cArr4[i20] = ((Character) ((Method) method2).invoke(null, objArr8)).charValue();
                } else {
                    Object[] objArr10 = {Integer.valueOf(cArr3[i20]), Integer.valueOf(c12)};
                    map = setTextScaleX.setMaxEms;
                    method = map.get(-504758789);
                    if (method != null) {
                        Class cls8 = (Class) setTextScaleX.setX((char) View.MeasureSpec.getSize(0), 44 - TextUtils.lastIndexOf("", '0'), 2628 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        byte length3 = (byte) I0.length;
                        Object[] objArr11 = new Object[1];
                        c((byte) (-1), length3, (byte) (length3 - 4), objArr11);
                        String str5 = (String) objArr11[0];
                        Class<?> cls9 = Integer.TYPE;
                        method = cls8.getMethod(str5, cls9, cls9);
                        map.put(-504758789, method);
                    }
                    cArr4[i20] = ((Character) ((Method) method).invoke(null, objArr10)).charValue();
                }
                c12 = cArr4[setnavigationonclicklistener.setX];
                Object[] objArr12 = {setnavigationonclicklistener, setnavigationonclicklistener};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(-265085633);
                if (method4 == null) {
                    Class cls10 = (Class) setTextScaleX.setX((char) (AndroidCharacter.getMirror('0') + 31299), 48 - ExpandableListView.getPackedPositionType(0L), ExpandableListView.getPackedPositionChild(0L) + 841);
                    byte b16 = (byte) (-1);
                    byte b17 = (byte) (-b16);
                    Object[] objArr13 = new Object[1];
                    c(b16, b17, (byte) (b17 - 1), objArr13);
                    method4 = cls10.getMethod((String) objArr13[0], Object.class, Object.class);
                    map4.put(-265085633, method4);
                }
                ((Method) method4).invoke(null, objArr12);
            }
            cArr3 = cArr4;
        }
        if (i18 > 0) {
            int i22 = G0 + 13;
            H0 = i22 % 128;
            int i23 = i22 % 2;
            char[] cArr5 = new char[i16];
            i11 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i16);
            int i24 = i16 - i18;
            System.arraycopy(cArr5, 0, cArr3, i24, i18);
            System.arraycopy(cArr5, i18, cArr3, 0, i24);
        } else {
            i11 = 0;
        }
        if (z10) {
            char[] cArr6 = new char[i16];
            while (true) {
                setnavigationonclicklistener.setX = i11;
                int i25 = setnavigationonclicklistener.setX;
                if (i25 >= i16) {
                    break;
                }
                cArr6[i25] = cArr3[(i16 - i25) - 1];
                i11 = i25 + 1;
            }
            cArr3 = cArr6;
        }
        if (i10 > 0) {
            int i26 = G0 + 111;
            H0 = i26 % 128;
            int i27 = i26 % 2 == 0 ? 1 : 0;
            while (true) {
                setnavigationonclicklistener.setX = i27;
                i27 = setnavigationonclicklistener.setX;
                if (i27 >= i16) {
                    break;
                }
                int i28 = G0 + 5;
                H0 = i28 % 128;
                if (i28 % 2 == 0) {
                    cArr3[i27] = (char) (cArr3[i27] << iArr[3]);
                } else {
                    cArr3[i27] = (char) (cArr3[i27] - iArr[2]);
                    i27++;
                }
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = 101 - r7
            int r6 = r6 + 4
            int r8 = r8 * 2
            int r0 = r8 + 1
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.getValidUntil.I0
            r2 = 0
            if (r1 != 0) goto L16
            r7 = r6
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L33
        L16:
            r3 = r2
        L17:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L33:
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.getValidUntil.c(byte, byte, short, java.lang.Object[]):void");
    }

    public static void d() {
        I0 = new byte[]{66, 118, 114, -11};
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        float[] fArr;
        getValidUntil getvaliduntil = (getValidUntil) objArr[0];
        SensorEvent sensorEvent = (SensorEvent) objArr[1];
        Intrinsics.checkNotNullParameter(sensorEvent, "");
        if (getvaliduntil.f55979r0 == null) {
            getvaliduntil.f55979r0 = new Date();
        }
        long time = new Date().getTime();
        Date date = getvaliduntil.f55979r0;
        if (date == null) {
            int i13 = F0 + 21;
            E0 = i13 % 128;
            if (i13 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            date = null;
        }
        int iM5570constructorimpl = UInt.m5570constructorimpl((int) (time - date.getTime()));
        float[] fArr2 = sensorEvent.values;
        if (fArr2 != null && (fArr = (float[]) fArr2.clone()) != null) {
            int i14 = F0 + 15;
            E0 = i14 % 128;
            int i15 = i14 % 2;
            double d2 = 0.0d;
            for (float f6 : fArr) {
                d2 += (double) (f6 * f6);
            }
            getvaliduntil.f55978q0.invoke(new setWillNotCacheDrawing(iM5570constructorimpl, Math.sqrt(d2), null), getvaliduntil);
            int i16 = E0 + 93;
            F0 = i16 % 128;
            int i17 = i16 % 2;
        }
        return null;
    }

    public final Sensor a(int i10) {
        int i11 = E0 + 107;
        F0 = i11 % 128;
        int i12 = i11 % 2;
        try {
            Sensor defaultSensor = this.f55977p0.getDefaultSensor(i10);
            int i13 = E0 + 53;
            F0 = i13 % 128;
            int i14 = i13 % 2;
            return defaultSensor;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(@Nullable Sensor sensor, int i10) {
        int i11 = E0 + 1;
        F0 = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(@NotNull SensorEvent sensorEvent) {
        setDividerPadding(new Object[]{this, sensorEvent}, -1592633825, 1592633825, System.identityHashCode(this));
    }

    public final boolean setOnFocusChangeListener() throws Throwable {
        Object[] objArr = new Object[1];
        b("\u0000\u0001\u0001\u0001\u0000\u0001", true, new int[]{0, 6, 90, 5}, objArr);
        HandlerThread handlerThread = new HandlerThread(((String) objArr[0]).intern(), 5);
        this.f55980s0 = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = this.f55980s0;
        if (handlerThread2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            handlerThread2 = null;
        }
        Handler handler = new Handler(handlerThread2.getLooper());
        List listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new Sensor[]{this.f55981t0, this.f55982u0, this.v0, this.f55983w0, this.f55984x0});
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listListOfNotNull, 10));
        Iterator it = listListOfNotNull.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(this.f55977p0.registerListener(this, (Sensor) it.next(), 0, handler)));
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            Object[] objArr2 = new Object[1];
            b("\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000", false, new int[]{6, 34, 0, 0}, objArr2);
            throw new UnsupportedOperationException(((String) objArr2[0]).intern());
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            next = Boolean.valueOf(((Boolean) next).booleanValue() || ((Boolean) it2.next()).booleanValue());
        }
        return ((Boolean) next).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024 A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:4:0x000f, B:6:0x0016, B:14:0x002a, B:13:0x0024, B:11:0x001d), top: B:20:0x000d }] */
    public final void setDividerPadding() {
        HandlerThread handlerThread;
        int i10 = F0 + 111;
        E0 = i10 % 128;
        int i11 = i10 % 2;
        SensorManager sensorManager = this.f55977p0;
        try {
            if (i11 != 0) {
                sensorManager.unregisterListener(this);
                handlerThread = this.f55980s0;
                int i12 = 26 / 0;
                if (handlerThread == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    handlerThread = null;
                }
            } else {
                sensorManager.unregisterListener(this);
                handlerThread = this.f55980s0;
                if (handlerThread == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    handlerThread = null;
                }
            }
            handlerThread.quitSafely();
            int i13 = E0 + 61;
            F0 = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
        } catch (Exception unused) {
        }
    }
}
