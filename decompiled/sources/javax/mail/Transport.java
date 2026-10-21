package javax.mail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import javax.mail.event.TransportEvent;
import javax.mail.event.TransportListener;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Transport extends Service {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public volatile Vector<TransportListener> f78928s0;

    public Transport(Session session, URLName uRLName) {
        super(session, uRLName);
        this.f78928s0 = null;
    }

    public static void a(Message message, Address[] addressArr, String str, String str2) throws MessagingException {
        Address[] addressArr2;
        Address[] addressArr3;
        if (addressArr == null || addressArr.length == 0) {
            throw new SendFailedException("No recipient addresses");
        }
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < addressArr.length; i10++) {
            if (map.containsKey(addressArr[i10].getType())) {
                ((List) map.get(addressArr[i10].getType())).add(addressArr[i10]);
            } else {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(addressArr[i10]);
                map.put(addressArr[i10].getType(), arrayList4);
            }
        }
        int size = map.size();
        if (size == 0) {
            throw new SendFailedException("No recipient addresses");
        }
        Session defaultInstance = message.session;
        Address[] addressArr4 = null;
        if (defaultInstance == null) {
            defaultInstance = Session.getDefaultInstance(System.getProperties(), null);
        }
        if (size == 1) {
            Transport transport = defaultInstance.getTransport(addressArr[0]);
            try {
                if (str != null) {
                    transport.connect(str, str2);
                } else {
                    transport.connect();
                }
                transport.sendMessage(message, addressArr);
                transport.close();
                return;
            } catch (Throwable th2) {
                transport.close();
                throw th2;
            }
        }
        boolean z10 = false;
        MessagingException messagingException = null;
        for (List list : map.values()) {
            int size2 = list.size();
            Address[] addressArr5 = new Address[size2];
            list.toArray(addressArr5);
            Transport transport2 = defaultInstance.getTransport(addressArr5[0]);
            if (transport2 == null) {
                for (int i11 = 0; i11 < size2; i11++) {
                    arrayList.add(addressArr5[i11]);
                }
            } else {
                try {
                    try {
                        transport2.connect();
                        transport2.sendMessage(message, addressArr5);
                        transport2.close();
                    } catch (Throwable th3) {
                        transport2.close();
                        throw th3;
                    }
                } catch (SendFailedException e5) {
                    if (messagingException == null) {
                        messagingException = e5;
                    } else {
                        messagingException.setNextException(e5);
                    }
                    Address[] invalidAddresses = e5.getInvalidAddresses();
                    if (invalidAddresses != null) {
                        for (Address address : invalidAddresses) {
                            arrayList.add(address);
                        }
                    }
                    Address[] validSentAddresses = e5.getValidSentAddresses();
                    if (validSentAddresses != null) {
                        for (Address address2 : validSentAddresses) {
                            arrayList2.add(address2);
                        }
                    }
                    Address[] validUnsentAddresses = e5.getValidUnsentAddresses();
                    if (validUnsentAddresses != null) {
                        for (Address address3 : validUnsentAddresses) {
                            arrayList3.add(address3);
                        }
                    }
                    transport2.close();
                    z10 = true;
                } catch (MessagingException e7) {
                    if (messagingException == null) {
                        messagingException = e7;
                    } else {
                        messagingException.setNextException(e7);
                    }
                    transport2.close();
                    z10 = true;
                }
            }
        }
        if (!z10 && arrayList.size() == 0 && arrayList3.size() == 0) {
            return;
        }
        if (arrayList2.size() > 0) {
            Address[] addressArr6 = new Address[arrayList2.size()];
            arrayList2.toArray(addressArr6);
            addressArr2 = addressArr6;
        } else {
            addressArr2 = null;
        }
        if (arrayList3.size() > 0) {
            Address[] addressArr7 = new Address[arrayList3.size()];
            arrayList3.toArray(addressArr7);
            addressArr3 = addressArr7;
        } else {
            addressArr3 = null;
        }
        if (arrayList.size() > 0) {
            addressArr4 = new Address[arrayList.size()];
            arrayList.toArray(addressArr4);
        }
        throw new SendFailedException("Sending failed", messagingException, addressArr2, addressArr3, addressArr4);
    }

    public static void send(Message message) throws MessagingException {
        message.saveChanges();
        a(message, message.getAllRecipients(), null, null);
    }

    public synchronized void addTransportListener(TransportListener transportListener) {
        try {
            if (this.f78928s0 == null) {
                this.f78928s0 = new Vector<>();
            }
            this.f78928s0.addElement(transportListener);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void notifyTransportListeners(int i10, Address[] addressArr, Address[] addressArr2, Address[] addressArr3, Message message) {
        if (this.f78928s0 == null) {
            return;
        }
        queueEvent(new TransportEvent(this, i10, addressArr, addressArr2, addressArr3, message), this.f78928s0);
    }

    public synchronized void removeTransportListener(TransportListener transportListener) {
        if (this.f78928s0 != null) {
            this.f78928s0.removeElement(transportListener);
        }
    }

    public abstract void sendMessage(Message message, Address[] addressArr) throws MessagingException;

    public static void send(Message message, Address[] addressArr) throws MessagingException {
        message.saveChanges();
        a(message, addressArr, null, null);
    }

    public static void send(Message message, String str, String str2) throws MessagingException {
        message.saveChanges();
        a(message, message.getAllRecipients(), str, str2);
    }

    public static void send(Message message, Address[] addressArr, String str, String str2) throws MessagingException {
        message.saveChanges();
        a(message, addressArr, str, str2);
    }
}
