package com.bbva.glomohybrid.ui.modals.changeuser.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bbva.glomohybrid.ui.databinding.ItemInfoListBinding;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FeaturesListAdapter.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u000b\u001a\u00020\n2\n\u0010\b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/ui/modals/changeuser/adapters/FeaturesListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bbva/glomohybrid/ui/modals/changeuser/adapters/FeaturesListAdapter$ViewHolder;", "Landroid/view/ViewGroup;", "viewGroup", "", "viewType", "onCreateViewHolder", "viewHolder", "position", "", "onBindViewHolder", "getItemCount", "", "", "dataSet", "<init>", "(Ljava/util/List;)V", "ViewHolder", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class FeaturesListAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final List<String> f34645p0;

    /* JADX INFO: compiled from: FeaturesListAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/ui/modals/changeuser/adapters/FeaturesListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/bbva/glomohybrid/ui/databinding/ItemInfoListBinding;", "p0", "Lcom/bbva/glomohybrid/ui/databinding/ItemInfoListBinding;", "getBinding", "()Lcom/bbva/glomohybrid/ui/databinding/ItemInfoListBinding;", "binding", "<init>", "(Lcom/bbva/glomohybrid/ui/modals/changeuser/adapters/FeaturesListAdapter;Lcom/bbva/glomohybrid/ui/databinding/ItemInfoListBinding;)V", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ItemInfoListBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull FeaturesListAdapter featuresListAdapter, ItemInfoListBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
        }

        @NotNull
        public final ItemInfoListBinding getBinding() {
            return this.binding;
        }
    }

    public FeaturesListAdapter(@NotNull List<String> dataSet) {
        Intrinsics.checkNotNullParameter(dataSet, "dataSet");
        this.f34645p0 = dataSet;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f34645p0.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder viewHolder, int position) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        viewHolder.getBinding().featureItemText.setText(this.f34645p0.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int viewType) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        ItemInfoListBinding itemInfoListBindingInflate = ItemInfoListBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemInfoListBindingInflate, "inflate(...)");
        return new ViewHolder(this, itemInfoListBindingInflate);
    }
}
