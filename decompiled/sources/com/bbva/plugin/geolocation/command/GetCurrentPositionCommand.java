package com.bbva.plugin.geolocation.command;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.plugin.geolocation.command.GetCurrentPositionCommand;
import com.bbva.plugin.geolocation.di.Injector;
import com.bbva.plugin.geolocation.manager.Locator;
import j7.f;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetCurrentPositionCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\nH\u0014R\u0012\u0010\u000b\u001a\u00020\fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/bbva/plugin/geolocation/command/GetCurrentPositionCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Ljava/lang/Void;", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "()V", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Companion", "geolocation-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetCurrentPositionCommand extends AbstractCommand<Void> implements CoroutineScope {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ID = "getcurrentposition";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f35644p0;

    /* JADX INFO: compiled from: GetCurrentPositionCommand.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bbva/plugin/geolocation/command/GetCurrentPositionCommand$Companion;", "", "<init>", "()V", "ID", "", "geolocation-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: GetCurrentPositionCommand.kt */
    @DebugMetadata(c = "com.bbva.plugin.geolocation.command.GetCurrentPositionCommand$execute$1$1", f = "GetCurrentPositionCommand.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f35645p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Locator f35646q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35647r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Locator locator, CommandCallback commandCallback, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35646q0 = locator;
            this.f35647r0 = commandCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f35646q0, this.f35647r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f35645p0;
            final CommandCallback commandCallback = this.f35647r0;
            int i11 = 1;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Locator locator = this.f35646q0;
                    f fVar = new f(commandCallback, i11);
                    Function1<? super ErrorMessage, Unit> function1 = new Function1() { // from class: eb.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            commandCallback.sendError((ErrorMessage) obj2);
                            return Unit.INSTANCE;
                        }
                    };
                    this.f35645p0 = 1;
                    if (locator.location(fVar, function1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception unused) {
                commandCallback.sendError(Errors.ErrorDefault);
            }
            return Unit.INSTANCE;
        }
    }

    public GetCurrentPositionCommand() {
        super(Void.class);
        this.f35644p0 = CoroutineScopeKt.MainScope();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f35644p0.getCoroutineContext();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable Void params, @NotNull final CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Injector.INSTANCE.withLocator(new Function1() { // from class: eb.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                GetCurrentPositionCommand getCurrentPositionCommand = this.f68298p0;
                Locator it = (Locator) obj;
                GetCurrentPositionCommand.Companion companion = GetCurrentPositionCommand.INSTANCE;
                Intrinsics.checkNotNullParameter(it, "it");
                BuildersKt__Builders_commonKt.launch$default(getCurrentPositionCommand, null, null, new GetCurrentPositionCommand.a(it, callback, null), 3, null);
                return Unit.INSTANCE;
            }
        });
    }
}
