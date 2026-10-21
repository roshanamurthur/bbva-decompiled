package mx.openpay.library.data.datasource.local;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.data.datasource.local.database.dao.BinDao;
import mx.openpay.library.data.datasource.local.database.dao.ConnectedDeviceDao;
import mx.openpay.library.data.datasource.local.database.dao.MerchantDao;
import mx.openpay.library.data.datasource.local.database.dao.MerchantSlotDao;
import mx.openpay.library.data.datasource.local.database.entity.MerchantEntity;
import mx.openpay.library.data.datasource.local.database.entity.MerchantSlotEntity;
import mx.openpay.library.data.mapper.eglobal.BinesMapperKt;
import mx.openpay.library.data.mapper.eglobal.ConnectedDeviceMapperKt;
import mx.openpay.library.domain.bluetooth.model.eglobal.ConnectedDeviceQ8;
import mx.openpay.library.domain.datasource.EglobalLocalDataSource;
import mx.openpay.library.domain.model.eglobal.Bin;
import mx.openpay.library.domain.model.eglobal.Merchant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EglobalLocalDataSourceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000 52\u00020\u0001:\u00015B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0011\u0010\u000e\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J!\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00192\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010!J)\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020'H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010(J\u0019\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J!\u0010+\u001a\u00020'2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010,J!\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010/J)\u00100\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00101\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u00102J)\u00103\u001a\u00020\u00192\u0006\u00101\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u00104R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"Lmx/openpay/library/data/datasource/local/EglobalLocalDataSourceImpl;", "Lmx/openpay/library/domain/datasource/EglobalLocalDataSource;", "binDao", "Lmx/openpay/library/data/datasource/local/database/dao/BinDao;", "merchantDao", "Lmx/openpay/library/data/datasource/local/database/dao/MerchantDao;", "merchantSlotDao", "Lmx/openpay/library/data/datasource/local/database/dao/MerchantSlotDao;", "connectedDeviceDao", "Lmx/openpay/library/data/datasource/local/database/dao/ConnectedDeviceDao;", "(Lmx/openpay/library/data/datasource/local/database/dao/BinDao;Lmx/openpay/library/data/datasource/local/database/dao/MerchantDao;Lmx/openpay/library/data/datasource/local/database/dao/MerchantSlotDao;Lmx/openpay/library/data/datasource/local/database/dao/ConnectedDeviceDao;)V", "deleteAllLocalBines", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBinesCount", "getKeyInjectedDateBySerial", "", "serial", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchantKeyNameBySlot", "slotKey", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRenewKeyBySlotAndTerminal", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertConnectedDeviceInfo", "", "connectedDeviceQ8", "Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;", "(Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertLocalBines", "bines", "", "Lmx/openpay/library/domain/model/eglobal/Bin;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertMerchantDetails", "merchant", "Lmx/openpay/library/domain/model/eglobal/Merchant;", "deviceInfo", "isTop", "", "(Lmx/openpay/library/domain/model/eglobal/Merchant;Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isBinToBbvaPoints", "cardBin", "isMerchantSlotKeyValidated", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateKeyInjectedDateBySerial", "keyInjectedDate", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateMerchantSlotKeyInjectedBySlot", "status", "(ILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateRenewKeyBySlotAndTerminal", "(IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEglobalLocalDataSourceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EglobalLocalDataSourceImpl.kt\nmx/openpay/library/data/datasource/local/EglobalLocalDataSourceImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,119:1\n1855#2,2:120\n*S KotlinDebug\n*F\n+ 1 EglobalLocalDataSourceImpl.kt\nmx/openpay/library/data/datasource/local/EglobalLocalDataSourceImpl\n*L\n26#1:120,2\n*E\n"})
public final class EglobalLocalDataSourceImpl implements EglobalLocalDataSource {

    @NotNull
    private static final String BANCOMER_POINTS_TYPE = "BANCOMER";

    @NotNull
    private static final String BBVA_BANK_CODE = "012";

    @NotNull
    private final BinDao binDao;

    @NotNull
    private final ConnectedDeviceDao connectedDeviceDao;

    @NotNull
    private final MerchantDao merchantDao;

    @NotNull
    private final MerchantSlotDao merchantSlotDao;

    public EglobalLocalDataSourceImpl(@NotNull BinDao binDao, @NotNull MerchantDao merchantDao, @NotNull MerchantSlotDao merchantSlotDao, @NotNull ConnectedDeviceDao connectedDeviceDao) {
        Intrinsics.checkNotNullParameter(binDao, "binDao");
        Intrinsics.checkNotNullParameter(merchantDao, "merchantDao");
        Intrinsics.checkNotNullParameter(merchantSlotDao, "merchantSlotDao");
        Intrinsics.checkNotNullParameter(connectedDeviceDao, "connectedDeviceDao");
        this.binDao = binDao;
        this.merchantDao = merchantDao;
        this.merchantSlotDao = merchantSlotDao;
        this.connectedDeviceDao = connectedDeviceDao;
    }

    @Override // mx.openpay.library.domain.datasource.EglobalLocalDataSource
    @Nullable
    public Object deleteAllLocalBines(@NotNull Continuation<? super Integer> continuation) {
        return Boxing.boxInt(this.binDao.deleteAll());
    }

