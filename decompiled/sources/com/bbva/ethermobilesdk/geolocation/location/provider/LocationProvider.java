package com.bbva.ethermobilesdk.geolocation.location.provider;

import android.location.Location;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.geolocation.location.model.LocationParams;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocationProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/location/provider/LocationProvider;", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Landroid/location/Location;", "params", "Lcom/bbva/ethermobilesdk/geolocation/location/model/LocationParams;", "singleUpdate", "", "stop", "", "getLastLocation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "geolocation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface LocationProvider {
    @Nullable
    Object getLastLocation(@NotNull Continuation<? super Location> continuation);

    @NotNull
    Flow<Result<Location>> start(@NotNull LocationParams params, boolean singleUpdate);

    void stop();
}
