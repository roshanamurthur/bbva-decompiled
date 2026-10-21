package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class LocalBroadcastManager {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f22236f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static LocalBroadcastManager f22237g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<BroadcastReceiver, ArrayList<c>> f22239b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, ArrayList<c>> f22240c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<b> f22241d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f22242e;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                LocalBroadcastManager.this.a();
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f22244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<c> f22245b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f22244a = intent;
            this.f22245b = arrayList;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IntentFilter f22246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BroadcastReceiver f22247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f22248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f22249d;

        public c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            this.f22246a = intentFilter;
            this.f22247b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sbA = androidx.fragment.app.a.a(128, "Receiver{");
            sbA.append(this.f22247b);
            sbA.append(" filter=");
            sbA.append(this.f22246a);
            if (this.f22249d) {
                sbA.append(" DEAD");
            }
            sbA.append("}");
            return sbA.toString();
        }
    }

    public LocalBroadcastManager(Context context) {
        this.f22238a = context;
        this.f22242e = new a(context.getMainLooper());
    }

    @NonNull
    public static LocalBroadcastManager getInstance(@NonNull Context context) {
        LocalBroadcastManager localBroadcastManager;
        synchronized (f22236f) {
            try {
                if (f22237g == null) {
                    f22237g = new LocalBroadcastManager(context.getApplicationContext());
                }
                localBroadcastManager = f22237g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return localBroadcastManager;
    }

    public final void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f22239b) {
                try {
                    size = this.f22241d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.f22241d.toArray(bVarArr);
                    this.f22241d.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = bVarArr[i10];
                int size2 = bVar.f22245b.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c cVar = bVar.f22245b.get(i11);
                    if (!cVar.f22249d) {
                        cVar.f22247b.onReceive(this.f22238a, bVar.f22244a);
                    }
                }
            }
        }
    }

    public void registerReceiver(@NonNull BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter) {
        synchronized (this.f22239b) {
            try {
                c cVar = new c(broadcastReceiver, intentFilter);
                ArrayList<c> arrayList = this.f22239b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f22239b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                    String action = intentFilter.getAction(i10);
                    ArrayList<c> arrayList2 = this.f22240c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.f22240c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public boolean sendBroadcast(@NonNull Intent intent) {
        boolean z10;
        int i10;
        String str;
        ArrayList arrayList;
        ArrayList<c> arrayList2;
        String str2;
        boolean z11;
        synchronized (this.f22239b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f22238a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z12 = false;
                boolean z13 = (intent.getFlags() & 8) != 0;
                if (z13) {
                    intent.toString();
                }
                ArrayList<c> arrayList3 = this.f22240c.get(intent.getAction());
                if (arrayList3 != null) {
                    if (z13) {
                        arrayList3.toString();
                    }
                    ArrayList arrayList4 = null;
                    int i11 = 0;
                    while (i11 < arrayList3.size()) {
                        c cVar = arrayList3.get(i11);
                        if (z13) {
                            Objects.toString(cVar.f22246a);
                        }
                        if (cVar.f22248c) {
                            i10 = i11;
                            arrayList2 = arrayList3;
                            str = action;
                            str2 = strResolveTypeIfNeeded;
                            arrayList = arrayList4;
                            z11 = z12;
                        } else {
                            IntentFilter intentFilter = cVar.f22246a;
                            String str3 = action;
                            String str4 = strResolveTypeIfNeeded;
                            i10 = i11;
                            str = action;
                            arrayList = arrayList4;
                            arrayList2 = arrayList3;
                            str2 = strResolveTypeIfNeeded;
                            z11 = z12;
                            int iMatch = intentFilter.match(str3, str4, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z13) {
                                    Integer.toHexString(iMatch);
                                }
                                arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                                arrayList4.add(cVar);
                                cVar.f22248c = true;
                            }
                            i11 = i10 + 1;
                            z12 = z11;
                            action = str;
                            arrayList3 = arrayList2;
                            strResolveTypeIfNeeded = str2;
                        }
                        arrayList4 = arrayList;
                        i11 = i10 + 1;
                        z12 = z11;
                        action = str;
                        arrayList3 = arrayList2;
                        strResolveTypeIfNeeded = str2;
                    }
                    ?? r10 = arrayList4;
                    z10 = z12;
                    if (r10 != 0) {
                        for (?? r11 = z10; r11 < r10.size(); r11++) {
                            ((c) r10.get(r11)).f22248c = z10;
                        }
                        this.f22241d.add(new b(intent, r10));
                        if (!this.f22242e.hasMessages(1)) {
                            this.f22242e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                } else {
                    z10 = false;
                }
                return z10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void sendBroadcastSync(@NonNull Intent intent) {
        if (sendBroadcast(intent)) {
            a();
        }
    }

    public void unregisterReceiver(@NonNull BroadcastReceiver broadcastReceiver) {
        synchronized (this.f22239b) {
            try {
                ArrayList<c> arrayListRemove = this.f22239b.remove(broadcastReceiver);
                if (arrayListRemove == null) {
                    return;
                }
                for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                    c cVar = arrayListRemove.get(size);
                    cVar.f22249d = true;
                    for (int i10 = 0; i10 < cVar.f22246a.countActions(); i10++) {
                        String action = cVar.f22246a.getAction(i10);
                        ArrayList<c> arrayList = this.f22240c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = arrayList.get(size2);
                                if (cVar2.f22247b == broadcastReceiver) {
                                    cVar2.f22249d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f22240c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
