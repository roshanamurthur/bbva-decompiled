package com.mypinpad.tsdk.isolation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableKt;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.mypinpad.tsdk.api.models.PinPadConfiguration;
import com.mypinpad.tsdk.api.models.PinPadType;
import com.mypinpad.tsdk.api.models.PinViewportDp;
import com.mypinpad.tsdk.api.models.PinViewports;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mk.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class sh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f60859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f60860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f60861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f60862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f60863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f60864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final char f60865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f60866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f60867i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f60868j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f60869k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f60870l = null;
    public static final int m = 0;

    public /* synthetic */ class setOnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f60871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f60872b;
        public static final /* synthetic */ int[] setCompoundDrawableTintBlendMode;

        static {
            int[] iArr = new int[PinPadType.values().length];
            try {
                iArr[PinPadType.STANDARD.ordinal()] = 1;
                f60872b = 15 % 128;
                int i10 = 15 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PinPadType.SHIFTED.ordinal()] = 2;
                int i11 = f60872b + 87;
                f60871a = i11 % 128;
                int i12 = i11 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PinPadType.SHUFFLED.ordinal()] = 3;
                int i13 = f60871a + 43;
                f60872b = i13 % 128;
                int i14 = i13 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            setCompoundDrawableTintBlendMode = iArr;
            int i15 = f60872b;
            int i16 = (i15 & (-18)) | ((~i15) & 17);
            int i17 = (i15 & 17) << 1;
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            f60871a = i18 % 128;
            if (i18 % 2 != 0) {
                int i19 = 90 / 0;
            }
        }
    }

    static {
        c();
        f60868j = 0;
        f60869k = 1;
        f60866h = 0;
        f60867i = 1;
        f60859a = 1382008204;
        f60860b = -1454817053;
        f60861c = -1806117175;
        f60862d = new byte[]{-108, -108, -108, -108, -108, -73, -123, 123, -122, -106, 104, -123, GenerateAcResponseApdu.DDA_HEADER, 107, -106, 107, -108, 105, -109, -101, GenerateAcResponseApdu.DDA_HEADER, -112, 104, -106, GenerateAcResponseApdu.DDA_HEADER, -104, -109, -101, -103, 101, -110, -99, -123, 104, 109, -99, -109, -106, Constants.DIRECTORY_ENTRY, -103, GenerateAcResponseApdu.DDA_HEADER, -108, -108, -108, -108, -108, -108, -108};
        f60865g = (char) 30296;
        f60863e = -8369390073338247193L;
        f60864f = -461867432;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x02cf  */
    public static void a(int i10, byte b10, short s4, int i11, int i12, Object[] objArr) throws Throwable {
        byte[] bArr;
        int i13;
        boolean z10;
        int length;
        byte[] bArr2;
        int i14 = f60860b;
        setTextAlignment settextalignment = new setTextAlignment();
        StringBuilder sb2 = new StringBuilder();
        int i15 = 2;
        try {
            int i16 = 1;
            Object[] objArr2 = {Integer.valueOf(i10), Integer.valueOf(i14)};
            int i17 = 0;
            Map map = setTextScaleX.setMaxEms;
            Object method = map.get(-769569468);
            if (method == null) {
                Class cls = (Class) setTextScaleX.setX((char) Drawable.resolveOpacity(0, 0), TextUtils.indexOf((CharSequence) "", '0') + 50, 434 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                byte b11 = (byte) 0;
                byte b12 = b11;
                Object[] objArr3 = new Object[1];
                b(b11, b12, b12, objArr3);
                String str = (String) objArr3[0];
                Class<?> cls2 = Integer.TYPE;
                method = cls.getMethod(str, cls2, cls2);
                map.put(-769569468, method);
            }
            int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
            boolean z11 = iIntValue == -1;
            int i18 = f60859a;
            byte[] bArr3 = f60862d;
            if (z11) {
                if (bArr3 != null) {
                    int length2 = bArr3.length;
                    bArr2 = new byte[length2];
                    int i19 = 0;
                    while (i19 < length2) {
                        int i20 = f60868j + 35;
                        f60869k = i20 % 128;
                        if (i20 % i15 == 0) {
                            Object[] objArr4 = new Object[i16];
                            objArr4[i17] = Integer.valueOf(bArr3[i19]);
                            Map map2 = setTextScaleX.setMaxEms;
                            Object method2 = map2.get(510767826);
                            if (method2 == null) {
                                method2 = ((Class) setTextScaleX.setX((char) (View.resolveSizeAndState(i17, i17, i17) + 49111), 42 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 52)).getMethod("s", Integer.TYPE);
                                map2.put(510767826, method2);
                            }
                            bArr2[i19] = ((Byte) ((Method) method2).invoke(null, objArr4)).byteValue();
                            i19 = 0;
                        } else {
                            length2 = length2;
                            Object[] objArr5 = {Integer.valueOf(bArr3[i19])};
                            Map map3 = setTextScaleX.setMaxEms;
                            Object method3 = map3.get(510767826);
                            if (method3 == null) {
                                method3 = ((Class) setTextScaleX.setX((char) (49112 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 41, 52 - (ViewConfiguration.getScrollBarSize() >> 8))).getMethod("s", Integer.TYPE);
                                map3.put(510767826, method3);
                            }
                            bArr2[i19] = ((Byte) ((Method) method3).invoke(null, objArr5)).byteValue();
                            i19++;
                        }
                        length2 = length2;
                        i15 = 2;
                        i16 = 1;
                        i17 = 0;
                    }
                } else {
                    bArr2 = bArr3;
                }
                bArr2.getClass();
                Object[] objArr6 = {Integer.valueOf(i12), Integer.valueOf(i18)};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(-769569468);
                if (method4 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getLongPressTimeout() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 49, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 433);
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr7 = new Object[1];
                    b(b13, b14, b14, objArr7);
                    String str2 = (String) objArr7[0];
                    Class<?> cls4 = Integer.TYPE;
                    method4 = cls3.getMethod(str2, cls4, cls4);
                    map4.put(-769569468, method4);
                }
                iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method4).invoke(null, objArr6)).intValue()]) ^ 7616081452308447380L)) + ((int) (((long) i14) ^ 7616081452308447380L)));
            }
            if (iIntValue > 0) {
                settextalignment.setX = ((i12 + iIntValue) - 2) + ((int) (((long) i18) ^ 7616081452308447380L)) + (!(z11 ^ true) ? 1 : 0);
                Object[] objArr8 = {settextalignment, Integer.valueOf(i11), Integer.valueOf(f60861c), sb2};
                Map map5 = setTextScaleX.setMaxEms;
                Object method5 = map5.get(193260760);
                if (method5 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) ((-1) - TextUtils.lastIndexOf("", '0')), 42 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2803);
                    byte b15 = (byte) 3;
                    byte b16 = (byte) (b15 - 3);
                    Object[] objArr9 = new Object[1];
                    b(b15, b16, b16, objArr9);
                    String str3 = (String) objArr9[0];
                    Class<?> cls6 = Integer.TYPE;
                    method5 = cls5.getMethod(str3, Object.class, cls6, cls6, Object.class);
                    map5.put(193260760, method5);
                }
                ((StringBuilder) ((Method) method5).invoke(null, objArr8)).append(settextalignment.setCompoundDrawableTintBlendMode);
                settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                if (bArr3 != null) {
                    int i21 = f60869k + 107;
                    f60868j = i21 % 128;
                    if (i21 % 2 != 0) {
                        length = bArr3.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr3.length;
                        bArr = new byte[length];
                    }
                    for (int i22 = 0; i22 < length; i22++) {
                        bArr[i22] = (byte) (((long) bArr3[i22]) ^ 7616081452308447380L);
                    }
                } else {
                    bArr = bArr3;
                }
                if (bArr != null) {
                    int i23 = f60869k + 47;
                    f60868j = i23 % 128;
                    if (i23 % 2 != 0) {
                        i13 = 1;
                        z10 = false;
                    } else {
                        i13 = 1;
                        z10 = true;
                    }
                } else {
                    i13 = 1;
                    z10 = false;
                }
                while (true) {
                    settextalignment.setDividerPadding = i13;
                    if (settextalignment.setDividerPadding >= iIntValue) {
                        break;
                    }
                    if (!z10) {
                        settextalignment.setX--;
                        throw null;
                    }
                    int i24 = f60869k + 125;
                    f60868j = i24 % 128;
                    int i25 = i24 % 2;
                    int i26 = settextalignment.setX;
                    settextalignment.setX = i26 - 1;
                    char c10 = (char) (settextalignment.setY + (((byte) (((byte) (((long) bArr3[i26]) ^ 7616081452308447380L)) + s4)) ^ b10));
                    settextalignment.setCompoundDrawableTintBlendMode = c10;
                    sb2.append(c10);
                    settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                    i13 = settextalignment.setDividerPadding + 1;
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

    public static void b(byte b10, byte b11, int i10, Object[] objArr) {
        int i11 = b10 + 109;
        int i12 = i10 * 4;
        int i13 = 3 - (b11 * 2);
        byte[] bArr = new byte[1 - i12];
        int i14 = 0 - i12;
        byte[] bArr2 = f60870l;
        int i15 = -1;
        if (bArr2 == null) {
            i11 += i13;
            i13 = i13;
            i14 = i14;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i15 = -1;
        }
        while (true) {
            int i16 = i13 + 1;
            int i17 = i15 + 1;
            bArr[i17] = (byte) i11;
            if (i17 == i14) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            i11 += bArr2[i16];
            i13 = i16;
            i14 = i14;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i15 = i17;
        }
    }

    public static void c() {
        f60870l = new byte[]{76, -66, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 25};
        m = 106;
    }

    public static final float d(float f6, Context context) {
        int i10 = f60866h + 19;
        f60867i = i10 % 128;
        float fApplyDimension = i10 % 2 == 0 ? TypedValue.applyDimension(3, f6, context.getResources().getDisplayMetrics()) : TypedValue.applyDimension(2, f6, context.getResources().getDisplayMetrics());
        int i11 = f60867i + 85;
        f60866h = i11 % 128;
        int i12 = i11 % 2;
        return fApplyDimension;
    }

    @NotNull
    public static setEnabled e(@NotNull sn snVar) {
        Intrinsics.checkNotNullParameter(snVar, "");
        setEnabled setenabled = new setEnabled(((Float) sn.setX(new Object[]{snVar}, -1730009207, 1730009210, System.identityHashCode(snVar))).floatValue(), ((Float) sn.setX(new Object[]{snVar}, -2135379768, 2135379770, System.identityHashCode(snVar))).floatValue(), ((Float) sn.setX(new Object[]{snVar}, 332549108, -332549108, System.identityHashCode(snVar))).floatValue(), ((Float) sn.setX(new Object[]{snVar}, -1121733184, 1121733185, System.identityHashCode(snVar))).floatValue());
        int i10 = f60867i + 93;
        f60866h = i10 % 128;
        if (i10 % 2 == 0) {
            return setenabled;
        }
        throw null;
    }

    public static final byte[] f(Context context, Integer num, int i10) {
        int i11 = f60867i;
        int i12 = i11 + 65;
        f60866h = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        if (num != null) {
            int i13 = i11 + 73;
            f60866h = i13 % 128;
            if (i13 % 2 != 0) {
                num.intValue();
                throw null;
            }
            i10 = num.intValue();
        }
        Drawable drawable = AppCompatResources.getDrawable(context, i10);
        Intrinsics.checkNotNull(drawable);
        return (byte[]) setPreferKeepClearRects.setOnFocusChangeListener(new Object[]{DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null)}, 2127939347, -2127939346, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final component28 setCompoundDrawableTintBlendMode(@NotNull sk skVar, @NotNull String str, @Nullable String str2, int i10, float f6) {
        setIndeterminateTintBlendMode setindeterminatetintblendmode;
        Intrinsics.checkNotNullParameter(skVar, "");
        Intrinsics.checkNotNullParameter(str, "");
        Integer num = (Integer) sk.setX(new Object[]{skVar}, -559917236, 559917240, System.identityHashCode(skVar));
        Integer compoundDrawableTintBlendMode = skVar.setCompoundDrawableTintBlendMode();
        Integer x4 = skVar.setX();
        String str3 = (String) sk.setX(new Object[]{skVar}, -2139927297, 2139927299, System.identityHashCode(skVar));
        Integer navigationOnClickListener = skVar.setNavigationOnClickListener();
        Float onLongClickListener = skVar.setOnLongClickListener();
        Integer onDragListener = skVar.setOnDragListener();
        Integer navBarTitleString = skVar.getNavBarTitleString();
        Integer layoutAnimation = skVar.setLayoutAnimation();
        Integer z10 = skVar.setZ();
        Float includeFontPadding = skVar.setIncludeFontPadding();
        Integer num2 = (Integer) sk.setX(new Object[]{skVar}, -693921023, 693921024, System.identityHashCode(skVar));
        Integer numUiMessageCallbackKtWhenMappings = skVar.UiMessageCallbackKtWhenMappings();
        Float textAlignment = skVar.setTextAlignment();
        String str4 = (String) sk.setX(new Object[]{skVar}, -1938578016, 1938578016, System.identityHashCode(skVar));
        Integer cursorVisible = skVar.setCursorVisible();
        Integer num3 = (Integer) sk.setX(new Object[]{skVar}, 486778990, -486778984, System.identityHashCode(skVar));
        boolean textSelectHandleRight = skVar.setTextSelectHandleRight();
        String str5 = (String) sk.setX(new Object[]{skVar}, -1769210335, 1769210338, System.identityHashCode(skVar));
        sp scroller = skVar.setScroller();
        if (scroller != null) {
            Intrinsics.checkNotNullParameter(scroller, "");
            setIndeterminateTintBlendMode setindeterminatetintblendmode2 = new setIndeterminateTintBlendMode(e((sn) sp.setOnFocusChangeListener(new Object[]{scroller}, 373650272, -373650271, System.identityHashCode(scroller))), e((sn) sp.setOnFocusChangeListener(new Object[]{scroller}, -2011261309, 2011261312, System.identityHashCode(scroller))), e((sn) sp.setOnFocusChangeListener(new Object[]{scroller}, -1512237302, 1512237304, System.identityHashCode(scroller))), e((sn) sp.setOnFocusChangeListener(new Object[]{scroller}, -840796711, 840796711, System.identityHashCode(scroller))));
            int i11 = f60866h + 13;
            f60867i = i11 % 128;
            int i12 = i11 % 2;
            setindeterminatetintblendmode = setindeterminatetintblendmode2;
        } else {
            setindeterminatetintblendmode = null;
        }
        return new component28(num, compoundDrawableTintBlendMode, x4, str3, navigationOnClickListener, onLongClickListener, onDragListener, navBarTitleString, str, layoutAnimation, z10, includeFontPadding, str2, num2, numUiMessageCallbackKtWhenMappings, textAlignment, str4, cursorVisible, i10, f6, num3, textSelectHandleRight, str5, setindeterminatetintblendmode);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v1 com.mypinpad.tsdk.i.setGravity, still in use, count: 2, list:
          (r5v1 com.mypinpad.tsdk.i.setGravity) from 0x00ef: PHI (r5v2 com.mypinpad.tsdk.i.setGravity) = (r5v1 com.mypinpad.tsdk.i.setGravity), (r5v51 com.mypinpad.tsdk.i.setGravity) binds: [B:18:0x00cb, B:45:0x02c2] A[DONT_GENERATE, DONT_INLINE]
          (r5v1 com.mypinpad.tsdk.i.setGravity) from 0x003b: MOVE (r25v5 com.mypinpad.tsdk.i.setGravity) = (r5v1 com.mypinpad.tsdk.i.setGravity)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @org.jetbrains.annotations.NotNull
    public static final com.mypinpad.tsdk.isolation.setGravity setDividerPadding(@org.jetbrains.annotations.NotNull com.mypinpad.tsdk.isolation.sk r32, @org.jetbrains.annotations.NotNull android.content.Context r33, float r34, int r35) {
        /*
            Method dump skipped, instruction units count: 1505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.sh.setDividerPadding(com.mypinpad.tsdk.i.sk, android.content.Context, float, int):com.mypinpad.tsdk.i.setGravity");
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        if (((i10 | i12) * 104) + ((~(i11 | (~i12) | i10)) * (-104)) + (((~(i13 | i14)) | (~(i14 | i12))) * 104) + (i11 * (-103)) + (i10 * (-103)) != 1) {
            PinViewportDp pinViewportDp = (PinViewportDp) objArr[0];
            Intrinsics.checkNotNullParameter(pinViewportDp, "");
            sn snVar = new sn(pinViewportDp.getX(), pinViewportDp.getY(), pinViewportDp.getWidth(), pinViewportDp.getHeight());
            int i15 = f60866h + 53;
            f60867i = i15 % 128;
            if (i15 % 2 != 0) {
                return snVar;
            }
            throw null;
        }
        int iIntValue = ((Number) objArr[0]).intValue();
        Context context = (Context) objArr[1];
        int i16 = f60867i + 91;
        f60866h = i16 % 128;
        int i17 = i16 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        int iRoundToInt = c.roundToInt(context.getResources().getDisplayMetrics().density * iIntValue);
        int i18 = f60867i + 35;
        f60866h = i18 % 128;
        if (i18 % 2 == 0) {
            return Integer.valueOf(iRoundToInt);
        }
        throw null;
    }

    @NotNull
    public static final setIndeterminate setY(@NotNull sk skVar) {
        int i10 = f60866h + 93;
        f60867i = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(skVar, "");
            int i11 = setOnFocusChangeListener.setCompoundDrawableTintBlendMode[skVar.setY().ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        return setIndeterminate.setDividerPadding;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                setIndeterminate setindeterminate = setIndeterminate.setOnFocusChangeListener;
                int i12 = f60867i + 7;
                f60866h = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 62 / 0;
                }
                return setindeterminate;
            }
            Boolean bool = mg.setCompoundDrawableTintBlendMode;
            Intrinsics.checkNotNullExpressionValue(bool, "");
            if (!bool.booleanValue()) {
                return setIndeterminate.setY;
            }
            int i14 = f60866h + 33;
            f60867i = i14 % 128;
            if (i14 % 2 != 0) {
                return setIndeterminate.setOnFocusChangeListener;
            }
            int i15 = 76 / 0;
            return setIndeterminate.setOnFocusChangeListener;
        }
        Intrinsics.checkNotNullParameter(skVar, "");
        int i16 = setOnFocusChangeListener.setCompoundDrawableTintBlendMode[skVar.setY().ordinal()];
        throw null;
    }

    @NotNull
    public static final sk setCompoundDrawableTintBlendMode(@NotNull PinPadConfiguration pinPadConfiguration) {
        sp spVar;
        Intrinsics.checkNotNullParameter(pinPadConfiguration, "");
        PinPadType pinPadType = pinPadConfiguration.getPinPadType();
        Integer statusBarColor = pinPadConfiguration.getStatusBarColor();
        Integer generalBgColor = pinPadConfiguration.getGeneralBgColor();
        Integer navBarBgColor = pinPadConfiguration.getNavBarBgColor();
        String navBarTitleString = pinPadConfiguration.getNavBarTitleString();
        Integer navBarTextColor = pinPadConfiguration.getNavBarTextColor();
        Float navBarTextSizeSp = pinPadConfiguration.getNavBarTextSizeSp();
        Integer pinDigitTintColor = pinPadConfiguration.getPinDigitTintColor();
        Integer pinDigitBgColor = pinPadConfiguration.getPinDigitBgColor();
        Integer amountFieldBgColor = pinPadConfiguration.getAmountFieldBgColor();
        Integer amountFieldTextColor = pinPadConfiguration.getAmountFieldTextColor();
        Float amountFieldTextSizeSp = pinPadConfiguration.getAmountFieldTextSizeSp();
        Integer detailsFieldBgColor = pinPadConfiguration.getDetailsFieldBgColor();
        Integer detailsFieldTextColor = pinPadConfiguration.getDetailsFieldTextColor();
        Float detailsFieldTextSizeSp = pinPadConfiguration.getDetailsFieldTextSizeSp();
        Integer pinGridBgColor = pinPadConfiguration.getPinGridBgColor();
        Integer pinGridButtonTextColor = pinPadConfiguration.getPinGridButtonTextColor();
        Integer pinGridButtonBgColor = pinPadConfiguration.getPinGridButtonBgColor();
        Float pinGridButtonNumFontSizeSp = pinPadConfiguration.getPinGridButtonNumFontSizeSp();
        Integer cancelButtonIconDrawableId = pinPadConfiguration.getCancelButtonIconDrawableId();
        String cancelButtonText = pinPadConfiguration.getCancelButtonText();
        Integer clearButtonIconDrawableId = pinPadConfiguration.getClearButtonIconDrawableId();
        String clearButtonText = pinPadConfiguration.getClearButtonText();
        Integer enterButtonIconDrawableId = pinPadConfiguration.getEnterButtonIconDrawableId();
        String enterButtonText = pinPadConfiguration.getEnterButtonText();
        Integer dynamicButtonBackgroundColor = pinPadConfiguration.getDynamicButtonBackgroundColor();
        Integer dynamicButtonTextColor = pinPadConfiguration.getDynamicButtonTextColor();
        Float dynamicButtonTextSizeSp = pinPadConfiguration.getDynamicButtonTextSizeSp();
        Integer dynamicButtonIconTextSpacingDp = pinPadConfiguration.getDynamicButtonIconTextSpacingDp();
        String tooFewDigitsMessage = pinPadConfiguration.getTooFewDigitsMessage();
        Integer progressBarColor = pinPadConfiguration.getProgressBarColor();
        boolean immersiveMode = pinPadConfiguration.getImmersiveMode();
        String revealSystemBarToastMessage = pinPadConfiguration.getRevealSystemBarToastMessage();
        PinViewports pinViewports = pinPadConfiguration.getPinViewports();
        if (pinViewports != null) {
            Intrinsics.checkNotNullParameter(pinViewports, "");
            spVar = new sp((sn) setY(new Object[]{pinViewports.getTransactionPortrait()}, -1354354168, 1354354168, (int) System.currentTimeMillis()), (sn) setY(new Object[]{pinViewports.getPinPadPortrait()}, -1354354168, 1354354168, (int) System.currentTimeMillis()), (sn) setY(new Object[]{pinViewports.getTransactionLandscape()}, -1354354168, 1354354168, (int) System.currentTimeMillis()), (sn) setY(new Object[]{pinViewports.getPinPadLandscape()}, -1354354168, 1354354168, (int) System.currentTimeMillis()));
            int i10 = f60867i + 89;
            f60866h = i10 % 128;
            int i11 = i10 % 2;
        } else {
            spVar = null;
        }
        return new sk(pinPadType, statusBarColor, generalBgColor, navBarBgColor, navBarTitleString, navBarTextColor, navBarTextSizeSp, pinDigitTintColor, pinDigitBgColor, amountFieldBgColor, amountFieldTextColor, amountFieldTextSizeSp, detailsFieldBgColor, detailsFieldTextColor, detailsFieldTextSizeSp, pinGridBgColor, pinGridButtonTextColor, pinGridButtonBgColor, pinGridButtonNumFontSizeSp, cancelButtonIconDrawableId, cancelButtonText, clearButtonIconDrawableId, clearButtonText, enterButtonIconDrawableId, enterButtonText, dynamicButtonBackgroundColor, dynamicButtonTextColor, dynamicButtonTextSizeSp, dynamicButtonIconTextSpacingDp, tooFewDigitsMessage, progressBarColor, immersiveMode, revealSystemBarToastMessage, spVar);
    }

    public static final int setDividerPadding(int i10, @NotNull Context context) {
        return ((Integer) setY(new Object[]{Integer.valueOf(i10), context}, -957578882, 957578883, i10)).intValue();
    }
}
