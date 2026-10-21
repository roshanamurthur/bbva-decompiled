package com.google.android.material.navigation;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.BlockingAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.q;
import com.google.firebase.storage.t;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import pe.p;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements CanvasCompat.CanvasOperation, ShapeAppearanceModel.CornerSizeUnaryOperator, Deferred.DeferredHandler, t.a {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f45014p0;

    public /* synthetic */ c(Object obj) {
        this.f45014p0 = obj;
    }

    @Override // com.google.firebase.storage.t.a
    public final void a(Object obj, StorageTask.ProvideError provideError) {
        StorageTask<?> storageTask = (StorageTask) this.f45014p0;
        HashMap<Integer, HashSet<Integer>> map = StorageTask.f49037i;
        storageTask.getClass();
        q.f49184c.b(storageTask);
        ((OnFailureListener) obj).onFailure(provideError.getError());
    }

    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    public final CornerSize apply(CornerSize cornerSize) {
        RectF rectF = (RectF) this.f45014p0;
        RectF rectF2 = p.f92677a;
        return RelativeCornerSize.createFromCornerSize(rectF, cornerSize);
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public final void handle(Provider provider) {
        AnalyticsDeferredProxy analyticsDeferredProxy = (AnalyticsDeferredProxy) this.f45014p0;
        analyticsDeferredProxy.getClass();
        Logger.getLogger().d("AnalyticsConnector now available.");
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) provider.get();
        CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger = new CrashlyticsOriginAnalyticsEventLogger(analyticsConnector);
        vf.b bVar = new vf.b();
        AnalyticsConnector.AnalyticsConnectorHandle analyticsConnectorHandleRegisterAnalyticsConnectorListener = analyticsConnector.registerAnalyticsConnectorListener("clx", bVar);
        if (analyticsConnectorHandleRegisterAnalyticsConnectorListener == null) {
            Logger.getLogger().d("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            analyticsConnectorHandleRegisterAnalyticsConnectorListener = analyticsConnector.registerAnalyticsConnectorListener(AppMeasurement.CRASH_ORIGIN, bVar);
            if (analyticsConnectorHandleRegisterAnalyticsConnectorListener != null) {
                Logger.getLogger().w("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        if (analyticsConnectorHandleRegisterAnalyticsConnectorListener == null) {
            Logger.getLogger().w("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        Logger.getLogger().d("Registered Firebase Analytics listener.");
        BreadcrumbAnalyticsEventReceiver breadcrumbAnalyticsEventReceiver = new BreadcrumbAnalyticsEventReceiver();
        BlockingAnalyticsEventLogger blockingAnalyticsEventLogger = new BlockingAnalyticsEventLogger(crashlyticsOriginAnalyticsEventLogger, 500, TimeUnit.MILLISECONDS);
        synchronized (analyticsDeferredProxy) {
            try {
                Iterator it = analyticsDeferredProxy.f47689d.iterator();
                while (it.hasNext()) {
                    breadcrumbAnalyticsEventReceiver.registerBreadcrumbHandler((BreadcrumbHandler) it.next());
                }
                bVar.f94048b = breadcrumbAnalyticsEventReceiver;
                bVar.f94047a = blockingAnalyticsEventLogger;
                analyticsDeferredProxy.f47688c = breadcrumbAnalyticsEventReceiver;
                analyticsDeferredProxy.f47687b = blockingAnalyticsEventLogger;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
    public final void run(Canvas canvas) {
        super/*android.widget.FrameLayout*/.dispatchDraw(canvas);
    }
}
