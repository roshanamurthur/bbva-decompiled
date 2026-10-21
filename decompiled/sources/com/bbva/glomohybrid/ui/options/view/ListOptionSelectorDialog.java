package com.bbva.glomohybrid.ui.options.view;

import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.bbva.glomohybrid.ui.options.profileselector.model.ProfileSelectedItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ListOptionSelectorDialog.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016J\u001c\u0010\b\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016J\u001c\u0010\t\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/view/ListOptionSelectorDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "addCloseAction", "action", "Lkotlin/Function1;", "Landroid/view/View;", "", "addFooterAction", "addItemClicked", "Lcom/bbva/glomohybrid/ui/options/profileselector/model/ProfileSelectedItem;", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class ListOptionSelectorDialog extends DialogFragment {

    /* JADX INFO: compiled from: ListOptionSelectorDialog.kt */
    public static final class a extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f34713p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListOptionSelectorDialog addCloseAction$default(ListOptionSelectorDialog listOptionSelectorDialog, Function1 function1, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addCloseAction");
        }
        if ((i10 & 1) != 0) {
            function1 = a.f34713p0;
        }
        return listOptionSelectorDialog.addCloseAction(function1);
    }

    @NotNull
    public ListOptionSelectorDialog addCloseAction(@NotNull Function1<? super View, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return this;
    }

    @NotNull
    public ListOptionSelectorDialog addFooterAction(@NotNull Function1<? super View, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return this;
    }

    @NotNull
    public ListOptionSelectorDialog addItemClicked(@NotNull Function1<? super ProfileSelectedItem, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return this;
    }
}
