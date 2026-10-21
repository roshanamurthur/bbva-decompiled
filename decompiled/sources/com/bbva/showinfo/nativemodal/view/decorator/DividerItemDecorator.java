package com.bbva.showinfo.nativemodal.view.decorator;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DividerItemDecorator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/showinfo/nativemodal/view/decorator/DividerItemDecorator;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "", "onDrawOver", "Landroid/graphics/drawable/Drawable;", "divider", "<init>", "(Landroid/graphics/drawable/Drawable;)V", "showinfo_release"}, k = 1, mv = {1, 9, 0})
public final class DividerItemDecorator extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Drawable f36563a;

    public DividerItemDecorator(@Nullable Drawable drawable) {
        this.f36563a = drawable;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int paddingLeft = parent.getPaddingLeft();
        int width = parent.getWidth() - parent.getPaddingRight();
        int childCount = parent.getChildCount() - 2;
        if (childCount < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            View childAt = parent.getChildAt(i10);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams)).bottomMargin;
            Drawable drawable = this.f36563a;
            int intrinsicHeight = (drawable != null ? drawable.getIntrinsicHeight() : 0) + bottom;
            if (drawable != null) {
                drawable.setBounds(paddingLeft, bottom, width, intrinsicHeight);
            }
            if (drawable != null) {
                drawable.draw(canvas);
            }
            if (i10 == childCount) {
                return;
            } else {
                i10++;
            }
        }
    }
}
