package com.mypinpad.tsdk.isolation;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.camera.core.impl.z;
import androidx.camera.core.processing.n;
import androidx.core.app.NotificationCompat;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.esotericsoftware.kryo.serializers.d;
import com.mypinpad.tsdk.api.errors.TerminalException;
import java.io.Serializable;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.mypinpad.tsdk.i.wh, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0002<=B\u0007¢\u0006\u0004\b:\u0010;J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\t\u0010\u0011\u001a\u00020\u0010H\u0082\bJ\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\"\u0010#\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!H\u0002R\u001c\u0010&\u001a\n %*\u0004\u0018\u00010$0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010*\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0007\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010-\u001a\u00060,R\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006>"}, d2 = {"Lcom/mypinpad/tsdk/isolation/IsolatedService;", "Landroid/app/Service;", "Lcom/mypinpad/tsdk/internal/terminal/ActivityLifecycleCallbacksHandler;", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "", "onCreate", "onDestroy", "Landroid/os/Messenger;", "messenger", "Landroid/os/Message;", NotificationCompat.CATEGORY_MESSAGE, "", "doSendServiceEvent", "", HearingDisabilitiesConstants.EXIT_VIDEO_CALL, "receiver", "Lcom/mypinpad/tsdk/isolation/MainProcessRequest;", "serviceRequest", "Lcom/mypinpad/tsdk/isolation/MainProcessResponse;", "handleMainProcessRequest", "Landroid/nfc/Tag;", LogKeysKt.TAG, "handleNfcTagFoundServiceRequest", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "onActivityPaused", "onActivityResumed", "eventReceiver", "Lcom/mypinpad/tsdk/isolation/IsolatedProcessRequest;", "isolatedProcessRequest", "Lcom/mypinpad/tsdk/isolation/WHAT;", "what", "sendRequestToMainProcess", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "executors", "Ljava/util/concurrent/ExecutorService;", "Lkotlin/Function1;", "Lcom/mypinpad/tsdk/internal/sdk/callbacks/SdkHandlePinPadLaunchRequestResult;", "launchPinPadCallback", "Lkotlin/jvm/functions/Function1;", "Lcom/mypinpad/tsdk/isolation/IsolatedService$IsolatedServiceHandler;", "serviceHandler", "Lcom/mypinpad/tsdk/isolation/IsolatedService$IsolatedServiceHandler;", "Landroid/os/Looper;", "serviceLooper", "Landroid/os/Looper;", "serviceMessenger", "Landroid/os/Messenger;", "Lcom/mypinpad/tsdk/internal/terminal/AndroidTerminal;", "terminal", "Lcom/mypinpad/tsdk/internal/terminal/AndroidTerminal;", "Lcom/mypinpad/tsdk/internal/terminal/session/IsolatedTerminalSession;", "terminalSession", "Lcom/mypinpad/tsdk/internal/terminal/session/IsolatedTerminalSession;", "<init>", "()V", "Companion", "IsolatedServiceHandler", "sdk-android_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIsolatedService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IsolatedService.kt\ncom/mypinpad/tsdk/isolation/IsolatedService\n*L\n1#1,508:1\n477#1,9:509\n*S KotlinDebug\n*F\n+ 1 IsolatedService.kt\ncom/mypinpad/tsdk/isolation/IsolatedService\n*L\n106#1:509,9\n*E\n"})
public final class IsolatedService extends Service implements sy {

