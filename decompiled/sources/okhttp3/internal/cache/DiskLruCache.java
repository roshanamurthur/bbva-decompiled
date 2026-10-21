package okhttp3.internal.cache;

import ad.d;
import androidx.camera.core.impl.utils.a;
import androidx.camera.core.processing.f;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.image.transform.ScaleToMaxSideTransformer;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.semaas.model.Properties;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DiskLruCache.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0004QRSTB9\b\u0000\u0012\u0006\u0010*\u001a\u00020%\u0012\u0006\u00100\u001a\u00020+\u0012\u0006\u0010L\u001a\u000201\u0012\u0006\u00106\u001a\u000201\u0012\u0006\u0010>\u001a\u00020\f\u0012\u0006\u0010N\u001a\u00020M¢\u0006\u0004\bO\u0010PJ\u0006\u0010\u0004\u001a\u00020\u0003J\u000f\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u000b\u001a\b\u0018\u00010\nR\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0086\u0002J \u0010\u000f\u001a\b\u0018\u00010\u000eR\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007J\u0006\u0010\u0010\u001a\u00020\fJ#\u0010\u0016\u001a\u00020\u00032\n\u0010\u0011\u001a\u00060\u000eR\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\bJ\u001b\u0010\u001c\u001a\u00020\u00122\n\u0010\u0019\u001a\u00060\u0018R\u00020\u0000H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001d\u001a\u00020\u0003H\u0016J\u0006\u0010\u001e\u001a\u00020\u0012J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\u0006\u0010 \u001a\u00020\u0003J\u0006\u0010!\u001a\u00020\u0003J\u0006\u0010\"\u001a\u00020\u0003J\u0010\u0010$\u001a\f\u0012\b\u0012\u00060\nR\u00020\u00000#R\u001a\u0010*\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u00100\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00106\u001a\u0002018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R*\u0010>\u001a\u00020\f2\u0006\u00107\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R*\u0010D\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u00060\u0018R\u00020\u00000?8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\"\u0010K\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006U"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "", "initialize", "rebuildJournal$okhttp", "()V", "rebuildJournal", "", "key", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "get", "", "expectedSequenceNumber", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "edit", "size", "editor", "", "success", "completeEdit$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;Z)V", "completeEdit", RemoveCommand.ID, "Lokhttp3/internal/cache/DiskLruCache$Entry;", "entry", "removeEntry$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Entry;)Z", "removeEntry", "flush", "isClosed", HearingDisabilitiesConstants.CLOSE_MODAL, "trimToSize", "delete", "evictAll", "", "snapshots", "Lokhttp3/internal/io/FileSystem;", "p0", "Lokhttp3/internal/io/FileSystem;", "getFileSystem$okhttp", "()Lokhttp3/internal/io/FileSystem;", "fileSystem", "Ljava/io/File;", "q0", "Ljava/io/File;", "getDirectory", "()Ljava/io/File;", "directory", "", "s0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getValueCount$okhttp", "()I", "valueCount", "value", "t0", "J", "getMaxSize", "()J", "setMaxSize", "(J)V", ScaleToMaxSideTransformer.SIDE, "Ljava/util/LinkedHashMap;", "E0", "Ljava/util/LinkedHashMap;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "lruEntries", "J0", "Z", "getClosed$okhttp", "()Z", "setClosed$okhttp", "(Z)V", "closed", Properties.APP_VERSION, "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(Lokhttp3/internal/io/FileSystem;Ljava/io/File;IIJLokhttp3/internal/concurrent/TaskRunner;)V", "Companion", "Editor", "Entry", "Snapshot", "okhttp"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1065:1\n1#2:1066\n608#3,4:1067\n37#4,2:1071\n37#4,2:1073\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache\n*L\n215#1:1067,4\n672#1:1071,2\n721#1:1073,2\n*E\n"})
public final class DiskLruCache implements Closeable, Flushable {

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    @NotNull
    public final LinkedHashMap<String, Entry> lruEntries;
    public int F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    public boolean closed;
    public boolean K0;
    public boolean L0;
    public long M0;

    @NotNull
    public final TaskQueue N0;

    @NotNull
    public final DiskLruCache$cleanupTask$1 O0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FileSystem fileSystem;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final File directory;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f85708r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public final int valueCount;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    public long maxSize;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final File f85711u0;

    @NotNull
    public final File v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final File f85712w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public long f85713x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Nullable
    public BufferedSink f85714y0;

    @JvmField
    @NotNull
    public static final String JOURNAL_FILE = "journal";

    @JvmField
    @NotNull
    public static final String JOURNAL_FILE_TEMP = "journal.tmp";

    @JvmField
    @NotNull
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";

    @JvmField
    @NotNull
    public static final String MAGIC = "libcore.io.DiskLruCache";

    @JvmField
    @NotNull
    public static final String VERSION_1 = "1";

