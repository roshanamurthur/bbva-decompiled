package com.bbva.ethermobilesdk.devicemanager.domain.usecase;

import android.location.Location;
import com.bbva.ethermobile.help.kit.domain.base.SuspendUseCase;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.devicemanager.data.geolocation.repository.GeolocationRepository;
import com.bbva.ethermobilesdk.devicemanager.model.output.GeolocationResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetLastGeolocationUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0094@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/domain/usecase/GetLastGeolocationUseCase;", "Lcom/bbva/ethermobile/help/kit/domain/base/SuspendUseCase;", "", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/GeolocationResponse;", "parameters", "execute", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/devicemanager/data/geolocation/repository/GeolocationRepository;", "geolocationRepository", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/bbva/ethermobilesdk/devicemanager/data/geolocation/repository/GeolocationRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "devicemanager_release"}, k = 1, mv = {2, 0, 0})
public final class GetLastGeolocationUseCase extends SuspendUseCase<Unit, GeolocationResponse> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final GeolocationRepository f29707b;

    /* JADX INFO: compiled from: GetLastGeolocationUseCase.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicemanager.domain.usecase.GetLastGeolocationUseCase", f = "GetLastGeolocationUseCase.kt", i = {0}, l = {19}, m = "execute", n = {"$this$execute_u24lambda_u240"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public GeolocationRepository f29708p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f29709q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f29711s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29709q0 = obj;
            this.f29711s0 |= Integer.MIN_VALUE;
            return GetLastGeolocationUseCase.this.execute((Unit) null, (Continuation<? super GeolocationResponse>) this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLastGeolocationUseCase(@NotNull GeolocationRepository geolocationRepository, @NotNull CoroutineDispatcher ioDispatcher) {
        super(ioDispatcher);
        Intrinsics.checkNotNullParameter(geolocationRepository, "geolocationRepository");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f29707b = geolocationRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.ethermobile.help.kit.domain.base.SuspendUseCase
    @Nullable
    public Object execute(@NotNull Unit unit, @NotNull Continuation<? super GeolocationResponse> continuation) {
        a aVar;
        GeolocationRepository geolocationRepository;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f29711s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f29711s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f29709q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f29711s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            GeolocationRepository geolocationRepository2 = this.f29707b;
            aVar.f29708p0 = geolocationRepository2;
            aVar.f29711s0 = 1;
            Object lastLocation = geolocationRepository2.getLastLocation(aVar);
            if (lastLocation == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = lastLocation;
            geolocationRepository = geolocationRepository2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            geolocationRepository = aVar.f29708p0;
            ResultKt.throwOnFailure(obj);
        }
        Location location = (Location) com.bbva.ethermobile.help.kit.result.ResultKt.getOrNull((Result) obj);
        return new GeolocationResponse(geolocationRepository.getAccuracy(location), geolocationRepository.getAltitude(location), geolocationRepository.getLatitude(location), geolocationRepository.getLongitude(location));
    }
}
