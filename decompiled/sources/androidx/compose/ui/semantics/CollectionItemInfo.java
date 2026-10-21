package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/semantics/CollectionItemInfo;", "", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getRowIndex", "()I", "rowIndex", "b", "getRowSpan", "rowSpan", "c", "getColumnIndex", "columnIndex", "d", "getColumnSpan", "columnSpan", "<init>", "(IIII)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class CollectionItemInfo {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int rowIndex;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int rowSpan;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int columnIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int columnSpan;

    public CollectionItemInfo(int i10, int i11, int i12, int i13) {
        this.rowIndex = i10;
        this.rowSpan = i11;
        this.columnIndex = i12;
        this.columnSpan = i13;
    }

    public final int getColumnIndex() {
        return this.columnIndex;
    }

    public final int getColumnSpan() {
        return this.columnSpan;
    }

    public final int getRowIndex() {
        return this.rowIndex;
    }

    public final int getRowSpan() {
        return this.rowSpan;
    }
}
