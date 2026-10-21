package yi;

import android.os.Looper;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.veridas.contextualdata.location.GeoPoint;
import com.veridas.contextualdata.location.LocationContextualDataProvider;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocationContextualDataProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
@DebugMetadata(c = "com.veridas.contextualdata.location.LocationContextualDataProvider$getFusedLocationFlow$1", f = "LocationContextualDataProvider.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<ProducerScope<? super GeoPoint>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f94839p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f94840q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ LocationContextualDataProvider f94841r0;

    /* JADX INFO: renamed from: yi.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LocationContextualDataProvider.kt */
    public static final class C0510a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LocationContextualDataProvider f94842p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LocationCallback f94843q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0510a(LocationContextualDataProvider locationContextualDataProvider, LocationCallback locationCallback) {
            super(0);
            this.f94842p0 = locationContextualDataProvider;
            this.f94843q0 = locationCallback;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            LocationContextualDataProvider.access$getFusedLocationClient(this.f94842p0).removeLocationUpdates(this.f94843q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LocationContextualDataProvider.kt */
    public static final class b extends Lambda implements Function1<GeoPoint, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ProducerScope<GeoPoint> f94844p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(ProducerScope<? super GeoPoint> producerScope) {
            super(1);
            this.f94844p0 = producerScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(GeoPoint geoPoint) {
            GeoPoint geoPoint2 = geoPoint;
            Intrinsics.checkNotNullParameter(geoPoint2, "geoPoint");
            this.f94844p0.mo5953trySendJP2dKIU(geoPoint2);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LocationContextualDataProvider locationContextualDataProvider, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f94841r0 = locationContextualDataProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        a aVar = new a(this.f94841r0, continuation);
        aVar.f94840q0 = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super GeoPoint> producerScope, Continuation<? super Unit> continuation) {
        return ((a) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f94839p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            ProducerScope producerScope = (ProducerScope) this.f94840q0;
            LocationRequest locationRequestCreate = LocationRequest.create();
            locationRequestCreate.setPriority(102);
            locationRequestCreate.setInterval(5000L);
            locationRequestCreate.setFastestInterval(500L);
            Intrinsics.checkNotNullExpressionValue(locationRequestCreate, "apply(...)");
            b bVar = new b(producerScope);
            LocationContextualDataProvider locationContextualDataProvider = this.f94841r0;
            LocationCallback locationCallbackAccess$getLocationCallBack = LocationContextualDataProvider.access$getLocationCallBack(locationContextualDataProvider, bVar);
            LocationContextualDataProvider.access$getFusedLocationClient(locationContextualDataProvider).requestLocationUpdates(locationRequestCreate, locationCallbackAccess$getLocationCallBack, Looper.getMainLooper());
            C0510a c0510a = new C0510a(locationContextualDataProvider, locationCallbackAccess$getLocationCallBack);
            this.f94839p0 = 1;
            if (ProduceKt.awaitClose(producerScope, c0510a, this) == coroutine_suspended) {
                return coroutine_suspended;
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
