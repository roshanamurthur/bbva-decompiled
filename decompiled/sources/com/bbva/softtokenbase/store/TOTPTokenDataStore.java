package com.bbva.softtokenbase.store;

import com.bbva.glomo.user.repository.datasource.UserDataStore;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.softtokenbase.SoftToken;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TOTPTokenDataStore.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/bbva/softtokenbase/store/TOTPTokenDataStore;", "Lcom/bbva/glomo/user/repository/datasource/UserDataStore;", "", ClearCommand.ID, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/softtokenbase/SoftToken;", "softToken", "<init>", "(Lcom/bbva/softtokenbase/SoftToken;)V", "softtokenbase_release"}, k = 1, mv = {1, 9, 0})
public final class TOTPTokenDataStore implements UserDataStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SoftToken f36891a;

    /* JADX INFO: compiled from: TOTPTokenDataStore.kt */
    @DebugMetadata(c = "com.bbva.softtokenbase.store.TOTPTokenDataStore", f = "TOTPTokenDataStore.kt", i = {0}, l = {11, 12}, m = ClearCommand.ID, n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TOTPTokenDataStore f36892p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f36893q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f36895s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36893q0 = obj;
            this.f36895s0 |= Integer.MIN_VALUE;
            return TOTPTokenDataStore.this.clear(this);
        }
    }

    public TOTPTokenDataStore(@NotNull SoftToken softToken) {
        Intrinsics.checkNotNullParameter(softToken, "softToken");
        this.f36891a = softToken;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.glomo.user.repository.datasource.UserDataStore
    @Nullable
    public Object clear(@NotNull Continuation<? super Unit> continuation) {
        a aVar;
        TOTPTokenDataStore tOTPTokenDataStore;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f36895s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f36895s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f36893q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f36895s0;
        if (i11 != 0) {
            if (i11 == 1) {
                tOTPTokenDataStore = aVar.f36892p0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        aVar.f36892p0 = this;
        aVar.f36895s0 = 1;
        if (UserDataStore.DefaultImpls.clear(this, aVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        tOTPTokenDataStore = this;
        SoftToken softToken = tOTPTokenDataStore.f36891a;
        aVar.f36892p0 = null;
        aVar.f36895s0 = 2;
        if (softToken.deleteAllTokenList(aVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
