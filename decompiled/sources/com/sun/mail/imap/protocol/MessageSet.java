package com.sun.mail.imap.protocol;

import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class MessageSet {
    public int end;
    public int start;

    public MessageSet() {
    }

    public MessageSet(int i10, int i11) {
        this.start = i10;
        this.end = i11;
    }

    public static MessageSet[] createMessageSets(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < iArr.length) {
            MessageSet messageSet = new MessageSet();
            messageSet.start = iArr[i10];
            do {
                i10++;
                if (i10 >= iArr.length) {
                    break;
                }
            } while (iArr[i10] == iArr[i10 - 1] + 1);
            messageSet.end = iArr[i10 - 1];
            arrayList.add(messageSet);
        }
        return (MessageSet[]) arrayList.toArray(new MessageSet[arrayList.size()]);
    }

    public static String toString(MessageSet[] messageSetArr) {
        if (messageSetArr == null || messageSetArr.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int length = messageSetArr.length;
        int i10 = 0;
        while (true) {
            MessageSet messageSet = messageSetArr[i10];
            int i11 = messageSet.start;
            int i12 = messageSet.end;
            if (i12 > i11) {
                sb2.append(i11);
                sb2.append(AbstractJsonLexerKt.COLON);
                sb2.append(i12);
            } else {
                sb2.append(i11);
            }
            i10++;
            if (i10 >= length) {
                return sb2.toString();
            }
            sb2.append(AbstractJsonLexerKt.COMMA);
        }
    }

    public int size() {
        return (this.end - this.start) + 1;
    }

    public static int size(MessageSet[] messageSetArr) {
        if (messageSetArr == null) {
            return 0;
        }
        int size = 0;
        for (MessageSet messageSet : messageSetArr) {
            size += messageSet.size();
        }
        return size;
    }
}
