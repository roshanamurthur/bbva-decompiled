package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BringIntoViewResponder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "responder", "bringIntoViewResponder", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class BringIntoViewResponderKt {
    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier bringIntoViewResponder(@NotNull Modifier modifier, @NotNull BringIntoViewResponder responder) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(responder, "responder");
        return modifier.then(new BringIntoViewResponderElement(responder));
    }
}
