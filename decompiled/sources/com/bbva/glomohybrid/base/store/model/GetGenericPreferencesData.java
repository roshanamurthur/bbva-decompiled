package com.bbva.glomohybrid.base.store.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GenericPreferencesData.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/base/store/model/GetGenericPreferencesData;", "Lcom/bbva/glomohybrid/base/store/model/GenericPreferencesData;", "key", "", "channel", "(Ljava/lang/String;Ljava/lang/String;)V", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GetGenericPreferencesData extends GenericPreferencesData {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetGenericPreferencesData(@NotNull String key, @NotNull String channel) {
        super(key, channel, null);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(channel, "channel");
    }
}
