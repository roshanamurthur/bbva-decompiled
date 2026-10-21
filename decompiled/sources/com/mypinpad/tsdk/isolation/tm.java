package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateOtpCommand;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.mypinpad.tsdk.api.errors.TerminalException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u009d\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u001a\b\u0000\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J4\u0010\u001f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0006\u0012\u0004\u0018\u00010\"0 j\u0002`#2\u0010\u0010$\u001a\f\u0012\u0004\u0012\u00020&0%j\u0002`'2\u0006\u0010(\u001a\u00020)J\u0010\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020,H\u0002J\u0006\u0010-\u001a\u00020&J>\u0010.\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0006\u0012\u0004\u0018\u00010\"0 j\u0002`#2\u0006\u0010/\u001a\u0002002\u0010\u00101\u001a\f\u0012\u0004\u0012\u00020&0%j\u0002`'2\u0006\u0010(\u001a\u00020)H\u0002J\u0006\u00102\u001a\u000203R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001bR\u0016\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/mypinpad/tsdk/internal/terminal/session/SdkTerminalSessionController;", "", "terminal", "Lcom/mypinpad/tsdk/internal/terminal/SdkTerminal;", "hostSessionBuilder", "Lcom/mypinpad/tsdk/internal/host/HostSessionBuilder;", "transactionService", "Lcom/mypinpad/tsdk/internal/terminal/authorisation/TransactionService;", "merchantId", "Lcom/mypinpad/tsdk/internal/merchant/MerchantId;", "sdkInstanceId", "", "transactionId", "Ljava/util/UUID;", "timeoutConfiguration", "Lcom/mypinpad/tsdk/internal/terminal/timeout/TimeoutConfiguration;", "timerProvider", "Lcom/mypinpad/tsdk/internal/terminal/timeout/TimerProvider;", "timeoutHandlerFactory", "Lcom/mypinpad/tsdk/internal/terminal/timeout/TimeoutHandlerFactory;", "(Lcom/mypinpad/tsdk/internal/terminal/SdkTerminal;Lcom/mypinpad/tsdk/internal/host/HostSessionBuilder;Lcom/mypinpad/tsdk/internal/terminal/authorisation/TransactionService;Lcom/mypinpad/tsdk/internal/merchant/MerchantId;Ljava/lang/String;Ljava/util/UUID;Lcom/mypinpad/tsdk/internal/terminal/timeout/TimeoutConfiguration;Lcom/mypinpad/tsdk/internal/terminal/timeout/TimerProvider;Lcom/mypinpad/tsdk/internal/terminal/timeout/TimeoutHandlerFactory;)V", "currentSdkTerminalSession", "Lcom/mypinpad/tsdk/internal/terminal/session/SdkTerminalSession;", "disposed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "sessionListener", "com/mypinpad/tsdk/internal/terminal/session/SdkTerminalSessionController$sessionListener$1", "Lcom/mypinpad/tsdk/internal/terminal/session/SdkTerminalSessionController$sessionListener$1;", "sessionTimeoutHandler", "Lcom/mypinpad/tsdk/internal/terminal/timeout/TimeoutHandler;", "Lcom/mypinpad/tsdk/internal/terminal/session/SessionTimeoutState;", "activate", "Lkotlin/Pair;", "Lcom/mypinpad/tsdk/internal/terminal/session/IsolatedTerminalSession;", "Lcom/mypinpad/tsdk/internal/sdk/callbacks/SdkSessionActivationFailure;", "Lcom/mypinpad/tsdk/internal/terminal/TerminalSessionActivateResult;", "sessionTimeout", "Lkotlin/Function0;", "", "Lcom/mypinpad/tsdk/internal/sdk/callbacks/OnSdkTerminalSessionTimeout;", "sessionTimeoutProvider", "Lcom/mypinpad/tsdk/internal/terminal/session/SessionTimeoutProvider;", "createTransactionSession", GenerateOtpCommand.VALID_UNTIL, "", "dispose", "handleActivationResponse", DigipassManagerConstants.KEY_RESPONSE, "", "onSessionTimeout", "isProcessing", "", "sdk-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSdkTerminalSessionController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkTerminalSessionController.kt\ncom/mypinpad/tsdk/internal/terminal/session/SdkTerminalSessionController\n+ 2 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n*L\n1#1,197:1\n7#2,8:198\n7#2,8:206\n*S KotlinDebug\n*F\n+ 1 SdkTerminalSessionController.kt\ncom/mypinpad/tsdk/internal/terminal/session/SdkTerminalSessionController\n*L\n76#1:198,8\n81#1:206,8\n*E\n"})
public final class tm {
    public static final long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final char[] f61148n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final char f61149o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f61150p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f61151q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f61152r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f61153s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[] f61154t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f61155u = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final td f61156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final nv f61157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ti f61158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final op f61159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f61160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final UUID f61161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final uc f61162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final ub f61163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public ue<ts> f61164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public tp f61165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f61166k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final setX f61167l;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setOnFocusChangeListener", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Lambda implements Function0<Unit> {
        public static int E0;
        public static final byte[] F0 = null;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static final char[] f61168s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static final int f61169t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static final boolean f61170u0;
        public static final boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static int f61171w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static int f61172x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public static int f61173y0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f61174p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ tn f61175q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f61176r0;

