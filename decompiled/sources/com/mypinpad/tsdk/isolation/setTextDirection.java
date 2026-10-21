package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setTextDirection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f60660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f60661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f60662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f60663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f60664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f60665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f60666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f60667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f60668i = null;

    static {
        c();
        f60666g = 0;
        f60667h = 1;
        f60664e = 0;
        f60665f = 1;
        f60660a = -135925286;
        f60661b = -1454817103;
        f60662c = 1208187222;
        f60663d = new byte[]{29, -108, -108};
    }

    public static void a(int i10, byte b10, short s4, int i11, int i12, Object[] objArr) throws Throwable {
        int i13;
        byte[] bArr;
        int i14;
        boolean z10;
        byte[] bArr2;
        int length;
        int i15 = f60661b;
        setTextAlignment settextalignment = new setTextAlignment();
        StringBuilder sb2 = new StringBuilder();
        int i16 = 2;
        try {
            int i17 = 1;
            Object[] objArr2 = {Integer.valueOf(i10), Integer.valueOf(i15)};
            int i18 = 0;
            Map map = setTextScaleX.setMaxEms;
            Object method = map.get(-769569468);
            if (method == null) {
                Class cls = (Class) setTextScaleX.setX((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), Drawable.resolveOpacity(0, 0) + 49, 433 - ImageFormat.getBitsPerPixel(0));
                byte b11 = (byte) 0;
                byte b12 = b11;
                Object[] objArr3 = new Object[1];
                b(b12, b11, (byte) (b12 + 1), objArr3);
                String str = (String) objArr3[0];
                Class<?> cls2 = Integer.TYPE;
                method = cls.getMethod(str, cls2, cls2);
                map.put(-769569468, method);
            }
            int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
            boolean z11 = iIntValue == -1;
            int i19 = f60660a;
            byte[] bArr3 = f60663d;
            if (z11) {
                if (bArr3 != null) {
                    int i20 = f60667h + 121;
                    f60666g = i20 % 128;
                    if (i20 % 2 != 0) {
                        length = bArr3.length;
                        bArr2 = new byte[length];
                    } else {
                        length = bArr3.length;
                        bArr2 = new byte[length];
                    }
                    int i21 = 0;
                    while (i21 < length) {
                        int i22 = f60666g + 109;
                        f60667h = i22 % 128;
                        int i23 = i22 % i16;
                        Object[] objArr4 = new Object[i17];
                        objArr4[i18] = Integer.valueOf(bArr3[i21]);
                        Map map2 = setTextScaleX.setMaxEms;
                        Object method2 = map2.get(510767826);
                        if (method2 == null) {
                            method2 = ((Class) setTextScaleX.setX((char) (49111 - Color.green(i18)), TextUtils.indexOf("", "", i18, i18) + 41, TextUtils.indexOf("", "") + 52)).getMethod("s", Integer.TYPE);
                            map2.put(510767826, method2);
                        }
                        bArr2[i21] = ((Byte) ((Method) method2).invoke(null, objArr4)).byteValue();
                        i21++;
                        length = length;
                        i16 = 2;
                        i17 = 1;
                        i18 = 0;
                    }
                } else {
                    bArr2 = bArr3;
                }
                bArr2.getClass();
                int i24 = f60667h + 107;
                f60666g = i24 % 128;
                if (i24 % 2 != 0) {
                    Object[] objArr5 = {Integer.valueOf(i12), Integer.valueOf(i19)};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(-769569468);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (MotionEvent.axisFromString("") + 1), 48 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 434);
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr6 = new Object[1];
                        b(b14, b13, (byte) (b14 + 1), objArr6);
                        String str2 = (String) objArr6[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, cls4, cls4);
                        map3.put(-769569468, method3);
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) ^ 7616081452308447380L)) >> ((int) (((long) i15) ^ 7616081452308447380L)));
                } else {
                    Object[] objArr7 = {Integer.valueOf(i12), Integer.valueOf(i19)};
                    Map map4 = setTextScaleX.setMaxEms;
                    Object method4 = map4.get(-769569468);
                    if (method4 == null) {
                        Class cls5 = (Class) setTextScaleX.setX((char) Color.red(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 49, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 434);
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr8 = new Object[1];
                        b(b16, b15, (byte) (b16 + 1), objArr8);
                        String str3 = (String) objArr8[0];
                        Class<?> cls6 = Integer.TYPE;
                        method4 = cls5.getMethod(str3, cls6, cls6);
                        map4.put(-769569468, method4);
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method4).invoke(null, objArr7)).intValue()]) ^ 7616081452308447380L)) + ((int) (((long) i15) ^ 7616081452308447380L)));
                }
            }
            if (iIntValue > 0) {
                int i25 = ((i12 + iIntValue) - 2) + ((int) (((long) i19) ^ 7616081452308447380L));
                if (!(!z11)) {
                    i13 = 1;
                } else {
                    int i26 = f60666g + 51;
                    f60667h = i26 % 128;
                    int i27 = i26 % 2;
                    i13 = 0;
                }
                settextalignment.setX = i25 + i13;
                Object[] objArr9 = {settextalignment, Integer.valueOf(i11), Integer.valueOf(f60662c), sb2};
                Map map5 = setTextScaleX.setMaxEms;
                Object method5 = map5.get(193260760);
                if (method5 == null) {
                    Class cls7 = (Class) setTextScaleX.setX((char) TextUtils.getCapsMode("", 0, 0), 42 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.MeasureSpec.getMode(0) + 2803);
                    byte b17 = (byte) 0;
                    byte b18 = b17;
                    Object[] objArr10 = new Object[1];
                    b(b18, b17, b18, objArr10);
                    String str4 = (String) objArr10[0];
                    Class<?> cls8 = Integer.TYPE;
                    method5 = cls7.getMethod(str4, Object.class, cls8, cls8, Object.class);
                    map5.put(193260760, method5);
                }
                ((StringBuilder) ((Method) method5).invoke(null, objArr9)).append(settextalignment.setCompoundDrawableTintBlendMode);
                settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                if (bArr3 != null) {
                    int length2 = bArr3.length;
                    bArr = new byte[length2];
                    int i28 = f60666g + 41;
                    f60667h = i28 % 128;
                    int i29 = i28 % 2;
                    for (int i30 = 0; i30 < length2; i30++) {
                        bArr[i30] = (byte) (((long) bArr3[i30]) ^ 7616081452308447380L);
                    }
                } else {
                    bArr = bArr3;
                }
                if (bArr != null) {
                    int i31 = f60667h + 99;
                    f60666g = i31 % 128;
                    int i32 = i31 % 2;
                    i14 = 1;
                    z10 = true;
                } else {
                    i14 = 1;
                    z10 = false;
                }
                while (true) {
                    settextalignment.setDividerPadding = i14;
                    if (settextalignment.setDividerPadding >= iIntValue) {
                        break;
                    }
                    if (!z10) {
                        settextalignment.setX--;
                        throw null;
                    }
                    int i33 = settextalignment.setX;
                    settextalignment.setX = i33 - 1;
                    char c10 = (char) (settextalignment.setY + (((byte) (((byte) (((long) bArr3[i33]) ^ 7616081452308447380L)) + s4)) ^ b10));
                    settextalignment.setCompoundDrawableTintBlendMode = c10;
                    sb2.append(c10);
                    settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                    i14 = settextalignment.setDividerPadding + 1;
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

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r0 = 1 - r7
            int r8 = r8 * 3
            int r8 = 112 - r8
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r0 = new byte[r0]
            r1 = 0
            int r7 = 0 - r7
            byte[] r2 = com.mypinpad.tsdk.isolation.setTextDirection.f60668i
            if (r2 != 0) goto L1c
            r8 = r6
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r7
            goto L34
        L1c:
            r3 = r1
        L1d:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2c:
            r3 = r2[r6]
            r5 = r9
            r9 = r7
            r7 = r3
            r3 = r2
            r2 = r0
            r0 = r5
        L34:
            int r7 = -r7
            int r6 = r6 + 1
            int r8 = r8 + r7
            r7 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setTextDirection.b(byte, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        f60668i = new byte[]{MessageUtils.MESSAGE_30_RS, -118, 53, -90};
    }

    @NotNull
    public static final setAutoSizeTextTypeUniformWithPresetSizes setDividerPadding(@NotNull getTransactionPortrait gettransactionportrait, @NotNull Exception exc) {
        Intrinsics.checkNotNullParameter(gettransactionportrait, "");
        Intrinsics.checkNotNullParameter(exc, "");
        StringBuilder sb2 = new StringBuilder();
        short sIndexOf = (short) (TextUtils.indexOf("", "", 0, 0) + 94);
        Object[] objArr = new Object[1];
        a((-34) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (byte) ((Process.getThreadPriority(0) + 20) >> 6), sIndexOf, TextUtils.indexOf((CharSequence) "", '0') + 515229316, Color.rgb(0, 0, 0) - 1571598670, objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append((Object) exc.getClass().getSimpleName());
        sb2.append(AbstractJsonLexerKt.COMMA);
        sb2.append((Object) exc.getMessage());
        setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes = new setAutoSizeTextTypeUniformWithPresetSizes(gettransactionportrait, sb2.toString(), false);
        int i10 = f60664e + 87;
        f60665f = i10 % 128;
        if (i10 % 2 != 0) {
            return setautosizetexttypeuniformwithpresetsizes;
        }
        throw null;
    }

    @NotNull
    public static final getDynamicButtonIconTextSpacingDp setOnFocusChangeListener(@NotNull getTransactionPortrait gettransactionportrait) throws Throwable {
        int i10 = f60665f + 123;
        f60664e = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(gettransactionportrait, "");
        short sAlpha = (short) (124 - Color.alpha(0));
        Object[] objArr = new Object[1];
        a(ExpandableListView.getPackedPositionGroup(0L) - 36, (byte) (ViewConfiguration.getEdgeSlop() >> 16), sAlpha, 515229281 - TextUtils.indexOf("", ""), View.getDefaultSize(0, 0) - 1588375886, objArr);
        getDynamicButtonIconTextSpacingDp y7 = getDisplayExponent.setY(Intrinsics.stringPlus(((String) objArr[0]).intern(), Integer.valueOf(gettransactionportrait.setCompoundDrawableTintBlendMode())));
        int i12 = f60665f + 95;
        f60664e = i12 % 128;
        int i13 = i12 % 2;
        return y7;
    }

    @NotNull
    public static final setAutoSizeTextTypeUniformWithPresetSizes setX(@NotNull Future<setAutoSizeTextTypeUniformWithPresetSizes> future, @NotNull getTransactionPortrait gettransactionportrait) {
        int i10 = f60665f + 109;
        f60664e = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(future, "");
        Intrinsics.checkNotNullParameter(gettransactionportrait, "");
        try {
            setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes = future.get(10L, TimeUnit.SECONDS);
            Intrinsics.checkNotNullExpressionValue(setautosizetexttypeuniformwithpresetsizes, "");
            setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes2 = setautosizetexttypeuniformwithpresetsizes;
            int i12 = f60664e + 91;
            f60665f = i12 % 128;
            int i13 = i12 % 2;
            return setautosizetexttypeuniformwithpresetsizes2;
        } catch (Exception e5) {
            return setDividerPadding(gettransactionportrait, e5);
        }
    }
}
