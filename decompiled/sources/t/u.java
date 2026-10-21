package t;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Focusable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class u extends Modifier.Node {

    @Nullable
    public MutableInteractionSource H0;

    @Nullable
    public FocusInteraction.Focus I0;

    public final void a(MutableInteractionSource mutableInteractionSource, FocusInteraction focusInteraction) {
        if (getIsAttached()) {
            BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new t(mutableInteractionSource, focusInteraction, null), 3, null);
        } else {
            mutableInteractionSource.tryEmit(focusInteraction);
        }
    }
}
