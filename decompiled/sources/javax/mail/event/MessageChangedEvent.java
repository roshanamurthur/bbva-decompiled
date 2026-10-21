package javax.mail.event;

import javax.mail.Message;

/* JADX INFO: loaded from: classes12.dex */
public class MessageChangedEvent extends MailEvent {
    public static final int ENVELOPE_CHANGED = 2;
    public static final int FLAGS_CHANGED = 1;
    protected transient Message msg;
    protected int type;

    public MessageChangedEvent(Object obj, int i10, Message message) {
        super(obj);
        this.msg = message;
        this.type = i10;
    }

    @Override // javax.mail.event.MailEvent
    public void dispatch(Object obj) {
        ((MessageChangedListener) obj).messageChanged(this);
    }

    public Message getMessage() {
        return this.msg;
    }

    public int getMessageChangeType() {
        return this.type;
    }
}
