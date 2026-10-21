package com.sun.mail.smtp;

import ad.d;
import androidx.camera.core.processing.f;
import ci.a;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.BASE64DecoderStream;
import com.sun.mail.util.BASE64EncoderStream;
import com.sun.mail.util.MailLogger;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes9.dex */
public class DigestMD5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f65474e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MailLogger f65475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MessageDigest f65476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f65477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f65478d;

    public DigestMD5(MailLogger mailLogger) {
        this.f65475a = mailLogger.getLogger(getClass(), "DEBUG DIGEST-MD5");
        mailLogger.config("DIGEST-MD5 Loaded");
    }

    public static String a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = f65474e;
            cArr[i10] = cArr2[(b10 & 255) >> 4];
            i10 += 2;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public byte[] authClient(String str, String str2, String str3, String str4, String str5) throws IOException {
        MailLogger mailLogger = this.f65475a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BASE64EncoderStream bASE64EncoderStream = new BASE64EncoderStream(byteArrayOutputStream, Integer.MAX_VALUE);
        try {
            SecureRandom secureRandom = new SecureRandom();
            this.f65476b = MessageDigest.getInstance("MD5");
            StringBuilder sb2 = new StringBuilder();
            this.f65477c = f.d("smtp/", str);
            byte[] bArr = new byte[32];
            mailLogger.fine("Begin authentication ...");
            HashMap mapB = b(str5);
            if (str4 == null) {
                String str6 = (String) mapB.get("realm");
                if (str6 != null) {
                    str = new StringTokenizer(str6, ",").nextToken();
                }
                str4 = str;
            }
            String str7 = (String) mapB.get(IAppSDKPlus.EXTRA_KEY_NONCE);
            String str8 = (String) mapB.get("charset");
            boolean z10 = str8 != null && str8.equalsIgnoreCase("utf-8");
            secureRandom.nextBytes(bArr);
            bASE64EncoderStream.write(bArr);
            bASE64EncoderStream.flush();
            String string = byteArrayOutputStream.toString("iso-8859-1");
            byteArrayOutputStream.reset();
            if (z10) {
                String str9 = str2 + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + str4 + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + str3;
                MessageDigest messageDigest = this.f65476b;
                messageDigest.update(messageDigest.digest(str9.getBytes(StandardCharsets.UTF_8)));
            } else {
                MessageDigest messageDigest2 = this.f65476b;
                messageDigest2.update(messageDigest2.digest(ASCIIUtility.getBytes(str2 + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + str4 + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + str3)));
            }
            this.f65476b.update(ASCIIUtility.getBytes(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + str7 + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + string));
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a(this.f65476b.digest()));
            sb3.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
            sb3.append(str7);
            sb3.append(":00000001:");
            this.f65478d = d.f(sb3, string, ":auth:");
            this.f65476b.update(ASCIIUtility.getBytes("AUTHENTICATE:" + this.f65477c));
            this.f65476b.update(ASCIIUtility.getBytes(this.f65478d + a(this.f65476b.digest())));
            sb2.append("username=\"" + str2 + "\"");
            sb2.append(",realm=\"" + str4 + "\"");
            sb2.append(",qop=auth,nc=00000001");
            sb2.append(",nonce=\"" + str7 + "\"");
            sb2.append(",cnonce=\"" + string + "\"");
            sb2.append(",digest-uri=\"" + this.f65477c + "\"");
            if (z10) {
                sb2.append(",charset=\"utf-8\"");
            }
            sb2.append(",response=".concat(a(this.f65476b.digest())));
            if (mailLogger.isLoggable(Level.FINE)) {
                mailLogger.fine("Response => " + sb2.toString());
            }
            bASE64EncoderStream.write(ASCIIUtility.getBytes(sb2.toString()));
            bASE64EncoderStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (NoSuchAlgorithmException e5) {
            mailLogger.log(Level.FINE, "NoSuchAlgorithmException", (Throwable) e5);
            throw new IOException(e5.toString());
        }
    }

    public boolean authServer(String str) throws IOException {
        HashMap mapB = b(str);
        this.f65476b.update(ASCIIUtility.getBytes(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + this.f65477c));
        this.f65476b.update(ASCIIUtility.getBytes(this.f65478d + a(this.f65476b.digest())));
        String strA = a(this.f65476b.digest());
        if (strA.equals(mapB.get("rspauth"))) {
            return true;
        }
        Level level = Level.FINE;
        MailLogger mailLogger = this.f65475a;
        if (!mailLogger.isLoggable(level)) {
            return false;
        }
        mailLogger.fine("Expected => rspauth=".concat(strA));
        return false;
    }

    public final HashMap b(String str) throws IOException {
        HashMap map = new HashMap();
        byte[] bytes = str.getBytes("iso-8859-1");
        StreamTokenizer streamTokenizer = new StreamTokenizer(new InputStreamReader(new BASE64DecoderStream(new ByteArrayInputStream(bytes, 4, bytes.length - 4)), "iso-8859-1"));
        streamTokenizer.ordinaryChars(48, 57);
        streamTokenizer.wordChars(48, 57);
        while (true) {
            String str2 = null;
            while (true) {
                int iNextToken = streamTokenizer.nextToken();
                if (iNextToken == -1) {
                    return map;
                }
                if (iNextToken == -3) {
                    if (str2 != null) {
                        break;
                    }
                    str2 = streamTokenizer.sval;
                } else if (iNextToken == 34) {
                    break;
                }
            }
            Level level = Level.FINE;
            MailLogger mailLogger = this.f65475a;
            if (mailLogger.isLoggable(level)) {
                StringBuilder sbD = a.d("Received => ", str2, "='");
                sbD.append(streamTokenizer.sval);
                sbD.append("'");
                mailLogger.fine(sbD.toString());
            }
            if (map.containsKey(str2)) {
                map.put(str2, ((String) map.get(str2)) + "," + streamTokenizer.sval);
            } else {
                map.put(str2, streamTokenizer.sval);
            }
        }
    }
}
