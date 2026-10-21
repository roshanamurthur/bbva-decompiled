package mx.openpay.library.domain.datasource;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import mx.openpay.library.domain.bluetooth.model.eglobal.ConnectedDeviceQ8;
import mx.openpay.library.domain.model.eglobal.Bin;
import mx.openpay.library.domain.model.eglobal.Merchant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EglobalLocalDataSource.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\fJ!\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J)\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u0019\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\tJ!\u0010\"\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010#J!\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010&J)\u0010'\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010)J)\u0010*\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lmx/openpay/library/domain/datasource/EglobalLocalDataSource;", "", "deleteAllLocalBines", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBinesCount", "getKeyInjectedDateBySerial", "", "serial", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchantKeyNameBySlot", "slotKey", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRenewKeyBySlotAndTerminal", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertConnectedDeviceInfo", "", "connectedDeviceQ8", "Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;", "(Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertLocalBines", "bines", "", "Lmx/openpay/library/domain/model/eglobal/Bin;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertMerchantDetails", "merchant", "Lmx/openpay/library/domain/model/eglobal/Merchant;", "deviceInfo", "isTop", "", "(Lmx/openpay/library/domain/model/eglobal/Merchant;Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isBinToBbvaPoints", "cardBin", "isMerchantSlotKeyValidated", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateKeyInjectedDateBySerial", "keyInjectedDate", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateMerchantSlotKeyInjectedBySlot", "status", "(ILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateRenewKeyBySlotAndTerminal", "(IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface EglobalLocalDataSource {
    @Nullable
    Object deleteAllLocalBines(@NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object getBinesCount(@NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object getKeyInjectedDateBySerial(@NotNull String str, @NotNull Continuation<? super String> continuation);

    @Nullable
    Object getMerchantKeyNameBySlot(int i10, @NotNull Continuation<? super String> continuation);

    @Nullable
    Object getRenewKeyBySlotAndTerminal(int i10, @NotNull String str, @NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object insertConnectedDeviceInfo(@NotNull ConnectedDeviceQ8 connectedDeviceQ8, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object insertLocalBines(@NotNull List<Bin> list, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object insertMerchantDetails(@NotNull Merchant merchant, @NotNull ConnectedDeviceQ8 connectedDeviceQ8, boolean z10, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object isBinToBbvaPoints(@NotNull String str, @NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object isMerchantSlotKeyValidated(@NotNull String str, int i10, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object updateKeyInjectedDateBySerial(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object updateMerchantSlotKeyInjectedBySlot(int i10, @NotNull String str, int i11, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object updateRenewKeyBySlotAndTerminal(int i10, int i11, @NotNull String str, @NotNull Continuation<? super Unit> continuation);
}
