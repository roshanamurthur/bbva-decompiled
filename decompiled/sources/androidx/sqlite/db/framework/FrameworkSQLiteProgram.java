package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteProgram;
import androidx.sqlite.db.SupportSQLiteProgram;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FrameworkSQLiteProgram.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016¨\u0006\u0015"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteProgram;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "", FirebaseAnalytics.Param.INDEX, "", "bindNull", "", "value", "bindLong", "", "bindDouble", "", "bindString", "", "bindBlob", "clearBindings", HearingDisabilitiesConstants.CLOSE_MODAL, "Landroid/database/sqlite/SQLiteProgram;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteProgram;)V", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0})
public class FrameworkSQLiteProgram implements SupportSQLiteProgram {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final SQLiteProgram f23518p0;

    public FrameworkSQLiteProgram(@NotNull SQLiteProgram delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f23518p0 = delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int index, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f23518p0.bindBlob(index, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int index, double value) {
        this.f23518p0.bindDouble(index, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int index, long value) {
        this.f23518p0.bindLong(index, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int index) {
        this.f23518p0.bindNull(index);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int index, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f23518p0.bindString(index, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        this.f23518p0.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f23518p0.close();
    }
}
