package com.sun.mail.handlers;

import androidx.webkit.internal.AssetHelper;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import javax.activation.ActivationDataFlavor;
import javax.activation.DataSource;
import javax.mail.internet.ContentType;
import javax.mail.internet.MimeUtility;

/* JADX INFO: loaded from: classes9.dex */
public class text_plain extends handler_base {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ActivationDataFlavor[] f65241a = {new ActivationDataFlavor(String.class, AssetHelper.DEFAULT_MIME_TYPE, "Text String")};

    public static String a(String str) {
        try {
            String parameter = new ContentType(str).getParameter("charset");
            if (parameter == null) {
                parameter = "us-ascii";
            }
            return MimeUtility.javaCharset(parameter);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // javax.activation.DataContentHandler
    public Object getContent(DataSource dataSource) throws IOException {
        String strA = null;
        try {
            strA = a(dataSource.getContentType());
            InputStreamReader inputStreamReader = new InputStreamReader(dataSource.getInputStream(), strA);
            try {
                char[] cArr = new char[1024];
                int i10 = 0;
                while (true) {
                    int i11 = inputStreamReader.read(cArr, i10, cArr.length - i10);
                    if (i11 == -1) {
                        break;
                    }
                    i10 += i11;
                    if (i10 >= cArr.length) {
                        int length = cArr.length;
                        char[] cArr2 = new char[length < 262144 ? length + length : length + 262144];
                        System.arraycopy(cArr, 0, cArr2, 0, i10);
                        cArr = cArr2;
                    }
                }
                return new String(cArr, 0, i10);
            } finally {
                try {
                    inputStreamReader.close();
                } catch (IOException unused) {
                }
            }
        } catch (IllegalArgumentException unused2) {
            throw new UnsupportedEncodingException(strA);
        }
    }

    @Override // com.sun.mail.handlers.handler_base
    public ActivationDataFlavor[] getDataFlavors() {
        return f65241a;
    }

    @Override // javax.activation.DataContentHandler
    public void writeTo(Object obj, String str, OutputStream outputStream) throws IOException {
        String strA;
        if (!(obj instanceof String)) {
            throw new IOException("\"" + getDataFlavors()[0].getMimeType() + "\" DataContentHandler requires String object, was given object of type " + obj.getClass().toString());
        }
        try {
            strA = a(str);
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new a(outputStream), strA);
                String str2 = (String) obj;
                outputStreamWriter.write(str2, 0, str2.length());
                outputStreamWriter.close();
            } catch (IllegalArgumentException unused) {
                throw new UnsupportedEncodingException(strA);
            }
        } catch (IllegalArgumentException unused2) {
            strA = null;
        }
    }

    public static class a extends FilterOutputStream {
        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }
}
