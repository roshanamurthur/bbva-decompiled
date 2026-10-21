package javax.mail;

/* JADX INFO: loaded from: classes12.dex */
public class FolderNotFoundException extends MessagingException {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final transient Folder f78893q0;

    public FolderNotFoundException() {
    }

    public Folder getFolder() {
        return this.f78893q0;
    }

    public FolderNotFoundException(Folder folder) {
        this.f78893q0 = folder;
    }

    public FolderNotFoundException(Folder folder, String str) {
        super(str);
        this.f78893q0 = folder;
    }

    public FolderNotFoundException(Folder folder, String str, Exception exc) {
        super(str, exc);
        this.f78893q0 = folder;
    }

    public FolderNotFoundException(String str, Folder folder) {
        super(str);
        this.f78893q0 = folder;
    }
}
