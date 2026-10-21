package com.wutka.dtd;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Vector;

/* JADX INFO: loaded from: classes7.dex */
public class DTDAttlist implements DTDOutput {
    public Vector attributes = new Vector();
    public String name;

    public DTDAttlist() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DTDAttlist)) {
            return false;
        }
        DTDAttlist dTDAttlist = (DTDAttlist) obj;
        String str = this.name;
        if (str == null && dTDAttlist.name != null) {
            return false;
        }
        if (str == null || str.equals(dTDAttlist.name)) {
            return this.attributes.equals(dTDAttlist.attributes);
        }
        return false;
    }

    public DTDAttribute[] getAttribute() {
        DTDAttribute[] dTDAttributeArr = new DTDAttribute[this.attributes.size()];
        this.attributes.copyInto(dTDAttributeArr);
        return dTDAttributeArr;
    }

    public String getName() {
        return this.name;
    }

    public void setAttribute(DTDAttribute[] dTDAttributeArr) {
        this.attributes = new Vector(dTDAttributeArr.length);
        for (DTDAttribute dTDAttribute : dTDAttributeArr) {
            this.attributes.addElement(dTDAttribute);
        }
    }

    public void setName(String str) {
        this.name = str;
    }

    @Override // com.wutka.dtd.DTDOutput
    public void write(PrintWriter printWriter) throws IOException {
        printWriter.print("<!ATTLIST ");
        printWriter.println(this.name);
        Iterator it = this.attributes.iterator();
        while (it.hasNext()) {
            printWriter.print("           ");
            ((DTDAttribute) it.next()).write(printWriter);
            if (it.hasNext()) {
                printWriter.println();
            } else {
                printWriter.println(">");
            }
        }
    }

    public DTDAttlist(String str) {
        this.name = str;
    }

    public DTDAttribute getAttribute(int i10) {
        return (DTDAttribute) this.attributes.elementAt(i10);
    }

    public void setAttribute(DTDAttribute dTDAttribute, int i10) {
        this.attributes.setElementAt(dTDAttribute, i10);
    }
}
