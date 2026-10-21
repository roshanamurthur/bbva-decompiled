package javax.mail;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Vector;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Multipart {
    protected Part parent;
    protected Vector<BodyPart> parts = new Vector<>();
    protected String contentType = "multipart/mixed";

    public synchronized void addBodyPart(BodyPart bodyPart) throws MessagingException {
        try {
            if (this.parts == null) {
                this.parts = new Vector<>();
            }
            this.parts.addElement(bodyPart);
            bodyPart.parent = this;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized BodyPart getBodyPart(int i10) throws MessagingException {
        Vector<BodyPart> vector;
        vector = this.parts;
        if (vector == null) {
            throw new IndexOutOfBoundsException("No such BodyPart");
        }
        return vector.elementAt(i10);
    }

    public synchronized String getContentType() {
        return this.contentType;
    }

    public synchronized int getCount() throws MessagingException {
        Vector<BodyPart> vector = this.parts;
        if (vector == null) {
            return 0;
        }
        return vector.size();
    }

    public synchronized Part getParent() {
        return this.parent;
    }

    public synchronized boolean removeBodyPart(BodyPart bodyPart) throws MessagingException {
        boolean zRemoveElement;
        Vector<BodyPart> vector = this.parts;
        if (vector == null) {
            throw new MessagingException("No such body part");
        }
        zRemoveElement = vector.removeElement(bodyPart);
        bodyPart.parent = null;
        return zRemoveElement;
    }

    public synchronized void setMultipartDataSource(MultipartDataSource multipartDataSource) throws MessagingException {
        this.contentType = multipartDataSource.getContentType();
        int count = multipartDataSource.getCount();
        for (int i10 = 0; i10 < count; i10++) {
            addBodyPart(multipartDataSource.getBodyPart(i10));
        }
    }

    public synchronized void setParent(Part part) {
        this.parent = part;
    }

    public abstract void writeTo(OutputStream outputStream) throws MessagingException, IOException;

    public synchronized void addBodyPart(BodyPart bodyPart, int i10) throws MessagingException {
        try {
            if (this.parts == null) {
                this.parts = new Vector<>();
            }
            this.parts.insertElementAt(bodyPart, i10);
            bodyPart.parent = this;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void removeBodyPart(int i10) throws MessagingException {
        Vector<BodyPart> vector = this.parts;
        if (vector != null) {
            BodyPart bodyPartElementAt = vector.elementAt(i10);
            this.parts.removeElementAt(i10);
            bodyPartElementAt.parent = null;
        } else {
            throw new IndexOutOfBoundsException("No such BodyPart");
        }
    }
}
