package androidx.room.util;

import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.db.SupportSQLiteDatabase;
import bk.v;
import bk.w;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FtsTableInfo.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B%\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/room/util/FtsTableInfo;", "", "name", "", "columns", "", "createSql", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;)V", "options", "(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;)V", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Companion", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class FtsTableInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String[] f23395a = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    @JvmField
    @NotNull
    public final Set<String> columns;

    @JvmField
    @NotNull
    public final String name;

    @JvmField
    @NotNull
    public final Set<String> options;

    /* JADX INFO: compiled from: FtsTableInfo.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u0004H\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/room/util/FtsTableInfo$Companion;", "", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "", "tableName", "Landroidx/room/util/FtsTableInfo;", "read", "createStatement", "", "parseOptions", "", "FTS_OPTIONS", "[Ljava/lang/String;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFtsTableInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FtsTableInfo.kt\nandroidx/room/util/FtsTableInfo$Companion\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,182:1\n145#2,7:183\n145#2,7:190\n1183#3,2:197\n1185#3:222\n107#4:199\n79#4,22:200\n766#5:223\n857#5:224\n858#5:227\n12744#6,2:225\n*S KotlinDebug\n*F\n+ 1 FtsTableInfo.kt\nandroidx/room/util/FtsTableInfo$Companion\n*L\n94#1:183,7\n108#1:190,7\n148#1:197,2\n148#1:222\n163#1:199\n163#1:200,22\n173#1:223\n173#1:224\n173#1:227\n174#1:225,2\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @VisibleForTesting
        @NotNull
        public final Set<String> parseOptions(@NotNull String createStatement) {
            Character ch2;
            Intrinsics.checkNotNullParameter(createStatement, "createStatement");
            if (createStatement.length() == 0) {
                return w.emptySet();
            }
            String strSubstring = createStatement.substring(StringsKt__StringsKt.indexOf$default((CharSequence) createStatement, RootService.OPEN_BRACKET, 0, false, 6, (Object) null) + 1, StringsKt__StringsKt.lastIndexOf$default((CharSequence) createStatement, RootService.CLOSE_BRACKET, 0, false, 6, (Object) null));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            ArrayList arrayList = new ArrayList();
            ArrayDeque arrayDeque = new ArrayDeque();
            int i10 = -1;
            int i11 = 0;
            int i12 = 0;
            while (i11 < strSubstring.length()) {
                char cCharAt = strSubstring.charAt(i11);
                int i13 = i12 + 1;
                if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '`') {
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(cCharAt));
                    } else {
                        Character ch3 = (Character) arrayDeque.peek();
                        if (ch3 != null && ch3.charValue() == cCharAt) {
                            arrayDeque.pop();
                        }
                    }
                } else if (cCharAt == '[') {
                    if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(cCharAt));
                    }
                } else if (cCharAt == ']') {
                    if (!arrayDeque.isEmpty() && (ch2 = (Character) arrayDeque.peek()) != null && ch2.charValue() == '[') {
                        arrayDeque.pop();
                    }
                } else if (cCharAt == ',' && arrayDeque.isEmpty()) {
                    String strSubstring2 = strSubstring.substring(i10 + 1, i12);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    int length = strSubstring2.length() - 1;
                    int i14 = 0;
                    boolean z10 = false;
                    while (i14 <= length) {
                        boolean z11 = Intrinsics.compare((int) strSubstring2.charAt(!z10 ? i14 : length), 32) <= 0;
                        if (z10) {
                            if (!z11) {
                                break;
                            }
                            length--;
                        } else if (z11) {
                            i14++;
                        } else {
                            z10 = true;
                        }
                    }
                    arrayList.add(strSubstring2.subSequence(i14, length + 1).toString());
                    i10 = i12;
                }
                i11++;
                i12 = i13;
            }
            String strSubstring3 = strSubstring.substring(i10 + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
            arrayList.add(StringsKt__StringsKt.trim((CharSequence) strSubstring3).toString());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                String str = (String) obj;
                for (String str2 : FtsTableInfo.f23395a) {
                    if (l.startsWith$default(str, str2, false, 2, null)) {
                        arrayList2.add(obj);
                        break;
                    }
                }
            }
            return CollectionsKt___CollectionsKt.toSet(arrayList2);
        }

        @JvmStatic
        @NotNull
        public final FtsTableInfo read(@NotNull SupportSQLiteDatabase database, @NotNull String tableName) {
            Intrinsics.checkNotNullParameter(database, "database");
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            Set setCreateSetBuilder = v.createSetBuilder();
            Cursor cursorQuery = database.query("PRAGMA table_info(`" + tableName + "`)");
            try {
                if (cursorQuery.getColumnCount() > 0) {
                    int columnIndex = cursorQuery.getColumnIndex("name");
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(columnIndex);
                        Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(nameIndex)");
                        setCreateSetBuilder.add(string);
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursorQuery, null);
                Set setBuild = v.build(setCreateSetBuilder);
                Cursor cursorQuery2 = database.query("SELECT * FROM sqlite_master WHERE `name` = '" + tableName + '\'');
                try {
                    String sql = cursorQuery2.moveToFirst() ? cursorQuery2.getString(cursorQuery2.getColumnIndexOrThrow("sql")) : "";
                    CloseableKt.closeFinally(cursorQuery2, null);
                    Intrinsics.checkNotNullExpressionValue(sql, "sql");
                    return new FtsTableInfo(tableName, (Set<String>) setBuild, parseOptions(sql));
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(cursorQuery2, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    CloseableKt.closeFinally(cursorQuery, th4);
                    throw th5;
                }
            }
        }
    }

    public FtsTableInfo(@NotNull String name, @NotNull Set<String> columns, @NotNull Set<String> options) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(options, "options");
        this.name = name;
        this.columns = columns;
        this.options = options;
    }

    @JvmStatic
    @VisibleForTesting
    @NotNull
    public static final Set<String> parseOptions(@NotNull String str) {
        return INSTANCE.parseOptions(str);
    }

    @JvmStatic
    @NotNull
    public static final FtsTableInfo read(@NotNull SupportSQLiteDatabase supportSQLiteDatabase, @NotNull String str) {
        return INSTANCE.read(supportSQLiteDatabase, str);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FtsTableInfo)) {
            return false;
        }
        FtsTableInfo ftsTableInfo = (FtsTableInfo) other;
        if (Intrinsics.areEqual(this.name, ftsTableInfo.name) && Intrinsics.areEqual(this.columns, ftsTableInfo.columns)) {
            return Intrinsics.areEqual(this.options, ftsTableInfo.options);
        }
        return false;
    }

    public int hashCode() {
        return this.options.hashCode() + ((this.columns.hashCode() + (this.name.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "FtsTableInfo{name='" + this.name + "', columns=" + this.columns + ", options=" + this.options + "'}";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FtsTableInfo(@NotNull String name, @NotNull Set<String> columns, @NotNull String createSql) {
        this(name, columns, INSTANCE.parseOptions(createSql));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(createSql, "createSql");
    }
}
