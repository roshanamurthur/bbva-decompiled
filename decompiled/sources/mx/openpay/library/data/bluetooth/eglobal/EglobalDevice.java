package mx.openpay.library.data.bluetooth.eglobal;

import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.bluetooth.Device;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EglobalDevice.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lmx/openpay/library/data/bluetooth/eglobal/EglobalDevice;", "Lmx/openpay/library/domain/bluetooth/Device;", "name", "", "address", "(Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class EglobalDevice extends Device {

    @NotNull
    private final String address;

    @NotNull
    private final String name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EglobalDevice(@NotNull String name, @NotNull String address) {
        super(name, address);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(address, "address");
        this.name = name;
        this.address = address;
    }

    public static /* synthetic */ EglobalDevice copy$default(EglobalDevice eglobalDevice, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = eglobalDevice.getName();
        }
        if ((i10 & 2) != 0) {
            str2 = eglobalDevice.getAddress();
        }
        return eglobalDevice.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return getName();
    }

    @NotNull
    public final String component2() {
        return getAddress();
    }

    @NotNull
    public final EglobalDevice copy(@NotNull String name, @NotNull String address) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(address, "address");
        return new EglobalDevice(name, address);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EglobalDevice)) {
            return false;
        }
        EglobalDevice eglobalDevice = (EglobalDevice) other;
        return Intrinsics.areEqual(getName(), eglobalDevice.getName()) && Intrinsics.areEqual(getAddress(), eglobalDevice.getAddress());
    }

    @Override // mx.openpay.library.domain.bluetooth.Device
    @NotNull
    public String getAddress() {
        return this.address;
    }

    @Override // mx.openpay.library.domain.bluetooth.Device
    @NotNull
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return getAddress().hashCode() + (getName().hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return u.g("EglobalDevice(name=", getName(), ", address=", getAddress(), ")");
    }
}
