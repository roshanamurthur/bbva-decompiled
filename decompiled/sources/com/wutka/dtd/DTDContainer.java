package com.wutka.dtd;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

/* JADX INFO: loaded from: classes7.dex */
public abstract class DTDContainer extends DTDItem {
    protected Vector items = new Vector();

    public void add(DTDItem dTDItem) {
        this.items.addElement(dTDItem);
    }

    @Override // com.wutka.dtd.DTDItem
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof DTDContainer) && super.equals(obj)) {
            return this.items.equals(((DTDContainer) obj).items);
        }
        return false;
    }

    public DTDItem[] getItem() {
        DTDItem[] dTDItemArr = new DTDItem[this.items.size()];
        this.items.copyInto(dTDItemArr);
        return dTDItemArr;
    }

    public DTDItem[] getItems() {
        DTDItem[] dTDItemArr = new DTDItem[this.items.size()];
        this.items.copyInto(dTDItemArr);
        return dTDItemArr;
    }

    public Vector getItemsVec() {
        return this.items;
    }

    public void remove(DTDItem dTDItem) {
        this.items.removeElement(dTDItem);
    }

    public void setItem(DTDItem[] dTDItemArr) {
        this.items = new Vector(dTDItemArr.length);
        for (DTDItem dTDItem : dTDItemArr) {
            this.items.addElement(dTDItem);
        }
    }

    @Override // com.wutka.dtd.DTDItem, com.wutka.dtd.DTDOutput
    public abstract void write(PrintWriter printWriter) throws IOException;

    public DTDItem getItem(int i10) {
        return (DTDItem) this.items.elementAt(i10);
    }

    public void setItem(DTDItem dTDItem, int i10) {
        this.items.setElementAt(dTDItem, i10);
    }
}