    @NotNull
    public static final setOnFocusChangeListener setCompoundDrawableTintBlendMode = new setOnFocusChangeListener(null);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f61638w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f61639x0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Looper f61640p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public a f61641q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Messenger f61642r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public sw f61643s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public tn f61644t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public Function1<? super rb, Unit> f61645u0;
    public final ExecutorService v0 = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.wh$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setOnFocusChangeListener", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nIsolatedService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IsolatedService.kt\ncom/mypinpad/tsdk/isolation/IsolatedService$exit$1\n*L\n1#1,508:1\n*E\n"})
    public static final class AnonymousClass2 extends Lambda implements Function0<Unit> {
        public static final AnonymousClass2 setOnFocusChangeListener = new AnonymousClass2();

        static {
            int i10 = 1 & 19;
            int i11 = i10 + ((1 ^ 19) | i10);
            int i12 = i11 % 128;
            int i13 = i11 % 2;
        }

        public AnonymousClass2() {
            super(0);
        }

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i11;
            int i14 = ~i12;
            if ((((~(i10 | i12)) | (~((~i10) | i14)) | (~(i11 | i12))) * 831) + ((~(i13 | i10 | i12)) * (-1662)) + (((~(i13 | i14)) | (~(i10 | i11 | i12))) * (-831)) + (i11 * 832) + (i10 * (-830)) != 1) {
                throw new Error();
            }
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) objArr[0];
            setY(new Object[]{anonymousClass2}, -1424612502, 1424612502, System.identityHashCode(anonymousClass2));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Unit] */
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            return setY(new Object[]{this}, 945650749, -945650748, System.identityHashCode(this));
        }

        public final void setOnFocusChangeListener() {
            setY(new Object[]{this}, -1424612502, 1424612502, System.identityHashCode(this));
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.wh$a */
    @SourceDebugExtension({"SMAP\nIsolatedService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IsolatedService.kt\ncom/mypinpad/tsdk/isolation/IsolatedService$IsolatedServiceHandler\n+ 2 IsolatedService.kt\ncom/mypinpad/tsdk/isolation/IsolatedService\n*L\n1#1,508:1\n477#2,9:509\n*S KotlinDebug\n*F\n+ 1 IsolatedService.kt\ncom/mypinpad/tsdk/isolation/IsolatedService$IsolatedServiceHandler\n*L\n386#1:509,9\n*E\n"})
    public final class a extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f61646b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f61647c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IsolatedService f61648a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull IsolatedService isolatedService, Looper looper) {
            super(looper);
            Intrinsics.checkNotNullParameter(looper, "");
            this.f61648a = isolatedService;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:17:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:18:0x010a  */
        /* JADX WARN: Code duplicated, block: B:20:0x012c  */
        /* JADX WARN: Code duplicated, block: B:23:0x013a  */
        /* JADX WARN: Code duplicated, block: B:27:0x0145  */
        /* JADX WARN: Code duplicated, block: B:29:0x014d  */
        /* JADX WARN: Code duplicated, block: B:31:0x01b6  */
        /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
        public static /* synthetic */ void a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            wl wgVar;
            String str;
            String str2;
            int i13;
            String str3;
            Tag tag;
            int i14;
            int i15;
            int i16 = ~i10;
            int i17 = ~i11;
            int i18 = i16 | i17;
            int i19 = ~(i18 | i12);
            int i20 = ~i12;
            int i21 = (((~(i10 | i17 | i12)) | (~(i11 | i16 | i12)) | (~(i18 | i20))) * 920) + (((~i18) | (~(i16 | i20))) * 920) + ((i19 | (~(i17 | i20 | i10))) * 920) + (i11 * (-919)) + (i10 * (-919));
            int i22 = 1;
            if (i21 == 1) {
                Messenger messenger = (Messenger) objArr[0];
                IsolatedService isolatedService = (IsolatedService) objArr[1];
                wi wiVar = (wi) objArr[2];
                int iIntValue = ((Number) objArr[3]).intValue();
                Intrinsics.checkNotNullParameter(isolatedService, "");
                Intrinsics.checkNotNullParameter(wiVar, "");
                try {
                    if (messenger != null) {
                        try {
                            wgVar = (wl) IsolatedService.setOnFocusChangeListener(new Object[]{isolatedService, messenger, wiVar}, -1559148458, 1559148461, (int) System.currentTimeMillis());
                        } catch (Exception e5) {
                            String message = e5.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            wgVar = new wg(message);
                        }
                        Message messageObtain = Message.obtain((Handler) null, xk.setOnFocusChangeListener.setOnFocusChangeListener());
                        messageObtain.arg1 = iIntValue;
                        messageObtain.arg2 = ((wm) wl.setOnFocusChangeListener(new Object[]{wgVar}, 450664847, -450664847, System.identityHashCode(wgVar))).ordinal();
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("mpm", wgVar);
                        messageObtain.obj = bundle;
                        messenger.send(messageObtain);
                        return;
                    }
                    return;
                } catch (RemoteException unused) {
                    return;
                }
            }
            if (i21 == 2) {
                IsolatedService isolatedService2 = (IsolatedService) objArr[0];
                Tag tag2 = (Tag) objArr[1];
                int i23 = f61646b + 39;
                f61647c = i23 % 128;
                int i24 = i23 % 2;
                Intrinsics.checkNotNullParameter(isolatedService2, "");
                Intrinsics.checkNotNullParameter(tag2, "");
                IsolatedService.setOnFocusChangeListener(new Object[]{isolatedService2, tag2}, -1603427448, 1603427454, (int) System.currentTimeMillis());
                int i25 = f61646b;
                int i26 = (i25 ^ 45) + ((i25 & 45) << 1);
                f61647c = i26 % 128;
                int i27 = i26 % 2;
                return;
            }
            a aVar = (a) objArr[0];
            Message message2 = (Message) objArr[1];
            int i28 = f61646b;
            int i29 = (i28 ^ 120) + ((i28 & 120) << 1);
            int i30 = (i29 ^ (-1)) + (i29 << 1);
            f61647c = i30 % 128;
            if (i30 % 2 != 0) {
                str = "mpm";
                Intrinsics.checkNotNullParameter(message2, "");
                str2 = "";
                wk.setX(new Object[]{"isolated process handleMessage", message2}, 384055832, -384055830, (int) System.currentTimeMillis());
                wk.setX(new Object[]{100021, message2}, -1911741029, 1911741029, 100021);
                i13 = message2.what;
                if (i13 != xk.setY.setOnFocusChangeListener()) {
                    str3 = str;
                    if (i13 != xk.setX.setOnFocusChangeListener()) {
                        IsolatedService isolatedService3 = aVar.f61648a;
                        System.exit(0);
                        Runtime.getRuntime().exit(0);
                        ThreadsKt.thread$default(true, false, null, null, 0, AnonymousClass2.setOnFocusChangeListener, 30, null);
                        System.exit(0);
                        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
                    }
                    if (i13 == xk.setDividerPadding.setOnFocusChangeListener()) {
                        int i31 = f61646b;
                        int i32 = i31 & 1;
                        int i33 = (i31 | 1) & (~i32);
                        int i34 = -(-(i32 << 1));
                        int i35 = ((i33 | i34) << 1) - (i33 ^ i34);
                        f61647c = i35 % 128;
                        int i36 = i35 % 2;
                        final int i37 = message2.arg1;
                        final Messenger messenger2 = message2.replyTo;
                        Object obj = message2.obj;
                        Intrinsics.checkNotNull(obj, str2);
                        Serializable serializable = ((Bundle) obj).getSerializable(str3);
                        Intrinsics.checkNotNull(serializable, str2);
                        final wi wiVar2 = (wi) serializable;
                        ExecutorService executorService = (ExecutorService) IsolatedService.setOnFocusChangeListener(new Object[]{aVar.f61648a}, -1143131348, 1143131359, (int) System.currentTimeMillis());
                        final IsolatedService isolatedService4 = aVar.f61648a;
                        executorService.execute(new Runnable() { // from class: com.mypinpad.tsdk.i.n00
                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                int i38 = i37;
                                IsolatedService.a.a(new Object[]{messenger2, isolatedService4, wiVar2, Integer.valueOf(i38)}, -359979460, 359979461, i38);
                            }
                        });
                        int i38 = f61646b + 91;
                        f61647c = i38 % 128;
                        int i39 = i38 % 2;
                    }
                    int i40 = f61646b;
                    int i41 = i40 | 109;
                    int i42 = i41 << 1;
                    int i43 = -((~(i40 & 109)) & i41);
                    int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                    f61647c = i44 % 128;
                    int i45 = i44 % 2;
                }
                Object obj2 = message2.obj;
                Intrinsics.checkNotNull(obj2, str2);
                tag = (Tag) ((Bundle) obj2).getParcelable(str);
                if (tag != null) {
                    i14 = f61646b + 11;
                    f61647c = i14 % 128;
                    if (i14 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                int i46 = f61647c;
                int i47 = i46 & 109;
                int i48 = i46 | 109;
                i15 = (i47 ^ i48) + ((i48 & i47) << 1);
                f61646b = i15 % 128;
                if (i15 % 2 == 0) {
                    IsolatedService isolatedService5 = aVar.f61648a;
                    ((ExecutorService) IsolatedService.setOnFocusChangeListener(new Object[]{isolatedService5}, -1143131348, 1143131359, (int) System.currentTimeMillis())).execute(new z(isolatedService5, tag, i22));
                    return;
                } else {
                    IsolatedService isolatedService6 = aVar.f61648a;
                    ((ExecutorService) IsolatedService.setOnFocusChangeListener(new Object[]{isolatedService6}, -1143131348, 1143131359, (int) System.currentTimeMillis())).execute(new n(isolatedService6, tag, 3));
                    throw null;
                }
            }
            Intrinsics.checkNotNullParameter(message2, "");
            str = "mpm";
            wk.setX(new Object[]{"isolated process handleMessage", message2}, 384055832, -384055830, (int) System.currentTimeMillis());
            wk.setX(new Object[]{100021, message2}, -1911741029, 1911741029, 100021);
            i13 = message2.what;
            int i49 = 50 / 0;
            if (i13 == xk.setY.setOnFocusChangeListener()) {
                str2 = "";
                Object obj3 = message2.obj;
                Intrinsics.checkNotNull(obj3, str2);
                tag = (Tag) ((Bundle) obj3).getParcelable(str);
                if (tag != null) {
                    i14 = f61646b + 11;
                    f61647c = i14 % 128;
                    if (i14 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                int i410 = f61647c;
                int i411 = i410 & 109;
                int i412 = i410 | 109;
                i15 = (i411 ^ i412) + ((i412 & i411) << 1);
                f61646b = i15 % 128;
                if (i15 % 2 == 0) {
                    IsolatedService isolatedService7 = aVar.f61648a;
                    ((ExecutorService) IsolatedService.setOnFocusChangeListener(new Object[]{isolatedService7}, -1143131348, 1143131359, (int) System.currentTimeMillis())).execute(new z(isolatedService7, tag, i22));
                    return;
                } else {
                    IsolatedService isolatedService8 = aVar.f61648a;
                    ((ExecutorService) IsolatedService.setOnFocusChangeListener(new Object[]{isolatedService8}, -1143131348, 1143131359, (int) System.currentTimeMillis())).execute(new n(isolatedService8, tag, 3));
                    throw null;
                }
            }
            str3 = str;
            str2 = "";
            if (i13 != xk.setX.setOnFocusChangeListener()) {
                IsolatedService isolatedService9 = aVar.f61648a;
                System.exit(0);
                Runtime.getRuntime().exit(0);
                ThreadsKt.thread$default(true, false, null, null, 0, AnonymousClass2.setOnFocusChangeListener, 30, null);
                System.exit(0);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
            if (i13 == xk.setDividerPadding.setOnFocusChangeListener()) {
                int i310 = f61646b;
                int i311 = i310 & 1;
                int i312 = (i310 | 1) & (~i311);
                int i313 = -(-(i311 << 1));
                int i314 = ((i312 | i313) << 1) - (i312 ^ i313);
                f61647c = i314 % 128;
                int i315 = i314 % 2;
                final int i316 = message2.arg1;
                final Messenger messenger3 = message2.replyTo;
                Object obj4 = message2.obj;
                Intrinsics.checkNotNull(obj4, str2);
                Serializable serializable2 = ((Bundle) obj4).getSerializable(str3);
                Intrinsics.checkNotNull(serializable2, str2);
                final wi wiVar3 = (wi) serializable2;
                ExecutorService executorService2 = (ExecutorService) IsolatedService.setOnFocusChangeListener(new Object[]{aVar.f61648a}, -1143131348, 1143131359, (int) System.currentTimeMillis());
                final IsolatedService isolatedService10 = aVar.f61648a;
                executorService2.execute(new Runnable() { // from class: com.mypinpad.tsdk.i.n00
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        int i317 = i316;
                        IsolatedService.a.a(new Object[]{messenger3, isolatedService10, wiVar3, Integer.valueOf(i317)}, -359979460, 359979461, i317);
                    }
                });
                int i317 = f61646b + 91;
                f61647c = i317 % 128;
                int i318 = i317 % 2;
            }
            int i413 = f61646b;
            int i414 = i413 | 109;
            int i415 = i414 << 1;
            int i416 = -((~(i413 & 109)) & i414);
            int i417 = (i415 ^ i416) + ((i416 & i415) << 1);
            f61647c = i417 % 128;
            int i418 = i417 % 2;
        }

        @Override // android.os.Handler
        public final void handleMessage(@NotNull Message message) throws Throwable {
            a(new Object[]{this, message}, 1438806404, -1438806404, System.identityHashCode(this));
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.wh$setDividerPadding */
    public final class setDividerPadding implements re {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ IsolatedService f61649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Messenger f61650b;

        /* JADX INFO: renamed from: com.mypinpad.tsdk.i.wh$setDividerPadding$a */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/rb;", "p0", "", "setX", "(Lcom/mypinpad/tsdk/i/rb;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class a extends Lambda implements Function1<rb, Unit> {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public static int f61651q0 = 0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public static int f61652r0 = 1;

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ CompletableFuture<rb> f61653p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(CompletableFuture<rb> completableFuture) {
                super(1);
                this.f61653p0 = completableFuture;
            }

            public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
                int i13 = ((~(i10 | i12)) * 216) + (i11 * (-215)) + (i10 * 217);
                int i14 = (~i11) | i10;
                int i15 = ~i12;
                if ((((~(i10 | i15)) | i11) * 216) + ((i14 | i15) * (-216)) + i13 != 1) {
                    a aVar = (a) objArr[0];
                    Object obj = objArr[1];
                    int i16 = f61652r0;
                    int i17 = ((i16 ^ 16) + ((i16 & 16) << 1)) - 1;
                    f61651q0 = i17 % 128;
                    int i18 = i17 % 2;
                    a(new Object[]{aVar, (rb) obj}, -1136635972, 1136635973, System.identityHashCode(aVar));
                    Unit unit = Unit.INSTANCE;
                    int i19 = f61651q0;
                    int i20 = i19 & 63;
                    int i21 = (((i19 | 63) & (~i20)) - (~(i20 << 1))) - 1;
                    f61652r0 = i21 % 128;
                    if (i21 % 2 != 0) {
                        return unit;
                    }
                    throw null;
                }
                a aVar2 = (a) objArr[0];
                rb rbVar = (rb) objArr[1];
                int i22 = f61652r0;
                int i23 = ((((i22 ^ 19) | (i22 & 19)) << 1) - (~(-(((~i22) & 19) | (i22 & (-20)))))) - 1;
                f61651q0 = i23 % 128;
                if (i23 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(rbVar, "");
                    aVar2.f61653p0.complete(rbVar);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(rbVar, "");
                aVar2.f61653p0.complete(rbVar);
                int i24 = f61652r0;
                int i25 = ((i24 | 29) << 1) - (i24 ^ 29);
                f61651q0 = i25 % 128;
                int i26 = i25 % 2;
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(rb rbVar) {
                return a(new Object[]{this, rbVar}, -67434578, 67434578, System.identityHashCode(this));
            }
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            CompletableFuture completableFutureB = d.b();
            IsolatedService.setOnFocusChangeListener(new Object[]{setdividerpadding.f61649a, new a(completableFutureB)}, -187806780, 187806781, (int) System.currentTimeMillis());
            IsolatedService.setOnFocusChangeListener(new Object[]{setdividerpadding.f61649a, setdividerpadding.f61650b, wt.INSTANCE}, -2024684754, 2024684762, (int) System.currentTimeMillis());
            Object obj = completableFutureB.get();
            Intrinsics.checkNotNullExpressionValue(obj, "");
            return (rb) obj;
        }

        @Override // com.mypinpad.tsdk.isolation.re
        @NotNull
        public final rb setDividerPadding() {
            return (rb) setCompoundDrawableTintBlendMode(new Object[]{this}, -1138922936, 1138922936, System.identityHashCode(this));
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.wh$setOnFocusChangeListener */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/wh$setOnFocusChangeListener;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class setOnFocusChangeListener {
        public setOnFocusChangeListener() {
        }

        public /* synthetic */ setOnFocusChangeListener(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.wh$setX */
    public final class setX implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ IsolatedService f61654p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Messenger f61655q0;

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            int i13 = ((i11 | i12) * 140) + (i11 * (-279)) + (i10 * 141);
            int i14 = (~i10) | i11;
            int i15 = ~i14;
            int i16 = ~i12;
            if ((((~(i10 | i16)) | (~((~i11) | i10)) | (~(i14 | i12))) * 140) + ((i15 | (~(i16 | i11))) * (-280)) + i13 != 1) {
                setX setx = (setX) objArr[0];
                setOnFocusChangeListener(new Object[]{setx}, -1037600008, 1037600009, System.identityHashCode(setx));
                return Unit.INSTANCE;
            }
            setX setx2 = (setX) objArr[0];
            pc.setY(new ou(null, null, 10060, null, 11, null));
            IsolatedService.setOnFocusChangeListener(new Object[]{setx2.f61654p0, setx2.f61655q0, xg.INSTANCE}, -2024684754, 2024684762, (int) System.currentTimeMillis());
            return null;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Unit] */
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            return setOnFocusChangeListener(new Object[]{this}, -1506785454, 1506785454, System.identityHashCode(this));
        }
    }

    static {
        int i10 = f61638w0;
        int i11 = (((i10 | 92) << 1) - (i10 ^ 92)) - 1;
        f61639x0 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 60 / 0;
        }
    }

    public static /* synthetic */ void a(Object[] objArr) {
        IsolatedService isolatedService = (IsolatedService) objArr[0];
        Function1<? super rb, Unit> function1 = (Function1) objArr[1];
        int i10 = f61638w0;
        int i11 = i10 ^ 15;
        int i12 = (i10 & 15) << 1;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        int i14 = i13 % 128;
        f61639x0 = i14;
        int i15 = i13 % 2;
        isolatedService.f61645u0 = function1;
        if (i15 == 0) {
            throw null;
        }
        int i16 = (-2) - (((i14 ^ 16) + ((i14 & 16) << 1)) ^ (-1));
        f61638w0 = i16 % 128;
        int i17 = i16 % 2;
    }

    public static final /* synthetic */ wl ae_(IsolatedService isolatedService, Messenger messenger, wi wiVar) {
        return (wl) setOnFocusChangeListener(new Object[]{isolatedService, messenger, wiVar}, -1559148458, 1559148461, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ void b(Object[] objArr) {
        IsolatedService isolatedService = (IsolatedService) objArr[0];
        Activity activity = (Activity) objArr[1];
        int i10 = f61638w0;
        int i11 = i10 & 61;
        int i12 = (i11 - (~(-(-((i10 ^ 61) | i11))))) - 1;
        f61639x0 = i12 % 128;
        int i13 = i12 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        mt.setX(new Object[]{mr.setImageResource, "Isolated Process Activity Resumed"}, 135701020, -135701017, (int) System.currentTimeMillis());
        tn tnVar = isolatedService.f61644t0;
        if (tnVar != null) {
            int i14 = f61638w0;
            int i15 = (i14 ^ 47) + ((i14 & 47) << 1);
            f61639x0 = i15 % 128;
            if (i15 % 2 != 0) {
                tnVar.setCompoundDrawableTintBlendMode();
                return;
            } else {
                tnVar.setCompoundDrawableTintBlendMode();
                throw null;
            }
        }
        int i16 = f61638w0;
        int i17 = i16 & 49;
        int i18 = (i16 ^ 49) | i17;
        int i19 = (i17 & i18) + (i18 | i17);
        f61639x0 = i19 % 128;
        if (i19 % 2 == 0) {
            throw null;
        }
    }

    public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        int i13;
        Object wcVar;
        Pair pair;
        rk onFocusChangeListener;
        vn vnVar;
        String str;
        rh rhVar;
        rh rhVar2;
        ri onFocusChangeListener2;
        int i14 = ~i10;
        int i15 = i14 | i11;
        int i16 = (((~i15) | (~(i14 | i12)) | (~(i11 | i12))) * (-754)) + (i11 * (-753)) + (i10 * 755);
        int i17 = ~(i15 | i12);
        int i18 = ~i12;
        boolean z10 = true;
        Messenger messenger = null;
        y = null;
        getDynamicButtonIconTextSpacingDp y7 = null;
        Messenger messenger2 = null;
        switch (((i14 | i18) * 754) + (((~(i10 | i18 | i11)) | i17) * (-754)) + i16) {
            case 1:
                a(objArr);
                return null;
            case 2:
                IsolatedService isolatedService = (IsolatedService) objArr[0];
                int i19 = f61638w0;
                int i20 = (i19 & 103) + (i19 | 103);
                int i21 = i20 % 128;
                f61639x0 = i21;
                int i22 = i20 % 2;
                Messenger messenger3 = isolatedService.f61642r0;
                if (messenger3 == null) {
                    int i23 = (i21 ^ 33) + ((i21 & 33) << 1);
                    f61638w0 = i23 % 128;
                    int i24 = i23 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i25 = f61639x0;
                    int i26 = (i25 ^ 13) + ((i25 & 13) << 1);
                    f61638w0 = i26 % 128;
                    int i27 = i26 % 2;
                } else {
                    messenger = messenger3;
                }
                IBinder binder = messenger.getBinder();
                int i28 = f61639x0 + 23;
                f61638w0 = i28 % 128;
                int i29 = i28 % 2;
                return binder;
            case 3:
                IsolatedService isolatedService2 = (IsolatedService) objArr[0];
                Messenger messenger4 = (Messenger) objArr[1];
                wi wiVar = (wi) objArr[2];
                int i30 = f61638w0;
                int i31 = i30 & 39;
                int i32 = (i30 | 39) & (~i31);
                int i33 = i31 << 1;
                int i34 = (i32 & i33) + (i32 | i33);
                f61639x0 = i34 % 128;
                if (i34 % 2 != 0) {
                    return (wl) setOnFocusChangeListener(new Object[]{isolatedService2, messenger4, wiVar}, -1967330205, 1967330219, System.identityHashCode(isolatedService2));
                }
                throw null;
            case 4:
                b(objArr);
                return null;
            case 5:
                IsolatedService isolatedService3 = (IsolatedService) objArr[0];
                Tag tag = (Tag) objArr[1];
                int i35 = f61638w0;
                int i36 = i35 & 43;
                int i37 = i36 + ((i35 ^ 43) | i36);
                f61639x0 = i37 % 128;
                int i38 = i37 % 2;
                IsoDep isoDep = IsoDep.get(tag);
                if (isoDep != null) {
                    mr mrVar = mr.setY;
                    StringBuilder sb2 = new StringBuilder("found tag[");
                    sb2.append(tag);
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                    mt.setX(new Object[]{mrVar, sb2.toString()}, 135701020, -135701017, (int) System.currentTimeMillis());
                    mu.setCompoundDrawableTintBlendMode(new Object[]{150002, getDisplayExponent.setY(String.valueOf(tag)), null, 4}, -1968587119, 1968587120, 150002);
                    tn tnVar = isolatedService3.f61644t0;
                    if (tnVar != null) {
                        Context applicationContext = isolatedService3.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                        tnVar.setY(new oe(new ny(applicationContext, tnVar.setDividerPadding()), isoDep));
                        int i39 = f61638w0;
                        i13 = ((((i39 ^ 113) | (i39 & 113)) << 1) - (~(-(((~i39) & 113) | (i39 & (-114)))))) - 1;
                        f61639x0 = i13 % 128;
                    } else {
                        int i40 = f61639x0;
                        int i41 = i40 & 81;
                        i13 = (i41 - (~(-(-((i40 ^ 81) | i41))))) - 1;
                        f61638w0 = i13 % 128;
                    }
                    int i42 = i13 % 2;
                    return null;
                }
                mr mrVar2 = mr.setY;
                StringBuilder sb3 = new StringBuilder("Ignoring non-IsoDep tag[");
                sb3.append(tag);
                sb3.append(AbstractJsonLexerKt.END_LIST);
                mt.setX(new Object[]{mrVar2, sb3.toString()}, 135701020, -135701017, (int) System.currentTimeMillis());
                tn tnVar2 = isolatedService3.f61644t0;
                if (tnVar2 != null) {
                    tnVar2.setDividerPadding(new TerminalException(3, null, null, 6, null));
                    int i43 = f61639x0;
                    int i44 = (i43 ^ 75) + ((i43 & 75) << 1);
                    f61638w0 = i44 % 128;
                    if (i44 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                int i45 = f61638w0;
                int i46 = (i45 ^ 117) + ((i45 & 117) << 1);
                f61639x0 = i46 % 128;
                if (i46 % 2 != 0) {
                    return null;
                }
                int i47 = 81 / 0;
                return null;
            case 6:
                IsolatedService isolatedService4 = (IsolatedService) objArr[0];
                Tag tag2 = (Tag) objArr[1];
                int i48 = f61638w0;
                int i49 = i48 & 93;
                int i50 = -(-((i48 ^ 93) | i49));
                int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
                f61639x0 = i51 % 128;
                int i52 = i51 % 2;
                setOnFocusChangeListener(new Object[]{isolatedService4, tag2}, 1935942681, -1935942676, System.identityHashCode(isolatedService4));
                int i53 = f61639x0;
                int i54 = ((i53 ^ 11) | (i53 & 11)) << 1;
                int i55 = -(((~i53) & 11) | (i53 & (-12)));
                int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
                f61638w0 = i56 % 128;
                if (i56 % 2 == 0) {
                    return null;
                }
                int i57 = 49 / 0;
                return null;
            case 7:
                IsolatedService isolatedService5 = (IsolatedService) objArr[0];
                Messenger messenger5 = (Messenger) objArr[1];
                we weVar = (we) objArr[2];
                xk xkVar = (xk) objArr[3];
                int i58 = f61639x0;
                int i59 = i58 & 93;
                int i60 = (93 | i58) & (~i59);
                int i61 = -(-(i59 << 1));
                int i62 = ((i60 | i61) << 1) - (i60 ^ i61);
                f61638w0 = i62 % 128;
                Object[] objArr2 = new Object[4];
                if (i62 % 2 != 0) {
                    objArr2[0] = isolatedService5;
                    objArr2[1] = messenger5;
                    objArr2[2] = weVar;
                    objArr2[3] = xkVar;
                    setOnFocusChangeListener(objArr2, 1461281491, -1461281491, System.identityHashCode(isolatedService5));
                    throw null;
                }
                objArr2[0] = isolatedService5;
                objArr2[1] = messenger5;
                objArr2[2] = weVar;
                objArr2[3] = xkVar;
                setOnFocusChangeListener(objArr2, 1461281491, -1461281491, System.identityHashCode(isolatedService5));
                int i63 = f61639x0 + 87;
                f61638w0 = i63 % 128;
                if (i63 % 2 == 0) {
                    return null;
                }
                int i64 = 71 / 0;
                return null;
            case 8:
                IsolatedService isolatedService6 = (IsolatedService) objArr[0];
                Messenger messenger6 = (Messenger) objArr[1];
                we weVar2 = (we) objArr[2];
                int i65 = f61638w0;
                int i66 = i65 & 45;
                int i67 = (i66 - (~(-(-((i65 ^ 45) | i66))))) - 1;
                f61639x0 = i67 % 128;
                if (i67 % 2 == 0) {
                    setOnFocusChangeListener(new Object[]{isolatedService6, messenger6, weVar2, xk.setCompoundDrawableTintBlendMode}, 1461281491, -1461281491, System.identityHashCode(isolatedService6));
                    throw null;
                }
                setOnFocusChangeListener(new Object[]{isolatedService6, messenger6, weVar2, xk.setCompoundDrawableTintBlendMode}, 1461281491, -1461281491, System.identityHashCode(isolatedService6));
                int i68 = f61638w0;
                int i69 = (((i68 | 116) << 1) - (i68 ^ 116)) - 1;
                f61639x0 = i69 % 128;
                if (i69 % 2 != 0) {
                    return null;
                }
                throw null;
            case 9:
                IsolatedService isolatedService7 = (IsolatedService) objArr[0];
                int i70 = f61639x0;
                int i71 = ((i70 ^ 91) - (~((i70 & 91) << 1))) - 1;
                f61638w0 = i71 % 128;
                int i72 = i71 % 2;
                super.onDestroy();
                sx sxVar = sx.INSTANCE;
                sxVar.setCompoundDrawableTintBlendMode(isolatedService7);
                Context applicationContext2 = isolatedService7.getApplicationContext();
                Intrinsics.checkNotNull(applicationContext2, "");
                ((Application) applicationContext2).unregisterActivityLifecycleCallbacks(sxVar);
                int i73 = f61639x0;
                int i74 = (i73 & 79) + (i73 | 79);
                f61638w0 = i74 % 128;
                if (i74 % 2 == 0) {
                    return null;
                }
                throw null;
            case 10:
                Intrinsics.checkNotNullParameter((IsolatedService) objArr[0], "");
                System.exit(0);
                Runtime.getRuntime().exit(0);
                ThreadsKt.thread$default(true, false, null, null, 0, AnonymousClass2.setOnFocusChangeListener, 30, null);
                System.exit(0);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            case 11:
                IsolatedService isolatedService8 = (IsolatedService) objArr[0];
                int i75 = f61639x0;
                int i76 = i75 & 53;
                int i77 = (i75 ^ 53) | i76;
                int i78 = (i76 & i77) + (i76 | i77);
                f61638w0 = i78 % 128;
                int i79 = i78 % 2;
                ExecutorService executorService = isolatedService8.v0;
                int i80 = (i75 & 105) + (i75 | 105);
                f61638w0 = i80 % 128;
                int i81 = i80 % 2;
                return executorService;
            case 12:
                IsolatedService isolatedService9 = (IsolatedService) objArr[0];
                Messenger messenger7 = (Messenger) objArr[1];
                Message message = (Message) objArr[2];
                try {
                    wk.setX(new Object[]{"Send to main process", message}, 384055832, -384055830, (int) System.currentTimeMillis());
                    Messenger messenger8 = isolatedService9.f61642r0;
                    if (messenger8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        messenger2 = messenger8;
                    }
                    synchronized (messenger2) {
                        messenger7.send(message);
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (RemoteException unused) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 13:
                IsolatedService isolatedService10 = (IsolatedService) objArr[0];
                Activity activity = (Activity) objArr[1];
                int i82 = f61638w0;
                int i83 = i82 & 11;
                int i84 = i83 + ((i82 ^ 11) | i83);
                f61639x0 = i84 % 128;
                if (i84 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(activity, "");
                    mt.setX(new Object[]{mr.setImageResource, "Isolated Process Activity Paused"}, 135701020, -135701017, (int) System.currentTimeMillis());
                    tn tnVar3 = isolatedService10.f61644t0;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(activity, "");
                mt.setX(new Object[]{mr.setImageResource, "Isolated Process Activity Paused"}, 135701020, -135701017, (int) System.currentTimeMillis());
                tn tnVar4 = isolatedService10.f61644t0;
                if (tnVar4 == null) {
                    int i85 = f61639x0 + 25;
                    f61638w0 = i85 % 128;
                    if (i85 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                tnVar4.setX();
                int i86 = f61638w0;
                int i87 = (((i86 & (-52)) | ((~i86) & 51)) - (~((i86 & 51) << 1))) - 1;
                f61639x0 = i87 % 128;
                if (i87 % 2 != 0) {
                    return null;
                }
                throw null;
            case 14:
                final IsolatedService isolatedService11 = (IsolatedService) objArr[0];
                Messenger messenger9 = (Messenger) objArr[1];
                wi wiVar2 = (wi) objArr[2];
                if (wiVar2 instanceof vy) {
                    tb tbVar = tb.INSTANCE;
                    Context applicationContext3 = isolatedService11.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext3, "");
                    tbVar.setX(applicationContext3);
                    messenger9.getBinder().linkToDeath(new IBinder.DeathRecipient() { // from class: com.mypinpad.tsdk.i.h00
                        @Override // android.os.IBinder.DeathRecipient
                        public final void binderDied() throws Throwable {
                            IsolatedService.setOnFocusChangeListener setonfocuschangelistener = IsolatedService.setCompoundDrawableTintBlendMode;
                            IsolatedService.setOnFocusChangeListener(new Object[]{this.f56122a}, 602964632, -602964622, (int) System.currentTimeMillis());
                        }
                    }, 0);
                    ms.INSTANCE.setCompoundDrawableTintBlendMode(new l00(isolatedService11, messenger9));
                    mq.INSTANCE.setCompoundDrawableTintBlendMode(new j00(isolatedService11, messenger9));
                    wcVar = wb.INSTANCE;
                } else if (wiVar2 instanceof vs) {
                    tb tbVar2 = tb.INSTANCE;
                    Context applicationContext4 = isolatedService11.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext4, "");
                    vs vsVar = (vs) wiVar2;
                    String str2 = (String) vs.setX(new Object[]{vsVar}, 973147160, -973147156, System.identityHashCode(vsVar));
                    String[] strArr = (String[]) vs.setX(new Object[]{vsVar}, 1491282488, -1491282488, System.identityHashCode(vsVar));
                    String str3 = (String) vs.setX(new Object[]{vsVar}, -1993161647, 1993161649, System.identityHashCode(vsVar));
                    String[] strArr2 = (String[]) vs.setX(new Object[]{vsVar}, -802446644, 802446647, System.identityHashCode(vsVar));
                    um.setX setx = (um.setX) vs.setX(new Object[]{vsVar}, 1160331990, -1160331989, System.identityHashCode(vsVar));
                    Context applicationContext5 = isolatedService11.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext5, "");
                    nw nwVar = new nw(applicationContext5, vsVar.setNavigationOnClickListener().getNavBarTitleString(), vsVar.setNavigationOnClickListener().setLayoutAnimation(), vsVar.setNavigationOnClickListener().setOnDragListener());
                    Object systemService = isolatedService11.getApplicationContext().getSystemService((Class<Object>) ConnectivityManager.class);
                    Intrinsics.checkNotNullExpressionValue(systemService, "");
                    tf compoundDrawableTintBlendMode = tbVar2.setCompoundDrawableTintBlendMode(applicationContext4, str2, strArr, str3, strArr2, setx, nwVar, new od((ConnectivityManager) systemService), (sd) vs.setX(new Object[]{vsVar}, 1014675131, -1014675125, System.identityHashCode(vsVar)), (st) vs.setX(new Object[]{vsVar}, -1593807951, 1593807956, System.identityHashCode(vsVar)));
                    if (((sw) tf.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode}, -1108495435, 1108495436, System.identityHashCode(compoundDrawableTintBlendMode))) != null) {
                        isolatedService11.f61643s0 = (sw) tf.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode}, -1108495435, 1108495436, System.identityHashCode(compoundDrawableTintBlendMode));
                        wcVar = new vp(vo.INSTANCE);
                    } else {
                        ri riVar = ri.setDividerPadding;
                        pc.setY(new ou(null, null, 10055, getDisplayExponent.setCompoundDrawableTintBlendMode(getDisplayExponent.setCompoundDrawableTintBlendMode(riVar), mw.setDividerPadding(compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode())), 3, null));
                        rl compoundDrawableTintBlendMode2 = compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode();
                        if (compoundDrawableTintBlendMode2 != null && (onFocusChangeListener2 = compoundDrawableTintBlendMode2.setOnFocusChangeListener()) != null) {
                            riVar = onFocusChangeListener2;
                        }
                        rl compoundDrawableTintBlendMode3 = compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode();
                        wcVar = new vp(new vk(riVar, compoundDrawableTintBlendMode3 != null ? compoundDrawableTintBlendMode3.setCompoundDrawableTintBlendMode() : null));
                    }
                } else {
                    if (wiVar2 instanceof vg) {
                        sw swVar = isolatedService11.f61643s0;
                        if (swVar != null) {
                            vg vgVar = (vg) wiVar2;
                            UUID uuid = (UUID) vg.setY(new Object[]{vgVar}, -2092834334, 2092834335, System.identityHashCode(vgVar));
                            byte[] bArr = (byte[]) vg.setY(new Object[]{vgVar}, 1982432842, -1982432842, System.identityHashCode(vgVar));
                            setX setx2 = new setX();
                            setx2.f61654p0 = isolatedService11;
                            setx2.f61655q0 = messenger9;
                            pair = (Pair) sw.setOnFocusChangeListener(new Object[]{swVar, uuid, bArr, setx2}, 2102126837, -2102126837, System.identityHashCode(swVar));
                        } else {
                            pair = null;
                        }
                        if ((pair != null ? (tn) pair.getFirst() : null) != null) {
                            isolatedService11.f61644t0 = (tn) pair.getFirst();
                            Object first = pair.getFirst();
                            Intrinsics.checkNotNull(first);
                            long y10 = ((tn) first).setY();
                            Object first2 = pair.getFirst();
                            Intrinsics.checkNotNull(first2);
                            vnVar = new vn(new vl(y10, ((tn) first2).setOnFocusChangeListener()));
                        } else {
                            if (pair == null || (rhVar2 = (rh) pair.getSecond()) == null || (onFocusChangeListener = rhVar2.setOnFocusChangeListener()) == null) {
                                onFocusChangeListener = rk.setOnDragListener;
                            }
                            qw dividerPadding = (pair == null || (rhVar = (rh) pair.getSecond()) == null) ? null : rhVar.setDividerPadding();
                            UUID uuid2 = null;
                            Integer num = null;
                            int i88 = 10056;
                            getDynamicButtonIconTextSpacingDp compoundDrawableTintBlendMode4 = getDisplayExponent.setCompoundDrawableTintBlendMode(onFocusChangeListener);
                            if (dividerPadding != null && (str = (String) qw.setDividerPadding(new Object[]{dividerPadding}, 1687366083, -1687366083, System.identityHashCode(dividerPadding))) != null) {
                                y7 = getDisplayExponent.setY(str);
                            }
                            pc.setY(new ou(uuid2, num, i88, getDisplayExponent.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode4, y7), 3, null));
                            vnVar = new vn(new vf(onFocusChangeListener, dividerPadding));
                        }
                        return vnVar;
                    }
                    if (wiVar2 instanceof vu) {
                        tn tnVar5 = isolatedService11.f61644t0;
                        if (tnVar5 != null) {
                            tnVar5.getNavBarTitleString();
                        }
                        isolatedService11.f61644t0 = null;
                        sw swVar2 = isolatedService11.f61643s0;
                        if (swVar2 != null) {
                            swVar2.setOnFocusChangeListener();
                        }
                        isolatedService11.f61643s0 = null;
                        wcVar = vx.INSTANCE;
                    } else if (wiVar2 instanceof vv) {
                        sw swVar3 = isolatedService11.f61643s0;
                        wcVar = new vz(swVar3 != null ? swVar3.setDividerPadding() : null);
                    } else if (wiVar2 instanceof wa) {
                        sw swVar4 = isolatedService11.f61643s0;
                        wcVar = new wc(swVar4 != null ? swVar4.setCompoundDrawableTintBlendMode() : null);
                    } else if (wiVar2 instanceof wx) {
                        tn tnVar6 = isolatedService11.f61644t0;
                        if (tnVar6 != null) {
                            try {
                                Intrinsics.checkNotNull(tnVar6);
                                wx wxVar = (wx) wiVar2;
                                sq sqVar = (sq) wx.setOnFocusChangeListener(new Object[]{wxVar}, 1875100269, -1875100269, System.identityHashCode(wxVar));
                                Function1<? super sa, Unit> m00Var = new m00(isolatedService11, messenger9);
                                Function1<? super Boolean, Unit> k00Var = new k00(isolatedService11, messenger9);
                                setDividerPadding setdividerpadding = new setDividerPadding();
                                setdividerpadding.f61649a = isolatedService11;
                                setdividerpadding.f61650b = messenger9;
                                tnVar6.setX(sqVar, m00Var, k00Var, setdividerpadding, new i00(isolatedService11, messenger9));
                            } catch (Exception e5) {
                                tn tnVar7 = isolatedService11.f61644t0;
                                Intrinsics.checkNotNull(tnVar7);
                                pc.setY(new ou(tnVar7.setOnFocusChangeListener(), null, 10057, getDisplayExponent.setCompoundDrawableTintBlendMode(getDisplayExponent.setCompoundDrawableTintBlendMode(ro.setNavigationOnClickListener), mw.setDividerPadding(e5)), 2, null));
                                setOnFocusChangeListener(new Object[]{isolatedService11, messenger9, new xm(new rw(new byte[0], rx.setDividerPadding(rx.setOnFocusChangeListener(e5)), rx.setOnFocusChangeListener(e5)))}, -2024684754, 2024684762, (int) System.currentTimeMillis());
                            }
                        } else {
                            setOnFocusChangeListener(new Object[]{isolatedService11, messenger9, new xm(new rw(new byte[0], ro.setNavigationOnClickListener, rx.setOnFocusChangeListener(new TerminalException(10057, null, null, 6, null))))}, -2024684754, 2024684762, (int) System.currentTimeMillis());
                        }
                        wcVar = wz.INSTANCE;
                        break;
                    } else if (wiVar2 instanceof wp) {
                        tn tnVar8 = isolatedService11.f61644t0;
                        if (tnVar8 != null) {
                            wp wpVar = (wp) wiVar2;
                            Integer num2 = (Integer) wp.setOnFocusChangeListener(new Object[]{wpVar}, -168896050, 168896050, System.identityHashCode(wpVar));
                            tnVar8.setDividerPadding(num2 != null ? new TerminalException(num2.intValue(), null, null, 6, null) : xl.INSTANCE);
                        }
                        wcVar = ws.INSTANCE;
                    } else if (wiVar2 instanceof ww) {
                        Function1<? super rb, Unit> function1 = isolatedService11.f61645u0;
                        if (function1 != null) {
                            ww wwVar = (ww) wiVar2;
                            function1.invoke((rb) ww.setOnFocusChangeListener(new Object[]{wwVar}, 868531281, -868531281, System.identityHashCode(wwVar)));
                        }
                        wcVar = wv.INSTANCE;
                    } else if (wiVar2 instanceof vq) {
                        tn tnVar9 = isolatedService11.f61644t0;
                        if (tnVar9 != null) {
                            tnVar9.getNavBarTitleString();
                        }
                        isolatedService11.f61644t0 = null;
                        wcVar = vt.INSTANCE;
                    } else if (wiVar2 instanceof wn) {
                        mt.setX(new Object[]{mr.setImageResource, "Main Process Activity Paused"}, 135701020, -135701017, (int) System.currentTimeMillis());
                        tn tnVar10 = isolatedService11.f61644t0;
                        if (tnVar10 != null) {
                            tnVar10.setX();
                        }
                        wcVar = wr.INSTANCE;
                    } else if (wiVar2 instanceof wo) {
                        mt.setX(new Object[]{mr.setImageResource, "Main Process Activity Resumed"}, 135701020, -135701017, (int) System.currentTimeMillis());
                        tn tnVar11 = isolatedService11.f61644t0;
                        if (tnVar11 != null) {
                            tnVar11.setCompoundDrawableTintBlendMode();
                        }
                        wcVar = wq.INSTANCE;
                    } else {
                        if (!(wiVar2 instanceof xa)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mr mrVar3 = mr.setImageResource;
                        StringBuilder sb4 = new StringBuilder("Main Process Activity setBeepVolume: ");
                        xa xaVar = (xa) wiVar2;
                        sb4.append(((Float) xa.setX(new Object[]{xaVar}, 952668471, -952668471, System.identityHashCode(xaVar))).floatValue());
                        mt.setX(new Object[]{mrVar3, sb4.toString()}, 135701020, -135701017, (int) System.currentTimeMillis());
                        sw swVar5 = isolatedService11.f61643s0;
                        if (swVar5 != null) {
                            swVar5.setX(((Float) xa.setX(new Object[]{xaVar}, 952668471, -952668471, System.identityHashCode(xaVar))).floatValue());
                        }
                        wcVar = xb.INSTANCE;
                    }
                }
                return wcVar;
            case 15:
                IsolatedService isolatedService12 = (IsolatedService) objArr[0];
                Looper looperMyLooper = Looper.myLooper();
                Intrinsics.checkNotNull(looperMyLooper);
                isolatedService12.f61640p0 = looperMyLooper;
                Looper looper = isolatedService12.f61640p0;
                if (looper == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    looper = null;
                }
                isolatedService12.f61641q0 = new a(isolatedService12, looper);
                a aVar = isolatedService12.f61641q0;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    aVar = null;
                }
                isolatedService12.f61642r0 = new Messenger(aVar);
                Context applicationContext6 = isolatedService12.getApplicationContext();
                Intrinsics.checkNotNull(applicationContext6, "");
                sx sxVar2 = sx.INSTANCE;
                ((Application) applicationContext6).registerActivityLifecycleCallbacks(sxVar2);
                sxVar2.setOnFocusChangeListener(isolatedService12);
                return null;
            default:
                IsolatedService isolatedService13 = (IsolatedService) objArr[0];
                Messenger messenger10 = (Messenger) objArr[1];
                we weVar3 = (we) objArr[2];
                xk xkVar2 = (xk) objArr[3];
                Bundle bundle = new Bundle();
                bundle.putSerializable("ipm", weVar3);
                p00 p00Var = p00.f57615a;
                System.currentTimeMillis();
                Message messageObtain = Message.obtain(null, xkVar2.setOnFocusChangeListener(), Integer.valueOf(p00.f57616b.getAndIncrement()).intValue(), ((wf) we.setDividerPadding(new Object[]{weVar3}, -1987877541, 1987877541, System.identityHashCode(weVar3))).ordinal(), bundle);
                Intrinsics.checkNotNullExpressionValue(messageObtain, "");
                if (((Boolean) setOnFocusChangeListener(new Object[]{isolatedService13, messenger10, messageObtain}, -16681469, 16681481, System.identityHashCode(isolatedService13))).booleanValue()) {
                    wk.setX(new Object[]{100023, messageObtain}, -1911741029, 1911741029, 100023);
                    int i89 = f61638w0;
                    int i90 = ((i89 | 7) << 1) - (i89 ^ 7);
                    f61639x0 = i90 % 128;
                    if (i90 % 2 != 0) {
                        return null;
                    }
                    throw null;
                }
                int i91 = f61639x0;
                int i92 = i91 & 75;
                int i93 = (i91 | 75) & (~i92);
                int i94 = -(-(i92 << 1));
                int i95 = (i93 ^ i94) + ((i93 & i94) << 1);
                f61638w0 = i95 % 128;
                if (i95 % 2 != 0) {
                    wk.setX(new Object[]{100024, messageObtain}, -1911741029, 1911741029, 100024);
                    int i96 = 46 / 0;
                } else {
                    wk.setX(new Object[]{100024, messageObtain}, -1911741029, 1911741029, 100024);
                }
                int i97 = f61639x0;
                int i98 = (i97 & (-74)) | ((~i97) & 73);
                int i99 = (i97 & 73) << 1;
                int i100 = (i98 & i99) + (i99 | i98);
                f61638w0 = i100 % 128;
                if (i100 % 2 == 0) {
                    return null;
                }
                int i101 = 27 / 0;
                return null;
        }
    }

    public static final /* synthetic */ ExecutorService setY(IsolatedService isolatedService) {
        return (ExecutorService) setOnFocusChangeListener(new Object[]{isolatedService}, -1143131348, 1143131359, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.sy
    public final void ah_(@NotNull Activity activity) throws Throwable {
        setOnFocusChangeListener(new Object[]{this, activity}, -1203379092, 1203379105, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.sy
    public final void ai_(@NotNull Activity activity) throws Throwable {
        setOnFocusChangeListener(new Object[]{this, activity}, -288625408, 288625412, System.identityHashCode(this));
    }

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(@Nullable Intent intent) {
        return (IBinder) setOnFocusChangeListener(new Object[]{this, intent}, -2031621353, 2031621355, System.identityHashCode(this));
    }

    @Override // android.app.Service
    public final void onCreate() throws Throwable {
        setOnFocusChangeListener(new Object[]{this}, -437316119, 437316134, System.identityHashCode(this));
    }

    @Override // android.app.Service
    public final void onDestroy() throws Throwable {
        setOnFocusChangeListener(new Object[]{this}, -198280123, 198280132, System.identityHashCode(this));
    }
}