    @JvmField
    public static final long ANY_SEQUENCE_NUMBER = -1;

    @JvmField
    @NotNull
    public static final Regex LEGAL_KEY_PATTERN = new Regex("[a-z0-9_-]{1,120}");

    @JvmField
    @NotNull
    public static final String CLEAN = "CLEAN";

    @JvmField
    @NotNull
    public static final String DIRTY = "DIRTY";

    @JvmField
    @NotNull
    public static final String REMOVE = "REMOVE";

    @JvmField
    @NotNull
    public static final String READ = "READ";

    /* JADX INFO: compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0018\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0014\u001a\u00060\u000eR\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002R\u001e\u0010\u0014\u001a\u00060\u000eR\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "", "detach$okhttp", "()V", "detach", "", FirebaseAnalytics.Param.INDEX, "Lokio/Source;", "newSource", "Lokio/Sink;", "newSink", "commit", "abort", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "Lokhttp3/internal/cache/DiskLruCache;", "a", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "getEntry$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Entry;", "entry", "", "b", "[Z", "getWritten$okhttp", "()[Z", "written", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Lokhttp3/internal/cache/DiskLruCache$Entry;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public final class Editor {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Entry entry;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final boolean[] written;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f85717c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ DiskLruCache f85718d;

        /* JADX INFO: compiled from: DiskLruCache.kt */
        public static final class a extends Lambda implements Function1<IOException, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ DiskLruCache f85719p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Editor f85720q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DiskLruCache diskLruCache, Editor editor) {
                super(1);
                this.f85719p0 = diskLruCache;
                this.f85720q0 = editor;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(IOException iOException) {
                IOException it = iOException;
                Intrinsics.checkNotNullParameter(it, "it");
                DiskLruCache diskLruCache = this.f85719p0;
                Editor editor = this.f85720q0;
                synchronized (diskLruCache) {
                    editor.detach$okhttp();
                }
                return Unit.INSTANCE;
            }
        }

        public Editor(@NotNull DiskLruCache diskLruCache, Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.f85718d = diskLruCache;
            this.entry = entry;
            this.written = entry.getReadable() ? null : new boolean[diskLruCache.getValueCount()];
        }

        public final void abort() throws IOException {
            DiskLruCache diskLruCache = this.f85718d;
            synchronized (diskLruCache) {
                try {
                    if (!(!this.f85717c)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (Intrinsics.areEqual(this.entry.getCurrentEditor(), this)) {
                        diskLruCache.completeEdit$okhttp(this, false);
                    }
                    this.f85717c = true;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void commit() throws IOException {
            DiskLruCache diskLruCache = this.f85718d;
            synchronized (diskLruCache) {
                try {
                    if (!(!this.f85717c)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (Intrinsics.areEqual(this.entry.getCurrentEditor(), this)) {
                        diskLruCache.completeEdit$okhttp(this, true);
                    }
                    this.f85717c = true;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void detach$okhttp() throws IOException {
            Entry entry = this.entry;
            if (Intrinsics.areEqual(entry.getCurrentEditor(), this)) {
                DiskLruCache diskLruCache = this.f85718d;
                if (diskLruCache.H0) {
                    diskLruCache.completeEdit$okhttp(this, false);
                } else {
                    entry.setZombie$okhttp(true);
                }
            }
        }

        @NotNull
        /* JADX INFO: renamed from: getEntry$okhttp, reason: from getter */
        public final Entry getEntry() {
            return this.entry;
        }

        @Nullable
        /* JADX INFO: renamed from: getWritten$okhttp, reason: from getter */
        public final boolean[] getWritten() {
            return this.written;
        }

        @NotNull
        public final Sink newSink(int index) {
            DiskLruCache diskLruCache = this.f85718d;
            synchronized (diskLruCache) {
                if (!(!this.f85717c)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!Intrinsics.areEqual(this.entry.getCurrentEditor(), this)) {
                    return Okio.blackhole();
                }
                if (!this.entry.getReadable()) {
                    boolean[] zArr = this.written;
                    Intrinsics.checkNotNull(zArr);
                    zArr[index] = true;
                }
                try {
                    return new FaultHidingSink(diskLruCache.getFileSystem().sink(this.entry.getDirtyFiles$okhttp().get(index)), new a(diskLruCache, this));
                } catch (FileNotFoundException unused) {
                    return Okio.blackhole();
                }
            }
        }

        @Nullable
        public final Source newSource(int index) {
            DiskLruCache diskLruCache = this.f85718d;
            synchronized (diskLruCache) {
                if (!(!this.f85717c)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                Source source = null;
                if (!this.entry.getReadable() || !Intrinsics.areEqual(this.entry.getCurrentEditor(), this) || this.entry.getZombie()) {
                    return null;
                }
                try {
                    source = diskLruCache.getFileSystem().source(this.entry.getCleanFiles$okhttp().get(index));
                } catch (FileNotFoundException unused) {
                }
                return source;
            }
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\n\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\bL\u0010MJ\u001d\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0012\u001a\b\u0018\u00010\u000eR\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010'\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\"\u0010/\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00103\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R(\u0010;\u001a\b\u0018\u000104R\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006N"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "", "", "strings", "", "setLengths$okhttp", "(Ljava/util/List;)V", "setLengths", "Lokio/BufferedSink;", "writer", "writeLengths$okhttp", "(Lokio/BufferedSink;)V", "writeLengths", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "snapshot$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot", "a", "Ljava/lang/String;", "getKey$okhttp", "()Ljava/lang/String;", "key", "", "b", "[J", "getLengths$okhttp", "()[J", "lengths", "", "Ljava/io/File;", "c", "Ljava/util/List;", "getCleanFiles$okhttp", "()Ljava/util/List;", "cleanFiles", "d", "getDirtyFiles$okhttp", "dirtyFiles", "", "e", "Z", "getReadable$okhttp", "()Z", "setReadable$okhttp", "(Z)V", "readable", "f", "getZombie$okhttp", "setZombie$okhttp", "zombie", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "g", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "getCurrentEditor$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "setCurrentEditor$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "currentEditor", "", "h", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getLockingSourceCount$okhttp", "()I", "setLockingSourceCount$okhttp", "(I)V", "lockingSourceCount", "", "i", "J", "getSequenceNumber$okhttp", "()J", "setSequenceNumber$okhttp", "(J)V", "sequenceNumber", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$Entry\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,1065:1\n608#2,4:1066\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$Entry\n*L\n1001#1:1066,4\n*E\n"})
    public final class Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String key;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final long[] lengths;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ArrayList f85723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final ArrayList f85724d;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public boolean readable;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public boolean zombie;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Editor currentEditor;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public int lockingSourceCount;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public long sequenceNumber;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ DiskLruCache f85730j;

        public Entry(@NotNull DiskLruCache diskLruCache, String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f85730j = diskLruCache;
            this.key = key;
            this.lengths = new long[diskLruCache.getValueCount()];
            this.f85723c = new ArrayList();
            this.f85724d = new ArrayList();
            StringBuilder sb2 = new StringBuilder(key);
            sb2.append('.');
            int length = sb2.length();
            int valueCount = diskLruCache.getValueCount();
            for (int i10 = 0; i10 < valueCount; i10++) {
                sb2.append(i10);
                this.f85723c.add(new File(this.f85730j.getDirectory(), sb2.toString()));
                sb2.append(".tmp");
                this.f85724d.add(new File(this.f85730j.getDirectory(), sb2.toString()));
                sb2.setLength(length);
            }
        }

        @NotNull
        public final List<File> getCleanFiles$okhttp() {
            return this.f85723c;
        }

        @Nullable
        /* JADX INFO: renamed from: getCurrentEditor$okhttp, reason: from getter */
        public final Editor getCurrentEditor() {
            return this.currentEditor;
        }

        @NotNull
        public final List<File> getDirtyFiles$okhttp() {
            return this.f85724d;
        }

        @NotNull
        /* JADX INFO: renamed from: getKey$okhttp, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @NotNull
        /* JADX INFO: renamed from: getLengths$okhttp, reason: from getter */
        public final long[] getLengths() {
            return this.lengths;
        }

        /* JADX INFO: renamed from: getLockingSourceCount$okhttp, reason: from getter */
        public final int getLockingSourceCount() {
            return this.lockingSourceCount;
        }

        /* JADX INFO: renamed from: getReadable$okhttp, reason: from getter */
        public final boolean getReadable() {
            return this.readable;
        }

        /* JADX INFO: renamed from: getSequenceNumber$okhttp, reason: from getter */
        public final long getSequenceNumber() {
            return this.sequenceNumber;
        }

        /* JADX INFO: renamed from: getZombie$okhttp, reason: from getter */
        public final boolean getZombie() {
            return this.zombie;
        }

        public final void setCurrentEditor$okhttp(@Nullable Editor editor) {
            this.currentEditor = editor;
        }

        public final void setLengths$okhttp(@NotNull List<String> strings) throws IOException {
            Intrinsics.checkNotNullParameter(strings, "strings");
            if (strings.size() != this.f85730j.getValueCount()) {
                throw new IOException("unexpected journal line: " + strings);
            }
            try {
                int size = strings.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.lengths[i10] = Long.parseLong(strings.get(i10));
                }
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + strings);
            }
        }

        public final void setLockingSourceCount$okhttp(int i10) {
            this.lockingSourceCount = i10;
        }

        public final void setReadable$okhttp(boolean z10) {
            this.readable = z10;
        }

        public final void setSequenceNumber$okhttp(long j10) {
            this.sequenceNumber = j10;
        }

        public final void setZombie$okhttp(boolean z10) {
            this.zombie = z10;
        }

        @Nullable
        public final Snapshot snapshot$okhttp() {
            boolean z10 = Util.assertionsEnabled;
            final DiskLruCache diskLruCache = this.f85730j;
            if (z10 && !Thread.holdsLock(diskLruCache)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
            }
            if (!this.readable) {
                return null;
            }
            if (!diskLruCache.H0 && (this.currentEditor != null || this.zombie)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.lengths.clone();
            try {
                int valueCount = diskLruCache.getValueCount();
                for (int i10 = 0; i10 < valueCount; i10++) {
                    final Source source = diskLruCache.getFileSystem().source((File) this.f85723c.get(i10));
                    if (!diskLruCache.H0) {
                        this.lockingSourceCount++;
                        source = new ForwardingSource(source) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1

                            /* JADX INFO: renamed from: q0, reason: collision with root package name */
                            public boolean f85731q0;

                            @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
                            public void close() throws IOException {
                                super.close();
                                if (this.f85731q0) {
                                    return;
                                }
                                this.f85731q0 = true;
                                DiskLruCache diskLruCache2 = diskLruCache;
                                DiskLruCache.Entry entry = this;
                                synchronized (diskLruCache2) {
                                    try {
                                        entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount() - 1);
                                        if (entry.getLockingSourceCount() == 0 && entry.getZombie()) {
                                            diskLruCache2.removeEntry$okhttp(entry);
                                        }
                                        Unit unit = Unit.INSTANCE;
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            }
                        };
                    }
                    arrayList.add(source);
                }
                return new Snapshot(this.f85730j, this.key, this.sequenceNumber, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Util.closeQuietly((Source) it.next());
                }
                try {
                    diskLruCache.removeEntry$okhttp(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void writeLengths$okhttp(@NotNull BufferedSink writer) throws IOException {
            Intrinsics.checkNotNullParameter(writer, "writer");
            for (long j10 : this.lengths) {
                writer.writeByte(32).writeDecimalLong(j10);
            }
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0006\u001a\b\u0018\u00010\u0004R\u00020\u0005J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "", "key", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "edit", "", FirebaseAnalytics.Param.INDEX, "Lokio/Source;", "getSource", "", "getLength", "", HearingDisabilitiesConstants.CLOSE_MODAL, "sequenceNumber", "", "sources", "", "lengths", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;JLjava/util/List;[J)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public final class Snapshot implements Closeable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final String f85734p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f85735q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        @NotNull
        public final List<Source> f85736r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        @NotNull
        public final long[] f85737s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ DiskLruCache f85738t0;

        /* JADX WARN: Multi-variable type inference failed */
        public Snapshot(@NotNull DiskLruCache diskLruCache, String key, @NotNull long j10, @NotNull List<? extends Source> sources, long[] lengths) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(sources, "sources");
            Intrinsics.checkNotNullParameter(lengths, "lengths");
            this.f85738t0 = diskLruCache;
            this.f85734p0 = key;
            this.f85735q0 = j10;
            this.f85736r0 = sources;
            this.f85737s0 = lengths;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<Source> it = this.f85736r0.iterator();
            while (it.hasNext()) {
                Util.closeQuietly(it.next());
            }
        }

        @Nullable
        public final Editor edit() throws IOException {
            return this.f85738t0.edit(this.f85734p0, this.f85735q0);
        }

        public final long getLength(int index) {
            return this.f85737s0[index];
        }

        @NotNull
        public final Source getSource(int index) {
            return this.f85736r0.get(index);
        }

        @NotNull
        /* JADX INFO: renamed from: key, reason: from getter */
        public final String getF85734p0() {
            return this.f85734p0;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.cache.DiskLruCache$snapshots$1, reason: invalid class name */
    /* JADX INFO: compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001J\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0002J\r\u0010\u0006\u001a\u00060\u0002R\u00020\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"okhttp3/internal/cache/DiskLruCache$snapshots$1", "", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "", "hasNext", "next", "", RemoveCommand.ID, "okhttp"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$snapshots$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1065:1\n1#2:1066\n*E\n"})
    public static final class AnonymousClass1 implements Iterator<Snapshot>, KMutableIterator {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final Iterator<Entry> f85740p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @Nullable
        public Snapshot f85741q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        @Nullable
        public Snapshot f85742r0;

        public AnonymousClass1() {
            Iterator<Entry> it = new ArrayList(DiskLruCache.this.getLruEntries$okhttp().values()).iterator();
            Intrinsics.checkNotNullExpressionValue(it, "ArrayList(lruEntries.values).iterator()");
            this.f85740p0 = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Snapshot snapshotSnapshot$okhttp;
            if (this.f85741q0 != null) {
                return true;
            }
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                if (diskLruCache.getClosed()) {
                    return false;
                }
                while (this.f85740p0.hasNext()) {
                    Entry next = this.f85740p0.next();
                    if (next != null && (snapshotSnapshot$okhttp = next.snapshot$okhttp()) != null) {
                        this.f85741q0 = snapshotSnapshot$okhttp;
                        return true;
                    }
                }
                Unit unit = Unit.INSTANCE;
                return false;
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            Snapshot snapshot = this.f85742r0;
            if (snapshot == null) {
                throw new IllegalStateException("remove() before next()".toString());
            }
            try {
                DiskLruCache.this.remove(snapshot.getF85734p0());
            } catch (IOException unused) {
            } finally {
                this.f85742r0 = null;
            }
        }

        @Override // java.util.Iterator
        @NotNull
        public Snapshot next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Snapshot snapshot = this.f85741q0;
            this.f85742r0 = snapshot;
            this.f85741q0 = null;
            Intrinsics.checkNotNull(snapshot);
            return snapshot;
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(@NotNull FileSystem fileSystem, @NotNull File directory, int i10, int i11, long j10, @NotNull TaskRunner taskRunner) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.fileSystem = fileSystem;
        this.directory = directory;
        this.f85708r0 = i10;
        this.valueCount = i11;
        this.maxSize = j10;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.N0 = taskRunner.newQueue();
        final String strF = d.f(new StringBuilder(), Util.okHttpName, " Cache");
        this.O0 = new Task(strF) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                DiskLruCache diskLruCache = this.f85739e;
                synchronized (diskLruCache) {
                    if (!diskLruCache.I0 || diskLruCache.getClosed()) {
                        return -1L;
                    }
                    try {
                        diskLruCache.trimToSize();
                    } catch (IOException unused) {
                        diskLruCache.K0 = true;
                    }
                    try {
                        if (diskLruCache.e()) {
                            diskLruCache.rebuildJournal$okhttp();
                            diskLruCache.F0 = 0;
                        }
                    } catch (IOException unused2) {
                        diskLruCache.L0 = true;
                        diskLruCache.f85714y0 = Okio.buffer(Okio.blackhole());
                    }
                    return -1L;
                }
            }
        };
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        this.f85711u0 = new File(directory, JOURNAL_FILE);
        this.v0 = new File(directory, JOURNAL_FILE_TEMP);
        this.f85712w0 = new File(directory, JOURNAL_FILE_BACKUP);
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j10);
    }

    public static void o(String str) {
        if (!LEGAL_KEY_PATTERN.matches(str)) {
            throw new IllegalArgumentException(a.a("keys must match regex [a-z0-9_-]{1,120}: \"", str, '\"').toString());
        }
    }

    public final synchronized void b() {
        if (!(!this.closed)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        Editor currentEditor;
        try {
            if (this.I0 && !this.closed) {
                Collection<Entry> collectionValues = this.lruEntries.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "lruEntries.values");
                for (Entry entry : (Entry[]) collectionValues.toArray(new Entry[0])) {
                    if (entry.getCurrentEditor() != null && (currentEditor = entry.getCurrentEditor()) != null) {
                        currentEditor.detach$okhttp();
                    }
                }
                trimToSize();
                BufferedSink bufferedSink = this.f85714y0;
                Intrinsics.checkNotNull(bufferedSink);
                bufferedSink.close();
                this.f85714y0 = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void completeEdit$okhttp(@NotNull Editor editor, boolean success) throws IOException {
        Intrinsics.checkNotNullParameter(editor, "editor");
        Entry entry = editor.getEntry();
        if (!Intrinsics.areEqual(entry.getCurrentEditor(), editor)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (success && !entry.getReadable()) {
            int i10 = this.valueCount;
            for (int i11 = 0; i11 < i10; i11++) {
                boolean[] written = editor.getWritten();
                Intrinsics.checkNotNull(written);
                if (!written[i11]) {
                    editor.abort();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                }
                if (!this.fileSystem.exists(entry.getDirtyFiles$okhttp().get(i11))) {
                    editor.abort();
                    return;
                }
            }
        }
        int i12 = this.valueCount;
        for (int i13 = 0; i13 < i12; i13++) {
            File file = entry.getDirtyFiles$okhttp().get(i13);
            if (!success || entry.getZombie()) {
                this.fileSystem.delete(file);
            } else if (this.fileSystem.exists(file)) {
                File file2 = entry.getCleanFiles$okhttp().get(i13);
                this.fileSystem.rename(file, file2);
                long j10 = entry.getLengths()[i13];
                long size = this.fileSystem.size(file2);
                entry.getLengths()[i13] = size;
                this.f85713x0 = (this.f85713x0 - j10) + size;
            }
        }
        entry.setCurrentEditor$okhttp(null);
        if (entry.getZombie()) {
            removeEntry$okhttp(entry);
            return;
        }
        this.F0++;
        BufferedSink bufferedSink = this.f85714y0;
        Intrinsics.checkNotNull(bufferedSink);
        if (entry.getReadable() || success) {
            entry.setReadable$okhttp(true);
            bufferedSink.writeUtf8(CLEAN).writeByte(32);
            bufferedSink.writeUtf8(entry.getKey());
            entry.writeLengths$okhttp(bufferedSink);
            bufferedSink.writeByte(10);
            if (success) {
                long j11 = this.M0;
                this.M0 = 1 + j11;
                entry.setSequenceNumber$okhttp(j11);
            }
        } else {
            this.lruEntries.remove(entry.getKey());
            bufferedSink.writeUtf8(REMOVE).writeByte(32);
            bufferedSink.writeUtf8(entry.getKey());
            bufferedSink.writeByte(10);
        }
        bufferedSink.flush();
        if (this.f85713x0 > this.maxSize || e()) {
            TaskQueue.schedule$default(this.N0, this.O0, 0L, 2, null);
        }
    }

    public final void delete() throws IOException {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    public final boolean e() {
        int i10 = this.F0;
        return i10 >= 2000 && i10 >= this.lruEntries.size();
    }

    @JvmOverloads
    @Nullable
    public final Editor edit(@NotNull String key) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        return edit$default(this, key, 0L, 2, null);
    }

    public final synchronized void evictAll() throws IOException {
        try {
            initialize();
            Collection<Entry> collectionValues = this.lruEntries.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "lruEntries.values");
            for (Entry entry : (Entry[]) collectionValues.toArray(new Entry[0])) {
                Intrinsics.checkNotNullExpressionValue(entry, "entry");
                removeEntry$okhttp(entry);
            }
            this.K0 = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.I0) {
            b();
            trimToSize();
            BufferedSink bufferedSink = this.f85714y0;
            Intrinsics.checkNotNull(bufferedSink);
            bufferedSink.flush();
        }
    }

    @Nullable
    public final synchronized Snapshot get(@NotNull String key) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        initialize();
        b();
        o(key);
        Entry entry = this.lruEntries.get(key);
        if (entry == null) {
            return null;
        }
        Snapshot snapshotSnapshot$okhttp = entry.snapshot$okhttp();
        if (snapshotSnapshot$okhttp == null) {
            return null;
        }
        this.F0++;
        BufferedSink bufferedSink = this.f85714y0;
        Intrinsics.checkNotNull(bufferedSink);
        bufferedSink.writeUtf8(READ).writeByte(32).writeUtf8(key).writeByte(10);
        if (e()) {
            TaskQueue.schedule$default(this.N0, this.O0, 0L, 2, null);
        }
        return snapshotSnapshot$okhttp;
    }

    /* JADX INFO: renamed from: getClosed$okhttp, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    @NotNull
    public final File getDirectory() {
        return this.directory;
    }

    @NotNull
    /* JADX INFO: renamed from: getFileSystem$okhttp, reason: from getter */
    public final FileSystem getFileSystem() {
        return this.fileSystem;
    }

    @NotNull
    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    /* JADX INFO: renamed from: getValueCount$okhttp, reason: from getter */
    public final int getValueCount() {
        return this.valueCount;
    }

    public final synchronized void initialize() throws IOException {
        try {
            if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.I0) {
                return;
            }
            if (this.fileSystem.exists(this.f85712w0)) {
                if (this.fileSystem.exists(this.f85711u0)) {
                    this.fileSystem.delete(this.f85712w0);
                } else {
                    this.fileSystem.rename(this.f85712w0, this.f85711u0);
                }
            }
            this.H0 = Util.isCivilized(this.fileSystem, this.f85712w0);
            if (this.fileSystem.exists(this.f85711u0)) {
                try {
                    m();
                    l();
                    this.I0 = true;
                    return;
                } catch (IOException e5) {
                    Platform.INSTANCE.get().log("DiskLruCache " + this.directory + " is corrupt: " + e5.getMessage() + ", removing", 5, e5);
                    try {
                        delete();
                        this.closed = false;
                        rebuildJournal$okhttp();
                        this.I0 = true;
                    } catch (Throwable th2) {
                        this.closed = false;
                        throw th2;
                    }
                }
            }
            rebuildJournal$okhttp();
            this.I0 = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    public final void l() throws IOException {
        File file = this.v0;
        FileSystem fileSystem = this.fileSystem;
        fileSystem.delete(file);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "i.next()");
            Entry entry = next;
            Editor currentEditor = entry.getCurrentEditor();
            int i10 = this.valueCount;
            int i11 = 0;
            if (currentEditor == null) {
                while (i11 < i10) {
                    this.f85713x0 += entry.getLengths()[i11];
                    i11++;
                }
            } else {
                entry.setCurrentEditor$okhttp(null);
                while (i11 < i10) {
                    fileSystem.delete(entry.getCleanFiles$okhttp().get(i11));
                    fileSystem.delete(entry.getDirtyFiles$okhttp().get(i11));
                    i11++;
                }
                it.remove();
            }
        }
    }

    public final void m() throws IOException {
        File file = this.f85711u0;
        FileSystem fileSystem = this.fileSystem;
        BufferedSource bufferedSourceBuffer = Okio.buffer(fileSystem.source(file));
        try {
            String utf8LineStrict = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict2 = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict3 = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict4 = bufferedSourceBuffer.readUtf8LineStrict();
            String utf8LineStrict5 = bufferedSourceBuffer.readUtf8LineStrict();
            if (!Intrinsics.areEqual(MAGIC, utf8LineStrict) || !Intrinsics.areEqual(VERSION_1, utf8LineStrict2) || !Intrinsics.areEqual(String.valueOf(this.f85708r0), utf8LineStrict3) || !Intrinsics.areEqual(String.valueOf(this.valueCount), utf8LineStrict4) || utf8LineStrict5.length() > 0) {
                throw new IOException("unexpected journal header: [" + utf8LineStrict + ", " + utf8LineStrict2 + ", " + utf8LineStrict4 + ", " + utf8LineStrict5 + AbstractJsonLexerKt.END_LIST);
            }
            int i10 = 0;
            while (true) {
                try {
                    n(bufferedSourceBuffer.readUtf8LineStrict());
                    i10++;
                } catch (EOFException unused) {
                    this.F0 = i10 - this.lruEntries.size();
                    if (bufferedSourceBuffer.exhausted()) {
                        this.f85714y0 = Okio.buffer(new FaultHidingSink(fileSystem.appendingSink(file), new am.a(this)));
                    } else {
                        rebuildJournal$okhttp();
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(bufferedSourceBuffer, null);
                    return;
                }
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(bufferedSourceBuffer, th2);
                throw th3;
            }
        }
    }

    public final void n(String str) throws IOException {
        String strSubstring;
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, ' ', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IOException(f.d("unexpected journal line: ", str));
        }
        int i10 = iIndexOf$default + 1;
        int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, ' ', i10, false, 4, (Object) null);
        LinkedHashMap<String, Entry> linkedHashMap = this.lruEntries;
        if (iIndexOf$default2 == -1) {
            strSubstring = str.substring(i10);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str2 = REMOVE;
            if (iIndexOf$default == str2.length() && l.startsWith$default(str, str2, false, 2, null)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf$default2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        Entry entry = linkedHashMap.get(strSubstring);
        if (entry == null) {
            entry = new Entry(this, strSubstring);
            linkedHashMap.put(strSubstring, entry);
        }
        if (iIndexOf$default2 != -1) {
            String str3 = CLEAN;
            if (iIndexOf$default == str3.length() && l.startsWith$default(str, str3, false, 2, null)) {
                String strSubstring2 = str.substring(iIndexOf$default2 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List<String> listSplit$default = StringsKt__StringsKt.split$default((CharSequence) strSubstring2, new char[]{' '}, false, 0, 6, (Object) null);
                entry.setReadable$okhttp(true);
                entry.setCurrentEditor$okhttp(null);
                entry.setLengths$okhttp(listSplit$default);
                return;
            }
        }
        if (iIndexOf$default2 == -1) {
            String str4 = DIRTY;
            if (iIndexOf$default == str4.length() && l.startsWith$default(str, str4, false, 2, null)) {
                entry.setCurrentEditor$okhttp(new Editor(this, entry));
                return;
            }
        }
        if (iIndexOf$default2 == -1) {
            String str5 = READ;
            if (iIndexOf$default == str5.length() && l.startsWith$default(str, str5, false, 2, null)) {
                return;
            }
        }
        throw new IOException(f.d("unexpected journal line: ", str));
    }

    public final synchronized void rebuildJournal$okhttp() throws IOException {
        try {
            BufferedSink bufferedSink = this.f85714y0;
            if (bufferedSink != null) {
                bufferedSink.close();
            }
            BufferedSink bufferedSinkBuffer = Okio.buffer(this.fileSystem.sink(this.v0));
            try {
                bufferedSinkBuffer.writeUtf8(MAGIC).writeByte(10);
                bufferedSinkBuffer.writeUtf8(VERSION_1).writeByte(10);
                bufferedSinkBuffer.writeDecimalLong(this.f85708r0).writeByte(10);
                bufferedSinkBuffer.writeDecimalLong(this.valueCount).writeByte(10);
                bufferedSinkBuffer.writeByte(10);
                for (Entry entry : this.lruEntries.values()) {
                    if (entry.getCurrentEditor() != null) {
                        bufferedSinkBuffer.writeUtf8(DIRTY).writeByte(32);
                        bufferedSinkBuffer.writeUtf8(entry.getKey());
                        bufferedSinkBuffer.writeByte(10);
                    } else {
                        bufferedSinkBuffer.writeUtf8(CLEAN).writeByte(32);
                        bufferedSinkBuffer.writeUtf8(entry.getKey());
                        entry.writeLengths$okhttp(bufferedSinkBuffer);
                        bufferedSinkBuffer.writeByte(10);
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(bufferedSinkBuffer, null);
                if (this.fileSystem.exists(this.f85711u0)) {
                    this.fileSystem.rename(this.f85711u0, this.f85712w0);
                }
                this.fileSystem.rename(this.v0, this.f85711u0);
                this.fileSystem.delete(this.f85712w0);
                this.f85714y0 = Okio.buffer(new FaultHidingSink(this.fileSystem.appendingSink(this.f85711u0), new am.a(this)));
                this.G0 = false;
                this.L0 = false;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(bufferedSinkBuffer, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final synchronized boolean remove(@NotNull String key) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        initialize();
        b();
        o(key);
        Entry entry = this.lruEntries.get(key);
        if (entry == null) {
            return false;
        }
        boolean zRemoveEntry$okhttp = removeEntry$okhttp(entry);
        if (zRemoveEntry$okhttp && this.f85713x0 <= this.maxSize) {
            this.K0 = false;
        }
        return zRemoveEntry$okhttp;
    }

    public final boolean removeEntry$okhttp(@NotNull Entry entry) throws IOException {
        BufferedSink bufferedSink;
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (!this.H0) {
            if (entry.getLockingSourceCount() > 0 && (bufferedSink = this.f85714y0) != null) {
                bufferedSink.writeUtf8(DIRTY);
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(entry.getKey());
                bufferedSink.writeByte(10);
                bufferedSink.flush();
            }
            if (entry.getLockingSourceCount() > 0 || entry.getCurrentEditor() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        Editor currentEditor = entry.getCurrentEditor();
        if (currentEditor != null) {
            currentEditor.detach$okhttp();
        }
        for (int i10 = 0; i10 < this.valueCount; i10++) {
            this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i10));
            this.f85713x0 -= entry.getLengths()[i10];
            entry.getLengths()[i10] = 0;
        }
        this.F0++;
        BufferedSink bufferedSink2 = this.f85714y0;
        if (bufferedSink2 != null) {
            bufferedSink2.writeUtf8(REMOVE);
            bufferedSink2.writeByte(32);
            bufferedSink2.writeUtf8(entry.getKey());
            bufferedSink2.writeByte(10);
        }
        this.lruEntries.remove(entry.getKey());
        if (e()) {
            TaskQueue.schedule$default(this.N0, this.O0, 0L, 2, null);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean z10) {
        this.closed = z10;
    }

    public final synchronized void setMaxSize(long j10) {
        this.maxSize = j10;
        if (this.I0) {
            TaskQueue.schedule$default(this.N0, this.O0, 0L, 2, null);
        }
    }

    public final synchronized long size() throws IOException {
        initialize();
        return this.f85713x0;
    }

    @NotNull
    public final synchronized Iterator<Snapshot> snapshots() throws IOException {
        initialize();
        return new AnonymousClass1();
    }

    public final void trimToSize() throws IOException {
        while (this.f85713x0 > this.maxSize) {
            for (Entry toEvict : this.lruEntries.values()) {
                if (!toEvict.getZombie()) {
                    Intrinsics.checkNotNullExpressionValue(toEvict, "toEvict");
                    removeEntry$okhttp(toEvict);
                }
            }
            return;
        }
        this.K0 = false;
    }

    @JvmOverloads
    @Nullable
    public final synchronized Editor edit(@NotNull String key, long expectedSequenceNumber) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        initialize();
        b();
        o(key);
        Entry entry = this.lruEntries.get(key);
        if (expectedSequenceNumber != ANY_SEQUENCE_NUMBER && (entry == null || entry.getSequenceNumber() != expectedSequenceNumber)) {
            return null;
        }
        if ((entry != null ? entry.getCurrentEditor() : null) != null) {
            return null;
        }
        if (entry != null && entry.getLockingSourceCount() != 0) {
            return null;
        }
        if (!this.K0 && !this.L0) {
            BufferedSink bufferedSink = this.f85714y0;
            Intrinsics.checkNotNull(bufferedSink);
            bufferedSink.writeUtf8(DIRTY).writeByte(32).writeUtf8(key).writeByte(10);
            bufferedSink.flush();
            if (this.G0) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(this, key);
                this.lruEntries.put(key, entry);
            }
            Editor editor = new Editor(this, entry);
            entry.setCurrentEditor$okhttp(editor);
            return editor;
        }
        TaskQueue.schedule$default(this.N0, this.O0, 0L, 2, null);
        return null;
    }
}
