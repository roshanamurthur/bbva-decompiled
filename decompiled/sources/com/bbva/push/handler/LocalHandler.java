package com.bbva.push.handler;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.bbva.plugin.push.command.UnregisterCommand;
import com.bbva.push.creator.DefaultNotificationCreator;
import com.bbva.push.inbox.Inbox;
import com.bbva.push.model.NotificationChannel;
import com.bbva.push.model.Push;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocalHandler.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0013\u0010\u000e\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/bbva/push/handler/LocalHandler;", "Lcom/bbva/push/handler/PushHandler;", "Lcom/bbva/push/model/Push;", "push", "", "canHandlePush", "Landroid/content/Context;", "context", "", "defaultIcon", "Lcom/bbva/push/model/NotificationChannel;", "defaultChannel", "Landroidx/core/app/NotificationCompat$Builder;", "createNotification", "register", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", UnregisterCommand.ID, "", "getId", "()Ljava/lang/String;", "id", "<init>", "()V", "Companion", "push_release"}, k = 1, mv = {1, 8, 0})
public final class LocalHandler implements PushHandler {

    @NotNull
    public static final String ID = "local";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DefaultNotificationCreator f36236a = new DefaultNotificationCreator();

    @Override // com.bbva.push.handler.PushHandler
    public boolean canHandlePush(@NotNull Push push) {
        Intrinsics.checkNotNullParameter(push, "push");
        return Intrinsics.areEqual(push.getOrigin(), getF36222b());
    }

    @Override // com.bbva.push.handler.PushHandler
    public void configure(@NotNull Map<String, ? extends Object> map) {
        PushHandler.DefaultImpls.configure(this, map);
    }

    @Override // com.bbva.push.handler.PushHandler
    @NotNull
    public NotificationCompat.Builder createNotification(@NotNull Context context, @NotNull Push push, int defaultIcon, @NotNull NotificationChannel defaultChannel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(push, "push");
        Intrinsics.checkNotNullParameter(defaultChannel, "defaultChannel");
        return this.f36236a.createNotificationBuilder(context, defaultIcon, defaultChannel, push);
    }

    @Override // com.bbva.push.handler.PushHandler
    @Nullable
    public Object getConfiguration(@NotNull Continuation<? super Map<String, ? extends Object>> continuation) {
        return PushHandler.DefaultImpls.getConfiguration(this, continuation);
    }

    @Override // com.bbva.push.handler.PushHandler
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getF36222b() {
        return "local";
    }

    @Override // com.bbva.push.handler.PushHandler
    @NotNull
    public Inbox getInbox() {
        return PushHandler.DefaultImpls.getInbox(this);
    }

    @Override // com.bbva.push.handler.PushHandler
    public void onNewToken(@NotNull String str) {
        PushHandler.DefaultImpls.onNewToken(this, str);
    }

    @Override // com.bbva.push.handler.PushHandler
    @Nullable
    public Object register(@NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(true);
    }

    @Override // com.bbva.push.handler.PushHandler
    @Nullable
    public Object token(@NotNull Continuation<? super String> continuation) {
        return PushHandler.DefaultImpls.token(this, continuation);
    }

    @Override // com.bbva.push.handler.PushHandler
    @Nullable
    public Object unregister(@NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(true);
    }
}
