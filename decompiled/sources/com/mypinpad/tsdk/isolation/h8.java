package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.activity.a;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/mo;", "", "d", "(Lcom/mypinpad/tsdk/i/mo;)V"}, k = 3, mv = {1, 8, 0})
final class h8 extends Lambda implements Function1<mo, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final char[] f56157q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final char f56158r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f56159s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f56160t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f56161u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final byte[] f56162w0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ setOverScrollMode f56163p0;

    static {
        c();
        f56161u0 = 0;
        v0 = 1;
        f56159s0 = 0;
        f56160t0 = 1;
        f56158r0 = (char) 53954;
        f56157q0 = new char[]{59189, 59179, 59192, 59194, 59190, 59184, 59198, 59157, 59196};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(setOverScrollMode setoverscrollmode) {
        super(1);
        this.f56163p0 = setoverscrollmode;
    }

    public static void a(int i10, String str, byte b10, Object[] objArr) throws Throwable {
        char[] charArray;
        int i11;
        long j10;
        char c10;
        char c11;
        int i12 = v0 + 111;
        int i13 = i12 % 128;
        f56161u0 = i13;
        if (i12 % 2 != 0) {
            throw null;
        }
        int i14 = i13 + 81;
        v0 = i14 % 128;
        if (i14 % 2 == 0) {
            charArray = str.toCharArray();
            int i15 = 33 / 0;
        } else {
            charArray = str.toCharArray();
        }
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr = f56157q0;
        int i16 = 290255894;
        int i17 = 7;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i18 = 0;
            while (i18 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i18])};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i16));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) View.getDefaultSize(0, 0), 45 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1116 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        byte b11 = (byte) 0;
                        Object[] objArr3 = new Object[1];
                        b((byte) i17, b11, b11, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr2[i18] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i18++;
                    i16 = 290255894;
                    i17 = 7;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i19 = v0 + 11;
            f56161u0 = i19 % 128;
            int i20 = i19 % 2;
            cArr = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(f56158r0)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        char c12 = '\b';
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (-16777171) - Color.rgb(0, 0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 1116);
            byte b12 = (byte) 0;
            Object[] objArr5 = new Object[1];
            b((byte) 7, b12, b12, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(290255894, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            i11 = i10 - 1;
            cArr3[i11] = (char) (charArray[i11] - b10);
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            char c13 = '\t';
            int i21 = f56161u0 + 9;
            v0 = i21 % 128;
            if (i21 % 2 == 0) {
                setincludefontpadding.setDividerPadding = 1;
            } else {
                setincludefontpadding.setDividerPadding = 0;
            }
            while (true) {
                int i22 = setincludefontpadding.setDividerPadding;
                if (i22 >= i11) {
                    break;
                }
                char c14 = charArray[i22];
                setincludefontpadding.setY = c14;
                int i23 = i22 + 1;
                char c15 = charArray[i23];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c15;
                if (c14 == c15) {
                    int i24 = f56161u0 + 85;
                    v0 = i24 % 128;
                    if (i24 % 2 == 0) {
                        cArr3[i22] = (char) (c14 * b10);
                        cArr3[i22] = (char) (c15 % b10);
                    } else {
                        cArr3[i22] = (char) (c14 - b10);
                        cArr3[i23] = (char) (c15 - b10);
                    }
                    c10 = c12;
                    c11 = c13;
                    j10 = 0;
                } else {
                    Object[] objArr6 = new Object[13];
                    objArr6[12] = setincludefontpadding;
                    objArr6[11] = Integer.valueOf(cCharValue);
                    objArr6[10] = setincludefontpadding;
                    objArr6[c13] = setincludefontpadding;
                    objArr6[c12] = Integer.valueOf(cCharValue);
                    objArr6[7] = setincludefontpadding;
                    objArr6[6] = setincludefontpadding;
                    objArr6[5] = Integer.valueOf(cCharValue);
                    objArr6[4] = setincludefontpadding;
                    objArr6[3] = setincludefontpadding;
                    objArr6[2] = Integer.valueOf(cCharValue);
                    objArr6[1] = setincludefontpadding;
                    objArr6[0] = setincludefontpadding;
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(180437302);
                    if (method3 != null) {
                        j10 = 0;
                    } else {
                        j10 = 0;
                        Class cls3 = (Class) setTextScaleX.setX((char) TextUtils.getOffsetBefore("", 0), (Process.myPid() >> 22) + 27, 2312 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        byte length2 = (byte) f56162w0.length;
                        byte b13 = (byte) (length2 - 4);
                        Object[] objArr7 = new Object[1];
                        b(length2, b13, b13, objArr7);
                        String str2 = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(180437302, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i25 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i25) {
                        Object[] objArr8 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method4 = map3.get(1989802713);
                        if (method4 != null) {
                            c10 = '\b';
                            c11 = '\t';
                        } else {
                            Class cls5 = (Class) setTextScaleX.setX((char) (TextUtils.getCapsMode("", 0, 0) + 49103), Drawable.resolveOpacity(0, 0) + 35, 2546 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                            byte b14 = (byte) 0;
                            byte b15 = b14;
                            Object[] objArr9 = new Object[1];
                            b(b14, b15, b15, objArr9);
                            String str3 = (String) objArr9[0];
                            Class<?> cls6 = Integer.TYPE;
                            c10 = '\b';
                            c11 = '\t';
                            method4 = cls5.getMethod(str3, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(1989802713, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i26 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i27 = setincludefontpadding.setDividerPadding;
                        cArr3[i27] = cArr[iIntValue2];
                        cArr3[i27 + 1] = cArr[i26];
                    } else {
                        c10 = '\b';
                        c11 = '\t';
                        int i28 = setincludefontpadding.setX;
                        int i29 = setincludefontpadding.setOnFocusChangeListener;
                        if (i28 == i29) {
                            int i30 = v0 + 25;
                            f56161u0 = i30 % 128;
                            int i31 = i30 % 2;
                            int iA = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding.setOnLongClickListener = iA;
                            int iA2 = a.a(i25, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i32 = (i29 * cCharValue) + iA2;
                            int i33 = setincludefontpadding.setDividerPadding;
                            cArr3[i33] = cArr[(i28 * cCharValue) + iA];
                            cArr3[i33 + 1] = cArr[i32];
                        } else {
                            int i34 = (i28 * cCharValue) + i25;
                            int i35 = (i29 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                            int i36 = setincludefontpadding.setDividerPadding;
                            cArr3[i36] = cArr[i34];
                            cArr3[i36 + 1] = cArr[i35];
                        }
                    }
                }
                setincludefontpadding.setDividerPadding += 2;
                int i37 = f56161u0 + 81;
                v0 = i37 % 128;
                int i38 = i37 % 2;
                c12 = c10;
                c13 = c11;
            }
        }
        for (int i39 = 0; i39 < i10; i39++) {
            cArr3[i39] = (char) (cArr3[i39] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 106 - r6
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r0 = 1 - r8
            byte[] r0 = new byte[r0]
            r1 = 0
            int r8 = 0 - r8
            byte[] r2 = com.mypinpad.tsdk.isolation.h8.f56162w0
            if (r2 != 0) goto L1a
            r6 = r7
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L33
        L1a:
            r3 = r1
        L1b:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r2[r7]
            r5 = r9
            r9 = r8
            r8 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r5
        L33:
            int r7 = r7 + 1
            int r8 = -r8
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.h8.b(byte, byte, int, java.lang.Object[]):void");
    }

    public static void c() {
        f56162w0 = new byte[]{54, 83, MessageUtils.MESSAGE_21_NAK, -119};
    }

    public final void d(@NotNull mo moVar) throws Throwable {
        int i10 = f56160t0 + 93;
        f56159s0 = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(moVar, "");
        Object[] objArr = new Object[1];
        a((KeyEvent.getMaxKeyCode() >> 16) + 4, "\u0003\u0006\u0003\u0007", (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 75), objArr);
        String strIntern = ((String) objArr[0]).intern();
        setOverScrollMode setoverscrollmode = this.f56163p0;
        mo.setY(new Object[]{moVar, strIntern, (String) setOverScrollMode.setY(new Object[]{setoverscrollmode}, -1032775005, 1032775006, System.identityHashCode(setoverscrollmode))}, -52655784, 52655794, System.identityHashCode(moVar));
        Object[] objArr2 = new Object[1];
        a(TextUtils.getTrimmedLength("") + 11, "\u0000\u0004\u0005\b\u0005\u0006\u0007\b\u0004\u0005㙎", (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 79), objArr2);
        mo.setY(new Object[]{moVar, ((String) objArr2[0]).intern(), (String) setOverScrollMode.setY(new Object[]{setoverscrollmode}, -1826405260, 1826405260, System.identityHashCode(setoverscrollmode))}, -52655784, 52655794, System.identityHashCode(moVar));
        int i12 = f56159s0 + 111;
        f56160t0 = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(mo moVar) throws Throwable {
        int i10 = f56160t0 + 25;
        f56159s0 = i10 % 128;
        int i11 = i10 % 2;
        d(moVar);
        Unit unit = Unit.INSTANCE;
        if (i11 != 0) {
            int i12 = 24 / 0;
        }
        return unit;
    }
}
