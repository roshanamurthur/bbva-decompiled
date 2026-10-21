package com.bbva.push.exception;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HandlerNotFound.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/push/exception/HandlerNotFound;", "", "()V", "push_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HandlerNotFound extends Throwable {

    @NotNull
    public static final HandlerNotFound INSTANCE = new HandlerNotFound();

    public HandlerNotFound() {
        super("Handler not found");
    }
}
