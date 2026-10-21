package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.mypinpad.tsdk.api.errors.TerminalException;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nSdkTerminal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkTerminal.kt\ncom/mypinpad/tsdk/internal/terminal/SdkTerminal\n+ 2 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n*L\n1#1,149:1\n7#2,8:150\n7#2,8:158\n7#2,8:166\n*S KotlinDebug\n*F\n+ 1 SdkTerminal.kt\ncom/mypinpad/tsdk/internal/terminal/SdkTerminal\n*L\n48#1:150,8\n59#1:158,8\n138#1:166,8\n*E\n"})
public final class td {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f61025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final char f61026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final char f61027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final char f61028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final char f61029l;
    public static int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f61030n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f61031o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f61032p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte[] f61033q = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f61034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final component24 f61035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final np f61036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final no f61037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final nr f61038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public tm f61039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f61040g;

    static {
        d();
        f61031o = 0;
        f61032p = 1;
        m = 0;
        f61030n = 1;
        f61025h = -443080110;
        f61029l = (char) 3721;
        f61028k = (char) 975;
        f61026i = (char) 18858;
        f61027j = (char) 12398;
    }

    public td(@NotNull String str, @NotNull component24 component24Var, @NotNull np npVar, @NotNull no noVar, @NotNull nr nrVar) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(component24Var, "");
        Intrinsics.checkNotNullParameter(npVar, "");
        Intrinsics.checkNotNullParameter(noVar, "");
        Intrinsics.checkNotNullParameter(nrVar, "");
        this.f61034a = str;
        this.f61035b = component24Var;
        this.f61036c = npVar;
        this.f61037d = noVar;
        this.f61038e = nrVar;
        this.f61040g = new AtomicBoolean(false);
        mk.setDividerPadding();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:37:0x01bb  */
    public static void a(int i10, int i11, int i12, String str, Object[] objArr) throws Throwable {
        int i13;
        Throwable cause;
        int i14 = f61032p + 21;
        f61031o = i14 % 128;
        int i15 = 2;
        if (i14 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
        char[] cArr = new char[i10];
        getnavbartitlestring.setY = 0;
        while (true) {
            int i16 = getnavbartitlestring.setY;
            if (i16 >= i10) {
                break;
            }
            int i17 = f61032p + 19;
            f61031o = i17 % 128;
            int i18 = i17 % i15;
            char c10 = charArray[i16];
            getnavbartitlestring.setCompoundDrawableTintBlendMode = c10;
            char c11 = (char) (i11 + c10);
            cArr[i16] = c11;
            try {
                Object[] objArr2 = new Object[i15];
                objArr2[1] = Integer.valueOf(f61025h);
                objArr2[0] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(133002375);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 41, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 482);
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    c(b11, b10, (byte) (b11 + 1), objArr3);
                    String str2 = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(133002375, method);
                }
                cArr[i16] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {getnavbartitlestring, getnavbartitlestring};
                Object method2 = map.get(1860518195);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (55966 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), AndroidCharacter.getMirror('0') - 5, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2267);
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    c(b13, b12, b13, objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(1860518195, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i15 = 2;
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
        if (i12 > 0) {
            int i19 = f61031o + 25;
            f61032p = i19 % 128;
            int i20 = i19 % 2;
            getnavbartitlestring.setOnFocusChangeListener = i12;
            char[] cArr2 = new char[i10];
            System.arraycopy(cArr, 0, cArr2, 0, i10);
            int i21 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, 0, cArr, i10 - i21, i21);
            int i22 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, i22, cArr, 0, i10 - i22);
        }
        char[] cArr3 = new char[i10];
        getnavbartitlestring.setY = 0;
        int i23 = f61032p + 33;
        f61031o = i23 % 128;
        int i24 = 2;
        int i25 = i23 % 2;
        while (true) {
            int i26 = getnavbartitlestring.setY;
            if (i26 >= i10) {
                objArr[0] = new String(cArr3);
                return;
            }
            int i27 = f61031o + 97;
            f61032p = i27 % 128;
            int i28 = i27 % i24;
            cArr3[i26] = cArr[(i10 - i26) - 1];
            Object[] objArr6 = new Object[i24];
            objArr6[1] = getnavbartitlestring;
            objArr6[0] = getnavbartitlestring;
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1860518195);
            if (method3 != null) {
                i13 = 2;
            } else {
                Class cls4 = (Class) setTextScaleX.setX((char) (55967 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 43 - TextUtils.getOffsetBefore("", 0), Color.argb(0, 0, 0, 0) + 2268);
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                c(b15, b14, b15, objArr7);
                i13 = 2;
                method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1860518195, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i24 = i13;
        }
    }

    public static void b(String str, int i10, Object[] objArr) throws Throwable {
        int i11;
        int i12 = f61031o + 43;
        f61032p = i12 % 128;
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
                int i18 = f61032p + 51;
                f61031o = i18 % 128;
                int i19 = i18 % i13;
                char c10 = cArr2[1];
                char c11 = cArr2[i14];
                char[] cArr3 = cArr2;
                int i20 = (c11 + i16) ^ ((c11 << 4) + ((char) (((long) f61028k) ^ 4333817592127744003L)));
                int i21 = c11 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f61029l);
                    objArr2[i13] = Integer.valueOf(i21);
                    objArr2[1] = Integer.valueOf(i20);
                    objArr2[0] = Integer.valueOf(c10);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (48535 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), Color.rgb(0, 0, 0) + 16777263, KeyEvent.keyCodeFromString("") + 2672);
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        c(b11, b10, (byte) (b11 | GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH), objArr3);
                        String str2 = (String) objArr3[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str2, cls2, cls2, cls2, cls2);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr4 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i16) ^ ((cCharValue << 4) + ((char) (((long) f61026i) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f61027j)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (KeyEvent.keyCodeFromString("") + 48534), 48 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 2672 - KeyEvent.getDeadChar(0, 0));
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr5 = new Object[1];
                        c(b13, b12, (byte) (b13 | GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH), objArr5);
                        String str3 = (String) objArr5[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str3, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i16 -= 40503;
                    i17++;
                    int i22 = f61031o + 35;
                    f61032p = i22 % 128;
                    int i23 = i22 % 2;
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
            char[] cArr4 = cArr2;
            int i24 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            cArr[i24] = cArr4[0];
            cArr[i24 + 1] = cArr4[1];
            Object[] objArr6 = {setalwaysdrawnwithcacheenabled, setalwaysdrawnwithcacheenabled};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 != null) {
                i11 = 2;
            } else {
                Class cls5 = (Class) setTextScaleX.setX((char) TextUtils.getCapsMode("", 0, 0), 37 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2145);
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                c(b15, b14, (byte) (b15 | 40), objArr7);
                i11 = 2;
                method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i13 = i11;
            cArr2 = cArr4;
            i14 = 0;
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
    public static void c(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r9 = r9 + 65
            byte[] r0 = new byte[r7]
            byte[] r1 = com.mypinpad.tsdk.isolation.td.f61033q
            r2 = 0
            if (r1 != 0) goto L18
            r9 = r8
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r7
            goto L34
        L18:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L1d:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r0[r3] = r5
            if (r4 != r8) goto L2c
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r2)
            r10[r2] = r7
            return
        L2c:
            r3 = r1[r9]
            r6 = r10
            r10 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L34:
            int r8 = -r8
            int r7 = r7 + r8
            int r9 = r9 + 1
            r8 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.td.c(byte, int, short, java.lang.Object[]):void");
    }

    public static void d() {
        f61033q = new byte[]{59, -77, 103, 16};
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws TerminalException {
        td tdVar = (td) objArr[0];
        String str = (String) objArr[1];
        tdVar.getClass();
        try {
            component24 component24Var = tdVar.f61035b;
            if (str == null) {
                int i13 = f61030n + 47;
                m = i13 % 128;
                int i14 = i13 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i15 = f61030n + 71;
                m = i15 % 128;
                int i16 = i15 % 2;
                str = null;
            }
            component24Var.setY(str);
            return null;
        } catch (Exception e5) {
            TerminalException terminalException = new TerminalException(2, e5.getMessage(), null);
            mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
            throw terminalException;
        }
    }

    @NotNull
    public final component24 setCompoundDrawableTintBlendMode() {
        int i10 = f61030n + 73;
        int i11 = i10 % 128;
        m = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 35;
        f61030n = i13 % 128;
        int i14 = i13 % 2;
        return this.f61035b;
    }

    @NotNull
    public final np setDividerPadding() {
        int i10 = m;
        int i11 = i10 + 79;
        f61030n = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 97;
        f61030n = i13 % 128;
        int i14 = i13 % 2;
        return this.f61036c;
    }

    @NotNull
    public final nr setOnFocusChangeListener() {
        int i10 = f61030n;
        int i11 = i10 + 29;
        m = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 65;
        m = i13 % 128;
        int i14 = i13 % 2;
        return this.f61038e;
    }

    public final void setY() {
        synchronized (this.f61040g) {
            try {
                if (this.f61040g.get()) {
                    return;
                }
                tm tmVar = this.f61039f;
                if (tmVar != null) {
                    mr mrVar = mr.setAlwaysDrawnWithCacheEnabled;
                    Object[] objArr = new Object[1];
                    b("睔ါ齂賬\udb08몛춖ⱱ煆\uee00", 10 - TextUtils.indexOf("", "", 0, 0), objArr);
                    mt.setX(new Object[]{mrVar, ((String) objArr[0]).intern()}, 135701020, -135701017, (int) System.currentTimeMillis());
                    mu.setCompoundDrawableTintBlendMode(new Object[]{140001, null, null, 6}, -1968587119, 1968587120, 140001);
                    Object[] objArr2 = new Object[1];
                    b("睔ါ齂賬\udb08몛춖ⱱ煆\uee00䯮ࢎ䠋\udd9f腰뎖ㄝ낧", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 17, objArr2);
                    pc.setY(new os(((String) objArr2[0]).intern()));
                    tmVar.setOnFocusChangeListener();
                    this.f61039f = null;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @NotNull
    public final Pair<tn, rh> setDividerPadding(@NotNull op opVar, @NotNull String str, @NotNull String str2, @NotNull tw twVar, @NotNull nv nvVar, @NotNull Function0<Unit> function0, @NotNull tu tuVar) throws Throwable {
        AtomicBoolean atomicBoolean;
        ?? r21;
        boolean z10;
        Intrinsics.checkNotNullParameter(opVar, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(twVar, "");
        Intrinsics.checkNotNullParameter(nvVar, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(tuVar, "");
        AtomicBoolean atomicBoolean2 = this.f61040g;
        synchronized (atomicBoolean2) {
            try {
                try {
                    if (this.f61040g.get()) {
                        TerminalException terminalException = new TerminalException(19, null, null);
                        mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
                        throw terminalException;
                    }
                    mr mrVar = mr.setAlwaysDrawnWithCacheEnabled;
                    StringBuilder sb2 = new StringBuilder();
                    Object[] objArr = new Object[1];
                    a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21, 230 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 15, "\u0005\u0018\u0017\u0012\rￄ\uffd0\t\u0018\u0005\u001a\r\u0018\u0007\u0005ￄ\uffde\b￭\t\u0007\u0012", objArr);
                    sb2.append(((String) objArr[0]).intern());
                    sb2.append(str);
                    ?? r3 = 135701020;
                    mt.setX(new Object[]{mrVar, sb2.toString()}, 135701020, -135701017, (int) System.currentTimeMillis());
                    try {
                        tm tmVar = this.f61039f;
                        try {
                            if (tmVar == null) {
                                Object[] objArr2 = new Object[2];
                                objArr2[0] = this;
                                objArr2[1] = str2;
                                setX(objArr2, 1658362704, -1658362704, System.identityHashCode(this));
                                Object[] objArr3 = new Object[1];
                                z10 = false;
                                objArr3[0] = this.f61037d;
                                r3 = str;
                                r21 = 0;
                                try {
                                    atomicBoolean = atomicBoolean2;
                                    try {
                                        tm tmVar2 = new tm(this, nvVar, new ti(opVar, r3, this.f61034a, null, null, 24, null), opVar, str, (UUID) nl.setCompoundDrawableTintBlendMode(objArr3, -1221210430, 1221210430, (int) System.currentTimeMillis()), twVar, null, null, BluetoothState.REQUEST_CONNECT_DEVICE, null);
                                        this.f61039f = tmVar2;
                                        Intrinsics.checkNotNull(tmVar2);
                                        Pair<tn, rh> dividerPadding = tmVar2.setDividerPadding(function0, tuVar);
                                        return dividerPadding;
                                    } catch (Exception e5) {
                                        e = e5;
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    atomicBoolean = atomicBoolean2;
                                }
                            } else {
                                if (tmVar.setDividerPadding()) {
                                    Object[] objArr4 = new Object[4];
                                    r3 = 0;
                                    objArr4[0] = 120008;
                                    objArr4[1] = null;
                                    objArr4[2] = null;
                                    objArr4[3] = 6;
                                    mu.setCompoundDrawableTintBlendMode(objArr4, -1968587119, 1968587120, 120008);
                                    TerminalException terminalException2 = new TerminalException(21, null, null);
                                    Object[] objArr5 = new Object[1];
                                    try {
                                        objArr5[0] = terminalException2;
                                        mt.setX(objArr5, 1181816825, -1181816816, (int) System.currentTimeMillis());
                                        throw terminalException2;
                                    } catch (Exception e10) {
                                        e = e10;
                                        r21 = 0;
                                    }
                                } else {
                                    Object[] objArr6 = new Object[4];
                                    try {
                                        objArr6[0] = 120009;
                                        objArr6[1] = null;
                                        objArr6[2] = null;
                                        objArr6[3] = 6;
                                        mu.setCompoundDrawableTintBlendMode(objArr6, -1968587119, 1968587120, 120009);
                                        z10 = false;
                                        try {
                                            Object[] objArr7 = new Object[1];
                                            b("須⎴憍葰俩苴ᑗㄫ\u0a7c薰\ude6a嗾\udb08몛\udaf8갫䯮ࢎ䠋\udd9f腰뎖ㄝ낧", Color.rgb(0, 0, 0) + 16777240, objArr7);
                                            pc.setY(new os(((String) objArr7[0]).intern()));
                                            tmVar.setOnFocusChangeListener();
                                            this.f61039f = null;
                                            Object[] objArr8 = new Object[2];
                                            objArr8[0] = this;
                                            objArr8[1] = str2;
                                            setX(objArr8, 1658362704, -1658362704, System.identityHashCode(this));
                                            Object[] objArr9 = new Object[1];
                                            z10 = false;
                                            objArr9[0] = this.f61037d;
                                            r3 = str;
                                            r21 = 0;
                                            atomicBoolean = atomicBoolean2;
                                            tm tmVar3 = new tm(this, nvVar, new ti(opVar, r3, this.f61034a, null, null, 24, null), opVar, str, (UUID) nl.setCompoundDrawableTintBlendMode(objArr9, -1221210430, 1221210430, (int) System.currentTimeMillis()), twVar, null, null, BluetoothState.REQUEST_CONNECT_DEVICE, null);
                                            this.f61039f = tmVar3;
                                            Intrinsics.checkNotNull(tmVar3);
                                            Pair<tn, rh> dividerPadding2 = tmVar3.setDividerPadding(function0, tuVar);
                                            return dividerPadding2;
                                        } catch (Exception e11) {
                                            e = e11;
                                            r21 = z10;
                                            atomicBoolean = atomicBoolean2;
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                        atomicBoolean = atomicBoolean2;
                                        r21 = 0;
                                    }
                                }
                                atomicBoolean = atomicBoolean2;
                            }
                        } catch (Exception e13) {
                            e = e13;
                            r21 = r3;
                        }
                    } catch (Exception e14) {
                        e = e14;
                        atomicBoolean = atomicBoolean2;
                        r21 = 0;
                    }
                    mr mrVar2 = mr.setOnFocusChangeListener;
                    Object[] objArr10 = new Object[1];
                    a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 237, (ViewConfiguration.getFadingEdgeLength() >> 16) + 9, "\u0006\u0005\u0014ﾽ\u000f\f\u000f\u000f￢\u000b\f\u0006\u0011\ufffe\u0013\u0006\u0011\u0000\ufffeﾽ\u0002\t", objArr10);
                    Object[] objArr11 = new Object[1];
                    objArr11[r21] = ((String) objArr10[r21]).intern();
                    mt.setX(objArr11, 1760239564, -1760239563, (int) System.currentTimeMillis());
                    Pair<tn, rh> pair = new Pair<>(null, new to(rk.setOnDragListener, rx.setOnFocusChangeListener(e)));
                    return pair;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        throw th;
    }

    public final void setX() {
        synchronized (this.f61040g) {
            try {
                if (this.f61040g.getAndSet(true)) {
                    return;
                }
                mk.setY();
                tm tmVar = this.f61039f;
                if (tmVar != null) {
                    tmVar.setOnFocusChangeListener();
                }
                this.f61039f = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
