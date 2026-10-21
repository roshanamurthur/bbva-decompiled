package com.bbva.ethermobilesdk.devicemanager.data.devicechecker.common.repository;

import androidx.activity.c;
import bk.w;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.devicechecker.DeviceChecker;
import com.bbva.ethermobilesdk.devicechecker.frida.FridaApi;
import com.bbva.ethermobilesdk.devicechecker.magisk.MagiskApi;
import com.bbva.ethermobilesdk.devicechecker.root.RootApi;
import java.util.HashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceCheckerRepositoryImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J>\u0010\n\u001a0\u0012,\u0012*\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0007j\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002`\t0\u0002H\u0096@¢\u0006\u0004\b\n\u0010\u000bJB\u0010\r\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u00020\u0007j\u0016\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0002`\t0\u0002H\u0096@¢\u0006\u0004\b\r\u0010\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¢\u0006\u0004\b\u000e\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/data/devicechecker/common/repository/DeviceCheckerRepositoryImpl;", "Lcom/bbva/ethermobilesdk/devicemanager/data/devicechecker/common/repository/DeviceCheckerRepository;", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", "isDebuggable", "isDeveloperModeEnabled", "isEmulator", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "isFridaCompleteDetected", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isMagiskCompleteDetected", "isRoot", "Lcom/bbva/ethermobilesdk/devicechecker/DeviceChecker;", "deviceChecker", "<init>", "(Lcom/bbva/ethermobilesdk/devicechecker/DeviceChecker;)V", "devicemanager_release"}, k = 1, mv = {2, 0, 0})
public final class DeviceCheckerRepositoryImpl implements DeviceCheckerRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DeviceChecker f29636a;

    /* JADX INFO: compiled from: DeviceCheckerRepositoryImpl.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicemanager.data.devicechecker.common.repository.DeviceCheckerRepositoryImpl$isFridaCompleteDetected$2", f = "DeviceCheckerRepositoryImpl.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function1<Continuation<? super HashMap<Integer, Result<Boolean>>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f29637p0;

        public a(Continuation<? super a> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return DeviceCheckerRepositoryImpl.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super HashMap<Integer, Result<Boolean>>> continuation) {
            return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f29637p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                FridaApi frida = DeviceCheckerRepositoryImpl.this.f29636a.getFrida();
                this.f29637p0 = 1;
                obj = frida.isFridaCompleteDetected(this);
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

    /* JADX INFO: compiled from: DeviceCheckerRepositoryImpl.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicemanager.data.devicechecker.common.repository.DeviceCheckerRepositoryImpl$isMagiskCompleteDetected$2", f = "DeviceCheckerRepositoryImpl.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function1<Continuation<? super HashMap<Integer, Result<? extends Object>>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f29639p0;

        public b(Continuation<? super b> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return DeviceCheckerRepositoryImpl.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super HashMap<Integer, Result<? extends Object>>> continuation) {
            return ((b) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f29639p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                MagiskApi magisk = DeviceCheckerRepositoryImpl.this.f29636a.getMagisk();
                Set of2 = w.setOf((Object[]) new String[]{"com.mobileiron.anyware.android", "com.lbe.parallel.intl", "com.microsoft.windowsintune.companyportal", "com.airwatch.androidagent", "com.metago.astro", "com.lonelycatgames.Xplore", "net.dinglisch.android.taskerm"});
                Unit unit = Unit.INSTANCE;
                this.f29639p0 = 1;
                obj = MagiskApi.isMagiskCompleteDetected$default(magisk, false, of2, unit, this, 1, null);
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

    public DeviceCheckerRepositoryImpl(@NotNull DeviceChecker deviceChecker) {
        Intrinsics.checkNotNullParameter(deviceChecker, "deviceChecker");
        this.f29636a = deviceChecker;
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.devicechecker.common.repository.DeviceCheckerRepository
    @NotNull
    public Result<Boolean> isDebuggable() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new b7.a(this, 0));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.devicechecker.common.repository.DeviceCheckerRepository
    @NotNull
    public Result<Boolean> isDeveloperModeEnabled() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new c(this, 1));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.devicechecker.common.repository.DeviceCheckerRepository
    @NotNull
    public Result<Boolean> isEmulator() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new b7.b(this, 0));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.devicechecker.common.repository.DeviceCheckerRepository
    @Nullable
    public Object isFridaCompleteDetected(@NotNull Continuation<? super Result<HashMap<Integer, Result<Boolean>>>> continuation) {
        return com.bbva.ethermobile.help.kit.result.ResultKt.suspendCatching(new a(null), continuation);
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.devicechecker.common.repository.DeviceCheckerRepository
    @Nullable
    public Object isMagiskCompleteDetected(@NotNull Continuation<? super Result<HashMap<Integer, Result<? extends Object>>>> continuation) {
        return com.bbva.ethermobile.help.kit.result.ResultKt.suspendCatching(new b(null), continuation);
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.devicechecker.common.repository.DeviceCheckerRepository
    @Nullable
    public Object isRoot(@NotNull Continuation<? super Result<Boolean>> continuation) {
        return RootApi.isRoot$default(this.f29636a.getRoot(), false, continuation, 1, null);
    }
}
