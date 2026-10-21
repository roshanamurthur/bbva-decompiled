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
import com.afollestad.materialdialogs.utils.IntArraysKt;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MultiChoiceDialogAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012_\u0012\u0004\u0012\u00020\u0004\u0012U\u0012S\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005j\u0002`\u000f0\u0003B\u0098\u0001\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f\u0012\b\u00109\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010:\u001a\u00020\n\u0012\u0006\u0010;\u001a\u00020*\u0012\u0006\u0010<\u001a\u00020*\u0012W\u00108\u001aS\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005j\u0002`\u000f¢\u0006\u0004\b=\u0010>J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0010H\u0016J&\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016J\b\u0010 \u001a\u00020\u000eH\u0016Jo\u0010\"\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2W\u0010!\u001aS\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005j\u0002`\u000fH\u0016J\u0010\u0010#\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010'\u001a\u00020\u000eH\u0016J\b\u0010(\u001a\u00020\u000eH\u0016J\b\u0010)\u001a\u00020\u000eH\u0016J\u0010\u0010+\u001a\u00020*2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101Rs\u00108\u001aS\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005j\u0002`\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006?"}, d2 = {"Lcom/afollestad/materialdialogs/internal/list/MultiChoiceDialogAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/afollestad/materialdialogs/internal/list/MultiChoiceViewHolder;", "Lcom/afollestad/materialdialogs/internal/list/DialogAdapter;", "", "Lkotlin/Function3;", "Lcom/afollestad/materialdialogs/MaterialDialog;", "Lkotlin/ParameterName;", "name", "dialog", "", "indices", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/afollestad/materialdialogs/list/MultiChoiceListener;", "", FirebaseAnalytics.Param.INDEX, "itemClicked$com_afollestad_material_dialogs_core", "(I)V", "itemClicked", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "onBindViewHolder", "", "", "payloads", "positiveButtonClicked", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "replaceItems", "disableItems", "checkItems", "uncheckItems", "toggleItems", "checkAllItems", "uncheckAllItems", "toggleAllChecked", "", "isItemChecked", "s0", "Ljava/util/List;", "getItems$com_afollestad_material_dialogs_core", "()Ljava/util/List;", "setItems$com_afollestad_material_dialogs_core", "(Ljava/util/List;)V", "v0", "Lkotlin/jvm/functions/Function3;", "getSelection$com_afollestad_material_dialogs_core", "()Lkotlin/jvm/functions/Function3;", "setSelection$com_afollestad_material_dialogs_core", "(Lkotlin/jvm/functions/Function3;)V", "selection", "disabledItems", "initialSelection", "waitForActionButton", "allowEmptySelection", "<init>", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/util/List;[I[IZZLkotlin/jvm/functions/Function3;)V", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 4, 0})
public final class MultiChoiceDialogAdapter extends RecyclerView.Adapter<MultiChoiceViewHolder> implements DialogAdapter<CharSequence, Function3<? super MaterialDialog, ? super int[], ? super List<? extends CharSequence>, ? extends Unit>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int[] f25497p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int[] f25498q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final MaterialDialog f25499r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends CharSequence> items;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f25501t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final boolean f25502u0;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @Nullable
    public Function3<? super MaterialDialog, ? super int[], ? super List<? extends CharSequence>, Unit> selection;

    public MultiChoiceDialogAdapter(@NotNull MaterialDialog materialDialog, @NotNull List<? extends CharSequence> list, @Nullable int[] iArr, @NotNull int[] iArr2, boolean z10, boolean z11, @Nullable Function3<? super MaterialDialog, ? super int[], ? super List<? extends CharSequence>, Unit> function3) {
        this.f25499r0 = materialDialog;
        this.items = list;
        this.f25501t0 = z10;
        this.f25502u0 = z11;
        this.selection = function3;
        this.f25497p0 = iArr2;
        this.f25498q0 = iArr == null ? new int[0] : iArr;
    }

    public final void a(int[] iArr) {
        int[] iArr2 = this.f25497p0;
        this.f25497p0 = iArr;
        for (int i10 : iArr2) {
            if (!ArraysKt___ArraysKt.contains(iArr, i10)) {
                notifyItemChanged(i10, UncheckPayload.INSTANCE);
            }
        }
        for (int i11 : iArr) {
            if (!ArraysKt___ArraysKt.contains(iArr2, i11)) {
                notifyItemChanged(i11, CheckPayload.INSTANCE);
            }
        }
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void checkAllItems() {
        int[] iArr = this.f25497p0;
        int itemCount = getItemCount();
        int[] iArr2 = new int[itemCount];
        for (int i10 = 0; i10 < itemCount; i10++) {
            iArr2[i10] = i10;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < itemCount; i11++) {
            int i12 = iArr2[i11];
            if (true ^ ArraysKt___ArraysKt.contains(iArr, i12)) {
                arrayList.add(Integer.valueOf(i12));
            }
        }
        a(IntArraysKt.appendAll(this.f25497p0, arrayList));
        if (iArr.length == 0) {
            DialogActionExtKt.setActionButtonEnabled(this.f25499r0, WhichButton.POSITIVE, true);
        }
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void checkItems(@NotNull int[] indices) {
        int[] iArr = this.f25497p0;
        ArrayList arrayList = new ArrayList();
        for (int i10 : indices) {
            if (true ^ ArraysKt___ArraysKt.contains(iArr, i10)) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        a(IntArraysKt.appendAll(this.f25497p0, arrayList));
        if (iArr.length == 0) {
            DialogActionExtKt.setActionButtonEnabled(this.f25499r0, WhichButton.POSITIVE, true);
        }
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void disableItems(@NotNull int[] indices) {
        this.f25498q0 = indices;
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
    public final Function3<MaterialDialog, int[], List<? extends CharSequence>, Unit> getSelection$com_afollestad_material_dialogs_core() {
        return this.selection;
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public boolean isItemChecked(int index) {
        return ArraysKt___ArraysKt.contains(this.f25497p0, index);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void itemClicked$com_afollestad_material_dialogs_core(int index) {
        boolean z10;
        List<Integer> mutableList = ArraysKt___ArraysKt.toMutableList(this.f25497p0);
        if (mutableList.contains(Integer.valueOf(index))) {
            mutableList.remove(Integer.valueOf(index));
        } else {
            mutableList.add(Integer.valueOf(index));
        }
        a(CollectionsKt___CollectionsKt.toIntArray(mutableList));
        boolean z11 = this.f25501t0;
        MaterialDialog materialDialog = this.f25499r0;
        if (z11 && DialogActionExtKt.hasActionButtons(materialDialog)) {
            WhichButton whichButton = WhichButton.POSITIVE;
            if (!this.f25502u0) {
                z10 = (this.f25497p0.length == 0) ^ true;
            }
            DialogActionExtKt.setActionButtonEnabled(materialDialog, whichButton, z10);
            return;
        }
        List<? extends CharSequence> list = this.items;
        int[] iArr = this.f25497p0;
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            arrayList.add(list.get(i10));
        }
        Function3<? super MaterialDialog, ? super int[], ? super List<? extends CharSequence>, Unit> function3 = this.selection;
        if (function3 != null) {
            function3.invoke(materialDialog, this.f25497p0, arrayList);
        }
        if (!materialDialog.getAutoDismissEnabled() || DialogActionExtKt.hasActionButtons(materialDialog)) {
            return;
        }
        materialDialog.dismiss();
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void positiveButtonClicked() {
        if (!this.f25502u0) {
            if (!(!(this.f25497p0.length == 0))) {
                return;
            }
        }
        List<? extends CharSequence> list = this.items;
        int[] iArr = this.f25497p0;
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            arrayList.add(list.get(i10));
        }
        Function3<? super MaterialDialog, ? super int[], ? super List<? extends CharSequence>, Unit> function3 = this.selection;
        if (function3 != null) {
            function3.invoke(this.f25499r0, this.f25497p0, arrayList);
        }
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public /* bridge */ /* synthetic */ void replaceItems(List<? extends CharSequence> list, Function3<? super MaterialDialog, ? super int[], ? super List<? extends CharSequence>, ? extends Unit> function3) {
        replaceItems2(list, (Function3<? super MaterialDialog, ? super int[], ? super List<? extends CharSequence>, Unit>) function3);
    }

    public final void setItems$com_afollestad_material_dialogs_core(@NotNull List<? extends CharSequence> list) {
        this.items = list;
    }

    public final void setSelection$com_afollestad_material_dialogs_core(@Nullable Function3<? super MaterialDialog, ? super int[], ? super List<? extends CharSequence>, Unit> function3) {
        this.selection = function3;
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void toggleAllChecked() {
        if (this.f25497p0.length == 0) {
            checkAllItems();
        } else {
            uncheckAllItems();
        }
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void toggleItems(@NotNull int[] indices) {
        List<Integer> mutableList = ArraysKt___ArraysKt.toMutableList(this.f25497p0);
        for (int i10 : indices) {
            if (!ArraysKt___ArraysKt.contains(this.f25498q0, i10)) {
                if (mutableList.contains(Integer.valueOf(i10))) {
                    mutableList.remove(Integer.valueOf(i10));
                } else {
                    mutableList.add(Integer.valueOf(i10));
                }
            }
        }
        int[] intArray = CollectionsKt___CollectionsKt.toIntArray(mutableList);
        DialogActionExtKt.setActionButtonEnabled(this.f25499r0, WhichButton.POSITIVE, intArray.length == 0 ? this.f25502u0 : true);
        a(intArray);
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void uncheckAllItems() {
        a(new int[0]);
        DialogActionExtKt.setActionButtonEnabled(this.f25499r0, WhichButton.POSITIVE, this.f25502u0);
    }

    @Override // com.afollestad.materialdialogs.internal.list.DialogAdapter
    public void uncheckItems(@NotNull int[] indices) {
        int[] iArr = this.f25497p0;
        ArrayList arrayList = new ArrayList();
        for (int i10 : indices) {
            if (ArraysKt___ArraysKt.contains(iArr, i10)) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        int[] iArrRemoveAll = IntArraysKt.removeAll(this.f25497p0, arrayList);
        if (iArrRemoveAll.length == 0) {
            DialogActionExtKt.setActionButtonEnabled(this.f25499r0, WhichButton.POSITIVE, this.f25502u0);
        }
        a(iArrRemoveAll);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10, List list) {
        onBindViewHolder((MultiChoiceViewHolder) viewHolder, i10, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public MultiChoiceViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        MDUtil mDUtil = MDUtil.INSTANCE;
        MaterialDialog materialDialog = this.f25499r0;
        MultiChoiceViewHolder multiChoiceViewHolder = new MultiChoiceViewHolder(mDUtil.inflate(parent, materialDialog.getWindowContext(), R.layout.md_listitem_multichoice), this);
        MDUtil.maybeSetTextColor$default(mDUtil, multiChoiceViewHolder.getTitleView(), materialDialog.getWindowContext(), Integer.valueOf(R.attr.md_color_content), null, 4, null);
        int[] iArrResolveColors$default = ColorsKt.resolveColors$default(materialDialog, new int[]{R.attr.md_color_widget, R.attr.md_color_widget_unchecked}, null, 2, null);
        CompoundButtonCompat.setButtonTintList(multiChoiceViewHolder.getControlView(), mDUtil.createColorSelector(materialDialog.getWindowContext(), iArrResolveColors$default[1], iArrResolveColors$default[0]));
        return multiChoiceViewHolder;
    }

    /* JADX INFO: renamed from: replaceItems, reason: avoid collision after fix types in other method */
    public void replaceItems2(@NotNull List<? extends CharSequence> items, @Nullable Function3<? super MaterialDialog, ? super int[], ? super List<? extends CharSequence>, Unit> listener) {
        this.items = items;
        if (listener != null) {
            this.selection = listener;
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull MultiChoiceViewHolder holder, int position) {
        holder.setEnabled(!ArraysKt___ArraysKt.contains(this.f25498q0, position));
        holder.getControlView().setChecked(ArraysKt___ArraysKt.contains(this.f25497p0, position));
        holder.getTitleView().setText(this.items.get(position));
        View view = holder.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        MaterialDialog materialDialog = this.f25499r0;
        view.setBackground(DialogListExtKt.getItemSelector(materialDialog));
        if (materialDialog.getBodyFont() != null) {
            holder.getTitleView().setTypeface(materialDialog.getBodyFont());
        }
    }

    public void onBindViewHolder(@NotNull MultiChoiceViewHolder holder, int position, @NotNull List<Object> payloads) {
        Object objFirstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) payloads);
        if (Intrinsics.areEqual(objFirstOrNull, CheckPayload.INSTANCE)) {
            holder.getControlView().setChecked(true);
        } else if (Intrinsics.areEqual(objFirstOrNull, UncheckPayload.INSTANCE)) {
            holder.getControlView().setChecked(false);
        } else {
            super.onBindViewHolder(holder, position, payloads);
            super.onBindViewHolder(holder, position, payloads);
        }
    }
}
