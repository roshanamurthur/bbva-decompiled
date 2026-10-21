package na;

import android.content.Context;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.gp2.android.product.mobilepayment.library.MobilePaymentLib;
import com.bbva.sdkcatalog.openpay.plugin.permissions.PermissionExtensionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f84473p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f84474q0;

    public /* synthetic */ d(Object obj, int i10) {
        this.f84473p0 = i10;
        this.f84474q0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i10 = this.f84473p0;
        Object obj = this.f84474q0;
        switch (i10) {
            case 0:
                return MobilePaymentLib.paymentAuthenticated$lambda$12((Context) obj);
            default:
                return PermissionExtensionsKt.launchLocationPermissions$lambda$6((CommandCallback) obj);
        }
    }
}
