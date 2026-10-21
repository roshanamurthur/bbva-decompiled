package com.nimbusds.jose.shaded.json.parser;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class FakeContainerFactory implements ContainerFactory {
    public a list;
    public b map;

    public static class a extends ArrayList<Object> {
        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(Object obj) {
            return false;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final Object get(int i10) {
            return null;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return 0;
        }
    }

    public static class b extends AbstractMap<String, Object> {
        @Override // java.util.AbstractMap, java.util.Map
        public final Set<Map.Entry<String, Object>> entrySet() {
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return null;
        }
    }

    @Override // com.nimbusds.jose.shaded.json.parser.ContainerFactory
    public List<Object> createArrayContainer() {
        if (this.list == null) {
            this.list = new a();
        }
        return this.list;
    }

    @Override // com.nimbusds.jose.shaded.json.parser.ContainerFactory
    public Map<String, Object> createObjectContainer() {
        if (this.map == null) {
            this.map = new b();
        }
        return this.map;
    }
}
