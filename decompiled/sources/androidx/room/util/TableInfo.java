package androidx.room.util;

import ad.d;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.n1;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.room.ColumnInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import bk.w;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.android.gms.measurement.internal.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TableInfo.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0006\u0014\u0015\u0016\u0017\u0018\u0019B1\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nBA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016R\u001c\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Landroidx/room/util/TableInfo;", "", "name", "", "columns", "", "Landroidx/room/util/TableInfo$Column;", "foreignKeys", "", "Landroidx/room/util/TableInfo$ForeignKey;", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;)V", "indices", "Landroidx/room/util/TableInfo$Index;", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Column", "Companion", "CreatedFrom", "ForeignKey", "ForeignKeyWithSequence", "Index", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class TableInfo {
    public static final int CREATED_FROM_DATABASE = 2;
    public static final int CREATED_FROM_ENTITY = 1;
    public static final int CREATED_FROM_UNKNOWN = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public final Map<String, Column> columns;

    @JvmField
    @NotNull
    public final Set<ForeignKey> foreignKeys;

    @JvmField
    @Nullable
    public final Set<Index> indices;

    @JvmField
    @NotNull
    public final String name;

    /* JADX INFO: compiled from: TableInfo.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/room/util/TableInfo$Companion;", "", "()V", "CREATED_FROM_DATABASE", "", "CREATED_FROM_ENTITY", "CREATED_FROM_UNKNOWN", "read", "Landroidx/room/util/TableInfo;", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "tableName", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final TableInfo read(@NotNull SupportSQLiteDatabase database, @NotNull String tableName) {
            Intrinsics.checkNotNullParameter(database, "database");
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            return TableInfoKt.readTableInfo(database, tableName);
        }
    }

    /* JADX INFO: compiled from: TableInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/room/util/TableInfo$CreatedFrom;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface CreatedFrom {
    }

    /* JADX INFO: compiled from: TableInfo.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/room/util/TableInfo$ForeignKey;", "", "referenceTable", "", "onDelete", "onUpdate", "columnNames", "", "referenceColumnNames", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final class ForeignKey {

        @JvmField
        @NotNull
        public final List<String> columnNames;

        @JvmField
        @NotNull
        public final String onDelete;

        @JvmField
        @NotNull
        public final String onUpdate;

        @JvmField
        @NotNull
        public final List<String> referenceColumnNames;

        @JvmField
        @NotNull
        public final String referenceTable;

        public ForeignKey(@NotNull String referenceTable, @NotNull String onDelete, @NotNull String onUpdate, @NotNull List<String> columnNames, @NotNull List<String> referenceColumnNames) {
            Intrinsics.checkNotNullParameter(referenceTable, "referenceTable");
            Intrinsics.checkNotNullParameter(onDelete, "onDelete");
            Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
            Intrinsics.checkNotNullParameter(columnNames, "columnNames");
            Intrinsics.checkNotNullParameter(referenceColumnNames, "referenceColumnNames");
            this.referenceTable = referenceTable;
            this.onDelete = onDelete;
            this.onUpdate = onUpdate;
            this.columnNames = columnNames;
            this.referenceColumnNames = referenceColumnNames;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ForeignKey)) {
                return false;
            }
            ForeignKey foreignKey = (ForeignKey) other;
            if (Intrinsics.areEqual(this.referenceTable, foreignKey.referenceTable) && Intrinsics.areEqual(this.onDelete, foreignKey.onDelete) && Intrinsics.areEqual(this.onUpdate, foreignKey.onUpdate) && Intrinsics.areEqual(this.columnNames, foreignKey.columnNames)) {
                return Intrinsics.areEqual(this.referenceColumnNames, foreignKey.referenceColumnNames);
            }
            return false;
        }

        public int hashCode() {
            return this.referenceColumnNames.hashCode() + a.a(this.columnNames, n1.c(this.onUpdate, n1.c(this.onDelete, this.referenceTable.hashCode() * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ForeignKey{referenceTable='");
            sb2.append(this.referenceTable);
            sb2.append("', onDelete='");
            sb2.append(this.onDelete);
            sb2.append(" +', onUpdate='");
            sb2.append(this.onUpdate);
            sb2.append("', columnNames=");
            sb2.append(this.columnNames);
            sb2.append(", referenceColumnNames=");
            return bc.org.bouncycastle.math.ec.custom.sec.a.c(sb2, this.referenceColumnNames, AbstractJsonLexerKt.END_OBJ);
        }
    }

    /* JADX INFO: compiled from: TableInfo.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0018"}, d2 = {"Landroidx/room/util/TableInfo$ForeignKeyWithSequence;", "", "other", "", "compareTo", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getId", "()I", "id", "q0", "getSequence", "sequence", "", "r0", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "from", "s0", "getTo", TypedValues.TransitionType.S_TO, "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
    public static final class ForeignKeyWithSequence implements Comparable<ForeignKeyWithSequence> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        public final int id;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        public final int sequence;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String from;

        /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String to;

        public ForeignKeyWithSequence(int i10, int i11, @NotNull String from, @NotNull String to) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            this.id = i10;
            this.sequence = i11;
            this.from = from;
            this.to = to;
        }

        @NotNull
        public final String getFrom() {
            return this.from;
        }

        public final int getId() {
            return this.id;
        }

        public final int getSequence() {
            return this.sequence;
        }

        @NotNull
        public final String getTo() {
            return this.to;
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull ForeignKeyWithSequence other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int i10 = this.id - other.id;
            return i10 == 0 ? this.sequence - other.sequence : i10;
        }
    }

    public TableInfo(@NotNull String name, @NotNull Map<String, Column> columns, @NotNull Set<ForeignKey> foreignKeys, @Nullable Set<Index> set) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(foreignKeys, "foreignKeys");
        this.name = name;
        this.columns = columns;
        this.foreignKeys = foreignKeys;
        this.indices = set;
    }

    @JvmStatic
    @NotNull
    public static final TableInfo read(@NotNull SupportSQLiteDatabase supportSQLiteDatabase, @NotNull String str) {
        return INSTANCE.read(supportSQLiteDatabase, str);
    }

    public boolean equals(@Nullable Object other) {
        Set<Index> set;
        if (this == other) {
            return true;
        }
        if (!(other instanceof TableInfo)) {
            return false;
        }
        TableInfo tableInfo = (TableInfo) other;
        if (!Intrinsics.areEqual(this.name, tableInfo.name) || !Intrinsics.areEqual(this.columns, tableInfo.columns) || !Intrinsics.areEqual(this.foreignKeys, tableInfo.foreignKeys)) {
            return false;
        }
        Set<Index> set2 = this.indices;
        if (set2 == null || (set = tableInfo.indices) == null) {
            return true;
        }
        return Intrinsics.areEqual(set2, set);
    }

    public int hashCode() {
        return this.foreignKeys.hashCode() + ((this.columns.hashCode() + (this.name.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "TableInfo{name='" + this.name + "', columns=" + this.columns + ", foreignKeys=" + this.foreignKeys + ", indices=" + this.indices + AbstractJsonLexerKt.END_OBJ;
    }

    public /* synthetic */ TableInfo(String str, Map map, Set set, Set set2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, set, (i10 & 8) != 0 ? null : set2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TableInfo(@NotNull String name, @NotNull Map<String, Column> columns, @NotNull Set<ForeignKey> foreignKeys) {
        this(name, columns, foreignKeys, w.emptySet());
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(foreignKeys, "foreignKeys");
    }

    /* JADX INFO: compiled from: TableInfo.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/room/util/TableInfo$Index;", "", "name", "", "unique", "", "columns", "", "(Ljava/lang/String;ZLjava/util/List;)V", "orders", "(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Companion", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @SourceDebugExtension({"SMAP\nTableInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfo$Index\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,646:1\n1#2:647\n*E\n"})
    public static final class Index {

        @NotNull
        public static final String DEFAULT_PREFIX = "index_";

        @JvmField
        @NotNull
        public final List<String> columns;

        @JvmField
        @NotNull
        public final String name;

        @JvmField
        @NotNull
        public List<String> orders;

        @JvmField
        public final boolean unique;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public Index(@NotNull String name, boolean z10, @NotNull List<String> columns, @NotNull List<String> orders) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(columns, "columns");
            Intrinsics.checkNotNullParameter(orders, "orders");
            this.name = name;
            this.unique = z10;
            this.columns = columns;
            this.orders = orders;
            List<String> arrayList = orders;
            if (arrayList.isEmpty()) {
                int size = columns.size();
                arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(androidx.room.Index.Order.ASC.name());
                }
            }
            this.orders = (List) arrayList;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Index)) {
                return false;
            }
            Index index = (Index) other;
            if (this.unique == index.unique && Intrinsics.areEqual(this.columns, index.columns) && Intrinsics.areEqual(this.orders, index.orders)) {
                return l.startsWith$default(this.name, DEFAULT_PREFIX, false, 2, null) ? l.startsWith$default(index.name, DEFAULT_PREFIX, false, 2, null) : Intrinsics.areEqual(this.name, index.name);
            }
            return false;
        }

        public int hashCode() {
            return this.orders.hashCode() + a.a(this.columns, (((l.startsWith$default(this.name, DEFAULT_PREFIX, false, 2, null) ? -1184239155 : this.name.hashCode()) * 31) + (this.unique ? 1 : 0)) * 31, 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Index{name='");
            sb2.append(this.name);
            sb2.append("', unique=");
            sb2.append(this.unique);
            sb2.append(", columns=");
            sb2.append(this.columns);
            sb2.append(", orders=");
            return androidx.camera.core.imagecapture.a.c(sb2, this.orders, "'}");
        }

        @Deprecated(message = "Use {@link #Index(String, boolean, List, List)}")
        public Index(@NotNull String name, boolean z10, @NotNull List<String> columns) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(columns, "columns");
            int size = columns.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(androidx.room.Index.Order.ASC.name());
            }
            this(name, z10, columns, arrayList);
        }
    }

    /* JADX INFO: compiled from: TableInfo.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB9\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018B)\b\u0017\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0019J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u0012\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Landroidx/room/util/TableInfo$Column;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "name", "Ljava/lang/String;", "type", "notNull", "Z", "primaryKeyPosition", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "defaultValue", "createdFrom", "affinity", "getAffinity$annotations", "()V", "isPrimaryKey", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "Companion", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
    public static final class Column {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        public final int affinity;

        @JvmField
        public final int createdFrom;

        @JvmField
        @Nullable
        public final String defaultValue;

        @JvmField
        @NotNull
        public final String name;

        @JvmField
        public final boolean notNull;

        @JvmField
        public final int primaryKeyPosition;

        @JvmField
        @NotNull
        public final String type;

        /* JADX INFO: compiled from: TableInfo.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\t"}, d2 = {"Landroidx/room/util/TableInfo$Column$Companion;", "", "", "current", "other", "", "defaultValueEquals", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nTableInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfo$Column$Companion\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,646:1\n1183#2,3:647\n*S KotlinDebug\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfo$Column$Companion\n*L\n249#1:647,3\n*E\n"})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @VisibleForTesting
            public final boolean defaultValueEquals(@NotNull String current, @Nullable String other) {
                Intrinsics.checkNotNullParameter(current, "current");
                if (Intrinsics.areEqual(current, other)) {
                    return true;
                }
                if (current.length() != 0) {
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    while (i10 < current.length()) {
                        char cCharAt = current.charAt(i10);
                        int i13 = i12 + 1;
                        if (i12 != 0 || cCharAt == '(') {
                            if (cCharAt == '(') {
                                i11++;
                            } else if (cCharAt != ')' || (i11 = i11 - 1) != 0 || i12 == current.length() - 1) {
                            }
                            i10++;
                            i12 = i13;
                        }
                    }
                    if (i11 == 0) {
                        String strSubstring = current.substring(1, current.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        return Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) strSubstring).toString(), other);
                    }
                }
                return false;
            }
        }

        public Column(@NotNull String name, @NotNull String type, boolean z10, int i10, @Nullable String str, int i11) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            this.name = name;
            this.type = type;
            this.notNull = z10;
            this.primaryKeyPosition = i10;
            this.defaultValue = str;
            this.createdFrom = i11;
            int i12 = 5;
            if (type != null) {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String upperCase = type.toUpperCase(US);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                if (StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "INT", false, 2, (Object) null)) {
                    i12 = 3;
                } else if (StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "CHAR", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "CLOB", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "TEXT", false, 2, (Object) null)) {
                    i12 = 2;
                } else if (!StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "BLOB", false, 2, (Object) null)) {
                    i12 = (StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "REAL", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "FLOA", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "DOUB", false, 2, (Object) null)) ? 4 : 1;
                }
            }
            this.affinity = i12;
        }

        @JvmStatic
        @VisibleForTesting
        public static final boolean defaultValueEquals(@NotNull String str, @Nullable String str2) {
            return INSTANCE.defaultValueEquals(str, str2);
        }

        public boolean equals(@Nullable Object other) {
            String str;
            String str2;
            String str3;
            if (this == other) {
                return true;
            }
            if (!(other instanceof Column) || this.primaryKeyPosition != ((Column) other).primaryKeyPosition) {
                return false;
            }
            Column column = (Column) other;
            if (!Intrinsics.areEqual(this.name, column.name) || this.notNull != column.notNull) {
                return false;
            }
            if (this.createdFrom == 1 && column.createdFrom == 2 && (str3 = this.defaultValue) != null && !INSTANCE.defaultValueEquals(str3, column.defaultValue)) {
                return false;
            }
            if (this.createdFrom == 2 && column.createdFrom == 1 && (str2 = column.defaultValue) != null && !INSTANCE.defaultValueEquals(str2, this.defaultValue)) {
                return false;
            }
            int i10 = this.createdFrom;
            return (i10 == 0 || i10 != column.createdFrom || ((str = this.defaultValue) == null ? column.defaultValue == null : INSTANCE.defaultValueEquals(str, column.defaultValue))) && this.affinity == column.affinity;
        }

        public int hashCode() {
            return (((((this.name.hashCode() * 31) + this.affinity) * 31) + (this.notNull ? 1231 : 1237)) * 31) + this.primaryKeyPosition;
        }

        public final boolean isPrimaryKey() {
            return this.primaryKeyPosition > 0;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Column{name='");
            sb2.append(this.name);
            sb2.append("', type='");
            sb2.append(this.type);
            sb2.append("', affinity='");
            sb2.append(this.affinity);
            sb2.append("', notNull=");
            sb2.append(this.notNull);
            sb2.append(", primaryKeyPosition=");
            sb2.append(this.primaryKeyPosition);
            sb2.append(", defaultValue='");
            String str = this.defaultValue;
            if (str == null) {
                str = "undefined";
            }
            return d.f(sb2, str, "'}");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @Deprecated(message = "Use {@link Column#Column(String, String, boolean, int, String, int)} instead.")
        public Column(@NotNull String name, @NotNull String type, boolean z10, int i10) {
            this(name, type, z10, i10, null, 0);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
        }

        @ColumnInfo.SQLiteTypeAffinity
        public static /* synthetic */ void getAffinity$annotations() {
        }
    }
}
