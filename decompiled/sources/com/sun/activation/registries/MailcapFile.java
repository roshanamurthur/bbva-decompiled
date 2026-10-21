package com.sun.activation.registries;

import androidx.camera.core.impl.utils.a;
import androidx.webkit.ProxyConfig;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class MailcapFile {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f65207d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f65208a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f65209b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f65210c = new HashMap();

    static {
        try {
            f65207d = Boolean.getBoolean("javax.activation.addreverse");
        } catch (Throwable unused) {
        }
    }

    public MailcapFile(String str) throws Throwable {
        if (LogSupport.isLoggable()) {
            LogSupport.log("new MailcapFile: file " + str);
        }
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader(str);
            try {
                b(new BufferedReader(fileReader2));
                try {
                    fileReader2.close();
                } catch (IOException unused) {
                }
            } catch (Throwable th2) {
                th = th2;
                fileReader = fileReader2;
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static HashMap a(Map map, Map map2) {
        HashMap map3 = new HashMap(map);
        for (String str : map2.keySet()) {
            List list = (List) map3.get(str);
            if (list == null) {
                map3.put(str, map2.get(str));
            } else {
                List list2 = (List) map2.get(str);
                ArrayList arrayList = new ArrayList(list);
                arrayList.addAll(list2);
                map3.put(str, arrayList);
            }
        }
        return map3;
    }

    public static void reportParseError(int i10, int i11, String str) throws MailcapParseException {
        throw new MailcapParseException("Encountered a " + MailcapTokenizer.nameForToken(i11) + " token (" + str + ") while expecting a " + MailcapTokenizer.nameForToken(i10) + " token.");
    }

    public void appendToMailcap(String str) {
        if (LogSupport.isLoggable()) {
            LogSupport.log("appendToMailcap: " + str);
        }
        try {
            b(new StringReader(str));
        } catch (IOException unused) {
        }
    }

    public final void b(Reader reader) throws IOException {
        String strTrim;
        BufferedReader bufferedReader = new BufferedReader(reader);
        while (true) {
            String strSubstring = null;
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return;
                }
                strTrim = line.trim();
                try {
                    if (strTrim.charAt(0) != '#') {
                        if (strTrim.charAt(strTrim.length() - 1) == '\\') {
                            if (strSubstring != null) {
                                strSubstring = strSubstring + strTrim.substring(0, strTrim.length() - 1);
                            } else {
                                strSubstring = strTrim.substring(0, strTrim.length() - 1);
                            }
                        } else if (strSubstring != null) {
                            break;
                        } else {
                            parseLine(strTrim);
                        }
                    }
                } catch (MailcapParseException | StringIndexOutOfBoundsException unused) {
                }
            }
            try {
                parseLine(strSubstring + strTrim);
            } catch (MailcapParseException unused2) {
            }
        }
    }

    public Map getMailcapFallbackList(String str) {
        HashMap map = this.f65209b;
        Map map2 = (Map) map.get(str);
        int iIndexOf = str.indexOf(47) + 1;
        if (str.substring(iIndexOf).equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
            return map2;
        }
        Map map3 = (Map) map.get(str.substring(0, iIndexOf) + ProxyConfig.MATCH_ALL_SCHEMES);
        if (map3 != null) {
            return map2 != null ? a(map2, map3) : map3;
        }
        return map2;
    }

    public Map getMailcapList(String str) {
        HashMap map = this.f65208a;
        Map map2 = (Map) map.get(str);
        int iIndexOf = str.indexOf(47) + 1;
        if (str.substring(iIndexOf).equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
            return map2;
        }
        Map map3 = (Map) map.get(str.substring(0, iIndexOf) + ProxyConfig.MATCH_ALL_SCHEMES);
        if (map3 != null) {
            return map2 != null ? a(map2, map3) : map3;
        }
        return map2;
    }

    public String[] getMimeTypes() {
        HashSet hashSet = new HashSet(this.f65208a.keySet());
        hashSet.addAll(this.f65209b.keySet());
        hashSet.addAll(this.f65210c.keySet());
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public String[] getNativeCommands(String str) {
        List list = (List) this.f65210c.get(str.toLowerCase(Locale.ENGLISH));
        if (list != null) {
            return (String[]) list.toArray(new String[list.size()]);
        }
        return null;
    }

    public void parseLine(String str) throws MailcapParseException, IOException {
        String lowerCase;
        int iNextToken;
        boolean z10;
        MailcapTokenizer mailcapTokenizer = new MailcapTokenizer(str);
        mailcapTokenizer.setIsAutoquoting(false);
        if (LogSupport.isLoggable()) {
            LogSupport.log("parse: " + str);
        }
        int iNextToken2 = mailcapTokenizer.nextToken();
        if (iNextToken2 != 2) {
            reportParseError(2, iNextToken2, mailcapTokenizer.getCurrentTokenValue());
        }
        String currentTokenValue = mailcapTokenizer.getCurrentTokenValue();
        Locale locale = Locale.ENGLISH;
        String lowerCase2 = currentTokenValue.toLowerCase(locale);
        int iNextToken3 = mailcapTokenizer.nextToken();
        if (iNextToken3 != 47 && iNextToken3 != 59) {
            reportParseError(47, 59, iNextToken3, mailcapTokenizer.getCurrentTokenValue());
        }
        if (iNextToken3 == 47) {
            int iNextToken4 = mailcapTokenizer.nextToken();
            if (iNextToken4 != 2) {
                reportParseError(2, iNextToken4, mailcapTokenizer.getCurrentTokenValue());
            }
            lowerCase = mailcapTokenizer.getCurrentTokenValue().toLowerCase(locale);
            iNextToken3 = mailcapTokenizer.nextToken();
        } else {
            lowerCase = ProxyConfig.MATCH_ALL_SCHEMES;
        }
        String strB = a.b(lowerCase2, "/", lowerCase);
        if (LogSupport.isLoggable()) {
            LogSupport.log("  Type: " + strB);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (iNextToken3 != 59) {
            reportParseError(59, iNextToken3, mailcapTokenizer.getCurrentTokenValue());
        }
        mailcapTokenizer.setIsAutoquoting(true);
        int iNextToken5 = mailcapTokenizer.nextToken();
        mailcapTokenizer.setIsAutoquoting(false);
        if (iNextToken5 != 2 && iNextToken5 != 59) {
            reportParseError(2, 59, iNextToken5, mailcapTokenizer.getCurrentTokenValue());
        }
        if (iNextToken5 == 2) {
            HashMap map = this.f65210c;
            List list = (List) map.get(strB);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                map.put(strB, arrayList);
            } else {
                list.add(str);
            }
        }
        if (iNextToken5 != 59) {
            iNextToken5 = mailcapTokenizer.nextToken();
        }
        if (iNextToken5 != 59) {
            if (iNextToken5 != 5) {
                reportParseError(5, 59, iNextToken5, mailcapTokenizer.getCurrentTokenValue());
                return;
            }
            return;
        }
        boolean z11 = false;
        do {
            int iNextToken6 = mailcapTokenizer.nextToken();
            if (iNextToken6 != 2) {
                reportParseError(2, iNextToken6, mailcapTokenizer.getCurrentTokenValue());
            }
            String lowerCase3 = mailcapTokenizer.getCurrentTokenValue().toLowerCase(Locale.ENGLISH);
            iNextToken = mailcapTokenizer.nextToken();
            if (iNextToken != 61 && iNextToken != 59 && iNextToken != 5) {
                reportParseError(61, 59, 5, iNextToken, mailcapTokenizer.getCurrentTokenValue());
            }
            z10 = f65207d;
            if (iNextToken == 61) {
                mailcapTokenizer.setIsAutoquoting(true);
                int iNextToken7 = mailcapTokenizer.nextToken();
                mailcapTokenizer.setIsAutoquoting(false);
                if (iNextToken7 != 2) {
                    reportParseError(2, iNextToken7, mailcapTokenizer.getCurrentTokenValue());
                }
                String currentTokenValue2 = mailcapTokenizer.getCurrentTokenValue();
                if (lowerCase3.startsWith("x-java-")) {
                    String strSubstring = lowerCase3.substring(7);
                    if (strSubstring.equals("fallback-entry") && currentTokenValue2.equalsIgnoreCase("true")) {
                        z11 = true;
                    } else {
                        if (LogSupport.isLoggable()) {
                            LogSupport.log("    Command: " + strSubstring + ", Class: " + currentTokenValue2);
                        }
                        List arrayList2 = (List) linkedHashMap.get(strSubstring);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            linkedHashMap.put(strSubstring, arrayList2);
                        }
                        if (z10) {
                            arrayList2.add(0, currentTokenValue2);
                        } else {
                            arrayList2.add(currentTokenValue2);
                        }
                    }
                }
                iNextToken = mailcapTokenizer.nextToken();
            }
        } while (iNextToken == 59);
        HashMap map2 = z11 ? this.f65209b : this.f65208a;
        Map map3 = (Map) map2.get(strB);
        if (map3 == null) {
            map2.put(strB, linkedHashMap);
            return;
        }
        if (LogSupport.isLoggable()) {
            LogSupport.log("Merging commands for type " + strB);
        }
        for (String str2 : map3.keySet()) {
            List list2 = (List) map3.get(str2);
            List<String> list3 = (List) linkedHashMap.get(str2);
            if (list3 != null) {
                for (String str3 : list3) {
                    if (!list2.contains(str3)) {
                        if (z10) {
                            list2.add(0, str3);
                        } else {
                            list2.add(str3);
                        }
                    }
                }
            }
        }
        for (String str4 : linkedHashMap.keySet()) {
            if (!map3.containsKey(str4)) {
                map3.put(str4, (List) linkedHashMap.get(str4));
            }
        }
    }

    public static void reportParseError(int i10, int i11, int i12, String str) throws MailcapParseException {
        throw new MailcapParseException("Encountered a " + MailcapTokenizer.nameForToken(i12) + " token (" + str + ") while expecting a " + MailcapTokenizer.nameForToken(i10) + " or a " + MailcapTokenizer.nameForToken(i11) + " token.");
    }

    public static void reportParseError(int i10, int i11, int i12, int i13, String str) throws MailcapParseException {
        if (LogSupport.isLoggable()) {
            LogSupport.log("PARSE ERROR: Encountered a " + MailcapTokenizer.nameForToken(i13) + " token (" + str + ") while expecting a " + MailcapTokenizer.nameForToken(i10) + ", a " + MailcapTokenizer.nameForToken(i11) + ", or a " + MailcapTokenizer.nameForToken(i12) + " token.");
        }
        throw new MailcapParseException("Encountered a " + MailcapTokenizer.nameForToken(i13) + " token (" + str + ") while expecting a " + MailcapTokenizer.nameForToken(i10) + ", a " + MailcapTokenizer.nameForToken(i11) + ", or a " + MailcapTokenizer.nameForToken(i12) + " token.");
    }

    public MailcapFile(InputStream inputStream) throws IOException {
        if (LogSupport.isLoggable()) {
            LogSupport.log("new MailcapFile: InputStream");
        }
        b(new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1")));
    }

    public MailcapFile() {
        if (LogSupport.isLoggable()) {
            LogSupport.log("new MailcapFile: default");
        }
    }
}
