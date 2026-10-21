package com.veridas.contextualdata.location;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import com.veridas.contextualdata.ContextualDataUtil;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.tasks.TasksKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocationContextualDataProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0004J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0087@¢\u0006\u0004\b\u0007\u0010\u0004J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/veridas/contextualdata/location/LocationContextualDataProvider;", "Lcom/veridas/contextualdata/location/ILocationContextualDataProvider;", "Lcom/veridas/contextualdata/location/GeoPoint;", "getLocation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastKnownLocation", "getLastKnownLocationFromLocationManager", "getLastKnownLocationFromFusedLocation", "geoPoint", "", "getCountry", "(Lcom/veridas/contextualdata/location/GeoPoint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "common-core_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLocationContextualDataProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationContextualDataProvider.kt\ncom/veridas/contextualdata/location/LocationContextualDataProvider\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,271:1\n314#2,11:272\n*S KotlinDebug\n*F\n+ 1 LocationContextualDataProvider.kt\ncom/veridas/contextualdata/location/LocationContextualDataProvider\n*L\n183#1:272,11\n*E\n"})
public final class LocationContextualDataProvider implements ILocationContextualDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f66701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f66702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f66703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f66704d;

    /* JADX INFO: compiled from: LocationContextualDataProvider.kt */
    public static final class a extends Lambda implements Function0<FusedLocationProviderClient> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final FusedLocationProviderClient invoke() {
            return LocationServices.getFusedLocationProviderClient(LocationContextualDataProvider.this.f66701a.getApplicationContext());
        }
    }

    /* JADX INFO: compiled from: LocationContextualDataProvider.kt */
    public static final class b extends Lambda implements Function0<Geocoder> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Geocoder invoke() {
            return new Geocoder(LocationContextualDataProvider.this.f66701a.getApplicationContext(), Locale.getDefault());
        }
    }

    /* JADX INFO: compiled from: LocationContextualDataProvider.kt */
    @DebugMetadata(c = "com.veridas.contextualdata.location.LocationContextualDataProvider$getCountry$2", f = "LocationContextualDataProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ GeoPoint f66708q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(GeoPoint geoPoint, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f66708q0 = geoPoint;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LocationContextualDataProvider.this.new c(this.f66708q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws IOException {
            Address address;
            String countryCode;
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Geocoder geocoderAccess$getGeocoder = LocationContextualDataProvider.access$getGeocoder(LocationContextualDataProvider.this);
            GeoPoint geoPoint = this.f66708q0;
            List<Address> fromLocation = geocoderAccess$getGeocoder.getFromLocation(geoPoint.getLatitude(), geoPoint.getLongitude(), 1);
            if (fromLocation == null || (address = (Address) CollectionsKt___CollectionsKt.firstOrNull((List) fromLocation)) == null || (countryCode = address.getCountryCode()) == null) {
                return null;
            }
            String upperCase = countryCode.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return upperCase;
        }
    }

    /* JADX INFO: compiled from: LocationContextualDataProvider.kt */
    @DebugMetadata(c = "com.veridas.contextualdata.location.LocationContextualDataProvider$getLastKnownLocationFromFusedLocation$2", f = "LocationContextualDataProvider.kt", i = {}, l = {242}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GeoPoint>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f66709p0;

        /* JADX INFO: compiled from: LocationContextualDataProvider.kt */
        @DebugMetadata(c = "com.veridas.contextualdata.location.LocationContextualDataProvider$getLastKnownLocationFromFusedLocation$2$1", f = "LocationContextualDataProvider.kt", i = {}, l = {244}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function1<Continuation<? super GeoPoint>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f66711p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ LocationContextualDataProvider f66712q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LocationContextualDataProvider locationContextualDataProvider, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f66712q0 = locationContextualDataProvider;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new a(this.f66712q0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super GeoPoint> continuation) {
                return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objM5535constructorimpl;
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f66711p0;
                try {
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        LocationContextualDataProvider locationContextualDataProvider = this.f66712q0;
                        Result.Companion companion = Result.INSTANCE;
                        Task<Location> lastLocation = LocationContextualDataProvider.access$getFusedLocationClient(locationContextualDataProvider).getLastLocation();
                        Intrinsics.checkNotNullExpressionValue(lastLocation, "getLastLocation(...)");
                        this.f66711p0 = 1;
                        obj = TasksKt.await(lastLocation, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    Intrinsics.checkNotNullExpressionValue(obj, "await(...)");
                    objM5535constructorimpl = Result.m5535constructorimpl(GeoPointKt.mapToGeoPoint((Location) obj));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
                }
                if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
                    return null;
                }
                return objM5535constructorimpl;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LocationContextualDataProvider.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GeoPoint> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f66709p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ContextualDataUtil contextualDataUtil = ContextualDataUtil.INSTANCE;
                LocationContextualDataProvider locationContextualDataProvider = LocationContextualDataProvider.this;
                Context context = locationContextualDataProvider.f66701a;
                a aVar = new a(locationContextualDataProvider, null);
                this.f66709p0 = 1;
                obj = contextualDataUtil.suspendableRequiresPermission(context, "android.permission.ACCESS_COARSE_LOCATION", aVar, this);
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

    /* JADX INFO: compiled from: LocationContextualDataProvider.kt */
    public static final class e extends Lambda implements Function0<Location> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Location invoke() {
            return LocationContextualDataProvider.access$getLocationManager(LocationContextualDataProvider.this).getLastKnownLocation("gps");
        }
    }

    /* JADX INFO: compiled from: LocationContextualDataProvider.kt */
    public static final class f extends Lambda implements Function0<Location> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Location invoke() {
            return LocationContextualDataProvider.access$getLocationManager(LocationContextualDataProvider.this).getLastKnownLocation(DeepLinkListenerAdapter.Constants.ERROR_NETWORK);
        }
    }

    /* JADX INFO: compiled from: LocationContextualDataProvider.kt */
    @DebugMetadata(c = "com.veridas.contextualdata.location.LocationContextualDataProvider$getLocation$2", f = "LocationContextualDataProvider.kt", i = {}, l = {68, 70}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function1<Continuation<? super GeoPoint>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f66715p0;

        public g(Continuation<? super g> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return LocationContextualDataProvider.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super GeoPoint> continuation) {
            return ((g) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f66715p0;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return (GeoPoint) obj;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return (GeoPoint) obj;
            }
            ResultKt.throwOnFailure(obj);
            LocationContextualDataProvider locationContextualDataProvider = LocationContextualDataProvider.this;
            if (LocationContextualDataProvider.access$isFusedLocationAvailable(locationContextualDataProvider)) {
                this.f66715p0 = 1;
                obj = LocationContextualDataProvider.access$getLocationWithFusedClient(locationContextualDataProvider, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return (GeoPoint) obj;
            }
            this.f66715p0 = 2;
            obj = LocationContextualDataProvider.access$getLocationWithLocationManager(locationContextualDataProvider, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (GeoPoint) obj;
        }
    }

    /* JADX INFO: compiled from: LocationContextualDataProvider.kt */
    public static final class h extends Lambda implements Function0<LocationManager> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LocationManager invoke() {
            Object systemService = LocationContextualDataProvider.this.f66701a.getApplicationContext().getSystemService("location");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            return (LocationManager) systemService;
        }
    }

    public LocationContextualDataProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f66701a = context;
        this.f66702b = LazyKt__LazyJVMKt.lazy(new h());
        this.f66703c = LazyKt__LazyJVMKt.lazy(new a());
        this.f66704d = LazyKt__LazyJVMKt.lazy(new b());
    }

    public static final FusedLocationProviderClient access$getFusedLocationClient(LocationContextualDataProvider locationContextualDataProvider) {
        return (FusedLocationProviderClient) locationContextualDataProvider.f66703c.getValue();
    }

    public static final Geocoder access$getGeocoder(LocationContextualDataProvider locationContextualDataProvider) {
        return (Geocoder) locationContextualDataProvider.f66704d.getValue();
    }

    public static final LocationCallback access$getLocationCallBack(LocationContextualDataProvider locationContextualDataProvider, final Function1 function1) {
        locationContextualDataProvider.getClass();
        return new LocationCallback() { // from class: com.veridas.contextualdata.location.LocationContextualDataProvider$getLocationCallBack$1
            @Override // com.google.android.gms.location.LocationCallback
            public void onLocationResult(@NotNull LocationResult locationResult) {
                Intrinsics.checkNotNullParameter(locationResult, "locationResult");
                Location lastLocation = locationResult.getLastLocation();
                if (lastLocation != null) {
                    function1.invoke(GeoPointKt.mapToGeoPoint(lastLocation));
                }
            }
        };
    }

    public static final Object access$getLocationFromLocationManager(LocationContextualDataProvider locationContextualDataProvider, LocationManager locationManager, String str, Continuation continuation) throws Throwable {
        locationContextualDataProvider.getClass();
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (Build.VERSION.SDK_INT >= 30) {
            CancellationSignal cancellationSignal = new CancellationSignal();
            locationManager.getCurrentLocation(str, cancellationSignal, locationContextualDataProvider.f66701a.getMainExecutor(), new yi.b(cancellableContinuationImpl));
            cancellableContinuationImpl.invokeOnCancellation(new yi.c(cancellationSignal));
        } else {
            yi.e eVar = new yi.e(cancellableContinuationImpl);
            locationManager.requestSingleUpdate(str, eVar, Looper.getMainLooper());
            cancellableContinuationImpl.invokeOnCancellation(new yi.d(locationManager, eVar));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final LocationManager access$getLocationManager(LocationContextualDataProvider locationContextualDataProvider) {
        return (LocationManager) locationContextualDataProvider.f66702b.getValue();
    }

    public static final Object access$getLocationWithFusedClient(LocationContextualDataProvider locationContextualDataProvider, Continuation continuation) {
        locationContextualDataProvider.getClass();
        return FlowKt.first(FlowKt.callbackFlow(new yi.a(locationContextualDataProvider, null)), continuation);
    }

    public static final Object access$getLocationWithLocationManager(LocationContextualDataProvider locationContextualDataProvider, Continuation continuation) {
        locationContextualDataProvider.getClass();
        return BuildersKt.withContext(Dispatchers.getIO(), new yi.f(locationContextualDataProvider, null), continuation);
    }

    public static final /* synthetic */ boolean access$isFusedLocationAvailable(LocationContextualDataProvider locationContextualDataProvider) {
        locationContextualDataProvider.getClass();
        return true;
    }

    @Override // com.veridas.contextualdata.location.ILocationContextualDataProvider
    @Nullable
    public Object getCountry(@NotNull GeoPoint geoPoint, @NotNull Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new c(geoPoint, null), continuation);
    }

    @Override // com.veridas.contextualdata.location.ILocationContextualDataProvider
    @Nullable
    public Object getLastKnownLocation(@NotNull Continuation<? super GeoPoint> continuation) {
        return getLastKnownLocationFromFusedLocation(continuation);
    }

    @SuppressLint({"MissingPermission"})
    @Nullable
    public final Object getLastKnownLocationFromFusedLocation(@NotNull Continuation<? super GeoPoint> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new d(null), continuation);
    }

    @SuppressLint({"MissingPermission"})
    @Nullable
    public final GeoPoint getLastKnownLocationFromLocationManager() {
        ContextualDataUtil contextualDataUtil = ContextualDataUtil.INSTANCE;
        e eVar = new e();
        Context context = this.f66701a;
        Location location = (Location) contextualDataUtil.requiresPermission(context, "android.permission.ACCESS_FINE_LOCATION", eVar);
        if (location != null) {
            return GeoPointKt.mapToGeoPoint(location);
        }
        Location location2 = (Location) contextualDataUtil.requiresPermission(context, "android.permission.ACCESS_COARSE_LOCATION", new f());
        if (location2 != null) {
            return GeoPointKt.mapToGeoPoint(location2);
        }
        return null;
    }

    @Override // com.veridas.contextualdata.location.ILocationContextualDataProvider
    @Nullable
    public Object getLocation(@NotNull Continuation<? super GeoPoint> continuation) {
        return ContextualDataUtil.INSTANCE.suspendableRequiresPermission(this.f66701a, "android.permission.ACCESS_COARSE_LOCATION", new g(null), continuation);
    }
}
