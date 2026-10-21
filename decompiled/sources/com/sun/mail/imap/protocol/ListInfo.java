package com.sun.mail.imap.protocol;

import com.fasterxml.jackson.core.JsonPointer;
import com.sun.mail.iap.ParsingException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class ListInfo {
    public static final int CHANGED = 1;
    public static final int INDETERMINATE = 3;
    public static final int UNCHANGED = 2;
    public String[] attrs;
    public boolean canOpen;
    public int changeState;
    public boolean hasInferiors;
    public String name;
    public char separator;

    public ListInfo(IMAPResponse iMAPResponse) throws ParsingException {
        this.name = null;
        this.separator = JsonPointer.SEPARATOR;
        this.hasInferiors = true;
        this.canOpen = true;
        this.changeState = 3;
        String[] simpleList = iMAPResponse.readSimpleList();
        ArrayList arrayList = new ArrayList();
        if (simpleList != null) {
            for (int i10 = 0; i10 < simpleList.length; i10++) {
                if (simpleList[i10].equalsIgnoreCase("\\Marked")) {
                    this.changeState = 1;
                } else if (simpleList[i10].equalsIgnoreCase("\\Unmarked")) {
                    this.changeState = 2;
                } else if (simpleList[i10].equalsIgnoreCase("\\Noselect")) {
                    this.canOpen = false;
                } else if (simpleList[i10].equalsIgnoreCase("\\Noinferiors")) {
                    this.hasInferiors = false;
                }
                arrayList.add(simpleList[i10]);
            }
        }
        this.attrs = (String[]) arrayList.toArray(new String[arrayList.size()]);
        iMAPResponse.skipSpaces();
        if (iMAPResponse.readByte() == 34) {
            char c10 = (char) iMAPResponse.readByte();
            this.separator = c10;
            if (c10 == '\\') {
                this.separator = (char) iMAPResponse.readByte();
            }
            iMAPResponse.skip(1);
        } else {
            iMAPResponse.skip(2);
        }
        iMAPResponse.skipSpaces();
        this.name = iMAPResponse.readAtomString();
        if (iMAPResponse.supportsUtf8()) {
            return;
        }
        this.name = BASE64MailboxDecoder.decode(this.name);
    }
}
