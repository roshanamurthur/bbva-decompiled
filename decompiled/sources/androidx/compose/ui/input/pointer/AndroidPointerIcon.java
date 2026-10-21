package androidx.compose.ui.input.pointer;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PointerIcon.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/input/pointer/AndroidPointerIcon;", "Landroidx/compose/ui/input/pointer/PointerIcon;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Landroid/view/PointerIcon;", "a", "Landroid/view/PointerIcon;", "getPointerIcon", "()Landroid/view/PointerIcon;", "pointerIcon", "<init>", "(Landroid/view/PointerIcon;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class AndroidPointerIcon implements PointerIcon {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final android.view.PointerIcon pointerIcon;

    public AndroidPointerIcon(@NotNull android.view.PointerIcon pointerIcon) {
        Intrinsics.checkNotNullParameter(pointerIcon, "pointerIcon");
        this.pointerIcon = pointerIcon;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(AndroidPointerIcon.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        return Intrinsics.areEqual(this.pointerIcon, ((AndroidPointerIcon) other).pointerIcon);
    }

    @NotNull
    public final android.view.PointerIcon getPointerIcon() {
        return this.pointerIcon;
    }

    public int hashCode() {
        return this.pointerIcon.hashCode();
    }

    @NotNull
    public String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.pointerIcon + RootService.CLOSE_BRACKET;
    }
}
