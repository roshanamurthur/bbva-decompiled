package com.bbva.glomohybrid.landing.presentation.adapter;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bbva.glomohybrid.landing.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LandingItemsMarginDecorator.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/adapter/LandingItemsMarginDecorator;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "", "getItemOffsets", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingItemsMarginDecorator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingItemsMarginDecorator.kt\ncom/bbva/glomohybrid/landing/presentation/adapter/LandingItemsMarginDecorator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"})
public final class LandingItemsMarginDecorator extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33008a;

    public LandingItemsMarginDecorator(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f33008a = context.getResources().getDimensionPixelOffset(R.dimen.landing_items_extra_margin);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = parent.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (childAdapterPosition == -1) {
            return;
        }
        Integer numValueOf = Integer.valueOf(this.f33008a);
        numValueOf.intValue();
        if (itemCount <= 1 || childAdapterPosition != itemCount - 1) {
            numValueOf = null;
        }
        outRect.bottom = numValueOf != null ? numValueOf.intValue() : 0;
    }
}
