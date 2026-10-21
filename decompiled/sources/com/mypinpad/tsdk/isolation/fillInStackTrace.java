package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.AudioManager$AudioRecordingCallback;
import android.media.AudioRecordingConfiguration;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class fillInStackTrace {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char f55520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char f55521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char f55522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final char f55523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f55524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f55525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f55526i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f55527j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final byte[] f55528k = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AudioManager f55529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public AudioManager$AudioRecordingCallback f55530b;

    public static final class setY extends AudioManager$AudioRecordingCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f55532b;

        public setY(Function0<Unit> function0) {
            this.f55532b = function0;
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            setY sety = (setY) objArr[0];
            fillInStackTrace.setOnFocusChangeListener(fillInStackTrace.this, sety.f55532b);
            return null;
        }

        public final void onRecordingConfigChanged(@Nullable List<AudioRecordingConfiguration> list) {
            setX(new Object[]{this, list}, -1851195874, 1851195874, System.identityHashCode(this));
        }
    }

    static {
        c();
        f55526i = 0;
        f55527j = 1;
        f55524g = 0;
        f55525h = 1;
        f55523f = (char) 2664;
        f55522e = (char) 51060;
        f55520c = (char) 18239;
        f55521d = (char) 27506;
    }

    public fillInStackTrace(@NotNull AudioManager audioManager, @NotNull setColorFilter setcolorfilter) {
        Intrinsics.checkNotNullParameter(audioManager, "");
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        this.f55529a = audioManager;
    }

    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        int i11;
        int i12 = f55526i + 91;
        f55527j = i12 % 128;
        int i13 = 2;
        if (i12 % 2 == 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        int i14 = 0;
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        char[] cArr2 = new char[2];
        while (true) {
            int i15 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i15 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            cArr2[i14] = charArray[i15];
            cArr2[1] = charArray[i15 + 1];
            int i16 = 58224;
            int i17 = i14;
            while (i17 < 16) {
                int i18 = f55527j + 77;
                f55526i = i18 % 128;
                int i19 = i18 % i13;
                char c10 = cArr2[1];
                char c11 = cArr2[i14];
                setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled2 = setalwaysdrawnwithcacheenabled;
                int i20 = (c11 + i16) ^ ((c11 << 4) + ((char) (((long) f55522e) ^ 4333817592127744003L)));
                int i21 = c11 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f55523f);
                    objArr2[i13] = Integer.valueOf(i21);
                    objArr2[1] = Integer.valueOf(i20);
                    objArr2[i14] = Integer.valueOf(c10);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (48534 - TextUtils.indexOf("", "", i14, i14)), TextUtils.lastIndexOf("", '0', i14) + 48, Gravity.getAbsoluteGravity(i14, i14) + 2672);
                        byte b10 = (byte) i14;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        b(b11, b11, b10, objArr3);
                        String str2 = (String) objArr3[i14];
                        Class<?>[] clsArr = new Class[4];
                        Class<?> cls2 = Integer.TYPE;
                        clsArr[i14] = cls2;
                        clsArr[1] = cls2;
                        clsArr[2] = cls2;
                        clsArr[3] = cls2;
                        method = cls.getMethod(str2, clsArr);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr2[1] = cCharValue;
                    char[] cArr3 = cArr2;
                    Object[] objArr4 = {Integer.valueOf(cArr2[i14]), Integer.valueOf((cCharValue + i16) ^ ((cCharValue << 4) + ((char) (((long) f55520c) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f55521d)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (48534 - (ViewConfiguration.getEdgeSlop() >> 16)), 47 - (Process.myPid() >> 22), Drawable.resolveOpacity(0, 0) + 2672);
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr5 = new Object[1];
                        b(b13, b13, b12, objArr5);
                        String str3 = (String) objArr5[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str3, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i16 -= 40503;
                    i17++;
                    setalwaysdrawnwithcacheenabled = setalwaysdrawnwithcacheenabled2;
                    cArr2 = cArr3;
                    i13 = 2;
                    i14 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled3 = setalwaysdrawnwithcacheenabled;
            char[] cArr4 = cArr2;
            int i22 = setalwaysdrawnwithcacheenabled3.setOnFocusChangeListener;
            cArr[i22] = cArr4[0];
            cArr[i22 + 1] = cArr4[1];
            Object[] objArr6 = {setalwaysdrawnwithcacheenabled3, setalwaysdrawnwithcacheenabled3};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 != null) {
                i11 = 2;
            } else {
                Class cls5 = (Class) setTextScaleX.setX((char) Color.green(0), MotionEvent.axisFromString("") + 38, 2145 - Color.green(0));
                byte b14 = (byte) 1;
                byte b15 = (byte) (b14 - 1);
                Object[] objArr7 = new Object[1];
                b(b15, b15, b14, objArr7);
                i11 = 2;
                method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            setalwaysdrawnwithcacheenabled = setalwaysdrawnwithcacheenabled3;
            i13 = i11;
            cArr2 = cArr4;
            i14 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = 4 - r6
            int r7 = r7 * 2
            int r0 = r7 + 1
            int r8 = r8 * 2
            int r8 = r8 + 103
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.fillInStackTrace.f55528k
            r2 = 0
            if (r1 != 0) goto L18
            r8 = r7
            r3 = r8
            r4 = r2
            r7 = r6
            goto L2e
        L18:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L1d:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2c:
            r3 = r1[r7]
        L2e:
            int r3 = -r3
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.fillInStackTrace.b(byte, byte, short, java.lang.Object[]):void");
    }

    public static void c() {
        f55528k = new byte[]{67, 5, -30, -3};
    }

    public static final /* synthetic */ void setOnFocusChangeListener(fillInStackTrace fillinstacktrace, Function0 function0) {
        int i10 = f55524g + 107;
        f55525h = i10 % 128;
        int i11 = i10 % 2;
        fillinstacktrace.d(function0);
        if (i11 == 0) {
            throw null;
        }
    }

    public final synchronized void d(Function0<Unit> function0) {
        try {
            if (e()) {
                int i10 = f55524g + 87;
                int i11 = i10 % 128;
                f55525h = i11;
                if (i10 % 2 == 0) {
                    throw null;
                }
                if (this.f55530b != null) {
                    int i12 = i11 + 111;
                    f55524g = i12 % 128;
                    if (i12 % 2 != 0) {
                        Object[] objArr = new Object[1];
                        a("࿅䖠掇ྩ\u0d80\ue0b8⋵䃎乲煝ⱑ煫ḽ∷죗㣯\udc2d៥覉敯ᕉ魯⨿\ue6c4\ue557㮥", Color.blue(0) + 21, objArr);
                        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr[0]).intern()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
                    } else {
                        Object[] objArr2 = new Object[1];
                        a("࿅䖠掇ྩ\u0d80\ue0b8⋵䃎乲煝ⱑ煫ḽ∷죗㣯\udc2d៥覉敯ᕉ魯⨿\ue6c4\ue557㮥", 25 - Color.blue(0), objArr2);
                        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr2[0]).intern()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
                    }
                    function0.invoke();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean e() {
        int i10 = f55524g + 31;
        f55525h = i10 % 128;
        int i11 = i10 % 2;
        AudioManager audioManager = this.f55529a;
        if (i11 == 0) {
            List activeRecordingConfigurations = audioManager.getActiveRecordingConfigurations();
            Intrinsics.checkNotNullExpressionValue(activeRecordingConfigurations, "");
            activeRecordingConfigurations.isEmpty();
            throw null;
        }
        List activeRecordingConfigurations2 = audioManager.getActiveRecordingConfigurations();
        Intrinsics.checkNotNullExpressionValue(activeRecordingConfigurations2, "");
        if (!(!activeRecordingConfigurations2.isEmpty())) {
            return false;
        }
        int i12 = f55524g + 19;
        f55525h = i12 % 128;
        int i13 = i12 % 2;
        return true;
    }

    public final synchronized void f() {
        try {
            AudioManager$AudioRecordingCallback audioManager$AudioRecordingCallback = this.f55530b;
            if (audioManager$AudioRecordingCallback != null) {
                int i10 = f55524g + 55;
                f55525h = i10 % 128;
                if (i10 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    a("ꘌ뷤\u0d80\ue0b8皓\uf6a0笕ぐ\uec73盈掇ྩ\u0d80\ue0b8⋵䃎乲煝ⱑ煫ḽ∷죗㣯\udc2d៥覉敯ᕉ魯씒࠵浿ᅟ", 43 / KeyEvent.normalizeMetaState(0), objArr);
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr[0]).intern()}, -1422891482, 1422891482, (int) System.currentTimeMillis());
                    this.f55529a.unregisterAudioRecordingCallback(audioManager$AudioRecordingCallback);
                } else {
                    Object[] objArr2 = new Object[1];
                    a("ꘌ뷤\u0d80\ue0b8皓\uf6a0笕ぐ\uec73盈掇ྩ\u0d80\ue0b8⋵䃎乲煝ⱑ煫ḽ∷죗㣯\udc2d៥覉敯ᕉ魯씒࠵浿ᅟ", 34 - KeyEvent.normalizeMetaState(0), objArr2);
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr2[0]).intern()}, -1422891482, 1422891482, (int) System.currentTimeMillis());
                    this.f55529a.unregisterAudioRecordingCallback(audioManager$AudioRecordingCallback);
                }
            }
            this.f55530b = null;
            int i11 = f55525h + 81;
            f55524g = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean g_(@NotNull Looper looper, @NotNull Function0<Unit> function0) {
        boolean zE;
        Intrinsics.checkNotNullParameter(looper, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Object[] objArr = new Object[1];
        a("ꘌ뷤㥸硐⨿\ue6c4笕ぐ\uec73盈掇ྩ\u0d80\ue0b8⋵䃎乲煝ⱑ煫ḽ∷죗㣯\udc2d៥覉敯ᕉ魯씒࠵浿ᅟ", 34 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr[0]).intern()}, -1422891482, 1422891482, (int) System.currentTimeMillis());
        f();
        setY sety = new setY(function0);
        this.f55530b = sety;
        AudioManager audioManager = this.f55529a;
        Intrinsics.checkNotNull(sety);
        audioManager.registerAudioRecordingCallback(sety, new Handler(looper));
        zE = e();
        int i10 = f55525h + 41;
        f55524g = i10 % 128;
        int i11 = i10 % 2;
        return zE;
    }

    public final void setCompoundDrawableTintBlendMode() {
        int i10 = f55524g + 31;
        f55525h = i10 % 128;
        if (i10 % 2 == 0) {
            f();
            throw null;
        }
        f();
        int i11 = f55524g + 101;
        f55525h = i11 % 128;
        int i12 = i11 % 2;
    }
}
