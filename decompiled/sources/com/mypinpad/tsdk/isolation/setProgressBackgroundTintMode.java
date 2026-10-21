package com.mypinpad.tsdk.isolation;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.camera.core.p1;
import androidx.core.view.PointerIconCompat;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setProgressBackgroundTintMode implements setAccessibilityDelegate {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f60349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f60350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final char f60351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f60352h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f60353i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f60354j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f60355k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f60356l = null;
    public static final int m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final fillInStackTrace f60357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setFastScrollStyle f60358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public HandlerThread f60359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Handler f60360d;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setOnFocusChangeListener", "()V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f60361r0 = 0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f60362s0 = 1;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<setAccessibilityDelegate.setX, Unit> f60364q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super setAccessibilityDelegate.setX, Unit> function1) {
            super(0);
            this.f60364q0 = function1;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i11;
            int i14 = ~i12;
            if ((((~(i10 | i14)) | (~(i12 | (~i10))) | i13) * 45) + (((~(i11 | i10)) | (~(i13 | i12))) * (-45)) + (((~(i13 | i14)) | i10) * (-90)) + (i11 * 46) + (i10 * 46) != 1) {
                a aVar = (a) objArr[0];
                int i15 = f60362s0;
                int i16 = i15 & 63;
                int i17 = -(-((i15 ^ 63) | i16));
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                f60361r0 = i18 % 128;
                if (i18 % 2 != 0) {
                    setProgressBackgroundTintMode.setDividerPadding(setProgressBackgroundTintMode.this, setAccessibilityDelegate.setX.setCompoundDrawableTintBlendMode, aVar.f60364q0);
                    throw null;
                }
                setProgressBackgroundTintMode.setDividerPadding(setProgressBackgroundTintMode.this, setAccessibilityDelegate.setX.setCompoundDrawableTintBlendMode, aVar.f60364q0);
                System.identityHashCode(aVar);
                System.identityHashCode(aVar);
                return null;
            }
            a aVar2 = (a) objArr[0];
            int i19 = f60362s0;
            int i20 = i19 ^ 97;
            int i21 = (i19 & 97) << 1;
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            f60361r0 = i22 % 128;
            if (i22 % 2 != 0) {
                a(new Object[]{aVar2}, -397515020, 397515020, System.identityHashCode(aVar2));
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            a(new Object[]{aVar2}, -397515020, 397515020, System.identityHashCode(aVar2));
            Unit unit2 = Unit.INSTANCE;
            int i23 = f60361r0;
            int i24 = i23 & 57;
            int i25 = i24 + ((i23 ^ 57) | i24);
            f60362s0 = i25 % 128;
            int i26 = i25 % 2;
            return unit2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            return a(new Object[]{this}, -1773180209, 1773180210, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setDividerPadding", "()V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f60365r0 = 0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f60366s0 = 1;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<setAccessibilityDelegate.setX, Unit> f60368q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super setAccessibilityDelegate.setX, Unit> function1) {
            super(0);
            this.f60368q0 = function1;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            Unit unit;
            int i13 = ~i10;
            int i14 = ~(i13 | i11);
            int i15 = ~i11;
            int i16 = ((i12 | i14 | (~(i15 | i10))) * 614) + (i11 * (-613)) + (i10 * 615);
            int i17 = ~i12;
            if ((((~(i10 | i17 | i11)) | (~(i13 | i15 | i17))) * 614) + (((~(i13 | i17)) | i14 | (~(i17 | i11))) * (-1228)) + i16 != 1) {
                b bVar = (b) objArr[0];
                int i18 = f60366s0;
                int i19 = i18 & 61;
                int i20 = i18 | 61;
                int i21 = (i19 & i20) + (i20 | i19);
                f60365r0 = i21 % 128;
                unit = null;
                if (i21 % 2 != 0) {
                    setProgressBackgroundTintMode.setDividerPadding(setProgressBackgroundTintMode.this, setAccessibilityDelegate.setX.setOnFocusChangeListener, bVar.f60368q0);
                    throw null;
                }
                setProgressBackgroundTintMode.setDividerPadding(setProgressBackgroundTintMode.this, setAccessibilityDelegate.setX.setOnFocusChangeListener, bVar.f60368q0);
            } else {
                b bVar2 = (b) objArr[0];
                int i22 = f60365r0;
                int i23 = i22 & 83;
                int i24 = i23 + ((i22 ^ 83) | i23);
                f60366s0 = i24 % 128;
                int i25 = i24 % 2;
                a(new Object[]{bVar2}, 445297862, -445297862, System.identityHashCode(bVar2));
                unit = Unit.INSTANCE;
                int i26 = f60365r0;
                int i27 = i26 & 103;
                int i28 = (((i26 | 103) & (~i27)) - (~(i27 << 1))) - 1;
                f60366s0 = i28 % 128;
                if (i28 % 2 == 0) {
                    int i29 = 13 / 0;
                }
            }
            return unit;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            return a(new Object[]{this}, 1479807127, -1479807126, System.identityHashCode(this));
        }
    }

    static {
        d();
        f60354j = 0;
        f60355k = 1;
        f60352h = 0;
        f60353i = 1;
        f60351g = (char) 38975;
        f60349e = -2443367703579691432L;
        f60350f = -461867432;
    }

    public setProgressBackgroundTintMode(@NotNull fillInStackTrace fillinstacktrace, @NotNull setFastScrollStyle setfastscrollstyle) {
        Intrinsics.checkNotNullParameter(fillinstacktrace, "");
        Intrinsics.checkNotNullParameter(setfastscrollstyle, "");
        this.f60357a = fillinstacktrace;
        this.f60358b = setfastscrollstyle;
        this.f60360d = new Handler(Looper.getMainLooper());
    }

    public static void a(setAccessibilityDelegate.setX setx, Function1 function1) {
        int i10 = f60352h + 59;
        f60353i = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(setx, "");
            function1.invoke(setx);
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(setx, "");
        function1.invoke(setx);
        int i11 = f60352h + 17;
        f60353i = i11 % 128;
        int i12 = i11 % 2;
    }

    public static void b(char c10, int i10, Object[] objArr) throws Throwable {
        int i11;
        char[] charArray = "讔텙\ued57".toCharArray();
        char[] charArray2 = "\u0000\u0000\u0000\u0000".toCharArray();
        int i12 = f60355k + 31;
        int i13 = i12 % 128;
        f60354j = i13;
        int i14 = 2;
        int i15 = i12 % 2;
        int i16 = i13 + 13;
        f60355k = i16 % 128;
        int i17 = i16 % 2;
        char[] charArray3 = "䤘廏鼭⣜".toCharArray();
        UiMessageCallbackKtWhenMappings uiMessageCallbackKtWhenMappings = new UiMessageCallbackKtWhenMappings();
        int length = charArray3.length;
        char[] cArr = new char[length];
        int length2 = charArray2.length;
        char[] cArr2 = new char[length2];
        int i18 = 0;
        System.arraycopy(charArray3, 0, cArr, 0, length);
        System.arraycopy(charArray2, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c10);
        cArr2[2] = (char) (cArr2[2] + ((char) i10));
        int length3 = charArray.length;
        char[] cArr3 = new char[length3];
        uiMessageCallbackKtWhenMappings.setX = 0;
        while (uiMessageCallbackKtWhenMappings.setX < length3) {
            int i19 = f60354j + 27;
            f60355k = i19 % 128;
            int i20 = i19 % i14;
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i18] = uiMessageCallbackKtWhenMappings;
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(20564334);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (50678 - View.resolveSizeAndState(i18, i18, i18)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 39, TextUtils.indexOf("", "", i18) + 1737);
                    byte b10 = (byte) i18;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    c(b11, b11, b10, objArr3);
                    method = cls.getMethod((String) objArr3[0], Object.class);
                    map.put(20564334, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = {uiMessageCallbackKtWhenMappings};
                Object method2 = map.get(-68974155);
                int i21 = m;
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (TextUtils.getTrimmedLength("") + 8125), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 37, 646 - ((Process.getThreadPriority(0) + 20) >> 6));
                    byte b12 = (byte) (i21 & 11);
                    byte b13 = (byte) (b12 - 3);
                    Object[] objArr5 = new Object[1];
                    c(b13, b13, b12, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class);
                    map.put(-68974155, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                Object[] objArr6 = {uiMessageCallbackKtWhenMappings, Integer.valueOf(cArr[uiMessageCallbackKtWhenMappings.setX % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method3 = map.get(-1108711559);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 49 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 434);
                    byte b14 = (byte) (i21 & 1);
                    byte b15 = (byte) (b14 - 1);
                    Object[] objArr7 = new Object[1];
                    c(b15, b15, b14, objArr7);
                    String str = (String) objArr7[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str, Object.class, cls4, cls4);
                    map.put(-1108711559, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                Object[] objArr8 = {Integer.valueOf(cArr[iIntValue2] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method4 = map.get(533021397);
                if (method4 != null) {
                    i11 = 2;
                } else {
                    Class cls5 = (Class) setTextScaleX.setX((char) (TextUtils.getTrimmedLength("") + 4449), 41 - TextUtils.indexOf((CharSequence) "", '0', 0), (KeyEvent.getMaxKeyCode() >> 16) + PointerIconCompat.TYPE_GRABBING);
                    byte b16 = (byte) 0;
                    Object[] objArr9 = new Object[1];
                    c(b16, b16, (byte) (i21 & 30), objArr9);
                    String str2 = (String) objArr9[0];
                    i11 = 2;
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str2, cls6, cls6);
                    map.put(533021397, method4);
                }
                cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                char c11 = uiMessageCallbackKtWhenMappings.setDividerPadding;
                cArr[iIntValue2] = c11;
                int i22 = uiMessageCallbackKtWhenMappings.setX;
                cArr3[i22] = (char) (((((long) (c11 ^ charArray[i22])) ^ (f60349e ^ (-2443367703579691432L))) ^ ((long) ((int) (((long) f60350f) ^ (-2443367703579691432L))))) ^ ((long) ((char) (((long) f60351g) ^ (-2443367703579691432L)))));
                uiMessageCallbackKtWhenMappings.setX = i22 + 1;
                i14 = i11;
                length3 = length3;
                cArr3 = cArr3;
                charArray = charArray;
                i18 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = 4 - r6
            int r8 = r8 + 113
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.setProgressBackgroundTintMode.f60356l
            r2 = 0
            if (r1 != 0) goto L19
            r8 = r7
            r3 = r1
            r4 = r2
            r7 = r6
            r1 = r0
            r0 = r9
            r9 = r8
            goto L33
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L33:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r7 + 1
            r7 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setProgressBackgroundTintMode.c(byte, int, short, java.lang.Object[]):void");
    }

    public static void d() {
        f60356l = new byte[]{41, -42, 76, 2};
        m = 39;
    }

    public static final void setDividerPadding(setProgressBackgroundTintMode setprogressbackgroundtintmode, setAccessibilityDelegate.setX setx, Function1 function1) {
        int i10 = f60353i + 53;
        f60352h = i10 % 128;
        int i11 = i10 % 2;
        setprogressbackgroundtintmode.getClass();
        int i12 = f60353i + 91;
        f60352h = i12 % 128;
        int i13 = i12 % 2;
        Handler handler = setprogressbackgroundtintmode.f60360d;
        if (i13 != 0) {
            handler.post(new androidx.camera.core.processing.a(function1, setx, 3));
            int i14 = 23 / 0;
        } else {
            handler.post(new p1(function1, setx, 4));
        }
        int i15 = f60353i;
        int i16 = i15 + 27;
        f60352h = i16 % 128;
        if (i16 % 2 != 0) {
            throw null;
        }
        int i17 = i15 + 15;
        f60352h = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 44 / 0;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.setAccessibilityDelegate
    @Nullable
    public final synchronized setAccessibilityDelegate.setX setCompoundDrawableTintBlendMode(@NotNull Function1<? super setAccessibilityDelegate.setX, Unit> function1) {
        int i10 = f60352h + 89;
        f60353i = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        if (this.f60359c != null) {
            throw new setAccessibilityDelegate.setCompoundDrawableTintBlendMode();
        }
        setFastScrollStyle setfastscrollstyle = this.f60358b;
        if (((Boolean) setFastScrollStyle.setOnFocusChangeListener(new Object[]{setfastscrollstyle}, 693624790, -693624790, System.identityHashCode(setfastscrollstyle))).booleanValue()) {
            int i12 = f60353i + 79;
            f60352h = i12 % 128;
            if (i12 % 2 == 0) {
                return setAccessibilityDelegate.setX.setY;
            }
            setAccessibilityDelegate.setX setx = setAccessibilityDelegate.setX.setCompoundDrawableTintBlendMode;
            throw null;
        }
        Object[] objArr = new Object[1];
        b((char) (56479 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 761188170 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
        HandlerThread handlerThread = new HandlerThread(((String) objArr[0]).intern());
        handlerThread.start();
        Unit unit = Unit.INSTANCE;
        this.f60359c = handlerThread;
        fillInStackTrace fillinstacktrace = this.f60357a;
        Intrinsics.checkNotNull(handlerThread);
        Looper looper = handlerThread.getLooper();
        Intrinsics.checkNotNullExpressionValue(looper, "");
        if (!(!fillinstacktrace.g_(looper, new a(function1)))) {
            setOnFocusChangeListener();
            return setAccessibilityDelegate.setX.setCompoundDrawableTintBlendMode;
        }
        setFastScrollStyle setfastscrollstyle2 = this.f60358b;
        HandlerThread handlerThread2 = this.f60359c;
        Intrinsics.checkNotNull(handlerThread2);
        Looper looper2 = handlerThread2.getLooper();
        Intrinsics.checkNotNullExpressionValue(looper2, "");
        if (!setfastscrollstyle2.f_(looper2, new b(function1))) {
            return null;
        }
        setOnFocusChangeListener();
        setAccessibilityDelegate.setX setx2 = setAccessibilityDelegate.setX.setOnFocusChangeListener;
        int i13 = f60353i + 21;
        f60352h = i13 % 128;
        int i14 = i13 % 2;
        return setx2;
    }

    @Override // com.mypinpad.tsdk.isolation.setAccessibilityDelegate
    public final synchronized void setOnFocusChangeListener() {
        try {
            int i10 = f60352h + 77;
            f60353i = i10 % 128;
            int i11 = i10 % 2;
            this.f60357a.setCompoundDrawableTintBlendMode();
            this.f60358b.setOnFocusChangeListener();
            HandlerThread handlerThread = this.f60359c;
            if (handlerThread != null) {
                int i12 = f60353i + 101;
                f60352h = i12 % 128;
                if (i12 % 2 != 0) {
                    handlerThread.quit();
                    throw null;
                }
                handlerThread.quit();
            }
            this.f60359c = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
