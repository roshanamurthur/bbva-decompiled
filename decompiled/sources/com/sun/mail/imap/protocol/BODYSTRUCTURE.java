package com.sun.mail.imap.protocol;

import ad.d;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.nativesettings.common.Constants;
import com.sun.mail.iap.ParsingException;
import com.sun.mail.iap.Response;
import com.sun.mail.util.PropUtil;
import java.util.ArrayList;
import javax.mail.internet.ParameterList;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes9.dex */
public class BODYSTRUCTURE implements Item {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final char[] f65416q0 = {'B', 'O', 'D', 'Y', 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_REGULAR, Matrix.MATRIX_TYPE_RANDOM_UT, 'C', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'E'};

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final boolean f65417r0 = PropUtil.getBooleanSystemProperty("mail.imap.parse.debug", false);
    public String attachment;
    public BODYSTRUCTURE[] bodies;
    public ParameterList cParams;
    public ParameterList dParams;
    public String description;
    public String disposition;
    public String encoding;
    public ENVELOPE envelope;
    public String id;
    public String[] language;
    public int lines;
    public String md5;
    public int msgno;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f65418p0;
    public int size;
    public String subtype;
    public String type;

    public BODYSTRUCTURE(FetchResponse fetchResponse) throws ParsingException {
        char c10;
        this.lines = -1;
        this.size = -1;
        boolean z10 = f65417r0;
        if (z10) {
            System.out.println("DEBUG IMAP: parsing BODYSTRUCTURE");
        }
        this.msgno = fetchResponse.getNumber();
        if (z10) {
            System.out.println("DEBUG IMAP: msgno " + this.msgno);
        }
        fetchResponse.skipSpaces();
        if (fetchResponse.readByte() != 40) {
            throw new ParsingException("BODYSTRUCTURE parse error: missing ``('' at start");
        }
        if (fetchResponse.peekByte() == 40) {
            if (z10) {
                System.out.println("DEBUG IMAP: parsing multipart");
            }
            this.type = "multipart";
            this.f65418p0 = 2;
            ArrayList arrayList = new ArrayList(1);
            do {
                arrayList.add(new BODYSTRUCTURE(fetchResponse));
                fetchResponse.skipSpaces();
            } while (fetchResponse.peekByte() == 40);
            this.bodies = (BODYSTRUCTURE[]) arrayList.toArray(new BODYSTRUCTURE[arrayList.size()]);
            this.subtype = fetchResponse.readString();
            if (z10) {
                System.out.println("DEBUG IMAP: subtype " + this.subtype);
            }
            if (fetchResponse.isNextNonSpace(RootService.CLOSE_BRACKET)) {
                if (z10) {
                    System.out.println("DEBUG IMAP: parse DONE");
                    return;
                }
                return;
            }
            if (z10) {
                System.out.println("DEBUG IMAP: parsing extension data");
            }
            this.cParams = b(fetchResponse);
            if (fetchResponse.isNextNonSpace(RootService.CLOSE_BRACKET)) {
                if (z10) {
                    System.out.println("DEBUG IMAP: body parameters DONE");
                    return;
                }
                return;
            }
            byte bPeekByte = fetchResponse.peekByte();
            if (bPeekByte == 40) {
                if (z10) {
                    System.out.println("DEBUG IMAP: parse disposition");
                }
                fetchResponse.readByte();
                this.disposition = fetchResponse.readString();
                if (z10) {
                    System.out.println("DEBUG IMAP: disposition " + this.disposition);
                }
                this.dParams = b(fetchResponse);
                if (!fetchResponse.isNextNonSpace(RootService.CLOSE_BRACKET)) {
                    throw new ParsingException("BODYSTRUCTURE parse error: missing ``)'' at end of disposition in multipart");
                }
                if (z10) {
                    System.out.println("DEBUG IMAP: disposition DONE");
                }
            } else {
                if (bPeekByte != 78 && bPeekByte != 110) {
                    if (z10) {
                        System.out.println("DEBUG IMAP: bad multipart disposition, applying Exchange bug workaround");
                    }
                    this.description = fetchResponse.readString();
                    if (z10) {
                        System.out.println("DEBUG IMAP: multipart description " + this.description);
                    }
                    while (fetchResponse.readByte() == 32) {
                        a(fetchResponse);
                    }
                    return;
                }
                if (z10) {
                    System.out.println("DEBUG IMAP: disposition NIL");
                }
                fetchResponse.skip(3);
            }
            if (fetchResponse.isNextNonSpace(RootService.CLOSE_BRACKET)) {
                if (z10) {
                    System.out.println("DEBUG IMAP: no body-fld-lang");
                    return;
                }
                return;
            }
            if (fetchResponse.peekByte() == 40) {
                this.language = fetchResponse.readStringList();
                if (z10) {
                    System.out.println("DEBUG IMAP: language len " + this.language.length);
                }
            } else {
                String string = fetchResponse.readString();
                if (string != null) {
                    this.language = new String[]{string};
                    if (z10) {
                        System.out.println("DEBUG IMAP: language ".concat(string));
                    }
                }
            }
            while (fetchResponse.readByte() == 32) {
                a(fetchResponse);
            }
            return;
        }
        if (fetchResponse.peekByte() == 41) {
            throw new ParsingException("BODYSTRUCTURE parse error: missing body content");
        }
        if (z10) {
            System.out.println("DEBUG IMAP: single part");
        }
        this.type = fetchResponse.readString();
        if (z10) {
            System.out.println("DEBUG IMAP: type " + this.type);
        }
        this.f65418p0 = 1;
        this.subtype = fetchResponse.readString();
        if (z10) {
            System.out.println("DEBUG IMAP: subtype " + this.subtype);
        }
        if (this.type == null) {
            this.type = Constants.APPLICATION;
            this.subtype = "octet-stream";
        }
        this.cParams = b(fetchResponse);
        if (z10) {
            System.out.println("DEBUG IMAP: cParams " + this.cParams);
        }
        this.id = fetchResponse.readString();
        if (z10) {
            System.out.println("DEBUG IMAP: id " + this.id);
        }
        this.description = fetchResponse.readString();
        if (z10) {
            System.out.println("DEBUG IMAP: description " + this.description);
        }
        String atomString = fetchResponse.readAtomString();
        this.encoding = atomString;
        if (atomString != null && atomString.equalsIgnoreCase("NIL")) {
            if (z10) {
                System.out.println("DEBUG IMAP: NIL encoding, applying Exchange bug workaround");
            }
            this.encoding = null;
        }
        String str = this.encoding;
        if (str != null) {
            this.encoding = str.trim();
        }
        if (z10) {
            System.out.println("DEBUG IMAP: encoding " + this.encoding);
        }
        this.size = fetchResponse.readNumber();
        if (z10) {
            System.out.println("DEBUG IMAP: size " + this.size);
        }
        if (this.size < 0) {
            throw new ParsingException("BODYSTRUCTURE parse error: bad ``size'' element");
        }
        if (this.type.equalsIgnoreCase("text")) {
            this.lines = fetchResponse.readNumber();
            if (z10) {
                System.out.println("DEBUG IMAP: lines " + this.lines);
            }
            if (this.lines < 0) {
                throw new ParsingException("BODYSTRUCTURE parse error: bad ``lines'' element");
            }
            c10 = ')';
        } else {
            if (this.type.equalsIgnoreCase("message") && this.subtype.equalsIgnoreCase("rfc822")) {
                this.f65418p0 = 3;
                fetchResponse.skipSpaces();
                if (fetchResponse.peekByte() == 40) {
                    this.envelope = new ENVELOPE(fetchResponse);
                    if (z10) {
                        System.out.println("DEBUG IMAP: got envelope of nested message");
                    }
                    this.bodies = new BODYSTRUCTURE[]{new BODYSTRUCTURE(fetchResponse)};
                    this.lines = fetchResponse.readNumber();
                    if (z10) {
                        System.out.println("DEBUG IMAP: lines " + this.lines);
                    }
                    if (this.lines < 0) {
                        throw new ParsingException("BODYSTRUCTURE parse error: bad ``lines'' element");
                    }
                } else if (z10) {
                    System.out.println("DEBUG IMAP: missing envelope and body of nested message");
                }
            } else {
                fetchResponse.skipSpaces();
                if (Character.isDigit((char) fetchResponse.peekByte())) {
                    throw new ParsingException("BODYSTRUCTURE parse error: server erroneously included ``lines'' element with type " + this.type + "/" + this.subtype);
                }
            }
            c10 = RootService.CLOSE_BRACKET;
        }
        if (fetchResponse.isNextNonSpace(c10)) {
            if (z10) {
                System.out.println("DEBUG IMAP: parse DONE");
                return;
            }
            return;
        }
        this.md5 = fetchResponse.readString();
        if (fetchResponse.isNextNonSpace(c10)) {
            if (z10) {
                System.out.println("DEBUG IMAP: no MD5 DONE");
                return;
            }
            return;
        }
        byte b10 = fetchResponse.readByte();
        if (b10 == 40) {
            this.disposition = fetchResponse.readString();
            if (z10) {
                System.out.println("DEBUG IMAP: disposition " + this.disposition);
            }
            this.dParams = b(fetchResponse);
            if (z10) {
                System.out.println("DEBUG IMAP: dParams " + this.dParams);
            }
            if (!fetchResponse.isNextNonSpace(RootService.CLOSE_BRACKET)) {
                throw new ParsingException("BODYSTRUCTURE parse error: missing ``)'' at end of disposition");
            }
        } else {
            if (b10 != 78 && b10 != 110) {
                throw new ParsingException("BODYSTRUCTURE parse error: " + this.type + "/" + this.subtype + ": bad single part disposition, b " + ((int) b10));
            }
            if (z10) {
                System.out.println("DEBUG IMAP: disposition NIL");
            }
            fetchResponse.skip(2);
        }
        if (fetchResponse.isNextNonSpace(RootService.CLOSE_BRACKET)) {
            if (z10) {
                System.out.println("DEBUG IMAP: disposition DONE");
                return;
            }
            return;
        }
        if (fetchResponse.peekByte() == 40) {
            this.language = fetchResponse.readStringList();
            if (z10) {
                System.out.println("DEBUG IMAP: language len " + this.language.length);
            }
        } else {
            String string2 = fetchResponse.readString();
            if (string2 != null) {
                this.language = new String[]{string2};
                if (z10) {
                    System.out.println("DEBUG IMAP: language ".concat(string2));
                }
            }
        }
        while (fetchResponse.readByte() == 32) {
            a(fetchResponse);
        }
        if (z10) {
            System.out.println("DEBUG IMAP: all DONE");
        }
    }

