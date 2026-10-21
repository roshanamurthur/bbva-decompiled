package com.mypinpad.tsdk.isolation;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class setBackgroundResource extends Exception {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final char f59482p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final char f59483q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final char f59484r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final char f59485s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f59486t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f59487u0;
    public static final byte[] v0 = null;

    static {
        b();
        f59486t0 = 0;
        f59487u0 = 1;
        f59485s0 = (char) 42280;
        f59484r0 = (char) 36408;
        f59482p0 = (char) 43209;
        f59483q0 = (char) 60469;
    }

    public setBackgroundResource() throws Throwable {
        int i10;
        byte[] bArr;
        int i11;
        int i12 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 41;
        int i13 = f59487u0 + 125;
        f59486t0 = i13 % 128;
        int i14 = 2;
        int i15 = 0;
        if (i13 % 2 != 0) {
            int i16 = 52 / 0;
        }
        char[] charArray = "白叺㡭Ძ짋\u0590͚炀圳\udfce면\udc6a䶪븱봬\uf4ae囕䖘\ue5c6案悧蛞\uf40c汘刑\uf53d狶ﮤꐇ\udcbd◼顮\ue9d7Ꟊʬ筯掑Ⳳ롵翷靳㺇".toCharArray();
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        char[] cArr2 = new char[2];
        while (true) {
            int i17 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i17 >= charArray.length) {
                super(new String(cArr, 0, i12).intern());
                return;
            }
            int i18 = f59486t0 + 5;
            f59487u0 = i18 % 128;
            char c10 = 1;
            int i19 = 58224;
            if (i18 % i14 == 0) {
                cArr2[1] = charArray[i17];
                cArr2[1] = charArray[i17];
                i10 = 1;
            } else {
                cArr2[i15] = charArray[i17];
                cArr2[1] = charArray[i17 + 1];
                i10 = i15;
            }
            while (true) {
                bArr = v0;
                if (i10 >= 16) {
                    break;
                }
                int i20 = f59487u0 + 55;
                f59486t0 = i20 % 128;
                int i21 = i20 % i14;
                char c11 = cArr2[c10];
                char c12 = cArr2[i15];
                setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled2 = setalwaysdrawnwithcacheenabled;
                int i22 = (c12 + i19) ^ ((c12 << 4) + ((char) (((long) f59484r0) ^ 4333817592127744003L)));
                int i23 = c12 >>> 5;
                try {
                    Object[] objArr = new Object[4];
                    objArr[3] = Integer.valueOf(f59485s0);
                    objArr[i14] = Integer.valueOf(i23);
                    objArr[1] = Integer.valueOf(i22);
                    objArr[0] = Integer.valueOf(c11);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (KeyEvent.normalizeMetaState(0) + 48534), 47 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 2672);
                        byte b10 = (byte) (bArr[i14] + 1);
                        byte b11 = b10;
                        Object[] objArr2 = new Object[1];
                        a(b10, b11, b11, objArr2);
                        String str = (String) objArr2[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str, cls2, cls2, cls2, cls2);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                    cArr2[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr2[0]), Integer.valueOf((cCharValue + i19) ^ ((cCharValue << 4) + ((char) (((long) f59482p0) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f59483q0)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (KeyEvent.getDeadChar(0, 0) + 48534), 46 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2671);
                        byte b12 = (byte) (bArr[2] + 1);
                        byte b13 = b12;
                        Object[] objArr4 = new Object[1];
                        a(b12, b13, b13, objArr4);
                        String str2 = (String) objArr4[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str2, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr3)).charValue();
                    i19 -= 40503;
                    i10++;
                    setalwaysdrawnwithcacheenabled = setalwaysdrawnwithcacheenabled2;
                    charArray = charArray;
                    i14 = 2;
                    i15 = 0;
                    c10 = 1;
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
            if (method3 != null) {
                i11 = 2;
            } else {
                Class cls5 = (Class) setTextScaleX.setX((char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 37, 2145 - TextUtils.indexOf("", "", 0));
                byte b14 = bArr[2];
                byte b15 = (byte) (b14 + 1);
                Object[] objArr6 = new Object[1];
                a(b15, b15, (byte) (-b14), objArr6);
                i11 = 2;
                method3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr5);
            setalwaysdrawnwithcacheenabled = setalwaysdrawnwithcacheenabled3;
            i14 = i11;
            charArray = cArr3;
            i15 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r9 = r9 * 2
            int r9 = r9 + 103
            int r7 = r7 * 2
            int r7 = r7 + 1
            byte[] r0 = new byte[r7]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.setBackgroundResource.v0
            if (r2 != 0) goto L1b
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            goto L35
        L1b:
            r3 = r1
        L1c:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r0[r3] = r5
            if (r4 != r7) goto L2b
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r1)
            r10[r1] = r7
            return
        L2b:
            r3 = r2[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r9
            r9 = r6
        L35:
            int r7 = r7 + r10
            int r9 = r9 + 1
            r10 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r8
            r8 = r6
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setBackgroundResource.a(int, int, int, java.lang.Object[]):void");
    }

    public static void b() {
        v0 = new byte[]{27, 72, -1, 67};
    }
}
