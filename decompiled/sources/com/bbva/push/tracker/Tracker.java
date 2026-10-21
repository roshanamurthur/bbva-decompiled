package com.bbva.push.tracker;

import bk.q;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Tracker.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/bbva/push/tracker/Tracker;", "", "track", "", "notificationId", "", "action", "data", "", "push_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Tracker {

    /* JADX INFO: compiled from: Tracker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void track$default(Tracker tracker, String str, String str2, Map map, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
            }
            if ((i10 & 4) != 0) {
                map = q.emptyMap();
            }
            tracker.track(str, str2, map);
        }
    }

    void track(@NotNull String notificationId, @NotNull String action, @NotNull Map<String, ? extends Object> data);
}
