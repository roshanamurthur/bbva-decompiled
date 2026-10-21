package javax.mail;

/* JADX INFO: loaded from: classes12.dex */
public class MessageContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Part f78894a;

    public MessageContext(Part part) {
        this.f78894a = part;
    }

    public Message getMessage() {
        Message message = null;
        try {
            Part parent = this.f78894a;
            while (parent != null) {
                if (parent instanceof Message) {
                    message = (Message) parent;
                    return message;
                }
                Multipart parent2 = ((BodyPart) parent).getParent();
                if (parent2 == null) {
                    return null;
                }
                parent = parent2.getParent();
            }
            return null;
        } catch (MessagingException unused) {
            return message;
        }
    }

    public Part getPart() {
        return this.f78894a;
    }

    public Session getSession() {
        Message message = getMessage();
        if (message != null) {
            return message.getSession();
        }
        return null;
    }
}
