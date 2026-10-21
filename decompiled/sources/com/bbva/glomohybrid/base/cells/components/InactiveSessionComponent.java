package com.bbva.glomohybrid.base.cells.components;

import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.glomohybrid.base.cells.CellsReactor;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InactiveSessionComponent.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/base/cells/components/InactiveSessionComponent;", "", "()V", "launch", "", "Companion", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InactiveSessionComponent {

    @NotNull
    public static final String ID = "inactive-session";

    @JvmField
    @NotNull
    public static final ActionSpec<Void> ACTION_INACTIVE_SESSION = new ActionSpec<>("action-inactive-session");

    public final void launch() {
        CellsReactor.fire$default(ID, ACTION_INACTIVE_SESSION, null, 4, null);
    }
}
