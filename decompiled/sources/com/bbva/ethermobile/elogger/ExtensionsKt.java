package com.bbva.ethermobile.elogger;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Extensions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toLocalTracerObject", "Lcom/bbva/ethermobile/elogger/LocalTracerObject;", "Lcom/bbva/ethermobile/elogger/LoggableItem;", "elogger_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ExtensionsKt {
    @NotNull
    public static final LocalTracerObject toLocalTracerObject(@NotNull LoggableItem loggableItem) {
        Intrinsics.checkNotNullParameter(loggableItem, "<this>");
        return new LocalTracerObject(loggableItem.getPayload());
    }
}
