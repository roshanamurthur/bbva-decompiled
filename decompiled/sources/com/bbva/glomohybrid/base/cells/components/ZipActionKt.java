package com.bbva.glomohybrid.base.cells.components;

import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ZipAction.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u00072\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\u00020\n2\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u000b\u001a\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004¨\u0006\u000f"}, d2 = {"allOf", "Lcom/bbva/glomohybrid/base/cells/components/ZipAction$BothActions;", "actions", "", "", "([Ljava/lang/String;)Lcom/bbva/glomohybrid/base/cells/components/ZipAction$BothActions;", "anyError", "Lcom/bbva/glomohybrid/base/cells/components/ZipAction$ErrorAction;", "([Ljava/lang/String;)Lcom/bbva/glomohybrid/base/cells/components/ZipAction$ErrorAction;", "anyOf", "Lcom/bbva/glomohybrid/base/cells/components/ZipAction$AnyAction;", "([Ljava/lang/String;)Lcom/bbva/glomohybrid/base/cells/components/ZipAction$AnyAction;", "just", "Lcom/bbva/glomohybrid/base/cells/components/ZipAction$JustAction;", "action", "Base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ZipActionKt {
    @NotNull
    public static final ZipAction.BothActions allOf(@NotNull String... actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        return new ZipAction.BothActions(ArraysKt___ArraysKt.toList(actions));
    }

    @NotNull
    public static final ZipAction.ErrorAction anyError(@NotNull String... actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        return new ZipAction.ErrorAction(ArraysKt___ArraysKt.toList(actions));
    }

    @NotNull
    public static final ZipAction.AnyAction anyOf(@NotNull String... actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        return new ZipAction.AnyAction(ArraysKt___ArraysKt.toList(actions));
    }

    @NotNull
    public static final ZipAction.JustAction just(@NotNull String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new ZipAction.JustAction(action);
    }
}
