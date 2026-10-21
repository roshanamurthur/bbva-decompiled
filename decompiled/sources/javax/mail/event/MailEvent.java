package javax.mail.event;

import java.util.EventObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class MailEvent extends EventObject {
    public MailEvent(Object obj) {
        super(obj);
    }

    public abstract void dispatch(Object obj);
}
