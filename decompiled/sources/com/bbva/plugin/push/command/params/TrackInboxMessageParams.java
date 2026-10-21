package com.bbva.plugin.push.command.params;

import androidx.annotation.Keep;
import com.bbva.plugin.push.command.inbox.params.InboxParams;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TrackInboxMessageParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/bbva/plugin/push/command/params/TrackInboxMessageParams;", "Lcom/bbva/plugin/push/command/inbox/params/InboxParams;", "serviceId", "", "messageId", "data", "", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getData", "()Ljava/util/Map;", "getMessageId", "()Ljava/lang/String;", "push-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TrackInboxMessageParams extends InboxParams {

    @Nullable
    private final Map<String, Object> data;

    @Nullable
    private final String messageId;

    public TrackInboxMessageParams(@Nullable String str, @Nullable String str2, @Nullable Map<String, ? extends Object> map) {
        super(str);
        this.messageId = str2;
        this.data = map;
    }

    @Nullable
    public final Map<String, Object> getData() {
        return this.data;
    }

    @Nullable
    public final String getMessageId() {
        return this.messageId;
    }
}
