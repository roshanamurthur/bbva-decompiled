package com.bbva.ethermobilesdk.devicechecker.root;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobile.help.kit.result.ResultKt;
import com.bbva.ethermobilesdk.devicechecker.RootServiceApi;
import com.bbva.ethermobilesdk.devicechecker.extension.ContextKt;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import ek.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RootApi.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\b\u001a\u00020\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/bbva/ethermobilesdk/devicechecker/root/RootApi;", "", "", "autoFinalizeDetection", "Lcom/bbva/ethermobile/help/kit/result/Result;", "isRoot", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "finalizeRootDetection", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "devicechecker_release"}, k = 1, mv = {1, 8, 0})
public final class RootApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f29496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f29497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public RootApi$isRoot$2$1 f29498c;

    public RootApi(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29496a = context;
    }

    public static /* synthetic */ Object isRoot$default(RootApi rootApi, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return rootApi.isRoot(z10, continuation);
    }

    public final void finalizeRootDetection() {
        if (this.f29497b) {
            this.f29497b = false;
            ContextKt.unbindService(this.f29496a, this.f29498c);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.bbva.ethermobilesdk.devicechecker.root.RootApi$isRoot$2$1] */
    @Nullable
    public final Object isRoot(final boolean z10, @NotNull Continuation<? super Result<Boolean>> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        this.f29498c = new ServiceConnection() { // from class: com.bbva.ethermobilesdk.devicechecker.root.RootApi$isRoot$2$1
            @Override // android.content.ServiceConnection
            public void onBindingDied(@Nullable ComponentName name) {
                if (z10) {
                    return;
                }
                this.f29497b = false;
            }

            @Override // android.content.ServiceConnection
            public void onNullBinding(@Nullable ComponentName name) {
                if (z10) {
                    return;
                }
                this.f29497b = false;
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(@NotNull ComponentName componentName, @NotNull IBinder iBinder) {
                Object objM5535constructorimpl;
                Intrinsics.checkNotNullParameter(componentName, "componentName");
                Intrinsics.checkNotNullParameter(iBinder, "iBinder");
                RootApi rootApi = this;
                Continuation<Result<Boolean>> continuation2 = safeContinuation;
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    boolean z11 = z10;
                    if (!z11) {
                        rootApi.f29497b = true;
                    }
                    continuation2.resumeWith(kotlin.Result.m5535constructorimpl(new Result.Success(ResultKt.getOrThrow(com.bbva.ethermobilesdk.devicechecker.extension.ResultKt.toResult(RootServiceApi.Stub.asInterface(iBinder).isRootPresent())))));
                    if (z11) {
                        ContextKt.unbindService(rootApi.f29496a, rootApi.f29498c);
                    }
                    objM5535constructorimpl = kotlin.Result.m5535constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    objM5535constructorimpl = kotlin.Result.m5535constructorimpl(kotlin.ResultKt.createFailure(th2));
                }
                Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                if (thM5538exceptionOrNullimpl == null) {
                    return;
                }
                continuation2.resumeWith(kotlin.Result.m5535constructorimpl(new Result.Error(thM5538exceptionOrNullimpl)));
                ContextKt.unbindService(rootApi.f29496a, rootApi.f29498c);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(@NotNull ComponentName componentName) {
                Intrinsics.checkNotNullParameter(componentName, "componentName");
                if (z10) {
                    return;
                }
                this.f29497b = false;
            }
        };
        Context context = this.f29496a;
        Intent intent = new Intent(context, (Class<?>) RootService.class);
        RootApi$isRoot$2$1 rootApi$isRoot$2$1 = this.f29498c;
        Intrinsics.checkNotNull(rootApi$isRoot$2$1, "null cannot be cast to non-null type android.content.ServiceConnection");
        context.bindService(intent, rootApi$isRoot$2$1, 1);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
