package androidx.room;

import androidx.sqlite.db.SupportSQLiteProgram;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: QueryInterceptorProgram.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016R\"\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/room/QueryInterceptorProgram;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "", FirebaseAnalytics.Param.INDEX, "", "bindNull", "", "value", "bindLong", "", "bindDouble", "", "bindString", "", "bindBlob", "clearBindings", HearingDisabilitiesConstants.CLOSE_MODAL, "", "", "p0", "Ljava/util/List;", "getBindArgsCache$room_runtime_release", "()Ljava/util/List;", "bindArgsCache", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
public final class QueryInterceptorProgram implements SupportSQLiteProgram {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ArrayList f23262p0 = new ArrayList();

    public final void a(int i10, Object obj) {
        int size;
        int i11 = i10 - 1;
        ArrayList arrayList = this.f23262p0;
        if (i11 >= arrayList.size() && (size = arrayList.size()) <= i11) {
            while (true) {
                arrayList.add(null);
                if (size == i11) {
                    break;
                } else {
                    size++;
                }
            }
        }
        arrayList.set(i11, obj);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int index, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        a(index, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int index, double value) {
        a(index, Double.valueOf(value));
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int index, long value) {
        a(index, Long.valueOf(value));
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int index) {
        a(index, null);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int index, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        a(index, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        this.f23262p0.clear();
    }

    @NotNull
    public final List<Object> getBindArgsCache$room_runtime_release() {
        return this.f23262p0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
