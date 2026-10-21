package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BaseSubLayout.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006!"}, d2 = {"Lcom/afollestad/materialdialogs/internal/main/BaseSubLayout;", "Landroid/view/ViewGroup;", "", "getDividerColor", "Landroid/graphics/Paint;", "dividerPaint", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getDividerHeight", "()I", "dividerHeight", "Lcom/afollestad/materialdialogs/MaterialDialog;", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "getDialog", "()Lcom/afollestad/materialdialogs/MaterialDialog;", "setDialog", "(Lcom/afollestad/materialdialogs/MaterialDialog;)V", "", "value", "r0", "Z", "getDrawDivider", "()Z", "setDrawDivider", "(Z)V", "drawDivider", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 4, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class BaseSubLayout extends ViewGroup {

    @NotNull
    public MaterialDialog dialog;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Paint f25522p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public final int dividerHeight;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public boolean drawDivider;

    public /* synthetic */ BaseSubLayout(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    private final int getDividerColor() {
        MDUtil mDUtil = MDUtil.INSTANCE;
        MaterialDialog materialDialog = this.dialog;
        if (materialDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }
        Context context = materialDialog.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "dialog.context");
        return MDUtil.resolveColor$default(mDUtil, context, null, Integer.valueOf(R.attr.md_divider_color), null, 10, null);
    }

    @NotNull
    public final Paint dividerPaint() {
        Paint paint = this.f25522p0;
        paint.setColor(getDividerColor());
        return paint;
    }

    @NotNull
    public final MaterialDialog getDialog() {
        MaterialDialog materialDialog = this.dialog;
        if (materialDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }
        return materialDialog;
    }

    public final int getDividerHeight() {
        return this.dividerHeight;
    }

    public final boolean getDrawDivider() {
        return this.drawDivider;
    }

    public final void setDialog(@NotNull MaterialDialog materialDialog) {
        this.dialog = materialDialog;
    }

    public final void setDrawDivider(boolean z10) {
        this.drawDivider = z10;
        invalidate();
    }

    public BaseSubLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f25522p0 = paint;
        MDUtil mDUtil = MDUtil.INSTANCE;
        int i10 = R.dimen.md_divider_height;
        this.dividerHeight = mDUtil.dimenPx(this, i10);
        setWillNotDraw(false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(context.getResources().getDimension(i10));
        paint.setAntiAlias(true);
    }
}
