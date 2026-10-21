package l0;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k2 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final k2 f82657p0 = new k2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyReceiver clearAndSetSemantics = semanticsPropertyReceiver;
        Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
        return Unit.INSTANCE;
    }
}
