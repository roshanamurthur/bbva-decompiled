package com.bbva.cellscore.web.model.configuration;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ConfigurationDTO.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/bbva/cellscore/web/model/configuration/AppConfigurationDTO;", "", "", "a", "Ljava/lang/String;", "getUse", "()Ljava/lang/String;", "use", "", "Lcom/bbva/cellscore/web/model/configuration/EnvironmentDTO;", "b", "Ljava/util/List;", "getEnvironments", "()Ljava/util/List;", "environments", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "cells-core_release"}, k = 1, mv = {1, 5, 1})
public final class AppConfigurationDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("use")
    @Nullable
    private final String use;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("environments")
    @Nullable
    private final List<EnvironmentDTO> environments;

    /* JADX WARN: Multi-variable type inference failed */
    public AppConfigurationDTO() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Nullable
    public final List<EnvironmentDTO> getEnvironments() {
        return this.environments;
    }

    @Nullable
    public final String getUse() {
        return this.use;
    }

    public AppConfigurationDTO(@Nullable String str, @Nullable List<EnvironmentDTO> list) {
        this.use = str;
        this.environments = list;
    }

    public /* synthetic */ AppConfigurationDTO(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
