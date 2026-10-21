package com.bbva.glomohybrid.base.cells.channels;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CellsDynamicFeatureChannels.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/base/cells/channels/CellsDynamicFeatureChannels;", "", "()V", "CELLS_DYNAMIC_MODULES_ERROR_CHANNEL", "", "CELLS_DYNAMIC_MODULES_SUCCESS_CHANNEL", "CELLS_IS_DYNAMIC_MODULE_INSTALLED_CHANNEL", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CellsDynamicFeatureChannels {

    @NotNull
    public static final String CELLS_DYNAMIC_MODULES_ERROR_CHANNEL = "global_dynamic_modules_installation_error";

    @NotNull
    public static final String CELLS_DYNAMIC_MODULES_SUCCESS_CHANNEL = "global_dynamic_modules_installation_success";

    @NotNull
    public static final String CELLS_IS_DYNAMIC_MODULE_INSTALLED_CHANNEL = "global_is_dynamic_module_installed";

    @NotNull
    public static final CellsDynamicFeatureChannels INSTANCE = new CellsDynamicFeatureChannels();
}
