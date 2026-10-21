package com.bbva.plugin.geolocation.command;

import android.location.Location;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.plugin.geolocation.command.WatchLocationCommand;
import com.bbva.plugin.geolocation.command.params.WatchLocationParams;
import com.bbva.plugin.geolocation.command.response.LocationPayload;
import com.bbva.plugin.geolocation.command.validator.WatchLocationParamValidator;
import com.bbva.plugin.geolocation.di.Injector;
import com.bbva.plugin.geolocation.manager.Locator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WatchLocationCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\nH\u0014R\u0012\u0010\u000b\u001a\u00020\fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/bbva/plugin/geolocation/command/WatchLocationCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/geolocation/command/params/WatchLocationParams;", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "()V", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Companion", "geolocation-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WatchLocationCommand extends AbstractCommand<WatchLocationParams> implements CoroutineScope {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ID = "watchlocation";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f35654p0;

    /* JADX INFO: compiled from: WatchLocationCommand.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bbva/plugin/geolocation/command/WatchLocationCommand$Companion;", "", "<init>", "()V", "ID", "", "geolocation-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: WatchLocationCommand.kt */
    @DebugMetadata(c = "com.bbva.plugin.geolocation.command.WatchLocationCommand$execute$1$1", f = "WatchLocationCommand.kt", i = {}, l = {32, 32}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f35655p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Locator f35656q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ WatchLocationParams f35657r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ WatchLocationCommand f35658s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35659t0;

        /* JADX INFO: renamed from: com.bbva.plugin.geolocation.command.WatchLocationCommand$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: WatchLocationCommand.kt */
        public static final class C0152a<T> implements FlowCollector {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ WatchLocationCommand f35660p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ CommandCallback f35661q0;

            public C0152a(WatchLocationCommand watchLocationCommand, CommandCallback commandCallback) {
                this.f35660p0 = watchLocationCommand;
                this.f35661q0 = commandCallback;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                Result result = (Result) obj;
                if (result instanceof Result.Success) {
                    Result.Success success = (Result.Success) result;
                    ((AbstractCommand) this.f35660p0).mPostMessenger.postMessage("onLocation", new LocationPayload(((Location) success.getValue()).getLatitude(), ((Location) success.getValue()).getLongitude(), ((Location) success.getValue()).getAltitude(), ((Location) success.getValue()).getAccuracy()));
                    return Unit.INSTANCE;
                }
                if (!(result instanceof Result.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f35661q0.sendError(Errors.ErrorDefault);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Locator locator, WatchLocationParams watchLocationParams, WatchLocationCommand watchLocationCommand, CommandCallback commandCallback, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35656q0 = locator;
            this.f35657r0 = watchLocationParams;
            this.f35658s0 = watchLocationCommand;
            this.f35659t0 = commandCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f35656q0, this.f35657r0, this.f35658s0, this.f35659t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f35655p0;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            WatchLocationParams watchLocationParams = this.f35657r0;
            Intrinsics.checkNotNull(watchLocationParams);
            Long interval = watchLocationParams.getInterval();
            Intrinsics.checkNotNull(interval);
            long jLongValue = interval.longValue();
            this.f35655p0 = 1;
            obj = this.f35656q0.startWatcher(jLongValue, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            C0152a c0152a = new C0152a(this.f35658s0, this.f35659t0);
            this.f35655p0 = 2;
            if (((Flow) obj).collect(c0152a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public WatchLocationCommand() {
        super(WatchLocationParams.class, new WatchLocationParamValidator());
        this.f35654p0 = CoroutineScopeKt.MainScope();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f35654p0.getCoroutineContext();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable final WatchLocationParams params, @NotNull final CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Injector.INSTANCE.withLocator(new Function1() { // from class: eb.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    WatchLocationCommand watchLocationCommand = this.f68304p0;
                    WatchLocationParams watchLocationParams = params;
                    CommandCallback commandCallback = callback;
                    Locator it = (Locator) obj;
                    WatchLocationCommand.Companion companion = WatchLocationCommand.INSTANCE;
                    Intrinsics.checkNotNullParameter(it, "it");
                    BuildersKt__Builders_commonKt.launch$default(watchLocationCommand, null, null, new WatchLocationCommand.a(it, watchLocationParams, watchLocationCommand, commandCallback, null), 3, null);
                    return Unit.INSTANCE;
                }
            });
        } catch (Throwable unused) {
            callback.sendError(Errors.ErrorDefault);
        }
    }
}
