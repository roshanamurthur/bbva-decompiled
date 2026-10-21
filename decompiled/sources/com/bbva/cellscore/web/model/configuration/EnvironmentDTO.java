package com.bbva.cellscore.web.model.configuration;

import bk.q;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ConfigurationDTO.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/bbva/cellscore/web/model/configuration/EnvironmentDTO;", "", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "", "b", "Ljava/util/Map;", "getWeb", "()Ljava/util/Map;", "web", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "cells-core_release"}, k = 1, mv = {1, 5, 1})
public final class EnvironmentDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("id")
    @Nullable
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("web")
    @NotNull
    private final Map<String, String> web;

    /* JADX WARN: Multi-variable type inference failed */
    public EnvironmentDTO() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final Map<String, String> getWeb() {
        return this.web;
    }

    public EnvironmentDTO(@Nullable String str, @NotNull Map<String, String> web) {
        Intrinsics.checkNotNullParameter(web, "web");
        this.id = str;
        this.web = web;
    }

    public /* synthetic */ EnvironmentDTO(String str, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? q.emptyMap() : map);
    }
}
