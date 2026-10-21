package com.bbva.cellscore.web.mapper.configuration;

import com.bbva.cellscore.web.data.configutation.AppConfiguration;
import com.bbva.cellscore.web.mapper.Mapper;
import com.bbva.cellscore.web.model.configuration.AppConfigurationDTO;
import com.bbva.cellscore.web.model.configuration.EnvironmentDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppConfigurationMapper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/cellscore/web/mapper/configuration/AppConfigurationMapper;", "Lcom/bbva/cellscore/web/mapper/Mapper;", "Lcom/bbva/cellscore/web/model/configuration/AppConfigurationDTO;", "Lcom/bbva/cellscore/web/data/configutation/AppConfiguration;", "model", "modelToData", "data", "dataToModel", "Lcom/bbva/cellscore/web/mapper/configuration/EnvironmentMapper;", "environmentMapper", "<init>", "(Lcom/bbva/cellscore/web/mapper/configuration/EnvironmentMapper;)V", "cells-core_release"}, k = 1, mv = {1, 5, 1})
public final class AppConfigurationMapper implements Mapper<AppConfigurationDTO, AppConfiguration> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final EnvironmentMapper f27115a;

    /* JADX WARN: Multi-variable type inference failed */
    public AppConfigurationMapper() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public AppConfigurationMapper(@NotNull EnvironmentMapper environmentMapper) {
        Intrinsics.checkNotNullParameter(environmentMapper, "environmentMapper");
        this.f27115a = environmentMapper;
    }

    @Override // com.bbva.cellscore.web.mapper.Mapper
    @NotNull
    public AppConfigurationDTO dataToModel(@Nullable AppConfiguration data) {
        return new AppConfigurationDTO(null, null, 3, null);
    }

    @Override // com.bbva.cellscore.web.mapper.Mapper
    @NotNull
    public AppConfiguration modelToData(@Nullable AppConfigurationDTO model) {
        List<EnvironmentDTO> environments;
        List arrayList;
        if (model == null || (environments = model.getEnvironments()) == null) {
            arrayList = null;
        } else {
            List<EnvironmentDTO> list = environments;
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(this.f27115a.modelToData((EnvironmentDTO) it.next()));
            }
        }
        if (arrayList == null) {
            arrayList = CollectionsKt__CollectionsKt.emptyList();
        }
        return new AppConfiguration(AppConfigurationMapperKt.valueOrEmpty(model != null ? model.getUse() : null), arrayList);
    }

    public /* synthetic */ AppConfigurationMapper(EnvironmentMapper environmentMapper, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new EnvironmentMapper() : environmentMapper);
    }
}
