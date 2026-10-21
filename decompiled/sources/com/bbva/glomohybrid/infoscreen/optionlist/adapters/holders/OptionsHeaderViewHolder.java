package com.bbva.glomohybrid.infoscreen.optionlist.adapters.holders;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.bbva.glomohybrid.infoscreen.databinding.ViewOptionHeaderBinding;
import com.bbva.glomohybrid.infoscreen.optionlist.model.AccessibilityData;
import com.bbva.glomohybrid.infoscreen.optionlist.model.Header;
import com.bbva.ui.widget.BbvaTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OptionsHeaderViewHolder.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/adapters/holders/OptionsHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/Header;", "header", "", "bind", "Lcom/bbva/glomohybrid/infoscreen/databinding/ViewOptionHeaderBinding;", "p0", "Lcom/bbva/glomohybrid/infoscreen/databinding/ViewOptionHeaderBinding;", "getView", "()Lcom/bbva/glomohybrid/infoscreen/databinding/ViewOptionHeaderBinding;", "view", "<init>", "(Lcom/bbva/glomohybrid/infoscreen/databinding/ViewOptionHeaderBinding;)V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class OptionsHeaderViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ViewOptionHeaderBinding view;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Context f32419q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsHeaderViewHolder(@NotNull ViewOptionHeaderBinding view) {
        super(view.getRoot());
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        Context context = view.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f32419q0 = context;
    }

    public final void bind(@NotNull Header header) {
        Integer imageDescription;
        Integer description;
        Integer titleDescription;
        Intrinsics.checkNotNullParameter(header, "header");
        ViewOptionHeaderBinding viewOptionHeaderBinding = this.view;
        BbvaTextView bbvaTextView = viewOptionHeaderBinding.headerTitle;
        int title = header.getTitle();
        Context context = this.f32419q0;
        bbvaTextView.setText(context.getString(title));
        viewOptionHeaderBinding.headerDescription.setText(context.getString(header.getDescription()));
        viewOptionHeaderBinding.headerImage.setImageResource(header.getImage());
        AccessibilityData accessibilityData = header.getAccessibilityData();
        if (accessibilityData != null && (titleDescription = accessibilityData.getTitleDescription()) != null) {
            viewOptionHeaderBinding.headerTitle.setContentDescription(context.getString(titleDescription.intValue()));
        }
        AccessibilityData accessibilityData2 = header.getAccessibilityData();
        if (accessibilityData2 != null && (description = accessibilityData2.getDescription()) != null) {
            viewOptionHeaderBinding.headerDescription.setContentDescription(context.getString(description.intValue()));
        }
        AccessibilityData accessibilityData3 = header.getAccessibilityData();
        if (accessibilityData3 == null || (imageDescription = accessibilityData3.getImageDescription()) == null) {
            return;
        }
        viewOptionHeaderBinding.headerImage.setContentDescription(context.getString(imageDescription.intValue()));
    }

    @NotNull
    public final ViewOptionHeaderBinding getView() {
        return this.view;
    }
}
