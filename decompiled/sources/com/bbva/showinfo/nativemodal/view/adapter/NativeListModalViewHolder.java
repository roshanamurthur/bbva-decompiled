package com.bbva.showinfo.nativemodal.view.adapter;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.showinfo.databinding.NativeListModalItemBinding;
import com.bbva.showinfo.nativemodal.modal.Item;
import com.bbva.showinfo.nativemodal.utils.AccessibilityTool;
import com.bbva.showinfo.nativemodal.view.adapter.NativeListModalViewHolder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NativeListModalViewHolder.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006¨\u0006\r"}, d2 = {"Lcom/bbva/showinfo/nativemodal/view/adapter/NativeListModalViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/bbva/showinfo/nativemodal/modal/Item;", AnalyticsConstants.Key.ITEM, "Lkotlin/Function1;", "", "Lcom/bbva/showinfo/nativemodal/view/adapter/OnItemClick;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "bind", "Lcom/bbva/showinfo/databinding/NativeListModalItemBinding;", "view", "<init>", "(Lcom/bbva/showinfo/databinding/NativeListModalItemBinding;)V", "showinfo_release"}, k = 1, mv = {1, 9, 0})
public final class NativeListModalViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f36561q0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final NativeListModalItemBinding f36562p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeListModalViewHolder(@NotNull NativeListModalItemBinding view) {
        super(view.getRoot());
        Intrinsics.checkNotNullParameter(view, "view");
        this.f36562p0 = view;
    }

    public final void bind(@NotNull final Item item, @NotNull final Function1<? super Item, Unit> listener) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(listener, "listener");
        NativeListModalItemBinding nativeListModalItemBinding = this.f36562p0;
        final ConstraintLayout nativeContainerModalItem = nativeListModalItemBinding.nativeContainerModalItem;
        Intrinsics.checkNotNullExpressionValue(nativeContainerModalItem, "nativeContainerModalItem");
        nativeContainerModalItem.setOnClickListener(new View.OnClickListener() { // from class: ac.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = NativeListModalViewHolder.f36561q0;
                Function1 listener2 = listener;
                Intrinsics.checkNotNullParameter(listener2, "$listener");
                Item item2 = item;
                Intrinsics.checkNotNullParameter(item2, "$item");
                ConstraintLayout this_setListener = nativeContainerModalItem;
                Intrinsics.checkNotNullParameter(this_setListener, "$this_setListener");
                listener2.invoke(item2);
                AccessibilityTool accessibilityTool = AccessibilityTool.INSTANCE;
                Context context = this_setListener.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                String accessibleTextOnClick = item2.getAccessibleTextOnClick();
                if (accessibleTextOnClick == null) {
                    accessibleTextOnClick = "";
                }
                accessibilityTool.announceForAccessibility(context, accessibleTextOnClick);
            }
        });
        AppCompatTextView nativeListModalItemText = nativeListModalItemBinding.nativeListModalItemText;
        Intrinsics.checkNotNullExpressionValue(nativeListModalItemText, "nativeListModalItemText");
        nativeListModalItemText.setText(item.getText());
        nativeListModalItemText.setContentDescription(item.getAccessibleText());
        nativeListModalItemBinding.nativeListModalItemRadioButton.setChecked(item.getSelected());
    }
}
