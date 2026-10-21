package flexjson;

import androidx.camera.camera2.internal.h0;
import androidx.camera.core.impl.utils.c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class JSONTokener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f68492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Reader f68493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public char f68494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f68495d;

    public JSONTokener(Reader reader) {
        this.f68493b = reader.markSupported() ? reader : new BufferedReader(reader);
        this.f68495d = false;
        this.f68492a = 0;
    }

    public static int dehexchar(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'A' && c10 <= 'F') {
            return c10 - '7';
        }
        if (c10 < 'a' || c10 > 'f') {
            return -1;
        }
        return c10 - 'W';
    }

    public void back() throws JSONException {
        int i10;
        if (this.f68495d || (i10 = this.f68492a) <= 0) {
            throw new JSONException("Stepping back two steps is not supported");
        }
        this.f68492a = i10 - 1;
        this.f68495d = true;
    }

    public boolean more() throws JSONException {
        if (next() == 0) {
            return false;
        }
        back();
        return true;
    }

    public char next() throws JSONException {
        if (this.f68495d) {
            this.f68495d = false;
            char c10 = this.f68494c;
            if (c10 != 0) {
                this.f68492a++;
            }
            return c10;
        }
        try {
            int i10 = this.f68493b.read();
            if (i10 <= 0) {
                this.f68494c = (char) 0;
                return (char) 0;
            }
            this.f68492a++;
            char c11 = (char) i10;
            this.f68494c = c11;
            return c11;
        } catch (IOException e5) {
            throw new JSONException(e5);
        }
    }

    public char nextClean() throws JSONException {
        char next;
        do {
            next = next();
            if (next == 0) {
                break;
            }
        } while (next <= ' ');
        return next;
    }

    public String nextString(char c10) throws JSONException {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            char next = next();
            if (next == 0 || next == '\n' || next == '\r') {
                break;
            }
            if (next == '\\') {
                char next2 = next();
                if (next2 == 'b') {
                    sb2.append('\b');
                } else if (next2 == 'f') {
                    sb2.append('\f');
                } else if (next2 == 'n') {
                    sb2.append('\n');
                } else if (next2 == 'r') {
                    sb2.append('\r');
                } else if (next2 == 'x') {
                    sb2.append((char) Integer.parseInt(next(2), 16));
                } else if (next2 == 't') {
                    sb2.append('\t');
                } else if (next2 != 'u') {
                    sb2.append(next2);
                } else {
                    sb2.append((char) Integer.parseInt(next(4), 16));
                }
            } else {
                if (next == c10) {
                    return sb2.toString();
                }
                sb2.append(next);
            }
        }
        throw syntaxError("Unterminated string");
    }

    public String nextTo(char c10) throws JSONException {
        char next;
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            next = next();
            if (next == c10 || next == 0 || next == '\n' || next == '\r') {
                break;
            }
            sb2.append(next);
        }
        if (next != 0) {
            back();
        }
        return sb2.toString().trim();
    }

    public Object nextValue() throws JSONException {
        char cNextClean = nextClean();
        if (cNextClean != '\"') {
            if (cNextClean != '[') {
                if (cNextClean == '{') {
                    back();
                    HashMap map = new HashMap();
                    if (nextClean() != '{') {
                        throw syntaxError("A JSONObject text must begin with '{'");
                    }
                    while (true) {
                        char cNextClean2 = nextClean();
                        if (cNextClean2 == 0) {
                            throw syntaxError("A JSONObject text must end with '}'");
                        }
                        if (cNextClean2 != '}') {
                            back();
                            String string = nextValue().toString();
                            char cNextClean3 = nextClean();
                            if (cNextClean3 == '=') {
                                if (next() != '>') {
                                    back();
                                }
                            } else if (cNextClean3 != ':') {
                                throw syntaxError("Expected a ':' after a key");
                            }
                            Object objNextValue = nextValue();
                            if (string != null) {
                                if (map.containsKey(string)) {
                                    throw new JSONException(h0.b("Duplicate key \"", string, "\""));
                                }
                                map.put(string, objNextValue);
                            }
                            char cNextClean4 = nextClean();
                            if (cNextClean4 == ',' || cNextClean4 == ';') {
                                if (nextClean() != '}') {
                                    back();
                                }
                            } else if (cNextClean4 != '}') {
                                throw syntaxError("Expected a ',' or '}'");
                            }
                        }
                        return map;
                    }
                }
                if (cNextClean != '\'') {
                    if (cNextClean != '(') {
                        StringBuilder sb2 = new StringBuilder();
                        while (cNextClean >= ' ' && ",:]}/\\\"[{;=#".indexOf(cNextClean) < 0) {
                            sb2.append(cNextClean);
                            cNextClean = next();
                        }
                        back();
                        String strTrim = sb2.toString().trim();
                        if (strTrim.equals("")) {
                            throw syntaxError("Missing value");
                        }
                        if (strTrim.equals("")) {
                            return strTrim;
                        }
                        if (strTrim.equalsIgnoreCase("true")) {
                            return Boolean.TRUE;
                        }
                        if (strTrim.equalsIgnoreCase("false")) {
                            return Boolean.FALSE;
                        }
                        if (strTrim.equalsIgnoreCase(AbstractJsonLexerKt.NULL)) {
                            return null;
                        }
                        for (int i10 = 0; i10 < strTrim.length(); i10++) {
                            char cCharAt = strTrim.charAt(i10);
                            if (!Character.isDigit(cCharAt) && cCharAt != '-' && cCharAt != '.' && cCharAt != '+' && cCharAt != 'e' && cCharAt != 'E') {
                                return strTrim;
                            }
                        }
                        return new JsonNumber(strTrim);
                    }
                }
            }
            back();
            return parseArray();
        }
        return nextString(cNextClean);
    }

    public List<Object> parseArray() {
        char c10;
        char cNextClean;
        ArrayList arrayList = new ArrayList();
        char cNextClean2 = nextClean();
        if (cNextClean2 == '[') {
            c10 = ']';
        } else {
            if (cNextClean2 != '(') {
                throw syntaxError("A JSONArray text must start with '['");
            }
            c10 = ')';
        }
        if (nextClean() == ']') {
            return arrayList;
        }
        back();
        while (true) {
            if (nextClean() == ',') {
                back();
                arrayList.add(null);
            } else {
                back();
                arrayList.add(nextValue());
            }
            cNextClean = nextClean();
            if (cNextClean != ')') {
                if (cNextClean != ',' && cNextClean != ';') {
                    if (cNextClean == ']') {
                        break;
                    }
                    throw syntaxError("Expected a ',' or ']'");
                }
                if (nextClean() == ']') {
                    return arrayList;
                }
                back();
            } else {
                break;
            }
        }
        if (c10 == cNextClean) {
            return arrayList;
        }
        throw syntaxError("Expected a '" + c10 + "'");
    }

    public char skipTo(char c10) throws JSONException {
        char next;
        Reader reader = this.f68493b;
        try {
            int i10 = this.f68492a;
            reader.mark(Integer.MAX_VALUE);
            do {
                next = next();
                if (next == 0) {
                    reader.reset();
                    this.f68492a = i10;
                    return next;
                }
            } while (next != c10);
            back();
            return next;
        } catch (IOException e5) {
            throw new JSONException(e5);
        }
    }

    public JSONException syntaxError(String str) {
        StringBuilder sbD = c.d(str);
        sbD.append(toString());
        return new JSONException(sbD.toString());
    }

    public String toString() {
        return " at character " + this.f68492a;
    }

    public JSONTokener(String str) {
        this(new StringReader(str));
    }

    public String nextTo(String str) throws JSONException {
        char next;
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            next = next();
            if (str.indexOf(next) >= 0 || next == 0 || next == '\n' || next == '\r') {
                break;
            }
            sb2.append(next);
        }
        if (next != 0) {
            back();
        }
        return sb2.toString().trim();
    }

    public char next(char c10) throws JSONException {
        char next = next();
        if (next == c10) {
            return next;
        }
        throw syntaxError("Expected '" + c10 + "' and instead saw '" + next + "'");
    }

    public String next(int i10) throws JSONException {
        if (i10 == 0) {
            return "";
        }
        char[] cArr = new char[i10];
        int i11 = 0;
        if (this.f68495d) {
            this.f68495d = false;
            cArr[0] = this.f68494c;
            i11 = 1;
        }
        while (i11 < i10) {
            try {
                int i12 = this.f68493b.read(cArr, i11, i10 - i11);
                if (i12 == -1) {
                    break;
                }
                i11 += i12;
            } catch (IOException e5) {
                throw new JSONException(e5);
            }
        }
        this.f68492a += i11;
        if (i11 >= i10) {
            this.f68494c = cArr[i10 - 1];
            return new String(cArr);
        }
        throw syntaxError("Substring bounds error");
    }
}
