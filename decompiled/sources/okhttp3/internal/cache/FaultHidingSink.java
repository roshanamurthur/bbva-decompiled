package okhttp3.internal.cache;

import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FaultHidingSink.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/cache/FaultHidingSink;", "Lokio/ForwardingSink;", "Lokio/Buffer;", "source", "", "byteCount", "", "write", "flush", HearingDisabilitiesConstants.CLOSE_MODAL, "Lkotlin/Function1;", "Ljava/io/IOException;", "q0", "Lkotlin/jvm/functions/Function1;", "getOnException", "()Lkotlin/jvm/functions/Function1;", "onException", "Lokio/Sink;", "delegate", "<init>", "(Lokio/Sink;Lkotlin/jvm/functions/Function1;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
public class FaultHidingSink extends ForwardingSink {

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<IOException, Unit> onException;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f85745r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaultHidingSink(@NotNull Sink delegate, @NotNull Function1<? super IOException, Unit> onException) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onException, "onException");
        this.onException = onException;
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f85745r0) {
            return;
        }
        try {
            super.close();
        } catch (IOException e5) {
            this.f85745r0 = true;
            this.onException.invoke(e5);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
    public void flush() {
        if (this.f85745r0) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e5) {
            this.f85745r0 = true;
            this.onException.invoke(e5);
        }
    }

    @NotNull
    public final Function1<IOException, Unit> getOnException() {
        return this.onException;
    }

    @Override // okio.ForwardingSink, okio.Sink
    public void write(@NotNull Buffer source, long byteCount) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f85745r0) {
            source.skip(byteCount);
            return;
        }
        try {
            super.write(source, byteCount);
        } catch (IOException e5) {
            this.f85745r0 = true;
            this.onException.invoke(e5);
        }
    }
}
