package com.bbva.component.ui.modal.list.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bbva.component.ui.modal.list.model.Item;
import com.bbva.component.ui.modal.list.model.ItemData;
import com.bbva.component.ui.modal.list.utils.ExtensionsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ListModalAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J,\u0010\u0015\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u0011j\u0002`\u0013¨\u0006\u0019"}, d2 = {"Lcom/bbva/component/ui/modal/list/adapter/ListModalAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bbva/component/ui/modal/list/adapter/ListModalViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemViewType", "getItemCount", "", "Lcom/bbva/component/ui/modal/list/model/ItemData;", "data", "Lkotlin/Function1;", "Lcom/bbva/component/ui/modal/list/model/Item;", "Lcom/bbva/component/ui/modal/list/adapter/OnItemSelected;", "onItemSelected", "update", "<init>", "()V", "Companion", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0})
public final class ListModalAdapter extends RecyclerView.Adapter<ListModalViewHolder> {
    public static final int SELECTED_ITEM_STATE = 1;
    public static final int UNSELECTED_ITEM_STATE = 2;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public List<Item> f28718p0 = CollectionsKt__CollectionsKt.emptyList();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public Function1<? super Item, Unit> f28719q0;

    /* JADX INFO: compiled from: ListModalAdapter.kt */
    @SourceDebugExtension({"SMAP\nListModalAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListModalAdapter.kt\ncom/bbva/component/ui/modal/list/adapter/ListModalAdapter$onBindViewHolder$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,50:1\n1549#2:51\n1620#2,3:52\n*S KotlinDebug\n*F\n+ 1 ListModalAdapter.kt\ncom/bbva/component/ui/modal/list/adapter/ListModalAdapter$onBindViewHolder$1\n*L\n28#1:51\n28#1:52,3\n*E\n"})
    public static final class a extends Lambda implements Function1<Item, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Item item) {
            Item itemSelected = item;
            Intrinsics.checkNotNullParameter(itemSelected, "itemSelected");
            ListModalAdapter listModalAdapter = ListModalAdapter.this;
            List<Item> list = listModalAdapter.f28718p0;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (Item item2 : list) {
                arrayList.add(Item.copy$default(item2, null, null, null, null, 0, Intrinsics.areEqual(item2.getTag(), itemSelected.getTag()), 31, null));
            }
            listModalAdapter.f28718p0 = arrayList;
            Function1 function1 = listModalAdapter.f28719q0;
            if (function1 != null) {
                function1.invoke(itemSelected);
            }
            listModalAdapter.notifyItemChanged(itemSelected.getPosition());
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f28718p0.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.f28718p0.get(position).getSelected() ? 1 : 2;
    }

    public final void update(@NotNull List<ItemData> data, @NotNull Function1<? super Item, Unit> onItemSelected) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onItemSelected, "onItemSelected");
        this.f28718p0 = ExtensionsKt.toItems(data, null);
        this.f28719q0 = onItemSelected;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ListModalViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.f28718p0.get(position), new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ListModalViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return ViewHolderRenderer.INSTANCE.getHolder(parent, viewType);
    }
}
