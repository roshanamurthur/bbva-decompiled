package javax.mail.event;

/* JADX INFO: loaded from: classes12.dex */
public class ConnectionEvent extends MailEvent {
    public static final int CLOSED = 3;
    public static final int DISCONNECTED = 2;
    public static final int OPENED = 1;
    protected int type;

    public ConnectionEvent(Object obj, int i10) {
        super(obj);
        this.type = i10;
    }

    @Override // javax.mail.event.MailEvent
    public void dispatch(Object obj) {
        int i10 = this.type;
        if (i10 == 1) {
            ((ConnectionListener) obj).opened(this);
        } else if (i10 == 2) {
            ((ConnectionListener) obj).disconnected(this);
        } else if (i10 == 3) {
            ((ConnectionListener) obj).closed(this);
        }
    }

    public int getType() {
        return this.type;
    }
}
