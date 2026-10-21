package org.simpleframework.xml.transform;

import java.net.URL;

/* JADX INFO: loaded from: classes13.dex */
class URLTransform implements Transform<URL> {
    @Override // org.simpleframework.xml.transform.Transform
    public URL read(String str) throws Exception {
        return new URL(str);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(URL url) throws Exception {
        return url.toString();
    }
}
