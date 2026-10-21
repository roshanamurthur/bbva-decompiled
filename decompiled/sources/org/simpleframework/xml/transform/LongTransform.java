package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes13.dex */
class LongTransform implements Transform<Long> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.simpleframework.xml.transform.Transform
    public Long read(String str) {
        return Long.valueOf(str);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(Long l6) {
        return l6.toString();
    }
}
