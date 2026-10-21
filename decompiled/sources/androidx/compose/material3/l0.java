package androidx.compose.material3;

import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f12974p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(String str) {
        super(1);
        this.f12974p0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.m3842setLiveRegionhR3wRGc(semantics, LiveRegionMode.INSTANCE.m3824getPolite0phEisY());
        SemanticsPropertiesKt.setContentDescription(semantics, this.f12974p0);
        return Unit.INSTANCE;
    }
}
