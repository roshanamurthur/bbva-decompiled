package com.bbva.ethermobilesdk.geolocation.location.callback;

import android.location.Location;
import com.bbva.ethermobile.help.kit.result.Result;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FusedLocationCallback.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/location/callback/FusedLocationCallback;", "Lcom/google/android/gms/location/LocationCallback;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/google/android/gms/location/LocationResult;", "locationResult", "", "onLocationResult", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Landroid/location/Location;", "locationFlow", "<init>", "(Lkotlinx/coroutines/flow/MutableSharedFlow;)V", "geolocation_release"}, k = 1, mv = {2, 0, 0})
public final class FusedLocationCallback extends LocationCallback implements CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f29827p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Result<Location>> f29828q0;

    /* JADX INFO: compiled from: FusedLocationCallback.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.geolocation.location.callback.FusedLocationCallback$onLocationResult$1", f = "FusedLocationCallback.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f29829p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LocationResult f29830q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ FusedLocationCallback f29831r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LocationResult locationResult, FusedLocationCallback fusedLocationCallback, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f29830q0 = locationResult;
            this.f29831r0 = fusedLocationCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f29830q0, this.f29831r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f29829p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Location lastLocation = this.f29830q0.getLastLocation();
                if (lastLocation != null) {
                    MutableSharedFlow mutableSharedFlow = this.f29831r0.f29828q0;
                    Result.Success success = new Result.Success(lastLocation);
                    this.f29829p0 = 1;
                    if (mutableSharedFlow.emit(success, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public FusedLocationCallback(@NotNull MutableSharedFlow<Result<Location>> locationFlow) {
        Intrinsics.checkNotNullParameter(locationFlow, "locationFlow");
        this.f29827p0 = CoroutineScopeKt.MainScope();
        this.f29828q0 = locationFlow;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f29827p0.getCoroutineContext();
    }

    @Override // com.google.android.gms.location.LocationCallback
    public void onLocationResult(@NotNull LocationResult locationResult) {
        Intrinsics.checkNotNullParameter(locationResult, "locationResult");
        super.onLocationResult(locationResult);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(locationResult, this, null), 3, null);
    }
}
