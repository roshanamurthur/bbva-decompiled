package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes13.dex */
public interface Transform<T> {
    T read(String str) throws Exception;

    String write(T t10) throws Exception;
}
