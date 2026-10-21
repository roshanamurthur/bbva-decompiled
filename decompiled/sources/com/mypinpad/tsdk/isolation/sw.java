package com.mypinpad.tsdk.isolation;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.PointerIconCompat;
import com.bbva.tohu.android.product.valkyria.sdk.services.intents.DeleteDeviceIntentService;
import com.bbva.tohu.android.product.valkyria.sdk.services.intents.InitIntentService;
import com.esotericsoftware.asm.Opcodes;
import com.mypinpad.tsdk.api.errors.TerminalException;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nAndroidTerminal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTerminal.kt\ncom/mypinpad/tsdk/internal/terminal/AndroidTerminal\n+ 2 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n*L\n1#1,257:1\n7#2,8:258\n7#2,8:266\n7#2,8:274\n7#2,8:282\n*S KotlinDebug\n*F\n+ 1 AndroidTerminal.kt\ncom/mypinpad/tsdk/internal/terminal/AndroidTerminal\n*L\n73#1:258,8\n189#1:266,8\n212#1:274,8\n227#1:282,8\n*E\n"})
public final class sw {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f60940h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final char[] f60941i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f60942j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f60943k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f60944l;
    public static int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f60945n = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f60946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f60947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final nn f60948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final nr f60949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final sd f60950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f60951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final td f60952g;

    public static final class a extends Exception {
    }

    static {
        d();
        f60944l = 0;
        m = 1;
        f60942j = 0;
        f60943k = 1;
        f60940h = -443080058;
        f60941i = new char[]{59043, 59129, 59109, 59108, 59090, 59100, 59131, 59089, 59095, 59075, 59080, 59134, 59132, 59131, 59108, 59110, 59105, 59129, 59092, 59100, 59135, 59093, 59095, 59121, 59133, 59135, 59120, 59126, 59094, 59090, 59131, 59129, 59131, 59135, 59135, 59110, 59129, 59129, 59105, 59087, 59046, 59126, 59120, 59135, 59133, 59121, 59098, 59064, 59045, 59087, 59105, 59129, 59129, 59110, 59135, 59135, 59131, 59129, 59131, 59090, 59027, 59123, 58969, 58949, 58951, 58968, 58974, 58942, 58937, 58944, 58951, 58969, 58937, 58938, 58947, 58945, 58947, 58951, 58948, 58958, 58947, 58949, 58970, 58951, 58947, 58948, 58940, 58943, 58945, 58951, 58975, 58971, 58951, 58971, 58966, 59047, 59121, 59133, 59135, 59120, 59126, 59094, 59095, 59075, 59074, 59121, 59133, 59122, 59135, 59110, 59109, 59086, 59041, 59103, 59129, 59075};
    }

