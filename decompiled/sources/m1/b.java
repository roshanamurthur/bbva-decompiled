package m1;

import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SemanticsNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Role f83344p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Role role) {
        super(1);
        this.f83344p0 = role;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyReceiver fakeSemanticsNode = semanticsPropertyReceiver;
        Intrinsics.checkNotNullParameter(fakeSemanticsNode, "$this$fakeSemanticsNode");
        SemanticsPropertiesKt.m3843setRolekuIjeqM(fakeSemanticsNode, this.f83344p0.getF17490a());
        return Unit.INSTANCE;
    }
}
