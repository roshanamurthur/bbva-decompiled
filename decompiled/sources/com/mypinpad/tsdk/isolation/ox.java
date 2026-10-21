package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ox extends pf {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final char f57584n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final char f57585o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final char f57586p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final char f57587q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f57588r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f57589s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f57590t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final byte[] f57591u = null;

    @NotNull
    public final UUID m;

    static {
        b();
        f57589s = 0;
        f57590t = 1;
        f57588r = 0;
        f57587q = (char) 63918;
        f57586p = (char) 11521;
        f57584n = (char) 29008;
        f57585o = (char) 52470;
    }

    public ox(@NotNull UUID uuid) throws Throwable {
        int i10;
        Intrinsics.checkNotNullParameter(uuid, "");
        int i11 = 0;
        int i12 = 34 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
        int i13 = f57589s + 99;
        f57590t = i13 % 128;
        int i14 = 2;
        if (i13 % 2 == 0) {
            throw null;
        }
        char[] charArray = "荿쥼䢝䞏\ue538\u20cb塾鯐糛꣰\uf763瀍Ã묤◝\uf724釽涴妽າ눽酩\uf3b2鴯톟\uf4b5玣暨禜ᔅ将횰ꭩ緿".toCharArray();
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        char[] cArr2 = new char[2];
        while (true) {
            int i15 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i15 >= charArray.length) {
                String str = new String(cArr, 0, i12);
                int i16 = f57589s + 109;
                f57590t = i16 % 128;
                int i17 = i16 % 2;
                super(null, str.intern(), null, 0L, 13, null);
                this.m = uuid;
                return;
            }
            int i18 = f57590t + 57;
            f57589s = i18 % 128;
            int i19 = 1;
            int i20 = 58224;
            if (i18 % i14 != 0) {
                cArr2[i11] = charArray[i15];
                cArr2[1] = charArray[i15];
                i10 = 1;
            } else {
                cArr2[i11] = charArray[i15];
                cArr2[1] = charArray[i15 + 1];
                i10 = i11;
            }
            while (i10 < 16) {
                char c10 = cArr2[i19];
                char c11 = cArr2[i11];
                setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled2 = setalwaysdrawnwithcacheenabled;
                int i21 = (c11 + i20) ^ ((c11 << 4) + ((char) (((long) f57586p) ^ 4333817592127744003L)));
                int i22 = c11 >>> 5;
                try {
                    Object[] objArr = new Object[4];
                    objArr[3] = Integer.valueOf(f57587q);
                    objArr[i14] = Integer.valueOf(i22);
                    objArr[i19] = Integer.valueOf(i21);
                    objArr[0] = Integer.valueOf(c10);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (Color.green(0) + 48534), 47 - (ViewConfiguration.getLongPressTimeout() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2671);
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr2 = new Object[i19];
                        c(b11, b10, b11, objArr2);
                        String str2 = (String) objArr2[0];
                        Class<?>[] clsArr = new Class[4];
                        Class<?> cls2 = Integer.TYPE;
                        clsArr[0] = cls2;
                        clsArr[i19] = cls2;
                        clsArr[2] = cls2;
                        clsArr[3] = cls2;
                        method = cls.getMethod(str2, clsArr);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                    cArr2[i19] = cCharValue;
                    int i23 = i20;
                    Object[] objArr3 = {Integer.valueOf(cArr2[0]), Integer.valueOf((cCharValue + i20) ^ ((cCharValue << 4) + ((char) (((long) f57584n) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f57585o)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (48534 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 48 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 2672 - TextUtils.getTrimmedLength(""));
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr4 = new Object[1];
                        c(b13, b12, b13, objArr4);
                        String str3 = (String) objArr4[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str3, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr3)).charValue();
                    i20 = i23 - 40503;
                    i10++;
                    setalwaysdrawnwithcacheenabled = setalwaysdrawnwithcacheenabled2;
                    charArray = charArray;
                    i11 = 0;
                    i14 = 2;
                    i19 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            char[] cArr3 = charArray;
            setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled3 = setalwaysdrawnwithcacheenabled;
            int i24 = setalwaysdrawnwithcacheenabled3.setOnFocusChangeListener;
            cArr[i24] = cArr2[0];
            cArr[i24 + 1] = cArr2[1];
            Object[] objArr5 = {setalwaysdrawnwithcacheenabled3, setalwaysdrawnwithcacheenabled3};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 == null) {
                Class cls5 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 36 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2145);
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr6 = new Object[1];
                c((byte) (b15 + 1), b14, b15, objArr6);
                method3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr5);
            setalwaysdrawnwithcacheenabled = setalwaysdrawnwithcacheenabled3;
            charArray = cArr3;
            i11 = 0;
            i14 = 2;
        }
    }

    public static void b() {
        f57591u = new byte[]{12, -82, -41, -21};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(byte r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 103
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r9 = r9 * 4
            int r9 = 1 - r9
            byte[] r0 = new byte[r9]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.ox.f57591u
            if (r2 != 0) goto L1a
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            goto L33
        L1a:
            r3 = r1
        L1b:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r0[r3] = r5
            if (r4 != r9) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r1)
            r10[r1] = r7
            return
        L2a:
            r3 = r2[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r6
        L33:
            int r7 = r7 + r8
            int r8 = r9 + 1
            r9 = r10
            r10 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ox.c(byte, short, short, java.lang.Object[]):void");
    }

    @NotNull
    public final UUID setY() {
        int i10 = f57588r + 63;
        int i11 = i10 % 128;
        int i12 = i10 % 2;
        int i13 = i11 + 121;
        f57588r = i13 % 128;
        int i14 = i13 % 2;
        return this.m;
    }
}
