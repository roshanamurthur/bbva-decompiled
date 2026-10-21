package com.sun.mail.imap;

import com.sun.mail.imap.protocol.MessageSet;
import com.sun.mail.imap.protocol.UIDSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import javax.mail.Message;

/* JADX INFO: loaded from: classes9.dex */
public final class Utility {

    public interface Condition {
        boolean test(IMAPMessage iMAPMessage);
    }

    public static class a implements Comparator<Message> {
        @Override // java.util.Comparator
        public final int compare(Message message, Message message2) {
            return message.getMessageNumber() - message2.getMessageNumber();
        }
    }

    public static UIDSet[] getResyncUIDSet(ResyncData resyncData) {
        return resyncData.f65394c;
    }

    public static MessageSet[] toMessageSet(Message[] messageArr, Condition condition) {
        ArrayList arrayList = new ArrayList(1);
        int i10 = 0;
        while (i10 < messageArr.length) {
            IMAPMessage iMAPMessage = (IMAPMessage) messageArr[i10];
            if (!iMAPMessage.isExpunged()) {
                int sequenceNumber = iMAPMessage.getSequenceNumber();
                if (condition == null || condition.test(iMAPMessage)) {
                    MessageSet messageSet = new MessageSet();
                    messageSet.start = sequenceNumber;
                    while (true) {
                        i10++;
                        if (i10 >= messageArr.length) {
                            break;
                        }
                        IMAPMessage iMAPMessage2 = (IMAPMessage) messageArr[i10];
                        if (!iMAPMessage2.isExpunged()) {
                            int sequenceNumber2 = iMAPMessage2.getSequenceNumber();
                            if (condition == null || condition.test(iMAPMessage2)) {
                                if (sequenceNumber2 != sequenceNumber + 1) {
                                    i10--;
                                    break;
                                }
                                sequenceNumber = sequenceNumber2;
                            }
                        }
                    }
                    messageSet.end = sequenceNumber;
                    arrayList.add(messageSet);
                }
            }
            i10++;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (MessageSet[]) arrayList.toArray(new MessageSet[arrayList.size()]);
    }

    public static MessageSet[] toMessageSetSorted(Message[] messageArr, Condition condition) {
        Message[] messageArr2 = (Message[]) messageArr.clone();
        Arrays.sort(messageArr2, new a());
        return toMessageSet(messageArr2, condition);
    }

    public static UIDSet[] toUIDSet(Message[] messageArr) {
        ArrayList arrayList = new ArrayList(1);
        int i10 = 0;
        while (i10 < messageArr.length) {
            IMAPMessage iMAPMessage = (IMAPMessage) messageArr[i10];
            if (!iMAPMessage.isExpunged()) {
                long uid = iMAPMessage.getUID();
                UIDSet uIDSet = new UIDSet();
                uIDSet.start = uid;
                while (true) {
                    i10++;
                    if (i10 >= messageArr.length) {
                        break;
                    }
                    IMAPMessage iMAPMessage2 = (IMAPMessage) messageArr[i10];
                    if (!iMAPMessage2.isExpunged()) {
                        long uid2 = iMAPMessage2.getUID();
                        if (uid2 != 1 + uid) {
                            i10--;
                            break;
                        }
                        uid = uid2;
                    }
                }
                uIDSet.end = uid;
                arrayList.add(uIDSet);
            }
            i10++;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (UIDSet[]) arrayList.toArray(new UIDSet[arrayList.size()]);
    }
}
