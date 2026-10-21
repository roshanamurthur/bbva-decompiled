package com.bea.xml.stream;

import androidx.compose.animation.core.AnimationKt;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bea.xml.stream.events.DTDEvent;
import com.bea.xml.stream.reader.XmlReader;
import com.bea.xml.stream.util.ElementTypeNames;
import com.bea.xml.stream.util.EmptyIterator;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.wutka.dtd.DTD;
import com.wutka.dtd.DTDAttlist;
import com.wutka.dtd.DTDAttribute;
import com.wutka.dtd.DTDEntity;
import com.wutka.dtd.DTDNotation;
import com.wutka.dtd.DTDParser;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import javax.xml.XMLConstants;
import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import javax.xml.stream.Location;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.EntityDeclaration;
import javax.xml.stream.events.NotationDeclaration;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class MXParser implements XMLStreamReader, Location {
    protected static final char CHAR_UTF8_BOM = 65279;
    protected static final char[] ENCODING;
    protected static final String FEATURE_NAMES_INTERNED = "http://xmlpull.org/v1/doc/features.html#names-interned";
    public static final String FEATURE_PROCESS_DOCDECL = "http://xmlpull.org/v1/doc/features.html#process-docdecl";
    public static final String FEATURE_PROCESS_NAMESPACES = "http://xmlpull.org/v1/doc/features.html#process-namespaces";
    public static final String FEATURE_STAX_ENTITIES = "javax.xml.stream.entities";
    public static final String FEATURE_STAX_NOTATIONS = "javax.xml.stream.notations";
    protected static final String FEATURE_XML_ROUNDTRIP = "http://xmlpull.org/v1/doc/features.html#xml-roundtrip";
    protected static final int LOOKUP_MAX = 1024;
    protected static final char LOOKUP_MAX_CHAR = 1024;
    protected static final int MAX_UNICODE_CHAR = 1114111;
    protected static final char[] NO;
    protected static final int READ_CHUNK_SIZE = 8192;
    protected static final char[] STANDALONE;
    protected static final char[] VERSION;
    protected static final char[] YES;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f37815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f37816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static /* synthetic */ Class f37817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static /* synthetic */ Class f37818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static /* synthetic */ Class f37819g;
    protected boolean allStringsInterned;
    protected int attributeCount;
    protected String[] attributeName;
    protected int[] attributeNameHash;
    protected String[] attributePrefix;
    protected String[] attributeUri;
    protected String[] attributeValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConfigurationContextBase f37821b;
    protected char[] buf;
    protected int bufAbsoluteStart;
    protected int bufEnd;
    protected int bufLoadFactor;
    protected int bufSoftLimit;
    protected int bufStart;
    protected String charEncodingScheme;
    protected char[] charRefOneCharBuf;
    protected char[] charRefTwoCharBuf;
    protected int columnNumber;
    protected HashMap defaultAttributes;
    protected int depth;
    protected String[] elName;
    protected int[] elNamespaceCount;
    protected String[] elPrefix;
    protected char[][] elRawName;
    protected int[] elRawNameEnd;
    protected String[] elUri;
    protected boolean emptyElementTag;
    protected int entityEnd;
    protected String[] entityName;
    protected char[][] entityNameBuf;
    protected int[] entityNameHash;
    protected String entityRefName;
    protected String[] entityReplacement;
    protected char[][] entityReplacementBuf;
    protected char[] entityValue;
    protected int eventType;
    protected String inputEncoding;
    protected int lineNumber;
    protected int localNamespaceEnd;
    protected String[] localNamespacePrefix;
    protected int[] localNamespacePrefixHash;
    protected String[] localNamespaceUri;
    protected DTD mDtdIntSubset;
    protected int namespaceEnd;
    protected String[] namespacePrefix;
    protected int[] namespacePrefixHash;
    protected String[] namespaceUri;
    protected boolean pastEndTag;

    /* JADX INFO: renamed from: pc, reason: collision with root package name */
    protected char[] f37822pc;
    protected int pcEnd;
    protected int pcStart;
    protected String piData;
    protected String piTarget;
    protected int pos;
    protected int posEnd;
    protected int posStart;
    protected boolean reachedEnd;
    protected Reader reader;
    protected boolean seenAmpersand;
    protected boolean seenDocdecl;
    protected boolean seenEndTag;
    protected boolean seenMarkup;
    protected boolean seenRoot;
    protected boolean seenStartTag;
    protected String text;
    protected boolean tokenize;
    protected boolean usePC;
    public static final String[] TYPES = {"[UNKNOWN]", "START_ELEMENT", "END_ELEMENT", "PROCESSING_INSTRUCTION", "CHARACTERS", "COMMENT", "SPACE", "START_DOCUMENT", "END_DOCUMENT", "ENTITY_REFERENCE", "ATTRIBUTE", "DTD", "CDATA", "NAMESPACE", "NOTATION_DECLARATION", "ENTITY_DECLARATION"};
    public static final String NO_NAMESPACE = null;
    protected static boolean[] lookupNameStartChar = new boolean[1024];
    protected static boolean[] lookupNameChar = new boolean[1024];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f37820a = false;
    protected boolean processNamespaces = true;
    protected boolean roundtripSupported = true;
    protected String xmlVersion = null;
    protected boolean standalone = false;
    protected boolean standaloneSet = false;

    static {
        g(AbstractJsonLexerKt.COLON);
        for (char c10 = 'A'; c10 <= 'Z'; c10 = (char) (c10 + 1)) {
            g(c10);
        }
        g('_');
        for (char c11 = 'a'; c11 <= 'z'; c11 = (char) (c11 + 1)) {
            g(c11);
        }
        for (char c12 = 192; c12 <= 767; c12 = (char) (c12 + 1)) {
            g(c12);
        }
        for (char c13 = 880; c13 <= 893; c13 = (char) (c13 + 1)) {
            g(c13);
        }
        for (char c14 = 895; c14 < 1024; c14 = (char) (c14 + 1)) {
            g(c14);
        }
        f('-');
        f('.');
        for (char c15 = '0'; c15 <= '9'; c15 = (char) (c15 + 1)) {
            f(c15);
        }
        f(Typography.middleDot);
        for (char c16 = 768; c16 <= 879; c16 = (char) (c16 + 1)) {
            f(c16);
        }
        f37815c = new String[0];
        f37816d = new char[0];
        VERSION = new char[]{'v', 'e', 'r', 's', 'i', 'o', 'n'};
        ENCODING = new char[]{'e', 'n', 'c', 'o', 'd', 'i', 'n', 'g'};
        STANDALONE = new char[]{'s', 't', 'a', 'n', 'd', 'a', 'l', 'o', 'n', 'e'};
        YES = new char[]{'y', 'e', 's'};
        NO = new char[]{'n', 'o'};
    }

    public MXParser() {
        String[] strArr = f37815c;
        this.namespacePrefix = strArr;
        this.namespaceUri = strArr;
        this.bufLoadFactor = 95;
        char[] cArr = new char[Runtime.getRuntime().freeMemory() > AnimationKt.MillisToNanos ? 8192 : 256];
        this.buf = cArr;
        this.bufSoftLimit = (this.bufLoadFactor * cArr.length) / 100;
        this.f37822pc = new char[Runtime.getRuntime().freeMemory() <= AnimationKt.MillisToNanos ? 64 : 8192];
        this.entityValue = null;
        this.charRefOneCharBuf = new char[1];
        this.charRefTwoCharBuf = null;
    }

    public static /* synthetic */ Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e5) {
            throw new NoClassDefFoundError(e5.getMessage());
        }
    }

    public static String c(int i10) {
        if (i10 >= 0) {
            String[] strArr = TYPES;
            if (i10 < strArr.length) {
                return strArr[i10];
            }
        }
        return "[UNKNOWN]";
    }

    public static boolean d(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final void f(char c10) {
        lookupNameChar[c10] = true;
    }

    public static final int fastHash(char[] cArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = (cArr[i10] << 7) + cArr[(i10 + i11) - 1];
        if (i11 > 16) {
            i12 = (i12 << 7) + cArr[(i11 / 4) + i10];
        }
        return i11 > 8 ? (i12 << 7) + cArr[(i11 / 2) + i10] : i12;
    }

    public static final void g(char c10) {
        lookupNameStartChar[c10] = true;
        f(c10);
    }

    public final void a() {
        int i10 = this.eventType;
        if (i10 == 4 || i10 == 12 || i10 == 5 || i10 == 6) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer("getTextXxx methods cannot be called for ");
        stringBuffer.append(c(this.eventType));
        throw new IllegalStateException(stringBuffer.toString());
    }

    public void addDefaultAttributes(String str) throws XMLStreamException {
        HashMap map = this.defaultAttributes;
        if (map == null) {
            return;
        }
        DTDAttlist dTDAttlist = (DTDAttlist) map.get(str);
        if (str == null || dTDAttlist == null) {
            return;
        }
        for (DTDAttribute dTDAttribute : dTDAttlist.getAttribute()) {
            if (dTDAttribute.getDefaultValue() != null) {
                int i10 = this.attributeCount;
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        int i12 = this.attributeCount + 1;
                        this.attributeCount = i12;
                        ensureAttributesCapacity(i12);
                        String[] strArr = this.attributePrefix;
                        int i13 = this.attributeCount;
                        strArr[i13 - 1] = null;
                        this.attributeUri[i13 - 1] = NO_NAMESPACE;
                        this.attributeName[i13 - 1] = dTDAttribute.getName();
                        this.attributeValue[this.attributeCount - 1] = dTDAttribute.getDefaultValue();
                        break;
                    }
                    if (this.attributeName[i11].equals(dTDAttribute.getName())) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
    }

    public void checkCharValidity(int i10, boolean z10) throws XMLStreamException {
        if (i10 < 32) {
            if (isS((char) i10)) {
                return;
            }
            StringBuffer stringBuffer = new StringBuffer("Illegal white space character (code 0x");
            stringBuffer.append(Integer.toHexString(i10));
            stringBuffer.append(")");
            throw new XMLStreamException(stringBuffer.toString());
        }
        if (i10 >= 55296) {
            if (i10 <= 57343) {
                if (z10) {
                    return;
                }
                StringBuffer stringBuffer2 = new StringBuffer("Illegal character (code 0x");
                stringBuffer2.append(Integer.toHexString(i10));
                stringBuffer2.append("): surrogate characters are not valid XML characters");
                throw new XMLStreamException(stringBuffer2.toString(), getLocation());
            }
            if (i10 <= MAX_UNICODE_CHAR) {
                return;
            }
            StringBuffer stringBuffer3 = new StringBuffer("Illegal character (code 0x");
            stringBuffer3.append(Integer.toHexString(i10));
            stringBuffer3.append("), past max. Unicode character 0x");
            stringBuffer3.append(Integer.toHexString(MAX_UNICODE_CHAR));
            throw new XMLStreamException(stringBuffer3.toString(), getLocation());
        }
    }

    public boolean checkForXMLDecl() throws XMLStreamException {
        try {
            BufferedReader bufferedReader = new BufferedReader(this.reader, 7);
            this.reader = bufferedReader;
            bufferedReader.mark(7);
            int i10 = bufferedReader.read();
            if (i10 == 65279) {
                bufferedReader.mark(7);
                i10 = bufferedReader.read();
            }
            if (i10 == 60 && bufferedReader.read() == 63 && bufferedReader.read() == 120 && bufferedReader.read() == 109 && bufferedReader.read() == 108) {
                bufferedReader.reset();
                return true;
            }
            bufferedReader.reset();
            return false;
        } catch (IOException e5) {
            throw new XMLStreamException(e5);
        }
    }

    public void defineEntityReplacementText(String str, String str2) throws XMLStreamException {
        ensureEntityCapacity();
        char[] charArray = str.toCharArray();
        this.entityName[this.entityEnd] = newString(charArray, 0, str.length());
        char[][] cArr = this.entityNameBuf;
        int i10 = this.entityEnd;
        cArr[i10] = charArray;
        this.entityReplacement[i10] = str2;
        char[] charArray2 = str2 == null ? f37816d : str2.toCharArray();
        char[][] cArr2 = this.entityReplacementBuf;
        int i11 = this.entityEnd;
        cArr2[i11] = charArray2;
        if (!this.allStringsInterned) {
            int[] iArr = this.entityNameHash;
            char[] cArr3 = this.entityNameBuf[i11];
            iArr[i11] = fastHash(cArr3, 0, cArr3.length);
        }
        this.entityEnd++;
    }

    public final void e() {
        this.lineNumber = 1;
        this.columnNumber = 0;
        this.seenRoot = false;
        this.reachedEnd = false;
        this.eventType = 7;
        this.emptyElementTag = false;
        this.depth = 0;
        this.attributeCount = 0;
        this.namespaceEnd = 0;
        this.localNamespaceEnd = 0;
        this.entityEnd = 0;
        this.reader = null;
        this.inputEncoding = null;
        this.bufAbsoluteStart = 0;
        this.bufStart = 0;
        this.bufEnd = 0;
        this.posEnd = 0;
        this.posStart = 0;
        this.pos = 0;
        this.pcStart = 0;
        this.pcEnd = 0;
        this.usePC = false;
        this.seenStartTag = false;
        this.seenEndTag = false;
        this.pastEndTag = false;
        this.seenAmpersand = false;
        this.seenMarkup = false;
        this.seenDocdecl = false;
        resetStringCache();
    }

    public void ensureAttributesCapacity(int i10) {
        String[] strArr = this.attributeName;
        int length = strArr != null ? strArr.length : 0;
        if (i10 >= length) {
            int i11 = i10 > 7 ? i10 * 2 : 8;
            boolean z10 = length > 0;
            String[] strArr2 = new String[i11];
            if (z10) {
                System.arraycopy(strArr, 0, strArr2, 0, length);
            }
            this.attributeName = strArr2;
            String[] strArr3 = new String[i11];
            if (z10) {
                System.arraycopy(this.attributePrefix, 0, strArr3, 0, length);
            }
            this.attributePrefix = strArr3;
            String[] strArr4 = new String[i11];
            if (z10) {
                System.arraycopy(this.attributeUri, 0, strArr4, 0, length);
            }
            this.attributeUri = strArr4;
            String[] strArr5 = new String[i11];
            if (z10) {
                System.arraycopy(this.attributeValue, 0, strArr5, 0, length);
            }
            this.attributeValue = strArr5;
            if (this.allStringsInterned) {
                return;
            }
            int[] iArr = new int[i11];
            if (z10) {
                System.arraycopy(this.attributeNameHash, 0, iArr, 0, length);
            }
            this.attributeNameHash = iArr;
        }
    }

    public void ensureElementsCapacity() {
        String[] strArr = this.elName;
        int length = strArr != null ? strArr.length : 0;
        int i10 = this.depth;
        if (i10 + 1 >= length) {
            int i11 = (i10 >= 7 ? i10 * 2 : 8) + 2;
            boolean z10 = length > 0;
            String[] strArr2 = new String[i11];
            if (z10) {
                System.arraycopy(strArr, 0, strArr2, 0, length);
            }
            this.elName = strArr2;
            String[] strArr3 = new String[i11];
            if (z10) {
                System.arraycopy(this.elPrefix, 0, strArr3, 0, length);
            }
            this.elPrefix = strArr3;
            String[] strArr4 = new String[i11];
            if (z10) {
                System.arraycopy(this.elUri, 0, strArr4, 0, length);
            }
            this.elUri = strArr4;
            int[] iArr = new int[i11];
            if (z10) {
                System.arraycopy(this.elNamespaceCount, 0, iArr, 0, length);
            } else {
                iArr[0] = 0;
            }
            this.elNamespaceCount = iArr;
            int[] iArr2 = new int[i11];
            if (z10) {
                System.arraycopy(this.elRawNameEnd, 0, iArr2, 0, length);
            }
            this.elRawNameEnd = iArr2;
            char[][] cArr = new char[i11][];
            if (z10) {
                System.arraycopy(this.elRawName, 0, cArr, 0, length);
            }
            this.elRawName = cArr;
        }
    }

    public void ensureEntityCapacity() {
        char[][] cArr = this.entityReplacementBuf;
        int length = cArr != null ? cArr.length : 0;
        int i10 = this.entityEnd;
        if (i10 >= length) {
            int i11 = i10 > 7 ? i10 * 2 : 8;
            String[] strArr = new String[i11];
            char[][] cArr2 = new char[i11][];
            String[] strArr2 = new String[i11];
            char[][] cArr3 = new char[i11][];
            String[] strArr3 = this.entityName;
            if (strArr3 != null) {
                System.arraycopy(strArr3, 0, strArr, 0, i10);
                System.arraycopy(this.entityNameBuf, 0, cArr2, 0, this.entityEnd);
                System.arraycopy(this.entityReplacement, 0, strArr2, 0, this.entityEnd);
                System.arraycopy(this.entityReplacementBuf, 0, cArr3, 0, this.entityEnd);
            }
            this.entityName = strArr;
            this.entityNameBuf = cArr2;
            this.entityReplacement = strArr2;
            this.entityReplacementBuf = cArr3;
            if (this.allStringsInterned) {
                return;
            }
            int[] iArr = new int[i11];
            int[] iArr2 = this.entityNameHash;
            if (iArr2 != null) {
                System.arraycopy(iArr2, 0, iArr, 0, this.entityEnd);
            }
            this.entityNameHash = iArr;
        }
    }

    public void ensureLocalNamespacesCapacity(int i10) {
        String[] strArr = this.localNamespacePrefix;
        if (i10 >= (strArr != null ? strArr.length : 0)) {
            int i11 = i10 > 7 ? i10 * 2 : 8;
            String[] strArr2 = new String[i11];
            String[] strArr3 = new String[i11];
            if (strArr != null) {
                System.arraycopy(strArr, 0, strArr2, 0, this.localNamespaceEnd);
                System.arraycopy(this.localNamespaceUri, 0, strArr3, 0, this.localNamespaceEnd);
            }
            this.localNamespacePrefix = strArr2;
            this.localNamespaceUri = strArr3;
            if (this.allStringsInterned) {
                return;
            }
            int[] iArr = new int[i11];
            int[] iArr2 = this.localNamespacePrefixHash;
            if (iArr2 != null) {
                System.arraycopy(iArr2, 0, iArr, 0, this.localNamespaceEnd);
            }
            this.localNamespacePrefixHash = iArr;
        }
    }

    public void ensureNamespacesCapacity(int i10) {
        String[] strArr = this.namespacePrefix;
        if (i10 >= (strArr != null ? strArr.length : 0)) {
            int i11 = i10 > 7 ? i10 * 2 : 8;
            String[] strArr2 = new String[i11];
            String[] strArr3 = new String[i11];
            if (strArr != null) {
                System.arraycopy(strArr, 0, strArr2, 0, this.namespaceEnd);
                System.arraycopy(this.namespaceUri, 0, strArr3, 0, this.namespaceEnd);
            }
            this.namespacePrefix = strArr2;
            this.namespaceUri = strArr3;
            if (this.allStringsInterned) {
                return;
            }
            int[] iArr = new int[i11];
            int[] iArr2 = this.namespacePrefixHash;
            if (iArr2 != null) {
                System.arraycopy(iArr2, 0, iArr, 0, this.namespaceEnd);
            }
            this.namespacePrefixHash = iArr;
        }
    }

    public void ensurePC(int i10) {
        char[] cArr = new char[i10 > 8192 ? i10 * 2 : 16384];
        System.arraycopy(this.f37822pc, 0, cArr, 0, this.pcEnd);
        this.f37822pc = cArr;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0026  */
    /* JADX WARN: Code duplicated, block: B:18:0x002d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    public void fillBuf() throws XMLStreamException, EOFException {
        boolean z10;
        char[] cArr;
        int i10;
        if (this.reader == null) {
            throw new XMLStreamException("reader must be set before parsing is started");
        }
        int i11 = this.bufEnd;
        int i12 = this.bufSoftLimit;
        if (i11 > i12) {
            int i13 = this.bufStart;
            boolean z11 = true;
            boolean z12 = i13 > i12;
            if (z12) {
                z11 = z12;
            } else {
                if (i13 < this.buf.length / 2) {
                    z11 = z12;
                    z10 = true;
                }
                if (z11) {
                    char[] cArr2 = this.buf;
                    System.arraycopy(cArr2, i13, cArr2, 0, i11 - i13);
                } else {
                    if (z10) {
                        throw new XMLStreamException("internal error in fillBuffer()");
                    }
                    char[] cArr3 = this.buf;
                    cArr = new char[cArr3.length * 2];
                    System.arraycopy(cArr3, i13, cArr, 0, i11 - i13);
                    this.buf = cArr;
                    i10 = this.bufLoadFactor;
                    if (i10 > 0) {
                        this.bufSoftLimit = (i10 * cArr.length) / 100;
                    }
                }
                int i14 = this.bufEnd;
                int i15 = this.bufStart;
                this.bufEnd = i14 - i15;
                this.pos -= i15;
                this.posStart -= i15;
                this.posEnd -= i15;
                this.bufAbsoluteStart += i15;
                this.bufStart = 0;
            }
            z10 = false;
            if (z11) {
                char[] cArr4 = this.buf;
                System.arraycopy(cArr4, i13, cArr4, 0, i11 - i13);
            } else {
                if (z10) {
                    throw new XMLStreamException("internal error in fillBuffer()");
                }
                char[] cArr5 = this.buf;
                cArr = new char[cArr5.length * 2];
                System.arraycopy(cArr5, i13, cArr, 0, i11 - i13);
                this.buf = cArr;
                i10 = this.bufLoadFactor;
                if (i10 > 0) {
                    this.bufSoftLimit = (i10 * cArr.length) / 100;
                }
            }
            int i16 = this.bufEnd;
            int i17 = this.bufStart;
            this.bufEnd = i16 - i17;
            this.pos -= i17;
            this.posStart -= i17;
            this.posEnd -= i17;
            this.bufAbsoluteStart += i17;
            this.bufStart = 0;
        }
        char[] cArr6 = this.buf;
        int length = cArr6.length;
        int i18 = this.bufEnd;
        int i19 = length - i18;
        if (i19 > 8192) {
            i19 = 8192;
        }
        try {
            int i20 = this.reader.read(cArr6, i18, i19);
            if (i20 > 0) {
                this.bufEnd += i20;
            } else {
                if (i20 == -1) {
                    throw new EOFException("no more data available");
                }
                StringBuffer stringBuffer = new StringBuffer("error reading input, returned ");
                stringBuffer.append(i20);
                throw new XMLStreamException(stringBuffer.toString());
            }
        } catch (IOException e5) {
            throw new XMLStreamException(e5);
        }
    }

    @Override // javax.xml.stream.XMLStreamReader
    public int getAttributeCount() {
        if (this.eventType == 1) {
            return this.attributeCount;
        }
        h(1);
        throw null;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getAttributeLocalName(int i10) {
        if (this.eventType != 1) {
            h(1);
            throw null;
        }
        if (i10 >= 0 && i10 < this.attributeCount) {
            return this.attributeName[i10];
        }
        StringBuffer stringBuffer = new StringBuffer("attribute position must be 0..");
        stringBuffer.append(this.attributeCount - 1);
        stringBuffer.append(" and not ");
        stringBuffer.append(i10);
        throw new IndexOutOfBoundsException(stringBuffer.toString());
    }

    @Override // javax.xml.stream.XMLStreamReader
    public QName getAttributeName(int i10) {
        if (this.eventType != 1) {
            h(1);
            throw null;
        }
        String attributeNamespace = getAttributeNamespace(i10);
        if (attributeNamespace == null) {
            attributeNamespace = "";
        }
        String attributeLocalName = getAttributeLocalName(i10);
        String attributePrefix = getAttributePrefix(i10);
        return new QName(attributeNamespace, attributeLocalName, attributePrefix != null ? attributePrefix : "");
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getAttributeNamespace(int i10) {
        if (this.eventType != 1) {
            h(1);
            throw null;
        }
        if (!this.processNamespaces) {
            return NO_NAMESPACE;
        }
        if (i10 >= 0 && i10 < this.attributeCount) {
            return this.attributeUri[i10];
        }
        StringBuffer stringBuffer = new StringBuffer("attribute position must be 0..");
        stringBuffer.append(this.attributeCount - 1);
        stringBuffer.append(" and not ");
        stringBuffer.append(i10);
        throw new IndexOutOfBoundsException(stringBuffer.toString());
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getAttributePrefix(int i10) {
        if (this.eventType != 1) {
            h(1);
            throw null;
        }
        if (!this.processNamespaces) {
            return null;
        }
        if (i10 >= 0 && i10 < this.attributeCount) {
            return this.attributePrefix[i10];
        }
        StringBuffer stringBuffer = new StringBuffer("attribute position must be 0..");
        stringBuffer.append(this.attributeCount - 1);
        stringBuffer.append(" and not ");
        stringBuffer.append(i10);
        throw new IndexOutOfBoundsException(stringBuffer.toString());
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getAttributeType(int i10) {
        if (this.eventType != 1) {
            h(1);
            throw null;
        }
        if (i10 >= 0 && i10 < this.attributeCount) {
            return "CDATA";
        }
        StringBuffer stringBuffer = new StringBuffer("attribute position must be 0..");
        stringBuffer.append(this.attributeCount - 1);
        stringBuffer.append(" and not ");
        stringBuffer.append(i10);
        throw new IndexOutOfBoundsException(stringBuffer.toString());
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getAttributeValue(int i10) {
        if (this.eventType != 1) {
            h(1);
            throw null;
        }
        if (i10 >= 0 && i10 < this.attributeCount) {
            return this.attributeValue[i10];
        }
        StringBuffer stringBuffer = new StringBuffer("attribute position must be 0..");
        stringBuffer.append(this.attributeCount - 1);
        stringBuffer.append(" and not ");
        stringBuffer.append(i10);
        throw new IndexOutOfBoundsException(stringBuffer.toString());
    }

    public Iterator getAttributes() {
        if (!hasAttributes()) {
            return EmptyIterator.emptyIterator;
        }
        int attributeCount = getAttributeCount();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            arrayList.add(new AttributeBase(getAttributePrefix(i10), getAttributeNamespace(i10), getAttributeLocalName(i10), getAttributeValue(i10), getAttributeType(i10)));
        }
        return arrayList.iterator();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getCharacterEncodingScheme() {
        return this.charEncodingScheme;
    }

    @Override // javax.xml.stream.Location
    public int getCharacterOffset() {
        return this.posEnd;
    }

    @Override // javax.xml.stream.Location
    public int getColumnNumber() {
        return this.columnNumber;
    }

    public ConfigurationContextBase getConfigurationContext() {
        return this.f37821b;
    }

    public int getDepth() {
        return this.depth;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getElementText() throws XMLStreamException {
        StringBuffer stringBuffer = new StringBuffer();
        if (getEventType() != 1) {
            throw new XMLStreamException("Precondition for readText is getEventType() == START_ELEMENT");
        }
        while (next() != 8) {
            if (isStartElement()) {
                throw new XMLStreamException("Unexpected Element start");
            }
            if (isCharacters() || getEventType() == 9) {
                stringBuffer.append(getText());
            }
            if (isEndElement()) {
                return stringBuffer.toString();
            }
        }
        throw new XMLStreamException("Unexpected end of Document");
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getEncoding() {
        return getInputEncoding();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public int getEventType() {
        return this.eventType;
    }

    public boolean getFeature(String str) {
        if (str == null) {
            throw new IllegalArgumentException("feature name should not be null");
        }
        if (FEATURE_PROCESS_NAMESPACES.equals(str)) {
            return this.processNamespaces;
        }
        return (FEATURE_NAMES_INTERNED.equals(str) || FEATURE_PROCESS_DOCDECL.equals(str) || !FEATURE_XML_ROUNDTRIP.equals(str)) ? false : true;
    }

    public String getInputEncoding() {
        return this.inputEncoding;
    }

    @Override // javax.xml.stream.Location
    public int getLineNumber() {
        return this.lineNumber;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getLocalName() {
        int i10 = this.eventType;
        if (i10 == 1) {
            return this.elName[this.depth];
        }
        if (i10 == 2) {
            return this.elName[this.depth];
        }
        if (i10 != 9) {
            i(new int[]{1, 2, 9});
            throw null;
        }
        if (this.entityRefName == null) {
            char[] cArr = this.buf;
            int i11 = this.posStart;
            this.entityRefName = newString(cArr, i11, this.posEnd - i11);
        }
        return this.entityRefName;
    }

    public int getLocalNamespaceCount() {
        return this.namespaceEnd - this.elNamespaceCount[this.depth - 1];
    }

    public String getLocationURI() {
        return null;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public QName getName() {
        if (!d(this.eventType)) {
            throw new IllegalStateException("Current state not START_ELEMENT or END_ELEMENT");
        }
        String namespaceURI = getNamespaceURI();
        if (namespaceURI == null) {
            namespaceURI = "";
        }
        String localName = getLocalName();
        String prefix = getPrefix();
        return new QName(namespaceURI, localName, prefix != null ? prefix : "");
    }

    @Override // javax.xml.stream.XMLStreamReader
    public NamespaceContext getNamespaceContext() {
        return new ReadOnlyNamespaceContextBase(this.namespacePrefix, this.namespaceUri, this.namespaceEnd);
    }

    @Override // javax.xml.stream.XMLStreamReader
    public int getNamespaceCount() {
        if (d(this.eventType)) {
            return getNamespaceCount(this.depth);
        }
        i(new int[]{1, 2});
        throw null;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getNamespacePrefix(int i10) {
        if (!d(this.eventType)) {
            i(new int[]{1, 2});
            throw null;
        }
        int i11 = this.depth;
        int namespaceCount = getNamespaceCount(i11);
        int i12 = this.elNamespaceCount[i11 - 1] + i10;
        if (i10 < namespaceCount) {
            return this.namespacePrefix[i12];
        }
        StringBuffer stringBuffer = new StringBuffer("position ");
        stringBuffer.append(i10);
        stringBuffer.append(" exceeded number of available namespaces ");
        stringBuffer.append(namespaceCount);
        throw new ArrayIndexOutOfBoundsException(stringBuffer.toString());
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getNamespaceURI(int i10) {
        if (!d(this.eventType)) {
            i(new int[]{1, 2});
            throw null;
        }
        int i11 = this.depth;
        int namespaceCount = getNamespaceCount(i11);
        int i12 = this.elNamespaceCount[i11 - 1] + i10;
        if (i10 < namespaceCount) {
            return this.namespaceUri[i12];
        }
        StringBuffer stringBuffer = new StringBuffer("position ");
        stringBuffer.append(i10);
        stringBuffer.append(" exceedded number of available namespaces ");
        stringBuffer.append(namespaceCount);
        throw new ArrayIndexOutOfBoundsException(stringBuffer.toString());
    }

    public Iterator getNamespaces() {
        if (!hasNamespaces()) {
            return EmptyIterator.emptyIterator;
        }
        return internalGetNamespaces(this.depth, getLocalNamespaceCount());
    }

    public Iterator getOutOfScopeNamespaces() {
        int[] iArr = this.elNamespaceCount;
        int i10 = this.depth;
        return internalGetNamespaces(i10, iArr[i10] - iArr[i10 - 1]);
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getPIData() {
        if (this.eventType == 3) {
            return this.piData;
        }
        h(3);
        throw null;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getPITarget() {
        if (this.eventType == 3) {
            return this.piTarget;
        }
        h(3);
        throw null;
    }

    public String getPositionDescription() {
        String string;
        int i10 = this.posStart;
        int i11 = this.pos;
        String str = null;
        if (i10 <= i11) {
            char[] cArr = this.buf;
            if (i10 >= 0) {
                if (i11 - i10 > 65) {
                    i10 = i11 - 10;
                }
                int i12 = i10 + 1;
                while (true) {
                    i12--;
                    if (i12 <= 0 || i11 - i12 > 65 || (cArr[i12] == '<' && i10 - i12 > 10)) {
                        break;
                    }
                }
                i11 = i12;
            } else if (i11 >= 0) {
                i11 = 0;
            }
            int i13 = this.pos;
            str = i11 < i13 ? new String(this.buf, i11, i13 - i11) : null;
            if (this.bufAbsoluteStart > 0 || i11 > 0) {
                StringBuffer stringBuffer = new StringBuffer("...");
                stringBuffer.append(str);
                str = stringBuffer.toString();
            }
        }
        StringBuffer stringBuffer2 = new StringBuffer(" ");
        if (str != null) {
            StringBuffer stringBuffer3 = new StringBuffer(" seen ");
            stringBuffer3.append(printable(str));
            stringBuffer3.append("...");
            string = stringBuffer3.toString();
        } else {
            string = "";
        }
        stringBuffer2.append(string);
        stringBuffer2.append(" @");
        stringBuffer2.append(getLineNumber());
        stringBuffer2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
        stringBuffer2.append(getColumnNumber());
        return stringBuffer2.toString();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getPrefix() {
        int i10 = this.eventType;
        if (i10 == 1 || i10 == 2) {
            return this.elPrefix[this.depth];
        }
        i(new int[]{1, 2});
        throw null;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public Object getProperty(String str) {
        ArrayList arrayList = null;
        if (str.equals("javax.xml.stream.entities")) {
            DTD dtd = this.mDtdIntSubset;
            if (dtd != null) {
                Class clsB = f37817e;
                if (clsB == null) {
                    clsB = b("com.wutka.dtd.DTDEntity");
                    f37817e = clsB;
                }
                Vector itemsByType = dtd.getItemsByType(clsB);
                Enumeration enumerationElements = itemsByType.elements();
                arrayList = new ArrayList(itemsByType.size());
                while (enumerationElements.hasMoreElements()) {
                    EntityDeclaration entityDeclarationCreateEntityDeclaration = DTDEvent.createEntityDeclaration((DTDEntity) enumerationElements.nextElement());
                    if (entityDeclarationCreateEntityDeclaration != null) {
                        arrayList.add(entityDeclarationCreateEntityDeclaration);
                    }
                }
            }
            return arrayList;
        }
        if (!str.equals("javax.xml.stream.notations")) {
            return this.f37821b.getProperty(str);
        }
        DTD dtd2 = this.mDtdIntSubset;
        if (dtd2 != null) {
            Class clsB2 = f37819g;
            if (clsB2 == null) {
                clsB2 = b("com.wutka.dtd.DTDNotation");
                f37819g = clsB2;
            }
            Vector itemsByType2 = dtd2.getItemsByType(clsB2);
            Enumeration enumerationElements2 = itemsByType2.elements();
            arrayList = new ArrayList(itemsByType2.size());
            while (enumerationElements2.hasMoreElements()) {
                NotationDeclaration notationDeclarationCreateNotationDeclaration = DTDEvent.createNotationDeclaration((DTDNotation) enumerationElements2.nextElement());
                if (notationDeclarationCreateNotationDeclaration != null) {
                    arrayList.add(notationDeclarationCreateNotationDeclaration);
                }
            }
        }
        return arrayList;
    }

    @Override // javax.xml.stream.Location
    public String getPublicId() {
        return null;
    }

    @Override // javax.xml.stream.Location
    public String getSystemId() {
        return null;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getText() {
        char[] cArr;
        if (!hasText()) {
            StringBuffer stringBuffer = new StringBuffer("Current state (");
            stringBuffer.append(c(this.eventType));
            stringBuffer.append(") does not have textual content");
            throw new IllegalStateException(stringBuffer.toString());
        }
        if (this.eventType == 9) {
            if (this.text == null && (cArr = this.entityValue) != null) {
                this.text = new String(cArr);
            }
            return this.text;
        }
        if (this.usePC) {
            char[] cArr2 = this.f37822pc;
            int i10 = this.pcStart;
            this.text = new String(cArr2, i10, this.pcEnd - i10);
        } else {
            char[] cArr3 = this.buf;
            int i11 = this.posStart;
            this.text = new String(cArr3, i11, this.posEnd - i11);
        }
        return this.text;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public int getTextCharacters(int i10, char[] cArr, int i11, int i12) throws XMLStreamException {
        a();
        int textLength = getTextLength();
        if (i10 < 0 || i10 > textLength) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i13 = textLength - i10;
        if (i13 < i12) {
            i12 = i13;
        }
        if (i12 > 0) {
            System.arraycopy(getTextCharacters(), getTextStart() + i10, cArr, i11, i12);
        }
        return i12;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public int getTextLength() {
        int i10;
        int i11;
        a();
        if (this.usePC) {
            i10 = this.pcEnd;
            i11 = this.pcStart;
        } else {
            i10 = this.posEnd;
            i11 = this.posStart;
        }
        return i10 - i11;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public int getTextStart() {
        a();
        return this.usePC ? this.pcStart : this.posStart;
    }

    public Reader getTextStream() {
        throw new UnsupportedOperationException();
    }

    public String getValue() {
        return getText();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getVersion() {
        return this.xmlVersion;
    }

    public final void h(int i10) throws IllegalStateException {
        StringBuffer stringBuffer = new StringBuffer("Current state (");
        stringBuffer.append(c(this.eventType));
        stringBuffer.append(") not ");
        stringBuffer.append(c(i10));
        throw new IllegalStateException(stringBuffer.toString());
    }

    public boolean hasAttributes() {
        return getAttributeCount() > 0;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean hasName() {
        return d(this.eventType);
    }

    public boolean hasNamespaces() {
        return getNamespaceCount() > 0;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean hasNext() throws XMLStreamException {
        return this.eventType != 8;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean hasText() {
        int i10 = this.eventType;
        return i10 == 4 || i10 == 11 || i10 == 12 || i10 == 5 || i10 == 6 || i10 == 9;
    }

    public final void i(int[] iArr) throws IllegalStateException {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(c(iArr[0]));
        int length = iArr.length - 1;
        for (int i10 = 0; i10 < length; i10++) {
            stringBuffer.append(", ");
            stringBuffer.append(c(iArr[i10]));
        }
        stringBuffer.append(" or ");
        stringBuffer.append(c(iArr[length]));
        StringBuffer stringBuffer2 = new StringBuffer("Current state (");
        stringBuffer2.append(c(this.eventType));
        stringBuffer2.append(") not ");
        stringBuffer2.append(stringBuffer.toString());
        throw new IllegalStateException(stringBuffer2.toString());
    }

    public Iterator internalGetNamespaces(int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        int i12 = this.elNamespaceCount[i10 - 1];
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = i13 + i12;
            String str = this.namespacePrefix[i14];
            if (str == null) {
                arrayList.add(new NamespaceBase(this.namespaceUri[i14]));
            } else {
                arrayList.add(new NamespaceBase(str, this.namespaceUri[i14]));
            }
        }
        return arrayList.iterator();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean isAttributeSpecified(int i10) {
        if (this.eventType != 1) {
            h(1);
            throw null;
        }
        if (i10 >= 0 && i10 < this.attributeCount) {
            return true;
        }
        StringBuffer stringBuffer = new StringBuffer("attribute position must be 0..");
        stringBuffer.append(this.attributeCount - 1);
        stringBuffer.append(" and not ");
        stringBuffer.append(i10);
        throw new IndexOutOfBoundsException(stringBuffer.toString());
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean isCharacters() {
        return this.eventType == 4;
    }

    public boolean isEOF() {
        return this.eventType == 8;
    }

    public boolean isEmptyElementTag() throws XMLStreamException {
        if (this.eventType == 1) {
            return this.emptyElementTag;
        }
        throw new XMLStreamException("parser must be on XMLStreamConstants.START_ELEMENT to check for empty element", getLocation());
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean isEndElement() {
        return this.eventType == 2;
    }

    public boolean isNameChar(char c10) {
        return (c10 < 1024 && lookupNameChar[c10]) || (c10 >= 1024 && c10 <= 8231) || ((c10 >= 8234 && c10 <= 8591) || (c10 >= 10240 && c10 <= 65519));
    }

    public boolean isNameStartChar(char c10) {
        return (c10 < 1024 && lookupNameStartChar[c10]) || (c10 >= 1024 && c10 <= 8231) || ((c10 >= 8234 && c10 <= 8591) || (c10 >= 10240 && c10 <= 65519));
    }

    public boolean isS(char c10) {
        return c10 == ' ' || c10 == '\n' || c10 == '\r' || c10 == '\t';
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean isStandalone() {
        return this.standalone;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean isStartElement() {
        return this.eventType == 1;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean isWhiteSpace() {
        int i10 = this.eventType;
        if (i10 != 4 && i10 != 12) {
            return i10 == 6;
        }
        if (this.usePC) {
            for (int i11 = this.pcStart; i11 < this.pcEnd; i11++) {
                if (!isS(this.f37822pc[i11])) {
                    return false;
                }
            }
            return true;
        }
        for (int i12 = this.posStart; i12 < this.posEnd; i12++) {
            if (!isS(this.buf[i12])) {
                return false;
            }
        }
        return true;
    }

    public void joinPC() {
        int i10 = this.posEnd - this.posStart;
        int i11 = this.pcEnd + i10 + 1;
        if (i11 >= this.f37822pc.length) {
            ensurePC(i11);
        }
        System.arraycopy(this.buf, this.posStart, this.f37822pc, this.pcEnd, i10);
        this.pcEnd += i10;
        this.usePC = true;
    }

    public char[] lookupEntityReplacement(int i10) throws XMLStreamException {
        if (this.allStringsInterned) {
            char[] cArr = this.buf;
            int i11 = this.posStart;
            this.entityRefName = newString(cArr, i11, this.posEnd - i11);
            for (int i12 = this.entityEnd - 1; i12 >= 0; i12--) {
                if (this.entityRefName == this.entityName[i12]) {
                    if (this.tokenize) {
                        this.text = this.entityReplacement[i12];
                    }
                    return this.entityReplacementBuf[i12];
                }
            }
            return null;
        }
        char[] cArr2 = this.buf;
        int i13 = this.posStart;
        int iFastHash = fastHash(cArr2, i13, this.posEnd - i13);
        for (int i14 = this.entityEnd - 1; i14 >= 0; i14--) {
            if (iFastHash == this.entityNameHash[i14]) {
                char[] cArr3 = this.entityNameBuf[i14];
                if (i10 == cArr3.length) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= i10) {
                            if (this.tokenize) {
                                this.text = this.entityReplacement[i14];
                            }
                            this.entityRefName = this.entityName[i14];
                            return this.entityReplacementBuf[i14];
                        }
                        if (this.buf[this.posStart + i15] != cArr3[i15]) {
                            break;
                        }
                        i15++;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    public char more() throws XMLStreamException, EOFException {
        if (this.pos >= this.bufEnd) {
            fillBuf();
        }
        char[] cArr = this.buf;
        int i10 = this.pos;
        this.pos = i10 + 1;
        char c10 = cArr[i10];
        if (c10 == '\n') {
            this.lineNumber++;
            this.columnNumber = 1;
        } else {
            this.columnNumber++;
        }
        return c10;
    }

    public boolean moveToEndElement() throws XMLStreamException {
        if (isEndElement()) {
            return true;
        }
        while (hasNext()) {
            if (isEndElement()) {
                return true;
            }
            next();
        }
        return false;
    }

    public boolean moveToStartElement() throws XMLStreamException {
        if (isStartElement()) {
            return true;
        }
        while (hasNext()) {
            if (isStartElement()) {
                return true;
            }
            next();
        }
        return false;
    }

    public String newString(char[] cArr, int i10, int i11) {
        return new String(cArr, i10, i11);
    }

    public String newStringIntern(char[] cArr, int i10, int i11) {
        return new String(cArr, i10, i11).intern();
    }

    @Override // javax.xml.stream.XMLStreamReader
    public int next() throws XMLStreamException {
        this.tokenize = true;
        this.pcStart = 0;
        this.pcEnd = 0;
        this.usePC = false;
        return nextImpl();
    }

    public int nextElement() throws XMLStreamException {
        return nextTag();
    }

    public int nextImpl() throws XMLStreamException {
        char cMore;
        try {
            this.text = null;
            this.bufStart = this.posEnd;
            if (this.pastEndTag) {
                this.pastEndTag = false;
                int i10 = this.depth - 1;
                this.depth = i10;
                this.namespaceEnd = this.elNamespaceCount[i10];
            }
            if (this.emptyElementTag) {
                this.emptyElementTag = false;
                this.pastEndTag = true;
                this.eventType = 2;
                return 2;
            }
            if (this.depth <= 0) {
                return this.seenRoot ? parseEpilog() : parseProlog();
            }
            if (this.seenStartTag) {
                this.seenStartTag = false;
                int startTag = parseStartTag();
                this.eventType = startTag;
                return startTag;
            }
            if (this.seenEndTag) {
                this.seenEndTag = false;
                int endTag = parseEndTag();
                this.eventType = endTag;
                return endTag;
            }
            if (this.seenMarkup) {
                this.seenMarkup = false;
                cMore = '<';
            } else if (this.seenAmpersand) {
                this.seenAmpersand = false;
                cMore = '&';
            } else {
                cMore = more();
            }
            this.posStart = this.pos - 1;
            boolean z10 = false;
            boolean z11 = false;
            while (true) {
                if (cMore == '<') {
                    if (z10 && this.tokenize) {
                        this.seenMarkup = true;
                        this.eventType = 4;
                        return 4;
                    }
                    char cMore2 = more();
                    if (cMore2 == '/') {
                        if (this.tokenize || !z10) {
                            int endTag2 = parseEndTag();
                            this.eventType = endTag2;
                            return endTag2;
                        }
                        this.seenEndTag = true;
                        this.eventType = 4;
                        return 4;
                    }
                    if (cMore2 == '!') {
                        char cMore3 = more();
                        if (cMore3 == '-') {
                            parseComment();
                            if (this.tokenize) {
                                this.eventType = 5;
                                return 5;
                            }
                            if (!this.usePC && z10) {
                                z11 = true;
                            }
                        } else {
                            if (cMore3 != '[') {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("unexpected character in markup ");
                                stringBuffer.append(printable(cMore3));
                                throw new XMLStreamException(stringBuffer.toString(), getLocation());
                            }
                            int i11 = this.posStart;
                            int i12 = this.posEnd;
                            parseCDATA();
                            int i13 = this.posStart;
                            int i14 = this.posEnd;
                            this.posStart = i11;
                            this.posEnd = i12;
                            int i15 = i14 - i13;
                            if (i15 > 0) {
                                if (z10) {
                                    if (!this.usePC) {
                                        if (i12 > i11) {
                                            joinPC();
                                        } else {
                                            this.usePC = true;
                                            this.pcEnd = 0;
                                            this.pcStart = 0;
                                        }
                                    }
                                    int i16 = this.pcEnd;
                                    if (i16 + i15 >= this.f37822pc.length) {
                                        ensurePC(i16 + i15);
                                    }
                                    System.arraycopy(this.buf, i13, this.f37822pc, this.pcEnd, i15);
                                    this.pcEnd += i15;
                                } else {
                                    this.posStart = i13;
                                    this.posEnd = i14;
                                    z11 = true;
                                }
                                z10 = true;
                            } else if (!this.usePC && z10) {
                                z11 = true;
                            }
                            if (this.f37820a) {
                                this.eventType = 12;
                                return 12;
                            }
                        }
                    } else {
                        if (cMore2 != '?') {
                            if (!isNameStartChar(cMore2)) {
                                StringBuffer stringBuffer2 = new StringBuffer();
                                stringBuffer2.append("unexpected character in markup ");
                                stringBuffer2.append(printable(cMore2));
                                throw new XMLStreamException(stringBuffer2.toString(), getLocation());
                            }
                            if (this.tokenize || !z10) {
                                int startTag2 = parseStartTag();
                                this.eventType = startTag2;
                                return startTag2;
                            }
                            this.seenStartTag = true;
                            this.eventType = 4;
                            return 4;
                        }
                        parsePI();
                        if (this.tokenize) {
                            this.eventType = 3;
                            return 3;
                        }
                        if (!this.usePC && z10) {
                            z11 = true;
                        }
                    }
                } else if (cMore != '&') {
                    if (z11) {
                        joinPC();
                        z11 = false;
                    }
                    boolean z12 = false;
                    do {
                        if (cMore == '\r') {
                            int i17 = this.pos - 1;
                            this.posEnd = i17;
                            if (!this.usePC) {
                                if (i17 > this.posStart) {
                                    joinPC();
                                } else {
                                    this.usePC = true;
                                    this.pcEnd = 0;
                                    this.pcStart = 0;
                                }
                            }
                            int i18 = this.pcEnd;
                            if (i18 >= this.f37822pc.length) {
                                ensurePC(i18);
                            }
                            char[] cArr = this.f37822pc;
                            int i19 = this.pcEnd;
                            this.pcEnd = i19 + 1;
                            cArr[i19] = '\n';
                            z12 = true;
                        } else {
                            if (cMore == '\n') {
                                if (!z12 && this.usePC) {
                                    int i20 = this.pcEnd;
                                    if (i20 >= this.f37822pc.length) {
                                        ensurePC(i20);
                                    }
                                    char[] cArr2 = this.f37822pc;
                                    int i21 = this.pcEnd;
                                    this.pcEnd = i21 + 1;
                                    cArr2[i21] = '\n';
                                }
                            } else if (this.usePC) {
                                int i22 = this.pcEnd;
                                if (i22 >= this.f37822pc.length) {
                                    ensurePC(i22);
                                }
                                char[] cArr3 = this.f37822pc;
                                int i23 = this.pcEnd;
                                this.pcEnd = i23 + 1;
                                cArr3[i23] = cMore;
                            }
                            z12 = false;
                        }
                        cMore = more();
                        if (cMore == '<') {
                            break;
                        }
                    } while (cMore != '&');
                    this.posEnd = this.pos - 1;
                    z10 = true;
                } else {
                    if (this.tokenize && z10) {
                        this.seenAmpersand = true;
                        this.eventType = 4;
                        return 4;
                    }
                    int i24 = this.posStart;
                    int i25 = this.posEnd;
                    boolean zIsReplacingEntities = getConfigurationContext().isReplacingEntities();
                    char[] entityRef = parseEntityRef(zIsReplacingEntities);
                    if (!zIsReplacingEntities) {
                        this.eventType = 9;
                        return 9;
                    }
                    this.eventType = 4;
                    if (entityRef == null) {
                        if (this.entityRefName == null) {
                            char[] cArr4 = this.buf;
                            int i26 = this.posStart;
                            this.entityRefName = newString(cArr4, i26, this.posEnd - i26);
                        }
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append("could not resolve entity named '");
                        stringBuffer3.append(printable(this.entityRefName));
                        stringBuffer3.append("'");
                        throw new XMLStreamException(stringBuffer3.toString(), getLocation());
                    }
                    this.posStart = i24;
                    this.posEnd = i25;
                    if (!this.usePC) {
                        if (z10) {
                            joinPC();
                            z11 = false;
                        } else {
                            this.usePC = true;
                            this.pcEnd = 0;
                            this.pcStart = 0;
                        }
                    }
                    for (char c10 : entityRef) {
                        int i27 = this.pcEnd;
                        if (i27 >= this.f37822pc.length) {
                            ensurePC(i27);
                        }
                        char[] cArr5 = this.f37822pc;
                        int i28 = this.pcEnd;
                        this.pcEnd = i28 + 1;
                        cArr5[i28] = c10;
                    }
                    z10 = true;
                }
                cMore = more();
            }
        } catch (EOFException e5) {
            throw new XMLStreamException("Unexpected end of stream", getLocation(), e5);
        }
    }

    @Override // javax.xml.stream.XMLStreamReader
    public int nextTag() throws XMLStreamException {
        next();
        while (true) {
            int i10 = this.eventType;
            if (i10 != 6 && i10 != 5 && i10 != 3 && ((i10 != 4 || !isWhiteSpace()) && (this.eventType != 12 || !isWhiteSpace()))) {
                break;
            }
            next();
        }
        int i11 = this.eventType;
        if (i11 == 1 || i11 == 2) {
            return i11;
        }
        StringBuffer stringBuffer = new StringBuffer("expected XMLStreamConstants.START_ELEMENT or XMLStreamConstants.END_ELEMENT not ");
        stringBuffer.append(ElementTypeNames.getEventTypeString(getEventType()));
        throw new XMLStreamException(stringBuffer.toString(), getLocation());
    }

    public String nextText() throws XMLStreamException {
        if (getEventType() != 1) {
            throw new XMLStreamException("parser must be on START_ELEMENT to read next text", getLocation());
        }
        int next = next();
        if (next != 4) {
            if (next == 2) {
                return "";
            }
            throw new XMLStreamException("parser must be on START_ELEMENT or TEXT to read text", getLocation());
        }
        String text = getText();
        if (next() == 2) {
            return text;
        }
        StringBuffer stringBuffer = new StringBuffer("TEXT must be immediately followed by END_ELEMENT and not ");
        stringBuffer.append(ElementTypeNames.getEventTypeString(getEventType()));
        throw new XMLStreamException(stringBuffer.toString(), getLocation());
    }

    public int nextToken() throws XMLStreamException {
        this.tokenize = true;
        return nextImpl();
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0228 A[PHI: r3
      0x0228: PHI (r3v17 java.lang.String) = (r3v15 java.lang.String), (r3v14 java.lang.String) binds: [B:135:0x0246, B:126:0x021c] A[DONT_GENERATE, DONT_INLINE]] */
    public char parseAttribute() throws XMLStreamException {
        String strNewString;
        String strNewStringIntern;
        int i10;
        String string;
        try {
            int i11 = this.posStart;
            int i12 = this.bufAbsoluteStart;
            int i13 = i11 + i12;
            int i14 = this.pos;
            int i15 = (i14 - 1) + i12;
            char c10 = this.buf[i14 - 1];
            if (c10 == ':' && this.processNamespaces) {
                throw new XMLStreamException("when namespaces processing enabled colon can not be at attribute name start", getLocation());
            }
            boolean z10 = this.processNamespaces && c10 == 'x';
            char cMore = more();
            int i16 = 0;
            int i17 = -1;
            while (isNameChar(cMore)) {
                if (this.processNamespaces) {
                    if (z10 && i16 < 5) {
                        i16++;
                        if (i16 == 1) {
                            if (cMore != 'm') {
                                z10 = false;
                            }
                        } else if (i16 == 2) {
                            if (cMore != 'l') {
                                z10 = false;
                            }
                        } else if (i16 == 3) {
                            if (cMore != 'n') {
                                z10 = false;
                            }
                        } else if (i16 == 4) {
                            if (cMore != 's') {
                                z10 = false;
                            }
                        } else if (i16 == 5 && cMore != ':') {
                            throw new XMLStreamException("after xmlns in attribute name must be colonwhen namespaces are enabled", getLocation());
                        }
                    }
                    if (cMore != ':') {
                        continue;
                    } else {
                        if (i17 != -1) {
                            throw new XMLStreamException("only one colon is allowed in attribute name when namespaces are enabled", getLocation());
                        }
                        i17 = this.bufAbsoluteStart + (this.pos - 1);
                    }
                }
                cMore = more();
            }
            ensureAttributesCapacity(this.attributeCount);
            String str = null;
            if (this.processNamespaces) {
                if (i16 < 4) {
                    z10 = false;
                }
                if (!z10) {
                    if (i17 != -1) {
                        this.attributePrefix[this.attributeCount] = newString(this.buf, i15 - this.bufAbsoluteStart, i17 - i15);
                        String[] strArr = this.attributeName;
                        int i18 = this.attributeCount;
                        char[] cArr = this.buf;
                        int i19 = this.bufAbsoluteStart;
                        String strNewString2 = newString(cArr, (i17 - i19) + 1, (this.pos - 2) - (i17 - i19));
                        strArr[i18] = strNewString2;
                        strNewString = strNewString2;
                    } else {
                        String[] strArr2 = this.attributePrefix;
                        int i20 = this.attributeCount;
                        strArr2[i20] = null;
                        String[] strArr3 = this.attributeName;
                        char[] cArr2 = this.buf;
                        int i21 = this.bufAbsoluteStart;
                        String strNewString3 = newString(cArr2, i15 - i21, (this.pos - 1) - (i15 - i21));
                        strArr3[i20] = strNewString3;
                        strNewString = strNewString3;
                    }
                    if (!this.allStringsInterned) {
                        this.attributeNameHash[this.attributeCount] = strNewString.hashCode();
                    }
                } else if (i17 != -1) {
                    char[] cArr3 = this.buf;
                    int i22 = this.bufAbsoluteStart;
                    strNewString = newString(cArr3, (i17 - i22) + 1, (this.pos - 2) - (i17 - i22));
                    if (strNewString.equals(XMLConstants.XMLNS_ATTRIBUTE)) {
                        throw new XMLStreamException("trying to bind reserved NS prefix 'xmlns'", getLocation());
                    }
                } else {
                    strNewString = null;
                }
            } else {
                String[] strArr4 = this.attributeName;
                int i23 = this.attributeCount;
                char[] cArr4 = this.buf;
                int i24 = this.bufAbsoluteStart;
                String strNewString4 = newString(cArr4, i15 - i24, (this.pos - 1) - (i15 - i24));
                strArr4[i23] = strNewString4;
                if (!this.allStringsInterned) {
                    this.attributeNameHash[this.attributeCount] = strNewString4.hashCode();
                }
                strNewString = strNewString4;
            }
            while (isS(cMore)) {
                cMore = more();
            }
            if (cMore != '=') {
                throw new XMLStreamException("expected = after attribute name", getLocation());
            }
            char cMore2 = more();
            while (isS(cMore2)) {
                cMore2 = more();
            }
            if (cMore2 != '\"' && cMore2 != '\'') {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("attribute value must start with quotation or apostrophe not ");
                stringBuffer.append(printable(cMore2));
                throw new XMLStreamException(stringBuffer.toString(), getLocation());
            }
            this.usePC = false;
            this.pcStart = this.pcEnd;
            this.posStart = this.pos;
            boolean z11 = false;
            while (true) {
                char cMore3 = more();
                if (cMore3 == cMore2) {
                    if (this.processNamespaces && z10) {
                        if (this.usePC) {
                            char[] cArr5 = this.f37822pc;
                            int i25 = this.pcStart;
                            strNewStringIntern = newStringIntern(cArr5, i25, this.pcEnd - i25);
                        } else {
                            char[] cArr6 = this.buf;
                            int i26 = this.posStart;
                            strNewStringIntern = newStringIntern(cArr6, i26, (this.pos - 1) - i26);
                        }
                        ensureNamespacesCapacity(this.namespaceEnd);
                        if (!strNewStringIntern.equals(XMLConstants.XML_NS_URI)) {
                            if (strNewStringIntern.equals(XMLConstants.XMLNS_ATTRIBUTE_NS_URI)) {
                                throw new XMLStreamException("trying to bind reserved NS URI  'http://www.w3.org/2000/xmlns/'");
                            }
                        } else if (!"xml".equals(strNewString)) {
                            throw new XMLStreamException("trying to bind reserved NS URI  'http://www.w3.org/XML/1998/namespace' to prefix other than 'xml'");
                        }
                        if (i17 == -1) {
                            this.namespacePrefix[this.namespaceEnd] = str;
                            if (strNewStringIntern.length() == 0) {
                                strNewStringIntern = NO_NAMESPACE;
                            }
                            if (this.allStringsInterned) {
                                i10 = -1;
                            } else {
                                i10 = -1;
                                this.namespacePrefixHash[this.namespaceEnd] = -1;
                            }
                        } else {
                            if (strNewStringIntern.length() == 0) {
                                throw new XMLStreamException("non-default namespace can not be declared to be empty string (in xml 1.0)", getLocation());
                            }
                            if (strNewString.equals("xml") && !strNewStringIntern.equals(XMLConstants.XML_NS_URI)) {
                                throw new XMLStreamException("trying to bind reserved NS prefix 'xml' to URI other than its standard value (http://www.w3.org/XML/1998/namespace)", getLocation());
                            }
                            String[] strArr5 = this.namespacePrefix;
                            int i27 = this.namespaceEnd;
                            strArr5[i27] = strNewString;
                            if (this.allStringsInterned) {
                                i10 = -1;
                            } else {
                                int[] iArr = this.namespacePrefixHash;
                                int iHashCode = strNewString.hashCode();
                                iArr[i27] = iHashCode;
                                i10 = iHashCode;
                            }
                        }
                        String[] strArr6 = this.namespaceUri;
                        int i28 = this.namespaceEnd;
                        strArr6[i28] = strNewStringIntern;
                        int i29 = this.elNamespaceCount[this.depth - 1];
                        int i30 = i28 - 1;
                        while (true) {
                            if (i30 >= i29) {
                                boolean z12 = this.allStringsInterned;
                                if (((z12 || strNewString == null) && this.namespacePrefix[i30] == strNewString) || (!z12 && strNewString != null && this.namespacePrefixHash[i30] == i10 && strNewString.equals(this.namespacePrefix[i30]))) {
                                    break;
                                    break;
                                }
                                i30--;
                            } else {
                                this.namespaceEnd++;
                            }
                        }
                        if (strNewString == null) {
                            string = "default";
                        } else {
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append("'");
                            stringBuffer2.append(strNewString);
                            stringBuffer2.append("'");
                            string = stringBuffer2.toString();
                        }
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append("duplicated namespace declaration for ");
                        stringBuffer3.append(string);
                        stringBuffer3.append(" prefix");
                        throw new XMLStreamException(stringBuffer3.toString(), getLocation());
                    }
                    if (this.usePC) {
                        String[] strArr7 = this.attributeValue;
                        int i31 = this.attributeCount;
                        char[] cArr7 = this.f37822pc;
                        int i32 = this.pcStart;
                        strArr7[i31] = new String(cArr7, i32, this.pcEnd - i32);
                    } else {
                        String[] strArr8 = this.attributeValue;
                        int i33 = this.attributeCount;
                        char[] cArr8 = this.buf;
                        int i34 = this.posStart;
                        strArr8[i33] = new String(cArr8, i34, (this.pos - 1) - i34);
                    }
                    this.attributeCount++;
                    this.posStart = i13 - this.bufAbsoluteStart;
                    return cMore3;
                }
                if (cMore3 == '<') {
                    throw new XMLStreamException("markup not allowed inside attribute value - illegal < ", getLocation());
                }
                if (cMore3 == '&') {
                    int i35 = this.pos - 1;
                    this.posEnd = i35;
                    if (!this.usePC) {
                        if (i35 > this.posStart) {
                            joinPC();
                        } else {
                            this.usePC = true;
                            this.pcEnd = 0;
                            this.pcStart = 0;
                        }
                    }
                    char[] entityRef = parseEntityRef(getConfigurationContext().isReplacingEntities());
                    if (entityRef == null) {
                        if (this.entityRefName == null) {
                            char[] cArr9 = this.buf;
                            int i36 = this.posStart;
                            this.entityRefName = newString(cArr9, i36, this.posEnd - i36);
                        }
                        StringBuffer stringBuffer4 = new StringBuffer();
                        stringBuffer4.append("could not resolve entity named '");
                        stringBuffer4.append(printable(this.entityRefName));
                        stringBuffer4.append("'");
                        throw new XMLStreamException(stringBuffer4.toString(), getLocation());
                    }
                    for (char c11 : entityRef) {
                        int i37 = this.pcEnd;
                        if (i37 >= this.f37822pc.length) {
                            ensurePC(i37);
                        }
                        char[] cArr10 = this.f37822pc;
                        int i38 = this.pcEnd;
                        this.pcEnd = i38 + 1;
                        cArr10[i38] = c11;
                    }
                } else if (cMore3 == '\t' || cMore3 == '\n' || cMore3 == '\r') {
                    if (!this.usePC) {
                        int i39 = this.pos - 1;
                        this.posEnd = i39;
                        if (i39 > this.posStart) {
                            joinPC();
                        } else {
                            this.usePC = true;
                            this.pcStart = 0;
                            this.pcEnd = 0;
                        }
                    }
                    int i40 = this.pcEnd;
                    if (i40 >= this.f37822pc.length) {
                        ensurePC(i40);
                    }
                    if (cMore3 != '\n' || !z11) {
                        char[] cArr11 = this.f37822pc;
                        int i41 = this.pcEnd;
                        this.pcEnd = i41 + 1;
                        cArr11[i41] = ' ';
                    }
                } else if (this.usePC) {
                    int i42 = this.pcEnd;
                    if (i42 >= this.f37822pc.length) {
                        ensurePC(i42);
                    }
                    char[] cArr12 = this.f37822pc;
                    int i43 = this.pcEnd;
                    this.pcEnd = i43 + 1;
                    cArr12[i43] = cMore3;
                }
                z11 = cMore3 == '\r';
                str = null;
            }
        } catch (EOFException e5) {
            throw new XMLStreamException("Unexpected end of stream", getLocation(), e5);
        }
    }

    public void parseCDATA() throws XMLStreamException {
        try {
            if (more() != 'C' || more() != 'D' || more() != 'A' || more() != 'T' || more() != 'A' || more() != '[') {
                throw new XMLStreamException("expected <[CDATA[ for CDATA start", getLocation());
            }
            this.posStart = this.pos;
            int i10 = this.lineNumber;
            int i11 = this.columnNumber;
            int i12 = -2;
            int i13 = -1;
            int i14 = 0;
            boolean z10 = false;
            while (true) {
                i13++;
                try {
                    char cMore = more();
                    if (cMore == ']') {
                        i14++;
                    } else {
                        if (cMore == '>') {
                            if (i14 >= 2) {
                                break;
                            }
                        } else if (cMore == '\r') {
                            this.columnNumber = 1;
                            i12 = i13 + 2;
                            if (z10) {
                                i14 = 0;
                                cMore = '\n';
                            } else {
                                this.buf[this.pos - 1] = '\n';
                                i14 = 0;
                            }
                        } else if (cMore == '\n' && i12 == i13) {
                            this.posEnd = this.pos - 1;
                            i14 = 0;
                            z10 = true;
                        }
                        i14 = 0;
                    }
                    if (z10) {
                        char[] cArr = this.buf;
                        int i15 = this.posEnd;
                        cArr[i15] = cMore;
                        this.posEnd = i15 + 1;
                    }
                } catch (EOFException e5) {
                    StringBuffer stringBuffer = new StringBuffer("CDATA section on line ");
                    stringBuffer.append(i10);
                    stringBuffer.append(" and column ");
                    stringBuffer.append(i11);
                    stringBuffer.append(" was not closed");
                    throw new XMLStreamException(stringBuffer.toString(), getLocation(), e5);
                }
            }
            if (z10) {
                this.posEnd -= 2;
            } else {
                this.posEnd = this.pos - 3;
            }
        } catch (EOFException e7) {
            throw new XMLStreamException("Unexpected EOF in directive", getLocation(), e7);
        }
    }

    public void parseComment() throws XMLStreamException {
        try {
            if (more() != '-') {
                throw new XMLStreamException("expected <!-- for COMMENT start", getLocation());
            }
            this.posStart = this.pos;
            int i10 = this.lineNumber;
            int i11 = this.columnNumber;
            int i12 = -2;
            boolean z10 = false;
            int i13 = -1;
            int i14 = -2;
            while (true) {
                try {
                    char cMore = more();
                    i13++;
                    if (cMore == '-') {
                        if (i12 >= i13) {
                            break;
                        } else {
                            i12 = i13 + 2;
                        }
                    } else if (cMore == '\r') {
                        this.columnNumber = 1;
                        i14 = i13 + 2;
                        if (z10) {
                            cMore = '\n';
                        } else {
                            this.buf[this.pos - 1] = '\n';
                        }
                    } else if (cMore == '\n' && i14 == i13) {
                        if (!z10) {
                            this.posEnd = this.pos - 1;
                            z10 = true;
                        }
                    }
                    if (z10) {
                        char[] cArr = this.buf;
                        int i15 = this.posEnd;
                        cArr[i15] = cMore;
                        this.posEnd = i15 + 1;
                    }
                } catch (EOFException e5) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("COMMENT started on line ");
                    stringBuffer.append(i10);
                    stringBuffer.append(" and column ");
                    stringBuffer.append(i11);
                    stringBuffer.append(" was not closed");
                    throw new XMLStreamException(stringBuffer.toString(), getLocation(), e5);
                }
            }
            char cMore2 = more();
            if (cMore2 != '>') {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("in COMMENT after two dashes (--) next character must be '>' not ");
                stringBuffer2.append(printable(cMore2));
                throw new XMLStreamException(stringBuffer2.toString(), getLocation());
            }
            if (z10) {
                this.posEnd--;
            } else {
                this.posEnd = this.pos - 3;
            }
        } catch (EOFException e7) {
            throw new XMLStreamException("Unexpected end of stream", getLocation(), e7);
        }
    }

    public void parseDocdecl() throws XMLStreamException {
        char cMore;
        this.posStart = this.pos - 3;
        try {
            if (more() != 'O' || more() != 'C' || more() != 'T' || more() != 'Y' || more() != 'P' || more() != 'E') {
                throw new XMLStreamException("expected <!DOCTYPE", getLocation());
            }
            char cRequireNextS = requireNextS();
            if (!isNameStartChar(cRequireNextS)) {
                StringBuffer stringBuffer = new StringBuffer("expected name start character and not ");
                stringBuffer.append(printable(cRequireNextS));
                throw new XMLStreamException(stringBuffer.toString(), getLocation());
            }
            do {
                cMore = more();
            } while (isNameChar(cMore));
            char cSkipS = skipS(cMore);
            if (cSkipS == 'S' || cSkipS == 'P') {
                if (cSkipS == 'S') {
                    if (more() != 'Y' || more() != 'S' || more() != 'T' || more() != 'E' || more() != 'M') {
                        throw new XMLStreamException("expected keyword SYSTEM", getLocation());
                    }
                } else {
                    if (more() != 'U' || more() != 'B' || more() != 'L' || more() != 'I' || more() != 'C') {
                        throw new XMLStreamException("expected keyword PUBLIC", getLocation());
                    }
                    char cRequireNextS2 = requireNextS();
                    if (cRequireNextS2 != '\"' && cRequireNextS2 != '\'') {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("Public identifier has to be enclosed in quotes, not ");
                        stringBuffer2.append(printable(cSkipS));
                        throw new XMLStreamException(stringBuffer2.toString(), getLocation());
                    }
                    do {
                        cSkipS = more();
                    } while (cSkipS != cRequireNextS2);
                }
                char cRequireNextS3 = requireNextS();
                if (cRequireNextS3 != '\"' && cRequireNextS3 != '\'') {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("System identifier has to be enclosed in quotes, not ");
                    stringBuffer3.append(printable(cSkipS));
                    throw new XMLStreamException(stringBuffer3.toString(), getLocation());
                }
                while (more() != cRequireNextS3) {
                }
                cSkipS = skipS(more());
            }
            if (cSkipS != '[') {
                int i10 = this.pos;
                this.posEnd = i10;
                this.posStart = i10;
                char cSkipS2 = skipS(cSkipS);
                if (cSkipS2 == '>') {
                    return;
                }
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("Expected closing '>' after internal DTD subset, not '");
                stringBuffer4.append(printable(cSkipS2));
                stringBuffer4.append("'");
                throw new XMLStreamException(stringBuffer4.toString(), getLocation());
            }
            this.posStart = this.pos;
            int i11 = 1;
            while (true) {
                char cMore2 = more();
                if (cMore2 == '\"' || cMore2 == '\'') {
                    while (more() != cMore2) {
                    }
                } else if (cMore2 != '>') {
                    if (cMore2 == '[') {
                        i11++;
                    } else if (cMore2 == ']') {
                        i11--;
                    }
                } else if (i11 <= 0) {
                    this.posEnd = this.pos - 2;
                    processDTD();
                    return;
                }
            }
        } catch (EOFException e5) {
            throw new XMLStreamException("Unexpected end of stream", getLocation(), e5);
        }
    }

    public int parseEndTag() throws XMLStreamException {
        char cMore;
        this.eventType = 2;
        try {
            char cMore2 = more();
            if (!isNameStartChar(cMore2)) {
                StringBuffer stringBuffer = new StringBuffer("expected name start and not ");
                stringBuffer.append(printable(cMore2));
                throw new XMLStreamException(stringBuffer.toString(), getLocation());
            }
            int i10 = this.pos;
            this.posStart = i10 - 3;
            int i11 = (i10 - 1) + this.bufAbsoluteStart;
            do {
                cMore = more();
            } while (isNameChar(cMore));
            int i12 = this.pos - 1;
            int i13 = i11 - this.bufAbsoluteStart;
            int i14 = i12 - i13;
            char[][] cArr = this.elRawName;
            int i15 = this.depth;
            char[] cArr2 = cArr[i15];
            int i16 = this.elRawNameEnd[i15];
            if (i16 != i14) {
                String str = new String(cArr2, 0, i16);
                String str2 = new String(this.buf, i13, i14);
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("end tag name '");
                stringBuffer2.append(str2);
                stringBuffer2.append("' must match start tag name '");
                stringBuffer2.append(str);
                stringBuffer2.append("'");
                throw new XMLStreamException(stringBuffer2.toString(), getLocation());
            }
            int i17 = 0;
            while (i17 < i14) {
                int i18 = i13 + 1;
                if (this.buf[i13] != cArr2[i17]) {
                    String str3 = new String(cArr2, 0, i14);
                    String str4 = new String(this.buf, (i18 - i17) - 1, i14);
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("end tag name '");
                    stringBuffer3.append(str4);
                    stringBuffer3.append("' must be the same as start tag '");
                    stringBuffer3.append(str3);
                    stringBuffer3.append("'");
                    throw new XMLStreamException(stringBuffer3.toString(), getLocation());
                }
                i17++;
                i13 = i18;
            }
            while (isS(cMore)) {
                cMore = more();
            }
            if (cMore == '>') {
                this.posEnd = this.pos;
                this.pastEndTag = true;
                return 2;
            }
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("expected > to finsh end tag not ");
            stringBuffer4.append(printable(cMore));
            throw new XMLStreamException(stringBuffer4.toString(), getLocation());
        } catch (EOFException e5) {
            throw new XMLStreamException("Unexpected end of stream", getLocation(), e5);
        }
    }

    public char[] parseEntityRef(boolean z10) throws XMLStreamException {
        int i10;
        int i11;
        try {
            this.entityRefName = null;
            this.posStart = this.pos;
            if (more() == '#') {
                char cMore = more();
                if (cMore == 'x') {
                    i10 = 0;
                    do {
                        char cMore2 = more();
                        if (cMore2 == ';') {
                            break;
                        }
                        int i12 = i10 << 4;
                        if (cMore2 >= '0' && cMore2 <= '9') {
                            i11 = cMore2 - 48;
                        } else if (cMore2 >= 'a' && cMore2 <= 'f') {
                            i11 = cMore2 - 87;
                        } else {
                            if (cMore2 < 'A' || cMore2 > 'F') {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("character reference (with hex value) may not contain ");
                                stringBuffer.append(printable(cMore2));
                                throw new XMLStreamException(stringBuffer.toString(), getLocation());
                            }
                            i11 = cMore2 - 55;
                        }
                        i10 = i11 + i12;
                    } while (i10 <= MAX_UNICODE_CHAR);
                } else {
                    int i13 = 0;
                    do {
                        if (cMore < '0' || cMore > '9') {
                            if (cMore == ';') {
                                break;
                            }
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append("character reference (with decimal value) may not contain ");
                            stringBuffer2.append(printable(cMore));
                            throw new XMLStreamException(stringBuffer2.toString(), getLocation());
                        }
                        i13 = (i13 * 10) + (cMore - '0');
                        cMore = more();
                    } while (i13 <= MAX_UNICODE_CHAR);
                    i10 = i13;
                }
                this.posEnd = this.pos - 1;
                checkCharValidity(i10, false);
                if (i10 <= 65535) {
                    char[] cArr = this.charRefOneCharBuf;
                    cArr[0] = (char) i10;
                    this.entityValue = cArr;
                    return cArr;
                }
                if (this.charRefTwoCharBuf == null) {
                    this.charRefTwoCharBuf = new char[2];
                }
                int i14 = i10 - 65536;
                char[] cArr2 = this.charRefTwoCharBuf;
                cArr2[0] = (char) ((i14 >> 10) + GeneratorBase.SURR1_FIRST);
                cArr2[1] = (char) ((i14 & 1023) + 56320);
                this.entityValue = cArr2;
                return cArr2;
            }
            while (more() != ';') {
            }
            int i15 = this.pos - 1;
            this.posEnd = i15;
            int i16 = this.posStart;
            int i17 = i15 - i16;
            if (i17 == 2) {
                char[] cArr3 = this.buf;
                char c10 = cArr3[i16];
                if (c10 == 'l' && cArr3[i16 + 1] == 't') {
                    if (!z10) {
                        this.text = "<";
                    }
                    char[] cArr4 = this.charRefOneCharBuf;
                    cArr4[0] = Typography.less;
                    this.entityValue = cArr4;
                    return cArr4;
                }
                if (c10 == 'g' && cArr3[i16 + 1] == 't') {
                    if (!z10) {
                        this.text = ">";
                    }
                    char[] cArr5 = this.charRefOneCharBuf;
                    cArr5[0] = Typography.greater;
                    this.entityValue = cArr5;
                    return cArr5;
                }
            } else if (i17 == 3) {
                char[] cArr6 = this.buf;
                if (cArr6[i16] == 'a' && cArr6[i16 + 1] == 'm' && cArr6[i16 + 2] == 'p') {
                    if (!z10) {
                        this.text = "&";
                    }
                    char[] cArr7 = this.charRefOneCharBuf;
                    cArr7[0] = Typography.amp;
                    this.entityValue = cArr7;
                    return cArr7;
                }
            } else if (i17 == 4) {
                char[] cArr8 = this.buf;
                char c11 = cArr8[i16];
                if (c11 == 'a' && cArr8[i16 + 1] == 'p' && cArr8[i16 + 2] == 'o' && cArr8[i16 + 3] == 's') {
                    if (!z10) {
                        this.text = "'";
                    }
                    char[] cArr9 = this.charRefOneCharBuf;
                    cArr9[0] = '\'';
                    this.entityValue = cArr9;
                    return cArr9;
                }
                if (c11 == 'q' && cArr8[i16 + 1] == 'u' && cArr8[i16 + 2] == 'o' && cArr8[i16 + 3] == 't') {
                    if (!z10) {
                        this.text = "\"";
                    }
                    char[] cArr10 = this.charRefOneCharBuf;
                    cArr10[0] = '\"';
                    this.entityValue = cArr10;
                    return cArr10;
                }
            }
            char[] cArrLookupEntityReplacement = lookupEntityReplacement(i17);
            this.entityValue = cArrLookupEntityReplacement;
            return cArrLookupEntityReplacement;
        } catch (EOFException e5) {
            throw new XMLStreamException("Unexpected end of stream", getLocation(), e5);
        }
    }

    public int parseEpilog() throws XMLStreamException {
        if (this.eventType == 8) {
            throw new XMLStreamException("already reached end document", getLocation());
        }
        if (this.reachedEnd) {
            this.eventType = 8;
            return 8;
        }
        boolean z10 = false;
        try {
            char cMore = this.seenMarkup ? this.buf[this.pos - 1] : more();
            this.seenMarkup = false;
            this.posStart = this.pos - 1;
            while (true) {
                if (cMore == '<') {
                    if (z10 && this.tokenize) {
                        this.posEnd = this.pos - 1;
                        this.seenMarkup = true;
                        this.eventType = 6;
                        return 6;
                    }
                    char cMore2 = more();
                    if (cMore2 == '?') {
                        parsePI();
                        if (this.tokenize) {
                            this.eventType = 3;
                            return 3;
                        }
                    } else {
                        if (cMore2 != '!') {
                            if (cMore2 == '/') {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("end tag not allowed in epilog but got ");
                                stringBuffer.append(printable(cMore2));
                                throw new XMLStreamException(stringBuffer.toString(), getLocation());
                            }
                            if (isNameStartChar(cMore2)) {
                                StringBuffer stringBuffer2 = new StringBuffer();
                                stringBuffer2.append("start tag not allowed in epilog but got ");
                                stringBuffer2.append(printable(cMore2));
                                throw new XMLStreamException(stringBuffer2.toString(), getLocation());
                            }
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append("in epilog expected ignorable content and not ");
                            stringBuffer3.append(printable(cMore2));
                            throw new XMLStreamException(stringBuffer3.toString(), getLocation());
                        }
                        char cMore3 = more();
                        if (cMore3 == 'D') {
                            parseDocdecl();
                            if (this.tokenize) {
                                this.eventType = 11;
                                return 11;
                            }
                        } else {
                            if (cMore3 != '-') {
                                StringBuffer stringBuffer4 = new StringBuffer();
                                stringBuffer4.append("unexpected markup <!");
                                stringBuffer4.append(printable(cMore3));
                                throw new XMLStreamException(stringBuffer4.toString(), getLocation());
                            }
                            parseComment();
                            if (this.tokenize) {
                                this.eventType = 5;
                                return 5;
                            }
                        }
                    }
                } else {
                    if (!isS(cMore)) {
                        StringBuffer stringBuffer5 = new StringBuffer();
                        stringBuffer5.append("in epilog non whitespace content is not allowed but got ");
                        stringBuffer5.append(printable(cMore));
                        throw new XMLStreamException(stringBuffer5.toString(), getLocation());
                    }
                    z10 = true;
                }
                cMore = more();
            }
        } catch (EOFException unused) {
            this.reachedEnd = true;
            if (!this.tokenize || 0 == 0) {
                this.eventType = 8;
                return 8;
            }
            this.posEnd = this.pos;
            this.eventType = 6;
            return 6;
        }
    }

    public boolean parsePI() throws XMLStreamException {
        char cMore;
        int i10 = this.lineNumber;
        int i11 = this.columnNumber;
        try {
            this.piTarget = null;
            this.piData = null;
            this.posStart = this.pos;
            while (true) {
                cMore = more();
                if (cMore == '?') {
                    break;
                }
                if (!isNameChar(cMore)) {
                    if (isS(cMore)) {
                        break;
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("unexpected character ");
                    stringBuffer.append(printable(cMore));
                    stringBuffer.append(" after processing instruction name; expected a white space or '?>'");
                    throw new XMLStreamException(stringBuffer.toString(), getLocation());
                }
            }
            int i12 = this.pos;
            int i13 = this.posStart;
            boolean z10 = true;
            int i14 = (i12 - i13) - 1;
            if (i14 == 0) {
                throw new XMLStreamException("processing instruction must have PITarget name", getLocation());
            }
            this.piTarget = new String(this.buf, i13, i14);
            if (cMore != '?') {
                cMore = skipS(cMore);
            }
            boolean zEqualsIgnoreCase = this.piTarget.equalsIgnoreCase("xml");
            if (!zEqualsIgnoreCase) {
                this.posStart = this.pos - 1;
                int i15 = -2;
                boolean z11 = false;
                int i16 = -1;
                char cMore2 = cMore;
                int i17 = -2;
                while (true) {
                    int i18 = i16 + 1;
                    if (cMore2 == '?') {
                        i15 = i16 + 2;
                    } else if (cMore2 != '>') {
                        if (cMore2 == '\r') {
                            this.columnNumber = 1;
                            i17 = i16 + 2;
                            if (z11) {
                                cMore2 = '\n';
                            } else {
                                this.buf[this.pos - 1] = '\n';
                            }
                        } else if (cMore2 == '\n' && i17 == i18) {
                            if (!z11) {
                                this.posEnd = this.pos - 1;
                                z11 = true;
                            }
                        }
                        cMore2 = more();
                        i16 = i18;
                    } else if (i18 == i15) {
                        break;
                    }
                    if (z11) {
                        char[] cArr = this.buf;
                        int i19 = this.posEnd;
                        cArr[i19] = cMore2;
                        this.posEnd = i19 + 1;
                    }
                    cMore2 = more();
                    i16 = i18;
                }
                if (z11) {
                    this.posEnd--;
                } else {
                    this.posEnd = this.pos - 2;
                }
                z10 = zEqualsIgnoreCase;
            } else {
                if (this.posStart + this.bufAbsoluteStart > 2) {
                    throw new XMLStreamException("processing instruction can not have PITarget with reserved name 'xml'", getLocation());
                }
                if (!"xml".equals(this.piTarget)) {
                    throw new XMLStreamException("XMLDecl must have xml name in lowercase", getLocation());
                }
                this.posStart = this.pos - 1;
                parseXmlDecl(cMore);
                this.posEnd = this.pos - 2;
            }
            char[] cArr2 = this.buf;
            int i20 = this.posStart;
            this.piData = new String(cArr2, i20, this.posEnd - i20);
            return z10;
        } catch (EOFException e5) {
            StringBuffer stringBuffer2 = new StringBuffer("processing instruction started on line ");
            stringBuffer2.append(i10);
            stringBuffer2.append(" and column ");
            stringBuffer2.append(i11);
            stringBuffer2.append(" was not closed");
            throw new XMLStreamException(stringBuffer2.toString(), getLocation(), e5);
        }
    }

    public int parseProlog() throws XMLStreamException {
        try {
            char cMore = this.seenMarkup ? this.buf[this.pos - 1] : more();
            if (this.eventType == 7) {
                if (cMore == 65534) {
                    throw new XMLStreamException("first character in input was UNICODE noncharacter (0xFFFE)- input requires int swapping", getLocation());
                }
                if (cMore == 65279) {
                    cMore = more();
                }
            }
            boolean z10 = false;
            this.seenMarkup = false;
            this.posStart = this.pos - 1;
            while (true) {
                if (cMore == '<') {
                    if (z10 && this.tokenize) {
                        this.posEnd = this.pos - 1;
                        this.seenMarkup = true;
                        this.eventType = 6;
                        return 6;
                    }
                    char cMore2 = more();
                    if (cMore2 == '?') {
                        boolean pi2 = parsePI();
                        if (this.tokenize) {
                            if (pi2) {
                                this.eventType = 7;
                                return 7;
                            }
                            this.eventType = 3;
                            return 3;
                        }
                    } else {
                        if (cMore2 != '!') {
                            if (cMore2 == '/') {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("expected start tag name and not ");
                                stringBuffer.append(printable(cMore2));
                                throw new XMLStreamException(stringBuffer.toString(), getLocation());
                            }
                            if (isNameStartChar(cMore2)) {
                                this.seenRoot = true;
                                return parseStartTag();
                            }
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append("expected start tag name and not ");
                            stringBuffer2.append(printable(cMore2));
                            throw new XMLStreamException(stringBuffer2.toString(), getLocation());
                        }
                        char cMore3 = more();
                        if (cMore3 == 'D') {
                            if (this.seenDocdecl) {
                                throw new XMLStreamException("only one docdecl allowed in XML document", getLocation());
                            }
                            this.seenDocdecl = true;
                            parseDocdecl();
                            if (this.tokenize) {
                                this.eventType = 11;
                                return 11;
                            }
                        } else {
                            if (cMore3 != '-') {
                                StringBuffer stringBuffer3 = new StringBuffer();
                                stringBuffer3.append("unexpected markup <!");
                                stringBuffer3.append(printable(cMore3));
                                throw new XMLStreamException(stringBuffer3.toString(), getLocation());
                            }
                            parseComment();
                            if (this.tokenize) {
                                this.eventType = 5;
                                return 5;
                            }
                        }
                    }
                } else {
                    if (!isS(cMore)) {
                        StringBuffer stringBuffer4 = new StringBuffer();
                        stringBuffer4.append("only whitespace content allowed before start tag and not ");
                        stringBuffer4.append(printable(cMore));
                        throw new XMLStreamException(stringBuffer4.toString(), getLocation());
                    }
                    z10 = true;
                }
                cMore = more();
            }
        } catch (EOFException e5) {
            throw new XMLStreamException("Unexpected end of stream", getLocation(), e5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x021c  */
    /* JADX WARN: Code duplicated, block: B:162:0x021d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x018f A[Catch: EOFException -> 0x0034, TryCatch #0 {EOFException -> 0x0034, blocks: (B:3:0x0003, B:5:0x0023, B:8:0x0028, B:9:0x0033, B:13:0x0039, B:15:0x0043, B:17:0x0056, B:20:0x005f, B:23:0x0075, B:26:0x00bc, B:28:0x00c2, B:37:0x00dd, B:40:0x00e7, B:43:0x00ef, B:44:0x00f2, B:45:0x010c, B:46:0x010d, B:47:0x0114, B:49:0x0118, B:51:0x011e, B:53:0x0124, B:57:0x014a, B:54:0x0129, B:55:0x0143, B:56:0x0144, B:59:0x014e, B:63:0x0155, B:65:0x015d, B:67:0x0161, B:75:0x0185, B:77:0x018f, B:78:0x01a5, B:80:0x01af, B:81:0x01c5, B:82:0x01e3, B:69:0x016d, B:71:0x0171, B:73:0x0179, B:83:0x01e4, B:84:0x01e8, B:105:0x0248, B:108:0x025a, B:109:0x0270, B:86:0x01ed, B:90:0x01f4, B:92:0x01f8, B:101:0x021d, B:102:0x0241, B:94:0x0204, B:96:0x0208, B:98:0x0210, B:103:0x0242, B:104:0x0245, B:35:0x00d5, B:111:0x0274, B:112:0x0292, B:113:0x0293, B:118:0x029e, B:119:0x02a9, B:120:0x02aa, B:121:0x02b3, B:122:0x02d1, B:24:0x009d, B:25:0x00af, B:19:0x0059, B:124:0x02d4, B:127:0x02da, B:128:0x02e2, B:129:0x02ed), top: B:132:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01af A[Catch: EOFException -> 0x0034, TryCatch #0 {EOFException -> 0x0034, blocks: (B:3:0x0003, B:5:0x0023, B:8:0x0028, B:9:0x0033, B:13:0x0039, B:15:0x0043, B:17:0x0056, B:20:0x005f, B:23:0x0075, B:26:0x00bc, B:28:0x00c2, B:37:0x00dd, B:40:0x00e7, B:43:0x00ef, B:44:0x00f2, B:45:0x010c, B:46:0x010d, B:47:0x0114, B:49:0x0118, B:51:0x011e, B:53:0x0124, B:57:0x014a, B:54:0x0129, B:55:0x0143, B:56:0x0144, B:59:0x014e, B:63:0x0155, B:65:0x015d, B:67:0x0161, B:75:0x0185, B:77:0x018f, B:78:0x01a5, B:80:0x01af, B:81:0x01c5, B:82:0x01e3, B:69:0x016d, B:71:0x0171, B:73:0x0179, B:83:0x01e4, B:84:0x01e8, B:105:0x0248, B:108:0x025a, B:109:0x0270, B:86:0x01ed, B:90:0x01f4, B:92:0x01f8, B:101:0x021d, B:102:0x0241, B:94:0x0204, B:96:0x0208, B:98:0x0210, B:103:0x0242, B:104:0x0245, B:35:0x00d5, B:111:0x0274, B:112:0x0292, B:113:0x0293, B:118:0x029e, B:119:0x02a9, B:120:0x02aa, B:121:0x02b3, B:122:0x02d1, B:24:0x009d, B:25:0x00af, B:19:0x0059, B:124:0x02d4, B:127:0x02da, B:128:0x02e2, B:129:0x02ed), top: B:132:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0204 A[Catch: EOFException -> 0x0034, TryCatch #0 {EOFException -> 0x0034, blocks: (B:3:0x0003, B:5:0x0023, B:8:0x0028, B:9:0x0033, B:13:0x0039, B:15:0x0043, B:17:0x0056, B:20:0x005f, B:23:0x0075, B:26:0x00bc, B:28:0x00c2, B:37:0x00dd, B:40:0x00e7, B:43:0x00ef, B:44:0x00f2, B:45:0x010c, B:46:0x010d, B:47:0x0114, B:49:0x0118, B:51:0x011e, B:53:0x0124, B:57:0x014a, B:54:0x0129, B:55:0x0143, B:56:0x0144, B:59:0x014e, B:63:0x0155, B:65:0x015d, B:67:0x0161, B:75:0x0185, B:77:0x018f, B:78:0x01a5, B:80:0x01af, B:81:0x01c5, B:82:0x01e3, B:69:0x016d, B:71:0x0171, B:73:0x0179, B:83:0x01e4, B:84:0x01e8, B:105:0x0248, B:108:0x025a, B:109:0x0270, B:86:0x01ed, B:90:0x01f4, B:92:0x01f8, B:101:0x021d, B:102:0x0241, B:94:0x0204, B:96:0x0208, B:98:0x0210, B:103:0x0242, B:104:0x0245, B:35:0x00d5, B:111:0x0274, B:112:0x0292, B:113:0x0293, B:118:0x029e, B:119:0x02a9, B:120:0x02aa, B:121:0x02b3, B:122:0x02d1, B:24:0x009d, B:25:0x00af, B:19:0x0059, B:124:0x02d4, B:127:0x02da, B:128:0x02e2, B:129:0x02ed), top: B:132:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0208 A[Catch: EOFException -> 0x0034, TryCatch #0 {EOFException -> 0x0034, blocks: (B:3:0x0003, B:5:0x0023, B:8:0x0028, B:9:0x0033, B:13:0x0039, B:15:0x0043, B:17:0x0056, B:20:0x005f, B:23:0x0075, B:26:0x00bc, B:28:0x00c2, B:37:0x00dd, B:40:0x00e7, B:43:0x00ef, B:44:0x00f2, B:45:0x010c, B:46:0x010d, B:47:0x0114, B:49:0x0118, B:51:0x011e, B:53:0x0124, B:57:0x014a, B:54:0x0129, B:55:0x0143, B:56:0x0144, B:59:0x014e, B:63:0x0155, B:65:0x015d, B:67:0x0161, B:75:0x0185, B:77:0x018f, B:78:0x01a5, B:80:0x01af, B:81:0x01c5, B:82:0x01e3, B:69:0x016d, B:71:0x0171, B:73:0x0179, B:83:0x01e4, B:84:0x01e8, B:105:0x0248, B:108:0x025a, B:109:0x0270, B:86:0x01ed, B:90:0x01f4, B:92:0x01f8, B:101:0x021d, B:102:0x0241, B:94:0x0204, B:96:0x0208, B:98:0x0210, B:103:0x0242, B:104:0x0245, B:35:0x00d5, B:111:0x0274, B:112:0x0292, B:113:0x0293, B:118:0x029e, B:119:0x02a9, B:120:0x02aa, B:121:0x02b3, B:122:0x02d1, B:24:0x009d, B:25:0x00af, B:19:0x0059, B:124:0x02d4, B:127:0x02da, B:128:0x02e2, B:129:0x02ed), top: B:132:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0210 A[Catch: EOFException -> 0x0034, TryCatch #0 {EOFException -> 0x0034, blocks: (B:3:0x0003, B:5:0x0023, B:8:0x0028, B:9:0x0033, B:13:0x0039, B:15:0x0043, B:17:0x0056, B:20:0x005f, B:23:0x0075, B:26:0x00bc, B:28:0x00c2, B:37:0x00dd, B:40:0x00e7, B:43:0x00ef, B:44:0x00f2, B:45:0x010c, B:46:0x010d, B:47:0x0114, B:49:0x0118, B:51:0x011e, B:53:0x0124, B:57:0x014a, B:54:0x0129, B:55:0x0143, B:56:0x0144, B:59:0x014e, B:63:0x0155, B:65:0x015d, B:67:0x0161, B:75:0x0185, B:77:0x018f, B:78:0x01a5, B:80:0x01af, B:81:0x01c5, B:82:0x01e3, B:69:0x016d, B:71:0x0171, B:73:0x0179, B:83:0x01e4, B:84:0x01e8, B:105:0x0248, B:108:0x025a, B:109:0x0270, B:86:0x01ed, B:90:0x01f4, B:92:0x01f8, B:101:0x021d, B:102:0x0241, B:94:0x0204, B:96:0x0208, B:98:0x0210, B:103:0x0242, B:104:0x0245, B:35:0x00d5, B:111:0x0274, B:112:0x0292, B:113:0x0293, B:118:0x029e, B:119:0x02a9, B:120:0x02aa, B:121:0x02b3, B:122:0x02d1, B:24:0x009d, B:25:0x00af, B:19:0x0059, B:124:0x02d4, B:127:0x02da, B:128:0x02e2, B:129:0x02ed), top: B:132:0x0003 }] */
    public int parseStartTag() throws XMLStreamException {
        String strNewString;
        int[] iArr;
        Object[] objArr;
        String string;
        String string2;
        this.eventType = 1;
        try {
            this.depth++;
            int i10 = this.pos;
            this.posStart = i10 - 2;
            this.emptyElementTag = false;
            this.attributeCount = 0;
            this.localNamespaceEnd = 0;
            int i11 = (i10 - 1) + this.bufAbsoluteStart;
            if (this.buf[i10 - 1] == ':' && this.processNamespaces) {
                throw new XMLStreamException("when namespaces processing enabled colon can not be at element name start", getLocation());
            }
            int i12 = -1;
            while (true) {
                char cMore = more();
                if (!isNameChar(cMore)) {
                    ensureElementsCapacity();
                    int i13 = this.pos - 1;
                    int i14 = this.bufAbsoluteStart;
                    int i15 = i13 - (i11 - i14);
                    char[][] cArr = this.elRawName;
                    int i16 = this.depth;
                    char[] cArr2 = cArr[i16];
                    if (cArr2 == null || cArr2.length < i15) {
                        cArr[i16] = new char[i15 * 2];
                    }
                    System.arraycopy(this.buf, i11 - i14, cArr[i16], 0, i15);
                    int[] iArr2 = this.elRawNameEnd;
                    int i17 = this.depth;
                    iArr2[i17] = i15;
                    String strNewString2 = null;
                    if (!this.processNamespaces) {
                        String[] strArr = this.elName;
                        strNewString = newString(this.buf, i11 - this.bufAbsoluteStart, i15);
                        strArr[i17] = strNewString;
                    } else if (i12 != -1) {
                        String[] strArr2 = this.elPrefix;
                        strNewString2 = newString(this.buf, i11 - this.bufAbsoluteStart, i12 - i11);
                        strArr2[i17] = strNewString2;
                        String[] strArr3 = this.elName;
                        int i18 = this.depth;
                        char[] cArr3 = this.buf;
                        int i19 = this.bufAbsoluteStart;
                        strNewString = newString(cArr3, (i12 + 1) - i19, (this.pos - 2) - (i12 - i19));
                        strArr3[i18] = strNewString;
                    } else {
                        this.elPrefix[i17] = null;
                        String[] strArr4 = this.elName;
                        strNewString = newString(this.buf, i11 - this.bufAbsoluteStart, i15);
                        strArr4[i17] = strNewString;
                    }
                    while (true) {
                        boolean zIsS = isS(cMore);
                        if (zIsS) {
                            do {
                                cMore = more();
                            } while (isS(cMore));
                        }
                        if (cMore == '>') {
                            break;
                        }
                        if (cMore == '/') {
                            this.emptyElementTag = true;
                            char cMore2 = more();
                            if (cMore2 == '>') {
                                break;
                            }
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("expected > to end empty tag not ");
                            stringBuffer.append(printable(cMore2));
                            throw new XMLStreamException(stringBuffer.toString(), getLocation());
                        }
                        if (!isNameStartChar(cMore)) {
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append("start tag unexpected character ");
                            stringBuffer2.append(printable(cMore));
                            throw new XMLStreamException(stringBuffer2.toString(), getLocation());
                        }
                        if (!zIsS && cMore != '>') {
                            throw new XMLStreamException("expected a white space between attributes", getLocation());
                        }
                        parseAttribute();
                        cMore = more();
                    }
                    if (this.processNamespaces) {
                        String namespaceURI = getNamespaceURI(strNewString2);
                        if (namespaceURI == null) {
                            if (strNewString2 != null) {
                                StringBuffer stringBuffer3 = new StringBuffer();
                                stringBuffer3.append("could not determine namespace bound to element prefix ");
                                stringBuffer3.append(strNewString2);
                                throw new XMLStreamException(stringBuffer3.toString(), getLocation());
                            }
                            namespaceURI = NO_NAMESPACE;
                        }
                        this.elUri[this.depth] = namespaceURI;
                        for (int i20 = 0; i20 < this.attributeCount; i20++) {
                            String str = this.attributePrefix[i20];
                            if (str != null) {
                                String namespaceURI2 = getNamespaceURI(str);
                                if (namespaceURI2 == null) {
                                    StringBuffer stringBuffer4 = new StringBuffer();
                                    stringBuffer4.append("could not determine namespace bound to attribute prefix ");
                                    stringBuffer4.append(str);
                                    throw new XMLStreamException(stringBuffer4.toString(), getLocation());
                                }
                                this.attributeUri[i20] = namespaceURI2;
                            } else {
                                this.attributeUri[i20] = NO_NAMESPACE;
                            }
                        }
                        int i21 = 1;
                        while (true) {
                            if (i21 < this.attributeCount) {
                                int i22 = 0;
                                while (true) {
                                    if (i22 < i21) {
                                        String[] strArr5 = this.attributeUri;
                                        if (strArr5[i22] == strArr5[i21]) {
                                            if (this.allStringsInterned) {
                                                Object[] objArr2 = this.attributeName;
                                                if (!objArr2[i22].equals(objArr2[i21])) {
                                                }
                                                string = this.attributeName[i22];
                                                if (this.attributeUri[i22] != null) {
                                                    StringBuffer stringBuffer5 = new StringBuffer();
                                                    stringBuffer5.append(this.attributeUri[i22]);
                                                    stringBuffer5.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                                                    stringBuffer5.append(string);
                                                    string = stringBuffer5.toString();
                                                }
                                                string2 = this.attributeName[i21];
                                                if (this.attributeUri[i21] != null) {
                                                    StringBuffer stringBuffer6 = new StringBuffer();
                                                    stringBuffer6.append(this.attributeUri[i21]);
                                                    stringBuffer6.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                                                    stringBuffer6.append(string2);
                                                    string2 = stringBuffer6.toString();
                                                }
                                                StringBuffer stringBuffer7 = new StringBuffer();
                                                stringBuffer7.append("duplicated attributes ");
                                                stringBuffer7.append(string);
                                                stringBuffer7.append(" and ");
                                                stringBuffer7.append(string2);
                                                throw new XMLStreamException(stringBuffer7.toString(), getLocation());
                                            }
                                            if (this.allStringsInterned) {
                                                continue;
                                            } else {
                                                int[] iArr3 = this.attributeNameHash;
                                                if (iArr3[i22] == iArr3[i21]) {
                                                    Object[] objArr3 = this.attributeName;
                                                    if (objArr3[i22].equals(objArr3[i21])) {
                                                        string = this.attributeName[i22];
                                                        if (this.attributeUri[i22] != null) {
                                                            StringBuffer stringBuffer8 = new StringBuffer();
                                                            stringBuffer8.append(this.attributeUri[i22]);
                                                            stringBuffer8.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                                                            stringBuffer8.append(string);
                                                            string = stringBuffer8.toString();
                                                        }
                                                        string2 = this.attributeName[i21];
                                                        if (this.attributeUri[i21] != null) {
                                                            StringBuffer stringBuffer9 = new StringBuffer();
                                                            stringBuffer9.append(this.attributeUri[i21]);
                                                            stringBuffer9.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                                                            stringBuffer9.append(string2);
                                                            string2 = stringBuffer9.toString();
                                                        }
                                                        StringBuffer stringBuffer10 = new StringBuffer();
                                                        stringBuffer10.append("duplicated attributes ");
                                                        stringBuffer10.append(string);
                                                        stringBuffer10.append(" and ");
                                                        stringBuffer10.append(string2);
                                                        throw new XMLStreamException(stringBuffer10.toString(), getLocation());
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                        i22++;
                                    } else {
                                        i21++;
                                    }
                                }
                            }
                        }
                    } else {
                        for (int i23 = 1; i23 < this.attributeCount; i23++) {
                            for (int i24 = 0; i24 < i23; i24++) {
                                if (this.allStringsInterned) {
                                    Object[] objArr4 = this.attributeName;
                                    if (!objArr4[i24].equals(objArr4[i23])) {
                                        if (!this.allStringsInterned) {
                                            iArr = this.attributeNameHash;
                                            if (iArr[i24] == iArr[i23]) {
                                                objArr = this.attributeName;
                                                if (!objArr[i24].equals(objArr[i23])) {
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                } else {
                                    if (!this.allStringsInterned) {
                                        iArr = this.attributeNameHash;
                                        if (iArr[i24] == iArr[i23]) {
                                            objArr = this.attributeName;
                                            if (!objArr[i24].equals(objArr[i23])) {
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                                String[] strArr6 = this.attributeName;
                                String str2 = strArr6[i24];
                                String str3 = strArr6[i23];
                                StringBuffer stringBuffer11 = new StringBuffer();
                                stringBuffer11.append("duplicated attributes ");
                                stringBuffer11.append(str2);
                                stringBuffer11.append(" and ");
                                stringBuffer11.append(str3);
                                throw new XMLStreamException(stringBuffer11.toString(), getLocation());
                            }
                        }
                    }
                    this.elNamespaceCount[this.depth] = this.namespaceEnd;
                    this.posEnd = this.pos;
                    if (this.defaultAttributes != null) {
                        if (strNewString2 != null) {
                            StringBuffer stringBuffer12 = new StringBuffer();
                            stringBuffer12.append(strNewString2);
                            stringBuffer12.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                            stringBuffer12.append(strNewString);
                            addDefaultAttributes(stringBuffer12.toString());
                        } else {
                            addDefaultAttributes(strNewString);
                        }
                    }
                    return 1;
                }
                if (cMore == ':' && this.processNamespaces) {
                    if (i12 != -1) {
                        throw new XMLStreamException("only one colon is allowed in name of element when namespaces are enabled", getLocation());
                    }
                    i12 = (this.pos - 1) + this.bufAbsoluteStart;
                }
            }
        } catch (EOFException e5) {
            throw new XMLStreamException("Unexpected end of stream", getLocation(), e5);
        }
    }

    public void parseXmlDecl(char c10) throws XMLStreamException {
        try {
            char cSkipS = skipS(requireInput(skipS(c10), VERSION));
            if (cSkipS != '=') {
                StringBuffer stringBuffer = new StringBuffer("expected equals sign (=) after version and not ");
                stringBuffer.append(printable(cSkipS));
                throw new XMLStreamException(stringBuffer.toString(), getLocation());
            }
            char cSkipS2 = skipS(more());
            if (cSkipS2 != '\'' && cSkipS2 != '\"') {
                StringBuffer stringBuffer2 = new StringBuffer("expected apostrophe (') or quotation mark (\") after version and not ");
                stringBuffer2.append(printable(cSkipS2));
                throw new XMLStreamException(stringBuffer2.toString(), getLocation());
            }
            int i10 = this.pos;
            char cMore = more();
            while (cMore != cSkipS2) {
                if ((cMore < 'a' || cMore > 'z') && ((cMore < 'A' || cMore > 'Z') && ((cMore < '0' || cMore > '9') && cMore != '_' && cMore != '.' && cMore != ':' && cMore != '-'))) {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("<?xml version value expected to be in ([a-zA-Z0-9_.:] | '-') not ");
                    stringBuffer3.append(printable(cMore));
                    throw new XMLStreamException(stringBuffer3.toString(), getLocation());
                }
                cMore = more();
            }
            parseXmlDeclWithVersion(i10, this.pos - 1);
        } catch (EOFException e5) {
            throw new XMLStreamException("Unexpected end of stream", getLocation(), e5);
        }
    }

    public void parseXmlDeclWithVersion(int i10, int i11) throws XMLStreamException {
        char cRequireInput;
        int i12 = i11 - i10;
        if (i12 == 3) {
            try {
                char[] cArr = this.buf;
                if (cArr[i10] == '1' && cArr[i10 + 1] == '.' && cArr[i10 + 2] == '0') {
                    this.xmlVersion = new String(cArr, i10, i12);
                    char cSkipS = skipS(more());
                    if (cSkipS != '?') {
                        cSkipS = skipS(cSkipS);
                        char[] cArr2 = ENCODING;
                        if (cSkipS == cArr2[0]) {
                            char cSkipS2 = skipS(requireInput(cSkipS, cArr2));
                            if (cSkipS2 != '=') {
                                StringBuffer stringBuffer = new StringBuffer("expected equals sign (=) after encoding and not ");
                                stringBuffer.append(printable(cSkipS2));
                                throw new XMLStreamException(stringBuffer.toString(), getLocation());
                            }
                            char cSkipS3 = skipS(more());
                            if (cSkipS3 != '\'' && cSkipS3 != '\"') {
                                StringBuffer stringBuffer2 = new StringBuffer("expected apostrophe (') or quotation mark (\") after encoding and not ");
                                stringBuffer2.append(printable(cSkipS3));
                                throw new XMLStreamException(stringBuffer2.toString(), getLocation());
                            }
                            int i13 = this.pos;
                            char cMore = more();
                            if ((cMore < 'a' || cMore > 'z') && (cMore < 'A' || cMore > 'Z')) {
                                StringBuffer stringBuffer3 = new StringBuffer("<?xml encoding name expected to start with [A-Za-z] not ");
                                stringBuffer3.append(printable(cMore));
                                throw new XMLStreamException(stringBuffer3.toString(), getLocation());
                            }
                            char cMore2 = more();
                            while (cMore2 != cSkipS3) {
                                if ((cMore2 < 'a' || cMore2 > 'z') && ((cMore2 < 'A' || cMore2 > 'Z') && ((cMore2 < '0' || cMore2 > '9') && cMore2 != '.' && cMore2 != '_' && cMore2 != '-'))) {
                                    StringBuffer stringBuffer4 = new StringBuffer();
                                    stringBuffer4.append("<?xml encoding value expected to be in ([A-Za-z0-9._] | '-') not ");
                                    stringBuffer4.append(printable(cMore2));
                                    throw new XMLStreamException(stringBuffer4.toString(), getLocation());
                                }
                                cMore2 = more();
                            }
                            this.charEncodingScheme = newString(this.buf, i13, (this.pos - 1) - i13);
                            cSkipS = skipS(more());
                        }
                        if (cSkipS != '?') {
                            char cSkipS4 = skipS(requireInput(skipS(cSkipS), STANDALONE));
                            if (cSkipS4 != '=') {
                                StringBuffer stringBuffer5 = new StringBuffer();
                                stringBuffer5.append("expected equals sign (=) after standalone and not ");
                                stringBuffer5.append(printable(cSkipS4));
                                throw new XMLStreamException(stringBuffer5.toString(), getLocation());
                            }
                            char cSkipS5 = skipS(more());
                            if (cSkipS5 != '\'' && cSkipS5 != '\"') {
                                StringBuffer stringBuffer6 = new StringBuffer();
                                stringBuffer6.append("expected apostrophe (') or quotation mark (\") after encoding and not ");
                                stringBuffer6.append(printable(cSkipS5));
                                throw new XMLStreamException(stringBuffer6.toString(), getLocation());
                            }
                            char cMore3 = more();
                            if (cMore3 == 'y') {
                                cRequireInput = requireInput(cMore3, YES);
                                this.standalone = true;
                            } else {
                                if (cMore3 != 'n') {
                                    StringBuffer stringBuffer7 = new StringBuffer();
                                    stringBuffer7.append("expected 'yes' or 'no' after standalone and not ");
                                    stringBuffer7.append(printable(cMore3));
                                    throw new XMLStreamException(stringBuffer7.toString(), getLocation());
                                }
                                cRequireInput = requireInput(cMore3, NO);
                                this.standalone = false;
                            }
                            this.standaloneSet = true;
                            if (cRequireInput != cSkipS5) {
                                StringBuffer stringBuffer8 = new StringBuffer();
                                stringBuffer8.append("expected ");
                                stringBuffer8.append(cSkipS5);
                                stringBuffer8.append(" after standalone value not ");
                                stringBuffer8.append(printable(cRequireInput));
                                throw new XMLStreamException(stringBuffer8.toString(), getLocation());
                            }
                            cSkipS = more();
                        }
                    }
                    char cSkipS6 = skipS(cSkipS);
                    if (cSkipS6 != '?') {
                        StringBuffer stringBuffer9 = new StringBuffer();
                        stringBuffer9.append("expected ?> as last part of <?xml not ");
                        stringBuffer9.append(printable(cSkipS6));
                        throw new XMLStreamException(stringBuffer9.toString(), getLocation());
                    }
                    char cMore4 = more();
                    if (cMore4 == '>') {
                        return;
                    }
                    StringBuffer stringBuffer10 = new StringBuffer();
                    stringBuffer10.append("expected ?> as last part of <?xml not ");
                    stringBuffer10.append(printable(cMore4));
                    throw new XMLStreamException(stringBuffer10.toString(), getLocation());
                }
            } catch (EOFException e5) {
                throw new XMLStreamException("Unexpected end of stream", getLocation(), e5);
            }
        }
        StringBuffer stringBuffer11 = new StringBuffer("only 1.0 is supported as <?xml version not '");
        stringBuffer11.append(printable(new String(this.buf, i10, i11)));
        stringBuffer11.append("'");
        throw new XMLStreamException(stringBuffer11.toString(), getLocation());
    }

    public String printable(char c10) {
        if (c10 == '\n') {
            return "\\n";
        }
        if (c10 == '\r') {
            return "\\r";
        }
        if (c10 == '\t') {
            return "\\t";
        }
        if (c10 == '\'') {
            return "\\'";
        }
        if (c10 > 127 || c10 < ' ') {
            StringBuffer stringBuffer = new StringBuffer("\\u");
            stringBuffer.append(Integer.toHexString(c10));
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer("");
        stringBuffer2.append(c10);
        return stringBuffer2.toString();
    }

    public void processDTD() throws XMLStreamException {
        try {
            char[] cArr = this.buf;
            int i10 = this.posStart;
            DTD dtd = new DTDParser(new StringReader(new String(cArr, i10, this.posEnd - i10))).parse();
            this.mDtdIntSubset = dtd;
            Class clsB = f37817e;
            if (clsB == null) {
                clsB = b("com.wutka.dtd.DTDEntity");
                f37817e = clsB;
            }
            Enumeration enumerationElements = dtd.getItemsByType(clsB).elements();
            while (enumerationElements.hasMoreElements()) {
                DTDEntity dTDEntity = (DTDEntity) enumerationElements.nextElement();
                if (!dTDEntity.isParsed()) {
                    defineEntityReplacementText(dTDEntity.getName(), dTDEntity.getValue());
                }
            }
            DTD dtd2 = this.mDtdIntSubset;
            Class clsB2 = f37818f;
            if (clsB2 == null) {
                clsB2 = b("com.wutka.dtd.DTDAttlist");
                f37818f = clsB2;
            }
            Enumeration enumerationElements2 = dtd2.getItemsByType(clsB2).elements();
            while (enumerationElements2.hasMoreElements()) {
                DTDAttlist dTDAttlist = (DTDAttlist) enumerationElements2.nextElement();
                for (DTDAttribute dTDAttribute : dTDAttlist.getAttribute()) {
                    if (dTDAttribute.getDefaultValue() != null) {
                        if (this.defaultAttributes == null) {
                            this.defaultAttributes = new HashMap();
                        }
                        this.defaultAttributes.put(dTDAttlist.getName(), dTDAttlist);
                    }
                }
            }
        } catch (IOException e5) {
            throw new XMLStreamException(e5);
        }
    }

    public void recycle() throws XMLStreamException {
        e();
    }

    /* JADX WARN: Code duplicated, block: B:74:0x016f A[ORIG_RETURN, RETURN] */
    @Override // javax.xml.stream.XMLStreamReader
    public void require(int i10, String str, String str2) throws XMLStreamException {
        String string;
        String string2;
        String string3;
        String string4;
        int eventType = getEventType();
        boolean zEquals = i10 == eventType;
        if (zEquals && str2 != null) {
            if (eventType != 1 && eventType != 2 && eventType != 9) {
                StringBuffer stringBuffer = new StringBuffer("Using non-null local name argument for require(); ");
                stringBuffer.append(ElementTypeNames.getEventTypeString(eventType));
                stringBuffer.append(" event does not have local name");
                throw new XMLStreamException(stringBuffer.toString(), getLocation());
            }
            zEquals = str2.equals(getLocalName());
        }
        if (zEquals && str != null && (eventType == 1 || eventType == 1)) {
            String namespaceURI = getNamespaceURI();
            if (str.length() != 0) {
                zEquals = str.equals(namespaceURI);
                if (zEquals) {
                    return;
                }
            } else if (namespaceURI == null) {
                return;
            }
        } else if (zEquals) {
            return;
        }
        StringBuffer stringBuffer2 = new StringBuffer("expected event ");
        stringBuffer2.append(ElementTypeNames.getEventTypeString(i10));
        String string5 = "";
        if (str2 != null) {
            StringBuffer stringBuffer3 = new StringBuffer(" with name '");
            stringBuffer3.append(str2);
            stringBuffer3.append("'");
            string = stringBuffer3.toString();
        } else {
            string = "";
        }
        stringBuffer2.append(string);
        stringBuffer2.append((str == null || str2 == null) ? "" : " and");
        if (str != null) {
            StringBuffer stringBuffer4 = new StringBuffer(" with namespace '");
            stringBuffer4.append(str);
            stringBuffer4.append("'");
            string2 = stringBuffer4.toString();
        } else {
            string2 = "";
        }
        stringBuffer2.append(string2);
        stringBuffer2.append(" but got");
        if (i10 != getEventType()) {
            StringBuffer stringBuffer5 = new StringBuffer(" ");
            stringBuffer5.append(ElementTypeNames.getEventTypeString(getEventType()));
            string3 = stringBuffer5.toString();
        } else {
            string3 = "";
        }
        stringBuffer2.append(string3);
        if (str2 == null || getLocalName() == null || str2.equals(getName())) {
            string4 = "";
        } else {
            StringBuffer stringBuffer6 = new StringBuffer(" name '");
            stringBuffer6.append(getLocalName());
            stringBuffer6.append("'");
            string4 = stringBuffer6.toString();
        }
        stringBuffer2.append(string4);
        stringBuffer2.append((str == null || str2 == null || getLocalName() == null || str2.equals(getName()) || getNamespaceURI() == null || str.equals(getNamespaceURI())) ? "" : " and");
        if (str != null && getNamespaceURI() != null && !str.equals(getNamespaceURI())) {
            StringBuffer stringBuffer7 = new StringBuffer(" namespace '");
            stringBuffer7.append(getNamespaceURI());
            stringBuffer7.append("'");
            string5 = stringBuffer7.toString();
        }
        stringBuffer2.append(string5);
        stringBuffer2.append(" (position:");
        stringBuffer2.append(getPositionDescription());
        stringBuffer2.append(")");
        throw new XMLStreamException(stringBuffer2.toString(), getLocation());
    }

    public char requireInput(char c10, char[] cArr) throws XMLStreamException {
        for (int i10 = 0; i10 < cArr.length; i10++) {
            if (c10 != cArr[i10]) {
                StringBuffer stringBuffer = new StringBuffer("expected ");
                stringBuffer.append(printable(cArr[i10]));
                stringBuffer.append(" in ");
                stringBuffer.append(new String(cArr));
                stringBuffer.append(" and not ");
                stringBuffer.append(printable(c10));
                throw new XMLStreamException(stringBuffer.toString(), getLocation());
            }
            try {
                c10 = more();
            } catch (EOFException e5) {
                throw new XMLStreamException("Unexpected end of stream", getLocation(), e5);
            }
        }
        return c10;
    }

    public char requireNextS() throws XMLStreamException {
        try {
            char cMore = more();
            if (isS(cMore)) {
                return skipS(cMore);
            }
            StringBuffer stringBuffer = new StringBuffer("white space is required and not ");
            stringBuffer.append(printable(cMore));
            throw new XMLStreamException(stringBuffer.toString(), getLocation());
        } catch (EOFException e5) {
            throw new XMLStreamException("Unexpected end of stream", getLocation(), e5);
        }
    }

    public void setConfigurationContext(ConfigurationContextBase configurationContextBase) {
        this.f37821b = configurationContextBase;
        Boolean bool = Boolean.TRUE;
        bool.equals(configurationContextBase.getProperty(XMLInputFactory.IS_COALESCING));
        this.f37820a = bool.equals(configurationContextBase.getProperty("http://java.sun.com/xml/stream/properties/report-cdata-event"));
    }

    public void setFeature(String str, boolean z10) throws XMLStreamException {
        if (str == null) {
            throw new IllegalArgumentException("feature name should not be nulll");
        }
        if (FEATURE_PROCESS_NAMESPACES.equals(str)) {
            if (this.eventType != 7) {
                throw new XMLStreamException("namespace processing feature can only be changed before parsing", getLocation());
            }
            this.processNamespaces = z10;
        } else if (FEATURE_NAMES_INTERNED.equals(str)) {
            if (z10) {
                throw new XMLStreamException("interning names in this implementation is not supported");
            }
        } else if (FEATURE_PROCESS_DOCDECL.equals(str)) {
            if (z10) {
                throw new XMLStreamException("processing DOCDECL is not supported");
            }
        } else {
            if (!FEATURE_XML_ROUNDTRIP.equals(str)) {
                throw new XMLStreamException("unknown feature ".concat(str));
            }
            if (!z10) {
                throw new XMLStreamException("roundtrip feature can not be switched off");
            }
        }
    }

    public void setInput(Reader reader) throws XMLStreamException {
        e();
        this.reader = reader;
        if (checkForXMLDecl()) {
            next();
        }
    }

    public void setProperty(String str, Object obj) throws XMLStreamException {
        StringBuffer stringBuffer = new StringBuffer("unsupported property: '");
        stringBuffer.append(str);
        stringBuffer.append("'");
        throw new XMLStreamException(stringBuffer.toString());
    }

    public void skip() throws XMLStreamException {
        nextToken();
    }

    public char skipS(char c10) throws XMLStreamException {
        while (isS(c10)) {
            try {
                c10 = more();
            } catch (EOFException e5) {
                throw new XMLStreamException("Unexpected end of stream", getLocation(), e5);
            }
        }
        return c10;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public boolean standaloneSet() {
        return this.standaloneSet;
    }

    public XMLStreamReader subReader() throws XMLStreamException {
        return new SubReader(this);
    }

    public String printable(String str) {
        if (str == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < str.length(); i10++) {
            stringBuffer.append(printable(str.charAt(i10)));
        }
        return stringBuffer.toString();
    }

    public int getNamespaceCount(int i10) {
        if (!this.processNamespaces || i10 == 0) {
            return 0;
        }
        if (i10 >= 0) {
            int[] iArr = this.elNamespaceCount;
            return iArr[i10] - iArr[i10 - 1];
        }
        StringBuffer stringBuffer = new StringBuffer("namespace count may be 0..");
        stringBuffer.append(this.depth);
        stringBuffer.append(" not ");
        stringBuffer.append(i10);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public boolean moveToEndElement(String str) throws XMLStreamException {
        if (str == null) {
            return false;
        }
        while (moveToEndElement()) {
            if (str.equals(getLocalName())) {
                return true;
            }
            if (!hasNext()) {
                return false;
            }
            next();
        }
        return false;
    }

    public boolean moveToStartElement(String str) throws XMLStreamException {
        if (str == null) {
            return false;
        }
        while (moveToStartElement()) {
            if (str.equals(getLocalName())) {
                return true;
            }
            if (!hasNext()) {
                return false;
            }
            next();
        }
        return false;
    }

    public void setInput(InputStream inputStream) throws XMLStreamException {
        try {
            Reader readerCreateReader = XmlReader.createReader(inputStream);
            String encoding = readerCreateReader instanceof XmlReader.BaseReader ? ((XmlReader.BaseReader) readerCreateReader).getEncoding() : null;
            setInput(readerCreateReader);
            if (encoding != null) {
                this.inputEncoding = encoding;
            }
        } catch (IOException e5) {
            throw new XMLStreamException(e5);
        }
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getAttributeValue(String str, String str2) {
        if (this.eventType != 1) {
            h(1);
            throw null;
        }
        if (str2 == null) {
            throw new IllegalArgumentException("attribute name can not be null");
        }
        int i10 = 0;
        if (str != null) {
            while (i10 < this.attributeCount) {
                if (str2.equals(this.attributeName[i10]) && str.equals(this.attributeUri[i10])) {
                    return this.attributeValue[i10];
                }
                i10++;
            }
        } else {
            while (i10 < this.attributeCount) {
                if (str2.equals(this.attributeName[i10])) {
                    return this.attributeValue[i10];
                }
                i10++;
            }
        }
        return null;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public char[] getTextCharacters() {
        a();
        if (this.eventType == 4) {
            if (this.usePC) {
                return this.f37822pc;
            }
            return this.buf;
        }
        return this.buf;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getNamespaceURI(String str) {
        if (d(this.eventType)) {
            if (str != null && str.length() > 0) {
                for (int i10 = this.namespaceEnd - 1; i10 >= 0; i10--) {
                    if (str.equals(this.namespacePrefix[i10])) {
                        return this.namespaceUri[i10];
                    }
                }
                if ("xml".equals(str)) {
                    return XMLConstants.XML_NS_URI;
                }
                if (XMLConstants.XMLNS_ATTRIBUTE.equals(str)) {
                    return XMLConstants.XMLNS_ATTRIBUTE_NS_URI;
                }
            } else {
                for (int i11 = this.namespaceEnd - 1; i11 >= 0; i11--) {
                    if (this.namespacePrefix[i11] == null) {
                        return this.namespaceUri[i11];
                    }
                }
            }
            return null;
        }
        i(new int[]{1, 2});
        throw null;
    }

    public boolean moveToEndElement(String str, String str2) throws XMLStreamException {
        if (str != null && str2 != null) {
            while (moveToEndElement(str)) {
                if (str2.equals(getNamespaceURI())) {
                    return true;
                }
                if (!hasNext()) {
                    return false;
                }
                next();
            }
        }
        return false;
    }

    public boolean moveToStartElement(String str, String str2) throws XMLStreamException {
        if (str != null && str2 != null) {
            while (moveToStartElement(str)) {
                if (str2.equals(getNamespaceURI())) {
                    return true;
                }
                if (!hasNext()) {
                    return false;
                }
                next();
            }
        }
        return false;
    }

    public void setInput(InputStream inputStream, String str) throws XMLStreamException {
        String string;
        if (inputStream != null) {
            try {
                setInput(str != null ? XmlReader.createReader(inputStream, str) : XmlReader.createReader(inputStream));
                if (str != null) {
                    this.inputEncoding = str;
                    return;
                }
                return;
            } catch (IOException e5) {
                if (str == null) {
                    StringBuffer stringBuffer = new StringBuffer("(for encoding '");
                    stringBuffer.append(str);
                    stringBuffer.append("')");
                    string = stringBuffer.toString();
                } else {
                    string = "";
                }
                StringBuffer stringBuffer2 = new StringBuffer("could not create reader ");
                stringBuffer2.append(string);
                stringBuffer2.append(": ");
                stringBuffer2.append(e5);
                throw new XMLStreamException(stringBuffer2.toString(), getLocation(), e5);
            }
        }
        throw new IllegalArgumentException("input stream can not be null");
    }

    @Override // javax.xml.stream.XMLStreamReader
    public void close() throws XMLStreamException {
    }

    @Override // javax.xml.stream.XMLStreamReader
    public Location getLocation() {
        return this;
    }

    @Override // javax.xml.stream.XMLStreamReader
    public String getNamespaceURI() {
        int i10 = this.eventType;
        if (i10 == 1 || i10 == 2) {
            return this.processNamespaces ? this.elUri[this.depth] : NO_NAMESPACE;
        }
        i(new int[]{1, 2});
        throw null;
    }

    public void resetStringCache() {
    }
}
