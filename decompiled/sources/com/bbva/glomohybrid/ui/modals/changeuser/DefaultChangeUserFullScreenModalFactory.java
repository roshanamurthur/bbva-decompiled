package com.bbva.glomohybrid.ui.modals.changeuser;

import android.content.Context;
import com.bbva.glomohybrid.base.models.ModalType;
import com.bbva.glomohybrid.ui.R;
import com.bbva.glomohybrid.ui.modals.FullScreenModal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DefaultChangeUserFullScreenModalFactory.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nH\u0004J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/ui/modals/changeuser/DefaultChangeUserFullScreenModalFactory;", "Lcom/bbva/glomohybrid/ui/modals/changeuser/ChangeUserFullScreenModalFactory;", "()V", "buildModalChangeUserWithFeaturesList", "Lcom/bbva/glomohybrid/ui/modals/FullScreenModal$FullScreenModalConfig;", "context", "Landroid/content/Context;", "modalType", "Lcom/bbva/glomohybrid/base/models/ModalType$ChangeUserWithFeaturesList;", "buildModalChangeUserWithSigning", "Lcom/bbva/glomohybrid/base/models/ModalType$ChangeUserWithSigning;", "create", "Lcom/bbva/glomohybrid/base/models/ModalType;", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class DefaultChangeUserFullScreenModalFactory implements ChangeUserFullScreenModalFactory {
    @NotNull
    public FullScreenModal.FullScreenModalConfig buildModalChangeUserWithFeaturesList(@NotNull Context context, @NotNull ModalType.ChangeUserWithFeaturesList modalType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(modalType, "modalType");
        String string = context.getString(R.string.change_user_modal_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = context.getString(R.string.change_user_features_list_modal_title);
        int i10 = R.drawable.ic_private_area;
        String string3 = context.getString(R.string.change_user_features_list_modal_description);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return new FullScreenModal.FullScreenModalConfig("change-user-signing", string, string2, i10, string3, null, modalType.getFeaturesList(), context.getString(R.string.change_user_modal_button_change), context.getString(R.string.change_user_modal_button_cancel));
    }

    @NotNull
    public final FullScreenModal.FullScreenModalConfig buildModalChangeUserWithSigning(@NotNull Context context, @NotNull ModalType.ChangeUserWithSigning modalType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(modalType, "modalType");
        String string = context.getString(R.string.change_user_modal_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        int i10 = R.drawable.ic_private_area;
        String string2 = context.getString(R.string.change_user_modal_description, modalType.getUserName());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        int i11 = R.drawable.ic_info;
        String string3 = context.getString(R.string.change_user_modal_info_text);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = context.getString(R.string.change_user_modal_info_link);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String string5 = context.getString(R.string.change_user_modal_info_link_value);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        return new FullScreenModal.FullScreenModalConfig("change-user-signing", string, null, i10, string2, new FullScreenModal.InfoBoxConfig(i11, string3, string4, string5), null, context.getString(R.string.change_user_modal_button_change), context.getString(R.string.change_user_modal_button_cancel));
    }

    @Override // com.bbva.glomohybrid.ui.modals.changeuser.ChangeUserFullScreenModalFactory, com.bbva.glomohybrid.ui.modals.changeuser.FullScreenModalFactory
    @Nullable
    public FullScreenModal.FullScreenModalConfig create(@NotNull Context context, @NotNull ModalType modalType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(modalType, "modalType");
        if (modalType instanceof ModalType.ChangeUserWithSigning) {
            return buildModalChangeUserWithSigning(context, (ModalType.ChangeUserWithSigning) modalType);
        }
        if (modalType instanceof ModalType.ChangeUserWithFeaturesList) {
            return buildModalChangeUserWithFeaturesList(context, (ModalType.ChangeUserWithFeaturesList) modalType);
        }
        return null;
    }
}
