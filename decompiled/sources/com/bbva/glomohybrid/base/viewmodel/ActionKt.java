package com.bbva.glomohybrid.base.viewmodel;

import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Action.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004¨\u0006\t"}, d2 = {"anyOfAction", "Lcom/bbva/glomohybrid/base/viewmodel/Action$AnyAction;", "actions", "", "", "([Ljava/lang/String;)Lcom/bbva/glomohybrid/base/viewmodel/Action$AnyAction;", "justAction", "Lcom/bbva/glomohybrid/base/viewmodel/Action$JustAction;", "action", "Base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ActionKt {
    @NotNull
    public static final Action.AnyAction anyOfAction(@NotNull String... actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        return new Action.AnyAction(ArraysKt___ArraysKt.toList(actions));
    }

    @NotNull
    public static final Action.JustAction justAction(@NotNull String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new Action.JustAction(action);
    }
}
