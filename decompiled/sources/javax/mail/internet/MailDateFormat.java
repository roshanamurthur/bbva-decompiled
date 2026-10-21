package javax.mail.internet;

import ad.d;
import androidx.camera.camera2.internal.h0;
import androidx.camera.camera2.internal.n1;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.nulabinc.zxcvbn.Guess;
import com.sun.mail.util.MailLogger;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.logging.Level;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes12.dex */
public class MailDateFormat extends SimpleDateFormat {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final MailLogger f78977p0 = new MailLogger((Class<?>) MailDateFormat.class, "DEBUG", false, System.out);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final TimeZone f78978q0 = TimeZone.getTimeZone("UTC");

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ParsePosition f78980b;

        public a(String str, ParsePosition parsePosition) {
            this.f78979a = str;
            this.f78980b = parsePosition;
        }

        public final int a() {
            ParsePosition parsePosition = this.f78980b;
            int index = parsePosition.getIndex();
            String str = this.f78979a;
            if (index >= str.length()) {
                return -1;
            }
            char cCharAt = str.charAt(parsePosition.getIndex());
            parsePosition.setIndex(parsePosition.getIndex() + 1);
            return cCharAt;
        }

        public boolean b(int i10) {
            return i10 % 100 < 60;
        }

        public final Date c() {
            ParsePosition parsePosition = this.f78980b;
            int index = parsePosition.getIndex();
            try {
                return s();
            } catch (Exception e5) {
                if (MailDateFormat.f78977p0.isLoggable(Level.FINE)) {
                    MailDateFormat.f78977p0.log(Level.FINE, d.f(new StringBuilder("Bad date: '"), this.f78979a, "'"), (Throwable) e5);
                }
                parsePosition.setErrorIndex(parsePosition.getIndex());
                parsePosition.setIndex(index);
                return null;
            }
        }

