package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.internal.view.SupportMenu;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
public class o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final Handler f64513i = new a(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f64514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final h f64515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final com.salesforce.marketingcloud.media.c f64516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final r f64517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Map<ImageView, g> f64518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Map<Object, com.salesforce.marketingcloud.media.a> f64519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<u> f64520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ReferenceQueue f64521h;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 2) {
                n nVar = (n) message.obj;
                nVar.f64497a.a(nVar);
            } else {
                if (i10 != 5) {
                    return;
                }
                e eVar = (e) message.obj;
                eVar.f64465a.a(eVar);
            }
        }
    }

    public enum b {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(SupportMenu.CATEGORY_MASK);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f64526a;

        b(int i10) {
            this.f64526a = i10;
        }
    }

    public enum c {
        NORMAL,
        HIGH
    }

    public o(Context context, h hVar, com.salesforce.marketingcloud.media.c cVar, r rVar) {
        this.f64514a = context;
        this.f64515b = hVar;
        this.f64516c = cVar;
        this.f64517d = rVar;
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new q(rVar));
        arrayList.add(new i(context));
        this.f64520g = Collections.unmodifiableList(arrayList);
        this.f64519f = new WeakHashMap();
        this.f64518e = new WeakHashMap();
    }

    @VisibleForTesting(otherwise = 3)
    public Bitmap a(String str) {
        return this.f64516c.a(str);
    }

    @NonNull
    public t b(@Nullable String str) {
        return new t(this, Uri.parse(str));
    }

    @NonNull
    public com.salesforce.marketingcloud.media.b a(@NonNull List<String> list) {
        return new com.salesforce.marketingcloud.media.b(this, new ArrayList(list));
    }

    @NonNull
    public static o a(Context context, com.salesforce.marketingcloud.storage.j jVar) {
        com.salesforce.marketingcloud.media.c cVar = new com.salesforce.marketingcloud.media.c(context);
        return new o(context, new h(context, new m(), f64513i, cVar), cVar, new r(jVar.k()));
    }

    public List<u> a() {
        return this.f64520g;
    }

    @VisibleForTesting(otherwise = 3)
    public void a(ImageView imageView, g gVar) {
        if (this.f64518e.containsKey(imageView)) {
            a(imageView);
        }
        this.f64518e.put(imageView, gVar);
    }

    @VisibleForTesting(otherwise = 3)
    public void a(com.salesforce.marketingcloud.media.a aVar) {
        Object objF = aVar.f();
        if (objF != null && this.f64519f.get(objF) != aVar) {
            a(objF);
            this.f64519f.put(objF, aVar);
        }
        this.f64515b.b(aVar);
    }

    private void a(com.salesforce.marketingcloud.media.a aVar, u.b bVar, Exception exc) {
        if (aVar.g()) {
            return;
        }
        this.f64519f.remove(aVar.f());
        if (bVar != null) {
            aVar.a(bVar);
        } else {
            aVar.a(exc);
        }
    }

    public void a(e eVar) {
        f fVarB = eVar.f64466b.b();
        if (fVarB != null) {
            if (eVar.b()) {
                fVarB.a(eVar.a());
            } else {
                fVarB.a();
            }
        }
    }

    @VisibleForTesting
    public void a(n nVar) {
        com.salesforce.marketingcloud.media.a aVarC = nVar.c();
        List<com.salesforce.marketingcloud.media.a> listD = nVar.d();
        boolean z10 = (listD == null || listD.isEmpty()) ? false : true;
        if (aVarC != null || z10) {
            Exception excF = nVar.f();
            u.b bVarI = nVar.i();
            if (aVarC != null) {
                a(aVarC, bVarI, excF);
            }
            if (z10) {
                int size = listD.size();
                for (int i10 = 0; i10 < size; i10++) {
                    a(listD.get(i10), bVarI, excF);
                }
            }
        }
    }

    public void a(Object obj) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            com.salesforce.marketingcloud.media.a aVarRemove = this.f64519f.remove(obj);
            if (aVarRemove != null) {
                aVarRemove.a();
                this.f64515b.a(aVarRemove);
            }
            if (obj instanceof ImageView) {
                g gVarRemove = this.f64518e.remove((ImageView) obj);
                if (gVarRemove != null) {
                    gVarRemove.a();
                }
            }
        }
    }

    public void a(Collection<String> collection) {
        a(collection, (f) null);
    }

    @VisibleForTesting
    public void a(Collection<String> collection, f fVar) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        this.f64515b.a(new d(this, new ArrayList(collection), this.f64517d, fVar));
    }
}
