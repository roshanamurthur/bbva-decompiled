package b3;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MigrationExt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends Migration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<SupportSQLiteDatabase, Unit> f24771a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(int i10, int i11, @NotNull Function1<? super SupportSQLiteDatabase, Unit> function1) {
        super(i10, i11);
        this.f24771a = function1;
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(@NotNull SupportSQLiteDatabase supportSQLiteDatabase) {
        this.f24771a.invoke(supportSQLiteDatabase);
    }
}
