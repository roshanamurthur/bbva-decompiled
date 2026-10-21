package l0;

import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LazyGridState f82404p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f82405q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f82406r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ String f82407s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ String f82408t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(LazyGridState lazyGridState, int i10, CoroutineScope coroutineScope, String str, String str2) {
        super(1);
        this.f82404p0 = lazyGridState;
        this.f82405q0 = i10;
        this.f82406r0 = coroutineScope;
        this.f82407s0 = str;
        this.f82408t0 = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        List listListOf;
        LazyGridItemInfo lazyGridItemInfo;
        SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        LazyGridState lazyGridState = this.f82404p0;
        int firstVisibleItemIndex = lazyGridState.getFirstVisibleItemIndex();
        int i10 = this.f82405q0;
        if (firstVisibleItemIndex == i10 || ((lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt___CollectionsKt.lastOrNull((List) lazyGridState.getLayoutInfo().getVisibleItemsInfo())) != null && lazyGridItemInfo.getIndex() == i10)) {
            String str = this.f82408t0;
            CoroutineScope coroutineScope = this.f82406r0;
            listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new CustomAccessibilityAction[]{new CustomAccessibilityAction(this.f82407s0, new j1(lazyGridState, coroutineScope)), new CustomAccessibilityAction(str, new h1(lazyGridState, coroutineScope))});
        } else {
            listListOf = CollectionsKt__CollectionsKt.emptyList();
        }
        SemanticsPropertiesKt.setCustomActions(semantics, listListOf);
        return Unit.INSTANCE;
    }
}
