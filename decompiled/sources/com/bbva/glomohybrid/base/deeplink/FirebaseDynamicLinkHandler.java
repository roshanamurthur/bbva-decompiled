package com.bbva.glomohybrid.base.deeplink;

import com.bbva.dynamiclinks.DynamicLinksHandler;
import com.bbva.dynamiclinks.model.DynamicLinkData;
import com.bbva.glomohybrid.base.deeplink.model.LinkParams;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GlomoDynamicLinkHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/bbva/glomohybrid/base/deeplink/FirebaseDynamicLinkHandler;", "Lcom/bbva/glomohybrid/base/deeplink/GlomoDynamicLinkHandler;", "()V", "handleLink", "Lcom/bbva/dynamiclinks/model/DynamicLinkData;", "params", "Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams$DynamicLink;", "(Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams$DynamicLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FirebaseDynamicLinkHandler implements GlomoDynamicLinkHandler {

    /* JADX INFO: compiled from: GlomoDynamicLinkHandler.kt */
    public static final class a extends Lambda implements Function1<DynamicLinkData, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Continuation<DynamicLinkData> f31243p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SafeContinuation safeContinuation) {
            super(1);
            this.f31243p0 = safeContinuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DynamicLinkData dynamicLinkData) {
            this.f31243p0.resumeWith(Result.m5535constructorimpl(dynamicLinkData));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: GlomoDynamicLinkHandler.kt */
    public static final class b extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Continuation<DynamicLinkData> f31244p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SafeContinuation safeContinuation) {
            super(1);
            this.f31244p0 = safeContinuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            Throwable error = th2;
            Intrinsics.checkNotNullParameter(error, "error");
            Result.Companion companion = Result.INSTANCE;
            this.f31244p0.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(error)));
            return Unit.INSTANCE;
        }
    }

    @Override // com.bbva.glomohybrid.base.deeplink.GlomoDynamicLinkHandler
    @Nullable
    public Object handleLink(@NotNull LinkParams.DynamicLink dynamicLink, @NotNull Continuation<? super DynamicLinkData> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        DynamicLinksHandler.INSTANCE.handle(dynamicLink.getIntent(), new a(safeContinuation), new b(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
