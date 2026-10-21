package com.bbva.glomohybrid.observers;

import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.session.domain.observers.SessionTokenObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w9.a;

/* JADX INFO: compiled from: SessionStorageTokenObserver.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/observers/SessionStorageTokenObserver;", "Lcom/bbva/session/domain/observers/SessionTokenObserver;", "", "token", "", "onNewToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "threadDispatchers", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class SessionStorageTokenObserver implements SessionTokenObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f33812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f33813b;

    public SessionStorageTokenObserver(@NotNull MainStorage storage, @NotNull ThreadDispatchers threadDispatchers) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(threadDispatchers, "threadDispatchers");
        this.f33812a = storage;
        this.f33813b = threadDispatchers;
    }

    public static final Object access$putValue(SessionStorageTokenObserver sessionStorageTokenObserver, String str, Continuation continuation) {
        Object objWithContext = BuildersKt.withContext(sessionStorageTokenObserver.f33813b.io(), new a(sessionStorageTokenObserver, str, null), continuation);
        return objWithContext == ek.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    @Override // com.bbva.session.domain.observers.SessionTokenObserver
    @Nullable
    public Object onNewToken(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.f33813b.io(), new a(this, str, null), continuation);
        if (objWithContext != ek.a.getCOROUTINE_SUSPENDED()) {
            objWithContext = Unit.INSTANCE;
        }
        return objWithContext == ek.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public /* synthetic */ SessionStorageTokenObserver(MainStorage mainStorage, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mainStorage, (i10 & 2) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}
