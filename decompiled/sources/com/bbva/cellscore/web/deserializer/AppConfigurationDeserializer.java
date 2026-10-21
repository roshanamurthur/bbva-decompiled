package com.bbva.cellscore.web.deserializer;

import com.bbva.cellscore.web.data.configutation.AppConfiguration;
import com.bbva.cellscore.web.mapper.configuration.AppConfigurationMapper;
import com.bbva.cellscore.web.model.configuration.AppConfigurationDTO;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Deserializer.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/cellscore/web/deserializer/AppConfigurationDeserializer;", "Lcom/bbva/cellscore/web/deserializer/Deserializer;", "Lcom/bbva/cellscore/web/model/configuration/AppConfigurationDTO;", "Lcom/bbva/cellscore/web/data/configutation/AppConfiguration;", "mapper", "Lcom/bbva/cellscore/web/mapper/configuration/AppConfigurationMapper;", "(Lcom/bbva/cellscore/web/mapper/configuration/AppConfigurationMapper;)V", "cells-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AppConfigurationDeserializer extends Deserializer<AppConfigurationDTO, AppConfiguration> {
    /* JADX WARN: Multi-variable type inference failed */
    public AppConfigurationDeserializer() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ AppConfigurationDeserializer(AppConfigurationMapper appConfigurationMapper, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new AppConfigurationMapper(null, 1, null) : appConfigurationMapper);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppConfigurationDeserializer(@NotNull AppConfigurationMapper mapper) {
        super(null, mapper, 1, null);
        Intrinsics.checkNotNullParameter(mapper, "mapper");
    }
}
