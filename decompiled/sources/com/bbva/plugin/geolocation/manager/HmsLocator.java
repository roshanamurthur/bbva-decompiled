package com.bbva.plugin.geolocation.manager;

import android.content.Context;
import android.location.Address;
import android.location.Location;
import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.ethermobile.geolocation.hms.provider.location.HmsLocationProvider;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.geolocation.EtherLocation;
import com.bbva.ethermobilesdk.geolocation.geocoding.GeocodingControl;
import com.bbva.ethermobilesdk.geolocation.geocoding.model.LocationAddress;
import com.bbva.ethermobilesdk.geolocation.location.LocationControl;
import com.bbva.ethermobilesdk.geolocation.location.model.LocationAccuracy;
import com.bbva.ethermobilesdk.geolocation.location.model.LocationMode;
import com.bbva.ethermobilesdk.geolocation.location.model.LocationParams;
import com.bbva.ethermobilesdk.geolocation.location.provider.LocationProvider;
import com.bbva.plugin.geolocation.command.response.GeolocationErrors;
import fb.b;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HmsLocator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J@\u0010\n\u001a\u00020\u00042\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00052\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\bH\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a0\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0004H\u0016¨\u0006\""}, d2 = {"Lcom/bbva/plugin/geolocation/manager/HmsLocator;", "Lcom/bbva/plugin/geolocation/manager/Locator;", "Lkotlin/Function1;", "Landroid/location/Location;", "", "Lcom/bbva/plugin/geolocation/manager/OnLocation;", "success", "Lcom/bbva/androidtoolkit/plugin/response/ErrorMessage;", "Lcom/bbva/plugin/geolocation/manager/OnError;", "error", "location", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "address", "Lcom/bbva/ethermobilesdk/geolocation/geocoding/model/LocationAddress;", "directResolution", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "latitude", "longitude", "Landroid/location/Address;", "reverseResolution", "(DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "interval", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/ethermobile/help/kit/result/Result;", "startWatcher", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopWatcher", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "geolocation-plugin_release"}, k = 1, mv = {2, 0, 0})
public final class HmsLocator implements Locator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LocationControl f35672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final GeocodingControl f35673b;

    /* JADX INFO: compiled from: HmsLocator.kt */
    @DebugMetadata(c = "com.bbva.plugin.geolocation.manager.HmsLocator", f = "HmsLocator.kt", i = {0, 0, 0}, l = {29, 38}, m = "location", n = {"this", "success", "error"}, s = {"L$0", "L$1", "L$2"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public HmsLocator f35674p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Function1 f35675q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Function1 f35676r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f35677s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f35679u0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35677s0 = obj;
            this.f35679u0 |= Integer.MIN_VALUE;
            return HmsLocator.this.location(null, null, this);
        }
    }

    public HmsLocator(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        EtherLocation etherLocation = new EtherLocation(context);
        this.f35672a = etherLocation.location((LocationProvider) new HmsLocationProvider(context));
        this.f35673b = EtherLocation.geocoding$default(etherLocation, null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Function1<? super Location, Unit> function1, Function1<? super ErrorMessage, Unit> function2, Continuation<? super Unit> continuation) {
        fb.a aVar;
        if (continuation instanceof fb.a) {
            aVar = (fb.a) continuation;
            int i10 = aVar.f68399s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f68399s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new fb.a(this, continuation);
            }
        } else {
            aVar = new fb.a(this, continuation);
        }
        Object obj = aVar.f68397q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f68399s0;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                LocationControl locationControl = this.f35672a;
                if (!locationControl.getState().isAnyProviderAvailable()) {
                    function2.invoke(GeolocationErrors.ErrorNotProviderAvailable);
                    return Unit.INSTANCE;
                }
                Flow flowStart$default = LocationControl.start$default(locationControl, LocationMode.OneFix, null, 2, null);
                b bVar = new b(function1, function2);
                aVar.f68396p0 = function2;
                aVar.f68399s0 = 1;
                if (flowStart$default.collect(bVar, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function2 = aVar.f68396p0;
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception unused) {
            function2.invoke(Errors.ErrorDefault);
        }
        return Unit.INSTANCE;
    }

    @Override // com.bbva.plugin.geolocation.manager.Locator
    @Nullable
    public Object directResolution(@NotNull String str, @NotNull Continuation<? super LocationAddress> continuation) {
        return this.f35673b.geocoding(str, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.plugin.geolocation.manager.Locator
    @Nullable
    public Object location(@NotNull Function1<? super Location, Unit> function1, @NotNull Function1<? super ErrorMessage, Unit> function2, @NotNull Continuation<? super Unit> continuation) {
        a aVar;
        HmsLocator hmsLocator;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f35679u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f35679u0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object lastLocation = aVar.f35677s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f35679u0;
        if (i11 != 0) {
            if (i11 == 1) {
                function2 = aVar.f35676r0;
                function1 = aVar.f35675q0;
                hmsLocator = aVar.f35674p0;
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
        aVar.f35674p0 = this;
        aVar.f35675q0 = function1;
        aVar.f35676r0 = function2;
        aVar.f35679u0 = 1;
        lastLocation = this.f35672a.getLastLocation(aVar);
        if (lastLocation == coroutine_suspended) {
            return coroutine_suspended;
        }
        hmsLocator = this;
        Location location = (Location) lastLocation;
        if (location != null && location.getTime() + ((long) 30000) >= System.currentTimeMillis()) {
            function1.invoke(location);
            return Unit.INSTANCE;
        }
        aVar.f35674p0 = null;
        aVar.f35675q0 = null;
        aVar.f35676r0 = null;
        aVar.f35679u0 = 2;
        if (hmsLocator.a(function1, function2, aVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // com.bbva.plugin.geolocation.manager.Locator
    @Nullable
    public Object reverseResolution(double d2, double d3, @NotNull Continuation<? super Address> continuation) {
        Location location = new Location("");
        location.setLatitude(d2);
        location.setLongitude(d3);
        return this.f35673b.reverseGeocoding(location, continuation);
    }

    @Override // com.bbva.plugin.geolocation.manager.Locator
    @Nullable
    public Object startWatcher(long j10, @NotNull Continuation<? super Flow<? extends Result<Location>>> continuation) {
        LocationParams.Builder builder = new LocationParams.Builder(0L, 0.0f, null, 7, null);
        builder.setAccuracy(LocationAccuracy.HIGH);
        builder.setDistance(0.0f);
        builder.setInterval(j10);
        return LocationControl.start$default(this.f35672a, null, builder.build(), 1, null);
    }

    @Override // com.bbva.plugin.geolocation.manager.Locator
    public void stopWatcher() {
        this.f35672a.stop();
    }
}
