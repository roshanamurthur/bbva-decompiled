package androidx.work.impl.model;

import android.database.Cursor;
import androidx.collection.ArrayMap;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.webkit.ProxyConfig;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkSpecDao_Impl implements WorkSpecDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f24569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f24570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f24571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f24572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f24573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f24574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f24575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f24576h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m f24577i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f24578j;

    public class a implements Callable<List<String>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f24579p0;

        public a(RoomSQLiteQuery roomSQLiteQuery) {
            this.f24579p0 = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final List<String> call() throws Exception {
            WorkSpecDao_Impl workSpecDao_Impl = WorkSpecDao_Impl.this;
            RoomDatabase roomDatabase = workSpecDao_Impl.f24569a;
            RoomDatabase roomDatabase2 = workSpecDao_Impl.f24569a;
            roomDatabase.beginTransaction();
            try {
                Cursor cursorQuery = DBUtil.query(roomDatabase2, this.f24579p0, false, null);
                try {
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(cursorQuery.getString(0));
                    }
                    roomDatabase2.setTransactionSuccessful();
                    cursorQuery.close();
                    roomDatabase2.endTransaction();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorQuery.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                roomDatabase2.endTransaction();
                throw th3;
            }
        }

        public final void finalize() {
            this.f24579p0.release();
        }
    }

    public class b implements Callable<List<WorkSpec.WorkInfoPojo>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f24581p0;

        public b(RoomSQLiteQuery roomSQLiteQuery) {
            this.f24581p0 = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final List<WorkSpec.WorkInfoPojo> call() throws Exception {
            WorkSpecDao_Impl workSpecDao_Impl = WorkSpecDao_Impl.this;
            RoomDatabase roomDatabase = workSpecDao_Impl.f24569a;
            RoomDatabase roomDatabase2 = workSpecDao_Impl.f24569a;
            roomDatabase.beginTransaction();
            try {
                Cursor cursorQuery = DBUtil.query(roomDatabase2, this.f24581p0, true, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "output");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                    ArrayMap<String, ArrayList<String>> arrayMap = new ArrayMap<>();
                    ArrayMap<String, ArrayList<Data>> arrayMap2 = new ArrayMap<>();
                    while (cursorQuery.moveToNext()) {
                        if (!cursorQuery.isNull(columnIndexOrThrow)) {
                            String string = cursorQuery.getString(columnIndexOrThrow);
                            if (arrayMap.get(string) == null) {
                                arrayMap.put(string, new ArrayList<>());
                            }
                        }
                        if (!cursorQuery.isNull(columnIndexOrThrow)) {
                            String string2 = cursorQuery.getString(columnIndexOrThrow);
                            if (arrayMap2.get(string2) == null) {
                                arrayMap2.put(string2, new ArrayList<>());
                            }
                        }
                    }
                    cursorQuery.moveToPosition(-1);
                    workSpecDao_Impl.b(arrayMap);
                    workSpecDao_Impl.a(arrayMap2);
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        ArrayList<String> arrayList2 = !cursorQuery.isNull(columnIndexOrThrow) ? arrayMap.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList<>();
                        }
                        ArrayList<Data> arrayList3 = !cursorQuery.isNull(columnIndexOrThrow) ? arrayMap2.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList<>();
                        }
                        WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                        workInfoPojo.id = cursorQuery.getString(columnIndexOrThrow);
                        workInfoPojo.state = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                        workInfoPojo.output = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow3));
                        workInfoPojo.runAttemptCount = cursorQuery.getInt(columnIndexOrThrow4);
                        workInfoPojo.tags = arrayList2;
                        workInfoPojo.progress = arrayList3;
                        arrayList.add(workInfoPojo);
                    }
                    roomDatabase2.setTransactionSuccessful();
                    cursorQuery.close();
                    roomDatabase2.endTransaction();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorQuery.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                roomDatabase2.endTransaction();
                throw th3;
            }
        }

        public final void finalize() {
            this.f24581p0.release();
        }
    }

    public class c implements Callable<List<WorkSpec.WorkInfoPojo>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f24583p0;

        public c(RoomSQLiteQuery roomSQLiteQuery) {
            this.f24583p0 = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final List<WorkSpec.WorkInfoPojo> call() throws Exception {
            WorkSpecDao_Impl workSpecDao_Impl = WorkSpecDao_Impl.this;
            RoomDatabase roomDatabase = workSpecDao_Impl.f24569a;
            RoomDatabase roomDatabase2 = workSpecDao_Impl.f24569a;
            roomDatabase.beginTransaction();
            try {
                Cursor cursorQuery = DBUtil.query(roomDatabase2, this.f24583p0, true, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "output");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                    ArrayMap<String, ArrayList<String>> arrayMap = new ArrayMap<>();
                    ArrayMap<String, ArrayList<Data>> arrayMap2 = new ArrayMap<>();
                    while (cursorQuery.moveToNext()) {
                        if (!cursorQuery.isNull(columnIndexOrThrow)) {
                            String string = cursorQuery.getString(columnIndexOrThrow);
                            if (arrayMap.get(string) == null) {
                                arrayMap.put(string, new ArrayList<>());
                            }
                        }
                        if (!cursorQuery.isNull(columnIndexOrThrow)) {
                            String string2 = cursorQuery.getString(columnIndexOrThrow);
                            if (arrayMap2.get(string2) == null) {
                                arrayMap2.put(string2, new ArrayList<>());
                            }
                        }
                    }
                    cursorQuery.moveToPosition(-1);
                    workSpecDao_Impl.b(arrayMap);
                    workSpecDao_Impl.a(arrayMap2);
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        ArrayList<String> arrayList2 = !cursorQuery.isNull(columnIndexOrThrow) ? arrayMap.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList<>();
                        }
                        ArrayList<Data> arrayList3 = !cursorQuery.isNull(columnIndexOrThrow) ? arrayMap2.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList<>();
                        }
                        WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                        workInfoPojo.id = cursorQuery.getString(columnIndexOrThrow);
                        workInfoPojo.state = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                        workInfoPojo.output = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow3));
                        workInfoPojo.runAttemptCount = cursorQuery.getInt(columnIndexOrThrow4);
                        workInfoPojo.tags = arrayList2;
                        workInfoPojo.progress = arrayList3;
                        arrayList.add(workInfoPojo);
                    }
                    roomDatabase2.setTransactionSuccessful();
                    cursorQuery.close();
                    roomDatabase2.endTransaction();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorQuery.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                roomDatabase2.endTransaction();
                throw th3;
            }
        }

        public final void finalize() {
            this.f24583p0.release();
        }
    }

    public class d implements Callable<List<WorkSpec.WorkInfoPojo>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f24585p0;

        public d(RoomSQLiteQuery roomSQLiteQuery) {
            this.f24585p0 = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final List<WorkSpec.WorkInfoPojo> call() throws Exception {
            WorkSpecDao_Impl workSpecDao_Impl = WorkSpecDao_Impl.this;
            RoomDatabase roomDatabase = workSpecDao_Impl.f24569a;
            RoomDatabase roomDatabase2 = workSpecDao_Impl.f24569a;
            roomDatabase.beginTransaction();
            try {
                Cursor cursorQuery = DBUtil.query(roomDatabase2, this.f24585p0, true, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "output");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                    ArrayMap<String, ArrayList<String>> arrayMap = new ArrayMap<>();
                    ArrayMap<String, ArrayList<Data>> arrayMap2 = new ArrayMap<>();
                    while (cursorQuery.moveToNext()) {
                        if (!cursorQuery.isNull(columnIndexOrThrow)) {
                            String string = cursorQuery.getString(columnIndexOrThrow);
                            if (arrayMap.get(string) == null) {
                                arrayMap.put(string, new ArrayList<>());
                            }
                        }
                        if (!cursorQuery.isNull(columnIndexOrThrow)) {
                            String string2 = cursorQuery.getString(columnIndexOrThrow);
                            if (arrayMap2.get(string2) == null) {
                                arrayMap2.put(string2, new ArrayList<>());
                            }
                        }
                    }
                    cursorQuery.moveToPosition(-1);
                    workSpecDao_Impl.b(arrayMap);
                    workSpecDao_Impl.a(arrayMap2);
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        ArrayList<String> arrayList2 = !cursorQuery.isNull(columnIndexOrThrow) ? arrayMap.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList<>();
                        }
                        ArrayList<Data> arrayList3 = !cursorQuery.isNull(columnIndexOrThrow) ? arrayMap2.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList<>();
                        }
                        WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                        workInfoPojo.id = cursorQuery.getString(columnIndexOrThrow);
                        workInfoPojo.state = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                        workInfoPojo.output = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow3));
                        workInfoPojo.runAttemptCount = cursorQuery.getInt(columnIndexOrThrow4);
                        workInfoPojo.tags = arrayList2;
                        workInfoPojo.progress = arrayList3;
                        arrayList.add(workInfoPojo);
                    }
                    roomDatabase2.setTransactionSuccessful();
                    cursorQuery.close();
                    roomDatabase2.endTransaction();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorQuery.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                roomDatabase2.endTransaction();
                throw th3;
            }
        }

        public final void finalize() {
            this.f24585p0.release();
        }
    }

    public class e implements Callable<Long> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ RoomSQLiteQuery f24587p0;

        public e(RoomSQLiteQuery roomSQLiteQuery) {
            this.f24587p0 = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final Long call() throws Exception {
            Long lValueOf = null;
            Cursor cursorQuery = DBUtil.query(WorkSpecDao_Impl.this.f24569a, this.f24587p0, false, null);
            try {
                if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                    lValueOf = Long.valueOf(cursorQuery.getLong(0));
                }
                return lValueOf;
            } finally {
                cursorQuery.close();
            }
        }

        public final void finalize() {
            this.f24587p0.release();
        }
    }

    public class f extends EntityInsertionAdapter<WorkSpec> {
        @Override // androidx.room.EntityInsertionAdapter
        public final void bind(SupportSQLiteStatement supportSQLiteStatement, WorkSpec workSpec) throws Throwable {
            WorkSpec workSpec2 = workSpec;
            String str = workSpec2.id;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            supportSQLiteStatement.bindLong(2, WorkTypeConverters.stateToInt(workSpec2.state));
            String str2 = workSpec2.workerClassName;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, str2);
            }
            String str3 = workSpec2.inputMergerClassName;
            if (str3 == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, str3);
            }
            byte[] byteArrayInternal = Data.toByteArrayInternal(workSpec2.input);
            if (byteArrayInternal == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindBlob(5, byteArrayInternal);
            }
            byte[] byteArrayInternal2 = Data.toByteArrayInternal(workSpec2.output);
            if (byteArrayInternal2 == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindBlob(6, byteArrayInternal2);
            }
            supportSQLiteStatement.bindLong(7, workSpec2.initialDelay);
            supportSQLiteStatement.bindLong(8, workSpec2.intervalDuration);
            supportSQLiteStatement.bindLong(9, workSpec2.flexDuration);
            supportSQLiteStatement.bindLong(10, workSpec2.runAttemptCount);
            supportSQLiteStatement.bindLong(11, WorkTypeConverters.backoffPolicyToInt(workSpec2.backoffPolicy));
            supportSQLiteStatement.bindLong(12, workSpec2.backoffDelayDuration);
            supportSQLiteStatement.bindLong(13, workSpec2.periodStartTime);
            supportSQLiteStatement.bindLong(14, workSpec2.minimumRetentionDuration);
            supportSQLiteStatement.bindLong(15, workSpec2.scheduleRequestedAt);
            supportSQLiteStatement.bindLong(16, workSpec2.expedited ? 1L : 0L);
            supportSQLiteStatement.bindLong(17, WorkTypeConverters.outOfQuotaPolicyToInt(workSpec2.outOfQuotaPolicy));
            Constraints constraints = workSpec2.constraints;
            if (constraints == null) {
                supportSQLiteStatement.bindNull(18);
                supportSQLiteStatement.bindNull(19);
                supportSQLiteStatement.bindNull(20);
                supportSQLiteStatement.bindNull(21);
                supportSQLiteStatement.bindNull(22);
                supportSQLiteStatement.bindNull(23);
                supportSQLiteStatement.bindNull(24);
                supportSQLiteStatement.bindNull(25);
                return;
            }
            supportSQLiteStatement.bindLong(18, WorkTypeConverters.networkTypeToInt(constraints.getRequiredNetworkType()));
            supportSQLiteStatement.bindLong(19, constraints.requiresCharging() ? 1L : 0L);
            supportSQLiteStatement.bindLong(20, constraints.requiresDeviceIdle() ? 1L : 0L);
            supportSQLiteStatement.bindLong(21, constraints.requiresBatteryNotLow() ? 1L : 0L);
            supportSQLiteStatement.bindLong(22, constraints.requiresStorageNotLow() ? 1L : 0L);
            supportSQLiteStatement.bindLong(23, constraints.getTriggerContentUpdateDelay());
            supportSQLiteStatement.bindLong(24, constraints.getTriggerMaxContentDelay());
            byte[] bArrContentUriTriggersToByteArray = WorkTypeConverters.contentUriTriggersToByteArray(constraints.getContentUriTriggers());
            if (bArrContentUriTriggersToByteArray == null) {
                supportSQLiteStatement.bindNull(25);
            } else {
                supportSQLiteStatement.bindBlob(25, bArrContentUriTriggersToByteArray);
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public class g extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    public class h extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    public class i extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    public class j extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public class k extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public class l extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    public class m extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public class n extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String createQuery() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public WorkSpecDao_Impl(RoomDatabase roomDatabase) {
        this.f24569a = roomDatabase;
        this.f24570b = new f(roomDatabase);
        this.f24571c = new g(roomDatabase);
        this.f24572d = new h(roomDatabase);
        this.f24573e = new i(roomDatabase);
        this.f24574f = new j(roomDatabase);
        this.f24575g = new k(roomDatabase);
        this.f24576h = new l(roomDatabase);
        this.f24577i = new m(roomDatabase);
        this.f24578j = new n(roomDatabase);
    }

    public final void a(ArrayMap<String, ArrayList<Data>> arrayMap) {
        ArrayList<Data> arrayList;
        Set<String> setKeySet = arrayMap.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (arrayMap.getSize() > 999) {
            ArrayMap<String, ArrayList<Data>> arrayMap2 = new ArrayMap<>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
            int size = arrayMap.getSize();
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                arrayMap2.put(arrayMap.keyAt(i10), arrayMap.valueAt(i10));
                i10++;
                i11++;
                if (i11 == 999) {
                    a(arrayMap2);
                    arrayMap2 = new ArrayMap<>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
                    i11 = 0;
                }
            }
            if (i11 > 0) {
                a(arrayMap2);
                return;
            }
            return;
        }
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size2 = setKeySet.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size2);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size2);
        int i12 = 1;
        for (String str : setKeySet) {
            if (str == null) {
                roomSQLiteQueryAcquire.bindNull(i12);
            } else {
                roomSQLiteQueryAcquire.bindString(i12, str);
            }
            i12++;
        }
        Cursor cursorQuery = DBUtil.query(this.f24569a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "work_spec_id");
            if (columnIndex == -1) {
                cursorQuery.close();
                return;
            }
            while (cursorQuery.moveToNext()) {
                if (!cursorQuery.isNull(columnIndex) && (arrayList = arrayMap.get(cursorQuery.getString(columnIndex))) != null) {
                    arrayList.add(Data.fromByteArray(cursorQuery.getBlob(0)));
                }
            }
            cursorQuery.close();
        } catch (Throwable th2) {
            cursorQuery.close();
            throw th2;
        }
    }

    public final void b(ArrayMap<String, ArrayList<String>> arrayMap) {
        ArrayList<String> arrayList;
        Set<String> setKeySet = arrayMap.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (arrayMap.getSize() > 999) {
            ArrayMap<String, ArrayList<String>> arrayMap2 = new ArrayMap<>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
            int size = arrayMap.getSize();
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                arrayMap2.put(arrayMap.keyAt(i10), arrayMap.valueAt(i10));
                i10++;
                i11++;
                if (i11 == 999) {
                    b(arrayMap2);
                    arrayMap2 = new ArrayMap<>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
                    i11 = 0;
                }
            }
            if (i11 > 0) {
                b(arrayMap2);
                return;
            }
            return;
        }
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size2 = setKeySet.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size2);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size2);
        int i12 = 1;
        for (String str : setKeySet) {
            if (str == null) {
                roomSQLiteQueryAcquire.bindNull(i12);
            } else {
                roomSQLiteQueryAcquire.bindString(i12, str);
            }
            i12++;
        }
        Cursor cursorQuery = DBUtil.query(this.f24569a, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "work_spec_id");
            if (columnIndex == -1) {
                cursorQuery.close();
                return;
            }
            while (cursorQuery.moveToNext()) {
                if (!cursorQuery.isNull(columnIndex) && (arrayList = arrayMap.get(cursorQuery.getString(columnIndex))) != null) {
                    arrayList.add(cursorQuery.getString(0));
                }
            }
            cursorQuery.close();
        } catch (Throwable th2) {
            cursorQuery.close();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void delete(String str) {
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        g gVar = this.f24571c;
        SupportSQLiteStatement supportSQLiteStatementAcquire = gVar.acquire();
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str);
        }
        roomDatabase.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
            gVar.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getAllEligibleWorkSpecsForScheduling(int i10) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, i10);
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(roomDatabase, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "required_network_type");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_charging");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "output");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "initial_delay");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "interval_duration");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flex_duration");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "period_start_time");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
                int i11 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndexOrThrow9);
                    int i12 = columnIndexOrThrow9;
                    String string2 = cursorQuery.getString(columnIndexOrThrow11);
                    int i13 = columnIndexOrThrow11;
                    Constraints constraints = new Constraints();
                    int i14 = columnIndexOrThrow;
                    constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow)));
                    constraints.setRequiresCharging(cursorQuery.getInt(columnIndexOrThrow2) != 0);
                    constraints.setRequiresDeviceIdle(cursorQuery.getInt(columnIndexOrThrow3) != 0);
                    constraints.setRequiresBatteryNotLow(cursorQuery.getInt(columnIndexOrThrow4) != 0);
                    constraints.setRequiresStorageNotLow(cursorQuery.getInt(columnIndexOrThrow5) != 0);
                    int i15 = columnIndexOrThrow2;
                    int i16 = columnIndexOrThrow3;
                    constraints.setTriggerContentUpdateDelay(cursorQuery.getLong(columnIndexOrThrow6));
                    constraints.setTriggerMaxContentDelay(cursorQuery.getLong(columnIndexOrThrow7));
                    constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(cursorQuery.getBlob(columnIndexOrThrow8)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.state = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow10));
                    workSpec.inputMergerClassName = cursorQuery.getString(columnIndexOrThrow12);
                    workSpec.input = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow13));
                    int i17 = i11;
                    workSpec.output = Data.fromByteArray(cursorQuery.getBlob(i17));
                    int i18 = columnIndexOrThrow12;
                    int i19 = columnIndexOrThrow15;
                    workSpec.initialDelay = cursorQuery.getLong(i19);
                    int i20 = columnIndexOrThrow4;
                    int i21 = columnIndexOrThrow16;
                    workSpec.intervalDuration = cursorQuery.getLong(i21);
                    int i22 = columnIndexOrThrow17;
                    workSpec.flexDuration = cursorQuery.getLong(i22);
                    int i23 = columnIndexOrThrow18;
                    workSpec.runAttemptCount = cursorQuery.getInt(i23);
                    int i24 = columnIndexOrThrow19;
                    workSpec.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(i24));
                    int i25 = columnIndexOrThrow20;
                    workSpec.backoffDelayDuration = cursorQuery.getLong(i25);
                    int i26 = columnIndexOrThrow21;
                    workSpec.periodStartTime = cursorQuery.getLong(i26);
                    int i27 = columnIndexOrThrow22;
                    workSpec.minimumRetentionDuration = cursorQuery.getLong(i27);
                    int i28 = columnIndexOrThrow23;
                    workSpec.scheduleRequestedAt = cursorQuery.getLong(i28);
                    int i29 = columnIndexOrThrow24;
                    workSpec.expedited = cursorQuery.getInt(i29) != 0;
                    int i30 = columnIndexOrThrow25;
                    workSpec.outOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(cursorQuery.getInt(i30));
                    workSpec.constraints = constraints;
                    arrayList.add(workSpec);
                    i11 = i17;
                    columnIndexOrThrow2 = i15;
                    columnIndexOrThrow15 = i19;
                    columnIndexOrThrow16 = i21;
                    columnIndexOrThrow20 = i25;
                    columnIndexOrThrow21 = i26;
                    columnIndexOrThrow24 = i29;
                    columnIndexOrThrow11 = i13;
                    columnIndexOrThrow = i14;
                    columnIndexOrThrow25 = i30;
                    columnIndexOrThrow23 = i28;
                    columnIndexOrThrow12 = i18;
                    columnIndexOrThrow9 = i12;
                    columnIndexOrThrow3 = i16;
                    columnIndexOrThrow22 = i27;
                    columnIndexOrThrow4 = i20;
                    columnIndexOrThrow17 = i22;
                    columnIndexOrThrow18 = i23;
                    columnIndexOrThrow19 = i24;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getAllUnfinishedWork() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(roomDatabase, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(0));
            }
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            return arrayList;
        } catch (Throwable th2) {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getAllWorkSpecIds() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec", 0);
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(roomDatabase, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(0));
            }
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            return arrayList;
        } catch (Throwable th2) {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<String>> getAllWorkSpecIdsLiveData() {
        return this.f24569a.getInvalidationTracker().createLiveData(new String[]{"workspec"}, true, new a(RoomSQLiteQuery.acquire("SELECT id FROM workspec", 0)));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getEligibleWorkForScheduling(int i10) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        roomSQLiteQueryAcquire.bindLong(1, i10);
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(roomDatabase, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "required_network_type");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_charging");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "output");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "initial_delay");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "interval_duration");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flex_duration");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "period_start_time");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
                int i11 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndexOrThrow9);
                    int i12 = columnIndexOrThrow9;
                    String string2 = cursorQuery.getString(columnIndexOrThrow11);
                    int i13 = columnIndexOrThrow11;
                    Constraints constraints = new Constraints();
                    int i14 = columnIndexOrThrow;
                    constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow)));
                    constraints.setRequiresCharging(cursorQuery.getInt(columnIndexOrThrow2) != 0);
                    constraints.setRequiresDeviceIdle(cursorQuery.getInt(columnIndexOrThrow3) != 0);
                    constraints.setRequiresBatteryNotLow(cursorQuery.getInt(columnIndexOrThrow4) != 0);
                    constraints.setRequiresStorageNotLow(cursorQuery.getInt(columnIndexOrThrow5) != 0);
                    int i15 = columnIndexOrThrow2;
                    int i16 = columnIndexOrThrow3;
                    constraints.setTriggerContentUpdateDelay(cursorQuery.getLong(columnIndexOrThrow6));
                    constraints.setTriggerMaxContentDelay(cursorQuery.getLong(columnIndexOrThrow7));
                    constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(cursorQuery.getBlob(columnIndexOrThrow8)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.state = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow10));
                    workSpec.inputMergerClassName = cursorQuery.getString(columnIndexOrThrow12);
                    workSpec.input = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow13));
                    int i17 = i11;
                    workSpec.output = Data.fromByteArray(cursorQuery.getBlob(i17));
                    int i18 = columnIndexOrThrow12;
                    int i19 = columnIndexOrThrow15;
                    workSpec.initialDelay = cursorQuery.getLong(i19);
                    int i20 = columnIndexOrThrow4;
                    int i21 = columnIndexOrThrow16;
                    workSpec.intervalDuration = cursorQuery.getLong(i21);
                    int i22 = columnIndexOrThrow17;
                    workSpec.flexDuration = cursorQuery.getLong(i22);
                    int i23 = columnIndexOrThrow18;
                    workSpec.runAttemptCount = cursorQuery.getInt(i23);
                    int i24 = columnIndexOrThrow19;
                    workSpec.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(i24));
                    int i25 = columnIndexOrThrow20;
                    workSpec.backoffDelayDuration = cursorQuery.getLong(i25);
                    int i26 = columnIndexOrThrow21;
                    workSpec.periodStartTime = cursorQuery.getLong(i26);
                    int i27 = columnIndexOrThrow22;
                    workSpec.minimumRetentionDuration = cursorQuery.getLong(i27);
                    int i28 = columnIndexOrThrow23;
                    workSpec.scheduleRequestedAt = cursorQuery.getLong(i28);
                    int i29 = columnIndexOrThrow24;
                    workSpec.expedited = cursorQuery.getInt(i29) != 0;
                    int i30 = columnIndexOrThrow25;
                    workSpec.outOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(cursorQuery.getInt(i30));
                    workSpec.constraints = constraints;
                    arrayList.add(workSpec);
                    i11 = i17;
                    columnIndexOrThrow2 = i15;
                    columnIndexOrThrow15 = i19;
                    columnIndexOrThrow16 = i21;
                    columnIndexOrThrow20 = i25;
                    columnIndexOrThrow21 = i26;
                    columnIndexOrThrow24 = i29;
                    columnIndexOrThrow11 = i13;
                    columnIndexOrThrow = i14;
                    columnIndexOrThrow25 = i30;
                    columnIndexOrThrow23 = i28;
                    columnIndexOrThrow12 = i18;
                    columnIndexOrThrow9 = i12;
                    columnIndexOrThrow3 = i16;
                    columnIndexOrThrow22 = i27;
                    columnIndexOrThrow4 = i20;
                    columnIndexOrThrow17 = i22;
                    columnIndexOrThrow18 = i23;
                    columnIndexOrThrow19 = i24;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<Data> getInputsFromPrerequisites(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(roomDatabase, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(Data.fromByteArray(cursorQuery.getBlob(0)));
            }
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            return arrayList;
        } catch (Throwable th2) {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getRecentlyCompletedWork(long j10) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        roomSQLiteQueryAcquire.bindLong(1, j10);
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(roomDatabase, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "required_network_type");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_charging");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "output");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "initial_delay");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "interval_duration");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flex_duration");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "period_start_time");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
                int i10 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndexOrThrow9);
                    int i11 = columnIndexOrThrow9;
                    String string2 = cursorQuery.getString(columnIndexOrThrow11);
                    int i12 = columnIndexOrThrow11;
                    Constraints constraints = new Constraints();
                    int i13 = columnIndexOrThrow;
                    constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow)));
                    constraints.setRequiresCharging(cursorQuery.getInt(columnIndexOrThrow2) != 0);
                    constraints.setRequiresDeviceIdle(cursorQuery.getInt(columnIndexOrThrow3) != 0);
                    constraints.setRequiresBatteryNotLow(cursorQuery.getInt(columnIndexOrThrow4) != 0);
                    constraints.setRequiresStorageNotLow(cursorQuery.getInt(columnIndexOrThrow5) != 0);
                    int i14 = columnIndexOrThrow2;
                    int i15 = columnIndexOrThrow3;
                    constraints.setTriggerContentUpdateDelay(cursorQuery.getLong(columnIndexOrThrow6));
                    constraints.setTriggerMaxContentDelay(cursorQuery.getLong(columnIndexOrThrow7));
                    constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(cursorQuery.getBlob(columnIndexOrThrow8)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.state = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow10));
                    workSpec.inputMergerClassName = cursorQuery.getString(columnIndexOrThrow12);
                    workSpec.input = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow13));
                    int i16 = i10;
                    workSpec.output = Data.fromByteArray(cursorQuery.getBlob(i16));
                    int i17 = columnIndexOrThrow15;
                    int i18 = columnIndexOrThrow12;
                    workSpec.initialDelay = cursorQuery.getLong(i17);
                    int i19 = columnIndexOrThrow4;
                    int i20 = columnIndexOrThrow16;
                    workSpec.intervalDuration = cursorQuery.getLong(i20);
                    int i21 = columnIndexOrThrow17;
                    workSpec.flexDuration = cursorQuery.getLong(i21);
                    int i22 = columnIndexOrThrow18;
                    workSpec.runAttemptCount = cursorQuery.getInt(i22);
                    int i23 = columnIndexOrThrow19;
                    workSpec.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(i23));
                    int i24 = columnIndexOrThrow20;
                    workSpec.backoffDelayDuration = cursorQuery.getLong(i24);
                    int i25 = columnIndexOrThrow21;
                    workSpec.periodStartTime = cursorQuery.getLong(i25);
                    int i26 = columnIndexOrThrow22;
                    workSpec.minimumRetentionDuration = cursorQuery.getLong(i26);
                    int i27 = columnIndexOrThrow23;
                    workSpec.scheduleRequestedAt = cursorQuery.getLong(i27);
                    int i28 = columnIndexOrThrow24;
                    workSpec.expedited = cursorQuery.getInt(i28) != 0;
                    int i29 = columnIndexOrThrow25;
                    workSpec.outOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(cursorQuery.getInt(i29));
                    workSpec.constraints = constraints;
                    arrayList.add(workSpec);
                    i10 = i16;
                    columnIndexOrThrow2 = i14;
                    columnIndexOrThrow24 = i28;
                    columnIndexOrThrow9 = i11;
                    columnIndexOrThrow11 = i12;
                    columnIndexOrThrow = i13;
                    columnIndexOrThrow25 = i29;
                    columnIndexOrThrow12 = i18;
                    columnIndexOrThrow15 = i17;
                    columnIndexOrThrow16 = i20;
                    columnIndexOrThrow20 = i24;
                    columnIndexOrThrow21 = i25;
                    columnIndexOrThrow23 = i27;
                    columnIndexOrThrow3 = i15;
                    columnIndexOrThrow22 = i26;
                    columnIndexOrThrow4 = i19;
                    columnIndexOrThrow17 = i21;
                    columnIndexOrThrow18 = i22;
                    columnIndexOrThrow19 = i23;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getRunningWork() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(roomDatabase, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "required_network_type");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_charging");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "output");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "initial_delay");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "interval_duration");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flex_duration");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "period_start_time");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
                int i10 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndexOrThrow9);
                    int i11 = columnIndexOrThrow9;
                    String string2 = cursorQuery.getString(columnIndexOrThrow11);
                    int i12 = columnIndexOrThrow11;
                    Constraints constraints = new Constraints();
                    int i13 = columnIndexOrThrow;
                    constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow)));
                    constraints.setRequiresCharging(cursorQuery.getInt(columnIndexOrThrow2) != 0);
                    constraints.setRequiresDeviceIdle(cursorQuery.getInt(columnIndexOrThrow3) != 0);
                    constraints.setRequiresBatteryNotLow(cursorQuery.getInt(columnIndexOrThrow4) != 0);
                    constraints.setRequiresStorageNotLow(cursorQuery.getInt(columnIndexOrThrow5) != 0);
                    int i14 = columnIndexOrThrow2;
                    int i15 = columnIndexOrThrow3;
                    constraints.setTriggerContentUpdateDelay(cursorQuery.getLong(columnIndexOrThrow6));
                    constraints.setTriggerMaxContentDelay(cursorQuery.getLong(columnIndexOrThrow7));
                    constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(cursorQuery.getBlob(columnIndexOrThrow8)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.state = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow10));
                    workSpec.inputMergerClassName = cursorQuery.getString(columnIndexOrThrow12);
                    workSpec.input = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow13));
                    int i16 = i10;
                    workSpec.output = Data.fromByteArray(cursorQuery.getBlob(i16));
                    int i17 = columnIndexOrThrow13;
                    int i18 = columnIndexOrThrow15;
                    workSpec.initialDelay = cursorQuery.getLong(i18);
                    int i19 = columnIndexOrThrow4;
                    int i20 = columnIndexOrThrow16;
                    workSpec.intervalDuration = cursorQuery.getLong(i20);
                    int i21 = columnIndexOrThrow17;
                    workSpec.flexDuration = cursorQuery.getLong(i21);
                    int i22 = columnIndexOrThrow18;
                    workSpec.runAttemptCount = cursorQuery.getInt(i22);
                    int i23 = columnIndexOrThrow19;
                    workSpec.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(i23));
                    int i24 = columnIndexOrThrow20;
                    workSpec.backoffDelayDuration = cursorQuery.getLong(i24);
                    int i25 = columnIndexOrThrow21;
                    workSpec.periodStartTime = cursorQuery.getLong(i25);
                    int i26 = columnIndexOrThrow22;
                    workSpec.minimumRetentionDuration = cursorQuery.getLong(i26);
                    int i27 = columnIndexOrThrow23;
                    workSpec.scheduleRequestedAt = cursorQuery.getLong(i27);
                    int i28 = columnIndexOrThrow24;
                    workSpec.expedited = cursorQuery.getInt(i28) != 0;
                    int i29 = columnIndexOrThrow25;
                    workSpec.outOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(cursorQuery.getInt(i29));
                    workSpec.constraints = constraints;
                    arrayList.add(workSpec);
                    i10 = i16;
                    columnIndexOrThrow2 = i14;
                    columnIndexOrThrow15 = i18;
                    columnIndexOrThrow16 = i20;
                    columnIndexOrThrow20 = i24;
                    columnIndexOrThrow21 = i25;
                    columnIndexOrThrow24 = i28;
                    columnIndexOrThrow11 = i12;
                    columnIndexOrThrow = i13;
                    columnIndexOrThrow25 = i29;
                    columnIndexOrThrow23 = i27;
                    columnIndexOrThrow13 = i17;
                    columnIndexOrThrow9 = i11;
                    columnIndexOrThrow3 = i15;
                    columnIndexOrThrow22 = i26;
                    columnIndexOrThrow4 = i19;
                    columnIndexOrThrow17 = i21;
                    columnIndexOrThrow18 = i22;
                    columnIndexOrThrow19 = i23;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<Long> getScheduleRequestedAtLiveData(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT schedule_requested_at FROM workspec WHERE id=?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        return this.f24569a.getInvalidationTracker().createLiveData(new String[]{"workspec"}, false, new e(roomSQLiteQueryAcquire));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getScheduledWork() throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(roomDatabase, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "required_network_type");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_charging");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "output");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "initial_delay");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "interval_duration");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flex_duration");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "period_start_time");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
                int i10 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndexOrThrow9);
                    int i11 = columnIndexOrThrow9;
                    String string2 = cursorQuery.getString(columnIndexOrThrow11);
                    int i12 = columnIndexOrThrow11;
                    Constraints constraints = new Constraints();
                    int i13 = columnIndexOrThrow;
                    constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow)));
                    constraints.setRequiresCharging(cursorQuery.getInt(columnIndexOrThrow2) != 0);
                    constraints.setRequiresDeviceIdle(cursorQuery.getInt(columnIndexOrThrow3) != 0);
                    constraints.setRequiresBatteryNotLow(cursorQuery.getInt(columnIndexOrThrow4) != 0);
                    constraints.setRequiresStorageNotLow(cursorQuery.getInt(columnIndexOrThrow5) != 0);
                    int i14 = columnIndexOrThrow2;
                    int i15 = columnIndexOrThrow3;
                    constraints.setTriggerContentUpdateDelay(cursorQuery.getLong(columnIndexOrThrow6));
                    constraints.setTriggerMaxContentDelay(cursorQuery.getLong(columnIndexOrThrow7));
                    constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(cursorQuery.getBlob(columnIndexOrThrow8)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.state = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow10));
                    workSpec.inputMergerClassName = cursorQuery.getString(columnIndexOrThrow12);
                    workSpec.input = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow13));
                    int i16 = i10;
                    workSpec.output = Data.fromByteArray(cursorQuery.getBlob(i16));
                    int i17 = columnIndexOrThrow13;
                    int i18 = columnIndexOrThrow15;
                    workSpec.initialDelay = cursorQuery.getLong(i18);
                    int i19 = columnIndexOrThrow4;
                    int i20 = columnIndexOrThrow16;
                    workSpec.intervalDuration = cursorQuery.getLong(i20);
                    int i21 = columnIndexOrThrow17;
                    workSpec.flexDuration = cursorQuery.getLong(i21);
                    int i22 = columnIndexOrThrow18;
                    workSpec.runAttemptCount = cursorQuery.getInt(i22);
                    int i23 = columnIndexOrThrow19;
                    workSpec.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(i23));
                    int i24 = columnIndexOrThrow20;
                    workSpec.backoffDelayDuration = cursorQuery.getLong(i24);
                    int i25 = columnIndexOrThrow21;
                    workSpec.periodStartTime = cursorQuery.getLong(i25);
                    int i26 = columnIndexOrThrow22;
                    workSpec.minimumRetentionDuration = cursorQuery.getLong(i26);
                    int i27 = columnIndexOrThrow23;
                    workSpec.scheduleRequestedAt = cursorQuery.getLong(i27);
                    int i28 = columnIndexOrThrow24;
                    workSpec.expedited = cursorQuery.getInt(i28) != 0;
                    int i29 = columnIndexOrThrow25;
                    workSpec.outOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(cursorQuery.getInt(i29));
                    workSpec.constraints = constraints;
                    arrayList.add(workSpec);
                    i10 = i16;
                    columnIndexOrThrow2 = i14;
                    columnIndexOrThrow15 = i18;
                    columnIndexOrThrow16 = i20;
                    columnIndexOrThrow20 = i24;
                    columnIndexOrThrow21 = i25;
                    columnIndexOrThrow24 = i28;
                    columnIndexOrThrow11 = i12;
                    columnIndexOrThrow = i13;
                    columnIndexOrThrow25 = i29;
                    columnIndexOrThrow23 = i27;
                    columnIndexOrThrow13 = i17;
                    columnIndexOrThrow9 = i11;
                    columnIndexOrThrow3 = i15;
                    columnIndexOrThrow22 = i26;
                    columnIndexOrThrow4 = i19;
                    columnIndexOrThrow17 = i21;
                    columnIndexOrThrow18 = i22;
                    columnIndexOrThrow19 = i23;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkInfo.State getState(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(roomDatabase, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? WorkTypeConverters.intToState(cursorQuery.getInt(0)) : null;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getUnfinishedWorkWithName(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(roomDatabase, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(0));
            }
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            return arrayList;
        } catch (Throwable th2) {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getUnfinishedWorkWithTag(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(roomDatabase, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(cursorQuery.getString(0));
            }
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            return arrayList;
        } catch (Throwable th2) {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkSpec getWorkSpec(String str) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        WorkSpec workSpec;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(roomDatabase, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "required_network_type");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_charging");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "output");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "initial_delay");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "interval_duration");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flex_duration");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "period_start_time");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
                if (cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(columnIndexOrThrow9);
                    String string2 = cursorQuery.getString(columnIndexOrThrow11);
                    Constraints constraints = new Constraints();
                    constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow)));
                    constraints.setRequiresCharging(cursorQuery.getInt(columnIndexOrThrow2) != 0);
                    constraints.setRequiresDeviceIdle(cursorQuery.getInt(columnIndexOrThrow3) != 0);
                    constraints.setRequiresBatteryNotLow(cursorQuery.getInt(columnIndexOrThrow4) != 0);
                    constraints.setRequiresStorageNotLow(cursorQuery.getInt(columnIndexOrThrow5) != 0);
                    constraints.setTriggerContentUpdateDelay(cursorQuery.getLong(columnIndexOrThrow6));
                    constraints.setTriggerMaxContentDelay(cursorQuery.getLong(columnIndexOrThrow7));
                    constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(cursorQuery.getBlob(columnIndexOrThrow8)));
                    WorkSpec workSpec2 = new WorkSpec(string, string2);
                    workSpec2.state = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow10));
                    workSpec2.inputMergerClassName = cursorQuery.getString(columnIndexOrThrow12);
                    workSpec2.input = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow13));
                    workSpec2.output = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow14));
                    workSpec2.initialDelay = cursorQuery.getLong(columnIndexOrThrow15);
                    workSpec2.intervalDuration = cursorQuery.getLong(columnIndexOrThrow16);
                    workSpec2.flexDuration = cursorQuery.getLong(columnIndexOrThrow17);
                    workSpec2.runAttemptCount = cursorQuery.getInt(columnIndexOrThrow18);
                    workSpec2.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(columnIndexOrThrow19));
                    workSpec2.backoffDelayDuration = cursorQuery.getLong(columnIndexOrThrow20);
                    workSpec2.periodStartTime = cursorQuery.getLong(columnIndexOrThrow21);
                    workSpec2.minimumRetentionDuration = cursorQuery.getLong(columnIndexOrThrow22);
                    workSpec2.scheduleRequestedAt = cursorQuery.getLong(columnIndexOrThrow23);
                    workSpec2.expedited = cursorQuery.getInt(columnIndexOrThrow24) != 0;
                    workSpec2.outOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(cursorQuery.getInt(columnIndexOrThrow25));
                    workSpec2.constraints = constraints;
                    workSpec = workSpec2;
                } else {
                    workSpec = null;
                }
                cursorQuery.close();
                roomSQLiteQuery.release();
                return workSpec;
            } catch (Throwable th2) {
                th = th2;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(roomDatabase, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                WorkSpec.IdAndState idAndState = new WorkSpec.IdAndState();
                idAndState.id = cursorQuery.getString(columnIndexOrThrow);
                idAndState.state = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                arrayList.add(idAndState);
            }
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            return arrayList;
        } catch (Throwable th2) {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkSpec[] getWorkSpecs(List<String> list) throws Throwable {
        RoomSQLiteQuery roomSQLiteQuery;
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT ");
        sbNewStringBuilder.append(ProxyConfig.MATCH_ALL_SCHEMES);
        sbNewStringBuilder.append(" FROM workspec WHERE id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size);
        int i10 = 1;
        for (String str : list) {
            if (str == null) {
                roomSQLiteQueryAcquire.bindNull(i10);
            } else {
                roomSQLiteQueryAcquire.bindString(i10, str);
            }
            i10++;
        }
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(roomDatabase, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "required_network_type");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_charging");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_device_idle");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_battery_not_low");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "requires_storage_not_low");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_content_update_delay");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "trigger_max_content_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "content_uri_triggers");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "worker_class_name");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input_merger_class_name");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "input");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "output");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "initial_delay");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "interval_duration");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "flex_duration");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_policy");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backoff_delay_duration");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "period_start_time");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "minimum_retention_duration");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "schedule_requested_at");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_in_foreground");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "out_of_quota_policy");
                WorkSpec[] workSpecArr = new WorkSpec[cursorQuery.getCount()];
                int i11 = 0;
                while (cursorQuery.moveToNext()) {
                    WorkSpec[] workSpecArr2 = workSpecArr;
                    String string = cursorQuery.getString(columnIndexOrThrow9);
                    int i12 = columnIndexOrThrow9;
                    String string2 = cursorQuery.getString(columnIndexOrThrow11);
                    int i13 = columnIndexOrThrow11;
                    Constraints constraints = new Constraints();
                    int i14 = columnIndexOrThrow;
                    constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(cursorQuery.getInt(columnIndexOrThrow)));
                    constraints.setRequiresCharging(cursorQuery.getInt(columnIndexOrThrow2) != 0);
                    constraints.setRequiresDeviceIdle(cursorQuery.getInt(columnIndexOrThrow3) != 0);
                    constraints.setRequiresBatteryNotLow(cursorQuery.getInt(columnIndexOrThrow4) != 0);
                    constraints.setRequiresStorageNotLow(cursorQuery.getInt(columnIndexOrThrow5) != 0);
                    int i15 = columnIndexOrThrow2;
                    int i16 = columnIndexOrThrow3;
                    constraints.setTriggerContentUpdateDelay(cursorQuery.getLong(columnIndexOrThrow6));
                    constraints.setTriggerMaxContentDelay(cursorQuery.getLong(columnIndexOrThrow7));
                    constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(cursorQuery.getBlob(columnIndexOrThrow8)));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.state = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow10));
                    workSpec.inputMergerClassName = cursorQuery.getString(columnIndexOrThrow12);
                    workSpec.input = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow13));
                    workSpec.output = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow14));
                    int i17 = columnIndexOrThrow12;
                    int i18 = columnIndexOrThrow14;
                    int i19 = columnIndexOrThrow15;
                    workSpec.initialDelay = cursorQuery.getLong(i19);
                    columnIndexOrThrow15 = i19;
                    int i20 = columnIndexOrThrow16;
                    workSpec.intervalDuration = cursorQuery.getLong(i20);
                    columnIndexOrThrow16 = i20;
                    int i21 = columnIndexOrThrow17;
                    workSpec.flexDuration = cursorQuery.getLong(i21);
                    int i22 = columnIndexOrThrow18;
                    workSpec.runAttemptCount = cursorQuery.getInt(i22);
                    int i23 = columnIndexOrThrow19;
                    workSpec.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(i23));
                    columnIndexOrThrow19 = i23;
                    int i24 = columnIndexOrThrow20;
                    workSpec.backoffDelayDuration = cursorQuery.getLong(i24);
                    int i25 = columnIndexOrThrow21;
                    workSpec.periodStartTime = cursorQuery.getLong(i25);
                    columnIndexOrThrow21 = i25;
                    int i26 = columnIndexOrThrow22;
                    workSpec.minimumRetentionDuration = cursorQuery.getLong(i26);
                    columnIndexOrThrow22 = i26;
                    int i27 = columnIndexOrThrow23;
                    workSpec.scheduleRequestedAt = cursorQuery.getLong(i27);
                    int i28 = columnIndexOrThrow24;
                    workSpec.expedited = cursorQuery.getInt(i28) != 0;
                    int i29 = columnIndexOrThrow25;
                    workSpec.outOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(cursorQuery.getInt(i29));
                    workSpec.constraints = constraints;
                    workSpecArr2[i11] = workSpec;
                    i11++;
                    columnIndexOrThrow25 = i29;
                    columnIndexOrThrow12 = i17;
                    columnIndexOrThrow2 = i15;
                    columnIndexOrThrow23 = i27;
                    columnIndexOrThrow11 = i13;
                    columnIndexOrThrow3 = i16;
                    columnIndexOrThrow = i14;
                    columnIndexOrThrow24 = i28;
                    columnIndexOrThrow20 = i24;
                    columnIndexOrThrow14 = i18;
                    workSpecArr = workSpecArr2;
                    columnIndexOrThrow9 = i12;
                    columnIndexOrThrow18 = i22;
                    columnIndexOrThrow17 = i21;
                }
                WorkSpec[] workSpecArr3 = workSpecArr;
                cursorQuery.close();
                roomSQLiteQuery.release();
                return workSpecArr3;
            } catch (Throwable th2) {
                th = th2;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkSpec.WorkInfoPojo getWorkStatusPojoForId(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count FROM workspec WHERE id=?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        roomDatabase.beginTransaction();
        WorkSpec.WorkInfoPojo workInfoPojo = null;
        try {
            Cursor cursorQuery = DBUtil.query(roomDatabase, roomSQLiteQueryAcquire, true, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "output");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                ArrayMap<String, ArrayList<String>> arrayMap = new ArrayMap<>();
                ArrayMap<String, ArrayList<Data>> arrayMap2 = new ArrayMap<>();
                while (cursorQuery.moveToNext()) {
                    if (!cursorQuery.isNull(columnIndexOrThrow)) {
                        String string = cursorQuery.getString(columnIndexOrThrow);
                        if (arrayMap.get(string) == null) {
                            arrayMap.put(string, new ArrayList<>());
                        }
                    }
                    if (!cursorQuery.isNull(columnIndexOrThrow)) {
                        String string2 = cursorQuery.getString(columnIndexOrThrow);
                        if (arrayMap2.get(string2) == null) {
                            arrayMap2.put(string2, new ArrayList<>());
                        }
                    }
                }
                cursorQuery.moveToPosition(-1);
                b(arrayMap);
                a(arrayMap2);
                if (cursorQuery.moveToFirst()) {
                    ArrayList<String> arrayList = !cursorQuery.isNull(columnIndexOrThrow) ? arrayMap.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    ArrayList<Data> arrayList2 = cursorQuery.isNull(columnIndexOrThrow) ? null : arrayMap2.get(cursorQuery.getString(columnIndexOrThrow));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    WorkSpec.WorkInfoPojo workInfoPojo2 = new WorkSpec.WorkInfoPojo();
                    workInfoPojo2.id = cursorQuery.getString(columnIndexOrThrow);
                    workInfoPojo2.state = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                    workInfoPojo2.output = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow3));
                    workInfoPojo2.runAttemptCount = cursorQuery.getInt(columnIndexOrThrow4);
                    workInfoPojo2.tags = arrayList;
                    workInfoPojo2.progress = arrayList2;
                    workInfoPojo = workInfoPojo2;
                }
                roomDatabase.setTransactionSuccessful();
                cursorQuery.close();
                roomSQLiteQueryAcquire.release();
                roomDatabase.endTransaction();
                return workInfoPojo;
            } catch (Throwable th2) {
                cursorQuery.close();
                roomSQLiteQueryAcquire.release();
                throw th2;
            }
        } catch (Throwable th3) {
            roomDatabase.endTransaction();
            throw th3;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(List<String> list) {
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size);
        int i10 = 1;
        for (String str : list) {
            if (str == null) {
                roomSQLiteQueryAcquire.bindNull(i10);
            } else {
                roomSQLiteQueryAcquire.bindString(i10, str);
            }
            i10++;
        }
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        roomDatabase.beginTransaction();
        try {
            Cursor cursorQuery = DBUtil.query(roomDatabase, roomSQLiteQueryAcquire, true, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "output");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                ArrayMap<String, ArrayList<String>> arrayMap = new ArrayMap<>();
                ArrayMap<String, ArrayList<Data>> arrayMap2 = new ArrayMap<>();
                while (cursorQuery.moveToNext()) {
                    if (!cursorQuery.isNull(columnIndexOrThrow)) {
                        String string = cursorQuery.getString(columnIndexOrThrow);
                        if (arrayMap.get(string) == null) {
                            arrayMap.put(string, new ArrayList<>());
                        }
                    }
                    if (!cursorQuery.isNull(columnIndexOrThrow)) {
                        String string2 = cursorQuery.getString(columnIndexOrThrow);
                        if (arrayMap2.get(string2) == null) {
                            arrayMap2.put(string2, new ArrayList<>());
                        }
                    }
                }
                cursorQuery.moveToPosition(-1);
                b(arrayMap);
                a(arrayMap2);
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    ArrayList<String> arrayList2 = !cursorQuery.isNull(columnIndexOrThrow) ? arrayMap.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    ArrayList<Data> arrayList3 = !cursorQuery.isNull(columnIndexOrThrow) ? arrayMap2.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList<>();
                    }
                    WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                    workInfoPojo.id = cursorQuery.getString(columnIndexOrThrow);
                    workInfoPojo.state = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                    workInfoPojo.output = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow3));
                    workInfoPojo.runAttemptCount = cursorQuery.getInt(columnIndexOrThrow4);
                    workInfoPojo.tags = arrayList2;
                    workInfoPojo.progress = arrayList3;
                    arrayList.add(workInfoPojo);
                }
                roomDatabase.setTransactionSuccessful();
                cursorQuery.close();
                roomSQLiteQueryAcquire.release();
                roomDatabase.endTransaction();
                return arrayList;
            } catch (Throwable th2) {
                cursorQuery.close();
                roomSQLiteQueryAcquire.release();
                throw th2;
            }
        } catch (Throwable th3) {
            roomDatabase.endTransaction();
            throw th3;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        roomDatabase.beginTransaction();
        try {
            Cursor cursorQuery = DBUtil.query(roomDatabase, roomSQLiteQueryAcquire, true, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "output");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                ArrayMap<String, ArrayList<String>> arrayMap = new ArrayMap<>();
                ArrayMap<String, ArrayList<Data>> arrayMap2 = new ArrayMap<>();
                while (cursorQuery.moveToNext()) {
                    if (!cursorQuery.isNull(columnIndexOrThrow)) {
                        String string = cursorQuery.getString(columnIndexOrThrow);
                        if (arrayMap.get(string) == null) {
                            arrayMap.put(string, new ArrayList<>());
                        }
                    }
                    if (!cursorQuery.isNull(columnIndexOrThrow)) {
                        String string2 = cursorQuery.getString(columnIndexOrThrow);
                        if (arrayMap2.get(string2) == null) {
                            arrayMap2.put(string2, new ArrayList<>());
                        }
                    }
                }
                cursorQuery.moveToPosition(-1);
                b(arrayMap);
                a(arrayMap2);
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    ArrayList<String> arrayList2 = !cursorQuery.isNull(columnIndexOrThrow) ? arrayMap.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    ArrayList<Data> arrayList3 = !cursorQuery.isNull(columnIndexOrThrow) ? arrayMap2.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList<>();
                    }
                    WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                    workInfoPojo.id = cursorQuery.getString(columnIndexOrThrow);
                    workInfoPojo.state = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                    workInfoPojo.output = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow3));
                    workInfoPojo.runAttemptCount = cursorQuery.getInt(columnIndexOrThrow4);
                    workInfoPojo.tags = arrayList2;
                    workInfoPojo.progress = arrayList3;
                    arrayList.add(workInfoPojo);
                }
                roomDatabase.setTransactionSuccessful();
                cursorQuery.close();
                roomSQLiteQueryAcquire.release();
                roomDatabase.endTransaction();
                return arrayList;
            } catch (Throwable th2) {
                cursorQuery.close();
                roomSQLiteQueryAcquire.release();
                throw th2;
            }
        } catch (Throwable th3) {
            roomDatabase.endTransaction();
            throw th3;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        roomDatabase.beginTransaction();
        try {
            Cursor cursorQuery = DBUtil.query(roomDatabase, roomSQLiteQueryAcquire, true, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "output");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "run_attempt_count");
                ArrayMap<String, ArrayList<String>> arrayMap = new ArrayMap<>();
                ArrayMap<String, ArrayList<Data>> arrayMap2 = new ArrayMap<>();
                while (cursorQuery.moveToNext()) {
                    if (!cursorQuery.isNull(columnIndexOrThrow)) {
                        String string = cursorQuery.getString(columnIndexOrThrow);
                        if (arrayMap.get(string) == null) {
                            arrayMap.put(string, new ArrayList<>());
                        }
                    }
                    if (!cursorQuery.isNull(columnIndexOrThrow)) {
                        String string2 = cursorQuery.getString(columnIndexOrThrow);
                        if (arrayMap2.get(string2) == null) {
                            arrayMap2.put(string2, new ArrayList<>());
                        }
                    }
                }
                cursorQuery.moveToPosition(-1);
                b(arrayMap);
                a(arrayMap2);
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    ArrayList<String> arrayList2 = !cursorQuery.isNull(columnIndexOrThrow) ? arrayMap.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    ArrayList<Data> arrayList3 = !cursorQuery.isNull(columnIndexOrThrow) ? arrayMap2.get(cursorQuery.getString(columnIndexOrThrow)) : null;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList<>();
                    }
                    WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                    workInfoPojo.id = cursorQuery.getString(columnIndexOrThrow);
                    workInfoPojo.state = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndexOrThrow2));
                    workInfoPojo.output = Data.fromByteArray(cursorQuery.getBlob(columnIndexOrThrow3));
                    workInfoPojo.runAttemptCount = cursorQuery.getInt(columnIndexOrThrow4);
                    workInfoPojo.tags = arrayList2;
                    workInfoPojo.progress = arrayList3;
                    arrayList.add(workInfoPojo);
                }
                roomDatabase.setTransactionSuccessful();
                cursorQuery.close();
                roomSQLiteQueryAcquire.release();
                roomDatabase.endTransaction();
                return arrayList;
            } catch (Throwable th2) {
                cursorQuery.close();
                roomSQLiteQueryAcquire.release();
                throw th2;
            }
        } catch (Throwable th3) {
            roomDatabase.endTransaction();
            throw th3;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForIds(List<String> list) {
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size);
        int i10 = 1;
        for (String str : list) {
            if (str == null) {
                roomSQLiteQueryAcquire.bindNull(i10);
            } else {
                roomSQLiteQueryAcquire.bindString(i10, str);
            }
            i10++;
        }
        return this.f24569a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, new b(roomSQLiteQueryAcquire));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForName(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        return this.f24569a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, new d(roomSQLiteQueryAcquire));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForTag(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        return this.f24569a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, new c(roomSQLiteQueryAcquire));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public boolean hasUnfinishedWork() {
        boolean z10 = false;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(roomDatabase, roomSQLiteQueryAcquire, false, null);
        try {
            if (cursorQuery.moveToFirst() && cursorQuery.getInt(0) != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int incrementWorkSpecRunAttemptCount(String str) {
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        j jVar = this.f24574f;
        SupportSQLiteStatement supportSQLiteStatementAcquire = jVar.acquire();
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str);
        }
        roomDatabase.beginTransaction();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementAcquire.executeUpdateDelete();
            roomDatabase.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            roomDatabase.endTransaction();
            jVar.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void insertWorkSpec(WorkSpec workSpec) {
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        roomDatabase.beginTransaction();
        try {
            this.f24570b.insert(workSpec);
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int markWorkSpecScheduled(String str, long j10) {
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        l lVar = this.f24576h;
        SupportSQLiteStatement supportSQLiteStatementAcquire = lVar.acquire();
        supportSQLiteStatementAcquire.bindLong(1, j10);
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(2);
        } else {
            supportSQLiteStatementAcquire.bindString(2, str);
        }
        roomDatabase.beginTransaction();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementAcquire.executeUpdateDelete();
            roomDatabase.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            roomDatabase.endTransaction();
            lVar.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast() {
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        n nVar = this.f24578j;
        SupportSQLiteStatement supportSQLiteStatementAcquire = nVar.acquire();
        roomDatabase.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
            nVar.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int resetScheduledState() {
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        m mVar = this.f24577i;
        SupportSQLiteStatement supportSQLiteStatementAcquire = mVar.acquire();
        roomDatabase.beginTransaction();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementAcquire.executeUpdateDelete();
            roomDatabase.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            roomDatabase.endTransaction();
            mVar.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int resetWorkSpecRunAttemptCount(String str) {
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        k kVar = this.f24575g;
        SupportSQLiteStatement supportSQLiteStatementAcquire = kVar.acquire();
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, str);
        }
        roomDatabase.beginTransaction();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementAcquire.executeUpdateDelete();
            roomDatabase.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            roomDatabase.endTransaction();
            kVar.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setOutput(String str, Data data) throws Throwable {
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        h hVar = this.f24572d;
        SupportSQLiteStatement supportSQLiteStatementAcquire = hVar.acquire();
        byte[] byteArrayInternal = Data.toByteArrayInternal(data);
        if (byteArrayInternal == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindBlob(1, byteArrayInternal);
        }
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(2);
        } else {
            supportSQLiteStatementAcquire.bindString(2, str);
        }
        roomDatabase.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
            hVar.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setPeriodStartTime(String str, long j10) {
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        i iVar = this.f24573e;
        SupportSQLiteStatement supportSQLiteStatementAcquire = iVar.acquire();
        supportSQLiteStatementAcquire.bindLong(1, j10);
        if (str == null) {
            supportSQLiteStatementAcquire.bindNull(2);
        } else {
            supportSQLiteStatementAcquire.bindString(2, str);
        }
        roomDatabase.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            roomDatabase.setTransactionSuccessful();
        } finally {
            roomDatabase.endTransaction();
            iVar.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int setState(WorkInfo.State state, String... strArr) {
        RoomDatabase roomDatabase = this.f24569a;
        roomDatabase.assertNotSuspendingTransaction();
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("UPDATE workspec SET state=");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" WHERE id IN (");
        StringUtil.appendPlaceholders(sbNewStringBuilder, strArr.length);
        sbNewStringBuilder.append(")");
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = roomDatabase.compileStatement(sbNewStringBuilder.toString());
        supportSQLiteStatementCompileStatement.bindLong(1, WorkTypeConverters.stateToInt(state));
        int i10 = 2;
        for (String str : strArr) {
            if (str == null) {
                supportSQLiteStatementCompileStatement.bindNull(i10);
            } else {
                supportSQLiteStatementCompileStatement.bindString(i10, str);
            }
            i10++;
        }
        roomDatabase.beginTransaction();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementCompileStatement.executeUpdateDelete();
            roomDatabase.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            roomDatabase.endTransaction();
        }
    }
}
