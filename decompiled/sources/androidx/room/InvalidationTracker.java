package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.collection.k;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import bk.q;
import bk.v;
import bk.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InvalidationTracker.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 d2\u00020\u0001:\u0005defghBX\b\u0007\u0012\u0006\u0010\t\u001a\u000203\u0012\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f08\u0012\u001d\u0010`\u001a\u0019\u0012\u0004\u0012\u00020\u000f\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000f0^¢\u0006\u0002\b_08\u0012\u0012\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0$\"\u00020\u000f¢\u0006\u0004\ba\u0010bB%\b\u0017\u0012\u0006\u0010\t\u001a\u000203\u0012\u0012\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0$\"\u00020\u000f¢\u0006\u0004\ba\u0010cJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J\u000f\u0010!\u001a\u00020\u001eH\u0000¢\u0006\u0004\b\u001f\u0010 J\b\u0010\"\u001a\u00020\u0004H\u0016J\b\u0010#\u001a\u00020\u0004H\u0017J#\u0010&\u001a\u00020\u00042\u0012\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0$\"\u00020\u000fH\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b(\u0010\u000bJ\u000f\u0010)\u001a\u00020\u0004H\u0000¢\u0006\u0004\b(\u0010\u0017J;\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.\"\u0004\b\u0000\u0010*2\u000e\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0$2\u000e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000,H\u0017¢\u0006\u0004\b/\u00100JC\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.\"\u0004\b\u0000\u0010*2\u000e\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0$2\u0006\u00101\u001a\u00020\u001e2\u000e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000,H\u0017¢\u0006\u0004\b/\u00102R\u001a\u0010\t\u001a\u0002038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R&\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u000209088\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\"\u0010C\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010I\u001a\u00020D8GX\u0087\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR$\u0010Q\u001a\u0004\u0018\u00010J8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR&\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020S0R8\u0000X\u0081\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010Z\u001a\u00020Y8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010[\u0012\u0004\b\\\u0010\u0017¨\u0006i"}, d2 = {"Landroidx/room/InvalidationTracker;", "", "Landroidx/room/AutoCloser;", "autoCloser", "", "setAutoCloser$room_runtime_release", "(Landroidx/room/AutoCloser;)V", "setAutoCloser", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "internalInit$room_runtime_release", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "internalInit", "Landroid/content/Context;", "context", "", "name", "Landroid/content/Intent;", "serviceIntent", "startMultiInstanceInvalidation$room_runtime_release", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "startMultiInstanceInvalidation", "stopMultiInstanceInvalidation$room_runtime_release", "()V", "stopMultiInstanceInvalidation", "Landroidx/room/InvalidationTracker$Observer;", "observer", "addObserver", "addWeakObserver", "removeObserver", "", "ensureInitialization$room_runtime_release", "()Z", "ensureInitialization", "refreshVersionsAsync", "refreshVersionsSync", "", "tables", "notifyObserversByTableNames", "([Ljava/lang/String;)V", "syncTriggers$room_runtime_release", "syncTriggers", ExifInterface.GPS_DIRECTION_TRUE, "tableNames", "Ljava/util/concurrent/Callable;", "computeFunction", "Landroidx/lifecycle/LiveData;", "createLiveData", "([Ljava/lang/String;Ljava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", "inTransaction", "([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", "Landroidx/room/RoomDatabase;", "a", "Landroidx/room/RoomDatabase;", "getDatabase$room_runtime_release", "()Landroidx/room/RoomDatabase;", "", "", "d", "Ljava/util/Map;", "getTableIdLookup$room_runtime_release", "()Ljava/util/Map;", "tableIdLookup", "e", "[Ljava/lang/String;", "getTablesNames$room_runtime_release", "()[Ljava/lang/String;", "tablesNames", "Ljava/util/concurrent/atomic/AtomicBoolean;", "g", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getPendingRefresh", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingRefresh", "Landroidx/sqlite/db/SupportSQLiteStatement;", "i", "Landroidx/sqlite/db/SupportSQLiteStatement;", "getCleanupStatement$room_runtime_release", "()Landroidx/sqlite/db/SupportSQLiteStatement;", "setCleanupStatement$room_runtime_release", "(Landroidx/sqlite/db/SupportSQLiteStatement;)V", "cleanupStatement", "Landroidx/arch/core/internal/SafeIterableMap;", "Landroidx/room/InvalidationTracker$ObserverWrapper;", "l", "Landroidx/arch/core/internal/SafeIterableMap;", "getObserverMap$room_runtime_release", "()Landroidx/arch/core/internal/SafeIterableMap;", "observerMap", "Ljava/lang/Runnable;", "refreshRunnable", "Ljava/lang/Runnable;", "getRefreshRunnable$annotations", "shadowTablesMap", "", "Lkotlin/jvm/JvmSuppressWildcards;", "viewTables", "<init>", "(Landroidx/room/RoomDatabase;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V", "(Landroidx/room/RoomDatabase;[Ljava/lang/String;)V", "Companion", "ObservedTableTracker", "Observer", "ObserverWrapper", "WeakObserver", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,840:1\n215#2,2:841\n11335#3:843\n11670#3,3:844\n13579#3,2:847\n13579#3,2:849\n13674#3,3:855\n37#4,2:851\n1855#5,2:853\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker\n*L\n102#1:841,2\n250#1:843\n250#1:844,3\n271#1:847,2\n287#1:849,2\n491#1:855,3\n294#1:851,2\n467#1:853,2\n*E\n"})
public class InvalidationTracker {

    @NotNull
    public static final String RESET_UPDATED_TABLES_SQL = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1";

    @NotNull
    public static final String SELECT_UPDATED_TABLES_SQL = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final RoomDatabase database;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f23206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<String, Set<String>> f23207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f23208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String[] tablesNames;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public AutoCloser f23210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public final AtomicBoolean pendingRefresh;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f23212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public volatile SupportSQLiteStatement cleanupStatement;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ObservedTableTracker f23214j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final InvalidationLiveDataContainer f23215k;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @GuardedBy("observerMap")
    @NotNull
    public final SafeIterableMap<Observer, ObserverWrapper> observerMap;

    @Nullable
    public MultiInstanceInvalidationClient m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Object f23217n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Object f23218o;

    @JvmField
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public final Runnable refreshRunnable;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final String[] f23204p = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: compiled from: InvalidationTracker.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0011\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003J\u0012\u0010\u0007\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003J\u0006\u0010\t\u001a\u00020\bJ\n\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0007R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Landroidx/room/InvalidationTracker$ObservedTableTracker;", "", "", "", "tableIds", "", "onAdded", "onRemoved", "", "resetTriggerState", "getTablesToSync", "", "a", "[J", "getTableObservers", "()[J", "tableObservers", "d", "Z", "getNeedsSync", "()Z", "setNeedsSync", "(Z)V", "needsSync", "tableCount", "<init>", "(I)V", "Companion", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObservedTableTracker\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,840:1\n13600#2,2:841\n13600#2,2:843\n13684#2,3:845\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObservedTableTracker\n*L\n711#1:841,2\n729#1:843,2\n765#1:845,3\n*E\n"})
    public static final class ObservedTableTracker {
        public static final int ADD = 1;
        public static final int NO_OP = 0;
        public static final int REMOVE = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final long[] tableObservers;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final boolean[] f23220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final int[] f23221c;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public boolean needsSync;

        public ObservedTableTracker(int i10) {
            this.tableObservers = new long[i10];
            this.f23220b = new boolean[i10];
            this.f23221c = new int[i10];
        }

        public final boolean getNeedsSync() {
            return this.needsSync;
        }

        @NotNull
        public final long[] getTableObservers() {
            return this.tableObservers;
        }

        @VisibleForTesting
        @JvmName(name = "getTablesToSync")
        @Nullable
        public final int[] getTablesToSync() {
            synchronized (this) {
                try {
                    if (!this.needsSync) {
                        return null;
                    }
                    long[] jArr = this.tableObservers;
                    int length = jArr.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length) {
                        int i12 = i11 + 1;
                        int i13 = 1;
                        boolean z10 = jArr[i10] > 0;
                        boolean[] zArr = this.f23220b;
                        if (z10 != zArr[i11]) {
                            int[] iArr = this.f23221c;
                            if (!z10) {
                                i13 = 2;
                            }
                            iArr[i11] = i13;
                        } else {
                            this.f23221c[i11] = 0;
                        }
                        zArr[i11] = z10;
                        i10++;
                        i11 = i12;
                    }
                    this.needsSync = false;
                    return (int[]) this.f23221c.clone();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final boolean onAdded(@NotNull int... tableIds) {
            boolean z10;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z10 = false;
                    for (int i10 : tableIds) {
                        long[] jArr = this.tableObservers;
                        long j10 = jArr[i10];
                        jArr[i10] = 1 + j10;
                        if (j10 == 0) {
                            z10 = true;
                            this.needsSync = true;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z10;
        }

        public final boolean onRemoved(@NotNull int... tableIds) {
            boolean z10;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z10 = false;
                    for (int i10 : tableIds) {
                        long[] jArr = this.tableObservers;
                        long j10 = jArr[i10];
                        jArr[i10] = j10 - 1;
                        if (j10 == 1) {
                            z10 = true;
                            this.needsSync = true;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z10;
        }

        public final void resetTriggerState() {
            synchronized (this) {
                Arrays.fill(this.f23220b, false);
                this.needsSync = true;
                Unit unit = Unit.INSTANCE;
            }
        }

        public final void setNeedsSync(boolean z10) {
            this.needsSync = z10;
        }
    }

    /* JADX INFO: compiled from: InvalidationTracker.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0007¢\u0006\u0004\b\u0010\u0010\u0011B%\b\u0014\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0007\"\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0014J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&R\"\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Landroidx/room/InvalidationTracker$Observer;", "", "", "", "tables", "", "onInvalidated", "", "a", "[Ljava/lang/String;", "getTables$room_runtime_release", "()[Ljava/lang/String;", "", "isRemote$room_runtime_release", "()Z", "isRemote", "<init>", "([Ljava/lang/String;)V", "firstTable", "rest", "(Ljava/lang/String;[Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$Observer\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,840:1\n37#2,2:841\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$Observer\n*L\n670#1:841,2\n*E\n"})
    public static abstract class Observer {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String[] tables;

        public Observer(@NotNull String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            this.tables = tables;
        }

        @NotNull
        /* JADX INFO: renamed from: getTables$room_runtime_release, reason: from getter */
        public final String[] getTables() {
            return this.tables;
        }

        public boolean isRemote$room_runtime_release() {
            return false;
        }

        public abstract void onInvalidated(@NotNull Set<String> tables);

        /* JADX WARN: Illegal instructions before constructor call */
        public Observer(@NotNull String firstTable, @NotNull String... rest) {
            Intrinsics.checkNotNullParameter(firstTable, "firstTable");
            Intrinsics.checkNotNullParameter(rest, "rest");
            List listCreateListBuilder = bk.d.createListBuilder();
            bk.g.addAll(listCreateListBuilder, rest);
            listCreateListBuilder.add(firstTable);
            this((String[]) bk.d.build(listCreateListBuilder).toArray(new String[0]));
        }
    }

    /* JADX INFO: compiled from: InvalidationTracker.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\b\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000e\u001a\u00020\u00052\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Landroidx/room/InvalidationTracker$ObserverWrapper;", "", "", "", "invalidatedTablesIds", "", "notifyByTableInvalidStatus$room_runtime_release", "(Ljava/util/Set;)V", "notifyByTableInvalidStatus", "", "", "tables", "notifyByTableNames$room_runtime_release", "([Ljava/lang/String;)V", "notifyByTableNames", "Landroidx/room/InvalidationTracker$Observer;", "a", "Landroidx/room/InvalidationTracker$Observer;", "getObserver$room_runtime_release", "()Landroidx/room/InvalidationTracker$Observer;", "observer", "", "b", "[I", "getTableIds$room_runtime_release", "()[I", "tableIds", "tableNames", "<init>", "(Landroidx/room/InvalidationTracker$Observer;[I[Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObserverWrapper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,840:1\n13674#2,3:841\n12744#2,2:844\n13579#2:846\n13579#2,2:847\n13580#2:849\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObserverWrapper\n*L\n612#1:841,3\n634#1:844,2\n640#1:846\n641#1:847,2\n640#1:849\n*E\n"})
    public static final class ObserverWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Observer observer;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final int[] tableIds;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String[] f23226c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Set<String> f23227d;

        public ObserverWrapper(@NotNull Observer observer, @NotNull int[] tableIds, @NotNull String[] tableNames) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            Intrinsics.checkNotNullParameter(tableNames, "tableNames");
            this.observer = observer;
            this.tableIds = tableIds;
            this.f23226c = tableNames;
            this.f23227d = (tableNames.length == 0) ^ true ? v.setOf(tableNames[0]) : w.emptySet();
            if (tableIds.length != tableNames.length) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        @NotNull
        /* JADX INFO: renamed from: getObserver$room_runtime_release, reason: from getter */
        public final Observer getObserver() {
            return this.observer;
        }

        @NotNull
        /* JADX INFO: renamed from: getTableIds$room_runtime_release, reason: from getter */
        public final int[] getTableIds() {
            return this.tableIds;
        }

        public final void notifyByTableInvalidStatus$room_runtime_release(@NotNull Set<Integer> invalidatedTablesIds) {
            Set<String> setEmptySet;
            Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.tableIds;
            int length = iArr.length;
            if (length != 0) {
                int i10 = 0;
                if (length != 1) {
                    Set setCreateSetBuilder = v.createSetBuilder();
                    int length2 = iArr.length;
                    int i11 = 0;
                    while (i10 < length2) {
                        int i12 = i11 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr[i10]))) {
                            setCreateSetBuilder.add(this.f23226c[i11]);
                        }
                        i10++;
                        i11 = i12;
                    }
                    setEmptySet = v.build(setCreateSetBuilder);
                } else {
                    setEmptySet = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.f23227d : w.emptySet();
                }
            } else {
                setEmptySet = w.emptySet();
            }
            if (!setEmptySet.isEmpty()) {
                this.observer.onInvalidated(setEmptySet);
            }
        }

        public final void notifyByTableNames$room_runtime_release(@NotNull String[] tables) {
            Set<String> setEmptySet;
            Intrinsics.checkNotNullParameter(tables, "tables");
            String[] strArr = this.f23226c;
            int length = strArr.length;
            if (length == 0) {
                setEmptySet = w.emptySet();
            } else if (length == 1) {
                int length2 = tables.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        setEmptySet = w.emptySet();
                        break;
                    } else {
                        if (l.equals(tables[i10], strArr[0], true)) {
                            setEmptySet = this.f23227d;
                            break;
                        }
                        i10++;
                    }
                }
            } else {
                Set setCreateSetBuilder = v.createSetBuilder();
                for (String str : tables) {
                    for (String str2 : strArr) {
                        if (l.equals(str2, str, true)) {
                            setCreateSetBuilder.add(str2);
                        }
                    }
                }
                setEmptySet = v.build(setCreateSetBuilder);
            }
            if (!setEmptySet.isEmpty()) {
                this.observer.onInvalidated(setEmptySet);
            }
        }
    }

    /* JADX INFO: compiled from: InvalidationTracker.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Landroidx/room/InvalidationTracker$WeakObserver;", "Landroidx/room/InvalidationTracker$Observer;", "", "", "tables", "", "onInvalidated", "Landroidx/room/InvalidationTracker;", "b", "Landroidx/room/InvalidationTracker;", "getTracker", "()Landroidx/room/InvalidationTracker;", "tracker", "Ljava/lang/ref/WeakReference;", "c", "Ljava/lang/ref/WeakReference;", "getDelegateRef", "()Ljava/lang/ref/WeakReference;", "delegateRef", "delegate", "<init>", "(Landroidx/room/InvalidationTracker;Landroidx/room/InvalidationTracker$Observer;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
    public static final class WeakObserver extends Observer {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final InvalidationTracker tracker;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final WeakReference<Observer> delegateRef;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WeakObserver(@NotNull InvalidationTracker tracker, @NotNull Observer delegate) {
            super(delegate.getTables());
            Intrinsics.checkNotNullParameter(tracker, "tracker");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.tracker = tracker;
            this.delegateRef = new WeakReference<>(delegate);
        }

        @NotNull
        public final WeakReference<Observer> getDelegateRef() {
            return this.delegateRef;
        }

        @NotNull
        public final InvalidationTracker getTracker() {
            return this.tracker;
        }

        @Override // androidx.room.InvalidationTracker.Observer
        public void onInvalidated(@NotNull Set<String> tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            Observer observer = this.delegateRef.get();
            if (observer == null) {
                this.tracker.removeObserver(this);
            } else {
                observer.onInvalidated(tables);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public InvalidationTracker(@NotNull RoomDatabase database, @NotNull Map<String, String> shadowTablesMap, @NotNull Map<String, Set<String>> viewTables, @NotNull String... tableNames) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.database = database;
        this.f23206b = shadowTablesMap;
        this.f23207c = viewTables;
        this.pendingRefresh = new AtomicBoolean(false);
        this.f23214j = new ObservedTableTracker(tableNames.length);
        this.f23215k = new InvalidationLiveDataContainer(database);
        this.observerMap = new SafeIterableMap<>();
        this.f23217n = new Object();
        this.f23218o = new Object();
        this.f23208d = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = tableNames[i10];
            Locale locale = Locale.US;
            String strD = a.d(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
            this.f23208d.put(strD, Integer.valueOf(i10));
            String str2 = this.f23206b.get(tableNames[i10]);
            String strD2 = str2 != null ? a.d(locale, "US", str2, locale, "this as java.lang.String).toLowerCase(locale)") : null;
            if (strD2 != null) {
                strD = strD2;
            }
            strArr[i10] = strD;
        }
        this.tablesNames = strArr;
        for (Map.Entry<String, String> entry : this.f23206b.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.US;
            String strD3 = a.d(locale2, "US", value, locale2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f23208d.containsKey(strD3)) {
                String strD4 = a.d(locale2, "US", entry.getKey(), locale2, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f23208d;
                linkedHashMap.put(strD4, q.getValue(linkedHashMap, strD3));
            }
        }
        this.refreshRunnable = new Runnable() { // from class: androidx.room.InvalidationTracker$refreshRunnable$1
            public final Set<Integer> a() {
                Set setCreateSetBuilder = v.createSetBuilder();
                InvalidationTracker invalidationTracker = this.f23230p0;
                Cursor cursorQuery$default = RoomDatabase.query$default(invalidationTracker.getDatabase(), new SimpleSQLiteQuery(InvalidationTracker.SELECT_UPDATED_TABLES_SQL), null, 2, null);
                while (cursorQuery$default.moveToNext()) {
                    try {
                        setCreateSetBuilder.add(Integer.valueOf(cursorQuery$default.getInt(0)));
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            CloseableKt.closeFinally(cursorQuery$default, th2);
                            throw th3;
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursorQuery$default, null);
                Set<Integer> setBuild = v.build(setCreateSetBuilder);
                if (!setBuild.isEmpty()) {
                    if (invalidationTracker.getCleanupStatement() == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    SupportSQLiteStatement cleanupStatement = invalidationTracker.getCleanupStatement();
                    if (cleanupStatement == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    cleanupStatement.executeUpdateDelete();
                }
                return setBuild;
            }

            @Override // java.lang.Runnable
            public void run() {
                Set<Integer> setEmptySet;
                AutoCloser autoCloser;
                Lock closeLock$room_runtime_release = this.f23230p0.getDatabase().getCloseLock$room_runtime_release();
                closeLock$room_runtime_release.lock();
                try {
                    try {
                        try {
                            if (!this.f23230p0.ensureInitialization$room_runtime_release()) {
                                closeLock$room_runtime_release.unlock();
                                AutoCloser autoCloser2 = this.f23230p0.f23210f;
                                if (autoCloser2 != null) {
                                    autoCloser2.decrementCountAndScheduleClose();
                                    return;
                                }
                                return;
                            }
                            if (!this.f23230p0.getPendingRefresh().compareAndSet(true, false)) {
                                closeLock$room_runtime_release.unlock();
                                AutoCloser autoCloser3 = this.f23230p0.f23210f;
                                if (autoCloser3 != null) {
                                    autoCloser3.decrementCountAndScheduleClose();
                                    return;
                                }
                                return;
                            }
                            if (this.f23230p0.getDatabase().inTransaction()) {
                                closeLock$room_runtime_release.unlock();
                                AutoCloser autoCloser4 = this.f23230p0.f23210f;
                                if (autoCloser4 != null) {
                                    autoCloser4.decrementCountAndScheduleClose();
                                    return;
                                }
                                return;
                            }
                            SupportSQLiteDatabase writableDatabase = this.f23230p0.getDatabase().getOpenHelper().getWritableDatabase();
                            writableDatabase.beginTransactionNonExclusive();
                            try {
                                setEmptySet = a();
                                writableDatabase.setTransactionSuccessful();
                                writableDatabase.endTransaction();
                                closeLock$room_runtime_release.unlock();
                                autoCloser = this.f23230p0.f23210f;
                                if (autoCloser != null) {
                                    autoCloser.decrementCountAndScheduleClose();
                                }
                                if (!setEmptySet.isEmpty()) {
                                    SafeIterableMap<InvalidationTracker.Observer, InvalidationTracker.ObserverWrapper> observerMap$room_runtime_release = this.f23230p0.getObserverMap$room_runtime_release();
                                    InvalidationTracker invalidationTracker = this.f23230p0;
                                    synchronized (observerMap$room_runtime_release) {
                                        try {
                                            Iterator<Map.Entry<K, V>> it = invalidationTracker.getObserverMap$room_runtime_release().iterator();
                                            while (it.hasNext()) {
                                                ((InvalidationTracker.ObserverWrapper) ((Map.Entry) it.next()).getValue()).notifyByTableInvalidStatus$room_runtime_release(setEmptySet);
                                            }
                                            Unit unit = Unit.INSTANCE;
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                writableDatabase.endTransaction();
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            closeLock$room_runtime_release.unlock();
                            AutoCloser autoCloser5 = this.f23230p0.f23210f;
                            if (autoCloser5 != null) {
                                autoCloser5.decrementCountAndScheduleClose();
                            }
                            throw th4;
                        }
                    } catch (IllegalStateException unused) {
                        setEmptySet = w.emptySet();
                        closeLock$room_runtime_release.unlock();
                        autoCloser = this.f23230p0.f23210f;
                        if (autoCloser != null) {
                        }
                    }
                } catch (SQLiteException unused2) {
                    setEmptySet = w.emptySet();
                    closeLock$room_runtime_release.unlock();
                    autoCloser = this.f23230p0.f23210f;
                    if (autoCloser != null) {
                    }
                }
            }
        };
    }

    public final String[] a(String[] strArr) {
        Set setCreateSetBuilder = v.createSetBuilder();
        for (String str : strArr) {
            Locale locale = Locale.US;
            String strD = a.d(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
            Map<String, Set<String>> map = this.f23207c;
            if (map.containsKey(strD)) {
                Set<String> set = map.get(a.d(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)"));
                Intrinsics.checkNotNull(set);
                setCreateSetBuilder.addAll(set);
            } else {
                setCreateSetBuilder.add(str);
            }
        }
        return (String[]) v.build(setCreateSetBuilder).toArray(new String[0]);
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    public void addObserver(@NotNull Observer observer) {
        ObserverWrapper observerWrapperPutIfAbsent;
        Intrinsics.checkNotNullParameter(observer, "observer");
        String[] strArrA = a(observer.getTables());
        ArrayList arrayList = new ArrayList(strArrA.length);
        for (String str : strArrA) {
            LinkedHashMap linkedHashMap = this.f23208d;
            Locale locale = Locale.US;
            Integer num = (Integer) linkedHashMap.get(a.d(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)"));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str));
            }
            arrayList.add(Integer.valueOf(num.intValue()));
        }
        int[] intArray = CollectionsKt___CollectionsKt.toIntArray(arrayList);
        ObserverWrapper observerWrapper = new ObserverWrapper(observer, intArray, strArrA);
        synchronized (this.observerMap) {
            observerWrapperPutIfAbsent = this.observerMap.putIfAbsent(observer, observerWrapper);
        }
        if (observerWrapperPutIfAbsent == null && this.f23214j.onAdded(Arrays.copyOf(intArray, intArray.length))) {
            syncTriggers$room_runtime_release();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void addWeakObserver(@NotNull Observer observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        addObserver(new WeakObserver(this, observer));
    }

    public final void b(SupportSQLiteDatabase supportSQLiteDatabase, int i10) {
        supportSQLiteDatabase.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.tablesNames[i10];
        for (String str2 : f23204p) {
            StringBuilder sb2 = new StringBuilder("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb2.append(INSTANCE.getTriggerName$room_runtime_release(str, str2));
            sb2.append(" AFTER ");
            k.e(sb2, str2, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
            sb2.append(i10);
            sb2.append(" AND invalidated = 0; END");
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            supportSQLiteDatabase.execSQL(string);
        }
    }

    public final void c(SupportSQLiteDatabase supportSQLiteDatabase, int i10) {
        String str = this.tablesNames[i10];
        for (String str2 : f23204p) {
            String str3 = "DROP TRIGGER IF EXISTS " + INSTANCE.getTriggerName$room_runtime_release(str, str2);
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            supportSQLiteDatabase.execSQL(str3);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public <T> LiveData<T> createLiveData(@NotNull String[] tableNames, boolean inTransaction, @NotNull Callable<T> computeFunction) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        String[] strArrA = a(tableNames);
        for (String str : strArrA) {
            LinkedHashMap linkedHashMap = this.f23208d;
            Locale locale = Locale.US;
            if (!linkedHashMap.containsKey(a.d(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)"))) {
                throw new IllegalArgumentException("There is no table with name ".concat(str).toString());
            }
        }
        return this.f23215k.create(strArrA, inTransaction, computeFunction);
    }

    public final boolean ensureInitialization$room_runtime_release() {
        if (!this.database.isOpenInternal()) {
            return false;
        }
        if (!this.f23212h) {
            this.database.getOpenHelper().getWritableDatabase();
        }
        return this.f23212h;
    }

    @Nullable
    /* JADX INFO: renamed from: getCleanupStatement$room_runtime_release, reason: from getter */
    public final SupportSQLiteStatement getCleanupStatement() {
        return this.cleanupStatement;
    }

    @NotNull
    /* JADX INFO: renamed from: getDatabase$room_runtime_release, reason: from getter */
    public final RoomDatabase getDatabase() {
        return this.database;
    }

    @NotNull
    public final SafeIterableMap<Observer, ObserverWrapper> getObserverMap$room_runtime_release() {
        return this.observerMap;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public final AtomicBoolean getPendingRefresh() {
        return this.pendingRefresh;
    }

    @NotNull
    public final Map<String, Integer> getTableIdLookup$room_runtime_release() {
        return this.f23208d;
    }

    @NotNull
    /* JADX INFO: renamed from: getTablesNames$room_runtime_release, reason: from getter */
    public final String[] getTablesNames() {
        return this.tablesNames;
    }

    public final void internalInit$room_runtime_release(@NotNull SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        synchronized (this.f23218o) {
            if (this.f23212h) {
                return;
            }
            database.execSQL("PRAGMA temp_store = MEMORY;");
            database.execSQL("PRAGMA recursive_triggers='ON';");
            database.execSQL("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            syncTriggers$room_runtime_release(database);
            this.cleanupStatement = database.compileStatement(RESET_UPDATED_TABLES_SQL);
            this.f23212h = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void notifyObserversByTableNames(@NotNull String... tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        synchronized (this.observerMap) {
            try {
                Iterator<Map.Entry<K, V>> it = this.observerMap.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Intrinsics.checkNotNullExpressionValue(entry, "(observer, wrapper)");
                    Observer observer = (Observer) entry.getKey();
                    ObserverWrapper observerWrapper = (ObserverWrapper) entry.getValue();
                    if (!observer.isRemote$room_runtime_release()) {
                        observerWrapper.notifyByTableNames$room_runtime_release(tables);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void refreshVersionsAsync() {
        if (this.pendingRefresh.compareAndSet(false, true)) {
            AutoCloser autoCloser = this.f23210f;
            if (autoCloser != null) {
                autoCloser.incrementCountAndEnsureDbIsOpen();
            }
            this.database.getQueryExecutor().execute(this.refreshRunnable);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @WorkerThread
    public void refreshVersionsSync() {
        AutoCloser autoCloser = this.f23210f;
        if (autoCloser != null) {
            autoCloser.incrementCountAndEnsureDbIsOpen();
        }
        syncTriggers$room_runtime_release();
        this.refreshRunnable.run();
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    public void removeObserver(@NotNull Observer observer) {
        ObserverWrapper observerWrapperRemove;
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.observerMap) {
            observerWrapperRemove = this.observerMap.remove(observer);
        }
        if (observerWrapperRemove != null) {
            ObservedTableTracker observedTableTracker = this.f23214j;
            int[] tableIds = observerWrapperRemove.getTableIds();
            if (observedTableTracker.onRemoved(Arrays.copyOf(tableIds, tableIds.length))) {
                syncTriggers$room_runtime_release();
            }
        }
    }

    public final void setAutoCloser$room_runtime_release(@NotNull AutoCloser autoCloser) {
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.f23210f = autoCloser;
        autoCloser.setAutoCloseCallback(new androidx.core.app.a(this, 1));
    }

    public final void setCleanupStatement$room_runtime_release(@Nullable SupportSQLiteStatement supportSQLiteStatement) {
        this.cleanupStatement = supportSQLiteStatement;
    }

    public final void startMultiInstanceInvalidation$room_runtime_release(@NotNull Context context, @NotNull String name, @NotNull Intent serviceIntent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        this.m = new MultiInstanceInvalidationClient(context, name, serviceIntent, this, this.database.getQueryExecutor());
    }

    public final void stopMultiInstanceInvalidation$room_runtime_release() {
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.m;
        if (multiInstanceInvalidationClient != null) {
            multiInstanceInvalidationClient.stop();
        }
        this.m = null;
    }

    public final void syncTriggers$room_runtime_release(@NotNull SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        if (database.inTransaction()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.database.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                synchronized (this.f23217n) {
                    int[] tablesToSync = this.f23214j.getTablesToSync();
                    if (tablesToSync == null) {
                        closeLock$room_runtime_release.unlock();
                        return;
                    }
                    INSTANCE.beginTransactionInternal$room_runtime_release(database);
                    try {
                        int length = tablesToSync.length;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < length) {
                            int i12 = tablesToSync[i10];
                            int i13 = i11 + 1;
                            if (i12 == 1) {
                                b(database, i11);
                            } else if (i12 == 2) {
                                c(database, i11);
                            }
                            i10++;
                            i11 = i13;
                        }
                        database.setTransactionSuccessful();
                        database.endTransaction();
                        Unit unit = Unit.INSTANCE;
                        closeLock$room_runtime_release.unlock();
                    } catch (Throwable th2) {
                        database.endTransaction();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                closeLock$room_runtime_release.unlock();
                throw th3;
            }
        } catch (SQLiteException | IllegalStateException unused) {
        }
    }

    @Deprecated(message = "Use [createLiveData(String[], boolean, Callable)]")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public <T> LiveData<T> createLiveData(@NotNull String[] tableNames, @NotNull Callable<T> computeFunction) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        return createLiveData(tableNames, false, computeFunction);
    }

    public final void syncTriggers$room_runtime_release() {
        RoomDatabase roomDatabase = this.database;
        if (roomDatabase.isOpenInternal()) {
            syncTriggers$room_runtime_release(roomDatabase.getOpenHelper().getWritableDatabase());
        }
    }

    /* JADX INFO: compiled from: InvalidationTracker.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013J\u001d\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0016\u0010\b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Landroidx/room/InvalidationTracker$Companion;", "", "()V", "CREATE_TRACKING_TABLE_SQL", "", "INVALIDATED_COLUMN_NAME", "RESET_UPDATED_TABLES_SQL", "getRESET_UPDATED_TABLES_SQL$room_runtime_release$annotations", "SELECT_UPDATED_TABLES_SQL", "getSELECT_UPDATED_TABLES_SQL$room_runtime_release$annotations", "TABLE_ID_COLUMN_NAME", "TRIGGERS", "", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "beginTransactionInternal", "", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "beginTransactionInternal$room_runtime_release", "getTriggerName", "tableName", "triggerType", "getTriggerName$room_runtime_release", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void beginTransactionInternal$room_runtime_release(@NotNull SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            if (database.isWriteAheadLoggingEnabled()) {
                database.beginTransactionNonExclusive();
            } else {
                database.beginTransaction();
            }
        }

        @NotNull
        public final String getTriggerName$room_runtime_release(@NotNull String tableName, @NotNull String triggerType) {
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            Intrinsics.checkNotNullParameter(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }

        @VisibleForTesting
        public static /* synthetic */ void getRESET_UPDATED_TABLES_SQL$room_runtime_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getSELECT_UPDATED_TABLES_SQL$room_runtime_release$annotations() {
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getRefreshRunnable$annotations() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public InvalidationTracker(@NotNull RoomDatabase database, @NotNull String... tableNames) {
        this(database, q.emptyMap(), q.emptyMap(), (String[]) Arrays.copyOf(tableNames, tableNames.length));
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
    }
}
