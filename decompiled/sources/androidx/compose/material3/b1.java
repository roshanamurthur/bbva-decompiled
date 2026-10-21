package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: DateRangePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LazyListState f12681p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f12682q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ String f12683r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ String f12684s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(LazyListState lazyListState, CoroutineScope coroutineScope, String str, String str2) {
        super(1);
        this.f12681p0 = lazyListState;
        this.f12682q0 = coroutineScope;
        this.f12683r0 = str;
        this.f12684s0 = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        LazyListState lazyListState = this.f12681p0;
        CoroutineScope coroutineScope = this.f12682q0;
        SemanticsPropertiesKt.setCustomActions(semantics, CollectionsKt__CollectionsKt.listOf((Object[]) new CustomAccessibilityAction[]{new CustomAccessibilityAction(this.f12683r0, new l0.r1(lazyListState, coroutineScope)), new CustomAccessibilityAction(this.f12684s0, new l0.p1(lazyListState, coroutineScope))}));
        return Unit.INSTANCE;
    }
}
