package javax.mail.search;

import java.io.IOException;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;

/* JADX INFO: loaded from: classes12.dex */
public final class BodyTerm extends StringTerm {
    public BodyTerm(String str) {
        super(str);
    }

    public final boolean a(Part part) {
        try {
            if (part.isMimeType("text/*")) {
                String str = (String) part.getContent();
                if (str == null) {
                    return false;
                }
                return super.match(str);
            }
            if (part.isMimeType("multipart/*")) {
                Multipart multipart = (Multipart) part.getContent();
                int count = multipart.getCount();
                for (int i10 = 0; i10 < count; i10++) {
                    if (a(multipart.getBodyPart(i10))) {
                        return true;
                    }
                }
            } else if (part.isMimeType("message/rfc822")) {
                return a((Part) part.getContent());
            }
            return false;
        } catch (IOException | RuntimeException | MessagingException unused) {
        }
    }

    @Override // javax.mail.search.StringTerm
    public boolean equals(Object obj) {
        if (obj instanceof BodyTerm) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // javax.mail.search.SearchTerm
    public boolean match(Message message) {
        return a(message);
    }
}
