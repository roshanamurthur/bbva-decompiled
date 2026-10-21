package com.bbva.plugin.geolocation.manager;

import android.content.Context;
import android.location.Address;
import android.location.Location;
import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.geolocation.EtherLocation;
import com.bbva.ethermobilesdk.geolocation.geocoding.GeocodingControl;
import com.bbva.ethermobilesdk.geolocation.geocoding.model.LocationAddress;
import com.bbva.ethermobilesdk.geolocation.location.LocationControl;
import com.bbva.ethermobilesdk.geolocation.location.model.LocationAccuracy;
import com.bbva.ethermobilesdk.geolocation.location.model.LocationMode;
import com.bbva.ethermobilesdk.geolocation.location.model.LocationParams;
import com.bbva.plugin.geolocation.command.response.GeolocationErrors;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GmsLocator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0015\u001a\u00020\u0014H\u0016J@\u0010\u001c\u001a\u00020\u00142\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u0016j\u0002`\u00172\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00140\u0016j\u0002`\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/bbva/plugin/geolocation/manager/GmsLocator;", "Lcom/bbva/plugin/geolocation/manager/Locator;", "", "address", "Lcom/bbva/ethermobilesdk/geolocation/geocoding/model/LocationAddress;", "directResolution", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "latitude", "longitude", "Landroid/location/Address;", "reverseResolution", "(DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "interval", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Landroid/location/Location;", "startWatcher", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "stopWatcher", "Lkotlin/Function1;", "Lcom/bbva/plugin/geolocation/manager/OnLocation;", "success", "Lcom/bbva/androidtoolkit/plugin/response/ErrorMessage;", "Lcom/bbva/plugin/geolocation/manager/OnError;", "error", "location", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "geolocation-plugin_release"}, k = 1, mv = {2, 0, 0})
public final class GmsLocator implements Locator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LocationControl f35662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final GeocodingControl f35663b;

    /* JADX INFO: compiled from: GmsLocator.kt */
    @DebugMetadata(c = "com.bbva.plugin.geolocation.manager.GmsLocator", f = "GmsLocator.kt", i = {0, 0, 0, 1}, l = {76, 85}, m = "location", n = {"this", "success", "error", "error"}, s = {"L$0", "L$1", "L$2", "L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Object f35664p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Function1 f35665q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Function1 f35666r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f35667s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f35669u0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35667s0 = obj;
            this.f35669u0 |= Integer.MIN_VALUE;
            return GmsLocator.this.location(null, null, this);
        }
    }

    /* JADX INFO: compiled from: GmsLocator.kt */
    public static final class b<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Location, Unit> f35670p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<ErrorMessage, Unit> f35671q0;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super Location, Unit> function1, Function1<? super ErrorMessage, Unit> function2) {
            this.f35670p0 = function1;
            this.f35671q0 = function2;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            Result result = (Result) obj;
            if (result instanceof Result.Success) {
                this.f35670p0.invoke((Location) ((Result.Success) result).getValue());
            } else {
                if (!(result instanceof Result.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f35671q0.invoke(Errors.ErrorDefault);
            }
            return Unit.INSTANCE;
        }
    }

    public GmsLocator(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        EtherLocation etherLocation = new EtherLocation(context);
        this.f35662a = EtherLocation.location$default(etherLocation, null, 1, null);
        this.f35663b = EtherLocation.geocoding$default(etherLocation, null, 1, null);
    }

    public final Object a(Function1<? super Location, Unit> function1, Function1<? super ErrorMessage, Unit> function2, Continuation<? super Unit> continuation) {
        LocationControl locationControl = this.f35662a;
        if (locationControl.getState().isAnyProviderAvailable()) {
            Object objCollect = LocationControl.start$default(locationControl, LocationMode.OneFix, null, 2, null).collect(new b(function1, function2), continuation);
            return objCollect == ek.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
        }
        function2.invoke(GeolocationErrors.ErrorNotProviderAvailable);
        return Unit.INSTANCE;
    }

    @Override // com.bbva.plugin.geolocation.manager.Locator
    @Nullable
    public Object directResolution(@NotNull String str, @NotNull Continuation<? super LocationAddress> continuation) {
        return this.f35663b.geocoding(str, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.plugin.geolocation.manager.Locator
    @Nullable
    public Object location(@NotNull Function1<? super Location, Unit> function1, @NotNull Function1<? super ErrorMessage, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        a aVar;
        GmsLocator gmsLocator;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f35669u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f35669u0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object lastLocation = aVar.f35667s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f35669u0;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    function2 = aVar.f35666r0;
                    function1 = aVar.f35665q0;
                    gmsLocator = (GmsLocator) aVar.f35664p0;
                    ResultKt.throwOnFailure(lastLocation);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(lastLocation);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(lastLocation);
            LocationControl locationControl = this.f35662a;
            aVar.f35664p0 = this;
            aVar.f35665q0 = function1;
            aVar.f35666r0 = function2;
            aVar.f35669u0 = 1;
            lastLocation = locationControl.getLastLocation(aVar);
            if (lastLocation == coroutine_suspended) {
                return coroutine_suspended;
            }
            gmsLocator = this;
            Location location = (Location) lastLocation;
            if (location != null && location.getTime() + ((long) 30000) >= System.currentTimeMillis()) {
                function1.invoke(location);
                return Unit.INSTANCE;
            }
            aVar.f35664p0 = function2;
            aVar.f35665q0 = null;
            aVar.f35666r0 = null;
            aVar.f35669u0 = 2;
            if (gmsLocator.a(function1, function2, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        } catch (Exception unused) {
            function2.invoke(Errors.ErrorDefault);
        }
    }

    @Override // com.bbva.plugin.geolocation.manager.Locator
    @Nullable
    public Object reverseResolution(double d2, double d3, @NotNull Continuation<? super Address> continuation) {
        Location location = new Location("");
        location.setLatitude(d2);
        location.setLongitude(d3);
        return this.f35663b.reverseGeocoding(location, continuation);
    }

    @Override // com.bbva.plugin.geolocation.manager.Locator
    @Nullable
    public Object startWatcher(long j10, @NotNull Continuation<? super Flow<? extends Result<Location>>> continuation) {
        LocationParams.Builder builder = new LocationParams.Builder(0L, 0.0f, null, 7, null);
        builder.setAccuracy(LocationAccuracy.HIGH);
        builder.setDistance(0.0f);
        builder.setInterval(j10);
        return LocationControl.start$default(this.f35662a, null, builder.build(), 1, null);
    }

    @Override // com.bbva.plugin.geolocation.manager.Locator
    public void stopWatcher() {
        this.f35662a.stop();
    }
}