    @Override // mx.openpay.library.domain.datasource.EglobalLocalDataSource
    @Nullable
    public Object getBinesCount(@NotNull Continuation<? super Integer> continuation) {
        return Boxing.boxInt(this.binDao.getCount());
    }

    @Override // mx.openpay.library.domain.datasource.EglobalLocalDataSource
    @Nullable
    public Object getKeyInjectedDateBySerial(@NotNull String str, @NotNull Continuation<? super String> continuation) {
        return this.connectedDeviceDao.getKeyInjectedDateBySerial(str);
    }

    @Override // mx.openpay.library.domain.datasource.EglobalLocalDataSource
    @Nullable
    public Object getMerchantKeyNameBySlot(int i10, @NotNull Continuation<? super String> continuation) {
        return this.merchantDao.getMerchantKeyNameBySlot(i10);
    }

    @Override // mx.openpay.library.domain.datasource.EglobalLocalDataSource
    @Nullable
    public Object getRenewKeyBySlotAndTerminal(int i10, @NotNull String str, @NotNull Continuation<? super Integer> continuation) {
        return Boxing.boxInt(this.merchantSlotDao.getRenewKeyBySlotAndTerminal(i10, str));
    }

    @Override // mx.openpay.library.domain.datasource.EglobalLocalDataSource
    @Nullable
    public Object insertConnectedDeviceInfo(@NotNull ConnectedDeviceQ8 connectedDeviceQ8, @NotNull Continuation<? super Unit> continuation) {
        String keyInjectedDateBySerial = this.connectedDeviceDao.getKeyInjectedDateBySerial(connectedDeviceQ8.getSerial());
        this.connectedDeviceDao.insertConnectedDevice(ConnectedDeviceMapperKt.mapToDataBaseConnectedDeviceEntity(connectedDeviceQ8));
        if (!TextUtils.isEmpty(keyInjectedDateBySerial)) {
            this.connectedDeviceDao.updateKeyInjectedDateBySerial(keyInjectedDateBySerial, connectedDeviceQ8.getSerial());
        }
        return Unit.INSTANCE;
    }

    @Override // mx.openpay.library.domain.datasource.EglobalLocalDataSource
    @Nullable
    public Object insertLocalBines(@NotNull List<Bin> list, @NotNull Continuation<? super Unit> continuation) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.binDao.insertBin(BinesMapperKt.mapToDataBaseBin((Bin) it.next()));
        }
        return Unit.INSTANCE;
    }

    @Override // mx.openpay.library.domain.datasource.EglobalLocalDataSource
    @Nullable
    public Object insertMerchantDetails(@NotNull Merchant merchant, @NotNull ConnectedDeviceQ8 connectedDeviceQ8, boolean z10, @NotNull Continuation<? super Unit> continuation) {
        this.merchantDao.insertMerchant(new MerchantEntity(0, Integer.parseInt(merchant.getSlotKey().getSlotKey()), merchant.getMerchantName(), merchant.getSlotKey().getKeyName(), 0, 1, null));
        if (this.merchantSlotDao.getCountSlotInfoBySlotKeyAndSerialId(Integer.parseInt(merchant.getSlotKey().getSlotKey()), connectedDeviceQ8.getSerial()) == 0) {
            this.merchantSlotDao.insertMerchantSlot(new MerchantSlotEntity(0, 0, z10 ? 1 : 0, Integer.parseInt(merchant.getSlotKey().getSlotKey()), connectedDeviceQ8.getSerial(), 1, null));
        }
        return Unit.INSTANCE;
    }

    @Override // mx.openpay.library.domain.datasource.EglobalLocalDataSource
    @Nullable
    public Object isBinToBbvaPoints(@NotNull String str, @NotNull Continuation<? super Integer> continuation) {
        return Boxing.boxInt(this.binDao.validateIfBinIsBbvaPoints(str, BBVA_BANK_CODE, BANCOMER_POINTS_TYPE));
    }

    @Override // mx.openpay.library.domain.datasource.EglobalLocalDataSource
    @Nullable
    public Object isMerchantSlotKeyValidated(@NotNull String str, int i10, @NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(this.merchantSlotDao.isMerchantSlotKeyValidated(str, i10));
    }

    @Override // mx.openpay.library.domain.datasource.EglobalLocalDataSource
    @Nullable
    public Object updateKeyInjectedDateBySerial(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation) {
        this.connectedDeviceDao.updateKeyInjectedDateBySerial(str, str2);
        return Unit.INSTANCE;
    }

    @Override // mx.openpay.library.domain.datasource.EglobalLocalDataSource
    @Nullable
    public Object updateMerchantSlotKeyInjectedBySlot(int i10, @NotNull String str, int i11, @NotNull Continuation<? super Unit> continuation) {
        this.merchantSlotDao.updateMerchantSlotKeyInjectedBySlot(i10, str, i11);
        return Unit.INSTANCE;
    }

    @Override // mx.openpay.library.domain.datasource.EglobalLocalDataSource
    @Nullable
    public Object updateRenewKeyBySlotAndTerminal(int i10, int i11, @NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        this.merchantSlotDao.updateRenewKeyBySlotAndTerminal(i10, i11, str);
        return Unit.INSTANCE;
    }
}
