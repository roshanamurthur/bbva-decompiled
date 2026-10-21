package yi;

import android.location.LocationManager;
import androidx.core.content.ContextCompat;
import androidx.core.location.LocationManagerCompat;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.veridas.contextualdata.location.GeoPoint;
import com.veridas.contextualdata.location.LocationContextualDataProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.selects.SelectImplementation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocationContextualDataProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
@DebugMetadata(c = "com.veridas.contextualdata.location.LocationContextualDataProvider$getLocationWithLocationManager$2", f = "LocationContextualDataProvider.kt", i = {1}, l = {156, 280, 173}, m = "invokeSuspend", n = {"deferredLocationsList"}, s = {"L$0"})
@SourceDebugExtension({"SMAP\nLocationContextualDataProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationContextualDataProvider.kt\ncom/veridas/contextualdata/location/LocationContextualDataProvider$getLocationWithLocationManager$2\n+ 2 Select.kt\nkotlinx/coroutines/selects/SelectKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,271:1\n55#2,5:272\n62#2:280\n1864#3,3:277\n*S KotlinDebug\n*F\n+ 1 LocationContextualDataProvider.kt\ncom/veridas/contextualdata/location/LocationContextualDataProvider$getLocationWithLocationManager$2\n*L\n160#1:272,5\n160#1:280\n161#1:277,3\n*E\n"})
public final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GeoPoint>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f94850p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f94851q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ LocationContextualDataProvider f94852r0;

    /* JADX INFO: compiled from: LocationContextualDataProvider.kt */
    @DebugMetadata(c = "com.veridas.contextualdata.location.LocationContextualDataProvider$getLocationWithLocationManager$2$1$1$1", f = "LocationContextualDataProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<GeoPoint, Continuation<? super Pair<? extends Integer, ? extends GeoPoint>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f94853p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f94854q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f94854q0 = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f94854q0, continuation);
            aVar.f94853p0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GeoPoint geoPoint, Continuation<? super Pair<? extends Integer, ? extends GeoPoint>> continuation) {
            return ((a) create(geoPoint, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return new Pair(Boxing.boxInt(this.f94854q0), (GeoPoint) this.f94853p0);
        }
    }

    /* JADX INFO: compiled from: LocationContextualDataProvider.kt */
    @DebugMetadata(c = "com.veridas.contextualdata.location.LocationContextualDataProvider$getLocationWithLocationManager$2$gpsLocationDeferred$1", f = "LocationContextualDataProvider.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GeoPoint>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f94855p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LocationContextualDataProvider f94856q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LocationContextualDataProvider locationContextualDataProvider, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f94856q0 = locationContextualDataProvider;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.f94856q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GeoPoint> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f94855p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                LocationContextualDataProvider locationContextualDataProvider = this.f94856q0;
                LocationManager locationManagerAccess$getLocationManager = LocationContextualDataProvider.access$getLocationManager(locationContextualDataProvider);
                this.f94855p0 = 1;
                obj = LocationContextualDataProvider.access$getLocationFromLocationManager(locationContextualDataProvider, locationManagerAccess$getLocationManager, "gps", this);
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
    @DebugMetadata(c = "com.veridas.contextualdata.location.LocationContextualDataProvider$getLocationWithLocationManager$2$networkLocationDeferred$1", f = "LocationContextualDataProvider.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GeoPoint>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f94857p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LocationContextualDataProvider f94858q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LocationContextualDataProvider locationContextualDataProvider, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f94858q0 = locationContextualDataProvider;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.f94858q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GeoPoint> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f94857p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                LocationContextualDataProvider locationContextualDataProvider = this.f94858q0;
                LocationManager locationManagerAccess$getLocationManager = LocationContextualDataProvider.access$getLocationManager(locationContextualDataProvider);
                this.f94857p0 = 1;
                obj = LocationContextualDataProvider.access$getLocationFromLocationManager(locationContextualDataProvider, locationManagerAccess$getLocationManager, DeepLinkListenerAdapter.Constants.ERROR_NETWORK, this);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(LocationContextualDataProvider locationContextualDataProvider, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f94852r0 = locationContextualDataProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        f fVar = new f(this.f94852r0, continuation);
        fVar.f94851q0 = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GeoPoint> continuation) {
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:47:0x0105  */
    /* JADX WARN: Code duplicated, block: B:49:0x0118 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        List list;
        int iIntValue;
        GeoPoint geoPoint;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f94850p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f94851q0;
            LocationContextualDataProvider locationContextualDataProvider = this.f94852r0;
            if (!LocationManagerCompat.isLocationEnabled(LocationContextualDataProvider.access$getLocationManager(locationContextualDataProvider))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            if (LocationContextualDataProvider.access$getLocationManager(locationContextualDataProvider).isProviderEnabled(DeepLinkListenerAdapter.Constants.ERROR_NETWORK)) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new c(locationContextualDataProvider, null), 3, null));
            }
            if (ContextCompat.checkSelfPermission(locationContextualDataProvider.f66701a, "android.permission.ACCESS_FINE_LOCATION") == 0 && LocationContextualDataProvider.access$getLocationManager(locationContextualDataProvider).isProviderEnabled("gps")) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new b(locationContextualDataProvider, null), 3, null));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            if (arrayList.size() == 1) {
                Deferred deferred = (Deferred) CollectionsKt___CollectionsKt.first((List) arrayList);
                this.f94850p0 = 1;
                obj = deferred.await(this);
                return obj == coroutine_suspended ? coroutine_suspended : obj;
            }
            SelectImplementation selectImplementation = new SelectImplementation(getF79378p0());
            int i11 = 0;
            for (Object obj2 : arrayList) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                selectImplementation.invoke(((Deferred) obj2).getOnAwait(), new a(i11, null));
                i11 = i12;
            }
            this.f94851q0 = arrayList;
            this.f94850p0 = 2;
            obj = selectImplementation.doSelect(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = arrayList;
            Pair pair = (Pair) obj;
            iIntValue = ((Number) pair.component1()).intValue();
            geoPoint = (GeoPoint) pair.component2();
            if (geoPoint != null) {
                list.remove(iIntValue);
                Job.DefaultImpls.cancel$default((Job) CollectionsKt___CollectionsKt.first(list), (CancellationException) null, 1, (Object) null);
                return geoPoint;
            }
            list.remove(iIntValue);
            Deferred deferred2 = (Deferred) CollectionsKt___CollectionsKt.first(list);
            this.f94851q0 = null;
            this.f94850p0 = 3;
            obj = deferred2.await(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            }
            if (i10 == 2) {
                list = (List) this.f94851q0;
                ResultKt.throwOnFailure(obj);
                Pair pair2 = (Pair) obj;
                iIntValue = ((Number) pair2.component1()).intValue();
                geoPoint = (GeoPoint) pair2.component2();
                if (geoPoint != null) {
                    list.remove(iIntValue);
                    Job.DefaultImpls.cancel$default((Job) CollectionsKt___CollectionsKt.first(list), (CancellationException) null, 1, (Object) null);
                    return geoPoint;
                }
                list.remove(iIntValue);
                Deferred deferred3 = (Deferred) CollectionsKt___CollectionsKt.first(list);
                this.f94851q0 = null;
                this.f94850p0 = 3;
                obj = deferred3.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        }
        return obj;
    }
}
