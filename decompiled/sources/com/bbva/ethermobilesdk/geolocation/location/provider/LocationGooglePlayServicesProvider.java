package com.bbva.ethermobilesdk.geolocation.location.provider;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.location.Location;
import android.os.Looper;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.geolocation.location.callback.FusedLocationCallback;
import com.bbva.ethermobilesdk.geolocation.location.model.LocationAccuracy;
import com.bbva.ethermobilesdk.geolocation.location.model.LocationParams;
import com.bbva.ethermobilesdk.geolocation.location.provider.LocationGooglePlayServicesProvider;
import com.bbva.ethermobilesdk.geolocation.utils.SettingsKt;
import com.bbva.ethermobilesdk.geolocation.utils.extension.LoggerKt;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocationGooglePlayServicesProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 )2\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001)B\u000f\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J$\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0097@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u001e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001c\u001a\u00020\bJ\u000e\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\bJ\u000e\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\bR\u0014\u0010$\u001a\u00020!8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006*"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/location/provider/LocationGooglePlayServicesProvider;", "Lcom/bbva/ethermobilesdk/geolocation/location/provider/LocationProvider;", "Lcom/google/android/gms/location/LocationListener;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/google/android/gms/common/api/ResultCallback;", "Lcom/google/android/gms/common/api/Status;", "Lcom/bbva/ethermobilesdk/geolocation/location/model/LocationParams;", "params", "", "singleUpdate", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Landroid/location/Location;", EventDataKeys.Lifecycle.LIFECYCLE_START, "", "stop", "getLastLocation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "location", "onLocationChanged", "status", "onResult", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "isCheckingLocationSettings", "allowingLocationSettings", "setCheckLocationSettings", "alwaysShow", "setLocationSettingsAlwaysShow", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "geolocation_release"}, k = 1, mv = {2, 0, 0})
public final class LocationGooglePlayServicesProvider implements LocationProvider, LocationListener, CoroutineScope, ResultCallback<Status> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f29843p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Context f29844q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Result<Location>> f29845r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public LocationRequest f29846s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final FusedLocationProviderClient f29847t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f29848u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f29849w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Nullable
    public FusedLocationCallback f29850x0;

    /* JADX INFO: compiled from: LocationGooglePlayServicesProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/location/provider/LocationGooglePlayServicesProvider$Companion;", "", "<init>", "()V", "REQUEST_START_LOCATION_FIX", "", "REQUEST_CHECK_SETTINGS", "geolocation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: LocationGooglePlayServicesProvider.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocationAccuracy.values().length];
            try {
                iArr[LocationAccuracy.HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocationAccuracy.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocationAccuracy.LOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LocationAccuracy.LOWEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: LocationGooglePlayServicesProvider.kt */
    public static final class a implements Function1<Location, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Continuation<Location> f29851p0;

        public a(SafeContinuation safeContinuation) {
            this.f29851p0 = safeContinuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Location location) {
            this.f29851p0.resumeWith(kotlin.Result.m5535constructorimpl(location));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LocationGooglePlayServicesProvider.kt */
    public static final class b implements OnSuccessListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f29852a;

        public b(a function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f29852a = function;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f29852a.invoke(obj);
        }
    }

    /* JADX INFO: compiled from: LocationGooglePlayServicesProvider.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.geolocation.location.provider.LocationGooglePlayServicesProvider$startUpdating$1", f = "LocationGooglePlayServicesProvider.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f29853p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ LocationRequest f29855r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LocationRequest locationRequest, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f29855r0 = locationRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LocationGooglePlayServicesProvider.this.new c(this.f29855r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f29853p0;
            LocationRequest locationRequest = this.f29855r0;
            LocationGooglePlayServicesProvider locationGooglePlayServicesProvider = LocationGooglePlayServicesProvider.this;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Context context = locationGooglePlayServicesProvider.f29844q0;
                boolean z10 = locationGooglePlayServicesProvider.f29849w0;
                this.f29853p0 = 1;
                obj = SettingsKt.checkLocationSettings(context, z10, locationRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                locationGooglePlayServicesProvider.stop();
                return Unit.INSTANCE;
            }
            LoggerKt.log("All location settings are satisfied.");
            locationGooglePlayServicesProvider.v0 = true;
            locationGooglePlayServicesProvider.a(locationRequest);
            return Unit.INSTANCE;
        }
    }

    public LocationGooglePlayServicesProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29843p0 = CoroutineScopeKt.MainScope();
        this.f29844q0 = context;
        this.f29845r0 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
        Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
        this.f29847t0 = fusedLocationProviderClient;
        this.f29849w0 = true;
    }

    @SuppressLint({"MissingPermission"})
    public final void a(LocationRequest locationRequest) {
        FusedLocationCallback fusedLocationCallback;
        if (SettingsKt.areLocationPermissionsGranted(this.f29844q0) && (fusedLocationCallback = this.f29850x0) != null) {
            FusedLocationProviderClient fusedLocationProviderClient = this.f29847t0;
            Task<LocationAvailability> locationAvailability = fusedLocationProviderClient.getLocationAvailability();
            final j7.a aVar = new j7.a(0);
            locationAvailability.addOnSuccessListener(new OnSuccessListener() { // from class: j7.b
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    LocationGooglePlayServicesProvider.Companion companion = LocationGooglePlayServicesProvider.INSTANCE;
                    aVar.invoke(obj);
                }
            });
            Task<Void> taskRequestLocationUpdates = fusedLocationProviderClient.requestLocationUpdates(locationRequest, fusedLocationCallback, Looper.getMainLooper());
            final j7.c cVar = new j7.c();
            taskRequestLocationUpdates.addOnSuccessListener(new OnSuccessListener() { // from class: j7.d
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    LocationGooglePlayServicesProvider.Companion companion = LocationGooglePlayServicesProvider.INSTANCE;
                    cVar.invoke(obj);
                }
            });
        }
    }

    public final void b(LocationRequest locationRequest) {
        if (!this.f29848u0 || this.v0) {
            a(locationRequest);
        } else {
            LoggerKt.log("Location Settings Check before updating location");
            BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getMain(), null, new c(locationRequest, null), 2, null);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f29843p0.getCoroutineContext();
    }

    @Override // com.bbva.ethermobilesdk.geolocation.location.provider.LocationProvider
    @SuppressLint({"MissingPermission"})
    @Nullable
    public Object getLastLocation(@NotNull Continuation<? super Location> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        Context context = this.f29844q0;
        if (!SettingsKt.areLocationPermissionsGranted(context)) {
            LoggerKt.logError$default("Error while getting lastLocation - lack of permissions", null, 2, null);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            safeContinuation.resumeWith(kotlin.Result.m5535constructorimpl(ResultKt.createFailure(new Throwable("Error while getting lastLocation - lack of permissions"))));
        }
        try {
            LocationServices.getFusedLocationProviderClient(context).getLastLocation().addOnSuccessListener(new b(new a(safeContinuation)));
        } catch (Exception e5) {
            LoggerKt.logError("Error while getting lastLocation", e5);
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            safeContinuation.resumeWith(kotlin.Result.m5535constructorimpl(ResultKt.createFailure(new Throwable(e5.getMessage()))));
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: renamed from: isCheckingLocationSettings, reason: from getter */
    public final boolean getF29848u0() {
        return this.f29848u0;
    }

    public final void onActivityResult(int requestCode, int resultCode, @NotNull Intent data) {
        Intrinsics.checkNotNullParameter(data, "data");
        LocationRequest locationRequest = null;
        if (requestCode == 10001) {
            if (resultCode != -1) {
                if (resultCode != 0) {
                    return;
                }
                LoggerKt.log("User chose not to fix the problem.");
                stop();
                return;
            }
            LoggerKt.log("User fixed the problem.");
            LocationRequest locationRequest2 = this.f29846s0;
            if (locationRequest2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("locationRequest");
            } else {
                locationRequest = locationRequest2;
            }
            b(locationRequest);
            return;
        }
        if (requestCode != 20001) {
            return;
        }
        if (resultCode != -1) {
            if (resultCode != 0) {
                return;
            }
            LoggerKt.log("User chose not to make required location settings changes.");
            stop();
            return;
        }
        LoggerKt.log("User agreed to make required location settings changes.");
        this.v0 = true;
        LocationRequest locationRequest3 = this.f29846s0;
        if (locationRequest3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("locationRequest");
        } else {
            locationRequest = locationRequest3;
        }
        b(locationRequest);
    }

    @Override // com.google.android.gms.location.LocationListener
    public void onLocationChanged(@NotNull Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        LoggerKt.log("onLocationChanged " + location);
        this.f29845r0.tryEmit(new Result.Success(location));
    }

    public final void setCheckLocationSettings(boolean allowingLocationSettings) {
        this.f29848u0 = allowingLocationSettings;
    }

    public final void setLocationSettingsAlwaysShow(boolean alwaysShow) {
        this.f29849w0 = alwaysShow;
    }

    @Override // com.bbva.ethermobilesdk.geolocation.location.provider.LocationProvider
    @NotNull
    public Flow<Result<Location>> start(@NotNull LocationParams params, boolean singleUpdate) {
        int i10;
        Intrinsics.checkNotNullParameter(params, "params");
        MutableSharedFlow<Result<Location>> mutableSharedFlow = this.f29845r0;
        this.f29850x0 = new FusedLocationCallback(mutableSharedFlow);
        LocationRequest locationRequestCreate = LocationRequest.create();
        locationRequestCreate.setFastestInterval(params.getInterval());
        locationRequestCreate.setInterval(params.getInterval());
        locationRequestCreate.setSmallestDisplacement(params.getDistance());
        int i11 = WhenMappings.$EnumSwitchMapping$0[params.getAccuracy().ordinal()];
        if (i11 == 1) {
            i10 = 100;
        } else if (i11 == 2) {
            i10 = 102;
        } else if (i11 == 3) {
            i10 = 104;
        } else {
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = 105;
        }
        locationRequestCreate.setPriority(i10);
        if (singleUpdate) {
            locationRequestCreate.setNumUpdates(1);
        }
        Intrinsics.checkNotNullExpressionValue(locationRequestCreate, "apply(...)");
        this.f29846s0 = locationRequestCreate;
        b(locationRequestCreate);
        return mutableSharedFlow;
    }

    @Override // com.bbva.ethermobilesdk.geolocation.location.provider.LocationProvider
    public void stop() {
        LoggerKt.log("stop");
        FusedLocationCallback fusedLocationCallback = this.f29850x0;
        if (fusedLocationCallback != null) {
            this.f29847t0.removeLocationUpdates(fusedLocationCallback);
        }
        this.v0 = false;
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public void onResult(@NotNull Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        if (status.isSuccess()) {
            LoggerKt.log("Locations update request successful");
            return;
        }
        if (status.hasResolution()) {
            Context context = this.f29844q0;
            if (context instanceof Activity) {
                LoggerKt.log("Unable to register,- will startActivityForResult.");
                try {
                    status.startResolutionForResult((Activity) context, CameraAccessExceptionCompat.CAMERA_UNAVAILABLE_DO_NOT_DISTURB);
                    return;
                } catch (IntentSender.SendIntentException e5) {
                    LoggerKt.logError("problem with startResolutionForResult", e5);
                    return;
                }
            }
        }
        LoggerKt.logError$default("Registering failed: " + status.getStatusMessage(), null, 2, null);
    }
}
