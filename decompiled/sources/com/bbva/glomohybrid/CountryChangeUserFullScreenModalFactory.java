package com.bbva.glomohybrid;

import android.content.Context;
import com.bbva.glomohybrid.base.models.ModalType;
import com.bbva.glomohybrid.ui.modals.FullScreenModal;
import com.bbva.glomohybrid.ui.modals.changeuser.DefaultChangeUserFullScreenModalFactory;
import com.bbva.glomohybrid.ui.modals.changeuser.FullScreenModalFactory;
import com.bbva.glomoutils.StringExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CountryChangeUserFullScreenModalFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\tH\u0014¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/CountryChangeUserFullScreenModalFactory;", "Lcom/bbva/glomohybrid/ui/modals/changeuser/DefaultChangeUserFullScreenModalFactory;", "Lcom/bbva/glomohybrid/ui/modals/changeuser/FullScreenModalFactory;", "Landroid/content/Context;", "context", "Lcom/bbva/glomohybrid/base/models/ModalType;", "modalType", "Lcom/bbva/glomohybrid/ui/modals/FullScreenModal$FullScreenModalConfig;", "create", "Lcom/bbva/glomohybrid/base/models/ModalType$ChangeUserWithFeaturesList;", "buildModalChangeUserWithFeaturesList", "<init>", "()V", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class CountryChangeUserFullScreenModalFactory extends DefaultChangeUserFullScreenModalFactory implements FullScreenModalFactory {
    @Override // com.bbva.glomohybrid.ui.modals.changeuser.DefaultChangeUserFullScreenModalFactory
    @NotNull
    public FullScreenModal.FullScreenModalConfig buildModalChangeUserWithFeaturesList(@NotNull Context context, @NotNull ModalType.ChangeUserWithFeaturesList modalType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(modalType, "modalType");
        String string = context.getString(com.bbva.glomohybrid.ui.R.string.change_user_modal_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = context.getString(com.bbva.glomohybrid.ui.R.string.change_user_features_list_modal_title, StringExtensionsKt.capitalizeWord(modalType.getUserName()));
        int i10 = com.bbva.glomohybrid.ui.R.drawable.ic_private_area;
        String string3 = context.getString(com.bbva.glomohybrid.ui.R.string.change_user_features_list_modal_description);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return new FullScreenModal.FullScreenModalConfig("change-user-signing", string, string2, i10, string3, null, modalType.getFeaturesList(), context.getString(com.bbva.glomohybrid.ui.R.string.change_user_modal_button_change), context.getString(com.bbva.glomohybrid.ui.R.string.change_user_modal_button_cancel));
    }

    @Override // com.bbva.glomohybrid.ui.modals.changeuser.DefaultChangeUserFullScreenModalFactory, com.bbva.glomohybrid.ui.modals.changeuser.ChangeUserFullScreenModalFactory, com.bbva.glomohybrid.ui.modals.changeuser.FullScreenModalFactory
    @Nullable
    public FullScreenModal.FullScreenModalConfig create(@NotNull Context context, @NotNull ModalType modalType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(modalType, "modalType");
        if (!(modalType instanceof ModalType.ErrorSSONoPhone)) {
            if (modalType instanceof ModalType.ChangeUserWithFeaturesList) {
                return buildModalChangeUserWithFeaturesList(context, (ModalType.ChangeUserWithFeaturesList) modalType);
            }
            return null;
        }
        String string = context.getString(com.bbva.glomohybrid.ui.R.string.full_modal_error_change_profile_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = context.getString(com.bbva.glomohybrid.ui.R.string.full_modal_error_change_profile_header);
        int i10 = com.bbva.glomohybrid.ui.R.drawable.ic_warning_illus;
        String string3 = context.getString(com.bbva.glomohybrid.ui.R.string.full_modal_error_change_profile_text);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return new FullScreenModal.FullScreenModalConfig("single-app-error", string, string2, i10, string3, null, null, context.getString(com.bbva.glomohybrid.ui.R.string.full_modal_error_change_profile_negative_button_text), null, 256, null);
    }
}
