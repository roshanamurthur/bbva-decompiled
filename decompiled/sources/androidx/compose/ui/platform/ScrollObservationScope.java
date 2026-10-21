package androidx.compose.ui.platform;

import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.semantics.ScrollAxisRange;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010%\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0019\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010%\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\u0014\u0010'\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Landroidx/compose/ui/platform/ScrollObservationScope;", "Landroidx/compose/ui/node/OwnerScope;", "", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSemanticsNodeId", "()I", "semanticsNodeId", "", "q0", "Ljava/util/List;", "getAllScopes", "()Ljava/util/List;", "allScopes", "", "r0", "Ljava/lang/Float;", "getOldXValue", "()Ljava/lang/Float;", "setOldXValue", "(Ljava/lang/Float;)V", "oldXValue", "s0", "getOldYValue", "setOldYValue", "oldYValue", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "t0", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "getHorizontalScrollAxisRange", "()Landroidx/compose/ui/semantics/ScrollAxisRange;", "setHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/ScrollAxisRange;)V", "horizontalScrollAxisRange", "u0", "getVerticalScrollAxisRange", "setVerticalScrollAxisRange", "verticalScrollAxisRange", "", "isValidOwnerScope", "()Z", "<init>", "(ILjava/util/List;Ljava/lang/Float;Ljava/lang/Float;Landroidx/compose/ui/semantics/ScrollAxisRange;Landroidx/compose/ui/semantics/ScrollAxisRange;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class ScrollObservationScope implements OwnerScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final int semanticsNodeId;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<ScrollObservationScope> allScopes;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Float oldXValue;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Float oldYValue;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ScrollAxisRange horizontalScrollAxisRange;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ScrollAxisRange verticalScrollAxisRange;

    public ScrollObservationScope(int i10, @NotNull List<ScrollObservationScope> allScopes, @Nullable Float f6, @Nullable Float f10, @Nullable ScrollAxisRange scrollAxisRange, @Nullable ScrollAxisRange scrollAxisRange2) {
        Intrinsics.checkNotNullParameter(allScopes, "allScopes");
        this.semanticsNodeId = i10;
        this.allScopes = allScopes;
        this.oldXValue = f6;
        this.oldYValue = f10;
        this.horizontalScrollAxisRange = scrollAxisRange;
        this.verticalScrollAxisRange = scrollAxisRange2;
    }

    @NotNull
    public final List<ScrollObservationScope> getAllScopes() {
        return this.allScopes;
    }

    @Nullable
    public final ScrollAxisRange getHorizontalScrollAxisRange() {
        return this.horizontalScrollAxisRange;
    }

    @Nullable
    public final Float getOldXValue() {
        return this.oldXValue;
    }

    @Nullable
    public final Float getOldYValue() {
        return this.oldYValue;
    }

    public final int getSemanticsNodeId() {
        return this.semanticsNodeId;
    }

    @Nullable
    public final ScrollAxisRange getVerticalScrollAxisRange() {
        return this.verticalScrollAxisRange;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.allScopes.contains(this);
    }

    public final void setHorizontalScrollAxisRange(@Nullable ScrollAxisRange scrollAxisRange) {
        this.horizontalScrollAxisRange = scrollAxisRange;
    }

    public final void setOldXValue(@Nullable Float f6) {
        this.oldXValue = f6;
    }

    public final void setOldYValue(@Nullable Float f6) {
        this.oldYValue = f6;
    }

    public final void setVerticalScrollAxisRange(@Nullable ScrollAxisRange scrollAxisRange) {
        this.verticalScrollAxisRange = scrollAxisRange;
    }
}
