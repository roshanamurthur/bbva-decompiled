package mx.openpay.library.core.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.compat.u;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lmx/openpay/library/core/model/OpenPayDevice;", "", "name", "", "macAddress", "(Ljava/lang/String;Ljava/lang/String;)V", "getMacAddress", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OpenPayDevice {
    public static final int $stable = 0;

    @Nullable
    private final String macAddress;

    @NotNull
    private final String name;

    public OpenPayDevice(@NotNull String name, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.macAddress = str;
    }

    public static /* synthetic */ OpenPayDevice copy$default(OpenPayDevice openPayDevice, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = openPayDevice.name;
        }
        if ((i10 & 2) != 0) {
            str2 = openPayDevice.macAddress;
        }
        return openPayDevice.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMacAddress() {
        return this.macAddress;
    }

    @NotNull
    public final OpenPayDevice copy(@NotNull String name, @Nullable String macAddress) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new OpenPayDevice(name, macAddress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenPayDevice)) {
            return false;
        }
        OpenPayDevice openPayDevice = (OpenPayDevice) other;
        return Intrinsics.areEqual(this.name, openPayDevice.name) && Intrinsics.areEqual(this.macAddress, openPayDevice.macAddress);
    }

    @Nullable
    public final String getMacAddress() {
        return this.macAddress;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.macAddress;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return u.g("OpenPayDevice(name=", this.name, ", macAddress=", this.macAddress, ")");
    }

    public /* synthetic */ OpenPayDevice(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2);
    }
}
