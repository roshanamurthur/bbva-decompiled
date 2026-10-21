package j2;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OutcomeReceiver.kt */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(31)
public final class c<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Continuation<R> f78759p0;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull Continuation<? super R> continuation) {
        super(false);
        this.f78759p0 = continuation;
    }

    public final void onError(@NotNull E e5) {
        if (compareAndSet(false, true)) {
            Continuation<R> continuation = this.f78759p0;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(e5)));
        }
    }

    public final void onResult(R r3) {
        if (compareAndSet(false, true)) {
            this.f78759p0.resumeWith(Result.m5535constructorimpl(r3));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @NotNull
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + RootService.CLOSE_BRACKET;
    }
}
