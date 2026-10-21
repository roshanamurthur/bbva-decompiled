package com.bbva.plugin.google.pay.command;

import android.app.Activity;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.google.pay.GoogleTapAndPay;
import com.bbva.plugin.google.pay.GooglePayLibInjector;
import com.bbva.plugin.google.pay.request.GetPushDataRequest;
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

/* JADX INFO: compiled from: GetPushDataCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@DebugMetadata(c = "com.bbva.plugin.google.pay.command.GetPushDataCommand$execute$1$1", f = "GetPushDataCommand.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
public final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f35733p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ GetPushDataRequest f35734q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Activity f35735r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f35736s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ GetPushDataCommand f35737t0;

    /* JADX INFO: compiled from: GetPushDataCommand.kt */
    @DebugMetadata(c = "com.bbva.plugin.google.pay.command.GetPushDataCommand$execute$1$1$1", f = "GetPushDataCommand.kt", i = {}, l = {32, 35, 40}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f35738p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ GetPushDataRequest f35739q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Activity f35740r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35741s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ GetPushDataCommand f35742t0;

        /* JADX INFO: renamed from: com.bbva.plugin.google.pay.command.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: GetPushDataCommand.kt */
        @DebugMetadata(c = "com.bbva.plugin.google.pay.command.GetPushDataCommand$execute$1$1$1$1", f = "GetPushDataCommand.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0159a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ CommandCallback f35743p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Result<String> f35744q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0159a(CommandCallback commandCallback, Result<String> result, Continuation<? super C0159a> continuation) {
                super(2, continuation);
                this.f35743p0 = commandCallback;
                this.f35744q0 = result;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0159a(this.f35743p0, this.f35744q0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0159a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                this.f35743p0.sendEvent((String) ((Result.Success) this.f35744q0).getValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.bbva.plugin.google.pay.command.b$a$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: GetPushDataCommand.kt */
        @DebugMetadata(c = "com.bbva.plugin.google.pay.command.GetPushDataCommand$execute$1$1$1$2", f = "GetPushDataCommand.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0160b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ CommandCallback f35745p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ GetPushDataCommand f35746q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Result<String> f35747r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0160b(CommandCallback commandCallback, GetPushDataCommand getPushDataCommand, Result<String> result, Continuation<? super C0160b> continuation) {
                super(2, continuation);
                this.f35745p0 = commandCallback;
                this.f35746q0 = getPushDataCommand;
                this.f35747r0 = result;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0160b(this.f35745p0, this.f35746q0, this.f35747r0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0160b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                this.f35745p0.sendError(((AbstractCommand) this.f35746q0).mGson.toJson(Response.INSTANCE.error(((Result.Error) this.f35747r0).getException().getMessage())));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GetPushDataRequest getPushDataRequest, Activity activity, CommandCallback commandCallback, GetPushDataCommand getPushDataCommand, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35739q0 = getPushDataRequest;
            this.f35740r0 = activity;
            this.f35741s0 = commandCallback;
            this.f35742t0 = getPushDataCommand;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f35739q0, this.f35740r0, this.f35741s0, this.f35742t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f35738p0;
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
            String panTruncated = this.f35739q0.getPanTruncated();
            Activity activity = this.f35740r0;
            Intrinsics.checkNotNullExpressionValue(activity, "activity");
            this.f35738p0 = 1;
            obj = googleTapAndPay.getPushData(panTruncated, activity, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            Result result = (Result) obj;
            boolean z10 = result instanceof Result.Success;
            CommandCallback commandCallback = this.f35741s0;
            if (z10) {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C0159a c0159a = new C0159a(commandCallback, result, null);
                this.f35738p0 = 2;
                if (BuildersKt.withContext(main, c0159a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (result instanceof Result.Error) {
                MainCoroutineDispatcher main2 = Dispatchers.getMain();
                C0160b c0160b = new C0160b(commandCallback, this.f35742t0, result, null);
                this.f35738p0 = 3;
                if (BuildersKt.withContext(main2, c0160b, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(GetPushDataRequest getPushDataRequest, Activity activity, CommandCallback commandCallback, GetPushDataCommand getPushDataCommand, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f35734q0 = getPushDataRequest;
        this.f35735r0 = activity;
        this.f35736s0 = commandCallback;
        this.f35737t0 = getPushDataCommand;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new b(this.f35734q0, this.f35735r0, this.f35736s0, this.f35737t0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f35733p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(this.f35734q0, this.f35735r0, this.f35736s0, this.f35737t0, null);
            this.f35733p0 = 1;
            if (BuildersKt.withContext(io2, aVar, this) == coroutine_suspended) {
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
