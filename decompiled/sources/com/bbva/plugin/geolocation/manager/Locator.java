package com.bbva.plugin.geolocation.manager;

import android.location.Address;
import android.location.Location;
import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.geolocation.geocoding.model.LocationAddress;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Locator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J>\u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005j\u0002`\u00072\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0005j\u0002`\nH¦@¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH¦@¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H¦@¢\u0006\u0002\u0010\u0016J\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bH¦@¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0003H&¨\u0006\u001e"}, d2 = {"Lcom/bbva/plugin/geolocation/manager/Locator;", "", "location", "", "success", "Lkotlin/Function1;", "Landroid/location/Location;", "Lcom/bbva/plugin/geolocation/manager/OnLocation;", "error", "Lcom/bbva/androidtoolkit/plugin/response/ErrorMessage;", "Lcom/bbva/plugin/geolocation/manager/OnError;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "directResolution", "Lcom/bbva/ethermobilesdk/geolocation/geocoding/model/LocationAddress;", "address", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reverseResolution", "Landroid/location/Address;", "latitude", "", "longitude", "(DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startWatcher", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/ethermobile/help/kit/result/Result;", "interval", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopWatcher", "geolocation-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Locator {
    @Nullable
    Object directResolution(@NotNull String str, @NotNull Continuation<? super LocationAddress> continuation);

    @Nullable
    Object location(@NotNull Function1<? super Location, Unit> function1, @NotNull Function1<? super ErrorMessage, Unit> function2, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object reverseResolution(double d2, double d3, @NotNull Continuation<? super Address> continuation);

    @Nullable
    Object startWatcher(long j10, @NotNull Continuation<? super Flow<? extends Result<Location>>> continuation);

    void stopWatcher();
}
