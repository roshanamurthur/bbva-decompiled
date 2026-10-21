package mx.openpay.library.core.mapper;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.OpenPayDeviceNFCStatus;
import mx.openpay.library.domain.model.taponphone.DeviceNFCStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"mapToLibraryModel", "Lmx/openpay/library/core/model/OpenPayDeviceNFCStatus;", "Lmx/openpay/library/domain/model/taponphone/DeviceNFCStatus;", "library_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DeviceNFCStatusMapperKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeviceNFCStatus.values().length];
            try {
                iArr[DeviceNFCStatus.NO_NFC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceNFCStatus.NFC_DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceNFCStatus.NFC_ENABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final OpenPayDeviceNFCStatus mapToLibraryModel(@NotNull DeviceNFCStatus deviceNFCStatus) {
        Intrinsics.checkNotNullParameter(deviceNFCStatus, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[deviceNFCStatus.ordinal()];
        if (i10 == 1) {
            return OpenPayDeviceNFCStatus.NO_NFC;
        }
        if (i10 == 2) {
            return OpenPayDeviceNFCStatus.NFC_DISABLED;
        }
        if (i10 == 3) {
            return OpenPayDeviceNFCStatus.NFC_ENABLED;
        }
        throw new NoWhenBranchMatchedException();
    }
}
