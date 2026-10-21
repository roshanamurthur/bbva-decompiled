package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u001b\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bR+\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR$\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR\u0011\u0010\u0014\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/TopAppBarState;", "", "", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "getHeightOffsetLimit", "()F", "setHeightOffsetLimit", "(F)V", "heightOffsetLimit", "b", "getContentOffset", "setContentOffset", "contentOffset", "newOffset", "getHeightOffset", "setHeightOffset", "heightOffset", "getCollapsedFraction", "collapsedFraction", "getOverlappedFraction", "overlappedFraction", "initialHeightOffsetLimit", "initialHeightOffset", "initialContentOffset", "<init>", "(FFF)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
@Stable
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1664:1\n76#2:1665\n102#2,2:1666\n76#2:1668\n102#2,2:1669\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarState\n*L\n833#1:1665\n833#1:1666,2\n860#1:1668\n860#1:1669,2\n*E\n"})
public final class TopAppBarState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Saver<TopAppBarState, ?> f12614d = ListSaverKt.listSaver(a.f12618p0, b.f12619p0);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState heightOffsetLimit;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState contentOffset;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableState<Float> f12617c;

    /* JADX INFO: compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/material3/TopAppBarState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/TopAppBarState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<TopAppBarState, ?> getSaver() {
            return TopAppBarState.f12614d;
        }
    }

    /* JADX INFO: compiled from: AppBar.kt */
    public static final class a extends Lambda implements Function2<SaverScope, TopAppBarState, List<? extends Float>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f12618p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends Float> invoke(SaverScope saverScope, TopAppBarState topAppBarState) {
            SaverScope listSaver = saverScope;
            TopAppBarState it = topAppBarState;
            Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(it.getHeightOffsetLimit()), Float.valueOf(it.getHeightOffset()), Float.valueOf(it.getContentOffset())});
        }
    }

    /* JADX INFO: compiled from: AppBar.kt */
    public static final class b extends Lambda implements Function1<List<? extends Float>, TopAppBarState> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f12619p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final TopAppBarState invoke(List<? extends Float> list) {
            List<? extends Float> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            return new TopAppBarState(it.get(0).floatValue(), it.get(1).floatValue(), it.get(2).floatValue());
        }
    }

    public TopAppBarState(float f6, float f10, float f11) {
        this.heightOffsetLimit = SnapshotStateKt.mutableStateOf$default(Float.valueOf(f6), null, 2, null);
        this.contentOffset = SnapshotStateKt.mutableStateOf$default(Float.valueOf(f11), null, 2, null);
        this.f12617c = SnapshotStateKt.mutableStateOf$default(Float.valueOf(f10), null, 2, null);
    }

    public final float getCollapsedFraction() {
        if (getHeightOffsetLimit() == 0.0f) {
            return 0.0f;
        }
        return getHeightOffset() / getHeightOffsetLimit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getContentOffset() {
        return ((Number) this.contentOffset.getValue()).floatValue();
    }

    public final float getHeightOffset() {
        return this.f12617c.getValue().floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getHeightOffsetLimit() {
        return ((Number) this.heightOffsetLimit.getValue()).floatValue();
    }

    public final float getOverlappedFraction() {
        if (getHeightOffsetLimit() == 0.0f) {
            return 0.0f;
        }
        return 1 - (kotlin.ranges.c.coerceIn(getHeightOffsetLimit() - getContentOffset(), getHeightOffsetLimit(), 0.0f) / getHeightOffsetLimit());
    }

    public final void setContentOffset(float f6) {
        this.contentOffset.setValue(Float.valueOf(f6));
    }

    public final void setHeightOffset(float f6) {
        this.f12617c.setValue(Float.valueOf(kotlin.ranges.c.coerceIn(f6, getHeightOffsetLimit(), 0.0f)));
    }

    public final void setHeightOffsetLimit(float f6) {
        this.heightOffsetLimit.setValue(Float.valueOf(f6));
    }
}
