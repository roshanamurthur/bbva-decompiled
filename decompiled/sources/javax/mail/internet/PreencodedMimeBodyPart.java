package javax.mail.internet;

import com.sun.mail.util.LineOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import javax.mail.MessagingException;

/* JADX INFO: loaded from: classes12.dex */
public class PreencodedMimeBodyPart extends MimeBodyPart {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f79030h;

    public PreencodedMimeBodyPart(String str) {
        this.f79030h = str;
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.internet.MimePart
    public String getEncoding() throws MessagingException {
        return this.f79030h;
    }

    @Override // javax.mail.internet.MimeBodyPart
    public void updateHeaders() throws MessagingException {
        super.updateHeaders();
        setHeader("Content-Transfer-Encoding", this.f79030h);
    }

    @Override // javax.mail.internet.MimeBodyPart, javax.mail.Part
    public void writeTo(OutputStream outputStream) throws MessagingException, IOException {
        LineOutputStream lineOutputStream = outputStream instanceof LineOutputStream ? (LineOutputStream) outputStream : new LineOutputStream(outputStream);
        Enumeration<String> allHeaderLines = getAllHeaderLines();
        while (allHeaderLines.hasMoreElements()) {
            lineOutputStream.writeln(allHeaderLines.nextElement());
        }
        lineOutputStream.writeln();
        getDataHandler().writeTo(outputStream);
        outputStream.flush();
    }
}
