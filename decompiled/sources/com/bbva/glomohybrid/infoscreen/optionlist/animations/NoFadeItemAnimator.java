package com.bbva.glomohybrid.infoscreen.optionlist.animations;

import android.view.View;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NoFadeItemAnimator.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/optionlist/animations/NoFadeItemAnimator;", "Landroidx/recyclerview/widget/DefaultItemAnimator;", "()V", "animateChange", "", "oldHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "newHolder", "fromX", "", "fromY", "toX", "toY", "Companion", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NoFadeItemAnimator extends DefaultItemAnimator {
    @Override // androidx.recyclerview.widget.DefaultItemAnimator, androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateChange(@Nullable RecyclerView.ViewHolder oldHolder, @Nullable RecyclerView.ViewHolder newHolder, int fromX, int fromY, int toX, int toY) {
        boolean zAnimateChange = super.animateChange(oldHolder, newHolder, fromX, fromY, toX, toY);
        View view = oldHolder != null ? oldHolder.itemView : null;
        if (view != null) {
            view.setAlpha(1.0f);
        }
        View view2 = newHolder != null ? newHolder.itemView : null;
        if (view2 != null) {
            view2.setAlpha(1.0f);
        }
        return zAnimateChange;
    }
}
