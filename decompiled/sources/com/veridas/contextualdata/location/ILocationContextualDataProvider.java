package com.veridas.contextualdata.location;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ILocationContextualDataProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"Lcom/veridas/contextualdata/location/ILocationContextualDataProvider;", "", "getCountry", "", "geoPoint", "Lcom/veridas/contextualdata/location/GeoPoint;", "(Lcom/veridas/contextualdata/location/GeoPoint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastKnownLocation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocation", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ILocationContextualDataProvider {
    @Nullable
    Object getCountry(@NotNull GeoPoint geoPoint, @NotNull Continuation<? super String> continuation);

    @Nullable
    Object getLastKnownLocation(@NotNull Continuation<? super GeoPoint> continuation);

    @Nullable
    Object getLocation(@NotNull Continuation<? super GeoPoint> continuation);
}
