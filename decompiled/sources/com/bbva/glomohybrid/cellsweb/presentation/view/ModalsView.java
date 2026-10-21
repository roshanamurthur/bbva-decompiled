package com.bbva.glomohybrid.cellsweb.presentation.view;

import com.bbva.glomohybrid.base.models.ModalType;
import com.bbva.glomohybrid.cellsweb.presentation.model.ModalsContract;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ModalsView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/view/ModalsView;", "", "intents", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/glomohybrid/cellsweb/presentation/model/ModalsContract$Intent;", "getIntents", "()Lkotlinx/coroutines/flow/Flow;", "show", "", "modal", "Lcom/bbva/glomohybrid/base/models/ModalType;", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ModalsView {
    @NotNull
    Flow<ModalsContract.Intent> getIntents();

    void show(@Nullable ModalType modal);

    /* JADX INFO: compiled from: ModalsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void show(@NotNull ModalsView modalsView, @Nullable ModalType modalType) {
        }
    }
}
