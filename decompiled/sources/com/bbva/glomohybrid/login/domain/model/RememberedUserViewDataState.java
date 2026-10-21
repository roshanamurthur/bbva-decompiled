package com.bbva.glomohybrid.login.domain.model;

import com.bbva.component.ui.login.model.LoginState;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomohybrid.base.models.UserAvatarModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RememberedUserViewDataState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/model/RememberedUserViewDataState;", "", "configure", "Lcom/bbva/component/ui/login/model/LoginState;", "userRemembered", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "avatarModel", "Lcom/bbva/glomohybrid/base/models/UserAvatarModel;", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface RememberedUserViewDataState {
    @NotNull
    LoginState configure(@Nullable RememberedUser userRemembered, @Nullable UserAvatarModel avatarModel);
}
