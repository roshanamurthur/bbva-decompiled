package com.bbva.qrplugin.command;

import android.content.Context;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.qr.decoder.ImageDecoder;
import com.bbva.qr.model.input.DecoderSettings;
import com.bbva.qr.model.response.BarcodeResult;
import com.bbva.qr.model.response.ImageDecodingError;
import com.bbva.qr.model.response.NonDetectableCode;
import com.bbva.qrplugin.command.response.QRErrors;
import com.bbva.qrplugin.di.Injector;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DecodeCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\rH\u0014R\u0012\u0010\u0005\u001a\u00020\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/bbva/qrplugin/command/DecodeCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/qr/model/input/DecoderSettings;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "qr-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DecodeCommand extends AbstractCommand<DecoderSettings> implements CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f36342p0;

    /* JADX INFO: compiled from: DecodeCommand.kt */
    @DebugMetadata(c = "com.bbva.qrplugin.command.DecodeCommand$execute$1$1", f = "DecodeCommand.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f36343p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f36344q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ DecodeCommand f36345r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ DecoderSettings f36346s0;

        /* JADX INFO: renamed from: com.bbva.qrplugin.command.DecodeCommand$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DecodeCommand.kt */
        @DebugMetadata(c = "com.bbva.qrplugin.command.DecodeCommand$execute$1$1$result$1", f = "DecodeCommand.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0163a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<BarcodeResult>>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f36347p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ DecodeCommand f36348q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ DecoderSettings f36349r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0163a(DecodeCommand decodeCommand, DecoderSettings decoderSettings, Continuation<? super C0163a> continuation) {
                super(2, continuation);
                this.f36348q0 = decodeCommand;
                this.f36349r0 = decoderSettings;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0163a(this.f36348q0, this.f36349r0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<BarcodeResult>> continuation) {
                return ((C0163a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f36347p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ImageDecoder decoder = Injector.INSTANCE.getDecoder();
                    Context applicationContext = ((AbstractCommand) this.f36348q0).mApplication.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "mApplication.applicationContext");
                    this.f36347p0 = 1;
                    obj = decoder.detectInDecodedImage(applicationContext, this.f36349r0, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CommandCallback commandCallback, DecodeCommand decodeCommand, DecoderSettings decoderSettings, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f36344q0 = commandCallback;
            this.f36345r0 = decodeCommand;
            this.f36346s0 = decoderSettings;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f36344q0, this.f36345r0, this.f36346s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f36343p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C0163a c0163a = new C0163a(this.f36345r0, this.f36346s0, null);
                this.f36343p0 = 1;
                obj = BuildersKt.withContext(io2, c0163a, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Result result = (Result) obj;
            boolean z10 = result instanceof Result.Success;
            CommandCallback commandCallback = this.f36344q0;
            if (z10) {
                commandCallback.sendEvent(DecodeCommandKt.access$toResponse((BarcodeResult) ((Result.Success) result).getValue()));
            } else if (result instanceof Result.Error) {
                Result.Error error = (Result.Error) result;
                if (error.getException() instanceof NonDetectableCode) {
                    commandCallback.sendError(QRErrors.ErrorNonDetectableCode);
                    return Unit.INSTANCE;
                }
                if (error.getException() instanceof ImageDecodingError) {
                    commandCallback.sendError(QRErrors.ErrorImageDecoding);
                    return Unit.INSTANCE;
                }
                commandCallback.sendError(Errors.ErrorDefault);
            }
            return Unit.INSTANCE;
        }
    }

    public DecodeCommand() {
        super(DecoderSettings.class);
        this.f36342p0 = CoroutineScopeKt.MainScope();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f36342p0.getCoroutineContext();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable DecoderSettings params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (params == null || BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(callback, this, params, null), 3, null) == null) {
            callback.sendError(Errors.ErrorMalformedParam);
            Unit unit = Unit.INSTANCE;
        }
    }
}
