package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PushObserver.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H&J&\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\u0003H&J\u001e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/http2/PushObserver;", "", "onData", "", "streamId", "", "source", "Lokio/BufferedSource;", "byteCount", "last", "onHeaders", "responseHeaders", "", "Lokhttp3/internal/http2/Header;", "onRequest", "requestHeaders", "onReset", "", "errorCode", "Lokhttp3/internal/http2/ErrorCode;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PushObserver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f86031a;

    @JvmField
    @NotNull
    public static final PushObserver CANCEL = new Companion.a();

    /* JADX INFO: compiled from: PushObserver.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\b"}, d2 = {"Lokhttp3/internal/http2/PushObserver$Companion;", "", "Lokhttp3/internal/http2/PushObserver;", "CANCEL", "Lokhttp3/internal/http2/PushObserver;", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f86031a = new Companion();

        /* JADX INFO: compiled from: PushObserver.kt */
        public static final class a implements PushObserver {
            @Override // okhttp3.internal.http2.PushObserver
            public final boolean onData(int i10, @NotNull BufferedSource source, int i11, boolean z10) throws IOException {
                Intrinsics.checkNotNullParameter(source, "source");
                source.skip(i11);
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public final boolean onHeaders(int i10, @NotNull List<Header> responseHeaders, boolean z10) {
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public final boolean onRequest(int i10, @NotNull List<Header> requestHeaders) {
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public final void onReset(int i10, @NotNull ErrorCode errorCode) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            }
        }
    }

    boolean onData(int streamId, @NotNull BufferedSource source, int byteCount, boolean last) throws IOException;

    boolean onHeaders(int streamId, @NotNull List<Header> responseHeaders, boolean last);

    boolean onRequest(int streamId, @NotNull List<Header> requestHeaders);

    void onReset(int streamId, @NotNull ErrorCode errorCode);
}
