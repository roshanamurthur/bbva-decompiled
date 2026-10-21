package com.bbva.glomohybrid.infoscreen.optionlist.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bbva.glomohybrid.infoscreen.databinding.ViewExpandableItemBinding;
import com.bbva.glomohybrid.infoscreen.optionlist.adapters.holders.ExpandableViewHolder;
import com.bbva.glomohybrid.infoscreen.optionlist.model.OptionData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ExpandableOptionsAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0016¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/adapters/ExpandableOptionsAdapter;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/adapters/OptionsAdapter;", "()V", "onBindViewHolder", "", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ExpandableOptionsAdapter extends OptionsAdapter {

    /* JADX INFO: compiled from: ExpandableOptionsAdapter.kt */
    @SourceDebugExtension({"SMAP\nExpandableOptionsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpandableOptionsAdapter.kt\ncom/bbva/glomohybrid/infoscreen/optionlist/adapters/ExpandableOptionsAdapter$onBindViewHolder$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n1855#2,2:36\n*S KotlinDebug\n*F\n+ 1 ExpandableOptionsAdapter.kt\ncom/bbva/glomohybrid/infoscreen/optionlist/adapters/ExpandableOptionsAdapter$onBindViewHolder$1\n*L\n24#1:36,2\n*E\n"})
    public static final class a extends Lambda implements Function1<OptionData, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OptionData optionData) {
            OptionData selectedOption = optionData;
            Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
            ExpandableOptionsAdapter expandableOptionsAdapter = ExpandableOptionsAdapter.this;
            for (OptionData optionData2 : expandableOptionsAdapter.getOptions()) {
                if (selectedOption.getTitle() == optionData2.getTitle()) {
                    optionData2.setExpanded(!optionData2.isExpanded());
                } else {
                    optionData2.setExpanded(false);
                }
            }
            expandableOptionsAdapter.notifyDataSetChanged();
            return Unit.INSTANCE;
        }
    }

    public ExpandableOptionsAdapter() {
        super(null, 1, null);
    }

    @Override // com.bbva.glomohybrid.infoscreen.optionlist.adapters.OptionsAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        OptionData optionData = getOptions().get(position);
        ExpandableViewHolder expandableViewHolder = holder instanceof ExpandableViewHolder ? (ExpandableViewHolder) holder : null;
        if (expandableViewHolder != null) {
            expandableViewHolder.bind(optionData, getListener(), new a());
        }
    }

    @Override // com.bbva.glomohybrid.infoscreen.optionlist.adapters.OptionsAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ViewExpandableItemBinding viewExpandableItemBindingInflate = ViewExpandableItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(viewExpandableItemBindingInflate, "inflate(...)");
        return new ExpandableViewHolder(viewExpandableItemBindingInflate);
    }
}
