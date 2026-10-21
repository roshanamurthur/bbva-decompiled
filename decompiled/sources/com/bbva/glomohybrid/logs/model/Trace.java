package com.bbva.glomohybrid.logs.model;

import com.bbva.glomohybrid.logs.LogKeysKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Trace.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\b\n\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR0\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/bbva/glomohybrid/logs/model/Trace;", "", "", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "b", "getStartDate", "setStartDate", LogKeysKt.START_DATE, "c", "getEndDate", "setEndDate", LogKeysKt.END_DATE, "", "d", "Ljava/util/Map;", "getProperties", "()Ljava/util/Map;", "setProperties", "(Ljava/util/Map;)V", LogKeysKt.PROPERTIES, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "glomo-logs_release"}, k = 1, mv = {1, 9, 0})
public final class Trace {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String startDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String endDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Map<String, ? extends Object> properties;

    public Trace(@NotNull String name, @NotNull String startDate, @NotNull String endDate, @NotNull Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.properties = properties;
    }

    @NotNull
    public final String getEndDate() {
        return this.endDate;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final Map<String, Object> getProperties() {
        return this.properties;
    }

    @NotNull
    public final String getStartDate() {
        return this.startDate;
    }

    public final void setEndDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.endDate = str;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setProperties(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.properties = map;
    }

    public final void setStartDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.startDate = str;
    }
}
