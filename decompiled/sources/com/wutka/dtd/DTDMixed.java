package com.wutka.dtd;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes7.dex */
public class DTDMixed extends DTDContainer {
    @Override // com.wutka.dtd.DTDContainer, com.wutka.dtd.DTDItem
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DTDMixed) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // com.wutka.dtd.DTDContainer, com.wutka.dtd.DTDItem, com.wutka.dtd.DTDOutput
    public void write(PrintWriter printWriter) throws IOException {
        printWriter.print("(");
        Enumeration enumerationElements = getItemsVec().elements();
        boolean z10 = true;
        while (enumerationElements.hasMoreElements()) {
            if (!z10) {
                printWriter.print(" | ");
            }
            ((DTDItem) enumerationElements.nextElement()).write(printWriter);
            z10 = false;
        }
        printWriter.print(")");
        this.cardinal.write(printWriter);
    }
}
