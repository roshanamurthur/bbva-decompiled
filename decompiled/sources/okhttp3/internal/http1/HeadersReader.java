package okhttp3.internal.http1;

import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HeadersReader.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/http1/HeadersReader;", "", "", "readLine", "Lokhttp3/Headers;", "readHeaders", "Lokio/BufferedSource;", "a", "Lokio/BufferedSource;", "getSource", "()Lokio/BufferedSource;", "source", "<init>", "(Lokio/BufferedSource;)V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class HeadersReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final BufferedSource source;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f85887b;

    public HeadersReader(@NotNull BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.f85887b = SvgConstantsKt.SPECIFIED_TEXT_ANCHOR;
    }

    @NotNull
    public final BufferedSource getSource() {
        return this.source;
    }

    @NotNull
    public final Headers readHeaders() throws IOException {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String line = readLine();
            if (line.length() == 0) {
                return builder.build();
            }
            builder.addLenient$okhttp(line);
        }
    }

    @NotNull
    public final String readLine() throws IOException {
        String utf8LineStrict = this.source.readUtf8LineStrict(this.f85887b);
        this.f85887b -= (long) utf8LineStrict.length();
        return utf8LineStrict;
    }
}
