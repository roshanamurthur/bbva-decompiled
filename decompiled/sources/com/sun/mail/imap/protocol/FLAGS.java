package com.sun.mail.imap.protocol;

import com.sun.mail.iap.ParsingException;
import javax.mail.Flags;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes9.dex */
public class FLAGS extends Flags implements Item {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final char[] f65422r0 = {'F', Matrix.MATRIX_TYPE_RANDOM_LT, 'A', 'G', 'S'};
    public int msgno;

    public FLAGS(IMAPResponse iMAPResponse) throws ParsingException {
        this.msgno = iMAPResponse.getNumber();
        iMAPResponse.skipSpaces();
        String[] simpleList = iMAPResponse.readSimpleList();
        if (simpleList != null) {
            for (String str : simpleList) {
                if (str.length() < 2 || str.charAt(0) != '\\') {
                    add(str);
                } else {
                    char upperCase = Character.toUpperCase(str.charAt(1));
                    if (upperCase == '*') {
                        add(Flags.Flag.USER);
                    } else if (upperCase == 'A') {
                        add(Flags.Flag.ANSWERED);
                    } else if (upperCase != 'D') {
                        if (upperCase == 'F') {
                            add(Flags.Flag.FLAGGED);
                        } else if (upperCase == 'R') {
                            add(Flags.Flag.RECENT);
                        } else if (upperCase != 'S') {
                            add(str);
                        } else {
                            add(Flags.Flag.SEEN);
                        }
                    } else if (str.length() >= 3) {
                        char cCharAt = str.charAt(2);
                        if (cCharAt == 'e' || cCharAt == 'E') {
                            add(Flags.Flag.DELETED);
                        } else if (cCharAt == 'r' || cCharAt == 'R') {
                            add(Flags.Flag.DRAFT);
                        }
                    } else {
                        add(str);
                    }
                }
            }
        }
    }
}
