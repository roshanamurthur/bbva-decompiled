package com.bbva.plugin.push.command.error;

import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ActionTrackerNotImplementedError.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/plugin/push/command/error/ActionTrackerNotImplementedError;", "Lcom/bbva/androidtoolkit/plugin/response/ErrorMessage;", "", "getMessage", "", "getCode", "message", "<init>", "(Ljava/lang/String;)V", "Companion", "push-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class ActionTrackerNotImplementedError implements ErrorMessage {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final String f35939p0;

    public ActionTrackerNotImplementedError(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f35939p0 = message;
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    public int getCode() {
        return 11;
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    @NotNull
    /* JADX INFO: renamed from: getMessage */
    public String getDescription() {
        return "The Action is not implemented on Tracker Handler: " + this.f35939p0;
    }
}
