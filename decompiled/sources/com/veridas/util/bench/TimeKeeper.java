package com.veridas.util.bench;

import android.os.SystemClock;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.veridas.log.Log;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TimeKeeper.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0004J\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/veridas/util/bench/TimeKeeper;", "", "", "tick", EventDataKeys.Lifecycle.LIFECYCLE_START, "", LogKeysKt.TAG, "message", "", "end", "Ljava/util/Stack;", "a", "Ljava/util/Stack;", "getQueue", "()Ljava/util/Stack;", "queue", "<init>", "()V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public class TimeKeeper {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Stack<Long> queue = new Stack<>();

    public final void end(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Long lPop = this.queue.pop();
        long jTick = tick();
        Intrinsics.checkNotNull(lPop);
        Log.w(tag, message, Long.valueOf(jTick - lPop.longValue()));
    }

    @NotNull
    public final Stack<Long> getQueue() {
        return this.queue;
    }

    public final long start() {
        Long lPush = this.queue.push(Long.valueOf(tick()));
        Intrinsics.checkNotNullExpressionValue(lPush, "push(...)");
        return lPush.longValue();
    }

    public final long tick() {
        return SystemClock.elapsedRealtime();
    }
}
