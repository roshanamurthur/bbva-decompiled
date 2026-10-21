package mx.openpay.library.data.bluetooth.eglobal.mapper;

import com.google.android.material.internal.ViewUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.bluetooth.eglobal.model.Q8Response;
import mx.openpay.library.domain.bluetooth.model.eglobal.ConnectedDeviceQ8;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ConnectedDeviceQ8Mapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"mapToConnectedDeviceQ8", "Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;", "Lmx/openpay/library/data/bluetooth/eglobal/model/Q8Response;", "data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ConnectedDeviceQ8MapperKt {
    @NotNull
    public static final ConnectedDeviceQ8 mapToConnectedDeviceQ8(@NotNull Q8Response q8Response) {
        Intrinsics.checkNotNullParameter(q8Response, "<this>");
        return new ConnectedDeviceQ8(q8Response.getFirmwareVersion(), q8Response.getBatteryCheck(), q8Response.getCodResponse(), q8Response.getCommand(), q8Response.getModel(), q8Response.getMessage(), q8Response.getSerial(), q8Response.getStatus(), null, null, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
    }
}
