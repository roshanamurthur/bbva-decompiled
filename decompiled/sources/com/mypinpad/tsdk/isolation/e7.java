package com.mypinpad.tsdk.isolation;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e7 extends FunctionReferenceImpl implements Function3<setHorizontalScrollbarOverlay, String, Throwable, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final long f55316p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f55317q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f55318r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f55319s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f55320t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final byte[] f55321u0 = null;
    public static final int v0 = 0;

    static {
        c();
        f55319s0 = 0;
        f55320t0 = 1;
        f55317q0 = 0;
        f55318r0 = 1;
        f55316p0 = -7884468703087466900L;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e7(mj mjVar) throws Throwable {
        Object[] objArr = new Object[1];
        a("薟㊃\ueba3ꃙ姨ᘦ켺著", ImageFormat.getBitsPerPixel(0) + 46878, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("薟얅֯䗟藰씰Զ䔡蔇앻ґ䒹蓠쓅ӯ䐊萹쑟Ѵ䞞螸잾ߌ䟺蜖윹ܶ䝇蜧울ڲ䛑蛶욯\u0600䘳虇왵Ɨ䆖膢쇌ƺ䄑脰섩Ō䅡肅샿Ñ䃵胠쀋 䁘聴쏗Ω䎭菈쏘̔䌨荞썌̶䊦芽식˯䋧艌숤ɔ䉼趘췋ඒ䷚跹촙ള䵝贜쵀ಃ䲷賅쳹ಪ䰎谮챚\u0c76俑辏쾨\u0fdf俥輀켽ཛ佊车컓\u0efc令", TextUtils.indexOf((CharSequence) "", '0', 0) + 16412, objArr2);
        super(3, mjVar, mj.class, strIntern, ((String) objArr2[0]).intern(), 0);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:42:0x01ec  */
    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        Throwable cause;
        int i11 = f55320t0;
        int i12 = i11 + 105;
        f55319s0 = i12 % 128;
        char c10 = 2;
        int i13 = i12 % 2;
        int i14 = i11 + 125;
        f55319s0 = i14 % 128;
        int i15 = i14 % 2;
        char[] charArray = str.toCharArray();
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = i10;
        int length = charArray.length;
        long[] jArr = new long[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i16 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i16 >= charArray.length) {
                break;
            }
            char c11 = charArray[i16];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[c10] = setlayoutanimation;
                objArr2[1] = setlayoutanimation;
                objArr2[0] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-764403778);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) ('0' - AndroidCharacter.getMirror('0')), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 32, 1195 - View.combineMeasuredStates(0, 0));
                    byte b10 = (byte) (v0 & 1);
                    byte b11 = (byte) (b10 - 1);
                    Object[] objArr3 = new Object[1];
                    b(b11, b10, b11, objArr3);
                    method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                    map.put(-764403778, method);
                }
                jArr[i16] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (f55316p0 ^ 1779209353347916695L);
                Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                Object method2 = map.get(645183118);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44, 729 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    b(b13, b12, b13, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(645183118, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                c10 = 2;
            } catch (Throwable th2) {
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr = new char[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i17 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i17 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            int i18 = f55319s0 + 111;
            f55320t0 = i18 % 128;
            if (i18 % 2 == 0) {
                cArr[i17] = (char) jArr[i17];
                Object[] objArr6 = {setlayoutanimation, setlayoutanimation};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(645183118);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 44 - View.MeasureSpec.makeMeasureSpec(0, 0), 728 - (ViewConfiguration.getEdgeSlop() >> 16));
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr7 = new Object[1];
                    b(b15, b14, b15, objArr7);
                    method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(645183118, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                throw null;
            }
            cArr[i17] = (char) jArr[i17];
            Object[] objArr8 = {setlayoutanimation, setlayoutanimation};
            Map map3 = setTextScaleX.setMaxEms;
            Object method4 = map3.get(645183118);
            if (method4 == null) {
                Class cls4 = (Class) setTextScaleX.setX((char) (Process.myTid() >> 22), 44 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 728 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                byte b16 = (byte) 0;
                byte b17 = b16;
                Object[] objArr9 = new Object[1];
                b(b17, b16, b17, objArr9);
                method4 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                map3.put(645183118, method4);
            }
            ((Method) method4).invoke(null, objArr8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r7 = r7 * 3
            int r7 = r7 + 107
            int r6 = r6 * 2
            int r0 = r6 + 1
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.e7.f55321u0
            if (r2 != 0) goto L17
            r4 = r7
            r3 = r1
            r7 = r6
            goto L2c
        L17:
            r3 = r1
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r2[r8]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r4
            int r8 = r8 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.e7.b(byte, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        f55321u0 = new byte[]{52, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 70, -90};
        v0 = 143;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay, String str, Throwable th2) {
        int i10 = f55317q0 + 115;
        int i11 = i10 % 128;
        f55318r0 = i11;
        int i12 = i10 % 2;
        setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay2 = sethorizontalscrollbaroverlay;
        String str2 = str;
        int i13 = i11 + 109;
        f55317q0 = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(sethorizontalscrollbaroverlay2, "");
        Intrinsics.checkNotNullParameter(str2, "");
        mj.setX(new Object[]{sethorizontalscrollbaroverlay2, str2}, 1742438991, -1742438990, (int) System.currentTimeMillis());
        int i15 = f55318r0 + 39;
        f55317q0 = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
        Unit unit = Unit.INSTANCE;
        int i16 = f55318r0 + 15;
        f55317q0 = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 86 / 0;
        }
        return unit;
    }
}
