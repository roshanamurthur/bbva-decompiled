package u0;

import androidx.compose.ui.CombinedModifier;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Modifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e {
    static {
        Modifier.Companion companion = Modifier.INSTANCE;
    }

    @NotNull
    public static Modifier a(Modifier modifier, @NotNull Modifier other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other == Modifier.INSTANCE ? modifier : new CombinedModifier(modifier, other);
    }
}
