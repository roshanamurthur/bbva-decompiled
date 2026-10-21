package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B'\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH\u0017¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/mypinpad/tsdk/i/qp;", "Lcom/mypinpad/tsdk/i/setChildIndicatorBounds;", "", "p0", "p1", "setDividerPadding", "([B[B)[B", "", "", "setX", "(Ljava/lang/String;J)Ljava/lang/String;", "Lcom/mypinpad/tsdk/i/setMaxHeight;", "setOnFocusChangeListener", "()Lcom/mypinpad/tsdk/i/setMaxHeight;", "Lcom/mypinpad/tsdk/i/applicationCreated;", "", "Lcom/mypinpad/tsdk/i/setSubtitleTextAppearance;", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/applicationCreated;Ljava/util/List;)Lcom/mypinpad/tsdk/i/setMaxHeight;", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTerminalAttestationService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalAttestationService.kt\ncom/mypinpad/tsdk/internal/remote/attestation/TerminalAttestationService\n+ 2 HttpNetworkResponse.kt\ncom/mypinpad/tsdk/internal/remote/HttpNetworkResponseKt\n+ 3 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n*L\n1#1,162:1\n50#2,4:163\n54#2:175\n7#3,8:167\n*S KotlinDebug\n*F\n+ 1 TerminalAttestationService.kt\ncom/mypinpad/tsdk/internal/remote/attestation/TerminalAttestationService\n*L\n81#1:163,4\n81#1:175\n81#1:167,8\n*E\n"})
public final class qp implements setChildIndicatorBounds {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f57957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static long f57958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f57959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static char f57960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f57961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f57962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f57963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f57964l;
    public static final byte[] m = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f57965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f57966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f57967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f57968d;

