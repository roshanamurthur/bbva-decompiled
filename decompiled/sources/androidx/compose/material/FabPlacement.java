package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import kotlin.Metadata;

/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0015"}, d2 = {"Landroidx/compose/material/FabPlacement;", "", "", "a", "Z", "isDocked", "()Z", "", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getLeft", "()I", Parameters.DIRECTION.LEFT, "c", "getWidth", "width", "d", "getHeight", "height", "<init>", "(ZIII)V", "material_release"}, k = 1, mv = {1, 8, 0})
public final class FabPlacement {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean isDocked;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int left;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int width;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int height;

    public FabPlacement(boolean z10, int i10, int i11, int i12) {
        this.isDocked = z10;
        this.left = i10;
        this.width = i11;
        this.height = i12;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: isDocked, reason: from getter */
    public final boolean getIsDocked() {
        return this.isDocked;
    }
}
