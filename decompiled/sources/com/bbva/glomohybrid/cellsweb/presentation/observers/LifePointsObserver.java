package com.bbva.glomohybrid.cellsweb.presentation.observers;

import android.content.Context;
import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LifePointsObserver.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/observers/LifePointsObserver;", "Landroidx/lifecycle/Observer;", "", "points", "", "onChanged", "pageId", "Landroid/content/Context;", "context", "<init>", "(ILandroid/content/Context;)V", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class LifePointsObserver implements Observer<Integer> {
    public LifePointsObserver(int i10, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void onChanged(int points) {
    }

    @Override // androidx.lifecycle.Observer
    public /* bridge */ /* synthetic */ void onChanged(Integer num) {
        onChanged(num.intValue());
    }
}
