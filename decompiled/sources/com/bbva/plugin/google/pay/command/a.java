package com.bbva.plugin.google.pay.command;

import android.app.Activity;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.google.pay.GoogleTapAndPay;
import com.bbva.plugin.google.pay.GooglePayLibInjector;
import com.bbva.plugin.google.pay.request.GetCardStatusRequest;
import com.bbva.plugin.google.pay.utils.Response;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetCardStatusCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@DebugMetadata(c = "com.bbva.plugin.google.pay.command.GetCardStatusCommand$execute$1$1", f = "GetCardStatusCommand.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f35718p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ GetCardStatusRequest f35719q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Activity f35720r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f35721s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ GetCardStatusCommand f35722t0;

    /* JADX INFO: renamed from: com.bbva.plugin.google.pay.command.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GetCardStatusCommand.kt */
    @DebugMetadata(c = "com.bbva.plugin.google.pay.command.GetCardStatusCommand$execute$1$1$1", f = "GetCardStatusCommand.kt", i = {}, l = {36, 39, 44}, m = "invokeSuspend", n = {}, s = {})
    public static final class C0157a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f35723p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ GetCardStatusRequest f35724q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Activity f35725r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35726s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ GetCardStatusCommand f35727t0;

        /* JADX INFO: renamed from: com.bbva.plugin.google.pay.command.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: GetCardStatusCommand.kt */
        @DebugMetadata(c = "com.bbva.plugin.google.pay.command.GetCardStatusCommand$execute$1$1$1$1", f = "GetCardStatusCommand.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0158a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ CommandCallback f35728p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Result<String> f35729q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0158a(CommandCallback commandCallback, Result<String> result, Continuation<? super C0158a> continuation) {
                super(2, continuation);
                this.f35728p0 = commandCallback;
                this.f35729q0 = result;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0158a(this.f35728p0, this.f35729q0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0158a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                this.f35728p0.sendEvent((String) ((Result.Success) this.f35729q0).getValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.bbva.plugin.google.pay.command.a$a$b */
        /* JADX INFO: compiled from: GetCardStatusCommand.kt */
        @DebugMetadata(c = "com.bbva.plugin.google.pay.command.GetCardStatusCommand$execute$1$1$1$2", f = "GetCardStatusCommand.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ CommandCallback f35730p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ GetCardStatusCommand f35731q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Result<String> f35732r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(CommandCallback commandCallback, GetCardStatusCommand getCardStatusCommand, Result<String> result, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f35730p0 = commandCallback;
                this.f35731q0 = getCardStatusCommand;
                this.f35732r0 = result;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.f35730p0, this.f35731q0, this.f35732r0, continuation);
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
                this.f35730p0.sendError(((AbstractCommand) this.f35731q0).mGson.toJson(Response.INSTANCE.error(((Result.Error) this.f35732r0).getException().getMessage())));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0157a(GetCardStatusRequest getCardStatusRequest, Activity activity, CommandCallback commandCallback, GetCardStatusCommand getCardStatusCommand, Continuation<? super C0157a> continuation) {
            super(2, continuation);
            this.f35724q0 = getCardStatusRequest;
            this.f35725r0 = activity;
            this.f35726s0 = commandCallback;
            this.f35727t0 = getCardStatusCommand;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C0157a(this.f35724q0, this.f35725r0, this.f35726s0, this.f35727t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C0157a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f35723p0;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2 && i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            GoogleTapAndPay googleTapAndPay = GooglePayLibInjector.INSTANCE.getGoogleTapAndPay();
            String pan = this.f35724q0.getPan();
            Activity activity = this.f35725r0;
            Intrinsics.checkNotNullExpressionValue(activity, "activity");
            this.f35723p0 = 1;
            obj = googleTapAndPay.getCardStatus(pan, activity, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            Result result = (Result) obj;
            boolean z10 = result instanceof Result.Success;
            CommandCallback commandCallback = this.f35726s0;
            if (z10) {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C0158a c0158a = new C0158a(commandCallback, result, null);
                this.f35723p0 = 2;
                if (BuildersKt.withContext(main, c0158a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (result instanceof Result.Error) {
                MainCoroutineDispatcher main2 = Dispatchers.getMain();
                b bVar = new b(commandCallback, this.f35727t0, result, null);
                this.f35723p0 = 3;
                if (BuildersKt.withContext(main2, bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(GetCardStatusRequest getCardStatusRequest, Activity activity, CommandCallback commandCallback, GetCardStatusCommand getCardStatusCommand, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f35719q0 = getCardStatusRequest;
        this.f35720r0 = activity;
        this.f35721s0 = commandCallback;
        this.f35722t0 = getCardStatusCommand;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f35719q0, this.f35720r0, this.f35721s0, this.f35722t0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f35718p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            C0157a c0157a = new C0157a(this.f35719q0, this.f35720r0, this.f35721s0, this.f35722t0, null);
            this.f35718p0 = 1;
            if (BuildersKt.withContext(io2, c0157a, this) == coroutine_suspended) {
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
