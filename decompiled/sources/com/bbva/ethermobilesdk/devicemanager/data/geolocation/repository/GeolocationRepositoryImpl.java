package com.bbva.ethermobilesdk.devicemanager.data.geolocation.repository;

import android.location.Location;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobile.help.kit.result.ResultKt;
import com.bbva.ethermobilesdk.devicemanager.data.permission.repository.PermissionRepository;
import com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError;
import com.bbva.ethermobilesdk.geolocation.EtherLocation;
import com.bbva.ethermobilesdk.geolocation.location.LocationControl;
import com.bbva.ethermobilesdk.geolocation.location.provider.LocationProvider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GeolocationRepositoryImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0014"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/data/geolocation/repository/GeolocationRepositoryImpl;", "Lcom/bbva/ethermobilesdk/devicemanager/data/geolocation/repository/GeolocationRepository;", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Landroid/location/Location;", "getLastLocation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "location", "", "getLatitude", "getLongitude", "getAltitude", "getAccuracy", "Lcom/bbva/ethermobilesdk/devicemanager/data/permission/repository/PermissionRepository;", "permissionRepository", "Lcom/bbva/ethermobilesdk/geolocation/EtherLocation;", "geolocation", "Lcom/bbva/ethermobilesdk/geolocation/location/provider/LocationProvider;", "locationProvider", "<init>", "(Lcom/bbva/ethermobilesdk/devicemanager/data/permission/repository/PermissionRepository;Lcom/bbva/ethermobilesdk/geolocation/EtherLocation;Lcom/bbva/ethermobilesdk/geolocation/location/provider/LocationProvider;)V", "devicemanager_release"}, k = 1, mv = {2, 0, 0})
public final class GeolocationRepositoryImpl implements GeolocationRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PermissionRepository f29651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final EtherLocation f29652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LocationProvider f29653c;

    /* JADX INFO: compiled from: GeolocationRepositoryImpl.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicemanager.data.geolocation.repository.GeolocationRepositoryImpl", f = "GeolocationRepositoryImpl.kt", i = {0}, l = {23}, m = "getLastLocation", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public GeolocationRepositoryImpl f29654p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f29655q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f29657s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29655q0 = obj;
            this.f29657s0 |= Integer.MIN_VALUE;
            return GeolocationRepositoryImpl.this.getLastLocation(this);
        }
    }

    public GeolocationRepositoryImpl(@NotNull PermissionRepository permissionRepository, @NotNull EtherLocation geolocation, @NotNull LocationProvider locationProvider) {
        Intrinsics.checkNotNullParameter(permissionRepository, "permissionRepository");
        Intrinsics.checkNotNullParameter(geolocation, "geolocation");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        this.f29651a = permissionRepository;
        this.f29652b = geolocation;
        this.f29653c = locationProvider;
    }

    public final <T> Result.Error<T> a(Throwable th2) {
        Result.Error<T> error;
        if (th2 instanceof DeviceManagerError.GeolocationError.GeolocationInvalid) {
            Result<Unit> resultB = b();
            if (resultB instanceof Result.Success) {
                return new Result.Error<>(new DeviceManagerError.GeolocationError.GeolocationInvalid(null, null, 3, null));
            }
            if (!(resultB instanceof Result.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            error = new Result.Error<>(((Result.Error) resultB).getException());
        } else {
            Result<Unit> resultB2 = b();
            if (!(resultB2 instanceof Result.Success)) {
                if (resultB2 instanceof Result.Error) {
                    return new Result.Error<>(((Result.Error) resultB2).getException());
                }
                throw new NoWhenBranchMatchedException();
            }
            error = new Result.Error<>(new DeviceManagerError(null, th2, 1, null));
        }
        return error;
    }

    public final Result<Unit> b() {
        Object objM5535constructorimpl;
        PermissionRepository permissionRepository = this.f29651a;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ResultKt.getOrThrow(permissionRepository.isGrantedAccessCoarseLocation());
            ResultKt.getOrThrow(permissionRepository.isGrantedAccessFineLocation());
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(Unit.INSTANCE));
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            objM5535constructorimpl = new Result.Error(thM5538exceptionOrNullimpl);
        }
        return (Result) objM5535constructorimpl;
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.geolocation.repository.GeolocationRepository
    @NotNull
    public Result<String> getAccuracy(@Nullable Location location) {
        Object objM5535constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            if (location == null) {
                throw new DeviceManagerError.GeolocationError.GeolocationInvalid(null, null, 3, null);
            }
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(String.valueOf(location.getAccuracy())));
            Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
            if (thM5538exceptionOrNullimpl != null) {
                objM5535constructorimpl = a(thM5538exceptionOrNullimpl);
            }
            return (Result) objM5535constructorimpl;
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.geolocation.repository.GeolocationRepository
    @NotNull
    public Result<String> getAltitude(@Nullable Location location) {
        Object objM5535constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            if (location == null) {
                throw new DeviceManagerError.GeolocationError.GeolocationInvalid(null, null, 3, null);
            }
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(String.valueOf(location.getAltitude())));
            Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
            if (thM5538exceptionOrNullimpl != null) {
                objM5535constructorimpl = a(thM5538exceptionOrNullimpl);
            }
            return (Result) objM5535constructorimpl;
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0052 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:12:0x0027, B:23:0x004e, B:25:0x0052, B:26:0x005c, B:27:0x0063), top: B:38:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:12:0x0027, B:23:0x004e, B:25:0x0052, B:26:0x005c, B:27:0x0063), top: B:38:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.ethermobilesdk.devicemanager.data.geolocation.repository.GeolocationRepository
    @Nullable
    public Object getLastLocation(@NotNull Continuation<? super Result<Location>> continuation) {
        a aVar;
        GeolocationRepositoryImpl geolocationRepositoryImpl;
        Object objM5535constructorimpl;
        Location location;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f29657s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f29657s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object lastLocation = aVar.f29655q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f29657s0;
        if (i11 == 0) {
            kotlin.ResultKt.throwOnFailure(lastLocation);
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                LocationControl locationControlLocation = this.f29652b.location(this.f29653c);
                aVar.f29654p0 = this;
                aVar.f29657s0 = 1;
                lastLocation = locationControlLocation.getLastLocation(aVar);
                if (lastLocation == coroutine_suspended) {
                    return coroutine_suspended;
                }
                geolocationRepositoryImpl = this;
                location = (Location) lastLocation;
                if (location != null) {
                    throw new DeviceManagerError.GeolocationError.GeolocationInvalid(null, null, 3, null);
                }
                objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(location));
            } catch (Throwable th2) {
                th = th2;
                geolocationRepositoryImpl = this;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                objM5535constructorimpl = kotlin.Result.m5535constructorimpl(kotlin.ResultKt.createFailure(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            geolocationRepositoryImpl = aVar.f29654p0;
            try {
                kotlin.ResultKt.throwOnFailure(lastLocation);
                location = (Location) lastLocation;
                if (location != null) {
                    throw new DeviceManagerError.GeolocationError.GeolocationInvalid(null, null, 3, null);
                }
                objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(location));
            } catch (Throwable th3) {
                th = th3;
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                objM5535constructorimpl = kotlin.Result.m5535constructorimpl(kotlin.ResultKt.createFailure(th));
            }
        }
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        return thM5538exceptionOrNullimpl == null ? objM5535constructorimpl : geolocationRepositoryImpl.a(thM5538exceptionOrNullimpl);
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.geolocation.repository.GeolocationRepository
    @NotNull
    public Result<String> getLatitude(@Nullable Location location) {
        Object objM5535constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            if (location == null) {
                throw new DeviceManagerError.GeolocationError.GeolocationInvalid(null, null, 3, null);
            }
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(String.valueOf(location.getLatitude())));
            Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
            if (thM5538exceptionOrNullimpl != null) {
                objM5535constructorimpl = a(thM5538exceptionOrNullimpl);
            }
            return (Result) objM5535constructorimpl;
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.geolocation.repository.GeolocationRepository
    @NotNull
    public Result<String> getLongitude(@Nullable Location location) {
        Object objM5535constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            if (location == null) {
                throw new DeviceManagerError.GeolocationError.GeolocationInvalid(null, null, 3, null);
            }
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(String.valueOf(location.getLongitude())));
            Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
            if (thM5538exceptionOrNullimpl != null) {
                objM5535constructorimpl = a(thM5538exceptionOrNullimpl);
            }
            return (Result) objM5535constructorimpl;
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
    }
}
