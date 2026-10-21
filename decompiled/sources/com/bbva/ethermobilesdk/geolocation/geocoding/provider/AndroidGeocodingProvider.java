package com.bbva.ethermobilesdk.geolocation.geocoding.provider;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Geocoder$GeocodeListener;
import android.location.Location;
import android.os.Build;
import com.bbva.ethermobilesdk.geolocation.geocoding.model.LocationAddress;
import com.bbva.ethermobilesdk.geolocation.utils.extension.LoggerKt;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidGeocodingProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/geocoding/provider/AndroidGeocodingProvider;", "Lcom/bbva/ethermobilesdk/geolocation/geocoding/provider/GeocodingProvider;", "", "address", "Lcom/bbva/ethermobilesdk/geolocation/geocoding/model/LocationAddress;", "getLocationFromAddress", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/location/Location;", "location", "Landroid/location/Address;", "kotlin.jvm.PlatformType", "getAddressFromLocation", "(Landroid/location/Location;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "Ljava/util/Locale;", "locale", "<init>", "(Landroid/content/Context;Ljava/util/Locale;)V", "Companion", "geolocation_release"}, k = 1, mv = {2, 0, 0})
public final class AndroidGeocodingProvider implements GeocodingProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Geocoder f29790a;

    /* JADX INFO: compiled from: AndroidGeocodingProvider.kt */
    public static final class a implements Geocoder$GeocodeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Continuation<Address> f29791a;

        public a(SafeContinuation safeContinuation) {
            this.f29791a = safeContinuation;
        }

        public final void onGeocode(List<Address> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Continuation<Address> continuation = this.f29791a;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5535constructorimpl(CollectionsKt___CollectionsKt.first((List) it)));
        }
    }

    /* JADX INFO: compiled from: AndroidGeocodingProvider.kt */
    public static final class b implements Geocoder$GeocodeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Continuation<LocationAddress> f29792a;

        public b(SafeContinuation safeContinuation) {
            this.f29792a = safeContinuation;
        }

        public final void onGeocode(List<Address> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Continuation<LocationAddress> continuation = this.f29792a;
            Object objFirst = CollectionsKt___CollectionsKt.first((List<? extends Object>) it);
            Intrinsics.checkNotNullExpressionValue(objFirst, "first(...)");
            continuation.resumeWith(Result.m5535constructorimpl(new LocationAddress((Address) objFirst, null, 2, null)));
        }
    }

    public AndroidGeocodingProvider(@NotNull Context context, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.f29790a = new Geocoder(context, locale);
    }

    @Override // com.bbva.ethermobilesdk.geolocation.geocoding.provider.GeocodingProvider
    @Nullable
    public Object getAddressFromLocation(@NotNull Location location, @NotNull Continuation<? super Address> continuation) throws IOException {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        if (!Geocoder.isPresent()) {
            LoggerKt.logError$default("No geocoder is present.", null, 2, null);
            Result.Companion companion = Result.INSTANCE;
            safeContinuation.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(new RuntimeException("No geocoder is present."))));
        } else if (Build.VERSION.SDK_INT >= 33) {
            this.f29790a.getFromLocation(location.getLatitude(), location.getLongitude(), 1, new a(safeContinuation));
        } else {
            List<Address> fromLocation = this.f29790a.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
            List<Address> list = fromLocation;
            if (list == null || list.isEmpty()) {
                LoggerKt.logError$default("No address could be retrieved using location provided.", null, 2, null);
                Result.Companion companion2 = Result.INSTANCE;
                safeContinuation.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(new IllegalArgumentException("No address could be retrieved using location provided."))));
            } else {
                Result.Companion companion3 = Result.INSTANCE;
                Intrinsics.checkNotNull(fromLocation);
                safeContinuation.resumeWith(Result.m5535constructorimpl(CollectionsKt___CollectionsKt.first((List) fromLocation)));
            }
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // com.bbva.ethermobilesdk.geolocation.geocoding.provider.GeocodingProvider
    @Nullable
    public Object getLocationFromAddress(@NotNull String str, @NotNull Continuation<? super LocationAddress> continuation) throws IOException {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        if (Geocoder.isPresent()) {
            int i10 = Build.VERSION.SDK_INT;
            Geocoder geocoder = this.f29790a;
            if (i10 >= 33) {
                geocoder.getFromLocationName(str, 1, new b(safeContinuation));
            } else {
                List<Address> fromLocationName = geocoder.getFromLocationName(str, 1);
                List<Address> list = fromLocationName;
                if (list == null || list.isEmpty()) {
                    LoggerKt.logError$default("No location could be retrieved using address provided.", null, 2, null);
                    Result.Companion companion = Result.INSTANCE;
                    safeContinuation.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(new Throwable("No location could be retrieved using address provided."))));
                } else {
                    Result.Companion companion2 = Result.INSTANCE;
                    safeContinuation.resumeWith(Result.m5535constructorimpl(new LocationAddress((Address) CollectionsKt___CollectionsKt.first((List) fromLocationName), null, 2, null)));
                }
            }
        } else {
            LoggerKt.logError$default("No geocoder is present.", null, 2, null);
            Result.Companion companion3 = Result.INSTANCE;
            safeContinuation.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(new RuntimeException("No geocoder is present."))));
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public /* synthetic */ AndroidGeocodingProvider(Context context, Locale locale, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? Locale.getDefault() : locale);
    }
}
