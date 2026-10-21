package javax.mail.event;

import javax.mail.Store;

/* JADX INFO: loaded from: classes12.dex */
public class StoreEvent extends MailEvent {
    public static final int ALERT = 1;
    public static final int NOTICE = 2;
    protected String message;
    protected int type;

    public StoreEvent(Store store, int i10, String str) {
        super(store);
        this.type = i10;
        this.message = str;
    }

    @Override // javax.mail.event.MailEvent
    public void dispatch(Object obj) {
        ((StoreListener) obj).notification(this);
    }

    public String getMessage() {
        return this.message;
    }

    public int getMessageType() {
        return this.type;
    }
}