        public final int d(int i10, int i11, boolean z10) throws java.text.ParseException {
            ParsePosition parsePosition;
            int iDigit;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                parsePosition = this.f78980b;
                if (i12 >= i11 || !k()) {
                    break;
                }
                int i14 = i13 * 10;
                int iA = a();
                if (48 > iA || iA > 57) {
                    if (iA != -1) {
                        parsePosition.setIndex(parsePosition.getIndex() - 1);
                    }
                    iDigit = -1;
                } else {
                    iDigit = Character.digit((char) iA, 10);
                }
                i13 = i14 + iDigit;
                i12++;
            }
            if (i12 >= i10 && (i12 != i11 || z10 || !k())) {
                return i13;
            }
            parsePosition.setIndex(parsePosition.getIndex() - i12);
            throw new java.text.ParseException(h0.b("Invalid input: expected ", i10 == i11 ? Integer.toString(i10) : n1.e("between ", i10, " and ", i11), " ASCII digits"), parsePosition.getIndex());
        }

        public final void e(char c10) throws java.text.ParseException {
            if (o(c10)) {
                return;
            }
            throw new java.text.ParseException("Invalid input: expected '" + c10 + "'", this.f78980b.getIndex());
        }

        public final void f() throws java.text.ParseException {
            if (!p()) {
                throw new java.text.ParseException("Invalid input: expected FWS", this.f78980b.getIndex());
            }
        }

        public void g() throws java.text.ParseException {
            f();
        }

        public void h() throws java.text.ParseException {
            f();
        }

        public int i() throws java.text.ParseException {
            return j();
        }

        public final int j() throws java.text.ParseException {
            int iA = a();
            ParsePosition parsePosition = this.f78980b;
            if (iA != 43 && iA != 45) {
                if (iA != -1) {
                    parsePosition.setIndex(parsePosition.getIndex() - 1);
                }
                throw new java.text.ParseException("Invalid zone", parsePosition.getIndex());
            }
            int iD = d(4, 4, true);
            if (b(iD)) {
                return ((iD % 100) + ((iD / 100) * 60)) * (iA != 43 ? 1 : -1);
            }
            parsePosition.setIndex(parsePosition.getIndex() - 5);
            throw new java.text.ParseException("Invalid zone", parsePosition.getIndex());
        }

        public final boolean k() {
            ParsePosition parsePosition = this.f78980b;
            int index = parsePosition.getIndex();
            String str = this.f78979a;
            return index < str.length() && '0' <= str.charAt(parsePosition.getIndex()) && str.charAt(parsePosition.getIndex()) <= '9';
        }

        public boolean l() {
            ParsePosition parsePosition = this.f78980b;
            int index = parsePosition.getIndex();
            String str = this.f78979a;
            return index < str.length() && (str.charAt(parsePosition.getIndex()) == ' ' || str.charAt(parsePosition.getIndex()) == '\t' || str.charAt(parsePosition.getIndex()) == '\r');
        }

        public final boolean m(char c10, char c11) {
            return o(c10) || o(c11);
        }

        public final boolean n(char c10, char c11, char c12, char c13) {
            if (!m(c10, c11)) {
                return false;
            }
            if (m(c12, c13)) {
                return true;
            }
            ParsePosition parsePosition = this.f78980b;
            parsePosition.setIndex(parsePosition.getIndex() - 1);
            return false;
        }

        public final boolean o(char c10) {
            ParsePosition parsePosition = this.f78980b;
            int index = parsePosition.getIndex();
            String str = this.f78979a;
            if (index >= str.length() || str.charAt(parsePosition.getIndex()) != c10) {
                return false;
            }
            parsePosition.setIndex(parsePosition.getIndex() + 1);
            return true;
        }

        public boolean p() {
            boolean zO = o(' ');
            ParsePosition parsePosition = this.f78980b;
            if (zO) {
                if (!l()) {
                    return true;
                }
                parsePosition.setIndex(parsePosition.getIndex() - 1);
            } else if (!l()) {
                return false;
            }
            int index = parsePosition.getIndex();
            if (r()) {
                while (q('\r', '\n')) {
                    if (!r()) {
                        parsePosition.setIndex(index);
                        return false;
                    }
                }
                return true;
            }
            if (q('\r', '\n') && r()) {
                return true;
            }
            parsePosition.setIndex(index);
            return false;
        }

        public final boolean q(char c10, char c11) {
            if (!o(c10)) {
                return false;
            }
            if (o(c11)) {
                return true;
            }
            ParsePosition parsePosition = this.f78980b;
            parsePosition.setIndex(parsePosition.getIndex() - 1);
            return false;
        }

        public final boolean r() {
            ParsePosition parsePosition = this.f78980b;
            int index = parsePosition.getIndex();
            while (m(' ', '\t')) {
            }
            return parsePosition.getIndex() > index;
        }

        public abstract Date s() throws java.text.ParseException;
    }

    public class b extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f78981d;

        @Override // javax.mail.internet.MailDateFormat.a
        public final boolean b(int i10) {
            return true;
        }

        @Override // javax.mail.internet.MailDateFormat.a
        public final void g() throws java.text.ParseException {
            p();
        }

        @Override // javax.mail.internet.MailDateFormat.a
        public final void h() throws java.text.ParseException {
            Boolean bool = this.f78981d;
            if (bool == null) {
                this.f78981d = Boolean.valueOf(!o('-'));
                p();
            } else if (bool.booleanValue()) {
                p();
            } else {
                e('-');
            }
        }

        @Override // javax.mail.internet.MailDateFormat.a
        public final int i() throws java.text.ParseException {
            int i10;
            String str = this.f78979a;
            ParsePosition parsePosition = this.f78980b;
            try {
                if (parsePosition.getIndex() >= str.length()) {
                    throw new java.text.ParseException("Missing zone", parsePosition.getIndex());
                }
                if ((parsePosition.getIndex() >= str.length() || str.charAt(parsePosition.getIndex()) != '+') && (parsePosition.getIndex() >= str.length() || str.charAt(parsePosition.getIndex()) != '-')) {
                    if (n(Matrix.MATRIX_TYPE_RANDOM_UT, AbstractJsonLexerKt.UNICODE_ESC, 'T', 't')) {
                        return 0;
                    }
                    if (n('G', 'g', 'M', 'm')) {
                        if (m('T', 't')) {
                            return 0;
                        }
                        parsePosition.setIndex(parsePosition.getIndex() - 2);
                    }
                    if (m('E', 'e')) {
                        i10 = 4;
                    } else if (m('C', 'c')) {
                        i10 = 5;
                    } else if (m('M', 'm')) {
                        i10 = 6;
                    } else {
                        if (!m('P', 'p')) {
                            throw new java.text.ParseException("Invalid zone", parsePosition.getIndex());
                        }
                        i10 = 7;
                    }
                    if (n('S', 's', 'T', 't')) {
                        i10++;
                    } else if (!n('D', 'd', 'T', 't')) {
                        parsePosition.setIndex(parsePosition.getIndex() - 1);
                        throw new java.text.ParseException("Invalid zone", parsePosition.getIndex());
                    }
                    return i10 * 60;
                }
                return j();
            } catch (java.text.ParseException e5) {
                MailLogger mailLogger = MailDateFormat.f78977p0;
                Level level = Level.FINE;
                if (mailLogger.isLoggable(level)) {
                    mailLogger.log(level, h0.b("No timezone? : '", str, "'"), (Throwable) e5);
                }
                return 0;
            }
        }

        @Override // javax.mail.internet.MailDateFormat.a
        public final boolean l() {
            if (!super.l()) {
                ParsePosition parsePosition = this.f78980b;
                int index = parsePosition.getIndex();
                String str = this.f78979a;
                if (index >= str.length() || str.charAt(parsePosition.getIndex()) != '\n') {
                    return false;
                }
            }
            return true;
        }

        @Override // javax.mail.internet.MailDateFormat.a
        public final boolean p() {
            char cCharAt;
            boolean zL = l();
            while (true) {
                ParsePosition parsePosition = this.f78980b;
                int index = parsePosition.getIndex();
                String str = this.f78979a;
                if (index >= str.length() || !((cCharAt = str.charAt(parsePosition.getIndex())) == '\t' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ')) {
                    break;
                }
                parsePosition.setIndex(parsePosition.getIndex() + 1);
            }
            return zL;
        }

        @Override // javax.mail.internet.MailDateFormat.c
        public final int t() throws java.text.ParseException {
            p();
            return d(1, 3, false);
        }

        @Override // javax.mail.internet.MailDateFormat.c
        public final int u() throws java.text.ParseException {
            return d(1, 2, false);
        }

        @Override // javax.mail.internet.MailDateFormat.c
        public final int v() throws java.text.ParseException {
            return d(1, 2, false);
        }

        @Override // javax.mail.internet.MailDateFormat.c
        public final int w() {
            while (true) {
                ParsePosition parsePosition = this.f78980b;
                if (parsePosition.getIndex() >= this.f78979a.length() || k()) {
                    return -1;
                }
                parsePosition.setIndex(parsePosition.getIndex() + 1);
            }
        }

        @Override // javax.mail.internet.MailDateFormat.c
        public final int x() throws java.text.ParseException {
            return d(1, 2, false);
        }

        @Override // javax.mail.internet.MailDateFormat.c
        public final int y() throws java.text.ParseException {
            int iD = d(1, 8, false);
            if (iD >= 1000) {
                return iD;
            }
            return iD >= 50 ? iD + ReturnCode.ERR_REPOSITORY : iD + Guess.REFERENCE_YEAR;
        }
    }

    public class c extends a {
        public c(String str, ParsePosition parsePosition) {
            super(str, parsePosition);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:114:0x018c  */
        /* JADX WARN: Code duplicated, block: B:117:0x01ac  */
        /* JADX WARN: Code duplicated, block: B:118:0x01b2  */
        /* JADX WARN: Code duplicated, block: B:14:0x003e  */
        /* JADX WARN: Code duplicated, block: B:21:0x004e  */
        /* JADX WARN: Code duplicated, block: B:28:0x0061  */
        /* JADX WARN: Code duplicated, block: B:34:0x0076  */
        /* JADX WARN: Code duplicated, block: B:40:0x008f  */
        /* JADX WARN: Code duplicated, block: B:45:0x009d  */
        /* JADX WARN: Code duplicated, block: B:47:0x00a3 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:59:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:72:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:74:0x00fe A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:86:0x0125  */
        /* JADX WARN: Code duplicated, block: B:87:0x0128  */
        /* JADX WARN: Code duplicated, block: B:93:0x013c  */
        /* JADX WARN: Code duplicated, block: B:99:0x014e  */
        @Override // javax.mail.internet.MailDateFormat.a
        public final Date s() throws java.text.ParseException {
            int i10;
            int i11;
            int iX;
            int iW = w();
            int iT = t();
            h();
            boolean z10 = !(this instanceof b);
            int iA = a();
            ParsePosition parsePosition = this.f78980b;
            switch (iA) {
                case -1:
                    throw new java.text.ParseException("Invalid month", parsePosition.getIndex());
                case 65:
                    if (q(AbstractJsonLexerKt.UNICODE_ESC, 'g') && (z10 || !n(AbstractJsonLexerKt.UNICODE_ESC, Matrix.MATRIX_TYPE_RANDOM_UT, 'g', 'G'))) {
                        if (q('p', 'r') || (!z10 && n('p', 'P', 'r', Matrix.MATRIX_TYPE_RANDOM_REGULAR))) {
                            i10 = 3;
                        }
                        parsePosition.setIndex(parsePosition.getIndex() - 1);
                        throw new java.text.ParseException("Invalid month", parsePosition.getIndex());
                    }
                    i10 = 7;
                    i11 = i10;
                    h();
                    int iY = y();
                    f();
                    int iU = u();
                    e(AbstractJsonLexerKt.COLON);
                    int iV = v();
                    if (o(AbstractJsonLexerKt.COLON)) {
                        iX = x();
                    } else {
                        iX = 0;
                    }
                    g();
                    try {
                        return MailDateFormat.a(MailDateFormat.this, iW, iT, i11, iY, iU, iV, iX, i());
                    } catch (IllegalArgumentException unused) {
                        throw new java.text.ParseException("Invalid input: some of the calendar fields have invalid values, or day-name is inconsistent with date", parsePosition.getIndex());
                    }
                case 68:
                    if (!q('e', 'c') || (!z10 && n('e', 'E', 'c', 'C'))) {
                        i10 = 11;
                        i11 = i10;
                        h();
                        int iY2 = y();
                        f();
                        int iU2 = u();
                        e(AbstractJsonLexerKt.COLON);
                        int iV2 = v();
                        if (o(AbstractJsonLexerKt.COLON)) {
                            iX = x();
                        } else {
                            iX = 0;
                        }
                        g();
                        return MailDateFormat.a(MailDateFormat.this, iW, iT, i11, iY2, iU2, iV2, iX, i());
                    }
                    parsePosition.setIndex(parsePosition.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", parsePosition.getIndex());
                case 70:
                    if (!q('e', 'b') || (!z10 && n('e', 'E', 'b', 'B'))) {
                        i11 = 1;
                        h();
                        int iY3 = y();
                        f();
                        int iU3 = u();
                        e(AbstractJsonLexerKt.COLON);
                        int iV3 = v();
                        if (o(AbstractJsonLexerKt.COLON)) {
                            iX = x();
                        } else {
                            iX = 0;
                        }
                        g();
                        return MailDateFormat.a(MailDateFormat.this, iW, iT, i11, iY3, iU3, iV3, iX, i());
                    }
                    parsePosition.setIndex(parsePosition.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", parsePosition.getIndex());
                case 74:
                    if (!o(AbstractJsonLexerKt.UNICODE_ESC) || (!z10 && o(Matrix.MATRIX_TYPE_RANDOM_UT))) {
                        if (!o('l') || (!z10 && o(Matrix.MATRIX_TYPE_RANDOM_LT))) {
                            i10 = 6;
                        } else if (o('n') || (!z10 && o('N'))) {
                            i10 = 5;
                        } else {
                            parsePosition.setIndex(parsePosition.getIndex() - 1);
                        }
                        i11 = i10;
                        h();
                        int iY4 = y();
                        f();
                        int iU4 = u();
                        e(AbstractJsonLexerKt.COLON);
                        int iV4 = v();
                        if (o(AbstractJsonLexerKt.COLON)) {
                            iX = x();
                        } else {
                            iX = 0;
                        }
                        g();
                        return MailDateFormat.a(MailDateFormat.this, iW, iT, i11, iY4, iU4, iV4, iX, i());
                    }
                    if (q('a', 'n') || (!z10 && n('a', 'A', 'n', 'N'))) {
                        i11 = 0;
                        h();
                        int iY5 = y();
                        f();
                        int iU5 = u();
                        e(AbstractJsonLexerKt.COLON);
                        int iV5 = v();
                        if (o(AbstractJsonLexerKt.COLON)) {
                            iX = x();
                        } else {
                            iX = 0;
                        }
                        g();
                        return MailDateFormat.a(MailDateFormat.this, iW, iT, i11, iY5, iU5, iV5, iX, i());
                    }
                    parsePosition.setIndex(parsePosition.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", parsePosition.getIndex());
                case 77:
                    if (o('a') || (!z10 && o('A'))) {
                        if (!o('r') || (!z10 && o(Matrix.MATRIX_TYPE_RANDOM_REGULAR))) {
                            i10 = 2;
                        } else if (o('y') || (!z10 && o('Y'))) {
                            i10 = 4;
                        } else {
                            parsePosition.setIndex(parsePosition.getIndex() - 1);
                        }
                        i11 = i10;
                        h();
                        int iY6 = y();
                        f();
                        int iU6 = u();
                        e(AbstractJsonLexerKt.COLON);
                        int iV6 = v();
                        if (o(AbstractJsonLexerKt.COLON)) {
                            iX = x();
                        } else {
                            iX = 0;
                        }
                        g();
                        return MailDateFormat.a(MailDateFormat.this, iW, iT, i11, iY6, iU6, iV6, iX, i());
                    }
                    parsePosition.setIndex(parsePosition.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", parsePosition.getIndex());
                case 78:
                    if (!q('o', 'v') || (!z10 && n('o', 'O', 'v', 'V'))) {
                        i10 = 10;
                        i11 = i10;
                        h();
                        int iY7 = y();
                        f();
                        int iU7 = u();
                        e(AbstractJsonLexerKt.COLON);
                        int iV7 = v();
                        if (o(AbstractJsonLexerKt.COLON)) {
                            iX = x();
                        } else {
                            iX = 0;
                        }
                        g();
                        return MailDateFormat.a(MailDateFormat.this, iW, iT, i11, iY7, iU7, iV7, iX, i());
                    }
                    parsePosition.setIndex(parsePosition.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", parsePosition.getIndex());
                case 79:
                    if (!q('c', 't') || (!z10 && n('c', 'C', 't', 'T'))) {
                        i10 = 9;
                        i11 = i10;
                        h();
                        int iY8 = y();
                        f();
                        int iU8 = u();
                        e(AbstractJsonLexerKt.COLON);
                        int iV8 = v();
                        if (o(AbstractJsonLexerKt.COLON)) {
                            iX = x();
                        } else {
                            iX = 0;
                        }
                        g();
                        return MailDateFormat.a(MailDateFormat.this, iW, iT, i11, iY8, iU8, iV8, iX, i());
                    }
                    parsePosition.setIndex(parsePosition.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", parsePosition.getIndex());
                case 83:
                    if (!q('e', 'p') || (!z10 && n('e', 'E', 'p', 'P'))) {
                        i10 = 8;
                        i11 = i10;
                        h();
                        int iY9 = y();
                        f();
                        int iU9 = u();
                        e(AbstractJsonLexerKt.COLON);
                        int iV9 = v();
                        if (o(AbstractJsonLexerKt.COLON)) {
                            iX = x();
                        } else {
                            iX = 0;
                        }
                        g();
                        return MailDateFormat.a(MailDateFormat.this, iW, iT, i11, iY9, iU9, iV9, iX, i());
                    }
                    parsePosition.setIndex(parsePosition.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", parsePosition.getIndex());
                case 97:
                    if (!z10) {
                        if (q(AbstractJsonLexerKt.UNICODE_ESC, 'g')) {
                            i10 = 7;
                        } else {
                            i10 = 7;
                        }
                        i11 = i10;
                        h();
                        int iY10 = y();
                        f();
                        int iU10 = u();
                        e(AbstractJsonLexerKt.COLON);
                        int iV10 = v();
                        if (o(AbstractJsonLexerKt.COLON)) {
                            iX = x();
                        } else {
                            iX = 0;
                        }
                        g();
                        return MailDateFormat.a(MailDateFormat.this, iW, iT, i11, iY10, iU10, iV10, iX, i());
                    }
                    parsePosition.setIndex(parsePosition.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", parsePosition.getIndex());
                case 100:
                    if (!z10) {
                        if (!q('e', 'c')) {
                            break;
                        }
                        i10 = 11;
                        i11 = i10;
                        h();
                        int iY11 = y();
                        f();
                        int iU11 = u();
                        e(AbstractJsonLexerKt.COLON);
                        int iV11 = v();
                        if (o(AbstractJsonLexerKt.COLON)) {
                            iX = x();
                        } else {
                            iX = 0;
                        }
                        g();
                        return MailDateFormat.a(MailDateFormat.this, iW, iT, i11, iY11, iU11, iV11, iX, i());
                    }
                    parsePosition.setIndex(parsePosition.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", parsePosition.getIndex());
                case 102:
                    if (!z10) {
                        if (!q('e', 'b')) {
                            break;
                        }
                        i11 = 1;
                        h();
                        int iY12 = y();
                        f();
                        int iU12 = u();
                        e(AbstractJsonLexerKt.COLON);
                        int iV12 = v();
                        if (o(AbstractJsonLexerKt.COLON)) {
                            iX = x();
                        } else {
                            iX = 0;
                        }
                        g();
                        return MailDateFormat.a(MailDateFormat.this, iW, iT, i11, iY12, iU12, iV12, iX, i());
                    }
                    parsePosition.setIndex(parsePosition.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", parsePosition.getIndex());
                case 106:
                    if (!z10) {
                        if (o(AbstractJsonLexerKt.UNICODE_ESC)) {
                            if (o('l')) {
                                i10 = 6;
                            } else {
                                i10 = 6;
                            }
                            i11 = i10;
                        } else {
                            if (o('l')) {
                                i10 = 6;
                            } else {
                                i10 = 6;
                            }
                            i11 = i10;
                        }
                        h();
                        int iY13 = y();
                        f();
                        int iU13 = u();
                        e(AbstractJsonLexerKt.COLON);
                        int iV13 = v();
                        if (o(AbstractJsonLexerKt.COLON)) {
                            iX = x();
                        } else {
                            iX = 0;
                        }
                        g();
                        return MailDateFormat.a(MailDateFormat.this, iW, iT, i11, iY13, iU13, iV13, iX, i());
                    }
                    parsePosition.setIndex(parsePosition.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", parsePosition.getIndex());
                case 109:
                    if (!z10) {
                        if (o('a')) {
                            if (o('r')) {
                                i10 = 2;
                            } else {
                                i10 = 2;
                            }
                            i11 = i10;
                        } else {
                            if (o('r')) {
                                i10 = 2;
                            } else {
                                i10 = 2;
                            }
                            i11 = i10;
                        }
                        h();
                        int iY14 = y();
                        f();
                        int iU14 = u();
                        e(AbstractJsonLexerKt.COLON);
                        int iV14 = v();
                        if (o(AbstractJsonLexerKt.COLON)) {
                            iX = x();
                        } else {
                            iX = 0;
                        }
                        g();
                        return MailDateFormat.a(MailDateFormat.this, iW, iT, i11, iY14, iU14, iV14, iX, i());
                    }
                    parsePosition.setIndex(parsePosition.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", parsePosition.getIndex());
                case 110:
                    if (!z10) {
                        if (!q('o', 'v')) {
                            break;
                        }
                        i10 = 10;
                        i11 = i10;
                        h();
                        int iY15 = y();
                        f();
                        int iU15 = u();
                        e(AbstractJsonLexerKt.COLON);
                        int iV15 = v();
                        if (o(AbstractJsonLexerKt.COLON)) {
                            iX = x();
                        } else {
                            iX = 0;
                        }
                        g();
                        return MailDateFormat.a(MailDateFormat.this, iW, iT, i11, iY15, iU15, iV15, iX, i());
                    }
                    parsePosition.setIndex(parsePosition.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", parsePosition.getIndex());
                case 111:
                    if (!z10) {
                        if (!q('c', 't')) {
                            break;
                        }
                        i10 = 9;
                        i11 = i10;
                        h();
                        int iY16 = y();
                        f();
                        int iU16 = u();
                        e(AbstractJsonLexerKt.COLON);
                        int iV16 = v();
                        if (o(AbstractJsonLexerKt.COLON)) {
                            iX = x();
                        } else {
                            iX = 0;
                        }
                        g();
                        return MailDateFormat.a(MailDateFormat.this, iW, iT, i11, iY16, iU16, iV16, iX, i());
                    }
                    parsePosition.setIndex(parsePosition.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", parsePosition.getIndex());
                case 115:
                    if (!z10) {
                        if (!q('e', 'p')) {
                            break;
                        }
                        i10 = 8;
                        i11 = i10;
                        h();
                        int iY17 = y();
                        f();
                        int iU17 = u();
                        e(AbstractJsonLexerKt.COLON);
                        int iV17 = v();
                        if (o(AbstractJsonLexerKt.COLON)) {
                            iX = x();
                        } else {
                            iX = 0;
                        }
                        g();
                        return MailDateFormat.a(MailDateFormat.this, iW, iT, i11, iY17, iU17, iV17, iX, i());
                    }
                    parsePosition.setIndex(parsePosition.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", parsePosition.getIndex());
                default:
                    parsePosition.setIndex(parsePosition.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", parsePosition.getIndex());
            }
        }

        public int t() throws java.text.ParseException {
            p();
            return d(1, 2, false);
        }

        public int u() throws java.text.ParseException {
            return d(2, 2, false);
        }

        public int v() throws java.text.ParseException {
            return d(2, 2, false);
        }

        public int w() throws java.text.ParseException {
            int i10;
            int i11 = -1;
            if (!k()) {
                p();
                int iA = a();
                ParsePosition parsePosition = this.f78980b;
                if (iA == -1) {
                    throw new java.text.ParseException("Invalid day-name", parsePosition.getIndex());
                }
                if (iA == 70) {
                    if (q('r', 'i')) {
                        i10 = 6;
                        i11 = i10;
                    }
                    parsePosition.setIndex(parsePosition.getIndex() - 1);
                    throw new java.text.ParseException("Invalid day-name", parsePosition.getIndex());
                }
                if (iA == 77) {
                    if (q('o', 'n')) {
                        i10 = 2;
                        i11 = i10;
                    }
                    parsePosition.setIndex(parsePosition.getIndex() - 1);
                    throw new java.text.ParseException("Invalid day-name", parsePosition.getIndex());
                }
                if (iA == 87) {
                    if (q('e', 'd')) {
                        i10 = 4;
                        i11 = i10;
                    }
                    parsePosition.setIndex(parsePosition.getIndex() - 1);
                    throw new java.text.ParseException("Invalid day-name", parsePosition.getIndex());
                }
                if (iA != 83) {
                    if (iA == 84) {
                        if (q(AbstractJsonLexerKt.UNICODE_ESC, 'e')) {
                            i10 = 3;
                        } else if (q('h', AbstractJsonLexerKt.UNICODE_ESC)) {
                            i10 = 5;
                        }
                        i11 = i10;
                    }
                    parsePosition.setIndex(parsePosition.getIndex() - 1);
                    throw new java.text.ParseException("Invalid day-name", parsePosition.getIndex());
                }
                if (!q(AbstractJsonLexerKt.UNICODE_ESC, 'n')) {
                    if (q('a', 't')) {
                        i10 = 7;
                        i11 = i10;
                    }
                    parsePosition.setIndex(parsePosition.getIndex() - 1);
                    throw new java.text.ParseException("Invalid day-name", parsePosition.getIndex());
                }
                i11 = 1;
                e(AbstractJsonLexerKt.COMMA);
            }
            return i11;
        }

        public int x() throws java.text.ParseException {
            return d(2, 2, false);
        }

        public int y() throws java.text.ParseException {
            int iD = d(4, 8, false);
            if (iD >= 1900) {
                return iD;
            }
            ParsePosition parsePosition = this.f78980b;
            parsePosition.setIndex(parsePosition.getIndex() - 4);
            while (this.f78979a.charAt(parsePosition.getIndex() - 1) == '0') {
                parsePosition.setIndex(parsePosition.getIndex() - 1);
            }
            throw new java.text.ParseException("Invalid year", parsePosition.getIndex());
        }
    }

    public MailDateFormat() {
        super("EEE, d MMM yyyy HH:mm:ss Z (z)", Locale.US);
    }

    public static Date a(MailDateFormat mailDateFormat, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        mailDateFormat.getClass();
        if (i16 == 60) {
            i16 = 59;
        }
        int i18 = i16;
        TimeZone timeZone = ((SimpleDateFormat) mailDateFormat).calendar.getTimeZone();
        try {
            ((SimpleDateFormat) mailDateFormat).calendar.setTimeZone(f78978q0);
            ((SimpleDateFormat) mailDateFormat).calendar.clear();
            ((SimpleDateFormat) mailDateFormat).calendar.set(i13, i12, i11, i14, i15, i18);
            if (i10 != -1 && i10 != ((SimpleDateFormat) mailDateFormat).calendar.get(7)) {
                throw new IllegalArgumentException("Inconsistent day-name");
            }
            ((SimpleDateFormat) mailDateFormat).calendar.add(12, i17);
            Date time = ((SimpleDateFormat) mailDateFormat).calendar.getTime();
            ((SimpleDateFormat) mailDateFormat).calendar.setTimeZone(timeZone);
            return time;
        } catch (Throwable th2) {
            ((SimpleDateFormat) mailDateFormat).calendar.setTimeZone(timeZone);
            throw th2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        super.applyPattern("EEE, d MMM yyyy HH:mm:ss Z (z)");
    }

    private Object writeReplace() throws ObjectStreamException {
        MailDateFormat mailDateFormat = new MailDateFormat();
        super.applyPattern("EEE, d MMM yyyy HH:mm:ss 'XXXXX' (z)");
        mailDateFormat.setTimeZone(getTimeZone());
        return mailDateFormat;
    }

    @Override // java.text.SimpleDateFormat
    public void applyLocalizedPattern(String str) {
        throw new UnsupportedOperationException("Method applyLocalizedPattern() shouldn't be called");
    }

    @Override // java.text.SimpleDateFormat
    public void applyPattern(String str) {
        throw new UnsupportedOperationException("Method applyPattern() shouldn't be called");
    }

    @Override // java.text.SimpleDateFormat, java.text.DateFormat
    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return super.format(date, stringBuffer, fieldPosition);
    }

    @Override // java.text.SimpleDateFormat
    public Date get2DigitYearStart() {
        throw new UnsupportedOperationException("Method get2DigitYearStart() shouldn't be called");
    }

    @Override // java.text.SimpleDateFormat, java.text.DateFormat
    public Date parse(String str, ParsePosition parsePosition) {
        if (str == null || parsePosition == null) {
            throw null;
        }
        if (parsePosition.getIndex() < 0 || parsePosition.getIndex() >= str.length()) {
            return null;
        }
        return isLenient() ? new b(str, parsePosition).c() : new c(str, parsePosition).c();
    }

    @Override // java.text.SimpleDateFormat
    public void set2DigitYearStart(Date date) {
        throw new UnsupportedOperationException("Method set2DigitYearStart() shouldn't be called");
    }

    @Override // java.text.DateFormat
    public void setCalendar(Calendar calendar) {
        throw new UnsupportedOperationException("Method setCalendar() shouldn't be called");
    }

    @Override // java.text.SimpleDateFormat
    public void setDateFormatSymbols(DateFormatSymbols dateFormatSymbols) {
        throw new UnsupportedOperationException("Method setDateFormatSymbols() shouldn't be called");
    }

    @Override // java.text.DateFormat
    public void setNumberFormat(NumberFormat numberFormat) {
        throw new UnsupportedOperationException("Method setNumberFormat() shouldn't be called");
    }

    @Override // java.text.SimpleDateFormat, java.text.DateFormat, java.text.Format
    public MailDateFormat clone() {
        return (MailDateFormat) super.clone();
    }
}
