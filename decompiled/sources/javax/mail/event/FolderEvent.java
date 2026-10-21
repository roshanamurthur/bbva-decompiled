package javax.mail.event;

import javax.mail.Folder;

/* JADX INFO: loaded from: classes12.dex */
public class FolderEvent extends MailEvent {
    public static final int CREATED = 1;
    public static final int DELETED = 2;
    public static final int RENAMED = 3;
    protected transient Folder folder;
    protected transient Folder newFolder;
    protected int type;

    public FolderEvent(Object obj, Folder folder, int i10) {
        this(obj, folder, folder, i10);
    }

    @Override // javax.mail.event.MailEvent
    public void dispatch(Object obj) {
        int i10 = this.type;
        if (i10 == 1) {
            ((FolderListener) obj).folderCreated(this);
        } else if (i10 == 2) {
            ((FolderListener) obj).folderDeleted(this);
        } else if (i10 == 3) {
            ((FolderListener) obj).folderRenamed(this);
        }
    }

    public Folder getFolder() {
        return this.folder;
    }

    public Folder getNewFolder() {
        return this.newFolder;
    }

    public int getType() {
        return this.type;
    }

    public FolderEvent(Object obj, Folder folder, Folder folder2, int i10) {
        super(obj);
        this.folder = folder;
        this.newFolder = folder2;
        this.type = i10;
    }
}
