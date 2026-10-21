package mx.openpay.library.domain.repository;

import com.bbva.notifications.constants.PushConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import mx.openpay.library.domain.bluetooth.model.eglobal.ConnectedDeviceQ8;
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

/* JADX INFO: compiled from: EglobalRepository.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u0011\u001a\u00020\u0012H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u0015\u001a\u00020\u0016H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J%\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00062\u0006\u0010\u001b\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u0011\u0010\u001d\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010 \u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0002\u0010!J!\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0002\u0010$J\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00062\u0006\u0010%\u001a\u00020'H¦@ø\u0001\u0000¢\u0006\u0002\u0010(J\u0019\u0010)\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010*J-\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00190\u00062\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020.H¦@ø\u0001\u0000¢\u0006\u0002\u0010/J%\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00190\u00062\u0006\u0010-\u001a\u00020.H¦@ø\u0001\u0000¢\u0006\u0002\u00101J\u001f\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00062\u0006\u00104\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0002\u0010!J\u001d\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00190\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J'\u00106\u001a\b\u0012\u0004\u0012\u0002070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u00108\u001a\u000209H¦@ø\u0001\u0000¢\u0006\u0002\u0010:J\u0019\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H¦@ø\u0001\u0000¢\u0006\u0002\u0010?J\u001f\u0010@\u001a\u00020<2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H¦@ø\u0001\u0000¢\u0006\u0002\u0010BJ)\u0010C\u001a\u00020<2\u0006\u0010D\u001a\u00020&2\u0006\u0010E\u001a\u00020>2\u0006\u0010\f\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010FJ\u0019\u0010G\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0002\u0010!J!\u0010I\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010JJ'\u0010K\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010L\u001a\u00020M2\u0006\u0010\b\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0002\u0010NJ!\u0010O\u001a\u00020<2\u0006\u0010P\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0002\u0010QJ)\u0010R\u001a\u00020<2\u0006\u0010S\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0002\u0010TJ)\u0010U\u001a\u00020<2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010S\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010VJ\u001f\u0010W\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010X\u001a\u00020YH¦@ø\u0001\u0000¢\u0006\u0002\u0010Z\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006["}, d2 = {"Lmx/openpay/library/domain/repository/EglobalRepository;", "", "deleteAllLocalBines", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeCharge", "Lmx/openpay/library/domain/util/Result;", "Lmx/openpay/library/domain/model/eglobal/Charge;", "serial", "", "createCharge", "Lmx/openpay/library/domain/model/CreateCharge;", "isTop", "", "(Ljava/lang/String;Lmx/openpay/library/domain/model/CreateCharge;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeRefundCharge", "Lmx/openpay/library/domain/model/transaction/Transaction;", "refundRequest", "Lmx/openpay/library/domain/model/eglobal/RefundRequest;", "(Lmx/openpay/library/domain/model/eglobal/RefundRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "firmwareUpdateStatus", "firmware", "Lmx/openpay/library/domain/model/eglobal/FirmwareUpdateStatusRequest;", "(Lmx/openpay/library/domain/model/eglobal/FirmwareUpdateStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBines", "", "Lmx/openpay/library/domain/model/eglobal/Bin;", "forceUpdate", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBinesCount", "getFirmware", "", "getKeyInjectedDateBySerial", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocalRenewKeyBySlotAndTerminal", "slotKey", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchant", "Lmx/openpay/library/domain/model/eglobal/Merchant;", "Lmx/openpay/library/domain/model/eglobal/GetMerchant;", "(Lmx/openpay/library/domain/model/eglobal/GetMerchant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchantKeyNameBySlot", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentPlans", "bin", PushConstants.AMOUNT, "", "(Ljava/lang/String;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentPlansWithoutBin", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRSAKeyBySlot", "Lmx/openpay/library/domain/model/eglobal/RSAKey;", "slot", "getRSAKeys", "initializeKeys", "Lmx/openpay/library/domain/model/eglobal/TerminalKeysResponse;", "terminalKeysRequest", "Lmx/openpay/library/domain/model/eglobal/TerminalKeysRequest;", "(Ljava/lang/String;Lmx/openpay/library/domain/model/eglobal/TerminalKeysRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertConnectedDeviceInfo", "", "connectedDeviceQ8", "Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;", "(Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertLocalBines", "bines", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertLocalMerchantDetails", "merchant", "deviceInfo", "(Lmx/openpay/library/domain/model/eglobal/Merchant;Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isBinToBbvaPoints", "cardBin", "isMerchantSlotKeyValidated", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reverse", "reverseRequest", "Lmx/openpay/library/domain/model/eglobal/ReverseRequest;", "(Lmx/openpay/library/domain/model/eglobal/ReverseRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateKeyInjectedDateBySerial", "keyInjectedDate", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateLocalRenewKeyBySlotAndTerminal", "status", "(IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateMerchantSlotKeyInjectedBySlot", "(ILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTerminalCapacity", "terminalCapacity", "Lmx/openpay/library/domain/model/eglobal/TerminalCapacity;", "(Lmx/openpay/library/domain/model/eglobal/TerminalCapacity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface EglobalRepository {
    @Nullable
    Object deleteAllLocalBines(@NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object executeCharge(@NotNull String str, @NotNull CreateCharge createCharge, boolean z10, @NotNull Continuation<? super Result<Charge>> continuation);

    @Nullable
    Object executeRefundCharge(@NotNull RefundRequest refundRequest, @NotNull Continuation<? super Result<Transaction>> continuation);

    @Nullable
    Object firmwareUpdateStatus(@NotNull FirmwareUpdateStatusRequest firmwareUpdateStatusRequest, @NotNull Continuation<? super Result<Boolean>> continuation);

    @Nullable
    Object getBines(boolean z10, @NotNull Continuation<? super Result<? extends List<Bin>>> continuation);

    @Nullable
    Object getBinesCount(@NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object getFirmware(@NotNull Continuation<? super Result<byte[]>> continuation);

    @Nullable
    Object getKeyInjectedDateBySerial(@NotNull String str, @NotNull Continuation<? super String> continuation);

    @Nullable
    Object getLocalRenewKeyBySlotAndTerminal(int i10, @NotNull String str, @NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object getMerchant(@NotNull GetMerchant getMerchant, @NotNull Continuation<? super Result<Merchant>> continuation);

    @Nullable
    Object getMerchantKeyNameBySlot(int i10, @NotNull Continuation<? super String> continuation);

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
    Object insertConnectedDeviceInfo(@NotNull ConnectedDeviceQ8 connectedDeviceQ8, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object insertLocalBines(@NotNull List<Bin> list, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object insertLocalMerchantDetails(@NotNull Merchant merchant, @NotNull ConnectedDeviceQ8 connectedDeviceQ8, boolean z10, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object isBinToBbvaPoints(@NotNull String str, @NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object isMerchantSlotKeyValidated(@NotNull String str, int i10, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object reverse(@NotNull ReverseRequest reverseRequest, @NotNull String str, @NotNull Continuation<? super Result<Boolean>> continuation);

    @Nullable
    Object updateKeyInjectedDateBySerial(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object updateLocalRenewKeyBySlotAndTerminal(int i10, int i11, @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object updateMerchantSlotKeyInjectedBySlot(int i10, @NotNull String str, int i11, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object updateTerminalCapacity(@NotNull TerminalCapacity terminalCapacity, @NotNull Continuation<? super Result<Boolean>> continuation);
}
