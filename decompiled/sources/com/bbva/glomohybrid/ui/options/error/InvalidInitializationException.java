package com.bbva.glomohybrid.ui.options.error;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InvalidInitializationException.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/error/InvalidInitializationException;", "", "()V", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InvalidInitializationException extends Throwable {

    @NotNull
    public static final InvalidInitializationException INSTANCE = new InvalidInitializationException();

    public InvalidInitializationException() {
        super("Invalid initialization exception: One required parameter is null");
    }
}
