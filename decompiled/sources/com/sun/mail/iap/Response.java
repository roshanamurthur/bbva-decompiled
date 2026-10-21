package com.sun.mail.iap;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.sun.mail.util.ASCIIUtility;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class Response {
    public static final int BAD = 12;
    public static final int BYE = 16;
    public static final int CONTINUATION = 1;
    public static final int NO = 8;
    public static final int OK = 4;
    public static final int SYNTHETIC = 32;
    public static final int TAGGED = 2;
    public static final int TAG_MASK = 3;
    public static final int TYPE_MASK = 28;
    public static final int UNTAGGED = 3;
    protected byte[] buffer;
    protected Exception ex;
    protected int index;
    protected int pindex;
    protected int size;
    protected String tag;
    protected int type;
    protected boolean utf8;

    public Response(String str) {
        this(str, true);
    }

    public static Response byeResponse(Exception exc) {
        Response response = new Response(("* BYE JavaMail Exception: " + exc.toString()).replace('\r', ' ').replace('\n', ' '));
        response.type = response.type | 32;
        response.ex = exc;
        return response;
    }

    public final void a() {
        this.index = 0;
        if (this.size == 0) {
            return;
        }
        byte b10 = this.buffer[0];
        if (b10 == 43) {
            this.type |= 1;
            this.index = 1;
            return;
        }
        if (b10 == 42) {
            this.type |= 3;
            this.index = 1;
        } else {
            this.type |= 2;
            String atom = readAtom();
            this.tag = atom;
            if (atom == null) {
                this.tag = "";
            }
        }
        int i10 = this.index;
        String atom2 = readAtom();
        String str = atom2 != null ? atom2 : "";
        if (str.equalsIgnoreCase("OK")) {
            this.type |= 4;
        } else if (str.equalsIgnoreCase("NO")) {
            this.type |= 8;
        } else if (str.equalsIgnoreCase("BAD")) {
            this.type |= 12;
        } else if (str.equalsIgnoreCase("BYE")) {
            this.type |= 16;
        } else {
            this.index = i10;
        }
        this.pindex = this.index;
    }

    public final Object b(boolean z10, boolean z11) {
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        byte[] bArr2;
        byte b10;
        skipSpaces();
        byte[] bArr3 = this.buffer;
        int i13 = this.index;
        byte b11 = bArr3[i13];
        if (b11 == 34) {
            int i14 = i13 + 1;
            this.index = i14;
            int i15 = i14;
            while (true) {
                i11 = this.index;
                i12 = this.size;
                if (i11 >= i12 || (b10 = (bArr2 = this.buffer)[i11]) == 34) {
                    break;
                }
                if (b10 == 92) {
                    this.index = i11 + 1;
                }
                int i16 = this.index;
                if (i16 != i15) {
                    bArr2[i15] = bArr2[i16];
                }
                i15++;
                this.index = i16 + 1;
            }
            if (i11 >= i12) {
                return null;
            }
            this.index = i11 + 1;
            return z11 ? e(this.buffer, i14, i15) : new ByteArray(this.buffer, i14, i15 - i14);
        }
        if (b11 != 123) {
            if (z10) {
                return z11 ? c(" (){%*\"\\") : new ByteArray(this.buffer, i13, this.index);
            }
            if (b11 != 78 && b11 != 110) {
                return null;
            }
            this.index = i13 + 3;
            return null;
        }
        int i17 = i13 + 1;
        this.index = i17;
        while (true) {
            bArr = this.buffer;
            i10 = this.index;
            if (bArr[i10] == 125) {
                try {
                    break;
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
            this.index = i10 + 1;
        }
        int i18 = ASCIIUtility.parseInt(bArr, i17, i10);
        int i19 = this.index + 3;
        int i20 = i19 + i18;
        this.index = i20;
        return z11 ? e(this.buffer, i19, i20) : new ByteArray(this.buffer, i19, i18);
    }

    public final String c(String str) {
        int i10;
        skipSpaces();
        int i11 = this.index;
        if (i11 >= this.size) {
            return null;
        }
        while (true) {
            int i12 = this.index;
            if (i12 >= this.size || (i10 = this.buffer[i12] & 255) < 32 || str.indexOf((char) i10) >= 0 || i10 == 127) {
                break;
            }
            this.index++;
        }
        return e(this.buffer, i11, this.index);
    }

    public final String[] d(boolean z10) {
        skipSpaces();
        byte[] bArr = this.buffer;
        int i10 = this.index;
        if (bArr[i10] != 40) {
            return null;
        }
        this.index = i10 + 1;
        ArrayList arrayList = new ArrayList();
        while (!isNextNonSpace(RootService.CLOSE_BRACKET)) {
            String atomString = z10 ? readAtomString() : readString();
            if (atomString == null) {
                break;
            }
            arrayList.add(atomString);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final String e(byte[] bArr, int i10, int i11) {
        return this.utf8 ? new String(bArr, i10, i11 - i10, StandardCharsets.UTF_8) : ASCIIUtility.toString(bArr, i10, i11);
    }

    public Exception getException() {
        return this.ex;
    }

    public String getRest() {
        skipSpaces();
        return e(this.buffer, this.index, this.size);
    }

    public String getTag() {
        return this.tag;
    }

    public int getType() {
        return this.type;
    }

    public boolean isBAD() {
        return (this.type & 28) == 12;
    }

    public boolean isBYE() {
        return (this.type & 28) == 16;
    }

    public boolean isContinuation() {
        return (this.type & 3) == 1;
    }

    public boolean isNO() {
        return (this.type & 28) == 8;
    }

    public boolean isNextNonSpace(char c10) {
        skipSpaces();
        int i10 = this.index;
        if (i10 >= this.size || this.buffer[i10] != ((byte) c10)) {
            return false;
        }
        this.index = i10 + 1;
        return true;
    }

    public boolean isOK() {
        return (this.type & 28) == 4;
    }

    public boolean isSynthetic() {
        return (this.type & 32) == 32;
    }

    public boolean isTagged() {
        return (this.type & 3) == 2;
    }

    public boolean isUnTagged() {
        return (this.type & 3) == 3;
    }

    public byte peekByte() {
        int i10 = this.index;
        if (i10 < this.size) {
            return this.buffer[i10];
        }
        return (byte) 0;
    }

    public String readAtom() {
        return c(" (){%*\"\\]");
    }

    public String readAtomString() {
        return (String) b(true, true);
    }

    public String[] readAtomStringList() {
        return d(true);
    }

    public byte readByte() {
        int i10 = this.index;
        if (i10 >= this.size) {
            return (byte) 0;
        }
        byte[] bArr = this.buffer;
        this.index = i10 + 1;
        return bArr[i10];
    }

    public ByteArray readByteArray() {
        if (!isContinuation()) {
            return (ByteArray) b(false, false);
        }
        skipSpaces();
        byte[] bArr = this.buffer;
        int i10 = this.index;
        return new ByteArray(bArr, i10, this.size - i10);
    }

    public ByteArrayInputStream readBytes() {
        ByteArray byteArray = readByteArray();
        if (byteArray != null) {
            return byteArray.toByteArrayInputStream();
        }
        return null;
    }

    public long readLong() {
        skipSpaces();
        int i10 = this.index;
        while (true) {
            int i11 = this.index;
            if (i11 >= this.size || !Character.isDigit((char) this.buffer[i11])) {
                break;
            }
            this.index++;
        }
        int i12 = this.index;
        if (i12 <= i10) {
            return -1L;
        }
        try {
            return ASCIIUtility.parseLong(this.buffer, i10, i12);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public int readNumber() {
        skipSpaces();
        int i10 = this.index;
        while (true) {
            int i11 = this.index;
            if (i11 >= this.size || !Character.isDigit((char) this.buffer[i11])) {
                break;
            }
            this.index++;
        }
        int i12 = this.index;
        if (i12 <= i10) {
            return -1;
        }
        try {
            return ASCIIUtility.parseInt(this.buffer, i10, i12);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public String readString(char c10) {
        int i10;
        skipSpaces();
        int i11 = this.index;
        if (i11 >= this.size) {
            return null;
        }
        while (true) {
            i10 = this.index;
            if (i10 >= this.size || this.buffer[i10] == c10) {
                break;
            }
            this.index = i10 + 1;
        }
        return e(this.buffer, i11, i10);
    }

    public String[] readStringList() {
        return d(false);
    }

    public void reset() {
        this.index = this.pindex;
    }

    public void skip(int i10) {
        this.index += i10;
    }

    public void skipSpaces() {
        while (true) {
            int i10 = this.index;
            if (i10 >= this.size || this.buffer[i10] != 32) {
                return;
            } else {
                this.index = i10 + 1;
            }
        }
    }

    public void skipToken() {
        while (true) {
            int i10 = this.index;
            if (i10 >= this.size || this.buffer[i10] == 32) {
                return;
            } else {
                this.index = i10 + 1;
            }
        }
    }

    public boolean supportsUtf8() {
        return this.utf8;
    }

    public String toString() {
        return e(this.buffer, 0, this.size);
    }

    public Response(String str, boolean z10) {
        this.buffer = null;
        this.type = 0;
        this.tag = null;
        if (z10) {
            this.buffer = str.getBytes(StandardCharsets.UTF_8);
        } else {
            this.buffer = str.getBytes(StandardCharsets.US_ASCII);
        }
        this.size = this.buffer.length;
        this.utf8 = z10;
        a();
    }

    public String readString() {
        return (String) b(false, true);
    }

    public Response(Protocol protocol) throws ProtocolException, IOException {
        this.buffer = null;
        this.type = 0;
        this.tag = null;
        ByteArray response = protocol.getInputStream().readResponse(protocol.getResponseBuffer());
        this.buffer = response.getBytes();
        this.size = response.getCount() - 2;
        this.utf8 = protocol.supportsUtf8();
        a();
    }

    public Response(Response response) {
        this.buffer = null;
        this.type = 0;
        this.tag = null;
        this.index = response.index;
        this.pindex = response.pindex;
        this.size = response.size;
        this.buffer = response.buffer;
        this.type = response.type;
        this.tag = response.tag;
        this.ex = response.ex;
        this.utf8 = response.utf8;
    }
}
