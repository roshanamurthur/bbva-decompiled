package com.afollestad.materialdialogs.internal.list;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PlainListDialogAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/afollestad/materialdialogs/internal/list/PlainListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "view", "", "onClick", "Landroid/widget/TextView;", "p0", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "titleView", "itemView", "Lcom/afollestad/materialdialogs/internal/list/PlainListDialogAdapter;", "adapter", "<init>", "(Landroid/view/View;Lcom/afollestad/materialdialogs/internal/list/PlainListDialogAdapter;)V", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 4, 0})
public final class PlainListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextView titleView;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final PlainListDialogAdapter f25512q0;

    public PlainListViewHolder(@NotNull View view, @NotNull PlainListDialogAdapter plainListDialogAdapter) {
        super(view);
        this.f25512q0 = plainListDialogAdapter;
        view.setOnClickListener(this);
        View childAt = ((ViewGroup) view).getChildAt(0);
        if (childAt == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.titleView = (TextView) childAt;
    }

    @NotNull
    public final TextView getTitleView() {
        return this.titleView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View view) {
        this.f25512q0.itemClicked(getAdapterPosition());
    }
}
