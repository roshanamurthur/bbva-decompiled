package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import androidx.annotation.RestrictTo;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DialogScrollView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0014J(\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0014J\u0006\u0010\n\u001a\u00020\u0002R$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/afollestad/materialdialogs/internal/main/DialogScrollView;", "Landroid/widget/ScrollView;", "", "onAttachedToWindow", "", Parameters.DIRECTION.LEFT, "top", "oldl", "oldt", "onScrollChanged", "invalidateDividers", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "p0", "Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "getRootView", "()Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "setRootView", "(Lcom/afollestad/materialdialogs/internal/main/DialogLayout;)V", "rootView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 4, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class DialogScrollView extends ScrollView {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public DialogLayout rootView;

    /* JADX INFO: compiled from: DialogScrollView.kt */
    public static final class a extends Lambda implements Function1<DialogScrollView, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f25534p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogScrollView dialogScrollView) {
            DialogScrollView dialogScrollView2 = dialogScrollView;
            dialogScrollView2.invalidateDividers();
            DialogScrollView.access$invalidateOverScroll(dialogScrollView2);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ DialogScrollView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public static final void access$invalidateOverScroll(DialogScrollView dialogScrollView) {
        int i10;
        if (dialogScrollView.getChildCount() == 0 || dialogScrollView.getMeasuredHeight() == 0) {
            i10 = 2;
        } else {
            View childAt = dialogScrollView.getChildAt(0);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "getChildAt(0)");
            if (childAt.getMeasuredHeight() > dialogScrollView.getHeight()) {
                i10 = 1;
            } else {
                i10 = 2;
            }
        }
        dialogScrollView.setOverScrollMode(i10);
    }

    @Override // android.view.View
    @Nullable
    public final DialogLayout getRootView() {
        return this.rootView;
    }

    public final void invalidateDividers() {
        if (getChildCount() != 0 && getMeasuredHeight() != 0) {
            View childAt = getChildAt(0);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "getChildAt(0)");
            if (childAt.getMeasuredHeight() > getHeight()) {
                View view = getChildAt(getChildCount() - 1);
                Intrinsics.checkExpressionValueIsNotNull(view, "view");
                int bottom = view.getBottom() - (getScrollY() + getMeasuredHeight());
                DialogLayout dialogLayout = this.rootView;
                if (dialogLayout != null) {
                    dialogLayout.invalidateDividers(getScrollY() > 0, bottom > 0);
                    return;
                }
                return;
            }
        }
        DialogLayout dialogLayout2 = this.rootView;
        if (dialogLayout2 != null) {
            dialogLayout2.invalidateDividers(false, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MDUtil.INSTANCE.waitForWidth(this, a.f25534p0);
    }

    @Override // android.view.View
    public void onScrollChanged(int left, int top, int oldl, int oldt) {
        super.onScrollChanged(left, top, oldl, oldt);
        invalidateDividers();
    }

    public final void setRootView(@Nullable DialogLayout dialogLayout) {
        this.rootView = dialogLayout;
    }

    public DialogScrollView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
