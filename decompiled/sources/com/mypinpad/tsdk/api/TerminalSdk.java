package com.mypinpad.tsdk.api;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import bk.q;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.mypinpad.tsdk.api.callbacks.TerminalCreationFailure;
import com.mypinpad.tsdk.api.callbacks.TerminalCreationFailureCause;
import com.mypinpad.tsdk.api.callbacks.TerminalLogger;
import com.mypinpad.tsdk.api.models.CurrencyCustomFormatting;
import com.mypinpad.tsdk.api.models.Endpoint;
import com.mypinpad.tsdk.api.models.PinPadConfiguration;
import com.mypinpad.tsdk.api.models.authorization.AuthorizationGrant;
import com.mypinpad.tsdk.api.models.authorization.ClientCredentialsGrant;
import com.mypinpad.tsdk.isolation.TerminalProviderIsolationWrapper;
import com.mypinpad.tsdk.isolation.mq;
import com.mypinpad.tsdk.isolation.ms;
import com.mypinpad.tsdk.isolation.mu;
import com.mypinpad.tsdk.isolation.name;
import com.mypinpad.tsdk.isolation.rm;
import com.mypinpad.tsdk.isolation.sd;
import com.mypinpad.tsdk.isolation.se;
import com.mypinpad.tsdk.isolation.setCompoundDrawableTintBlendMode;
import com.mypinpad.tsdk.isolation.setTextScaleX;
import com.mypinpad.tsdk.isolation.st;
import com.mypinpad.tsdk.isolation.su;
import java.lang.reflect.Method;
import java.util.Currency;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001#B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\nJQ\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2 \u0010\u0015\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\b0\u0011j\u0002`\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0007¢\u0006\u0004\b \u0010\u001f"}, d2 = {"Lcom/mypinpad/tsdk/api/TerminalSdk;", "", "", "isApplicationInitAllowed", "()Z", "Landroid/content/Context;", "context", "enableAttestationForDebugBuilds", "", "initialise", "(Landroid/content/Context;Z)V", "Lcom/mypinpad/tsdk/api/TerminalSdk$Configuration;", "configuration", "Lcom/mypinpad/tsdk/api/models/Endpoint;", com.salesforce.marketingcloud.config.a.f64109t, "Lcom/mypinpad/tsdk/api/models/authorization/AuthorizationGrant;", "authorizationGrant", "Lkotlin/Function2;", "Lcom/mypinpad/tsdk/api/Terminal;", "Lcom/mypinpad/tsdk/api/callbacks/TerminalCreationFailure;", "Lcom/mypinpad/tsdk/api/callbacks/OnTerminal;", "onTerminal", "createTerminal", "(Landroid/content/Context;Lcom/mypinpad/tsdk/api/TerminalSdk$Configuration;Lcom/mypinpad/tsdk/api/models/Endpoint;Lcom/mypinpad/tsdk/api/models/authorization/AuthorizationGrant;Lkotlin/jvm/functions/Function2;)V", "Lcom/mypinpad/tsdk/api/callbacks/TerminalLogger;", "terminalLogger", "setLogger", "(Lcom/mypinpad/tsdk/api/callbacks/TerminalLogger;)V", "setRedactedLogger", "", "getVersion", "()Ljava/lang/String;", "getEmvLibVersion", "<init>", "()V", "Configuration"}, k = 1, mv = {1, 8, 0})
public final class TerminalSdk {

    @NotNull
    public static final TerminalSdk INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static char[] f51607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f51608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f51609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f51610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f51611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f51612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f51613g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f51614h = 0;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<String, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static int f51627p0 = 0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f51628q0 = 1;

