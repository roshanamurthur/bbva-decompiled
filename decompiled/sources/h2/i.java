package h2;

import androidx.core.location.LocationManagerCompat;
import com.appsflyer.internal.AFa1dSDK;
import com.appsflyer.internal.AFf1pSDK;
import com.bbva.component.dm.headers.interceptor.AccessToken;
import com.bbva.component.dm.headers.interceptor.TokenInterceptor;
import com.dasnano.vddocumentcapture.fragments.DocumentFragment;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f69271p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f69272q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f69273r0;

    public /* synthetic */ i(Object obj, Object obj2, int i10) {
        this.f69271p0 = i10;
        this.f69272q0 = obj;
        this.f69273r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws UnsupportedEncodingException {
        switch (this.f69271p0) {
            case 0:
                LocationManagerCompat.j jVar = (LocationManagerCompat.j) this.f69272q0;
                if (jVar.f19963c == ((Executor) this.f69273r0)) {
                    jVar.f19962b.onStarted();
                    break;
                }
                break;
            case 1:
                ((AFa1dSDK) this.f69272q0).AFKeystoreWrapper((AFf1pSDK) this.f69273r0);
                break;
            case 2:
                TokenInterceptor this$0 = (TokenInterceptor) this.f69272q0;
                AccessToken accessToken = (AccessToken) this.f69273r0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(accessToken, "$accessToken");
                this$0.f27666c.invoke(accessToken);
                break;
            default:
                DocumentFragment.k((DocumentFragment) this.f69272q0, (List) this.f69273r0);
                break;
        }
    }
}
