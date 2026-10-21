package com.viergegroup.sdk.taptophone.vierge.domain;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.material3.TooltipKt;
import com.bbva.nativesettings.common.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mypinpad.tsdk.api.Terminal;
import com.mypinpad.tsdk.api.TerminalSdk;
import com.mypinpad.tsdk.api.TerminalSession;
import com.mypinpad.tsdk.api.callbacks.HandlePinPadLaunchRequestResult;
import com.mypinpad.tsdk.api.callbacks.PinPadLaunchRequestListener;
import com.mypinpad.tsdk.api.callbacks.ProceedPinPadLaunchRequest;
import com.mypinpad.tsdk.api.callbacks.SessionActivationFailure;
import com.mypinpad.tsdk.api.callbacks.SessionActivationFailureCause;
import com.mypinpad.tsdk.api.callbacks.TerminalCreationFailure;
import com.mypinpad.tsdk.api.callbacks.TerminalCreationFailureCause;
import com.mypinpad.tsdk.api.callbacks.TransactionApproved;
import com.mypinpad.tsdk.api.callbacks.TransactionCancelReason;
import com.mypinpad.tsdk.api.callbacks.TransactionCancelled;
import com.mypinpad.tsdk.api.callbacks.TransactionCompleted;
import com.mypinpad.tsdk.api.callbacks.TransactionErrorCause;
import com.mypinpad.tsdk.api.callbacks.TransactionFailed;
import com.mypinpad.tsdk.api.callbacks.TransactionNotAuthorised;
import com.mypinpad.tsdk.api.callbacks.TransactionNotAuthorisedReason;
import com.mypinpad.tsdk.api.callbacks.TransactionProcessingResult;
import com.mypinpad.tsdk.api.callbacks.TransactionResult;
import com.mypinpad.tsdk.api.callbacks.UiMessage;
import com.mypinpad.tsdk.api.callbacks.UiMessageId;
import com.mypinpad.tsdk.api.models.CardScheme;
import com.mypinpad.tsdk.api.models.Endpoint;
import com.mypinpad.tsdk.api.models.Iso4217Currency;
import com.mypinpad.tsdk.api.models.PinPadConfiguration;
import com.mypinpad.tsdk.api.models.TransactionParameters;
import com.mypinpad.tsdk.api.models.authorization.ClientCredentialsGrant;
import com.viergegroup.sdk.taptophone.AssetInjection;
import com.viergegroup.sdk.taptophone.BuildConfig;
import com.viergegroup.sdk.taptophone.R;
import com.viergegroup.sdk.taptophone.UtilsKt;
import com.viergegroup.sdk.taptophone.config.CurrencyCustomFormattingConfigKt;
import com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.SdkTapOnPhoneVierge;
import com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.TsdkLogger;
import com.viergegroup.sdk.taptophone.vierge.commons.StringUtils;
import com.viergegroup.sdk.taptophone.vierge.domain.MyPinpadHelper;
import com.viergegroup.sdk.taptophone.vierge.models.BackendViergeResponseData;
import com.viergegroup.sdk.taptophone.vierge.models.MPPTransactionParameters;
import com.viergegroup.sdk.taptophone.vierge.models.MessageLectureType;
import com.viergegroup.sdk.taptophone.vierge.models.TransactionBackendParameters;
import com.viergegroup.sdk.taptophone.vierge.models.TransactionType;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010#\u001a\u00020$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020$0&J\u001a\u0010(\u001a\u00020$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020$0&J\u0006\u0010)\u001a\u00020$J6\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020,2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020$0&2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020$0&J6\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020/2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020$0&2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020$0&J6\u00100\u001a\u00020$2\u0006\u0010+\u001a\u00020/2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020$0&2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020$0&J6\u00101\u001a\u00020$2\u0006\u0010+\u001a\u00020/2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020$0&2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020$0&J6\u00102\u001a\u00020$2\u0006\u0010+\u001a\u00020/2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020$0&2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020$0&J\u000e\u00103\u001a\u0002042\u0006\u00105\u001a\u000206J\u000e\u00107\u001a\u0002042\u0006\u00108\u001a\u000209J\u000e\u0010:\u001a\u00020\u00062\u0006\u00108\u001a\u00020;J\u0010\u0010<\u001a\u00020\u00062\u0006\u00108\u001a\u00020;H\u0002J\u0010\u0010=\u001a\u00020\u00062\u0006\u00108\u001a\u00020>H\u0002J\u000e\u0010?\u001a\u00020\u00062\u0006\u00108\u001a\u000209J\u0010\u0010@\u001a\u00020\u00062\b\u0010A\u001a\u0004\u0018\u00010BJ\u0010\u0010C\u001a\u00020\u00062\u0006\u00108\u001a\u000209H\u0002J\u000e\u0010D\u001a\u00020\u00062\u0006\u00105\u001a\u000206J\u0006\u0010E\u001a\u00020\u0006J\u000e\u0010F\u001a\u00020\u00062\u0006\u0010G\u001a\u00020HJ\u0010\u0010I\u001a\u00020\u00062\b\u0010A\u001a\u0004\u0018\u00010BJ\u000e\u0010J\u001a\u00020\u00062\u0006\u0010G\u001a\u00020HJ\u0010\u0010K\u001a\u00020\u00062\u0006\u00108\u001a\u00020;H\u0002J\u000e\u0010L\u001a\u00020\u00062\u0006\u0010G\u001a\u00020MJ\u0010\u0010N\u001a\u00020\u00062\u0006\u00108\u001a\u00020>H\u0002J\u0010\u0010O\u001a\u00020\u00062\u0006\u00108\u001a\u000209H\u0002J\u000e\u0010P\u001a\u00020\u00062\u0006\u0010G\u001a\u00020MJ\b\u0010Q\u001a\u00020\u000fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u0011\u001a\n \f*\u0004\u0018\u00010\u00120\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082.¢\u0006\u0002\n\u0000¨\u0006R"}, d2 = {"Lcom/viergegroup/sdk/taptophone/vierge/domain/MyPinpadHelper;", "", Constants.APPLICATION, "Landroid/app/Application;", "(Landroid/app/Application;)V", "TAG_DEBUG", "", "getApplication", "()Landroid/app/Application;", "setApplication", "bgThread", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "configFutureProd", "Ljava/util/concurrent/Future;", "", "configFutureSandBox", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "isReadyToExecuteTransactions", "", "isTheCounterActive", "()Z", "setTheCounterActive", "(Z)V", "terminal", "Lcom/mypinpad/tsdk/api/Terminal;", "terminalSession", "Lcom/mypinpad/tsdk/api/TerminalSession;", "activateSession", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Lcom/viergegroup/sdk/taptophone/vierge/models/BackendViergeResponseData;", "createTerminal", "deactiveSession", "executeTransaction", "parameters", "Lcom/mypinpad/tsdk/api/models/TransactionParameters;", "onChangeUiMessageListener", "Lcom/viergegroup/sdk/taptophone/vierge/models/MessageLectureType;", "Lcom/viergegroup/sdk/taptophone/vierge/models/TransactionBackendParameters;", "executeTransactionRefound", "executeTransactionSalePosTip", "executeTransactionSaleWithTip", "getCodeOfMessage", "", "id", "Lcom/mypinpad/tsdk/api/callbacks/UiMessageId;", "getErrorCode", "result", "Lcom/mypinpad/tsdk/api/callbacks/TransactionProcessingResult;", "getErrorMessageCancelledTransacction", "Lcom/mypinpad/tsdk/api/callbacks/TransactionCancelled;", "getErrorMessageCancelledTransaction", "getErrorMessageTransactionFailed", "Lcom/mypinpad/tsdk/api/callbacks/TransactionFailed;", "getMessage", "getMessageException", "exception", "", "getMessageForTransactionProcessingResult", "getMessageToShow", "getRrn", "getSessionActivationFailureErrorMessage", "cause", "Lcom/mypinpad/tsdk/api/callbacks/SessionActivationFailureCause;", "getStatusCodeException", "getStatusCodeForActivationFailureErrorMessage", "getStatusCodeForCancelledTransaction", "getStatusCodeForCreationFailureError", "Lcom/mypinpad/tsdk/api/callbacks/TerminalCreationFailure;", "getStatusCodeForMessageTransactionFailed", "getStatusCodeForTransactionProcessingResult", "getTerminalCreationFailureError", "readEmvConfiguration", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMyPinpadHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyPinpadHelper.kt\ncom/viergegroup/sdk/taptophone/vierge/domain/MyPinpadHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1863:1\n1#2:1864\n*E\n"})
public final class MyPinpadHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public Application f67812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f67813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f67814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Terminal f67815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TerminalSession f67816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f67817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Gson f67818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Handler f67819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f67820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Future<byte[]> f67821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Future<byte[]> f67822k;

    public static final class a extends Lambda implements Function2<TerminalSession, SessionActivationFailure, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f67824q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<BackendViergeResponseData, Unit> f67825r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Ref.BooleanRef booleanRef, Function1<? super BackendViergeResponseData, Unit> function1) {
            super(2);
            this.f67824q0 = booleanRef;
            this.f67825r0 = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(TerminalSession terminalSession, SessionActivationFailure sessionActivationFailure) {
            TerminalSession terminalSession2 = terminalSession;
            SessionActivationFailure sessionActivationFailure2 = sessionActivationFailure;
            MyPinpadHelper myPinpadHelper = MyPinpadHelper.this;
            String unused = myPinpadHelper.f67813b;
            SdkTapOnPhoneVierge.logger.log("MyPinpadHelper ->terminal.activateSession FINISHED");
            Ref.BooleanRef booleanRef = this.f67824q0;
            if (!booleanRef.element) {
                Function1<BackendViergeResponseData, Unit> function1 = this.f67825r0;
                if (terminalSession2 != null) {
                    myPinpadHelper.f67817f = true;
                    myPinpadHelper.f67816e = terminalSession2;
                    function1.invoke(new BackendViergeResponseData(0, "OK", "00"));
                    booleanRef.element = true;
                } else if (sessionActivationFailure2 != null) {
                    SdkTapOnPhoneVierge.logger.log("MyPinpadHelper ->terminal.sessionActivationFailure");
                    myPinpadHelper.f67817f = false;
                    String sessionActivationFailureErrorMessage = myPinpadHelper.getSessionActivationFailureErrorMessage(sessionActivationFailure2.getCause());
                    String statusCodeForActivationFailureErrorMessage = myPinpadHelper.getStatusCodeForActivationFailureErrorMessage(sessionActivationFailure2.getCause());
                    if (sessionActivationFailure2.getCause() == SessionActivationFailureCause.INTERNAL_ERROR) {
                        sessionActivationFailureErrorMessage = myPinpadHelper.getMessageException(sessionActivationFailure2.getException());
                        statusCodeForActivationFailureErrorMessage = myPinpadHelper.getStatusCodeException(sessionActivationFailure2.getException());
                    }
                    function1.invoke(new BackendViergeResponseData(-1, sessionActivationFailureErrorMessage, statusCodeForActivationFailureErrorMessage));
                } else {
                    myPinpadHelper.f67817f = false;
                    function1.invoke(new BackendViergeResponseData(-1, "UNKNOWN ERROR ACTIVATING TERMINAL_SESSION", "UNKNOWN_ERROR"));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1<BackendViergeResponseData, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<BackendViergeResponseData, Unit> f67826p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MyPinpadHelper f67827q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TransactionParameters f67828r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function1<MessageLectureType, Unit> f67829s0;

        public static final class a extends Lambda implements Function1<BackendViergeResponseData, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function1<BackendViergeResponseData, Unit> f67830p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super BackendViergeResponseData, Unit> function1) {
                super(1);
                this.f67830p0 = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(BackendViergeResponseData backendViergeResponseData) {
                BackendViergeResponseData backendViergeResponseData2 = backendViergeResponseData;
                Intrinsics.checkNotNullParameter(backendViergeResponseData2, "");
                this.f67830p0.invoke(backendViergeResponseData2);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.viergegroup.sdk.taptophone.vierge.domain.MyPinpadHelper$b$b, reason: collision with other inner class name */
        public static final class C0279b extends Lambda implements Function1<MessageLectureType, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function1<MessageLectureType, Unit> f67831p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0279b(Function1<? super MessageLectureType, Unit> function1) {
                super(1);
                this.f67831p0 = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(MessageLectureType messageLectureType) {
                MessageLectureType messageLectureType2 = messageLectureType;
                Intrinsics.checkNotNullParameter(messageLectureType2, "");
                this.f67831p0.invoke(messageLectureType2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super BackendViergeResponseData, Unit> function1, MyPinpadHelper myPinpadHelper, TransactionParameters transactionParameters, Function1<? super MessageLectureType, Unit> function2) {
            super(1);
            this.f67826p0 = function1;
            this.f67827q0 = myPinpadHelper;
            this.f67828r0 = transactionParameters;
            this.f67829s0 = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(BackendViergeResponseData backendViergeResponseData) {
            BackendViergeResponseData backendViergeResponseData2 = backendViergeResponseData;
            Intrinsics.checkNotNullParameter(backendViergeResponseData2, "");
            int f67869a = backendViergeResponseData2.getF67869a();
            Function1<BackendViergeResponseData, Unit> function1 = this.f67826p0;
            if (f67869a != 0) {
                function1.invoke(backendViergeResponseData2);
            } else {
                this.f67827q0.executeTransaction(this.f67828r0, new a(function1), new C0279b(this.f67829s0));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1<TransactionResult, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<BackendViergeResponseData, Unit> f67833q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TransactionParameters f67834r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super BackendViergeResponseData, Unit> function1, TransactionParameters transactionParameters) {
            super(1);
            this.f67833q0 = function1;
            this.f67834r0 = transactionParameters;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(TransactionResult transactionResult) {
            boolean z10;
            BackendViergeResponseData backendViergeResponseData;
            TransactionResult transactionResult2 = transactionResult;
            Intrinsics.checkNotNullParameter(transactionResult2, "");
            boolean z11 = transactionResult2 instanceof TransactionCancelled;
            Function1<BackendViergeResponseData, Unit> function1 = this.f67833q0;
            MyPinpadHelper myPinpadHelper = MyPinpadHelper.this;
            if (z11) {
                String unused = myPinpadHelper.f67813b;
                TransactionCancelled transactionCancelled = (TransactionCancelled) transactionResult2;
                Objects.toString(transactionCancelled.getReason());
                function1.invoke(new BackendViergeResponseData(-1, MyPinpadHelper.access$getErrorMessageCancelledTransaction(myPinpadHelper, transactionCancelled), MyPinpadHelper.access$getStatusCodeForCancelledTransaction(myPinpadHelper, transactionCancelled)));
            } else if (transactionResult2 instanceof TransactionCompleted) {
                String unused2 = myPinpadHelper.f67813b;
                TransactionCompleted transactionCompleted = (TransactionCompleted) transactionResult2;
                CardScheme cardScheme = transactionCompleted.getCardScheme();
                transactionCompleted.getProcessingResult();
                byte[] discretionaryTagData = transactionCompleted.getDiscretionaryTagData();
                if (cardScheme != null) {
                    String unused3 = myPinpadHelper.f67813b;
                    myPinpadHelper.getF67818g().toJson(cardScheme);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (discretionaryTagData != null) {
                    String unused4 = myPinpadHelper.f67813b;
                    StringUtils.INSTANCE.encodeHexString(discretionaryTagData);
                }
                if (transactionCompleted.getMetadata() != null) {
                    String unused5 = myPinpadHelper.f67813b;
                    Intrinsics.checkNotNull(transactionCompleted.getMetadata());
                    byte[] metadata = transactionCompleted.getMetadata();
                    Intrinsics.checkNotNull(metadata);
                    int length = metadata.length;
                    String unused6 = myPinpadHelper.f67813b;
                    StringUtils stringUtils = StringUtils.INSTANCE;
                    byte[] metadata2 = transactionCompleted.getMetadata();
                    Intrinsics.checkNotNull(metadata2);
                    stringUtils.encodeHexString(metadata2);
                }
                if (transactionCompleted.getProcessingResult() != null) {
                    String unused7 = myPinpadHelper.f67813b;
                    Objects.toString(transactionCompleted.getProcessingResult());
                }
                if (transactionCompleted.getServiceTransactionId() != null) {
                    String unused8 = myPinpadHelper.f67813b;
                    Objects.toString(transactionCompleted.getServiceTransactionId());
                }
                String strName = transactionCompleted.getUiMessage().getId().name();
                String hexString = UtilsKt.toHexString(discretionaryTagData);
                TransactionProcessingResult processingResult = transactionCompleted.getProcessingResult();
                UUID serviceTransactionId = transactionCompleted.getServiceTransactionId();
                byte[] metadata3 = transactionCompleted.getMetadata();
                String base64 = metadata3 != null ? UtilsKt.toBase64(metadata3) : null;
                StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("Transaction result: ", strName, " (data=", hexString, ", processingResult=");
                sbC.append(processingResult);
                sbC.append(", serviceTransactionId=");
                sbC.append(serviceTransactionId);
                sbC.append(", metadata=");
                sbC.append(base64);
                sbC.append(")");
                String string = sbC.toString();
                String unused9 = myPinpadHelper.f67813b;
                if (z10) {
                    backendViergeResponseData = new BackendViergeResponseData(0, string, "TRANSACTION_APPROVED");
                    if (discretionaryTagData != null) {
                        backendViergeResponseData.setDiscretionaryTagData(StringUtils.INSTANCE.encodeHexString(discretionaryTagData));
                    }
                    if (transactionCompleted.getMetadata() != null) {
                        byte[] metadata4 = transactionCompleted.getMetadata();
                        Intrinsics.checkNotNull(metadata4);
                        backendViergeResponseData.setMetadata(metadata4);
                    }
                } else {
                    backendViergeResponseData = new BackendViergeResponseData(-1, MyPinpadHelper.access$getMessageForTransactionProcessingResult(myPinpadHelper, transactionCompleted.getProcessingResult()), MyPinpadHelper.access$getStatusCodeForTransactionProcessingResult(myPinpadHelper, transactionCompleted.getProcessingResult()));
                }
                backendViergeResponseData.setRrn(this.f67834r0.getRrn());
                function1.invoke(backendViergeResponseData);
            } else if (transactionResult2 instanceof TransactionFailed) {
                String unused10 = myPinpadHelper.f67813b;
                TransactionFailed transactionFailed = (TransactionFailed) transactionResult2;
                TransactionErrorCause error = transactionFailed.getError();
                Throwable exception = transactionFailed.getException();
                Objects.toString(error);
                Objects.toString(exception);
                if (transactionFailed.getDiscretionaryTagData() != null) {
                    String unused11 = myPinpadHelper.f67813b;
                    StringUtils.INSTANCE.encodeHexString(transactionFailed.getDiscretionaryTagData());
                }
                String strName2 = transactionFailed.getError().name();
                String hexString2 = UtilsKt.toHexString(transactionFailed.getDiscretionaryTagData());
                Throwable exception2 = transactionFailed.getException();
                StringBuilder sbC2 = androidx.constraintlayout.core.parser.a.c("Transaction failed. Cause: ", strName2, " (data=", hexString2, ", exception=");
                sbC2.append(exception2);
                sbC2.append(")");
                String unused12 = myPinpadHelper.f67813b;
                function1.invoke(new BackendViergeResponseData(-1, MyPinpadHelper.access$getErrorMessageTransactionFailed(myPinpadHelper, transactionFailed), MyPinpadHelper.access$getStatusCodeForMessageTransactionFailed(myPinpadHelper, transactionFailed)));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1<MessageLectureType, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<MessageLectureType, Unit> f67835p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super MessageLectureType, Unit> function1) {
            super(1);
            this.f67835p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(MessageLectureType messageLectureType) {
            MessageLectureType messageLectureType2 = messageLectureType;
            Intrinsics.checkNotNullParameter(messageLectureType2, "");
            this.f67835p0.invoke(messageLectureType2);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1<MessageLectureType, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<MessageLectureType, Unit> f67836p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function1<? super MessageLectureType, Unit> function1) {
            super(1);
            this.f67836p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(MessageLectureType messageLectureType) {
            MessageLectureType messageLectureType2 = messageLectureType;
            Intrinsics.checkNotNullParameter(messageLectureType2, "");
            this.f67836p0.invoke(messageLectureType2);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1<BackendViergeResponseData, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<BackendViergeResponseData, Unit> f67837p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MyPinpadHelper f67838q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TransactionParameters f67839r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function1<MessageLectureType, Unit> f67840s0;

        public static final class a extends Lambda implements Function1<BackendViergeResponseData, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function1<BackendViergeResponseData, Unit> f67841p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super BackendViergeResponseData, Unit> function1) {
                super(1);
                this.f67841p0 = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(BackendViergeResponseData backendViergeResponseData) {
                BackendViergeResponseData backendViergeResponseData2 = backendViergeResponseData;
                Intrinsics.checkNotNullParameter(backendViergeResponseData2, "");
                this.f67841p0.invoke(backendViergeResponseData2);
                return Unit.INSTANCE;
            }
        }

        public static final class b extends Lambda implements Function1<MessageLectureType, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function1<MessageLectureType, Unit> f67842p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Function1<? super MessageLectureType, Unit> function1) {
                super(1);
                this.f67842p0 = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(MessageLectureType messageLectureType) {
                MessageLectureType messageLectureType2 = messageLectureType;
                Intrinsics.checkNotNullParameter(messageLectureType2, "");
                this.f67842p0.invoke(messageLectureType2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super BackendViergeResponseData, Unit> function1, MyPinpadHelper myPinpadHelper, TransactionParameters transactionParameters, Function1<? super MessageLectureType, Unit> function2) {
            super(1);
            this.f67837p0 = function1;
            this.f67838q0 = myPinpadHelper;
            this.f67839r0 = transactionParameters;
            this.f67840s0 = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(BackendViergeResponseData backendViergeResponseData) {
            BackendViergeResponseData backendViergeResponseData2 = backendViergeResponseData;
            Intrinsics.checkNotNullParameter(backendViergeResponseData2, "");
            int f67869a = backendViergeResponseData2.getF67869a();
            Function1<BackendViergeResponseData, Unit> function1 = this.f67837p0;
            if (f67869a != 0) {
                function1.invoke(backendViergeResponseData2);
            } else {
                this.f67838q0.executeTransaction(this.f67839r0, new a(function1), new b(this.f67840s0));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function1<MessageLectureType, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<MessageLectureType, Unit> f67843p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Function1<? super MessageLectureType, Unit> function1) {
            super(1);
            this.f67843p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(MessageLectureType messageLectureType) {
            MessageLectureType messageLectureType2 = messageLectureType;
            Intrinsics.checkNotNullParameter(messageLectureType2, "");
            this.f67843p0.invoke(messageLectureType2);
            return Unit.INSTANCE;
        }
    }

    public static final class h extends Lambda implements Function1<MessageLectureType, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<MessageLectureType, Unit> f67844p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(Function1<? super MessageLectureType, Unit> function1) {
            super(1);
            this.f67844p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(MessageLectureType messageLectureType) {
            MessageLectureType messageLectureType2 = messageLectureType;
            Intrinsics.checkNotNullParameter(messageLectureType2, "");
            this.f67844p0.invoke(messageLectureType2);
            return Unit.INSTANCE;
        }
    }

    public static final class i extends Lambda implements Function2<Terminal, TerminalCreationFailure, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<BackendViergeResponseData, Unit> f67846q0;

        public static final class a extends Lambda implements Function1<BackendViergeResponseData, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function1<BackendViergeResponseData, Unit> f67847p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super BackendViergeResponseData, Unit> function1) {
                super(1);
                this.f67847p0 = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(BackendViergeResponseData backendViergeResponseData) {
                BackendViergeResponseData backendViergeResponseData2 = backendViergeResponseData;
                Intrinsics.checkNotNullParameter(backendViergeResponseData2, "");
                this.f67847p0.invoke(backendViergeResponseData2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(Function1<? super BackendViergeResponseData, Unit> function1) {
            super(2);
            this.f67846q0 = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Terminal terminal, TerminalCreationFailure terminalCreationFailure) throws ExecutionException, InterruptedException {
            Terminal terminal2 = terminal;
            TerminalCreationFailure terminalCreationFailure2 = terminalCreationFailure;
            MyPinpadHelper myPinpadHelper = MyPinpadHelper.this;
            String unused = myPinpadHelper.f67813b;
            SdkTapOnPhoneVierge.logger.log("MyPinpadHelper ->createTerminal FINISHED ");
            Function1<BackendViergeResponseData, Unit> function1 = this.f67846q0;
            if (terminal2 != null) {
                myPinpadHelper.f67815d = terminal2;
                String unused2 = myPinpadHelper.f67813b;
                SdkTapOnPhoneVierge.logger.log("MyPinpadHelper ->terminal.activateSession ");
                myPinpadHelper.activateSession(new a(function1));
            } else if (terminalCreationFailure2 != null) {
                SdkTapOnPhoneVierge.logger.log("MyPinpadHelper ->terminal.Failure ");
                myPinpadHelper.f67817f = false;
                String unused3 = myPinpadHelper.f67813b;
                Objects.toString(terminalCreationFailure2.getCause());
                String unused4 = myPinpadHelper.f67813b;
                Objects.toString(terminalCreationFailure2.getException());
                String unused5 = myPinpadHelper.f67813b;
                Throwable exception = terminalCreationFailure2.getException();
                String.valueOf(exception != null ? exception.getCause() : null);
                String terminalCreationFailureError = myPinpadHelper.getTerminalCreationFailureError(terminalCreationFailure2);
                String statusCodeForCreationFailureError = myPinpadHelper.getStatusCodeForCreationFailureError(terminalCreationFailure2);
                SdkTapOnPhoneVierge.logger.log("cause: " + terminalCreationFailureError);
                function1.invoke(new BackendViergeResponseData(-1, terminalCreationFailureError, statusCodeForCreationFailureError));
            } else {
                myPinpadHelper.f67817f = false;
                function1.invoke(new BackendViergeResponseData(-1, "ERROR DESCONOCIDO AL CREAR TERMINAL", "UNKNOWN_ERROR_CREATING_TERMINAL"));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class j extends Lambda implements Function1<BackendViergeResponseData, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<BackendViergeResponseData, Unit> f67848p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(Function1<? super BackendViergeResponseData, Unit> function1) {
            super(1);
            this.f67848p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(BackendViergeResponseData backendViergeResponseData) {
            BackendViergeResponseData backendViergeResponseData2 = backendViergeResponseData;
            Intrinsics.checkNotNullParameter(backendViergeResponseData2, "");
            this.f67848p0.invoke(backendViergeResponseData2);
            return Unit.INSTANCE;
        }
    }

    public static final class k extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f67850q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<BackendViergeResponseData, Unit> f67851r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(Ref.BooleanRef booleanRef, Function1<? super BackendViergeResponseData, Unit> function1) {
            super(0);
            this.f67850q0 = booleanRef;
            this.f67851r0 = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            MyPinpadHelper myPinpadHelper = MyPinpadHelper.this;
            String unused = myPinpadHelper.f67813b;
            SdkTapOnPhoneVierge.logger.log("MyPinpadHelper ->terminal.onSessionTimeout FINISHED");
            Ref.BooleanRef booleanRef = this.f67850q0;
            if (!booleanRef.element) {
                myPinpadHelper.f67817f = false;
                this.f67851r0.invoke(new BackendViergeResponseData(-1, "TIEMPO PARA LA ACTIVACIÓN DE TERMINAL EXCEDIDO", "TOTAL_ELAPSED_TIMEOUT"));
                booleanRef.element = true;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class l extends Lambda implements Function1<BackendViergeResponseData, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<BackendViergeResponseData, Unit> f67852p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(Function1<? super BackendViergeResponseData, Unit> function1) {
            super(1);
            this.f67852p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(BackendViergeResponseData backendViergeResponseData) {
            BackendViergeResponseData backendViergeResponseData2 = backendViergeResponseData;
            Intrinsics.checkNotNullParameter(backendViergeResponseData2, "");
            this.f67852p0.invoke(backendViergeResponseData2);
            return Unit.INSTANCE;
        }
    }

    public static final class m extends Lambda implements Function1<BackendViergeResponseData, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<BackendViergeResponseData, Unit> f67853p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MyPinpadHelper f67854q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TransactionParameters f67855r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function1<MessageLectureType, Unit> f67856s0;

        public static final class a extends Lambda implements Function1<BackendViergeResponseData, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function1<BackendViergeResponseData, Unit> f67857p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super BackendViergeResponseData, Unit> function1) {
                super(1);
                this.f67857p0 = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(BackendViergeResponseData backendViergeResponseData) {
                BackendViergeResponseData backendViergeResponseData2 = backendViergeResponseData;
                Intrinsics.checkNotNullParameter(backendViergeResponseData2, "");
                this.f67857p0.invoke(backendViergeResponseData2);
                return Unit.INSTANCE;
            }
        }

        public static final class b extends Lambda implements Function1<MessageLectureType, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function1<MessageLectureType, Unit> f67858p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Function1<? super MessageLectureType, Unit> function1) {
                super(1);
                this.f67858p0 = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(MessageLectureType messageLectureType) {
                MessageLectureType messageLectureType2 = messageLectureType;
                Intrinsics.checkNotNullParameter(messageLectureType2, "");
                this.f67858p0.invoke(messageLectureType2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(Function1<? super BackendViergeResponseData, Unit> function1, MyPinpadHelper myPinpadHelper, TransactionParameters transactionParameters, Function1<? super MessageLectureType, Unit> function2) {
            super(1);
            this.f67853p0 = function1;
            this.f67854q0 = myPinpadHelper;
            this.f67855r0 = transactionParameters;
            this.f67856s0 = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(BackendViergeResponseData backendViergeResponseData) {
            BackendViergeResponseData backendViergeResponseData2 = backendViergeResponseData;
            Intrinsics.checkNotNullParameter(backendViergeResponseData2, "");
            int f67869a = backendViergeResponseData2.getF67869a();
            Function1<BackendViergeResponseData, Unit> function1 = this.f67853p0;
            if (f67869a != 0) {
                function1.invoke(backendViergeResponseData2);
            } else {
                this.f67854q0.executeTransaction(this.f67855r0, new a(function1), new b(this.f67856s0));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class n extends Lambda implements Function1<BackendViergeResponseData, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<BackendViergeResponseData, Unit> f67859p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n(Function1<? super BackendViergeResponseData, Unit> function1) {
            super(1);
            this.f67859p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(BackendViergeResponseData backendViergeResponseData) {
            BackendViergeResponseData backendViergeResponseData2 = backendViergeResponseData;
            Intrinsics.checkNotNullParameter(backendViergeResponseData2, "");
            this.f67859p0.invoke(backendViergeResponseData2);
            return Unit.INSTANCE;
        }
    }

    public static final class o extends Lambda implements Function1<BackendViergeResponseData, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<BackendViergeResponseData, Unit> f67860p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MyPinpadHelper f67861q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TransactionParameters f67862r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function1<MessageLectureType, Unit> f67863s0;

        public static final class a extends Lambda implements Function1<MessageLectureType, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function1<MessageLectureType, Unit> f67864p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super MessageLectureType, Unit> function1) {
                super(1);
                this.f67864p0 = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(MessageLectureType messageLectureType) {
                MessageLectureType messageLectureType2 = messageLectureType;
                Intrinsics.checkNotNullParameter(messageLectureType2, "");
                this.f67864p0.invoke(messageLectureType2);
                return Unit.INSTANCE;
            }
        }

        public static final class b extends Lambda implements Function1<BackendViergeResponseData, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function1<BackendViergeResponseData, Unit> f67865p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Function1<? super BackendViergeResponseData, Unit> function1) {
                super(1);
                this.f67865p0 = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(BackendViergeResponseData backendViergeResponseData) {
                BackendViergeResponseData backendViergeResponseData2 = backendViergeResponseData;
                Intrinsics.checkNotNullParameter(backendViergeResponseData2, "");
                this.f67865p0.invoke(backendViergeResponseData2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o(Function1<? super BackendViergeResponseData, Unit> function1, MyPinpadHelper myPinpadHelper, TransactionParameters transactionParameters, Function1<? super MessageLectureType, Unit> function2) {
            super(1);
            this.f67860p0 = function1;
            this.f67861q0 = myPinpadHelper;
            this.f67862r0 = transactionParameters;
            this.f67863s0 = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(BackendViergeResponseData backendViergeResponseData) {
            BackendViergeResponseData backendViergeResponseData2 = backendViergeResponseData;
            Intrinsics.checkNotNullParameter(backendViergeResponseData2, "");
            int f67869a = backendViergeResponseData2.getF67869a();
            Function1<BackendViergeResponseData, Unit> function1 = this.f67860p0;
            if (f67869a != 0) {
                function1.invoke(backendViergeResponseData2);
            } else {
                this.f67861q0.executeTransaction(this.f67862r0, new b(function1), new a(this.f67863s0));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class p extends Lambda implements Function1<BackendViergeResponseData, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<BackendViergeResponseData, Unit> f67866p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public p(Function1<? super BackendViergeResponseData, Unit> function1) {
            super(1);
            this.f67866p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(BackendViergeResponseData backendViergeResponseData) {
            BackendViergeResponseData backendViergeResponseData2 = backendViergeResponseData;
            Intrinsics.checkNotNullParameter(backendViergeResponseData2, "");
            this.f67866p0.invoke(backendViergeResponseData2);
            return Unit.INSTANCE;
        }
    }

    public static final class q extends Lambda implements Function1<UiMessage, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<MessageLectureType, Unit> f67868q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(Function1<? super MessageLectureType, Unit> function1) {
            super(1);
            this.f67868q0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(UiMessage uiMessage) {
            UiMessage uiMessage2 = uiMessage;
            Intrinsics.checkNotNullParameter(uiMessage2, "");
            final MyPinpadHelper myPinpadHelper = MyPinpadHelper.this;
            String unused = myPinpadHelper.f67813b;
            Objects.toString(uiMessage2);
            final String messageToShow = myPinpadHelper.getMessageToShow(uiMessage2.getId());
            final int codeOfMessage = myPinpadHelper.getCodeOfMessage(uiMessage2.getId());
            String unused2 = myPinpadHelper.f67813b;
            String unused3 = myPinpadHelper.f67813b;
            MessageLectureType messageLectureType = new MessageLectureType(messageToShow, codeOfMessage);
            final Function1<MessageLectureType, Unit> function1 = this.f67868q0;
            function1.invoke(messageLectureType);
            if (messageToShow.equals("VEA TELÉFONO") && !myPinpadHelper.getF67820i()) {
                myPinpadHelper.setTheCounterActive(true);
                String unused4 = myPinpadHelper.f67813b;
                myPinpadHelper.getF67819h().postDelayed(new Runnable(messageToShow, codeOfMessage, function1) { // from class: hj.c

                    /* JADX INFO: renamed from: q0, reason: collision with root package name */
                    public final /* synthetic */ String f69468q0;

                    /* JADX INFO: renamed from: r0, reason: collision with root package name */
                    public final /* synthetic */ Function1 f69469r0;

                    {
                        this.f69469r0 = function1;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MyPinpadHelper myPinpadHelper2 = this.f69467p0;
                        Intrinsics.checkNotNullParameter(myPinpadHelper2, "");
                        Intrinsics.checkNotNullParameter(this.f69468q0, "");
                        Function1 function2 = this.f69469r0;
                        Intrinsics.checkNotNullParameter(function2, "");
                        String unused5 = myPinpadHelper2.f67813b;
                        String unused6 = myPinpadHelper2.f67813b;
                        String unused7 = myPinpadHelper2.f67813b;
                        function2.invoke(new MessageLectureType("ACERCA LA TARJETA DE NUEVO", 11));
                        myPinpadHelper2.setTheCounterActive(false);
                    }
                }, TooltipKt.TooltipDuration);
            }
            return Unit.INSTANCE;
        }
    }

    public MyPinpadHelper(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.f67812a = application;
        this.f67813b = "MyPinpadHelper";
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f67814c = executorServiceNewSingleThreadExecutor;
        this.f67818g = new GsonBuilder().setPrettyPrinting().create();
        this.f67819h = new Handler(Looper.getMainLooper());
        Future<byte[]> futureSubmit = executorServiceNewSingleThreadExecutor.submit(new Callable() { // from class: hj.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                MyPinpadHelper myPinpadHelper = this.f69465p0;
                Intrinsics.checkNotNullParameter(myPinpadHelper, "");
                InputStream inputStreamOpenRawResource = myPinpadHelper.f67812a.getResources().openRawResource(R.raw.emv_config_sandbox);
                Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "");
                Charset charset = Charsets.UTF_8;
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, charset), 8192);
                try {
                    String text = TextStreamsKt.readText(bufferedReader);
                    CloseableKt.closeFinally(bufferedReader, null);
                    byte[] bytes = text.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes, "");
                    return bytes;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(bufferedReader, th2);
                        throw th3;
                    }
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(futureSubmit, "");
        this.f67821j = futureSubmit;
        Future<byte[]> futureSubmit2 = executorServiceNewSingleThreadExecutor.submit(new Callable() { // from class: hj.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                MyPinpadHelper myPinpadHelper = this.f69466p0;
                Intrinsics.checkNotNullParameter(myPinpadHelper, "");
                InputStream inputStreamOpenRawResource = myPinpadHelper.f67812a.getResources().openRawResource(R.raw.emv_config_prod);
                Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "");
                Charset charset = Charsets.UTF_8;
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, charset), 8192);
                try {
                    String text = TextStreamsKt.readText(bufferedReader);
                    CloseableKt.closeFinally(bufferedReader, null);
                    byte[] bytes = text.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes, "");
                    return bytes;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(bufferedReader, th2);
                        throw th3;
                    }
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(futureSubmit2, "");
        this.f67822k = futureSubmit2;
    }

    public static final /* synthetic */ String access$getErrorMessageCancelledTransaction(MyPinpadHelper myPinpadHelper, TransactionCancelled transactionCancelled) {
        String str = transactionCancelled.getReason() == TransactionCancelReason.TRANSACTION_WAS_TERMINATED ? "LA TRANSACCIÓN FUE TERMINADA" : "ERROR DESCONOCIDO";
        if (transactionCancelled.getReason() == TransactionCancelReason.USER_CANCELLED_PIN_PAD) {
            str = "USUARIO CANCELÓ ENTRADA DE PIN";
        }
        if (transactionCancelled.getReason() == TransactionCancelReason.SESSION_DEACTIVATED) {
            str = "SESIÓN DESACTIVADA";
        }
        if (transactionCancelled.getReason() == TransactionCancelReason.DEVICE_STATE_FAILURE) {
            str = "FALLO DEL ESTADO DEL DISPOSITIVO";
        }
        if (transactionCancelled.getReason() == TransactionCancelReason.TIME_CHECK_ERROR) {
            str = "EL TIEMPO DEL SISTEMA SUPERA LA TOLERANCIA";
        }
        return transactionCancelled.getReason() == TransactionCancelReason.TERMINAL_DISPOSED ? "TERMINAL ELIMINADA" : str;
    }

    public static final /* synthetic */ String access$getErrorMessageTransactionFailed(MyPinpadHelper myPinpadHelper, TransactionFailed transactionFailed) {
        String messageException = transactionFailed.getError() == TransactionErrorCause.NETWORK_CONNECTION_ERROR ? "ERROR DE CONEXIÓN DE RED" : "ERROR DESCONOCIDO";
        if (transactionFailed.getError() == TransactionErrorCause.MICROPHONE_USAGE_DETECTED) {
            messageException = "PROCESAMIENTO DE LA TRANSACCIÓN FALLIDO, USO DE MICRÓFONO DETECTADO";
        }
        if (transactionFailed.getError() == TransactionErrorCause.CAMERA_USAGE_DETECTED) {
            messageException = "PROCESAMIENTO DE LA TRANSACCIÓN FALLIDO, USO DE CAMARA DETECTADO";
        }
        if (transactionFailed.getError() == TransactionErrorCause.EXTERNAL_CAMERA_DETECTED) {
            messageException = "PROCESAMIENTO DE LA TRANSACCIÓN FALLIDO, CAMARA EXTERNA DETECTADA";
        }
        if (transactionFailed.getError() == TransactionErrorCause.TOTAL_ELAPSED_TIMEOUT) {
            messageException = "TIEMPO PARA PROCESAMIENTO DE TRANSACCIÓN EXCEDIDO";
        }
        if (transactionFailed.getError() == TransactionErrorCause.DISCOVERY_TIMEOUT) {
            messageException = "TIEMPO DE ESPERA PARA EL PROCESAMIENTO DE TARJETA DISCOVERY EXCEDIDO";
        }
        if (transactionFailed.getError() == TransactionErrorCause.PIN_ENTRY_ACCUMULATED_TIMEOUT) {
            messageException = "TIEMPO DE ESPERA PARA LOS INTENTOS DE INGRESO DE PIN EXCEDIDOS";
        }
        if (transactionFailed.getError() == TransactionErrorCause.PIN_ENTRY_TIMEOUT) {
            messageException = "TIEMPO DE ESPERA PARA EL INGRESO DE PIN EXCEDIDO";
        }
        if (transactionFailed.getError() == TransactionErrorCause.AUTHORIZATION_IN_PROGRESS_TIMEOUT) {
            messageException = "TIEMPO DE ESPERA PARA LA AUTORIZACIÓN EXCEDIDO";
        }
        if (transactionFailed.getError() == TransactionErrorCause.INTERNAL_ERROR) {
            messageException = myPinpadHelper.getMessageException(transactionFailed.getException());
        }
        if (transactionFailed.getError() == TransactionErrorCause.HOST_CALLBACK_ERROR) {
            messageException = "ERROR EN RESPUESTA DEL HOST";
        }
        if (transactionFailed.getError() == TransactionErrorCause.PIN_PAD_OBSCURED_ERROR) {
            messageException = "PANTALLA DE TECLADO DE PIN CUBIERTA POR OTRA VENTANA";
        }
        if (transactionFailed.getError() == TransactionErrorCause.PIN_PAD_DETACHED_ERROR) {
            messageException = "PANTALLA DE PIN DESCONECTADA";
        }
        if (transactionFailed.getError() == TransactionErrorCause.PIN_PAD_LAUNCH_TIMEOUT) {
            messageException = "TIEMPO DE ESPERA DE INICIALIZACIÓN DE PIN PAD EXCEDIDO";
        }
        if (transactionFailed.getError() == TransactionErrorCause.NFC_ERROR) {
            messageException = "ERROR NFC";
        }
        return transactionFailed.getError() == TransactionErrorCause.APP_IN_BACKGROUND ? "APLICACION EN SEGUNDO PLANO" : messageException;
    }

    public static final /* synthetic */ String access$getMessageForTransactionProcessingResult(MyPinpadHelper myPinpadHelper, TransactionProcessingResult transactionProcessingResult) {
        if (!(transactionProcessingResult instanceof TransactionNotAuthorised)) {
            return "ERROR DESCONOCIDO";
        }
        TransactionNotAuthorised transactionNotAuthorised = (TransactionNotAuthorised) transactionProcessingResult;
        String str = transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.ONLINE_DECLINED ? "DECLINADA ONLINE" : "ERROR DESCONOCIDO";
        if (transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.OFFLINE_DECLINED) {
            str = "DECLINADA OFFLINE";
        }
        if (transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.INVALID_AUTHORISATION_DATA) {
            str = "DATOS DE AUTENTICACIÓN NO VÁLIDOS";
        }
        if (transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.NO_CARD_APPLICATION) {
            str = "APLICACIÓN DE TARJETA NO DISPONIBLE";
        }
        if (transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.NO_CARD_APPLICATION_SELECTOR_MISMATCHED) {
            str = "APLICACIÓN DE TARJETA NO DISPONIBLE DURANTE EL PROCESO DE TRANSACCIÓN";
        }
        if (transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.PROCESSING_ERROR) {
            str = "ERROR EN EL PROCESAMIENTO DE LA TRANSACCIÓN";
        }
        return transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.CARD_ERROR ? "ERROR EN EL PROCESAMIENTO DE LA TARJETA" : str;
    }

    public static final /* synthetic */ String access$getStatusCodeForCancelledTransaction(MyPinpadHelper myPinpadHelper, TransactionCancelled transactionCancelled) {
        String str = transactionCancelled.getReason() == TransactionCancelReason.TRANSACTION_WAS_TERMINATED ? "TRANSACTION_WAS_TERMINATED" : "UNKNOWN_ERROR";
        if (transactionCancelled.getReason() == TransactionCancelReason.USER_CANCELLED_PIN_PAD) {
            str = "USER_CANCELLED_PIN_PAD";
        }
        if (transactionCancelled.getReason() == TransactionCancelReason.SESSION_DEACTIVATED) {
            str = "SESSION_DEACTIVATED";
        }
        if (transactionCancelled.getReason() == TransactionCancelReason.DEVICE_STATE_FAILURE) {
            str = "DEVICE_STATE_FAILURE";
        }
        if (transactionCancelled.getReason() == TransactionCancelReason.TIME_CHECK_ERROR) {
            str = "TIME_CHECK_ERROR";
        }
        return transactionCancelled.getReason() == TransactionCancelReason.TERMINAL_DISPOSED ? "TERMINAL_DISPOSED" : str;
    }

    public static final /* synthetic */ String access$getStatusCodeForMessageTransactionFailed(MyPinpadHelper myPinpadHelper, TransactionFailed transactionFailed) {
        String statusCodeException = transactionFailed.getError() == TransactionErrorCause.NETWORK_CONNECTION_ERROR ? "NETWORK_CONNECTION_ERROR" : "UNKNOWN_ERROR";
        if (transactionFailed.getError() == TransactionErrorCause.MICROPHONE_USAGE_DETECTED) {
            statusCodeException = "MICROPHONE_USAGE_DETECTED";
        }
        if (transactionFailed.getError() == TransactionErrorCause.CAMERA_USAGE_DETECTED) {
            statusCodeException = "CAMERA_USAGE_DETECTED";
        }
        if (transactionFailed.getError() == TransactionErrorCause.EXTERNAL_CAMERA_DETECTED) {
            statusCodeException = "EXTERNAL_CAMERA_DETECTED";
        }
        if (transactionFailed.getError() == TransactionErrorCause.TOTAL_ELAPSED_TIMEOUT) {
            statusCodeException = "TOTAL_ELAPSED_TIMEOUT";
        }
        if (transactionFailed.getError() == TransactionErrorCause.DISCOVERY_TIMEOUT) {
            statusCodeException = "DISCOVERY_TIMEOUT";
        }
        if (transactionFailed.getError() == TransactionErrorCause.PIN_ENTRY_ACCUMULATED_TIMEOUT) {
            statusCodeException = "PIN_ENTRY_ACCUMULATED_TIMEOUT";
        }
        if (transactionFailed.getError() == TransactionErrorCause.PIN_ENTRY_TIMEOUT) {
            statusCodeException = "PIN_ENTRY_TIMEOUT";
        }
        if (transactionFailed.getError() == TransactionErrorCause.AUTHORIZATION_IN_PROGRESS_TIMEOUT) {
            statusCodeException = "AUTHORIZATION_IN_PROGRESS_TIMEOUT";
        }
        if (transactionFailed.getError() == TransactionErrorCause.INTERNAL_ERROR) {
            statusCodeException = myPinpadHelper.getStatusCodeException(transactionFailed.getException());
        }
        if (transactionFailed.getError() == TransactionErrorCause.HOST_CALLBACK_ERROR) {
            statusCodeException = "HOST_CALLBACK_ERROR";
        }
        if (transactionFailed.getError() == TransactionErrorCause.PIN_PAD_OBSCURED_ERROR) {
            statusCodeException = "PIN_PAD_OBSCURED_ERROR";
        }
        if (transactionFailed.getError() == TransactionErrorCause.PIN_PAD_DETACHED_ERROR) {
            statusCodeException = "PIN_PAD_DETACHED_ERROR";
        }
        if (transactionFailed.getError() == TransactionErrorCause.PIN_PAD_LAUNCH_TIMEOUT) {
            statusCodeException = "PIN_PAD_LAUNCH_TIMEOUT";
        }
        if (transactionFailed.getError() == TransactionErrorCause.NFC_ERROR) {
            statusCodeException = "NFC_ERROR";
        }
        return transactionFailed.getError() == TransactionErrorCause.APP_IN_BACKGROUND ? "APP_IN_BACKGROUND" : statusCodeException;
    }

    public static final /* synthetic */ String access$getStatusCodeForTransactionProcessingResult(MyPinpadHelper myPinpadHelper, TransactionProcessingResult transactionProcessingResult) {
        if (!(transactionProcessingResult instanceof TransactionNotAuthorised)) {
            return "UNKNOWN_ERROR";
        }
        TransactionNotAuthorised transactionNotAuthorised = (TransactionNotAuthorised) transactionProcessingResult;
        String str = transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.ONLINE_DECLINED ? "ONLINE_DECLINED" : "UNKNOWN_ERROR";
        if (transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.OFFLINE_DECLINED) {
            str = "OFFLINE_DECLINED";
        }
        if (transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.INVALID_AUTHORISATION_DATA) {
            str = "INVALID_AUTHORISATION_DATA";
        }
        if (transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.NO_CARD_APPLICATION) {
            str = "NO_CARD_APPLICATION";
        }
        if (transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.NO_CARD_APPLICATION_SELECTOR_MISMATCHED) {
            str = "NO_CARD_APPLICATION_SELECTOR_MISMATCHED";
        }
        if (transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.PROCESSING_ERROR) {
            str = "PROCESSING_ERROR";
        }
        return transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.CARD_ERROR ? "CARD_ERROR" : str;
    }

    public final void activateSession(@NotNull Function1<? super BackendViergeResponseData, Unit> listener) throws ExecutionException, InterruptedException {
        Intrinsics.checkNotNullParameter(listener, "");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (this.f67815d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        SdkTapOnPhoneVierge.logger.log("activateSession 96d45184-d3bd-4b2f-afed-5a49778dd4f9");
        Terminal terminal = this.f67815d;
        if (terminal == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            terminal = null;
        }
        UUID uuidFromString = UUID.fromString("96d45184-d3bd-4b2f-afed-5a49778dd4f9");
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "");
        byte[] bArr = this.f67822k.get();
        Intrinsics.checkNotNullExpressionValue(bArr, "");
        terminal.activateSession(uuidFromString, bArr, new a(booleanRef, listener), new k(booleanRef, listener));
    }

    public final void createTerminal(@NotNull Function1<? super BackendViergeResponseData, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "");
        SdkTapOnPhoneVierge.logger.log("MyPinpadHelper ->createTerminal ");
        PinPadConfiguration pinPadConfiguration = new PinPadConfiguration(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -1, 3, null);
        SdkTapOnPhoneVierge.logger.log("End to build pinPadConfiguration ");
        SdkTapOnPhoneVierge.logger.log("End to build  authorizationGrant");
        SdkTapOnPhoneVierge.logger.log("scope: https://mpplivece.onmicrosoft.com/625f88e3-3b1c-4209-a160-e06c1b7d0718/.default");
        SdkTapOnPhoneVierge.logger.log("clientId: 5661ac88-1e48-45e9-bdfc-be2603e9baa8");
        SdkTapOnPhoneVierge.logger.log("clientSecret: 1Lu8Q~C8jxAc.XhbjfhHh0vJimin1i7rX33Y0a7V");
        TsdkLogger tsdkLogger = SdkTapOnPhoneVierge.logger;
        Endpoint endpoint = BuildConfig.ENDPOINT;
        tsdkLogger.log("Endpoint: " + endpoint);
        ClientCredentialsGrant clientCredentialsGrant = new ClientCredentialsGrant(BuildConfig.SCOPE, BuildConfig.CLIENT_ID, BuildConfig.CLIENT_SECRET);
        SdkTapOnPhoneVierge.logger.log("End to build  authorizationGrant");
        SdkTapOnPhoneVierge.logger.log("scope: " + clientCredentialsGrant.getScope());
        SdkTapOnPhoneVierge.logger.log("clientId: " + clientCredentialsGrant.getClientId());
        SdkTapOnPhoneVierge.logger.log("clientSecret: " + clientCredentialsGrant.getClientSecret());
        SdkTapOnPhoneVierge.logger.log("Endpoint: " + endpoint);
        Application application = this.f67812a;
        TerminalSdk.Configuration configuration = new TerminalSdk.Configuration(pinPadConfiguration, CurrencyCustomFormattingConfigKt.getCurrencyCustomFormattingConfig(), false, 0, 0, 0, 0, 0.0f, false, false, false, 2044, null);
        Intrinsics.checkNotNullExpressionValue(endpoint, "");
        TerminalSdk.createTerminal(application, configuration, endpoint, clientCredentialsGrant, new i(listener));
    }

    public final void deactiveSession() {
        TerminalSession terminalSession = this.f67816e;
        if (terminalSession == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            terminalSession = null;
        }
        terminalSession.deactivate();
        this.f67817f = false;
    }

    public final void executeTransaction(@NotNull TransactionBackendParameters parameters, @NotNull Function1<? super BackendViergeResponseData, Unit> listener, @NotNull Function1<? super MessageLectureType, Unit> onChangeUiMessageListener) throws ExecutionException, InterruptedException {
        Intrinsics.checkNotNullParameter(parameters, "");
        Intrinsics.checkNotNullParameter(listener, "");
        Intrinsics.checkNotNullParameter(onChangeUiMessageListener, "");
        parameters.setRrn(getRrn());
        MPPTransactionParameters mPPTransactionParametersConvertMPPTransactionParameters = parameters.convertMPPTransactionParameters();
        parameters.getTransactionAmount();
        mPPTransactionParametersConvertMPPTransactionParameters.getF67965a();
        TransactionParameters injectedTransactionParameters = AssetInjection.INSTANCE.getInjectedTransactionParameters();
        TransactionParameters transactionParameters = injectedTransactionParameters != null ? new TransactionParameters(mPPTransactionParametersConvertMPPTransactionParameters.getF67965a(), null, injectedTransactionParameters.getCurrency(), null, mPPTransactionParametersConvertMPPTransactionParameters.getF67966b(), parameters.getRrn(), injectedTransactionParameters.getApplicationFilteringSelectors(), parameters.getMetaBytes(), UUID.fromString("25e39c76-8d97-11ef-b864-0242ac120002")) : new TransactionParameters(mPPTransactionParametersConvertMPPTransactionParameters.getF67965a(), null, new Iso4217Currency(484), null, mPPTransactionParametersConvertMPPTransactionParameters.getF67966b(), parameters.getRrn(), CollectionsKt__CollectionsKt.emptyList(), parameters.getMetaBytes(), UUID.fromString("25e39c76-8d97-11ef-b864-0242ac120002"));
        if (this.f67817f) {
            executeTransaction(transactionParameters, new l(listener), new d(onChangeUiMessageListener));
        } else {
            activateSession(new f(listener, this, transactionParameters, onChangeUiMessageListener));
        }
    }

    public final void executeTransactionRefound(@NotNull TransactionBackendParameters parameters, @NotNull Function1<? super BackendViergeResponseData, Unit> listener, @NotNull Function1<? super MessageLectureType, Unit> onChangeUiMessageListener) throws ExecutionException, InterruptedException {
        Intrinsics.checkNotNullParameter(parameters, "");
        Intrinsics.checkNotNullParameter(listener, "");
        Intrinsics.checkNotNullParameter(onChangeUiMessageListener, "");
        parameters.setTransactionType(TransactionType.INSTANCE.fromTransactionTypeName("Refund"));
        MPPTransactionParameters mPPTransactionParametersConvertMPPTransactionParameters = parameters.convertMPPTransactionParameters();
        TransactionParameters injectedTransactionParameters = AssetInjection.INSTANCE.getInjectedTransactionParameters();
        TransactionParameters transactionParameters = injectedTransactionParameters != null ? new TransactionParameters(mPPTransactionParametersConvertMPPTransactionParameters.getF67965a(), null, injectedTransactionParameters.getCurrency(), null, com.mypinpad.tsdk.api.models.TransactionType.REFUND, parameters.getRrn(), injectedTransactionParameters.getApplicationFilteringSelectors(), parameters.getMetaBytes(), UUID.fromString("25e39c76-8d97-11ef-b864-0242ac120002")) : new TransactionParameters(mPPTransactionParametersConvertMPPTransactionParameters.getF67965a(), null, new Iso4217Currency(484), null, com.mypinpad.tsdk.api.models.TransactionType.REFUND, parameters.getRrn(), CollectionsKt__CollectionsKt.emptyList(), parameters.getMetaBytes(), UUID.fromString("25e39c76-8d97-11ef-b864-0242ac120002"));
        if (this.f67817f) {
            executeTransaction(transactionParameters, new p(listener), new e(onChangeUiMessageListener));
        } else {
            activateSession(new b(listener, this, transactionParameters, onChangeUiMessageListener));
        }
    }

    public final void executeTransactionSalePosTip(@NotNull TransactionBackendParameters parameters, @NotNull Function1<? super BackendViergeResponseData, Unit> listener, @NotNull Function1<? super MessageLectureType, Unit> onChangeUiMessageListener) throws ExecutionException, InterruptedException {
        Intrinsics.checkNotNullParameter(parameters, "");
        Intrinsics.checkNotNullParameter(listener, "");
        Intrinsics.checkNotNullParameter(onChangeUiMessageListener, "");
        parameters.setRrn(getRrn());
        parameters.setTransactionType(TransactionType.INSTANCE.fromTransactionTypeName("SalePosTip"));
        MPPTransactionParameters mPPTransactionParametersConvertMPPTransactionParameters = parameters.convertMPPTransactionParameters();
        TransactionParameters injectedTransactionParameters = AssetInjection.INSTANCE.getInjectedTransactionParameters();
        TransactionParameters transactionParameters = injectedTransactionParameters != null ? new TransactionParameters(mPPTransactionParametersConvertMPPTransactionParameters.getF67965a(), null, injectedTransactionParameters.getCurrency(), null, com.mypinpad.tsdk.api.models.TransactionType.PURCHASE, parameters.getRrn(), injectedTransactionParameters.getApplicationFilteringSelectors(), parameters.getMetaBytes(), UUID.fromString("25e39c76-8d97-11ef-b864-0242ac120002")) : new TransactionParameters(mPPTransactionParametersConvertMPPTransactionParameters.getF67965a(), null, new Iso4217Currency(484), null, com.mypinpad.tsdk.api.models.TransactionType.PURCHASE, parameters.getRrn(), CollectionsKt__CollectionsKt.emptyList(), parameters.getMetaBytes(), UUID.fromString("25e39c76-8d97-11ef-b864-0242ac120002"));
        if (this.f67817f) {
            executeTransaction(transactionParameters, new n(listener), new g(onChangeUiMessageListener));
        } else {
            activateSession(new o(listener, this, transactionParameters, onChangeUiMessageListener));
        }
    }

    public final void executeTransactionSaleWithTip(@NotNull TransactionBackendParameters parameters, @NotNull Function1<? super BackendViergeResponseData, Unit> listener, @NotNull Function1<? super MessageLectureType, Unit> onChangeUiMessageListener) throws ExecutionException, InterruptedException {
        Intrinsics.checkNotNullParameter(parameters, "");
        Intrinsics.checkNotNullParameter(listener, "");
        Intrinsics.checkNotNullParameter(onChangeUiMessageListener, "");
        parameters.setRrn(getRrn());
        parameters.setTransactionType(TransactionType.INSTANCE.fromTransactionTypeName("SaleWithTip"));
        MPPTransactionParameters mPPTransactionParametersConvertMPPTransactionParameters = parameters.convertMPPTransactionParameters();
        TransactionParameters injectedTransactionParameters = AssetInjection.INSTANCE.getInjectedTransactionParameters();
        TransactionParameters transactionParameters = injectedTransactionParameters != null ? new TransactionParameters(mPPTransactionParametersConvertMPPTransactionParameters.getF67965a(), Long.valueOf(Long.parseLong(parameters.getTransactionOtherAmount())), injectedTransactionParameters.getCurrency(), null, com.mypinpad.tsdk.api.models.TransactionType.PURCHASE, parameters.getRrn(), injectedTransactionParameters.getApplicationFilteringSelectors(), parameters.getMetaBytes(), UUID.fromString("25e39c76-8d97-11ef-b864-0242ac120002")) : new TransactionParameters(mPPTransactionParametersConvertMPPTransactionParameters.getF67965a(), Long.valueOf(Long.parseLong(parameters.getTransactionOtherAmount())), new Iso4217Currency(484), null, com.mypinpad.tsdk.api.models.TransactionType.PURCHASE, parameters.getRrn(), CollectionsKt__CollectionsKt.emptyList(), parameters.getMetaBytes(), UUID.fromString("25e39c76-8d97-11ef-b864-0242ac120002"));
        if (this.f67817f) {
            executeTransaction(transactionParameters, new j(listener), new h(onChangeUiMessageListener));
        } else {
            activateSession(new m(listener, this, transactionParameters, onChangeUiMessageListener));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getApplication, reason: from getter */
    public final Application getF67812a() {
        return this.f67812a;
    }

    public final int getCodeOfMessage(@NotNull UiMessageId id) {
        Intrinsics.checkNotNullParameter(id, "");
        if (id == UiMessageId.APPROVED) {
            return 0;
        }
        if (id == UiMessageId.NOT_AUTHORISED) {
            return 1;
        }
        if (id == UiMessageId.PLEASE_ENTER_PIN) {
            return 2;
        }
        if (id == UiMessageId.PROCESSING_ERROR) {
            return 3;
        }
        if (id == UiMessageId.PRESENT_CARD) {
            return 4;
        }
        if (id == UiMessageId.CARD_READ_OK_PLEASE_REMOVE) {
            return 5;
        }
        if (id == UiMessageId.APPROVED_PLEASE_SIGN) {
            return 6;
        }
        if (id == UiMessageId.AUTHORISING_PLEASE_WAIT) {
            return 7;
        }
        if (id == UiMessageId.TRY_ANOTHER_CARD) {
            return 8;
        }
        if (id == UiMessageId.CLEAR_DISPLAY) {
            return 9;
        }
        if (id == UiMessageId.SEE_PHONE) {
            return 10;
        }
        if (id == UiMessageId.PRESENT_CARD_AGAIN) {
            return 11;
        }
        return id == UiMessageId.HOLD_STILL ? 12 : -1;
    }

    public final int getErrorCode(@NotNull TransactionProcessingResult result) {
        TransactionNotAuthorisedReason reason;
        Intrinsics.checkNotNullParameter(result, "");
        int iOrdinal = -1;
        if (result instanceof TransactionNotAuthorised) {
            TransactionNotAuthorised transactionNotAuthorised = (TransactionNotAuthorised) result;
            if (transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.ONLINE_DECLINED) {
                TransactionNotAuthorisedReason reason2 = transactionNotAuthorised.getReason();
                if (reason2 != null) {
                    iOrdinal = reason2.ordinal();
                }
            } else if (transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.OFFLINE_DECLINED) {
                TransactionNotAuthorisedReason reason3 = transactionNotAuthorised.getReason();
                if (reason3 != null) {
                    iOrdinal = reason3.ordinal();
                }
            } else if (transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.INVALID_AUTHORISATION_DATA) {
                TransactionNotAuthorisedReason reason4 = transactionNotAuthorised.getReason();
                if (reason4 != null) {
                    iOrdinal = reason4.ordinal();
                }
            } else if (transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.NO_CARD_APPLICATION) {
                TransactionNotAuthorisedReason reason5 = transactionNotAuthorised.getReason();
                if (reason5 != null) {
                    iOrdinal = reason5.ordinal();
                }
            } else if (transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.NO_CARD_APPLICATION_SELECTOR_MISMATCHED) {
                TransactionNotAuthorisedReason reason6 = transactionNotAuthorised.getReason();
                if (reason6 != null) {
                    iOrdinal = reason6.ordinal();
                }
            } else if (transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.PROCESSING_ERROR) {
                TransactionNotAuthorisedReason reason7 = transactionNotAuthorised.getReason();
                if (reason7 != null) {
                    iOrdinal = reason7.ordinal();
                }
            } else if (transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.CARD_ERROR && (reason = transactionNotAuthorised.getReason()) != null) {
                iOrdinal = reason.ordinal();
            }
        } else if (result instanceof TransactionApproved) {
            iOrdinal = 0;
        }
        return iOrdinal == 0 ? iOrdinal - 2000 : (-iOrdinal) - 2000;
    }

    @NotNull
    public final String getErrorMessageCancelledTransacction(@NotNull TransactionCancelled result) {
        Intrinsics.checkNotNullParameter(result, "");
        String str = result.getReason() == TransactionCancelReason.TRANSACTION_WAS_TERMINATED ? "LA TRANSACCIÓN FUE TERMINADA" : "ERROR DESCONOCIDO";
        if (result.getReason() == TransactionCancelReason.USER_CANCELLED_PIN_PAD) {
            str = "USUARIO CANCELO ENTRADA DE PIN";
        }
        if (result.getReason() == TransactionCancelReason.SESSION_DEACTIVATED) {
            str = "SESIÓN DESACTIVADA";
        }
        return result.getReason() == TransactionCancelReason.DEVICE_STATE_FAILURE ? "FALLO DEL ESTADO DEL DISPOSITIVO" : str;
    }

    /* JADX INFO: renamed from: getGson, reason: from getter */
    public final Gson getF67818g() {
        return this.f67818g;
    }

    @NotNull
    /* JADX INFO: renamed from: getHandler, reason: from getter */
    public final Handler getF67819h() {
        return this.f67819h;
    }

    @NotNull
    public final String getMessage(@NotNull TransactionProcessingResult result) {
        Intrinsics.checkNotNullParameter(result, "");
        if (!(result instanceof TransactionNotAuthorised)) {
            return result instanceof TransactionApproved ? "APPROVED" : "ERROR DESCONOCIDO";
        }
        TransactionNotAuthorised transactionNotAuthorised = (TransactionNotAuthorised) result;
        String str = transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.ONLINE_DECLINED ? "DECLINADA ONLINE" : "ERROR DESCONOCIDO";
        if (transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.OFFLINE_DECLINED) {
            str = "DECLINADA OFFLINE";
        }
        if (transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.INVALID_AUTHORISATION_DATA) {
            str = "DATOS DE AUTENTICACIÓN NO VÁLIDOS";
        }
        if (transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.NO_CARD_APPLICATION) {
            str = "APLICACIÓN DE TARJETA NO DISPONIBLE";
        }
        if (transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.NO_CARD_APPLICATION_SELECTOR_MISMATCHED) {
            str = "APLICACIÓN DE TARJETA NO DISPONIBLE DURANTE EL PROCESO DE TRANSACCIÓN";
        }
        if (transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.PROCESSING_ERROR) {
            str = "ERROR EN EL PROCESAMIENTO DE LA TRANSACCIÓN";
        }
        return transactionNotAuthorised.getReason() == TransactionNotAuthorisedReason.CARD_ERROR ? "ERROR EN EL PROCESAMIENTO DE LA TARJETA" : str;
    }

    @NotNull
    public final String getMessageException(@Nullable Throwable exception) {
        if (exception == null) {
            return "DESCONOCIDO";
        }
        String strReplace = new Regex("[^0-9]").replace(String.valueOf(exception.getCause()), "");
        String str = strReplace.equals("10003") ? "CARGA ESPERADA FALTANTE" : "DESCONOCIDO";
        if (strReplace.equals("10004")) {
            str = "SIN CONFIGURACIÓN DE EMV CALLBACK";
        }
        if (strReplace.equals("10006")) {
            str = "ACTIVAR LLAMADO MIENTRAS EXISTE SESIÓN";
        }
        if (strReplace.equals("10007")) {
            str = "SESIÓN YA DISPUESTA";
        }
        if (strReplace.equals("10008")) {
            str = "FALTA LA LLAVE PÚBLICA DEL TERMINAL";
        }
        if (strReplace.equals("10010")) {
            str = "TAG FALTANTE DESCUBIERTO";
        }
        if (strReplace.equals("10011")) {
            str = "ESQUEMA DE TARJETA DESCONOCIDO";
        }
        if (strReplace.equals("10012")) {
            str = "RESULTADO NO VÁLIDO";
        }
        if (strReplace.equals("10014")) {
            str = "EXPONENTE MONEDA NO RESPALDADO";
        }
        if (strReplace.equals("10015")) {
            str = "ESTADO DE TIEMPO DE ESPERA NO VÁLIDO";
        }
        if (strReplace.equals("10016")) {
            str = "PAYLOAD DE AUTORIZACIÓN NO VÁLIDA";
        }
        if (strReplace.equals("10019")) {
            str = "NÚMERO HEXADECIMAL NO VÁLIDO";
        }
        if (strReplace.equals("10020")) {
            str = "ETIQUETA NO VÁLIDA DE CLASS TYPE";
        }
        if (strReplace.equals("10021")) {
            str = "ETIQUETA NO VÁLIDA";
        }
        if (strReplace.equals("10022")) {
            str = "VALOR DEL TAG NO VÁLIDO";
        }
        if (strReplace.equals("10023")) {
            str = "TLV BER NO VÁLIDO";
        }
        if (strReplace.equals("10025")) {
            str = "ERROR DE RED HTTP";
        }
        if (strReplace.equals("10026")) {
            str = "ERROR DEL SERVIDOR HTTP";
        }
        if (strReplace.equals("10027")) {
            str = "ERROR DE SOLICITUD HTTP";
        }
        if (strReplace.equals("10028")) {
            str = "ERROR DE RESPUESTA HTTP";
        }
        if (strReplace.equals("10029")) {
            str = "HTTP OTRO ERROR";
        }
        if (strReplace.equals("10030")) {
            str = "ERROR DE AUTENTICACIÓN,TOKEN DE ACCESO NO PRESENTE";
        }
        if (strReplace.equals("10031")) {
            str = "ERROR DE AUTENTICACIÓN, TOKEN DE ACCESO EXPIRADO";
        }
        if (strReplace.equals("10032")) {
            str = "ERROR DE AUTENTICACIÓN, ERROR HTTP DEL TOKEN DE ACCESO";
        }
        if (strReplace.equals("10033")) {
            str = "ERROR DE AUTENTICACIÓN, CONCESIÓN DE AUTORIZACIÓN NO PRESENTE";
        }
        if (strReplace.equals("10034")) {
            str = "ERROR DE AUTENTICACIÓN URL DEL SERVICIO DE IDENTIDAD ILEGAL";
        }
        if (strReplace.equals("10036")) {
            str = "AUTORIZACIÓN EN PROCESO";
        }
        if (strReplace.equals("10037")) {
            str = "ERROR 2xx INESPERADO DE HTTP";
        }
        if (strReplace.equals("10038")) {
            str = "ARG DE CODIFICACIÓN BASE64 NO VÁLIDA";
        }
        if (strReplace.equals("10041")) {
            str = "ERROR DE AUTENTICACIÓN FALTA OID";
        }
        if (strReplace.equals("10042")) {
            str = "ERROR DE AUTENTICACIÓN OID NO VÁLIDO";
        }
        if (strReplace.equals("10043")) {
            str = "ERROR DE AUTENTICACIÓN FALTAN GRUPOS";
        }
        if (strReplace.equals("10044")) {
            str = "ERROR DE AUTENTICACIÓN GRUPOS NO VÁLIDOS";
        }
        if (strReplace.equals("10045")) {
            str = "ERROR DE AUTENTICACIÓN FALTAN ROLES";
        }
        if (strReplace.equals("10046")) {
            str = "ERROR DE AUTENTICACIÓN FUNCIONES NO VÁLIDAS";
        }
        if (strReplace.equals("10047")) {
            str = "ERROR DE AUTENTICACIÓN ERROR EN EL ANÁLISIS DE LA CARGA ÚTIL DEL TOKEN";
        }
        if (strReplace.equals("10048")) {
            str = "RESULTADO INESPERADO DE EMV";
        }
        if (strReplace.equals("10051")) {
            str = "ERROR EN EL MENSAJE DE UI";
        }
        if (strReplace.equals("10052")) {
            str = "ERROR DE AUTENTICACIÓN URL DE SERVICIO ILEGAL";
        }
        if (strReplace.equals("10053")) {
            str = "TRANSACCIÓN FALLIDA";
        }
        if (strReplace.equals("10054")) {
            str = "FALLÓ LA INICIALIZACIÓN DEL PROVEEDOR TERMINAL";
        }
        if (strReplace.equals("10055")) {
            str = "PROVEEDOR DE TERMINAL FALLÓ AL CREAR TERMINAL";
        }
        if (strReplace.equals("10056")) {
            str = "FALLÓ LA SESIÓN DE ACTIVACIÓN DEL TERMINAL ANDROID";
        }
        if (strReplace.equals("10057")) {
            str = "FALLÓ LA TRANSACCIÓN DE INICIO DE SESIÓN DE TERMINAL DE ANDROID";
        }
        if (strReplace.equals("10058")) {
            str = "ERROR DE RESPUESTA DE RED HTTP";
        }
        if (strReplace.equals("10059")) {
            str = "ERROR DE RESPUESTA ATTESTATION";
        }
        if (strReplace.equals("10060")) {
            str = "TIEMPO DE ESPERA DE SESIÓN PARA ACTIVAR TERMINAL ANDROID EXPIRADO";
        }
        if (strReplace.equals("10061")) {
            str = "RED HTTP OBTENER ERROR DE RESULTADO DE COMPRA";
        }
        if (strReplace.equals("10062")) {
            str = "ERRO DE RESPUESTA DE MATERIAL DE OBTENCIÓN DE RED HTTP";
        }
        if (strReplace.equals("10063")) {
            str = "RED HTTP OBTIENE ERROR DE ENTROPÍA";
        }
        if (strReplace.equals("10064")) {
            str = "ERROR DE NUEVO ACUERDO DE RED HTTP";
        }
        if (strReplace.equals("10065")) {
            str = "ERROR DEL ACUERDO INICIAL DE LA RED HTTP";
        }
        if (strReplace.equals("10066")) {
            str = "ERROR DE ACUERDO DE ROL DE RED HTTP ";
        }
        if (strReplace.equals("10067")) {
            str = "RED HTTP OBTENER NUEVO ERROR DE TOKEN";
        }
        if (strReplace.equals("10068")) {
            str = "ERROR DE REGISTRO DE ESTADO DE ACTUALIZACIÓN DE RED HTTP";
        }
        if (strReplace.equals("10069")) {
            str = "ERROR DE RESPUESTA DE TRANSACCIÓN DE MANEJO DE RED HTTP";
        }
        if (strReplace.equals("10070")) {
            str = "PAQUETE GSM ANDROID NO ENCONTRADO";
        }
        if (strReplace.equals("10071")) {
            str = "FALLÓ LA VALIDACIÓN LOCAL";
        }
        if (strReplace.equals("10072")) {
            str = "FALLÓ LA VALIDACIÓN REMOTA";
        }
        return strReplace.equals("10073") ? "PIN BYPASS NO SOPORTADO" : str;
    }

    @NotNull
    public final String getMessageToShow(@NotNull UiMessageId id) {
        Intrinsics.checkNotNullParameter(id, "");
        if (id == UiMessageId.APPROVED) {
            return "APROBADO";
        }
        if (id == UiMessageId.NOT_AUTHORISED) {
            return "NO AUTORIZADO";
        }
        if (id == UiMessageId.PLEASE_ENTER_PIN) {
            return "POR FAVOR INGRESE PIN";
        }
        if (id == UiMessageId.PROCESSING_ERROR) {
            return "ERROR PROCESANDO";
        }
        if (id == UiMessageId.PRESENT_CARD) {
            return "ACERCA TARJETA";
        }
        if (id == UiMessageId.CARD_READ_OK_PLEASE_REMOVE) {
            return "TARJETA LEÍDA EXITOSAMENTE, RETIRAR TARJETA POR FAVOR";
        }
        if (id == UiMessageId.APPROVED_PLEASE_SIGN) {
            return "APROVADO, FIRME POR FAVOR";
        }
        if (id == UiMessageId.AUTHORISING_PLEASE_WAIT) {
            return "AUTORIZANDO POR FAVOR ESPERE";
        }
        if (id == UiMessageId.TRY_ANOTHER_CARD) {
            return "INTENTE CON OTRA TARJETA";
        }
        if (id == UiMessageId.CLEAR_DISPLAY) {
            return "LIMPIAR PANTALLA";
        }
        if (id == UiMessageId.SEE_PHONE) {
            return "VEA TELÉFONO";
        }
        if (id == UiMessageId.PRESENT_CARD_AGAIN) {
            return "ACERCA LA TARJETA DE NUEVO";
        }
        return id == UiMessageId.HOLD_STILL ? "NO RETIRE LA TARJETA" : "";
    }

    @NotNull
    public final String getRrn() {
        String str = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMddHHmmss"));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return StringsKt__StringsKt.padEnd(str, 12, '0');
    }

    @NotNull
    public final String getSessionActivationFailureErrorMessage(@NotNull SessionActivationFailureCause cause) {
        Intrinsics.checkNotNullParameter(cause, "");
        String str = cause == SessionActivationFailureCause.NETWORK_CONNECTION_ERROR ? "ERROR EN CONEXIÓN DE RED" : "ERROR DESCONOCIDO";
        if (cause == SessionActivationFailureCause.DEVICE_STATE_FAILURE) {
            str = "FALLO DEL ESTADO DEL DISPOSITIVO";
        }
        if (cause == SessionActivationFailureCause.NFC_ERROR) {
            str = "ERROR EN NFC";
        }
        if (cause == SessionActivationFailureCause.CONFIGURATION_VALIDATION_HASH_FAILURE) {
            str = "ERROR EN LA VALIDACIÓN DE CONFIGURACIÓN";
        }
        if (cause == SessionActivationFailureCause.DEACTIVATED) {
            str = "ERROR, TERMINAL DESACTIVADA";
        }
        return cause == SessionActivationFailureCause.INTERNAL_ERROR ? "ERROR INTERNO" : str;
    }

    @NotNull
    public final String getStatusCodeException(@Nullable Throwable exception) {
        if (exception == null) {
            return "UNKNOWN_ERROR";
        }
        String strReplace = new Regex("[^0-9]").replace(String.valueOf(exception.getCause()), "");
        String str = strReplace.equals("10003") ? "EXPECTED_PAYLOAD_MISSING" : "UNKNOWN_ERROR";
        if (strReplace.equals("10004")) {
            str = "NO_EMV_CONFIG_SET_CALLBACK";
        }
        if (strReplace.equals("10006")) {
            str = "ACTIVATE_CALLED_WHILE_SESSION_EXISTS";
        }
        if (strReplace.equals("10007")) {
            str = "SESSION_ALREADY_DISPOSED";
        }
        if (strReplace.equals("10008")) {
            str = "TERMINAL_PUBLIC_KEY_IS_MISSING";
        }
        if (strReplace.equals("10010")) {
            str = "MISSING_DISCOVERED_TAG";
        }
        if (strReplace.equals("10011")) {
            str = "UNKNOWN_CARD_SCHEME";
        }
        if (strReplace.equals("10012")) {
            str = "INVALID_OUTCOME";
        }
        if (strReplace.equals("10014")) {
            str = "UNSUPPORTED_CURRENCY_EXPONENT";
        }
        if (strReplace.equals("10015")) {
            str = "INVALID_TIMEOUT_STATE";
        }
        if (strReplace.equals("10016")) {
            str = "INVALID_AUTHORISATION_PAYLOAD";
        }
        if (strReplace.equals("10019")) {
            str = "INVALID_HEXADECIMAL_NUMBER";
        }
        if (strReplace.equals("10020")) {
            str = "INVALID_TAG_CLASS_TYPE";
        }
        if (strReplace.equals("10021")) {
            str = "INVALID_TAG_LABEL";
        }
        if (strReplace.equals("10022")) {
            str = "INVALID_TAG_VALUE";
        }
        if (strReplace.equals("10023")) {
            str = "INVALID_BER_TLV";
        }
        if (strReplace.equals("10025")) {
            str = "HTTP_NETWORK_ERROR";
        }
        if (strReplace.equals("10026")) {
            str = "HTTP_SERVER_ERROR";
        }
        if (strReplace.equals("10027")) {
            str = "HTTP_REQUEST_ERROR";
        }
        if (strReplace.equals("10028")) {
            str = "HTTP_RESPONSE_ERROR";
        }
        if (strReplace.equals("10029")) {
            str = "HTTP_OTHER_ERROR";
        }
        if (strReplace.equals("10030")) {
            str = "AUTHENTICATION_ERROR_ACCESS_TOKEN_NOT_PRESENT";
        }
        if (strReplace.equals("10031")) {
            str = "AUTHENTICATION_ERROR_ACCESS_TOKEN_EXPIRED";
        }
        if (strReplace.equals("10032")) {
            str = "AUTHENTICATION_ERROR_ACCESS_TOKEN_HTTP_ERROR";
        }
        if (strReplace.equals("10033")) {
            str = "AUTHENTICATION_ERROR_AUTHORIZATION_GRANT_NOT_PRESENT";
        }
        if (strReplace.equals("10034")) {
            str = "AUTHENTICATION_ERROR_ILLEGAL_IDENTITY_SERVICE_URL";
        }
        if (strReplace.equals("10036")) {
            str = "AUTHORISATION_ALREADY_IN_FLIGHT";
        }
        if (strReplace.equals("10037")) {
            str = "HTTP_UNEXPECTED_2xx_ERROR";
        }
        if (strReplace.equals("10038")) {
            str = "INVALID_BASE64_DECODING_ARG";
        }
        if (strReplace.equals("10041")) {
            str = "AUTHENTICATION_ERROR_MISSING_OID";
        }
        if (strReplace.equals("10042")) {
            str = "AUTHENTICATION_ERROR_INVALID_OID";
        }
        if (strReplace.equals("10043")) {
            str = "AUTHENTICATION_ERROR_MISSING_GROUPS";
        }
        if (strReplace.equals("10044")) {
            str = "AUTHENTICATION_ERROR_INVALID_GROUPS";
        }
        if (strReplace.equals("10045")) {
            str = "AUTHENTICATION_ERROR_MISSING_ROLES";
        }
        if (strReplace.equals("10046")) {
            str = "AUTHENTICATION_ERROR_INVALID_ROLES";
        }
        if (strReplace.equals("10047")) {
            str = "AUTHENTICATION_ERROR_TOKEN_PAYLOAD_PARSING_FAILED";
        }
        if (strReplace.equals("10048")) {
            str = "UNEXPECTED_EMV_OUTCOME";
        }
        if (strReplace.equals("10051")) {
            str = "ERROR_ON_UI_MESSAGE";
        }
        if (strReplace.equals("10052")) {
            str = "AUTHENTICATION_ERROR_ILLEGAL_SERVICE_URL";
        }
        if (strReplace.equals("10053")) {
            str = "TRANSACTION_FAILED";
        }
        if (strReplace.equals("10054")) {
            str = "TERMINAL_PROVIDER_INITIALISE_FAILED";
        }
        if (strReplace.equals("10055")) {
            str = "TERMINAL_PROVIDER_CREATE_TERMINAL_FAILED";
        }
        if (strReplace.equals("10056")) {
            str = "ANDROID_TERMINAL_ACTIVATE_SESSION_FAILED";
        }
        if (strReplace.equals("10057")) {
            str = "ANDROID_TERMINAL_SESSION_START_TRANSACTION_FAILED";
        }
        if (strReplace.equals("10058")) {
            str = "HTTP_NETWORK_RESPONSE_ERROR";
        }
        if (strReplace.equals("10059")) {
            str = "ATTESTATION_RESPONSE_ERROR";
        }
        if (strReplace.equals("10060")) {
            str = "ANDROID_TERMINAL_ACTIVATE_SESSION_TIMEOUT";
        }
        if (strReplace.equals("10061")) {
            str = "HTTP_NETWORK_GET_PURCHASE_RESULT_ERROR";
        }
        if (strReplace.equals("10062")) {
            str = "HTTP_NETWORK_GET_PAD_MATERIAL_RESPONSE_ERROR";
        }
        if (strReplace.equals("10063")) {
            str = "HTTP_NETWORK_GET_ENTROPY_ERROR";
        }
        if (strReplace.equals("10064")) {
            str = "HTTP_NETWORK_NEW_AGREEMENT_ERROR";
        }
        if (strReplace.equals("10065")) {
            str = "HTTP_NETWORK_INITIAL_AGREEMENT_ERROR";
        }
        if (strReplace.equals("10066")) {
            str = "HTTP_NETWORK_ROLL_AGREEMENT_ERROR";
        }
        if (strReplace.equals("10067")) {
            str = "HTTP_NETWORK_GET_NEW_TOKEN_ERROR";
        }
        if (strReplace.equals("10068")) {
            str = "HTTP_NETWORK_UPDATE_STATE_RECORD_ERROR";
        }
        if (strReplace.equals("10069")) {
            str = "HTTP_NETWORK_HANDLE_TRANSACTION_RESPONSE_ERROR";
        }
        if (strReplace.equals("10070")) {
            str = "ANDROID_GSM_PACKAGE_NOT_FOUND";
        }
        if (strReplace.equals("10071")) {
            str = "LOCAL_ATTESTATION_FAILED";
        }
        if (strReplace.equals("10072")) {
            str = "REMOTE_ATTESTATION_FAILED";
        }
        return strReplace.equals("10073") ? "PIN_BYPASS_NOT_SUPPORTED" : str;
    }

    @NotNull
    public final String getStatusCodeForActivationFailureErrorMessage(@NotNull SessionActivationFailureCause cause) {
        Intrinsics.checkNotNullParameter(cause, "");
        String str = cause == SessionActivationFailureCause.NETWORK_CONNECTION_ERROR ? "NETWORK_CONNECTION_ERROR" : "UNKNOWN_ERROR";
        if (cause == SessionActivationFailureCause.DEVICE_STATE_FAILURE) {
            str = "DEVICE_STATE_FAILURE";
        }
        if (cause == SessionActivationFailureCause.NFC_ERROR) {
            str = "NFC_ERROR";
        }
        if (cause == SessionActivationFailureCause.CONFIGURATION_VALIDATION_HASH_FAILURE) {
            str = "CONFIGURATION_VALIDATION_HASH_FAILURE";
        }
        if (cause == SessionActivationFailureCause.DEACTIVATED) {
            str = "DEACTIVATED";
        }
        return cause == SessionActivationFailureCause.INTERNAL_ERROR ? "INTERNAL_ERROR" : str;
    }

    @NotNull
    public final String getStatusCodeForCreationFailureError(@NotNull TerminalCreationFailure cause) {
        Intrinsics.checkNotNullParameter(cause, "");
        String str = cause.getCause() == TerminalCreationFailureCause.NETWORK_CONNECTION_ERROR ? "NETWORK_CONNECTION_ERROR" : "UNKNOWN_ERROR";
        if (cause.getCause() == TerminalCreationFailureCause.DEVICE_STATE_FAILURE) {
            str = "DEVICE_STATE_FAILURE";
        }
        if (cause.getCause() == TerminalCreationFailureCause.UNSUPPORTED_ANDROID_OS_VERSION) {
            str = "UNSUPPORTED_ANDROID_OS_VERSION";
        }
        return cause.getCause() == TerminalCreationFailureCause.INTERNAL_ERROR ? getStatusCodeException(cause.getException()) : str;
    }

    @NotNull
    public final String getTerminalCreationFailureError(@NotNull TerminalCreationFailure cause) {
        Intrinsics.checkNotNullParameter(cause, "");
        String str = cause.getCause() == TerminalCreationFailureCause.NETWORK_CONNECTION_ERROR ? "ERROR EN CONEXIÓN DE RED" : "ERROR DESCONOCIDO";
        if (cause.getCause() == TerminalCreationFailureCause.DEVICE_STATE_FAILURE) {
            str = "FALLO DEL ESTADO DEL DISPOSITIVO";
        }
        if (cause.getCause() == TerminalCreationFailureCause.UNSUPPORTED_ANDROID_OS_VERSION) {
            str = "VERSION DEL SISTEMA OPERATIVO ANDROID NO SOPORTADO";
        }
        return cause.getCause() == TerminalCreationFailureCause.INTERNAL_ERROR ? getMessageException(cause.getException()) : str;
    }

    /* JADX INFO: renamed from: isTheCounterActive, reason: from getter */
    public final boolean getF67820i() {
        return this.f67820i;
    }

    public final void setApplication(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.f67812a = application;
    }

    public final void setTheCounterActive(boolean z10) {
        this.f67820i = z10;
    }

    public final void executeTransaction(@NotNull TransactionParameters parameters, @NotNull Function1<? super BackendViergeResponseData, Unit> listener, @NotNull Function1<? super MessageLectureType, Unit> onChangeUiMessageListener) {
        Intrinsics.checkNotNullParameter(parameters, "");
        Intrinsics.checkNotNullParameter(listener, "");
        Intrinsics.checkNotNullParameter(onChangeUiMessageListener, "");
        TerminalSession terminalSession = this.f67816e;
        if (terminalSession == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            terminalSession = null;
        }
        terminalSession.startTransaction(parameters, new q(onChangeUiMessageListener), new PinPadLaunchRequestListener() { // from class: com.viergegroup.sdk.taptophone.vierge.domain.MyPinpadHelper.executeTransaction.5
            @Override // com.mypinpad.tsdk.api.callbacks.PinPadLaunchRequestListener
            @NotNull
            public final HandlePinPadLaunchRequestResult onPinPadLaunchRequest() {
                return ProceedPinPadLaunchRequest.INSTANCE;
            }
        }, new c(listener, parameters));
    }
}
