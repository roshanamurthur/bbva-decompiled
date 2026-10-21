package com.bbva.glomohybrid.base.store.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GenericPreferencesData.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/base/store/model/SetGenericPreferencesData;", "Lcom/bbva/glomohybrid/base/store/model/GenericPreferencesData;", "", "c", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "key", "channel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class SetGenericPreferencesData extends GenericPreferencesData {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetGenericPreferencesData(@NotNull String key, @NotNull String value, @NotNull String channel) {
        super(key, channel, null);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.value = value;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
