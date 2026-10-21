package com.mypinpad.tsdk.isolation;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.PointerIconCompat;
import bk.d;
import com.mypinpad.tsdk.api.errors.TerminalException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(J\u0018\u0010)\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0002J&\u0010*\u001a\u00020+2\u001c\b\u0002\u0010,\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017j\u0004\u0018\u0001`\u0019H\u0002J\b\u0010-\u001a\u0004\u0018\u00010\u0003J\b\u0010.\u001a\u00020\u000fH\u0002J\u0012\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u000202H\u0002J,\u00103\u001a\u00020+2$\u0010\u001f\u001a \u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017j\u0004\u0018\u0001`\u00190 j\u0002`!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR$\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017j\u0004\u0018\u0001`\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\u001f\u001a$\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017j\u0004\u0018\u0001`\u0019\u0018\u00010 j\u0004\u0018\u0001`!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/mypinpad/tsdk/internal/remote/ConnectionManager;", "", "baseUrl", "", "baseUrlSha256Pin", "", "oAuthTokenManager", "Lcom/mypinpad/tsdk/internal/remote/OAuthTokenManager;", "timeoutMs", "", "threadPool", "Lcom/mypinpad/common/threading/ThreadPool;", "(Ljava/lang/String;[Ljava/lang/String;Lcom/mypinpad/tsdk/internal/remote/OAuthTokenManager;JLcom/mypinpad/common/threading/ThreadPool;)V", "[Ljava/lang/String;", "cachedOkHttpClient", "Lokhttp3/OkHttpClient;", "getCachedOkHttpClient$annotations", "()V", "getCachedOkHttpClient", "()Lokhttp3/OkHttpClient;", "setCachedOkHttpClient", "(Lokhttp3/OkHttpClient;)V", "cachedProxySetting", "Lkotlin/Pair;", "", "Lcom/mypinpad/tsdk/internal/remote/ProxySetting;", "clientCredentialsGrant", "Lcom/mypinpad/tsdk/internal/sdk/models/authorization/SdkClientCredentialsGrant;", "getClientCredentialsGrant", "()Lcom/mypinpad/tsdk/internal/sdk/models/authorization/SdkClientCredentialsGrant;", "httpClientLock", "proxyProvider", "Lkotlin/Function0;", "Lcom/mypinpad/tsdk/internal/remote/ProxyProvider;", "authenticatedRequest", "Ljava/util/concurrent/Future;", "Lcom/mypinpad/tsdk/internal/remote/HttpNetworkResponse;", "request", "Lokhttp3/Request;", "priority", "Lcom/mypinpad/security/integration/Priority;", "authenticatedRequestSync", "createHttpClient", "", "proxySetting", "getCustomerId", "getHttpClient", "getToken", "Lcom/mypinpad/tsdk/internal/remote/oauth/OAuthToken;", "refresh", "Lcom/mypinpad/tsdk/internal/remote/TokenRefreshLogic;", "setProxyProvider", "sdk-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConnectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionManager.kt\ncom/mypinpad/tsdk/internal/remote/ConnectionManager\n+ 2 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 OkHttpUtils.kt\ncom/mypinpad/tsdk/internal/remote/OkHttpUtilsKt\n*L\n1#1,140:1\n7#2,8:141\n12#2,3:172\n11335#3:149\n11670#3,3:150\n112#4,6:153\n91#4,13:159\n*S KotlinDebug\n*F\n+ 1 ConnectionManager.kt\ncom/mypinpad/tsdk/internal/remote/ConnectionManager\n*L\n61#1:141,8\n121#1:172,3\n78#1:149\n78#1:150,3\n83#1:153,6\n84#1:159,13\n*E\n"})
public final class pu {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final char[] f57740j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f57741k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final boolean f57742l;
    public static final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f57743n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f57744o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final char f57745p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f57746q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f57747r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f57748s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f57749t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final byte[] f57750u = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f57751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String[] f57752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final qc f57753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f57754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final TerminalCallbackKt f57755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ym f57756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Object f57757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public Function0<Pair<String, Integer>> f57758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Pair<String, Integer> f57759i;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/mypinpad/tsdk/i/pw;", "setOnFocusChangeListener", "()Lcom/mypinpad/tsdk/i/pw;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Lambda implements Function0<pw> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ yk f57761q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TransactionNotAuthorisedReason f57762r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yk ykVar, TransactionNotAuthorisedReason transactionNotAuthorisedReason) {
            super(0);
            this.f57761q0 = ykVar;
            this.f57762r0 = transactionNotAuthorisedReason;
        }

        public static /* synthetic */ pw a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * (-574)) + (i10 * (-574));
            int i14 = ~i10;
            int i15 = ~i12;
            int i16 = ~(i14 | i15);
            int i17 = ~((~i11) | i12);
            if ((((~(i10 | i15)) | (~(i12 | i14))) * 575) + (((~(i11 | i15)) | i17) * (-575)) + ((i16 | i17) * 1150) + i13 != 1) {
                a aVar = (a) objArr[0];
                return a(new Object[]{aVar}, 195318096, -195318095, System.identityHashCode(aVar));
            }
            a aVar2 = (a) objArr[0];
            return pu.setX(pu.this, aVar2.f57761q0, aVar2.f57762r0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ pw invoke() {
            return a(new Object[]{this}, -1196270580, 1196270580, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setOnFocusChangeListener", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f57763q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f57764r0 = 1;

        public b() {
            super(0);
        }

        public static /* synthetic */ String a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            int i13 = i10 | i11;
            int i14 = (i13 * (-502)) + (i11 * 503) + (i10 * 503);
            int i15 = ~i10;
            int i16 = ~((~i11) | i15);
            int i17 = i15 | (~i12);
            int i18 = i16 | (~i17);
            int i19 = ~(i12 | i13);
            if ((((~(i17 | i11)) | i19) * 502) + ((i18 | i19) * (-502)) + i14 != 1) {
                b bVar = (b) objArr[0];
                int i20 = f57764r0;
                int i21 = i20 & 11;
                int i22 = (i21 - (~(-(-((i20 ^ 11) | i21))))) - 1;
                f57763q0 = i22 % 128;
                Object[] objArr2 = new Object[1];
                if (i22 % 2 == 0) {
                    objArr2[0] = bVar;
                    return a(objArr2, 1225968639, -1225968638, System.identityHashCode(bVar));
                }
                objArr2[0] = bVar;
                a(objArr2, 1225968639, -1225968638, System.identityHashCode(bVar));
                throw null;
            }
            b bVar2 = (b) objArr[0];
            int i23 = f57763q0;
            int i24 = i23 & 89;
            int i25 = (i23 | 89) & (~i24);
            int i26 = i24 << 1;
            int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
            f57764r0 = i27 % 128;
            int i28 = i27 % 2;
            String onFocusChangeListener = qv.setOnFocusChangeListener(pu.f(pu.this));
            if (i28 != 0) {
                return onFocusChangeListener;
            }
            int i29 = 23 / 0;
            return onFocusChangeListener;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ String invoke() {
            return a(new Object[]{this}, 635377899, -635377899, System.identityHashCode(this));
        }
    }

    static {
        d();
        f57748s = 0;
        f57749t = 1;
        f57746q = 0;
        f57747r = 1;
        f57742l = true;
        m = true;
        f57741k = 1794962305;
        f57740j = new char[]{62402, 62446, 62447, 62436, 62434, 62229, 62440, 62412, 62432, 62438, 62227, 62369, 62230, 62414, 62442, 62409, 62225, 62445, 62435, 62226};
        f57745p = (char) 45702;
        f57743n = -2443367703579691432L;
        f57744o = -461867432;
    }

    public pu(String str, String[] strArr, qc qcVar, long j10, TerminalCallbackKt terminalCallbackKt, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 16) != 0) {
            vi viVar = vi.setDividerPadding;
            terminalCallbackKt = (TerminalCallbackKt) vi.setOnFocusChangeListener(new Object[0], 711180205, -711180201, (int) System.currentTimeMillis());
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(qcVar, "");
        Intrinsics.checkNotNullParameter(terminalCallbackKt, "");
        this.f57751a = str;
        this.f57752b = strArr;
        this.f57753c = qcVar;
        this.f57754d = j10;
        this.f57755e = terminalCallbackKt;
        this.f57757g = new Object();
    }

    public static void a(int i10, String str, Object[] objArr) throws Throwable {
        int i11 = f57749t + 43;
        f57748s = i11 % 128;
        int i12 = 2;
        if (i11 % 2 != 0) {
            int i13 = 19 / 0;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        setZ setz = new setZ();
        char[] cArr = f57740j;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i14 = f57749t + 33;
            f57748s = i14 % 128;
            int i15 = i14 % 2;
            int i16 = 0;
            while (i16 < length) {
                int i17 = f57749t + 77;
                f57748s = i17 % 128;
                if (i17 % i12 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i16])};
                        Map map = setTextScaleX.setMaxEms;
                        Object method = map.get(1129500232);
                        if (method == null) {
                            Class cls = (Class) setTextScaleX.setX((char) (26288 - ((Process.getThreadPriority(0) + 20) >> 6)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 64, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1595);
                            byte b10 = (byte) 0;
                            byte b11 = (byte) (b10 + 5);
                            Object[] objArr3 = new Object[1];
                            c(b11, (byte) (b11 - 5), b10, objArr3);
                            method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                            map.put(1129500232, method);
                        }
                        cArr2[i16] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr4 = {Integer.valueOf(cArr[i16])};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method2 = map2.get(1129500232);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (26288 - TextUtils.indexOf("", "")), 64 - TextUtils.indexOf("", ""), 1595 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 + 5);
                        Object[] objArr5 = new Object[1];
                        c(b13, (byte) (b13 - 5), b12, objArr5);
                        method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                        map2.put(1129500232, method2);
                    }
                    cArr2[i16] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i16++;
                }
                i12 = 2;
            }
            cArr = cArr2;
        }
        Object[] objArr6 = {Integer.valueOf(f57741k)};
        Map map3 = setTextScaleX.setMaxEms;
        Object method3 = map3.get(1019674483);
        char c10 = '0';
        if (method3 == null) {
            Class cls3 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 10744), 42 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 566 - View.resolveSizeAndState(0, 0, 0));
            byte b14 = (byte) 0;
            Object[] objArr7 = new Object[1];
            c((byte) (b14 | 7), b14, b14, objArr7);
            method3 = cls3.getMethod((String) objArr7[0], Integer.TYPE);
            map3.put(1019674483, method3);
        }
        int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
        if (!m) {
            if (!f57742l) {
                throw null;
            }
            throw null;
        }
        int length2 = bytes.length;
        setz.setOnFocusChangeListener = length2;
        char[] cArr3 = new char[length2];
        setz.setDividerPadding = 0;
        while (true) {
            int i18 = setz.setDividerPadding;
            int i19 = setz.setOnFocusChangeListener;
            if (i18 >= i19) {
                objArr[0] = new String(cArr3);
                return;
            }
            int i20 = f57749t + 107;
            f57748s = i20 % 128;
            int i21 = i20 % 2;
            cArr3[i18] = (char) (cArr[bytes[(i19 - 1) - i18] + i10] - iIntValue);
            Object[] objArr8 = {setz, setz};
            Map map4 = setTextScaleX.setMaxEms;
            Object method4 = map4.get(-1539766653);
            if (method4 == null) {
                Class cls4 = (Class) setTextScaleX.setX((char) (TextUtils.lastIndexOf("", c10, 0, 0) + 1), 52 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 2880 - (ViewConfiguration.getTouchSlop() >> 8));
                byte b15 = (byte) 0;
                Object[] objArr9 = new Object[1];
                c((byte) (b15 | 9), b15, b15, objArr9);
                method4 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                map4.put(-1539766653, method4);
            }
            ((Method) method4).invoke(null, objArr8);
            c10 = '0';
        }
    }

    public static void b(char c10, String str, int i10, String str2, Object[] objArr) throws Throwable {
        char c11;
        char[] charArray = str2.toCharArray();
        int i11 = f57748s;
        int i12 = i11 + 91;
        f57749t = i12 % 128;
        int i13 = i12 % 2;
        int i14 = i11 + 113;
        f57749t = i14 % 128;
        int i15 = i14 % 2;
        char[] charArray2 = "\u0000\u0000\u0000\u0000".toCharArray();
        int i16 = f57748s + 33;
        f57749t = i16 % 128;
        int i17 = i16 % 2;
        char[] charArray3 = str.toCharArray();
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
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i18] = uiMessageCallbackKtWhenMappings;
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(20564334);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (Drawable.resolveOpacity(i18, i18) + 50678), Drawable.resolveOpacity(i18, i18) + 39, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1736);
                    byte b10 = (byte) i18;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    c(b11, b11, b10, objArr3);
                    String str3 = (String) objArr3[i18];
                    Class<?>[] clsArr = new Class[1];
                    clsArr[i18] = Object.class;
                    method = cls.getMethod(str3, clsArr);
                    map.put(20564334, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = new Object[1];
                objArr4[i18] = uiMessageCallbackKtWhenMappings;
                Object method2 = map.get(-68974155);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 8125), 37 - View.MeasureSpec.getSize(i18), 646 - TextUtils.getTrimmedLength(""));
                    byte b12 = (byte) i18;
                    byte b13 = (byte) (b12 + 3);
                    Object[] objArr5 = new Object[1];
                    c(b13, (byte) (b13 - 3), b12, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class);
                    map.put(-68974155, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                Object[] objArr6 = {uiMessageCallbackKtWhenMappings, Integer.valueOf(cArr[uiMessageCallbackKtWhenMappings.setX % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method3 = map.get(-1108711559);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 49 - TextUtils.indexOf("", "", 0, 0), 434 - TextUtils.getOffsetBefore("", 0));
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 + 1);
                    Object[] objArr7 = new Object[1];
                    c(b15, (byte) (b15 - 1), b14, objArr7);
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
                    Class cls5 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4449), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 42, View.resolveSize(0, 0) + PointerIconCompat.TYPE_GRABBING);
                    byte b16 = (byte) 0;
                    Object[] objArr9 = new Object[1];
                    c((byte) (b16 | 6), b16, b16, objArr9);
                    String str5 = (String) objArr9[0];
                    c11 = 2;
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str5, cls6, cls6);
                    map.put(533021397, method4);
                }
                cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                char c12 = uiMessageCallbackKtWhenMappings.setDividerPadding;
                cArr[iIntValue2] = c12;
                int i19 = uiMessageCallbackKtWhenMappings.setX;
                cArr3[i19] = (char) (((((long) (c12 ^ charArray[i19])) ^ (f57743n ^ (-2443367703579691432L))) ^ ((long) ((int) (((long) f57744o) ^ (-2443367703579691432L))))) ^ ((long) ((char) (((long) f57745p) ^ (-2443367703579691432L)))));
                uiMessageCallbackKtWhenMappings.setX = i19 + 1;
                length3 = length3;
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

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r6 = r6 + 113
            int r7 = r7 * 2
            int r0 = 1 - r7
            byte[] r0 = new byte[r0]
            r1 = 0
            int r7 = 0 - r7
            byte[] r2 = com.mypinpad.tsdk.isolation.pu.f57750u
            if (r2 != 0) goto L1a
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L34
        L1a:
            r3 = r1
        L1b:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2a:
            r3 = r2[r8]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L34:
            int r9 = r9 + 1
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.pu.c(byte, byte, int, java.lang.Object[]):void");
    }

    public static void d() {
        f57750u = new byte[]{120, 57, -32, 115};
    }

    public static /* synthetic */ qx f(pu puVar) {
        int i10 = f57747r + 43;
        f57746q = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        qx qxVar = (qx) setCompoundDrawableTintBlendMode(new Object[]{puVar, qs.setDividerPadding}, 285785182, -285785182, System.identityHashCode(puVar));
        int i11 = f57746q + 85;
        f57747r = i11 % 128;
        if (i11 % 2 != 0) {
            return qxVar;
        }
        throw null;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws TerminalException {
        Future<pw> onFocusChangeListener;
        int i13 = ~i12;
        int i14 = ((i10 | i13) * (-757)) + (i11 * (-756)) + (i10 * 758);
        int i15 = ~i11;
        if ((((~(i10 | i11 | i12)) | (~(i13 | i15)) | (~((~i10) | i15))) * 757) + ((~(i15 | i10 | i12)) * 1514) + i14 == 1) {
            pu puVar = (pu) objArr[0];
            yk ykVar = (yk) objArr[1];
            int i16 = f57746q + 23;
            f57747r = i16 % 128;
            if (i16 % 2 == 0) {
                onFocusChangeListener = puVar.setOnFocusChangeListener(ykVar, TransactionNotAuthorisedReason.setY);
                int i17 = 47 / 0;
            } else {
                onFocusChangeListener = puVar.setOnFocusChangeListener(ykVar, TransactionNotAuthorisedReason.setY);
            }
            int i18 = f57747r + 13;
            f57746q = i18 % 128;
            if (i18 % 2 == 0) {
                return onFocusChangeListener;
            }
            throw null;
        }
        pu puVar2 = (pu) objArr[0];
        qs qsVar = (qs) objArr[1];
        int i19 = f57747r + 63;
        f57746q = i19 % 128;
        int i20 = i19 % 2;
        qh onFocusChangeListener2 = puVar2.f57753c.setOnFocusChangeListener(qsVar);
        if (onFocusChangeListener2 instanceof qd) {
            mu.setCompoundDrawableTintBlendMode(new Object[]{170003, null, null, 6}, -1968587119, 1968587120, 170003);
            qd qdVar = (qd) onFocusChangeListener2;
            TerminalException terminalException = new TerminalException(((qd.setDividerPadding) qd.setX(new Object[]{qdVar}, 1054978095, -1054978094, System.identityHashCode(qdVar))).setX(), null, (Exception) qd.setX(new Object[]{qdVar}, -1457478468, 1457478468, System.identityHashCode(qdVar)));
            mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
            throw terminalException;
        }
        if (!(onFocusChangeListener2 instanceof qf)) {
            throw new NoWhenBranchMatchedException();
        }
        int i21 = f57747r + 39;
        f57746q = i21 % 128;
        int i22 = i21 % 2;
        qf qfVar = (qf) onFocusChangeListener2;
        return (qx) qf.setX(new Object[]{qfVar}, -752372192, 752372192, System.identityHashCode(qfVar));
    }

    public static /* synthetic */ Future setDividerPadding(pu puVar, yk ykVar) {
        return (Future) setCompoundDrawableTintBlendMode(new Object[]{puVar, ykVar}, -144039891, 144039892, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ pw setX(pu puVar, yk ykVar, TransactionNotAuthorisedReason transactionNotAuthorisedReason) throws Throwable {
        int i10 = f57747r + 71;
        f57746q = i10 % 128;
        int i11 = i10 % 2;
        pw pwVarE = puVar.e(ykVar, transactionNotAuthorisedReason);
        if (i11 != 0) {
            int i12 = 55 / 0;
        }
        return pwVarE;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f2 A[Catch: all -> 0x00be, TryCatch #0 {all -> 0x00be, blocks: (B:4:0x00b2, B:6:0x00b7, B:10:0x00c1, B:12:0x00c5, B:15:0x00d0, B:17:0x00db, B:22:0x00e7, B:25:0x00f2, B:26:0x00f3, B:20:0x00e3, B:14:0x00cd), top: B:34:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00f3 A[Catch: all -> 0x00be, TRY_LEAVE, TryCatch #0 {all -> 0x00be, blocks: (B:4:0x00b2, B:6:0x00b7, B:10:0x00c1, B:12:0x00c5, B:15:0x00d0, B:17:0x00db, B:22:0x00e7, B:25:0x00f2, B:26:0x00f3, B:20:0x00e3, B:14:0x00cd), top: B:34:0x00b2 }] */
    public final pw e(yk ykVar, TransactionNotAuthorisedReason transactionNotAuthorisedReason) throws Throwable {
        ym ymVar;
        ym ymVar2;
        int i10;
        qx qxVar = (qx) setCompoundDrawableTintBlendMode(new Object[]{this, (qs) pv.setX(new Object[]{transactionNotAuthorisedReason}, -1770134076, 1770134076, (int) System.currentTimeMillis())}, 285785182, -285785182, System.identityHashCode(this));
        yk.setDividerPadding setdividerpadding = (yk.setDividerPadding) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, 575496979, -575496977, System.identityHashCode(ykVar));
        Object[] objArr = new Object[1];
        b((char) (KeyEvent.keyCodeFromString("") + 20929), "㿻䵗솗湑", (ViewConfiguration.getScrollDefaultDelay() >> 16) - 1756539073, "쉬ؚ貅訨\ufff6䫿\ue921\ue967\ue6a8覤⥧㯹\uf424", objArr);
        String strIntern = ((String) objArr[0]).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(qxVar.setOnFocusChangeListener());
        sb2.append(' ');
        sb2.append(qxVar.setDividerPadding());
        yk.setDividerPadding setdividerpadding2 = (yk.setDividerPadding) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding, strIntern, sb2.toString()}, 1984524309, -1984524305, System.identityHashCode(setdividerpadding));
        yk ykVar2 = (yk) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding2}, 721744858, -721744846, System.identityHashCode(setdividerpadding2));
        synchronized (this.f57757g) {
            try {
                Function0<Pair<String, Integer>> function0 = this.f57758h;
                ymVar = null;
                Pair<String, Integer> pairInvoke = function0 != null ? function0.invoke() : null;
                if (this.f57756f == null || qi.setX(this.f57759i, pairInvoke)) {
                    g(pairInvoke);
                }
                int i11 = f57747r;
                int i12 = i11 + 121;
                f57746q = i12 % 128;
                if (i12 % 2 != 0) {
                    ymVar2 = this.f57756f;
                    int i13 = 33 / 0;
                    if (ymVar2 != null) {
                        i10 = i11 + 73;
                        f57746q = i10 % 128;
                        if (i10 % 2 == 0) {
                            throw null;
                        }
                        ymVar = ymVar2;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                } else {
                    ymVar2 = this.f57756f;
                    if (ymVar2 != null) {
                        i10 = i11 + 73;
                        f57746q = i10 % 128;
                        if (i10 % 2 == 0) {
                            throw null;
                        }
                        ymVar = ymVar2;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object dividerPadding = qe.setDividerPadding(new Object[]{ymVar, ykVar2}, -664672934, 664672934, (int) System.currentTimeMillis());
        ResultKt.throwOnFailure(dividerPadding);
        pw pwVar = (pw) dividerPadding;
        int i14 = f57747r + 49;
        f57746q = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 46 / 0;
        }
        return pwVar;
    }

    public final void g(Pair<String, Integer> pair) {
        synchronized (this.f57757g) {
            try {
                mr mrVar = mr.getAmountFieldTextColor;
                Object[] objArr = new Object[1];
                a((ViewConfiguration.getScrollBarSize() >> 8) + 127, "\u0086\u0083\u0084\u0087\u0092\u0081\u0091\u0086\u0086\u0090\u008f\u008e\u008c\u008d\u0084\u0083\u008c\u008a\u0083\u0087\u0086\u0089\u0084\u008b\u0085\u008c\u008b\u0084\u008a\u0089\u0083\u0089\u0088\u0083\u0082\u0087\u0086\u0085\u0084\u0083\u0083\u0082\u0081", objArr);
                mt.setX(new Object[]{mrVar, ((String) objArr[0]).intern()}, -225944049, 225944051, (int) System.currentTimeMillis());
                try {
                    yg.Companion companion = yg.INSTANCE;
                    yg ygVar = (yg) yg.Companion.setDividerPadding(new Object[]{this.f57751a}, -655114145, 655114147, (int) System.currentTimeMillis());
                    String str = (String) yg.setOnFocusChangeListener(new Object[]{ygVar}, -1565741557, 1565741570, System.identityHashCode(ygVar));
                    xu.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new xu.setCompoundDrawableTintBlendMode(xu.setDividerPadding);
                    xu.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = (xu.setCompoundDrawableTintBlendMode) xu.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode, new yq[]{yq.setX, yq.setDividerPadding}}, -1869991422, 1869991426, System.identityHashCode(setcompounddrawabletintblendmode));
                    xu.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode3 = (xu.setCompoundDrawableTintBlendMode) xu.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode2, new xt[]{xt.setIncludeFontPadding, xt.UiMessageCallbackKtWhenMappings}}, -793922257, 793922265, System.identityHashCode(setcompounddrawabletintblendmode2));
                    xu xuVar = (xu) xu.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode3}, -1601996436, 1601996438, System.identityHashCode(setcompounddrawabletintblendmode3));
                    ym.setX setx = new ym.setX();
                    String[] strArr = this.f57752b;
                    ArrayList arrayList = new ArrayList(strArr.length);
                    for (String str2 : strArr) {
                        arrayList.add(new xn.setOnFocusChangeListener(str, str2));
                    }
                    ym.setX setx2 = (ym.setX) qe.setDividerPadding(new Object[]{setx, arrayList}, 1156490892, -1156490890, (int) System.currentTimeMillis());
                    ym.setX setx3 = (ym.setX) ym.setX.setX(new Object[]{setx2, new qa(this.f57753c)}, 297581191, -297581144, System.identityHashCode(setx2));
                    ym.setX setx4 = (ym.setX) ym.setX.setX(new Object[]{setx3, d.listOf(xuVar)}, 1472467934, -1472467886, System.identityHashCode(setx3));
                    long j10 = this.f57754d;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    Boolean bool = mg.setY;
                    Intrinsics.checkNotNullExpressionValue(bool, "");
                    if (bool.booleanValue()) {
                        abr abrVar = new abr(qe.AnonymousClass1.setCompoundDrawableTintBlendMode);
                        Object[] objArr2 = new Object[1];
                        b((char) (Drawable.resolveOpacity(0, 0) + 57256), "\uece2ൃ꣄ᯟ", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, "톛㧃댮ꬷ", objArr2);
                        String lowerCase = ((String) objArr2[0]).intern().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                        int iHashCode = lowerCase.hashCode();
                        if (iHashCode == 3029410) {
                            Object[] objArr3 = new Object[1];
                            b((char) (57256 - TextUtils.getTrimmedLength("")), "\uece2ൃ꣄ᯟ", View.combineMeasuredStates(0, 0), "톛㧃댮ꬷ", objArr3);
                            if (lowerCase.equals(((String) objArr3[0]).intern())) {
                            }
                        } else if (iHashCode != 93508654) {
                            if (iHashCode == 795307910) {
                                Object[] objArr4 = new Object[1];
                                b((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), "\udb58ṣ遉懂", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1226728410, "㺚ᐘ쏷毃든탔㺌", objArr4);
                                if (lowerCase.equals(((String) objArr4[0]).intern())) {
                                }
                            }
                        } else {
                            Object[] objArr5 = new Object[1];
                            a(Process.getGidForName("") + 128, "\u0085\u0087\u0094\u0089\u0093", objArr5);
                            if (lowerCase.equals(((String) objArr5[0]).intern())) {
                            }
                        }
                    }
                    this.f57759i = pair;
                    if (pair != null) {
                    }
                    h((ym) ym.setX.setX(new Object[]{setx4}, -1643781551, 1643781585, System.identityHashCode(setx4)));
                    Unit unit = Unit.INSTANCE;
                } catch (IllegalArgumentException e5) {
                    TerminalException terminalException = new TerminalException(10052, null, e5);
                    mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
                    throw terminalException;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(@NotNull ym ymVar) {
        int i10 = f57746q + 17;
        f57747r = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(ymVar, "");
            this.f57756f = ymVar;
            throw null;
        }
        Intrinsics.checkNotNullParameter(ymVar, "");
        this.f57756f = ymVar;
        int i11 = f57747r + 13;
        f57746q = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 23 / 0;
        }
    }

    @NotNull
    public final Future<pw> setOnFocusChangeListener(@NotNull yk ykVar, @NotNull TransactionNotAuthorisedReason transactionNotAuthorisedReason) {
        Intrinsics.checkNotNullParameter(ykVar, "");
        Intrinsics.checkNotNullParameter(transactionNotAuthorisedReason, "");
        Future<pw> onFocusChangeListener = this.f57755e.setOnFocusChangeListener(new a(ykVar, transactionNotAuthorisedReason));
        int i10 = f57747r + 89;
        f57746q = i10 % 128;
        int i11 = i10 % 2;
        return onFocusChangeListener;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0046  */
    /* JADX WARN: Code duplicated, block: B:9:0x003f A[PHI: r6
      0x003f: PHI (r6v6 kotlin.jvm.functions.Function0<kotlin.Pair<java.lang.String, java.lang.Integer>>) = 
      (r6v5 kotlin.jvm.functions.Function0<kotlin.Pair<java.lang.String, java.lang.Integer>>)
      (r6v17 kotlin.jvm.functions.Function0<kotlin.Pair<java.lang.String, java.lang.Integer>>)
     binds: [B:8:0x003d, B:5:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    public final void setY(@NotNull Function0<Pair<String, Integer>> function0) {
        Function0<Pair<String, Integer>> function1;
        Pair<String, Integer> pairInvoke;
        int i10 = f57746q + 93;
        f57747r = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        this.f57758h = function0;
        qc qcVar = this.f57753c;
        qc.setDividerPadding(new Object[]{qcVar, function0}, -2080515178, 2080515183, System.identityHashCode(qcVar));
        int i12 = f57746q + 59;
        int i13 = i12 % 128;
        f57747r = i13;
        if (i12 % 2 == 0) {
            function1 = this.f57758h;
            int i14 = 35 / 0;
            if (function1 != null) {
                pairInvoke = function1.invoke();
            } else {
                int i15 = i13 + 33;
                f57746q = i15 % 128;
                int i16 = i15 % 2;
                pairInvoke = null;
            }
        } else {
            function1 = this.f57758h;
            if (function1 != null) {
                pairInvoke = function1.invoke();
            } else {
                int i17 = i13 + 33;
                f57746q = i17 % 128;
                int i18 = i17 % 2;
                pairInvoke = null;
            }
        }
        g(pairInvoke);
        int i19 = f57746q + 95;
        f57747r = i19 % 128;
        if (i19 % 2 == 0) {
            int i20 = 60 / 0;
        }
    }

    @Nullable
    public final String setX() {
        String str = (String) this.f57755e.setOnFocusChangeListener(new b()).get();
        int i10 = f57746q + 117;
        f57747r = i10 % 128;
        int i11 = i10 % 2;
        return str;
    }
}
