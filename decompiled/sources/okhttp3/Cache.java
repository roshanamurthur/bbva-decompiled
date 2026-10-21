package okhttp3;

import androidx.webkit.ProxyConfig;
import bk.w;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.contacts.ContactAccessor;
import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.image.transform.ScaleToMaxSideTransformer;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.networkplugin.command.impl.PutCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Cache.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0004LKMNB!\b\u0000\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010\"\u001a\u00020 \u0012\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bH\u0010IB\u0019\b\u0016\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010\"\u001a\u00020 ¢\u0006\u0004\bH\u0010JJ\u0019\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0017\u001a\u00020\u000eJ\u0006\u0010\u0018\u001a\u00020\u000eJ\u0006\u0010\u0019\u001a\u00020\u000eJ\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u0006\u0010\u001f\u001a\u00020\u001dJ\u0006\u0010!\u001a\u00020 J\u0006\u0010\"\u001a\u00020 J\b\u0010#\u001a\u00020\u000eH\u0016J\b\u0010$\u001a\u00020\u000eH\u0016J\u000f\u0010(\u001a\u00020%H\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u00100\u001a\u00020\u000eH\u0000¢\u0006\u0004\b.\u0010/J\u0006\u00101\u001a\u00020\u001dJ\u0006\u00102\u001a\u00020\u001dJ\u0006\u00103\u001a\u00020\u001dR\u001a\u00109\u001a\u0002048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\"\u0010\u001f\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u001e\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010;\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?R\u0011\u0010D\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0011\u0010(\u001a\u00020%8G¢\u0006\u0006\u001a\u0004\b(\u0010'¨\u0006O"}, d2 = {"Lokhttp3/Cache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "get$okhttp", "(Lokhttp3/Request;)Lokhttp3/Response;", "get", DigipassManagerConstants.KEY_RESPONSE, "Lokhttp3/internal/cache/CacheRequest;", "put$okhttp", "(Lokhttp3/Response;)Lokhttp3/internal/cache/CacheRequest;", PutCommand.ID, "", "remove$okhttp", "(Lokhttp3/Request;)V", RemoveCommand.ID, "cached", DeepLinkListenerAdapter.Constants.ERROR_NETWORK, "update$okhttp", "(Lokhttp3/Response;Lokhttp3/Response;)V", "update", "initialize", "delete", "evictAll", "", "", ContactAccessor.URLS, "", "writeAbortCount", "writeSuccessCount", "", "size", ScaleToMaxSideTransformer.SIDE, "flush", HearingDisabilitiesConstants.CLOSE_MODAL, "Ljava/io/File;", "-deprecated_directory", "()Ljava/io/File;", "directory", "Lokhttp3/internal/cache/CacheStrategy;", "cacheStrategy", "trackResponse$okhttp", "(Lokhttp3/internal/cache/CacheStrategy;)V", "trackResponse", "trackConditionalCacheHit$okhttp", "()V", "trackConditionalCacheHit", "networkCount", "hitCount", "requestCount", "Lokhttp3/internal/cache/DiskLruCache;", "p0", "Lokhttp3/internal/cache/DiskLruCache;", "getCache$okhttp", "()Lokhttp3/internal/cache/DiskLruCache;", "cache", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getWriteSuccessCount$okhttp", "()I", "setWriteSuccessCount$okhttp", "(I)V", "r0", "getWriteAbortCount$okhttp", "setWriteAbortCount$okhttp", "", "isClosed", "()Z", "Lokhttp3/internal/io/FileSystem;", "fileSystem", "<init>", "(Ljava/io/File;JLokhttp3/internal/io/FileSystem;)V", "(Ljava/io/File;J)V", "Companion", "CacheResponseBody", "Entry", "RealCacheRequest", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class Cache implements Closeable, Flushable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DiskLruCache cache;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public int writeSuccessCount;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public int writeAbortCount;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f85435s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f85436t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f85437u0;

    /* JADX INFO: compiled from: Cache.kt */
    public static final class CacheResponseBody extends ResponseBody {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NotNull
        public final DiskLruCache.Snapshot f85438q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        @Nullable
        public final String f85439r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        @Nullable
        public final String f85440s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        @NotNull
        public final BufferedSource f85441t0;

        public CacheResponseBody(@NotNull DiskLruCache.Snapshot snapshot, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            this.f85438q0 = snapshot;
            this.f85439r0 = str;
            this.f85440s0 = str2;
            this.f85441t0 = Okio.buffer(new ForwardingSource(snapshot.getSource(1)) { // from class: okhttp3.Cache.CacheResponseBody.1
                @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    this.f85438q0.close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentLength */
        public final long getF85883r0() {
            String str = this.f85440s0;
            if (str != null) {
                return Util.toLongOrDefault(str, -1L);
            }
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        @Nullable
        /* JADX INFO: renamed from: contentType */
        public final MediaType getF85678q0() {
            String str = this.f85439r0;
            if (str != null) {
                return MediaType.INSTANCE.parse(str);
            }
            return null;
        }

        @Override // okhttp3.ResponseBody
        @NotNull
        /* JADX INFO: renamed from: source */
        public final BufferedSource getF85884s0() {
            return this.f85441t0;
        }
    }

    /* JADX INFO: compiled from: Cache.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010J\n\u0010\u0014\u001a\u00020\u0012*\u00020\fJ\n\u0010\u0015\u001a\u00020\u000e*\u00020\fR\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017¨\u0006\u001d"}, d2 = {"Lokhttp3/Cache$Companion;", "", "Lokhttp3/HttpUrl;", "url", "", "key", "Lokio/BufferedSource;", "source", "", "readInt$okhttp", "(Lokio/BufferedSource;)I", "readInt", "Lokhttp3/Response;", "cachedResponse", "Lokhttp3/Headers;", "cachedRequest", "Lokhttp3/Request;", "newRequest", "", "varyMatches", "hasVaryAll", "varyHeaders", "ENTRY_BODY", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cache.kt\nokhttp3/Cache$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,788:1\n2624#2,3:789\n*S KotlinDebug\n*F\n+ 1 Cache.kt\nokhttp3/Cache$Companion\n*L\n729#1:789,3\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static Set a(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i10 = 0; i10 < size; i10++) {
                if (l.equals("Vary", headers.name(i10), true)) {
                    String strValue = headers.value(i10);
                    if (treeSet == null) {
                        treeSet = new TreeSet(l.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
                    }
                    Iterator it = StringsKt__StringsKt.split$default((CharSequence) strValue, new char[]{AbstractJsonLexerKt.COMMA}, false, 0, 6, (Object) null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(StringsKt__StringsKt.trim((CharSequence) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? w.emptySet() : treeSet;
        }

        public final boolean hasVaryAll(@NotNull Response response) {
            Intrinsics.checkNotNullParameter(response, "<this>");
            return a(response.headers()).contains(ProxyConfig.MATCH_ALL_SCHEMES);
        }

        @JvmStatic
        @NotNull
        public final String key(@NotNull HttpUrl url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return ByteString.INSTANCE.encodeUtf8(url.getF85562i()).md5().hex();
        }

        public final int readInt$okhttp(@NotNull BufferedSource source) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            try {
                long decimalLong = source.readDecimalLong();
                String utf8LineStrict = source.readUtf8LineStrict();
                if (decimalLong >= 0 && decimalLong <= 2147483647L && utf8LineStrict.length() <= 0) {
                    return (int) decimalLong;
                }
                throw new IOException("expected an int but was \"" + decimalLong + utf8LineStrict + '\"');
            } catch (NumberFormatException e5) {
                throw new IOException(e5.getMessage());
            }
        }

        @NotNull
        public final Headers varyHeaders(@NotNull Response response) {
            Intrinsics.checkNotNullParameter(response, "<this>");
            Response responseNetworkResponse = response.networkResponse();
            Intrinsics.checkNotNull(responseNetworkResponse);
            Headers headers = responseNetworkResponse.request().headers();
            Set setA = a(response.headers());
            if (setA.isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strName = headers.name(i10);
                if (setA.contains(strName)) {
                    builder.add(strName, headers.value(i10));
                }
            }
            return builder.build();
        }

        public final boolean varyMatches(@NotNull Response cachedResponse, @NotNull Headers cachedRequest, @NotNull Request newRequest) {
            Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
            Intrinsics.checkNotNullParameter(cachedRequest, "cachedRequest");
            Intrinsics.checkNotNullParameter(newRequest, "newRequest");
            Set<String> setA = a(cachedResponse.headers());
            if ((setA instanceof Collection) && setA.isEmpty()) {
                return true;
            }
            for (String str : setA) {
                if (!Intrinsics.areEqual(cachedRequest.values(str), newRequest.headers(str))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: Cache.kt */
    public final class RealCacheRequest implements CacheRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final DiskLruCache.Editor f85455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Sink f85456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final AnonymousClass1 f85457c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f85458d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Cache f85459e;

        /* JADX WARN: Type inference failed for: r0v2, types: [okhttp3.Cache$RealCacheRequest$1] */
        public RealCacheRequest(@NotNull final Cache cache, DiskLruCache.Editor editor) {
            Intrinsics.checkNotNullParameter(editor, "editor");
            this.f85459e = cache;
            this.f85455a = editor;
            Sink sinkNewSink = editor.newSink(1);
            this.f85456b = sinkNewSink;
            this.f85457c = new ForwardingSink(sinkNewSink) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    Cache cache2 = cache;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache2) {
                        if (realCacheRequest.f85458d) {
                            return;
                        }
                        realCacheRequest.f85458d = true;
                        cache2.setWriteSuccessCount$okhttp(cache2.getWriteSuccessCount() + 1);
                        super.close();
                        this.f85455a.commit();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public final void abort() {
            Cache cache = this.f85459e;
            synchronized (cache) {
                if (this.f85458d) {
                    return;
                }
                this.f85458d = true;
                cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount() + 1);
                Util.closeQuietly(this.f85456b);
                try {
                    this.f85455a.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        @NotNull
        public final Sink body() {
            return this.f85457c;
        }
    }

    /* JADX INFO: renamed from: okhttp3.Cache$urls$1, reason: invalid class name */
    /* JADX INFO: compiled from: Cache.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"okhttp3/Cache$urls$1", "", "", "", "hasNext", "next", "", RemoveCommand.ID, "okhttp"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cache.kt\nokhttp3/Cache$urls$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,788:1\n1#2:789\n*E\n"})
    public static final class AnonymousClass1 implements Iterator<String>, KMutableIterator {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final Iterator<DiskLruCache.Snapshot> f85462p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @Nullable
        public String f85463q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f85464r0;

        public AnonymousClass1(Cache cache) {
            this.f85462p0 = cache.getCache().snapshots();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f85463q0 != null) {
                return true;
            }
            this.f85464r0 = false;
            while (true) {
                Iterator<DiskLruCache.Snapshot> it = this.f85462p0;
                if (!it.hasNext()) {
                    return false;
                }
                try {
                    DiskLruCache.Snapshot next = it.next();
                    try {
                        continue;
                        this.f85463q0 = Okio.buffer(next.getSource(0)).readUtf8LineStrict();
                        CloseableKt.closeFinally(next, null);
                        return true;
                    } catch (Throwable th2) {
                        try {
                            continue;
                            throw th2;
                        } catch (Throwable th3) {
                            CloseableKt.closeFinally(next, th2);
                            throw th3;
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f85464r0) {
                throw new IllegalStateException("remove() before next()".toString());
            }
            this.f85462p0.remove();
        }

        @Override // java.util.Iterator
        @NotNull
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f85463q0;
            Intrinsics.checkNotNull(str);
            this.f85463q0 = null;
            this.f85464r0 = true;
            return str;
        }
    }

    public Cache(@NotNull File directory, long j10, @NotNull FileSystem fileSystem) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        this.cache = new DiskLruCache(fileSystem, directory, 201105, 2, j10, TaskRunner.INSTANCE);
    }

    @JvmStatic
    @NotNull
    public static final String key(@NotNull HttpUrl httpUrl) {
        return INSTANCE.key(httpUrl);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "directory", imports = {}))
    @JvmName(name = "-deprecated_directory")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_directory, reason: not valid java name */
    public final File m6073deprecated_directory() {
        return this.cache.getDirectory();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cache.close();
    }

    public final void delete() throws IOException {
        this.cache.delete();
    }

    @JvmName(name = "directory")
    @NotNull
    public final File directory() {
        return this.cache.getDirectory();
    }

    public final void evictAll() throws IOException {
        this.cache.evictAll();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.cache.flush();
    }

    @Nullable
    public final Response get$okhttp(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Companion companion = INSTANCE;
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(companion.key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Headers headers = entry.f85446b;
                String str = entry.f85447c;
                HttpUrl httpUrl = entry.f85445a;
                Intrinsics.checkNotNullParameter(snapshot, "snapshot");
                Headers headers2 = entry.f85451g;
                String str2 = headers2.get(DigipassManagerConstants.KEY_CONTENT_TYPE);
                String str3 = headers2.get("Content-Length");
                Response response = new Response.Builder().request(new Request.Builder().url(httpUrl).method(str, null).headers(headers).build()).protocol(entry.f85448d).code(entry.f85449e).message(entry.f85450f).headers(headers2).body(new CacheResponseBody(snapshot, str2, str3)).handshake(entry.f85452h).sentRequestAtMillis(entry.f85453i).receivedResponseAtMillis(entry.f85454j).build();
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(response, "response");
                if (Intrinsics.areEqual(httpUrl, request.url()) && Intrinsics.areEqual(str, request.method()) && companion.varyMatches(response, headers, request)) {
                    return response;
                }
                ResponseBody responseBodyBody = response.body();
                if (responseBodyBody != null) {
                    Util.closeQuietly(responseBodyBody);
                }
                return null;
            } catch (IOException unused) {
                Util.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getCache$okhttp, reason: from getter */
    public final DiskLruCache getCache() {
        return this.cache;
    }

    /* JADX INFO: renamed from: getWriteAbortCount$okhttp, reason: from getter */
    public final int getWriteAbortCount() {
        return this.writeAbortCount;
    }

    /* JADX INFO: renamed from: getWriteSuccessCount$okhttp, reason: from getter */
    public final int getWriteSuccessCount() {
        return this.writeSuccessCount;
    }

    public final synchronized int hitCount() {
        return this.f85436t0;
    }

    public final void initialize() throws IOException {
        this.cache.initialize();
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    public final synchronized int networkCount() {
        return this.f85435s0;
    }

    @Nullable
    public final CacheRequest put$okhttp(@NotNull Response response) {
        DiskLruCache.Editor editorEdit$default;
        Intrinsics.checkNotNullParameter(response, "response");
        String strMethod = response.request().method();
        if (HttpMethod.INSTANCE.invalidatesCache(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!Intrinsics.areEqual(strMethod, "GET")) {
            return null;
        }
        Companion companion = INSTANCE;
        if (companion.hasVaryAll(response)) {
            return null;
        }
        Entry entry = new Entry(response);
        try {
            editorEdit$default = DiskLruCache.edit$default(this.cache, companion.key(response.request().url()), 0L, 2, null);
            if (editorEdit$default == null) {
                return null;
            }
            try {
                entry.c(editorEdit$default);
                return new RealCacheRequest(this, editorEdit$default);
            } catch (IOException unused2) {
                if (editorEdit$default != null) {
                    try {
                        editorEdit$default.abort();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            }
        } catch (IOException unused4) {
            editorEdit$default = null;
        }
    }

    public final void remove$okhttp(@NotNull Request request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        this.cache.remove(INSTANCE.key(request.url()));
    }

    public final synchronized int requestCount() {
        return this.f85437u0;
    }

    public final void setWriteAbortCount$okhttp(int i10) {
        this.writeAbortCount = i10;
    }

    public final void setWriteSuccessCount$okhttp(int i10) {
        this.writeSuccessCount = i10;
    }

    public final long size() throws IOException {
        return this.cache.size();
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.f85436t0++;
    }

    public final synchronized void trackResponse$okhttp(@NotNull CacheStrategy cacheStrategy) {
        try {
            Intrinsics.checkNotNullParameter(cacheStrategy, "cacheStrategy");
            this.f85437u0++;
            if (cacheStrategy.getNetworkRequest() != null) {
                this.f85435s0++;
            } else if (cacheStrategy.getCacheResponse() != null) {
                this.f85436t0++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void update$okhttp(@NotNull Response cached, @NotNull Response network) {
        DiskLruCache.Editor editorEdit;
        Intrinsics.checkNotNullParameter(cached, "cached");
        Intrinsics.checkNotNullParameter(network, "network");
        Entry entry = new Entry(network);
        ResponseBody responseBodyBody = cached.body();
        Intrinsics.checkNotNull(responseBodyBody, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            editorEdit = ((CacheResponseBody) responseBodyBody).f85438q0.edit();
            if (editorEdit == null) {
                return;
            }
            try {
                entry.c(editorEdit);
                editorEdit.commit();
            } catch (IOException unused) {
                if (editorEdit != null) {
                    try {
                        editorEdit.abort();
                    } catch (IOException unused2) {
                    }
                }
            }
        } catch (IOException unused3) {
            editorEdit = null;
        }
    }

    @NotNull
    public final Iterator<String> urls() throws IOException {
        return new AnonymousClass1(this);
    }

    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cache(@NotNull File directory, long j10) {
        this(directory, j10, FileSystem.SYSTEM);
        Intrinsics.checkNotNullParameter(directory, "directory");
    }

    /* JADX INFO: compiled from: Cache.kt */
    public static final class Entry {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public static final String f85443k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public static final String f85444l;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final HttpUrl f85445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Headers f85446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f85447c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Protocol f85448d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f85449e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f85450f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final Headers f85451g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public final Handshake f85452h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f85453i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f85454j;

        /* JADX INFO: compiled from: Cache.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lokhttp3/Cache$Entry$Companion;", "", "()V", "RECEIVED_MILLIS", "", "SENT_MILLIS", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new Companion(null);
            StringBuilder sb2 = new StringBuilder();
            Platform.Companion companion = Platform.INSTANCE;
            sb2.append(companion.get().getPrefix());
            sb2.append("-Sent-Millis");
            f85443k = sb2.toString();
            f85444l = companion.get().getPrefix() + "-Received-Millis";
        }

        public Entry(@NotNull Source rawSource) throws IOException {
            Intrinsics.checkNotNullParameter(rawSource, "rawSource");
            try {
                BufferedSource bufferedSourceBuffer = Okio.buffer(rawSource);
                String utf8LineStrict = bufferedSourceBuffer.readUtf8LineStrict();
                HttpUrl httpUrl = HttpUrl.INSTANCE.parse(utf8LineStrict);
                if (httpUrl == null) {
                    IOException iOException = new IOException("Cache corruption for " + utf8LineStrict);
                    Platform.INSTANCE.get().log("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.f85445a = httpUrl;
                this.f85447c = bufferedSourceBuffer.readUtf8LineStrict();
                Headers.Builder builder = new Headers.Builder();
                int int$okhttp = Cache.INSTANCE.readInt$okhttp(bufferedSourceBuffer);
                for (int i10 = 0; i10 < int$okhttp; i10++) {
                    builder.addLenient$okhttp(bufferedSourceBuffer.readUtf8LineStrict());
                }
                this.f85446b = builder.build();
                StatusLine statusLine = StatusLine.INSTANCE.parse(bufferedSourceBuffer.readUtf8LineStrict());
                this.f85448d = statusLine.protocol;
                this.f85449e = statusLine.code;
                this.f85450f = statusLine.message;
                Headers.Builder builder2 = new Headers.Builder();
                int int$okhttp2 = Cache.INSTANCE.readInt$okhttp(bufferedSourceBuffer);
                for (int i11 = 0; i11 < int$okhttp2; i11++) {
                    builder2.addLenient$okhttp(bufferedSourceBuffer.readUtf8LineStrict());
                }
                String str = f85443k;
                String str2 = builder2.get(str);
                String str3 = f85444l;
                String str4 = builder2.get(str3);
                builder2.removeAll(str);
                builder2.removeAll(str3);
                this.f85453i = str2 != null ? Long.parseLong(str2) : 0L;
                this.f85454j = str4 != null ? Long.parseLong(str4) : 0L;
                this.f85451g = builder2.build();
                if (Intrinsics.areEqual(this.f85445a.scheme(), ProxyConfig.MATCH_HTTPS)) {
                    String utf8LineStrict2 = bufferedSourceBuffer.readUtf8LineStrict();
                    if (utf8LineStrict2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + utf8LineStrict2 + '\"');
                    }
                    this.f85452h = Handshake.INSTANCE.get(!bufferedSourceBuffer.exhausted() ? TlsVersion.INSTANCE.forJavaName(bufferedSourceBuffer.readUtf8LineStrict()) : TlsVersion.SSL_3_0, CipherSuite.INSTANCE.forJavaName(bufferedSourceBuffer.readUtf8LineStrict()), a(bufferedSourceBuffer), a(bufferedSourceBuffer));
                } else {
                    this.f85452h = null;
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(rawSource, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(rawSource, th2);
                    throw th3;
                }
            }
        }

        public static List a(BufferedSource bufferedSource) throws IOException {
            int int$okhttp = Cache.INSTANCE.readInt$okhttp(bufferedSource);
            if (int$okhttp == -1) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance(ConstantKt.CERTIFICATE_TYPE_X509);
                ArrayList arrayList = new ArrayList(int$okhttp);
                for (int i10 = 0; i10 < int$okhttp; i10++) {
                    String utf8LineStrict = bufferedSource.readUtf8LineStrict();
                    Buffer buffer = new Buffer();
                    ByteString byteStringDecodeBase64 = ByteString.INSTANCE.decodeBase64(utf8LineStrict);
                    if (byteStringDecodeBase64 == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    buffer.write(byteStringDecodeBase64);
                    arrayList.add(certificateFactory.generateCertificate(buffer.inputStream()));
                }
                return arrayList;
            } catch (CertificateException e5) {
                throw new IOException(e5.getMessage());
            }
        }

        public static void b(BufferedSink bufferedSink, List list) throws IOException {
            try {
                bufferedSink.writeDecimalLong(list.size()).writeByte(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] bytes = ((Certificate) it.next()).getEncoded();
                    ByteString.Companion companion = ByteString.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(bytes, "bytes");
                    bufferedSink.writeUtf8(ByteString.Companion.of$default(companion, bytes, 0, 0, 3, null).base64()).writeByte(10);
                }
            } catch (CertificateEncodingException e5) {
                throw new IOException(e5.getMessage());
            }
        }

        public final void c(@NotNull DiskLruCache.Editor editor) throws IOException {
            HttpUrl httpUrl = this.f85445a;
            Handshake handshake = this.f85452h;
            Headers headers = this.f85451g;
            Headers headers2 = this.f85446b;
            Intrinsics.checkNotNullParameter(editor, "editor");
            BufferedSink bufferedSinkBuffer = Okio.buffer(editor.newSink(0));
            try {
                bufferedSinkBuffer.writeUtf8(httpUrl.getF85562i()).writeByte(10);
                bufferedSinkBuffer.writeUtf8(this.f85447c).writeByte(10);
                bufferedSinkBuffer.writeDecimalLong(headers2.size()).writeByte(10);
                int size = headers2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    bufferedSinkBuffer.writeUtf8(headers2.name(i10)).writeUtf8(": ").writeUtf8(headers2.value(i10)).writeByte(10);
                }
                bufferedSinkBuffer.writeUtf8(new StatusLine(this.f85448d, this.f85449e, this.f85450f).toString()).writeByte(10);
                bufferedSinkBuffer.writeDecimalLong(headers.size() + 2).writeByte(10);
                int size2 = headers.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    bufferedSinkBuffer.writeUtf8(headers.name(i11)).writeUtf8(": ").writeUtf8(headers.value(i11)).writeByte(10);
                }
                bufferedSinkBuffer.writeUtf8(f85443k).writeUtf8(": ").writeDecimalLong(this.f85453i).writeByte(10);
                bufferedSinkBuffer.writeUtf8(f85444l).writeUtf8(": ").writeDecimalLong(this.f85454j).writeByte(10);
                if (Intrinsics.areEqual(httpUrl.scheme(), ProxyConfig.MATCH_HTTPS)) {
                    bufferedSinkBuffer.writeByte(10);
                    Intrinsics.checkNotNull(handshake);
                    bufferedSinkBuffer.writeUtf8(handshake.cipherSuite().javaName()).writeByte(10);
                    b(bufferedSinkBuffer, handshake.peerCertificates());
                    b(bufferedSinkBuffer, handshake.localCertificates());
                    bufferedSinkBuffer.writeUtf8(handshake.tlsVersion().javaName()).writeByte(10);
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(bufferedSinkBuffer, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(bufferedSinkBuffer, th2);
                    throw th3;
                }
            }
        }

        public Entry(@NotNull Response response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f85445a = response.request().url();
            this.f85446b = Cache.INSTANCE.varyHeaders(response);
            this.f85447c = response.request().method();
            this.f85448d = response.protocol();
            this.f85449e = response.code();
            this.f85450f = response.message();
            this.f85451g = response.headers();
            this.f85452h = response.handshake();
            this.f85453i = response.sentRequestAtMillis();
            this.f85454j = response.receivedResponseAtMillis();
        }
    }
}
