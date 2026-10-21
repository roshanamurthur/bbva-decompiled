package g0;

import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.platform.ViewConfiguration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextSelectionMouseDetector.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ViewConfiguration f68549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f68550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public PointerInputChange f68551c;

    public a(@NotNull ViewConfiguration viewConfiguration) {
        Intrinsics.checkNotNullParameter(viewConfiguration, "viewConfiguration");
        this.f68549a = viewConfiguration;
    }
}