        public a(Object obj) {
            super(1, obj, TerminalLogger.class, LogKeysKt.LOG, "log(Ljava/lang/String;)V", 0);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * (-520)) + (i10 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY);
            int i14 = ~i12;
            int i15 = ((i11 | i12) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (((~(i14 | i11)) | i10) * (-1042)) + i13;
            int i16 = ~i10;
            if ((((~(i10 | i14 | i11)) | (~(i12 | i16)) | (~((~i11) | i16))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i15 == 1) {
                a aVar = (a) objArr[0];
                String str = (String) objArr[1];
                int i17 = f51628q0;
                int i18 = (i17 ^ 45) + ((i17 & 45) << 1);
                f51627p0 = i18 % 128;
                int i19 = i18 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                ((TerminalLogger) aVar.receiver).log(str);
                int i20 = f51627p0 + 101;
                f51628q0 = i20 % 128;
                if (i20 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            a aVar2 = (a) objArr[0];
            Object obj = objArr[1];
            int i21 = f51628q0;
            int i22 = (i21 ^ 93) + ((i21 & 93) << 1);
            f51627p0 = i22 % 128;
            int i23 = i22 % 2;
            a(new Object[]{aVar2, (String) obj}, -1989954638, 1989954639, System.identityHashCode(aVar2));
            Unit unit = Unit.INSTANCE;
            int i24 = f51628q0;
            int i25 = (((i24 | 116) << 1) - (i24 ^ 116)) - 1;
            f51627p0 = i25 % 128;
            if (i25 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            return a(new Object[]{this, str}, -1406337850, 1406337850, System.identityHashCode(this));
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<String, Unit> {
        public b(Object obj) {
            super(1, obj, TerminalLogger.class, LogKeysKt.LOG, "log(Ljava/lang/String;)V", 0);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * Constant.ERROR_CODE_408) + (i10 * (-813));
            int i14 = ~i11;
            int i15 = ~(i14 | i10);
            int i16 = ~(i10 | i12);
            int i17 = ((i15 | i16) * (-814)) + i13;
            int i18 = ~(i14 | (~i12));
            int i19 = ~i10;
            int i20 = ~(i19 | i11);
            if ((((~(i19 | i12)) | i20 | (~(i11 | i12))) * 407) + ((i18 | i20 | i16) * 407) + i17 != 1) {
                b bVar = (b) objArr[0];
                a(new Object[]{bVar, (String) objArr[1]}, 1638496079, -1638496078, System.identityHashCode(bVar));
                return Unit.INSTANCE;
            }
            b bVar2 = (b) objArr[0];
            String str = (String) objArr[1];
            Intrinsics.checkNotNullParameter(str, "");
            ((TerminalLogger) bVar2.receiver).log(str);
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            return a(new Object[]{this, str}, -1253903727, 1253903727, System.identityHashCode(this));
        }
    }

    static {
        c();
        f51611e = 0;
        f51612f = 1;
        f51609c = 0;
        f51610d = 1;
        e();
        INSTANCE = new TerminalSdk();
        int i10 = f51610d + 39;
        f51609c = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    private TerminalSdk() {
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0333  */
    /* JADX WARN: Code duplicated, block: B:60:0x0334  */
    public static void a(char c10, int i10, int i11, Object[] objArr) throws Throwable {
        Throwable cause;
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode();
        long[] jArr = new long[i11];
        setcompounddrawabletintblendmode.setDividerPadding = 0;
        while (true) {
            int i12 = setcompounddrawabletintblendmode.setDividerPadding;
            if (i12 >= i11) {
                break;
            }
            int i13 = f51611e + 65;
            f51612f = i13 % 128;
            int i14 = i13 % 2;
            int i15 = f51614h;
            if (i14 == 0) {
                try {
                    Object[] objArr2 = {Integer.valueOf(f51607a[i10 % i12])};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(1832327647);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.indexOf("", "", 0, 0) + 44, 727 - TextUtils.lastIndexOf("", '0', 0));
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        b(b11, b10, b11, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(1832327647, method);
                    }
                    Object[] objArr4 = {Long.valueOf(((Long) ((Method) method).invoke(null, objArr2)).longValue()), Long.valueOf(setcompounddrawabletintblendmode.setDividerPadding), Long.valueOf(f51608b), Integer.valueOf(c10)};
                    Object method2 = map.get(2012362404);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (TextUtils.getCapsMode("", 0, 0) + 46116), 43 - (Process.myTid() >> 22), 1775 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                        byte b12 = (byte) (i15 & 7);
                        byte b13 = (byte) (b12 - 1);
                        Object[] objArr5 = new Object[1];
                        b(b13, b12, b13, objArr5);
                        String str = (String) objArr5[0];
                        Class<?> cls3 = Long.TYPE;
                        method2 = cls2.getMethod(str, cls3, cls3, cls3, Integer.TYPE);
                        map.put(2012362404, method2);
                    }
                    jArr[i12] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                    Object[] objArr6 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                    Object method3 = map.get(1606688712);
                    if (method3 == null) {
                        Class cls4 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 27, 2312 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                        byte b14 = (byte) 5;
                        byte b15 = (byte) (b14 - 5);
                        Object[] objArr7 = new Object[1];
                        b(b15, b14, b15, objArr7);
                        method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                        map.put(1606688712, method3);
                    }
                    ((Method) method3).invoke(null, objArr6);
                } catch (Throwable th2) {
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
            } else {
                Object[] objArr8 = {Integer.valueOf(f51607a[i10 + i12])};
                Map map2 = setTextScaleX.setMaxEms;
                Object method4 = map2.get(1832327647);
                if (method4 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43, 727 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    Object[] objArr9 = new Object[1];
                    b(b17, b16, b17, objArr9);
                    method4 = cls5.getMethod((String) objArr9[0], Integer.TYPE);
                    map2.put(1832327647, method4);
                }
                Object[] objArr10 = {Long.valueOf(((Long) ((Method) method4).invoke(null, objArr8)).longValue()), Long.valueOf(setcompounddrawabletintblendmode.setDividerPadding), Long.valueOf(f51608b), Integer.valueOf(c10)};
                Object method5 = map2.get(2012362404);
                if (method5 == null) {
                    Class cls6 = (Class) setTextScaleX.setX((char) (46116 - View.MeasureSpec.getMode(0)), Drawable.resolveOpacity(0, 0) + 43, 1776 - (Process.myPid() >> 22));
                    byte b18 = (byte) (i15 & 7);
                    byte b19 = (byte) (b18 - 1);
                    Object[] objArr11 = new Object[1];
                    b(b19, b18, b19, objArr11);
                    String str2 = (String) objArr11[0];
                    Class<?> cls7 = Long.TYPE;
                    method5 = cls6.getMethod(str2, cls7, cls7, cls7, Integer.TYPE);
                    map2.put(2012362404, method5);
                }
                jArr[i12] = ((Long) ((Method) method5).invoke(null, objArr10)).longValue();
                Object[] objArr12 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                Object method6 = map2.get(1606688712);
                if (method6 == null) {
                    Class cls8 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getLongPressTimeout() >> 16), 28 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 2311 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    byte b20 = (byte) 5;
                    byte b21 = (byte) (b20 - 5);
                    Object[] objArr13 = new Object[1];
                    b(b21, b20, b21, objArr13);
                    method6 = cls8.getMethod((String) objArr13[0], Object.class, Object.class);
                    map2.put(1606688712, method6);
                }
                ((Method) method6).invoke(null, objArr12);
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr = new char[i11];
        setcompounddrawabletintblendmode.setDividerPadding = 0;
        while (true) {
            int i16 = setcompounddrawabletintblendmode.setDividerPadding;
            if (i16 >= i11) {
                break;
            }
            cArr[i16] = (char) jArr[i16];
            Object[] objArr14 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
            Map map3 = setTextScaleX.setMaxEms;
            Object method7 = map3.get(1606688712);
            if (method7 == null) {
                Class cls9 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 26 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 2311);
                byte b22 = (byte) 5;
                byte b23 = (byte) (b22 - 5);
                Object[] objArr15 = new Object[1];
                b(b23, b22, b23, objArr15);
                method7 = cls9.getMethod((String) objArr15[0], Object.class, Object.class);
                map3.put(1606688712, method7);
            }
            ((Method) method7).invoke(null, objArr14);
        }
        String str3 = new String(cArr);
        int i17 = f51612f + 51;
        f51611e = i17 % 128;
        if (i17 % 2 == 0) {
            objArr[0] = str3;
        } else {
            int i18 = 98 / 0;
            objArr[0] = str3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 1
            int r7 = r7 + 67
            int r8 = r8 * 2
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.api.TerminalSdk.f51613g
            if (r2 != 0) goto L18
            r7 = r6
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L33
        L18:
            r3 = r1
            r5 = r7
            r7 = r6
            r6 = r5
        L1c:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2b:
            r3 = r2[r8]
            r5 = r9
            r9 = r8
            r8 = r3
            r3 = r2
            r2 = r0
            r0 = r5
        L33:
            int r8 = -r8
            int r6 = r6 + r8
            int r8 = r9 + 1
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.api.TerminalSdk.b(byte, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        f51613g = new byte[]{41, -42, 76, 2};
        f51614h = 73;
    }

    @JvmStatic
    public static final void createTerminal(@NotNull Context context, @NotNull Configuration configuration, @NotNull Endpoint endpoint, @NotNull AuthorizationGrant authorizationGrant, @NotNull Function2<? super Terminal, ? super TerminalCreationFailure, Unit> onTerminal) {
        int i10 = f51610d + 85;
        f51609c = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(configuration, "");
        Intrinsics.checkNotNullParameter(endpoint, "");
        Intrinsics.checkNotNullParameter(authorizationGrant, "");
        Intrinsics.checkNotNullParameter(onTerminal, "");
        if (Build.VERSION.SDK_INT < 28) {
            int i12 = f51610d;
            int i13 = i12 + 111;
            f51609c = i13 % 128;
            boolean z10 = i13 % 2 == 0;
            int i14 = i12 + 67;
            f51609c = i14 % 128;
            int i15 = i14 % 2;
            if (z10) {
                onTerminal.invoke(null, new TerminalCreationFailure() { // from class: com.mypinpad.tsdk.api.TerminalSdk.createTerminal.1

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public static int f51629b = 0;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public static int f51630c = 1;

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final TerminalCreationFailureCause cause = TerminalCreationFailureCause.UNSUPPORTED_ANDROID_OS_VERSION;

                    @Override // com.mypinpad.tsdk.api.callbacks.TerminalCreationFailure
                    @JvmName(name = "getCause")
                    @NotNull
                    public final TerminalCreationFailureCause getCause() {
                        int i16 = f51629b + 41;
                        int i17 = i16 % 128;
                        f51630c = i17;
                        int i18 = i16 % 2;
                        int i19 = i17 + 63;
                        f51629b = i19 % 128;
                        int i20 = i19 % 2;
                        return this.cause;
                    }

                    @Override // com.mypinpad.tsdk.api.callbacks.TerminalCreationFailure
                    public final /* bridge */ /* synthetic */ Throwable getException() {
                        int i16 = f51630c;
                        int i17 = i16 & 71;
                        int i18 = (i16 | 71) & (~i17);
                        int i19 = -(-(i17 << 1));
                        int i20 = (i18 & i19) + (i18 | i19);
                        f51629b = i20 % 128;
                        if (i20 % 2 != 0) {
                            getException();
                            throw null;
                        }
                        Exception exception = getException();
                        int i21 = f51630c;
                        int i22 = ((i21 ^ 64) + ((i21 & 64) << 1)) - 1;
                        f51629b = i22 % 128;
                        if (i22 % 2 != 0) {
                            int i23 = 10 / 0;
                        }
                        return exception;
                    }

                    @Override // com.mypinpad.tsdk.api.callbacks.TerminalCreationFailure
                    @JvmName(name = "getException")
                    @Nullable
                    public final Exception getException() {
                        int i16 = f51630c;
                        int i17 = ((i16 | 55) << 1) - (((~i16) & 55) | (i16 & (-56)));
                        int i18 = i17 % 128;
                        f51629b = i18;
                        if (i17 % 2 != 0) {
                            throw null;
                        }
                        int i19 = (i18 & 121) + (i18 | 121);
                        f51630c = i19 % 128;
                        int i20 = i19 % 2;
                        return null;
                    }
                });
                return;
            }
        }
        d();
        mu.setCompoundDrawableTintBlendMode(new Object[]{200002, null, null, 6}, -1968587119, 1968587120, 200002);
        if (authorizationGrant instanceof ClientCredentialsGrant) {
            int i16 = f51610d + 9;
            f51609c = i16 % 128;
            if (i16 % 2 != 0) {
                TerminalProviderIsolationWrapper.setCompoundDrawableTintBlendMode.setDividerPadding(endpoint, (sd) se.setX(new Object[]{configuration}, -467698203, 467698203, (int) System.currentTimeMillis()), (st) su.setY(new Object[]{authorizationGrant}, 110887923, -110887923, (int) System.currentTimeMillis()), (Function2) rm.setOnFocusChangeListener(new Object[]{onTerminal}, -517954559, 517954562, (int) System.currentTimeMillis()));
                throw null;
            }
            TerminalProviderIsolationWrapper.setCompoundDrawableTintBlendMode.setDividerPadding(endpoint, (sd) se.setX(new Object[]{configuration}, -467698203, 467698203, (int) System.currentTimeMillis()), (st) su.setY(new Object[]{authorizationGrant}, 110887923, -110887923, (int) System.currentTimeMillis()), (Function2) rm.setOnFocusChangeListener(new Object[]{onTerminal}, -517954559, 517954562, (int) System.currentTimeMillis()));
        }
        int i17 = f51610d + 125;
        f51609c = i17 % 128;
        int i18 = i17 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        throw new java.lang.IllegalStateException("The operation on this process is not allowed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (f() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (f() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r0 = com.mypinpad.tsdk.api.TerminalSdk.f51610d + 57;
        com.mypinpad.tsdk.api.TerminalSdk.f51609c = r0 % 128;
        r0 = r0 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d() {
        /*
            int r0 = com.mypinpad.tsdk.api.TerminalSdk.f51609c
            int r0 = r0 + 67
            int r1 = r0 % 128
            com.mypinpad.tsdk.api.TerminalSdk.f51610d = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L17
            boolean r0 = f()
            r1 = 71
            int r1 = r1 / 0
            if (r0 != 0) goto L28
            goto L1d
        L17:
            boolean r0 = f()
            if (r0 != 0) goto L28
        L1d:
            int r0 = com.mypinpad.tsdk.api.TerminalSdk.f51610d
            int r0 = r0 + 57
            int r1 = r0 % 128
            com.mypinpad.tsdk.api.TerminalSdk.f51609c = r1
            int r0 = r0 % 2
            return
        L28:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The operation on this process is not allowed"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.api.TerminalSdk.d():void");
    }

    public static void e() {
        f51608b = -6636614197136420076L;
        f51607a = new char[]{51644, 40107, 25508, 14011, 40346, 24712, 14220, 39557, 25085, 13553, 39917, 28389, 50726, 37696, 27712, 14698, 37461, 28515, 14402, 38216, 28212, 15202, 37896, 24892, 14879, 38679, 24615, 15618, 38640, 25598, 15610, 35251, 25311};
    }

    public static boolean f() throws Throwable {
        int i10 = f51610d + 27;
        f51609c = i10 % 128;
        int i11 = i10 % 2;
        String processName = Application.getProcessName();
        Intrinsics.checkNotNullExpressionValue(processName, "");
        Object[] objArr = new Object[1];
        a((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 12 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getLongPressTimeout() >> 16) + 21, objArr);
        boolean zContains$default = StringsKt__StringsKt.contains$default((CharSequence) processName, (CharSequence) ((String) objArr[0]).intern(), false, 2, (Object) null);
        int i12 = f51610d + 41;
        f51609c = i12 % 128;
        if (i12 % 2 == 0) {
            return zContains$default;
        }
        throw null;
    }

    @JvmStatic
    @NotNull
    public static final String getEmvLibVersion() {
        int i10 = f51609c + 87;
        f51610d = i10 % 128;
        int i11 = i10 % 2;
        name nameVar = name.INSTANCE;
        String str = (String) name.setX(new Object[0], -249713715, 249713715, (int) System.currentTimeMillis());
        int i12 = f51610d + 19;
        f51609c = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 39 / 0;
        }
        return str;
    }

    @JvmStatic
    @NotNull
    public static final String getVersion() {
        Object obj;
        int i10 = f51609c + 125;
        f51610d = i10 % 128;
        if (i10 % 2 == 0) {
            Object[] objArr = new Object[1];
            a((char) (15478 - (ViewConfiguration.getFadingEdgeLength() - 27)), TextUtils.indexOf((CharSequence) "", '@') - 1, 21 % TextUtils.lastIndexOf("", 'A', 0), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a((char) (3985 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (-1) - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.lastIndexOf("", '0', 0) + 13, objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i11 = f51609c + 123;
        f51610d = i11 % 128;
        int i12 = i11 % 2;
        return strIntern;
    }

    @Deprecated(message = "This method is a no-op, it should not be called")
    @JvmStatic
    public static final void initialise(@NotNull Context context, boolean enableAttestationForDebugBuilds) {
        int i10 = f51610d + 23;
        f51609c = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        d();
        mu.setCompoundDrawableTintBlendMode(new Object[]{200001, null, null, 6}, -1968587119, 1968587120, 200001);
        int i12 = f51609c + 107;
        f51610d = i12 % 128;
        int i13 = i12 % 2;
    }

    public static /* synthetic */ void initialise$default(Context context, boolean z10, int i10, Object obj) {
        int i11 = f51610d + 19;
        int i12 = i11 % 128;
        f51609c = i12;
        int i13 = i11 % 2;
        if ((i10 & 2) != 0) {
            int i14 = i12 + 75;
            f51610d = i14 % 128;
            int i15 = i14 % 2;
            z10 = true;
        }
        initialise(context, z10);
        int i16 = f51610d + 113;
        f51609c = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 85 / 0;
        }
    }

    @JvmStatic
    public static final boolean isApplicationInitAllowed() {
        int i10 = f51610d + 1;
        f51609c = i10 % 128;
        int i11 = i10 % 2;
        if (f()) {
            int i12 = f51609c + 97;
            f51610d = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        int i14 = f51610d + 73;
        f51609c = i14 % 128;
        int i15 = i14 % 2;
        return true;
    }

    @JvmStatic
    public static final void setLogger(@NotNull TerminalLogger terminalLogger) {
        Intrinsics.checkNotNullParameter(terminalLogger, "");
        d();
        ms.INSTANCE.setCompoundDrawableTintBlendMode(new a(terminalLogger));
        int i10 = f51609c + 77;
        f51610d = i10 % 128;
        int i11 = i10 % 2;
    }

    @JvmStatic
    public static final void setRedactedLogger(@NotNull TerminalLogger terminalLogger) {
        Intrinsics.checkNotNullParameter(terminalLogger, "");
        d();
        mq.INSTANCE.setCompoundDrawableTintBlendMode(new b(terminalLogger));
        int i10 = f51610d + 55;
        f51609c = i10 % 128;
        int i11 = i10 % 2;
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0011\u0018\u0000 62\u00020\u0001:\u00016B\u0081\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0016\u0012\b\b\u0002\u0010!\u001a\u00020\u0016\u0012\b\b\u0002\u0010$\u001a\u00020\u0016\u0012\b\b\u0002\u0010*\u001a\u00020%\u0012\b\b\u0002\u0010-\u001a\u00020\u0010\u0012\b\b\u0002\u00100\u001a\u00020\u0010\u0012\b\b\u0002\u00103\u001a\u00020\u0010¢\u0006\u0004\b4\u00105R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001a\u0010!\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001a\u0010$\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001aR\u001a\u0010*\u001a\u00020%8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010-\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0012\u001a\u0004\b,\u0010\u0014R\u0017\u00100\u001a\u00020\u00108\u0007¢\u0006\f\n\u0004\b.\u0010\u0012\u001a\u0004\b/\u0010\u0014R\u001a\u00103\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0012\u001a\u0004\b2\u0010\u0014"}, d2 = {"Lcom/mypinpad/tsdk/api/TerminalSdk$Configuration;", "", "Lcom/mypinpad/tsdk/api/models/PinPadConfiguration;", "a", "Lcom/mypinpad/tsdk/api/models/PinPadConfiguration;", "getPinPadConfiguration", "()Lcom/mypinpad/tsdk/api/models/PinPadConfiguration;", "pinPadConfiguration", "", "Ljava/util/Currency;", "Lcom/mypinpad/tsdk/api/models/CurrencyCustomFormatting;", "b", "Ljava/util/Map;", "getCurrencyCustomFormatting", "()Ljava/util/Map;", "currencyCustomFormatting", "", "c", "Z", "getHapticFeedbackEnabled", "()Z", "hapticFeedbackEnabled", "", "d", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getTotalElapsedTimeout", "()I", "totalElapsedTimeout", "e", "getDiscoveryTimeout", "discoveryTimeout", "f", "getProcessingTimeout", "processingTimeout", "g", "getNetworkTimeout", "networkTimeout", "", "h", "F", "getBeepVolume", "()F", "beepVolume", "i", "getBeepOnSuccess", "beepOnSuccess", "j", "getBeepOnFailure", "beepOnFailure", "k", "getEnableLocalAttestationForDebugBuilds", "enableLocalAttestationForDebugBuilds", "<init>", "(Lcom/mypinpad/tsdk/api/models/PinPadConfiguration;Ljava/util/Map;ZIIIIFZZZ)V", "Companion"}, k = 1, mv = {1, 8, 0})
    public static final class Configuration {
        public static final float DEFAULT_BEEP_VOLUME = 1.0f;
        public static final int DEFAULT_DISCOVERY_TIMEOUT = 30000;
        public static final int DEFAULT_NETWORK_TIMEOUT = 45000;
        public static final int DEFAULT_PROCESSING_TIMEOUT = 30000;
        public static final int DEFAULT_TOTAL_ELAPSED_TIMEOUT = 180000;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static int f51615l = 0;
        public static int m = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final PinPadConfiguration pinPadConfiguration;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Map<Currency, CurrencyCustomFormatting> currencyCustomFormatting;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final boolean hapticFeedbackEnabled;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final int totalElapsedTimeout;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final int discoveryTimeout;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public final int processingTimeout;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public final int networkTimeout;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public final float beepVolume;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public final boolean beepOnSuccess;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public final boolean beepOnFailure;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        public final boolean enableLocalAttestationForDebugBuilds;

        static {
            int i10 = m;
            int i11 = i10 & 73;
            int i12 = -(-((i10 ^ 73) | i11));
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            f51615l = i13 % 128;
            int i14 = i13 % 2;
        }

        @JvmOverloads
        public Configuration(@NotNull PinPadConfiguration pinPadConfiguration, @NotNull Map<Currency, CurrencyCustomFormatting> map, boolean z10, int i10, int i11, int i12, int i13, float f6, boolean z11, boolean z12, boolean z13) {
            Intrinsics.checkNotNullParameter(pinPadConfiguration, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.pinPadConfiguration = pinPadConfiguration;
            this.currencyCustomFormatting = map;
            this.hapticFeedbackEnabled = z10;
            this.totalElapsedTimeout = i10;
            this.discoveryTimeout = i11;
            this.processingTimeout = i12;
            this.networkTimeout = i13;
            this.beepVolume = f6;
            this.beepOnSuccess = z11;
            this.beepOnFailure = z12;
            this.enableLocalAttestationForDebugBuilds = z13;
        }

        @JvmName(name = "getBeepOnFailure")
        public final boolean getBeepOnFailure() {
            int i10 = m;
            int i11 = ((i10 & (-88)) | ((~i10) & 87)) + ((i10 & 87) << 1);
            int i12 = i11 % 128;
            f51615l = i12;
            int i13 = i11 % 2;
            int i14 = (i12 & (-38)) | ((~i12) & 37);
            int i15 = -(-((i12 & 37) << 1));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            m = i16 % 128;
            int i17 = i16 % 2;
            return this.beepOnFailure;
        }

        @JvmName(name = "getBeepOnSuccess")
        public final boolean getBeepOnSuccess() {
            int i10 = f51615l + 119;
            m = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 45 / 0;
            }
            return this.beepOnSuccess;
        }

        @JvmName(name = "getBeepVolume")
        public final float getBeepVolume() {
            int i10 = f51615l;
            int i11 = ((i10 ^ 66) + ((i10 & 66) << 1)) - 1;
            m = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 74 / 0;
            }
            return this.beepVolume;
        }

        @JvmName(name = "getCurrencyCustomFormatting")
        @NotNull
        public final Map<Currency, CurrencyCustomFormatting> getCurrencyCustomFormatting() {
            int i10 = f51615l + 37;
            int i11 = i10 % 128;
            m = i11;
            if (i10 % 2 == 0) {
                throw null;
            }
            int i12 = (i11 & 71) + (i11 | 71);
            f51615l = i12 % 128;
            int i13 = i12 % 2;
            return this.currencyCustomFormatting;
        }

        @JvmName(name = "getDiscoveryTimeout")
        public final int getDiscoveryTimeout() {
            int i10 = f51615l;
            int i11 = (i10 ^ 21) + ((i10 & 21) << 1);
            m = i11 % 128;
            if (i11 % 2 != 0) {
                return this.discoveryTimeout;
            }
            throw null;
        }

        @JvmName(name = "getEnableLocalAttestationForDebugBuilds")
        public final boolean getEnableLocalAttestationForDebugBuilds() {
            int i10 = m;
            int i11 = ((i10 & (-126)) | ((~i10) & 125)) + ((i10 & 125) << 1);
            f51615l = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 67 / 0;
            }
            int i13 = ((-1) << 1) - ((i10 + 22) ^ (-1));
            f51615l = i13 % 128;
            int i14 = i13 % 2;
            return this.enableLocalAttestationForDebugBuilds;
        }

        @JvmName(name = "getHapticFeedbackEnabled")
        public final boolean getHapticFeedbackEnabled() {
            int i10 = m;
            int i11 = ((i10 ^ 74) + ((i10 & 74) << 1)) - 1;
            f51615l = i11 % 128;
            if (i11 % 2 == 0) {
                return this.hapticFeedbackEnabled;
            }
            throw null;
        }

        @JvmName(name = "getNetworkTimeout")
        public final int getNetworkTimeout() {
            int i10 = m;
            int i11 = i10 + 11;
            f51615l = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 85 / 0;
            }
            int i13 = (i10 & 83) + (i10 | 83);
            f51615l = i13 % 128;
            if (i13 % 2 == 0) {
                return this.networkTimeout;
            }
            throw null;
        }

        @JvmName(name = "getPinPadConfiguration")
        @NotNull
        public final PinPadConfiguration getPinPadConfiguration() {
            int i10 = m;
            int i11 = i10 & 63;
            int i12 = (i11 - (~(-(-((i10 ^ 63) | i11))))) - 1;
            f51615l = i12 % 128;
            int i13 = i12 % 2;
            int i14 = ((i10 & 24) + (i10 | 24)) - 1;
            f51615l = i14 % 128;
            int i15 = i14 % 2;
            return this.pinPadConfiguration;
        }

        @JvmName(name = "getProcessingTimeout")
        public final int getProcessingTimeout() {
            int i10 = m;
            int i11 = i10 & 95;
            int i12 = (~i11) & (i10 | 95);
            int i13 = -(-(i11 << 1));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            f51615l = i14 % 128;
            int i15 = i14 % 2;
            int i16 = i10 & 73;
            int i17 = i16 + ((i10 ^ 73) | i16);
            f51615l = i17 % 128;
            int i18 = i17 % 2;
            return this.processingTimeout;
        }

        @JvmName(name = "getTotalElapsedTimeout")
        public final int getTotalElapsedTimeout() {
            int i10 = f51615l;
            int i11 = (i10 & (-104)) | ((~i10) & 103);
            int i12 = -(-((i10 & 103) << 1));
            int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
            m = i13 % 128;
            int i14 = i13 % 2;
            int i15 = (((i10 | 114) << 1) - (i10 ^ 114)) - 1;
            m = i15 % 128;
            int i16 = i15 % 2;
            return this.totalElapsedTimeout;
        }

        public /* synthetic */ Configuration(PinPadConfiguration pinPadConfiguration, Map map, boolean z10, int i10, int i11, int i12, int i13, float f6, boolean z11, boolean z12, boolean z13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(pinPadConfiguration, (i14 & 2) != 0 ? q.emptyMap() : map, (i14 & 4) != 0 ? true : z10, (i14 & 8) != 0 ? DEFAULT_TOTAL_ELAPSED_TIMEOUT : i10, (i14 & 16) != 0 ? 30000 : i11, (i14 & 32) == 0 ? i12 : 30000, (i14 & 64) != 0 ? DEFAULT_NETWORK_TIMEOUT : i13, (i14 & 128) != 0 ? 1.0f : f6, (i14 & 256) != 0 ? true : z11, (i14 & 512) == 0 ? z12 : true, (i14 & 1024) != 0 ? false : z13);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Configuration(@NotNull PinPadConfiguration pinPadConfiguration) {
            this(pinPadConfiguration, null, false, 0, 0, 0, 0, 0.0f, false, false, false, 2046, null);
            Intrinsics.checkNotNullParameter(pinPadConfiguration, "");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Configuration(@NotNull PinPadConfiguration pinPadConfiguration, @NotNull Map<Currency, CurrencyCustomFormatting> map) {
            this(pinPadConfiguration, map, false, 0, 0, 0, 0, 0.0f, false, false, false, 2044, null);
            Intrinsics.checkNotNullParameter(pinPadConfiguration, "");
            Intrinsics.checkNotNullParameter(map, "");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Configuration(@NotNull PinPadConfiguration pinPadConfiguration, @NotNull Map<Currency, CurrencyCustomFormatting> map, boolean z10) {
            this(pinPadConfiguration, map, z10, 0, 0, 0, 0, 0.0f, false, false, false, 2040, null);
            Intrinsics.checkNotNullParameter(pinPadConfiguration, "");
            Intrinsics.checkNotNullParameter(map, "");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Configuration(@NotNull PinPadConfiguration pinPadConfiguration, @NotNull Map<Currency, CurrencyCustomFormatting> map, boolean z10, int i10) {
            this(pinPadConfiguration, map, z10, i10, 0, 0, 0, 0.0f, false, false, false, 2032, null);
            Intrinsics.checkNotNullParameter(pinPadConfiguration, "");
            Intrinsics.checkNotNullParameter(map, "");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Configuration(@NotNull PinPadConfiguration pinPadConfiguration, @NotNull Map<Currency, CurrencyCustomFormatting> map, boolean z10, int i10, int i11) {
            this(pinPadConfiguration, map, z10, i10, i11, 0, 0, 0.0f, false, false, false, 2016, null);
            Intrinsics.checkNotNullParameter(pinPadConfiguration, "");
            Intrinsics.checkNotNullParameter(map, "");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Configuration(@NotNull PinPadConfiguration pinPadConfiguration, @NotNull Map<Currency, CurrencyCustomFormatting> map, boolean z10, int i10, int i11, int i12) {
            this(pinPadConfiguration, map, z10, i10, i11, i12, 0, 0.0f, false, false, false, 1984, null);
            Intrinsics.checkNotNullParameter(pinPadConfiguration, "");
            Intrinsics.checkNotNullParameter(map, "");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Configuration(@NotNull PinPadConfiguration pinPadConfiguration, @NotNull Map<Currency, CurrencyCustomFormatting> map, boolean z10, int i10, int i11, int i12, int i13) {
            this(pinPadConfiguration, map, z10, i10, i11, i12, i13, 0.0f, false, false, false, 1920, null);
            Intrinsics.checkNotNullParameter(pinPadConfiguration, "");
            Intrinsics.checkNotNullParameter(map, "");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Configuration(@NotNull PinPadConfiguration pinPadConfiguration, @NotNull Map<Currency, CurrencyCustomFormatting> map, boolean z10, int i10, int i11, int i12, int i13, float f6) {
            this(pinPadConfiguration, map, z10, i10, i11, i12, i13, f6, false, false, false, 1792, null);
            Intrinsics.checkNotNullParameter(pinPadConfiguration, "");
            Intrinsics.checkNotNullParameter(map, "");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Configuration(@NotNull PinPadConfiguration pinPadConfiguration, @NotNull Map<Currency, CurrencyCustomFormatting> map, boolean z10, int i10, int i11, int i12, int i13, float f6, boolean z11) {
            this(pinPadConfiguration, map, z10, i10, i11, i12, i13, f6, z11, false, false, 1536, null);
            Intrinsics.checkNotNullParameter(pinPadConfiguration, "");
            Intrinsics.checkNotNullParameter(map, "");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Configuration(@NotNull PinPadConfiguration pinPadConfiguration, @NotNull Map<Currency, CurrencyCustomFormatting> map, boolean z10, int i10, int i11, int i12, int i13, float f6, boolean z11, boolean z12) {
            this(pinPadConfiguration, map, z10, i10, i11, i12, i13, f6, z11, z12, false, 1024, null);
            Intrinsics.checkNotNullParameter(pinPadConfiguration, "");
            Intrinsics.checkNotNullParameter(map, "");
        }
    }
}
