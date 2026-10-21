package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyStaggeredGridSpan.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getValue$foundation_release", "()I", "value", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class StaggeredGridItemSpan {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final StaggeredGridItemSpan f5333b = new StaggeredGridItemSpan(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final StaggeredGridItemSpan f5334c = new StaggeredGridItemSpan(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int value;

    /* JADX INFO: compiled from: LazyStaggeredGridSpan.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan$Companion;", "", "()V", "FullLine", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "getFullLine", "()Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "SingleLane", "getSingleLane", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StaggeredGridItemSpan getFullLine() {
            return StaggeredGridItemSpan.f5333b;
        }

        @NotNull
        public final StaggeredGridItemSpan getSingleLane() {
            return StaggeredGridItemSpan.f5334c;
        }
    }

    public StaggeredGridItemSpan(int i10) {
        this.value = i10;
    }

    /* JADX INFO: renamed from: getValue$foundation_release, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
