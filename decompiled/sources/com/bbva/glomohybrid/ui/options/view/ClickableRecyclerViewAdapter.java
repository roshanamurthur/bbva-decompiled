package com.bbva.glomohybrid.ui.options.view;

import androidx.recyclerview.widget.RecyclerView;
import com.bbva.glomohybrid.ui.options.profileselector.model.ProfileSelectedItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ClickableRecyclerViewAdapter.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH&¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/view/ClickableRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "addItemClickedListener", "", "action", "Lkotlin/Function1;", "Lcom/bbva/glomohybrid/ui/options/profileselector/model/ProfileSelectedItem;", "doAfterAction", "Lkotlin/Function0;", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ClickableRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public abstract void addItemClickedListener(@Nullable Function1<? super ProfileSelectedItem, Unit> action, @NotNull Function0<Unit> doAfterAction);
}
