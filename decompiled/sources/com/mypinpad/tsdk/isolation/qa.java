package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.mypinpad.tsdk.api.errors.TerminalException;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/mypinpad/tsdk/i/qa;", "Lcom/mypinpad/tsdk/i/xo;", "Lcom/mypinpad/tsdk/i/yp;", "p0", "Lcom/mypinpad/tsdk/i/yr;", "p1", "Lcom/mypinpad/tsdk/i/yk;", "setY", "(Lcom/mypinpad/tsdk/i/yp;Lcom/mypinpad/tsdk/i/yr;)Lcom/mypinpad/tsdk/i/yk;", "Lcom/mypinpad/tsdk/i/qc;", "<init>", "(Lcom/mypinpad/tsdk/i/qc;)V", "setX"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOAuthAuthenticator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OAuthAuthenticator.kt\ncom/mypinpad/tsdk/internal/remote/OAuthAuthenticator\n+ 2 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n*L\n1#1,53:1\n7#2,8:54\n*S KotlinDebug\n*F\n+ 1 OAuthAuthenticator.kt\ncom/mypinpad/tsdk/internal/remote/OAuthAuthenticator\n*L\n22#1:54,8\n*E\n"})
public final class qa implements xo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static char f57826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static char f57827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static char f57828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static char f57829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f57830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f57831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f57832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f57833i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f57834j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final qc f57835a;

    static {
        c();
        f57832h = 0;
        f57833i = 1;
        f57830f = 0;
        f57831g = 1;
        e();
        INSTANCE = new Companion(null);
        int i10 = f57830f + 91;
        f57831g = i10 % 128;
        int i11 = i10 % 2;
    }

    public qa(@NotNull qc qcVar) {
        Intrinsics.checkNotNullParameter(qcVar, "");
        this.f57835a = qcVar;
    }

    public static void a(int i10, Object[] objArr) throws Throwable {
        int i11;
        int i12;
        char[] charArray = "祸ㆿ뢺䁌锲㊈剂\uee81魤\ude0eя\udde8繦Ẳ".toCharArray();
        int i13 = f57833i + 39;
        f57832h = i13 % 128;
        int i14 = 2;
        int i15 = i13 % 2;
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        int i16 = 0;
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        char[] cArr2 = new char[2];
        while (true) {
            int i17 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i17 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            int i18 = f57832h + 81;
            f57833i = i18 % 128;
            int i19 = 58224;
            if (i18 % i14 == 0) {
                cArr2[i16] = charArray[i17];
                cArr2[i16] = charArray[i17 + 1];
                i11 = 1;
            } else {
                cArr2[i16] = charArray[i17];
                cArr2[1] = charArray[i17 + 1];
                i11 = i16;
            }
            while (i11 < 16) {
                char c10 = cArr2[1];
                char c11 = cArr2[i16];
                char[] cArr3 = cArr2;
                int i20 = (c11 + i19) ^ ((c11 << 4) + ((char) (((long) f57828d) ^ 4333817592127744003L)));
                int i21 = c11 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f57829e);
                    objArr2[i14] = Integer.valueOf(i21);
                    objArr2[1] = Integer.valueOf(i20);
                    objArr2[0] = Integer.valueOf(c10);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (48534 - Drawable.resolveOpacity(0, 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 47, 2672 - (ViewConfiguration.getScrollBarSize() >> 8));
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        b((byte) (b11 + 1), b10, b11, objArr3);
                        String str = (String) objArr3[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str, cls2, cls2, cls2, cls2);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr4 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i19) ^ ((cCharValue << 4) + ((char) (((long) f57826b) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f57827c)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (KeyEvent.keyCodeFromString("") + 48534), 47 - (Process.myPid() >> 22), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2671);
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr5 = new Object[1];
                        b((byte) (b13 + 1), b12, b13, objArr5);
                        String str2 = (String) objArr5[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str2, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i19 -= 40503;
                    i11++;
                    cArr2 = cArr3;
                    i14 = 2;
                    i16 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            char[] cArr4 = cArr2;
            int i22 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            cArr[i22] = cArr4[0];
            cArr[i22 + 1] = cArr4[1];
            Object[] objArr6 = {setalwaysdrawnwithcacheenabled, setalwaysdrawnwithcacheenabled};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 != null) {
                i12 = 2;
            } else {
                Class cls5 = (Class) setTextScaleX.setX((char) Color.red(0), (ViewConfiguration.getPressedStateDuration() >> 16) + 37, 2145 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                b(b15, b14, b15, objArr7);
                i12 = 2;
                method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i14 = i12;
            cArr2 = cArr4;
            i16 = 0;
        }
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
    public static void b(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 4
            int r6 = r6 * 2
            int r6 = 105 - r6
            int r7 = r7 * 2
            int r0 = 1 - r7
            byte[] r0 = new byte[r0]
            r1 = 0
            int r7 = 0 - r7
            r2 = -1
            byte[] r3 = com.mypinpad.tsdk.isolation.qa.f57834j
            if (r3 != 0) goto L1d
            r6 = r7
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L39
        L1d:
            r5 = r8
            r8 = r6
        L1f:
            r6 = r5
            int r2 = r2 + 1
            byte r4 = (byte) r8
            r0[r2] = r4
            if (r2 != r7) goto L2f
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2f:
            r4 = r3[r6]
            r5 = r9
            r9 = r6
            r6 = r7
            r7 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r5
        L39:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r9 + 1
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.qa.b(byte, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        f57834j = new byte[]{25, 121, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, -73};
    }

    public static boolean d(qx qxVar, yr yrVar) throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(qxVar.setOnFocusChangeListener());
        sb2.append(' ');
        sb2.append(qxVar.setDividerPadding());
        String string = sb2.toString();
        yk ykVar = (yk) yr.setX(new Object[]{yrVar}, -504719753, 504719763, System.identityHashCode(yrVar));
        ye yeVar = (ye) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -1466291161, 1466291162, System.identityHashCode(ykVar));
        Object[] objArr = new Object[1];
        a(KeyEvent.normalizeMetaState(0) + 13, objArr);
        boolean zAreEqual = Intrinsics.areEqual(string, (String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar, ((String) objArr[0]).intern()}, 914142416, -914142409, System.identityHashCode(yeVar)));
        int i10 = f57830f + 29;
        f57831g = i10 % 128;
        if (i10 % 2 != 0) {
            return zAreEqual;
        }
        throw null;
    }

    public static void e() {
        f57829e = (char) 14910;
        f57828d = (char) 8703;
        f57826b = (char) 13225;
        f57827c = (char) 43054;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00c8  */
    @Override // com.mypinpad.tsdk.isolation.xo
    @Nullable
    public final yk setY(@Nullable yp p4, @NotNull yr p10) throws Throwable {
        Object x4;
        int i10 = f57831g + 51;
        f57830f = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(p10, "");
        int i12 = f57831g + 55;
        f57830f = i12 % 128;
        int i13 = i12 % 2;
        yr yrVar = (yr) yr.setX(new Object[]{p10}, 2003566487, -2003566470, System.identityHashCode(p10));
        int i14 = 1;
        while (yrVar != null) {
            int i15 = f57831g + 121;
            f57830f = i15 % 128;
            if (i15 % 2 != 0) {
                i14 += 18;
                x4 = yr.setX(new Object[]{yrVar}, 2003566487, -2003566470, System.identityHashCode(yrVar));
            } else {
                i14++;
                x4 = yr.setX(new Object[]{yrVar}, 2003566487, -2003566470, System.identityHashCode(yrVar));
            }
            yrVar = (yr) x4;
        }
        if (i14 >= 3) {
            int i16 = f57831g + 79;
            f57830f = i16 % 128;
            int i17 = i16 % 2;
            return null;
        }
        qc qcVar = this.f57835a;
        qh onFocusChangeListener = (qh) qc.setDividerPadding(new Object[]{qcVar}, 762387121, -762387119, (int) System.currentTimeMillis());
        if (onFocusChangeListener instanceof qf) {
            int i18 = f57831g + 33;
            f57830f = i18 % 128;
            if (i18 % 2 != 0) {
                qf qfVar = (qf) onFocusChangeListener;
                int i19 = 1 / 0;
                if (d((qx) qf.setX(new Object[]{qfVar}, -752372192, 752372192, System.identityHashCode(qfVar)), p10)) {
                    onFocusChangeListener = qcVar.setOnFocusChangeListener(qs.setY);
                }
            } else {
                qf qfVar2 = (qf) onFocusChangeListener;
                if (!(!d((qx) qf.setX(new Object[]{qfVar2}, -752372192, 752372192, System.identityHashCode(qfVar2)), p10))) {
                    onFocusChangeListener = qcVar.setOnFocusChangeListener(qs.setY);
                }
            }
        }
        if (onFocusChangeListener instanceof qd) {
            qd qdVar = (qd) onFocusChangeListener;
            TerminalException terminalException = new TerminalException(((qd.setDividerPadding) qd.setX(new Object[]{qdVar}, 1054978095, -1054978094, System.identityHashCode(qdVar))).setX(), null, null);
            mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
            throw terminalException;
        }
        if (!(onFocusChangeListener instanceof qf)) {
            throw new NoWhenBranchMatchedException();
        }
        qf qfVar3 = (qf) onFocusChangeListener;
        qx qxVar = (qx) qf.setX(new Object[]{qfVar3}, -752372192, 752372192, System.identityHashCode(qfVar3));
        yk ykVar = (yk) yr.setX(new Object[]{p10}, -504719753, 504719763, System.identityHashCode(p10));
        yk.setDividerPadding setdividerpadding = (yk.setDividerPadding) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, 575496979, -575496977, System.identityHashCode(ykVar));
        Object[] objArr = new Object[1];
        a(13 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(qxVar.setOnFocusChangeListener());
        sb2.append(' ');
        sb2.append(qxVar.setDividerPadding());
        yk.setDividerPadding setdividerpadding2 = (yk.setDividerPadding) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding, strIntern, sb2.toString()}, 730186305, -730186291, System.identityHashCode(setdividerpadding));
        return (yk) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding2}, 721744858, -721744846, System.identityHashCode(setdividerpadding2));
    }
}
