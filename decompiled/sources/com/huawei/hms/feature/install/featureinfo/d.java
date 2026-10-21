package com.huawei.hms.feature.install.featureinfo;

import android.text.TextUtils;
import com.huawei.hms.feature.utils.Logger;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50406a = "d";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final XmlPullParser f50407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f50408c = new c();

    public d(XmlPullParser xmlPullParser) {
        this.f50407b = xmlPullParser;
    }

    private final String a(String str) {
        for (int i10 = 0; i10 < this.f50407b.getAttributeCount(); i10++) {
            if (this.f50407b.getAttributeName(i10).equals(str)) {
                return this.f50407b.getAttributeValue(i10);
            }
        }
        return null;
    }

    public final b b() {
        String strA;
        while (this.f50407b.next() != 1) {
            try {
                if (this.f50407b.getEventType() == 2) {
                    if (this.f50407b.getName().equals("splits")) {
                        while (this.f50407b.next() != 3) {
                            if (this.f50407b.getEventType() == 2) {
                                if (!this.f50407b.getName().equals("module") || (strA = a("name")) == null) {
                                    a();
                                } else {
                                    b(strA);
                                }
                            }
                        }
                    } else {
                        a();
                    }
                }
            } catch (IOException | IllegalStateException | XmlPullParserException unused) {
                Logger.e(f50406a, "Parsing splits.xml failed.");
                return null;
            }
        }
        return this.f50408c.a();
    }

    private final void a() throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 != 0) {
            int next = this.f50407b.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    private final void b(String str) throws XmlPullParserException, IOException {
        while (this.f50407b.next() != 3) {
            if (this.f50407b.getEventType() == 2) {
                if (TextUtils.equals(this.f50407b.getName(), "language")) {
                    while (this.f50407b.next() != 3) {
                        if (this.f50407b.getEventType() == 2) {
                            if (this.f50407b.getName().equals("entry")) {
                                String strA = a("key");
                                String strA2 = a("split");
                                a();
                                if (strA != null && strA2 != null) {
                                    this.f50408c.a(str, strA, strA2);
                                }
                            } else {
                                a();
                            }
                        }
                    }
                } else {
                    a();
                }
            }
        }
    }
}
