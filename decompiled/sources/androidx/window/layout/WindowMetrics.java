package androidx.window.layout;

import android.graphics.Rect;
import androidx.annotation.RestrictTo;
import androidx.window.core.Bounds;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WindowMetrics.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0017\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Landroidx/window/layout/WindowMetrics;", "", "", "toString", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "Landroid/graphics/Rect;", "getBounds", "()Landroid/graphics/Rect;", "bounds", "Landroidx/window/core/Bounds;", "_bounds", "<init>", "(Landroidx/window/core/Bounds;)V", "(Landroid/graphics/Rect;)V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class WindowMetrics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Bounds f24225a;

    public WindowMetrics(@NotNull Bounds _bounds) {
        Intrinsics.checkNotNullParameter(_bounds, "_bounds");
        this.f24225a = _bounds;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(WindowMetrics.class, other.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(this.f24225a, ((WindowMetrics) other).f24225a);
    }

    @NotNull
    public final Rect getBounds() {
        return this.f24225a.toRect();
    }

    public int hashCode() {
        return this.f24225a.hashCode();
    }

    @NotNull
    public String toString() {
        return "WindowMetrics { bounds: " + getBounds() + " }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.TESTS})
    public WindowMetrics(@NotNull Rect bounds) {
        this(new Bounds(bounds));
        Intrinsics.checkNotNullParameter(bounds, "bounds");
    }
}
