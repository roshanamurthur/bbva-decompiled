package mx.openpay.library.data.repository;

import com.bbva.notifications.constants.PushConstants;
import ek.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.bluetooth.model.eglobal.ConnectedDeviceQ8;
import mx.openpay.library.domain.datasource.EglobalLocalDataSource;
import mx.openpay.library.domain.datasource.EglobalRemoteDataSource;
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
import mx.openpay.library.domain.repository.EglobalRepository;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EglobalRepositoryImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tJ/\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ%\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u000b2\u0006\u0010 \u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0011\u0010\"\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0019\u0010%\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010&J!\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010)J\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u000b2\u0006\u0010*\u001a\u00020,H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010-J\u0019\u0010.\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010/J-\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001e0\u000b2\u0006\u00101\u001a\u00020\u000e2\u0006\u00102\u001a\u000203H\u0096@ø\u0001\u0000¢\u0006\u0002\u00104J%\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001e0\u000b2\u0006\u00102\u001a\u000203H\u0096@ø\u0001\u0000¢\u0006\u0002\u00106J\u001f\u00107\u001a\b\u0012\u0004\u0012\u0002080\u000b2\u0006\u00109\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010&J\u001d\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u001e0\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tJ'\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020>H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010?J\u0019\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010DJ\u001f\u0010E\u001a\u00020A2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010GJ)\u0010H\u001a\u00020A2\u0006\u0010I\u001a\u00020+2\u0006\u0010J\u001a\u00020C2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010KJ\u0019\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010&J!\u0010N\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010OJ'\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\u0006\u0010Q\u001a\u00020R2\u0006\u0010\r\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010SJ!\u0010T\u001a\u00020A2\u0006\u0010U\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010VJ)\u0010W\u001a\u00020A2\u0006\u0010X\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010YJ)\u0010Z\u001a\u00020A2\u0006\u0010(\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010[J\u001f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\u0006\u0010]\u001a\u00020^H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010_R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006`"}, d2 = {"Lmx/openpay/library/data/repository/EglobalRepositoryImpl;", "Lmx/openpay/library/domain/repository/EglobalRepository;", "remoteDataSource", "Lmx/openpay/library/domain/datasource/EglobalRemoteDataSource;", "localDataSource", "Lmx/openpay/library/domain/datasource/EglobalLocalDataSource;", "(Lmx/openpay/library/domain/datasource/EglobalRemoteDataSource;Lmx/openpay/library/domain/datasource/EglobalLocalDataSource;)V", "deleteAllLocalBines", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeCharge", "Lmx/openpay/library/domain/util/Result;", "Lmx/openpay/library/domain/model/eglobal/Charge;", "serial", "", "createCharge", "Lmx/openpay/library/domain/model/CreateCharge;", "isTop", "", "(Ljava/lang/String;Lmx/openpay/library/domain/model/CreateCharge;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeRefundCharge", "Lmx/openpay/library/domain/model/transaction/Transaction;", "refundRequest", "Lmx/openpay/library/domain/model/eglobal/RefundRequest;", "(Lmx/openpay/library/domain/model/eglobal/RefundRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "firmwareUpdateStatus", "firmware", "Lmx/openpay/library/domain/model/eglobal/FirmwareUpdateStatusRequest;", "(Lmx/openpay/library/domain/model/eglobal/FirmwareUpdateStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBines", "", "Lmx/openpay/library/domain/model/eglobal/Bin;", "forceUpdate", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBinesCount", "getFirmware", "", "getKeyInjectedDateBySerial", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocalRenewKeyBySlotAndTerminal", "slotKey", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchant", "Lmx/openpay/library/domain/model/eglobal/Merchant;", "Lmx/openpay/library/domain/model/eglobal/GetMerchant;", "(Lmx/openpay/library/domain/model/eglobal/GetMerchant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchantKeyNameBySlot", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentPlans", "bin", PushConstants.AMOUNT, "", "(Ljava/lang/String;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentPlansWithoutBin", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRSAKeyBySlot", "Lmx/openpay/library/domain/model/eglobal/RSAKey;", "slot", "getRSAKeys", "initializeKeys", "Lmx/openpay/library/domain/model/eglobal/TerminalKeysResponse;", "terminalKeysRequest", "Lmx/openpay/library/domain/model/eglobal/TerminalKeysRequest;", "(Ljava/lang/String;Lmx/openpay/library/domain/model/eglobal/TerminalKeysRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertConnectedDeviceInfo", "", "connectedDeviceQ8", "Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;", "(Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertLocalBines", "bines", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertLocalMerchantDetails", "merchant", "deviceInfo", "(Lmx/openpay/library/domain/model/eglobal/Merchant;Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isBinToBbvaPoints", "cardBin", "isMerchantSlotKeyValidated", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reverse", "reverseRequest", "Lmx/openpay/library/domain/model/eglobal/ReverseRequest;", "(Lmx/openpay/library/domain/model/eglobal/ReverseRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateKeyInjectedDateBySerial", "keyInjectedDate", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateLocalRenewKeyBySlotAndTerminal", "status", "(IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateMerchantSlotKeyInjectedBySlot", "(ILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTerminalCapacity", "terminalCapacity", "Lmx/openpay/library/domain/model/eglobal/TerminalCapacity;", "(Lmx/openpay/library/domain/model/eglobal/TerminalCapacity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EglobalRepositoryImpl implements EglobalRepository {

    @NotNull
    private final EglobalLocalDataSource localDataSource;

    @NotNull
    private final EglobalRemoteDataSource remoteDataSource;

    public EglobalRepositoryImpl(@NotNull EglobalRemoteDataSource remoteDataSource, @NotNull EglobalLocalDataSource localDataSource) {
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        this.remoteDataSource = remoteDataSource;
        this.localDataSource = localDataSource;
    }

    @Override // mx.openpay.library.domain.repository.EglobalRepository
    @Nullable
    public Object deleteAllLocalBines(@NotNull Continuation<? super Integer> continuation) {
        return this.localDataSource.deleteAllLocalBines(continuation);
    }

    @Override // mx.openpay.library.domain.repository.EglobalRepository
    @Nullable
    public Object executeCharge(@NotNull String str, @NotNull CreateCharge createCharge, boolean z10, @NotNull Continuation<? super Result<Charge>> continuation) {
        return this.remoteDataSource.executeCharge(str, createCharge, z10, continuation);
    }

    @Override // mx.openpay.library.domain.repository.EglobalRepository
    @Nullable
    public Object executeRefundCharge(@NotNull RefundRequest refundRequest, @NotNull Continuation<? super Result<Transaction>> continuation) {
        return this.remoteDataSource.executeRefundCharge(refundRequest, continuation);
    }

    @Override // mx.openpay.library.domain.repository.EglobalRepository
    @Nullable
    public Object firmwareUpdateStatus(@NotNull FirmwareUpdateStatusRequest firmwareUpdateStatusRequest, @NotNull Continuation<? super Result<Boolean>> continuation) {
        return this.remoteDataSource.firmwareUpdateStatus(firmwareUpdateStatusRequest, continuation);
    }

    @Override // mx.openpay.library.domain.repository.EglobalRepository
    @Nullable
    public Object getBines(boolean z10, @NotNull Continuation<? super Result<? extends List<Bin>>> continuation) {
        return this.remoteDataSource.getBines(z10, continuation);
    }

    @Override // mx.openpay.library.domain.repository.EglobalRepository
    @Nullable
    public Object getBinesCount(@NotNull Continuation<? super Integer> continuation) {
        return this.localDataSource.getBinesCount(continuation);
    }

    @Override // mx.openpay.library.domain.repository.EglobalRepository
    @Nullable
    public Object getFirmware(@NotNull Continuation<? super Result<byte[]>> continuation) {
        return this.remoteDataSource.getFirmware(continuation);
    }

    @Override // mx.openpay.library.domain.repository.EglobalRepository
    @Nullable
    public Object getKeyInjectedDateBySerial(@NotNull String str, @NotNull Continuation<? super String> continuation) {
        return this.localDataSource.getKeyInjectedDateBySerial(str, continuation);
    }

    @Override // mx.openpay.library.domain.repository.EglobalRepository
    @Nullable
    public Object getLocalRenewKeyBySlotAndTerminal(int i10, @NotNull String str, @NotNull Continuation<? super Integer> continuation) {
        return this.localDataSource.getRenewKeyBySlotAndTerminal(i10, str, continuation);
    }

    @Override // mx.openpay.library.domain.repository.EglobalRepository
    @Nullable
    public Object getMerchant(@NotNull GetMerchant getMerchant, @NotNull Continuation<? super Result<Merchant>> continuation) {
        return this.remoteDataSource.getMerchant(getMerchant, continuation);
    }

    @Override // mx.openpay.library.domain.repository.EglobalRepository
    @Nullable
    public Object getMerchantKeyNameBySlot(int i10, @NotNull Continuation<? super String> continuation) {
        return this.localDataSource.getMerchantKeyNameBySlot(i10, continuation);
    }

    @Override // mx.openpay.library.domain.repository.EglobalRepository
    @Nullable
    public Object getPaymentPlans(@NotNull String str, double d2, @NotNull Continuation<? super Result<? extends List<Integer>>> continuation) {
        return this.remoteDataSource.getPaymentPlans(str, d2, continuation);
    }

    @Override // mx.openpay.library.domain.repository.EglobalRepository
    @Nullable
    public Object getPaymentPlansWithoutBin(double d2, @NotNull Continuation<? super Result<? extends List<Integer>>> continuation) {
        return this.remoteDataSource.getPaymentPlansWithoutBin(d2, continuation);
    }

    @Override // mx.openpay.library.domain.repository.EglobalRepository
    @Nullable
    public Object getRSAKeyBySlot(@NotNull String str, @NotNull Continuation<? super Result<RSAKey>> continuation) {
        return this.remoteDataSource.getRSAKeyBySlot(str, continuation);
    }

    @Override // mx.openpay.library.domain.repository.EglobalRepository
    @Nullable
    public Object getRSAKeys(@NotNull Continuation<? super Result<? extends List<RSAKey>>> continuation) {
        return this.remoteDataSource.getRSAKeys(continuation);
    }

    @Override // mx.openpay.library.domain.repository.EglobalRepository
    @Nullable
    public Object initializeKeys(@NotNull String str, @NotNull TerminalKeysRequest terminalKeysRequest, @NotNull Continuation<? super Result<TerminalKeysResponse>> continuation) {
        return this.remoteDataSource.initializeKeys(str, terminalKeysRequest, continuation);
    }

    @Override // mx.openpay.library.domain.repository.EglobalRepository
    @Nullable
    public Object insertConnectedDeviceInfo(@NotNull ConnectedDeviceQ8 connectedDeviceQ8, @NotNull Continuation<? super Unit> continuation) {
        Object objInsertConnectedDeviceInfo = this.localDataSource.insertConnectedDeviceInfo(connectedDeviceQ8, continuation);
        return objInsertConnectedDeviceInfo == a.getCOROUTINE_SUSPENDED() ? objInsertConnectedDeviceInfo : Unit.INSTANCE;
    }

    @Override // mx.openpay.library.domain.repository.EglobalRepository
    @Nullable
    public Object insertLocalBines(@NotNull List<Bin> list, @NotNull Continuation<? super Unit> continuation) {
        Object objInsertLocalBines = this.localDataSource.insertLocalBines(list, continuation);
        return objInsertLocalBines == a.getCOROUTINE_SUSPENDED() ? objInsertLocalBines : Unit.INSTANCE;
    }

    @Override // mx.openpay.library.domain.repository.EglobalRepository
    @Nullable
    public Object insertLocalMerchantDetails(@NotNull Merchant merchant, @NotNull ConnectedDeviceQ8 connectedDeviceQ8, boolean z10, @NotNull Continuation<? super Unit> continuation) {
        Object objInsertMerchantDetails = this.localDataSource.insertMerchantDetails(merchant, connectedDeviceQ8, z10, continuation);
        return objInsertMerchantDetails == a.getCOROUTINE_SUSPENDED() ? objInsertMerchantDetails : Unit.INSTANCE;
    }

    @Override // mx.openpay.library.domain.repository.EglobalRepository
    @Nullable
    public Object isBinToBbvaPoints(@NotNull String str, @NotNull Continuation<? super Integer> continuation) {
        return this.localDataSource.isBinToBbvaPoints(str, continuation);
    }

    @Override // mx.openpay.library.domain.repository.EglobalRepository
    @Nullable
    public Object isMerchantSlotKeyValidated(@NotNull String str, int i10, @NotNull Continuation<? super Boolean> continuation) {
        return this.localDataSource.isMerchantSlotKeyValidated(str, i10, continuation);
    }

    @Override // mx.openpay.library.domain.repository.EglobalRepository
    @Nullable
    public Object reverse(@NotNull ReverseRequest reverseRequest, @NotNull String str, @NotNull Continuation<? super Result<Boolean>> continuation) {
        return this.remoteDataSource.reverse(reverseRequest, str, continuation);
    }

    @Override // mx.openpay.library.domain.repository.EglobalRepository
    @Nullable
    public Object updateKeyInjectedDateBySerial(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation) {
        Object objUpdateKeyInjectedDateBySerial = this.localDataSource.updateKeyInjectedDateBySerial(str, str2, continuation);
        return objUpdateKeyInjectedDateBySerial == a.getCOROUTINE_SUSPENDED() ? objUpdateKeyInjectedDateBySerial : Unit.INSTANCE;
    }

    @Override // mx.openpay.library.domain.repository.EglobalRepository
    @Nullable
    public Object updateLocalRenewKeyBySlotAndTerminal(int i10, int i11, @NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        Object objUpdateRenewKeyBySlotAndTerminal = this.localDataSource.updateRenewKeyBySlotAndTerminal(i10, i11, str, continuation);
        return objUpdateRenewKeyBySlotAndTerminal == a.getCOROUTINE_SUSPENDED() ? objUpdateRenewKeyBySlotAndTerminal : Unit.INSTANCE;
    }

    @Override // mx.openpay.library.domain.repository.EglobalRepository
    @Nullable
    public Object updateMerchantSlotKeyInjectedBySlot(int i10, @NotNull String str, int i11, @NotNull Continuation<? super Unit> continuation) {
        Object objUpdateMerchantSlotKeyInjectedBySlot = this.localDataSource.updateMerchantSlotKeyInjectedBySlot(i10, str, i11, continuation);
        return objUpdateMerchantSlotKeyInjectedBySlot == a.getCOROUTINE_SUSPENDED() ? objUpdateMerchantSlotKeyInjectedBySlot : Unit.INSTANCE;
    }

    @Override // mx.openpay.library.domain.repository.EglobalRepository
    @Nullable
    public Object updateTerminalCapacity(@NotNull TerminalCapacity terminalCapacity, @NotNull Continuation<? super Result<Boolean>> continuation) {
        return this.remoteDataSource.updateTerminalCapacity(terminalCapacity, continuation);
    }
}
