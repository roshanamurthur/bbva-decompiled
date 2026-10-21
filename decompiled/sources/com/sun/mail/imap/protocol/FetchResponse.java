package com.sun.mail.imap.protocol;

import ad.d;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.sun.mail.iap.ParsingException;
import com.sun.mail.iap.Protocol;
import com.sun.mail.iap.ProtocolException;
import com.sun.mail.iap.Response;
import com.sun.mail.util.ASCIIUtility;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes9.dex */
public class FetchResponse extends IMAPResponse {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final char[] f65425f = {'.', 'H', 'E', 'A', 'D', 'E', Matrix.MATRIX_TYPE_RANDOM_REGULAR};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final char[] f65426g = {'.', 'T', 'E', 'X', 'T'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Item[] f65427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f65428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FetchItem[] f65429e;

    public FetchResponse(Protocol protocol) throws ProtocolException, IOException {
        super(protocol);
        this.f65429e = null;
        h();
    }

    public static <T extends Item> List<T> getItems(Response[] responseArr, int i10, Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        if (responseArr == null) {
            return arrayList;
        }
        for (int i11 = 0; i11 < responseArr.length; i11++) {
            Response response = responseArr[i11];
            if (response != null && (response instanceof FetchResponse) && ((FetchResponse) response).getNumber() == i10) {
                FetchResponse fetchResponse = (FetchResponse) responseArr[i11];
                int i12 = 0;
                while (true) {
                    Item[] itemArr = fetchResponse.f65427c;
                    if (i12 < itemArr.length) {
                        if (cls.isInstance(itemArr[i12])) {
                            arrayList.add(cls.cast(fetchResponse.f65427c[i12]));
                        }
                        i12++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final boolean g(char[] cArr) {
        int length = cArr.length;
        int i10 = this.index;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i10 + 1;
            int i13 = i11 + 1;
            if (Character.toUpperCase((char) this.buffer[i10]) != cArr[i11]) {
                return false;
            }
            i11 = i13;
            i10 = i12;
        }
        this.index += length;
        return true;
    }

    public Map<String, Object> getExtensionItems() {
        return this.f65428d;
    }

    public Item getItem(int i10) {
        return this.f65427c[i10];
    }

    public int getItemCount() {
        return this.f65427c.length;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0055  */
    /* JADX WARN: Code duplicated, block: B:38:0x005d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00be  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f8  */
    public final void h() throws ParsingException {
        Object bodystructure;
        String string;
        boolean z10;
        if (!isNextNonSpace(RootService.OPEN_BRACKET)) {
            throw new ParsingException("error in FETCH parsing, missing '(' at index " + this.index);
        }
        ArrayList arrayList = new ArrayList();
        skipSpaces();
        loop0: while (true) {
            int i10 = this.index;
            if (i10 >= this.size) {
                throw new ParsingException("error in FETCH parsing, ran off end of buffer, size " + this.size);
            }
            byte b10 = this.buffer[i10];
            if (b10 == 66) {
                if (g(BODYSTRUCTURE.f65416q0)) {
                    bodystructure = new BODYSTRUCTURE(this);
                } else if (g(BODY.f65412s0)) {
                    bodystructure = null;
                } else if (this.buffer[this.index] == 91) {
                    bodystructure = new BODY(this);
                } else {
                    bodystructure = new BODYSTRUCTURE(this);
                }
            } else if (b10 == 73) {
                if (g(INTERNALDATE.f65447p0)) {
                    bodystructure = new INTERNALDATE(this);
                } else {
                    bodystructure = null;
                }
            } else if (b10 == 77) {
                if (g(MODSEQ.f65450p0)) {
                    bodystructure = new MODSEQ(this);
                } else {
                    bodystructure = null;
                }
            } else if (b10 == 82) {
                if (g(RFC822SIZE.f65454p0)) {
                    bodystructure = new RFC822SIZE(this);
                } else if (g(RFC822DATA.f65451r0)) {
                    if (g(f65425f)) {
                        z10 = true;
                    } else {
                        g(f65426g);
                        z10 = false;
                    }
                    bodystructure = new RFC822DATA(this, z10);
                } else {
                    bodystructure = null;
                }
            } else if (b10 == 85) {
                if (g(UID.f65458p0)) {
                    bodystructure = new UID(this);
                } else {
                    bodystructure = null;
                }
            } else if (b10 != 98) {
                if (b10 != 105) {
                    if (b10 != 109) {
                        if (b10 != 114) {
                            if (b10 != 117) {
                                if (b10 == 69) {
                                    if (g(ENVELOPE.f65419p0)) {
                                        bodystructure = new ENVELOPE(this);
                                    } else {
                                        bodystructure = null;
                                    }
                                } else if (b10 != 70) {
                                    if (b10 != 101) {
                                        if (b10 == 102) {
                                            if (g(FLAGS.f65422r0)) {
                                                bodystructure = new FLAGS(this);
                                            }
                                        }
                                    } else if (g(ENVELOPE.f65419p0)) {
                                        bodystructure = new ENVELOPE(this);
                                    }
                                    bodystructure = null;
                                } else if (g(FLAGS.f65422r0)) {
                                    bodystructure = new FLAGS(this);
                                } else {
                                    bodystructure = null;
                                }
                            } else if (g(UID.f65458p0)) {
                                bodystructure = new UID(this);
                            } else {
                                bodystructure = null;
                            }
                        } else if (g(RFC822SIZE.f65454p0)) {
                            bodystructure = new RFC822SIZE(this);
                        } else if (g(RFC822DATA.f65451r0)) {
                            if (g(f65425f)) {
                                z10 = true;
                            } else {
                                g(f65426g);
                                z10 = false;
                            }
                            bodystructure = new RFC822DATA(this, z10);
                        } else {
                            bodystructure = null;
                        }
                    } else if (g(MODSEQ.f65450p0)) {
                        bodystructure = new MODSEQ(this);
                    } else {
                        bodystructure = null;
                    }
                } else if (g(INTERNALDATE.f65447p0)) {
                    bodystructure = new INTERNALDATE(this);
                } else {
                    bodystructure = null;
                }
            } else if (g(BODYSTRUCTURE.f65416q0)) {
                bodystructure = new BODYSTRUCTURE(this);
            } else if (g(BODY.f65412s0)) {
                bodystructure = null;
            } else if (this.buffer[this.index] == 91) {
                bodystructure = new BODY(this);
            } else {
                bodystructure = new BODYSTRUCTURE(this);
            }
            if (bodystructure == null) {
                FetchItem[] fetchItemArr = this.f65429e;
                if (fetchItemArr != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= fetchItemArr.length) {
                            break loop0;
                        }
                        String name = fetchItemArr[i11].getName();
                        int length = name.length();
                        int i12 = this.index;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= length) {
                                this.index += length;
                                if (this.f65428d == null) {
                                    this.f65428d = new HashMap();
                                }
                                this.f65428d.put(fetchItemArr[i11].getName(), fetchItemArr[i11].parseItem(this));
                                break;
                            }
                            int i14 = i12 + 1;
                            int i15 = i13 + 1;
                            if (Character.toUpperCase((char) this.buffer[i12]) != name.charAt(i13)) {
                                break;
                            }
                            i13 = i15;
                            i12 = i14;
                        }
                        i11++;
                    }
                } else {
                    break;
                }
            } else {
                arrayList.add(bodystructure);
            }
            if (isNextNonSpace(RootService.CLOSE_BRACKET)) {
                this.f65427c = (Item[]) arrayList.toArray(new Item[arrayList.size()]);
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder("error in FETCH parsing, unrecognized item at index ");
        sb2.append(this.index);
        sb2.append(", starts with \"");
        int i16 = this.index;
        int i17 = i16 + 20;
        int i18 = this.size;
        if (i17 > i18) {
            string = ASCIIUtility.toString(this.buffer, i16, i18);
        } else {
            StringBuilder sb3 = new StringBuilder();
            byte[] bArr = this.buffer;
            int i19 = this.index;
            sb3.append(ASCIIUtility.toString(bArr, i19, i19 + 20));
            sb3.append("...");
            string = sb3.toString();
        }
        throw new ParsingException(d.f(sb2, string, "\""));
    }

    public <T extends Item> T getItem(Class<T> cls) {
        int i10 = 0;
        while (true) {
            Item[] itemArr = this.f65427c;
            if (i10 >= itemArr.length) {
                return null;
            }
            if (cls.isInstance(itemArr[i10])) {
                return cls.cast(this.f65427c[i10]);
            }
            i10++;
        }
    }

    public FetchResponse(IMAPResponse iMAPResponse) throws ProtocolException, IOException {
        this(iMAPResponse, null);
    }

    public FetchResponse(IMAPResponse iMAPResponse, FetchItem[] fetchItemArr) throws ProtocolException, IOException {
        super(iMAPResponse);
        this.f65429e = fetchItemArr;
        h();
    }

    public static <T extends Item> T getItem(Response[] responseArr, int i10, Class<T> cls) {
        if (responseArr == null) {
            return null;
        }
        for (int i11 = 0; i11 < responseArr.length; i11++) {
            Response response = responseArr[i11];
            if (response != null && (response instanceof FetchResponse) && ((FetchResponse) response).getNumber() == i10) {
                FetchResponse fetchResponse = (FetchResponse) responseArr[i11];
                int i12 = 0;
                while (true) {
                    Item[] itemArr = fetchResponse.f65427c;
                    if (i12 >= itemArr.length) {
                        break;
                    }
                    if (cls.isInstance(itemArr[i12])) {
                        return cls.cast(fetchResponse.f65427c[i12]);
                    }
                    i12++;
                }
            }
        }
        return null;
    }
}
