package androidx.sqlite.db;

import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SimpleSQLiteQuery.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B#\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0012\u0010\u0011\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Landroidx/sqlite/db/SimpleSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "statement", "", "bindTo", "", "getSql", "()Ljava/lang/String;", "sql", "", "getArgCount", "()I", "argCount", SearchIntents.EXTRA_QUERY, "", "", "bindArgs", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", "(Ljava/lang/String;)V", "Companion", "sqlite_release"}, k = 1, mv = {1, 8, 0})
public final class SimpleSQLiteQuery implements SupportSQLiteQuery {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final String f23480p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public final Object[] f23481q0;

    /* JADX INFO: compiled from: SimpleSQLiteQuery.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/sqlite/db/SimpleSQLiteQuery$Companion;", "", "Landroidx/sqlite/db/SupportSQLiteProgram;", "statement", "", "bindArgs", "", "bind", "(Landroidx/sqlite/db/SupportSQLiteProgram;[Ljava/lang/Object;)V", "<init>", "()V", "sqlite_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void bind(@NotNull SupportSQLiteProgram statement, @Nullable Object[] bindArgs) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            if (bindArgs == null) {
                return;
            }
            int length = bindArgs.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = bindArgs[i10];
                i10++;
                if (obj == null) {
                    statement.bindNull(i10);
                } else if (obj instanceof byte[]) {
                    statement.bindBlob(i10, (byte[]) obj);
                } else if (obj instanceof Float) {
                    statement.bindDouble(i10, ((Number) obj).floatValue());
                } else if (obj instanceof Double) {
                    statement.bindDouble(i10, ((Number) obj).doubleValue());
                } else if (obj instanceof Long) {
                    statement.bindLong(i10, ((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    statement.bindLong(i10, ((Number) obj).intValue());
                } else if (obj instanceof Short) {
                    statement.bindLong(i10, ((Number) obj).shortValue());
                } else if (obj instanceof Byte) {
                    statement.bindLong(i10, ((Number) obj).byteValue());
                } else if (obj instanceof String) {
                    statement.bindString(i10, (String) obj);
                } else {
                    if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                    }
                    statement.bindLong(i10, ((Boolean) obj).booleanValue() ? 1L : 0L);
                }
            }
        }
    }

    public SimpleSQLiteQuery(@NotNull String query, @Nullable Object[] objArr) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f23480p0 = query;
        this.f23481q0 = objArr;
    }

    @JvmStatic
    public static final void bind(@NotNull SupportSQLiteProgram supportSQLiteProgram, @Nullable Object[] objArr) {
        INSTANCE.bind(supportSQLiteProgram, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(@NotNull SupportSQLiteProgram statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        INSTANCE.bind(statement, this.f23481q0);
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public int getArgCount() {
        Object[] objArr = this.f23481q0;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    @NotNull
    /* JADX INFO: renamed from: getSql, reason: from getter */
    public String getF23480p0() {
        return this.f23480p0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleSQLiteQuery(@NotNull String query) {
        this(query, null);
        Intrinsics.checkNotNullParameter(query, "query");
    }
}
