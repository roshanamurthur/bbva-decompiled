package g1;

import androidx.compose.ui.layout.SubcomposeIntermediateMeasureScope;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v {
    @NotNull
    public static List a(SubcomposeIntermediateMeasureScope subcomposeIntermediateMeasureScope, @Nullable Object obj, @NotNull Function2 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return subcomposeIntermediateMeasureScope.measurablesForSlot(obj);
    }
}
