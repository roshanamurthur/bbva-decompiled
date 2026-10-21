package l0;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DateRangePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final m1 f82699p0 = new m1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContainer(semantics, true);
        return Unit.INSTANCE;
    }
}
