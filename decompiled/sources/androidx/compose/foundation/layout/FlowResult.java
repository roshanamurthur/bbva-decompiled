package androidx.compose.foundation.layout;

import androidx.compose.runtime.collection.MutableVector;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/layout/FlowResult;", "", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getMainAxisTotalSize", "()I", "mainAxisTotalSize", "b", "getCrossAxisTotalSize", "crossAxisTotalSize", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;", "c", "Landroidx/compose/runtime/collection/MutableVector;", "getItems", "()Landroidx/compose/runtime/collection/MutableVector;", FirebaseAnalytics.Param.ITEMS, "<init>", "(IILandroidx/compose/runtime/collection/MutableVector;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
public final class FlowResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int mainAxisTotalSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int crossAxisTotalSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableVector<RowColumnMeasureHelperResult> items;

    public FlowResult(int i10, int i11, @NotNull MutableVector<RowColumnMeasureHelperResult> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.mainAxisTotalSize = i10;
        this.crossAxisTotalSize = i11;
        this.items = items;
    }

    public final int getCrossAxisTotalSize() {
        return this.crossAxisTotalSize;
    }

    @NotNull
    public final MutableVector<RowColumnMeasureHelperResult> getItems() {
        return this.items;
    }

    public final int getMainAxisTotalSize() {
        return this.mainAxisTotalSize;
    }
}
