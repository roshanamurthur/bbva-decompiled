package com.bbva.component.ui.modal.list.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.bbva.component.ui.modal.databinding.ListModalItemSelectedBinding;
import com.bbva.component.ui.modal.databinding.ListModalItemUnselectedBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ViewHolderRenderer.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/bbva/component/ui/modal/list/adapter/ViewHolderRenderer;", "", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lcom/bbva/component/ui/modal/list/adapter/ListModalViewHolder;", "getHolder", "<init>", "()V", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0})
public final class ViewHolderRenderer {

    @NotNull
    public static final ViewHolderRenderer INSTANCE = new ViewHolderRenderer();

    @NotNull
    public final ListModalViewHolder getHolder(@NotNull ViewGroup parent, int viewType) {
        ViewBinding viewBindingInflate;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 2) {
            viewBindingInflate = ListModalItemUnselectedBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(viewBindingInflate, "inflate(...)");
        } else {
            viewBindingInflate = ListModalItemSelectedBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(viewBindingInflate, "inflate(...)");
        }
        return new ListModalViewHolder(viewBindingInflate);
    }
}
