package com.nimbusds.jose.shaded.json.parser;

import com.nimbusds.jose.shaded.json.JSONArray;
import com.nimbusds.jose.shaded.json.JSONObject;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public interface ContainerFactory {
    public static final ContainerFactory FACTORY_SIMPLE = new a();
    public static final ContainerFactory FACTORY_ORDERED = new b();

    public static class a implements ContainerFactory {
        @Override // com.nimbusds.jose.shaded.json.parser.ContainerFactory
        public final List<Object> createArrayContainer() {
            return new JSONArray();
        }

        @Override // com.nimbusds.jose.shaded.json.parser.ContainerFactory
        public final Map<String, Object> createObjectContainer() {
            return new JSONObject();
        }
    }

    public static class b implements ContainerFactory {
        @Override // com.nimbusds.jose.shaded.json.parser.ContainerFactory
        public final List<Object> createArrayContainer() {
            return new JSONArray();
        }

        @Override // com.nimbusds.jose.shaded.json.parser.ContainerFactory
        public final Map<String, Object> createObjectContainer() {
            return new LinkedHashMap();
        }
    }

    List<Object> createArrayContainer();

    Map<String, Object> createObjectContainer();
}
