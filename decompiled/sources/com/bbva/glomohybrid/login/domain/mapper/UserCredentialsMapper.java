package com.bbva.glomohybrid.login.domain.mapper;

import com.bbva.component.ui.login.model.LoginResult;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomohybrid.login.domain.model.UserCredentials;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UserCredentialsMapper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/mapper/UserCredentialsMapper;", "", "cleanDocumentField", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "rememberedUser", "map", "Lcom/bbva/glomohybrid/login/domain/model/UserCredentials;", "data", "Lcom/bbva/component/ui/login/model/LoginResult;", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface UserCredentialsMapper {

    /* JADX INFO: compiled from: UserCredentialsMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static RememberedUser cleanDocumentField(@NotNull UserCredentialsMapper userCredentialsMapper, @NotNull RememberedUser rememberedUser) {
            Intrinsics.checkNotNullParameter(rememberedUser, "rememberedUser");
            return null;
        }
    }

    @Nullable
    RememberedUser cleanDocumentField(@NotNull RememberedUser rememberedUser);

    @NotNull
    UserCredentials map(@NotNull LoginResult data, @Nullable RememberedUser rememberedUser);
}
