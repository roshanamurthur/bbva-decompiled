package y0;

import android.content.Context;
import android.database.Cursor;
import android.graphics.ColorSpace;
import android.widget.AutoCompleteTextView;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.platform.d0;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import com.airbnb.lottie.L;
import com.airbnb.lottie.network.LottieNetworkCacheProvider;
import com.dasnano.vdphotoselfiecapture.fragments.SelfieFragment;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.storage.StorageTask;
import com.veridas.camera.CameraAction;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements DoubleFunction, LottieNetworkCacheProvider, CameraAction, SQLiteEventStore.a, AccessibilityManagerCompat.TouchExplorationStateChangeListener, Deferred.DeferredHandler, Continuation, com.google.firebase.storage.t.a {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f94721p0;

    public /* synthetic */ h(Object obj) {
        this.f94721p0 = obj;
    }

    @Override // com.google.firebase.storage.t.a
    public final void a(Object obj, StorageTask.ProvideError provideError) {
        StorageTask<?> storageTask = (StorageTask) this.f94721p0;
        HashMap<Integer, HashSet<Integer>> map = StorageTask.f49037i;
        storageTask.getClass();
        com.google.firebase.storage.q.f49184c.b(storageTask);
        ((OnCanceledListener) obj).onCanceled();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.a
    public final Object apply(Object obj) {
        Map map = (Map) this.f94721p0;
        Cursor cursor = (Cursor) obj;
        Encoding encoding = SQLiteEventStore.f43867u0;
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j10));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j10), hashSet);
            }
            hashSet.add(new SQLiteEventStore.b(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    @Override // com.veridas.camera.CameraAction
    public final void execute(boolean z10) {
        SelfieFragment.k kVar = (SelfieFragment.k) this.f94721p0;
        SelfieFragment.this.S1 = new Date().getTime();
        SelfieFragment.this.setSelfieState(SelfieFragment.SelfieState.SELFIE_CHALLENGE_PRE_ACTION);
        SelfieFragment.this.E();
    }

    @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
    public final File getCacheDir() {
        Context context = (Context) this.f94721p0;
        boolean z10 = L.DBG;
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public final void handle(Provider provider) {
        CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy = (CrashlyticsNativeComponentDeferredProxy) this.f94721p0;
        crashlyticsNativeComponentDeferredProxy.getClass();
        Logger.getLogger().d("Crashlytics native component now available.");
        crashlyticsNativeComponentDeferredProxy.f47697b.set((CrashlyticsNativeComponent) provider.get());
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d2) {
        ColorSpace this_composeColorSpace = (ColorSpace) this.f94721p0;
        Intrinsics.checkNotNullParameter(this_composeColorSpace, "$this_composeColorSpace");
        return d0.d(this_composeColorSpace).getEotf().applyAsDouble(d2);
    }

    @Override // androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        com.google.android.material.textfield.l lVar = (com.google.android.material.textfield.l) this.f94721p0;
        AutoCompleteTextView autoCompleteTextView = lVar.f45633h;
        if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
            return;
        }
        ViewCompat.setImportantForAccessibility(lVar.f45662d, z10 ? 2 : 1);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        boolean z10;
        ((SessionReportingCoordinator) this.f94721p0).getClass();
        if (task.isSuccessful()) {
            CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) task.getResult();
            Logger.getLogger().d("Crashlytics report successfully enqueued to DataTransport: " + crashlyticsReportWithSessionId.getSessionId());
            File reportFile = crashlyticsReportWithSessionId.getReportFile();
            if (reportFile.delete()) {
                Logger.getLogger().d("Deleted report file: " + reportFile.getPath());
            } else {
                Logger.getLogger().w("Crashlytics could not delete report file: " + reportFile.getPath());
            }
            z10 = true;
        } else {
            Logger.getLogger().w("Crashlytics report could not be enqueued to DataTransport", task.getException());
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
