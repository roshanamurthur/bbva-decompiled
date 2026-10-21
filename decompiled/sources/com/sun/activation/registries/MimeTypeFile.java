package com.sun.activation.registries;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.Vector;
import ri.a;

/* JADX INFO: loaded from: classes9.dex */
public class MimeTypeFile {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Hashtable f65220a = new Hashtable();

    public MimeTypeFile(String str) throws IOException {
        FileReader fileReader = new FileReader(new File(str));
        try {
            a(new BufferedReader(fileReader));
        } finally {
            try {
                fileReader.close();
            } catch (IOException unused) {
            }
        }
    }

    public final void a(BufferedReader bufferedReader) throws IOException {
        String strSubstring;
        String line;
        loop0: while (true) {
            strSubstring = null;
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break loop0;
                }
                if (strSubstring != null) {
                    line = strSubstring.concat(line);
                }
                int length = line.length();
                if (line.length() <= 0) {
                    break;
                }
                int i10 = length - 1;
                if (line.charAt(i10) != '\\') {
                    break;
                } else {
                    strSubstring = line.substring(0, i10);
                }
            }
            b(line);
        }
        if (strSubstring != null) {
            b(strSubstring);
        }
    }

    public void appendToRegistry(String str) {
        try {
            a(new BufferedReader(new StringReader(str)));
        } catch (IOException unused) {
        }
    }

    public final void b(String str) {
        String strTrim = str.trim();
        if (strTrim.length() == 0 || strTrim.charAt(0) == '#') {
            return;
        }
        int iIndexOf = strTrim.indexOf(61);
        Hashtable hashtable = this.f65220a;
        if (iIndexOf <= 0) {
            StringTokenizer stringTokenizer = new StringTokenizer(strTrim);
            if (stringTokenizer.countTokens() == 0) {
                return;
            }
            String strNextToken = stringTokenizer.nextToken();
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken2 = stringTokenizer.nextToken();
                MimeTypeEntry mimeTypeEntry = new MimeTypeEntry(strNextToken, strNextToken2);
                hashtable.put(strNextToken2, mimeTypeEntry);
                if (LogSupport.isLoggable()) {
                    LogSupport.log("Added: " + mimeTypeEntry.toString());
                }
            }
            return;
        }
        a aVar = new a();
        aVar.f93098d = new Vector();
        aVar.f93095a = 0;
        aVar.f93097c = strTrim;
        aVar.f93096b = strTrim.length();
        String str2 = null;
        while (aVar.a()) {
            String strB = aVar.b();
            String strB2 = (aVar.a() && aVar.b().equals("=") && aVar.a()) ? aVar.b() : null;
            if (strB2 == null) {
                if (LogSupport.isLoggable()) {
                    LogSupport.log("Bad .mime.types entry: ".concat(strTrim));
                    return;
                }
                return;
            } else if (strB.equals("type")) {
                str2 = strB2;
            } else if (strB.equals("exts")) {
                StringTokenizer stringTokenizer2 = new StringTokenizer(strB2, ",");
                while (stringTokenizer2.hasMoreTokens()) {
                    String strNextToken3 = stringTokenizer2.nextToken();
                    MimeTypeEntry mimeTypeEntry2 = new MimeTypeEntry(str2, strNextToken3);
                    hashtable.put(strNextToken3, mimeTypeEntry2);
                    if (LogSupport.isLoggable()) {
                        LogSupport.log("Added: " + mimeTypeEntry2.toString());
                    }
                }
            }
        }
    }

    public String getMIMETypeString(String str) {
        MimeTypeEntry mimeTypeEntry = getMimeTypeEntry(str);
        if (mimeTypeEntry != null) {
            return mimeTypeEntry.getMIMEType();
        }
        return null;
    }

    public MimeTypeEntry getMimeTypeEntry(String str) {
        return (MimeTypeEntry) this.f65220a.get(str);
    }

    public MimeTypeFile(InputStream inputStream) throws IOException {
        a(new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1")));
    }

    public MimeTypeFile() {
    }
}