    public sw(@NotNull Context context, @NotNull String str, @NotNull nn nnVar, @NotNull nr nrVar, @NotNull sd sdVar) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(nnVar, "");
        Intrinsics.checkNotNullParameter(nrVar, "");
        Intrinsics.checkNotNullParameter(sdVar, "");
        this.f60946a = context;
        this.f60947b = str;
        this.f60948c = nnVar;
        this.f60949d = nrVar;
        this.f60950e = sdVar;
        nz nzVar = nz.INSTANCE;
        this.f60951f = new AtomicBoolean(false);
        this.f60952g = (td) te.setOnFocusChangeListener(new Object[]{new te(), str, nx.INSTANCE, nzVar, nrVar, nnVar, new mz()}, 489182964, -489182963, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:37:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:38:0x01ac  */
    public static void a(int i10, int i11, int i12, String str, boolean z10, Object[] objArr) throws Throwable {
        Throwable cause;
        int i13 = f60944l + 3;
        m = i13 % 128;
        int i14 = 2;
        if (i13 % 2 == 0) {
            str.toCharArray();
            throw null;
        }
        char[] charArray = str.toCharArray();
        getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
        char[] cArr = new char[i10];
        getnavbartitlestring.setY = 0;
        while (true) {
            int i15 = getnavbartitlestring.setY;
            if (i15 >= i10) {
                break;
            }
            int i16 = m + 49;
            f60944l = i16 % 128;
            int i17 = i16 % i14;
            char c10 = charArray[i15];
            getnavbartitlestring.setCompoundDrawableTintBlendMode = c10;
            char c11 = (char) (i11 + c10);
            cArr[i15] = c11;
            try {
                Object[] objArr2 = new Object[i14];
                objArr2[1] = Integer.valueOf(f60940h);
                objArr2[0] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(133002375);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) ((Process.getThreadPriority(0) + 20) >> 6), 41 - View.combineMeasuredStates(0, 0), TextUtils.getTrimmedLength("") + 483);
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 + 1);
                    Object[] objArr3 = new Object[1];
                    c(b10, b11, (byte) (b11 - 1), objArr3);
                    String str2 = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(133002375, method);
                }
                cArr[i15] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {getnavbartitlestring, getnavbartitlestring};
                Object method2 = map.get(1860518195);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (55967 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + 44, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2268);
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    c(b12, b13, b13, objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(1860518195, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i14 = 2;
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
            getnavbartitlestring.setOnFocusChangeListener = i12;
            char[] cArr2 = new char[i10];
            System.arraycopy(cArr, 0, cArr2, 0, i10);
            int i18 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, 0, cArr, i10 - i18, i18);
            int i19 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, i19, cArr, 0, i10 - i19);
        }
        if (z10) {
            int i20 = m + 77;
            f60944l = i20 % 128;
            int i21 = i20 % 2;
            char[] cArr3 = new char[i10];
            getnavbartitlestring.setY = 0;
            while (true) {
                int i22 = getnavbartitlestring.setY;
                if (i22 >= i10) {
                    break;
                }
                cArr3[i22] = cArr[(i10 - i22) - 1];
                Object[] objArr6 = {getnavbartitlestring, getnavbartitlestring};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(1860518195);
                if (method3 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getTouchSlop() >> 8) + 55966), TextUtils.indexOf((CharSequence) "", '0') + 44, 2268 - (ViewConfiguration.getTapTimeout() >> 16));
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr7 = new Object[1];
                    c(b14, b15, b15, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(1860518195, method3);
                }
                ((Method) method3).invoke(null, objArr6);
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    public static void b(String str, boolean z10, int[] iArr, Object[] objArr) throws Throwable {
        int i10;
        char[] cArr;
        int i11 = f60944l + 63;
        m = i11 % 128;
        int i12 = i11 % 2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener();
        char c10 = 0;
        int i13 = iArr[0];
        int i14 = 1;
        int i15 = iArr[1];
        int i16 = iArr[2];
        int i17 = iArr[3];
        char[] cArr2 = f60941i;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i18 = 0;
            while (i18 < length) {
                try {
                    Object[] objArr2 = new Object[i14];
                    objArr2[c10] = Integer.valueOf(cArr2[i18]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-637734149);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (Process.myTid() >> 22), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 37, 609 - (Process.myPid() >> 22));
                        byte b10 = (byte) 0;
                        Object[] objArr3 = new Object[1];
                        c(b10, (byte) (b10 | 33), b10, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(-637734149, method);
                    }
                    cArr3[i18] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i18++;
                    cArr2 = cArr2;
                    length = length;
                    c10 = 0;
                    i14 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i15];
        char c11 = 0;
        System.arraycopy(cArr2, i13, cArr4, 0, i15);
        if (bytes != null) {
            int i19 = m + 43;
            f60944l = i19 % 128;
            if (i19 % 2 != 0) {
                cArr = new char[i15];
                setnavigationonclicklistener.setX = 0;
            } else {
                cArr = new char[i15];
                setnavigationonclicklistener.setX = 0;
                c11 = 0;
            }
            while (true) {
                int i20 = setnavigationonclicklistener.setX;
                if (i20 >= i15) {
                    cArr4 = cArr;
                    break;
                }
                int i21 = f60944l;
                int i22 = i21 + 33;
                m = i22 % 128;
                int i23 = i22 % 2;
                if (bytes[i20] == 1) {
                    int i24 = i21 + 121;
                    m = i24 % 128;
                    if (i24 % 2 == 0) {
                        Object[] objArr4 = {Integer.valueOf(cArr4[i20]), Integer.valueOf(c11)};
                        Map map2 = setTextScaleX.setMaxEms;
                        Object method2 = map2.get(1737824323);
                        if (method2 == null) {
                            Class cls2 = (Class) setTextScaleX.setX((char) (4449 - View.MeasureSpec.getMode(0)), 43 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + PointerIconCompat.TYPE_GRABBING);
                            byte b11 = (byte) 0;
                            Object[] objArr5 = new Object[1];
                            c(b11, (byte) (b11 | DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE), b11, objArr5);
                            String str2 = (String) objArr5[0];
                            Class<?> cls3 = Integer.TYPE;
                            method2 = cls2.getMethod(str2, cls3, cls3);
                            map2.put(1737824323, method2);
                        }
                        cArr[i20] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                        throw null;
                    }
                    Object[] objArr6 = {Integer.valueOf(cArr4[i20]), Integer.valueOf(c11)};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(1737824323);
                    if (method3 == null) {
                        Class cls4 = (Class) setTextScaleX.setX((char) (4448 - Process.getGidForName("")), 42 - View.MeasureSpec.makeMeasureSpec(0, 0), 1021 - TextUtils.indexOf("", "", 0, 0));
                        byte b12 = (byte) 0;
                        Object[] objArr7 = new Object[1];
                        c(b12, (byte) (b12 | DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE), b12, objArr7);
                        String str3 = (String) objArr7[0];
                        Class<?> cls5 = Integer.TYPE;
                        method3 = cls4.getMethod(str3, cls5, cls5);
                        map3.put(1737824323, method3);
                    }
                    cArr[i20] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                } else {
                    bytes = bytes;
                    Object[] objArr8 = {Integer.valueOf(cArr4[i20]), Integer.valueOf(c11)};
                    Map map4 = setTextScaleX.setMaxEms;
                    Object method4 = map4.get(-504758789);
                    if (method4 == null) {
                        Class cls6 = (Class) setTextScaleX.setX((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 45 - Gravity.getAbsoluteGravity(0, 0), 2627 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                        byte b13 = (byte) 0;
                        Object[] objArr9 = new Object[1];
                        c(b13, (byte) (b13 | 32), b13, objArr9);
                        String str4 = (String) objArr9[0];
                        Class<?> cls7 = Integer.TYPE;
                        method4 = cls6.getMethod(str4, cls7, cls7);
                        map4.put(-504758789, method4);
                    }
                    cArr[i20] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                }
                c11 = cArr[setnavigationonclicklistener.setX];
                Object[] objArr10 = {setnavigationonclicklistener, setnavigationonclicklistener};
                Map map5 = setTextScaleX.setMaxEms;
                Object method5 = map5.get(-265085633);
                if (method5 == null) {
                    Class cls8 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31347), TextUtils.indexOf("", "", 0) + 48, (ViewConfiguration.getPressedStateDuration() >> 16) + 840);
                    byte b14 = (byte) 0;
                    Object[] objArr11 = new Object[1];
                    c(b14, (byte) (b14 | 35), b14, objArr11);
                    method5 = cls8.getMethod((String) objArr11[0], Object.class, Object.class);
                    map5.put(-265085633, method5);
                }
                ((Method) method5).invoke(null, objArr10);
                bytes = bytes;
            }
        }
        if (i17 > 0) {
            char[] cArr5 = new char[i15];
            i10 = 0;
            System.arraycopy(cArr4, 0, cArr5, 0, i15);
            int i25 = i15 - i17;
            System.arraycopy(cArr5, 0, cArr4, i25, i17);
            System.arraycopy(cArr5, i17, cArr4, 0, i25);
        } else {
            i10 = 0;
        }
        if (z10) {
            char[] cArr6 = new char[i15];
            setnavigationonclicklistener.setX = i10;
            while (true) {
                int i26 = setnavigationonclicklistener.setX;
                if (i26 >= i15) {
                    break;
                }
                cArr6[i26] = cArr4[(i15 - i26) - 1];
                setnavigationonclicklistener.setX = i26 + 1;
                int i27 = m + 103;
                f60944l = i27 % 128;
                int i28 = i27 % 2;
            }
            cArr4 = cArr6;
        }
        if (i16 > 0) {
            int i29 = m + 109;
            f60944l = i29 % 128;
            int i30 = i29 % 2;
            int i31 = 0;
            while (true) {
                setnavigationonclicklistener.setX = i31;
                int i32 = setnavigationonclicklistener.setX;
                if (i32 >= i15) {
                    break;
                }
                int i33 = f60944l + 117;
                m = i33 % 128;
                if (i33 % 2 == 0) {
                    cArr4[i32] = (char) (cArr4[i32] << iArr[3]);
                    i31 = i32 >>> 1;
                } else {
                    cArr4[i32] = (char) (cArr4[i32] - iArr[2]);
                    i31 = i32 + 1;
                }
            }
        }
        objArr[0] = new String(cArr4);
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
    public static void c(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = 3 - r8
            int r6 = r6 * 3
            int r0 = 1 - r6
            int r7 = r7 + 65
            byte[] r0 = new byte[r0]
            r1 = 0
            int r6 = 0 - r6
            byte[] r2 = com.mypinpad.tsdk.isolation.sw.f60945n
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
            byte r4 = (byte) r7
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r2[r8]
            r5 = r9
            r9 = r8
            r8 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r5
        L34:
            int r7 = r7 + r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.sw.c(int, int, int, java.lang.Object[]):void");
    }

    public static void d() {
        f60945n = new byte[]{122, -107, 66, -93};
    }

    public static /* synthetic */ Pair e(sw swVar, rk rkVar) {
        int i10 = f60943k + 37;
        f60942j = i10 % 128;
        int i11 = i10 % 2;
        Pair<tn, rh> pairF = swVar.f(rkVar, null);
        int i12 = f60943k + 75;
        f60942j = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 71 / 0;
        }
        return pairF;
    }

    public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        Pair<tn, rh> pairE;
        int i13;
        sw swVar = (sw) objArr[0];
        UUID uuid = (UUID) objArr[1];
        byte[] bArr = (byte[]) objArr[2];
        Function0<Unit> function0 = (Function0) objArr[3];
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(function0, "");
        mu.setCompoundDrawableTintBlendMode(new Object[]{200006, null, null, 6}, -1968587119, 1968587120, 200006);
        mr mrVar = mr.setX;
        Object[] objArr2 = new Object[1];
        a(17 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), Process.getGidForName("") + Opcodes.IFNULL, 3 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\b\u0007\ufffa￼\r\u0002\u000f\ufffa\r\ufffeﾹ\f\ufffe\f\f\u0002", false, objArr2);
        mt.setX(new Object[]{mrVar, ((String) objArr2[0]).intern()}, 135701020, -135701017, (int) System.currentTimeMillis());
        mu.setCompoundDrawableTintBlendMode(new Object[]{120000, null, null, 6}, -1968587119, 1968587120, 120000);
        Object[] objArr3 = new Object[1];
        a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 15, 197 - KeyEvent.normalizeMetaState(0), Color.rgb(0, 0, 0) + 16777218, "\b\u0007\ufffa￼\r\u0002\u000f\ufffa\r\ufffeﾹ\f\ufffe\f\f\u0002", false, objArr3);
        pc.setY(new os(((String) objArr3[0]).intern()));
        AtomicBoolean atomicBoolean = swVar.f60951f;
        Context context = swVar.f60946a;
        if (atomicBoolean.get()) {
            TerminalException terminalException = new TerminalException(19, null, null);
            mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
            throw terminalException;
        }
        mk mkVar = mk.setOnFocusChangeListener;
        hashCode onFocusChangeListener = mk.setOnFocusChangeListener(mkVar);
        if (onFocusChangeListener instanceof hashCode.setX) {
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr4 = new Object[1];
            a(19 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), View.MeasureSpec.getMode(0) + 183, KeyEvent.normalizeMetaState(0) + 17, "\u0016\n\b\u0013ￇ\b\u001b\u001bￇ\r\b\u0010\u0013\f\u000b￡ￇ\u0013", false, objArr4);
            sb2.append(((String) objArr4[0]).intern());
            hashCode.setX setx = (hashCode.setX) onFocusChangeListener;
            sb2.append((String) hashCode.setX.setX(new Object[]{setx}, 1995127706, -1995127705, System.identityHashCode(setx)));
            mt.setX(new Object[]{mrVar, sb2.toString()}, -855939515, 855939522, (int) System.currentTimeMillis());
            rk rkVar = (rk) mi.setX(new Object[]{setx}, 1277052993, -1277052987, (int) System.currentTimeMillis());
            String str = (String) hashCode.setX.setX(new Object[]{setx}, 1995127706, -1995127705, System.identityHashCode(setx));
            Intrinsics.checkNotNullParameter(str, "");
            pairE = swVar.f(rkVar, new a(str));
            int i14 = f60943k + 83;
            f60942j = i14 % 128;
            if (i14 % 2 == 0) {
                return pairE;
            }
            i13 = 13;
        } else {
            String dividerPadding = swVar.setDividerPadding();
            if (dividerPadding != null) {
                ss ssVar = ss.setCompoundDrawableTintBlendMode;
                ss.setX(new Object[]{dividerPadding, Boolean.FALSE, 2}, -299762084, 299762084, 2);
                String x4 = nf.setCompoundDrawableTintBlendMode().setX();
                if (x4 == null) {
                    int i15 = f60942j + 37;
                    f60943k = i15 % 128;
                    int i16 = i15 % 2;
                    Object[] objArr5 = new Object[1];
                    b("\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001", true, new int[]{0, 40, 0, 0}, objArr5);
                    mt.setX(new Object[]{((String) objArr5[0]).intern()}, 1760239564, -1760239563, (int) System.currentTimeMillis());
                    return e(swVar, rk.setY);
                }
                pd pdVar = pd.INSTANCE;
                String str2 = swVar.f60947b;
                pd.setOnFocusChangeListener(new Object[]{str2, dividerPadding}, 475568212, -475568207, (int) System.currentTimeMillis());
                String string = uuid.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                mkVar.setDividerPadding(new qp(dividerPadding, string, x4, str2));
                tu.Companion companion = tu.INSTANCE;
                sd sdVar = swVar.f60950e;
                int iIntValue = ((Integer) sd.setDividerPadding(new Object[]{sdVar}, -673618786, 673618791, System.identityHashCode(sdVar))).intValue();
                int iIntValue2 = ((Integer) tu.Companion.setX(new Object[]{Integer.valueOf(iIntValue)}, -2028730183, 2028730183, iIntValue)).intValue() + 5000;
                hashCode hashcode = (hashCode) mk.setDividerPadding(new Object[]{mkVar, dividerPadding, Integer.valueOf(iIntValue2)}, -538518537, 538518539, iIntValue2);
                if (hashcode instanceof hashCode.setX) {
                    StringBuilder sb3 = new StringBuilder();
                    Object[] objArr6 = new Object[1];
                    b("\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000", false, new int[]{40, 20, 0, 8}, objArr6);
                    sb3.append(((String) objArr6[0]).intern());
                    sb3.append(hashcode);
                    mt.setX(new Object[]{sb3.toString()}, 1760239564, -1760239563, (int) System.currentTimeMillis());
                    return e(swVar, rk.setY);
                }
                Object[] objArr7 = new Object[1];
                a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 27, 194 - (ViewConfiguration.getFadingEdgeLength() >> 16), 15 - KeyEvent.getDeadChar(0, 0), "\u0003\u0005\u0002\n\u000b\uffffﾼ\u0001\u0010�\u0000\u0005\b�\u0012\u0004\u000f�\u0004ﾼ\n\u000b\u0005\u0010�\u000e\u0011", true, objArr7);
                mt.setX(new Object[]{mrVar, ((String) objArr7[0]).intern()}, 135701020, -135701017, (int) System.currentTimeMillis());
                String str3 = new String(bArr, Charsets.UTF_8);
                Object[] objArr8 = new Object[1];
                b("\u0001", true, new int[]{60, 1, 0, 0}, objArr8);
                String string2 = StringsKt__StringsKt.trim((CharSequence) l.replace$default(str3, ((String) objArr8[0]).intern(), "", false, 4, (Object) null)).toString();
                Object[] objArr9 = new Object[1];
                a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 104 - KeyEvent.getDeadChar(0, 0), 1 - (ViewConfiguration.getEdgeSlop() >> 16), "\u0000", false, objArr9);
                String string3 = StringsKt__StringsKt.trim((CharSequence) StringsKt__StringsKt.substringBefore$default(string2, ((String) objArr9[0]).intern(), (String) null, 2, (Object) null)).toString();
                Object[] objArr10 = new Object[1];
                a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 103, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1, "\u0000", false, objArr10);
                String string4 = StringsKt__StringsKt.trim((CharSequence) StringsKt__StringsKt.substringAfter$default(string2, ((String) objArr10[0]).intern(), (String) null, 2, (Object) null)).toString();
                if (!(!((Boolean) ss.setX(new Object[]{string4, string3}, -353568390, 353568398, (int) System.currentTimeMillis())).booleanValue())) {
                    try {
                        ob.P_(context);
                        return swVar.f60952g.setDividerPadding(new op(uuid), dividerPadding, string4, (tw) tz.setX(new Object[]{sdVar}, -2006376377, 2006376377, (int) System.currentTimeMillis()), new oi(context, sdVar), function0, new tu(sdVar.setCompoundDrawableTintBlendMode()));
                    } catch (Exception e5) {
                        return swVar.f(rk.setOnFocusChangeListener, e5);
                    }
                }
                int i17 = f60943k + 69;
                f60942j = i17 % 128;
                int i18 = i17 % 2;
                Object[] objArr11 = new Object[1];
                b("\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001", true, new int[]{61, 34, 104, 0}, objArr11);
                mt.setX(new Object[]{((String) objArr11[0]).intern()}, 1760239564, -1760239563, (int) System.currentTimeMillis());
                return e(swVar, rk.setCompoundDrawableTintBlendMode);
            }
            int i19 = f60943k + 7;
            f60942j = i19 % 128;
            int i20 = i19 % 2;
            Object[] objArr12 = new Object[1];
            a((ViewConfiguration.getWindowTouchSlop() >> 8) + 40, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 190, Color.rgb(0, 0, 0) + 16777250, "\u0001\u0014\t\u000f\u000e\uffc0\u0006\u0001\t\f\u0005\u0004\uffc0\u0001\u0013\uffc0\t\u000e\u0013\u0014\u0001\u000e\u0003\u0005￩\u0004\uffc0\t\u0013\uffc0\u000e\u0015\f\f￡\u0014\u0014\u0005\u0013\u0014", false, objArr12);
            mt.setX(new Object[]{((String) objArr12[0]).intern()}, 1760239564, -1760239563, (int) System.currentTimeMillis());
            pairE = e(swVar, rk.setY);
            int i21 = f60942j + 33;
            f60943k = i21 % 128;
            if (i21 % 2 != 0) {
                return pairE;
            }
            i13 = 9;
        }
        int i22 = i13 / 0;
        return pairE;
    }

    public final Pair<tn, rh> f(rk rkVar, Exception exc) {
        if (this.f60949d.setOnFocusChangeListener()) {
            return new Pair<>(null, new to(rkVar, exc != null ? rx.setOnFocusChangeListener(exc) : null));
        }
        return new Pair<>(null, new to(rk.setDividerPadding, exc != null ? rx.setOnFocusChangeListener(exc) : null));
    }

    @Nullable
    public final byte[] setCompoundDrawableTintBlendMode() throws Throwable {
        int i10 = f60943k + 5;
        f60942j = i10 % 128;
        int i11 = i10 % 2;
        AtomicBoolean atomicBoolean = this.f60951f;
        byte[] compoundDrawableTintBlendMode = null;
        if (i11 != 0) {
            atomicBoolean.get();
            throw null;
        }
        if (atomicBoolean.get()) {
            TerminalException terminalException = new TerminalException(19, null, null);
            mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
            throw terminalException;
        }
        try {
            compoundDrawableTintBlendMode = nf.setCompoundDrawableTintBlendMode().setCompoundDrawableTintBlendMode();
            int i12 = f60942j + 99;
            f60943k = i12 % 128;
            int i13 = i12 % 2;
        } catch (Exception e5) {
            mu.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(DeleteDeviceIntentService.JOB_ID), null, e5, 2}, -1968587119, 1968587120, DeleteDeviceIntentService.JOB_ID);
            mr mrVar = mr.setOnFocusChangeListener;
            Object[] objArr = new Object[1];
            a(32 - View.resolveSize(0, 0), 191 - View.resolveSizeAndState(0, 0, 0), 9 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\u0004\u0018\uffbf\u0005\u0000\b\u000b\u0004\u0003￦\u0004\u0013\uffbf￨\r\u0012\u0013\u0000\u000b\u000b\u0000\u0013\b\u000e\r\uffef\u0014\u0001\u000b\b\u0002￪", false, objArr);
            mt.setX(new Object[]{((String) objArr[0]).intern()}, 1760239564, -1760239563, (int) System.currentTimeMillis());
        }
        return compoundDrawableTintBlendMode;
    }

    @Nullable
    public final String setDividerPadding() throws Throwable {
        int i10 = f60943k + 71;
        f60942j = i10 % 128;
        int i11 = i10 % 2;
        AtomicBoolean atomicBoolean = this.f60951f;
        String str = null;
        if (i11 != 0) {
            atomicBoolean.get();
            throw null;
        }
        if (atomicBoolean.get()) {
            TerminalException terminalException = new TerminalException(19, null, null);
            mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
            throw terminalException;
        }
        try {
            ss ssVar = ss.setCompoundDrawableTintBlendMode;
            str = (String) ss.setX(new Object[0], -299774389, 299774392, (int) System.currentTimeMillis());
        } catch (Exception e5) {
            mu.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(InitIntentService.JOB_ID), null, e5, 2}, -1968587119, 1968587120, InitIntentService.JOB_ID);
            mr mrVar = mr.setOnFocusChangeListener;
            Object[] objArr = new Object[1];
            b("\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000", true, new int[]{95, 21, 0, 0}, objArr);
            mt.setX(new Object[]{((String) objArr[0]).intern()}, 1760239564, -1760239563, (int) System.currentTimeMillis());
        }
        int i12 = f60943k + 113;
        f60942j = i12 % 128;
        int i13 = i12 % 2;
        return str;
    }

    public final void setX(float f6) {
        int i10 = f60943k + 39;
        f60942j = i10 % 128;
        int i11 = i10 % 2;
        AtomicBoolean atomicBoolean = this.f60951f;
        if (i11 != 0) {
            atomicBoolean.get();
            throw null;
        }
        if (atomicBoolean.get()) {
            TerminalException terminalException = new TerminalException(19, null, null);
            mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
            throw terminalException;
        }
        this.f60948c.setY(f6);
        int i12 = f60943k + 17;
        f60942j = i12 % 128;
        int i13 = i12 % 2;
    }

    @NotNull
    public final Pair<tn, rh> setX(@NotNull UUID uuid, @NotNull byte[] bArr, @NotNull Function0<Unit> function0) {
        return (Pair) setOnFocusChangeListener(new Object[]{this, uuid, bArr, function0}, 2102126837, -2102126837, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0058  */
    public final void setOnFocusChangeListener() {
        int i10 = f60943k + 115;
        f60942j = i10 % 128;
        int i11 = i10 % 2;
        AtomicBoolean atomicBoolean = this.f60951f;
        if (i11 != 0) {
            mu.setCompoundDrawableTintBlendMode(new Object[]{200007, null, null, 39}, -1968587119, 1968587120, 200007);
            if (!atomicBoolean.getAndSet(false)) {
                Object[] objArr = new Object[1];
                a(16 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + Opcodes.MULTIANEWARRAY, View.MeasureSpec.getSize(0) + 10, "\ufffe\rﾹ\ufffe\f\b\t\f\u0002�\u0005\ufffa\u0007\u0002\u0006\u000b", true, objArr);
                pc.setY(new po(((String) objArr[0]).intern()));
                this.f60952g.setX();
                pd pdVar = pd.INSTANCE;
                pd.setOnFocusChangeListener(new Object[0], 1017746671, -1017746671, (int) System.currentTimeMillis());
                nf.setCompoundDrawableTintBlendMode().setDividerPadding();
                nf.setOnFocusChangeListener().setY();
                int i12 = f60943k + 61;
                f60942j = i12 % 128;
                int i13 = i12 % 2;
            }
        } else {
            mu.setCompoundDrawableTintBlendMode(new Object[]{200007, null, null, 6}, -1968587119, 1968587120, 200007);
            if (!atomicBoolean.getAndSet(true)) {
                Object[] objArr2 = new Object[1];
                a(16 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + Opcodes.MULTIANEWARRAY, View.MeasureSpec.getSize(0) + 10, "\ufffe\rﾹ\ufffe\f\b\t\f\u0002�\u0005\ufffa\u0007\u0002\u0006\u000b", true, objArr2);
                pc.setY(new po(((String) objArr2[0]).intern()));
                this.f60952g.setX();
                pd pdVar2 = pd.INSTANCE;
                pd.setOnFocusChangeListener(new Object[0], 1017746671, -1017746671, (int) System.currentTimeMillis());
                nf.setCompoundDrawableTintBlendMode().setDividerPadding();
                nf.setOnFocusChangeListener().setY();
                int i14 = f60943k + 61;
                f60942j = i14 % 128;
                int i15 = i14 % 2;
            }
        }
        tb.INSTANCE.setCompoundDrawableTintBlendMode();
        int i16 = f60943k + 33;
        f60942j = i16 % 128;
        if (i16 % 2 != 0) {
            throw null;
        }
    }
}
