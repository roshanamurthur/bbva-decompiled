package com.bbva.glomohybrid.base.store.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GenericPreferencesData.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/base/store/model/GenericPreferencesData;", "", "", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "b", "getChannel", "channel", "Lcom/bbva/glomohybrid/base/store/model/GetGenericPreferencesData;", "Lcom/bbva/glomohybrid/base/store/model/SetGenericPreferencesData;", "Base_release"}, k = 1, mv = {1, 9, 0})
public abstract class GenericPreferencesData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String channel;

    public GenericPreferencesData(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this.key = str;
        this.channel = str2;
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }
}
