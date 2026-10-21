package com.bbva.plugin.google.pay.command;

import android.app.Activity;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.google.pay.GoogleTapAndPay;
import com.bbva.plugin.google.pay.GooglePayLibInjector;
import com.bbva.plugin.google.pay.request.PushProvisioningRequest;
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

/* JADX INFO: compiled from: PushProvisioningCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@DebugMetadata(c = "com.bbva.plugin.google.pay.command.PushProvisioningCommand$execute$1$1", f = "PushProvisioningCommand.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
public final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f35748p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ PushProvisioningRequest f35749q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Activity f35750r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f35751s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ PushProvisioningCommand f35752t0;

    /* JADX INFO: compiled from: PushProvisioningCommand.kt */
    @DebugMetadata(c = "com.bbva.plugin.google.pay.command.PushProvisioningCommand$execute$1$1$1", f = "PushProvisioningCommand.kt", i = {}, l = {34, 43, 48}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f35753p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ PushProvisioningRequest f35754q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Activity f35755r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35756s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ PushProvisioningCommand f35757t0;

        /* JADX INFO: renamed from: com.bbva.plugin.google.pay.command.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PushProvisioningCommand.kt */
        @DebugMetadata(c = "com.bbva.plugin.google.pay.command.PushProvisioningCommand$execute$1$1$1$1", f = "PushProvisioningCommand.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0161a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ CommandCallback f35758p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Result<Boolean> f35759q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0161a(CommandCallback commandCallback, Result<Boolean> result, Continuation<? super C0161a> continuation) {
                super(2, continuation);
                this.f35758p0 = commandCallback;
                this.f35759q0 = result;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0161a(this.f35758p0, this.f35759q0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0161a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                this.f35758p0.sendEvent(((Boolean) ((Result.Success) this.f35759q0).getValue()).booleanValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: PushProvisioningCommand.kt */
        @DebugMetadata(c = "com.bbva.plugin.google.pay.command.PushProvisioningCommand$execute$1$1$1$2", f = "PushProvisioningCommand.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ CommandCallback f35760p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ PushProvisioningCommand f35761q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Result<Boolean> f35762r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(CommandCallback commandCallback, PushProvisioningCommand pushProvisioningCommand, Result<Boolean> result, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f35760p0 = commandCallback;
                this.f35761q0 = pushProvisioningCommand;
                this.f35762r0 = result;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.f35760p0, this.f35761q0, this.f35762r0, continuation);
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
                this.f35760p0.sendError(((AbstractCommand) this.f35761q0).mGson.toJson(Response.INSTANCE.error(((Result.Error) this.f35762r0).getException().getMessage())));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PushProvisioningRequest pushProvisioningRequest, Activity activity, CommandCallback commandCallback, PushProvisioningCommand pushProvisioningCommand, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35754q0 = pushProvisioningRequest;
            this.f35755r0 = activity;
            this.f35756s0 = commandCallback;
            this.f35757t0 = pushProvisioningCommand;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f35754q0, this.f35755r0, this.f35756s0, this.f35757t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f35753p0;
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
            PushProvisioningRequest pushProvisioningRequest = this.f35754q0;
            String pan = pushProvisioningRequest.getPan();
            String alias = pushProvisioningRequest.getAlias();
            String brand = pushProvisioningRequest.getBrand();
            String activationData = pushProvisioningRequest.getActivationData();
            Activity activity = this.f35755r0;
            Intrinsics.checkNotNullExpressionValue(activity, "activity");
            this.f35753p0 = 1;
            obj = googleTapAndPay.pushProvisioning(pan, alias, brand, activationData, activity, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            Result result = (Result) obj;
            boolean z10 = result instanceof Result.Success;
            CommandCallback commandCallback = this.f35756s0;
            if (z10) {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C0161a c0161a = new C0161a(commandCallback, result, null);
                this.f35753p0 = 2;
                if (BuildersKt.withContext(main, c0161a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (result instanceof Result.Error) {
                MainCoroutineDispatcher main2 = Dispatchers.getMain();
                b bVar = new b(commandCallback, this.f35757t0, result, null);
                this.f35753p0 = 3;
                if (BuildersKt.withContext(main2, bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PushProvisioningRequest pushProvisioningRequest, Activity activity, CommandCallback commandCallback, PushProvisioningCommand pushProvisioningCommand, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f35749q0 = pushProvisioningRequest;
        this.f35750r0 = activity;
        this.f35751s0 = commandCallback;
        this.f35752t0 = pushProvisioningCommand;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new c(this.f35749q0, this.f35750r0, this.f35751s0, this.f35752t0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f35748p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(this.f35749q0, this.f35750r0, this.f35751s0, this.f35752t0, null);
            this.f35748p0 = 1;
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
