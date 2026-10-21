package com.bbva.plugin.google.pay.command;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.plugin.google.pay.GooglePayLibInjector;
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

/* JADX INFO: compiled from: CardsPendingVerificationCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/plugin/google/pay/command/CardsPendingVerificationCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Ljava/lang/Void;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "commandCallback", "", "execute", "<init>", "()V", "Companion", "google-pay-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class CardsPendingVerificationCommand extends AbstractCommand<Void> {

    @NotNull
    public static final String ID = "cardspendingactivate";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f35680p0;

    /* JADX INFO: compiled from: CardsPendingVerificationCommand.kt */
    @DebugMetadata(c = "com.bbva.plugin.google.pay.command.CardsPendingVerificationCommand$execute$1", f = "CardsPendingVerificationCommand.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f35681p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35682q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CardsPendingVerificationCommand f35683r0;

        /* JADX INFO: renamed from: com.bbva.plugin.google.pay.command.CardsPendingVerificationCommand$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CardsPendingVerificationCommand.kt */
        @DebugMetadata(c = "com.bbva.plugin.google.pay.command.CardsPendingVerificationCommand$execute$1$1", f = "CardsPendingVerificationCommand.kt", i = {}, l = {29, 34}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0153a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f35684p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ CommandCallback f35685q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ CardsPendingVerificationCommand f35686r0;

            /* JADX INFO: renamed from: com.bbva.plugin.google.pay.command.CardsPendingVerificationCommand$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: CardsPendingVerificationCommand.kt */
            @DebugMetadata(c = "com.bbva.plugin.google.pay.command.CardsPendingVerificationCommand$execute$1$1$1", f = "CardsPendingVerificationCommand.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0154a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ CommandCallback f35687p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ Result<String> f35688q0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0154a(CommandCallback commandCallback, Result<String> result, Continuation<? super C0154a> continuation) {
                    super(2, continuation);
                    this.f35687p0 = commandCallback;
                    this.f35688q0 = result;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0154a(this.f35687p0, this.f35688q0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C0154a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    ek.a.getCOROUTINE_SUSPENDED();
                    ResultKt.throwOnFailure(obj);
                    this.f35687p0.sendEvent((String) ((Result.Success) this.f35688q0).getValue());
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: com.bbva.plugin.google.pay.command.CardsPendingVerificationCommand$a$a$b */
            /* JADX INFO: compiled from: CardsPendingVerificationCommand.kt */
            @DebugMetadata(c = "com.bbva.plugin.google.pay.command.CardsPendingVerificationCommand$execute$1$1$2", f = "CardsPendingVerificationCommand.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ CommandCallback f35689p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ CardsPendingVerificationCommand f35690q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ Result<String> f35691r0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(CommandCallback commandCallback, CardsPendingVerificationCommand cardsPendingVerificationCommand, Result<String> result, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f35689p0 = commandCallback;
                    this.f35690q0 = cardsPendingVerificationCommand;
                    this.f35691r0 = result;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new b(this.f35689p0, this.f35690q0, this.f35691r0, continuation);
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
                    this.f35689p0.sendError(((AbstractCommand) this.f35690q0).mGson.toJson(Response.INSTANCE.error(((Result.Error) this.f35691r0).getException().getMessage())));
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0153a(CommandCallback commandCallback, CardsPendingVerificationCommand cardsPendingVerificationCommand, Continuation<? super C0153a> continuation) {
                super(2, continuation);
                this.f35685q0 = commandCallback;
                this.f35686r0 = cardsPendingVerificationCommand;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0153a(this.f35685q0, this.f35686r0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0153a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f35684p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Result<String> resultCardsPendingVerification = GooglePayLibInjector.INSTANCE.getGoogleTapAndPay().cardsPendingVerification();
                    boolean z10 = resultCardsPendingVerification instanceof Result.Success;
                    CommandCallback commandCallback = this.f35685q0;
                    if (z10) {
                        MainCoroutineDispatcher main = Dispatchers.getMain();
                        C0154a c0154a = new C0154a(commandCallback, resultCardsPendingVerification, null);
                        this.f35684p0 = 1;
                        if (BuildersKt.withContext(main, c0154a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (resultCardsPendingVerification instanceof Result.Error) {
                        MainCoroutineDispatcher main2 = Dispatchers.getMain();
                        b bVar = new b(commandCallback, this.f35686r0, resultCardsPendingVerification, null);
                        this.f35684p0 = 2;
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
        public a(CommandCallback commandCallback, CardsPendingVerificationCommand cardsPendingVerificationCommand, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35682q0 = commandCallback;
            this.f35683r0 = cardsPendingVerificationCommand;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f35682q0, this.f35683r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f35681p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C0153a c0153a = new C0153a(this.f35682q0, this.f35683r0, null);
                this.f35681p0 = 1;
                if (BuildersKt.withContext(io2, c0153a, this) == coroutine_suspended) {
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

    public CardsPendingVerificationCommand() {
        super(Void.class);
        this.f35680p0 = CoroutineScopeKt.MainScope();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable Void params, @NotNull CommandCallback commandCallback) {
        Intrinsics.checkNotNullParameter(commandCallback, "commandCallback");
        BuildersKt__Builders_commonKt.launch$default(this.f35680p0, null, null, new a(commandCallback, this, null), 3, null);
    }
}
