package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes13.dex */
public class InvalidFormatException extends TransformException {
    public InvalidFormatException(String str, Object... objArr) {
        super(String.format(str, objArr), new Object[0]);
    }

    public InvalidFormatException(Throwable th2, String str, Object... objArr) {
        super(String.format(str, objArr), th2);
    }
}
