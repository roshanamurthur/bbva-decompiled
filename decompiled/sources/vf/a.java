package vf;

import android.os.Bundle;
import androidx.activity.result.ActivityResultCallback;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.q;
import com.google.firebase.storage.t;
import com.veridas.permissions.PermissionStatus;
import com.veridas.permissions.PermissionsActivity;
import com.veridas.permissions.PermissionsActivity$permissionsToRequest$2$1$1;
import com.veridas.permissions.PermissionsProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements AnalyticsEventLogger, t.a, ActivityResultCallback {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f94046p0;

    public /* synthetic */ a(Object obj) {
        this.f94046p0 = obj;
    }

    @Override // com.google.firebase.storage.t.a
    public final void a(Object obj, StorageTask.ProvideError provideError) {
        StorageTask<?> storageTask = (StorageTask) this.f94046p0;
        HashMap<Integer, HashSet<Integer>> map = StorageTask.f49037i;
        storageTask.getClass();
        q.f49184c.b(storageTask);
        ((OnSuccessListener) obj).onSuccess(provideError);
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public final void logEvent(String str, Bundle bundle) {
        ((AnalyticsDeferredProxy) this.f94046p0).f47687b.logEvent(str, bundle);
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        PermissionsActivity this$0 = (PermissionsActivity) this.f94046p0;
        Map map = (Map) obj;
        PermissionsActivity.Companion companion = PermissionsActivity.INSTANCE;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<PermissionsActivity$permissionsToRequest$2$1$1> list = (List) this$0.f67269p0.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (PermissionsActivity$permissionsToRequest$2$1$1 permissionsActivity$permissionsToRequest$2$1$1 : list) {
            Intrinsics.checkNotNull(map);
            String id = permissionsActivity$permissionsToRequest$2$1$1.getId();
            Intrinsics.checkNotNullExpressionValue(id, "<get-id>(...)");
            Object obj2 = map.get(id);
            if (obj2 == null) {
                obj2 = Boolean.FALSE;
            }
            arrayList.add(Boolean.valueOf(((Boolean) obj2).booleanValue()));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Boolean) it.next()).booleanValue() ? PermissionStatus.Granted.INSTANCE : PermissionStatus.NotGranted.INSTANCE);
        }
        PermissionsProvider.IPermissionRequestResultListener currentPermissionRequestListener = PermissionsProvider.INSTANCE.getCurrentPermissionRequestListener();
        if (currentPermissionRequestListener != null) {
            currentPermissionRequestListener.onPermissionsResult(arrayList2);
        }
        this$0.finish();
    }
}
