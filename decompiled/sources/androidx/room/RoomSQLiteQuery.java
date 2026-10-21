package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RoomSQLiteQuery.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0010\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u0002:\u000276J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\u000e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0000J\b\u0010\u0019\u001a\u00020\u0007H\u0016R\u001a\u0010\u001e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u0012\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u0012\u0004\b'\u0010#R\"\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u0012\u0004\b+\u0010#R\"\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u0012\u0004\b.\u0010#R$\u00102\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b0\u0010\u001b\u001a\u0004\b1\u0010\u001dR\u0014\u00105\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00068"}, d2 = {"Landroidx/room/RoomSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "", SearchIntents.EXTRA_QUERY, "", "initArgCount", "", "init", "release", "statement", "bindTo", FirebaseAnalytics.Param.INDEX, "bindNull", "", "value", "bindLong", "", "bindDouble", "bindString", "", "bindBlob", HearingDisabilitiesConstants.CLOSE_MODAL, "other", "copyArgumentsFrom", "clearBindings", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCapacity", "()I", "capacity", "", "longBindings", "[J", "getLongBindings$annotations", "()V", "", "doubleBindings", "[D", "getDoubleBindings$annotations", "", "stringBindings", "[Ljava/lang/String;", "getStringBindings$annotations", "blobBindings", "[[B", "getBlobBindings$annotations", "<set-?>", "s0", "getArgCount", "argCount", "getSql", "()Ljava/lang/String;", "sql", "Companion", "Binding", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class RoomSQLiteQuery implements SupportSQLiteQuery, SupportSQLiteProgram {
    public static final int DESIRED_POOL_SIZE = 10;
    public static final int POOL_LIMIT = 15;

    @JvmField
    @NotNull
    public final byte[][] blobBindings;

    @JvmField
    @NotNull
    public final double[] doubleBindings;

    @JvmField
    @NotNull
    public final long[] longBindings;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @VisibleForTesting
    public final int capacity;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public volatile String f23327q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final int[] f23328r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public int argCount;

    @JvmField
    @NotNull
    public final String[] stringBindings;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final TreeMap<Integer, RoomSQLiteQuery> queryPool = new TreeMap<>();

    /* JADX INFO: compiled from: RoomSQLiteQuery.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomSQLiteQuery$Binding;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface Binding {
    }

    public RoomSQLiteQuery(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this.capacity = i10;
        int i11 = i10 + 1;
        this.f23328r0 = new int[i11];
        this.longBindings = new long[i11];
        this.doubleBindings = new double[i11];
        this.stringBindings = new String[i11];
        this.blobBindings = new byte[i11][];
    }

    @JvmStatic
    @NotNull
    public static final RoomSQLiteQuery acquire(@NotNull String str, int i10) {
        return INSTANCE.acquire(str, i10);
    }

    @JvmStatic
    @NotNull
    public static final RoomSQLiteQuery copyFrom(@NotNull SupportSQLiteQuery supportSQLiteQuery) {
        return INSTANCE.copyFrom(supportSQLiteQuery);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int index, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f23328r0[index] = 5;
        this.blobBindings[index] = value;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int index, double value) {
        this.f23328r0[index] = 3;
        this.doubleBindings[index] = value;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int index, long value) {
        this.f23328r0[index] = 2;
        this.longBindings[index] = value;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int index) {
        this.f23328r0[index] = 1;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int index, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f23328r0[index] = 4;
        this.stringBindings[index] = value;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(@NotNull SupportSQLiteProgram statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        int argCount = getArgCount();
        if (1 > argCount) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.f23328r0[i10];
            if (i11 == 1) {
                statement.bindNull(i10);
            } else if (i11 == 2) {
                statement.bindLong(i10, this.longBindings[i10]);
            } else if (i11 == 3) {
                statement.bindDouble(i10, this.doubleBindings[i10]);
            } else if (i11 == 4) {
                String str = this.stringBindings[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                statement.bindString(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.blobBindings[i10];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                statement.bindBlob(i10, bArr);
            }
            if (i10 == argCount) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        Arrays.fill(this.f23328r0, 1);
        Arrays.fill(this.stringBindings, (Object) null);
        Arrays.fill(this.blobBindings, (Object) null);
        this.f23327q0 = null;
    }

    public final void copyArgumentsFrom(@NotNull RoomSQLiteQuery other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int argCount = other.getArgCount() + 1;
        System.arraycopy(other.f23328r0, 0, this.f23328r0, 0, argCount);
        System.arraycopy(other.longBindings, 0, this.longBindings, 0, argCount);
        System.arraycopy(other.stringBindings, 0, this.stringBindings, 0, argCount);
        System.arraycopy(other.blobBindings, 0, this.blobBindings, 0, argCount);
        System.arraycopy(other.doubleBindings, 0, this.doubleBindings, 0, argCount);
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public int getArgCount() {
        return this.argCount;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    @NotNull
    /* JADX INFO: renamed from: getSql */
    public String getF23480p0() {
        String str = this.f23327q0;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final void init(@NotNull String query, int initArgCount) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f23327q0 = query;
        this.argCount = initArgCount;
    }

    public final void release() {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = queryPool;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.capacity), this);
            INSTANCE.prunePoolLocked$room_runtime_release();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: RoomSQLiteQuery.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0007J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\r\u0010\u0018\u001a\u00020\u0019H\u0000¢\u0006\u0002\b\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0002¨\u0006\u001b"}, d2 = {"Landroidx/room/RoomSQLiteQuery$Companion;", "", "()V", "BLOB", "", "DESIRED_POOL_SIZE", "getDESIRED_POOL_SIZE$annotations", "DOUBLE", "LONG", VDVideoSelfieConfiguration.NULL, "POOL_LIMIT", "getPOOL_LIMIT$annotations", "STRING", "queryPool", "Ljava/util/TreeMap;", "Landroidx/room/RoomSQLiteQuery;", "getQueryPool$annotations", "acquire", SearchIntents.EXTRA_QUERY, "", "argumentCount", "copyFrom", "supportSQLiteQuery", "Landroidx/sqlite/db/SupportSQLiteQuery;", "prunePoolLocked", "", "prunePoolLocked$room_runtime_release", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final RoomSQLiteQuery acquire(@NotNull String query, int argumentCount) {
            Intrinsics.checkNotNullParameter(query, "query");
            TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.queryPool;
            synchronized (treeMap) {
                Map.Entry<Integer, RoomSQLiteQuery> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(argumentCount));
                if (entryCeilingEntry == null) {
                    Unit unit = Unit.INSTANCE;
                    RoomSQLiteQuery roomSQLiteQuery = new RoomSQLiteQuery(argumentCount, null);
                    roomSQLiteQuery.init(query, argumentCount);
                    return roomSQLiteQuery;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                RoomSQLiteQuery sqliteQuery = entryCeilingEntry.getValue();
                sqliteQuery.init(query, argumentCount);
                Intrinsics.checkNotNullExpressionValue(sqliteQuery, "sqliteQuery");
                return sqliteQuery;
            }
        }

        @JvmStatic
        @NotNull
        public final RoomSQLiteQuery copyFrom(@NotNull SupportSQLiteQuery supportSQLiteQuery) {
            Intrinsics.checkNotNullParameter(supportSQLiteQuery, "supportSQLiteQuery");
            final RoomSQLiteQuery roomSQLiteQueryAcquire = acquire(supportSQLiteQuery.getF23480p0(), supportSQLiteQuery.getArgCount());
            supportSQLiteQuery.bindTo(new SupportSQLiteProgram() { // from class: androidx.room.RoomSQLiteQuery$Companion$copyFrom$1
                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindBlob(int index, @NotNull byte[] value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    roomSQLiteQueryAcquire.bindBlob(index, value);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindDouble(int index, double value) {
                    roomSQLiteQueryAcquire.bindDouble(index, value);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindLong(int index, long value) {
                    roomSQLiteQueryAcquire.bindLong(index, value);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindNull(int index) {
                    roomSQLiteQueryAcquire.bindNull(index);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void bindString(int index, @NotNull String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    roomSQLiteQueryAcquire.bindString(index, value);
                }

                @Override // androidx.sqlite.db.SupportSQLiteProgram
                public void clearBindings() {
                    roomSQLiteQueryAcquire.clearBindings();
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    roomSQLiteQueryAcquire.close();
                }
            });
            return roomSQLiteQueryAcquire;
        }

        public final void prunePoolLocked$room_runtime_release() {
            TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.queryPool;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            Intrinsics.checkNotNullExpressionValue(it, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i10;
            }
        }

        @VisibleForTesting
        public static /* synthetic */ void getDESIRED_POOL_SIZE$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getPOOL_LIMIT$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getQueryPool$annotations() {
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getBlobBindings$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getDoubleBindings$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLongBindings$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getStringBindings$annotations() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
