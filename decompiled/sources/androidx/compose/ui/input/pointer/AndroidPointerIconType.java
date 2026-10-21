package androidx.compose.ui.input.pointer;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PointerIcon.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/input/pointer/AndroidPointerIconType;", "Landroidx/compose/ui/input/pointer/PointerIcon;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getType", "()I", "type", "<init>", "(I)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class AndroidPointerIconType implements PointerIcon {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int type;

    public AndroidPointerIconType(int i10) {
        this.type = i10;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(AndroidPointerIconType.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.type == ((AndroidPointerIconType) other).type;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type;
    }

    @NotNull
    public String toString() {
        return androidx.activity.a.d(new StringBuilder("AndroidPointerIcon(type="), this.type, RootService.CLOSE_BRACKET);
    }
}
