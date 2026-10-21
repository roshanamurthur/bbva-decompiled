package l0;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f82985p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ String f82986q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ String f82987r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ String f82988s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f82989t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(boolean z10, String str, String str2, String str3, Function0<Unit> function0) {
        super(1);
        this.f82985p0 = z10;
        this.f82986q0 = str;
        this.f82987r0 = str2;
        this.f82988s0 = str3;
        this.f82989t0 = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setStateDescription(semantics, this.f82985p0 ? this.f82986q0 : this.f82987r0);
        SemanticsPropertiesKt.setContentDescription(semantics, this.f82988s0);
        SemanticsPropertiesKt.onClick$default(semantics, null, new u1(this.f82989t0), 1, null);
        return Unit.INSTANCE;
    }
}
