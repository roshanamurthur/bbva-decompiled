package com.bbva.glomohybrid.base.session;

import com.bbva.bridge.WebAwareComponent;
import com.bbva.bridge.webcontroller.WebState;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomo.user.repository.datasource.UserTypeDataSource;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SessionTokenDispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/bbva/glomohybrid/base/session/SessionTokenDispatcher;", "Lcom/bbva/bridge/WebAwareComponent;", "Lcom/bbva/bridge/webcontroller/WebState;", "state", "", "onWebReady", "Lcom/bbva/glomohybrid/base/session/SessionTokenGenerator;", "a", "Lcom/bbva/glomohybrid/base/session/SessionTokenGenerator;", "getTokenGenerator", "()Lcom/bbva/glomohybrid/base/session/SessionTokenGenerator;", "tokenGenerator", "Lcom/bbva/glomo/user/repository/datasource/UserTypeDataSource;", "b", "Lcom/bbva/glomo/user/repository/datasource/UserTypeDataSource;", "getUserTypeDataSource", "()Lcom/bbva/glomo/user/repository/datasource/UserTypeDataSource;", "userTypeDataSource", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatcher", "<init>", "(Lcom/bbva/glomohybrid/base/session/SessionTokenGenerator;Lcom/bbva/glomo/user/repository/datasource/UserTypeDataSource;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class SessionTokenDispatcher implements WebAwareComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SessionTokenGenerator tokenGenerator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final UserTypeDataSource userTypeDataSource;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f31509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f31510d;

    /* JADX INFO: renamed from: com.bbva.glomohybrid.base.session.SessionTokenDispatcher$onWebReady$1, reason: invalid class name */
    /* JADX INFO: compiled from: SessionTokenDispatcher.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.base.session.SessionTokenDispatcher$onWebReady$1", f = "SessionTokenDispatcher.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f31511p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SessionTokenDispatcher f31512q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ UserType f31513r0;

        /* JADX INFO: renamed from: com.bbva.glomohybrid.base.session.SessionTokenDispatcher$onWebReady$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: SessionTokenDispatcher.kt */
        @DebugMetadata(c = "com.bbva.glomohybrid.base.session.SessionTokenDispatcher$onWebReady$1$1", f = "SessionTokenDispatcher.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
        public static final class C01301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f31514p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ UserType f31515q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ SessionTokenDispatcher f31516r0;

            /* JADX INFO: renamed from: com.bbva.glomohybrid.base.session.SessionTokenDispatcher$onWebReady$1$1$WhenMappings */
            /* JADX INFO: compiled from: SessionTokenDispatcher.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[UserType.values().length];
                    try {
                        iArr[UserType.ENTERPRISE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01301(UserType userType, SessionTokenDispatcher sessionTokenDispatcher, Continuation<? super C01301> continuation) {
                super(2, continuation);
                this.f31515q0 = userType;
                this.f31516r0 = sessionTokenDispatcher;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C01301(this.f31515q0, this.f31516r0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C01301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f31514p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                    UserType userType = this.f31515q0;
                    String name = iArr[userType.ordinal()] == 1 ? CellsChannels.INSTANCE.getGlobalNativeGemaUuidChannel().getName() : CellsChannels.INSTANCE.getGlobalNativeUuidChannel().getName();
                    SessionTokenGenerator tokenGenerator = this.f31516r0.getTokenGenerator();
                    Intrinsics.checkNotNull(name);
                    this.f31514p0 = 1;
                    if (tokenGenerator.sendCsidToWeb(userType, name, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UserType userType, SessionTokenDispatcher sessionTokenDispatcher, Continuation continuation) {
            super(2, continuation);
            this.f31512q0 = sessionTokenDispatcher;
            this.f31513r0 = userType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.f31513r0, this.f31512q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f31511p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SessionTokenDispatcher sessionTokenDispatcher = this.f31512q0;
                CoroutineDispatcher coroutineDispatcherIo = sessionTokenDispatcher.f31509c.io();
                C01301 c01301 = new C01301(this.f31513r0, sessionTokenDispatcher, null);
                this.f31511p0 = 1;
                if (BuildersKt.withContext(coroutineDispatcherIo, c01301, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public SessionTokenDispatcher(@NotNull SessionTokenGenerator tokenGenerator, @NotNull UserTypeDataSource userTypeDataSource, @NotNull ThreadDispatchers dispatcher) {
        Intrinsics.checkNotNullParameter(tokenGenerator, "tokenGenerator");
        Intrinsics.checkNotNullParameter(userTypeDataSource, "userTypeDataSource");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.tokenGenerator = tokenGenerator;
        this.userTypeDataSource = userTypeDataSource;
        this.f31509c = dispatcher;
        this.f31510d = CoroutineScopeKt.MainScope();
    }

    @NotNull
    public final SessionTokenGenerator getTokenGenerator() {
        return this.tokenGenerator;
    }

    @NotNull
    public final UserTypeDataSource getUserTypeDataSource() {
        return this.userTypeDataSource;
    }

    @Override // com.bbva.bridge.WebAwareComponent
    public void onPageLoaded(@NotNull String str) {
        WebAwareComponent.DefaultImpls.onPageLoaded(this, str);
    }

    @Override // com.bbva.bridge.WebAwareComponent
    public void onWebReady(@NotNull WebState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        WebAwareComponent.DefaultImpls.onWebReady(this, state);
        BuildersKt__Builders_commonKt.launch$default(this.f31510d, null, null, new AnonymousClass1(this.userTypeDataSource.getUserType(), this, null), 3, null);
    }

    public /* synthetic */ SessionTokenDispatcher(SessionTokenGenerator sessionTokenGenerator, UserTypeDataSource userTypeDataSource, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(sessionTokenGenerator, userTypeDataSource, (i10 & 4) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}
