package kotlin.concurrent;

import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Timer.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"kotlin/concurrent/TimersKt$timerTask$1", "Ljava/util/TimerTask;", "", "run", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n*L\n1#1,148:1\n*E\n"})
public final class TimersKt$timerTask$1 extends TimerTask {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function1<TimerTask, Unit> f79575p0;

    /* JADX WARN: Multi-variable type inference failed */
    public TimersKt$timerTask$1(Function1<? super TimerTask, Unit> function1) {
        this.f79575p0 = function1;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        this.f79575p0.invoke(this);
    }
}
