package a;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import mx.openpay.library.core.OpenPaySdk;
import mx.openpay.library.core.bluetooth.BluetoothController;
import mx.openpay.library.di.DependenciesProvider;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f71a = new b();

    public b() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context = OpenPaySdk.appContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
            context = null;
        }
        return new BluetoothController(context, DependenciesProvider.EglobalModule.INSTANCE.provideExecuteChargeUseCase());
    }
}
