package com.bbva.glomohybrid.ui.modals.changeuser;

import android.content.Context;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomohybrid.base.models.ModalType;
import com.bbva.glomohybrid.ui.R;
import com.bbva.glomohybrid.ui.modals.FullScreenModal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SingleAppFullScreenModalFactory.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\bH\u0004J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\nH\u0014J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0004¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomohybrid/ui/modals/changeuser/SingleAppFullScreenModalFactory;", "Lcom/bbva/glomohybrid/ui/modals/changeuser/FullScreenModalFactory;", "Landroid/content/Context;", "context", "Lcom/bbva/glomohybrid/base/models/ModalType;", "modalType", "Lcom/bbva/glomohybrid/ui/modals/FullScreenModal$FullScreenModalConfig;", "create", "Lcom/bbva/glomohybrid/base/models/ModalType$ChangeProfileRequestByDeeplink;", "buildModalChangeProfileByPush", "Lcom/bbva/glomohybrid/base/models/ModalType$ChangeUserWithFeaturesList;", "buildModalChangeUserWithFeaturesList", "buildModalErrorChangeUserWithSSO", "<init>", "()V", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public class SingleAppFullScreenModalFactory implements FullScreenModalFactory {

    /* JADX INFO: compiled from: SingleAppFullScreenModalFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserType.values().length];
            try {
                iArr[UserType.PERSONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserType.ENTERPRISE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static FullScreenModal.FullScreenModalConfig a(Context context, String str, String str2) {
        int i10 = R.string.change_profile_modal_title;
        String string = context.getString(i10);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new FullScreenModal.FullScreenModalConfig(str, string, context.getString(i10), R.drawable.ic_exit_environment, str2, null, null, context.getString(R.string.change_profile_modal_positive_button), context.getString(R.string.change_profile_modal_negative_button));
    }

    @NotNull
    public final FullScreenModal.FullScreenModalConfig buildModalChangeProfileByPush(@NotNull Context context, @NotNull ModalType.ChangeProfileRequestByDeeplink modalType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(modalType, "modalType");
        int i10 = WhenMappings.$EnumSwitchMapping$0[modalType.getTarget().ordinal()];
        if (i10 == 1) {
            String string = context.getString(R.string.change_profile_modal_glomo_description);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return a(context, "change-profile-by-push-to-glomo", string);
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string2 = context.getString(R.string.change_profile_modal_gema_description);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return a(context, "change-profile-by-push-to-gema", string2);
    }

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
    public final FullScreenModal.FullScreenModalConfig buildModalErrorChangeUserWithSSO(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R.string.full_modal_error_change_profile_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = context.getString(R.string.full_modal_error_change_profile_header);
        int i10 = R.drawable.ic_warning_illus;
        String string3 = context.getString(R.string.full_modal_error_change_profile_text);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return new FullScreenModal.FullScreenModalConfig("single-app-error", string, string2, i10, string3, null, null, context.getString(R.string.full_modal_error_change_profile_positive_button_text), context.getString(R.string.full_modal_error_change_profile_negative_button_text));
    }

    @Override // com.bbva.glomohybrid.ui.modals.changeuser.FullScreenModalFactory
    @Nullable
    public FullScreenModal.FullScreenModalConfig create(@NotNull Context context, @NotNull ModalType modalType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(modalType, "modalType");
        if (modalType instanceof ModalType.ErrorSSO) {
            return buildModalErrorChangeUserWithSSO(context);
        }
        if (modalType instanceof ModalType.ChangeUserWithFeaturesList) {
            return buildModalChangeUserWithFeaturesList(context, (ModalType.ChangeUserWithFeaturesList) modalType);
        }
        if (modalType instanceof ModalType.ChangeProfileRequestByDeeplink) {
            return buildModalChangeProfileByPush(context, (ModalType.ChangeProfileRequestByDeeplink) modalType);
        }
        return null;
    }
}
