package mx.openpay.library.data.datasource.remote.datasource;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.notifications.constants.PushConstants;
import com.esotericsoftware.asm.Opcodes;
import ek.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.datasource.remote.OpenPayAPI;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.CreateChargeRequestDto;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.FirmwareUpdateStatusRequestDto;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.GetMerchantRequestDto;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.RefundChargeRequestDto;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.ReverseRequestDto;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.TerminalCapacityRequestDto;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.TerminalKeysRequestDto;
import mx.openpay.library.data.datasource.remote.model.response.TransactionResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.ChargeResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.MerchantResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.PlanResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.RSAKeyResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.TerminalKeysResponseDto;
import mx.openpay.library.data.mapper.eglobal.BinesMapperKt;
import mx.openpay.library.data.mapper.eglobal.ChargeMapperKt;
import mx.openpay.library.data.mapper.eglobal.FirmwareUpdateStatusMapperKt;
import mx.openpay.library.data.mapper.eglobal.MechantMapperKt;
import mx.openpay.library.data.mapper.eglobal.PlanMapperKt;
import mx.openpay.library.data.mapper.eglobal.RSAKeyMapperKt;
import mx.openpay.library.data.mapper.eglobal.RefundChargeMapperKt;
import mx.openpay.library.data.mapper.eglobal.ReverseChargeMapperKt;
import mx.openpay.library.data.mapper.eglobal.TerminalCapacityMapperKt;
import mx.openpay.library.data.mapper.eglobal.TerminalKeysMapperKt;
import mx.openpay.library.data.mapper.transaction.TransactionMapperKt;
import mx.openpay.library.domain.datasource.EglobalRemoteDataSource;
import mx.openpay.library.domain.model.CreateCharge;
import mx.openpay.library.domain.model.Error;
import mx.openpay.library.domain.model.IntegratorTags;
import mx.openpay.library.domain.model.eglobal.Bin;
import mx.openpay.library.domain.model.eglobal.Charge;
import mx.openpay.library.domain.model.eglobal.FirmwareUpdateStatusRequest;
import mx.openpay.library.domain.model.eglobal.GetMerchant;
import mx.openpay.library.domain.model.eglobal.Merchant;
import mx.openpay.library.domain.model.eglobal.RSAKey;
import mx.openpay.library.domain.model.eglobal.RefundRequest;
import mx.openpay.library.domain.model.eglobal.ReverseRequest;
import mx.openpay.library.domain.model.eglobal.TerminalCapacity;
import mx.openpay.library.domain.model.eglobal.TerminalKeysRequest;
import mx.openpay.library.domain.model.eglobal.TerminalKeysResponse;
import mx.openpay.library.domain.model.transaction.Transaction;
import mx.openpay.library.domain.util.ErrorHandler;
import mx.openpay.library.domain.util.Result;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

