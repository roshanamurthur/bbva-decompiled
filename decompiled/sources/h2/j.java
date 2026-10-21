package h2;

import android.media.ImageReader;
import androidx.core.location.LocationManagerCompat;
import androidx.core.splashscreen.SplashScreen;
import androidx.core.splashscreen.SplashScreenViewProvider;
import com.bbva.component.ic.security.SecurityDataManager;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f69274p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f69275q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f69276r0;

    public /* synthetic */ j(Object obj, Object obj2, int i10) {
        this.f69274p0 = i10;
        this.f69275q0 = obj;
        this.f69276r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f69274p0) {
            case 0:
                LocationManagerCompat.j jVar = (LocationManagerCompat.j) this.f69275q0;
                if (jVar.f19963c == ((Executor) this.f69276r0)) {
                    jVar.f19962b.onStopped();
                    break;
                }
                break;
            case 1:
                SplashScreenViewProvider splashScreenViewProvider = (SplashScreenViewProvider) this.f69275q0;
                SplashScreen.OnExitAnimationListener finalListener = (SplashScreen.OnExitAnimationListener) this.f69276r0;
                Intrinsics.checkNotNullParameter(splashScreenViewProvider, "$splashScreenViewProvider");
                Intrinsics.checkNotNullParameter(finalListener, "$finalListener");
                splashScreenViewProvider.getView().bringToFront();
                finalListener.onSplashScreenExit(splashScreenViewProvider);
                break;
            case 2:
            default:
                ((com.vasco.digipass.sdk.utils.qrcodescanner.c) this.f69275q0).a((ImageReader) this.f69276r0);
                break;
            case 3:
                ((SecurityDataManager) this.f69275q0).fire(SecurityDataManager.f28165w0, (String) this.f69276r0);
                break;
            case 4:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f69275q0;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f69276r0;
                String str = FirebaseMessaging.INSTANCE_ID_SCOPE;
                firebaseMessaging.getClass();
                try {
                    firebaseMessaging.f48551b.deleteToken(com.google.firebase.messaging.l.c(firebaseMessaging.f48550a), "FCM");
                    taskCompletionSource.setResult(null);
                } catch (Exception e5) {
                    taskCompletionSource.setException(e5);
                    return;
                }
                break;
        }
    }
}
