package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class LazyField extends LazyFieldLite {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MessageLite f47122d;

    public static class a<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Map.Entry<K, LazyField> f47123p0;

        public a() {
            throw null;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f47123p0.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            LazyField value = this.f47123p0.getValue();
            if (value == null) {
                return null;
            }
            return value.getValue();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (obj instanceof MessageLite) {
                return this.f47123p0.getValue().setValue((MessageLite) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    public static class b<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Iterator<Map.Entry<K, Object>> f47124p0;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.f47124p0 = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f47124p0.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f47124p0.next();
            if (!(next.getValue() instanceof LazyField)) {
                return next;
            }
            a aVar = new a();
            aVar.f47123p0 = next;
            return aVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f47124p0.remove();
        }
    }

    public LazyField(MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite, ByteString byteString) {
        super(extensionRegistryLite, byteString);
        this.f47122d = messageLite;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyFieldLite
    public boolean containsDefaultInstance() {
        return super.containsDefaultInstance() || this.value == this.f47122d;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyFieldLite
    public boolean equals(Object obj) {
        return getValue().equals(obj);
    }

    public MessageLite getValue() {
        return getValue(this.f47122d);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyFieldLite
    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue().toString();
    }
}
