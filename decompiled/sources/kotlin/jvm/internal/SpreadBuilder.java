package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public class SpreadBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<Object> f79734a;

    public SpreadBuilder(int i10) {
        this.f79734a = new ArrayList<>(i10);
    }

    public void add(Object obj) {
        this.f79734a.add(obj);
    }

    public void addSpread(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z10 = obj instanceof Object[];
        ArrayList<Object> arrayList = this.f79734a;
        if (z10) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    public int size() {
        return this.f79734a.size();
    }

    public Object[] toArray(Object[] objArr) {
        return this.f79734a.toArray(objArr);
    }
}
