package androidx.compose.material;

import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j2 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SnackbarData f8800p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(SnackbarData snackbarData) {
        super(1);
        this.f8800p0 = snackbarData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.m3842setLiveRegionhR3wRGc(semantics, LiveRegionMode.INSTANCE.m3824getPolite0phEisY());
        SemanticsPropertiesKt.dismiss$default(semantics, null, new i2(this.f8800p0), 1, null);
        return Unit.INSTANCE;
    }
}
