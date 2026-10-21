package com.google.crypto.tink.shaded.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: MapFieldSchemaLite.java */
/* JADX INFO: loaded from: classes10.dex */
public final class y implements x {
    @Override // com.google.crypto.tink.shaded.protobuf.x
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

    @Override // com.google.crypto.tink.shaded.protobuf.x
    public final MapEntryLite.b<?, ?> b(Object obj) {
        return ((MapEntryLite) obj).f47132a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x
    public final MapFieldLite c(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x
    public final MapFieldLite d(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x
    public final Object e(Object obj) {
        ((MapFieldLite) obj).makeImmutable();
        return obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x
    public final MapFieldLite f() {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x
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

    @Override // com.google.crypto.tink.shaded.protobuf.x
    public final boolean h(Object obj) {
        return !((MapFieldLite) obj).isMutable();
    }
}
