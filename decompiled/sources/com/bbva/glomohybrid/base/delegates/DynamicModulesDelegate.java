package com.bbva.glomohybrid.base.delegates;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DynamicModulesDelegate.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/base/delegates/DynamicModulesDelegate;", "", "installDynamicModule", "", "dynamicModule", "", "isDynamicModuleInstalled", "", "notifyIsDynamicModuleInstalled", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DynamicModulesDelegate {
    void installDynamicModule(@NotNull String dynamicModule);

    boolean isDynamicModuleInstalled(@NotNull String dynamicModule);

    void notifyIsDynamicModuleInstalled(@NotNull String dynamicModule);
}
