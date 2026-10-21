package org.simpleframework.xml.convert;

import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes13.dex */
public interface Converter<T> {
    T read(InputNode inputNode) throws Exception;

    void write(OutputNode outputNode, T t10) throws Exception;
}
