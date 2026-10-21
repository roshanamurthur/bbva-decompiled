package kotlin.concurrent;

import java.util.Timer;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Timer.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¨\u0006\u0006"}, d2 = {"", "name", "", "daemon", "Ljava/util/Timer;", "timer", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
@JvmName(name = "TimersKt")
public final class TimersKt {
    @PublishedApi
    @NotNull
    public static final Timer timer(@Nullable String str, boolean z10) {
        return str == null ? new Timer(z10) : new Timer(str, z10);
    }
}
