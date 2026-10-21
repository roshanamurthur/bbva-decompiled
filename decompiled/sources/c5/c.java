package c5;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.component.ic.security.SecurityDataManager;
import com.bbva.component.ic.security.interceptor.SecurityInterceptor;
import com.bbva.sdkcatalog.openpay.plugin.permissions.PermissionExtensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f25366p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f25367q0;

    public /* synthetic */ c(Object obj, int i10) {
        this.f25366p0 = i10;
        this.f25367q0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i10 = this.f25366p0;
        Object obj = this.f25367q0;
        switch (i10) {
            case 0:
                SecurityInterceptor securityInterceptor = ((SecurityDataManager) obj).f28171t0;
                if (securityInterceptor == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("securityInterceptor");
                    securityInterceptor = null;
                }
                securityInterceptor.setCancelOperation$component_ic_security_release(true);
                return Unit.INSTANCE;
            default:
                return PermissionExtensionsKt.launchStoragePermissions$lambda$8((CommandCallback) obj);
        }
    }
}
