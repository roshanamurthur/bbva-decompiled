package javax.mail.internet;

import com.bbva.network.multipart_extensions.response.MultipartBody;
import com.bbva.notifications.constants.PushConstants;
import com.sun.mail.util.ASCIIUtility;
import com.sun.mail.util.LineInputStream;
import com.sun.mail.util.LineOutputStream;
import com.sun.mail.util.PropUtil;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicInteger;
import javax.activation.DataSource;
import javax.mail.BodyPart;
import javax.mail.MessageAware;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.MultipartDataSource;

/* JADX INFO: loaded from: classes12.dex */
public class MimeMultipart extends Multipart {
    protected boolean allowEmpty;
    protected boolean complete;
    protected DataSource ds;
    protected boolean ignoreExistingBoundaryParameter;
    protected boolean ignoreMissingBoundaryParameter;
    protected boolean ignoreMissingEndBoundary;
    protected boolean parsed;
    protected String preamble;

    public MimeMultipart() {
        this("mixed");
    }

    @Override // javax.mail.Multipart
    public synchronized void addBodyPart(BodyPart bodyPart) throws MessagingException {
        parse();
        super.addBodyPart(bodyPart);
    }

    public InternetHeaders createInternetHeaders(InputStream inputStream) throws MessagingException {
        return new InternetHeaders(inputStream);
    }

    public MimeBodyPart createMimeBodyPart(InternetHeaders internetHeaders, byte[] bArr) throws MessagingException {
        return new MimeBodyPart(internetHeaders, bArr);
    }

    @Override // javax.mail.Multipart
    public synchronized BodyPart getBodyPart(int i10) throws MessagingException {
        parse();
        return super.getBodyPart(i10);
    }

    @Override // javax.mail.Multipart
    public synchronized int getCount() throws MessagingException {
        parse();
        return super.getCount();
    }

    public synchronized String getPreamble() throws MessagingException {
        parse();
        return this.preamble;
    }

    public void initializeProperties() {
        this.ignoreMissingEndBoundary = PropUtil.getBooleanSystemProperty("mail.mime.multipart.ignoremissingendboundary", true);
        this.ignoreMissingBoundaryParameter = PropUtil.getBooleanSystemProperty("mail.mime.multipart.ignoremissingboundaryparameter", true);
        this.ignoreExistingBoundaryParameter = PropUtil.getBooleanSystemProperty(MultipartBody.IGNORE_BOUNDARY, false);
        this.allowEmpty = PropUtil.getBooleanSystemProperty("mail.mime.multipart.allowempty", false);
    }

    public synchronized boolean isComplete() throws MessagingException {
        parse();
        return this.complete;
    }

