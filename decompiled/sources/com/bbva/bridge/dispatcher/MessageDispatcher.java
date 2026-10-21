package com.bbva.bridge.dispatcher;

import com.bbva.bridge.webcontroller.WebState;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.notifications.model.constants.BanxicoConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MessageDispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0001H\u0016R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/bbva/bridge/dispatcher/MessageDispatcher;", "", "state", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/bbva/bridge/webcontroller/WebState;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "isReady", "", "notifyEvent", "", "channelName", "", "sendMessage", "webMessage", "Lcom/bbva/bridge/dispatcher/WebMessage;", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "Companion", "cells-bridge_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface MessageDispatcher {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f26607a;

    @NotNull
    public static final String ID = "web-dispatcher";

    /* JADX INFO: compiled from: MessageDispatcher.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/bbva/bridge/dispatcher/MessageDispatcher$Companion;", "", "", "ID", "Ljava/lang/String;", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "Ljava/lang/Void;", "b", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "getDISPATCHER_READY", "()Lcom/bbva/cells/component/kit/model/ActionSpec;", "DISPATCHER_READY", "<init>", "()V", "cells-bridge_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {

        @NotNull
        public static final String ID = "web-dispatcher";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f26607a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final ActionSpec<Void> DISPATCHER_READY = new ActionSpec<>("message-dispatcher-ready");

        @NotNull
        public final ActionSpec<Void> getDISPATCHER_READY() {
            return DISPATCHER_READY;
        }
    }

    /* JADX INFO: compiled from: MessageDispatcher.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void sendMessage(@NotNull MessageDispatcher messageDispatcher, @NotNull String channelName, @NotNull Object payload) {
            Intrinsics.checkNotNullParameter(channelName, "channelName");
            Intrinsics.checkNotNullParameter(payload, "payload");
            messageDispatcher.sendMessage(new WebMessage(channelName, payload));
        }
    }

    @NotNull
    StateFlow<WebState> getState();

    boolean isReady();

    void notifyEvent(@NotNull String channelName);

    void sendMessage(@NotNull WebMessage webMessage);

    void sendMessage(@NotNull String channelName, @NotNull Object payload);
}
