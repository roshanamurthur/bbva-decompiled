package com.bbva.glomohybrid.infoscreen.optionlist.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bbva.glomohybrid.infoscreen.databinding.ViewOptionHeaderBinding;
import com.bbva.glomohybrid.infoscreen.optionlist.adapters.holders.OptionsHeaderViewHolder;
import com.bbva.glomohybrid.infoscreen.optionlist.model.Header;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HeaderAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rR(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/adapters/HeaderAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/adapters/holders/OptionsHeaderViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemCount", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/Header;", "header", "update", "<set-?>", "p0", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/Header;", "getHeader", "()Lcom/bbva/glomohybrid/infoscreen/optionlist/model/Header;", "<init>", "()V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nHeaderAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderAdapter.kt\ncom/bbva/glomohybrid/infoscreen/optionlist/adapters/HeaderAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
public final class HeaderAdapter extends RecyclerView.Adapter<OptionsHeaderViewHolder> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Header header;

    @Nullable
    public final Header getHeader() {
        return this.header;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 1;
    }

    public final void update(@NotNull Header header) {
        Intrinsics.checkNotNullParameter(header, "header");
        this.header = header;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull OptionsHeaderViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Header header = this.header;
        if (header != null) {
            holder.bind(header);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public OptionsHeaderViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ViewOptionHeaderBinding viewOptionHeaderBindingInflate = ViewOptionHeaderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(viewOptionHeaderBindingInflate, "inflate(...)");
        return new OptionsHeaderViewHolder(viewOptionHeaderBindingInflate);
    }
}
