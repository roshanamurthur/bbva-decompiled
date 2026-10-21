package okio;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.io.IOException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ForwardingSink.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u000f\u0010\u0010\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0015"}, d2 = {"Lokio/ForwardingSink;", "Lokio/Sink;", "Lokio/Buffer;", "source", "", "byteCount", "", "write", "flush", "Lokio/Timeout;", "timeout", HearingDisabilitiesConstants.CLOSE_MODAL, "", "toString", "-deprecated_delegate", "()Lokio/Sink;", "delegate", "p0", "Lokio/Sink;", "<init>", "(Lokio/Sink;)V", "okio"}, k = 1, mv = {1, 9, 0})
public abstract class ForwardingSink implements Sink {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Sink delegate;

    public ForwardingSink(@NotNull Sink delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "delegate", imports = {}))
    @JvmName(name = "-deprecated_delegate")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name and from getter */
    public final Sink getDelegate() {
        return this.delegate;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @JvmName(name = "delegate")
    @NotNull
    public final Sink delegate() {
        return this.delegate;
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // okio.Sink
    @NotNull
    /* JADX INFO: renamed from: timeout */
    public Timeout getF86331p0() {
        return this.delegate.getF86331p0();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + RootService.OPEN_BRACKET + this.delegate + RootService.CLOSE_BRACKET;
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer source, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        this.delegate.write(source, byteCount);
    }
}
