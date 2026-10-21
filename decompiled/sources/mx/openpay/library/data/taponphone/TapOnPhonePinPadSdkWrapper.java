package mx.openpay.library.data.taponphone;

import android.content.Context;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.dasnano.vdphotoselfiecapture.VDPhotoSelfieCapture;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.ICallbackListeners;
import com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.PinPadSdk;
import com.viergegroup.sdk.taptophone.vierge.models.MessageLectureType;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel;
import mx.openpay.library.data.bluetooth.eglobal.model.C51Response;
import mx.openpay.library.data.bluetooth.eglobal.model.C54Response;
import mx.openpay.library.data.bluetooth.eglobal.model.Q8Response;
import mx.openpay.library.data.bluetooth.eglobal.model.Z10Response;
import mx.openpay.library.data.bluetooth.eglobal.model.Z11Response;
import mx.openpay.library.data.bluetooth.eglobal.model.Z12Response;
import mx.openpay.library.data.bluetooth.eglobal.model.Z13Response;
import mx.openpay.library.data.taponphone.di.TapOnPhoneDependenciesProvider;
import mx.openpay.library.data.taponphone.model.I51Response;
import mx.openpay.library.data.util.CommandConstants;
import mx.openpay.library.data.util.EglobalUtils;
import mx.openpay.library.domain.model.Error;
import mx.openpay.library.domain.model.eglobal.TerminalKeysResponse;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0006\u0010\u0003\u001a\u00020\u0002J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJf\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2#\u0010\u0018\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00020\u0013H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ9\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00062\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J!\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00062\u0006\u0010#\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J)\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00062\u0006\u0010(\u001a\u00020'2\u0006\u0010#\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J!\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00062\u0006\u0010#\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b-\u0010&J!\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00062\u0006\u0010.\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b0\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Lmx/openpay/library/data/taponphone/TapOnPhonePinPadSdkWrapper;", "", "", "clearPendingProcess", "", "isProdEnv", "Lmx/openpay/library/domain/util/Result;", "Lmx/openpay/library/data/taponphone/model/I51Response;", "initializeTapOnPhoneI51", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx/openpay/library/data/bluetooth/eglobal/model/Q8Response;", "getSmartphoneInformationQ8", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", PushConstants.AMOUNT, "isCharge", "keyName", "slotKey", "orderId", "Lkotlin/Function1;", "Lcom/viergegroup/sdk/taptophone/vierge/models/MessageLectureType;", "Lkotlin/ParameterName;", "name", "messageLectureType", "listenerStatusMessage", "Lmx/openpay/library/data/bluetooth/eglobal/model/C51Response;", "readCardInfoC51", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hostStatus", "responseCode", "issuerAuthData", "authorization", "Lmx/openpay/library/data/bluetooth/eglobal/model/C54Response;", "hostResponseC54", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "slotKeyName", "Lmx/openpay/library/data/bluetooth/eglobal/model/Z10Response;", "requestRandomKeyZ10", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx/openpay/library/domain/model/eglobal/TerminalKeysResponse;", "terminalKeysResponse", "Lmx/openpay/library/data/bluetooth/eglobal/model/Z11Response;", "sendInitialKeyZ11", "(Lmx/openpay/library/domain/model/eglobal/TerminalKeysResponse;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx/openpay/library/data/bluetooth/eglobal/model/Z12Response;", "sendInitialKeyZ12", "rsaKeyName", "Lmx/openpay/library/data/bluetooth/eglobal/model/Z13Response;", "validateRSAKeyZ13", "Landroid/content/Context;", "context", "Lcom/google/gson/Gson;", "gson", "<init>", "(Landroid/content/Context;Lcom/google/gson/Gson;)V", "data_release"}, k = 1, mv = {1, 8, 0})
public final class TapOnPhonePinPadSdkWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Gson f83743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PinPadSdk f83744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public Lambda f83745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public Function1<? super MessageLectureType, Unit> f83746d;

    /* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhonePinPadSdkWrapper", f = "TapOnPhonePinPadSdkWrapper.kt", i = {0, 0}, l = {162}, m = "getSmartphoneInformationQ8", n = {"this", "responseChannel"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TapOnPhonePinPadSdkWrapper f83747p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Channel f83748q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f83749r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f83751t0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83749r0 = obj;
            this.f83751t0 |= Integer.MIN_VALUE;
            return TapOnPhonePinPadSdkWrapper.this.getSmartphoneInformationQ8(this);
        }
    }

    /* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
    public static final class a0 extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a0 f83752p0 = new a0(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(String str) {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
    public static final class b extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Channel<Result<Q8Response>> f83754q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Channel<Result<Q8Response>> channel) {
            super(1);
            this.f83754q0 = channel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            Channel<Result<Q8Response>> channel = this.f83754q0;
            try {
                Q8Response q8Response = (Q8Response) TapOnPhonePinPadSdkWrapper.this.f83743a.fromJson(str2, Q8Response.class);
                if (EglobalUtils.isSuccessStatusCommand$default(EglobalUtils.INSTANCE, q8Response.getStatus(), false, 2, null) && Intrinsics.areEqual(q8Response.getCommand(), CommandConstants.COMMAND_Q8)) {
                    channel.mo5953trySendJP2dKIU(new Result.Success(q8Response, null, 2, null));
                } else {
                    channel.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal("401#" + q8Response.getStatus() + "#" + q8Response.getMessage())));
                }
            } catch (JsonSyntaxException unused) {
                channel.mo5953trySendJP2dKIU(new Result.Failure(Error.Unknown.INSTANCE));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
    public static final class c extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f83755p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(String str) {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhonePinPadSdkWrapper", f = "TapOnPhonePinPadSdkWrapper.kt", i = {0, 0}, l = {265}, m = "hostResponseC54", n = {"this", "responseChannel"}, s = {"L$0", "L$1"})
    public static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TapOnPhonePinPadSdkWrapper f83756p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Channel f83757q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f83758r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f83760t0;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83758r0 = obj;
            this.f83760t0 |= Integer.MIN_VALUE;
            return TapOnPhonePinPadSdkWrapper.this.hostResponseC54(null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
    public static final class e extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Channel<Result<C54Response>> f83762q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Channel<Result<C54Response>> channel) {
            super(1);
            this.f83762q0 = channel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            Channel<Result<C54Response>> channel = this.f83762q0;
            try {
                C54Response c54Response = (C54Response) TapOnPhonePinPadSdkWrapper.this.f83743a.fromJson(str2, C54Response.class);
                if (EglobalUtils.isSuccessStatusCommand$default(EglobalUtils.INSTANCE, c54Response.getStatus(), false, 2, null) && Intrinsics.areEqual(c54Response.getCommand(), CommandConstants.COMMAND_C54)) {
                    channel.mo5953trySendJP2dKIU(new Result.Success(c54Response, null, 2, null));
                } else {
                    channel.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal("401#" + c54Response.getStatus() + "#" + c54Response.getMessage())));
                }
            } catch (JsonSyntaxException unused) {
                channel.mo5953trySendJP2dKIU(new Result.Failure(Error.Unknown.INSTANCE));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
    public static final class f extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f83763p0 = new f(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(String str) {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhonePinPadSdkWrapper", f = "TapOnPhonePinPadSdkWrapper.kt", i = {0, 0}, l = {129}, m = "initializeTapOnPhoneI51", n = {"this", "responseChannel"}, s = {"L$0", "L$1"})
    public static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TapOnPhonePinPadSdkWrapper f83764p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Channel f83765q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f83766r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f83768t0;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83766r0 = obj;
            this.f83768t0 |= Integer.MIN_VALUE;
            return TapOnPhonePinPadSdkWrapper.this.initializeTapOnPhoneI51(false, this);
        }
    }

    /* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
    public static final class h extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Channel<Result<I51Response>> f83771q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Channel<Result<I51Response>> channel) {
            super(1);
            this.f83771q0 = channel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            Channel<Result<I51Response>> channel = this.f83771q0;
            try {
                I51Response i51Response = (I51Response) TapOnPhonePinPadSdkWrapper.this.f83743a.fromJson(str2, I51Response.class);
                if (EglobalUtils.INSTANCE.isSuccessStatusCommand(i51Response.getStatus(), true) && Intrinsics.areEqual(i51Response.getCommand(), CommandConstants.COMMAND_I51)) {
                    channel.mo5953trySendJP2dKIU(new Result.Success(i51Response, null, 2, null));
                } else {
                    channel.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal("401#" + i51Response.getStatus() + "#" + i51Response.getMessage())));
                }
            } catch (JsonSyntaxException unused) {
                channel.mo5953trySendJP2dKIU(new Result.Failure(Error.Unknown.INSTANCE));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
    public static final class i extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f83772p0 = new i(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(String str) {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
    public static final class j extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final j f83773p0 = new j(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(String str) {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
    public static final class k extends Lambda implements Function1<MessageLectureType, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final k f83774p0 = new k(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(MessageLectureType messageLectureType) {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhonePinPadSdkWrapper", f = "TapOnPhonePinPadSdkWrapper.kt", i = {0, 0}, l = {219}, m = "readCardInfoC51", n = {"this", "responseChannel"}, s = {"L$0", "L$1"})
    public static final class l extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TapOnPhonePinPadSdkWrapper f83775p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Channel f83776q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f83777r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f83779t0;

        public l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83777r0 = obj;
            this.f83779t0 |= Integer.MIN_VALUE;
            return TapOnPhonePinPadSdkWrapper.this.readCardInfoC51(null, false, null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
    public static final class m extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Channel<Result<C51Response>> f83781q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Channel<Result<C51Response>> channel) {
            super(1);
            this.f83781q0 = channel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            Channel<Result<C51Response>> channel = this.f83781q0;
            try {
                C51Response c51Response = (C51Response) TapOnPhonePinPadSdkWrapper.this.f83743a.fromJson(str2, C51Response.class);
                if (Intrinsics.areEqual(c51Response.getCommand(), CommandConstants.COMMAND_C51)) {
                    if (EglobalUtils.INSTANCE.isSuccessStatusCommand(c51Response.getStatus(), true)) {
                        channel.mo5953trySendJP2dKIU(new Result.Success(c51Response, null, 2, null));
                    } else {
                        channel.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal("401#" + c51Response.getStatus() + "#" + c51Response.getMessage())));
                    }
                }
            } catch (JsonSyntaxException unused) {
                channel.mo5953trySendJP2dKIU(new Result.Failure(Error.Unknown.INSTANCE));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
    public static final class n extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final n f83782p0 = new n(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(String str) {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
    public static final class o extends Lambda implements Function1<MessageLectureType, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final o f83783p0 = new o(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(MessageLectureType messageLectureType) {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhonePinPadSdkWrapper", f = "TapOnPhonePinPadSdkWrapper.kt", i = {0, 0}, l = {298}, m = "requestRandomKeyZ10", n = {"this", "responseChannel"}, s = {"L$0", "L$1"})
    public static final class p extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TapOnPhonePinPadSdkWrapper f83784p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Channel f83785q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f83786r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f83788t0;

        public p(Continuation<? super p> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83786r0 = obj;
            this.f83788t0 |= Integer.MIN_VALUE;
            return TapOnPhonePinPadSdkWrapper.this.requestRandomKeyZ10(null, this);
        }
    }

    /* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
    public static final class q extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Channel<Result<Z10Response>> f83790q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Channel<Result<Z10Response>> channel) {
            super(1);
            this.f83790q0 = channel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            Channel<Result<Z10Response>> channel = this.f83790q0;
            try {
                Z10Response z10Response = (Z10Response) TapOnPhonePinPadSdkWrapper.this.f83743a.fromJson(str2, Z10Response.class);
                if (EglobalUtils.isSuccessStatusCommand$default(EglobalUtils.INSTANCE, z10Response.getStatus(), false, 2, null) && Intrinsics.areEqual(z10Response.getCommand(), CommandConstants.COMMAND_Z10)) {
                    channel.mo5953trySendJP2dKIU(new Result.Success(z10Response, null, 2, null));
                } else {
                    channel.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal("401#" + z10Response.getStatus() + "#" + z10Response.getMessage())));
                }
            } catch (JsonSyntaxException unused) {
                channel.mo5953trySendJP2dKIU(new Result.Failure(Error.Unknown.INSTANCE));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
    public static final class r extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final r f83791p0 = new r(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(String str) {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhonePinPadSdkWrapper", f = "TapOnPhonePinPadSdkWrapper.kt", i = {0, 0}, l = {339}, m = "sendInitialKeyZ11", n = {"this", "responseChannel"}, s = {"L$0", "L$1"})
    public static final class s extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TapOnPhonePinPadSdkWrapper f83792p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Channel f83793q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f83794r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f83796t0;

        public s(Continuation<? super s> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83794r0 = obj;
            this.f83796t0 |= Integer.MIN_VALUE;
            return TapOnPhonePinPadSdkWrapper.this.sendInitialKeyZ11(null, null, this);
        }
    }

    /* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
    public static final class t extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Channel<Result<Z11Response>> f83798q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(Channel<Result<Z11Response>> channel) {
            super(1);
            this.f83798q0 = channel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            Channel<Result<Z11Response>> channel = this.f83798q0;
            try {
                Z11Response z11Response = (Z11Response) TapOnPhonePinPadSdkWrapper.this.f83743a.fromJson(str2, Z11Response.class);
                if (EglobalUtils.isSuccessStatusCommand$default(EglobalUtils.INSTANCE, z11Response.getStatus(), false, 2, null) && Intrinsics.areEqual(z11Response.getCommand(), CommandConstants.COMMAND_Z11)) {
                    channel.mo5953trySendJP2dKIU(new Result.Success(z11Response, null, 2, null));
                } else {
                    channel.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal("401#" + z11Response.getStatus() + "#" + z11Response.getMessage())));
                }
            } catch (JsonSyntaxException unused) {
                channel.mo5953trySendJP2dKIU(new Result.Failure(Error.Unknown.INSTANCE));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
    public static final class u extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final u f83799p0 = new u(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(String str) {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhonePinPadSdkWrapper", f = "TapOnPhonePinPadSdkWrapper.kt", i = {0, 0}, l = {373}, m = "sendInitialKeyZ12", n = {"this", "responseChannel"}, s = {"L$0", "L$1"})
    public static final class v extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TapOnPhonePinPadSdkWrapper f83800p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Channel f83801q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f83802r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f83804t0;

        public v(Continuation<? super v> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83802r0 = obj;
            this.f83804t0 |= Integer.MIN_VALUE;
            return TapOnPhonePinPadSdkWrapper.this.sendInitialKeyZ12(null, this);
        }
    }

    /* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
    public static final class w extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Channel<Result<Z12Response>> f83806q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(Channel<Result<Z12Response>> channel) {
            super(1);
            this.f83806q0 = channel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            Channel<Result<Z12Response>> channel = this.f83806q0;
            try {
                Z12Response z12Response = (Z12Response) TapOnPhonePinPadSdkWrapper.this.f83743a.fromJson(str2, Z12Response.class);
                if (EglobalUtils.isSuccessStatusCommand$default(EglobalUtils.INSTANCE, z12Response.getStatus(), false, 2, null) && Intrinsics.areEqual(z12Response.getCommand(), CommandConstants.COMMAND_Z12)) {
                    channel.mo5953trySendJP2dKIU(new Result.Success(z12Response, null, 2, null));
                } else {
                    channel.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal("401#" + z12Response.getStatus() + "#" + z12Response.getMessage())));
                }
            } catch (JsonSyntaxException unused) {
                channel.mo5953trySendJP2dKIU(new Result.Failure(Error.Unknown.INSTANCE));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
    public static final class x extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final x f83807p0 = new x(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(String str) {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhonePinPadSdkWrapper", f = "TapOnPhonePinPadSdkWrapper.kt", i = {0, 0}, l = {ResultCode.ERROR_REPO_CORRUPT}, m = "validateRSAKeyZ13", n = {"this", "responseChannel"}, s = {"L$0", "L$1"})
    public static final class y extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TapOnPhonePinPadSdkWrapper f83808p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Channel f83809q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f83810r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f83812t0;

        public y(Continuation<? super y> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83810r0 = obj;
            this.f83812t0 |= Integer.MIN_VALUE;
            return TapOnPhonePinPadSdkWrapper.this.validateRSAKeyZ13(null, this);
        }
    }

    /* JADX INFO: compiled from: TapOnPhonePinPadSdkWrapper.kt */
    public static final class z extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Channel<Result<Z13Response>> f83814q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(Channel<Result<Z13Response>> channel) {
            super(1);
            this.f83814q0 = channel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            Channel<Result<Z13Response>> channel = this.f83814q0;
            try {
                Z13Response z13Response = (Z13Response) TapOnPhonePinPadSdkWrapper.this.f83743a.fromJson(str2, Z13Response.class);
                if (EglobalUtils.isSuccessStatusCommand$default(EglobalUtils.INSTANCE, z13Response.getStatus(), false, 2, null) && Intrinsics.areEqual(z13Response.getCommand(), CommandConstants.COMMAND_Z13)) {
                    channel.mo5953trySendJP2dKIU(new Result.Success(z13Response, null, 2, null));
                } else {
                    channel.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal("401#" + z13Response.getStatus() + "#" + z13Response.getMessage())));
                }
            } catch (JsonSyntaxException unused) {
                channel.mo5953trySendJP2dKIU(new Result.Failure(Error.Unknown.INSTANCE));
            }
            return Unit.INSTANCE;
        }
    }

    public TapOnPhonePinPadSdkWrapper(@NotNull Context context, @NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f83743a = gson;
        this.f83744b = TapOnPhoneDependenciesProvider.INSTANCE.providePinPadSdk(context, new ICallbackListeners() { // from class: mx.openpay.library.data.taponphone.TapOnPhonePinPadSdkWrapper$getICallbackListeners$1
            @Override // com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.ICallbackListeners
            public void listenerResponseCommand(@Nullable String responseString) {
                this.f83769a.f83745c.invoke(responseString);
            }

            @Override // com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.ICallbackListeners
            public void listenerStatusMessageFromLectureCard(@Nullable MessageLectureType messageLectureType) {
                this.f83769a.f83746d.invoke(messageLectureType);
            }

            @Override // com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.ICallbackListeners
            public void listenerLogDataReceive(@Nullable short[] p4) {
            }

            @Override // com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.ICallbackListeners
            public void listenerLogDataSend(@Nullable short[] p4) {
            }

            @Override // com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.ICallbackListeners
            public void listenerLogSession(@Nullable String p4) {
            }

            @Override // com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.ICallbackListeners
            public void listenerSendNewCommand(int command) {
            }
        });
        this.f83745c = j.f83773p0;
        this.f83746d = k.f83774p0;
    }

    public final void clearPendingProcess() {
        this.f83744b.executeCommand("72", new String[4], true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getSmartphoneInformationQ8(@NotNull Continuation<? super Result<Q8Response>> continuation) {
        a aVar;
        Channel<? extends Result<Object>> channel;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f83751t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f83751t0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f83749r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f83751t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Channel<? extends Result<Object>> channelProvideResponseChannel = TapOnPhoneDependenciesProvider.INSTANCE.provideResponseChannel(CommandConstants.COMMAND_Q8);
            Intrinsics.checkNotNull(channelProvideResponseChannel, "null cannot be cast to non-null type kotlinx.coroutines.channels.Channel<mx.openpay.library.domain.util.Result<mx.openpay.library.data.bluetooth.eglobal.model.Q8Response>>");
            this.f83745c = new b(channelProvideResponseChannel);
            this.f83744b.executeCommand(CommandConstants.COMMAND_Q8, new String[4], true);
            aVar.f83747p0 = this;
            aVar.f83748q0 = channelProvideResponseChannel;
            aVar.f83751t0 = 1;
            Object objReceive = channelProvideResponseChannel.receive(aVar);
            if (objReceive == coroutine_suspended) {
                return coroutine_suspended;
            }
            channel = channelProvideResponseChannel;
            obj = objReceive;
            tapOnPhonePinPadSdkWrapper = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel = aVar.f83748q0;
            tapOnPhonePinPadSdkWrapper = aVar.f83747p0;
            ResultKt.throwOnFailure(obj);
        }
        Result result = (Result) obj;
        SendChannel.DefaultImpls.close$default(channel, null, 1, null);
        tapOnPhonePinPadSdkWrapper.f83745c = c.f83755p0;
        return result;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object hostResponseC54(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Continuation<? super Result<C54Response>> continuation) {
        d dVar;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper;
        Channel<? extends Result<Object>> channel;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i10 = dVar.f83760t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f83760t0 = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.f83758r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = dVar.f83760t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Channel<? extends Result<Object>> channelProvideResponseChannel = TapOnPhoneDependenciesProvider.INSTANCE.provideResponseChannel(CommandConstants.COMMAND_C54);
            Intrinsics.checkNotNull(channelProvideResponseChannel, "null cannot be cast to non-null type kotlinx.coroutines.channels.Channel<mx.openpay.library.domain.util.Result<mx.openpay.library.data.bluetooth.eglobal.model.C54Response>>");
            this.f83745c = new e(channelProvideResponseChannel);
            this.f83744b.executeCommand(CommandConstants.COMMAND_C54, new String[]{str, str4, str2, str3, CommandConstants.C54_MINIMUM_REQUIRED_OBJECTS}, true);
            dVar.f83756p0 = this;
            dVar.f83757q0 = channelProvideResponseChannel;
            dVar.f83760t0 = 1;
            Object objReceive = channelProvideResponseChannel.receive(dVar);
            if (objReceive == coroutine_suspended) {
                return coroutine_suspended;
            }
            tapOnPhonePinPadSdkWrapper = this;
            obj = objReceive;
            channel = channelProvideResponseChannel;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel = dVar.f83757q0;
            tapOnPhonePinPadSdkWrapper = dVar.f83756p0;
            ResultKt.throwOnFailure(obj);
        }
        Result result = (Result) obj;
        SendChannel.DefaultImpls.close$default(channel, null, 1, null);
        tapOnPhonePinPadSdkWrapper.f83745c = f.f83763p0;
        return result;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object initializeTapOnPhoneI51(boolean z10, @NotNull Continuation<? super Result<I51Response>> continuation) {
        g gVar;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper;
        Channel<? extends Result<Object>> channel;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i10 = gVar.f83768t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f83768t0 = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object obj = gVar.f83766r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = gVar.f83768t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Channel<? extends Result<Object>> channelProvideResponseChannel = TapOnPhoneDependenciesProvider.INSTANCE.provideResponseChannel(CommandConstants.COMMAND_I51);
            Intrinsics.checkNotNull(channelProvideResponseChannel, "null cannot be cast to non-null type kotlinx.coroutines.channels.Channel<mx.openpay.library.domain.util.Result<mx.openpay.library.data.taponphone.model.I51Response>>");
            this.f83745c = new h(channelProvideResponseChannel);
            String[] strArr = new String[1];
            strArr[0] = z10 ? VDPhotoSelfieCapture.LOG_TAG_FALSE : VDPhotoSelfieCapture.LOG_TAG_TRUE;
            this.f83744b.executeCommand(CommandConstants.COMMAND_I51, strArr, true);
            gVar.f83764p0 = this;
            gVar.f83765q0 = channelProvideResponseChannel;
            gVar.f83768t0 = 1;
            Object objReceive = channelProvideResponseChannel.receive(gVar);
            if (objReceive == coroutine_suspended) {
                return coroutine_suspended;
            }
            tapOnPhonePinPadSdkWrapper = this;
            obj = objReceive;
            channel = channelProvideResponseChannel;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel = gVar.f83765q0;
            tapOnPhonePinPadSdkWrapper = gVar.f83764p0;
            ResultKt.throwOnFailure(obj);
        }
        Result result = (Result) obj;
        SendChannel.DefaultImpls.close$default(channel, null, 1, null);
        tapOnPhonePinPadSdkWrapper.f83745c = i.f83772p0;
        return result;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object readCardInfoC51(@NotNull String str, boolean z10, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Function1<? super MessageLectureType, Unit> function1, @NotNull Continuation<? super Result<C51Response>> continuation) {
        l lVar;
        Channel<? extends Result<Object>> channel;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i10 = lVar.f83779t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f83779t0 = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new l(continuation);
            }
        } else {
            lVar = new l(continuation);
        }
        Object obj = lVar.f83777r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = lVar.f83779t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Channel<? extends Result<Object>> channelProvideResponseChannel = TapOnPhoneDependenciesProvider.INSTANCE.provideResponseChannel(CommandConstants.COMMAND_C51);
            Intrinsics.checkNotNull(channelProvideResponseChannel, "null cannot be cast to non-null type kotlinx.coroutines.channels.Channel<mx.openpay.library.domain.util.Result<mx.openpay.library.data.bluetooth.eglobal.model.C51Response>>");
            this.f83745c = new m(channelProvideResponseChannel);
            this.f83746d = function1;
            this.f83744b.executeCommand(CommandConstants.COMMAND_C51, new String[]{"30", str, "484", CommandConstants.C51_TLV_LIST, CommandConstants.C51_KEY_NAME1, str2, EglobalUtils.INSTANCE.getTxnType(z10, str3), str4, ""}, true);
            lVar.f83775p0 = this;
            lVar.f83776q0 = channelProvideResponseChannel;
            lVar.f83779t0 = 1;
            Object objReceive = channelProvideResponseChannel.receive(lVar);
            if (objReceive == coroutine_suspended) {
                return coroutine_suspended;
            }
            channel = channelProvideResponseChannel;
            obj = objReceive;
            tapOnPhonePinPadSdkWrapper = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel = lVar.f83776q0;
            tapOnPhonePinPadSdkWrapper = lVar.f83775p0;
            ResultKt.throwOnFailure(obj);
        }
        Result result = (Result) obj;
        SendChannel.DefaultImpls.close$default(channel, null, 1, null);
        tapOnPhonePinPadSdkWrapper.f83745c = n.f83782p0;
        tapOnPhonePinPadSdkWrapper.f83746d = o.f83783p0;
        return result;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object requestRandomKeyZ10(@NotNull String str, @NotNull Continuation<? super Result<Z10Response>> continuation) {
        p pVar;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper;
        Channel<? extends Result<Object>> channel;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i10 = pVar.f83788t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pVar.f83788t0 = i10 - Integer.MIN_VALUE;
            } else {
                pVar = new p(continuation);
            }
        } else {
            pVar = new p(continuation);
        }
        Object obj = pVar.f83786r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = pVar.f83788t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Channel<? extends Result<Object>> channelProvideResponseChannel = TapOnPhoneDependenciesProvider.INSTANCE.provideResponseChannel(CommandConstants.COMMAND_Z10);
            Intrinsics.checkNotNull(channelProvideResponseChannel, "null cannot be cast to non-null type kotlinx.coroutines.channels.Channel<mx.openpay.library.domain.util.Result<mx.openpay.library.data.bluetooth.eglobal.model.Z10Response>>");
            this.f83745c = new q(channelProvideResponseChannel);
            String upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            this.f83744b.executeCommand(CommandConstants.COMMAND_Z10, new String[]{upperCase}, true);
            pVar.f83784p0 = this;
            pVar.f83785q0 = channelProvideResponseChannel;
            pVar.f83788t0 = 1;
            Object objReceive = channelProvideResponseChannel.receive(pVar);
            if (objReceive == coroutine_suspended) {
                return coroutine_suspended;
            }
            tapOnPhonePinPadSdkWrapper = this;
            obj = objReceive;
            channel = channelProvideResponseChannel;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel = pVar.f83785q0;
            tapOnPhonePinPadSdkWrapper = pVar.f83784p0;
            ResultKt.throwOnFailure(obj);
        }
        Result result = (Result) obj;
        SendChannel.DefaultImpls.close$default(channel, null, 1, null);
        tapOnPhonePinPadSdkWrapper.f83745c = r.f83791p0;
        return result;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object sendInitialKeyZ11(@NotNull TerminalKeysResponse terminalKeysResponse, @NotNull String str, @NotNull Continuation<? super Result<Z11Response>> continuation) {
        s sVar;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper;
        Channel<? extends Result<Object>> channel;
        if (continuation instanceof s) {
            sVar = (s) continuation;
            int i10 = sVar.f83796t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sVar.f83796t0 = i10 - Integer.MIN_VALUE;
            } else {
                sVar = new s(continuation);
            }
        } else {
            sVar = new s(continuation);
        }
        Object obj = sVar.f83794r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = sVar.f83796t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Channel<? extends Result<Object>> channelProvideResponseChannel = TapOnPhoneDependenciesProvider.INSTANCE.provideResponseChannel(CommandConstants.COMMAND_Z11);
            Intrinsics.checkNotNull(channelProvideResponseChannel, "null cannot be cast to non-null type kotlinx.coroutines.channels.Channel<mx.openpay.library.domain.util.Result<mx.openpay.library.data.bluetooth.eglobal.model.Z11Response>>");
            this.f83745c = new t(channelProvideResponseChannel);
            String newKey = terminalKeysResponse.getNewKey();
            String ksn = terminalKeysResponse.getKsn();
            String checkValue = terminalKeysResponse.getCheckValue();
            String crc32 = terminalKeysResponse.getCrc32();
            StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("! EX00068 ", newKey, ksn, checkValue, "00");
            sbC.append(crc32);
            String string = sbC.toString();
            Locale locale = Locale.ROOT;
            String upperCase = str.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String upperCase2 = string.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            this.f83744b.executeCommand(CommandConstants.COMMAND_Z11, new String[]{upperCase, upperCase2}, true);
            sVar.f83792p0 = this;
            sVar.f83793q0 = channelProvideResponseChannel;
            sVar.f83796t0 = 1;
            Object objReceive = channelProvideResponseChannel.receive(sVar);
            if (objReceive == coroutine_suspended) {
                return coroutine_suspended;
            }
            tapOnPhonePinPadSdkWrapper = this;
            obj = objReceive;
            channel = channelProvideResponseChannel;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel = sVar.f83793q0;
            tapOnPhonePinPadSdkWrapper = sVar.f83792p0;
            ResultKt.throwOnFailure(obj);
        }
        Result result = (Result) obj;
        SendChannel.DefaultImpls.close$default(channel, null, 1, null);
        tapOnPhonePinPadSdkWrapper.f83745c = u.f83799p0;
        return result;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object sendInitialKeyZ12(@NotNull String str, @NotNull Continuation<? super Result<Z12Response>> continuation) {
        v vVar;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper;
        Channel<? extends Result<Object>> channel;
        if (continuation instanceof v) {
            vVar = (v) continuation;
            int i10 = vVar.f83804t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vVar.f83804t0 = i10 - Integer.MIN_VALUE;
            } else {
                vVar = new v(continuation);
            }
        } else {
            vVar = new v(continuation);
        }
        Object obj = vVar.f83802r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = vVar.f83804t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Channel<? extends Result<Object>> channelProvideResponseChannel = TapOnPhoneDependenciesProvider.INSTANCE.provideResponseChannel(CommandConstants.COMMAND_Z12);
            Intrinsics.checkNotNull(channelProvideResponseChannel, "null cannot be cast to non-null type kotlinx.coroutines.channels.Channel<mx.openpay.library.domain.util.Result<mx.openpay.library.data.bluetooth.eglobal.model.Z12Response>>");
            this.f83745c = new w(channelProvideResponseChannel);
            Locale locale = Locale.ROOT;
            String upperCase = CommandConstants.Z12_KEY.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String upperCase2 = CommandConstants.Z12_DID.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String upperCase3 = CommandConstants.Z12_KIK.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            this.f83744b.executeCommand(CommandConstants.COMMAND_Z12, new String[]{str, upperCase, upperCase2, upperCase3}, true);
            vVar.f83800p0 = this;
            vVar.f83801q0 = channelProvideResponseChannel;
            vVar.f83804t0 = 1;
            Object objReceive = channelProvideResponseChannel.receive(vVar);
            if (objReceive == coroutine_suspended) {
                return coroutine_suspended;
            }
            tapOnPhonePinPadSdkWrapper = this;
            obj = objReceive;
            channel = channelProvideResponseChannel;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel = vVar.f83801q0;
            tapOnPhonePinPadSdkWrapper = vVar.f83800p0;
            ResultKt.throwOnFailure(obj);
        }
        Result result = (Result) obj;
        SendChannel.DefaultImpls.close$default(channel, null, 1, null);
        tapOnPhonePinPadSdkWrapper.f83745c = x.f83807p0;
        return result;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object validateRSAKeyZ13(@NotNull String str, @NotNull Continuation<? super Result<Z13Response>> continuation) {
        y yVar;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper;
        Channel<? extends Result<Object>> channel;
        if (continuation instanceof y) {
            yVar = (y) continuation;
            int i10 = yVar.f83812t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                yVar.f83812t0 = i10 - Integer.MIN_VALUE;
            } else {
                yVar = new y(continuation);
            }
        } else {
            yVar = new y(continuation);
        }
        Object obj = yVar.f83810r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = yVar.f83812t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Channel<? extends Result<Object>> channelProvideResponseChannel = TapOnPhoneDependenciesProvider.INSTANCE.provideResponseChannel(CommandConstants.COMMAND_Z13);
            Intrinsics.checkNotNull(channelProvideResponseChannel, "null cannot be cast to non-null type kotlinx.coroutines.channels.Channel<mx.openpay.library.domain.util.Result<mx.openpay.library.data.bluetooth.eglobal.model.Z13Response>>");
            this.f83745c = new z(channelProvideResponseChannel);
            this.f83744b.executeCommand(CommandConstants.COMMAND_Z13, new String[]{str}, true);
            yVar.f83808p0 = this;
            yVar.f83809q0 = channelProvideResponseChannel;
            yVar.f83812t0 = 1;
            Object objReceive = channelProvideResponseChannel.receive(yVar);
            if (objReceive == coroutine_suspended) {
                return coroutine_suspended;
            }
            tapOnPhonePinPadSdkWrapper = this;
            obj = objReceive;
            channel = channelProvideResponseChannel;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel = yVar.f83809q0;
            tapOnPhonePinPadSdkWrapper = yVar.f83808p0;
            ResultKt.throwOnFailure(obj);
        }
        Result result = (Result) obj;
        SendChannel.DefaultImpls.close$default(channel, null, 1, null);
        tapOnPhonePinPadSdkWrapper.f83745c = a0.f83752p0;
        return result;
    }
}
