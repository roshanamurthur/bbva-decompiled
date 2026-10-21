package com.bbva.glomohybrid.base.session;

import com.bbva.glomo.user.domain.model.UserType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SessionTokenResetManager.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/base/session/SessionTokenResetManager;", "", "", "recreate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enableRecreateSession", "Lcom/bbva/glomohybrid/base/session/SessionTokenGenerator;", "sessionTokenGenerator", "<init>", "(Lcom/bbva/glomohybrid/base/session/SessionTokenGenerator;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class SessionTokenResetManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SessionTokenGenerator f31537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f31538b;

    /* JADX INFO: compiled from: SessionTokenResetManager.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.base.session.SessionTokenResetManager", f = "SessionTokenResetManager.kt", i = {0}, l = {11}, m = "recreate", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public SessionTokenResetManager f31539p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f31540q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f31542s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31540q0 = obj;
            this.f31542s0 |= Integer.MIN_VALUE;
            return SessionTokenResetManager.this.recreate(this);
        }
    }

    public SessionTokenResetManager(@NotNull SessionTokenGenerator sessionTokenGenerator) {
        Intrinsics.checkNotNullParameter(sessionTokenGenerator, "sessionTokenGenerator");
        this.f31537a = sessionTokenGenerator;
        this.f31538b = true;
    }

    public final void enableRecreateSession() {
        this.f31538b = true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object recreate(@NotNull Continuation<? super Unit> continuation) {
        a aVar;
        SessionTokenResetManager sessionTokenResetManager;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f31542s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f31542s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f31540q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f31542s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f31538b) {
                SessionTokenGenerator sessionTokenGenerator = this.f31537a;
                sessionTokenGenerator.clearCache();
                UserType userType = UserType.PERSONAL;
                aVar.f31539p0 = this;
                aVar.f31542s0 = 1;
                if (sessionTokenGenerator.generate(userType, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sessionTokenResetManager = this;
            }
            return Unit.INSTANCE;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        sessionTokenResetManager = aVar.f31539p0;
        ResultKt.throwOnFailure(obj);
        sessionTokenResetManager.f31538b = false;
        return Unit.INSTANCE;
    }
}
