package h0;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f68640p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f68641q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(String str, Function0<Unit> function0) {
        super(1);
        this.f68640p0 = str;
        this.f68641q0 = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, this.f68640p0);
        SemanticsPropertiesKt.onClick$default(semantics, null, new z0(this.f68641q0), 1, null);
        return Unit.INSTANCE;
    }
}
