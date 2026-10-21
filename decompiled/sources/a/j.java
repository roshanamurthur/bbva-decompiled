package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import mx.openpay.library.core.OpenPaySdk;

/* JADX INFO: loaded from: classes.dex */
public final class j extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f104a = new j();

    public j() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return OpenPaySdk.INSTANCE.getBluetoothController().isConnected();
    }
}
