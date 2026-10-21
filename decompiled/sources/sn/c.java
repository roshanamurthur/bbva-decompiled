package sn;

import java.io.IOException;
import java.lang.reflect.Array;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: ParameterHandler.java */
/* JADX INFO: loaded from: classes13.dex */
public final class c extends d<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f93245a;

    public c(d dVar) {
        this.f93245a = dVar;
    }

    @Override // sn.d
    public final void a(e eVar, @Nullable Object obj) throws IOException {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f93245a.a(eVar, Array.get(obj, i10));
        }
    }
}