    /* JADX WARN: Code duplicated, block: B:200:0x029a A[Catch: all -> 0x008a, IOException -> 0x008d, TRY_LEAVE, TryCatch #9 {IOException -> 0x008d, blocks: (B:39:0x0062, B:40:0x0068, B:42:0x0077, B:44:0x007e, B:48:0x0087, B:53:0x0090, B:55:0x0098, B:58:0x009f, B:60:0x00aa, B:62:0x00b0, B:79:0x00e2, B:82:0x00ea, B:83:0x00f4, B:65:0x00ba, B:67:0x00c0, B:69:0x00c8, B:72:0x00d0, B:74:0x00d6, B:77:0x00dd, B:85:0x0102, B:87:0x010a, B:92:0x0113, B:93:0x011a, B:94:0x011b, B:96:0x0127, B:97:0x0130, B:99:0x0135, B:101:0x013b, B:103:0x0143, B:106:0x0155, B:105:0x0150, B:107:0x015c, B:110:0x0169, B:111:0x016d, B:113:0x0173, B:117:0x017c, B:119:0x0180, B:120:0x0184, B:121:0x018b, B:124:0x0198, B:127:0x01a0, B:129:0x01ab, B:130:0x01b2, B:143:0x01db, B:146:0x01e1, B:147:0x01e5, B:200:0x029a, B:216:0x02d1, B:207:0x02b1, B:208:0x02b2, B:210:0x02bb, B:211:0x02bf, B:214:0x02c5, B:215:0x02c9, B:149:0x01f2, B:150:0x01f9, B:153:0x01fe, B:161:0x021c, B:167:0x0229, B:221:0x030b, B:226:0x0322, B:227:0x0328, B:230:0x0333, B:232:0x033b, B:233:0x033e, B:234:0x0345, B:237:0x0349, B:239:0x0359, B:242:0x0364, B:244:0x036a, B:247:0x0374, B:249:0x037c, B:250:0x037f, B:251:0x0386, B:178:0x0245, B:180:0x0254, B:182:0x025c, B:184:0x0262, B:195:0x0286, B:197:0x0290, B:219:0x02f3, B:156:0x0209, B:135:0x01c5, B:138:0x01cc, B:128:0x01a6, B:254:0x039f, B:255:0x03a6, B:123:0x0190), top: B:287:0x0062, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:208:0x02b2 A[Catch: all -> 0x008a, IOException -> 0x008d, TryCatch #9 {IOException -> 0x008d, blocks: (B:39:0x0062, B:40:0x0068, B:42:0x0077, B:44:0x007e, B:48:0x0087, B:53:0x0090, B:55:0x0098, B:58:0x009f, B:60:0x00aa, B:62:0x00b0, B:79:0x00e2, B:82:0x00ea, B:83:0x00f4, B:65:0x00ba, B:67:0x00c0, B:69:0x00c8, B:72:0x00d0, B:74:0x00d6, B:77:0x00dd, B:85:0x0102, B:87:0x010a, B:92:0x0113, B:93:0x011a, B:94:0x011b, B:96:0x0127, B:97:0x0130, B:99:0x0135, B:101:0x013b, B:103:0x0143, B:106:0x0155, B:105:0x0150, B:107:0x015c, B:110:0x0169, B:111:0x016d, B:113:0x0173, B:117:0x017c, B:119:0x0180, B:120:0x0184, B:121:0x018b, B:124:0x0198, B:127:0x01a0, B:129:0x01ab, B:130:0x01b2, B:143:0x01db, B:146:0x01e1, B:147:0x01e5, B:200:0x029a, B:216:0x02d1, B:207:0x02b1, B:208:0x02b2, B:210:0x02bb, B:211:0x02bf, B:214:0x02c5, B:215:0x02c9, B:149:0x01f2, B:150:0x01f9, B:153:0x01fe, B:161:0x021c, B:167:0x0229, B:221:0x030b, B:226:0x0322, B:227:0x0328, B:230:0x0333, B:232:0x033b, B:233:0x033e, B:234:0x0345, B:237:0x0349, B:239:0x0359, B:242:0x0364, B:244:0x036a, B:247:0x0374, B:249:0x037c, B:250:0x037f, B:251:0x0386, B:178:0x0245, B:180:0x0254, B:182:0x025c, B:184:0x0262, B:195:0x0286, B:197:0x0290, B:219:0x02f3, B:156:0x0209, B:135:0x01c5, B:138:0x01cc, B:128:0x01a6, B:254:0x039f, B:255:0x03a6, B:123:0x0190), top: B:287:0x0062, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:210:0x02bb A[Catch: all -> 0x008a, IOException -> 0x008d, TryCatch #9 {IOException -> 0x008d, blocks: (B:39:0x0062, B:40:0x0068, B:42:0x0077, B:44:0x007e, B:48:0x0087, B:53:0x0090, B:55:0x0098, B:58:0x009f, B:60:0x00aa, B:62:0x00b0, B:79:0x00e2, B:82:0x00ea, B:83:0x00f4, B:65:0x00ba, B:67:0x00c0, B:69:0x00c8, B:72:0x00d0, B:74:0x00d6, B:77:0x00dd, B:85:0x0102, B:87:0x010a, B:92:0x0113, B:93:0x011a, B:94:0x011b, B:96:0x0127, B:97:0x0130, B:99:0x0135, B:101:0x013b, B:103:0x0143, B:106:0x0155, B:105:0x0150, B:107:0x015c, B:110:0x0169, B:111:0x016d, B:113:0x0173, B:117:0x017c, B:119:0x0180, B:120:0x0184, B:121:0x018b, B:124:0x0198, B:127:0x01a0, B:129:0x01ab, B:130:0x01b2, B:143:0x01db, B:146:0x01e1, B:147:0x01e5, B:200:0x029a, B:216:0x02d1, B:207:0x02b1, B:208:0x02b2, B:210:0x02bb, B:211:0x02bf, B:214:0x02c5, B:215:0x02c9, B:149:0x01f2, B:150:0x01f9, B:153:0x01fe, B:161:0x021c, B:167:0x0229, B:221:0x030b, B:226:0x0322, B:227:0x0328, B:230:0x0333, B:232:0x033b, B:233:0x033e, B:234:0x0345, B:237:0x0349, B:239:0x0359, B:242:0x0364, B:244:0x036a, B:247:0x0374, B:249:0x037c, B:250:0x037f, B:251:0x0386, B:178:0x0245, B:180:0x0254, B:182:0x025c, B:184:0x0262, B:195:0x0286, B:197:0x0290, B:219:0x02f3, B:156:0x0209, B:135:0x01c5, B:138:0x01cc, B:128:0x01a6, B:254:0x039f, B:255:0x03a6, B:123:0x0190), top: B:287:0x0062, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:292:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea A[Catch: all -> 0x008a, IOException -> 0x008d, TryCatch #9 {IOException -> 0x008d, blocks: (B:39:0x0062, B:40:0x0068, B:42:0x0077, B:44:0x007e, B:48:0x0087, B:53:0x0090, B:55:0x0098, B:58:0x009f, B:60:0x00aa, B:62:0x00b0, B:79:0x00e2, B:82:0x00ea, B:83:0x00f4, B:65:0x00ba, B:67:0x00c0, B:69:0x00c8, B:72:0x00d0, B:74:0x00d6, B:77:0x00dd, B:85:0x0102, B:87:0x010a, B:92:0x0113, B:93:0x011a, B:94:0x011b, B:96:0x0127, B:97:0x0130, B:99:0x0135, B:101:0x013b, B:103:0x0143, B:106:0x0155, B:105:0x0150, B:107:0x015c, B:110:0x0169, B:111:0x016d, B:113:0x0173, B:117:0x017c, B:119:0x0180, B:120:0x0184, B:121:0x018b, B:124:0x0198, B:127:0x01a0, B:129:0x01ab, B:130:0x01b2, B:143:0x01db, B:146:0x01e1, B:147:0x01e5, B:200:0x029a, B:216:0x02d1, B:207:0x02b1, B:208:0x02b2, B:210:0x02bb, B:211:0x02bf, B:214:0x02c5, B:215:0x02c9, B:149:0x01f2, B:150:0x01f9, B:153:0x01fe, B:161:0x021c, B:167:0x0229, B:221:0x030b, B:226:0x0322, B:227:0x0328, B:230:0x0333, B:232:0x033b, B:233:0x033e, B:234:0x0345, B:237:0x0349, B:239:0x0359, B:242:0x0364, B:244:0x036a, B:247:0x0374, B:249:0x037c, B:250:0x037f, B:251:0x0386, B:178:0x0245, B:180:0x0254, B:182:0x025c, B:184:0x0262, B:195:0x0286, B:197:0x0290, B:219:0x02f3, B:156:0x0209, B:135:0x01c5, B:138:0x01cc, B:128:0x01a6, B:254:0x039f, B:255:0x03a6, B:123:0x0190), top: B:287:0x0062, outer: #7 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    public synchronized void parse() throws MessagingException {
        String line;
        boolean z10;
        InternetHeaders internetHeadersCreateInternetHeaders;
        long j10;
        ?? byteArrayOutputStream;
        int i10;
        int i11;
        LineInputStream lineInputStream;
        long j11;
        int i12;
        int i13;
        int[] iArr;
        long j12;
        int i14;
        MimeBodyPart mimeBodyPartCreateMimeBodyPart;
        InputStream inputStreamNewStream;
        boolean z11;
        int i15;
        int[] iArr2;
        long j13;
        boolean z12;
        int i16;
        byte b10;
        String line2;
        String parameter;
        if (this.parsed) {
            return;
        }
        initializeProperties();
        try {
            InputStream inputStream = this.ds.getInputStream();
            if (!(inputStream instanceof ByteArrayInputStream) && !(inputStream instanceof BufferedInputStream) && !(inputStream instanceof SharedInputStream)) {
                inputStream = new BufferedInputStream(inputStream);
            }
            SharedInputStream sharedInputStream = inputStream instanceof SharedInputStream ? (SharedInputStream) inputStream : null;
            String strConcat = (this.ignoreExistingBoundaryParameter || (parameter = new ContentType(this.contentType).getParameter("boundary")) == null) ? null : "--".concat(parameter);
            if (strConcat == null && !this.ignoreMissingBoundaryParameter && !this.ignoreExistingBoundaryParameter) {
                throw new ParseException("Missing boundary parameter");
            }
            try {
                try {
                    LineInputStream lineInputStream2 = new LineInputStream(inputStream);
                    StringBuilder sb2 = null;
                    loop0: while (true) {
                        line = lineInputStream2.readLine();
                        z10 = false;
                        if (line == null) {
                            break;
                        }
                        int length = line.length() - 1;
                        while (length >= 0) {
                            char cCharAt = line.charAt(length);
                            if (cCharAt != ' ' && cCharAt != '\t') {
                                break;
                            } else {
                                length--;
                            }
                        }
                        line = line.substring(0, length + 1);
                        if (strConcat == null) {
                            if (line.length() > 2 && line.startsWith("--")) {
                                if (line.length() > 4) {
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 < line.length()) {
                                            if (line.charAt(i17) == '-') {
                                                i17++;
                                            }
                                        }
                                    }
                                }
                                strConcat = line;
                                break;
                            }
                            if (line.length() <= 0) {
                                if (sb2 == null) {
                                    sb2 = new StringBuilder(line.length() + 2);
                                }
                                sb2.append(line);
                                sb2.append(System.lineSeparator());
                            }
                        } else {
                            if (line.equals(strConcat)) {
                                break;
                            }
                            if (line.length() == strConcat.length() + 2 && line.startsWith(strConcat) && line.endsWith("--")) {
                                line = null;
                                break;
                            }
                            if (line.length() <= 0) {
                                if (sb2 == null) {
                                    sb2 = new StringBuilder(line.length() + 2);
                                }
                                sb2.append(line);
                                sb2.append(System.lineSeparator());
                            }
                        }
                    }
                    if (sb2 != null) {
                        this.preamble = sb2.toString();
                    }
                    if (line == null) {
                        if (!this.allowEmpty) {
                            throw new ParseException("Missing start boundary");
                        }
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                        return;
                    }
                    byte[] bytes = ASCIIUtility.getBytes(strConcat);
                    int length2 = bytes.length;
                    int[] iArr3 = new int[256];
                    int i18 = 0;
                    while (i18 < length2) {
                        int i19 = bytes[i18] & 255;
                        i18++;
                        iArr3[i19] = i18;
                    }
                    int[] iArr4 = new int[length2];
                    for (int i20 = length2; i20 > 0; i20--) {
                        int i21 = length2 - 1;
                        while (true) {
                            if (i21 < i20) {
                                while (i21 > 0) {
                                    i21--;
                                    iArr4[i21] = i20;
                                }
                                break;
                            } else {
                                if (bytes[i21] != bytes[i21 - i20]) {
                                    break;
                                }
                                iArr4[i21 - 1] = i20;
                                i21--;
                            }
                        }
                    }
                    int i22 = length2 - 1;
                    iArr4[i22] = 1;
                    boolean z13 = false;
                    long j14 = 0;
                    long position = 0;
                    while (!z13) {
                        if (sharedInputStream != null) {
                            long position2 = sharedInputStream.getPosition();
                            do {
                                line2 = lineInputStream2.readLine();
                                if (line2 == null) {
                                    break;
                                }
                            } while (line2.length() > 0);
                            if (line2 == null) {
                                if (!this.ignoreMissingEndBoundary) {
                                    throw new ParseException("missing multipart end boundary");
                                }
                                this.complete = z10;
                                break;
                            }
                            j10 = position2;
                            internetHeadersCreateInternetHeaders = null;
                        } else {
                            internetHeadersCreateInternetHeaders = createInternetHeaders(inputStream);
                            j10 = j14;
                        }
                        if (!inputStream.markSupported()) {
                            throw new MessagingException("Stream doesn't support mark");
                        }
                        if (sharedInputStream == null) {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                        } else {
                            position = sharedInputStream.getPosition();
                            byteArrayOutputStream = 0;
                        }
                        byte[] bArr = new byte[length2];
                        byte[] bArr2 = new byte[length2];
                        ?? r10 = z10;
                        boolean z14 = true;
                        while (true) {
                            inputStream.mark(length2 + 1004);
                            if (length2 == 0) {
                                i10 = i22;
                                i11 = 0;
                            } else {
                                i10 = i22;
                                int i23 = length2;
                                int i24 = 0;
                                int i25 = 0;
                                while (i23 > 0) {
                                    int i26 = inputStream.read(bArr, i24, i23);
                                    if (i26 <= 0) {
                                        break;
                                    }
                                    i24 += i26;
                                    i25 += i26;
                                    i23 -= i26;
                                }
                                i11 = i25 > 0 ? i25 : -1;
                            }
                            if (i11 >= length2) {
                                int i27 = i10;
                                while (true) {
                                    if (i27 < 0) {
                                        lineInputStream = lineInputStream2;
                                        z11 = z13;
                                        break;
                                    }
                                    lineInputStream = lineInputStream2;
                                    z11 = z13;
                                    if (bArr[i27] != bytes[i27]) {
                                        break;
                                    }
                                    i27--;
                                    lineInputStream2 = lineInputStream;
                                    z13 = z11;
                                }
                                if (i27 < 0) {
                                    int i28 = (z14 || !((b10 = bArr2[r10 - 1]) == 13 || b10 == 10)) ? 0 : (b10 == 10 && r10 >= 2 && bArr2[r10 + (-2)] == 13) ? 2 : 1;
                                    if (z14 || i28 > 0) {
                                        if (sharedInputStream != null) {
                                            position = (sharedInputStream.getPosition() - ((long) length2)) - ((long) i28);
                                        }
                                        int i29 = inputStream.read();
                                        if (i29 == 45 && inputStream.read() == 45) {
                                            this.complete = true;
                                            i12 = i28;
                                            j11 = position;
                                        } else {
                                            int i30 = 32;
                                            while (true) {
                                                if (i29 != i30 && i29 != 9) {
                                                    break;
                                                }
                                                int i31 = length2;
                                                int[] iArr5 = iArr3;
                                                long j15 = j10;
                                                i29 = inputStream.read();
                                                j10 = j15;
                                                length2 = i31;
                                                iArr3 = iArr5;
                                                i30 = 32;
                                            }
                                            if (i29 != 10) {
                                                if (i29 == 13) {
                                                    inputStream.mark(1);
                                                    if (inputStream.read() != 10) {
                                                        inputStream.reset();
                                                    }
                                                } else {
                                                    i15 = length2;
                                                    iArr2 = iArr3;
                                                }
                                            }
                                            i12 = i28;
                                            j11 = position;
                                            z13 = z11;
                                        }
                                        if (sharedInputStream != null) {
                                            i13 = length2;
                                            iArr = iArr3;
                                            j12 = j10;
                                            inputStreamNewStream = sharedInputStream.newStream(j12, j11);
                                            try {
                                                mimeBodyPartCreateMimeBodyPart = createMimeBodyPart(inputStreamNewStream);
                                                try {
                                                    inputStreamNewStream.close();
                                                } catch (IOException unused2) {
                                                }
                                            } catch (Throwable th2) {
                                                try {
                                                    inputStreamNewStream.close();
                                                    throw th2;
                                                } catch (IOException unused3) {
                                                    throw th2;
                                                }
                                            }
                                        } else {
                                            i13 = length2;
                                            iArr = iArr3;
                                            j12 = j10;
                                            i14 = r10 - i12;
                                            if (i14 > 0) {
                                                byteArrayOutputStream.write(bArr2, 0, i14);
                                            }
                                            if (!this.complete && i11 > 0) {
                                                byteArrayOutputStream.write(bArr, 0, i11);
                                            }
                                            mimeBodyPartCreateMimeBodyPart = createMimeBodyPart(internetHeadersCreateInternetHeaders, byteArrayOutputStream.toByteArray());
                                        }
                                        super.addBodyPart(mimeBodyPartCreateMimeBodyPart);
                                        position = j11;
                                        lineInputStream2 = lineInputStream;
                                        i22 = i10;
                                        iArr4 = iArr4;
                                        z10 = false;
                                        long j16 = j12;
                                        length2 = i13;
                                        j14 = j16;
                                        iArr3 = iArr;
                                    } else {
                                        i15 = length2;
                                        iArr2 = iArr3;
                                        iArr4 = iArr4;
                                    }
                                    j13 = j10;
                                    i27 = 0;
                                } else {
                                    i15 = length2;
                                    iArr2 = iArr3;
                                    iArr4 = iArr4;
                                    j13 = j10;
                                }
                                int iMax = Math.max((i27 + 1) - iArr2[bArr[i27] & 127], iArr4[i27]);
                                if (iMax < 2) {
                                    if (sharedInputStream == null && r10 > 1) {
                                        byteArrayOutputStream.write(bArr2, 0, r10 - 1);
                                    }
                                    inputStream.reset();
                                    long j17 = 1;
                                    while (j17 > 0) {
                                        long jSkip = inputStream.skip(j17);
                                        if (jSkip <= 0) {
                                            throw new EOFException("can't skip");
                                        }
                                        j17 -= jSkip;
                                    }
                                    if (r10 >= 1) {
                                        bArr2[0] = bArr2[r10 - 1];
                                        bArr2[1] = bArr[0];
                                        i16 = 2;
                                    } else {
                                        bArr2[0] = bArr[0];
                                        i16 = 1;
                                    }
                                    z12 = false;
                                } else {
                                    if (r10 <= 0 || sharedInputStream != null) {
                                        z12 = false;
                                    } else {
                                        z12 = false;
                                        byteArrayOutputStream.write(bArr2, 0, r10);
                                    }
                                    inputStream.reset();
                                    long j18 = iMax;
                                    while (j18 > 0) {
                                        long jSkip2 = inputStream.skip(j18);
                                        if (jSkip2 <= 0) {
                                            throw new EOFException("can't skip");
                                        }
                                        j18 -= jSkip2;
                                    }
                                    i16 = iMax;
                                    byte[] bArr3 = bArr2;
                                    bArr2 = bArr;
                                    bArr = bArr3;
                                }
                                j10 = j13;
                                length2 = i15;
                                lineInputStream2 = lineInputStream;
                                i22 = i10;
                                z13 = z11;
                                iArr4 = iArr4;
                                iArr3 = iArr2;
                                z14 = z12;
                                r10 = i16;
                            } else {
                                if (!this.ignoreMissingEndBoundary) {
                                    throw new ParseException("missing multipart end boundary");
                                }
                                if (sharedInputStream != null) {
                                    position = sharedInputStream.getPosition();
                                }
                                this.complete = false;
                                lineInputStream = lineInputStream2;
                                iArr4 = iArr4;
                                j11 = position;
                                i12 = 0;
                            }
                            z13 = true;
                            if (sharedInputStream != null) {
                                i13 = length2;
                                iArr = iArr3;
                                j12 = j10;
                                inputStreamNewStream = sharedInputStream.newStream(j12, j11);
                                mimeBodyPartCreateMimeBodyPart = createMimeBodyPart(inputStreamNewStream);
                                inputStreamNewStream.close();
                            } else {
                                i13 = length2;
                                iArr = iArr3;
                                j12 = j10;
                                i14 = r10 - i12;
                                if (i14 > 0) {
                                    byteArrayOutputStream.write(bArr2, 0, i14);
                                }
                                if (!this.complete) {
                                    byteArrayOutputStream.write(bArr, 0, i11);
                                }
                                mimeBodyPartCreateMimeBodyPart = createMimeBodyPart(internetHeadersCreateInternetHeaders, byteArrayOutputStream.toByteArray());
                            }
                            super.addBodyPart(mimeBodyPartCreateMimeBodyPart);
                            position = j11;
                            lineInputStream2 = lineInputStream;
                            i22 = i10;
                            iArr4 = iArr4;
                            z10 = false;
                            long j19 = j12;
                            length2 = i13;
                            j14 = j19;
                            iArr3 = iArr;
                        }
                    }
                    try {
                        inputStream.close();
                    } catch (IOException unused4) {
                    }
                    this.parsed = true;
                } catch (Throwable th3) {
                    try {
                        inputStream.close();
                    } catch (IOException unused5) {
                    }
                    throw th3;
                }
            } catch (IOException e5) {
                throw new MessagingException("IO Error", e5);
            }
        } catch (Exception e7) {
            throw new MessagingException("No inputstream from datasource", e7);
        }
    }

    @Override // javax.mail.Multipart
    public boolean removeBodyPart(BodyPart bodyPart) throws MessagingException {
        parse();
        return super.removeBodyPart(bodyPart);
    }

    public synchronized void setPreamble(String str) throws MessagingException {
        this.preamble = str;
    }

    public synchronized void setSubType(String str) throws MessagingException {
        ContentType contentType = new ContentType(this.contentType);
        contentType.setSubType(str);
        this.contentType = contentType.toString();
    }

    public synchronized void updateHeaders() throws MessagingException {
        parse();
        for (int i10 = 0; i10 < this.parts.size(); i10++) {
            ((MimeBodyPart) this.parts.elementAt(i10)).updateHeaders();
        }
    }

    @Override // javax.mail.Multipart
    public synchronized void writeTo(OutputStream outputStream) throws MessagingException, IOException {
        try {
            parse();
            String str = "--" + new ContentType(this.contentType).getParameter("boundary");
            LineOutputStream lineOutputStream = new LineOutputStream(outputStream);
            String str2 = this.preamble;
            if (str2 != null) {
                byte[] bytes = ASCIIUtility.getBytes(str2);
                lineOutputStream.write(bytes);
                if (bytes.length > 0 && bytes[bytes.length - 1] != 13 && bytes[bytes.length - 1] != 10) {
                    lineOutputStream.writeln();
                }
            }
            if (this.parts.size() != 0) {
                for (int i10 = 0; i10 < this.parts.size(); i10++) {
                    lineOutputStream.writeln(str);
                    ((MimeBodyPart) this.parts.elementAt(i10)).writeTo(outputStream);
                    lineOutputStream.writeln();
                }
            } else {
                if (!this.allowEmpty) {
                    throw new MessagingException("Empty multipart: " + this.contentType);
                }
                lineOutputStream.writeln(str);
                lineOutputStream.writeln();
            }
            lineOutputStream.writeln(str + "--");
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public MimeMultipart(String str) {
        this.ds = null;
        this.parsed = true;
        this.complete = true;
        this.preamble = null;
        this.ignoreMissingEndBoundary = true;
        this.ignoreMissingBoundaryParameter = true;
        this.ignoreExistingBoundaryParameter = false;
        this.allowEmpty = false;
        AtomicInteger atomicInteger = b.f79039a;
        StringBuilder sb2 = new StringBuilder();
        long jHashCode = sb2.hashCode();
        sb2.append("----=_Part_");
        sb2.append(b.f79039a.getAndIncrement());
        sb2.append(PushConstants.GE_PARAMS_SEPARATOR);
        sb2.append(jHashCode);
        sb2.append('.');
        sb2.append(System.currentTimeMillis());
        String string = sb2.toString();
        ContentType contentType = new ContentType("multipart", str, null);
        contentType.setParameter("boundary", string);
        this.contentType = contentType.toString();
        initializeProperties();
    }

    public MimeBodyPart createMimeBodyPart(InputStream inputStream) throws MessagingException {
        return new MimeBodyPart(inputStream);
    }

    public synchronized BodyPart getBodyPart(String str) throws MessagingException {
        parse();
        int count = getCount();
        for (int i10 = 0; i10 < count; i10++) {
            MimeBodyPart mimeBodyPart = (MimeBodyPart) getBodyPart(i10);
            String contentID = mimeBodyPart.getContentID();
            if (contentID != null && contentID.equals(str)) {
                return mimeBodyPart;
            }
        }
        return null;
    }

    @Override // javax.mail.Multipart
    public void removeBodyPart(int i10) throws MessagingException {
        parse();
        super.removeBodyPart(i10);
    }

    @Override // javax.mail.Multipart
    public synchronized void addBodyPart(BodyPart bodyPart, int i10) throws MessagingException {
        parse();
        super.addBodyPart(bodyPart, i10);
    }

    public MimeMultipart(BodyPart... bodyPartArr) throws MessagingException {
        this();
        for (BodyPart bodyPart : bodyPartArr) {
            super.addBodyPart(bodyPart);
        }
    }

    public MimeMultipart(String str, BodyPart... bodyPartArr) throws MessagingException {
        this(str);
        for (BodyPart bodyPart : bodyPartArr) {
            super.addBodyPart(bodyPart);
        }
    }

    public MimeMultipart(DataSource dataSource) throws MessagingException {
        this.ds = null;
        this.parsed = true;
        this.complete = true;
        this.preamble = null;
        this.ignoreMissingEndBoundary = true;
        this.ignoreMissingBoundaryParameter = true;
        this.ignoreExistingBoundaryParameter = false;
        this.allowEmpty = false;
        if (dataSource instanceof MessageAware) {
            setParent(((MessageAware) dataSource).getMessageContext().getPart());
        }
        if (dataSource instanceof MultipartDataSource) {
            setMultipartDataSource((MultipartDataSource) dataSource);
            return;
        }
        this.parsed = false;
        this.ds = dataSource;
        this.contentType = dataSource.getContentType();
    }
}
