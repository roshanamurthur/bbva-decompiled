package com.wutka.dtd;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* JADX INFO: loaded from: classes7.dex */
public class DTD implements DTDOutput {
    public DTDElement rootElement;
    public Hashtable elements = new Hashtable();
    public Hashtable entities = new Hashtable();
    public Hashtable notations = new Hashtable();
    public Hashtable externalDTDs = new Hashtable();
    public Vector items = new Vector();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DTD) {
            return this.items.equals(((DTD) obj).items);
        }
        return false;
    }

    public Object getItem(int i10) {
        return this.items.elementAt(i10);
    }

    public Object[] getItems() {
        return this.items.toArray();
    }

    public Vector getItemsByType(Class cls) {
        Vector vector = new Vector();
        Enumeration enumerationElements = this.items.elements();
        while (enumerationElements.hasMoreElements()) {
            Object objNextElement = enumerationElements.nextElement();
            if (cls.isAssignableFrom(objNextElement.getClass())) {
                vector.addElement(objNextElement);
            }
        }
        return vector;
    }

    public void setItem(Object obj, int i10) {
        this.items.setElementAt(obj, i10);
    }

    public void setItems(Object[] objArr) {
        this.items = new Vector(objArr.length);
        for (Object obj : objArr) {
            this.items.addElement(obj);
        }
    }

    @Override // com.wutka.dtd.DTDOutput
    public void write(PrintWriter printWriter) throws IOException {
        Enumeration enumerationElements = this.items.elements();
        while (enumerationElements.hasMoreElements()) {
            ((DTDOutput) enumerationElements.nextElement()).write(printWriter);
        }
    }
}
