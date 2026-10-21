package com.mypinpad.tsdk.isolation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.esotericsoftware.kryo.serializers.d;
import com.esotericsoftware.kryo.serializers.e;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mypinpad.tsdk.api.errors.TerminalException;
import com.mypinpad.tsdk.api.models.Endpoint;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.mypinpad.tsdk.i.wd, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000ß\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0018\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002^_B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0010\u0010)\u001a\f\u0012\u0004\u0012\u00020\u00150\u0014j\u0002`\u0016J\u001e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201J\u0006\u00102\u001a\u00020\u0015J\u0006\u00103\u001a\u00020\u0015J!\u00104\u001a\u00020\u00152\u0006\u00105\u001a\u0002062\n\b\u0002\u00107\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0002\u00108J\b\u00109\u001a\u0004\u0018\u00010:J\b\u0010;\u001a\u0004\u0018\u00010(J\u0010\u0010<\u001a\u00020\u00152\u0006\u0010=\u001a\u00020>H\u0002J\u001b\u0010?\u001a\u0002H@\"\u0004\b\u0000\u0010@2\u0006\u0010A\u001a\u00020BH\u0002¢\u0006\u0002\u0010CJ\u0010\u0010D\u001a\u00020\u00152\u0006\u0010E\u001a\u00020FH\u0002J\b\u0010G\u001a\u00020\u0015H\u0002J\u0006\u0010H\u001a\u00020\u0015J\u0010\u0010I\u001a\u00020\u00152\u0006\u0010J\u001a\u00020KH\u0016J\u0010\u0010L\u001a\u00020\u00152\u0006\u0010J\u001a\u00020KH\u0016J\u0006\u0010M\u001a\u00020\u0015J\u000e\u0010N\u001a\u00020\u00152\u0006\u0010O\u001a\u00020PJ\u0014\u0010Q\u001a\u00020\f2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\u000e\u0010S\u001a\u00020\u00152\u0006\u0010T\u001a\u00020UJ\u000e\u0010V\u001a\u00020\u00152\u0006\u0010W\u001a\u00020\"J\u0016\u0010X\u001a\u00020\u00152\u0006\u0010Y\u001a\u00020Z2\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010[\u001a\u00020\u0015H\u0002J\u000e\u0010\\\u001a\u00020\u00152\u0006\u0010]\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014j\u0004\u0018\u0001`\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0019R \u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\rX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006`"}, d2 = {"Lcom/mypinpad/tsdk/isolation/MainProcessManager;", "Lcom/mypinpad/tsdk/internal/terminal/ActivityLifecycleCallbacksHandler;", "()V", "WAIT_SERVICE_RESPONSE_TIMEOUT", "", "criticalFailureOccurred", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executors", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "mainProcessCallbacks", "", "", "Ljava/util/concurrent/CompletableFuture;", "", "managerHandlerThread", "Lcom/mypinpad/tsdk/isolation/MainProcessManager$ManagerHandlerThread;", "managerMessenger", "Landroid/os/Messenger;", "onTerminalSessionTimeout", "Lkotlin/Function0;", "", "Lcom/mypinpad/tsdk/api/callbacks/OnTerminalSessionTimeout;", "serviceConnection", "com/mypinpad/tsdk/isolation/MainProcessManager$serviceConnection$1", "Lcom/mypinpad/tsdk/isolation/MainProcessManager$serviceConnection$1;", "serviceDisconnectionListeners", "serviceFuture", "terminalSessionCallback", "Lcom/mypinpad/tsdk/isolation/TerminalSessionCallback;", "threadPool", "Lcom/mypinpad/common/threading/ThreadPool;", "weakContext", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "activateSession", "Lcom/mypinpad/tsdk/isolation/ActiveSessionResult;", "merchantId", "Ljava/util/UUID;", "emvConfiguration", "", "onSessionTimeout", "createTerminal", "Lcom/mypinpad/tsdk/isolation/CreateTerminalProcessResult;", com.salesforce.marketingcloud.config.a.f64109t, "Lcom/mypinpad/tsdk/api/models/Endpoint;", "configuration", "Lcom/mypinpad/tsdk/internal/sdk/models/SdkConfiguration;", "clientCredentialsGrant", "Lcom/mypinpad/tsdk/internal/sdk/models/authorization/SdkClientCredentialsGrant;", "deactivateSession", "disposeTerminal", "doSendServiceRequest", NotificationCompat.CATEGORY_MESSAGE, "Landroid/os/Message;", "serviceRequestKey", "(Landroid/os/Message;Ljava/lang/Integer;)V", "getInstallationId", "", "getInstallationPublicKey", "handleIsolatedProcessRequest", "isolatedProcessRequest", "Lcom/mypinpad/tsdk/isolation/IsolatedProcessRequest;", "handleMainProcessRequest", ExifInterface.GPS_DIRECTION_TRUE, "serviceRequest", "Lcom/mypinpad/tsdk/isolation/MainProcessRequest;", "(Lcom/mypinpad/tsdk/isolation/MainProcessRequest;)Ljava/lang/Object;", "handleNfcTagServiceRequest", LogKeysKt.TAG, "Landroid/nfc/Tag;", "handleTerminateProcessRequest", "initTerminal", "onActivityPaused", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "onActivityResumed", "onDeviceStateCriticalFailure", "onNfcResult", "result", "Lcom/mypinpad/tsdk/internal/host/android/NfcTagResult;", "registerServiceDisconnectionListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setBeepVolume", "volume", "", "setup", "context", "startTransaction", "sdkTransactionParameters", "Lcom/mypinpad/tsdk/internal/sdk/models/SdkTransactionParameters;", "terminateIsolatedService", "unregisterServiceDisconnectionListener", "key", "ManagerHandler", "ManagerHandlerThread", "sdk-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MainProcessManager implements sy {

    @NotNull
    public static final TerminalCallbackKt E0;

    @NotNull
    public static final setDividerPadding F0;
    public static int G0 = 0;
    public static int H0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static CompletableFuture<Messenger> f61619p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static Messenger f61620q0;

    @Nullable
    public static Function0<Unit> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Nullable
    public static xd f61625w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Nullable
    public static WeakReference<Context> f61626x0;

    @NotNull
    public static final MainProcessManager setX = new MainProcessManager();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final ExecutorService f61621r0 = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public static final b f61622s0 = new b();

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public static final LinkedHashMap f61623t0 = new LinkedHashMap();

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public static final LinkedHashMap f61624u0 = new LinkedHashMap();

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public static final AtomicBoolean f61627y0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.wd$a */
    public static final class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f61628a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f61629b = 1;

        /* JADX WARN: Code restructure failed: missing block: B:55:0x02a3, code lost:
        
            if (r3 != false) goto L60;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Object a(java.lang.Object[] r11, int r12, int r13, int r14) throws java.lang.Exception {
            /*
                Method dump skipped, instruction units count: 893
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.MainProcessManager.a.a(java.lang.Object[], int, int, int):java.lang.Object");
        }

        @Override // android.os.Handler
        public final void handleMessage(@NotNull Message message) throws Exception {
            a(new Object[]{this, message}, 1593395306, -1593395305, System.identityHashCode(this));
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.wd$b */
    public static final class b extends HandlerThread {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final CompletableFuture<a> f61630p0;

        public b() {
            super("mht");
            this.f61630p0 = d.b();
        }

        public static Object a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ((~(i11 | i12)) * TypedValues.CycleType.TYPE_EASING) + (i11 * 421) + (i10 * (-419));
            int i14 = ~i10;
            if ((((~(i14 | (~i11))) | (~(i11 | (~i12)))) * TypedValues.CycleType.TYPE_EASING) + ((i11 | i14) * (-420)) + i13 == 1) {
                return ((b) objArr[0]).f61630p0;
            }
            b bVar = (b) objArr[0];
            Looper looper = bVar.getLooper();
            Intrinsics.checkNotNullExpressionValue(looper, "");
            Intrinsics.checkNotNullParameter(looper, "");
            bVar.f61630p0.complete(new a(looper));
            return null;
        }

        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            a(new Object[]{this}, -1129577945, 1129577945, System.identityHashCode(this));
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.wd$setDividerPadding */
    @SourceDebugExtension({"SMAP\nMainProcessManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainProcessManager.kt\ncom/mypinpad/tsdk/isolation/MainProcessManager$serviceConnection$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,528:1\n215#2,2:529\n*S KotlinDebug\n*F\n+ 1 MainProcessManager.kt\ncom/mypinpad/tsdk/isolation/MainProcessManager$serviceConnection$1\n*L\n106#1:529,2\n*E\n"})
    public static final class setDividerPadding implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f61631a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f61632b = 1;

        /* JADX INFO: renamed from: com.mypinpad.tsdk.i.wd$setDividerPadding$a */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setCompoundDrawableTintBlendMode", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class a extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f61633p0 = new a();

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public static int f61634q0 = 0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public static int f61635r0 = 1;

            static {
                int i10 = f61635r0;
                int i11 = ((i10 & 108) + (i10 | 108)) - 1;
                f61634q0 = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 69 / 0;
                }
            }

            public a() {
                super(0);
            }

            public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
                int i13 = ~i10;
                int i14 = ~i11;
                int i15 = i13 | i14;
                int i16 = ~i15;
                int i17 = ~i12;
                if ((((~(i10 | i14 | i12)) | (~(i11 | i13)) | (~(i13 | i17))) * 168) + ((~(i15 | i12)) * 168) + ((i16 | (~(i14 | i17))) * 168) + (i11 * (-167)) + (i10 * (-167)) != 1) {
                    int i18 = f61635r0;
                    int i19 = ((i18 & 58) + (i18 | 58)) - 1;
                    f61634q0 = i19 % 128;
                    int i20 = i19 % 2;
                    MainProcessManager mainProcessManager = MainProcessManager.setX;
                    MainProcessManager.setX(new Object[]{mainProcessManager}, 1009986125, -1009986109, System.identityHashCode(mainProcessManager));
                    int i21 = f61635r0 + 107;
                    f61634q0 = i21 % 128;
                    int i22 = i21 % 2;
                    return null;
                }
                a aVar = (a) objArr[0];
                int i23 = f61635r0;
                int i24 = i23 ^ 47;
                int i25 = (i23 & 47) << 1;
                int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                f61634q0 = i26 % 128;
                if (i26 % 2 != 0) {
                    a(new Object[]{aVar}, -2103646087, 2103646087, System.identityHashCode(aVar));
                    Unit unit = Unit.INSTANCE;
                    throw null;
                }
                a(new Object[]{aVar}, -2103646087, 2103646087, System.identityHashCode(aVar));
                Unit unit2 = Unit.INSTANCE;
                int i27 = f61634q0;
                int i28 = i27 & 57;
                int i29 = -(-((i27 ^ 57) | i28));
                int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                f61635r0 = i30 % 128;
                if (i30 % 2 != 0) {
                    return unit2;
                }
                throw null;
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Unit invoke() {
                return a(new Object[]{this}, -410026508, 410026509, System.identityHashCode(this));
            }
        }

        /* JADX INFO: renamed from: com.mypinpad.tsdk.i.wd$setDividerPadding$setX */
        public static final class setX extends setVisibility {
            public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
                Throwable th2 = (Throwable) objArr[1];
                Intrinsics.checkNotNullParameter(th2, "");
                mr mrVar = mr.setAlwaysDrawnWithCacheEnabled;
                StringBuilder sb2 = new StringBuilder("exception when initialising terminal ");
                sb2.append(th2.getMessage());
                mt.setX(new Object[]{mrVar, sb2.toString()}, 135701020, -135701017, (int) System.currentTimeMillis());
                return null;
            }

            @Override // com.mypinpad.tsdk.isolation.setVisibility
            public final void exceptionHandler(@NotNull Throwable th2) {
                setDividerPadding(new Object[]{this, th2}, -1812430237, 1812430237, System.identityHashCode(this));
            }
        }

        /* JADX WARN: Code duplicated, block: B:32:0x022e  */
        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            CompletableFuture completableFutureC;
            int i13 = ~i11;
            int i14 = ~i12;
            if ((((~(i10 | i14)) | (~(i13 | i12))) * 959) + (i13 * (-959)) + (((~(i13 | i14)) | (~(i10 | i12))) * 959) + (i11 * (-1917)) + (i10 * 960) == 1) {
                ComponentName componentName = (ComponentName) objArr[1];
                IBinder iBinder = (IBinder) objArr[2];
                int i15 = f61631a + 1;
                f61632b = i15 % 128;
                if (i15 % 2 == 0) {
                    mt.setX(new Object[]{mr.setCompoundDrawablePadding, "onServiceConnected ".concat(String.valueOf(componentName))}, 135701020, -135701017, (int) System.currentTimeMillis());
                    completableFutureC = cm.a.c(MainProcessManager.setX(new Object[0], 1177017976, -1177017971, (int) System.currentTimeMillis()));
                    int i16 = 45 / 0;
                    if (completableFutureC == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i17 = f61631a;
                        int i18 = i17 & 45;
                        int i19 = i18 + ((i17 ^ 45) | i18);
                        f61632b = i19 % 128;
                        int i20 = i19 % 2;
                        completableFutureC = null;
                    }
                } else {
                    mt.setX(new Object[]{mr.setCompoundDrawablePadding, "onServiceConnected ".concat(String.valueOf(componentName))}, 135701020, -135701017, (int) System.currentTimeMillis());
                    completableFutureC = cm.a.c(MainProcessManager.setX(new Object[0], 1177017976, -1177017971, (int) System.currentTimeMillis()));
                    if (completableFutureC == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i110 = f61631a;
                        int i111 = i110 & 45;
                        int i112 = i111 + ((i110 ^ 45) | i111);
                        f61632b = i112 % 128;
                        int i21 = i112 % 2;
                        completableFutureC = null;
                    }
                }
                mu.setCompoundDrawableTintBlendMode(new Object[]{100016, getDisplayExponent.setY(String.valueOf(completableFutureC.isDone())), null, 4}, -1968587119, 1968587120, 100016);
                Messenger messenger = new Messenger(iBinder);
                CompletableFuture completableFutureC2 = cm.a.c(MainProcessManager.setX(new Object[0], 1177017976, -1177017971, (int) System.currentTimeMillis()));
                if (completableFutureC2 == null) {
                    int i22 = f61631a + 107;
                    f61632b = i22 % 128;
                    int i23 = i22 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i24 = f61631a;
                    int i25 = i24 & 3;
                    int i26 = (i24 ^ 3) | i25;
                    int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                    f61632b = i27 % 128;
                    int i28 = i27 % 2;
                    completableFutureC2 = null;
                }
                completableFutureC2.complete(messenger);
                ((TerminalCallbackKt) MainProcessManager.setX(new Object[0], 1969216536, -1969216524, (int) System.currentTimeMillis())).setCompoundDrawableTintBlendMode(new setX(), a.f61633p0);
                sx.INSTANCE.setOnFocusChangeListener(MainProcessManager.setX);
                int i29 = f61632b;
                int i30 = ((i29 ^ 58) + ((i29 & 58) << 1)) - 1;
                f61631a = i30 % 128;
                if (i30 % 2 != 0) {
                    int i31 = 8 / 0;
                }
                return null;
            }
            ComponentName componentName2 = (ComponentName) objArr[1];
            int i32 = f61631a;
            int i33 = ((i32 ^ 3) | (i32 & 3)) << 1;
            int i34 = -((i32 & (-4)) | ((~i32) & 3));
            int i35 = ((i33 | i34) << 1) - (i33 ^ i34);
            f61632b = i35 % 128;
            int i36 = i35 % 2;
            mt.setX(new Object[]{mr.setCompoundDrawablePadding, "onServiceDisconnected ".concat(String.valueOf(componentName2))}, 135701020, -135701017, (int) System.currentTimeMillis());
            CompletableFuture completableFutureC3 = cm.a.c(MainProcessManager.setX(new Object[0], 1177017976, -1177017971, (int) System.currentTimeMillis()));
            if (completableFutureC3 == null) {
                int i37 = f61632b;
                int i38 = ((i37 ^ 39) | (i37 & 39)) << 1;
                int i39 = -(((~i37) & 39) | (i37 & (-40)));
                int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                f61631a = i40 % 128;
                if (i40 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                completableFutureC3 = null;
            }
            mu.setCompoundDrawableTintBlendMode(new Object[]{100017, getDisplayExponent.setY(String.valueOf(completableFutureC3.isDone())), null, 4}, -1968587119, 1968587120, 100017);
            CompletableFuture completableFutureC4 = cm.a.c(MainProcessManager.setX(new Object[0], 1177017976, -1177017971, (int) System.currentTimeMillis()));
            if (completableFutureC4 == null) {
                int i41 = f61631a + 90;
                int i42 = (i41 ^ (-1)) + (i41 << 1);
                f61632b = i42 % 128;
                int i43 = i42 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i44 = (-2) - ((f61631a + 86) ^ (-1));
                f61632b = i44 % 128;
                int i45 = i44 % 2;
                completableFutureC4 = null;
            }
            if (completableFutureC4.isDone()) {
                MainProcessManager.setX(new Object[]{d.b()}, -127104858, 127104885, (int) System.currentTimeMillis());
                int i46 = f61632b;
                int i47 = (((i46 | 18) << 1) - (i46 ^ 18)) - 1;
                f61631a = i47 % 128;
                int i48 = i47 % 2;
            }
            Iterator it = ((Map) MainProcessManager.setX(new Object[0], 1483521513, -1483521491, (int) System.currentTimeMillis())).entrySet().iterator();
            int i49 = f61632b;
            int i50 = (((i49 | 62) << 1) - (i49 ^ 62)) - 1;
            f61631a = i50 % 128;
            while (true) {
                int i51 = i50 % 2;
                if (!it.hasNext()) {
                    break;
                }
                int i52 = f61632b;
                int i53 = i52 & 119;
                int i54 = (i52 ^ 119) | i53;
                int i55 = (i53 & i54) + (i54 | i53);
                f61631a = i55 % 128;
                int i56 = i55 % 2;
                ((Function0) ((Map.Entry) it.next()).getValue()).invoke();
                int i57 = f61631a;
                i50 = ((i57 | 29) << 1) - (i57 ^ 29);
                f61632b = i50 % 128;
            }
            ((Map) MainProcessManager.setX(new Object[0], 1483521513, -1483521491, (int) System.currentTimeMillis())).clear();
            sx.INSTANCE.setCompoundDrawableTintBlendMode(MainProcessManager.setX);
            int i58 = f61631a;
            int i59 = (i58 & 64) + (i58 | 64);
            int i60 = (i59 ^ (-1)) + (i59 << 1);
            f61632b = i60 % 128;
            if (i60 % 2 == 0) {
                int i61 = 78 / 0;
            }
            return null;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(@Nullable ComponentName componentName, @Nullable IBinder iBinder) throws Throwable {
            setDividerPadding(new Object[]{this, componentName, iBinder}, 2004612903, -2004612902, System.identityHashCode(this));
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(@Nullable ComponentName componentName) throws Throwable {
            setDividerPadding(new Object[]{this, componentName}, 594520188, -594520188, System.identityHashCode(this));
        }
    }

    static {
        vi viVar = vi.setDividerPadding;
        E0 = (TerminalCallbackKt) vi.setOnFocusChangeListener(new Object[0], 711180205, -711180201, (int) System.currentTimeMillis());
        F0 = new setDividerPadding();
        int i10 = H0;
        int i11 = i10 & 115;
        int i12 = (i10 ^ 115) | i11;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        G0 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 46 / 0;
        }
    }

    public static /* synthetic */ void a(Object[] objArr) throws Throwable {
        Context context;
        MainProcessManager mainProcessManager = (MainProcessManager) objArr[0];
        setX(new Object[]{mainProcessManager}, 671518331, -671518306, System.identityHashCode(mainProcessManager));
        f61627y0.set(true);
        LinkedHashMap linkedHashMap = f61623t0;
        synchronized (linkedHashMap) {
            linkedHashMap.clear();
            Unit unit = Unit.INSTANCE;
        }
        WeakReference<Context> weakReference = f61626x0;
        if (weakReference != null && (context = weakReference.get()) != null) {
            context.unbindService(F0);
        }
        f61626x0 = null;
    }

    public static /* synthetic */ void b(Object[] objArr) {
        Message message = (Message) objArr[0];
        Integer num = (Integer) objArr[1];
        if (f61627y0.get()) {
            mu.setCompoundDrawableTintBlendMode(new Object[]{100025, null, null, 6}, -1968587119, 1968587120, 100025);
        } else {
            try {
                CompletableFuture<Messenger> completableFuture = f61619p0;
                if (completableFuture == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    completableFuture = null;
                }
                ((Messenger) completableFuture.get()).send(message);
                wk.setX(new Object[]{"Send to isolated process", message}, 384055832, -384055830, (int) System.currentTimeMillis());
                wk.setX(new Object[]{100019, message}, -1911741029, 1911741029, 100019);
                return;
            } catch (RemoteException e5) {
                mr mrVar = mr.setOnFocusChangeListener;
                mt.setX(new Object[]{"exception"}, 1760239564, -1760239563, (int) System.currentTimeMillis());
                mu.setCompoundDrawableTintBlendMode(new Object[]{100014, null, e5, 2}, -1968587119, 1968587120, 100014);
                wk.setX(new Object[]{"Failed to send to isolated process", message}, 384055832, -384055830, (int) System.currentTimeMillis());
                wk.setX(new Object[]{100018, message}, -1911741029, 1911741029, 100018);
            }
        }
        LinkedHashMap linkedHashMap = f61623t0;
        synchronized (linkedHashMap) {
            try {
                CompletableFuture completableFutureC = cm.a.c(TypeIntrinsics.asMutableMap(linkedHashMap).remove(num));
                if (completableFutureC != null) {
                    completableFutureC.completeExceptionally(f61627y0.get() ? new TerminalException(10076, null, null, 6, null) : new TerminalException(10075, null, null, 6, null));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void c(Object[] objArr) {
        MainProcessManager mainProcessManager = (MainProcessManager) objArr[0];
        Context context = (Context) objArr[1];
        Intrinsics.checkNotNullParameter(context, "");
        if (f61627y0.get()) {
            return;
        }
        synchronized (mainProcessManager) {
            if (f61619p0 != null) {
                return;
            }
            e.b();
            f61619p0 = d.b();
            Unit unit = Unit.INSTANCE;
            f61626x0 = new WeakReference<>(context);
            b bVar = f61622s0;
            bVar.start();
            f61620q0 = new Messenger((Handler) cm.a.c(b.a(new Object[]{bVar}, -1685354078, 1685354079, System.identityHashCode(bVar))).get());
            context.bindService(new Intent(context, (Class<?>) IsolatedService.class), F0, 1);
        }
    }

    public static /* synthetic */ void d(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int i10 = H0;
        int i11 = ((i10 & 88) + (i10 | 88)) - 1;
        G0 = i11 % 128;
        int i12 = i11 % 2;
        LinkedHashMap linkedHashMap = f61624u0;
        if (i12 != 0) {
            linkedHashMap.remove(Integer.valueOf(iIntValue));
            throw null;
        }
        linkedHashMap.remove(Integer.valueOf(iIntValue));
        int i13 = G0;
        int i14 = i13 & 83;
        int i15 = (i13 | 83) & (~i14);
        int i16 = -(-(i14 << 1));
        int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
        H0 = i17 % 128;
        if (i17 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0212 A[PHI: r1
      0x0212: PHI (r1v17 com.mypinpad.tsdk.i.xd) = (r1v16 com.mypinpad.tsdk.i.xd), (r1v23 com.mypinpad.tsdk.i.xd) binds: [B:54:0x0210, B:51:0x020b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0228  */
    /* JADX WARN: Code duplicated, block: B:72:0x030d  */
    /* JADX WARN: Code duplicated, block: B:90:0x03c1  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0119, code lost:
    
        if (r3 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x012a, code lost:
    
        if (r3 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x012c, code lost:
    
        r3.invoke((com.mypinpad.tsdk.isolation.sa) com.mypinpad.tsdk.isolation.xj.setX(new java.lang.Object[]{r15}, -449852101, 449852101, java.lang.System.identityHashCode(r15)));
        java.lang.System.identityHashCode(r1);
        java.lang.System.identityHashCode(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0143, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x019c, code lost:
    
        if (r15 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01c7, code lost:
    
        if (r15 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01c9, code lost:
    
        r15.invoke();
        r15 = com.mypinpad.tsdk.isolation.MainProcessManager.H0;
        r1 = (r15 & 45) + (r15 | 45);
        com.mypinpad.tsdk.isolation.MainProcessManager.G0 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01d8, code lost:
    
        if ((r1 % 2) == 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01da, code lost:
    
        r15 = 34 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01dd, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01de, code lost:
    
        r15 = com.mypinpad.tsdk.isolation.MainProcessManager.G0;
        r0 = r15 & 119;
        r15 = (r15 | 119) & (~r0);
        r0 = r0 << 1;
        r1 = (r15 & r0) + (r15 | r0);
        com.mypinpad.tsdk.isolation.MainProcessManager.H0 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01f0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void e(java.lang.Object[] r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1031
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.MainProcessManager.e(java.lang.Object[]):void");
    }

    public static final /* synthetic */ Map setAlwaysDrawnWithCacheEnabled() {
        return (Map) setX(new Object[0], 1483521513, -1483521491, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ ExecutorService setLayoutAnimation() {
        return (ExecutorService) setX(new Object[0], 319389886, -319389883, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ Map setNavigationOnClickListener() {
        return (Map) setX(new Object[0], -1487309510, 1487309530, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ TerminalCallbackKt setOnDragListener() {
        return (TerminalCallbackKt) setX(new Object[0], 1969216536, -1969216524, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        byte[] bArr;
        Object objM5535constructorimpl;
        int i13 = (((~i10) | i11) * 160) + (i11 * (-159)) + (i10 * (-159));
        int i14 = ~i12;
        switch (((i10 | (~((~i11) | i14))) * 160) + (((~(i14 | i10)) | (~(i10 | i11))) * (-160)) + i13) {
            case 1:
                d(objArr);
                return null;
            case 2:
                MainProcessManager mainProcessManager = (MainProcessManager) objArr[0];
                we weVar = (we) objArr[1];
                int i15 = H0;
                int i16 = i15 & 71;
                int i17 = (i16 - (~(-(-((i15 ^ 71) | i16))))) - 1;
                G0 = i17 % 128;
                if (i17 % 2 == 0) {
                    setX(new Object[]{mainProcessManager, weVar}, 824785030, -824785024, System.identityHashCode(mainProcessManager));
                    return null;
                }
                setX(new Object[]{mainProcessManager, weVar}, 824785030, -824785024, System.identityHashCode(mainProcessManager));
                throw null;
            case 3:
                int i18 = G0;
                int i19 = i18 & 41;
                int i20 = i19 + ((i18 ^ 41) | i19);
                int i21 = i20 % 128;
                H0 = i21;
                if (i20 % 2 == 0) {
                    throw null;
                }
                int i22 = i21 & 25;
                int i23 = i21 | 25;
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                G0 = i24 % 128;
                if (i24 % 2 == 0) {
                    return f61621r0;
                }
                throw null;
            case 4:
                MainProcessManager mainProcessManager2 = (MainProcessManager) objArr[0];
                ok okVar = (ok) objArr[1];
                int i25 = H0 + 125;
                G0 = i25 % 128;
                int i26 = i25 % 2;
                Intrinsics.checkNotNullParameter(okVar, "");
                if (okVar instanceof on) {
                    int i27 = H0;
                    int i28 = ((i27 & (-16)) | ((~i27) & 15)) + ((i27 & 15) << 1);
                    G0 = i28 % 128;
                    int i29 = i28 % 2;
                    on onVar = (on) okVar;
                    setX(new Object[]{mainProcessManager2, (Tag) on.setOnFocusChangeListener(new Object[]{onVar}, -875424305, 875424305, System.identityHashCode(onVar))}, 198593329, -198593329, System.identityHashCode(mainProcessManager2));
                    System.identityHashCode(mainProcessManager2);
                    System.identityHashCode(mainProcessManager2);
                    return null;
                }
                if (okVar instanceof og) {
                    og ogVar = (og) okVar;
                    Object x4 = setX(new Object[]{mainProcessManager2, new wp((Integer) og.setX(new Object[]{ogVar}, 1306903289, -1306903289, System.identityHashCode(ogVar)))}, 177959407, -177959384, System.identityHashCode(mainProcessManager2));
                    Intrinsics.checkNotNull(x4, "");
                    int i30 = G0;
                    int i31 = (((i30 & (-50)) | ((~i30) & 49)) - (~(-(-((i30 & 49) << 1))))) - 1;
                    H0 = i31 % 128;
                    int i32 = i31 % 2;
                }
                int i33 = H0;
                int i34 = i33 & 81;
                int i35 = (i33 ^ 81) | i34;
                int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                G0 = i36 % 128;
                if (i36 % 2 == 0) {
                    return null;
                }
                throw null;
            case 5:
                int i37 = G0;
                int i38 = i37 & 97;
                int i39 = (i37 | 97) & (~i38);
                int i40 = i38 << 1;
                int i41 = (i39 ^ i40) + ((i39 & i40) << 1);
                int i42 = i41 % 128;
                H0 = i42;
                int i43 = i41 % 2;
                CompletableFuture<Messenger> completableFuture = f61619p0;
                int i44 = i42 ^ 63;
                int i45 = ((i42 & 63) | i44) << 1;
                int i46 = -i44;
                int i47 = (i45 & i46) + (i45 | i46);
                G0 = i47 % 128;
                int i48 = i47 % 2;
                return completableFuture;
            case 6:
                e(objArr);
                return null;
            case 7:
                b(objArr);
                return null;
            case 8:
                MainProcessManager mainProcessManager3 = (MainProcessManager) objArr[0];
                int i49 = H0 + 97;
                G0 = i49 % 128;
                if (i49 % 2 != 0) {
                    Object x6 = setX(new Object[]{mainProcessManager3, vq.INSTANCE}, 177959407, -177959384, System.identityHashCode(mainProcessManager3));
                    Intrinsics.checkNotNull(x6, "");
                    int i50 = 94 / 0;
                } else {
                    Object x7 = setX(new Object[]{mainProcessManager3, vq.INSTANCE}, 177959407, -177959384, System.identityHashCode(mainProcessManager3));
                    Intrinsics.checkNotNull(x7, "");
                }
                int i51 = G0;
                int i52 = i51 & 67;
                int i53 = ((i51 | 67) & (~i52)) + (i52 << 1);
                H0 = i53 % 128;
                int i54 = i53 % 2;
                return null;
            case 9:
                c(objArr);
                return null;
            case 10:
                Message message = (Message) objArr[0];
                int i55 = H0 + 4;
                int i56 = (i55 ^ (-1)) + (i55 << 1);
                G0 = i56 % 128;
                Object[] objArr2 = new Object[2];
                if (i56 % 2 != 0) {
                    objArr2[0] = message;
                    objArr2[1] = null;
                    setX(objArr2, -1392882066, 1392882073, (int) System.currentTimeMillis());
                    int i57 = 70 / 0;
                } else {
                    objArr2[0] = message;
                    objArr2[1] = null;
                    setX(objArr2, -1392882066, 1392882073, (int) System.currentTimeMillis());
                }
                int i58 = G0;
                int i59 = (i58 ^ 29) + ((i58 & 29) << 1);
                H0 = i59 % 128;
                if (i59 % 2 != 0) {
                    return null;
                }
                int i60 = 86 / 0;
                return null;
            case 11:
                MainProcessManager mainProcessManager4 = (MainProcessManager) objArr[0];
                Object x10 = setX(new Object[]{mainProcessManager4, new xa(((Number) objArr[1]).floatValue())}, 177959407, -177959384, System.identityHashCode(mainProcessManager4));
                Intrinsics.checkNotNull(x10, "");
                int i61 = G0;
                int i62 = i61 & 47;
                int i63 = (i61 ^ 47) | i62;
                int i64 = (i62 ^ i63) + ((i63 & i62) << 1);
                H0 = i64 % 128;
                if (i64 % 2 != 0) {
                    return null;
                }
                throw null;
            case 12:
                int i65 = H0;
                int i66 = (((i65 ^ 75) | (i65 & 75)) << 1) - (((~i65) & 75) | (i65 & (-76)));
                int i67 = i66 % 128;
                G0 = i67;
                int i68 = i66 % 2;
                TerminalCallbackKt terminalCallbackKt = E0;
                int i69 = ((i67 ^ 71) - (~((i67 & 71) << 1))) - 1;
                H0 = i69 % 128;
                int i70 = i69 % 2;
                return terminalCallbackKt;
            case 13:
                MainProcessManager mainProcessManager5 = (MainProcessManager) objArr[0];
                int i71 = H0;
                int i72 = i71 & 47;
                int i73 = (i71 | 47) & (~i72);
                int i74 = i72 << 1;
                int i75 = (i73 ^ i74) + ((i73 & i74) << 1);
                G0 = i75 % 128;
                int i76 = i75 % 2;
                Object x11 = setX(new Object[]{mainProcessManager5, vv.INSTANCE}, 177959407, -177959384, System.identityHashCode(mainProcessManager5));
                Intrinsics.checkNotNull(x11, "");
                vz vzVar = (vz) x11;
                String str = (String) vz.setCompoundDrawableTintBlendMode(new Object[]{vzVar}, -1493784240, 1493784240, System.identityHashCode(vzVar));
                int i77 = H0 + 81;
                G0 = i77 % 128;
                int i78 = i77 % 2;
                return str;
            case 14:
                a(objArr);
                return null;
            case 15:
                Function0 function0 = (Function0) objArr[0];
                int i79 = H0 + 54;
                int i80 = (i79 ^ (-1)) + (i79 << 1);
                G0 = i80 % 128;
                int i81 = i80 % 2;
                LinkedHashMap linkedHashMap = f61624u0;
                if (i81 != 0) {
                    Intrinsics.checkNotNullParameter(function0, "");
                    f00 f00Var = f00.f55459a;
                    System.currentTimeMillis();
                    linkedHashMap.put(Integer.valueOf(f00.a().intValue()), function0);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(function0, "");
                f00 f00Var2 = f00.f55459a;
                System.currentTimeMillis();
                int iIntValue = f00.a().intValue();
                linkedHashMap.put(Integer.valueOf(iIntValue), function0);
                return Integer.valueOf(iIntValue);
            case 16:
                MainProcessManager mainProcessManager6 = (MainProcessManager) objArr[0];
                int i82 = (-2) - ((G0 + 82) ^ (-1));
                H0 = i82 % 128;
                if (i82 % 2 != 0) {
                    Object x12 = setX(new Object[]{mainProcessManager6, vy.INSTANCE}, 177959407, -177959384, System.identityHashCode(mainProcessManager6));
                    Intrinsics.checkNotNull(x12, "");
                    return null;
                }
                Object x13 = setX(new Object[]{mainProcessManager6, vy.INSTANCE}, 177959407, -177959384, System.identityHashCode(mainProcessManager6));
                Intrinsics.checkNotNull(x13, "");
                int i83 = 20 / 0;
                return null;
            case 17:
                MainProcessManager mainProcessManager7 = (MainProcessManager) objArr[0];
                int i84 = G0 + 115;
                H0 = i84 % 128;
                if (i84 % 2 == 0) {
                    Object x14 = setX(new Object[]{mainProcessManager7, wa.INSTANCE}, 177959407, -177959384, System.identityHashCode(mainProcessManager7));
                    Intrinsics.checkNotNull(x14, "");
                    wc wcVar = (wc) x14;
                    bArr = (byte[]) wc.setDividerPadding(new Object[]{wcVar}, 1317396562, -1317396562, System.identityHashCode(wcVar));
                    int i85 = 92 / 0;
                } else {
                    Object x15 = setX(new Object[]{mainProcessManager7, wa.INSTANCE}, 177959407, -177959384, System.identityHashCode(mainProcessManager7));
                    Intrinsics.checkNotNull(x15, "");
                    wc wcVar2 = (wc) x15;
                    bArr = (byte[]) wc.setDividerPadding(new Object[]{wcVar2}, 1317396562, -1317396562, System.identityHashCode(wcVar2));
                }
                byte[] bArr2 = bArr;
                System.identityHashCode(mainProcessManager7);
                System.identityHashCode(mainProcessManager7);
                return bArr2;
            case 18:
                int i86 = G0;
                int i87 = i86 ^ 43;
                int i88 = (((i86 & 43) | i87) << 1) - i87;
                H0 = i88 % 128;
                int i89 = i88 % 2;
                Message messageObtain = Message.obtain((Handler) null, xk.setX.setOnFocusChangeListener());
                Intrinsics.checkNotNullExpressionValue(messageObtain, "");
                setX(new Object[]{messageObtain}, -1326672577, 1326672587, (int) System.currentTimeMillis());
                int i90 = G0;
                int i91 = i90 & 95;
                int i92 = (i90 ^ 95) | i91;
                int i93 = ((i91 | i92) << 1) - (i92 ^ i91);
                H0 = i93 % 128;
                if (i93 % 2 != 0) {
                    return null;
                }
                throw null;
            case 19:
                MainProcessManager mainProcessManager8 = (MainProcessManager) objArr[0];
                Activity activity = (Activity) objArr[1];
                int i94 = G0;
                int i95 = ((i94 & (-58)) | ((~i94) & 57)) + ((i94 & 57) << 1);
                H0 = i95 % 128;
                if (i95 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(activity, "");
                    Object x16 = setX(new Object[]{mainProcessManager8, wo.INSTANCE}, 177959407, -177959384, System.identityHashCode(mainProcessManager8));
                    Intrinsics.checkNotNull(x16, "");
                    return null;
                }
                Intrinsics.checkNotNullParameter(activity, "");
                Object x17 = setX(new Object[]{mainProcessManager8, wo.INSTANCE}, 177959407, -177959384, System.identityHashCode(mainProcessManager8));
                Intrinsics.checkNotNull(x17, "");
                int i96 = 41 / 0;
                return null;
            case 20:
                int i97 = G0;
                int i98 = (i97 ^ 91) + ((i97 & 91) << 1);
                H0 = i98 % 128;
                int i99 = i98 % 2;
                LinkedHashMap linkedHashMap2 = f61623t0;
                int i100 = (i97 & 17) + (i97 | 17);
                H0 = i100 % 128;
                int i101 = i100 % 2;
                return linkedHashMap2;
            case 21:
                MainProcessManager mainProcessManager9 = (MainProcessManager) objArr[0];
                Endpoint endpoint = (Endpoint) objArr[1];
                sd sdVar = (sd) objArr[2];
                st stVar = (st) objArr[3];
                Intrinsics.checkNotNullParameter(endpoint, "");
                Intrinsics.checkNotNullParameter(sdVar, "");
                Intrinsics.checkNotNullParameter(stVar, "");
                Object x18 = setX(new Object[]{mainProcessManager9, new vs(um.setOnFocusChangeListener(endpoint), um.setCompoundDrawableTintBlendMode(endpoint), um.setY(endpoint), um.setDividerPadding(endpoint), um.setX(endpoint), sdVar, stVar)}, 177959407, -177959384, System.identityHashCode(mainProcessManager9));
                Intrinsics.checkNotNull(x18, "");
                vp vpVar = (vp) x18;
                objM5535constructorimpl = (vr) vp.setY(new Object[]{vpVar}, 1751351831, -1751351831, System.identityHashCode(vpVar));
                int i102 = H0;
                int i103 = i102 & 59;
                int i104 = (i102 ^ 59) | i103;
                int i105 = (i103 & i104) + (i104 | i103);
                G0 = i105 % 128;
                if (i105 % 2 != 0) {
                    throw null;
                }
                break;
            case 22:
                int i106 = G0;
                int i107 = i106 & 7;
                int i108 = ((~i107) & (i106 | 7)) + (i107 << 1);
                H0 = i108 % 128;
                int i109 = i108 % 2;
                LinkedHashMap linkedHashMap3 = f61624u0;
                int i110 = i106 & 113;
                int i111 = (i106 | 113) & (~i110);
                int i112 = -(-(i110 << 1));
                int i113 = (i111 & i112) + (i111 | i112);
                H0 = i113 % 128;
                int i114 = i113 % 2;
                return linkedHashMap3;
            case 23:
                wi wiVar = (wi) objArr[1];
                CompletableFuture completableFutureB = d.b();
                Bundle bundle = new Bundle();
                bundle.putSerializable("mpm", wiVar);
                f00 f00Var3 = f00.f55459a;
                System.currentTimeMillis();
                int iIntValue2 = f00.a().intValue();
                Message messageObtain2 = Message.obtain(null, xk.setDividerPadding.setOnFocusChangeListener(), iIntValue2, ((wm) wi.setCompoundDrawableTintBlendMode(new Object[]{wiVar}, 1332936684, -1332936684, System.identityHashCode(wiVar))).ordinal(), bundle);
                Messenger messenger = f61620q0;
                if (messenger == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    messenger = null;
                }
                messageObtain2.replyTo = messenger;
                LinkedHashMap linkedHashMap4 = f61623t0;
                synchronized (linkedHashMap4) {
                    linkedHashMap4.put(Integer.valueOf(iIntValue2), completableFutureB);
                    Unit unit = Unit.INSTANCE;
                }
                Intrinsics.checkNotNullExpressionValue(messageObtain2, "");
                setX(new Object[]{messageObtain2, Integer.valueOf(iIntValue2)}, -1392882066, 1392882073, (int) System.currentTimeMillis());
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM5535constructorimpl = Result.m5535constructorimpl(completableFutureB.get(30000L, TimeUnit.MILLISECONDS));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                if (thM5538exceptionOrNullimpl != null) {
                    Throwable cause = thM5538exceptionOrNullimpl.getCause();
                    if (cause == null) {
                        cause = thM5538exceptionOrNullimpl;
                    }
                    mu.setCompoundDrawableTintBlendMode(new Object[]{100015, null, cause, 2}, -1968587119, 1968587120, 100015);
                    Throwable cause2 = thM5538exceptionOrNullimpl.getCause();
                    if (cause2 == null) {
                        throw thM5538exceptionOrNullimpl;
                    }
                    throw cause2;
                }
                break;
            case 24:
                MainProcessManager mainProcessManager10 = (MainProcessManager) objArr[0];
                UUID uuid = (UUID) objArr[1];
                byte[] bArr3 = (byte[]) objArr[2];
                Function0<Unit> function1 = (Function0) objArr[3];
                Intrinsics.checkNotNullParameter(uuid, "");
                Intrinsics.checkNotNullParameter(bArr3, "");
                Intrinsics.checkNotNullParameter(function1, "");
                v0 = function1;
                Object x19 = setX(new Object[]{mainProcessManager10, new vg(uuid, bArr3)}, 177959407, -177959384, System.identityHashCode(mainProcessManager10));
                Intrinsics.checkNotNull(x19, "");
                vn vnVar = (vn) x19;
                vj vjVar = (vj) vn.setY(new Object[]{vnVar}, -467680945, 467680945, System.identityHashCode(vnVar));
                int i115 = H0 + 123;
                G0 = i115 % 128;
                int i116 = i115 % 2;
                return vjVar;
            case 25:
                MainProcessManager mainProcessManager11 = (MainProcessManager) objArr[0];
                int i117 = H0;
                int i118 = i117 & 89;
                int i119 = (i117 ^ 89) | i118;
                int i120 = (i118 ^ i119) + ((i119 & i118) << 1);
                G0 = i120 % 128;
                int i121 = i120 % 2;
                setX(new Object[]{mainProcessManager11}, -861807164, 861807182, System.identityHashCode(mainProcessManager11));
                int i122 = H0;
                int i123 = i122 & 17;
                int i124 = (i122 | 17) & (~i123);
                int i125 = -(-(i123 << 1));
                int i126 = (i124 & i125) + (i124 | i125);
                G0 = i126 % 128;
                if (i126 % 2 == 0) {
                    return null;
                }
                throw null;
            case 26:
                MainProcessManager mainProcessManager12 = (MainProcessManager) objArr[0];
                int i127 = G0;
                int i128 = (i127 | 109) << 1;
                int i129 = -(((~i127) & 109) | (i127 & (-110)));
                int i130 = (i128 & i129) + (i129 | i128);
                H0 = i130 % 128;
                int i131 = i130 % 2;
                Object x20 = setX(new Object[]{mainProcessManager12, vu.INSTANCE}, 177959407, -177959384, System.identityHashCode(mainProcessManager12));
                Intrinsics.checkNotNull(x20, "");
                int i132 = H0;
                int i133 = ((i132 | 25) << 1) - (i132 ^ 25);
                G0 = i133 % 128;
                int i134 = i133 % 2;
                return null;
            case 27:
                CompletableFuture<Messenger> completableFutureC = cm.a.c(objArr[0]);
                int i135 = H0;
                int i136 = ((i135 ^ 56) + ((i135 & 56) << 1)) - 1;
                int i137 = i136 % 128;
                G0 = i137;
                int i138 = i136 % 2;
                f61619p0 = completableFutureC;
                int i139 = i137 & 63;
                int i140 = (((i137 ^ 63) | i139) << 1) - ((i137 | 63) & (~i139));
                H0 = i140 % 128;
                int i141 = i140 % 2;
                return null;
            case 28:
                MainProcessManager mainProcessManager13 = (MainProcessManager) objArr[0];
                sq sqVar = (sq) objArr[1];
                xd xdVar = (xd) objArr[2];
                Intrinsics.checkNotNullParameter(sqVar, "");
                Intrinsics.checkNotNullParameter(xdVar, "");
                f61625w0 = xdVar;
                Object x21 = setX(new Object[]{mainProcessManager13, new wx(sqVar)}, 177959407, -177959384, System.identityHashCode(mainProcessManager13));
                Intrinsics.checkNotNull(x21, "");
                int i142 = H0 + 99;
                G0 = i142 % 128;
                if (i142 % 2 == 0) {
                    return null;
                }
                throw null;
            case 29:
                MainProcessManager mainProcessManager14 = (MainProcessManager) objArr[0];
                Activity activity2 = (Activity) objArr[1];
                int i143 = G0;
                int i144 = ((i143 ^ 51) - (~(-(-((i143 & 51) << 1))))) - 1;
                H0 = i144 % 128;
                int i145 = i144 % 2;
                Intrinsics.checkNotNullParameter(activity2, "");
                Object x22 = setX(new Object[]{mainProcessManager14, wn.INSTANCE}, 177959407, -177959384, System.identityHashCode(mainProcessManager14));
                Intrinsics.checkNotNull(x22, "");
                int i146 = G0;
                int i147 = i146 & 75;
                int i148 = ((i146 ^ 75) | i147) << 1;
                int i149 = -((i146 | 75) & (~i147));
                int i150 = ((i148 | i149) << 1) - (i149 ^ i148);
                H0 = i150 % 128;
                if (i150 % 2 != 0) {
                    return null;
                }
                throw null;
            default:
                Tag tag = (Tag) objArr[1];
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("mpm", tag);
                f00 f00Var4 = f00.f55459a;
                System.currentTimeMillis();
                Message messageObtain3 = Message.obtain(null, xk.setY.setOnFocusChangeListener(), f00.a().intValue(), wm.setOnDragListener.ordinal(), bundle2);
                Messenger messenger2 = f61620q0;
                if (messenger2 == null) {
                    int i151 = H0;
                    int i152 = i151 ^ 75;
                    int i153 = ((((i151 & 75) | i152) << 1) - (~(-i152))) - 1;
                    G0 = i153 % 128;
                    if (i153 % 2 != 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    messenger2 = null;
                }
                messageObtain3.replyTo = messenger2;
                Intrinsics.checkNotNullExpressionValue(messageObtain3, "");
                setX(new Object[]{messageObtain3}, -1326672577, 1326672587, (int) System.currentTimeMillis());
                int i154 = H0;
                int i155 = i154 ^ 55;
                int i156 = (i154 & 55) << 1;
                int i157 = (i155 ^ i156) + ((i156 & i155) << 1);
                G0 = i157 % 128;
                if (i157 % 2 == 0) {
                    return null;
                }
                throw null;
        }
        return objM5535constructorimpl;
    }

    @Override // com.mypinpad.tsdk.isolation.sy
    public final void ah_(@NotNull Activity activity) throws Throwable {
        setX(new Object[]{this, activity}, -187368556, 187368585, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.sy
    public final void ai_(@NotNull Activity activity) throws Throwable {
        setX(new Object[]{this, activity}, 1437520694, -1437520675, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode() throws Throwable {
        setX(new Object[]{this}, -76332258, 76332266, System.identityHashCode(this));
    }

    public final void setOnLongClickListener() throws Throwable {
        setX(new Object[]{this}, 1296257365, -1296257351, System.identityHashCode(this));
    }

    public final void setY() throws Throwable {
        setX(new Object[]{this}, 1347538267, -1347538241, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode(@NotNull ok okVar) throws Throwable {
        setX(new Object[]{this, okVar}, 1998153295, -1998153291, System.identityHashCode(this));
    }

    @Nullable
    public final byte[] setDividerPadding() {
        return (byte[]) setX(new Object[]{this}, -1625062096, 1625062113, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@NotNull sq sqVar, @NotNull xd xdVar) throws Throwable {
        setX(new Object[]{this, sqVar, xdVar}, -1140183811, 1140183839, System.identityHashCode(this));
    }

    @NotNull
    public final vj setCompoundDrawableTintBlendMode(@NotNull UUID uuid, @NotNull byte[] bArr, @NotNull Function0<Unit> function0) {
        return (vj) setX(new Object[]{this, uuid, bArr, function0}, -1975912237, 1975912261, System.identityHashCode(this));
    }

    @NotNull
    public final vr setDividerPadding(@NotNull Endpoint endpoint, @NotNull sd sdVar, @NotNull st stVar) {
        return (vr) setX(new Object[]{this, endpoint, sdVar, stVar}, 388349257, -388349236, System.identityHashCode(this));
    }

    @Nullable
    public final String setOnFocusChangeListener() {
        return (String) setX(new Object[]{this}, -827323898, 827323911, System.identityHashCode(this));
    }

    public static void setOnFocusChangeListener(int i10) throws Throwable {
        setX(new Object[]{Integer.valueOf(i10)}, 1405103874, -1405103873, i10);
    }

    public final void setDividerPadding(float f6) throws Throwable {
        setX(new Object[]{this, Float.valueOf(f6)}, -1326524124, 1326524135, System.identityHashCode(this));
    }

    public static int setDividerPadding(@NotNull Function0<Unit> function0) {
        return ((Integer) setX(new Object[]{function0}, 177599820, -177599805, (int) System.currentTimeMillis())).intValue();
    }

    public final void setDividerPadding(@NotNull Context context) throws Throwable {
        setX(new Object[]{this, context}, -291544253, 291544262, System.identityHashCode(this));
    }

    public final void setX() throws Throwable {
        setX(new Object[]{this}, 1009986125, -1009986109, System.identityHashCode(this));
    }
}
