package com.bbva.glomohybrid.cellsweb.provider.modal;

import com.bbva.glomohybrid.ui.modals.FullScreenModal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FullModalProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/provider/modal/FullModalProvider;", "", "()V", "getInstance", "Lcom/bbva/glomohybrid/ui/modals/FullScreenModal;", "config", "Lcom/bbva/glomohybrid/ui/modals/FullScreenModal$FullScreenModalConfig;", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FullModalProvider {
    @NotNull
    public final FullScreenModal getInstance(@NotNull FullScreenModal.FullScreenModalConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return FullScreenModal.INSTANCE.getInstance(config);
    }
}
