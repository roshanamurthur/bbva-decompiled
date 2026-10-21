package com.bbva.plugin.push.extension;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.plugin.push.command.error.HandlerNotFoundError;
import com.bbva.push.PushManager;
import com.bbva.push.handler.PushHandler;
import com.bbva.push.inbox.Inbox;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PushManager.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0000\u001a0\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\bH\u0000¨\u0006\f"}, d2 = {"executeWithHandler", "", "Lcom/bbva/push/PushManager;", "handlerID", "", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "block", "Lkotlin/Function1;", "Lcom/bbva/push/handler/PushHandler;", "executeWithInbox", "Lcom/bbva/push/inbox/Inbox;", "push-plugin_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PushManagerKt {
    public static final void executeWithHandler(@NotNull PushManager pushManager, @NotNull String handlerID, @NotNull CommandCallback callback, @NotNull Function1<? super PushHandler, Unit> block) {
        Intrinsics.checkNotNullParameter(pushManager, "<this>");
        Intrinsics.checkNotNullParameter(handlerID, "handlerID");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            block.invoke(pushManager.handler(handlerID));
        } catch (Exception unused) {
            callback.sendError(HandlerNotFoundError.INSTANCE);
        }
    }

    public static final void executeWithInbox(@NotNull PushManager pushManager, @NotNull String handlerID, @NotNull CommandCallback callback, @NotNull Function1<? super Inbox, Unit> block) {
        Intrinsics.checkNotNullParameter(pushManager, "<this>");
        Intrinsics.checkNotNullParameter(handlerID, "handlerID");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            try {
                block.invoke(pushManager.handler(handlerID).getInbox());
            } catch (Exception unused) {
                callback.sendError(HandlerNotFoundError.INSTANCE);
            }
        } catch (Exception unused2) {
            callback.sendError(HandlerNotFoundError.INSTANCE);
        }
    }
}
