package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m2 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final m2 f12995p0 = new m2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.popup(semantics);
        return Unit.INSTANCE;
    }
}
