package net.minidev.json.reader;

import java.io.IOException;
import net.minidev.json.JSONStyle;

/* JADX INFO: loaded from: classes12.dex */
public interface JsonWriterI<T> {
    <E extends T> void writeJSONString(E e5, Appendable appendable, JSONStyle jSONStyle) throws IOException;
}
