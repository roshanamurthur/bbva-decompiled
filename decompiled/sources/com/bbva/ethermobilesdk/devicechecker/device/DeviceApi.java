package com.bbva.ethermobilesdk.devicechecker.device;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.annotation.RequiresApi;
import bk.w;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.devicechecker.common.util.SystemBuild;
import com.bbva.ethermobilesdk.devicechecker.exception.NotSupportedApiException;
import com.bbva.ethermobilesdk.devicechecker.extension.ContextKt;
import com.bbva.ethermobilesdk.devicechecker.util.ResultUtilKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceApi.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\t0\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007J\u001f\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f0\u000b0\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ\u001f\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\bH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000eJ\u001f\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000b0\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/bbva/ethermobilesdk/devicechecker/device/DeviceApi;", "", "", "", "packages", "", "isPackageDetected", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", "isPackageDetectedResult", "", "", "runningAppPid", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/app/ActivityManager$RunningAppProcessInfo;", "kotlin.jvm.PlatformType", "runningAppProcesses", "Landroid/app/ApplicationExitInfo;", "historicalProcesses", "Landroid/content/pm/ApplicationInfo;", "installedApplications", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "devicechecker_release"}, k = 1, mv = {1, 8, 0})
public final class DeviceApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Set<String> f29404b = w.setOf((Object[]) new String[]{"com.anydesk.anydeskandroid", "com.awesun.control", "com.deskroll.androidclient", "com.devolutions.wayk.now", "com.google.chromeremotedesktop", "com.idrive.remotedesktop.android", "com.islonline.isllight.mobile.android", "com.logmein.ignitionpro.android", "com.microsoft.rdc.android", "com.microsoft.rdc.androidx", "com.mirillis.monfloclient", "com.mm.truDesktop.full", "com.monect.portable", "com.prosoftnet.rpcnew", "com.realvnc.viewer.android", "com.Relmtech.Remote", "com.sand.airdroid", "com.sand.airmirror", "com.splashtop.remote.pad.v2", "com.teamviewer.host.market", "com.teamviewer.pilot", "com.teamviewer.quicksupport.market", "com.teamviewer.teamviewer.market.mobile", "com.teknopars.AlpemixPro", "com.terminalserviceplus.mobile", "com.zoho.assist", "getscreen.me.android", "incendo.vectir.androidclient", "it.nanosystems.Supremo"});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f29405a;

    /* JADX INFO: compiled from: DeviceApi.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/ethermobilesdk/devicechecker/device/DeviceApi$Companion;", "", "()V", "remoteDesktopPackages", "", "", "getRemoteDesktopPackages", "()Ljava/util/Set;", "devicechecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<String> getRemoteDesktopPackages() {
            return DeviceApi.f29404b;
        }
    }

    /* JADX INFO: compiled from: DeviceApi.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicechecker.device.DeviceApi$historicalProcesses$2", f = "DeviceApi.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<List<? extends ApplicationExitInfo>>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f29406p0;

        /* JADX INFO: renamed from: com.bbva.ethermobilesdk.devicechecker.device.DeviceApi$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DeviceApi.kt */
        @DebugMetadata(c = "com.bbva.ethermobilesdk.devicechecker.device.DeviceApi$historicalProcesses$2$1", f = "DeviceApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0122a extends SuspendLambda implements Function1<Continuation<? super List<? extends ApplicationExitInfo>>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ DeviceApi f29408p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0122a(DeviceApi deviceApi, Continuation<? super C0122a> continuation) {
                super(1, continuation);
                this.f29408p0 = deviceApi;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new C0122a(this.f29408p0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super List<? extends ApplicationExitInfo>> continuation) {
                return ((C0122a) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws NotSupportedApiException {
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                SystemBuild systemBuild = SystemBuild.INSTANCE;
                if (systemBuild.getVersion() < systemBuild.getVersionCodesAndroidR()) {
                    throw new NotSupportedApiException(null, 1, null);
                }
                DeviceApi deviceApi = this.f29408p0;
                Context context = deviceApi.f29405a;
                String packageName = deviceApi.f29405a.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
                return ContextKt.historicalProcesses(context, packageName);
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceApi.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<List<? extends ApplicationExitInfo>>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f29406p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C0122a c0122a = new C0122a(DeviceApi.this, null);
                this.f29406p0 = 1;
                obj = ResultUtilKt.catchingAndLog(c0122a, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: compiled from: DeviceApi.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicechecker.device.DeviceApi$installedApplications$2", f = "DeviceApi.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<List<? extends ApplicationInfo>>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f29409p0;

        /* JADX INFO: compiled from: DeviceApi.kt */
        @DebugMetadata(c = "com.bbva.ethermobilesdk.devicechecker.device.DeviceApi$installedApplications$2$1", f = "DeviceApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function1<Continuation<? super List<? extends ApplicationInfo>>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ DeviceApi f29411p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DeviceApi deviceApi, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f29411p0 = deviceApi;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new a(this.f29411p0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super List<? extends ApplicationInfo>> continuation) {
                return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return ContextKt.getInstalledApplications(this.f29411p0.f29405a);
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceApi.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<List<? extends ApplicationInfo>>> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f29409p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = new a(DeviceApi.this, null);
                this.f29409p0 = 1;
                obj = ResultUtilKt.catchingAndLog(aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: compiled from: DeviceApi.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicechecker.device.DeviceApi$isPackageDetected$2", f = "DeviceApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nDeviceApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceApi.kt\ncom/bbva/ethermobilesdk/devicechecker/device/DeviceApi$isPackageDetected$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,165:1\n1747#2,3:166\n*S KotlinDebug\n*F\n+ 1 DeviceApi.kt\ncom/bbva/ethermobilesdk/devicechecker/device/DeviceApi$isPackageDetected$2\n*L\n40#1:166,3\n*E\n"})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f29412p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Set<String> f29413q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ DeviceApi f29414r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Set<String> set, DeviceApi deviceApi, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f29413q0 = set;
            this.f29414r0 = deviceApi;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = new c(this.f29413q0, this.f29414r0, continuation);
            cVar.f29412p0 = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM5535constructorimpl;
            boolean z10;
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Set<String> set = this.f29413q0;
            DeviceApi deviceApi = this.f29414r0;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                Set<String> set2 = set;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    Iterator<T> it = set2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z10 = false;
                            break;
                        }
                        if (ContextKt.isPackageInstalled(deviceApi.f29405a, (String) it.next())) {
                            z10 = true;
                            break;
                        }
                    }
                } else {
                    z10 = false;
                    break;
                }
                objM5535constructorimpl = kotlin.Result.m5535constructorimpl(Boxing.boxBoolean(z10));
            } catch (Throwable th2) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            return kotlin.Result.m5540isFailureimpl(objM5535constructorimpl) ? Boxing.boxBoolean(false) : objM5535constructorimpl;
        }
    }

    /* JADX INFO: compiled from: DeviceApi.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicechecker.device.DeviceApi$isPackageDetectedResult$2", f = "DeviceApi.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<Map<String, ? extends Boolean>>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f29415p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Set<String> f29416q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ DeviceApi f29417r0;

        /* JADX INFO: compiled from: DeviceApi.kt */
        @DebugMetadata(c = "com.bbva.ethermobilesdk.devicechecker.device.DeviceApi$isPackageDetectedResult$2$1", f = "DeviceApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nDeviceApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceApi.kt\ncom/bbva/ethermobilesdk/devicechecker/device/DeviceApi$isPackageDetectedResult$2$1\n+ 2 Iterable.kt\ncom/bbva/ethermobilesdk/devicechecker/extension/IterableKt\n*L\n1#1,165:1\n4#2,10:166\n*S KotlinDebug\n*F\n+ 1 DeviceApi.kt\ncom/bbva/ethermobilesdk/devicechecker/device/DeviceApi$isPackageDetectedResult$2$1\n*L\n58#1:166,10\n*E\n"})
        public static final class a extends SuspendLambda implements Function1<Continuation<? super Map<String, ? extends Boolean>>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Set<String> f29418p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ DeviceApi f29419q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Set<String> set, DeviceApi deviceApi, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f29418p0 = set;
                this.f29419q0 = deviceApi;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new a(this.f29418p0, this.f29419q0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Map<String, ? extends Boolean>> continuation) {
                return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                Set<String> set = this.f29418p0;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : set) {
                    if (ContextKt.isPackageInstalled(this.f29419q0.f29405a, (String) obj2)) {
                        linkedHashMap.put(obj2, Boxing.boxBoolean(true));
                    } else {
                        linkedHashMap.put(obj2, Boxing.boxBoolean(false));
                    }
                }
                return linkedHashMap;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Set<String> set, DeviceApi deviceApi, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f29416q0 = set;
            this.f29417r0 = deviceApi;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.f29416q0, this.f29417r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<Map<String, ? extends Boolean>>> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f29415p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = new a(this.f29416q0, this.f29417r0, null);
                this.f29415p0 = 1;
                obj = ResultUtilKt.catchingAndLog(aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: compiled from: DeviceApi.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicechecker.device.DeviceApi$runningAppPid$2", f = "DeviceApi.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<List<? extends Integer>>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f29420p0;

        /* JADX INFO: compiled from: DeviceApi.kt */
        @DebugMetadata(c = "com.bbva.ethermobilesdk.devicechecker.device.DeviceApi$runningAppPid$2$1", f = "DeviceApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function1<Continuation<? super List<? extends Integer>>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ DeviceApi f29422p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DeviceApi deviceApi, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f29422p0 = deviceApi;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new a(this.f29422p0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super List<? extends Integer>> continuation) {
                return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return ContextKt.appPid(this.f29422p0.f29405a);
            }
        }

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceApi.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<List<? extends Integer>>> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f29420p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = new a(DeviceApi.this, null);
                this.f29420p0 = 1;
                obj = ResultUtilKt.catchingAndLog(aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: compiled from: DeviceApi.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicechecker.device.DeviceApi$runningAppProcesses$2", f = "DeviceApi.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<List<? extends ActivityManager.RunningAppProcessInfo>>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f29423p0;

        /* JADX INFO: compiled from: DeviceApi.kt */
        @DebugMetadata(c = "com.bbva.ethermobilesdk.devicechecker.device.DeviceApi$runningAppProcesses$2$1", f = "DeviceApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function1<Continuation<? super List<? extends ActivityManager.RunningAppProcessInfo>>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ DeviceApi f29425p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DeviceApi deviceApi, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f29425p0 = deviceApi;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new a(this.f29425p0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super List<? extends ActivityManager.RunningAppProcessInfo>> continuation) {
                return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return ContextKt.runningAppProcesses(this.f29425p0.f29405a);
            }
        }

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceApi.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<List<? extends ActivityManager.RunningAppProcessInfo>>> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f29423p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = new a(DeviceApi.this, null);
                this.f29423p0 = 1;
                obj = ResultUtilKt.catchingAndLog(aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public DeviceApi(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29405a = context;
    }

    @RequiresApi(30)
    @Nullable
    public final Object historicalProcesses(@NotNull Continuation<? super Result<List<ApplicationExitInfo>>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new a(null), continuation);
    }

    @Nullable
    public final Object installedApplications(@NotNull Continuation<? super Result<List<ApplicationInfo>>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new b(null), continuation);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use the isPackageDetectedResult() method to be protected from exceptions", replaceWith = @ReplaceWith(expression = "isPackageDetectedResult()", imports = {}))
    @Nullable
    public final Object isPackageDetected(@NotNull Set<String> set, @NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new c(set, this, null), continuation);
    }

    @Nullable
    public final Object isPackageDetectedResult(@NotNull Set<String> set, @NotNull Continuation<? super Result<Map<String, Boolean>>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new d(set, this, null), continuation);
    }

    @Nullable
    public final Object runningAppPid(@NotNull Continuation<? super Result<List<Integer>>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new e(null), continuation);
    }

    @Nullable
    public final Object runningAppProcesses(@NotNull Continuation<? super Result<List<ActivityManager.RunningAppProcessInfo>>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new f(null), continuation);
    }
}
