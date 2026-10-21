package com.bbva.cellscore.web.mapper.configuration;

import bk.q;
import com.bbva.cellscore.web.data.configutation.EnvironmentConfiguration;
import com.bbva.cellscore.web.data.configutation.WebConfigurationSet;
import com.bbva.cellscore.web.mapper.Mapper;
import com.bbva.cellscore.web.model.configuration.EnvironmentDTO;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppConfigurationMapper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/cellscore/web/mapper/configuration/EnvironmentMapper;", "Lcom/bbva/cellscore/web/mapper/Mapper;", "Lcom/bbva/cellscore/web/model/configuration/EnvironmentDTO;", "Lcom/bbva/cellscore/web/data/configutation/EnvironmentConfiguration;", "()V", "dataToModel", "data", "modelToData", "model", "cells-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class EnvironmentMapper implements Mapper<EnvironmentDTO, EnvironmentConfiguration> {
    @Override // com.bbva.cellscore.web.mapper.Mapper
    @NotNull
    public EnvironmentDTO dataToModel(@Nullable EnvironmentConfiguration data) {
        return new EnvironmentDTO(null, null, 3, null);
    }

    @Override // com.bbva.cellscore.web.mapper.Mapper
    @NotNull
    public EnvironmentConfiguration modelToData(@Nullable EnvironmentDTO model) {
        String strValueOrEmpty = AppConfigurationMapperKt.valueOrEmpty(model == null ? null : model.getId());
        Map<String, String> web = model != null ? model.getWeb() : null;
        if (web == null) {
            web = q.emptyMap();
        }
        return new EnvironmentConfiguration(strValueOrEmpty, new WebConfigurationSet(web));
    }
}
