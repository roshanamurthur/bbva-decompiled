package mx.openpay.library.domain.bluetooth;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Device.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lmx/openpay/library/domain/bluetooth/Device;", "", "name", "", "address", "(Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getName", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class Device {

    @Nullable
    private final String address;

    @NotNull
    private final String name;

    public Device(@NotNull String name, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.address = str;
    }

    @Nullable
    public String getAddress() {
        return this.address;
    }

    @NotNull
    public String getName() {
        return this.name;
    }
}
