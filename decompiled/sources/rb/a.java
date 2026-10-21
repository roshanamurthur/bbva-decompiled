package rb;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.search.SearchView;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.s;
import com.google.firebase.messaging.v;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdk;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkReadyListener;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.ui.taponphone.charge.TapOnPhoneCreateChargeActivity;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements SFMCSdkReadyListener, ViewUtils.OnApplyWindowInsetsListener, BreadcrumbSource, SuccessContinuation, ActivityResultCallback {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f92976p0;

    public /* synthetic */ a(Object obj) {
        this.f92976p0 = obj;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        TapOnPhoneCreateChargeActivity.a((TapOnPhoneCreateChargeActivity) this.f92976p0, (ActivityResult) obj);
    }

    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
        MaterialToolbar materialToolbar = ((SearchView) this.f92976p0).v0;
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(materialToolbar);
        materialToolbar.setPadding(windowInsetsCompat.getSystemWindowInsetLeft() + (zIsLayoutRtl ? relativePadding.end : relativePadding.start), relativePadding.top, windowInsetsCompat.getSystemWindowInsetRight() + (zIsLayoutRtl ? relativePadding.start : relativePadding.end), relativePadding.bottom);
        return windowInsetsCompat;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.SFMCSdkReadyListener
    public final void ready(SFMCSdk sdk) {
        Function1 block = (Function1) this.f92976p0;
        Intrinsics.checkNotNullParameter(block, "$block");
        Intrinsics.checkNotNullParameter(sdk, "sdk");
        block.invoke(sdk);
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public final void registerBreadcrumbHandler(BreadcrumbHandler breadcrumbHandler) {
        AnalyticsDeferredProxy analyticsDeferredProxy = (AnalyticsDeferredProxy) this.f92976p0;
        synchronized (analyticsDeferredProxy) {
            try {
                if (analyticsDeferredProxy.f47688c instanceof DisabledBreadcrumbSource) {
                    analyticsDeferredProxy.f47689d.add(breadcrumbHandler);
                }
                analyticsDeferredProxy.f47688c.registerBreadcrumbHandler(breadcrumbHandler);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        String str = (String) this.f92976p0;
        v vVar = (v) obj;
        String str2 = FirebaseMessaging.INSTANCE_ID_SCOPE;
        vVar.getClass();
        Task<Void> taskF = vVar.f(new s("U", str));
        vVar.h();
        return taskF;
    }
}
