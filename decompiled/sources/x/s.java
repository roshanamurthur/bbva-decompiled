package x;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class s implements WindowInsets {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f94397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f94399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f94400d;

    public s(int i10, int i11, int i12, int i13) {
        this.f94397a = i10;
        this.f94398b = i11;
        this.f94399c = i12;
        this.f94400d = i13;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f94397a == sVar.f94397a && this.f94398b == sVar.f94398b && this.f94399c == sVar.f94399c && this.f94400d == sVar.f94400d;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return this.f94400d;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return this.f94397a;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return this.f94399c;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return this.f94398b;
    }

    public final int hashCode() {
        return (((((this.f94397a * 31) + this.f94398b) * 31) + this.f94399c) * 31) + this.f94400d;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets(left=");
        sb2.append(this.f94397a);
        sb2.append(", top=");
        sb2.append(this.f94398b);
        sb2.append(", right=");
        sb2.append(this.f94399c);
        sb2.append(", bottom=");
        return androidx.activity.a.d(sb2, this.f94400d, RootService.CLOSE_BRACKET);
    }
}
