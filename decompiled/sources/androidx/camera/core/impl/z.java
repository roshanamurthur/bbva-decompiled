package androidx.camera.core.impl;

import android.nfc.Tag;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.mypinpad.tsdk.isolation.IsolatedService;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleReadyHandler;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2146p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2147q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f2148r0;

    public /* synthetic */ z(Object obj, Object obj2, int i10) {
        this.f2146p0 = i10;
        this.f2147q0 = obj;
        this.f2148r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f2146p0;
        Object obj = this.f2148r0;
        Object obj2 = this.f2147q0;
        switch (i10) {
            case 0:
                ((LiveDataObservable) obj2).lambda$fetchData$0((CallbackToFutureAdapter.Completer) obj);
                break;
            case 1:
                int i11 = IsolatedService.a.f61646b;
                IsolatedService.a.a(new Object[]{(IsolatedService) obj2, (Tag) obj}, 1232315, -1232313, (int) System.currentTimeMillis());
                break;
            default:
                ModuleReadyHandler.m5508deliverModule$lambda0((ModuleReadyHandler) obj2, (ModuleInterface) obj);
                break;
        }
    }
}
