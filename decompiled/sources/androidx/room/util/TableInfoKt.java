package androidx.room.util;

import android.database.Cursor;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.sqlite.db.SupportSQLiteDatabase;
import bk.d;
import bk.p;
import bk.q;
import bk.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TableInfo.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0006"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "", "tableName", "Landroidx/room/util/TableInfo;", "readTableInfo", "room-runtime_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTableInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfoKt\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,646:1\n145#2,2:647\n148#2,2:654\n151#2:660\n145#2,7:661\n145#2,7:668\n145#2,7:675\n766#3:649\n857#3,2:650\n1855#3,2:652\n857#3,2:656\n1855#3,2:658\n*S KotlinDebug\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfoKt\n*L\n477#1:647,2\n477#1:654,2\n477#1:660\n542#1:661,7\n580#1:668,7\n613#1:675,7\n497#1:649\n497#1:650,2\n499#1:652,2\n497#1:656,2\n499#1:658,2\n*E\n"})
public final class TableInfoKt {
    @NotNull
    public static final TableInfo readTableInfo(@NotNull SupportSQLiteDatabase supportSQLiteDatabase, @NotNull String tableName) {
        Map mapBuild;
        Set set;
        String str;
        int i10;
        int i11;
        Throwable th2;
        TableInfo.Index index;
        SupportSQLiteDatabase database = supportSQLiteDatabase;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        StringBuilder sb2 = new StringBuilder("PRAGMA table_info(`");
        sb2.append(tableName);
        String str2 = "`)";
        sb2.append("`)");
        Cursor cursorQuery = database.query(sb2.toString());
        try {
            String str3 = "name";
            if (cursorQuery.getColumnCount() <= 0) {
                mapBuild = q.emptyMap();
                CloseableKt.closeFinally(cursorQuery, null);
            } else {
                int columnIndex = cursorQuery.getColumnIndex("name");
                int columnIndex2 = cursorQuery.getColumnIndex("type");
                int columnIndex3 = cursorQuery.getColumnIndex("notnull");
                int columnIndex4 = cursorQuery.getColumnIndex("pk");
                int columnIndex5 = cursorQuery.getColumnIndex("dflt_value");
                Map mapCreateMapBuilder = p.createMapBuilder();
                while (cursorQuery.moveToNext()) {
                    String name = cursorQuery.getString(columnIndex);
                    String type = cursorQuery.getString(columnIndex2);
                    boolean z10 = cursorQuery.getInt(columnIndex3) != 0;
                    int i12 = cursorQuery.getInt(columnIndex4);
                    String string = cursorQuery.getString(columnIndex5);
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    Intrinsics.checkNotNullExpressionValue(type, "type");
                    mapCreateMapBuilder.put(name, new TableInfo.Column(name, type, z10, i12, string, 2));
                    columnIndex = columnIndex;
                }
                mapBuild = p.build(mapCreateMapBuilder);
                CloseableKt.closeFinally(cursorQuery, null);
            }
            Cursor cursorQuery2 = database.query("PRAGMA foreign_key_list(`" + tableName + "`)");
            try {
                int columnIndex6 = cursorQuery2.getColumnIndex("id");
                int columnIndex7 = cursorQuery2.getColumnIndex("seq");
                int columnIndex8 = cursorQuery2.getColumnIndex("table");
                int columnIndex9 = cursorQuery2.getColumnIndex("on_delete");
                int columnIndex10 = cursorQuery2.getColumnIndex("on_update");
                int columnIndex11 = cursorQuery2.getColumnIndex("id");
                int columnIndex12 = cursorQuery2.getColumnIndex("seq");
                int columnIndex13 = cursorQuery2.getColumnIndex("from");
                int columnIndex14 = cursorQuery2.getColumnIndex(TypedValues.TransitionType.S_TO);
                List listCreateListBuilder = d.createListBuilder();
                while (cursorQuery2.moveToNext()) {
                    String str4 = str3;
                    int i13 = cursorQuery2.getInt(columnIndex11);
                    int i14 = columnIndex11;
                    int i15 = cursorQuery2.getInt(columnIndex12);
                    int i16 = columnIndex12;
                    String string2 = cursorQuery2.getString(columnIndex13);
                    int i17 = columnIndex13;
                    Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(fromColumnIndex)");
                    String string3 = cursorQuery2.getString(columnIndex14);
                    Intrinsics.checkNotNullExpressionValue(string3, "cursor.getString(toColumnIndex)");
                    listCreateListBuilder.add(new TableInfo.ForeignKeyWithSequence(i13, i15, string2, string3));
                    mapBuild = mapBuild;
                    str3 = str4;
                    columnIndex11 = i14;
                    columnIndex12 = i16;
                    columnIndex13 = i17;
                    columnIndex14 = columnIndex14;
                }
                Map map = mapBuild;
                String str5 = str3;
                List listSorted = CollectionsKt___CollectionsKt.sorted(d.build(listCreateListBuilder));
                cursorQuery2.moveToPosition(-1);
                Set setCreateSetBuilder = v.createSetBuilder();
                while (cursorQuery2.moveToNext()) {
                    if (cursorQuery2.getInt(columnIndex7) == 0) {
                        int i18 = cursorQuery2.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList<TableInfo.ForeignKeyWithSequence> arrayList3 = new ArrayList();
                        for (Object obj : listSorted) {
                            List list = listSorted;
                            int i19 = columnIndex6;
                            if (((TableInfo.ForeignKeyWithSequence) obj).getId() == i18) {
                                arrayList3.add(obj);
                            }
                            listSorted = list;
                            columnIndex6 = i19;
                        }
                        List list2 = listSorted;
                        int i20 = columnIndex6;
                        for (TableInfo.ForeignKeyWithSequence foreignKeyWithSequence : arrayList3) {
                            arrayList.add(foreignKeyWithSequence.getFrom());
                            arrayList2.add(foreignKeyWithSequence.getAndroidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO java.lang.String());
                        }
                        String string4 = cursorQuery2.getString(columnIndex8);
                        Intrinsics.checkNotNullExpressionValue(string4, "cursor.getString(tableColumnIndex)");
                        String string5 = cursorQuery2.getString(columnIndex9);
                        Intrinsics.checkNotNullExpressionValue(string5, "cursor.getString(onDeleteColumnIndex)");
                        String string6 = cursorQuery2.getString(columnIndex10);
                        Intrinsics.checkNotNullExpressionValue(string6, "cursor.getString(onUpdateColumnIndex)");
                        setCreateSetBuilder.add(new TableInfo.ForeignKey(string4, string5, string6, arrayList, arrayList2));
                        listSorted = list2;
                        columnIndex6 = i20;
                    }
                }
                Set setBuild = v.build(setCreateSetBuilder);
                CloseableKt.closeFinally(cursorQuery2, null);
                Cursor cursorQuery3 = database.query("PRAGMA index_list(`" + tableName + "`)");
                String str6 = str5;
                try {
                    int columnIndex15 = cursorQuery3.getColumnIndex(str6);
                    int columnIndex16 = cursorQuery3.getColumnIndex("origin");
                    int columnIndex17 = cursorQuery3.getColumnIndex("unique");
                    if (columnIndex15 == -1 || columnIndex16 == -1 || columnIndex17 == -1) {
                        CloseableKt.closeFinally(cursorQuery3, null);
                        set = null;
                    } else {
                        Set setCreateSetBuilder2 = v.createSetBuilder();
                        while (cursorQuery3.moveToNext()) {
                            if (Intrinsics.areEqual("c", cursorQuery3.getString(columnIndex16))) {
                                String string7 = cursorQuery3.getString(columnIndex15);
                                boolean z11 = cursorQuery3.getInt(columnIndex17) == 1;
                                Intrinsics.checkNotNullExpressionValue(string7, str6);
                                Cursor cursorQuery4 = database.query("PRAGMA index_xinfo(`" + string7 + str2);
                                try {
                                    int columnIndex18 = cursorQuery4.getColumnIndex("seqno");
                                    int columnIndex19 = cursorQuery4.getColumnIndex("cid");
                                    int columnIndex20 = cursorQuery4.getColumnIndex(str6);
                                    int columnIndex21 = cursorQuery4.getColumnIndex("desc");
                                    String str7 = str6;
                                    if (columnIndex18 == -1 || columnIndex19 == -1 || columnIndex20 == -1 || columnIndex21 == -1) {
                                        str = str2;
                                        i10 = columnIndex16;
                                        i11 = columnIndex17;
                                        th2 = null;
                                        CloseableKt.closeFinally(cursorQuery4, null);
                                        index = null;
                                    } else {
                                        TreeMap treeMap = new TreeMap();
                                        TreeMap treeMap2 = new TreeMap();
                                        while (cursorQuery4.moveToNext()) {
                                            if (cursorQuery4.getInt(columnIndex19) >= 0) {
                                                int i21 = cursorQuery4.getInt(columnIndex18);
                                                String str8 = str2;
                                                String columnName = cursorQuery4.getString(columnIndex20);
                                                int i22 = columnIndex21;
                                                String str9 = cursorQuery4.getInt(columnIndex21) > 0 ? "DESC" : "ASC";
                                                int i23 = columnIndex16;
                                                Integer numValueOf = Integer.valueOf(i21);
                                                Intrinsics.checkNotNullExpressionValue(columnName, "columnName");
                                                treeMap.put(numValueOf, columnName);
                                                treeMap2.put(Integer.valueOf(i21), str9);
                                                str2 = str8;
                                                columnIndex16 = i23;
                                                columnIndex21 = i22;
                                                columnIndex17 = columnIndex17;
                                            }
                                        }
                                        str = str2;
                                        i10 = columnIndex16;
                                        i11 = columnIndex17;
                                        Collection collectionValues = treeMap.values();
                                        Intrinsics.checkNotNullExpressionValue(collectionValues, "columnsMap.values");
                                        List list3 = CollectionsKt___CollectionsKt.toList(collectionValues);
                                        Collection collectionValues2 = treeMap2.values();
                                        Intrinsics.checkNotNullExpressionValue(collectionValues2, "ordersMap.values");
                                        TableInfo.Index index2 = new TableInfo.Index(string7, z11, list3, CollectionsKt___CollectionsKt.toList(collectionValues2));
                                        CloseableKt.closeFinally(cursorQuery4, null);
                                        index = index2;
                                        th2 = null;
                                    }
                                    if (index == null) {
                                        CloseableKt.closeFinally(cursorQuery3, th2);
                                        set = null;
                                    } else {
                                        setCreateSetBuilder2.add(index);
                                        database = supportSQLiteDatabase;
                                        str6 = str7;
                                        columnIndex15 = columnIndex15;
                                        str2 = str;
                                        columnIndex16 = i10;
                                        columnIndex17 = i11;
                                    }
                                } catch (Throwable th3) {
                                    try {
                                        throw th3;
                                    } catch (Throwable th4) {
                                        CloseableKt.closeFinally(cursorQuery4, th3);
                                        throw th4;
                                    }
                                }
                            }
                        }
                        Set setBuild2 = v.build(setCreateSetBuilder2);
                        CloseableKt.closeFinally(cursorQuery3, null);
                        set = setBuild2;
                    }
                    return new TableInfo(tableName, map, setBuild, set);
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        CloseableKt.closeFinally(cursorQuery3, th5);
                        throw th6;
                    }
                }
            } catch (Throwable th7) {
                try {
                    throw th7;
                } catch (Throwable th8) {
                    CloseableKt.closeFinally(cursorQuery2, th7);
                    throw th8;
                }
            }
        } catch (Throwable th9) {
            try {
                throw th9;
            } catch (Throwable th10) {
                CloseableKt.closeFinally(cursorQuery, th9);
                throw th10;
            }
        }
    }
}
