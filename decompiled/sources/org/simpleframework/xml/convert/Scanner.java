package org.simpleframework.xml.convert;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes13.dex */
interface Scanner {
    <T extends Annotation> T scan(Class<T> cls);
}
