package com.bbva.glomo.user.repository.datasource;

import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.storage.TargetStorage;
import com.bbva.plugin.localstorage.command.ClearCommand;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PnnUserDataSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0013\u0010\u0007\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomo/user/repository/datasource/PnnUserDataSource;", "Lcom/bbva/glomo/user/repository/datasource/UserDataStore;", "", "isPnn", "", "storeIsPnn", "isPnnCustomer", ClearCommand.ID, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "Companion", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final class PnnUserDataSource implements UserDataStore {

    @NotNull
    public static final String IS_PNN_CUSTOMER_KEY = "is_pnn_customer";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f30878a;

    /* JADX INFO: compiled from: PnnUserDataSource.kt */
    @DebugMetadata(c = "com.bbva.glomo.user.repository.datasource.PnnUserDataSource", f = "PnnUserDataSource.kt", i = {0}, l = {23}, m = ClearCommand.ID, n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public PnnUserDataSource f30879p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f30880q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f30882s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30880q0 = obj;
            this.f30882s0 |= Integer.MIN_VALUE;
            return PnnUserDataSource.this.clear(this);
        }
    }

    public PnnUserDataSource(@NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f30878a = storage;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.glomo.user.repository.datasource.UserDataStore
    @Nullable
    public Object clear(@NotNull Continuation<? super Unit> continuation) {
        a aVar;
        PnnUserDataSource pnnUserDataSource;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f30882s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f30882s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f30880q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f30882s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            aVar.f30879p0 = this;
            aVar.f30882s0 = 1;
            if (UserDataStore.DefaultImpls.clear(this, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            pnnUserDataSource = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pnnUserDataSource = aVar.f30879p0;
            ResultKt.throwOnFailure(obj);
        }
        pnnUserDataSource.f30878a.remove(TargetStorage.Local, IS_PNN_CUSTOMER_KEY);
        return Unit.INSTANCE;
    }

    public final boolean isPnnCustomer() {
        return MainStorage.getBoolean$default(this.f30878a, IS_PNN_CUSTOMER_KEY, false, null, 4, null);
    }

    public final void storeIsPnn(boolean isPnn) {
        MainStorage.putBoolean$default(this.f30878a, IS_PNN_CUSTOMER_KEY, isPnn, null, 4, null);
    }
}