    public static void a(Response response) throws ParsingException {
        response.skipSpaces();
        byte bPeekByte = response.peekByte();
        if (bPeekByte == 40) {
            response.skip(1);
            do {
                a(response);
            } while (!response.isNextNonSpace(RootService.CLOSE_BRACKET));
        } else if (Character.isDigit((char) bPeekByte)) {
            response.readNumber();
        } else {
            response.readString();
        }
    }

    public final ParameterList b(Response response) throws ParsingException {
        response.skipSpaces();
        byte b10 = response.readByte();
        boolean z10 = f65417r0;
        if (b10 != 40) {
            if (b10 != 78 && b10 != 110) {
                throw new ParsingException("Parameter list parse error");
            }
            if (z10) {
                System.out.println("DEBUG IMAP: parameter list NIL");
            }
            response.skip(2);
            return null;
        }
        ParameterList parameterList = new ParameterList();
        do {
            String string = response.readString();
            if (z10) {
                System.out.println("DEBUG IMAP: parameter name " + string);
            }
            if (string == null) {
                StringBuilder sb2 = new StringBuilder("BODYSTRUCTURE parse error: ");
                sb2.append(this.type);
                sb2.append("/");
                throw new ParsingException(d.f(sb2, this.subtype, ": null name in parameter list"));
            }
            String string2 = response.readString();
            if (z10) {
                System.out.println("DEBUG IMAP: parameter value " + string2);
            }
            if (string2 == null) {
                if (z10) {
                    System.out.println("DEBUG IMAP: NIL parameter value, applying Exchange bug workaround");
                }
                string2 = "";
            }
            parameterList.set(string, string2);
        } while (!response.isNextNonSpace(RootService.CLOSE_BRACKET));
        parameterList.combineSegments();
        return parameterList;
    }

    public boolean isMulti() {
        return this.f65418p0 == 2;
    }

    public boolean isNested() {
        return this.f65418p0 == 3;
    }

    public boolean isSingle() {
        return this.f65418p0 == 1;
    }
}
