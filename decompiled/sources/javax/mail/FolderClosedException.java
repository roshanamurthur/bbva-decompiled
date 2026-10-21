package javax.mail;

/* JADX INFO: loaded from: classes12.dex */
public class FolderClosedException extends MessagingException {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final transient Folder f78892q0;

    public FolderClosedException(Folder folder) {
        this(folder, null);
    }

    public Folder getFolder() {
        return this.f78892q0;
    }

    public FolderClosedException(Folder folder, String str) {
        super(str);
        this.f78892q0 = folder;
    }

    public FolderClosedException(Folder folder, String str, Exception exc) {
        super(str, exc);
        this.f78892q0 = folder;
    }
}
