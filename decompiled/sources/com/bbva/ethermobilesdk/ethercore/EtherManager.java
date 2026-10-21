package com.bbva.ethermobilesdk.ethercore;

import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EtherManager.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0004\u001a\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002J\"\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0005\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0002H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\f\b\u0000\u0010\u0005*\u0006\u0012\u0002\b\u00030\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0006\u0010\nJ\u0006\u0010\f\u001a\u00020\u000b¨\u0006\u000f"}, d2 = {"Lcom/bbva/ethermobilesdk/ethercore/EtherManager;", "", "Lcom/bbva/ethermobilesdk/ethercore/EtherApi;", "etherApi", "addApi", ExifInterface.GPS_DIRECTION_TRUE, "getApi", "()Lcom/bbva/ethermobilesdk/ethercore/EtherApi;", "Ljava/lang/Class;", "clazz", "(Ljava/lang/Class;)Lcom/bbva/ethermobilesdk/ethercore/EtherApi;", "", "getApiCount", "<init>", "()V", "ethercore_release"}, k = 1, mv = {1, 4, 0})
public final class EtherManager {
    public static final EtherManager INSTANCE = new EtherManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f29777a = new LinkedHashMap();

    @NotNull
    public final EtherManager addApi(@NotNull EtherApi<?> etherApi) {
        f29777a.put(etherApi.getClass(), etherApi);
        return this;
    }

    @Nullable
    public final /* synthetic */ <T extends EtherApi<?>> T getApi() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) getApi(EtherApi.class);
    }

    public final int getApiCount() {
        return f29777a.size();
    }

    @Nullable
    public final <T extends EtherApi<?>> T getApi(@NotNull Class<T> clazz) {
        return (T) f29777a.get(clazz);
    }
}
