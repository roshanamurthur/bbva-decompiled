package com.bbva.notifications.handlers;

import com.bbva.push.handler.PushHandler;
import com.bbva.push.inbox.Inbox;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TimerCounterPushHandler.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/bbva/notifications/handlers/TimerCounterPushHandler;", "Lcom/bbva/push/handler/PushHandler;", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface TimerCounterPushHandler extends PushHandler {

    /* JADX INFO: compiled from: TimerCounterPushHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void configure(@NotNull TimerCounterPushHandler timerCounterPushHandler, @NotNull Map<String, ? extends Object> configurationOptions) {
            Intrinsics.checkNotNullParameter(configurationOptions, "configurationOptions");
            PushHandler.DefaultImpls.configure(timerCounterPushHandler, configurationOptions);
        }

        @Nullable
        public static Object getConfiguration(@NotNull TimerCounterPushHandler timerCounterPushHandler, @NotNull Continuation<? super Map<String, ? extends Object>> continuation) {
            return PushHandler.DefaultImpls.getConfiguration(timerCounterPushHandler, continuation);
        }

        @NotNull
        public static Inbox getInbox(@NotNull TimerCounterPushHandler timerCounterPushHandler) {
            return PushHandler.DefaultImpls.getInbox(timerCounterPushHandler);
        }

        public static void onNewToken(@NotNull TimerCounterPushHandler timerCounterPushHandler, @NotNull String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            PushHandler.DefaultImpls.onNewToken(timerCounterPushHandler, token);
        }

        @Nullable
        public static Object token(@NotNull TimerCounterPushHandler timerCounterPushHandler, @NotNull Continuation<? super String> continuation) {
            return PushHandler.DefaultImpls.token(timerCounterPushHandler, continuation);
        }
    }
}
