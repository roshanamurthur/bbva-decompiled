package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010 \u001a\u00020\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0017\u0010\u0016\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R+\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Landroidx/compose/foundation/layout/ValueInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "getLeft", "getTop", "getRight", "getBottom", "", "other", "", "equals", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "Landroidx/compose/foundation/layout/InsetsValues;", "<set-?>", "b", "Landroidx/compose/runtime/MutableState;", "getValue$foundation_layout_release", "()Landroidx/compose/foundation/layout/InsetsValues;", "setValue$foundation_layout_release", "(Landroidx/compose/foundation/layout/InsetsValues;)V", "value", "insets", "<init>", "(Landroidx/compose/foundation/layout/InsetsValues;Ljava/lang/String;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/ValueInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,674:1\n81#2:675\n107#2,2:676\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/ValueInsets\n*L\n365#1:675\n365#1:676,2\n*E\n"})
public final class ValueInsets implements WindowInsets {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState value;

    public ValueInsets(@NotNull InsetsValues insets, @NotNull String name) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.value = SnapshotStateKt.mutableStateOf$default(insets, null, 2, null);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof ValueInsets) {
            return Intrinsics.areEqual(getValue$foundation_layout_release(), ((ValueInsets) other).getValue$foundation_layout_release());
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return getValue$foundation_layout_release().getBottom();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return getValue$foundation_layout_release().getLeft();
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return getValue$foundation_layout_release().getRight();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return getValue$foundation_layout_release().getTop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final InsetsValues getValue$foundation_layout_release() {
        return (InsetsValues) this.value.getValue();
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public final void setValue$foundation_layout_release(@NotNull InsetsValues insetsValues) {
        Intrinsics.checkNotNullParameter(insetsValues, "<set-?>");
        this.value.setValue(insetsValues);
    }

    @NotNull
    public String toString() {
        return this.name + "(left=" + getValue$foundation_layout_release().getLeft() + ", top=" + getValue$foundation_layout_release().getTop() + ", right=" + getValue$foundation_layout_release().getRight() + ", bottom=" + getValue$foundation_layout_release().getBottom() + RootService.CLOSE_BRACKET;
    }
}
