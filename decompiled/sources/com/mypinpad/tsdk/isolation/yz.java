package com.mypinpad.tsdk.isolation;

import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.image.transform.ScaleToMaxSideTransformer;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.semaas.model.Properties;
import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0087\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b*\u00017\u0018\u00002\u00020\u00012\u00020\u0002:\u0004ghijB9\b\u0000\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u0010`\u001a\u00020/\u0012\u0006\u0010V\u001a\u00020\u0011\u0012\u0006\u0010d\u001a\u00020c¢\u0006\u0004\be\u0010fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0002J#\u0010\r\u001a\u00020\u00032\n\u0010\b\u001a\u00060\u0007R\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u000e\u001a\u00020\u0003J \u0010\u0013\u001a\b\u0018\u00010\u0007R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007J\u0006\u0010\u0014\u001a\u00020\u0003J\u0017\u0010\u0016\u001a\b\u0018\u00010\u0015R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0086\u0002J\u0006\u0010\u0017\u001a\u00020\u0003J\u0006\u0010\u0018\u001a\u00020\tJ\b\u0010\u0019\u001a\u00020\tH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u0003H\u0002J\b\u0010\u001d\u001a\u00020\u0003H\u0002J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J\u000f\u0010\"\u001a\u00020\u0003H\u0000¢\u0006\u0004\b \u0010!J\u000e\u0010#\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fJ\u001b\u0010(\u001a\u00020\t2\n\u0010%\u001a\u00060$R\u00020\u0000H\u0000¢\u0006\u0004\b&\u0010'J\b\u0010)\u001a\u00020\tH\u0002J\u0006\u0010*\u001a\u00020\u0011J\u0010\u0010,\u001a\f\u0012\b\u0012\u00060\u0015R\u00020\u00000+J\u0006\u0010-\u001a\u00020\u0003J\u0010\u0010.\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\"\u0010:\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u00103\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0017\u0010@\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010E\u001a\u00020D8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u00103R\u0016\u0010J\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u00103R\u0014\u0010K\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010AR\u0014\u0010L\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010AR\u0014\u0010M\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010AR\u0018\u0010N\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR*\u0010Q\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u00060$R\u00020\u00000P8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR*\u0010V\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\u00118F@FX\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u00103R\u0016\u0010]\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u00103R\u0016\u0010^\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010WR\u0016\u0010_\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u00101R\u0016\u0010*\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010WR\u001a\u0010`\u001a\u00020/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b`\u00101\u001a\u0004\ba\u0010b¨\u0006k"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "", "flush", HearingDisabilitiesConstants.CLOSE_MODAL, "checkNotClosed", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "editor", "", "success", "completeEdit$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;Z)V", "completeEdit", "delete", "", "key", "", "expectedSequenceNumber", "edit", "evictAll", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "get", "initialize", "isClosed", "journalRebuildRequired", "Lokio/BufferedSink;", "newJournalWriter", "processJournal", "readJournal", "line", "readJournalLine", "rebuildJournal$okhttp", "()V", "rebuildJournal", RemoveCommand.ID, "Lokhttp3/internal/cache/DiskLruCache$Entry;", "entry", "removeEntry$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Entry;)Z", "removeEntry", "removeOldestEntry", "size", "", "snapshots", "trimToSize", "validateKey", "", Properties.APP_VERSION, TransactionType.TRANSACTION_TYPE_DRSP_CODE, "civilizedFileSystem", "Z", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "okhttp3/internal/cache/DiskLruCache$cleanupTask$1", "cleanupTask", "Lokhttp3/internal/cache/DiskLruCache$cleanupTask$1;", "closed", "getClosed$okhttp", "()Z", "setClosed$okhttp", "(Z)V", "Ljava/io/File;", "directory", "Ljava/io/File;", "getDirectory", "()Ljava/io/File;", "Lokhttp3/internal/io/FileSystem;", "fileSystem", "Lokhttp3/internal/io/FileSystem;", "getFileSystem$okhttp", "()Lokhttp3/internal/io/FileSystem;", "hasJournalErrors", "initialized", "journalFile", "journalFileBackup", "journalFileTmp", "journalWriter", "Lokio/BufferedSink;", "Ljava/util/LinkedHashMap;", "lruEntries", "Ljava/util/LinkedHashMap;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "value", ScaleToMaxSideTransformer.SIDE, "J", "getMaxSize", "()J", "setMaxSize", "(J)V", "mostRecentRebuildFailed", "mostRecentTrimFailed", "nextSequenceNumber", "redundantOpCount", "valueCount", "getValueCount$okhttp", "()I", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(Lokhttp3/internal/io/FileSystem;Ljava/io/File;IIJLokhttp3/internal/concurrent/TaskRunner;)V", "Companion", "Editor", "Entry", "Snapshot", "okhttp"}, k = 1, mv = {1, 6, 0})
public final class yz implements Closeable, Flushable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static int f62237p0 = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f62238q0 = 1;

    @NotNull
    public static final setOnFocusChangeListener setOnFocusChangeListener = new setOnFocusChangeListener(null);

    @JvmField
    public static long setDividerPadding = -1;

    @JvmField
    @NotNull
    public static Regex setY = new Regex("[a-z0-9_-]{1,120}");

    @JvmField
    @NotNull
    public static String setCompoundDrawableTintBlendMode = "CLEAN";

    @JvmField
    @NotNull
    public static String setX = "DIRTY";

    @JvmField
    @NotNull
    public static String getNavBarTitleString = "REMOVE";

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\t\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\r\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/yz$setOnFocusChangeListener;", "", "", "setDividerPadding", "J", "", "setCompoundDrawableTintBlendMode", "Ljava/lang/String;", "setY", "setX", "setOnFocusChangeListener", "Lkotlin/text/Regex;", "Lkotlin/text/Regex;", "getNavBarTitleString", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class setOnFocusChangeListener {
        public setOnFocusChangeListener() {
        }

        public /* synthetic */ setOnFocusChangeListener(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final class setX implements Closeable {
        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~(i13 | i11);
            int i15 = ~(i13 | i12);
            int i16 = ((i14 | i15) * (-280)) + (i11 * (-139)) + (i10 * 141);
            int i17 = ~i11;
            int i18 = ((i15 | (~(i17 | i12))) * 140) + i16;
            int i19 = ~(i13 | i17 | i12);
            int i20 = ~i12;
            if ((((~(i10 | i20 | i17)) | (~(i11 | i13 | i20)) | i19) * 140) + i18 != 1) {
                ((setX) objArr[0]).getClass();
                throw null;
            }
            ((setX) objArr[0]).getClass();
            throw null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            setX(new Object[]{this}, -283502023, 283502023, System.identityHashCode(this));
        }

        @Nullable
        public final setY setCompoundDrawableTintBlendMode() throws IOException {
            return (setY) setX(new Object[]{this}, 2079872200, -2079872199, System.identityHashCode(this));
        }
    }

    public final class setY {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f62241a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f62242b = 1;

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * 517) + (i10 * (-515));
            int i14 = ~i11;
            int i15 = ~(i14 | i12);
            int i16 = ~i12;
            int i17 = i15 | (~(i16 | i10));
            int i18 = ~(i16 | i11);
            int i19 = ~i10;
            int i20 = (((~(i19 | i11)) | i18) * LibMCryptConstants.IND_HEX_SEGMENTO2) + (((~(i12 | i14 | i19)) | (~(i19 | i16 | i11))) * LibMCryptConstants.IND_HEX_SEGMENTO2) + ((i17 | i18) * (-516)) + i13;
            if (i20 == 1) {
                setY sety = (setY) objArr[0];
                int i21 = f62242b;
                int i22 = (((i21 | 52) << 1) - (i21 ^ 52)) - 1;
                f62241a = i22 % 128;
                int i23 = i22 % 2;
                sety.getClass();
                int i24 = f62242b;
                int i25 = (i24 & (-24)) | ((~i24) & 23);
                int i26 = (i24 & 23) << 1;
                int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                f62241a = i27 % 128;
                if (i27 % 2 != 0) {
                    throw null;
                }
            } else {
                if (i20 == 2) {
                    setY sety2 = (setY) objArr[0];
                    ((Number) objArr[1]).intValue();
                    sety2.getClass();
                    throw null;
                }
                if (i20 == 3) {
                    ((setY) objArr[0]).getClass();
                    throw null;
                }
                if (i20 == 4) {
                    ((setY) objArr[0]).getClass();
                    throw null;
                }
                setY sety3 = (setY) objArr[0];
                int i28 = f62241a;
                int i29 = (i28 ^ 59) + ((i28 & 59) << 1);
                f62242b = i29 % 128;
                int i30 = i29 % 2;
                sety3.getClass();
                if (i30 == 0) {
                    throw null;
                }
                int i31 = f62242b;
                int i32 = (((i31 | 64) << 1) - (i31 ^ 64)) - 1;
                f62241a = i32 % 128;
                if (i32 % 2 != 0) {
                    throw null;
                }
            }
            return null;
        }

        @NotNull
        public final setDividerPadding setDividerPadding() {
            return (setDividerPadding) setY(new Object[]{this}, -19127434, 19127434, System.identityHashCode(this));
        }

        public final void setX() throws IOException {
            setY(new Object[]{this}, -986154073, 986154076, System.identityHashCode(this));
        }

        @NotNull
        public final aco setX(int i10) {
            return (aco) setY(new Object[]{this, Integer.valueOf(i10)}, -162288408, 162288410, i10);
        }

        public final void setY() throws IOException {
            setY(new Object[]{this}, -1331329661, 1331329665, System.identityHashCode(this));
        }
    }

    static {
        int i10 = f62238q0 + 93;
        f62237p0 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ setY setCompoundDrawableTintBlendMode(yz yzVar, String str) throws IOException {
        return (setY) setOnFocusChangeListener(new Object[]{yzVar, str}, 1800879903, -1800879903, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws IOException {
        int i13 = ~i11;
        int i14 = ((i10 | i13) * (-988)) + (i11 * (-493)) + (i10 * 495);
        int i15 = ~i10;
        int i16 = ~i12;
        if ((((~(i10 | i11)) | (~(i16 | i11)) | (~(i13 | i15))) * 494) + ((i11 | i15 | i16) * 494) + i14 != 1) {
            yz yzVar = (yz) objArr[0];
            String str = (String) objArr[1];
            int i17 = f62238q0;
            int i18 = ((((i17 ^ 103) | (i17 & 103)) << 1) - (~(-(((~i17) & 103) | (i17 & (-104)))))) - 1;
            f62237p0 = i18 % 128;
            int i19 = i18 % 2;
            setY dividerPadding = yzVar.setDividerPadding(str);
            int i20 = f62237p0;
            int i21 = (i20 ^ 17) + ((i20 & 17) << 1);
            f62238q0 = i21 % 128;
            if (i21 % 2 != 0) {
                return dividerPadding;
            }
            throw null;
        }
        String str2 = (String) objArr[0];
        int i22 = f62237p0;
        int i23 = (i22 & (-20)) | ((~i22) & 19);
        int i24 = -(-((i22 & 19) << 1));
        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
        f62238q0 = i25 % 128;
        if (i25 % 2 == 0) {
            setY.matches(str2);
            throw null;
        }
        if (!setY.matches(str2)) {
            StringBuilder sb2 = new StringBuilder("keys must match regex [a-z0-9_-]{1,120}: \"");
            sb2.append(str2);
            sb2.append('\"');
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        int i26 = f62237p0;
        int i27 = i26 & 121;
        int i28 = (i26 | 121) & (~i27);
        int i29 = i27 << 1;
        int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
        f62238q0 = i30 % 128;
        if (i30 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final synchronized void b() throws IOException {
        try {
            int i10 = f62237p0;
            int i11 = i10 & 89;
            int i12 = -(-((i10 ^ 89) | i11));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            f62238q0 = i13 % 128;
            int i14 = i13 % 2;
            if (!(!yt.setOnFocusChangeListener)) {
                int i15 = f62237p0 + 111;
                f62238q0 = i15 % 128;
                int i16 = i15 % 2;
                if (!Thread.holdsLock(this)) {
                    StringBuilder sb2 = new StringBuilder("Thread ");
                    sb2.append((Object) Thread.currentThread().getName());
                    sb2.append(" MUST hold lock on ");
                    sb2.append(this);
                    throw new AssertionError(sb2.toString());
                }
            }
            throw new NullPointerException();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        int i10 = f62237p0;
        int i11 = (i10 & (-12)) | ((~i10) & 11);
        int i12 = -(-((i10 & 11) << 1));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        f62238q0 = i14;
        int i15 = i13 % 2;
        int i16 = i14 ^ 47;
        int i17 = ((i14 & 47) | i16) << 1;
        int i18 = -i16;
        int i19 = (i17 & i18) + (i17 | i18);
        f62237p0 = i19 % 128;
        if (i19 % 2 != 0) {
            throw null;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() throws IOException {
        int i10 = f62238q0;
        int i11 = ((i10 | 125) << 1) - (i10 ^ 125);
        f62237p0 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 12 / 0;
        }
    }

    @JvmOverloads
    @Nullable
    public final synchronized setY setDividerPadding(@NotNull String str) throws IOException {
        Intrinsics.checkNotNullParameter(str, "");
        b();
        throw null;
    }

    public final class setDividerPadding {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f62239a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f62240b = 1;

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (((~(i10 | i12)) | (~(i11 | (~i12)))) * 627) + (((~((~i11) | i12)) | i10) * (-627)) + ((i11 | i12 | (~i10)) * (-627)) + (i11 * 628) + (i10 * 628);
            if (i13 == 1) {
                setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
                int i14 = f62239a;
                int i15 = (i14 ^ 93) + ((i14 & 93) << 1);
                f62240b = i15 % 128;
                int i16 = i15 % 2;
                setdividerpadding.getClass();
                if (i16 != 0) {
                    return null;
                }
                throw null;
            }
            if (i13 != 2) {
                setDividerPadding setdividerpadding2 = (setDividerPadding) objArr[0];
                int i17 = f62240b;
                int i18 = i17 & 81;
                int i19 = (i17 ^ 81) | i18;
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                f62239a = i20 % 128;
                int i21 = i20 % 2;
                setdividerpadding2.getClass();
                if (i21 != 0) {
                    int i22 = 75 / 0;
                }
                return Boolean.FALSE;
            }
            setDividerPadding setdividerpadding3 = (setDividerPadding) objArr[0];
            int i23 = f62240b + 65;
            f62239a = i23 % 128;
            int i24 = i23 % 2;
            setdividerpadding3.getClass();
            if (i24 != 0) {
                int i25 = 41 / 0;
            }
            int i26 = f62240b;
            int i27 = ((i26 ^ 78) + ((i26 & 78) << 1)) - 1;
            f62239a = i27 % 128;
            if (i27 % 2 == 0) {
                return null;
            }
            throw null;
        }

        public final boolean setDividerPadding() {
            return ((Boolean) setY(new Object[]{this}, 1084092657, -1084092657, System.identityHashCode(this))).booleanValue();
        }

        @Nullable
        public final setY setOnFocusChangeListener() {
            return (setY) setY(new Object[]{this}, 547611001, -547610999, System.identityHashCode(this));
        }

        @NotNull
        public final List<File> setY() {
            return (List) setY(new Object[]{this}, 1140586170, -1140586169, System.identityHashCode(this));
        }
    }
}
