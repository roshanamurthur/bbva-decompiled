package com.bbva.glomohybrid.infoscreen.optionlist.adapters.holders;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.bbva.glomohybrid.infoscreen.R;
import com.bbva.glomohybrid.infoscreen.databinding.OptionListItemBinding;
import com.bbva.glomohybrid.infoscreen.optionlist.OptionListContract;
import com.bbva.glomohybrid.infoscreen.optionlist.model.AccessibilityData;
import com.bbva.glomohybrid.infoscreen.optionlist.model.OptionData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import d9.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OptionsViewHolder.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/adapters/holders/OptionsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/OptionData;", "optionData", "Lkotlin/Function1;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/OptionListContract$Intent;", "", "Lcom/bbva/glomohybrid/infoscreen/optionlist/adapters/holders/OnItemClick;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "bind", "Lcom/bbva/glomohybrid/infoscreen/databinding/OptionListItemBinding;", "p0", "Lcom/bbva/glomohybrid/infoscreen/databinding/OptionListItemBinding;", "getView", "()Lcom/bbva/glomohybrid/infoscreen/databinding/OptionListItemBinding;", "view", "<init>", "(Lcom/bbva/glomohybrid/infoscreen/databinding/OptionListItemBinding;)V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class OptionsViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f32420q0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OptionListItemBinding view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsViewHolder(@NotNull OptionListItemBinding view) {
        super(view.getRoot());
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    public final Context a() {
        Context context = this.view.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    public final void bind(@NotNull OptionData optionData, @NotNull Function1<? super OptionListContract.Intent, Unit> listener) {
        Integer imageDescription;
        Integer description;
        Integer titleDescription;
        Intrinsics.checkNotNullParameter(optionData, "optionData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        OptionListItemBinding optionListItemBinding = this.view;
        optionListItemBinding.title.setText(a().getString(optionData.getTitle()));
        optionListItemBinding.description.setText(a().getString(optionData.getDescription()));
        optionListItemBinding.icon.setImageResource(R.drawable.ic_arrow_down);
        optionListItemBinding.getRoot().setOnClickListener(new d(listener, optionData, 0));
        AccessibilityData accessibilityData = optionData.getAccessibilityData();
        if (accessibilityData != null && (titleDescription = accessibilityData.getTitleDescription()) != null) {
            optionListItemBinding.title.setContentDescription(a().getString(titleDescription.intValue()));
        }
        AccessibilityData accessibilityData2 = optionData.getAccessibilityData();
        if (accessibilityData2 != null && (description = accessibilityData2.getDescription()) != null) {
            optionListItemBinding.description.setContentDescription(a().getString(description.intValue()));
        }
        AccessibilityData accessibilityData3 = optionData.getAccessibilityData();
        if (accessibilityData3 == null || (imageDescription = accessibilityData3.getImageDescription()) == null) {
            return;
        }
        optionListItemBinding.icon.setContentDescription(a().getString(imageDescription.intValue()));
    }

    @NotNull
    public final OptionListItemBinding getView() {
        return this.view;
    }
}
