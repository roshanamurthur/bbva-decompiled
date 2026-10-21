package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.core.app.AppLocalesStorageHelper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f729p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Context f730q0;

    public /* synthetic */ g(Context context, int i10) {
        this.f729p0 = i10;
        this.f730q0 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f729p0;
        Context context = this.f730q0;
        switch (i10) {
            case 0:
                if (Build.VERSION.SDK_INT >= 33) {
                    AppCompatDelegate.c cVar = AppCompatDelegate.f555p0;
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (AppCompatDelegate.getApplicationLocales().isEmpty()) {
                            String locales = AppLocalesStorageHelper.readLocales(context);
                            Object systemService = context.getSystemService("locale");
                            if (systemService != null) {
                                AppCompatDelegate.b.b(systemService, AppCompatDelegate.a.a(locales));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                AppCompatDelegate.f560u0 = true;
                break;
            default:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new androidx.camera.core.c0(context, 4));
                break;
        }
    }
}
