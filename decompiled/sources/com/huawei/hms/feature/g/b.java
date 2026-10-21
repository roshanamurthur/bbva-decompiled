package com.huawei.hms.feature.g;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.appgallery.serviceverifykit.api.ServiceVerifyKit;
import com.huawei.dynamiccore.aidl.IDynamicCore;
import com.huawei.hms.feature.install.FeatureInstallManagerFactory;
import com.huawei.hms.feature.model.FeatureInstallException;
import com.huawei.hms.feature.model.InstallState;
import com.huawei.hms.feature.tasks.FeatureTask;
import com.huawei.hms.feature.tasks.FeatureTaskHolder;
import com.huawei.hms.feature.utils.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50283a = "LocalApk-b";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f50284b = "com.huawei.appgallery.dynamic.action.DynamicService";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f50285c = "com.huawei.hwouc.dynamic.action.DynamicService";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f50286d = "version";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f50287e = "com.huawei.appmarket";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Intent f50288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f50289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f50290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.huawei.hms.feature.g.d<IDynamicCore> f50291i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Handler f50292j;

    public class a implements com.huawei.hms.feature.g.c<IDynamicCore> {
        public a() {
        }

        @Override // com.huawei.hms.feature.g.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IDynamicCore a(IBinder iBinder) {
            return IDynamicCore.Stub.asInterface(iBinder);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.feature.g.b$b, reason: collision with other inner class name */
    public class C0223b implements com.huawei.hms.feature.g.c<IDynamicCore> {
        public C0223b() {
        }

        @Override // com.huawei.hms.feature.g.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IDynamicCore a(IBinder iBinder) {
            return IDynamicCore.Stub.asInterface(iBinder);
        }
    }

    public class c extends com.huawei.hms.feature.g.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Collection f50295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Collection f50296c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ FeatureTaskHolder f50297d;

        public class a extends com.huawei.hms.feature.g.a<Integer> {
            public a(b bVar, FeatureTaskHolder featureTaskHolder) {
                super(bVar, featureTaskHolder);
            }

            @Override // com.huawei.hms.feature.g.a, com.huawei.dynamiccore.aidl.IDynamicCoreCallback
            public void onInstallFeature(int i10, Bundle bundle) throws RemoteException {
                super.onInstallFeature(i10, bundle);
                c cVar = c.this;
                b.this.a(i10, bundle, cVar.f50297d, cVar.f50295b, cVar.f50296c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(FeatureTaskHolder featureTaskHolder, Collection collection, Collection collection2, FeatureTaskHolder featureTaskHolder2) {
            super(featureTaskHolder);
            this.f50295b = collection;
            this.f50296c = collection2;
            this.f50297d = featureTaskHolder2;
        }

        @Override // com.huawei.hms.feature.g.e
        public void a() {
            ArrayList arrayListD = b.d(this.f50295b);
            arrayListD.addAll(b.c((Collection<String>) this.f50296c));
            try {
                Logger.i(b.f50283a, "installFeature...." + this.f50295b);
                ((IDynamicCore) b.this.f50291i.c()).installFeature(b.this.f50290h, arrayListD, b.f(), new a(b.this, this.f50297d));
            } catch (RemoteException e5) {
                this.f50297d.notifyFailure(new RuntimeException(e5));
            }
        }
    }

    public class d extends com.huawei.hms.feature.g.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f50299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FeatureTaskHolder f50300c;

        public class a extends com.huawei.hms.feature.g.a<Void> {
            public a(b bVar, FeatureTaskHolder featureTaskHolder) {
                super(bVar, featureTaskHolder);
            }

            @Override // com.huawei.hms.feature.g.a, com.huawei.dynamiccore.aidl.IDynamicCoreCallback
            public void onDelayedUninstallFeature(Bundle bundle) throws RemoteException {
                super.onDelayedUninstallFeature(bundle);
                d.this.f50300c.notifyResult(null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(FeatureTaskHolder featureTaskHolder, List list, FeatureTaskHolder featureTaskHolder2) {
            super(featureTaskHolder);
            this.f50299b = list;
            this.f50300c = featureTaskHolder2;
        }

        @Override // com.huawei.hms.feature.g.e
        public void a() {
            try {
                Logger.i(b.f50283a, "delayedUninstallFeature...." + this.f50299b);
                ((IDynamicCore) b.this.f50291i.c()).delayedUninstallFeature(b.this.f50290h, b.d(this.f50299b), b.f(), new a(b.this, this.f50300c));
            } catch (RemoteException e5) {
                this.f50300c.notifyFailure(new RuntimeException(e5));
                Logger.w(b.f50283a, "delayedUninstallFeature....exception", e5);
            }
        }
    }

    public class e extends com.huawei.hms.feature.g.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f50302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FeatureTaskHolder f50303c;

        public class a extends com.huawei.hms.feature.g.a<Void> {
            public a(b bVar, FeatureTaskHolder featureTaskHolder) {
                super(bVar, featureTaskHolder);
            }

            @Override // com.huawei.hms.feature.g.a, com.huawei.dynamiccore.aidl.IDynamicCoreCallback
            public void onDelayedInstallFeature(Bundle bundle) throws RemoteException {
                super.onDelayedInstallFeature(bundle);
                e.this.f50303c.notifyResult(null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(FeatureTaskHolder featureTaskHolder, List list, FeatureTaskHolder featureTaskHolder2) {
            super(featureTaskHolder);
            this.f50302b = list;
            this.f50303c = featureTaskHolder2;
        }

        @Override // com.huawei.hms.feature.g.e
        public void a() {
            try {
                Logger.i(b.f50283a, "delayedInstallFeature...." + this.f50302b);
                ((IDynamicCore) b.this.f50291i.c()).delayedInstallFeature(b.this.f50290h, b.d(this.f50302b), b.f(), new a(b.this, this.f50303c));
            } catch (RemoteException e5) {
                this.f50303c.notifyFailure(new RuntimeException(e5));
                Logger.w(b.f50283a, "delayedInstallFeature....exception", e5);
            }
        }
    }

    public class f extends com.huawei.hms.feature.g.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f50305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FeatureTaskHolder f50306c;

        public class a extends com.huawei.hms.feature.g.a<InstallState> {
            public a(b bVar, FeatureTaskHolder featureTaskHolder) {
                super(bVar, featureTaskHolder);
            }

            @Override // com.huawei.hms.feature.g.a, com.huawei.dynamiccore.aidl.IDynamicCoreCallback
            public void onGetInstallState(int i10, Bundle bundle) throws RemoteException {
                super.onGetInstallState(i10, bundle);
                f.this.f50306c.notifyResult(com.huawei.hms.feature.broadcast.e.b(bundle));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(FeatureTaskHolder featureTaskHolder, int i10, FeatureTaskHolder featureTaskHolder2) {
            super(featureTaskHolder);
            this.f50305b = i10;
            this.f50306c = featureTaskHolder2;
        }

        @Override // com.huawei.hms.feature.g.e
        public void a() {
            try {
                Logger.i(b.f50283a, "getInstallState...." + this.f50305b);
                ((IDynamicCore) b.this.f50291i.c()).getInstallState(b.this.f50290h, this.f50305b, b.f(), new a(b.this, this.f50306c));
            } catch (RemoteException e5) {
                this.f50306c.notifyFailure(new RuntimeException(e5));
                Logger.w(b.f50283a, "getInstallState....exception", e5);
            }
        }
    }

    public class g extends com.huawei.hms.feature.g.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FeatureTaskHolder f50308b;

        public class a extends com.huawei.hms.feature.g.a<List<InstallState>> {
            public a(b bVar, FeatureTaskHolder featureTaskHolder) {
                super(bVar, featureTaskHolder);
            }

            @Override // com.huawei.hms.feature.g.a, com.huawei.dynamiccore.aidl.IDynamicCoreCallback
            public void onGetAllInstallStates(Bundle bundle) throws RemoteException {
                super.onGetAllInstallStates(bundle);
                g.this.f50308b.notifyResult(com.huawei.hms.feature.broadcast.e.c(bundle));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(FeatureTaskHolder featureTaskHolder, FeatureTaskHolder featureTaskHolder2) {
            super(featureTaskHolder);
            this.f50308b = featureTaskHolder2;
        }

        @Override // com.huawei.hms.feature.g.e
        public void a() {
            try {
                Logger.i(b.f50283a, "getAllInstallStates....");
                ((IDynamicCore) b.this.f50291i.c()).getAllInstallStates(b.this.f50290h, b.f(), new a(b.this, this.f50308b));
            } catch (RemoteException e5) {
                this.f50308b.notifyFailure(new RuntimeException(e5));
                Logger.w(b.f50283a, "getAllInstallStates....", e5);
            }
        }
    }

    public class h extends com.huawei.hms.feature.g.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f50310b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FeatureTaskHolder f50311c;

        public class a extends com.huawei.hms.feature.g.a<Void> {
            public a(b bVar, FeatureTaskHolder featureTaskHolder) {
                super(bVar, featureTaskHolder);
            }

            @Override // com.huawei.hms.feature.g.a, com.huawei.dynamiccore.aidl.IDynamicCoreCallback
            public void onAbortInstallFeature(int i10, Bundle bundle) throws RemoteException {
                super.onAbortInstallFeature(i10, bundle);
                h.this.f50311c.notifyResult(null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(FeatureTaskHolder featureTaskHolder, int i10, FeatureTaskHolder featureTaskHolder2) {
            super(featureTaskHolder);
            this.f50310b = i10;
            this.f50311c = featureTaskHolder2;
        }

        @Override // com.huawei.hms.feature.g.e
        public void a() {
            try {
                Logger.i(b.f50283a, "abortInstallFeature....");
                ((IDynamicCore) b.this.f50291i.c()).abortInstallFeature(b.this.f50290h, this.f50310b, b.f(), new a(b.this, this.f50311c));
            } catch (RemoteException e5) {
                this.f50311c.notifyFailure(new RuntimeException(e5));
                Logger.w(b.f50283a, "abortInstallFeature failed", e5);
            }
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.huawei.hms.feature.broadcast.d.a(b.this.f50289g).notifyListeners(InstallState.makeSessionState(com.huawei.hms.feature.utils.b.a(Collections.emptyList(), Collections.emptyList())));
        }
    }

    public b(Context context) {
        this(context, context.getPackageName());
    }

    private FeatureInstallException a(Bundle bundle) {
        if (bundle == null) {
            Logger.e(f50283a, "Inner error:  sessionid is -1 and stateBundle is null");
            return new FeatureInstallException(-100);
        }
        String string = bundle.getString(com.huawei.hms.feature.model.c.f50450f);
        if (TextUtils.isEmpty(string)) {
            string = "Inner error";
        }
        int i10 = bundle.getInt(com.huawei.hms.feature.model.c.f50449e);
        Logger.e(f50283a, "Get error from hw marke , marketErrorCode is " + i10 + ", errorMsg is " + string);
        return new FeatureInstallException(com.huawei.hms.feature.utils.d.a(i10));
    }

    public static String d() {
        return f50287e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putInt("version", 3);
        return bundle;
    }

    public com.huawei.hms.feature.g.d<IDynamicCore> e() {
        return this.f50291i;
    }

    private b(Context context, String str) {
        com.huawei.hms.feature.g.d<IDynamicCore> dVar;
        this.f50289g = context;
        this.f50290h = str;
        this.f50292j = new Handler(Looper.getMainLooper());
        if (TextUtils.equals(com.huawei.hms.feature.model.a.f50427c, FeatureInstallManagerFactory.getAppFrom(context))) {
            this.f50288f = new Intent(f50285c).setPackage(com.huawei.hms.feature.model.a.f50429e);
            dVar = new com.huawei.hms.feature.g.d<>(context.getApplicationContext(), "mRemoteConnector", this.f50288f, new a());
        } else {
            this.f50288f = new Intent(f50284b).setPackage(a(context));
            dVar = new com.huawei.hms.feature.g.d<>(context.getApplicationContext(), "mRemoteConnector", this.f50288f, new C0223b());
        }
        this.f50291i = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ArrayList<Bundle> d(Collection<String> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        for (String str : collection) {
            Bundle bundle = new Bundle();
            bundle.putString(com.huawei.hms.feature.model.c.f50447c, com.huawei.hms.feature.model.c.f50460q);
            bundle.putString(com.huawei.hms.feature.model.c.f50446b, str);
            arrayList.add(bundle);
            Logger.i(f50283a, "start add new feature " + collection);
        }
        return arrayList;
    }

    public final FeatureTask<Void> a(int i10) {
        FeatureTaskHolder featureTaskHolder = new FeatureTaskHolder();
        this.f50291i.b(new h(featureTaskHolder, i10, featureTaskHolder));
        return featureTaskHolder.getTask();
    }

    public final FeatureTask<List<InstallState>> c() {
        FeatureTaskHolder featureTaskHolder = new FeatureTaskHolder();
        this.f50291i.b(new g(featureTaskHolder, featureTaskHolder));
        return featureTaskHolder.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ArrayList<Bundle> c(Collection<String> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        for (String str : collection) {
            Bundle bundle = new Bundle();
            bundle.putString(com.huawei.hms.feature.model.c.f50447c, "language");
            bundle.putString(com.huawei.hms.feature.model.c.f50446b, str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public final FeatureTask<Integer> a(Collection<String> collection, Collection<String> collection2) {
        FeatureTaskHolder featureTaskHolder = new FeatureTaskHolder();
        this.f50291i.b(new c(featureTaskHolder, collection, collection2, featureTaskHolder));
        return featureTaskHolder.getTask();
    }

    public final FeatureTask<InstallState> b(int i10) {
        FeatureTaskHolder featureTaskHolder = new FeatureTaskHolder();
        this.f50291i.b(new f(featureTaskHolder, i10, featureTaskHolder));
        return featureTaskHolder.getTask();
    }

    public final FeatureTask<Void> a(List<String> list) {
        FeatureTaskHolder featureTaskHolder = new FeatureTaskHolder();
        this.f50291i.b(new e(featureTaskHolder, list, featureTaskHolder));
        return featureTaskHolder.getTask();
    }

    public final FeatureTask<Void> b(List<String> list) {
        FeatureTaskHolder featureTaskHolder = new FeatureTaskHolder();
        this.f50291i.b(new d(featureTaskHolder, list, featureTaskHolder));
        return featureTaskHolder.getTask();
    }

    private String a(Context context) {
        if (!context.getClassLoader().equals(b.class.getClassLoader())) {
            Logger.i(f50283a, "Not in the same classloader, no need to query for market name.");
            return com.huawei.hms.feature.model.a.f50428d;
        }
        String strGenVerifiedPackageName = new ServiceVerifyKit.Builder().setContext(context).setTargetComponent(new Intent(f50284b), ServiceVerifyKit.Builder.ComponentType.SERVICE).genVerifiedPackageName();
        if (TextUtils.isEmpty(strGenVerifiedPackageName)) {
            f50287e = com.huawei.hms.feature.f.a.b(context);
        } else {
            f50287e = strGenVerifiedPackageName;
            Logger.i(f50283a, "get market package name from kit successfully");
        }
        Logger.i(f50283a, "market package name...." + f50287e);
        return f50287e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, Bundle bundle, FeatureTaskHolder<Integer> featureTaskHolder, Collection<String> collection, Collection<String> collection2) {
        if (-1 != i10) {
            featureTaskHolder.notifyResult(Integer.valueOf(i10));
            return;
        }
        FeatureInstallException featureInstallExceptionA = a(bundle);
        if (featureInstallExceptionA.getErrorCode() != 10) {
            featureTaskHolder.notifyFailure(featureInstallExceptionA);
            return;
        }
        Logger.d(f50283a, "error code:10. feature has already installed. Please do not worry, do nothing.");
        featureTaskHolder.notifyResult(0);
        this.f50292j.post(new i());
    }
}
