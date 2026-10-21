package okhttp3.internal.http;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RealResponseBody.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lokhttp3/internal/http/RealResponseBody;", "Lokhttp3/ResponseBody;", "", "contentLength", "Lokhttp3/MediaType;", "contentType", "Lokio/BufferedSource;", "source", "", "contentTypeString", "<init>", "(Ljava/lang/String;JLokio/BufferedSource;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class RealResponseBody extends ResponseBody {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public final String f85882q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f85883r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final BufferedSource f85884s0;

    public RealResponseBody(@Nullable String str, long j10, @NotNull BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f85882q0 = str;
        this.f85883r0 = j10;
        this.f85884s0 = source;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentLength, reason: from getter */
    public long getF85883r0() {
        return this.f85883r0;
    }

    @Override // okhttp3.ResponseBody
    @Nullable
    /* JADX INFO: renamed from: contentType */
    public MediaType getF85678q0() {
        String str = this.f85882q0;
        if (str != null) {
            return MediaType.INSTANCE.parse(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    @NotNull
    /* JADX INFO: renamed from: source, reason: from getter */
    public BufferedSource getF85884s0() {
        return this.f85884s0;
    }
}
