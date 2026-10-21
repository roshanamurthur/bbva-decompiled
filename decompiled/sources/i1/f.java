package i1;

import androidx.compose.ui.focus.FocusOrder;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusProperties;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BackwardsCompatNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Function1<FocusProperties, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final FocusOrderModifier f69480p0;

    public f(@NotNull FocusOrderModifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        this.f69480p0 = modifier;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(FocusProperties focusProperties) {
        FocusProperties focusProperties2 = focusProperties;
        Intrinsics.checkNotNullParameter(focusProperties2, "focusProperties");
        this.f69480p0.populateFocusOrder(new FocusOrder(focusProperties2));
        return Unit.INSTANCE;
    }
}
