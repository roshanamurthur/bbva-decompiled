package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: SmallSortedMap.java */
/* JADX INFO: loaded from: classes2.dex */
public final class q0 extends r0<Object, Object> {
    @Override // androidx.datastore.preferences.protobuf.r0
    public final void f() {
        if (!this.f21122s0) {
            for (int i10 = 0; i10 < this.f21120q0.size(); i10++) {
                Map.Entry<Object, Object> entryC = c(i10);
                if (((FieldSet.FieldDescriptorLite) entryC.getKey()).isRepeated()) {
                    entryC.setValue(Collections.unmodifiableList((List) entryC.getValue()));
                }
            }
            for (Map.Entry<Object, Object> entry : d()) {
                if (((FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.f();
    }

    @Override // androidx.datastore.preferences.protobuf.r0, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((FieldSet.FieldDescriptorLite) obj, obj2);
    }
}
