package x;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WindowInsetsPadding.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
public final class r1 extends d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final WindowInsets f94396d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(@NotNull WindowInsets insets, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f94396d = insets;
    }

    @Override // x.d0
    @NotNull
    public final WindowInsets d(@NotNull WindowInsets modifierLocalInsets) {
        Intrinsics.checkNotNullParameter(modifierLocalInsets, "modifierLocalInsets");
        return WindowInsetsKt.union(this.f94396d, modifierLocalInsets);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r1) {
            return Intrinsics.areEqual(((r1) obj).f94396d, this.f94396d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f94396d.hashCode();
    }
}
