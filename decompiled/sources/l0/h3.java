package l0;

import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SearchBar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h3 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f82596p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f82597q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ String f82598r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ FocusRequester f82599s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(String str, boolean z10, String str2, FocusRequester focusRequester) {
        super(1);
        this.f82596p0 = str;
        this.f82597q0 = z10;
        this.f82598r0 = str2;
        this.f82599s0 = focusRequester;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, this.f82596p0);
        if (this.f82597q0) {
            SemanticsPropertiesKt.setStateDescription(semantics, this.f82598r0);
        }
        SemanticsPropertiesKt.onClick$default(semantics, null, new g3(this.f82599s0), 1, null);
        return Unit.INSTANCE;
    }
}
