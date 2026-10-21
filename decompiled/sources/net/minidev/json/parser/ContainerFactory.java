package net.minidev.json.parser;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public interface ContainerFactory {
    public static final ContainerFactory FACTORY_SIMPLE = new a();
    public static final ContainerFactory FACTORY_ORDERED = new b();

    public static class a implements ContainerFactory {
        @Override // net.minidev.json.parser.ContainerFactory
        public final List<Object> createArrayContainer() {
            return new JSONArray();
        }

        @Override // net.minidev.json.parser.ContainerFactory
        public final Map<String, Object> createObjectContainer() {
            return new JSONObject();
        }
    }

    public static class b implements ContainerFactory {
        @Override // net.minidev.json.parser.ContainerFactory
        public final List<Object> createArrayContainer() {
            return new JSONArray();
        }

        @Override // net.minidev.json.parser.ContainerFactory
        public final Map<String, Object> createObjectContainer() {
            return new LinkedHashMap();
        }
    }

    List<Object> createArrayContainer();

    Map<String, Object> createObjectContainer();
}
