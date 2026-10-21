package mx.openpay.library.data.bluetooth.eglobal;

import androidx.camera.core.processing.f;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.esotericsoftware.asm.Opcodes;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.vierge.bluetoothlibrary.BluetoothListener;
import com.vierge.bluetoothlibrary.MyBluetoothService;
import com.vierge.bluetoothlibrary.MyHandler;
import com.vierge.pinpadsdk.ICallbackListeners;
import com.vierge.pinpadsdk.PinPadSdk;
import com.vierge.pinpadsdk.q7Protocol.IQ7ProtocolSend;
import com.vierge.pinpadsdk.script.ScriptProtocolInterface;
import com.vierge.pinpadsdk.utils.Utils;
import ek.a;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;
import mx.openpay.library.data.bluetooth.eglobal.model.C51Response;
import mx.openpay.library.data.bluetooth.eglobal.model.C54Response;
import mx.openpay.library.data.bluetooth.eglobal.model.DeviceStatusChange;
import mx.openpay.library.data.bluetooth.eglobal.model.InjectScriptsResponse;
import mx.openpay.library.data.bluetooth.eglobal.model.Q7Response;
import mx.openpay.library.data.bluetooth.eglobal.model.Q8Response;
import mx.openpay.library.data.bluetooth.eglobal.model.Z10Response;
import mx.openpay.library.data.bluetooth.eglobal.model.Z11Response;
import mx.openpay.library.data.bluetooth.eglobal.model.Z12Response;
import mx.openpay.library.data.bluetooth.eglobal.model.Z13Response;
import mx.openpay.library.data.bluetooth.eglobal.model.Z14Response;
import mx.openpay.library.data.bluetooth.eglobal.model.Z2Response;
import mx.openpay.library.data.util.CommandConstants;
import mx.openpay.library.data.util.EglobalUtils;
import mx.openpay.library.domain.model.Error;
import mx.openpay.library.domain.model.eglobal.RSAKey;
import mx.openpay.library.domain.model.eglobal.TerminalKeysResponse;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PinPadSdkWrapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0001NB%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J7\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000f2\u0006\u0010 \u001a\u00020!H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\"J%\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u000f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120&H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010'J-\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020*2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010&2\u0006\u0010,\u001a\u00020\u0010H\u0002¢\u0006\u0002\u0010-JG\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u000f2\u0006\u00100\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00122\u0006\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0002\u00106J\u001f\u00107\u001a\b\u0012\u0004\u0012\u0002080\u000f2\u0006\u00103\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u001f\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u000f2\u0006\u0010;\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J'\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u000f2\u0006\u0010>\u001a\u00020?2\u0006\u00103\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010@J\u001f\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u000f2\u0006\u00102\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u001f\u0010C\u001a\b\u0012\u0004\u0012\u00020D0\u000f2\u0006\u0010E\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u001f\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u000f2\u0006\u0010H\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0012\u0010I\u001a\u00020\r2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\u0010\u0010L\u001a\u00020\r2\u0006\u0010M\u001a\u00020KH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006O"}, d2 = {"Lmx/openpay/library/data/bluetooth/eglobal/PinPadSdkWrapper;", "Lcom/vierge/pinpadsdk/script/ScriptProtocolInterface;", "Lcom/vierge/pinpadsdk/q7Protocol/IQ7ProtocolSend;", "pinPadSdk", "Lcom/vierge/pinpadsdk/PinPadSdk;", "bluetoothService", "Lcom/vierge/bluetoothlibrary/MyBluetoothService;", "bluetoothHandler", "Lcom/vierge/bluetoothlibrary/MyHandler;", "gson", "Lcom/google/gson/Gson;", "(Lcom/vierge/pinpadsdk/PinPadSdk;Lcom/vierge/bluetoothlibrary/MyBluetoothService;Lcom/vierge/bluetoothlibrary/MyHandler;Lcom/google/gson/Gson;)V", "clearPendingProcess", "", "connect", "Lmx/openpay/library/domain/util/Result;", "", "address", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTerminalInformation", "Lmx/openpay/library/data/bluetooth/eglobal/model/Q8Response;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hostResponseC54", "Lmx/openpay/library/data/bluetooth/eglobal/model/C54Response;", "hostStatus", "responseCode", "issuerAuthData", "authorization", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "injectRSAKeyZ14", "Lmx/openpay/library/data/bluetooth/eglobal/model/Z14Response;", "key", "Lmx/openpay/library/domain/model/eglobal/RSAKey;", "(Lmx/openpay/library/domain/model/eglobal/RSAKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "injectScripts", "Lmx/openpay/library/data/bluetooth/eglobal/model/InjectScriptsResponse;", "params", "", "([Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processCommand", "id", "", "param", "nuevo", "(I[Ljava/lang/String;Z)V", "readCardInfoC51", "Lmx/openpay/library/data/bluetooth/eglobal/model/C51Response;", PushConstants.AMOUNT, "isCharge", "slotKey", "slotKeyName", "merchantId", "orderId", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestRandomKeyZ10", "Lmx/openpay/library/data/bluetooth/eglobal/model/Z10Response;", "sendFile", "Lmx/openpay/library/data/bluetooth/eglobal/model/Q7Response;", "path", "sendInitialKeyZ11", "Lmx/openpay/library/data/bluetooth/eglobal/model/Z11Response;", "terminalKeysResponse", "Lmx/openpay/library/domain/model/eglobal/TerminalKeysResponse;", "(Lmx/openpay/library/domain/model/eglobal/TerminalKeysResponse;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendInitialKeyZ12", "Lmx/openpay/library/data/bluetooth/eglobal/model/Z12Response;", "setTerminalWelcomeText", "Lmx/openpay/library/data/bluetooth/eglobal/model/Z2Response;", "text", "validateRSAKeyZ13", "Lmx/openpay/library/data/bluetooth/eglobal/model/Z13Response;", "rsaKeyName", "write", "message", "", "writeDataToDevice", "bytes", "Companion", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPinPadSdkWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PinPadSdkWrapper.kt\nmx/openpay/library/data/bluetooth/eglobal/PinPadSdkWrapper\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,875:1\n26#2:876\n1#3:877\n*S KotlinDebug\n*F\n+ 1 PinPadSdkWrapper.kt\nmx/openpay/library/data/bluetooth/eglobal/PinPadSdkWrapper\n*L\n475#1:876\n*E\n"})
public final class PinPadSdkWrapper implements ScriptProtocolInterface, IQ7ProtocolSend {
    private static final int MAX_PACKAGE_SIZE = 512;

    @NotNull
    private final MyHandler bluetoothHandler;

    @NotNull
    private final MyBluetoothService bluetoothService;

    @NotNull
    private final Gson gson;

    @NotNull
    private final PinPadSdk pinPadSdk;

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper$connect$1, reason: invalid class name */
    /* JADX INFO: compiled from: PinPadSdkWrapper.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper", f = "PinPadSdkWrapper.kt", i = {0}, l = {140}, m = "connect", n = {"responseChannel"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PinPadSdkWrapper.this.connect(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper$getTerminalInformation$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PinPadSdkWrapper.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper", f = "PinPadSdkWrapper.kt", i = {0}, l = {Opcodes.IFNONNULL}, m = "getTerminalInformation", n = {"responseChannel"}, s = {"L$0"})
    public static final class C07341 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07341(Continuation<? super C07341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PinPadSdkWrapper.this.getTerminalInformation(this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper$hostResponseC54$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PinPadSdkWrapper.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper", f = "PinPadSdkWrapper.kt", i = {0}, l = {653}, m = "hostResponseC54", n = {"responseChannel"}, s = {"L$0"})
    public static final class C07361 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07361(Continuation<? super C07361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PinPadSdkWrapper.this.hostResponseC54(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper$injectRSAKeyZ14$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PinPadSdkWrapper.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper", f = "PinPadSdkWrapper.kt", i = {0}, l = {528}, m = "injectRSAKeyZ14", n = {"responseChannel"}, s = {"L$0"})
    public static final class C07381 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07381(Continuation<? super C07381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PinPadSdkWrapper.this.injectRSAKeyZ14(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper$injectScripts$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PinPadSdkWrapper.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper", f = "PinPadSdkWrapper.kt", i = {0}, l = {ResultCode.ERROR_STRENGTH_SUITENOWHITE}, m = "injectScripts", n = {"responseChannel"}, s = {"L$0"})
    public static final class C07401 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07401(Continuation<? super C07401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PinPadSdkWrapper.this.injectScripts(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper$readCardInfoC51$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PinPadSdkWrapper.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper", f = "PinPadSdkWrapper.kt", i = {0}, l = {597}, m = "readCardInfoC51", n = {"responseChannel"}, s = {"L$0"})
    public static final class C07421 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07421(Continuation<? super C07421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PinPadSdkWrapper.this.readCardInfoC51(null, false, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper$requestRandomKeyZ10$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PinPadSdkWrapper.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper", f = "PinPadSdkWrapper.kt", i = {0}, l = {299}, m = "requestRandomKeyZ10", n = {"responseChannel"}, s = {"L$0"})
    public static final class C07441 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07441(Continuation<? super C07441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PinPadSdkWrapper.this.requestRandomKeyZ10(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper$sendFile$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PinPadSdkWrapper.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper", f = "PinPadSdkWrapper.kt", i = {0}, l = {754}, m = "sendFile", n = {"responseChannel"}, s = {"L$0"})
    public static final class C07461 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07461(Continuation<? super C07461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PinPadSdkWrapper.this.sendFile(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper$sendInitialKeyZ11$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PinPadSdkWrapper.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper", f = "PinPadSdkWrapper.kt", i = {0}, l = {358}, m = "sendInitialKeyZ11", n = {"responseChannel"}, s = {"L$0"})
    public static final class C07481 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07481(Continuation<? super C07481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PinPadSdkWrapper.this.sendInitialKeyZ11(null, null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper$sendInitialKeyZ12$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PinPadSdkWrapper.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper", f = "PinPadSdkWrapper.kt", i = {0}, l = {414}, m = "sendInitialKeyZ12", n = {"responseChannel"}, s = {"L$0"})
    public static final class C07501 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07501(Continuation<? super C07501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PinPadSdkWrapper.this.sendInitialKeyZ12(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper$setTerminalWelcomeText$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PinPadSdkWrapper.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper", f = "PinPadSdkWrapper.kt", i = {0}, l = {249}, m = "setTerminalWelcomeText", n = {"responseChannel"}, s = {"L$0"})
    public static final class C07521 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07521(Continuation<? super C07521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PinPadSdkWrapper.this.setTerminalWelcomeText(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper$validateRSAKeyZ13$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PinPadSdkWrapper.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper", f = "PinPadSdkWrapper.kt", i = {0}, l = {465}, m = "validateRSAKeyZ13", n = {"responseChannel"}, s = {"L$0"})
    public static final class C07541 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07541(Continuation<? super C07541> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PinPadSdkWrapper.this.validateRSAKeyZ13(null, this);
        }
    }

    public PinPadSdkWrapper(@NotNull PinPadSdk pinPadSdk, @NotNull MyBluetoothService bluetoothService, @NotNull MyHandler bluetoothHandler, @NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(pinPadSdk, "pinPadSdk");
        Intrinsics.checkNotNullParameter(bluetoothService, "bluetoothService");
        Intrinsics.checkNotNullParameter(bluetoothHandler, "bluetoothHandler");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.pinPadSdk = pinPadSdk;
        this.bluetoothService = bluetoothService;
        this.bluetoothHandler = bluetoothHandler;
        this.gson = gson;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processCommand(int id, String[] param, boolean nuevo) {
        byte[] bArrExecuteCommand;
        if (id == Utils.COMMAND_SCRIPT) {
            if (param != null) {
                this.pinPadSdk.runScripts(this, param[0], param[1]);
                return;
            }
            return;
        }
        if (id == Utils.COMMAND_SENDFILE) {
            if (param != null) {
                this.pinPadSdk.runSendFile(this, param[0]);
                return;
            }
            return;
        }
        if (id == Utils.COMMAND_STRING_Q8) {
            bArrExecuteCommand = this.pinPadSdk.executeCommand(CommandConstants.COMMAND_Q8, param, nuevo);
        } else if (id == Utils.COMMAND_STRING_Z2) {
            bArrExecuteCommand = this.pinPadSdk.executeCommand(CommandConstants.COMMAND_Z2, param, nuevo);
        } else if (id == Utils.COMMAND_STRING_72) {
            bArrExecuteCommand = this.pinPadSdk.executeCommand("72", param, nuevo);
        } else if (id == Utils.COMMAND_STRING_ACK) {
            bArrExecuteCommand = this.pinPadSdk.executeCommand(CommandConstants.COMMAND_ACK, param, nuevo);
        } else if (id == Utils.COMMAND_STRING_Z10) {
            bArrExecuteCommand = this.pinPadSdk.executeCommand(CommandConstants.COMMAND_Z10, param, nuevo);
        } else if (id == Utils.COMMAND_STRING_Z11) {
            bArrExecuteCommand = this.pinPadSdk.executeCommand(CommandConstants.COMMAND_Z11, param, nuevo);
        } else if (id == Utils.COMMAND_STRING_Z12) {
            bArrExecuteCommand = this.pinPadSdk.executeCommand(CommandConstants.COMMAND_Z12, param, nuevo);
        } else if (id == Utils.COMMAND_STRING_Z13) {
            bArrExecuteCommand = this.pinPadSdk.executeCommand(CommandConstants.COMMAND_Z13, param, nuevo);
        } else if (id == Utils.COMMAND_STRING_Z14) {
            bArrExecuteCommand = this.pinPadSdk.executeCommand(CommandConstants.COMMAND_Z14, param, nuevo);
        } else if (id == Utils.COMMAND_STRING_C51) {
            bArrExecuteCommand = this.pinPadSdk.executeCommand(CommandConstants.COMMAND_C51, param, nuevo);
        } else {
            bArrExecuteCommand = id == Utils.COMMAND_STRING_C54 ? this.pinPadSdk.executeCommand(CommandConstants.COMMAND_C54, param, nuevo) : null;
        }
        if (bArrExecuteCommand != null) {
            writeDataToDevice(bArrExecuteCommand);
        }
    }

    private final void writeDataToDevice(byte[] bytes) {
        boolean z10 = true;
        while (z10) {
            try {
                if (bytes.length > 512) {
                    writeDataToDevice(ArraysKt___ArraysJvmKt.copyOfRange(bytes, 0, 512));
                    Thread.sleep(200L);
                    bytes = ArraysKt___ArraysJvmKt.copyOfRange(bytes, 512, bytes.length);
                } else {
                    this.bluetoothService.write(bytes);
                    z10 = false;
                }
            } catch (InterruptedException e5) {
                e5.printStackTrace();
                return;
            }
        }
    }

    public final void clearPendingProcess() {
        processCommand(Utils.COMMAND_STRING_72, null, true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object connect(@NotNull String str, @NotNull Continuation<? super Result<Boolean>> continuation) {
        AnonymousClass1 anonymousClass1;
        Channel channel;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            final Channel channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
            this.bluetoothHandler.setBluetoothListener(new BluetoothListener() { // from class: mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper.connect.2
                @Override // com.vierge.bluetoothlibrary.BluetoothListener
                public void onError(@Nullable String error) {
                    if (error == null) {
                        channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal(null, 1, null)));
                        return;
                    }
                    PinPadSdkWrapper pinPadSdkWrapper = PinPadSdkWrapper.this;
                    Channel<Result<Boolean>> channel2 = channelChannel$default;
                    String status = ((DeviceStatusChange) pinPadSdkWrapper.gson.fromJson(error, DeviceStatusChange.class)).getStatus();
                    if (Intrinsics.areEqual(status, "01") || Intrinsics.areEqual(status, "02")) {
                        channel2.mo5953trySendJP2dKIU(new Result.Failure(new Error.DeviceNotFound(null, 1, null)));
                    } else {
                        channel2.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal(null, 1, null)));
                    }
                }

                @Override // com.vierge.bluetoothlibrary.BluetoothListener
                public void onReadMessage(@Nullable String p4) {
                }

                @Override // com.vierge.bluetoothlibrary.BluetoothListener
                @Deprecated(message = "Deprecated in Java")
                public void onStateChanged(int p4) {
                }

                @Override // com.vierge.bluetoothlibrary.BluetoothListener
                public void onWriteMessage(@Nullable String p4) {
                }

                @Override // com.vierge.bluetoothlibrary.BluetoothListener
                public void onReadMessage(@Nullable byte[] incomingBytes) {
                    if (incomingBytes != null) {
                        PinPadSdkWrapper.this.pinPadSdk.listenerSerialResponse(Utils.arrayByteToArrayShort(incomingBytes));
                    }
                }

                @Override // com.vierge.bluetoothlibrary.BluetoothListener
                public void onStateChanged(@Nullable String newState) {
                    if (newState == null) {
                        channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal(null, 1, null)));
                        return;
                    }
                    DeviceStatusChange deviceStatusChange = (DeviceStatusChange) PinPadSdkWrapper.this.gson.fromJson(newState, DeviceStatusChange.class);
                    if (deviceStatusChange != null) {
                        Channel<Result<Boolean>> channel2 = channelChannel$default;
                        ChannelResult.m5963boximpl(Intrinsics.areEqual(deviceStatusChange.getStatus(), "30") ? channel2.mo5953trySendJP2dKIU(new Result.Success(Boolean.TRUE, null, 2, null)) : channel2.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal(null, 1, null))));
                    }
                }

                @Override // com.vierge.bluetoothlibrary.BluetoothListener
                public void onWriteMessage(@Nullable byte[] message) {
                }

                @Override // com.vierge.bluetoothlibrary.BluetoothListener
                @Deprecated(message = "Deprecated in Java")
                public void onDeviceName(@Nullable String p4) {
                }

                @Override // com.vierge.bluetoothlibrary.BluetoothListener
                @Deprecated(message = "Deprecated in Java")
                public void onToast(@Nullable String p4) {
                }

                @Override // com.vierge.bluetoothlibrary.BluetoothListener
                @Deprecated(message = "Deprecated in Java")
                public void onNewDeviceFound(@Nullable String p4, @Nullable String p10) {
                }
            });
            this.bluetoothService.connect(str);
            anonymousClass1.L$0 = channelChannel$default;
            anonymousClass1.label = 1;
            Object objReceive = channelChannel$default.receive(anonymousClass1);
            if (objReceive == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objReceive;
            channel = channelChannel$default;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel = (Channel) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Result result = (Result) obj;
        SendChannel.DefaultImpls.close$default(channel, null, 1, null);
        return result;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getTerminalInformation(@NotNull Continuation<? super Result<Q8Response>> continuation) {
        C07341 c07341;
        Channel channel;
        if (continuation instanceof C07341) {
            c07341 = (C07341) continuation;
            int i10 = c07341.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07341.label = i10 - Integer.MIN_VALUE;
            } else {
                c07341 = new C07341(continuation);
            }
        } else {
            c07341 = new C07341(continuation);
        }
        Object obj = c07341.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07341.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            final Channel channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
            processCommand(Utils.COMMAND_STRING_Q8, null, true);
            this.pinPadSdk.setLogListener(new ICallbackListeners() { // from class: mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper.getTerminalInformation.2
                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerError(@Nullable String responseString) {
                    channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal(((Q8Response) PinPadSdkWrapper.this.gson.fromJson(responseString, Q8Response.class)).getStatus())));
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerResponseCommand(@Nullable String responseString) {
                    PinPadSdkWrapper.this.processCommand(Utils.COMMAND_STRING_72, null, true);
                    try {
                        Q8Response q8Response = (Q8Response) PinPadSdkWrapper.this.gson.fromJson(responseString, Q8Response.class);
                        if (EglobalUtils.isSuccessStatusCommand$default(EglobalUtils.INSTANCE, q8Response.getStatus(), false, 2, null) && Intrinsics.areEqual(q8Response.getCommand(), CommandConstants.COMMAND_Q8)) {
                            channelChannel$default.mo5953trySendJP2dKIU(new Result.Success(q8Response, null, 2, null));
                        } else {
                            channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal("401#" + q8Response.getStatus() + "#" + q8Response.getMessage())));
                        }
                    } catch (JsonSyntaxException unused) {
                        channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(Error.Unknown.INSTANCE));
                    }
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerSendNewCommand(int command) {
                    PinPadSdkWrapper.this.processCommand(command, null, false);
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogDataReceive(@Nullable short[] p4) {
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogDataSend(@Nullable short[] p4) {
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogSession(@Nullable String p4) {
                }
            });
            c07341.L$0 = channelChannel$default;
            c07341.label = 1;
            Object objReceive = channelChannel$default.receive(c07341);
            if (objReceive == coroutine_suspended) {
                return coroutine_suspended;
            }
            channel = channelChannel$default;
            obj = objReceive;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel = (Channel) c07341.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Result result = (Result) obj;
        SendChannel.DefaultImpls.close$default(channel, null, 1, null);
        return result;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object hostResponseC54(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Continuation<? super Result<C54Response>> continuation) {
        C07361 c07361;
        Channel channel;
        if (continuation instanceof C07361) {
            c07361 = (C07361) continuation;
            int i10 = c07361.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07361.label = i10 - Integer.MIN_VALUE;
            } else {
                c07361 = new C07361(continuation);
            }
        } else {
            c07361 = new C07361(continuation);
        }
        Object obj = c07361.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07361.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            final Channel channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
            processCommand(Utils.COMMAND_STRING_C54, new String[]{str, str4, str2, str3, CommandConstants.C54_MINIMUM_REQUIRED_OBJECTS}, true);
            this.pinPadSdk.setLogListener(new ICallbackListeners() { // from class: mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper.hostResponseC54.2
                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerError(@Nullable String responseString) {
                    channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal(((C54Response) PinPadSdkWrapper.this.gson.fromJson(responseString, C54Response.class)).getStatus())));
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerResponseCommand(@Nullable String responseString) {
                    try {
                        C54Response c54Response = (C54Response) PinPadSdkWrapper.this.gson.fromJson(responseString, C54Response.class);
                        if (EglobalUtils.isSuccessStatusCommand$default(EglobalUtils.INSTANCE, c54Response.getStatus(), false, 2, null) && Intrinsics.areEqual(c54Response.getCommand(), CommandConstants.COMMAND_C54)) {
                            channelChannel$default.mo5953trySendJP2dKIU(new Result.Success(c54Response, null, 2, null));
                        } else {
                            channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal("401#" + c54Response.getStatus() + "#" + c54Response.getMessage())));
                        }
                    } catch (JsonSyntaxException unused) {
                        channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(Error.Unknown.INSTANCE));
                    }
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerSendNewCommand(int command) {
                    PinPadSdkWrapper.this.processCommand(command, null, false);
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogDataReceive(@Nullable short[] p4) {
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogDataSend(@Nullable short[] p4) {
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogSession(@Nullable String p4) {
                }
            });
            c07361.L$0 = channelChannel$default;
            c07361.label = 1;
            Object objReceive = channelChannel$default.receive(c07361);
            if (objReceive == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objReceive;
            channel = channelChannel$default;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel = (Channel) c07361.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Result result = (Result) obj;
        SendChannel.DefaultImpls.close$default(channel, null, 1, null);
        return result;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object injectRSAKeyZ14(@NotNull RSAKey rSAKey, @NotNull Continuation<? super Result<Z14Response>> continuation) {
        C07381 c07381;
        String[] strArr;
        Channel channel;
        if (continuation instanceof C07381) {
            c07381 = (C07381) continuation;
            int i10 = c07381.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07381.label = i10 - Integer.MIN_VALUE;
            } else {
                c07381 = new C07381(continuation);
            }
        } else {
            c07381 = new C07381(continuation);
        }
        Object obj = c07381.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07381.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            final Channel channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
            String keyName = rSAKey.getKeyName();
            Locale locale = Locale.ROOT;
            String upperCase = keyName.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String upperCase2 = rSAKey.getRsa().toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            if (rSAKey.getSlotKey() == 1 || rSAKey.getSlotKey() == 4) {
                strArr = new String[]{upperCase, upperCase2};
            } else {
                String upperCase3 = String.valueOf(rSAKey.getSlotKey()).toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                String strD = f.d("0", upperCase3);
                String upperCase4 = CommandConstants.Z14_EXPONENT.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase4, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                String upperCase5 = "10".toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase5, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                String upperCase6 = "01".toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase6, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                strArr = new String[]{upperCase, upperCase2, upperCase4, strD, upperCase5, upperCase6};
            }
            processCommand(Utils.COMMAND_STRING_Z14, strArr, true);
            this.pinPadSdk.setLogListener(new ICallbackListeners() { // from class: mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper.injectRSAKeyZ14.2
                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerError(@Nullable String responseString) {
                    channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal(((Z14Response) PinPadSdkWrapper.this.gson.fromJson(responseString, Z14Response.class)).getStatus())));
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerResponseCommand(@Nullable String responseString) {
                    try {
                        Z14Response z14Response = (Z14Response) PinPadSdkWrapper.this.gson.fromJson(responseString, Z14Response.class);
                        if (EglobalUtils.isSuccessStatusCommand$default(EglobalUtils.INSTANCE, z14Response.getStatus(), false, 2, null) && Intrinsics.areEqual(z14Response.getCommand(), CommandConstants.COMMAND_Z14)) {
                            channelChannel$default.mo5953trySendJP2dKIU(new Result.Success(z14Response, null, 2, null));
                        } else {
                            channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal("401#" + z14Response.getStatus() + "#" + z14Response.getMessage())));
                        }
                    } catch (JsonSyntaxException unused) {
                        channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(Error.Unknown.INSTANCE));
                    }
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerSendNewCommand(int command) {
                    PinPadSdkWrapper.this.processCommand(command, null, false);
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogDataReceive(@Nullable short[] p4) {
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogDataSend(@Nullable short[] p4) {
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogSession(@Nullable String p4) {
                }
            });
            c07381.L$0 = channelChannel$default;
            c07381.label = 1;
            Object objReceive = channelChannel$default.receive(c07381);
            if (objReceive == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objReceive;
            channel = channelChannel$default;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel = (Channel) c07381.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Result result = (Result) obj;
        SendChannel.DefaultImpls.close$default(channel, null, 1, null);
        return result;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object injectScripts(@NotNull String[] strArr, @NotNull Continuation<? super Result<InjectScriptsResponse>> continuation) {
        C07401 c07401;
        Channel channel;
        if (continuation instanceof C07401) {
            c07401 = (C07401) continuation;
            int i10 = c07401.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07401.label = i10 - Integer.MIN_VALUE;
            } else {
                c07401 = new C07401(continuation);
            }
        } else {
            c07401 = new C07401(continuation);
        }
        Object obj = c07401.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07401.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            final Channel channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
            processCommand(Utils.COMMAND_SCRIPT, strArr, true);
            this.pinPadSdk.setLogListener(new ICallbackListeners() { // from class: mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper.injectScripts.2
                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerError(@Nullable String responseString) {
                    channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal(((InjectScriptsResponse) PinPadSdkWrapper.this.gson.fromJson(responseString, InjectScriptsResponse.class)).getStatus())));
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerResponseCommand(@Nullable String responseString) {
                    try {
                        InjectScriptsResponse injectScriptsResponse = (InjectScriptsResponse) PinPadSdkWrapper.this.gson.fromJson(responseString, InjectScriptsResponse.class);
                        if (injectScriptsResponse.getCodResponse() == 0 && Intrinsics.areEqual(injectScriptsResponse.getCommand(), CommandConstants.COMMAND_C25)) {
                            channelChannel$default.mo5953trySendJP2dKIU(new Result.Success(injectScriptsResponse, null, 2, null));
                        } else {
                            channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal("401#" + injectScriptsResponse.getStatus() + "#" + injectScriptsResponse.getMessage())));
                        }
                    } catch (JsonSyntaxException unused) {
                        channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(Error.Unknown.INSTANCE));
                    }
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerSendNewCommand(int command) {
                    PinPadSdkWrapper.this.processCommand(command, null, false);
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogDataReceive(@Nullable short[] p4) {
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogDataSend(@Nullable short[] p4) {
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogSession(@Nullable String p4) {
                }
            });
            c07401.L$0 = channelChannel$default;
            c07401.label = 1;
            Object objReceive = channelChannel$default.receive(c07401);
            if (objReceive == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objReceive;
            channel = channelChannel$default;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel = (Channel) c07401.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Result result = (Result) obj;
        SendChannel.DefaultImpls.close$default(channel, null, 1, null);
        return result;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object readCardInfoC51(@NotNull String str, boolean z10, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Continuation<? super Result<C51Response>> continuation) {
        C07421 c07421;
        Channel channel;
        if (continuation instanceof C07421) {
            c07421 = (C07421) continuation;
            int i10 = c07421.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07421.label = i10 - Integer.MIN_VALUE;
            } else {
                c07421 = new C07421(continuation);
            }
        } else {
            c07421 = new C07421(continuation);
        }
        Object objReceive = c07421.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07421.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objReceive);
            final Channel channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
            processCommand(Utils.COMMAND_STRING_C51, new String[]{"30", str, "484", CommandConstants.C51_TLV_LIST, CommandConstants.C51_KEY_NAME1, str3, EglobalUtils.INSTANCE.getTxnType(z10, str2), str5, str4}, true);
            this.pinPadSdk.setLogListener(new ICallbackListeners() { // from class: mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper.readCardInfoC51.2
                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerError(@Nullable String responseString) {
                    channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal(((C51Response) PinPadSdkWrapper.this.gson.fromJson(responseString, C51Response.class)).getStatus())));
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerResponseCommand(@Nullable String responseString) {
                    try {
                        C51Response c51Response = (C51Response) PinPadSdkWrapper.this.gson.fromJson(responseString, C51Response.class);
                        if (EglobalUtils.isSuccessStatusCommand$default(EglobalUtils.INSTANCE, c51Response.getStatus(), false, 2, null) && Intrinsics.areEqual(c51Response.getCommand(), CommandConstants.COMMAND_C51)) {
                            channelChannel$default.mo5953trySendJP2dKIU(new Result.Success(c51Response, null, 2, null));
                        } else {
                            channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal("401#" + c51Response.getStatus() + "#" + c51Response.getMessage())));
                        }
                    } catch (JsonSyntaxException unused) {
                        channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(Error.Unknown.INSTANCE));
                    }
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerSendNewCommand(int command) {
                    PinPadSdkWrapper.this.processCommand(command, null, false);
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogDataReceive(@Nullable short[] p4) {
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogDataSend(@Nullable short[] p4) {
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogSession(@Nullable String p4) {
                }
            });
            c07421.L$0 = channelChannel$default;
            c07421.label = 1;
            objReceive = channelChannel$default.receive(c07421);
            if (objReceive == coroutine_suspended) {
                return coroutine_suspended;
            }
            channel = channelChannel$default;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel = (Channel) c07421.L$0;
            ResultKt.throwOnFailure(objReceive);
        }
        Result result = (Result) objReceive;
        SendChannel.DefaultImpls.close$default(channel, null, 1, null);
        return result;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object requestRandomKeyZ10(@NotNull String str, @NotNull Continuation<? super Result<Z10Response>> continuation) {
        C07441 c07441;
        Channel channel;
        if (continuation instanceof C07441) {
            c07441 = (C07441) continuation;
            int i10 = c07441.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07441.label = i10 - Integer.MIN_VALUE;
            } else {
                c07441 = new C07441(continuation);
            }
        } else {
            c07441 = new C07441(continuation);
        }
        Object obj = c07441.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07441.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            final Channel channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
            int i12 = Utils.COMMAND_STRING_Z10;
            String upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            processCommand(i12, new String[]{upperCase}, true);
            this.pinPadSdk.setLogListener(new ICallbackListeners() { // from class: mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper.requestRandomKeyZ10.2
                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerError(@Nullable String responseString) {
                    channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal(((Z10Response) PinPadSdkWrapper.this.gson.fromJson(responseString, Z10Response.class)).getStatus())));
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerResponseCommand(@Nullable String responseString) {
                    try {
                        Z10Response z10Response = (Z10Response) PinPadSdkWrapper.this.gson.fromJson(responseString, Z10Response.class);
                        if (EglobalUtils.isSuccessStatusCommand$default(EglobalUtils.INSTANCE, z10Response.getStatus(), false, 2, null) && Intrinsics.areEqual(z10Response.getCommand(), CommandConstants.COMMAND_Z10)) {
                            channelChannel$default.mo5953trySendJP2dKIU(new Result.Success(z10Response, null, 2, null));
                        } else {
                            channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal("401#" + z10Response.getStatus() + "#" + z10Response.getMessage())));
                        }
                    } catch (JsonSyntaxException unused) {
                        channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(Error.Unknown.INSTANCE));
                    }
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerSendNewCommand(int command) {
                    PinPadSdkWrapper.this.processCommand(command, null, false);
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogDataReceive(@Nullable short[] p4) {
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogDataSend(@Nullable short[] p4) {
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogSession(@Nullable String p4) {
                }
            });
            c07441.L$0 = channelChannel$default;
            c07441.label = 1;
            Object objReceive = channelChannel$default.receive(c07441);
            if (objReceive == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objReceive;
            channel = channelChannel$default;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel = (Channel) c07441.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Result result = (Result) obj;
        SendChannel.DefaultImpls.close$default(channel, null, 1, null);
        return result;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object sendFile(@NotNull String str, @NotNull Continuation<? super Result<Q7Response>> continuation) {
        C07461 c07461;
        Channel channel;
        if (continuation instanceof C07461) {
            c07461 = (C07461) continuation;
            int i10 = c07461.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07461.label = i10 - Integer.MIN_VALUE;
            } else {
                c07461 = new C07461(continuation);
            }
        } else {
            c07461 = new C07461(continuation);
        }
        Object obj = c07461.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07461.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            final Channel channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
            processCommand(Utils.COMMAND_SENDFILE, new String[]{str}, true);
            this.pinPadSdk.setLogListener(new ICallbackListeners() { // from class: mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper.sendFile.2
                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerError(@Nullable String responseString) {
                    channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal(((Q7Response) PinPadSdkWrapper.this.gson.fromJson(responseString, Q7Response.class)).getStatus())));
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerResponseCommand(@Nullable String responseString) {
                    try {
                        Q7Response q7Response = (Q7Response) PinPadSdkWrapper.this.gson.fromJson(responseString, Q7Response.class);
                        if (q7Response.getCodResponse() == 0 && Intrinsics.areEqual(q7Response.getCommand(), CommandConstants.COMMAND_Q7)) {
                            channelChannel$default.mo5953trySendJP2dKIU(new Result.Success(q7Response, null, 2, null));
                        } else {
                            channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal("401#" + q7Response.getStatus() + "#" + q7Response.getMessage())));
                        }
                    } catch (JsonSyntaxException unused) {
                        channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(Error.Unknown.INSTANCE));
                    }
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerSendNewCommand(int command) {
                    PinPadSdkWrapper.this.processCommand(command, null, false);
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogDataReceive(@Nullable short[] p4) {
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogDataSend(@Nullable short[] p4) {
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogSession(@Nullable String p4) {
                }
            });
            c07461.L$0 = channelChannel$default;
            c07461.label = 1;
            Object objReceive = channelChannel$default.receive(c07461);
            if (objReceive == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objReceive;
            channel = channelChannel$default;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel = (Channel) c07461.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Result result = (Result) obj;
        SendChannel.DefaultImpls.close$default(channel, null, 1, null);
        return result;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object sendInitialKeyZ11(@NotNull TerminalKeysResponse terminalKeysResponse, @NotNull String str, @NotNull Continuation<? super Result<Z11Response>> continuation) {
        C07481 c07481;
        Channel channel;
        if (continuation instanceof C07481) {
            c07481 = (C07481) continuation;
            int i10 = c07481.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07481.label = i10 - Integer.MIN_VALUE;
            } else {
                c07481 = new C07481(continuation);
            }
        } else {
            c07481 = new C07481(continuation);
        }
        Object obj = c07481.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07481.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            final Channel channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
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
            processCommand(Utils.COMMAND_STRING_Z11, new String[]{upperCase, upperCase2}, true);
            this.pinPadSdk.setLogListener(new ICallbackListeners() { // from class: mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper.sendInitialKeyZ11.2
                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerError(@Nullable String responseString) {
                    channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal(((Z11Response) PinPadSdkWrapper.this.gson.fromJson(responseString, Z11Response.class)).getStatus())));
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerResponseCommand(@Nullable String responseString) {
                    try {
                        Z11Response z11Response = (Z11Response) PinPadSdkWrapper.this.gson.fromJson(responseString, Z11Response.class);
                        if (EglobalUtils.isSuccessStatusCommand$default(EglobalUtils.INSTANCE, z11Response.getStatus(), false, 2, null) && Intrinsics.areEqual(z11Response.getCommand(), CommandConstants.COMMAND_Z11)) {
                            channelChannel$default.mo5953trySendJP2dKIU(new Result.Success(z11Response, null, 2, null));
                        } else {
                            channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal("401#" + z11Response.getStatus() + "#" + z11Response.getMessage())));
                        }
                    } catch (JsonSyntaxException unused) {
                        channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(Error.Unknown.INSTANCE));
                    }
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerSendNewCommand(int command) {
                    PinPadSdkWrapper.this.processCommand(command, null, false);
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogDataReceive(@Nullable short[] p4) {
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogDataSend(@Nullable short[] p4) {
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogSession(@Nullable String p4) {
                }
            });
            c07481.L$0 = channelChannel$default;
            c07481.label = 1;
            Object objReceive = channelChannel$default.receive(c07481);
            if (objReceive == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objReceive;
            channel = channelChannel$default;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel = (Channel) c07481.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Result result = (Result) obj;
        SendChannel.DefaultImpls.close$default(channel, null, 1, null);
        return result;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object sendInitialKeyZ12(@NotNull String str, @NotNull Continuation<? super Result<Z12Response>> continuation) {
        C07501 c07501;
        Channel channel;
        if (continuation instanceof C07501) {
            c07501 = (C07501) continuation;
            int i10 = c07501.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07501.label = i10 - Integer.MIN_VALUE;
            } else {
                c07501 = new C07501(continuation);
            }
        } else {
            c07501 = new C07501(continuation);
        }
        Object obj = c07501.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07501.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            final Channel channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
            Locale locale = Locale.ROOT;
            String upperCase = CommandConstants.Z12_KEY.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String upperCase2 = str.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String strD = f.d("0", upperCase2);
            String upperCase3 = CommandConstants.Z12_DID.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String upperCase4 = CommandConstants.Z12_KIK.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase4, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String upperCase5 = "10".toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase5, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            processCommand(Utils.COMMAND_STRING_Z12, new String[]{upperCase, strD, upperCase3, upperCase4, upperCase5}, true);
            this.pinPadSdk.setLogListener(new ICallbackListeners() { // from class: mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper.sendInitialKeyZ12.2
                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerError(@Nullable String responseString) {
                    channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal(((Z12Response) PinPadSdkWrapper.this.gson.fromJson(responseString, Z12Response.class)).getStatus())));
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerResponseCommand(@Nullable String responseString) {
                    try {
                        Z12Response z12Response = (Z12Response) PinPadSdkWrapper.this.gson.fromJson(responseString, Z12Response.class);
                        if (EglobalUtils.isSuccessStatusCommand$default(EglobalUtils.INSTANCE, z12Response.getStatus(), false, 2, null) && Intrinsics.areEqual(z12Response.getCommand(), CommandConstants.COMMAND_Z12)) {
                            channelChannel$default.mo5953trySendJP2dKIU(new Result.Success(z12Response, null, 2, null));
                        } else {
                            channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal("401#" + z12Response.getStatus() + "#" + z12Response.getMessage())));
                        }
                    } catch (JsonSyntaxException unused) {
                        channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(Error.Unknown.INSTANCE));
                    }
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerSendNewCommand(int command) {
                    PinPadSdkWrapper.this.processCommand(command, null, false);
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogDataReceive(@Nullable short[] p4) {
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogDataSend(@Nullable short[] p4) {
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogSession(@Nullable String p4) {
                }
            });
            c07501.L$0 = channelChannel$default;
            c07501.label = 1;
            Object objReceive = channelChannel$default.receive(c07501);
            if (objReceive == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objReceive;
            channel = channelChannel$default;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel = (Channel) c07501.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Result result = (Result) obj;
        SendChannel.DefaultImpls.close$default(channel, null, 1, null);
        return result;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object setTerminalWelcomeText(@NotNull String str, @NotNull Continuation<? super Result<Z2Response>> continuation) {
        C07521 c07521;
        Channel channel;
        if (continuation instanceof C07521) {
            c07521 = (C07521) continuation;
            int i10 = c07521.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07521.label = i10 - Integer.MIN_VALUE;
            } else {
                c07521 = new C07521(continuation);
            }
        } else {
            c07521 = new C07521(continuation);
        }
        Object obj = c07521.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07521.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            final Channel channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
            processCommand(Utils.COMMAND_STRING_Z2, new String[]{str}, true);
            this.pinPadSdk.setLogListener(new ICallbackListeners() { // from class: mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper.setTerminalWelcomeText.2
                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerError(@Nullable String responseString) {
                    channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal(((Z2Response) PinPadSdkWrapper.this.gson.fromJson(responseString, Z2Response.class)).getStatus())));
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerResponseCommand(@Nullable String responseString) {
                    try {
                        Z2Response z2Response = (Z2Response) PinPadSdkWrapper.this.gson.fromJson(responseString, Z2Response.class);
                        if (EglobalUtils.isSuccessStatusCommand$default(EglobalUtils.INSTANCE, z2Response.getStatus(), false, 2, null) && Intrinsics.areEqual(z2Response.getCommand(), CommandConstants.COMMAND_Z2)) {
                            channelChannel$default.mo5953trySendJP2dKIU(new Result.Success(z2Response, null, 2, null));
                        } else {
                            channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal("401#" + z2Response.getStatus() + "#" + z2Response.getMessage())));
                        }
                    } catch (JsonSyntaxException unused) {
                        channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(Error.Unknown.INSTANCE));
                    }
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerSendNewCommand(int command) {
                    PinPadSdkWrapper.this.processCommand(command, null, false);
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogDataReceive(@Nullable short[] p4) {
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogDataSend(@Nullable short[] p4) {
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogSession(@Nullable String p4) {
                }
            });
            c07521.L$0 = channelChannel$default;
            c07521.label = 1;
            Object objReceive = channelChannel$default.receive(c07521);
            if (objReceive == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objReceive;
            channel = channelChannel$default;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel = (Channel) c07521.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Result result = (Result) obj;
        SendChannel.DefaultImpls.close$default(channel, null, 1, null);
        return result;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object validateRSAKeyZ13(@NotNull String str, @NotNull Continuation<? super Result<Z13Response>> continuation) {
        C07541 c07541;
        Channel channel;
        if (continuation instanceof C07541) {
            c07541 = (C07541) continuation;
            int i10 = c07541.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07541.label = i10 - Integer.MIN_VALUE;
            } else {
                c07541 = new C07541(continuation);
            }
        } else {
            c07541 = new C07541(continuation);
        }
        Object obj = c07541.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07541.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            final Channel channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
            String upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            processCommand(Utils.COMMAND_STRING_Z13, new String[]{upperCase}, true);
            this.pinPadSdk.setLogListener(new ICallbackListeners() { // from class: mx.openpay.library.data.bluetooth.eglobal.PinPadSdkWrapper.validateRSAKeyZ13.2
                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerError(@Nullable String responseString) {
                    channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal(((Z13Response) PinPadSdkWrapper.this.gson.fromJson(responseString, Z13Response.class)).getStatus())));
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerResponseCommand(@Nullable String responseString) {
                    try {
                        Z13Response z13Response = (Z13Response) PinPadSdkWrapper.this.gson.fromJson(responseString, Z13Response.class);
                        if (EglobalUtils.isSuccessStatusCommand$default(EglobalUtils.INSTANCE, z13Response.getStatus(), false, 2, null) && Intrinsics.areEqual(z13Response.getCommand(), CommandConstants.COMMAND_Z13)) {
                            channelChannel$default.mo5953trySendJP2dKIU(new Result.Success(z13Response, null, 2, null));
                        } else {
                            channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(new Error.OnTerminal("401#" + z13Response.getStatus() + "#" + z13Response.getMessage())));
                        }
                    } catch (JsonSyntaxException unused) {
                        channelChannel$default.mo5953trySendJP2dKIU(new Result.Failure(Error.Unknown.INSTANCE));
                    }
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerSendNewCommand(int command) {
                    PinPadSdkWrapper.this.processCommand(command, null, false);
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogDataReceive(@Nullable short[] p4) {
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogDataSend(@Nullable short[] p4) {
                }

                @Override // com.vierge.pinpadsdk.ICallbackListeners
                public void listenerLogSession(@Nullable String p4) {
                }
            });
            c07541.L$0 = channelChannel$default;
            c07541.label = 1;
            Object objReceive = channelChannel$default.receive(c07541);
            if (objReceive == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objReceive;
            channel = channelChannel$default;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel = (Channel) c07541.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Result result = (Result) obj;
        SendChannel.DefaultImpls.close$default(channel, null, 1, null);
        return result;
    }

    @Override // com.vierge.pinpadsdk.script.ScriptProtocolInterface, com.vierge.pinpadsdk.q7Protocol.IQ7ProtocolSend
    public void write(@Nullable byte[] message) {
        this.bluetoothService.write(message);
    }
}
