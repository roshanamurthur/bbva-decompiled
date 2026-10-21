package org.simpleframework.xml.transform;

import org.simpleframework.xml.core.PersistenceException;

/* JADX INFO: loaded from: classes13.dex */
public class TransformException extends PersistenceException {
    public TransformException(String str, Object... objArr) {
        super(String.format(str, objArr), new Object[0]);
    }

    public TransformException(Throwable th2, String str, Object... objArr) {
        super(String.format(str, objArr), th2);
    }
}
