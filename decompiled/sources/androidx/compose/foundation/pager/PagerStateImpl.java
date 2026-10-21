package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PagerState.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B%\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0013\u0010\u0014R.\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/pager/PagerStateImpl;", "Landroidx/compose/foundation/pager/PagerState;", "Landroidx/compose/runtime/MutableState;", "Lkotlin/Function0;", "", "D", "Landroidx/compose/runtime/MutableState;", "getPageCountState", "()Landroidx/compose/runtime/MutableState;", "setPageCountState", "(Landroidx/compose/runtime/MutableState;)V", "pageCountState", "getPageCount", "()I", "pageCount", "initialPage", "", "initialPageOffsetFraction", "updatedPageCount", "<init>", "(IFLkotlin/jvm/functions/Function0;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class PagerStateImpl extends PagerState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Saver<PagerStateImpl, ?> E = ListSaverKt.listSaver(a.f5533p0, b.f5534p0);

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public MutableState<Function0<Integer>> pageCountState;

    /* JADX INFO: compiled from: PagerState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/pager/PagerStateImpl$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/pager/PagerStateImpl;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<PagerStateImpl, ?> getSaver() {
            return PagerStateImpl.E;
        }
    }

    /* JADX INFO: compiled from: PagerState.kt */
    public static final class a extends Lambda implements Function2<SaverScope, PagerStateImpl, List<? extends Object>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f5533p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends Object> invoke(SaverScope saverScope, PagerStateImpl pagerStateImpl) {
            SaverScope listSaver = saverScope;
            PagerStateImpl it = pagerStateImpl;
            Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt__CollectionsKt.listOf(Integer.valueOf(it.getCurrentPage()), Float.valueOf(it.getCurrentPageOffsetFraction()), Integer.valueOf(it.getPageCount()));
        }
    }

    /* JADX INFO: compiled from: PagerState.kt */
    public static final class b extends Lambda implements Function1<List, PagerStateImpl> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f5534p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final PagerStateImpl invoke(List list) {
            List it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            Object obj = it.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = it.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new PagerStateImpl(iIntValue, ((Float) obj2).floatValue(), new f(it));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerStateImpl(int i10, float f6, @NotNull Function0<Integer> updatedPageCount) {
        super(i10, f6);
        Intrinsics.checkNotNullParameter(updatedPageCount, "updatedPageCount");
        this.pageCountState = SnapshotStateKt.mutableStateOf$default(updatedPageCount, null, 2, null);
    }

    @Override // androidx.compose.foundation.pager.PagerState
    public int getPageCount() {
        return this.pageCountState.getValue().invoke().intValue();
    }

    @NotNull
    public final MutableState<Function0<Integer>> getPageCountState() {
        return this.pageCountState;
    }

    public final void setPageCountState(@NotNull MutableState<Function0<Integer>> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.pageCountState = mutableState;
    }
}
