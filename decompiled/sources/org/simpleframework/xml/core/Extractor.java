package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes13.dex */
interface Extractor<T extends Annotation> {
    T[] getAnnotations() throws Exception;

    Label getLabel(T t10) throws Exception;

    Class getType(T t10) throws Exception;
}
