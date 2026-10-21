package com.bbva.glomohybrid.login.model.constants;

import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.glomohybrid.login.domain.model.UserCredentials;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ActionConstants.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomohybrid/login/model/constants/ActionConstants;", "", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "Lcom/bbva/glomohybrid/login/domain/model/UserCredentials;", "a", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "getDO_LOGIN", "()Lcom/bbva/cells/component/kit/model/ActionSpec;", "DO_LOGIN", "", "b", "getSEND_USER_ID", "SEND_USER_ID", "<init>", "()V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class ActionConstants {

    @NotNull
    public static final ActionConstants INSTANCE = new ActionConstants();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ActionSpec<UserCredentials> DO_LOGIN = new ActionSpec<>("id_action_do_login_with_valid_user");

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ActionSpec<String> SEND_USER_ID = new ActionSpec<>("send_user_id");

    @NotNull
    public final ActionSpec<UserCredentials> getDO_LOGIN() {
        return DO_LOGIN;
    }

    @NotNull
    public final ActionSpec<String> getSEND_USER_ID() {
        return SEND_USER_ID;
    }
}
