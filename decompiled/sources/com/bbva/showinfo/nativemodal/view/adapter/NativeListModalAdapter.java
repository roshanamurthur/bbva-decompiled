package com.bbva.showinfo.nativemodal.view.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bbva.showinfo.databinding.NativeListModalItemBinding;
import com.bbva.showinfo.nativemodal.modal.Item;
import com.bbva.showinfo.nativemodal.view.NativeListModalViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NativeListModalAdapter.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\u0011"}, d2 = {"Lcom/bbva/showinfo/nativemodal/view/adapter/NativeListModalAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bbva/showinfo/nativemodal/view/adapter/NativeListModalViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemCount", "Lcom/bbva/showinfo/nativemodal/view/NativeListModalViewModel;", "viewModel", "<init>", "(Lcom/bbva/showinfo/nativemodal/view/NativeListModalViewModel;)V", "showinfo_release"}, k = 1, mv = {1, 9, 0})
public final class NativeListModalAdapter extends RecyclerView.Adapter<NativeListModalViewHolder> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final NativeListModalViewModel f36559p0;

    /* JADX INFO: compiled from: NativeListModalAdapter.kt */
    public static final class a extends Lambda implements Function1<Item, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Item item) {
            Item item2 = item;
            Intrinsics.checkNotNullParameter(item2, "item");
            NativeListModalAdapter.this.f36559p0.selectItem(item2);
            return Unit.INSTANCE;
        }
    }

    public NativeListModalAdapter(@NotNull NativeListModalViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.f36559p0 = viewModel;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f36559p0.count();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull NativeListModalViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Item item = this.f36559p0.getItem(position);
        if (item == null) {
            return;
        }
        holder.bind(item, new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public NativeListModalViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        NativeListModalItemBinding nativeListModalItemBindingInflate = NativeListModalItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(nativeListModalItemBindingInflate, "inflate(...)");
        return new NativeListModalViewHolder(nativeListModalItemBindingInflate);
    }
}
