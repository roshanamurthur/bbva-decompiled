package com.bbva.plugin.localstorage.exception;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IllegalActivityType.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/plugin/localstorage/exception/IllegalActivityType;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "()V", "local-storage-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IllegalActivityType extends IllegalArgumentException {

    @NotNull
    public static final IllegalActivityType INSTANCE = new IllegalActivityType();

    private IllegalActivityType() {
        super("A FragmentActivity is expected");
    }
}
