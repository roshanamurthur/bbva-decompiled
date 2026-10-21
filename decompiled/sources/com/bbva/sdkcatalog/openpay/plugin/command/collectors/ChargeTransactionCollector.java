package com.bbva.sdkcatalog.openpay.plugin.command.collectors;

import androidx.annotation.Keep;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.sdkcatalog.openpay.plugin.CommandExtensionsKt;
import com.bbva.sdkcatalog.openpay.plugin.MappingExtensionsKt;
import com.bbva.sdkcatalog.openpay.plugin.data.error.OpenPayError;
import com.google.gson.Gson;
import ek.a;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import mx.openpay.library.core.OpenPaySdk;
import mx.openpay.library.core.model.OpenPayChargeState;
import mx.openpay.library.core.model.OpenPayResult;
import mx.openpay.library.core.model.extra.ChargeTransaction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ChargeTransactionCollector.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\u000bH\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\t\u0010\u000f\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/command/collectors/ChargeTransactionCollector;", "", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "gson", "Lcom/google/gson/Gson;", "<init>", "(Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;Lcom/google/gson/Gson;)V", "chargeJob", "Lkotlinx/coroutines/Job;", EventDataKeys.Lifecycle.LIFECYCLE_START, "", EventDataKeys.DEEPLINK_SCHEME_PATH_CANCEL, "isRunning", "", "component1", "component2", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChargeTransactionCollector {

    @NotNull
    private final CommandCallback callback;

    @Nullable
    private Job chargeJob;

    @NotNull
    private final Gson gson;

    /* JADX INFO: renamed from: com.bbva.sdkcatalog.openpay.plugin.command.collectors.ChargeTransactionCollector$start$1, reason: invalid class name */
    /* JADX INFO: compiled from: ChargeTransactionCollector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.bbva.sdkcatalog.openpay.plugin.command.collectors.ChargeTransactionCollector$start$1", f = "ChargeTransactionCollector.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChargeTransactionCollector.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<OpenPayResult<OpenPayChargeState<ChargeTransaction>>> chargeTransaction = OpenPaySdk.INSTANCE.getChargeTransaction();
                final ChargeTransactionCollector chargeTransactionCollector = ChargeTransactionCollector.this;
                FlowCollector<? super OpenPayResult<OpenPayChargeState<ChargeTransaction>>> flowCollector = new FlowCollector() { // from class: com.bbva.sdkcatalog.openpay.plugin.command.collectors.ChargeTransactionCollector.start.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((OpenPayResult<? extends OpenPayChargeState<ChargeTransaction>>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(OpenPayResult<? extends OpenPayChargeState<ChargeTransaction>> openPayResult, Continuation<? super Unit> continuation) {
                        if (openPayResult instanceof OpenPayResult.Success) {
                            OpenPayChargeState openPayChargeState = (OpenPayChargeState) ((OpenPayResult.Success) openPayResult).getData();
                            if (openPayChargeState instanceof OpenPayChargeState.Success) {
                                CommandExtensionsKt.sendJsonObjectEvent(chargeTransactionCollector.callback, chargeTransactionCollector.gson, MappingExtensionsKt.toTransactionResponse(((OpenPayChargeState.Success) openPayChargeState).getOpenPayCharge()));
                                chargeTransactionCollector.cancel();
                            } else if (!(openPayChargeState instanceof OpenPayChargeState.Idle) && !(openPayChargeState instanceof OpenPayChargeState.Processing)) {
                                chargeTransactionCollector.callback.sendError(OpenPayError.ErrorGeneric);
                                chargeTransactionCollector.cancel();
                            }
                        } else {
                            if (!(openPayResult instanceof OpenPayResult.Failure)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            CommandExtensionsKt.handleError(chargeTransactionCollector.callback, ((OpenPayResult.Failure) openPayResult).getError().getErrorBody(), chargeTransactionCollector.gson);
                            chargeTransactionCollector.cancel();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (chargeTransaction.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ChargeTransactionCollector(@NotNull CommandCallback callback, @NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.callback = callback;
        this.gson = gson;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancel() {
        Job job = this.chargeJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final CommandCallback getCallback() {
        return this.callback;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final Gson getGson() {
        return this.gson;
    }

    public static /* synthetic */ ChargeTransactionCollector copy$default(ChargeTransactionCollector chargeTransactionCollector, CommandCallback commandCallback, Gson gson, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            commandCallback = chargeTransactionCollector.callback;
        }
        if ((i10 & 2) != 0) {
            gson = chargeTransactionCollector.gson;
        }
        return chargeTransactionCollector.copy(commandCallback, gson);
    }

    @NotNull
    public final ChargeTransactionCollector copy(@NotNull CommandCallback callback, @NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(gson, "gson");
        return new ChargeTransactionCollector(callback, gson);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChargeTransactionCollector)) {
            return false;
        }
        ChargeTransactionCollector chargeTransactionCollector = (ChargeTransactionCollector) other;
        return Intrinsics.areEqual(this.callback, chargeTransactionCollector.callback) && Intrinsics.areEqual(this.gson, chargeTransactionCollector.gson);
    }

    public int hashCode() {
        return this.gson.hashCode() + (this.callback.hashCode() * 31);
    }

    public final boolean isRunning() {
        Job job = this.chargeJob;
        return job != null && job.isActive();
    }

    public final void start() {
        try {
            if (isRunning()) {
                return;
            }
            this.chargeJob = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new AnonymousClass1(null), 2, null);
        } catch (Exception unused) {
            this.callback.sendError(OpenPayError.ErrorIncorrectParameters);
            cancel();
        }
    }

    @NotNull
    public String toString() {
        return "ChargeTransactionCollector(callback=" + this.callback + ", gson=" + this.gson + ")";
    }
}
