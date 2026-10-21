package javax.mail;

import javax.activation.DataSource;

/* JADX INFO: loaded from: classes12.dex */
public interface MultipartDataSource extends DataSource {
    BodyPart getBodyPart(int i10) throws MessagingException;

    int getCount();
}
