package com.bbva.glomohybrid.featureflags;

import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.glomohybrid.base.cells.channels.FeatureFlagChannels;
import com.bbva.glomohybrid.featureflags.domain.model.FeatureFlags;
import com.bbva.glomohybrid.featureflags.domain.observer.FeatureFlagsObserver;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FeatureFlagsWebObserver.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/featureflags/FeatureFlagsWebObserver;", "Lcom/bbva/glomohybrid/featureflags/domain/observer/FeatureFlagsObserver;", "Lcom/bbva/glomohybrid/featureflags/domain/model/FeatureFlags;", "featureFlags", "", "onReceive", "(Lcom/bbva/glomohybrid/featureflags/domain/model/FeatureFlags;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/bridge/dispatcher/MessageDispatcher;", "messageDispatcher", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchers", "<init>", "(Lcom/bbva/bridge/dispatcher/MessageDispatcher;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class FeatureFlagsWebObserver implements FeatureFlagsObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final MessageDispatcher f32129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f32130b;

    /* JADX INFO: compiled from: FeatureFlagsWebObserver.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.featureflags.FeatureFlagsWebObserver$onReceive$2", f = "FeatureFlagsWebObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ FeatureFlags f32132q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FeatureFlags featureFlags, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f32132q0 = featureFlags;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FeatureFlagsWebObserver.this.new a(this.f32132q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MessageDispatcher messageDispatcher = FeatureFlagsWebObserver.this.f32129a;
            if (messageDispatcher != null) {
                String name = FeatureFlagChannels.INSTANCE.getFeatureFlagChannel().getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                messageDispatcher.sendMessage(name, Boxing.boxBoolean(this.f32132q0 != null));
            }
            return Unit.INSTANCE;
        }
    }

    public FeatureFlagsWebObserver(@Nullable MessageDispatcher messageDispatcher, @NotNull ThreadDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.f32129a = messageDispatcher;
        this.f32130b = dispatchers;
    }

    @Override // com.bbva.glomohybrid.featureflags.domain.observer.FeatureFlagsObserver
    @Nullable
    public Object onReceive(@Nullable FeatureFlags featureFlags, @NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.f32130b.main(), new a(featureFlags, null), continuation);
        return objWithContext == ek.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public /* synthetic */ FeatureFlagsWebObserver(MessageDispatcher messageDispatcher, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(messageDispatcher, (i10 & 2) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}
