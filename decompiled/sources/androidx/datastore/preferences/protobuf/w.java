package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: MapFieldSchemaLite.java */
/* JADX INFO: loaded from: classes2.dex */
public final class w implements v {
    @Override // androidx.datastore.preferences.protobuf.v
    public final MapFieldLite a(Object obj, Object obj2) {
        MapFieldLite mapFieldLiteMutableCopy = (MapFieldLite) obj;
        MapFieldLite mapFieldLite = (MapFieldLite) obj2;
        if (!mapFieldLite.isEmpty()) {
            if (!mapFieldLiteMutableCopy.isMutable()) {
                mapFieldLiteMutableCopy = mapFieldLiteMutableCopy.mutableCopy();
            }
            mapFieldLiteMutableCopy.mergeFrom(mapFieldLite);
        }
        return mapFieldLiteMutableCopy;
    }

    @Override // androidx.datastore.preferences.protobuf.v
    public final MapEntryLite.b<?, ?> b(Object obj) {
        return ((MapEntryLite) obj).f20968a;
    }

    @Override // androidx.datastore.preferences.protobuf.v
    public final MapFieldLite c(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.v
    public final MapFieldLite d(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.v
    public final Object e(Object obj) {
        ((MapFieldLite) obj).makeImmutable();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.v
    public final MapFieldLite f() {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    @Override // androidx.datastore.preferences.protobuf.v
    public final int g(int i10, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapEntryLite mapEntryLite = (MapEntryLite) obj2;
        int iComputeMessageSize = 0;
        if (!mapFieldLite.isEmpty()) {
            for (Map.Entry entry : mapFieldLite.entrySet()) {
                iComputeMessageSize += mapEntryLite.computeMessageSize(i10, entry.getKey(), entry.getValue());
            }
        }
        return iComputeMessageSize;
    }

    @Override // androidx.datastore.preferences.protobuf.v
    public final boolean h(Object obj) {
        return !((MapFieldLite) obj).isMutable();
    }
}
