package okhttp3.internal.cache2;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Relay.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 E2\u00020\u0001:\u0002EFJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u0004\u0018\u00010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001cR$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0017\u00100\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0017\u0010;\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\b:\u0010/R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0011\u0010D\u001a\u0002018F¢\u0006\u0006\u001a\u0004\bD\u00105¨\u0006G"}, d2 = {"Lokhttp3/internal/cache2/Relay;", "", "", "upstreamSize", "", "commit", "Lokio/ByteString;", "metadata", "Lokio/Source;", "newSource", "Ljava/io/RandomAccessFile;", "a", "Ljava/io/RandomAccessFile;", "getFile", "()Ljava/io/RandomAccessFile;", "setFile", "(Ljava/io/RandomAccessFile;)V", "file", "b", "Lokio/Source;", "getUpstream", "()Lokio/Source;", "setUpstream", "(Lokio/Source;)V", "upstream", "c", "J", "getUpstreamPos", "()J", "setUpstreamPos", "(J)V", "upstreamPos", "e", "getBufferMaxSize", "bufferMaxSize", "Ljava/lang/Thread;", "f", "Ljava/lang/Thread;", "getUpstreamReader", "()Ljava/lang/Thread;", "setUpstreamReader", "(Ljava/lang/Thread;)V", "upstreamReader", "Lokio/Buffer;", "g", "Lokio/Buffer;", "getUpstreamBuffer", "()Lokio/Buffer;", "upstreamBuffer", "", "h", "Z", "getComplete", "()Z", "setComplete", "(Z)V", "complete", "i", "getBuffer", "buffer", "", "j", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSourceCount", "()I", "setSourceCount", "(I)V", "sourceCount", "isClosed", "Companion", "RelaySource", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class Relay {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final ByteString PREFIX_CLEAN;

    @JvmField
    @NotNull
    public static final ByteString PREFIX_DIRTY;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public RandomAccessFile file;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Source upstream;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long upstreamPos;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ByteString f85750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long bufferMaxSize;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Thread upstreamReader;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Buffer upstreamBuffer = new Buffer();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean complete;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Buffer buffer;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int sourceCount;

    /* JADX INFO: compiled from: Relay.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/cache2/Relay$Companion;", "", "()V", "FILE_HEADER_SIZE", "", "PREFIX_CLEAN", "Lokio/ByteString;", "PREFIX_DIRTY", "SOURCE_FILE", "", "SOURCE_UPSTREAM", "edit", "Lokhttp3/internal/cache2/Relay;", "file", "Ljava/io/File;", "upstream", "Lokio/Source;", "metadata", "bufferMaxSize", "read", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Relay edit(@NotNull File file, @NotNull Source upstream, @NotNull ByteString metadata, long bufferMaxSize) throws IOException {
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(upstream, "upstream");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, RootService.RW);
            Relay relay = new Relay(randomAccessFile, upstream, 0L, metadata, bufferMaxSize, null);
            randomAccessFile.setLength(0L);
            relay.a(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        @NotNull
        public final Relay read(@NotNull File file) throws IOException {
            Intrinsics.checkNotNullParameter(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, RootService.RW);
            FileChannel channel = randomAccessFile.getChannel();
            Intrinsics.checkNotNullExpressionValue(channel, "randomAccessFile.channel");
            FileOperator fileOperator = new FileOperator(channel);
            Buffer buffer = new Buffer();
            fileOperator.read(0L, buffer, 32L);
            ByteString byteString = Relay.PREFIX_CLEAN;
            if (!Intrinsics.areEqual(buffer.readByteString(byteString.size()), byteString)) {
                throw new IOException("unreadable cache file");
            }
            long j10 = buffer.readLong();
            long j11 = buffer.readLong();
            Buffer buffer2 = new Buffer();
            fileOperator.read(j10 + 32, buffer2, j11);
            return new Relay(randomAccessFile, null, j10, buffer2.readByteString(), 0L, null);
        }
    }

    /* JADX INFO: compiled from: Relay.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\r"}, d2 = {"Lokhttp3/internal/cache2/Relay$RelaySource;", "Lokio/Source;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "Lokio/Timeout;", "timeout", "", HearingDisabilitiesConstants.CLOSE_MODAL, "<init>", "(Lokhttp3/internal/cache2/Relay;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,356:1\n563#2:357\n*S KotlinDebug\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n*L\n267#1:357\n*E\n"})
    public final class RelaySource implements Source {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final Timeout f85757p0 = new Timeout();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @Nullable
        public FileOperator f85758q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f85759r0;

        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            Intrinsics.checkNotNull(file);
            FileChannel channel = file.getChannel();
            Intrinsics.checkNotNullExpressionValue(channel, "file!!.channel");
            this.f85758q0 = new FileOperator(channel);
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f85758q0 == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.f85758q0 = null;
            Relay relay = Relay.this;
            synchronized (relay) {
                try {
                    relay.setSourceCount(relay.getSourceCount() - 1);
                    if (relay.getSourceCount() == 0) {
                        RandomAccessFile file = relay.getFile();
                        relay.setFile(null);
                        randomAccessFile = file;
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (randomAccessFile != null) {
                Util.closeQuietly(randomAccessFile);
            }
        }

        @Override // okio.Source
        public long read(@NotNull Buffer sink, long byteCount) throws IOException {
            char c10;
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.f85758q0 == null) {
                throw new IllegalStateException("Check failed.".toString());
            }
            Relay relay = Relay.this;
            synchronized (relay) {
                while (true) {
                    try {
                        if (this.f85759r0 != relay.getUpstreamPos()) {
                            long upstreamPos = relay.getUpstreamPos() - relay.getBuffer().size();
                            if (this.f85759r0 < upstreamPos) {
                                c10 = 2;
                                break;
                            }
                            long jMin = Math.min(byteCount, relay.getUpstreamPos() - this.f85759r0);
                            relay.getBuffer().copyTo(sink, this.f85759r0 - upstreamPos, jMin);
                            this.f85759r0 += jMin;
                            return jMin;
                        }
                        if (!relay.getComplete()) {
                            if (relay.getUpstreamReader() == null) {
                                relay.setUpstreamReader(Thread.currentThread());
                                c10 = 1;
                                break;
                            }
                            this.f85757p0.waitUntilNotified(relay);
                        } else {
                            return -1L;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (c10 == 2) {
                    long jMin2 = Math.min(byteCount, Relay.this.getUpstreamPos() - this.f85759r0);
                    FileOperator fileOperator = this.f85758q0;
                    Intrinsics.checkNotNull(fileOperator);
                    fileOperator.read(this.f85759r0 + 32, sink, jMin2);
                    this.f85759r0 += jMin2;
                    return jMin2;
                }
                try {
                    Source upstream = Relay.this.getUpstream();
                    Intrinsics.checkNotNull(upstream);
                    long j10 = upstream.read(Relay.this.getUpstreamBuffer(), Relay.this.getBufferMaxSize());
                    if (j10 == -1) {
                        Relay relay2 = Relay.this;
                        relay2.commit(relay2.getUpstreamPos());
                        Relay relay3 = Relay.this;
                        synchronized (relay3) {
                            relay3.setUpstreamReader(null);
                            Intrinsics.checkNotNull(relay3, "null cannot be cast to non-null type java.lang.Object");
                            relay3.notifyAll();
                            Unit unit = Unit.INSTANCE;
                        }
                        return -1L;
                    }
                    long jMin3 = Math.min(j10, byteCount);
                    Relay.this.getUpstreamBuffer().copyTo(sink, 0L, jMin3);
                    this.f85759r0 += jMin3;
                    FileOperator fileOperator2 = this.f85758q0;
                    Intrinsics.checkNotNull(fileOperator2);
                    fileOperator2.write(Relay.this.getUpstreamPos() + 32, Relay.this.getUpstreamBuffer().clone(), j10);
                    Relay relay4 = Relay.this;
                    synchronized (relay4) {
                        try {
                            relay4.getBuffer().write(relay4.getUpstreamBuffer(), j10);
                            if (relay4.getBuffer().size() > relay4.getBufferMaxSize()) {
                                relay4.getBuffer().skip(relay4.getBuffer().size() - relay4.getBufferMaxSize());
                            }
                            relay4.setUpstreamPos(relay4.getUpstreamPos() + j10);
                            Unit unit2 = Unit.INSTANCE;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    Relay relay5 = Relay.this;
                    synchronized (relay5) {
                        relay5.setUpstreamReader(null);
                        Intrinsics.checkNotNull(relay5, "null cannot be cast to non-null type java.lang.Object");
                        relay5.notifyAll();
                    }
                    return jMin3;
                } catch (Throwable th4) {
                    Relay relay6 = Relay.this;
                    synchronized (relay6) {
                        relay6.setUpstreamReader(null);
                        Intrinsics.checkNotNull(relay6, "null cannot be cast to non-null type java.lang.Object");
                        relay6.notifyAll();
                        Unit unit3 = Unit.INSTANCE;
                        throw th4;
                    }
                }
            }
        }

        @Override // okio.Source
        @NotNull
        /* JADX INFO: renamed from: timeout, reason: from getter */
        public Timeout getF85757p0() {
            return this.f85757p0;
        }
    }

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        PREFIX_CLEAN = companion.encodeUtf8("OkHttp cache v1\n");
        PREFIX_DIRTY = companion.encodeUtf8("OkHttp DIRTY :(\n");
    }

    public Relay(RandomAccessFile randomAccessFile, Source source, long j10, ByteString byteString, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this.file = randomAccessFile;
        this.upstream = source;
        this.upstreamPos = j10;
        this.f85750d = byteString;
        this.bufferMaxSize = j11;
        this.complete = this.upstream == null;
        this.buffer = new Buffer();
    }

    public final void a(ByteString byteString, long j10, long j11) throws IOException {
        Buffer buffer = new Buffer();
        buffer.write(byteString);
        buffer.writeLong(j10);
        buffer.writeLong(j11);
        if (buffer.size() != 32) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        RandomAccessFile randomAccessFile = this.file;
        Intrinsics.checkNotNull(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        Intrinsics.checkNotNullExpressionValue(channel, "file!!.channel");
        new FileOperator(channel).write(0L, buffer, 32L);
    }

    public final void commit(long upstreamSize) throws IOException {
        Buffer buffer = new Buffer();
        ByteString byteString = this.f85750d;
        buffer.write(byteString);
        RandomAccessFile randomAccessFile = this.file;
        Intrinsics.checkNotNull(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        Intrinsics.checkNotNullExpressionValue(channel, "file!!.channel");
        new FileOperator(channel).write(32 + upstreamSize, buffer, byteString.size());
        RandomAccessFile randomAccessFile2 = this.file;
        Intrinsics.checkNotNull(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        a(PREFIX_CLEAN, upstreamSize, this.f85750d.size());
        RandomAccessFile randomAccessFile3 = this.file;
        Intrinsics.checkNotNull(randomAccessFile3);
        randomAccessFile3.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
            Unit unit = Unit.INSTANCE;
        }
        Source source = this.upstream;
        if (source != null) {
            Util.closeQuietly(source);
        }
        this.upstream = null;
    }

    @NotNull
    public final Buffer getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    @Nullable
    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    @Nullable
    public final Source getUpstream() {
        return this.upstream;
    }

    @NotNull
    public final Buffer getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    @Nullable
    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    @NotNull
    /* JADX INFO: renamed from: metadata, reason: from getter */
    public final ByteString getF85750d() {
        return this.f85750d;
    }

    @Nullable
    public final Source newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final void setComplete(boolean z10) {
        this.complete = z10;
    }

    public final void setFile(@Nullable RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i10) {
        this.sourceCount = i10;
    }

    public final void setUpstream(@Nullable Source source) {
        this.upstream = source;
    }

    public final void setUpstreamPos(long j10) {
        this.upstreamPos = j10;
    }

    public final void setUpstreamReader(@Nullable Thread thread) {
        this.upstreamReader = thread;
    }
}
