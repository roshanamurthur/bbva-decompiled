package com.afollestad.materialdialogs.internal.list;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.CompoundButtonCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.WhichButton;
import com.afollestad.materialdialogs.actions.DialogActionExtKt;
import com.afollestad.materialdialogs.list.DialogListExtKt;
import com.afollestad.materialdialogs.utils.ColorsKt;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SingleChoiceDialogAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012Y\u0012\u0004\u0012\u00020\u0004\u0012O\u0012M\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000e0\u0003B\u008a\u0001\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e\u0012\b\u0010:\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010;\u001a\u00020\n\u0012\u0006\u0010<\u001a\u00020+\u0012Q\u00109\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000e¢\u0006\u0004\b=\u0010>J\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\nH\u0016J\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\nH\u0016J&\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0016Ji\u0010!\u001a\u00020\r2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e2Q\u0010 \u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000eH\u0016J\u0010\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010%\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010&\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010'\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0016J\b\u0010(\u001a\u00020\rH\u0016J\b\u0010)\u001a\u00020\rH\u0016J\b\u0010*\u001a\u00020\rH\u0016J\u0010\u0010,\u001a\u00020+2\u0006\u0010\u000b\u001a\u00020\nH\u0016R(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102Rm\u00109\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0005j\u0002`\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006?"}, d2 = {"Lcom/afollestad/materialdialogs/internal/list/SingleChoiceDialogAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/afollestad/materialdialogs/internal/list/SingleChoiceViewHolder;", "Lcom/afollestad/materialdialogs/internal/list/DialogAdapter;", "", "Lkotlin/Function3;", "Lcom/afollestad/materialdialogs/MaterialDialog;", "Lkotlin/ParameterName;", "name", "dialog", "", FirebaseAnalytics.Param.INDEX, "text", "", "Lcom/afollestad/materialdialogs/list/SingleChoiceListener;", "itemClicked$com_afollestad_material_dialogs_core", "(I)V", "itemClicked", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "onBindViewHolder", "", "", "payloads", "positiveButtonClicked", "", FirebaseAnalytics.Param.ITEMS, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "replaceItems", "", "indices", "disableItems", "checkItems", "uncheckItems", "toggleItems", "checkAllItems", "uncheckAllItems", "toggleAllChecked", "", "isItemChecked", "s0", "Ljava/util/List;", "getItems$com_afollestad_material_dialogs_core", "()Ljava/util/List;", "setItems$com_afollestad_material_dialogs_core", "(Ljava/util/List;)V", "u0", "Lkotlin/jvm/functions/Function3;", "getSelection$com_afollestad_material_dialogs_core", "()Lkotlin/jvm/functions/Function3;", "setSelection$com_afollestad_material_dialogs_core", "(Lkotlin/jvm/functions/Function3;)V", "selection", "disabledItems", "initialSelection", "waitForActionButton", "<init>", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/util/List;[IIZLkotlin/jvm/functions/Function3;)V", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 4, 0})
public final class SingleChoiceDialogAdapter extends RecyclerView.Adapter<SingleChoiceViewHolder> implements DialogAdapter<CharSequence, Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, ? extends Unit>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f25513p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int[] f25514q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final MaterialDialog f25515r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends CharSequence> items;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f25517t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit> selection;

    public SingleChoiceDialogAdapter(@NotNull MaterialDialog materialDialog, @NotNull List<? extends CharSequence> list, @Nullable int[] iArr, int i10, boolean z10, @Nullable Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit> function3) {
        this.f25515r0 = materialDialog;
        this.items = list;
        this.f25517t0 = z10;
        this.selection = function3;
        this.f25513p0 = i10;
        this.f25514q0 = iArr == null ? new int[0] : iArr;
    }

    public final void a(int i10) {
        int i11 = this.f25513p0;
        if (i10 == i11) {
            return;
        }
        this.f25513p0 = i10;
        notifyItemChanged(i11, UncheckPayload.INSTANCE);
        notifyItemChanged(i10, CheckPayload.INSTANCE);
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void checkItems(@NotNull int[] indices) {
        int i10 = (indices.length == 0) ^ true ? indices[0] : -1;
        if (ArraysKt___ArraysKt.contains(this.f25514q0, i10)) {
            return;
        }
        a(i10);
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void disableItems(@NotNull int[] indices) {
        this.f25514q0 = indices;
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
        return this.f25513p0 == index;
    }

    public final void itemClicked$com_afollestad_material_dialogs_core(int index) {
        a(index);
        boolean z10 = this.f25517t0;
        MaterialDialog materialDialog = this.f25515r0;
        if (z10 && DialogActionExtKt.hasActionButtons(materialDialog)) {
            DialogActionExtKt.setActionButtonEnabled(materialDialog, WhichButton.POSITIVE, true);
            return;
        }
        Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit> function3 = this.selection;
        if (function3 != null) {
            function3.invoke(materialDialog, Integer.valueOf(index), this.items.get(index));
        }
        if (!materialDialog.getAutoDismissEnabled() || DialogActionExtKt.hasActionButtons(materialDialog)) {
            return;
        }
        materialDialog.dismiss();
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void positiveButtonClicked() {
        Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit> function3;
        int i10 = this.f25513p0;
        if (i10 <= -1 || (function3 = this.selection) == null) {
            return;
        }
        function3.invoke(this.f25515r0, Integer.valueOf(i10), this.items.get(this.f25513p0));
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

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void toggleItems(@NotNull int[] indices) {
        int i10 = (indices.length == 0) ^ true ? indices[0] : -1;
        if (ArraysKt___ArraysKt.contains(this.f25514q0, i10)) {
            return;
        }
        if (indices.length == 0 || this.f25513p0 == i10) {
            a(-1);
        } else {
            a(i10);
        }
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void uncheckItems(@NotNull int[] indices) {
        if (ArraysKt___ArraysKt.contains(this.f25514q0, (indices.length == 0) ^ true ? indices[0] : -1)) {
            return;
        }
        a(-1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10, List list) {
        onBindViewHolder((SingleChoiceViewHolder) viewHolder, i10, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SingleChoiceViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        MDUtil mDUtil = MDUtil.INSTANCE;
        MaterialDialog materialDialog = this.f25515r0;
        SingleChoiceViewHolder singleChoiceViewHolder = new SingleChoiceViewHolder(mDUtil.inflate(parent, materialDialog.getWindowContext(), R.layout.md_listitem_singlechoice), this);
        MDUtil.maybeSetTextColor$default(mDUtil, singleChoiceViewHolder.getTitleView(), materialDialog.getWindowContext(), Integer.valueOf(R.attr.md_color_content), null, 4, null);
        int[] iArrResolveColors$default = ColorsKt.resolveColors$default(materialDialog, new int[]{R.attr.md_color_widget, R.attr.md_color_widget_unchecked}, null, 2, null);
        CompoundButtonCompat.setButtonTintList(singleChoiceViewHolder.getControlView(), mDUtil.createColorSelector(materialDialog.getWindowContext(), iArrResolveColors$default[1], iArrResolveColors$default[0]));
        return singleChoiceViewHolder;
    }

    /* JADX INFO: renamed from: replaceItems, reason: avoid collision after fix types in other method */
    public void replaceItems2(@NotNull List<? extends CharSequence> items, @Nullable Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit> listener) {
        this.items = items;
        if (listener != null) {
            this.selection = listener;
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SingleChoiceViewHolder holder, int position) {
        holder.setEnabled(!ArraysKt___ArraysKt.contains(this.f25514q0, position));
        holder.getControlView().setChecked(this.f25513p0 == position);
        holder.getTitleView().setText(this.items.get(position));
        View view = holder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        MaterialDialog materialDialog = this.f25515r0;
        view.setBackground(DialogListExtKt.getItemSelector(materialDialog));
        if (materialDialog.getBodyFont() != null) {
            holder.getTitleView().setTypeface(materialDialog.getBodyFont());
        }
    }

    public void onBindViewHolder(@NotNull SingleChoiceViewHolder holder, int position, @NotNull List<Object> payloads) {
        Object objFirstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) payloads);
        if (Intrinsics.areEqual(objFirstOrNull, CheckPayload.INSTANCE)) {
            holder.getControlView().setChecked(true);
        } else if (Intrinsics.areEqual(objFirstOrNull, UncheckPayload.INSTANCE)) {
            holder.getControlView().setChecked(false);
        } else {
            super.onBindViewHolder(holder, position, payloads);
        }
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
}
