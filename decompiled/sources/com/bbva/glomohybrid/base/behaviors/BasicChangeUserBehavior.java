package com.bbva.glomohybrid.base.behaviors;

import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomohybrid.base.models.ModalType;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ChangeUserBehavior.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/bbva/glomohybrid/base/behaviors/BasicChangeUserBehavior;", "Lcom/bbva/glomohybrid/base/behaviors/ChangeUserBehavior;", "()V", "compute", "Lcom/bbva/glomohybrid/base/models/ModalType;", Scopes.PROFILE, "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", "(Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BasicChangeUserBehavior implements ChangeUserBehavior {
    @Override // com.bbva.glomohybrid.base.behaviors.ChangeUserBehavior
    @Nullable
    public Object compute(@NotNull UserProfileConfiguration userProfileConfiguration, @NotNull Continuation<? super ModalType> continuation) {
        return new ModalType.ChangeUser(null, false, 3, null);
    }
}
