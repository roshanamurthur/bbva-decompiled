package javax.mail;

/* JADX INFO: loaded from: classes12.dex */
public class ReadOnlyFolderException extends MessagingException {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final transient Folder f78904q0;

    public ReadOnlyFolderException(Folder folder) {
        this(folder, null);
    }

    public Folder getFolder() {
        return this.f78904q0;
    }

    public ReadOnlyFolderException(Folder folder, String str) {
        super(str);
        this.f78904q0 = folder;
    }

    public ReadOnlyFolderException(Folder folder, String str, Exception exc) {
        super(str, exc);
        this.f78904q0 = folder;
    }
}
