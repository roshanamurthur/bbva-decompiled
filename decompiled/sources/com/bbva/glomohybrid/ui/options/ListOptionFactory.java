package com.bbva.glomohybrid.ui.options;

import android.content.Context;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomohybrid.ui.options.view.ListOptionSelectorDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ListOptionFactory.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J$\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/ListOptionFactory;", "", "()V", "newUserTypeModal", "Lcom/bbva/glomohybrid/ui/options/view/ListOptionSelectorDialog;", "context", "Landroid/content/Context;", "selectedOption", "", "rememberedUserTypeModal", "rememberedUser", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "Companion", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class ListOptionFactory {

    @NotNull
    public static final String ID = "globalListOptionFactory";

    public static /* synthetic */ ListOptionSelectorDialog newUserTypeModal$default(ListOptionFactory listOptionFactory, Context context, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newUserTypeModal");
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return listOptionFactory.newUserTypeModal(context, str);
    }

    public static /* synthetic */ ListOptionSelectorDialog rememberedUserTypeModal$default(ListOptionFactory listOptionFactory, Context context, RememberedUser rememberedUser, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rememberedUserTypeModal");
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        return listOptionFactory.rememberedUserTypeModal(context, rememberedUser, str);
    }

    @NotNull
    public ListOptionSelectorDialog newUserTypeModal(@NotNull Context context, @Nullable String selectedOption) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ListOptionSelectorDialog();
    }

    @NotNull
    public ListOptionSelectorDialog rememberedUserTypeModal(@NotNull Context context, @NotNull RememberedUser rememberedUser, @Nullable String selectedOption) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rememberedUser, "rememberedUser");
        return new ListOptionSelectorDialog();
    }
}
