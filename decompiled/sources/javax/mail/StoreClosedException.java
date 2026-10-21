package javax.mail;

/* JADX INFO: loaded from: classes12.dex */
public class StoreClosedException extends MessagingException {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final transient Store f78927q0;

    public StoreClosedException(Store store) {
        this(store, null);
    }

    public Store getStore() {
        return this.f78927q0;
    }

    public StoreClosedException(Store store, String str) {
        super(str);
        this.f78927q0 = store;
    }

    public StoreClosedException(Store store, String str, Exception exc) {
        super(str, exc);
        this.f78927q0 = store;
    }
}
