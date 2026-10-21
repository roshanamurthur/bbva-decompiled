package com.bbva.glomohybrid.ui.options.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.glomohybrid.ui.options.model.Option;
import com.bbva.glomohybrid.ui.options.profileselector.model.ProfileSelectedItem;
import com.bbva.glomohybrid.ui.options.view.render.Renderer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ListOptionAdapter.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001bB#\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0016J,\u0010\u0013\u001a\u00020\f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0016¨\u0006\u001c"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/view/ListOptionAdapter;", "Lcom/bbva/glomohybrid/ui/options/view/ClickableRecyclerViewAdapter;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onCreateViewHolder", "getItemCount", "position", "getItemViewType", "holder", "", "onBindViewHolder", "Lkotlin/Function1;", "Lcom/bbva/glomohybrid/ui/options/profileselector/model/ProfileSelectedItem;", "action", "Lkotlin/Function0;", "doAfterAction", "addItemClickedListener", "", "Lcom/bbva/glomohybrid/ui/options/model/Option;", "options", "Lcom/bbva/glomohybrid/ui/options/view/render/Renderer;", "renderer", "<init>", "(Ljava/util/List;Lcom/bbva/glomohybrid/ui/options/view/render/Renderer;)V", "Holder", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class ListOptionAdapter extends ClickableRecyclerViewAdapter {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final List<Option> f34710p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Renderer<Option> f34711q0;

    /* JADX INFO: compiled from: ListOptionAdapter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/view/ListOptionAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/bbva/glomohybrid/ui/options/model/Option;", AnalyticsConstants.Key.ITEM, "", "bind", "Landroid/view/View;", "view", "Lcom/bbva/glomohybrid/ui/options/view/render/Renderer;", "renderer", "<init>", "(Lcom/bbva/glomohybrid/ui/options/view/ListOptionAdapter;Landroid/view/View;Lcom/bbva/glomohybrid/ui/options/view/render/Renderer;)V", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public final class Holder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final Renderer<Option> f34712p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(@NotNull ListOptionAdapter listOptionAdapter, @NotNull View view, Renderer<Option> renderer) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(renderer, "renderer");
            this.f34712p0 = renderer;
        }

        public final void bind(@NotNull Option item) {
            Intrinsics.checkNotNullParameter(item, "item");
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            this.f34712p0.render(itemView, item, getAdapterPosition());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ListOptionAdapter(@NotNull List<? extends Option> options, @NotNull Renderer<Option> renderer) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        this.f34710p0 = options;
        this.f34711q0 = renderer;
    }

    @Override // com.bbva.glomohybrid.ui.options.view.ClickableRecyclerViewAdapter
    public void addItemClickedListener(@Nullable Function1<? super ProfileSelectedItem, Unit> action, @NotNull Function0<Unit> doAfterAction) {
        Intrinsics.checkNotNullParameter(doAfterAction, "doAfterAction");
        this.f34711q0.addItemClicked(action, doAfterAction);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f34710p0.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.f34710p0.get(position).type();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof Holder) {
            ((Holder) holder).bind(this.f34710p0.get(position));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        Renderer<Option> renderer = this.f34711q0;
        View viewInflate = layoutInflaterFrom.inflate(renderer.getLayoutId(viewType), parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new Holder(this, viewInflate, renderer);
    }
}
