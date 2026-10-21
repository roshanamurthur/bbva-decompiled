package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WindowInsets.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010,\u001a\u00020\u0017¢\u0006\u0004\b-\u0010.J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u001a\u0010\u001d\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR+\u0010&\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R+\u0010(\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00148F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006/"}, d2 = {"Landroidx/compose/foundation/layout/AndroidWindowInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "getLeft", "getTop", "getRight", "getBottom", "Landroidx/core/view/WindowInsetsCompat;", "windowInsetsCompat", "typeMask", "", "update$foundation_layout_release", "(Landroidx/core/view/WindowInsetsCompat;I)V", "update", "", "other", "", "equals", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getType$foundation_layout_release", "()I", "type", "Landroidx/core/graphics/Insets;", "<set-?>", "c", "Landroidx/compose/runtime/MutableState;", "getInsets$foundation_layout_release", "()Landroidx/core/graphics/Insets;", "setInsets$foundation_layout_release", "(Landroidx/core/graphics/Insets;)V", "insets", "d", "isVisible", "()Z", "setVisible", "(Z)V", "name", "<init>", "(ILjava/lang/String;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/AndroidWindowInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,767:1\n81#2:768\n107#2,2:769\n81#2:771\n107#2,2:772\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/AndroidWindowInsets\n*L\n58#1:768\n58#1:769,2\n64#1:771\n64#1:772,2\n*E\n"})
public final class AndroidWindowInsets implements WindowInsets {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int type;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f4158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState insets;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState isVisible;

    public AndroidWindowInsets(int i10, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.type = i10;
        this.f4158b = name;
        this.insets = SnapshotStateKt.mutableStateOf$default(Insets.NONE, null, 2, null);
        this.isVisible = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof AndroidWindowInsets) {
            return this.type == ((AndroidWindowInsets) other).type;
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return getInsets$foundation_layout_release().bottom;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Insets getInsets$foundation_layout_release() {
        return (Insets) this.insets.getValue();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return getInsets$foundation_layout_release().left;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@NotNull Density density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return getInsets$foundation_layout_release().right;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return getInsets$foundation_layout_release().top;
    }

    /* JADX INFO: renamed from: getType$foundation_layout_release, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isVisible() {
        return ((Boolean) this.isVisible.getValue()).booleanValue();
    }

    public final void setInsets$foundation_layout_release(@NotNull Insets insets) {
        Intrinsics.checkNotNullParameter(insets, "<set-?>");
        this.insets.setValue(insets);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f4158b);
        sb2.append(RootService.OPEN_BRACKET);
        sb2.append(getInsets$foundation_layout_release().left);
        sb2.append(", ");
        sb2.append(getInsets$foundation_layout_release().top);
        sb2.append(", ");
        sb2.append(getInsets$foundation_layout_release().right);
        sb2.append(", ");
        return androidx.activity.a.d(sb2, getInsets$foundation_layout_release().bottom, RootService.CLOSE_BRACKET);
    }

    public final void update$foundation_layout_release(@NotNull WindowInsetsCompat windowInsetsCompat, int typeMask) {
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "windowInsetsCompat");
        int i10 = this.type;
        if (typeMask == 0 || (typeMask & i10) != 0) {
            setInsets$foundation_layout_release(windowInsetsCompat.getInsets(i10));
            this.isVisible.setValue(Boolean.valueOf(windowInsetsCompat.isVisible(i10)));
        }
    }
}
