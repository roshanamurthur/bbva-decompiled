package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: SmallSortedMap.java */
/* JADX INFO: loaded from: classes12.dex */
public final class c extends d<Object, Object> {
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public void makeImmutable() {
        if (!isImmutable()) {
            for (int i10 = 0; i10 < getNumArrayEntries(); i10++) {
                Map.Entry<Object, Object> arrayEntryAt = getArrayEntryAt(i10);
                if (((FieldSet.FieldDescriptorLite) arrayEntryAt.getKey()).isRepeated()) {
                    arrayEntryAt.setValue(Collections.unmodifiableList((List) arrayEntryAt.getValue()));
                }
            }
            for (Map.Entry<Object, Object> entry : getOverflowEntries()) {
                if (((FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.makeImmutable();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put((FieldSet.FieldDescriptorLite) obj, obj2);
    }
}
