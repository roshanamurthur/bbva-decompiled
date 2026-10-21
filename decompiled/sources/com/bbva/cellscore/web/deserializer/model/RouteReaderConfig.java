package com.bbva.cellscore.web.deserializer.model;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RouteReaderConfig.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\n\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R.\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/bbva/cellscore/web/deserializer/model/RouteReaderConfig;", "", "", "a", "Ljava/lang/String;", "getFlavor", "()Ljava/lang/String;", "setFlavor", "(Ljava/lang/String;)V", "flavor", "", "b", "Z", "isMergeEnable", "()Z", "setMergeEnable", "(Z)V", "", "c", "Ljava/util/Map;", "getGlobalConfiguration", "()Ljava/util/Map;", "setGlobalConfiguration", "(Ljava/util/Map;)V", "globalConfiguration", "<init>", "(Ljava/lang/String;ZLjava/util/Map;)V", "cells-core_release"}, k = 1, mv = {1, 5, 1})
public final class RouteReaderConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String flavor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean isMergeEnable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Map<String, String> globalConfiguration;

    public RouteReaderConfig() {
        this(null, false, null, 7, null);
    }

    @NotNull
    public final String getFlavor() {
        return this.flavor;
    }

    @NotNull
    public final Map<String, String> getGlobalConfiguration() {
        return this.globalConfiguration;
    }

    /* JADX INFO: renamed from: isMergeEnable, reason: from getter */
    public final boolean getIsMergeEnable() {
        return this.isMergeEnable;
    }

    public final void setFlavor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.flavor = str;
    }

    public final void setGlobalConfiguration(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.globalConfiguration = map;
    }

    public final void setMergeEnable(boolean z10) {
        this.isMergeEnable = z10;
    }

    public RouteReaderConfig(@NotNull String flavor, boolean z10, @NotNull Map<String, String> globalConfiguration) {
        Intrinsics.checkNotNullParameter(flavor, "flavor");
        Intrinsics.checkNotNullParameter(globalConfiguration, "globalConfiguration");
        this.flavor = flavor;
        this.isMergeEnable = z10;
        this.globalConfiguration = globalConfiguration;
    }

    public /* synthetic */ RouteReaderConfig(String str, boolean z10, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? new LinkedHashMap() : map);
    }
}
