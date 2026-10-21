package com.wutka.dtd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.URL;

/* JADX INFO: loaded from: classes7.dex */
public class DTDEntity implements DTDOutput {
    public Object defaultLocation;
    public DTDExternalID externalID;
    public boolean isParsed;
    public String name;
    public String ndata;
    public String value;

    public DTDEntity() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DTDEntity)) {
            return false;
        }
        DTDEntity dTDEntity = (DTDEntity) obj;
        String str = this.name;
        if (str == null) {
            if (dTDEntity.name != null) {
                return false;
            }
        } else if (!str.equals(dTDEntity.name)) {
            return false;
        }
        if (this.isParsed != dTDEntity.isParsed) {
            return false;
        }
        String str2 = this.value;
        if (str2 == null) {
            if (dTDEntity.value != null) {
                return false;
            }
        } else if (!str2.equals(dTDEntity.value)) {
            return false;
        }
        DTDExternalID dTDExternalID = this.externalID;
        if (dTDExternalID == null) {
            if (dTDEntity.externalID != null) {
                return false;
            }
        } else if (!dTDExternalID.equals(dTDEntity.externalID)) {
            return false;
        }
        String str3 = this.ndata;
        if (str3 == null) {
            if (dTDEntity.ndata != null) {
                return false;
            }
        } else if (!str3.equals(dTDEntity.ndata)) {
            return false;
        }
        return true;
    }

    public DTDExternalID getExternalID() {
        return this.externalID;
    }

    public String getExternalId() {
        return this.externalID.system;
    }

    public String getName() {
        return this.name;
    }

    public String getNdata() {
        return this.ndata;
    }

    public Reader getReader() throws IOException {
        DTDExternalID dTDExternalID = this.externalID;
        if (dTDExternalID == null) {
            return null;
        }
        return getReader(dTDExternalID.system);
    }

    public String getValue() {
        return this.value;
    }

    public boolean isParsed() {
        return this.isParsed;
    }

    public void setExternalID(DTDExternalID dTDExternalID) {
        this.externalID = dTDExternalID;
    }

    public void setIsParsed(boolean z10) {
        this.isParsed = z10;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNdata(String str) {
        this.ndata = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    @Override // com.wutka.dtd.DTDOutput
    public void write(PrintWriter printWriter) throws IOException {
        printWriter.print("<!ENTITY ");
        if (this.isParsed) {
            printWriter.print(" % ");
        }
        printWriter.print(this.name);
        String str = this.value;
        if (str != null) {
            char c10 = str.indexOf(34) >= 0 ? '\'' : '\"';
            printWriter.print(c10);
            printWriter.print(this.value);
            printWriter.print(c10);
        } else {
            this.externalID.write(printWriter);
            if (this.ndata != null) {
                printWriter.print(" NDATA ");
                printWriter.print(this.ndata);
            }
        }
        printWriter.println(">");
    }

    public DTDEntity(String str) {
        this.name = str;
    }

    public Reader getReader(String str) {
        try {
            try {
                Object obj = this.defaultLocation;
                if (obj != null) {
                    if (obj instanceof File) {
                        return new BufferedReader(new FileReader(new File((File) obj, str)));
                    }
                    if (obj instanceof URL) {
                        return new BufferedReader(new InputStreamReader(new URL((URL) this.defaultLocation, str).openStream()));
                    }
                }
                return new BufferedReader(new FileReader(str));
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return new BufferedReader(new InputStreamReader(new URL(str).openStream()));
        }
    }

    public DTDEntity(String str, Object obj) {
        this.name = str;
        this.defaultLocation = obj;
    }
}
