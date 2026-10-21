package x;

import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class o implements NestedScrollConnection {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final o f94379p0 = new o();

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public final /* synthetic */ Object mo218onPostFlingRZ2iAVY(long j10, long j11, Continuation continuation) {
        return d1.a.a(this, j10, j11, continuation);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final /* synthetic */ long mo219onPostScrollDzOQY0M(long j10, long j11, int i10) {
        return d1.a.b(this, j10, j11, i10);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public final /* synthetic */ Object mo220onPreFlingQWom1Mo(long j10, Continuation continuation) {
        return d1.a.c(this, j10, continuation);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final /* synthetic */ long mo221onPreScrollOzD1aCk(long j10, int i10) {
        return d1.a.d(this, j10, i10);
    }
}
