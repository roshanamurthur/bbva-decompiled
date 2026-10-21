package com.sun.mail.iap;

import com.sun.mail.util.ASCIIUtility;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class Argument {
    protected List<Object> items = new ArrayList(1);

    public static void a(byte[] bArr, Protocol protocol, boolean z10) throws ProtocolException, IOException {
        byte b10;
        byte b11;
        byte b12;
        int i10;
        DataOutputStream dataOutputStream = (DataOutputStream) protocol.getOutputStream();
        int length = bArr.length;
        if (length > 1024) {
            b(protocol, bArr.length).write(bArr);
            return;
        }
        boolean z11 = true;
        if (length == 0) {
            z10 = true;
        }
        boolean zSupportsUtf8 = protocol.supportsUtf8();
        boolean z12 = false;
        for (byte b13 : bArr) {
            if (b13 == 0 || b13 == 13 || b13 == 10 || (!zSupportsUtf8 && (b13 & 255) > 127)) {
                b(protocol, bArr.length).write(bArr);
                return;
            }
            if (b13 == 42 || b13 == 37 || b13 == 40 || b13 == 41 || b13 == 123 || b13 == 34 || b13 == 92 || (i10 = b13 & 255) <= 32 || i10 > 127) {
                if (b13 == 34 || b13 == 92) {
                    z10 = true;
                    z12 = true;
                } else {
                    z10 = true;
                }
            }
        }
        if (z10 || bArr.length != 3 || (((b10 = bArr[0]) != 78 && b10 != 110) || (((b11 = bArr[1]) != 73 && b11 != 105) || ((b12 = bArr[2]) != 76 && b12 != 108)))) {
            z11 = z10;
        }
        if (z11) {
            dataOutputStream.write(34);
        }
        if (z12) {
            for (byte b14 : bArr) {
                if (b14 == 34 || b14 == 92) {
                    dataOutputStream.write(92);
                }
                dataOutputStream.write(b14);
            }
        } else {
            dataOutputStream.write(bArr);
        }
        if (z11) {
            dataOutputStream.write(34);
        }
    }

    public static DataOutputStream b(Protocol protocol, int i10) throws ProtocolException, IOException {
        Response response;
        DataOutputStream dataOutputStream = (DataOutputStream) protocol.getOutputStream();
        boolean zSupportsNonSyncLiterals = protocol.supportsNonSyncLiterals();
        dataOutputStream.write(123);
        dataOutputStream.writeBytes(Integer.toString(i10));
        if (zSupportsNonSyncLiterals) {
            dataOutputStream.writeBytes("+}\r\n");
        } else {
            dataOutputStream.writeBytes("}\r\n");
        }
        dataOutputStream.flush();
        if (!zSupportsNonSyncLiterals) {
            do {
                response = protocol.readResponse();
                if (response.isContinuation()) {
                }
            } while (!response.isTagged());
            throw new LiteralException(response);
        }
        return dataOutputStream;
    }

    public Argument append(Argument argument) {
        this.items.addAll(argument.items);
        return this;
    }

    public void write(Protocol protocol) throws ProtocolException, IOException {
        List<Object> list = this.items;
        int size = list != null ? list.size() : 0;
        DataOutputStream dataOutputStream = (DataOutputStream) protocol.getOutputStream();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                dataOutputStream.write(32);
            }
            Object obj = this.items.get(i10);
            if (obj instanceof b) {
                dataOutputStream.writeBytes(((b) obj).f65261a);
            } else if (obj instanceof Number) {
                dataOutputStream.writeBytes(((Number) obj).toString());
            } else if (obj instanceof a) {
                a(((a) obj).f65260a, protocol, false);
            } else if (obj instanceof c) {
                byte[] bArr = ((c) obj).f65262a;
                if (bArr == null) {
                    ((DataOutputStream) protocol.getOutputStream()).writeBytes("NIL");
                } else {
                    a(bArr, protocol, true);
                }
            } else if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                b(protocol, bArr2.length).write(bArr2);
            } else if (obj instanceof ByteArrayOutputStream) {
                ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) obj;
                byteArrayOutputStream.writeTo(b(protocol, byteArrayOutputStream.size()));
            } else if (obj instanceof Literal) {
                Literal literal = (Literal) obj;
                literal.writeTo(b(protocol, literal.size()));
            } else if (obj instanceof Argument) {
                dataOutputStream.write(40);
                ((Argument) obj).write(protocol);
                dataOutputStream.write(41);
            }
        }
    }

    public Argument writeArgument(Argument argument) {
        this.items.add(argument);
        return this;
    }

    public Argument writeAtom(String str) {
        List<Object> list = this.items;
        b bVar = new b();
        bVar.f65261a = str;
        list.add(bVar);
        return this;
    }

    public Argument writeBytes(byte[] bArr) {
        this.items.add(bArr);
        return this;
    }

    public Argument writeNString(String str) {
        if (str == null) {
            this.items.add(new c(null));
        } else {
            this.items.add(new c(ASCIIUtility.getBytes(str)));
        }
        return this;
    }

    public Argument writeNumber(int i10) {
        this.items.add(Integer.valueOf(i10));
        return this;
    }

    public Argument writeString(String str) {
        this.items.add(new a(ASCIIUtility.getBytes(str)));
        return this;
    }

    public Argument writeBytes(ByteArrayOutputStream byteArrayOutputStream) {
        this.items.add(byteArrayOutputStream);
        return this;
    }

    public Argument writeNumber(long j10) {
        this.items.add(Long.valueOf(j10));
        return this;
    }

    public Argument writeString(String str, String str2) throws UnsupportedEncodingException {
        if (str2 == null) {
            writeString(str);
        } else {
            this.items.add(new a(str.getBytes(str2)));
        }
        return this;
    }

    public Argument writeBytes(Literal literal) {
        this.items.add(literal);
        return this;
    }

    public Argument writeNString(String str, String str2) throws UnsupportedEncodingException {
        if (str == null) {
            this.items.add(new c(null));
        } else if (str2 == null) {
            writeString(str);
        } else {
            this.items.add(new c(str.getBytes(str2)));
        }
        return this;
    }

    public Argument writeString(String str, Charset charset) {
        if (charset == null) {
            writeString(str);
        } else {
            this.items.add(new a(str.getBytes(charset)));
        }
        return this;
    }

    public Argument writeNString(String str, Charset charset) {
        if (str == null) {
            this.items.add(new c(null));
        } else if (charset == null) {
            writeString(str);
        } else {
            this.items.add(new c(str.getBytes(charset)));
        }
        return this;
    }
}
