package com.afollestad.materialdialogs.internal.list;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MultiChoiceDialogAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/afollestad/materialdialogs/internal/list/MultiChoiceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "view", "", "onClick", "Landroidx/appcompat/widget/AppCompatCheckBox;", "p0", "Landroidx/appcompat/widget/AppCompatCheckBox;", "getControlView", "()Landroidx/appcompat/widget/AppCompatCheckBox;", "controlView", "Landroid/widget/TextView;", "q0", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "titleView", "", "value", "isEnabled", "()Z", "setEnabled", "(Z)V", "itemView", "Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;", "adapter", "<init>", "(Landroid/view/View;Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;)V", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 4, 0})
public final class MultiChoiceViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AppCompatCheckBox controlView;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextView titleView;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final MultiChoiceDialogAdapter f25505r0;

    public MultiChoiceViewHolder(@NotNull View view, @NotNull MultiChoiceDialogAdapter multiChoiceDialogAdapter) {
        super(view);
        this.f25505r0 = multiChoiceDialogAdapter;
        view.setOnClickListener(this);
        View viewFindViewById = view.findViewById(R.id.md_control);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById, "itemView.findViewById(R.id.md_control)");
        this.controlView = (AppCompatCheckBox) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.md_title);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById2, "itemView.findViewById(R.id.md_title)");
        this.titleView = (TextView) viewFindViewById2;
    }

    @NotNull
    public final AppCompatCheckBox getControlView() {
        return this.controlView;
    }

    @NotNull
    public final TextView getTitleView() {
        return this.titleView;
    }

    public final boolean isEnabled() {
        View itemView = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(itemView, "itemView");
        return itemView.isEnabled();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View view) {
        this.f25505r0.itemClicked$com_afollestad_material_dialogs_core(getAdapterPosition());
    }

    public final void setEnabled(boolean z10) {
        View itemView = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(itemView, "itemView");
        itemView.setEnabled(z10);
        this.controlView.setEnabled(z10);
        this.titleView.setEnabled(z10);
    }
}
