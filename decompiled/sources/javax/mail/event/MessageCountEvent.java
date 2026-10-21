package javax.mail.event;

import javax.mail.Folder;
import javax.mail.Message;

/* JADX INFO: loaded from: classes12.dex */
public class MessageCountEvent extends MailEvent {
    public static final int ADDED = 1;
    public static final int REMOVED = 2;
    protected transient Message[] msgs;
    protected boolean removed;
    protected int type;

    public MessageCountEvent(Folder folder, int i10, boolean z10, Message[] messageArr) {
        super(folder);
        this.type = i10;
        this.removed = z10;
        this.msgs = messageArr;
    }

    @Override // javax.mail.event.MailEvent
    public void dispatch(Object obj) {
        if (this.type == 1) {
            ((MessageCountListener) obj).messagesAdded(this);
        } else {
            ((MessageCountListener) obj).messagesRemoved(this);
        }
    }

    public Message[] getMessages() {
        return this.msgs;
    }

    public int getType() {
        return this.type;
    }

    public boolean isRemoved() {
        return this.removed;
    }
}
