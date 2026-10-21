package okhttp3.internal.concurrent;

import ai.a;
import androidx.collection.h;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.time.DurationKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TaskLogger.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\u001a*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0080\bø\u0001\u0000\u001a7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/concurrent/Task;", "task", "Lokhttp3/internal/concurrent/TaskQueue;", "queue", "Lkotlin/Function0;", "", "messageBlock", "", "taskLog", ExifInterface.GPS_DIRECTION_TRUE, "block", "logElapsed", "(Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "ns", "formatDuration", "okhttp"}, k = 2, mv = {1, 8, 0})
public final class TaskLoggerKt {
    public static final void access$log(Task task, TaskQueue taskQueue, String str) {
        Logger logger = TaskRunner.INSTANCE.getLogger();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(taskQueue.getName());
        sb2.append(' ');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(task.getName());
        logger.fine(sb2.toString());
    }

    @NotNull
    public static final String formatDuration(long j10) {
        String strD;
        if (j10 <= -999500000) {
            strD = h.d(new StringBuilder(), (j10 - ((long) 500000000)) / ((long) 1000000000), " s ");
        } else if (j10 <= -999500) {
            strD = h.d(new StringBuilder(), (j10 - ((long) 500000)) / ((long) DurationKt.NANOS_IN_MILLIS), " ms");
        } else if (j10 <= 0) {
            strD = h.d(new StringBuilder(), (j10 - ((long) 500)) / ((long) 1000), " µs");
        } else if (j10 < 999500) {
            strD = h.d(new StringBuilder(), (j10 + ((long) 500)) / ((long) 1000), " µs");
        } else {
            strD = j10 < 999500000 ? h.d(new StringBuilder(), (j10 + ((long) 500000)) / ((long) DurationKt.NANOS_IN_MILLIS), " ms") : h.d(new StringBuilder(), (j10 + ((long) 500000000)) / ((long) 1000000000), " s ");
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return a.i(new Object[]{strD}, 1, "%6s", "format(format, *args)");
    }

    public static final <T> T logElapsed(@NotNull Task task, @NotNull TaskQueue queue, @NotNull Function0<? extends T> block) {
        long jNanoTime;
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean zIsLoggable = TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE);
        if (zIsLoggable) {
            jNanoTime = queue.getTaskRunner().getBackend().nanoTime();
            access$log(task, queue, "starting");
        } else {
            jNanoTime = -1;
        }
        try {
            T tInvoke = block.invoke();
            InlineMarker.finallyStart(1);
            if (zIsLoggable) {
                long jNanoTime2 = queue.getTaskRunner().getBackend().nanoTime() - jNanoTime;
                StringBuilder sb2 = new StringBuilder("finished run in ");
            }
            return tInvoke;
        } finally {
            InlineMarker.finallyStart(1);
            if (zIsLoggable) {
                access$log(task, queue, "failed a run in " + formatDuration(queue.getTaskRunner().getBackend().nanoTime() - jNanoTime));
            }
            InlineMarker.finallyEnd(1);
        }
    }

    public static final void taskLog(@NotNull Task task, @NotNull TaskQueue queue, @NotNull Function0<String> messageBlock) {
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(messageBlock, "messageBlock");
        if (TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE)) {
            access$log(task, queue, messageBlock.invoke());
        }
    }
}