    static {
        d();
        f57963k = 0;
        f57964l = 1;
        f57961i = 0;
        f57962j = 1;
        g();
        ViewConfiguration.getMinimumFlingVelocity();
        Drawable.resolveOpacity(0, 0);
        Process.getGidForName("");
        KeyEvent.getMaxKeyCode();
        Color.green(0);
        TextUtils.lastIndexOf("", '0');
        ViewConfiguration.getJumpTapTimeout();
        View.resolveSizeAndState(0, 0, 0);
        INSTANCE = new Companion(null);
        int i10 = f57961i + 79;
        f57962j = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public qp(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.f57965a = str;
        this.f57966b = str2;
        this.f57967c = str3;
        this.f57968d = str4;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x01ba  */
    public static void a(int i10, int i11, int i12, String str, boolean z10, Object[] objArr) throws Throwable {
        Throwable cause;
        int i13 = f57963k + 77;
        f57964l = i13 % 128;
        int i14 = 2;
        if (i13 % 2 == 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
        char[] cArr = new char[i10];
        getnavbartitlestring.setY = 0;
        int i15 = f57963k + 79;
        f57964l = i15 % 128;
        int i16 = i15 % 2;
        while (true) {
            int i17 = getnavbartitlestring.setY;
            if (i17 >= i10) {
                break;
            }
            int i18 = f57964l + 107;
            f57963k = i18 % 128;
            int i19 = i18 % i14;
            char c10 = charArray[i17];
            getnavbartitlestring.setCompoundDrawableTintBlendMode = c10;
            char c11 = (char) (i11 + c10);
            cArr[i17] = c11;
            try {
                Object[] objArr2 = new Object[i14];
                objArr2[1] = Integer.valueOf(f57957e);
                objArr2[0] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(133002375);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 42 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 483 - TextUtils.indexOf("", "", 0));
                    byte b10 = (byte) 0;
                    Object[] objArr3 = new Object[1];
                    c(b10, (byte) (b10 | 53), b10, objArr3);
                    String str2 = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(133002375, method);
                }
                cArr[i17] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {getnavbartitlestring, getnavbartitlestring};
                Object method2 = map.get(1860518195);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (View.resolveSizeAndState(0, 0, 0) + 55966), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 42, 2269 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    byte b11 = (byte) 0;
                    Object[] objArr5 = new Object[1];
                    c(b11, (byte) (b11 | 54), b11, objArr5);
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
            int i20 = f57964l + 73;
            f57963k = i20 % 128;
            int i21 = i20 % 2;
            getnavbartitlestring.setOnFocusChangeListener = i12;
            char[] cArr2 = new char[i10];
            System.arraycopy(cArr, 0, cArr2, 0, i10);
            int i22 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, 0, cArr, i10 - i22, i22);
            int i23 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, i23, cArr, 0, i10 - i23);
        }
        if (z10) {
            char[] cArr3 = new char[i10];
            getnavbartitlestring.setY = 0;
            while (true) {
                int i24 = getnavbartitlestring.setY;
                if (i24 >= i10) {
                    break;
                }
                cArr3[i24] = cArr[(i10 - i24) - 1];
                Object[] objArr6 = {getnavbartitlestring, getnavbartitlestring};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(1860518195);
                if (method3 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 55966), 43 - ExpandableListView.getPackedPositionType(0L), View.MeasureSpec.getSize(0) + 2268);
                    byte b12 = (byte) 0;
                    Object[] objArr7 = new Object[1];
                    c(b12, (byte) (b12 | 54), b12, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(1860518195, method3);
                }
                ((Method) method3).invoke(null, objArr6);
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    public static void b(char c10, String str, int i10, String str2, Object[] objArr) throws Throwable {
        char c11;
        int i11 = f57964l + 17;
        f57963k = i11 % 128;
        int i12 = i11 % 2;
        char[] charArray = str2.toCharArray();
        int i13 = f57963k + 59;
        f57964l = i13 % 128;
        int i14 = i13 % 2;
        char[] charArray2 = "宅퍕\uf8a4縥".toCharArray();
        int i15 = f57963k + 41;
        f57964l = i15 % 128;
        int i16 = i15 % 2;
        char[] charArray3 = str.toCharArray();
        int i17 = f57964l + 33;
        f57963k = i17 % 128;
        int i18 = i17 % 2;
        UiMessageCallbackKtWhenMappings uiMessageCallbackKtWhenMappings = new UiMessageCallbackKtWhenMappings();
        int length = charArray3.length;
        char[] cArr = new char[length];
        int length2 = charArray2.length;
        char[] cArr2 = new char[length2];
        int i19 = 0;
        System.arraycopy(charArray3, 0, cArr, 0, length);
        System.arraycopy(charArray2, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c10);
        cArr2[2] = (char) (cArr2[2] + ((char) i10));
        int length3 = charArray.length;
        char[] cArr3 = new char[length3];
        uiMessageCallbackKtWhenMappings.setX = 0;
        while (uiMessageCallbackKtWhenMappings.setX < length3) {
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i19] = uiMessageCallbackKtWhenMappings;
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(20564334);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (TextUtils.lastIndexOf("", '0', i19, i19) + 50679), TextUtils.lastIndexOf("", '0', i19, i19) + 40, 1737 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    byte b10 = (byte) i19;
                    Object[] objArr3 = new Object[1];
                    c(b10, (byte) (b10 | 6), b10, objArr3);
                    String str3 = (String) objArr3[i19];
                    Class<?>[] clsArr = new Class[1];
                    clsArr[i19] = Object.class;
                    method = cls.getMethod(str3, clsArr);
                    map.put(20564334, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = new Object[1];
                objArr4[i19] = uiMessageCallbackKtWhenMappings;
                Object method2 = map.get(-68974155);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (8125 - Color.blue(i19)), Color.blue(i19) + 37, ExpandableListView.getPackedPositionType(0L) + 646);
                    byte b11 = (byte) i19;
                    byte b12 = (byte) (b11 + 3);
                    Object[] objArr5 = new Object[1];
                    c(b11, b12, (byte) (b12 - 3), objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class);
                    map.put(-68974155, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                Object[] objArr6 = {uiMessageCallbackKtWhenMappings, Integer.valueOf(cArr[uiMessageCallbackKtWhenMappings.setX % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method3 = map.get(-1108711559);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.getDefaultSize(0, 0) + 49, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 434);
                    byte b13 = (byte) 0;
                    byte b14 = (byte) (b13 + 5);
                    Object[] objArr7 = new Object[1];
                    c(b13, b14, (byte) (b14 - 5), objArr7);
                    String str4 = (String) objArr7[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str4, Object.class, cls4, cls4);
                    map.put(-1108711559, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                Object[] objArr8 = {Integer.valueOf(cArr[iIntValue2] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method4 = map.get(533021397);
                if (method4 != null) {
                    c11 = 2;
                } else {
                    Class cls5 = (Class) setTextScaleX.setX((char) (TextUtils.getOffsetAfter("", 0) + 4449), 42 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 1022);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr9 = new Object[1];
                    c(b15, b16, b16, objArr9);
                    String str5 = (String) objArr9[0];
                    c11 = 2;
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str5, cls6, cls6);
                    map.put(533021397, method4);
                }
                cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                char c12 = uiMessageCallbackKtWhenMappings.setDividerPadding;
                cArr[iIntValue2] = c12;
                int i20 = uiMessageCallbackKtWhenMappings.setX;
                cArr3[i20] = (char) (((((long) (c12 ^ charArray[i20])) ^ (f57958f ^ (-2443367703579691432L))) ^ ((long) ((int) (((long) f57959g) ^ (-2443367703579691432L))))) ^ ((long) ((char) (((long) f57960h) ^ (-2443367703579691432L)))));
                uiMessageCallbackKtWhenMappings.setX = i20 + 1;
                length3 = length3;
                cArr3 = cArr3;
                i19 = 0;
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

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002f -> B:11:0x0039). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r0 = 1 - r8
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r7 = 119 - r7
            byte[] r0 = new byte[r0]
            r1 = 0
            int r8 = 0 - r8
            byte[] r2 = com.mypinpad.tsdk.isolation.qp.m
            r3 = -1
            if (r2 != 0) goto L1b
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r6
            goto L39
        L1b:
            r5 = r7
            r7 = r6
            r6 = r5
        L1e:
            int r3 = r3 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L2f
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2f:
            r4 = r2[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r5
        L39:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.qp.c(int, int, short, java.lang.Object[]):void");
    }

    public static void d() {
        m = new byte[]{45, -95, 79, -40};
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0060, code lost:
    
        if ((r0 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        r0 = r17.setOnFocusChangeListener();
        r2 = 84 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        r0 = r17.setOnFocusChangeListener();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        r0 = f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        r2 = com.mypinpad.tsdk.isolation.qp.f57961i + 43;
        com.mypinpad.tsdk.isolation.qp.f57962j = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        r0 = new java.lang.StringBuilder("10059,");
        r0.append(r17.setX());
        com.mypinpad.tsdk.isolation.mu.setCompoundDrawableTintBlendMode(new java.lang.Object[]{180003, com.mypinpad.tsdk.isolation.getDisplayExponent.setY(r0.toString()), null, 4}, -1968587119, 1968587120, 180003);
        r1 = new com.mypinpad.tsdk.api.errors.TerminalException(10059, r17.setX(), null);
        com.mypinpad.tsdk.isolation.mt.setX(new java.lang.Object[]{r1}, 1181816825, -1181816816, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cd, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ce, code lost:
    
        com.mypinpad.tsdk.isolation.pc.setY(new com.mypinpad.tsdk.isolation.ou(null, java.lang.Integer.valueOf(r17.setY()), 10059, com.mypinpad.tsdk.isolation.getDisplayExponent.setCompoundDrawableTintBlendMode(r17, com.mypinpad.tsdk.isolation.mw.setDividerPadding(r0)), 1, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ec, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ed, code lost:
    
        r0 = r17.setOnFocusChangeListener();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f1, code lost:
    
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f3, code lost:
    
        r2 = com.mypinpad.tsdk.isolation.qp.f57961i + 81;
        com.mypinpad.tsdk.isolation.qp.f57962j = r2 % 128;
        r2 = r2 % 2;
        r2 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getTapTimeout() >> 16) + 12, android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 222, 7 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), "\uffff\u0001\ufffb\r\r\uffff\u0007\r\uffff\ufffe\t\uffdd", true, r2);
        r0 = (java.util.List) com.mypinpad.tsdk.isolation.mp.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r0, ((java.lang.String) r2[0]).intern()}, -323148915, 323148916, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x013e, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x013f, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.mr.setOnFocusChangeListener;
        r1 = new java.lang.StringBuilder();
        r4 = new java.lang.Object[1];
        b((char) (3538 - android.view.View.MeasureSpec.getSize(0)), "페胘퉮欍", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) - 1, "\ua6faၾ\ue56c\u177e၅\ufdcd膾\ue77b\udfbf뙻薇ཽ㝋ᖮ䘕뀪忉㒜쪯᧳녻㋇㠐モᅩ祝", r4);
        r1.append(((java.lang.String) r4[0]).intern());
        r1.append(r17.setY());
        com.mypinpad.tsdk.isolation.mt.setX(new java.lang.Object[]{r1.toString()}, 1760239564, -1760239563, (int) java.lang.System.currentTimeMillis());
        com.mypinpad.tsdk.isolation.pc.setY(new com.mypinpad.tsdk.isolation.ou(null, java.lang.Integer.valueOf(r17.setY()), 10059, r17, 1, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01a5, code lost:
    
        return new com.mypinpad.tsdk.isolation.setMaxHeight(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
    
        if (r17.setY() == 15799) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0055, code lost:
    
        if (r17.setY() == 200) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0057, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.qp.f57962j + 13;
        com.mypinpad.tsdk.isolation.qp.f57961i = r0 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.mypinpad.tsdk.isolation.setMaxHeight e(com.mypinpad.tsdk.isolation.pw r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.qp.e(com.mypinpad.tsdk.i.pw):com.mypinpad.tsdk.i.setMaxHeight");
    }

    public static setMaxHeight f(JSONObject jSONObject) throws Throwable {
        Object[] objArr = new Object[1];
        b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10947), "₿翂쒞\ue22a", (ViewConfiguration.getTapTimeout() >> 16) - 1635794400, "栋\ue727学椇㮊", objArr);
        JSONObject jSONObject2 = jSONObject.getJSONObject(((String) objArr[0]).intern());
        qr qrVar = qr.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
        applicationCreated y7 = qr.setY(jSONObject2);
        Object[] objArr2 = new Object[1];
        a(Color.green(0) + 12, KeyEvent.getDeadChar(0, 0) + 221, (ViewConfiguration.getFadingEdgeLength() >> 16) + 7, "\uffff\u0001\ufffb\r\r\uffff\u0007\r\uffff\ufffe\t\uffdd", true, objArr2);
        setMaxHeight setmaxheight = new setMaxHeight(y7, (List) mp.setCompoundDrawableTintBlendMode(new Object[]{jSONObject, ((String) objArr2[0]).intern()}, -323148915, 323148916, (int) System.currentTimeMillis()));
        int i10 = f57961i + 87;
        f57962j = i10 % 128;
        int i11 = i10 % 2;
        return setmaxheight;
    }

    public static void g() {
        f57957e = -443080017;
        f57960h = (char) 30296;
        f57958f = -6903294061987418659L;
        f57959g = -461867432;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        mo moVar = (mo) objArr[0];
        int i13 = f57962j + 81;
        f57961i = i13 % 128;
        int i14 = i13 % 2;
        Boolean bool = mg.setCompoundDrawableTintBlendMode;
        Intrinsics.checkNotNullExpressionValue(bool, "");
        if (bool.booleanValue()) {
            int i15 = f57962j + 9;
            f57961i = i15 % 128;
            int i16 = i15 % 2;
            JSONObject jSONObject = (JSONObject) mo.setY(new Object[]{moVar}, -378484831, 378484834, System.identityHashCode(moVar));
            Object[] objArr2 = new Object[1];
            a((-16777212) - Color.rgb(0, 0, 0), Drawable.resolveOpacity(0, 0) + 221, 3 - View.getDefaultSize(0, 0), "\u000e\ufffb\ufffe\ufffb", true, objArr2);
            String string = jSONObject.getJSONArray(((String) objArr2[0]).intern()).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            ss ssVar = ss.setCompoundDrawableTintBlendMode;
            byte[] bytes = string.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            String str = (String) ss.setX(new Object[]{bytes}, 1540116092, -1540116088, (int) System.currentTimeMillis());
            Object[] objArr3 = new Object[1];
            a(View.combineMeasuredStates(0, 0) + 9, 227 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf("", "") + 8, "\u0006\t\b\ufff5\u0002\ufffb�\u0007\ufff9", true, objArr3);
            mo.setY(new Object[]{moVar, ((String) objArr3[0]).intern(), str}, -52655784, 52655794, System.identityHashCode(moVar));
            int i17 = f57962j + 103;
            f57961i = i17 % 128;
            int i18 = i17 % 2;
        }
        return moVar;
    }

    @Override // com.mypinpad.tsdk.isolation.setChildIndicatorBounds
    @NotNull
    public final setMaxHeight setCompoundDrawableTintBlendMode(@NotNull applicationCreated p4, @NotNull List<setSubtitleTextAppearance> p10) throws Throwable {
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p10, "");
        mo moVar = (mo) setDividerPadding(new Object[]{qo.setY(p4, p10)}, -957014126, 957014126, (int) System.currentTimeMillis());
        yk.setDividerPadding setdividerpadding = new yk.setDividerPadding();
        Object[] objArr = new Object[1];
        a(9 - Process.getGidForName(""), 219 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 9, "\u0010\u0011\ufffe\u000b\u0000\u0002￦\u0001￦\u000b", false, objArr);
        uo uoVar = uo.INSTANCE;
        Object[] objArr2 = new Object[1];
        a(22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 219, 13 - View.resolveSize(0, 0), "\u000f\u0010�\u0010\u0005\u000b\nￋ\u0010\u000b\u0007\u0001\nￋ\u000f\u0000\u0007ￋ�\u0010\u0010\u0001", false, objArr2);
        yo.Companion companion = yo.INSTANCE;
        String string = moVar.toString();
        yj.setX setx = yj.setOnFocusChangeListener;
        Object[] objArr3 = new Object[1];
        a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 16, 223 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 5, "\u0002\u0005\t\t\ufffa\u0007\b\f\u0003\uffc8\u0007\b\u0002\r\ufffa￼", true, objArr3);
        yk ykVar = (yk) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding}, 721744858, -721744846, System.identityHashCode(setdividerpadding));
        ss ssVar = ss.setCompoundDrawableTintBlendMode;
        setMaxHeight setmaxheightE = e(qj.setCompoundDrawableTintBlendMode((getPinPadPortrait) ss.setX(new Object[]{qj.setY(ykVar, TransactionNotAuthorisedReason.setY)}, -1384554940, 1384554946, (int) System.currentTimeMillis())));
        int i10 = f57962j + 115;
        f57961i = i10 % 128;
        int i11 = i10 % 2;
        return setmaxheightE;
    }

    @Override // com.mypinpad.tsdk.isolation.setChildIndicatorBounds
    @NotNull
    public final setMaxHeight setOnFocusChangeListener() throws Throwable {
        yk.setDividerPadding setdividerpadding = new yk.setDividerPadding();
        Object[] objArr = new Object[1];
        a(10 - (ViewConfiguration.getPressedStateDuration() >> 16), 218 - (ViewConfiguration.getDoubleTapTimeout() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 8, "\u0010\u0011\ufffe\u000b\u0000\u0002￦\u0001￦\u000b", false, objArr);
        String strIntern = ((String) objArr[0]).intern();
        String str = this.f57965a;
        uo uoVar = uo.INSTANCE;
        Object[] objArr2 = new Object[1];
        a(23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 219, 13 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u000f\u0010�\u0010\u0005\u000b\nￋ\u0010\u000b\u0007\u0001\nￋ\u000f\u0000\u0007ￋ�\u0010\u0010\u0001", false, objArr2);
        yo.Companion companion = yo.INSTANCE;
        qo qoVar = qo.INSTANCE;
        Object[] objArr3 = new Object[1];
        b((char) Color.red(0), "굋륟鱟隭", 1605984174 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\u0dcb\ua8dd쇦榓ᴛ륢\ue0ed", objArr3);
        String string = qo.setX(str, this.f57967c, this.f57966b, ((String) objArr3[0]).intern()).toString();
        yj.setX setx = yj.setOnFocusChangeListener;
        Object[] objArr4 = new Object[1];
        a(ExpandableListView.getPackedPositionGroup(0L) + 16, 222 - View.MeasureSpec.makeMeasureSpec(0, 0), 5 - (ViewConfiguration.getScrollBarSize() >> 8), "\u0002\u0005\t\t\ufffa\u0007\b\f\u0003\uffc8\u0007\b\u0002\r\ufffa￼", true, objArr4);
        yk ykVar = (yk) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding}, 721744858, -721744846, System.identityHashCode(setdividerpadding));
        ss ssVar = ss.setCompoundDrawableTintBlendMode;
        setMaxHeight setmaxheightE = e(qj.setCompoundDrawableTintBlendMode((getPinPadPortrait) ss.setX(new Object[]{qj.setY(ykVar, TransactionNotAuthorisedReason.setY)}, -1384554940, 1384554946, (int) System.currentTimeMillis())));
        int i10 = f57962j + 67;
        f57961i = i10 % 128;
        int i11 = i10 % 2;
        return setmaxheightE;
    }

    @Override // com.mypinpad.tsdk.isolation.setChildIndicatorBounds
    @NotNull
    public final String setX(@NotNull String p4, long p10) {
        String str = "";
        Intrinsics.checkNotNullParameter(p4, "");
        mj mjVar = mj.INSTANCE;
        byte[] bArrDecode = Base64.decode(p4, 8);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
        component27 dividerPadding = mjVar.setDividerPadding(bArrDecode, p10, new setLinksClickable(10000L, 5000L, 30000L, 10000L, 30000L));
        if (dividerPadding != null) {
            int i10 = f57961i + 93;
            f57962j = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            String str2 = (String) component27.setCompoundDrawableTintBlendMode(new Object[]{dividerPadding}, 1232690187, -1232690187, System.identityHashCode(dividerPadding));
            if (str2 != null) {
                str = str2;
            }
        }
        int i11 = f57962j + 5;
        f57961i = i11 % 128;
        int i12 = i11 % 2;
        return str;
    }

    @Override // com.mypinpad.tsdk.isolation.setChildIndicatorBounds
    @NotNull
    public final byte[] setDividerPadding(@NotNull byte[] p4, @NotNull byte[] p10) {
        int i10 = f57962j + 101;
        f57961i = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p10, "");
        ss ssVar = ss.setCompoundDrawableTintBlendMode;
        byte[] bArr = (byte[]) ss.setX(new Object[]{p4, p10}, -1591600279, 1591600290, (int) System.currentTimeMillis());
        int i12 = f57961i + 69;
        f57962j = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 97 / 0;
        }
        return bArr;
    }
}