/* JADX INFO: compiled from: EglobalRemoteDataSourceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 B2\u00020\u0001:\u0001BB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ/\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ%\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\n2\u0006\u0010\u001f\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010 J\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010#J\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\n2\u0006\u0010$\u001a\u00020&H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010'J-\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u001d0\n2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020,H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010-J%\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u001d0\n2\u0006\u0010+\u001a\u00020,H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010/J\u001f\u00100\u001a\b\u0012\u0004\u0012\u0002010\n2\u0006\u00102\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0002\u00103J\u001d\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u001d0\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010#J'\u00105\u001a\b\u0012\u0004\u0012\u0002060\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u00107\u001a\u000208H\u0096@ø\u0001\u0000¢\u0006\u0002\u00109J'\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010;\u001a\u00020<2\u0006\u0010\f\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010=J\u001f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010?\u001a\u00020@H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010AR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006C"}, d2 = {"Lmx/openpay/library/data/datasource/remote/datasource/EglobalRemoteDataSourceImpl;", "Lmx/openpay/library/domain/datasource/EglobalRemoteDataSource;", "openPayAPI", "Lmx/openpay/library/data/datasource/remote/OpenPayAPI;", "errorHandler", "Lmx/openpay/library/domain/util/ErrorHandler;", "integratorTags", "Lmx/openpay/library/domain/model/IntegratorTags;", "(Lmx/openpay/library/data/datasource/remote/OpenPayAPI;Lmx/openpay/library/domain/util/ErrorHandler;Lmx/openpay/library/domain/model/IntegratorTags;)V", "executeCharge", "Lmx/openpay/library/domain/util/Result;", "Lmx/openpay/library/domain/model/eglobal/Charge;", "serial", "", "createCharge", "Lmx/openpay/library/domain/model/CreateCharge;", "isTop", "", "(Ljava/lang/String;Lmx/openpay/library/domain/model/CreateCharge;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeRefundCharge", "Lmx/openpay/library/domain/model/transaction/Transaction;", "refundRequest", "Lmx/openpay/library/domain/model/eglobal/RefundRequest;", "(Lmx/openpay/library/domain/model/eglobal/RefundRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "firmwareUpdateStatus", "firmware", "Lmx/openpay/library/domain/model/eglobal/FirmwareUpdateStatusRequest;", "(Lmx/openpay/library/domain/model/eglobal/FirmwareUpdateStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBines", "", "Lmx/openpay/library/domain/model/eglobal/Bin;", "forceUpdate", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFirmware", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchant", "Lmx/openpay/library/domain/model/eglobal/Merchant;", "Lmx/openpay/library/domain/model/eglobal/GetMerchant;", "(Lmx/openpay/library/domain/model/eglobal/GetMerchant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentPlans", "", "bin", PushConstants.AMOUNT, "", "(Ljava/lang/String;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentPlansWithoutBin", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRSAKeyBySlot", "Lmx/openpay/library/domain/model/eglobal/RSAKey;", "slot", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRSAKeys", "initializeKeys", "Lmx/openpay/library/domain/model/eglobal/TerminalKeysResponse;", "terminalKeysRequest", "Lmx/openpay/library/domain/model/eglobal/TerminalKeysRequest;", "(Ljava/lang/String;Lmx/openpay/library/domain/model/eglobal/TerminalKeysRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reverse", "reverseRequest", "Lmx/openpay/library/domain/model/eglobal/ReverseRequest;", "(Lmx/openpay/library/domain/model/eglobal/ReverseRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTerminalCapacity", "terminalCapacity", "Lmx/openpay/library/domain/model/eglobal/TerminalCapacity;", "(Lmx/openpay/library/domain/model/eglobal/TerminalCapacity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EglobalRemoteDataSourceImpl implements EglobalRemoteDataSource {

    @NotNull
    private static final String TAP_ON_PHONE_SOURCE = "TOP";

    @NotNull
    private final ErrorHandler errorHandler;

    @NotNull
    private final IntegratorTags integratorTags;

    @NotNull
    private final OpenPayAPI openPayAPI;

    /* JADX INFO: renamed from: mx.openpay.library.data.datasource.remote.datasource.EglobalRemoteDataSourceImpl$executeCharge$1, reason: invalid class name */
    /* JADX INFO: compiled from: EglobalRemoteDataSourceImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.datasource.remote.datasource.EglobalRemoteDataSourceImpl", f = "EglobalRemoteDataSourceImpl.kt", i = {0}, l = {78}, m = "executeCharge", n = {"this"}, s = {"L$0"})
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
            return EglobalRemoteDataSourceImpl.this.executeCharge(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.datasource.remote.datasource.EglobalRemoteDataSourceImpl$executeRefundCharge$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalRemoteDataSourceImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.datasource.remote.datasource.EglobalRemoteDataSourceImpl", f = "EglobalRemoteDataSourceImpl.kt", i = {0}, l = {104}, m = "executeRefundCharge", n = {"this"}, s = {"L$0"})
    public static final class C07561 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07561(Continuation<? super C07561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalRemoteDataSourceImpl.this.executeRefundCharge(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.datasource.remote.datasource.EglobalRemoteDataSourceImpl$firmwareUpdateStatus$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalRemoteDataSourceImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.datasource.remote.datasource.EglobalRemoteDataSourceImpl", f = "EglobalRemoteDataSourceImpl.kt", i = {0}, l = {TypedValues.AttributesType.TYPE_EASING}, m = "firmwareUpdateStatus", n = {"this"}, s = {"L$0"})
    public static final class C07571 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07571(Continuation<? super C07571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalRemoteDataSourceImpl.this.firmwareUpdateStatus(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.datasource.remote.datasource.EglobalRemoteDataSourceImpl$getBines$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalRemoteDataSourceImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.datasource.remote.datasource.EglobalRemoteDataSourceImpl", f = "EglobalRemoteDataSourceImpl.kt", i = {0}, l = {51}, m = "getBines", n = {"this"}, s = {"L$0"})
    public static final class C07581 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07581(Continuation<? super C07581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalRemoteDataSourceImpl.this.getBines(false, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.datasource.remote.datasource.EglobalRemoteDataSourceImpl$getFirmware$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalRemoteDataSourceImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.datasource.remote.datasource.EglobalRemoteDataSourceImpl", f = "EglobalRemoteDataSourceImpl.kt", i = {0}, l = {295}, m = "getFirmware", n = {"this"}, s = {"L$0"})
    public static final class C07591 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07591(Continuation<? super C07591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalRemoteDataSourceImpl.this.getFirmware(this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.datasource.remote.datasource.EglobalRemoteDataSourceImpl$getMerchant$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalRemoteDataSourceImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.datasource.remote.datasource.EglobalRemoteDataSourceImpl", f = "EglobalRemoteDataSourceImpl.kt", i = {0}, l = {133}, m = "getMerchant", n = {"this"}, s = {"L$0"})
    public static final class C07601 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07601(Continuation<? super C07601> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalRemoteDataSourceImpl.this.getMerchant(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.datasource.remote.datasource.EglobalRemoteDataSourceImpl$getPaymentPlans$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalRemoteDataSourceImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.datasource.remote.datasource.EglobalRemoteDataSourceImpl", f = "EglobalRemoteDataSourceImpl.kt", i = {0}, l = {153}, m = "getPaymentPlans", n = {"this"}, s = {"L$0"})
    public static final class C07611 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07611(Continuation<? super C07611> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalRemoteDataSourceImpl.this.getPaymentPlans(null, 0.0d, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.datasource.remote.datasource.EglobalRemoteDataSourceImpl$getPaymentPlansWithoutBin$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalRemoteDataSourceImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.datasource.remote.datasource.EglobalRemoteDataSourceImpl", f = "EglobalRemoteDataSourceImpl.kt", i = {0}, l = {173}, m = "getPaymentPlansWithoutBin", n = {"this"}, s = {"L$0"})
    public static final class C07621 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07621(Continuation<? super C07621> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalRemoteDataSourceImpl.this.getPaymentPlansWithoutBin(0.0d, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.datasource.remote.datasource.EglobalRemoteDataSourceImpl$getRSAKeyBySlot$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalRemoteDataSourceImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.datasource.remote.datasource.EglobalRemoteDataSourceImpl", f = "EglobalRemoteDataSourceImpl.kt", i = {0}, l = {237}, m = "getRSAKeyBySlot", n = {"this"}, s = {"L$0"})
    public static final class C07631 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07631(Continuation<? super C07631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalRemoteDataSourceImpl.this.getRSAKeyBySlot(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.datasource.remote.datasource.EglobalRemoteDataSourceImpl$getRSAKeys$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalRemoteDataSourceImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.datasource.remote.datasource.EglobalRemoteDataSourceImpl", f = "EglobalRemoteDataSourceImpl.kt", i = {0}, l = {Opcodes.INSTANCEOF}, m = "getRSAKeys", n = {"this"}, s = {"L$0"})
    public static final class C07641 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07641(Continuation<? super C07641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalRemoteDataSourceImpl.this.getRSAKeys(this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.datasource.remote.datasource.EglobalRemoteDataSourceImpl$initializeKeys$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalRemoteDataSourceImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.datasource.remote.datasource.EglobalRemoteDataSourceImpl", f = "EglobalRemoteDataSourceImpl.kt", i = {0}, l = {217}, m = "initializeKeys", n = {"this"}, s = {"L$0"})
    public static final class C07651 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07651(Continuation<? super C07651> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalRemoteDataSourceImpl.this.initializeKeys(null, null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.datasource.remote.datasource.EglobalRemoteDataSourceImpl$reverse$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalRemoteDataSourceImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.datasource.remote.datasource.EglobalRemoteDataSourceImpl", f = "EglobalRemoteDataSourceImpl.kt", i = {0}, l = {278}, m = "reverse", n = {"this"}, s = {"L$0"})
    public static final class C07661 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07661(Continuation<? super C07661> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalRemoteDataSourceImpl.this.reverse(null, null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.datasource.remote.datasource.EglobalRemoteDataSourceImpl$updateTerminalCapacity$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalRemoteDataSourceImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.datasource.remote.datasource.EglobalRemoteDataSourceImpl", f = "EglobalRemoteDataSourceImpl.kt", i = {0}, l = {258}, m = "updateTerminalCapacity", n = {"this"}, s = {"L$0"})
    public static final class C07671 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07671(Continuation<? super C07671> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalRemoteDataSourceImpl.this.updateTerminalCapacity(null, this);
        }
    }

    public EglobalRemoteDataSourceImpl(@NotNull OpenPayAPI openPayAPI, @NotNull ErrorHandler errorHandler, @NotNull IntegratorTags integratorTags) {
        Intrinsics.checkNotNullParameter(openPayAPI, "openPayAPI");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(integratorTags, "integratorTags");
        this.openPayAPI = openPayAPI;
        this.errorHandler = errorHandler;
        this.integratorTags = integratorTags;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0062 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x002a, B:29:0x005a, B:31:0x0062, B:33:0x006a, B:37:0x007d, B:45:0x0091, B:47:0x009b, B:50:0x00a3, B:51:0x00aa, B:52:0x00b2, B:53:0x00ba, B:54:0x00c2), top: B:58:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:33:0x006a A[Catch: Exception -> 0x002e, TRY_LEAVE, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x002a, B:29:0x005a, B:31:0x0062, B:33:0x006a, B:37:0x007d, B:45:0x0091, B:47:0x009b, B:50:0x00a3, B:51:0x00aa, B:52:0x00b2, B:53:0x00ba, B:54:0x00c2), top: B:58:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0075  */
    /* JADX WARN: Code duplicated, block: B:37:0x007d A[Catch: Exception -> 0x002e, TRY_ENTER, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x002a, B:29:0x005a, B:31:0x0062, B:33:0x006a, B:37:0x007d, B:45:0x0091, B:47:0x009b, B:50:0x00a3, B:51:0x00aa, B:52:0x00b2, B:53:0x00ba, B:54:0x00c2), top: B:58:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:41:0x0089  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0091 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x002a, B:29:0x005a, B:31:0x0062, B:33:0x006a, B:37:0x007d, B:45:0x0091, B:47:0x009b, B:50:0x00a3, B:51:0x00aa, B:52:0x00b2, B:53:0x00ba, B:54:0x00c2), top: B:58:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00aa A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x002a, B:29:0x005a, B:31:0x0062, B:33:0x006a, B:37:0x007d, B:45:0x0091, B:47:0x009b, B:50:0x00a3, B:51:0x00aa, B:52:0x00b2, B:53:0x00ba, B:54:0x00c2), top: B:58:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b2 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x002a, B:29:0x005a, B:31:0x0062, B:33:0x006a, B:37:0x007d, B:45:0x0091, B:47:0x009b, B:50:0x00a3, B:51:0x00aa, B:52:0x00b2, B:53:0x00ba, B:54:0x00c2), top: B:58:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ba A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x002a, B:29:0x005a, B:31:0x0062, B:33:0x006a, B:37:0x007d, B:45:0x0091, B:47:0x009b, B:50:0x00a3, B:51:0x00aa, B:52:0x00b2, B:53:0x00ba, B:54:0x00c2), top: B:58:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c2 A[Catch: Exception -> 0x002e, TRY_LEAVE, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x002a, B:29:0x005a, B:31:0x0062, B:33:0x006a, B:37:0x007d, B:45:0x0091, B:47:0x009b, B:50:0x00a3, B:51:0x00aa, B:52:0x00b2, B:53:0x00ba, B:54:0x00c2), top: B:58:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.domain.datasource.EglobalRemoteDataSource
    @Nullable
    public Object executeCharge(@NotNull String str, @NotNull CreateCharge createCharge, boolean z10, @NotNull Continuation<? super Result<Charge>> continuation) {
        AnonymousClass1 anonymousClass1;
        EglobalRemoteDataSourceImpl eglobalRemoteDataSourceImpl;
        Response response;
        int iCode;
        ResponseBody responseBodyErrorBody;
        String strString;
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
        Object objExecuteCharge = anonymousClass1.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = anonymousClass1.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eglobalRemoteDataSourceImpl = (EglobalRemoteDataSourceImpl) anonymousClass1.L$0;
            try {
                ResultKt.throwOnFailure(objExecuteCharge);
                response = (Response) objExecuteCharge;
                if (response.isSuccessful()) {
                    ChargeResponseDto chargeResponseDto = (ChargeResponseDto) response.body();
                    return chargeResponseDto != null ? new Result.Success(ChargeMapperKt.mapToLocalCharge(chargeResponseDto), null, 2, null) : new Result.Failure(Error.Unknown.INSTANCE);
                }
                iCode = response.code();
                if (iCode != 408) {
                    return new Result.Failure(Error.TimeOut.INSTANCE);
                }
                if (iCode != 500) {
                    return new Result.Failure(Error.InternalServer.INSTANCE);
                }
                if (iCode != 502) {
                    return new Result.Failure(Error.BadGateway.INSTANCE);
                }
                if (iCode != 503) {
                    return new Result.Failure(Error.ServiceUnavailable.INSTANCE);
                }
                responseBodyErrorBody = response.errorBody();
                if (responseBodyErrorBody != null || (strString = responseBodyErrorBody.string()) == null) {
                    strString = "";
                }
                return new Result.Failure(new Error.Server(strString));
            } catch (Exception e5) {
                e = e5;
                return new Result.Failure(eglobalRemoteDataSourceImpl.errorHandler.getError(e));
            }
        }
        ResultKt.throwOnFailure(objExecuteCharge);
        try {
            CreateChargeRequestDto createChargeRequestDtoMapToCreateChargeRequestDto = ChargeMapperKt.mapToCreateChargeRequestDto(createCharge, this.integratorTags, z10);
            OpenPayAPI openPayAPI = this.openPayAPI;
            String str2 = z10 ? TAP_ON_PHONE_SOURCE : null;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objExecuteCharge = openPayAPI.executeCharge(str, str2, createChargeRequestDtoMapToCreateChargeRequestDto, anonymousClass1);
            if (objExecuteCharge == coroutine_suspended) {
                return coroutine_suspended;
            }
            response = (Response) objExecuteCharge;
            if (response.isSuccessful()) {
                ChargeResponseDto chargeResponseDto2 = (ChargeResponseDto) response.body();
                if (chargeResponseDto2 != null) {
                }
            }
            iCode = response.code();
            if (iCode != 408) {
                return new Result.Failure(Error.TimeOut.INSTANCE);
            }
            if (iCode != 500) {
                return new Result.Failure(Error.InternalServer.INSTANCE);
            }
            if (iCode != 502) {
                return new Result.Failure(Error.BadGateway.INSTANCE);
            }
            if (iCode != 503) {
                return new Result.Failure(Error.ServiceUnavailable.INSTANCE);
            }
            responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody != null) {
                strString = "";
            } else {
                strString = "";
            }
            return new Result.Failure(new Error.Server(strString));
        } catch (Exception e7) {
            e = e7;
            eglobalRemoteDataSourceImpl = this;
            return new Result.Failure(eglobalRemoteDataSourceImpl.errorHandler.getError(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0051, B:25:0x0059, B:27:0x0061, B:31:0x0075, B:39:0x0089, B:41:0x0093, B:44:0x009b, B:45:0x00a3, B:46:0x00ab, B:47:0x00b3, B:48:0x00bb), top: B:54:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0061 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0051, B:25:0x0059, B:27:0x0061, B:31:0x0075, B:39:0x0089, B:41:0x0093, B:44:0x009b, B:45:0x00a3, B:46:0x00ab, B:47:0x00b3, B:48:0x00bb), top: B:54:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0075 A[Catch: Exception -> 0x002d, TRY_ENTER, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0051, B:25:0x0059, B:27:0x0061, B:31:0x0075, B:39:0x0089, B:41:0x0093, B:44:0x009b, B:45:0x00a3, B:46:0x00ab, B:47:0x00b3, B:48:0x00bb), top: B:54:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x007d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0051, B:25:0x0059, B:27:0x0061, B:31:0x0075, B:39:0x0089, B:41:0x0093, B:44:0x009b, B:45:0x00a3, B:46:0x00ab, B:47:0x00b3, B:48:0x00bb), top: B:54:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0099  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a3 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0051, B:25:0x0059, B:27:0x0061, B:31:0x0075, B:39:0x0089, B:41:0x0093, B:44:0x009b, B:45:0x00a3, B:46:0x00ab, B:47:0x00b3, B:48:0x00bb), top: B:54:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0051, B:25:0x0059, B:27:0x0061, B:31:0x0075, B:39:0x0089, B:41:0x0093, B:44:0x009b, B:45:0x00a3, B:46:0x00ab, B:47:0x00b3, B:48:0x00bb), top: B:54:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b3 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0051, B:25:0x0059, B:27:0x0061, B:31:0x0075, B:39:0x0089, B:41:0x0093, B:44:0x009b, B:45:0x00a3, B:46:0x00ab, B:47:0x00b3, B:48:0x00bb), top: B:54:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0051, B:25:0x0059, B:27:0x0061, B:31:0x0075, B:39:0x0089, B:41:0x0093, B:44:0x009b, B:45:0x00a3, B:46:0x00ab, B:47:0x00b3, B:48:0x00bb), top: B:54:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.domain.datasource.EglobalRemoteDataSource
    @Nullable
    public Object executeRefundCharge(@NotNull RefundRequest refundRequest, @NotNull Continuation<? super Result<Transaction>> continuation) {
        C07561 c07561;
        EglobalRemoteDataSourceImpl eglobalRemoteDataSourceImpl;
        Response response;
        int iCode;
        ResponseBody responseBodyErrorBody;
        String strString;
        if (continuation instanceof C07561) {
            c07561 = (C07561) continuation;
            int i10 = c07561.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07561.label = i10 - Integer.MIN_VALUE;
            } else {
                c07561 = new C07561(continuation);
            }
        } else {
            c07561 = new C07561(continuation);
        }
        Object objExecuteRefundCharge = c07561.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07561.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eglobalRemoteDataSourceImpl = (EglobalRemoteDataSourceImpl) c07561.L$0;
            try {
                ResultKt.throwOnFailure(objExecuteRefundCharge);
                response = (Response) objExecuteRefundCharge;
                if (response.isSuccessful()) {
                    TransactionResponseDto transactionResponseDto = (TransactionResponseDto) response.body();
                    return transactionResponseDto != null ? new Result.Success(TransactionMapperKt.mapToLocalTransaction(transactionResponseDto), null, 2, null) : new Result.Failure(Error.Unknown.INSTANCE);
                }
                iCode = response.code();
                if (iCode != 408) {
                    return new Result.Failure(Error.TimeOut.INSTANCE);
                }
                if (iCode != 500) {
                    return new Result.Failure(Error.InternalServer.INSTANCE);
                }
                if (iCode != 502) {
                    return new Result.Failure(Error.BadGateway.INSTANCE);
                }
                if (iCode != 503) {
                    return new Result.Failure(Error.ServiceUnavailable.INSTANCE);
                }
                ErrorHandler errorHandler = eglobalRemoteDataSourceImpl.errorHandler;
                responseBodyErrorBody = response.errorBody();
                if (responseBodyErrorBody != null || (strString = responseBodyErrorBody.string()) == null) {
                    strString = "";
                }
                return new Result.Failure(errorHandler.getServerErrorByErrorBody(strString));
            } catch (Exception e5) {
                e = e5;
                return new Result.Failure(eglobalRemoteDataSourceImpl.errorHandler.getError(e));
            }
        }
        ResultKt.throwOnFailure(objExecuteRefundCharge);
        try {
            OpenPayAPI openPayAPI = this.openPayAPI;
            String transactionId = refundRequest.getTransactionId();
            RefundChargeRequestDto refundChargeRequestDtoMapToRefundChargeRequestDto = RefundChargeMapperKt.mapToRefundChargeRequestDto(refundRequest);
            c07561.L$0 = this;
            c07561.label = 1;
            objExecuteRefundCharge = openPayAPI.executeRefundCharge(transactionId, refundChargeRequestDtoMapToRefundChargeRequestDto, c07561);
            if (objExecuteRefundCharge == coroutine_suspended) {
                return coroutine_suspended;
            }
            eglobalRemoteDataSourceImpl = this;
            response = (Response) objExecuteRefundCharge;
            if (response.isSuccessful()) {
                TransactionResponseDto transactionResponseDto2 = (TransactionResponseDto) response.body();
                if (transactionResponseDto2 != null) {
                }
            }
            iCode = response.code();
            if (iCode != 408) {
                return new Result.Failure(Error.TimeOut.INSTANCE);
            }
            if (iCode != 500) {
                return new Result.Failure(Error.InternalServer.INSTANCE);
            }
            if (iCode != 502) {
                return new Result.Failure(Error.BadGateway.INSTANCE);
            }
            if (iCode != 503) {
                return new Result.Failure(Error.ServiceUnavailable.INSTANCE);
            }
            ErrorHandler errorHandler2 = eglobalRemoteDataSourceImpl.errorHandler;
            responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody != null) {
                strString = "";
            } else {
                strString = "";
            }
            return new Result.Failure(errorHandler2.getServerErrorByErrorBody(strString));
        } catch (Exception e7) {
            e = e7;
            eglobalRemoteDataSourceImpl = this;
            return new Result.Failure(eglobalRemoteDataSourceImpl.errorHandler.getError(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[Catch: Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0050, B:25:0x0058, B:26:0x0064, B:28:0x006e, B:31:0x0076), top: B:39:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0064 A[Catch: Exception -> 0x002d, TryCatch #1 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0050, B:25:0x0058, B:26:0x0064, B:28:0x006e, B:31:0x0076), top: B:39:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.domain.datasource.EglobalRemoteDataSource
    @Nullable
    public Object firmwareUpdateStatus(@NotNull FirmwareUpdateStatusRequest firmwareUpdateStatusRequest, @NotNull Continuation<? super Result<Boolean>> continuation) {
        C07571 c07571;
        EglobalRemoteDataSourceImpl eglobalRemoteDataSourceImpl;
        Response response;
        ResponseBody responseBodyErrorBody;
        String strString;
        if (continuation instanceof C07571) {
            c07571 = (C07571) continuation;
            int i10 = c07571.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07571.label = i10 - Integer.MIN_VALUE;
            } else {
                c07571 = new C07571(continuation);
            }
        } else {
            c07571 = new C07571(continuation);
        }
        Object objFirmwareUpdateStatus = c07571.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07571.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eglobalRemoteDataSourceImpl = (EglobalRemoteDataSourceImpl) c07571.L$0;
            try {
                ResultKt.throwOnFailure(objFirmwareUpdateStatus);
                response = (Response) objFirmwareUpdateStatus;
                if (response.isSuccessful()) {
                    return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
                }
                ErrorHandler errorHandler = eglobalRemoteDataSourceImpl.errorHandler;
                responseBodyErrorBody = response.errorBody();
                if (responseBodyErrorBody != null || (strString = responseBodyErrorBody.string()) == null) {
                    strString = "";
                }
                return new Result.Failure(errorHandler.getServerErrorByErrorBody(strString));
            } catch (Exception e5) {
                e = e5;
                return new Result.Failure(eglobalRemoteDataSourceImpl.errorHandler.getError(e));
            }
        }
        ResultKt.throwOnFailure(objFirmwareUpdateStatus);
        try {
            FirmwareUpdateStatusRequestDto firmwareUpdateStatusRequestDtoMapToFirmwareDTO = FirmwareUpdateStatusMapperKt.mapToFirmwareDTO(firmwareUpdateStatusRequest);
            OpenPayAPI openPayAPI = this.openPayAPI;
            String deviceSerial = firmwareUpdateStatusRequest.getDeviceSerial();
            c07571.L$0 = this;
            c07571.label = 1;
            objFirmwareUpdateStatus = openPayAPI.firmwareUpdateStatus(deviceSerial, firmwareUpdateStatusRequestDtoMapToFirmwareDTO, c07571);
            if (objFirmwareUpdateStatus == coroutine_suspended) {
                return coroutine_suspended;
            }
            eglobalRemoteDataSourceImpl = this;
            response = (Response) objFirmwareUpdateStatus;
            if (response.isSuccessful()) {
                return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
            }
            ErrorHandler errorHandler2 = eglobalRemoteDataSourceImpl.errorHandler;
            responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody != null) {
                strString = "";
            } else {
                strString = "";
            }
            return new Result.Failure(errorHandler2.getServerErrorByErrorBody(strString));
        } catch (Exception e7) {
            e = e7;
            eglobalRemoteDataSourceImpl = this;
            return new Result.Failure(eglobalRemoteDataSourceImpl.errorHandler.getError(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0050 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0048, B:25:0x0050, B:27:0x0058, B:31:0x006c, B:33:0x0076, B:36:0x007e), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0058 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0048, B:25:0x0050, B:27:0x0058, B:31:0x006c, B:33:0x0076, B:36:0x007e), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c A[Catch: Exception -> 0x002d, TRY_ENTER, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0048, B:25:0x0050, B:27:0x0058, B:31:0x006c, B:33:0x0076, B:36:0x007e), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.domain.datasource.EglobalRemoteDataSource
    @Nullable
    public Object getBines(boolean z10, @NotNull Continuation<? super Result<? extends List<Bin>>> continuation) {
        C07581 c07581;
        EglobalRemoteDataSourceImpl eglobalRemoteDataSourceImpl;
        Response response;
        ResponseBody responseBodyErrorBody;
        String strString;
        if (continuation instanceof C07581) {
            c07581 = (C07581) continuation;
            int i10 = c07581.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07581.label = i10 - Integer.MIN_VALUE;
            } else {
                c07581 = new C07581(continuation);
            }
        } else {
            c07581 = new C07581(continuation);
        }
        Object bines = c07581.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07581.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eglobalRemoteDataSourceImpl = (EglobalRemoteDataSourceImpl) c07581.L$0;
            try {
                ResultKt.throwOnFailure(bines);
                response = (Response) bines;
                if (response.isSuccessful()) {
                    List list = (List) response.body();
                    return list != null ? new Result.Success(BinesMapperKt.mapToLocalBinList(list), null, 2, null) : new Result.Failure(Error.Unknown.INSTANCE);
                }
                ErrorHandler errorHandler = eglobalRemoteDataSourceImpl.errorHandler;
                responseBodyErrorBody = response.errorBody();
                if (responseBodyErrorBody != null || (strString = responseBodyErrorBody.string()) == null) {
                    strString = "";
                }
                return new Result.Failure(errorHandler.getServerErrorByErrorBody(strString));
            } catch (Exception e5) {
                e = e5;
                return new Result.Failure(eglobalRemoteDataSourceImpl.errorHandler.getError(e));
            }
        }
        ResultKt.throwOnFailure(bines);
        try {
            OpenPayAPI openPayAPI = this.openPayAPI;
            c07581.L$0 = this;
            c07581.label = 1;
            bines = openPayAPI.getBines(z10, c07581);
            if (bines == coroutine_suspended) {
                return coroutine_suspended;
            }
            eglobalRemoteDataSourceImpl = this;
            response = (Response) bines;
            if (response.isSuccessful()) {
                List list2 = (List) response.body();
                if (list2 != null) {
                }
            }
            ErrorHandler errorHandler2 = eglobalRemoteDataSourceImpl.errorHandler;
            responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody != null) {
                strString = "";
            } else {
                strString = "";
            }
            return new Result.Failure(errorHandler2.getServerErrorByErrorBody(strString));
        } catch (Exception e7) {
            e = e7;
            eglobalRemoteDataSourceImpl = this;
            return new Result.Failure(eglobalRemoteDataSourceImpl.errorHandler.getError(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0050 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0048, B:25:0x0050, B:27:0x0058, B:31:0x006c, B:33:0x0076, B:36:0x007e), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0058 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0048, B:25:0x0050, B:27:0x0058, B:31:0x006c, B:33:0x0076, B:36:0x007e), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c A[Catch: Exception -> 0x002d, TRY_ENTER, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0048, B:25:0x0050, B:27:0x0058, B:31:0x006c, B:33:0x0076, B:36:0x007e), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.domain.datasource.EglobalRemoteDataSource
    @Nullable
    public Object getFirmware(@NotNull Continuation<? super Result<byte[]>> continuation) {
        C07591 c07591;
        EglobalRemoteDataSourceImpl eglobalRemoteDataSourceImpl;
        Response response;
        ResponseBody responseBodyErrorBody;
        String strString;
        if (continuation instanceof C07591) {
            c07591 = (C07591) continuation;
            int i10 = c07591.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07591.label = i10 - Integer.MIN_VALUE;
            } else {
                c07591 = new C07591(continuation);
            }
        } else {
            c07591 = new C07591(continuation);
        }
        Object firmware = c07591.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07591.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eglobalRemoteDataSourceImpl = (EglobalRemoteDataSourceImpl) c07591.L$0;
            try {
                ResultKt.throwOnFailure(firmware);
                response = (Response) firmware;
                if (response.isSuccessful()) {
                    ResponseBody responseBody = (ResponseBody) response.body();
                    return responseBody != null ? new Result.Success(responseBody.bytes(), null, 2, null) : new Result.Failure(Error.Unknown.INSTANCE);
                }
                ErrorHandler errorHandler = eglobalRemoteDataSourceImpl.errorHandler;
                responseBodyErrorBody = response.errorBody();
                if (responseBodyErrorBody != null || (strString = responseBodyErrorBody.string()) == null) {
                    strString = "";
                }
                return new Result.Failure(errorHandler.getServerErrorByErrorBody(strString));
            } catch (Exception e5) {
                e = e5;
                return new Result.Failure(eglobalRemoteDataSourceImpl.errorHandler.getError(e));
            }
        }
        ResultKt.throwOnFailure(firmware);
        try {
            OpenPayAPI openPayAPI = this.openPayAPI;
            c07591.L$0 = this;
            c07591.label = 1;
            firmware = openPayAPI.getFirmware(c07591);
            if (firmware == coroutine_suspended) {
                return coroutine_suspended;
            }
            eglobalRemoteDataSourceImpl = this;
            response = (Response) firmware;
            if (response.isSuccessful()) {
                ResponseBody responseBody2 = (ResponseBody) response.body();
                if (responseBody2 != null) {
                }
            }
            ErrorHandler errorHandler2 = eglobalRemoteDataSourceImpl.errorHandler;
            responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody != null) {
                strString = "";
            } else {
                strString = "";
            }
            return new Result.Failure(errorHandler2.getServerErrorByErrorBody(strString));
        } catch (Exception e7) {
            e = e7;
            eglobalRemoteDataSourceImpl = this;
            return new Result.Failure(eglobalRemoteDataSourceImpl.errorHandler.getError(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004c, B:25:0x0054, B:27:0x005c, B:31:0x0070, B:33:0x007a, B:36:0x0082), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x005c A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004c, B:25:0x0054, B:27:0x005c, B:31:0x0070, B:33:0x007a, B:36:0x0082), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070 A[Catch: Exception -> 0x002d, TRY_ENTER, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004c, B:25:0x0054, B:27:0x005c, B:31:0x0070, B:33:0x007a, B:36:0x0082), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0080  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.domain.datasource.EglobalRemoteDataSource
    @Nullable
    public Object getMerchant(@NotNull GetMerchant getMerchant, @NotNull Continuation<? super Result<Merchant>> continuation) {
        C07601 c07601;
        EglobalRemoteDataSourceImpl eglobalRemoteDataSourceImpl;
        Response response;
        ResponseBody responseBodyErrorBody;
        String strString;
        if (continuation instanceof C07601) {
            c07601 = (C07601) continuation;
            int i10 = c07601.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07601.label = i10 - Integer.MIN_VALUE;
            } else {
                c07601 = new C07601(continuation);
            }
        } else {
            c07601 = new C07601(continuation);
        }
        Object merchant = c07601.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07601.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eglobalRemoteDataSourceImpl = (EglobalRemoteDataSourceImpl) c07601.L$0;
            try {
                ResultKt.throwOnFailure(merchant);
                response = (Response) merchant;
                if (response.isSuccessful()) {
                    MerchantResponseDto merchantResponseDto = (MerchantResponseDto) response.body();
                    return merchantResponseDto != null ? new Result.Success(MechantMapperKt.mapToLocalMerchant(merchantResponseDto), null, 2, null) : new Result.Failure(Error.Unknown.INSTANCE);
                }
                ErrorHandler errorHandler = eglobalRemoteDataSourceImpl.errorHandler;
                responseBodyErrorBody = response.errorBody();
                if (responseBodyErrorBody != null || (strString = responseBodyErrorBody.string()) == null) {
                    strString = "";
                }
                return new Result.Failure(errorHandler.getServerErrorByErrorBody(strString));
            } catch (Exception e5) {
                e = e5;
                return new Result.Failure(eglobalRemoteDataSourceImpl.errorHandler.getError(e));
            }
        }
        ResultKt.throwOnFailure(merchant);
        try {
            OpenPayAPI openPayAPI = this.openPayAPI;
            GetMerchantRequestDto getMerchantRequestDtoMapToGetMerchantDto = MechantMapperKt.mapToGetMerchantDto(getMerchant);
            c07601.L$0 = this;
            c07601.label = 1;
            merchant = openPayAPI.getMerchant(getMerchantRequestDtoMapToGetMerchantDto, c07601);
            if (merchant == coroutine_suspended) {
                return coroutine_suspended;
            }
            eglobalRemoteDataSourceImpl = this;
            response = (Response) merchant;
            if (response.isSuccessful()) {
                MerchantResponseDto merchantResponseDto2 = (MerchantResponseDto) response.body();
                if (merchantResponseDto2 != null) {
                }
            }
            ErrorHandler errorHandler2 = eglobalRemoteDataSourceImpl.errorHandler;
            responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody != null) {
                strString = "";
            } else {
                strString = "";
            }
            return new Result.Failure(errorHandler2.getServerErrorByErrorBody(strString));
        } catch (Exception e7) {
            e = e7;
            eglobalRemoteDataSourceImpl = this;
            return new Result.Failure(eglobalRemoteDataSourceImpl.errorHandler.getError(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0050 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0048, B:25:0x0050, B:27:0x0058, B:31:0x006c, B:33:0x0076, B:36:0x007e), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0058 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0048, B:25:0x0050, B:27:0x0058, B:31:0x006c, B:33:0x0076, B:36:0x007e), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c A[Catch: Exception -> 0x002d, TRY_ENTER, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0048, B:25:0x0050, B:27:0x0058, B:31:0x006c, B:33:0x0076, B:36:0x007e), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.domain.datasource.EglobalRemoteDataSource
    @Nullable
    public Object getPaymentPlans(@NotNull String str, double d2, @NotNull Continuation<? super Result<? extends List<Integer>>> continuation) {
        C07611 c07611;
        EglobalRemoteDataSourceImpl eglobalRemoteDataSourceImpl;
        Response response;
        ResponseBody responseBodyErrorBody;
        String strString;
        if (continuation instanceof C07611) {
            c07611 = (C07611) continuation;
            int i10 = c07611.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07611.label = i10 - Integer.MIN_VALUE;
            } else {
                c07611 = new C07611(continuation);
            }
        } else {
            c07611 = new C07611(continuation);
        }
        Object paymentPlans = c07611.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07611.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eglobalRemoteDataSourceImpl = (EglobalRemoteDataSourceImpl) c07611.L$0;
            try {
                ResultKt.throwOnFailure(paymentPlans);
                response = (Response) paymentPlans;
                if (response.isSuccessful()) {
                    PlanResponseDto planResponseDto = (PlanResponseDto) response.body();
                    return planResponseDto != null ? new Result.Success(PlanMapperKt.mapToLocalPlan(planResponseDto), null, 2, null) : new Result.Failure(Error.Unknown.INSTANCE);
                }
                ErrorHandler errorHandler = eglobalRemoteDataSourceImpl.errorHandler;
                responseBodyErrorBody = response.errorBody();
                if (responseBodyErrorBody != null || (strString = responseBodyErrorBody.string()) == null) {
                    strString = "";
                }
                return new Result.Failure(errorHandler.getServerErrorByErrorBody(strString));
            } catch (Exception e5) {
                e = e5;
                return new Result.Failure(eglobalRemoteDataSourceImpl.errorHandler.getError(e));
            }
        }
        ResultKt.throwOnFailure(paymentPlans);
        try {
            OpenPayAPI openPayAPI = this.openPayAPI;
            c07611.L$0 = this;
            c07611.label = 1;
            paymentPlans = openPayAPI.getPaymentPlans(str, d2, c07611);
            if (paymentPlans == coroutine_suspended) {
                return coroutine_suspended;
            }
            eglobalRemoteDataSourceImpl = this;
            response = (Response) paymentPlans;
            if (response.isSuccessful()) {
                PlanResponseDto planResponseDto2 = (PlanResponseDto) response.body();
                if (planResponseDto2 != null) {
                }
            }
            ErrorHandler errorHandler2 = eglobalRemoteDataSourceImpl.errorHandler;
            responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody != null) {
                strString = "";
            } else {
                strString = "";
            }
            return new Result.Failure(errorHandler2.getServerErrorByErrorBody(strString));
        } catch (Exception e7) {
            e = e7;
            eglobalRemoteDataSourceImpl = this;
            return new Result.Failure(eglobalRemoteDataSourceImpl.errorHandler.getError(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0050 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0048, B:25:0x0050, B:27:0x0058, B:31:0x006c, B:33:0x0076, B:36:0x007e), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0058 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0048, B:25:0x0050, B:27:0x0058, B:31:0x006c, B:33:0x0076, B:36:0x007e), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c A[Catch: Exception -> 0x002d, TRY_ENTER, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0048, B:25:0x0050, B:27:0x0058, B:31:0x006c, B:33:0x0076, B:36:0x007e), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.domain.datasource.EglobalRemoteDataSource
    @Nullable
    public Object getPaymentPlansWithoutBin(double d2, @NotNull Continuation<? super Result<? extends List<Integer>>> continuation) {
        C07621 c07621;
        EglobalRemoteDataSourceImpl eglobalRemoteDataSourceImpl;
        Response response;
        ResponseBody responseBodyErrorBody;
        String strString;
        if (continuation instanceof C07621) {
            c07621 = (C07621) continuation;
            int i10 = c07621.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07621.label = i10 - Integer.MIN_VALUE;
            } else {
                c07621 = new C07621(continuation);
            }
        } else {
            c07621 = new C07621(continuation);
        }
        Object paymentPlansWithoutBin = c07621.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07621.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eglobalRemoteDataSourceImpl = (EglobalRemoteDataSourceImpl) c07621.L$0;
            try {
                ResultKt.throwOnFailure(paymentPlansWithoutBin);
                response = (Response) paymentPlansWithoutBin;
                if (response.isSuccessful()) {
                    PlanResponseDto planResponseDto = (PlanResponseDto) response.body();
                    return planResponseDto != null ? new Result.Success(PlanMapperKt.mapToLocalPlan(planResponseDto), null, 2, null) : new Result.Failure(Error.Unknown.INSTANCE);
                }
                ErrorHandler errorHandler = eglobalRemoteDataSourceImpl.errorHandler;
                responseBodyErrorBody = response.errorBody();
                if (responseBodyErrorBody != null || (strString = responseBodyErrorBody.string()) == null) {
                    strString = "";
                }
                return new Result.Failure(errorHandler.getServerErrorByErrorBody(strString));
            } catch (Exception e5) {
                e = e5;
                return new Result.Failure(eglobalRemoteDataSourceImpl.errorHandler.getError(e));
            }
        }
        ResultKt.throwOnFailure(paymentPlansWithoutBin);
        try {
            OpenPayAPI openPayAPI = this.openPayAPI;
            c07621.L$0 = this;
            c07621.label = 1;
            paymentPlansWithoutBin = openPayAPI.getPaymentPlansWithoutBin(d2, c07621);
            if (paymentPlansWithoutBin == coroutine_suspended) {
                return coroutine_suspended;
            }
            eglobalRemoteDataSourceImpl = this;
            response = (Response) paymentPlansWithoutBin;
            if (response.isSuccessful()) {
                PlanResponseDto planResponseDto2 = (PlanResponseDto) response.body();
                if (planResponseDto2 != null) {
                }
            }
            ErrorHandler errorHandler2 = eglobalRemoteDataSourceImpl.errorHandler;
            responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody != null) {
                strString = "";
            } else {
                strString = "";
            }
            return new Result.Failure(errorHandler2.getServerErrorByErrorBody(strString));
        } catch (Exception e7) {
            e = e7;
            eglobalRemoteDataSourceImpl = this;
            return new Result.Failure(eglobalRemoteDataSourceImpl.errorHandler.getError(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0050 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0048, B:25:0x0050, B:27:0x0058, B:31:0x006c, B:33:0x0076, B:36:0x007e), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0058 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0048, B:25:0x0050, B:27:0x0058, B:31:0x006c, B:33:0x0076, B:36:0x007e), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c A[Catch: Exception -> 0x002d, TRY_ENTER, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0048, B:25:0x0050, B:27:0x0058, B:31:0x006c, B:33:0x0076, B:36:0x007e), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.domain.datasource.EglobalRemoteDataSource
    @Nullable
    public Object getRSAKeyBySlot(@NotNull String str, @NotNull Continuation<? super Result<RSAKey>> continuation) {
        C07631 c07631;
        EglobalRemoteDataSourceImpl eglobalRemoteDataSourceImpl;
        Response response;
        ResponseBody responseBodyErrorBody;
        String strString;
        if (continuation instanceof C07631) {
            c07631 = (C07631) continuation;
            int i10 = c07631.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07631.label = i10 - Integer.MIN_VALUE;
            } else {
                c07631 = new C07631(continuation);
            }
        } else {
            c07631 = new C07631(continuation);
        }
        Object rSAKeyBySlot = c07631.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07631.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eglobalRemoteDataSourceImpl = (EglobalRemoteDataSourceImpl) c07631.L$0;
            try {
                ResultKt.throwOnFailure(rSAKeyBySlot);
                response = (Response) rSAKeyBySlot;
                if (response.isSuccessful()) {
                    RSAKeyResponseDto rSAKeyResponseDto = (RSAKeyResponseDto) response.body();
                    return rSAKeyResponseDto != null ? new Result.Success(RSAKeyMapperKt.mapToLocalModel(rSAKeyResponseDto), null, 2, null) : new Result.Failure(Error.Unknown.INSTANCE);
                }
                ErrorHandler errorHandler = eglobalRemoteDataSourceImpl.errorHandler;
                responseBodyErrorBody = response.errorBody();
                if (responseBodyErrorBody != null || (strString = responseBodyErrorBody.string()) == null) {
                    strString = "";
                }
                return new Result.Failure(errorHandler.getServerErrorByErrorBody(strString));
            } catch (Exception e5) {
                e = e5;
                return new Result.Failure(eglobalRemoteDataSourceImpl.errorHandler.getError(e));
            }
        }
        ResultKt.throwOnFailure(rSAKeyBySlot);
        try {
            OpenPayAPI openPayAPI = this.openPayAPI;
            c07631.L$0 = this;
            c07631.label = 1;
            rSAKeyBySlot = openPayAPI.getRSAKeyBySlot(str, c07631);
            if (rSAKeyBySlot == coroutine_suspended) {
                return coroutine_suspended;
            }
            eglobalRemoteDataSourceImpl = this;
            response = (Response) rSAKeyBySlot;
            if (response.isSuccessful()) {
                RSAKeyResponseDto rSAKeyResponseDto2 = (RSAKeyResponseDto) response.body();
                if (rSAKeyResponseDto2 != null) {
                }
            }
            ErrorHandler errorHandler2 = eglobalRemoteDataSourceImpl.errorHandler;
            responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody != null) {
                strString = "";
            } else {
                strString = "";
            }
            return new Result.Failure(errorHandler2.getServerErrorByErrorBody(strString));
        } catch (Exception e7) {
            e = e7;
            eglobalRemoteDataSourceImpl = this;
            return new Result.Failure(eglobalRemoteDataSourceImpl.errorHandler.getError(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0050 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0048, B:25:0x0050, B:27:0x0058, B:31:0x006c, B:33:0x0076, B:36:0x007e), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0058 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0048, B:25:0x0050, B:27:0x0058, B:31:0x006c, B:33:0x0076, B:36:0x007e), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c A[Catch: Exception -> 0x002d, TRY_ENTER, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x0048, B:25:0x0050, B:27:0x0058, B:31:0x006c, B:33:0x0076, B:36:0x007e), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.domain.datasource.EglobalRemoteDataSource
    @Nullable
    public Object getRSAKeys(@NotNull Continuation<? super Result<? extends List<RSAKey>>> continuation) {
        C07641 c07641;
        EglobalRemoteDataSourceImpl eglobalRemoteDataSourceImpl;
        Response response;
        ResponseBody responseBodyErrorBody;
        String strString;
        if (continuation instanceof C07641) {
            c07641 = (C07641) continuation;
            int i10 = c07641.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07641.label = i10 - Integer.MIN_VALUE;
            } else {
                c07641 = new C07641(continuation);
            }
        } else {
            c07641 = new C07641(continuation);
        }
        Object rSAKeys = c07641.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07641.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eglobalRemoteDataSourceImpl = (EglobalRemoteDataSourceImpl) c07641.L$0;
            try {
                ResultKt.throwOnFailure(rSAKeys);
                response = (Response) rSAKeys;
                if (response.isSuccessful()) {
                    List list = (List) response.body();
                    return list != null ? new Result.Success(RSAKeyMapperKt.mapToLocalKeysList(list), null, 2, null) : new Result.Failure(Error.Unknown.INSTANCE);
                }
                ErrorHandler errorHandler = eglobalRemoteDataSourceImpl.errorHandler;
                responseBodyErrorBody = response.errorBody();
                if (responseBodyErrorBody != null || (strString = responseBodyErrorBody.string()) == null) {
                    strString = "";
                }
                return new Result.Failure(errorHandler.getServerErrorByErrorBody(strString));
            } catch (Exception e5) {
                e = e5;
                return new Result.Failure(eglobalRemoteDataSourceImpl.errorHandler.getError(e));
            }
        }
        ResultKt.throwOnFailure(rSAKeys);
        try {
            OpenPayAPI openPayAPI = this.openPayAPI;
            c07641.L$0 = this;
            c07641.label = 1;
            rSAKeys = openPayAPI.getRSAKeys(c07641);
            if (rSAKeys == coroutine_suspended) {
                return coroutine_suspended;
            }
            eglobalRemoteDataSourceImpl = this;
            response = (Response) rSAKeys;
            if (response.isSuccessful()) {
                List list2 = (List) response.body();
                if (list2 != null) {
                }
            }
            ErrorHandler errorHandler2 = eglobalRemoteDataSourceImpl.errorHandler;
            responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody != null) {
                strString = "";
            } else {
                strString = "";
            }
            return new Result.Failure(errorHandler2.getServerErrorByErrorBody(strString));
        } catch (Exception e7) {
            e = e7;
            eglobalRemoteDataSourceImpl = this;
            return new Result.Failure(eglobalRemoteDataSourceImpl.errorHandler.getError(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004c, B:25:0x0054, B:27:0x005c, B:31:0x0070, B:33:0x007a, B:36:0x0082), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x005c A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004c, B:25:0x0054, B:27:0x005c, B:31:0x0070, B:33:0x007a, B:36:0x0082), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070 A[Catch: Exception -> 0x002d, TRY_ENTER, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004c, B:25:0x0054, B:27:0x005c, B:31:0x0070, B:33:0x007a, B:36:0x0082), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0080  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.domain.datasource.EglobalRemoteDataSource
    @Nullable
    public Object initializeKeys(@NotNull String str, @NotNull TerminalKeysRequest terminalKeysRequest, @NotNull Continuation<? super Result<TerminalKeysResponse>> continuation) {
        C07651 c07651;
        EglobalRemoteDataSourceImpl eglobalRemoteDataSourceImpl;
        Response response;
        ResponseBody responseBodyErrorBody;
        String strString;
        if (continuation instanceof C07651) {
            c07651 = (C07651) continuation;
            int i10 = c07651.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07651.label = i10 - Integer.MIN_VALUE;
            } else {
                c07651 = new C07651(continuation);
            }
        } else {
            c07651 = new C07651(continuation);
        }
        Object objInitializeKeys = c07651.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07651.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eglobalRemoteDataSourceImpl = (EglobalRemoteDataSourceImpl) c07651.L$0;
            try {
                ResultKt.throwOnFailure(objInitializeKeys);
                response = (Response) objInitializeKeys;
                if (response.isSuccessful()) {
                    TerminalKeysResponseDto terminalKeysResponseDto = (TerminalKeysResponseDto) response.body();
                    return terminalKeysResponseDto != null ? new Result.Success(TerminalKeysMapperKt.mapToLocalTerminalKeys(terminalKeysResponseDto), null, 2, null) : new Result.Failure(Error.Unknown.INSTANCE);
                }
                ErrorHandler errorHandler = eglobalRemoteDataSourceImpl.errorHandler;
                responseBodyErrorBody = response.errorBody();
                if (responseBodyErrorBody != null || (strString = responseBodyErrorBody.string()) == null) {
                    strString = "";
                }
                return new Result.Failure(errorHandler.getServerErrorByErrorBody(strString));
            } catch (Exception e5) {
                e = e5;
                return new Result.Failure(eglobalRemoteDataSourceImpl.errorHandler.getError(e));
            }
        }
        ResultKt.throwOnFailure(objInitializeKeys);
        try {
            OpenPayAPI openPayAPI = this.openPayAPI;
            TerminalKeysRequestDto terminalKeysRequestDtoMapToTerminalKeysRequestDto = TerminalKeysMapperKt.mapToTerminalKeysRequestDto(terminalKeysRequest);
            c07651.L$0 = this;
            c07651.label = 1;
            objInitializeKeys = openPayAPI.initializeKeys(str, terminalKeysRequestDtoMapToTerminalKeysRequestDto, c07651);
            if (objInitializeKeys == coroutine_suspended) {
                return coroutine_suspended;
            }
            eglobalRemoteDataSourceImpl = this;
            response = (Response) objInitializeKeys;
            if (response.isSuccessful()) {
                TerminalKeysResponseDto terminalKeysResponseDto2 = (TerminalKeysResponseDto) response.body();
                if (terminalKeysResponseDto2 != null) {
                }
            }
            ErrorHandler errorHandler2 = eglobalRemoteDataSourceImpl.errorHandler;
            responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody != null) {
                strString = "";
            } else {
                strString = "";
            }
            return new Result.Failure(errorHandler2.getServerErrorByErrorBody(strString));
        } catch (Exception e7) {
            e = e7;
            eglobalRemoteDataSourceImpl = this;
            return new Result.Failure(eglobalRemoteDataSourceImpl.errorHandler.getError(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004c, B:25:0x0054, B:26:0x0060, B:28:0x006a, B:31:0x0072), top: B:37:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0060 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004c, B:25:0x0054, B:26:0x0060, B:28:0x006a, B:31:0x0072), top: B:37:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.domain.datasource.EglobalRemoteDataSource
    @Nullable
    public Object reverse(@NotNull ReverseRequest reverseRequest, @NotNull String str, @NotNull Continuation<? super Result<Boolean>> continuation) {
        C07661 c07661;
        EglobalRemoteDataSourceImpl eglobalRemoteDataSourceImpl;
        Response response;
        ResponseBody responseBodyErrorBody;
        String strString;
        if (continuation instanceof C07661) {
            c07661 = (C07661) continuation;
            int i10 = c07661.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07661.label = i10 - Integer.MIN_VALUE;
            } else {
                c07661 = new C07661(continuation);
            }
        } else {
            c07661 = new C07661(continuation);
        }
        Object objReverse = c07661.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07661.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eglobalRemoteDataSourceImpl = (EglobalRemoteDataSourceImpl) c07661.L$0;
            try {
                ResultKt.throwOnFailure(objReverse);
                response = (Response) objReverse;
                if (response.isSuccessful()) {
                    return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
                }
                ErrorHandler errorHandler = eglobalRemoteDataSourceImpl.errorHandler;
                responseBodyErrorBody = response.errorBody();
                if (responseBodyErrorBody != null || (strString = responseBodyErrorBody.string()) == null) {
                    strString = "";
                }
                return new Result.Failure(errorHandler.getServerErrorByErrorBody(strString));
            } catch (Exception e5) {
                e = e5;
                return new Result.Failure(eglobalRemoteDataSourceImpl.errorHandler.getError(e));
            }
        }
        ResultKt.throwOnFailure(objReverse);
        try {
            OpenPayAPI openPayAPI = this.openPayAPI;
            ReverseRequestDto reverseRequestDtoMapToReverseRequestDto = ReverseChargeMapperKt.mapToReverseRequestDto(reverseRequest);
            c07661.L$0 = this;
            c07661.label = 1;
            objReverse = openPayAPI.reverse(str, reverseRequestDtoMapToReverseRequestDto, c07661);
            if (objReverse == coroutine_suspended) {
                return coroutine_suspended;
            }
            eglobalRemoteDataSourceImpl = this;
            response = (Response) objReverse;
            if (response.isSuccessful()) {
                return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
            }
            ErrorHandler errorHandler2 = eglobalRemoteDataSourceImpl.errorHandler;
            responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody != null) {
                strString = "";
            } else {
                strString = "";
            }
            return new Result.Failure(errorHandler2.getServerErrorByErrorBody(strString));
        } catch (Exception e7) {
            e = e7;
            eglobalRemoteDataSourceImpl = this;
            return new Result.Failure(eglobalRemoteDataSourceImpl.errorHandler.getError(e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004c, B:25:0x0054, B:27:0x005c, B:31:0x0070, B:33:0x007a, B:36:0x0082), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x005c A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004c, B:25:0x0054, B:27:0x005c, B:31:0x0070, B:33:0x007a, B:36:0x0082), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070 A[Catch: Exception -> 0x002d, TRY_ENTER, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:23:0x004c, B:25:0x0054, B:27:0x005c, B:31:0x0070, B:33:0x007a, B:36:0x0082), top: B:42:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0080  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.domain.datasource.EglobalRemoteDataSource
    @Nullable
    public Object updateTerminalCapacity(@NotNull TerminalCapacity terminalCapacity, @NotNull Continuation<? super Result<Boolean>> continuation) {
        C07671 c07671;
        EglobalRemoteDataSourceImpl eglobalRemoteDataSourceImpl;
        Response response;
        ResponseBody responseBodyErrorBody;
        String strString;
        if (continuation instanceof C07671) {
            c07671 = (C07671) continuation;
            int i10 = c07671.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07671.label = i10 - Integer.MIN_VALUE;
            } else {
                c07671 = new C07671(continuation);
            }
        } else {
            c07671 = new C07671(continuation);
        }
        Object objUpdateTerminalCapacity = c07671.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07671.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eglobalRemoteDataSourceImpl = (EglobalRemoteDataSourceImpl) c07671.L$0;
            try {
                ResultKt.throwOnFailure(objUpdateTerminalCapacity);
                response = (Response) objUpdateTerminalCapacity;
                if (response.isSuccessful()) {
                    return ((RSAKeyResponseDto) response.body()) != null ? new Result.Success(Boxing.boxBoolean(true), null, 2, null) : new Result.Failure(Error.Unknown.INSTANCE);
                }
                ErrorHandler errorHandler = eglobalRemoteDataSourceImpl.errorHandler;
                responseBodyErrorBody = response.errorBody();
                if (responseBodyErrorBody != null || (strString = responseBodyErrorBody.string()) == null) {
                    strString = "";
                }
                return new Result.Failure(errorHandler.getServerErrorByErrorBody(strString));
            } catch (Exception e5) {
                e = e5;
                return new Result.Failure(eglobalRemoteDataSourceImpl.errorHandler.getError(e));
            }
        }
        ResultKt.throwOnFailure(objUpdateTerminalCapacity);
        try {
            OpenPayAPI openPayAPI = this.openPayAPI;
            TerminalCapacityRequestDto terminalCapacityRequestDtoMapToTerminalCapacityRequestDto = TerminalCapacityMapperKt.mapToTerminalCapacityRequestDto(terminalCapacity);
            c07671.L$0 = this;
            c07671.label = 1;
            objUpdateTerminalCapacity = openPayAPI.updateTerminalCapacity(terminalCapacityRequestDtoMapToTerminalCapacityRequestDto, c07671);
            if (objUpdateTerminalCapacity == coroutine_suspended) {
                return coroutine_suspended;
            }
            eglobalRemoteDataSourceImpl = this;
            response = (Response) objUpdateTerminalCapacity;
            if (response.isSuccessful()) {
                if (((RSAKeyResponseDto) response.body()) != null) {
                }
            }
            ErrorHandler errorHandler2 = eglobalRemoteDataSourceImpl.errorHandler;
            responseBodyErrorBody = response.errorBody();
            if (responseBodyErrorBody != null) {
                strString = "";
            } else {
                strString = "";
            }
            return new Result.Failure(errorHandler2.getServerErrorByErrorBody(strString));
        } catch (Exception e7) {
            e = e7;
            eglobalRemoteDataSourceImpl = this;
            return new Result.Failure(eglobalRemoteDataSourceImpl.errorHandler.getError(e));
        }
    }
}
