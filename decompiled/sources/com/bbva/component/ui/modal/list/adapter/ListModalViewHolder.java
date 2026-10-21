package com.bbva.component.ui.modal.list.adapter;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.component.ui.modal.databinding.ListModalItemSelectedBinding;
import com.bbva.component.ui.modal.databinding.ListModalItemUnselectedBinding;
import com.bbva.component.ui.modal.list.adapter.ListModalViewHolder;
import com.bbva.component.ui.modal.list.model.Item;
import com.bbva.component.ui.modal.list.utils.AccessibilityTool;
import com.bbva.ui.widget.BbvaTextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ListModalViewHolder.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006¨\u0006\r"}, d2 = {"Lcom/bbva/component/ui/modal/list/adapter/ListModalViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/bbva/component/ui/modal/list/model/Item;", AnalyticsConstants.Key.ITEM, "Lkotlin/Function1;", "", "Lcom/bbva/component/ui/modal/list/adapter/OnItemClick;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "bind", "Landroidx/viewbinding/ViewBinding;", "view", "<init>", "(Landroidx/viewbinding/ViewBinding;)V", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0})
public final class ListModalViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f28721q0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ViewBinding f28722p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListModalViewHolder(@NotNull ViewBinding view) {
        super(view.getRoot());
        Intrinsics.checkNotNullParameter(view, "view");
        this.f28722p0 = view;
    }

    public final void bind(@NotNull final Item item, @NotNull final Function1<? super Item, Unit> listener) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(listener, "listener");
        ViewBinding viewBinding = this.f28722p0;
        if (viewBinding instanceof ListModalItemSelectedBinding) {
            final BbvaTextView title = ((ListModalItemSelectedBinding) viewBinding).title;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            title.setText(item.getText());
            title.setContentDescription(item.getAccessibleText());
            title.setOnClickListener(new View.OnClickListener() { // from class: y5.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = ListModalViewHolder.f28721q0;
                    Function1 listener2 = listener;
                    Intrinsics.checkNotNullParameter(listener2, "$listener");
                    Item item2 = item;
                    Intrinsics.checkNotNullParameter(item2, "$item");
                    BbvaTextView this_applyTextViewData = title;
                    Intrinsics.checkNotNullParameter(this_applyTextViewData, "$this_applyTextViewData");
                    listener2.invoke(item2);
                    AccessibilityTool accessibilityTool = AccessibilityTool.INSTANCE;
                    Context context = this_applyTextViewData.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    String accessibleTextOnClick = item2.getAccessibleTextOnClick();
                    if (accessibleTextOnClick == null) {
                        accessibleTextOnClick = "";
                    }
                    accessibilityTool.announceForAccessibility(context, accessibleTextOnClick);
                }
            });
        } else if (viewBinding instanceof ListModalItemUnselectedBinding) {
            final BbvaTextView title2 = ((ListModalItemUnselectedBinding) viewBinding).title;
            Intrinsics.checkNotNullExpressionValue(title2, "title");
            title2.setText(item.getText());
            title2.setContentDescription(item.getAccessibleText());
            title2.setOnClickListener(new View.OnClickListener() { // from class: y5.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = ListModalViewHolder.f28721q0;
                    Function1 listener2 = listener;
                    Intrinsics.checkNotNullParameter(listener2, "$listener");
                    Item item2 = item;
                    Intrinsics.checkNotNullParameter(item2, "$item");
                    BbvaTextView this_applyTextViewData = title2;
                    Intrinsics.checkNotNullParameter(this_applyTextViewData, "$this_applyTextViewData");
                    listener2.invoke(item2);
                    AccessibilityTool accessibilityTool = AccessibilityTool.INSTANCE;
                    Context context = this_applyTextViewData.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    String accessibleTextOnClick = item2.getAccessibleTextOnClick();
                    if (accessibleTextOnClick == null) {
                        accessibleTextOnClick = "";
                    }
                    accessibilityTool.announceForAccessibility(context, accessibleTextOnClick);
                }
            });
        }
        viewBinding.getRoot().setSelected(item.getSelected());
    }
}
