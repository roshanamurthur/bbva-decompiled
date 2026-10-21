package com.bbva.glomohybrid.infoscreen.optionlist.adapters.holders;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bbva.glomohybrid.infoscreen.R;
import com.bbva.glomohybrid.infoscreen.databinding.ViewExpandableItemBinding;
import com.bbva.glomohybrid.infoscreen.optionlist.OptionListContract;
import com.bbva.glomohybrid.infoscreen.optionlist.adapters.holders.ExpandableViewHolder;
import com.bbva.glomohybrid.infoscreen.optionlist.model.AccessibilityData;
import com.bbva.glomohybrid.infoscreen.optionlist.model.ButtonLink;
import com.bbva.glomohybrid.infoscreen.optionlist.model.OptionData;
import com.bbva.ui.widget.BbvaTextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import d9.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ExpandableViewHolder.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ>\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00072\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\t¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/adapters/holders/ExpandableViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/OptionData;", "optionData", "Lkotlin/Function1;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Intent;", "", "Lcom/bbva/glomohybrid/infoscreen/optionlist/adapters/holders/OnItemClick;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/bbva/glomohybrid/infoscreen/optionlist/adapters/holders/OnExpandClick;", "onExpandClick", "bind", "Lcom/bbva/glomohybrid/infoscreen/databinding/ViewExpandableItemBinding;", "view", "<init>", "(Lcom/bbva/glomohybrid/infoscreen/databinding/ViewExpandableItemBinding;)V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class ExpandableViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ int f32415r0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ViewExpandableItemBinding f32416p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Context f32417q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableViewHolder(@NotNull ViewExpandableItemBinding view) {
        super(view.getRoot());
        Intrinsics.checkNotNullParameter(view, "view");
        this.f32416p0 = view;
        Context context = view.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f32417q0 = context;
    }

    public final void bind(@NotNull final OptionData optionData, @NotNull final Function1<? super OptionListContract.Intent, Unit> listener, @NotNull Function1<? super OptionData, Unit> onExpandClick) {
        Integer description;
        Integer imageDescription;
        Integer titleDescription;
        Intrinsics.checkNotNullParameter(optionData, "optionData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(onExpandClick, "onExpandClick");
        ViewExpandableItemBinding viewExpandableItemBinding = this.f32416p0;
        BbvaTextView bbvaTextView = viewExpandableItemBinding.title;
        int title = optionData.getTitle();
        Context context = this.f32417q0;
        bbvaTextView.setText(context.getString(title));
        viewExpandableItemBinding.description.setText(context.getString(optionData.getDescription()));
        viewExpandableItemBinding.icon.setImageResource(optionData.isExpanded() ? R.drawable.ic_collapse : R.drawable.ic_expand);
        viewExpandableItemBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: d9.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = ExpandableViewHolder.f32415r0;
                Function1 listener2 = listener;
                Intrinsics.checkNotNullParameter(listener2, "$listener");
                OptionData optionData2 = optionData;
                Intrinsics.checkNotNullParameter(optionData2, "$optionData");
                listener2.invoke(new OptionListContract.Intent.OptionSelected(optionData2));
            }
        });
        AccessibilityData accessibilityData = optionData.getAccessibilityData();
        if (accessibilityData != null && (titleDescription = accessibilityData.getTitleDescription()) != null) {
            viewExpandableItemBinding.title.setContentDescription(context.getString(titleDescription.intValue()));
        }
        AccessibilityData accessibilityData2 = optionData.getAccessibilityData();
        if (accessibilityData2 != null && (imageDescription = accessibilityData2.getImageDescription()) != null) {
            viewExpandableItemBinding.icon.setContentDescription(context.getString(imageDescription.intValue()));
        }
        AccessibilityData accessibilityData3 = optionData.getAccessibilityData();
        if (accessibilityData3 != null && (description = accessibilityData3.getDescription()) != null) {
            viewExpandableItemBinding.description.setContentDescription(context.getString(description.intValue()));
        }
        ButtonLink buttonLink = optionData.getButtonLink();
        if (buttonLink != null) {
            viewExpandableItemBinding.optionExpandableButton.setText(context.getString(buttonLink.getText()));
            viewExpandableItemBinding.optionExpandableButton.setVisibility(0);
            viewExpandableItemBinding.optionExpandableButton.setOnClickListener(new View.OnClickListener() { // from class: d9.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = ExpandableViewHolder.f32415r0;
                    Function1 listener2 = listener;
                    Intrinsics.checkNotNullParameter(listener2, "$listener");
                    OptionData optionData2 = optionData;
                    Intrinsics.checkNotNullParameter(optionData2, "$optionData");
                    listener2.invoke(new OptionListContract.Intent.ButtonOptionTapped(optionData2));
                }
            });
        }
        viewExpandableItemBinding.icon.setOnClickListener(new c(onExpandClick, optionData, 0));
        viewExpandableItemBinding.icon.setImageResource(optionData.isExpanded() ? R.drawable.ic_collapse : R.drawable.ic_expand);
        viewExpandableItemBinding.expandableContainer.setVisibility(optionData.isExpanded() ? 0 : 8);
    }
}
