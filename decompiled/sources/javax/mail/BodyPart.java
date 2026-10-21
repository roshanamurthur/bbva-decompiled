package javax.mail;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BodyPart implements Part {
    protected Multipart parent;

    public Multipart getParent() {
        return this.parent;
    }
}
