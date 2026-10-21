package com.bbva.plugin.smsregex.request.command;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import com.bbva.androidtoolkit.plugin.activity.ActivityResultListener;
import com.bbva.androidtoolkit.plugin.activity.ActivityResultRequest;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.postmessage.PostMessenger;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.plugin.smsregex.request.Injectior;
import com.bbva.plugin.smsregex.request.command.model.RequestParams;
import com.bbva.plugin.smsregex.request.command.validator.RequestValidator;
import com.bbva.smsregex.extractor.SmsExtractor;
import com.bbva.smsregex.extractor.SmsListener;
import com.bbva.smsregex.extractor.initializer.helpers.SmsClientResult;
import com.bbva.smsregex.extractor.model.ConsentRequest;
import com.bbva.smsregex.extractor.model.Sms;
import java.util.List;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import lb.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Request.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0011B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014R\u0014\u0010\f\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/bbva/plugin/smsregex/request/command/Request;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/smsregex/request/command/model/RequestParams;", "Lkotlinx/coroutines/CoroutineScope;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/bbva/plugin/smsregex/request/Injectior;", "injector", "<init>", "(Lcom/bbva/plugin/smsregex/request/Injectior;)V", "Companion", "smsregex-plugin_release"}, k = 1, mv = {1, 9, 0})
public final class Request extends AbstractCommand<RequestParams> implements CoroutineScope {

    @NotNull
    public static final String ID = "request";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Injectior f36038p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f36039q0;

    /* JADX INFO: compiled from: Request.kt */
    @DebugMetadata(c = "com.bbva.plugin.smsregex.request.command.Request$execute$1", f = "Request.kt", i = {}, l = {36, 39}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f36040p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ RequestParams f36042r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f36043s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RequestParams requestParams, CommandCallback commandCallback, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f36042r0 = requestParams;
            this.f36043s0 = commandCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return Request.this.new a(this.f36042r0, this.f36043s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f36040p0;
            RequestParams requestParams = this.f36042r0;
            Request request = Request.this;
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
            String phone = requestParams.getPhone();
            Intrinsics.checkNotNull(phone);
            this.f36040p0 = 1;
            obj = Request.access$startClient(request, phone, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            SmsClientResult smsClientResult = (SmsClientResult) obj;
            boolean zAreEqual = Intrinsics.areEqual(smsClientResult, SmsClientResult.OK.INSTANCE);
            CommandCallback commandCallback = this.f36043s0;
            if (zAreEqual) {
                commandCallback.sendEvent();
                List<String> patterns = requestParams.getPatterns();
                Intrinsics.checkNotNull(patterns);
                this.f36040p0 = 2;
                if (Request.access$receivedSms(request, patterns, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (smsClientResult instanceof SmsClientResult.ERROR) {
                commandCallback.sendError(Errors.ErrorDefault);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Request(@NotNull Injectior injector) {
        super(RequestParams.class, new RequestValidator());
        Intrinsics.checkNotNullParameter(injector, "injector");
        this.f36038p0 = injector;
        this.f36039q0 = CoroutineScopeKt.MainScope();
    }

    public static final Object access$receivedSms(Request request, List list, Continuation continuation) {
        SmsListener smsListenerCreateReceiver = request.f36038p0.getFactory().createReceiver();
        Application mApplication = request.mApplication;
        Intrinsics.checkNotNullExpressionValue(mApplication, "mApplication");
        Object objCollect = smsListenerCreateReceiver.listen(mApplication).collect(new lb.a(request, list, smsListenerCreateReceiver), continuation);
        return objCollect == ek.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    public static final void access$requestConsent(final Request request, ConsentRequest consentRequest, final List list, Activity activity) {
        request.getClass();
        ActivityResultRequest.create().action(consentRequest.getBody().getAction()).extras(consentRequest.getBody().getExtras()).listener(new ActivityResultListener() { // from class: com.bbva.plugin.smsregex.request.command.Request$requestConsent$1
            @Override // com.bbva.androidtoolkit.plugin.activity.ActivityResultListener
            public void onCancel() {
                PostMessenger postMessenger = ((AbstractCommand) request).mPostMessenger;
                Intrinsics.checkNotNullExpressionValue(postMessenger, "access$getMPostMessenger$p$s-1534621073(...)");
                RequestKt.access$consentDenied(postMessenger);
            }

            @Override // com.bbva.androidtoolkit.plugin.activity.ActivityResultListener
            public void onSuccess(@NotNull Intent data) {
                Intrinsics.checkNotNullParameter(data, "data");
                List<String> listExtract = new SmsExtractor(list).extract(new Sms(data));
                PostMessenger postMessenger = ((AbstractCommand) request).mPostMessenger;
                Intrinsics.checkNotNullExpressionValue(postMessenger, "access$getMPostMessenger$p$s-1534621073(...)");
                RequestKt.access$smsCodes(postMessenger, listExtract);
            }
        }).start(activity);
    }

    public static final Object access$startClient(Request request, String str, Continuation continuation) {
        request.getClass();
        return BuildersKt.withContext(Injectior.INSTANCE.getIoDispatcher(), new b(request, str, null), continuation);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f36039q0.getCoroutineContext();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull RequestParams params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(params, callback, null), 3, null);
    }
}
