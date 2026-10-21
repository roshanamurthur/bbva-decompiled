package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.Signature;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011H\u0007¢\u0006\u0004\b\b\u0010\u0012J\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\f\u0010\u0014"}, d2 = {"Lcom/mypinpad/tsdk/i/dispose;", "", "Ljava/security/KeyPair;", "setDividerPadding", "()Ljava/security/KeyPair;", "", "p0", "", "setY", "([B)Ljava/lang/String;", "p1", "", "setCompoundDrawableTintBlendMode", "([BLjava/lang/String;)Z", "()Z", "setOnFocusChangeListener", "()[B", "", "()Ljava/util/List;", "Ljava/util/UUID;", "(Ljava/util/UUID;)Ljava/lang/String;", "Lcom/mypinpad/tsdk/i/setColorFilter;", "<init>", "(Lcom/mypinpad/tsdk/i/setColorFilter;)V"}, k = 1, mv = {1, 5, 1})
public final class dispose {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f55191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static byte[] f55194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static long f55195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f55196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f55197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f55198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f55199i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f55200j = null;

    static {
        d();
        f55198h = 0;
        f55199i = 1;
        f55196f = 0;
        f55197g = 1;
        f();
        View.getDefaultSize(0, 0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        Color.red(0);
        MotionEvent.axisFromString("");
        ViewConfiguration.getScrollDefaultDelay();
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        Color.blue(0);
        INSTANCE = new Companion(null);
        int i10 = f55197g + 37;
        f55196f = i10 % 128;
        int i11 = i10 % 2;
    }

    public dispose(@NotNull setColorFilter setcolorfilter) {
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
    }

    public static void a(int i10, byte b10, short s4, int i11, int i12, Object[] objArr) throws Throwable {
        int i13;
        int i14;
        setTextAlignment settextalignment = new setTextAlignment();
        StringBuilder sb2 = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i10), Integer.valueOf(f55192b)};
            Map map = setTextScaleX.setMaxEms;
            Object method = map.get(-769569468);
            if (method == null) {
                Class cls = (Class) setTextScaleX.setX((char) Drawable.resolveOpacity(0, 0), (Process.myPid() >> 22) + 49, Color.argb(0, 0, 0, 0) + 434);
                byte b11 = (byte) 0;
                byte b12 = (byte) (b11 + 3);
                Object[] objArr3 = new Object[1];
                c(b11, b12, (byte) (b12 - 3), objArr3);
                String str = (String) objArr3[0];
                Class<?> cls2 = Integer.TYPE;
                method = cls.getMethod(str, cls2, cls2);
                map.put(-769569468, method);
            }
            int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i15 = f55199i + 101;
                f55198h = i15 % 128;
                int i16 = i15 % 2;
                i13 = 1;
            } else {
                i13 = 0;
            }
            if (i13 != 0) {
                int i17 = f55198h + 37;
                int i18 = i17 % 128;
                f55199i = i18;
                int i19 = i17 % 2;
                byte[] bArr = f55194d;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i20 = i18 + 103;
                    f55198h = i20 % 128;
                    int i21 = i20 % 2;
                    for (int i22 = 0; i22 < length; i22++) {
                        Object[] objArr4 = {Integer.valueOf(bArr[i22])};
                        Map map2 = setTextScaleX.setMaxEms;
                        Object method2 = map2.get(510767826);
                        if (method2 == null) {
                            method2 = ((Class) setTextScaleX.setX((char) (49111 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 40, 52 - KeyEvent.getDeadChar(0, 0))).getMethod("s", Integer.TYPE);
                            map2.put(510767826, method2);
                        }
                        bArr2[i22] = ((Byte) ((Method) method2).invoke(null, objArr4)).byteValue();
                    }
                    bArr = bArr2;
                }
                bArr.getClass();
                int i23 = f55199i + 21;
                f55198h = i23 % 128;
                if (i23 % 2 != 0) {
                    byte[] bArr3 = f55194d;
                    Object[] objArr5 = {Integer.valueOf(i12), Integer.valueOf(f55191a)};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(-769569468);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 49, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 434);
                        byte b13 = (byte) 0;
                        byte b14 = (byte) (b13 + 3);
                        Object[] objArr6 = new Object[1];
                        c(b13, b14, (byte) (b14 - 3), objArr6);
                        String str2 = (String) objArr6[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, cls4, cls4);
                        map3.put(-769569468, method3);
                    }
                    i14 = ((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) & 7616081452308447380L)) % ((int) (((long) f55192b) % 7616081452308447380L));
                } else {
                    byte[] bArr4 = f55194d;
                    Object[] objArr7 = {Integer.valueOf(i12), Integer.valueOf(f55191a)};
                    Map map4 = setTextScaleX.setMaxEms;
                    Object method4 = map4.get(-769569468);
                    if (method4 == null) {
                        Class cls5 = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", "", 0), 49 - View.MeasureSpec.makeMeasureSpec(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 434);
                        byte b15 = (byte) 0;
                        byte b16 = (byte) (b15 + 3);
                        Object[] objArr8 = new Object[1];
                        c(b15, b16, (byte) (b16 - 3), objArr8);
                        String str3 = (String) objArr8[0];
                        Class<?> cls6 = Integer.TYPE;
                        method4 = cls5.getMethod(str3, cls6, cls6);
                        map4.put(-769569468, method4);
                    }
                    i14 = ((byte) (((long) bArr4[((Integer) ((Method) method4).invoke(null, objArr7)).intValue()]) ^ 7616081452308447380L)) + ((int) (((long) f55192b) ^ 7616081452308447380L));
                }
                iIntValue = (byte) i14;
            }
            if (iIntValue > 0) {
                settextalignment.setX = ((i12 + iIntValue) - 2) + ((int) (((long) f55191a) ^ 7616081452308447380L)) + i13;
                Object[] objArr9 = {settextalignment, Integer.valueOf(i11), Integer.valueOf(f55193c), sb2};
                Map map5 = setTextScaleX.setMaxEms;
                Object method5 = map5.get(193260760);
                if (method5 == null) {
                    Class cls7 = (Class) setTextScaleX.setX((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 43 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), Color.green(0) + 2803);
                    byte b17 = (byte) 0;
                    byte b18 = b17;
                    Object[] objArr10 = new Object[1];
                    c(b17, b18, b18, objArr10);
                    String str4 = (String) objArr10[0];
                    Class<?> cls8 = Integer.TYPE;
                    method5 = cls7.getMethod(str4, Object.class, cls8, cls8, Object.class);
                    map5.put(193260760, method5);
                }
                ((StringBuilder) ((Method) method5).invoke(null, objArr9)).append(settextalignment.setCompoundDrawableTintBlendMode);
                settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                byte[] bArr5 = f55194d;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i24 = 0; i24 < length2; i24++) {
                        bArr6[i24] = (byte) (((long) bArr5[i24]) ^ 7616081452308447380L);
                    }
                    bArr5 = bArr6;
                }
                boolean z10 = bArr5 != null;
                settextalignment.setDividerPadding = 1;
                while (settextalignment.setDividerPadding < iIntValue) {
                    if (!z10) {
                        settextalignment.setX--;
                        throw null;
                    }
                    int i25 = f55198h + 107;
                    f55199i = i25 % 128;
                    int i26 = i25 % 2;
                    byte[] bArr7 = f55194d;
                    int i27 = settextalignment.setX;
                    settextalignment.setX = i27 - 1;
                    char c10 = (char) (settextalignment.setY + (((byte) (((byte) (((long) bArr7[i27]) ^ 7616081452308447380L)) + s4)) ^ b10));
                    settextalignment.setCompoundDrawableTintBlendMode = c10;
                    sb2.append(c10);
                    settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                    settextalignment.setDividerPadding++;
                }
            }
            objArr[0] = sb2.toString();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x026c  */
    /* JADX WARN: Code duplicated, block: B:49:0x026d  */
    public static void b(String str, int i10, Object[] objArr) throws Throwable {
        Throwable cause;
        int i11 = f55199i + 55;
        f55198h = i11 % 128;
        int i12 = 2;
        int i13 = i11 % 2;
        char[] charArray = str.toCharArray();
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = i10;
        int length = charArray.length;
        long[] jArr = new long[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        int i14 = f55198h + 17;
        f55199i = i14 % 128;
        int i15 = i14 % 2;
        while (true) {
            int i16 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i16 >= charArray.length) {
                break;
            }
            int i17 = f55199i + 49;
            f55198h = i17 % 128;
            if (i17 % i12 != 0) {
                char c10 = charArray[i16];
                try {
                    Object[] objArr2 = new Object[3];
                    objArr2[i12] = setlayoutanimation;
                    objArr2[1] = setlayoutanimation;
                    objArr2[0] = Integer.valueOf(c10);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-764403778);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.lastIndexOf("", '0', 0) + 34, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1195);
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 + 2);
                        Object[] objArr3 = new Object[1];
                        c(b10, b11, (byte) (b11 - 2), objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                        map.put(-764403778, method);
                    }
                    jArr[i16] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() & (f55195e * 1779209353347916695L);
                    Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                    Object method2 = map.get(645183118);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) Color.argb(0, 0, 0, 0), View.combineMeasuredStates(0, 0) + 44, 727 - TextUtils.lastIndexOf("", '0', 0));
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 + 5);
                        Object[] objArr5 = new Object[1];
                        c(b12, b13, (byte) (b13 - 5), objArr5);
                        method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                        map.put(645183118, method2);
                    }
                    ((Method) method2).invoke(null, objArr4);
                } catch (Throwable th2) {
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
            } else {
                Object[] objArr6 = {Integer.valueOf(charArray[i16]), setlayoutanimation, setlayoutanimation};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(-764403778);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 33 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.resolveSize(0, 0) + 1195);
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 + 2);
                    Object[] objArr7 = new Object[1];
                    c(b14, b15, (byte) (b15 - 2), objArr7);
                    method3 = cls3.getMethod((String) objArr7[0], Integer.TYPE, Object.class, Object.class);
                    map2.put(-764403778, method3);
                }
                jArr[i16] = ((Long) ((Method) method3).invoke(null, objArr6)).longValue() ^ (f55195e ^ 1779209353347916695L);
                Object[] objArr8 = {setlayoutanimation, setlayoutanimation};
                Object method4 = map2.get(645183118);
                if (method4 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 728);
                    byte b16 = (byte) 0;
                    byte b17 = (byte) (b16 + 5);
                    Object[] objArr9 = new Object[1];
                    c(b16, b17, (byte) (b17 - 5), objArr9);
                    method4 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                    map2.put(645183118, method4);
                }
                ((Method) method4).invoke(null, objArr8);
            }
            i12 = 2;
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr = new char[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i18 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i18 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i18] = (char) jArr[i18];
            Object[] objArr10 = {setlayoutanimation, setlayoutanimation};
            Map map3 = setTextScaleX.setMaxEms;
            Object method5 = map3.get(645183118);
            if (method5 == null) {
                Class cls5 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getJumpTapTimeout() >> 16), ExpandableListView.getPackedPositionChild(0L) + 45, 776 - AndroidCharacter.getMirror('0'));
                byte b18 = (byte) 0;
                byte b19 = (byte) (b18 + 5);
                Object[] objArr11 = new Object[1];
                c(b18, b19, (byte) (b19 - 5), objArr11);
                method5 = cls5.getMethod((String) objArr11[0], Object.class, Object.class);
                map3.put(645183118, method5);
            }
            ((Method) method5).invoke(null, objArr10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r0 = 1 - r8
            int r6 = r6 * 3
            int r6 = 3 - r6
            int r7 = 112 - r7
            byte[] r0 = new byte[r0]
            r1 = 0
            int r8 = 0 - r8
            byte[] r2 = com.mypinpad.tsdk.isolation.dispose.f55200j
            if (r2 != 0) goto L19
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L34
        L19:
            r3 = r1
        L1a:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r2[r6]
            r5 = r9
            r9 = r8
            r8 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r5
        L34:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.dispose.c(byte, byte, short, java.lang.Object[]):void");
    }

    public static void d() {
        f55200j = new byte[]{81, -20, -4, 67};
    }

    public static String e() throws Throwable {
        int i10 = f55196f + 75;
        f55197g = i10 % 128;
        int i11 = i10 % 2;
        Boolean bool = component25.setY;
        Intrinsics.checkNotNullExpressionValue(bool, "");
        if (!(!bool.booleanValue())) {
            Object[] objArr = new Object[1];
            b("Հ塌뽌ቼ煤푰⬈踁\ued5c䀧Ꜳ﨤妀볍Ꮦ盵햴⣤违", 23818 - TextUtils.lastIndexOf("", '0'), objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i12 = f55197g + 1;
            f55196f = i12 % 128;
            int i13 = i12 % 2;
            return strIntern;
        }
        Object[] objArr2 = new Object[1];
        b("Հ䁂轐쩒ᅜ属魔\ue66f\u2d2c桩띮\uf26a㤸萃쌊ป", 17668 - MotionEvent.axisFromString(""), objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        int i14 = f55196f + 103;
        f55197g = i14 % 128;
        int i15 = i14 % 2;
        return strIntern2;
    }

    public static void f() {
        f55191a = 1903213503;
        f55192b = -1454817107;
        f55193c = -269875610;
        f55194d = new byte[]{94, 47, -60, 66, -83, Base64.padSymbol, -91, 19, -58, 8, 6, -39, -91, -90, -89, 50, -86, 23, 88, -96, 114, -38, -59};
        f55195e = -48793963272608066L;
    }

    @NotNull
    public static KeyPair setDividerPadding() throws Throwable {
        KeyGenParameterSpec keyGenParameterSpecBuild;
        int i10 = f55197g + 125;
        f55196f = i10 % 128;
        int i11 = i10 % 2;
        Object[] objArr = new Object[1];
        a((-58) - View.getDefaultSize(0, 0), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 68), (short) (TextUtils.indexOf((CharSequence) "", '0') - 13), (-1185105568) - View.MeasureSpec.makeMeasureSpec(0, 0), 667288789 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        short doubleTapTimeout = (short) ((-111) - (ViewConfiguration.getDoubleTapTimeout() >> 16));
        Object[] objArr2 = new Object[1];
        a(TextUtils.getOffsetAfter("", 0) - 58, (byte) (56 - TextUtils.indexOf((CharSequence) "", '0', 0)), doubleTapTimeout, TextUtils.indexOf("", "", 0, 0) - 1185105585, 667288792 - View.MeasureSpec.getSize(0), objArr2);
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(strIntern, ((String) objArr2[0]).intern());
        Boolean bool = component25.setY;
        Intrinsics.checkNotNullExpressionValue(bool, "");
        if (bool.booleanValue()) {
            Object[] objArr3 = new Object[1];
            b("Հ塌뽌ቼ煤푰⬈踁\ued5c䀧Ꜳ﨤妀볍Ꮦ盵햴⣤违", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23819, objArr3);
            KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(((String) objArr3[0]).intern(), 12);
            short s4 = (short) ((-21) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
            Object[] objArr4 = new Object[1];
            a((-59) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) ((-64) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), s4, (-1185105569) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), KeyEvent.keyCodeFromString("") + 667288807, objArr4);
            builder.setSignaturePaddings(((String) objArr4[0]).intern());
            builder.setKeySize(4096);
            Object[] objArr5 = new Object[1];
            b("պ\ua4cc䘲\ue003莯\u2d7d켑", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 41388, objArr5);
            builder.setDigests(((String) objArr5[0]).intern());
            builder.setKeyValidityEnd(Date.from(Instant.now().plusSeconds(31536000L)));
            keyGenParameterSpecBuild = builder.build();
        } else {
            Object[] objArr6 = new Object[1];
            b("Հ䁂轐쩒ᅜ属魔\ue66f\u2d2c桩띮\uf26a㤸萃쌊ป", 17669 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr6);
            KeyGenParameterSpec.Builder builder2 = new KeyGenParameterSpec.Builder(((String) objArr6[0]).intern(), 12);
            short s7 = (short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 23);
            Object[] objArr7 = new Object[1];
            a((-58) - View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((-64) - TextUtils.getTrimmedLength("")), s7, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1185105571, TextUtils.indexOf((CharSequence) "", '0') + 667288808, objArr7);
            builder2.setSignaturePaddings(((String) objArr7[0]).intern());
            builder2.setKeySize(2048);
            Object[] objArr8 = new Object[1];
            b("պ\ua4cc䘲\ue003莯\u2d7d켑", 41389 - Drawable.resolveOpacity(0, 0), objArr8);
            builder2.setDigests(((String) objArr8[0]).intern());
            builder2.setKeyValidityEnd(Date.from(Instant.now().plusSeconds(31536000L)));
            keyGenParameterSpecBuild = builder2.build();
        }
        Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "");
        keyPairGenerator.initialize(keyGenParameterSpecBuild);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        Intrinsics.checkNotNullExpressionValue(keyPairGenerateKeyPair, "");
        int i12 = f55197g + 67;
        f55196f = i12 % 128;
        if (i12 % 2 == 0) {
            return keyPairGenerateKeyPair;
        }
        throw null;
    }

    @NotNull
    public static byte[] setOnFocusChangeListener() throws Throwable {
        int i10 = f55196f + 125;
        f55197g = i10 % 128;
        int i11 = i10 % 2;
        String strE = e();
        int i12 = f55197g + 63;
        f55196f = i12 % 128;
        int i13 = i12 % 2;
        Object[] objArr = new Object[1];
        a((-58) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (57 - Color.green(0)), (short) (ImageFormat.getBitsPerPixel(0) - 110), (-1185105586) - TextUtils.indexOf((CharSequence) "", '0', 0), 667288792 + (ViewConfiguration.getTouchSlop() >> 8), objArr);
        KeyStore keyStore = KeyStore.getInstance(((String) objArr[0]).intern());
        keyStore.load(null);
        KeyStore.Entry entry = keyStore.getEntry(strE, null);
        KeyStore.PrivateKeyEntry privateKeyEntry = !((entry instanceof KeyStore.PrivateKeyEntry) ^ true) ? (KeyStore.PrivateKeyEntry) entry : null;
        if (privateKeyEntry == null) {
            throw new getErrorCode();
        }
        byte[] encoded = privateKeyEntry.getCertificate().getPublicKey().getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "");
        int i14 = f55197g;
        int i15 = i14 + 97;
        f55196f = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 17 / 0;
        }
        int i17 = i14 + 87;
        f55196f = i17 % 128;
        int i18 = i17 % 2;
        return encoded;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        byte[] bArr = (byte[]) objArr[0];
        String str = (String) objArr[1];
        int i13 = f55197g + 81;
        f55196f = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        short maxKeyCode = (short) ((KeyEvent.getMaxKeyCode() >> 16) - 111);
        Object[] objArr2 = new Object[1];
        a((-58) - (ViewConfiguration.getFadingEdgeLength() >> 16), (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 56), maxKeyCode, (KeyEvent.getMaxKeyCode() >> 16) - 1185105585, 667288791 - ExpandableListView.getPackedPositionChild(0L), objArr2);
        KeyStore keyStore = KeyStore.getInstance(((String) objArr2[0]).intern());
        KeyStore.PrivateKeyEntry privateKeyEntry = null;
        keyStore.load(null);
        KeyStore.Entry entry = keyStore.getEntry(e(), null);
        if (entry instanceof KeyStore.PrivateKeyEntry) {
            privateKeyEntry = (KeyStore.PrivateKeyEntry) entry;
            int i15 = f55196f + 37;
            f55197g = i15 % 128;
            int i16 = i15 % 2;
        }
        if (privateKeyEntry == null) {
            throw new getErrorCode();
        }
        Object[] objArr3 = new Object[1];
        b("պ듈昺ᇠ쎸絒Ⲩ\udedf蠕㮰\uf5e1ꜹ嚄", 45482 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr3);
        Signature signature = Signature.getInstance(((String) objArr3[0]).intern());
        signature.initVerify(privateKeyEntry.getCertificate());
        signature.update(bArr);
        return Boolean.valueOf(signature.verify(setScrollIndicators.setOnFocusChangeListener(str)));
    }

    @NotNull
    public static String setY(@NotNull byte[] p4) throws Throwable {
        Intrinsics.checkNotNullParameter(p4, "");
        Object[] objArr = new Object[1];
        a((-59) - TextUtils.indexOf((CharSequence) "", '0', 0), (byte) ((Process.myPid() >> 22) + 57), (short) ((-111) - Drawable.resolveOpacity(0, 0)), Color.red(0) - 1185105585, Process.getGidForName("") + 667288793, objArr);
        KeyStore keyStore = KeyStore.getInstance(((String) objArr[0]).intern());
        KeyStore.PrivateKeyEntry privateKeyEntry = null;
        keyStore.load(null);
        KeyStore.Entry entry = keyStore.getEntry(e(), null);
        if (!(!(entry instanceof KeyStore.PrivateKeyEntry))) {
            int i10 = f55197g;
            int i11 = i10 + 25;
            f55196f = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            privateKeyEntry = (KeyStore.PrivateKeyEntry) entry;
            int i12 = i10 + 119;
            f55196f = i12 % 128;
            int i13 = i12 % 2;
        }
        if (privateKeyEntry == null) {
            throw new getErrorCode();
        }
        Object[] objArr2 = new Object[1];
        b("պ듈昺ᇠ쎸絒Ⲩ\udedf蠕㮰\uf5e1ꜹ嚄", 45480 - ImageFormat.getBitsPerPixel(0), objArr2);
        Signature signature = Signature.getInstance(((String) objArr2[0]).intern());
        signature.initSign(privateKeyEntry.getPrivateKey());
        signature.update(p4);
        byte[] bArrSign = signature.sign();
        Intrinsics.checkNotNullExpressionValue(bArrSign, "");
        String x4 = setScrollIndicators.setX(bArrSign);
        int i14 = f55196f + 61;
        f55197g = i14 % 128;
        int i15 = i14 % 2;
        return x4;
    }

    @NotNull
    public final String setCompoundDrawableTintBlendMode(@NotNull UUID p4) throws Throwable {
        int i10 = f55196f + 71;
        f55197g = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(p4, "");
        String y7 = setY((byte[]) setTextClassifier.setCompoundDrawableTintBlendMode(new Object[]{p4}, 230957076, -230957076, (int) System.currentTimeMillis()));
        int i12 = f55197g + 19;
        f55196f = i12 % 128;
        int i13 = i12 % 2;
        return y7;
    }

    public static boolean setCompoundDrawableTintBlendMode() throws Throwable {
        int i10 = f55197g + 67;
        f55196f = i10 % 128;
        int i11 = i10 % 2;
        Object[] objArr = new Object[1];
        a((-57) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 57), (short) ((-111) - View.MeasureSpec.getSize(0)), (ViewConfiguration.getJumpTapTimeout() >> 16) - 1185105585, 667288792 - (Process.myPid() >> 22), objArr);
        KeyStore keyStore = KeyStore.getInstance(((String) objArr[0]).intern());
        keyStore.load(null);
        Key key = keyStore.getKey(e(), null);
        String algorithm = key.getAlgorithm();
        Object[] objArr2 = new Object[1];
        a(TextUtils.getTrimmedLength("") - 58, (byte) (57 - (ViewConfiguration.getPressedStateDuration() >> 16)), (short) ((-111) - View.MeasureSpec.makeMeasureSpec(0, 0)), (-1185105585) - (KeyEvent.getMaxKeyCode() >> 16), 667288792 - KeyEvent.normalizeMetaState(0), objArr2);
        boolean zIsInsideSecureHardware = ((KeyInfo) KeyFactory.getInstance(algorithm, ((String) objArr2[0]).intern()).getKeySpec(key, KeyInfo.class)).isInsideSecureHardware();
        int i12 = f55196f + 5;
        f55197g = i12 % 128;
        int i13 = i12 % 2;
        return zIsInsideSecureHardware;
    }

    public static boolean setCompoundDrawableTintBlendMode(@NotNull byte[] p4, @NotNull String p10) {
        return ((Boolean) setX(new Object[]{p4, p10}, 622734011, -622734011, (int) System.currentTimeMillis())).booleanValue();
    }

    @NotNull
    public static List<String> setY() throws Throwable {
        int i10 = f55197g + 51;
        f55196f = i10 % 128;
        if (i10 % 2 != 0) {
            String[] strArr = new String[4];
            Object[] objArr = new Object[1];
            b("՟唨ꗚ\uf5fb䑔钁\ue499㜨蟥ퟰ♾盿욾ᅆ懕놻p傝ꃉ\uf345䍢鎲\ue25a㈑节\udd66ⴋ綰챼᰿泹뼔ར忰깨︠仡麁\ue94c㧀觠\ud814⣺磥", 18758 >> TextUtils.getCapsMode("", 0, 0), objArr);
            strArr[0] = ((String) objArr[0]).intern();
            strArr[1] = "";
            return CollectionsKt__CollectionsKt.listOf((Object[]) strArr);
        }
        Object[] objArr2 = new Object[1];
        b("՟唨ꗚ\uf5fb䑔钁\ue499㜨蟥ퟰ♾盿욾ᅆ懕놻p傝ꃉ\uf345䍢鎲\ue25a㈑节\udd66ⴋ綰챼᰿泹뼔ར忰깨︠仡麁\ue94c㧀觠\ud814⣺磥", TextUtils.getCapsMode("", 0, 0) + 20563, objArr2);
        return CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{((String) objArr2[0]).intern(), ""});
    }
}
