package tc;

/* JADX INFO: compiled from: CallbackException.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b extends RuntimeException {
    public b(Throwable th2) {
        super("Unexpected exception thrown by non-Glide code", th2);
    }
}
