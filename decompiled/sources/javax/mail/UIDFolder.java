package javax.mail;

/* JADX INFO: loaded from: classes12.dex */
public interface UIDFolder {
    public static final long LASTUID = -1;
    public static final long MAXUID = 4294967295L;

    public static class FetchProfileItem extends FetchProfile.Item {
        public static final FetchProfileItem UID = new FetchProfileItem("UID");

        public FetchProfileItem(String str) {
            super(str);
        }
    }

    Message getMessageByUID(long j10) throws MessagingException;

    Message[] getMessagesByUID(long j10, long j11) throws MessagingException;

    Message[] getMessagesByUID(long[] jArr) throws MessagingException;

    long getUID(Message message) throws MessagingException;

    long getUIDNext() throws MessagingException;

    long getUIDValidity() throws MessagingException;
}
