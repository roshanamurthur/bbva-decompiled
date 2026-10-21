package com.bbva.glomo.user.repository.datasource;

import com.bbva.localstorage.storage.Storage;
import com.bbva.plugin.localstorage.command.ClearCommand;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UserVolatileDataSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/bbva/glomo/user/repository/datasource/UserVolatileDataSource;", "Lcom/bbva/glomo/user/repository/datasource/UserDataStore;", "", ClearCommand.ID, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/localstorage/storage/Storage;", "storage", "<init>", "(Lcom/bbva/localstorage/storage/Storage;)V", "Companion", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final class UserVolatileDataSource implements UserDataStore {

    @NotNull
    public static final String KEY_USER_MERCURIO_JWS = "mercurioJWS";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Storage f30900a;

    public UserVolatileDataSource(@NotNull Storage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f30900a = storage;
    }

    @Override // com.bbva.glomo.user.repository.datasource.UserDataStore
    @Nullable
    public Object clear(@NotNull Continuation<? super Unit> continuation) {
        this.f30900a.remove(KEY_USER_MERCURIO_JWS);
        return Unit.INSTANCE;
    }
}
