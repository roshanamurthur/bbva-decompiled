package androidx.compose.material;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h3 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f8500p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ String f8501q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(boolean z10, String str) {
        super(1);
        this.f8500p0 = z10;
        this.f8501q0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        if (this.f8500p0) {
            SemanticsPropertiesKt.error(semantics, this.f8501q0);
        }
        return Unit.INSTANCE;
    }
}
