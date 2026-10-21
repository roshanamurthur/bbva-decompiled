package androidx.compose.runtime.snapshots;

import androidx.collection.g;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SnapshotStateList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 8, 0})
public final class SnapshotStateListKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Object f15309a = new Object();

    public static final Void access$invalidIteratorSet() {
        throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()".toString());
    }

    public static final Void access$modificationError() {
        throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
    }

    public static final void access$validateRange(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(g.b("index (", i10, ") is out of bound of [0, ", i11, RootService.CLOSE_BRACKET));
        }
    }
}
