package com.wutka.dtd;

import androidx.webkit.ProxyConfig;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import java.io.IOException;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes7.dex */
public class DTDCardinal implements DTDOutput {
    public String name;
    public int type;
    public static final DTDCardinal NONE = new DTDCardinal(0, ExpectedUserActionOnPoiTypes.NONE);
    public static final DTDCardinal OPTIONAL = new DTDCardinal(1, "OPTIONAL");
    public static final DTDCardinal ZEROMANY = new DTDCardinal(2, "ZEROMANY");
    public static final DTDCardinal ONEMANY = new DTDCardinal(3, "ONEMANY");

    public DTDCardinal(int i10, String str) {
        this.type = i10;
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof DTDCardinal) && ((DTDCardinal) obj).type == this.type;
    }

    @Override // com.wutka.dtd.DTDOutput
    public void write(PrintWriter printWriter) throws IOException {
        if (this == NONE) {
            return;
        }
        if (this == OPTIONAL) {
            printWriter.print("?");
        } else if (this == ZEROMANY) {
            printWriter.print(ProxyConfig.MATCH_ALL_SCHEMES);
        } else if (this == ONEMANY) {
            printWriter.print("+");
        }
    }
}
