package mx.openpay.library.core.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.extra.DeviceDTO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lmx/openpay/library/core/model/OpenPayScanState;", "", "()V", "Scanning", "Success", "Lmx/openpay/library/core/model/OpenPayScanState$Scanning;", "Lmx/openpay/library/core/model/OpenPayScanState$Success;", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class OpenPayScanState {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lmx/openpay/library/core/model/OpenPayScanState$Scanning;", "Lmx/openpay/library/core/model/OpenPayScanState;", "()V", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Scanning extends OpenPayScanState {
        public static final int $stable = 0;

        @NotNull
        public static final Scanning INSTANCE = new Scanning();

        public Scanning() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lmx/openpay/library/core/model/OpenPayScanState$Success;", "Lmx/openpay/library/core/model/OpenPayScanState;", "", "Lmx/openpay/library/core/model/extra/DeviceDTO;", "a", "Ljava/util/List;", "getDevices", "()Ljava/util/List;", "devices", "<init>", "(Ljava/util/List;)V", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class Success extends OpenPayScanState {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<DeviceDTO> devices;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull List<DeviceDTO> devices) {
            super(null);
            Intrinsics.checkNotNullParameter(devices, "devices");
            this.devices = devices;
        }

        @NotNull
        public final List<DeviceDTO> getDevices() {
            return this.devices;
        }
    }

    public OpenPayScanState() {
    }

    public /* synthetic */ OpenPayScanState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
