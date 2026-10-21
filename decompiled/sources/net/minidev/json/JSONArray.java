package net.minidev.json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import net.minidev.json.reader.JsonWriter;

/* JADX INFO: loaded from: classes12.dex */
public class JSONArray extends ArrayList<Object> implements List<Object>, JSONAwareEx, JSONStreamAwareEx {
    public static String toJSONString(List<? extends Object> list) {
        return toJSONString(list, JSONValue.COMPRESSION);
    }

    public static void writeJSONString(Iterable<? extends Object> iterable, Appendable appendable, JSONStyle jSONStyle) throws IOException {
        if (iterable == null) {
            appendable.append(AbstractJsonLexerKt.NULL);
        } else {
            JsonWriter.JSONIterableWriter.writeJSONString(iterable, appendable, jSONStyle);
        }
    }

    public void merge(Object obj) {
        JSONObject.merge(this, obj);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return toJSONString();
    }

    public static String toJSONString(List<? extends Object> list, JSONStyle jSONStyle) {
        StringBuilder sb2 = new StringBuilder();
        try {
            writeJSONString(list, sb2, jSONStyle);
        } catch (IOException unused) {
        }
        return sb2.toString();
    }

    public String toString(JSONStyle jSONStyle) {
        return toJSONString(jSONStyle);
    }

    public static void writeJSONString(List<? extends Object> list, Appendable appendable) throws IOException {
        writeJSONString(list, appendable, JSONValue.COMPRESSION);
    }

    @Override // net.minidev.json.JSONStreamAware
    public void writeJSONString(Appendable appendable) throws IOException {
        writeJSONString(this, appendable, JSONValue.COMPRESSION);
    }

    @Override // net.minidev.json.JSONAware
    public String toJSONString() {
        return toJSONString(this, JSONValue.COMPRESSION);
    }

    @Override // net.minidev.json.JSONStreamAwareEx
    public void writeJSONString(Appendable appendable, JSONStyle jSONStyle) throws IOException {
        writeJSONString(this, appendable, jSONStyle);
    }

    @Override // net.minidev.json.JSONAwareEx
    public String toJSONString(JSONStyle jSONStyle) {
        return toJSONString(this, jSONStyle);
    }
}
