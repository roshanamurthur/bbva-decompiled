package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FrameworkSQLiteStatement.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u0010"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteStatement;", "Landroidx/sqlite/db/framework/FrameworkSQLiteProgram;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "", "execute", "", "executeUpdateDelete", "", "executeInsert", "simpleQueryForLong", "", "simpleQueryForString", "Landroid/database/sqlite/SQLiteStatement;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteStatement;)V", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0})
public final class FrameworkSQLiteStatement extends FrameworkSQLiteProgram implements SupportSQLiteStatement {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final SQLiteStatement f23519q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteStatement(@NotNull SQLiteStatement delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f23519q0 = delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public void execute() {
        this.f23519q0.execute();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long executeInsert() {
        return this.f23519q0.executeInsert();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public int executeUpdateDelete() {
        return this.f23519q0.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long simpleQueryForLong() {
        return this.f23519q0.simpleQueryForLong();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    @Nullable
    public String simpleQueryForString() {
        return this.f23519q0.simpleQueryForString();
    }
}
