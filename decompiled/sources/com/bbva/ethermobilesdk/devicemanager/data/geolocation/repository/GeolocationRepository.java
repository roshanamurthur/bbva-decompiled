package com.bbva.ethermobilesdk.devicemanager.data.geolocation.repository;

import android.location.Location;
import com.bbva.ethermobile.help.kit.result.Result;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GeolocationRepository.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0004H&J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0004H&J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0004H&J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0004H&¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/data/geolocation/repository/GeolocationRepository;", "", "getLastLocation", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Landroid/location/Location;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLatitude", "", "location", "getLongitude", "getAltitude", "getAccuracy", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface GeolocationRepository {
    @NotNull
    Result<String> getAccuracy(@Nullable Location location);

    @NotNull
    Result<String> getAltitude(@Nullable Location location);

    @Nullable
    Object getLastLocation(@NotNull Continuation<? super Result<Location>> continuation);

    @NotNull
    Result<String> getLatitude(@Nullable Location location);

    @NotNull
    Result<String> getLongitude(@Nullable Location location);
}
