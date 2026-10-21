package com.bbva.glomohybrid.ui.modals.changeuser;

import android.content.Context;
import com.bbva.glomohybrid.base.models.ModalType;
import com.bbva.glomohybrid.ui.modals.FullScreenModal;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FullScreenModalFactory.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/ui/modals/changeuser/FullScreenModalFactory;", "", "create", "Lcom/bbva/glomohybrid/ui/modals/FullScreenModal$FullScreenModalConfig;", "context", "Landroid/content/Context;", "modalType", "Lcom/bbva/glomohybrid/base/models/ModalType;", "Companion", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface FullScreenModalFactory {

    @NotNull
    public static final String CHANGE_PROFILE_PUSH_GEMA = "change-profile-by-push-to-gema";

    @NotNull
    public static final String CHANGE_PROFILE_PUSH_GLOMO = "change-profile-by-push-to-glomo";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f34644a;

    @NotNull
    public static final String SINGLE_APP_ERROR_ID = "single-app-error";

    /* JADX INFO: compiled from: FullScreenModalFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/ui/modals/changeuser/FullScreenModalFactory$Companion;", "", "()V", "CHANGE_PROFILE_PUSH_GEMA", "", "CHANGE_PROFILE_PUSH_GLOMO", "SINGLE_APP_ERROR_ID", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        @NotNull
        public static final String CHANGE_PROFILE_PUSH_GEMA = "change-profile-by-push-to-gema";

        @NotNull
        public static final String CHANGE_PROFILE_PUSH_GLOMO = "change-profile-by-push-to-glomo";

        @NotNull
        public static final String SINGLE_APP_ERROR_ID = "single-app-error";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f34644a = new Companion();
    }

    @Nullable
    FullScreenModal.FullScreenModalConfig create(@NotNull Context context, @NotNull ModalType modalType);
}
