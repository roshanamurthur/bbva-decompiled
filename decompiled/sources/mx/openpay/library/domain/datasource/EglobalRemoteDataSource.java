package mx.openpay.library.domain.datasource;

import com.bbva.notifications.constants.PushConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import mx.openpay.library.domain.model.CreateCharge;
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
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EglobalRemoteDataSource.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u000e\u001a\u00020\u000fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u0012\u001a\u00020\u0013H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J%\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00032\u0006\u0010\u0018\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\u0006\u0010\u001d\u001a\u00020\u001fH¦@ø\u0001\u0000¢\u0006\u0002\u0010 J-\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00160\u00032\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020%H¦@ø\u0001\u0000¢\u0006\u0002\u0010&J%\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00160\u00032\u0006\u0010$\u001a\u00020%H¦@ø\u0001\u0000¢\u0006\u0002\u0010(J\u001f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00032\u0006\u0010+\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010,J\u001d\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00160\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ'\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u00100\u001a\u000201H¦@ø\u0001\u0000¢\u0006\u0002\u00102J'\u00103\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u00104\u001a\u0002052\u0006\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u00106J\u001f\u00107\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u00108\u001a\u000209H¦@ø\u0001\u0000¢\u0006\u0002\u0010:\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006;"}, d2 = {"Lmx/openpay/library/domain/datasource/EglobalRemoteDataSource;", "", "executeCharge", "Lmx/openpay/library/domain/util/Result;", "Lmx/openpay/library/domain/model/eglobal/Charge;", "serial", "", "createCharge", "Lmx/openpay/library/domain/model/CreateCharge;", "isTop", "", "(Ljava/lang/String;Lmx/openpay/library/domain/model/CreateCharge;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeRefundCharge", "Lmx/openpay/library/domain/model/transaction/Transaction;", "refundRequest", "Lmx/openpay/library/domain/model/eglobal/RefundRequest;", "(Lmx/openpay/library/domain/model/eglobal/RefundRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "firmwareUpdateStatus", "firmware", "Lmx/openpay/library/domain/model/eglobal/FirmwareUpdateStatusRequest;", "(Lmx/openpay/library/domain/model/eglobal/FirmwareUpdateStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBines", "", "Lmx/openpay/library/domain/model/eglobal/Bin;", "forceUpdate", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFirmware", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchant", "Lmx/openpay/library/domain/model/eglobal/Merchant;", "Lmx/openpay/library/domain/model/eglobal/GetMerchant;", "(Lmx/openpay/library/domain/model/eglobal/GetMerchant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentPlans", "", "bin", PushConstants.AMOUNT, "", "(Ljava/lang/String;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentPlansWithoutBin", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRSAKeyBySlot", "Lmx/openpay/library/domain/model/eglobal/RSAKey;", "slot", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRSAKeys", "initializeKeys", "Lmx/openpay/library/domain/model/eglobal/TerminalKeysResponse;", "terminalKeysRequest", "Lmx/openpay/library/domain/model/eglobal/TerminalKeysRequest;", "(Ljava/lang/String;Lmx/openpay/library/domain/model/eglobal/TerminalKeysRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reverse", "reverseRequest", "Lmx/openpay/library/domain/model/eglobal/ReverseRequest;", "(Lmx/openpay/library/domain/model/eglobal/ReverseRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTerminalCapacity", "terminalCapacity", "Lmx/openpay/library/domain/model/eglobal/TerminalCapacity;", "(Lmx/openpay/library/domain/model/eglobal/TerminalCapacity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface EglobalRemoteDataSource {
    @Nullable
    Object executeCharge(@NotNull String str, @NotNull CreateCharge createCharge, boolean z10, @NotNull Continuation<? super Result<Charge>> continuation);

    @Nullable
    Object executeRefundCharge(@NotNull RefundRequest refundRequest, @NotNull Continuation<? super Result<Transaction>> continuation);

    @Nullable
    Object firmwareUpdateStatus(@NotNull FirmwareUpdateStatusRequest firmwareUpdateStatusRequest, @NotNull Continuation<? super Result<Boolean>> continuation);

    @Nullable
    Object getBines(boolean z10, @NotNull Continuation<? super Result<? extends List<Bin>>> continuation);

    @Nullable
    Object getFirmware(@NotNull Continuation<? super Result<byte[]>> continuation);

    @Nullable
    Object getMerchant(@NotNull GetMerchant getMerchant, @NotNull Continuation<? super Result<Merchant>> continuation);

    @Nullable
    Object getPaymentPlans(@NotNull String str, double d2, @NotNull Continuation<? super Result<? extends List<Integer>>> continuation);

    @Nullable
    Object getPaymentPlansWithoutBin(double d2, @NotNull Continuation<? super Result<? extends List<Integer>>> continuation);

    @Nullable
    Object getRSAKeyBySlot(@NotNull String str, @NotNull Continuation<? super Result<RSAKey>> continuation);

    @Nullable
    Object getRSAKeys(@NotNull Continuation<? super Result<? extends List<RSAKey>>> continuation);

    @Nullable
    Object initializeKeys(@NotNull String str, @NotNull TerminalKeysRequest terminalKeysRequest, @NotNull Continuation<? super Result<TerminalKeysResponse>> continuation);

    @Nullable
    Object reverse(@NotNull ReverseRequest reverseRequest, @NotNull String str, @NotNull Continuation<? super Result<Boolean>> continuation);

    @Nullable
    Object updateTerminalCapacity(@NotNull TerminalCapacity terminalCapacity, @NotNull Continuation<? super Result<Boolean>> continuation);
}
