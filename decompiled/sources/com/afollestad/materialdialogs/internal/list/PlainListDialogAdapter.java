package com.afollestad.materialdialogs.internal.list;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.WhichButton;
import com.afollestad.materialdialogs.actions.DialogActionExtKt;
import com.afollestad.materialdialogs.list.DialogListExtKt;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PlainListDialogAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012Y\u0012\u0004\u0012\u00020\u0004\u0012O\u0012M\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000e0\u0003B\u0082\u0001\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019\u0012\b\u00105\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u00106\u001a\u00020&\u0012Q\u00104\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000e¢\u0006\u0004\b7\u00108J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nJ\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016Ji\u0010\u001c\u001a\u00020\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00192Q\u0010\u001b\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000eH\u0016J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010 \u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010!\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010\"\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\rH\u0016J\b\u0010$\u001a\u00020\rH\u0016J\b\u0010%\u001a\u00020\rH\u0016J\u0010\u0010'\u001a\u00020&2\u0006\u0010\u000b\u001a\u00020\nH\u0016R(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-Rm\u00104\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00069"}, d2 = {"Lcom/afollestad/materialdialogs/internal/list/PlainListDialogAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/afollestad/materialdialogs/internal/list/PlainListViewHolder;", "Lcom/afollestad/materialdialogs/internal/list/DialogAdapter;", "", "Lkotlin/Function3;", "Lcom/afollestad/materialdialogs/MaterialDialog;", "Lkotlin/ParameterName;", "name", "dialog", "", FirebaseAnalytics.Param.INDEX, "text", "", "Lcom/afollestad/materialdialogs/list/ItemListener;", "itemClicked", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "onBindViewHolder", "positiveButtonClicked", "", FirebaseAnalytics.Param.ITEMS, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "replaceItems", "", "indices", "disableItems", "checkItems", "uncheckItems", "toggleItems", "checkAllItems", "uncheckAllItems", "toggleAllChecked", "", "isItemChecked", "r0", "Ljava/util/List;", "getItems$com_afollestad_material_dialogs_core", "()Ljava/util/List;", "setItems$com_afollestad_material_dialogs_core", "(Ljava/util/List;)V", "t0", "Lkotlin/jvm/functions/Function3;", "getSelection$com_afollestad_material_dialogs_core", "()Lkotlin/jvm/functions/Function3;", "setSelection$com_afollestad_material_dialogs_core", "(Lkotlin/jvm/functions/Function3;)V", "selection", "disabledItems", "waitForPositiveButton", "<init>", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/util/List;[IZLkotlin/jvm/functions/Function3;)V", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 4, 0})
public final class PlainListDialogAdapter extends RecyclerView.Adapter<PlainListViewHolder> implements DialogAdapter<CharSequence, Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, ? extends Unit>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int[] f25506p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final MaterialDialog f25507q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends CharSequence> items;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f25509s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit> selection;

    public PlainListDialogAdapter(@NotNull MaterialDialog materialDialog, @NotNull List<? extends CharSequence> list, @Nullable int[] iArr, boolean z10, @Nullable Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit> function3) {
        this.f25507q0 = materialDialog;
        this.items = list;
        this.f25509s0 = z10;
        this.selection = function3;
        this.f25506p0 = iArr == null ? new int[0] : iArr;
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void disableItems(@NotNull int[] indices) {
        this.f25506p0 = indices;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    @NotNull
    public final List<CharSequence> getItems$com_afollestad_material_dialogs_core() {
        return this.items;
    }

    @Nullable
    public final Function3<MaterialDialog, Integer, CharSequence, Unit> getSelection$com_afollestad_material_dialogs_core() {
        return this.selection;
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public boolean isItemChecked(int index) {
        return false;
    }

    public final void itemClicked(int index) {
        boolean z10 = this.f25509s0;
        MaterialDialog materialDialog = this.f25507q0;
        if (!z10 || !DialogActionExtKt.hasActionButton(materialDialog, WhichButton.POSITIVE)) {
            Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit> function3 = this.selection;
            if (function3 != null) {
                function3.invoke(materialDialog, Integer.valueOf(index), this.items.get(index));
            }
            if (!materialDialog.getAutoDismissEnabled() || DialogActionExtKt.hasActionButtons(materialDialog)) {
                return;
            }
            materialDialog.dismiss();
            return;
        }
        Object obj = materialDialog.getConfig().get("activated_index");
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        materialDialog.getConfig().put("activated_index", Integer.valueOf(index));
        if (num != null) {
            notifyItemChanged(num.intValue());
        }
        notifyItemChanged(index);
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void positiveButtonClicked() {
        MaterialDialog materialDialog = this.f25507q0;
        Object obj = materialDialog.getConfig().get("activated_index");
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit> function3 = this.selection;
            if (function3 != null) {
                function3.invoke(materialDialog, num, this.items.get(num.intValue()));
            }
            materialDialog.getConfig().remove("activated_index");
        }
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public /* bridge */ /* synthetic */ void replaceItems(List<? extends CharSequence> list, Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, ? extends Unit> function3) {
        replaceItems2(list, (Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit>) function3);
    }

    public final void setItems$com_afollestad_material_dialogs_core(@NotNull List<? extends CharSequence> list) {
        this.items = list;
    }

    public final void setSelection$com_afollestad_material_dialogs_core(@Nullable Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit> function3) {
        this.selection = function3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull PlainListViewHolder holder, int position) {
        View view = holder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        view.setEnabled(!ArraysKt___ArraysKt.contains(this.f25506p0, position));
        holder.getTitleView().setText(this.items.get(position));
        View view2 = holder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
        MaterialDialog materialDialog = this.f25507q0;
        view2.setBackground(DialogListExtKt.getItemSelector(materialDialog));
        Object obj = materialDialog.getConfig().get("activated_index");
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        View view3 = holder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "holder.itemView");
        view3.setActivated(num != null && num.intValue() == position);
        if (materialDialog.getBodyFont() != null) {
            holder.getTitleView().setTypeface(materialDialog.getBodyFont());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public PlainListViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        MDUtil mDUtil = MDUtil.INSTANCE;
        MaterialDialog materialDialog = this.f25507q0;
        PlainListViewHolder plainListViewHolder = new PlainListViewHolder(mDUtil.inflate(parent, materialDialog.getWindowContext(), R.layout.md_listitem), this);
        MDUtil.maybeSetTextColor$default(mDUtil, plainListViewHolder.getTitleView(), materialDialog.getWindowContext(), Integer.valueOf(R.attr.md_color_content), null, 4, null);
        return plainListViewHolder;
    }

    /* JADX INFO: renamed from: replaceItems, reason: avoid collision after fix types in other method */
    public void replaceItems2(@NotNull List<? extends CharSequence> items, @Nullable Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit> listener) {
        this.items = items;
        if (listener != null) {
            this.selection = listener;
        }
        notifyDataSetChanged();
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void checkAllItems() {
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void toggleAllChecked() {
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void uncheckAllItems() {
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void checkItems(@NotNull int[] indices) {
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void toggleItems(@NotNull int[] indices) {
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void uncheckItems(@NotNull int[] indices) {
    }
}
