package androidx.lifecycle;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: ReflectiveGenericLifecycleObserver.java */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class l implements LifecycleEventObserver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Object f22182p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final a.C0094a f22183q0;

    public l(Object obj) {
        this.f22182p0 = obj;
        a aVar = a.f22057c;
        Class<?> cls = obj.getClass();
        a.C0094a c0094a = (a.C0094a) aVar.f22058a.get(cls);
        this.f22183q0 = c0094a == null ? aVar.a(cls, null) : c0094a;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
        HashMap map = this.f22183q0.f22060a;
        List list = (List) map.get(event);
        Object obj = this.f22182p0;
        a.C0094a.a(list, lifecycleOwner, event, obj);
        a.C0094a.a((List) map.get(Lifecycle.Event.ON_ANY), lifecycleOwner, event, obj);
    }
}
