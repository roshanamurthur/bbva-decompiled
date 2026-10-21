package oc;

import mx.openpay.library.domain.util.Constant;

/* JADX INFO: compiled from: Symbol.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f85391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f85392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85393c;

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(Constant.BRACKET_OPEN);
        stringBuffer.append(this.f85393c);
        stringBuffer.append("][");
        stringBuffer.append(this.f85391a);
        stringBuffer.append("][");
        stringBuffer.append(this.f85392b);
        stringBuffer.append(Constant.BRACKET_CLOSE);
        return stringBuffer.toString();
    }
}
