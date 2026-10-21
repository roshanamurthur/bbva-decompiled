package com.wutka.dtd;

import java.io.IOException;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes7.dex */
public class DTDPCData extends DTDItem {
    @Override // com.wutka.dtd.DTDItem
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DTDPCData) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // com.wutka.dtd.DTDItem, com.wutka.dtd.DTDOutput
    public void write(PrintWriter printWriter) throws IOException {
        printWriter.print("#PCDATA");
        this.cardinal.write(printWriter);
    }
}
