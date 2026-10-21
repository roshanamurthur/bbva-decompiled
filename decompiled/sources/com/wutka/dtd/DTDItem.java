package com.wutka.dtd;

import java.io.IOException;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes7.dex */
public abstract class DTDItem implements DTDOutput {
    public DTDCardinal cardinal;

    public DTDItem() {
        this.cardinal = DTDCardinal.NONE;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DTDItem)) {
            return false;
        }
        DTDItem dTDItem = (DTDItem) obj;
        DTDCardinal dTDCardinal = this.cardinal;
        if (dTDCardinal == null) {
            if (dTDItem.cardinal != null) {
                return false;
            }
        } else if (!dTDCardinal.equals(dTDItem.cardinal)) {
            return false;
        }
        return true;
    }

    public DTDCardinal getCardinal() {
        return this.cardinal;
    }

    public void setCardinal(DTDCardinal dTDCardinal) {
        this.cardinal = dTDCardinal;
    }

    @Override // com.wutka.dtd.DTDOutput
    public abstract void write(PrintWriter printWriter) throws IOException;

    public DTDItem(DTDCardinal dTDCardinal) {
        this.cardinal = dTDCardinal;
    }
}
