package okhttp3;

import androidx.camera.core.impl.v;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.coroutines.DebugKt;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ResponseBody.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\bH&J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u0010J\b\u0010\u0013\u001a\u00020\u0012H\u0016¨\u0006\u0018"}, d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Ljava/io/InputStream;", "byteStream", "Lokio/BufferedSource;", "source", "", "bytes", "Lokio/ByteString;", "byteString", "Ljava/io/Reader;", "charStream", "", "string", "", HearingDisabilitiesConstants.CLOSE_MODAL, "<init>", "()V", "Companion", "BomAwareReader", "okhttp"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nResponseBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody\n*L\n1#1,321:1\n140#1,11:322\n140#1,11:333\n*S KotlinDebug\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody\n*L\n124#1:322,11\n134#1:333,11\n*E\n"})
public abstract class ResponseBody implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public BomAwareReader f85673p0;

    /* JADX INFO: compiled from: ResponseBody.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0010"}, d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "", "cbuf", "", DebugKt.DEBUG_PROPERTY_VALUE_OFF, "len", "read", "", HearingDisabilitiesConstants.CLOSE_MODAL, "Lokio/BufferedSource;", "source", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Lokio/BufferedSource;Ljava/nio/charset/Charset;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nResponseBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody$BomAwareReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,321:1\n1#2:322\n*E\n"})
    public static final class BomAwareReader extends Reader {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final BufferedSource f85674p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NotNull
        public final Charset f85675q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f85676r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        @Nullable
        public InputStreamReader f85677s0;

        public BomAwareReader(@NotNull BufferedSource source, @NotNull Charset charset) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(charset, "charset");
            this.f85674p0 = source;
            this.f85675q0 = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Unit unit;
            this.f85676r0 = true;
            InputStreamReader inputStreamReader = this.f85677s0;
            if (inputStreamReader != null) {
                inputStreamReader.close();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.f85674p0.close();
            }
        }

        @Override // java.io.Reader
        public int read(@NotNull char[] cbuf, int off, int len) throws IOException {
            Intrinsics.checkNotNullParameter(cbuf, "cbuf");
            if (this.f85676r0) {
                throw new IOException("Stream closed");
            }
            InputStreamReader inputStreamReader = this.f85677s0;
            if (inputStreamReader == null) {
                BufferedSource bufferedSource = this.f85674p0;
                inputStreamReader = new InputStreamReader(bufferedSource.inputStream(), Util.readBomAsCharset(bufferedSource, this.f85675q0));
                this.f85677s0 = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, off, len);
        }
    }

    /* JADX INFO: compiled from: ResponseBody.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\"\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000bH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\fH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\rH\u0007J'\u0010\u000e\u001a\u00020\u0004*\u00020\u000b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u000f\u001a\u00020\u0004*\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u000f\u001a\u00020\u0004*\u00020\f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u000f\u001a\u00020\u0004*\u00020\r2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003¨\u0006\u0010"}, d2 = {"Lokhttp3/ResponseBody$Companion;", "", "()V", "create", "Lokhttp3/ResponseBody;", "contentType", "Lokhttp3/MediaType;", "content", "", "contentLength", "", "Lokio/BufferedSource;", "", "Lokio/ByteString;", "asResponseBody", "toResponseBody", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        public final ResponseBody create(@NotNull String str, @Nullable MediaType mediaType) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Charset charset = Charsets.UTF_8;
            if (mediaType != null) {
                Charset charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charsetCharset$default == null) {
                    mediaType = MediaType.INSTANCE.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetCharset$default;
                }
            }
            Buffer bufferWriteString = new Buffer().writeString(str, charset);
            return create(bufferWriteString, mediaType, bufferWriteString.size());
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, ByteString byteString, MediaType mediaType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(byteString, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, BufferedSource bufferedSource, MediaType mediaType, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                mediaType = null;
            }
            if ((i10 & 2) != 0) {
                j10 = -1;
            }
            return companion.create(bufferedSource, mediaType, j10);
        }

        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        public final ResponseBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return create(new Buffer().write(bArr), mediaType, bArr.length);
        }

        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        public final ResponseBody create(@NotNull ByteString byteString, @Nullable MediaType mediaType) {
            Intrinsics.checkNotNullParameter(byteString, "<this>");
            return create(new Buffer().write(byteString), mediaType, byteString.size());
        }

        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        public final ResponseBody create(@NotNull final BufferedSource bufferedSource, @Nullable final MediaType mediaType, final long j10) {
            Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: contentLength, reason: from getter */
                public long getF85679r0() {
                    return j10;
                }

                @Override // okhttp3.ResponseBody
                @Nullable
                /* JADX INFO: renamed from: contentType, reason: from getter */
                public MediaType getF85678q0() {
                    return mediaType;
                }

                @Override // okhttp3.ResponseBody
                @NotNull
                /* JADX INFO: renamed from: source, reason: from getter */
                public BufferedSource getF85680s0() {
                    return bufferedSource;
                }
            };
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @JvmStatic
        @NotNull
        public final ResponseBody create(@Nullable MediaType contentType, @NotNull String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, contentType);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @JvmStatic
        @NotNull
        public final ResponseBody create(@Nullable MediaType contentType, @NotNull byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, contentType);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @JvmStatic
        @NotNull
        public final ResponseBody create(@Nullable MediaType contentType, @NotNull ByteString content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, contentType);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
        @JvmStatic
        @NotNull
        public final ResponseBody create(@Nullable MediaType contentType, long contentLength, @NotNull BufferedSource content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return create(content, contentType, contentLength);
        }
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final ResponseBody create(@NotNull String str, @Nullable MediaType mediaType) {
        return INSTANCE.create(str, mediaType);
    }

    @NotNull
    public final InputStream byteStream() {
        return getF85680s0().inputStream();
    }

    @NotNull
    public final ByteString byteString() throws IOException {
        long jContentLength = getF85679r0();
        if (jContentLength > 2147483647L) {
            throw new IOException(v.c("Cannot buffer entire body for content length: ", jContentLength));
        }
        BufferedSource bufferedSourceSource = getF85680s0();
        try {
            ByteString byteString = bufferedSourceSource.readByteString();
            CloseableKt.closeFinally(bufferedSourceSource, null);
            int size = byteString.size();
            if (jContentLength == -1 || jContentLength == size) {
                return byteString;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + size + ") disagree");
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(bufferedSourceSource, th2);
                throw th3;
            }
        }
    }

    @NotNull
    public final byte[] bytes() throws IOException {
        long jContentLength = getF85679r0();
        if (jContentLength > 2147483647L) {
            throw new IOException(v.c("Cannot buffer entire body for content length: ", jContentLength));
        }
        BufferedSource bufferedSourceSource = getF85680s0();
        try {
            byte[] byteArray = bufferedSourceSource.readByteArray();
            CloseableKt.closeFinally(bufferedSourceSource, null);
            int length = byteArray.length;
            if (jContentLength == -1 || jContentLength == length) {
                return byteArray;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(bufferedSourceSource, th2);
                throw th3;
            }
        }
    }

    @NotNull
    public final Reader charStream() {
        Charset charset;
        BomAwareReader bomAwareReader = this.f85673p0;
        if (bomAwareReader == null) {
            BufferedSource bufferedSourceSource = getF85680s0();
            MediaType mediaTypeContentType = getF85678q0();
            if (mediaTypeContentType == null || (charset = mediaTypeContentType.charset(Charsets.UTF_8)) == null) {
                charset = Charsets.UTF_8;
            }
            bomAwareReader = new BomAwareReader(bufferedSourceSource, charset);
            this.f85673p0 = bomAwareReader;
        }
        return bomAwareReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(getF85680s0());
    }

    /* JADX INFO: renamed from: contentLength */
    public abstract long getF85679r0();

    @Nullable
    /* JADX INFO: renamed from: contentType */
    public abstract MediaType getF85678q0();

    @NotNull
    /* JADX INFO: renamed from: source */
    public abstract BufferedSource getF85680s0();

    @NotNull
    public final String string() throws IOException {
        Charset charset;
        BufferedSource bufferedSourceSource = getF85680s0();
        try {
            MediaType mediaTypeContentType = getF85678q0();
            if (mediaTypeContentType == null || (charset = mediaTypeContentType.charset(Charsets.UTF_8)) == null) {
                charset = Charsets.UTF_8;
            }
            String string = bufferedSourceSource.readString(Util.readBomAsCharset(bufferedSourceSource, charset));
            CloseableKt.closeFinally(bufferedSourceSource, null);
            return string;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(bufferedSourceSource, th2);
                throw th3;
            }
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @JvmStatic
    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType, long j10, @NotNull BufferedSource bufferedSource) {
        return INSTANCE.create(mediaType, j10, bufferedSource);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType, @NotNull String str) {
        return INSTANCE.create(mediaType, str);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType, @NotNull ByteString byteString) {
        return INSTANCE.create(mediaType, byteString);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType, @NotNull byte[] bArr) {
        return INSTANCE.create(mediaType, bArr);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final ResponseBody create(@NotNull BufferedSource bufferedSource, @Nullable MediaType mediaType, long j10) {
        return INSTANCE.create(bufferedSource, mediaType, j10);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final ResponseBody create(@NotNull ByteString byteString, @Nullable MediaType mediaType) {
        return INSTANCE.create(byteString, mediaType);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final ResponseBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
        return INSTANCE.create(bArr, mediaType);
    }
}
