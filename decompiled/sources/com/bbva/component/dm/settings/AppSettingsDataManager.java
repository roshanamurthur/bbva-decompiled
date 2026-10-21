package com.bbva.component.dm.settings;

import com.bbva.cells.component.kit.datamanager.DataManager;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.component.dm.settings.domain.model.AppSettings;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AppSettingsDataManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/dm/settings/AppSettingsDataManager;", "Lcom/bbva/cells/component/kit/datamanager/DataManager;", "()V", "getId", "", "Companion", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AppSettingsDataManager extends DataManager {

    @NotNull
    public static final String DEFAULT = "default";

    @NotNull
    public static final String ID = "component-dm-settings";

    @JvmField
    @NotNull
    public static final ActionSpec<AppSettings> ACTION_GET_SETTINGS_SUCCESS = new ActionSpec<>("get-settings-success");

    @JvmField
    @NotNull
    public static final ActionSpec<Throwable> ACTION_GET_SETTINGS_ERROR = new ActionSpec<>("get-settings-error");

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getK0() {
        return ID;
    }
}
