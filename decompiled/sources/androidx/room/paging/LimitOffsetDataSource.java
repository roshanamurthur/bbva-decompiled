package androidx.room.paging;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.paging.PositionalDataSource;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class LimitOffsetDataSource<T> extends PositionalDataSource<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomSQLiteQuery f23385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RoomDatabase f23388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f23389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f23390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f23391g;

    public class a extends InvalidationTracker.Observer {
        public a(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.InvalidationTracker.Observer
        public final void onInvalidated(@NonNull Set<String> set) {
            LimitOffsetDataSource.this.invalidate();
        }
    }

    public LimitOffsetDataSource(@NonNull RoomDatabase roomDatabase, @NonNull SupportSQLiteQuery supportSQLiteQuery, boolean z10, @NonNull String... strArr) {
        this(roomDatabase, RoomSQLiteQuery.copyFrom(supportSQLiteQuery), z10, strArr);
    }

    public final RoomSQLiteQuery a(int i10, int i11) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(this.f23387c, this.f23385a.getArgCount() + 2);
        roomSQLiteQueryAcquire.copyArgumentsFrom(this.f23385a);
        roomSQLiteQueryAcquire.bindLong(roomSQLiteQueryAcquire.getArgCount() - 1, i11);
        roomSQLiteQueryAcquire.bindLong(roomSQLiteQueryAcquire.getArgCount(), i10);
        return roomSQLiteQueryAcquire;
    }

    public final void b() {
        if (this.f23391g.compareAndSet(false, true)) {
            this.f23388d.getInvalidationTracker().addWeakObserver(this.f23389e);
        }
    }

    @NonNull
    public abstract List<T> convertRows(@NonNull Cursor cursor);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int countItems() {
        b();
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(this.f23386b, this.f23385a.getArgCount());
        roomSQLiteQueryAcquire.copyArgumentsFrom(this.f23385a);
        Cursor cursorQuery = this.f23388d.query(roomSQLiteQueryAcquire);
        try {
            if (cursorQuery.moveToFirst()) {
                return cursorQuery.getInt(0);
            }
            return 0;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    public boolean isInvalid() {
        b();
        this.f23388d.getInvalidationTracker().refreshVersionsSync();
        return super.isInvalid();
    }

    public void loadInitial(@NonNull PositionalDataSource.LoadInitialParams loadInitialParams, @NonNull PositionalDataSource.LoadInitialCallback<T> loadInitialCallback) throws Throwable {
        RoomSQLiteQuery roomSQLiteQueryA;
        int i10;
        RoomSQLiteQuery roomSQLiteQuery;
        b();
        List<T> listEmptyList = Collections.emptyList();
        this.f23388d.beginTransaction();
        Cursor cursorQuery = null;
        try {
            int iCountItems = countItems();
            if (iCountItems != 0) {
                int iComputeInitialLoadPosition = computeInitialLoadPosition(loadInitialParams, iCountItems);
                roomSQLiteQueryA = a(iComputeInitialLoadPosition, computeInitialLoadSize(loadInitialParams, iComputeInitialLoadPosition, iCountItems));
                try {
                    cursorQuery = this.f23388d.query(roomSQLiteQueryA);
                    List<T> listConvertRows = convertRows(cursorQuery);
                    this.f23388d.setTransactionSuccessful();
                    roomSQLiteQuery = roomSQLiteQueryA;
                    i10 = iComputeInitialLoadPosition;
                    listEmptyList = listConvertRows;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    this.f23388d.endTransaction();
                    if (roomSQLiteQueryA != null) {
                        roomSQLiteQueryA.release();
                    }
                    throw th;
                }
            } else {
                i10 = 0;
                roomSQLiteQuery = null;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            this.f23388d.endTransaction();
            if (roomSQLiteQuery != null) {
                roomSQLiteQuery.release();
            }
            loadInitialCallback.onResult(listEmptyList, i10, iCountItems);
        } catch (Throwable th3) {
            th = th3;
            roomSQLiteQueryA = null;
        }
    }

    public void loadRange(@NonNull PositionalDataSource.LoadRangeParams loadRangeParams, @NonNull PositionalDataSource.LoadRangeCallback<T> loadRangeCallback) {
        loadRangeCallback.onResult(loadRange(loadRangeParams.startPosition, loadRangeParams.loadSize));
    }

    public LimitOffsetDataSource(@NonNull RoomDatabase roomDatabase, @NonNull SupportSQLiteQuery supportSQLiteQuery, boolean z10, boolean z11, @NonNull String... strArr) {
        this(roomDatabase, RoomSQLiteQuery.copyFrom(supportSQLiteQuery), z10, z11, strArr);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public List<T> loadRange(int i10, int i11) {
        RoomSQLiteQuery roomSQLiteQueryA = a(i10, i11);
        if (!this.f23390f) {
            Cursor cursorQuery = this.f23388d.query(roomSQLiteQueryA);
            try {
                return convertRows(cursorQuery);
            } finally {
                cursorQuery.close();
                roomSQLiteQueryA.release();
            }
        }
        this.f23388d.beginTransaction();
        Cursor cursorQuery2 = null;
        try {
            cursorQuery2 = this.f23388d.query(roomSQLiteQueryA);
            List<T> listConvertRows = convertRows(cursorQuery2);
            this.f23388d.setTransactionSuccessful();
            return listConvertRows;
        } finally {
            if (cursorQuery2 != null) {
                cursorQuery2.close();
            }
            this.f23388d.endTransaction();
            roomSQLiteQueryA.release();
        }
    }

    public LimitOffsetDataSource(@NonNull RoomDatabase roomDatabase, @NonNull RoomSQLiteQuery roomSQLiteQuery, boolean z10, @NonNull String... strArr) {
        this(roomDatabase, roomSQLiteQuery, z10, true, strArr);
    }

    public LimitOffsetDataSource(@NonNull RoomDatabase roomDatabase, @NonNull RoomSQLiteQuery roomSQLiteQuery, boolean z10, boolean z11, @NonNull String... strArr) {
        this.f23391g = new AtomicBoolean(false);
        this.f23388d = roomDatabase;
        this.f23385a = roomSQLiteQuery;
        this.f23390f = z10;
        this.f23386b = "SELECT COUNT(*) FROM ( " + roomSQLiteQuery.getF23480p0() + " )";
        this.f23387c = "SELECT * FROM ( " + roomSQLiteQuery.getF23480p0() + " ) LIMIT ? OFFSET ?";
        this.f23389e = new a(strArr);
        if (z11) {
            b();
        }
    }
}