        static {
            b();
            f61173y0 = 0;
            E0 = 1;
            f61171w0 = 0;
            f61172x0 = 1;
            f61170u0 = true;
            v0 = true;
            f61169t0 = 1794962260;
            f61168s0 = new char[]{62121, 62139, 62143, 62117, 62114, 62324, 62120, 62115, 62136, 62123, 62129};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, tn tnVar, Function0<Unit> function0) {
            super(0);
            this.f61174p0 = i10;
            this.f61175q0 = tnVar;
            this.f61176r0 = function0;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002c  */
        /* JADX WARN: Code duplicated, block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0035). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void a(byte r7, byte r8, int r9, java.lang.Object[] r10) {
            /*
                int r8 = r8 * 3
                int r8 = 1 - r8
                int r9 = r9 * 2
                int r9 = r9 + 118
                int r7 = r7 * 4
                int r7 = 3 - r7
                byte[] r0 = new byte[r8]
                byte[] r1 = com.mypinpad.tsdk.i.tm.a.F0
                r2 = 0
                if (r1 != 0) goto L1a
                r3 = r1
                r5 = r2
                r1 = r0
                r0 = r10
                r10 = r9
                r9 = r8
                goto L35
            L1a:
                r3 = r2
            L1b:
                byte r4 = (byte) r9
                int r5 = r3 + 1
                r0[r3] = r4
                int r7 = r7 + 1
                if (r5 != r8) goto L2c
                java.lang.String r7 = new java.lang.String
                r7.<init>(r0, r2)
                r10[r2] = r7
                return
            L2c:
                r3 = r1[r7]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                r10 = r6
            L35:
                int r8 = r8 + r10
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r5
                r6 = r9
                r9 = r8
                r8 = r6
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.tm.a.a(byte, byte, int, java.lang.Object[]):void");
        }

        public static void b() {
            F0 = new byte[]{121, 73, -85, -96};
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() throws Throwable {
            int i10 = f61171w0 + 113;
            f61172x0 = i10 % 128;
            int i11 = i10 % 2;
            setOnFocusChangeListener();
            Unit unit = Unit.INSTANCE;
            int i12 = f61172x0 + 23;
            f61171w0 = i12 % 128;
            int i13 = i12 % 2;
            return unit;
        }

        public final void setOnFocusChangeListener() throws Throwable {
            mr mrVar = mr.setOnLongClickListener;
            StringBuilder sb2 = new StringBuilder();
            String str = "";
            int iIndexOf = TextUtils.indexOf("", "") + 127;
            byte[] bytes = "\u008b\u0086\u0087\u008a\u0084\u0086\u0089\u0082\u0088\u0083\u0087\u0086\u0085\u0084\u0083\u0081\u0081\u0082\u0081".getBytes("ISO-8859-1");
            setZ setz = new setZ();
            int i10 = 0;
            int i11 = 1;
            char[] cArr = f61168s0;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i12 = f61173y0 + 63;
                E0 = i12 % 128;
                int i13 = i12 % 2;
                int i14 = 0;
                while (i14 < length) {
                    try {
                        Object[] objArr = new Object[i11];
                        objArr[i10] = Integer.valueOf(cArr[i14]);
                        Map map = setTextScaleX.setMaxEms;
                        Object method = map.get(1129500232);
                        if (method == null) {
                            Class cls = (Class) setTextScaleX.setX((char) (26288 - TextUtils.getTrimmedLength(str)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 63, (TypedValue.complexToFloat(i10) > 0.0f ? 1 : (TypedValue.complexToFloat(i10) == 0.0f ? 0 : -1)) + 1595);
                            byte b10 = (byte) 0;
                            byte b11 = b10;
                            Object[] objArr2 = new Object[1];
                            a(b10, b11, b11, objArr2);
                            method = cls.getMethod((String) objArr2[0], Integer.TYPE);
                            map.put(1129500232, method);
                        }
                        cArr2[i14] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                        i14++;
                        str = str;
                        cArr = cArr;
                        length = length;
                        i10 = 0;
                        i11 = 1;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                int i15 = f61173y0 + 69;
                E0 = i15 % 128;
                int i16 = i15 % 2;
                cArr = cArr2;
            }
            Object[] objArr3 = {Integer.valueOf(f61169t0)};
            Map map2 = setTextScaleX.setMaxEms;
            Object method2 = map2.get(1019674483);
            if (method2 == null) {
                Class cls2 = (Class) setTextScaleX.setX((char) (10744 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 43, 566 - (ViewConfiguration.getTouchSlop() >> 8));
                byte b12 = (byte) 0;
                byte b13 = (byte) (b12 + 1);
                Object[] objArr4 = new Object[1];
                a(b12, (byte) (b13 - 1), b13, objArr4);
                method2 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
                map2.put(1019674483, method2);
            }
            int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
            if (!v0) {
                if (!f61170u0) {
                    throw null;
                }
                throw null;
            }
            int length2 = bytes.length;
            setz.setOnFocusChangeListener = length2;
            char[] cArr3 = new char[length2];
            setz.setDividerPadding = 0;
            while (true) {
                int i17 = setz.setDividerPadding;
                int i18 = setz.setOnFocusChangeListener;
                if (i17 >= i18) {
                    String str2 = new String(cArr3);
                    int i19 = E0 + 69;
                    f61173y0 = i19 % 128;
                    int i20 = i19 % 2;
                    sb2.append(str2.intern());
                    int i21 = this.f61174p0;
                    sb2.append(i21);
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                    mt.setX(new Object[]{mrVar, sb2.toString()}, 135701020, -135701017, (int) System.currentTimeMillis());
                    mu.setCompoundDrawableTintBlendMode(new Object[]{120006, getDisplayExponent.setY(String.valueOf(i21)), null, 4}, -1968587119, 1968587120, 120006);
                    this.f61175q0.getNavBarTitleString();
                    this.f61176r0.invoke();
                    int i22 = f61172x0 + 71;
                    f61171w0 = i22 % 128;
                    int i23 = i22 % 2;
                    return;
                }
                cArr3[i17] = (char) (cArr[bytes[(i18 - 1) - i17] + iIndexOf] - iIntValue);
                Object[] objArr5 = {setz, setz};
                Map map3 = setTextScaleX.setMaxEms;
                Object method3 = map3.get(-1539766653);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 51, (ViewConfiguration.getJumpTapTimeout() >> 16) + 2880);
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 + 2);
                    Object[] objArr6 = new Object[1];
                    a(b14, (byte) (b15 - 2), b15, objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], Object.class, Object.class);
                    map3.put(-1539766653, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                iIntValue = iIntValue;
                iIndexOf = iIndexOf;
            }
        }
    }

    public final class setX implements tt {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f61177b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f61178c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ tm f61179a;

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = (((~(i13 | i14)) | (~(i13 | i12))) * ReturnCode.ERR_CONN_IO) + (i11 * (-751)) + (i10 * (-751));
            int i16 = i11 | i13;
            if ((((~(i10 | i14)) | (~i16)) * 752) + ((~(i12 | i16)) * (-1504)) + i15 != 1) {
                setX setx = (setX) objArr[0];
                int i17 = f61177b;
                int i18 = ((i17 & (-92)) | ((~i17) & 91)) + ((i17 & 91) << 1);
                f61178c = i18 % 128;
                int i19 = i18 % 2;
                ue ueVar = (ue) tm.setY(new Object[]{setx.f61179a}, 479762947, -479762947, (int) System.currentTimeMillis());
                if (ueVar != null) {
                    int i20 = f61178c;
                    int i21 = (i20 & (-58)) | ((~i20) & 57);
                    int i22 = -(-((i20 & 57) << 1));
                    int i23 = (i21 & i22) + (i22 | i21);
                    f61177b = i23 % 128;
                    if (i23 % 2 != 0) {
                        ueVar.setOnFocusChangeListener(ts.setDividerPadding);
                        int i24 = 33 / 0;
                    } else {
                        ueVar.setOnFocusChangeListener(ts.setDividerPadding);
                    }
                } else {
                    int i25 = f61178c;
                    int i26 = (((i25 | 40) << 1) - (i25 ^ 40)) - 1;
                    f61177b = i26 % 128;
                    int i27 = i26 % 2;
                }
            } else {
                setX setx2 = (setX) objArr[0];
                int i28 = f61178c;
                int i29 = i28 & 55;
                int i30 = i28 | 55;
                int i31 = (i29 & i30) + (i30 | i29);
                f61177b = i31 % 128;
                if (i31 % 2 != 0) {
                    throw null;
                }
                ue ueVar2 = (ue) tm.setY(new Object[]{setx2.f61179a}, 479762947, -479762947, (int) System.currentTimeMillis());
                if (ueVar2 != null) {
                    int i32 = f61178c;
                    int i33 = (i32 & 75) + (i32 | 75);
                    f61177b = i33 % 128;
                    if (i33 % 2 != 0) {
                        ueVar2.setOnFocusChangeListener(ts.setDividerPadding);
                        throw null;
                    }
                    ueVar2.setOnFocusChangeListener(ts.setDividerPadding);
                } else {
                    int i34 = f61177b;
                    int i35 = ((i34 & 33) - (~(-(-(i34 | 33))))) - 1;
                    f61178c = i35 % 128;
                    int i36 = i35 % 2;
                }
            }
            return null;
        }

        @Override // com.mypinpad.tsdk.isolation.tt
        public final void setX() {
            setCompoundDrawableTintBlendMode(new Object[]{this}, -488628070, 488628071, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.tt
        public final void setY() {
            setCompoundDrawableTintBlendMode(new Object[]{this}, -1500993362, 1500993362, System.identityHashCode(this));
        }
    }

    static {
        d();
        f61152r = 0;
        f61153s = 1;
        f61150p = 0;
        f61151q = 1;
        m = 5727305618632557104L;
        f61149o = (char) 53956;
        f61148n = new char[]{59233, 59237, 59136, 59170, 59191, 59188, 59234, 59192, 59259, 59177, 59190, 59189, 59181, 59232, 59186, 59176, 59199, 59249, 59194, 59183, 59198, 59179, 59235, 59196, 59182};
    }

    public tm(td tdVar, nv nvVar, ti tiVar, op opVar, String str, UUID uuid, tw twVar, uc ucVar, ub ubVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        ucVar = (i10 & 128) != 0 ? new ui() : ucVar;
        ubVar = (i10 & 256) != 0 ? new ub(twVar, new ua(ucVar), uuid) : ubVar;
        Intrinsics.checkNotNullParameter(tdVar, "");
        Intrinsics.checkNotNullParameter(nvVar, "");
        Intrinsics.checkNotNullParameter(tiVar, "");
        Intrinsics.checkNotNullParameter(opVar, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(twVar, "");
        Intrinsics.checkNotNullParameter(ucVar, "");
        Intrinsics.checkNotNullParameter(ubVar, "");
        this.f61156a = tdVar;
        this.f61157b = nvVar;
        this.f61158c = tiVar;
        this.f61159d = opVar;
        this.f61160e = str;
        this.f61161f = uuid;
        this.f61162g = ucVar;
        this.f61163h = ubVar;
        this.f61166k = new AtomicBoolean(false);
        setX setx = new setX();
        setx.f61179a = this;
        this.f61167l = setx;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0189  */
    /* JADX WARN: Code duplicated, block: B:33:0x018a  */
    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        int i11;
        float f6;
        Throwable cause;
        int i12 = f61153s + 53;
        f61152r = i12 % 128;
        char c10 = 2;
        int i13 = i12 % 2;
        char[] charArray = str.toCharArray();
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = i10;
        int length = charArray.length;
        long[] jArr = new long[length];
        int i14 = 0;
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i15 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            int length2 = charArray.length;
            i11 = f61155u;
            f6 = 0.0f;
            if (i15 >= length2) {
                break;
            }
            char c11 = charArray[i15];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[c10] = setlayoutanimation;
                objArr2[1] = setlayoutanimation;
                objArr2[i14] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-764403778);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 33 - View.resolveSizeAndState(i14, i14, i14), 1195 - View.resolveSize(i14, i14));
                    byte b10 = (byte) i14;
                    Object[] objArr3 = new Object[1];
                    c((byte) (i11 >>> 2), b10, b10, objArr3);
                    method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                    map.put(-764403778, method);
                }
                jArr[i15] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (m ^ 1779209353347916695L);
                Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                Object method2 = map.get(645183118);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) View.MeasureSpec.getSize(0), View.MeasureSpec.getMode(0) + 44, TextUtils.lastIndexOf("", '0') + 729);
                    byte b11 = (byte) 0;
                    Object[] objArr5 = new Object[1];
                    c((byte) (i11 & 24), b11, b11, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(645183118, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                c10 = 2;
                i14 = 0;
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
            int i16 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i16 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            int i17 = f61152r + 95;
            f61153s = i17 % 128;
            int i18 = i17 % 2;
            cArr[i16] = (char) jArr[i16];
            Object[] objArr6 = {setlayoutanimation, setlayoutanimation};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(645183118);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) (AudioTrack.getMinVolume() > f6 ? 1 : (AudioTrack.getMinVolume() == f6 ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 45, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 728);
                byte b12 = (byte) 0;
                Object[] objArr7 = new Object[1];
                c((byte) (i11 & 24), b12, b12, objArr7);
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(645183118, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            f6 = 0.0f;
        }
    }

    public static void b(int i10, String str, byte b10, Object[] objArr) throws Throwable {
        int i11;
        char c10;
        int i12 = f61152r + 81;
        f61153s = i12 % 128;
        int i13 = 2;
        int i14 = i12 % 2;
        char[] charArray = str.toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr = f61148n;
        int i15 = 11;
        int i16 = 290255894;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i17 = 0;
            while (i17 < length) {
                int i18 = f61153s + i15;
                f61152r = i18 % 128;
                if (i18 % i13 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i17])};
                        Map map = setTextScaleX.setMaxEms;
                        Object method = map.get(Integer.valueOf(i16));
                        if (method == null) {
                            Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 45 - View.combineMeasuredStates(0, 0), 1116 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                            byte b11 = (byte) 0;
                            byte b12 = b11;
                            Object[] objArr3 = new Object[1];
                            c(b11, b12, b12, objArr3);
                            method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                            map.put(290255894, method);
                        }
                        cArr2[i17] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr4 = {Integer.valueOf(cArr[i17])};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method2 = map2.get(290255894);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getPressedStateDuration() >> 16), 46 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1117 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr5 = new Object[1];
                        c(b13, b14, b14, objArr5);
                        method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                        map2.put(290255894, method2);
                    }
                    cArr2[i17] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i17++;
                }
                i13 = 2;
                i15 = 11;
                i16 = 290255894;
            }
            int i19 = f61153s + 45;
            f61152r = i19 % 128;
            int i20 = i19 % 2;
            cArr = cArr2;
        }
        Object[] objArr6 = {Integer.valueOf(f61149o)};
        Map map3 = setTextScaleX.setMaxEms;
        Object method3 = map3.get(290255894);
        char c11 = '\b';
        if (method3 == null) {
            Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (KeyEvent.getMaxKeyCode() >> 16) + 45, 1116 - (ViewConfiguration.getFadingEdgeLength() >> 16));
            byte b15 = (byte) 0;
            byte b16 = b15;
            Object[] objArr7 = new Object[1];
            c(b15, b16, b16, objArr7);
            method3 = cls3.getMethod((String) objArr7[0], Integer.TYPE);
            map3.put(290255894, method3);
        }
        char cCharValue = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            i11 = i10 - 1;
            cArr3[i11] = (char) (charArray[i11] - b10);
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            setincludefontpadding.setDividerPadding = 0;
            int i21 = f61152r + 63;
            f61153s = i21 % 128;
            int i22 = i21 % 2;
            while (true) {
                int i23 = setincludefontpadding.setDividerPadding;
                if (i23 >= i11) {
                    break;
                }
                char c12 = charArray[i23];
                setincludefontpadding.setY = c12;
                int i24 = i23 + 1;
                char c13 = charArray[i24];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c13;
                if (c12 == c13) {
                    int i25 = f61152r + 113;
                    f61153s = i25 % 128;
                    if (i25 % 2 == 0) {
                        cArr3[i23] = (char) (c12 / b10);
                        cArr3[i23] = (char) (c13 >> b10);
                    } else {
                        cArr3[i23] = (char) (c12 - b10);
                        cArr3[i24] = (char) (c13 - b10);
                    }
                    c10 = c11;
                } else {
                    Object[] objArr8 = new Object[13];
                    objArr8[12] = setincludefontpadding;
                    objArr8[11] = Integer.valueOf(cCharValue);
                    objArr8[10] = setincludefontpadding;
                    objArr8[9] = setincludefontpadding;
                    objArr8[c11] = Integer.valueOf(cCharValue);
                    objArr8[7] = setincludefontpadding;
                    objArr8[6] = setincludefontpadding;
                    objArr8[5] = Integer.valueOf(cCharValue);
                    objArr8[4] = setincludefontpadding;
                    objArr8[3] = setincludefontpadding;
                    objArr8[2] = Integer.valueOf(cCharValue);
                    objArr8[1] = setincludefontpadding;
                    objArr8[0] = setincludefontpadding;
                    Map map4 = setTextScaleX.setMaxEms;
                    Object method4 = map4.get(180437302);
                    int i26 = f61155u;
                    if (method4 == null) {
                        Class cls4 = (Class) setTextScaleX.setX((char) Color.green(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 28, 2311 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                        byte b17 = (byte) (i26 & 3);
                        byte b18 = (byte) (b17 - 3);
                        Object[] objArr9 = new Object[1];
                        c(b17, b18, b18, objArr9);
                        String str2 = (String) objArr9[0];
                        Class<?> cls5 = Integer.TYPE;
                        method4 = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                        map4.put(180437302, method4);
                    }
                    int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                    int i27 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i27) {
                        Object[] objArr10 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method5 = map4.get(1989802713);
                        if (method5 != null) {
                            c10 = '\b';
                        } else {
                            Class cls6 = (Class) setTextScaleX.setX((char) (View.MeasureSpec.getSize(0) + 49103), 35 - TextUtils.getOffsetAfter("", 0), KeyEvent.normalizeMetaState(0) + 2545);
                            byte b19 = (byte) 0;
                            Object[] objArr11 = new Object[1];
                            c((byte) (i26 & 23), b19, b19, objArr11);
                            String str3 = (String) objArr11[0];
                            Class<?> cls7 = Integer.TYPE;
                            c10 = '\b';
                            method5 = cls6.getMethod(str3, Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                            map4.put(1989802713, method5);
                        }
                        int iIntValue2 = ((Integer) ((Method) method5).invoke(null, objArr10)).intValue();
                        int i28 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i29 = setincludefontpadding.setDividerPadding;
                        cArr3[i29] = cArr[iIntValue2];
                        cArr3[i29 + 1] = cArr[i28];
                    } else {
                        c10 = '\b';
                        int i30 = setincludefontpadding.setX;
                        int i31 = setincludefontpadding.setOnFocusChangeListener;
                        if (i30 == i31) {
                            int iA = androidx.activity.a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding.setOnLongClickListener = iA;
                            int iA2 = androidx.activity.a.a(i27, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i32 = (i31 * cCharValue) + iA2;
                            int i33 = setincludefontpadding.setDividerPadding;
                            cArr3[i33] = cArr[(i30 * cCharValue) + iA];
                            cArr3[i33 + 1] = cArr[i32];
                        } else {
                            int i34 = (i30 * cCharValue) + i27;
                            int i35 = (i31 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                            int i36 = setincludefontpadding.setDividerPadding;
                            cArr3[i36] = cArr[i34];
                            cArr3[i36 + 1] = cArr[i35];
                        }
                    }
                }
                setincludefontpadding.setDividerPadding += 2;
                c11 = c10;
            }
        }
        for (int i37 = 0; i37 < i10; i37++) {
            cArr3[i37] = (char) (cArr3[i37] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 3
            int r9 = 4 - r9
            int r7 = r7 + 99
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r0 = new byte[r8]
            byte[] r1 = com.mypinpad.tsdk.isolation.tm.f61154t
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            goto L33
        L17:
            r3 = r2
        L18:
            r6 = r9
            r9 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r0[r3] = r5
            if (r4 != r8) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r1[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L33:
            int r9 = r9 + 1
            int r7 = r7 + r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.tm.c(byte, int, short, java.lang.Object[]):void");
    }

    public static void d() {
        f61154t = new byte[]{85, -69, 57, -93};
        f61155u = 47;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        tm tmVar = (tm) objArr[0];
        int i13 = f61151q + 61;
        int i14 = i13 % 128;
        f61150p = i14;
        int i15 = i13 % 2;
        ue<ts> ueVar = tmVar.f61164i;
        int i16 = i14 + 93;
        f61151q = i16 % 128;
        int i17 = i16 % 2;
        return ueVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0093, code lost:
    
        return new kotlin.Pair<>(null, new com.mypinpad.tsdk.isolation.to(com.mypinpad.tsdk.isolation.rk.setLayoutAnimation, null, 2, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0094, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.mr.setOnLongClickListener;
        r5 = new java.lang.Object[1];
        b(45 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0005\u0018\u0005\u0016\n\r\u0015\u000f\r\u0017\t\u0011\n\r\u0013\u000f\n\t\r\u0006\u000f\u0000㙚㙚\u0017\u0003\u0017\u0005\u0012\u0004\u0016\u0015\u0003\u0005\u0012\u0010\n\u000b\u0004\t\u0013\u000f\u0015\u000f㘡", (byte) (114 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1))), r5);
        com.mypinpad.tsdk.isolation.mt.setX(new java.lang.Object[]{r1, ((java.lang.String) r5[0]).intern()}, 135701020, -135701017, (int) java.lang.System.currentTimeMillis());
        r4 = new java.lang.Object[1];
        a("ꇔ읷沸闹㬯ꁛ즅滍鐋", 26297 - (android.view.KeyEvent.getMaxKeyCode() >> 16), r4);
        com.mypinpad.tsdk.isolation.mu.setCompoundDrawableTintBlendMode(new java.lang.Object[]{120004, com.mypinpad.tsdk.isolation.getDisplayExponent.setY(((java.lang.String) r4[0]).intern()), null, 4}, -1968587119, 1968587120, 120004);
        r5 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.tu.setX(new java.lang.Object[]{r27}, -7553507, 7553509, java.lang.System.identityHashCode(r27))).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0131, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.tu.setX(new java.lang.Object[]{java.lang.Integer.valueOf(r5)}, 1021254792, -1021254792, r5)).booleanValue() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0133, code lost:
    
        r11 = new java.lang.StringBuilder();
        r3 = new java.lang.Object[1];
        b(32 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), "\n\f\r\u0011\t\u0013\u0012\u0006\u0014\u0000㘯㘯\n\t\r\u0006\u0018\u0013\u000f\u0000\t\u0014\u0012\t\u0016\u0015\u000e\u0013\u0006\u000f\u0007\u0003", (byte) (android.graphics.Color.red(0) + 70), r3);
        r11.append(((java.lang.String) r3[0]).intern());
        r11.append(r5);
        r11.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        com.mypinpad.tsdk.isolation.mt.setX(new java.lang.Object[]{r1, r11.toString()}, 135701020, -135701017, (int) java.lang.System.currentTimeMillis());
        com.mypinpad.tsdk.isolation.mu.setCompoundDrawableTintBlendMode(new java.lang.Object[]{120007, com.mypinpad.tsdk.isolation.getDisplayExponent.setY(java.lang.String.valueOf(r5)), null, 4}, -1968587119, 1968587120, 120007);
        r1 = new kotlin.Pair<>(null, new com.mypinpad.tsdk.isolation.to(com.mypinpad.tsdk.isolation.rk.setOnDragListener, com.mypinpad.tsdk.isolation.rx.setOnFocusChangeListener(new com.mypinpad.tsdk.api.errors.TerminalException(20, null, null, 6, null))));
        r3 = com.mypinpad.tsdk.isolation.tm.f61150p + 111;
        com.mypinpad.tsdk.isolation.tm.f61151q = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x01be, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x01bf, code lost:
    
        r12 = new com.mypinpad.tsdk.isolation.tp(r25.f61156a, r25.f61161f, r25.f61158c, r25.f61159d, r25.f61160e, java.lang.System.currentTimeMillis() + ((long) r5), r25.f61163h);
        r1 = com.mypinpad.tsdk.isolation.tm.f61151q + 99;
        com.mypinpad.tsdk.isolation.tm.f61150p = r1 % 128;
        r1 = r1 % 2;
        r25.f61165j = r12;
        r1 = r25.f61157b.setOnFocusChangeListener(r12, r25.f61167l);
        r2 = (com.mypinpad.tsdk.isolation.ue) com.mypinpad.tsdk.isolation.ub.setY(new java.lang.Object[]{r25.f61163h, java.lang.Integer.valueOf(r5), new com.mypinpad.tsdk.i.tm.a(r5, r1, r26)}, 485715142, -485715142, r5);
        r2.setOnFocusChangeListener(com.mypinpad.tsdk.isolation.ts.setOnFocusChangeListener);
        r25.f61164i = r2;
        r5 = new java.lang.Object[1];
        b(17 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), "\u0014\u0000㘧㘧\n\t\r\u0006\u0011\b\u0018\u0013\r\u0011\u000f\u0018㘼", (byte) (63 - (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1))), r5);
        com.mypinpad.tsdk.isolation.pc.setY(new com.mypinpad.tsdk.isolation.os(((java.lang.String) r5[0]).intern()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x024f, code lost:
    
        return new kotlin.Pair<>(r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0050, code lost:
    
        if (r3.get() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0085, code lost:
    
        if (r3.get() != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<com.mypinpad.tsdk.isolation.tn, com.mypinpad.tsdk.isolation.rh> e(kotlin.jvm.functions.Function0<kotlin.Unit> r26, com.mypinpad.tsdk.isolation.tu r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.tm.e(kotlin.jvm.functions.Function0, com.mypinpad.tsdk.i.tu):kotlin.Pair");
    }

    @NotNull
    public final Pair<tn, rh> setDividerPadding(@NotNull Function0<Unit> function0, @NotNull tu tuVar) {
        Pair<tn, rh> pairE;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(tuVar, "");
        synchronized (this.f61166k) {
            try {
                mr mrVar = mr.setOnLongClickListener;
                Object[] objArr = new Object[1];
                a("ꇆࡗ\uf2f5嵷ޝ\uee19墡ˇ\ued1f埣㹷\ue89a匪㶾\ue7c8", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 43411, objArr);
                mt.setX(new Object[]{mrVar, ((String) objArr[0]).intern()}, 135701020, -135701017, (int) System.currentTimeMillis());
                mu.setCompoundDrawableTintBlendMode(new Object[]{120001, getDisplayExponent.setY(String.valueOf(((Integer) tu.setX(new Object[]{tuVar}, -7553507, 7553509, System.identityHashCode(tuVar))).intValue())), null, 4}, -1968587119, 1968587120, 120001);
                Object[] objArr2 = new Object[1];
                b(19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u0014\u0000㘒㘒\n\t\r\u0006\u0011\b\u0018\u0013\r\u0011\u0018\u0013\r\u0015", (byte) (Color.rgb(0, 0, 0) + 16777257), objArr2);
                pc.setY(new os(((String) objArr2[0]).intern()));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f61166k);
                Object[] objArr3 = new Object[1];
                a("ꆋ䊤", 58146 - MotionEvent.axisFromString(""), objArr3);
                sb2.append(((String) objArr3[0]).intern());
                tp tpVar = this.f61165j;
                sb2.append(tpVar != null ? tpVar.setX() : null);
                mu.setCompoundDrawableTintBlendMode(new Object[]{120003, getDisplayExponent.setY(sb2.toString()), null, 4}, -1968587119, 1968587120, 120003);
                if (this.f61166k.get()) {
                    TerminalException terminalException = new TerminalException(10007, null, null);
                    mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
                    throw terminalException;
                }
                if (this.f61165j != null) {
                    TerminalException terminalException2 = new TerminalException(10006, null, null);
                    mt.setX(new Object[]{terminalException2}, 1181816825, -1181816816, (int) System.currentTimeMillis());
                    throw terminalException2;
                }
                pairE = e(function0, tuVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pairE;
    }

    public final void setOnFocusChangeListener() {
        synchronized (this.f61166k) {
            try {
                if (this.f61166k.getAndSet(true)) {
                    return;
                }
                ue<ts> ueVar = this.f61164i;
                if (ueVar != null) {
                    ueVar.setOnFocusChangeListener(ts.setDividerPadding);
                }
                this.f61164i = null;
                tp tpVar = this.f61165j;
                if (tpVar != null) {
                    tpVar.getNavBarTitleString();
                }
                this.f61165j = null;
                this.f61162g.setOnFocusChangeListener();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final /* synthetic */ ue setY(tm tmVar) {
        return (ue) setY(new Object[]{tmVar}, 479762947, -479762947, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX WARN: Code duplicated, block: B:15:0x003d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x003e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public final boolean setDividerPadding() {
        tp tpVar;
        boolean onLongClickListener;
        int i10;
        int i11;
        int i12 = f61151q + 3;
        f61150p = i12 % 128;
        int i13 = i12 % 2;
        AtomicBoolean atomicBoolean = this.f61166k;
        if (i13 != 0) {
            boolean z10 = atomicBoolean.get();
            int i14 = 12 / 0;
            if (!z10) {
                tpVar = this.f61165j;
                if (tpVar != null) {
                    onLongClickListener = tpVar.setOnLongClickListener();
                    int i15 = f61150p + 39;
                    i10 = i15 % 128;
                    f61151q = i10;
                    int i16 = i15 % 2;
                    if (onLongClickListener) {
                        i11 = i10 + 55;
                        f61150p = i11 % 128;
                        if (i11 % 2 != 0) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        } else if (!atomicBoolean.get()) {
            tpVar = this.f61165j;
            if (tpVar != null) {
                onLongClickListener = tpVar.setOnLongClickListener();
                int i17 = f61150p + 39;
                i10 = i17 % 128;
                f61151q = i10;
                int i18 = i17 % 2;
                if (onLongClickListener) {
                    i11 = i10 + 55;
                    f61150p = i11 % 128;
                    if (i11 % 2 != 0) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
