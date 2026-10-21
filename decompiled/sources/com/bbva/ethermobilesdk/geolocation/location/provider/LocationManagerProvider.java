package com.bbva.ethermobilesdk.geolocation.location.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Looper;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.geolocation.location.model.LocationParams;
import com.bbva.ethermobilesdk.geolocation.location.provider.LocationManagerProvider;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.ethermobilesdk.geolocation.utils.SettingsKt;
import com.bbva.ethermobilesdk.geolocation.utils.extension.LocationParamsKt;
import com.bbva.ethermobilesdk.geolocation.utils.extension.LoggerKt;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocationManagerProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0017J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\tH\u0097@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\tH\u0016¨\u0006\u0015"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/location/provider/LocationManagerProvider;", "Lcom/bbva/ethermobilesdk/geolocation/location/provider/LocationProvider;", "Landroid/location/LocationListener;", "Lcom/bbva/ethermobilesdk/geolocation/location/model/LocationParams;", "params", "", "singleUpdate", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Landroid/location/Location;", EventDataKeys.Lifecycle.LIFECYCLE_START, "", "stop", "getLastLocation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "location", "onLocationChanged", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "geolocation_release"}, k = 1, mv = {2, 0, 0})
public final class LocationManagerProvider implements LocationProvider, LocationListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Context f29857p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Result<Location>> f29858q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public final LocationManager f29859r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final FusedLocationProviderClient f29860s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final LocationManagerProvider$locationCallback$1 f29861t0;

    /* JADX INFO: compiled from: LocationManagerProvider.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.geolocation.location.provider.LocationManagerProvider$getLastLocation$2", f = "LocationManagerProvider.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function1<Continuation<? super Location>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f29862p0;

        /* JADX INFO: renamed from: com.bbva.ethermobilesdk.geolocation.location.provider.LocationManagerProvider$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: LocationManagerProvider.kt */
        public static final class C0125a implements Function1<Location, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Continuation<Location> f29864p0;

            public C0125a(SafeContinuation safeContinuation) {
                this.f29864p0 = safeContinuation;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Location location) {
                this.f29864p0.resumeWith(kotlin.Result.m5535constructorimpl(location));
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: LocationManagerProvider.kt */
        public static final class b implements OnFailureListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Continuation<Location> f29865a;

            public b(SafeContinuation safeContinuation) {
                this.f29865a = safeContinuation;
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception it) {
                Intrinsics.checkNotNullParameter(it, "it");
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                this.f29865a.resumeWith(kotlin.Result.m5535constructorimpl(ResultKt.createFailure(new Throwable(it.getMessage()))));
            }
        }

        public a(Continuation<? super a> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return LocationManagerProvider.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Location> continuation) {
            return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f29862p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                LocationManagerProvider locationManagerProvider = LocationManagerProvider.this;
                this.f29862p0 = 1;
                SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
                if (Build.VERSION.SDK_INT >= 30) {
                    locationManagerProvider.f29860s0.getLastLocation().addOnSuccessListener(new b(new C0125a(safeContinuation))).addOnFailureListener(new b(safeContinuation));
                } else {
                    try {
                        LocationManager locationManager = locationManagerProvider.f29859r0;
                        Location lastKnownLocation = locationManager != null ? locationManager.getLastKnownLocation("passive") : null;
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        Intrinsics.checkNotNull(lastKnownLocation, "null cannot be cast to non-null type android.location.Location");
                        safeContinuation.resumeWith(kotlin.Result.m5535constructorimpl(lastKnownLocation));
                    } catch (Exception e5) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        safeContinuation.resumeWith(kotlin.Result.m5535constructorimpl(ResultKt.createFailure(new Throwable(e5.getMessage()))));
                    }
                }
                obj = safeContinuation.getOrThrow();
                if (obj == ek.a.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
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

    /* JADX INFO: compiled from: LocationManagerProvider.kt */
    public static final class b implements OnSuccessListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f29866a;

        public b(a.C0125a function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f29866a = function;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f29866a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.bbva.ethermobilesdk.geolocation.location.provider.LocationManagerProvider$locationCallback$1] */
    public LocationManagerProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29857p0 = context;
        this.f29858q0 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f29859r0 = (LocationManager) context.getSystemService("location");
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
        Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
        this.f29860s0 = fusedLocationProviderClient;
        this.f29861t0 = new LocationCallback() { // from class: com.bbva.ethermobilesdk.geolocation.location.provider.LocationManagerProvider$locationCallback$1
            @Override // com.google.android.gms.location.LocationCallback
            public void onLocationAvailability(LocationAvailability locationAvailability) {
                Intrinsics.checkNotNullParameter(locationAvailability, "locationAvailability");
                if (locationAvailability.isLocationAvailable()) {
                    return;
                }
                this.f29867p0.f29858q0.tryEmit(new Result.Error(new Throwable("Location not available")));
            }

            @Override // com.google.android.gms.location.LocationCallback
            public void onLocationResult(LocationResult locationResult) {
                Intrinsics.checkNotNullParameter(locationResult, "locationResult");
                Location lastLocation = locationResult.getLastLocation();
                if (lastLocation != null) {
                    this.f29867p0.f29858q0.tryEmit(new Result.Success(lastLocation));
                }
            }
        };
    }

    public static final Object access$resultWithLocationPermissions(LocationManagerProvider locationManagerProvider, Function1 function1, Continuation continuation) {
        if (SettingsKt.areLocationPermissionsGranted(locationManagerProvider.f29857p0)) {
            return function1.invoke(continuation);
        }
        return null;
    }

    @Override // com.bbva.ethermobilesdk.geolocation.location.provider.LocationProvider
    @SuppressLint({"MissingPermission"})
    @Nullable
    public Object getLastLocation(@NotNull Continuation<? super Location> continuation) {
        a aVar = new a(null);
        if (SettingsKt.areLocationPermissionsGranted(this.f29857p0)) {
            return aVar.invoke(continuation);
        }
        return null;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(@NotNull Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        LoggerKt.log("onLocationChanged " + location);
        this.f29858q0.tryEmit(new Result.Success(location));
    }

    @Override // com.bbva.ethermobilesdk.geolocation.location.provider.LocationProvider
    @SuppressLint({"MissingPermission"})
    @NotNull
    public Flow<Result<Location>> start(@NotNull final LocationParams params, final boolean singleUpdate) {
        Intrinsics.checkNotNullParameter(params, "params");
        Function0 function0 = new Function0() { // from class: j7.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object objM5535constructorimpl;
                Object objM5535constructorimpl2;
                boolean zIsEqualOrGreaterThanR = ConstantsKt.isEqualOrGreaterThanR();
                LocationManagerProvider locationManagerProvider = this.f78799p0;
                LocationParams locationParams = params;
                boolean z10 = singleUpdate;
                Unit unit = null;
                if (zIsEqualOrGreaterThanR) {
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        LocationRequest locationRequest = LocationParamsKt.toLocationRequest(locationParams);
                        if (z10) {
                            locationManagerProvider.getClass();
                            locationManagerProvider.f29860s0.getCurrentLocation(locationRequest.getPriority(), (CancellationToken) null).addOnSuccessListener(new t6.b(new f(locationManagerProvider, 0), 1));
                        } else {
                            locationManagerProvider.f29860s0.requestLocationUpdates(locationRequest, locationManagerProvider.f29861t0, Looper.getMainLooper());
                        }
                        objM5535constructorimpl = kotlin.Result.m5535constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th2) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
                    }
                    Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                    if (thM5538exceptionOrNullimpl != null) {
                        locationManagerProvider.f29858q0.tryEmit(new Result.Error(thM5538exceptionOrNullimpl));
                    }
                    kotlin.Result.m5534boximpl(objM5535constructorimpl);
                } else {
                    LocationManager locationManager = locationManagerProvider.f29859r0;
                    MutableSharedFlow<Result<Location>> mutableSharedFlow = locationManagerProvider.f29858q0;
                    if (locationManager != null) {
                        try {
                            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                            String bestProvider = LocationParamsKt.getBestProvider(locationManager, locationParams);
                            if (bestProvider != null) {
                                if (z10) {
                                    LocationManager locationManager2 = locationManagerProvider.f29859r0;
                                    if (locationManager2 != null) {
                                        locationManager2.requestSingleUpdate(bestProvider, locationManagerProvider, Looper.getMainLooper());
                                    }
                                } else {
                                    locationManager.requestLocationUpdates(bestProvider, locationParams.getInterval(), locationParams.getDistance(), locationManagerProvider, Looper.getMainLooper());
                                }
                                unit = Unit.INSTANCE;
                            }
                            objM5535constructorimpl2 = kotlin.Result.m5535constructorimpl(unit);
                        } catch (Throwable th3) {
                            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                            objM5535constructorimpl2 = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th3));
                        }
                        Throwable thM5538exceptionOrNullimpl2 = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl2);
                        if (thM5538exceptionOrNullimpl2 != null) {
                            mutableSharedFlow.tryEmit(new Result.Error(thM5538exceptionOrNullimpl2));
                        }
                        kotlin.Result.m5534boximpl(objM5535constructorimpl2);
                    } else {
                        mutableSharedFlow.tryEmit(new Result.Error(new Throwable("No Location Manager available")));
                    }
                }
                return Unit.INSTANCE;
            }
        };
        boolean zAreLocationPermissionsGranted = SettingsKt.areLocationPermissionsGranted(this.f29857p0);
        MutableSharedFlow<Result<Location>> mutableSharedFlow = this.f29858q0;
        if (zAreLocationPermissionsGranted) {
            function0.invoke();
        } else {
            mutableSharedFlow.tryEmit(new Result.Error(new Throwable()));
        }
        return mutableSharedFlow;
    }

    @Override // com.bbva.ethermobilesdk.geolocation.location.provider.LocationProvider
    public void stop() {
        if (!SettingsKt.areLocationPermissionsGranted(this.f29857p0)) {
            this.f29858q0.tryEmit(new Result.Error(new Throwable()));
            return;
        }
        LocationManager locationManager = this.f29859r0;
        if (locationManager != null) {
            locationManager.removeUpdates(this);
        }
        this.f29860s0.removeLocationUpdates(this.f29861t0);
        Unit unit = Unit.INSTANCE;
    }
}
