package androidx.work.impl.model;

import android.database.Cursor;
import androidx.collection.ArrayMap;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class RawWorkInfoDao_Impl implements RawWorkInfoDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f24556a;

    public class a implements Callable<List<WorkSpec.WorkInfoPojo>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SupportSQLiteQuery f24557p0;

        public a(SupportSQLiteQuery supportSQLiteQuery) {
            this.f24557p0 = supportSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        public final List<WorkSpec.WorkInfoPojo> call() throws Exception {
            RawWorkInfoDao_Impl rawWorkInfoDao_Impl = RawWorkInfoDao_Impl.this;
            Cursor cursorQuery = DBUtil.query(rawWorkInfoDao_Impl.f24556a, this.f24557p0, true, null);
            try {
                int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "id");
                int columnIndex2 = CursorUtil.getColumnIndex(cursorQuery, "state");
                int columnIndex3 = CursorUtil.getColumnIndex(cursorQuery, "output");
                int columnIndex4 = CursorUtil.getColumnIndex(cursorQuery, "run_attempt_count");
                ArrayMap<String, ArrayList<String>> arrayMap = new ArrayMap<>();
                ArrayMap<String, ArrayList<Data>> arrayMap2 = new ArrayMap<>();
                while (cursorQuery.moveToNext()) {
                    if (!cursorQuery.isNull(columnIndex)) {
                        String string = cursorQuery.getString(columnIndex);
                        if (arrayMap.get(string) == null) {
                            arrayMap.put(string, new ArrayList<>());
                        }
                    }
                    if (!cursorQuery.isNull(columnIndex)) {
                        String string2 = cursorQuery.getString(columnIndex);
                        if (arrayMap2.get(string2) == null) {
                            arrayMap2.put(string2, new ArrayList<>());
                        }
                    }
                }
                cursorQuery.moveToPosition(-1);
                rawWorkInfoDao_Impl.b(arrayMap);
                rawWorkInfoDao_Impl.a(arrayMap2);
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    ArrayList<String> arrayList2 = !cursorQuery.isNull(columnIndex) ? arrayMap.get(cursorQuery.getString(columnIndex)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    ArrayList<Data> arrayList3 = !cursorQuery.isNull(columnIndex) ? arrayMap2.get(cursorQuery.getString(columnIndex)) : null;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList<>();
                    }
                    WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                    if (columnIndex != -1) {
                        workInfoPojo.id = cursorQuery.getString(columnIndex);
                    }
                    if (columnIndex2 != -1) {
                        workInfoPojo.state = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndex2));
                    }
                    if (columnIndex3 != -1) {
                        workInfoPojo.output = Data.fromByteArray(cursorQuery.getBlob(columnIndex3));
                    }
                    if (columnIndex4 != -1) {
                        workInfoPojo.runAttemptCount = cursorQuery.getInt(columnIndex4);
                    }
                    workInfoPojo.tags = arrayList2;
                    workInfoPojo.progress = arrayList3;
                    arrayList.add(workInfoPojo);
                }
                return arrayList;
            } finally {
                cursorQuery.close();
            }
        }
    }

    public RawWorkInfoDao_Impl(RoomDatabase roomDatabase) {
        this.f24556a = roomDatabase;
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
        Cursor cursorQuery = DBUtil.query(this.f24556a, roomSQLiteQueryAcquire, false, null);
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
        Cursor cursorQuery = DBUtil.query(this.f24556a, roomSQLiteQueryAcquire, false, null);
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

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(SupportSQLiteQuery supportSQLiteQuery) {
        RoomDatabase roomDatabase = this.f24556a;
        roomDatabase.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(roomDatabase, supportSQLiteQuery, true, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "id");
            int columnIndex2 = CursorUtil.getColumnIndex(cursorQuery, "state");
            int columnIndex3 = CursorUtil.getColumnIndex(cursorQuery, "output");
            int columnIndex4 = CursorUtil.getColumnIndex(cursorQuery, "run_attempt_count");
            ArrayMap<String, ArrayList<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, ArrayList<Data>> arrayMap2 = new ArrayMap<>();
            while (cursorQuery.moveToNext()) {
                if (!cursorQuery.isNull(columnIndex)) {
                    String string = cursorQuery.getString(columnIndex);
                    if (arrayMap.get(string) == null) {
                        arrayMap.put(string, new ArrayList<>());
                    }
                }
                if (!cursorQuery.isNull(columnIndex)) {
                    String string2 = cursorQuery.getString(columnIndex);
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
                ArrayList<String> arrayList2 = !cursorQuery.isNull(columnIndex) ? arrayMap.get(cursorQuery.getString(columnIndex)) : null;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                ArrayList<Data> arrayList3 = !cursorQuery.isNull(columnIndex) ? arrayMap2.get(cursorQuery.getString(columnIndex)) : null;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                }
                WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                if (columnIndex != -1) {
                    workInfoPojo.id = cursorQuery.getString(columnIndex);
                }
                if (columnIndex2 != -1) {
                    workInfoPojo.state = WorkTypeConverters.intToState(cursorQuery.getInt(columnIndex2));
                }
                if (columnIndex3 != -1) {
                    workInfoPojo.output = Data.fromByteArray(cursorQuery.getBlob(columnIndex3));
                }
                if (columnIndex4 != -1) {
                    workInfoPojo.runAttemptCount = cursorQuery.getInt(columnIndex4);
                }
                workInfoPojo.tags = arrayList2;
                workInfoPojo.progress = arrayList3;
                arrayList.add(workInfoPojo);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
        }
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(SupportSQLiteQuery supportSQLiteQuery) {
        return this.f24556a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, new a(supportSQLiteQuery));
    }
}
