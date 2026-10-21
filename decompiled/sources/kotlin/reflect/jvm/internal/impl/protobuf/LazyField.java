package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class LazyField extends LazyFieldLite {

    public static class a<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Map.Entry<K, LazyField> f81414p0;

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f81414p0.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            LazyField value = this.f81414p0.getValue();
            if (value == null) {
                return null;
            }
            return value.getValue();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof MessageLite) {
                return this.f81414p0.getValue().setValue((MessageLite) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    public static class b<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Iterator<Map.Entry<K, Object>> f81415p0;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.f81415p0 = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f81415p0.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f81415p0.remove();
        }

        @Override // java.util.Iterator
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f81415p0.next();
            if (!(next.getValue() instanceof LazyField)) {
                return next;
            }
            a aVar = new a();
            aVar.f81414p0 = next;
            return aVar;
        }
    }

    public boolean equals(Object obj) {
        return getValue().equals(obj);
    }

    public MessageLite getValue() {
        return getValue(null);
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue().toString();
    }
}
