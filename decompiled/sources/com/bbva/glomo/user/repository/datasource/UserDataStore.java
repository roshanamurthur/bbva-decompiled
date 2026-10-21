package com.bbva.glomo.user.repository.datasource;

import com.bbva.plugin.localstorage.command.ClearCommand;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UserDataStore.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomo/user/repository/datasource/UserDataStore;", "", ClearCommand.ID, "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface UserDataStore {

    /* JADX INFO: compiled from: UserDataStore.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Object clear(@NotNull UserDataStore userDataStore, @NotNull Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }
    }

    @Nullable
    Object clear(@NotNull Continuation<? super Unit> continuation);
}
