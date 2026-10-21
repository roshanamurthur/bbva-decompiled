package mx.openpay.library.data.mapper.eglobal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.datasource.local.database.entity.ConnectedDeviceEntity;
import mx.openpay.library.domain.bluetooth.model.eglobal.ConnectedDeviceQ8;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ConnectedDeviceMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"mapToDataBaseConnectedDeviceEntity", "Lmx/openpay/library/data/datasource/local/database/entity/ConnectedDeviceEntity;", "Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;", "data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ConnectedDeviceMapperKt {
    @NotNull
    public static final ConnectedDeviceEntity mapToDataBaseConnectedDeviceEntity(@NotNull ConnectedDeviceQ8 connectedDeviceQ8) {
        Intrinsics.checkNotNullParameter(connectedDeviceQ8, "<this>");
        return new ConnectedDeviceEntity(connectedDeviceQ8.getSerial(), connectedDeviceQ8.getFirmwareVersion(), connectedDeviceQ8.getBatteryCheck(), connectedDeviceQ8.getCodResponse(), connectedDeviceQ8.getCommand(), connectedDeviceQ8.getModel(), connectedDeviceQ8.getMessage(), connectedDeviceQ8.getStatus(), "", "", "");
    }
}
