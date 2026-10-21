package javax.mail;

import java.util.Vector;
import javax.mail.event.FolderEvent;
import javax.mail.event.FolderListener;
import javax.mail.event.StoreEvent;
import javax.mail.event.StoreListener;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Store extends Service {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public volatile Vector<StoreListener> f78925s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public volatile Vector<FolderListener> f78926t0;

    public Store(Session session, URLName uRLName) {
        super(session, uRLName);
        this.f78925s0 = null;
        this.f78926t0 = null;
    }

    public synchronized void addFolderListener(FolderListener folderListener) {
        try {
            if (this.f78926t0 == null) {
                this.f78926t0 = new Vector<>();
            }
            this.f78926t0.addElement(folderListener);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void addStoreListener(StoreListener storeListener) {
        try {
            if (this.f78925s0 == null) {
                this.f78925s0 = new Vector<>();
            }
            this.f78925s0.addElement(storeListener);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public abstract Folder getDefaultFolder() throws MessagingException;

    public abstract Folder getFolder(String str) throws MessagingException;

    public abstract Folder getFolder(URLName uRLName) throws MessagingException;

    public Folder[] getPersonalNamespaces() throws MessagingException {
        return new Folder[]{getDefaultFolder()};
    }

    public Folder[] getSharedNamespaces() throws MessagingException {
        return new Folder[0];
    }

    public Folder[] getUserNamespaces(String str) throws MessagingException {
        return new Folder[0];
    }

    public void notifyFolderListeners(int i10, Folder folder) {
        if (this.f78926t0 == null) {
            return;
        }
        queueEvent(new FolderEvent(this, folder, i10), this.f78926t0);
    }

    public void notifyFolderRenamedListeners(Folder folder, Folder folder2) {
        if (this.f78926t0 == null) {
            return;
        }
        queueEvent(new FolderEvent(this, folder, folder2, 3), this.f78926t0);
    }

    public void notifyStoreListeners(int i10, String str) {
        if (this.f78925s0 == null) {
            return;
        }
        queueEvent(new StoreEvent(this, i10, str), this.f78925s0);
    }

    public synchronized void removeFolderListener(FolderListener folderListener) {
        if (this.f78926t0 != null) {
            this.f78926t0.removeElement(folderListener);
        }
    }

    public synchronized void removeStoreListener(StoreListener storeListener) {
        if (this.f78925s0 != null) {
            this.f78925s0.removeElement(storeListener);
        }
    }
}
