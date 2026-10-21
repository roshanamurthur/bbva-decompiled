package androidx.compose.foundation.layout;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RowColumnMeasurementHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0015\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;", "", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCrossAxisSize", "()I", "crossAxisSize", "b", "getMainAxisSize", "mainAxisSize", "c", "getStartIndex", "startIndex", "d", "getEndIndex", "endIndex", "e", "getBeforeCrossAxisAlignmentLine", "beforeCrossAxisAlignmentLine", "", "f", "[I", "getMainAxisPositions", "()[I", "mainAxisPositions", "<init>", "(IIIII[I)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
public final class RowColumnMeasureHelperResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int crossAxisSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int mainAxisSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int startIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int endIndex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int beforeCrossAxisAlignmentLine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final int[] mainAxisPositions;

    public RowColumnMeasureHelperResult(int i10, int i11, int i12, int i13, int i14, @NotNull int[] mainAxisPositions) {
        Intrinsics.checkNotNullParameter(mainAxisPositions, "mainAxisPositions");
        this.crossAxisSize = i10;
        this.mainAxisSize = i11;
        this.startIndex = i12;
        this.endIndex = i13;
        this.beforeCrossAxisAlignmentLine = i14;
        this.mainAxisPositions = mainAxisPositions;
    }

    public final int getBeforeCrossAxisAlignmentLine() {
        return this.beforeCrossAxisAlignmentLine;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    @NotNull
    public final int[] getMainAxisPositions() {
        return this.mainAxisPositions;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }
}
