package xe;

import android.content.res.XmlResourceParser;
import androidx.annotation.Nullable;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class u {
    @Nullable
    public static final String a(String str, XmlResourceParser xmlResourceParser) {
        for (int i10 = 0; i10 < xmlResourceParser.getAttributeCount(); i10++) {
            if (xmlResourceParser.getAttributeName(i10).equals(str)) {
                return xmlResourceParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static final void b(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 != 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }
}
