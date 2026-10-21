package com.bbva.ethermobilesdk.token.trait.impl;

import androidx.core.app.NotificationCompat;
import com.bbva.ethermobilesdk.token.model.DeleteTokenRequest;
import com.bbva.ethermobilesdk.token.storage.TokenStorage;
import com.bbva.ethermobilesdk.token.trait.Trait;
import ek.a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeleteTokenTrait.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/bbva/ethermobilesdk/token/trait/impl/DeleteTokenTrait;", "Lcom/bbva/ethermobilesdk/token/trait/Trait;", "Lcom/bbva/ethermobilesdk/token/model/DeleteTokenRequest;", "", "request", NotificationCompat.CATEGORY_CALL, "(Lcom/bbva/ethermobilesdk/token/model/DeleteTokenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/token/storage/TokenStorage;", "tokenStorage", "<init>", "(Lcom/bbva/ethermobilesdk/token/storage/TokenStorage;)V", "ethertoken_release"}, k = 1, mv = {1, 8, 0})
public final class DeleteTokenTrait extends Trait<DeleteTokenRequest, Unit> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TokenStorage f30271b;

    /* JADX INFO: renamed from: com.bbva.ethermobilesdk.token.trait.impl.DeleteTokenTrait$call$1, reason: invalid class name */
    /* JADX INFO: compiled from: DeleteTokenTrait.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.trait.impl.DeleteTokenTrait", f = "DeleteTokenTrait.kt", i = {}, l = {14}, m = NotificationCompat.CATEGORY_CALL, n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f30272p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f30274r0;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30272p0 = obj;
            this.f30274r0 |= Integer.MIN_VALUE;
            return DeleteTokenTrait.this.call((DeleteTokenRequest) null, (Continuation<? super Unit>) this);
        }
    }

    public DeleteTokenTrait(@NotNull TokenStorage tokenStorage) {
        Intrinsics.checkNotNullParameter(tokenStorage, "tokenStorage");
        this.f30271b = tokenStorage;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.ethermobilesdk.token.trait.Trait
    @Nullable
    public Object call(@NotNull DeleteTokenRequest deleteTokenRequest, @NotNull Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i10 = anonymousClass1.f30274r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f30274r0 = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.f30272p0;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = anonymousClass1.f30274r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            String tokenId = deleteTokenRequest.getTokenId();
            anonymousClass1.f30274r0 = 1;
            if (this.f30271b.deleteToken(tokenId, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
