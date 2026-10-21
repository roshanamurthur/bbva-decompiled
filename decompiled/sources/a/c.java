package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import mx.openpay.library.core.OpenPaySdk;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f72a = new c();

    public c() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(OpenPaySdk.INSTANCE.getBluetoothController().getBluetoothEnabled());
    }
}
