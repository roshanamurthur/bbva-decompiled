package com.bbva.sdkcatalog.openpay.plugin.command.collectors;

import androidx.exifinterface.media.ExifInterface;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.google.gson.Gson;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.SharedFlow;
import mx.openpay.library.core.model.OpenPayResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TapOnPhoneTransactionCollector.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J8\u0010\r\u001a\u00020\u000e\"\b\b\u0000\u0010\u000f*\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u00120\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u00020\u000e0\u0014J\u0006\u0010\u0015\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/command/collectors/TapOnPhoneTransactionCollector;", "", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "gson", "Lcom/google/gson/Gson;", "<init>", "(Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;Lcom/google/gson/Gson;)V", "job", "Lkotlinx/coroutines/Job;", "isRunning", "", "()Z", EventDataKeys.Lifecycle.LIFECYCLE_START, "", ExifInterface.GPS_DIRECTION_TRUE, "sharedFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "Lmx/openpay/library/core/model/OpenPayResult;", "successCallback", "Lkotlin/Function1;", EventDataKeys.DEEPLINK_SCHEME_PATH_CANCEL, "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TapOnPhoneTransactionCollector {

    @NotNull
    private final CommandCallback callback;

    @NotNull
    private final Gson gson;

    @Nullable
    private Job job;

    /* JADX INFO: renamed from: com.bbva.sdkcatalog.openpay.plugin.command.collectors.TapOnPhoneTransactionCollector$start$1, reason: invalid class name */
    /* JADX INFO: compiled from: TapOnPhoneTransactionCollector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.bbva.sdkcatalog.openpay.plugin.command.collectors.TapOnPhoneTransactionCollector$start$1", f = "TapOnPhoneTransactionCollector.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SharedFlow<OpenPayResult<T>> $sharedFlow;
        final /* synthetic */ Function1<T, Unit> $successCallback;
        int label;
        final /* synthetic */ TapOnPhoneTransactionCollector this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(SharedFlow<? extends OpenPayResult<? extends T>> sharedFlow, Function1<? super T, Unit> function1, TapOnPhoneTransactionCollector tapOnPhoneTransactionCollector, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sharedFlow = sharedFlow;
            this.$successCallback = function1;
            this.this$0 = tapOnPhoneTransactionCollector;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$sharedFlow, this.$successCallback, this.this$0, continuation);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to com.bbva.sdkcatalog.openpay.plugin.command.collectors.TapOnPhoneTransactionCollector$start$1 for r5v1 'this'  kotlin.coroutines.Continuation
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ek.a.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 == r2) goto L13
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L13:
                kotlin.ResultKt.throwOnFailure(r6)
                goto L2e
            L17:
                kotlin.ResultKt.throwOnFailure(r6)
                kotlinx.coroutines.flow.SharedFlow<mx.openpay.library.core.model.OpenPayResult<T>> r6 = r5.$sharedFlow
                com.bbva.sdkcatalog.openpay.plugin.command.collectors.TapOnPhoneTransactionCollector$start$1$1 r1 = new com.bbva.sdkcatalog.openpay.plugin.command.collectors.TapOnPhoneTransactionCollector$start$1$1
                kotlin.jvm.functions.Function1<T, kotlin.Unit> r3 = r5.$successCallback
                com.bbva.sdkcatalog.openpay.plugin.command.collectors.TapOnPhoneTransactionCollector r4 = r5.this$0
                r1.<init>()
                r5.label = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L2e
                return r0
            L2e:
                kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bbva.sdkcatalog.openpay.plugin.command.collectors.TapOnPhoneTransactionCollector.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public TapOnPhoneTransactionCollector(@NotNull CommandCallback callback, @NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.callback = callback;
        this.gson = gson;
    }

    private final boolean isRunning() {
        Job job = this.job;
        return job != null && job.isActive();
    }

    public final void cancel() {
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    public final <T> void start(@NotNull SharedFlow<? extends OpenPayResult<? extends T>> sharedFlow, @NotNull Function1<? super T, Unit> successCallback) {
        Intrinsics.checkNotNullParameter(sharedFlow, "sharedFlow");
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        if (isRunning()) {
            return;
        }
        this.job = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new AnonymousClass1(sharedFlow, successCallback, this, null), 2, null);
    }
}
