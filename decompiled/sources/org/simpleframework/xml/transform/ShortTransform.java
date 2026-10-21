package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes13.dex */
class ShortTransform implements Transform<Short> {
    @Override // org.simpleframework.xml.transform.Transform
    public Short read(String str) {
        return Short.valueOf(str);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(Short sh2) {
        return sh2.toString();
    }
}
