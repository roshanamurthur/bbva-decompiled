package t;

import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Scroll.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f93405p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f93406q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ boolean f93407r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ ScrollState f93408s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f93409t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(boolean z10, boolean z11, boolean z12, ScrollState scrollState, CoroutineScope coroutineScope) {
        super(1);
        this.f93405p0 = z10;
        this.f93406q0 = z11;
        this.f93407r0 = z12;
        this.f93408s0 = scrollState;
        this.f93409t0 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setTraversalGroup(semantics, true);
        ScrollState scrollState = this.f93408s0;
        ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new i0(scrollState), new j0(scrollState), this.f93405p0);
        boolean z10 = this.f93406q0;
        if (z10) {
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semantics, scrollAxisRange);
        } else {
            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semantics, scrollAxisRange);
        }
        if (this.f93407r0) {
            SemanticsPropertiesKt.scrollBy$default(semantics, null, new h0(this.f93409t0, z10, scrollState), 1, null);
        }
        return Unit.INSTANCE;
    }
}
