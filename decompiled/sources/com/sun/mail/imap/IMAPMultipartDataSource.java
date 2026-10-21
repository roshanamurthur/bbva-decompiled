package com.sun.mail.imap;

import androidx.camera.core.processing.f;
import com.sun.mail.imap.protocol.BODYSTRUCTURE;
import java.util.ArrayList;
import javax.mail.BodyPart;
import javax.mail.MessagingException;
import javax.mail.MultipartDataSource;
import javax.mail.internet.MimePart;
import javax.mail.internet.MimePartDataSource;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public class IMAPMultipartDataSource extends MimePartDataSource implements MultipartDataSource {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f65349b;

    public IMAPMultipartDataSource(MimePart mimePart, BODYSTRUCTURE[] bodystructureArr, String str, IMAPMessage iMAPMessage) {
        String string;
        super(mimePart);
        this.f65349b = new ArrayList(bodystructureArr.length);
        for (int i10 = 0; i10 < bodystructureArr.length; i10++) {
            ArrayList arrayList = this.f65349b;
            BODYSTRUCTURE bodystructure = bodystructureArr[i10];
            if (str == null) {
                string = Integer.toString(i10 + 1);
            } else {
                StringBuilder sbE = f.e(str, Constant.DOT_STRING);
                sbE.append(Integer.toString(i10 + 1));
                string = sbE.toString();
            }
            arrayList.add(new IMAPBodyPart(bodystructure, string, iMAPMessage));
        }
    }

    @Override // javax.mail.MultipartDataSource
    public BodyPart getBodyPart(int i10) throws MessagingException {
        return (BodyPart) this.f65349b.get(i10);
    }

    @Override // javax.mail.MultipartDataSource
    public int getCount() {
        return this.f65349b.size();
    }
}
