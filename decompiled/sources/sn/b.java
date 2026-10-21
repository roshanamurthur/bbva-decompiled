package sn;

import java.io.IOException;
import java.util.Iterator;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: ParameterHandler.java */
/* JADX INFO: loaded from: classes13.dex */
public final class b extends d<Iterable<Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f93244a;

    public b(d dVar) {
        this.f93244a = dVar;
    }

    @Override // sn.d
    public final void a(e eVar, @Nullable Iterable<Object> iterable) throws IOException {
        Iterable<Object> iterable2 = iterable;
        if (iterable2 == null) {
            return;
        }
        Iterator<Object> it = iterable2.iterator();
        while (it.hasNext()) {
            this.f93244a.a(eVar, it.next());
        }
    }
}
