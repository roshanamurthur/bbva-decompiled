package com.bbva.plugin.push.command.error;

import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HandlerNotFoundError.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/plugin/push/command/error/HandlerNotFoundError;", "Lcom/bbva/androidtoolkit/plugin/response/ErrorMessage;", "", "getMessage", "", "getCode", "<init>", "()V", "push-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class HandlerNotFoundError implements ErrorMessage {

    @NotNull
    public static final HandlerNotFoundError INSTANCE = new HandlerNotFoundError();

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    public int getCode() {
        return 10;
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    @NotNull
    public String getMessage() {
        return "Handler Not Found";
    }
}
