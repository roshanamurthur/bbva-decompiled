package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\bH\u0016R\"\u0010\u0010\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/Anchor;", "", "Landroidx/compose/runtime/SlotTable;", "slots", "", "toIndexFor", "Landroidx/compose/runtime/SlotWriter;", "writer", "", "toString", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getLocation$runtime_release", "()I", "setLocation$runtime_release", "(I)V", "location", "", "getValid", "()Z", "valid", "loc", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class Anchor {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int location;

    public Anchor(int i10) {
        this.location = i10;
    }

    /* JADX INFO: renamed from: getLocation$runtime_release, reason: from getter */
    public final int getLocation() {
        return this.location;
    }

    public final boolean getValid() {
        return this.location != Integer.MIN_VALUE;
    }

    public final void setLocation$runtime_release(int i10) {
        this.location = i10;
    }

    public final int toIndexFor(@NotNull SlotTable slots) {
        return slots.anchorIndex(this);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{ location = ");
        return androidx.appcompat.widget.a.c(sb2, this.location, " }");
    }

    public final int toIndexFor(@NotNull SlotWriter writer) {
        return writer.anchorIndex(this);
    }
}
