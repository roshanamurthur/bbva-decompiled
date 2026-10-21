package javax.mail;

/* JADX INFO: loaded from: classes12.dex */
public class MessagingException extends Exception {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Exception f78895p0;

    public MessagingException() {
        initCause(null);
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        return this.f78895p0;
    }

    public synchronized Exception getNextException() {
        return this.f78895p0;
    }

    public synchronized boolean setNextException(Exception exc) {
        Exception exc2 = this;
        while ((exc2 instanceof MessagingException) && ((MessagingException) exc2).f78895p0 != null) {
            try {
                exc2 = ((MessagingException) exc2).f78895p0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!(exc2 instanceof MessagingException)) {
            return false;
        }
        ((MessagingException) exc2).f78895p0 = exc;
        return true;
    }

    @Override // java.lang.Throwable
    public synchronized String toString() {
        try {
            String string = super.toString();
            Exception exc = this.f78895p0;
            if (exc == null) {
                return string;
            }
            if (string == null) {
                string = "";
            }
            StringBuilder sb2 = new StringBuilder(string);
            while (exc != null) {
                sb2.append(";\n  nested exception is:\n\t");
                if (exc instanceof MessagingException) {
                    MessagingException messagingException = (MessagingException) exc;
                    sb2.append(super.toString());
                    exc = messagingException.f78895p0;
                } else {
                    sb2.append(exc.toString());
                    exc = null;
                }
            }
            return sb2.toString();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public MessagingException(String str) {
        super(str);
        initCause(null);
    }

    public MessagingException(String str, Exception exc) {
        super(str);
        this.f78895p0 = exc;
        initCause(null);
    }
}
