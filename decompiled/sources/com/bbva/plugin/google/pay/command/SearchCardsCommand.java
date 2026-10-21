package com.bbva.plugin.google.pay.command;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.plugin.google.pay.GooglePayLibInjector;
import com.bbva.plugin.google.pay.request.SearchCardsRequest;
import com.bbva.plugin.google.pay.utils.Response;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SearchCardsCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/plugin/google/pay/command/SearchCardsCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/google/pay/request/SearchCardsRequest;", "searchCardsRequest", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "commandCallback", "", "execute", "<init>", "()V", "Companion", "google-pay-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class SearchCardsCommand extends AbstractCommand<SearchCardsRequest> {

    @NotNull
    public static final String ID = "searchcards";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f35704p0;

    /* JADX INFO: compiled from: SearchCardsCommand.kt */
    @DebugMetadata(c = "com.bbva.plugin.google.pay.command.SearchCardsCommand$execute$1", f = "SearchCardsCommand.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f35705p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SearchCardsRequest f35706q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35707r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ SearchCardsCommand f35708s0;

        /* JADX INFO: renamed from: com.bbva.plugin.google.pay.command.SearchCardsCommand$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SearchCardsCommand.kt */
        @DebugMetadata(c = "com.bbva.plugin.google.pay.command.SearchCardsCommand$execute$1$1", f = "SearchCardsCommand.kt", i = {}, l = {32, 37}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0155a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f35709p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ SearchCardsRequest f35710q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ CommandCallback f35711r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ SearchCardsCommand f35712s0;

            /* JADX INFO: renamed from: com.bbva.plugin.google.pay.command.SearchCardsCommand$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: SearchCardsCommand.kt */
            @DebugMetadata(c = "com.bbva.plugin.google.pay.command.SearchCardsCommand$execute$1$1$1", f = "SearchCardsCommand.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0156a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ CommandCallback f35713p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ Result<String> f35714q0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0156a(CommandCallback commandCallback, Result<String> result, Continuation<? super C0156a> continuation) {
                    super(2, continuation);
                    this.f35713p0 = commandCallback;
                    this.f35714q0 = result;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0156a(this.f35713p0, this.f35714q0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C0156a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    ek.a.getCOROUTINE_SUSPENDED();
                    ResultKt.throwOnFailure(obj);
                    this.f35713p0.sendEvent((String) ((Result.Success) this.f35714q0).getValue());
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: com.bbva.plugin.google.pay.command.SearchCardsCommand$a$a$b */
            /* JADX INFO: compiled from: SearchCardsCommand.kt */
            @DebugMetadata(c = "com.bbva.plugin.google.pay.command.SearchCardsCommand$execute$1$1$2", f = "SearchCardsCommand.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ CommandCallback f35715p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ SearchCardsCommand f35716q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ Result<String> f35717r0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(CommandCallback commandCallback, SearchCardsCommand searchCardsCommand, Result<String> result, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f35715p0 = commandCallback;
                    this.f35716q0 = searchCardsCommand;
                    this.f35717r0 = result;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new b(this.f35715p0, this.f35716q0, this.f35717r0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    ek.a.getCOROUTINE_SUSPENDED();
                    ResultKt.throwOnFailure(obj);
                    this.f35715p0.sendError(((AbstractCommand) this.f35716q0).mGson.toJson(Response.INSTANCE.error(((Result.Error) this.f35717r0).getException().getMessage())));
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0155a(SearchCardsRequest searchCardsRequest, CommandCallback commandCallback, SearchCardsCommand searchCardsCommand, Continuation<? super C0155a> continuation) {
                super(2, continuation);
                this.f35710q0 = searchCardsRequest;
                this.f35711r0 = commandCallback;
                this.f35712s0 = searchCardsCommand;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0155a(this.f35710q0, this.f35711r0, this.f35712s0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0155a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f35709p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    String state = this.f35710q0.getState();
                    if (state == null) {
                        state = "";
                    }
                    Result<String> resultSearchCards = GooglePayLibInjector.INSTANCE.getGoogleTapAndPay().searchCards(state);
                    boolean z10 = resultSearchCards instanceof Result.Success;
                    CommandCallback commandCallback = this.f35711r0;
                    if (z10) {
                        MainCoroutineDispatcher main = Dispatchers.getMain();
                        C0156a c0156a = new C0156a(commandCallback, resultSearchCards, null);
                        this.f35709p0 = 1;
                        if (BuildersKt.withContext(main, c0156a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (resultSearchCards instanceof Result.Error) {
                        MainCoroutineDispatcher main2 = Dispatchers.getMain();
                        b bVar = new b(commandCallback, this.f35712s0, resultSearchCards, null);
                        this.f35709p0 = 2;
                        if (BuildersKt.withContext(main2, bVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i10 != 1 && i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SearchCardsRequest searchCardsRequest, CommandCallback commandCallback, SearchCardsCommand searchCardsCommand, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35706q0 = searchCardsRequest;
            this.f35707r0 = commandCallback;
            this.f35708s0 = searchCardsCommand;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f35706q0, this.f35707r0, this.f35708s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f35705p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C0155a c0155a = new C0155a(this.f35706q0, this.f35707r0, this.f35708s0, null);
                this.f35705p0 = 1;
                if (BuildersKt.withContext(io2, c0155a, this) == coroutine_suspended) {
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

    public SearchCardsCommand() {
        super(SearchCardsRequest.class);
        this.f35704p0 = CoroutineScopeKt.MainScope();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull SearchCardsRequest searchCardsRequest, @NotNull CommandCallback commandCallback) {
        Intrinsics.checkNotNullParameter(searchCardsRequest, "searchCardsRequest");
        Intrinsics.checkNotNullParameter(commandCallback, "commandCallback");
        BuildersKt__Builders_commonKt.launch$default(this.f35704p0, null, null, new a(searchCardsRequest, commandCallback, this, null), 3, null);
    }
}
