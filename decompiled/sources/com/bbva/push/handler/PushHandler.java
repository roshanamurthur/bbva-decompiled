package com.bbva.push.handler;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import bk.q;
import com.bbva.plugin.push.command.UnregisterCommand;
import com.bbva.push.inbox.DefaultInbox;
import com.bbva.push.inbox.Inbox;
import com.bbva.push.model.NotificationChannel;
import com.bbva.push.model.Push;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PushHandler.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u001e\u0010\u000e\u001a\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0016J*\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&J\u001f\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0003H\u0016J\u0011\u0010\u001e\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u0011\u0010\u001f\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/bbva/push/handler/PushHandler;", "", "id", "", "getId", "()Ljava/lang/String;", "inbox", "Lcom/bbva/push/inbox/Inbox;", "getInbox", "()Lcom/bbva/push/inbox/Inbox;", "canHandlePush", "", "push", "Lcom/bbva/push/model/Push;", "configure", "", "configurationOptions", "", "createNotification", "Landroidx/core/app/NotificationCompat$Builder;", "context", "Landroid/content/Context;", "defaultIcon", "", "defaultChannel", "Lcom/bbva/push/model/NotificationChannel;", "getConfiguration", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onNewToken", "token", "register", UnregisterCommand.ID, "push_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PushHandler {

    /* JADX INFO: compiled from: PushHandler.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void configure(@NotNull PushHandler pushHandler, @NotNull Map<String, ? extends Object> configurationOptions) {
            Intrinsics.checkNotNullParameter(configurationOptions, "configurationOptions");
        }

        @Nullable
        public static Object getConfiguration(@NotNull PushHandler pushHandler, @NotNull Continuation<? super Map<String, ? extends Object>> continuation) {
            return q.emptyMap();
        }

        @NotNull
        public static Inbox getInbox(@NotNull PushHandler pushHandler) {
            return new DefaultInbox();
        }

        public static void onNewToken(@NotNull PushHandler pushHandler, @NotNull String token) {
            Intrinsics.checkNotNullParameter(token, "token");
        }

        @Nullable
        public static Object token(@NotNull PushHandler pushHandler, @NotNull Continuation<? super String> continuation) {
            return null;
        }
    }

    boolean canHandlePush(@NotNull Push push);

    void configure(@NotNull Map<String, ? extends Object> configurationOptions);

    @Nullable
    NotificationCompat.Builder createNotification(@NotNull Context context, @NotNull Push push, int defaultIcon, @NotNull NotificationChannel defaultChannel);

    @Nullable
    Object getConfiguration(@NotNull Continuation<? super Map<String, ? extends Object>> continuation);

    @NotNull
    String getId();

    @NotNull
    Inbox getInbox();

    void onNewToken(@NotNull String token);

    @Nullable
    Object register(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object token(@NotNull Continuation<? super String> continuation);

    @Nullable
    Object unregister(@NotNull Continuation<? super Boolean> continuation);
}
