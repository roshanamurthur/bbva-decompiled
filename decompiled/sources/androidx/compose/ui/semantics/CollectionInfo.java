package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\r"}, d2 = {"Landroidx/compose/ui/semantics/CollectionInfo;", "", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getRowCount", "()I", "rowCount", "b", "getColumnCount", "columnCount", "<init>", "(II)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class CollectionInfo {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int rowCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int columnCount;

    public CollectionInfo(int i10, int i11) {
        this.rowCount = i10;
        this.columnCount = i11;
    }

    public final int getColumnCount() {
        return this.columnCount;
    }

    public final int getRowCount() {
        return this.rowCount;
    }
}
