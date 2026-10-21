package javax.mail.search;

import java.io.Serializable;
import javax.mail.Message;

/* JADX INFO: loaded from: classes12.dex */
public abstract class SearchTerm implements Serializable {
    public abstract boolean match(Message message);
}
