package com.nimbusds.jose.shaded.json.reader;

import com.nimbusds.jose.shaded.json.JSONStyle;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public interface JsonWriterI<T> {
    <E extends T> void writeJSONString(E e5, Appendable appendable, JSONStyle jSONStyle) throws IOException;
}
