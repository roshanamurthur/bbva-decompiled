package com.nimbusds.jose.shaded.json.parser;

import java.io.InputStream;
import java.io.Reader;

/* JADX INFO: loaded from: classes10.dex */
public class JSONParser {
    public static final int ACCEPT_LEADING_ZERO = 32;
    public static final int ACCEPT_NAN = 4;
    public static final int ACCEPT_NON_QUOTE = 2;
    public static final int ACCEPT_SIMPLE_QUOTE = 1;
    public static final int ACCEPT_TAILLING_DATA = 256;
    public static final int ACCEPT_TAILLING_SPACE = 512;
    public static final int ACCEPT_USELESS_COMMA = 64;
    public static int DEFAULT_PERMISSIVE_MODE = 0;
    public static final int IGNORE_CONTROL_CHAR = 8;
    public static final int MODE_JSON_SIMPLE = 960;
    public static final int MODE_PERMISSIVE = -1;
    public static final int MODE_RFC4627 = 400;
    public static final int MODE_STRICTEST = 144;
    public static final int USE_HI_PRECISION_FLOAT = 128;
    public static final int USE_INTEGER_STORAGE = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f62778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f62779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f62780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ki.b f62781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ki.a f62782e;

    static {
        DEFAULT_PERMISSIVE_MODE = System.getProperty("JSON_SMART_SIMPLE") != null ? 960 : -1;
    }

    public JSONParser() {
        this.f62778a = DEFAULT_PERMISSIVE_MODE;
    }

    public Object parse(String str) throws ParseException {
        if (this.f62781d == null) {
            this.f62781d = new ki.b(this.f62778a);
        }
        ki.b bVar = this.f62781d;
        bVar.getClass();
        ContainerFactory containerFactory = ContainerFactory.FACTORY_SIMPLE;
        ContentHandlerDumy contentHandlerDumy = ContentHandlerDumy.HANDLER;
        bVar.f79333x = str;
        bVar.f62810w = str.length();
        bVar.f62794g = -1;
        return bVar.c(containerFactory, contentHandlerDumy);
    }

    public JSONParser(int i10) {
        this.f62778a = i10;
    }

    public Object parse(String str, ContainerFactory containerFactory) throws ParseException {
        if (this.f62781d == null) {
            this.f62781d = new ki.b(this.f62778a);
        }
        ki.b bVar = this.f62781d;
        bVar.getClass();
        ContentHandlerDumy contentHandlerDumy = ContentHandlerDumy.HANDLER;
        bVar.f79333x = str;
        bVar.f62810w = str.length();
        bVar.f62794g = -1;
        return bVar.c(containerFactory, contentHandlerDumy);
    }

    public Object parse(String str, ContainerFactory containerFactory, ContentHandler contentHandler) throws ParseException {
        if (this.f62781d == null) {
            this.f62781d = new ki.b(this.f62778a);
        }
        ki.b bVar = this.f62781d;
        bVar.f79333x = str;
        bVar.f62810w = str.length();
        bVar.f62794g = -1;
        return bVar.c(containerFactory, contentHandler);
    }

    public Object parse(byte[] bArr) throws ParseException {
        if (this.f62782e == null) {
            this.f62782e = new ki.a(this.f62778a);
        }
        ki.a aVar = this.f62782e;
        aVar.getClass();
        ContainerFactory containerFactory = ContainerFactory.FACTORY_SIMPLE;
        ContentHandlerDumy contentHandlerDumy = ContentHandlerDumy.HANDLER;
        aVar.f79332x = bArr;
        aVar.f62810w = bArr.length;
        aVar.f62794g = -1;
        return aVar.c(containerFactory, contentHandlerDumy);
    }

    public Object parse(byte[] bArr, ContainerFactory containerFactory) throws ParseException {
        if (this.f62782e == null) {
            this.f62782e = new ki.a(this.f62778a);
        }
        ki.a aVar = this.f62782e;
        aVar.getClass();
        ContentHandlerDumy contentHandlerDumy = ContentHandlerDumy.HANDLER;
        aVar.f79332x = bArr;
        aVar.f62810w = bArr.length;
        aVar.f62794g = -1;
        return aVar.c(containerFactory, contentHandlerDumy);
    }

    public Object parse(byte[] bArr, ContainerFactory containerFactory, ContentHandler contentHandler) throws ParseException {
        if (this.f62782e == null) {
            this.f62782e = new ki.a(this.f62778a);
        }
        ki.a aVar = this.f62782e;
        aVar.f79332x = bArr;
        aVar.f62810w = bArr.length;
        aVar.f62794g = -1;
        return aVar.c(containerFactory, contentHandler);
    }

    public Object parse(byte[] bArr, int i10, int i11) throws ParseException {
        if (this.f62782e == null) {
            this.f62782e = new ki.a(this.f62778a);
        }
        ki.a aVar = this.f62782e;
        ContainerFactory containerFactory = ContainerFactory.FACTORY_SIMPLE;
        ContentHandlerDumy contentHandlerDumy = ContentHandlerDumy.HANDLER;
        aVar.f79332x = bArr;
        aVar.f62810w = i11;
        aVar.f62794g = i10 - 1;
        return aVar.c(containerFactory, contentHandlerDumy);
    }

    public Object parse(byte[] bArr, int i10, int i11, ContainerFactory containerFactory) throws ParseException {
        if (this.f62782e == null) {
            this.f62782e = new ki.a(this.f62778a);
        }
        ki.a aVar = this.f62782e;
        ContentHandlerDumy contentHandlerDumy = ContentHandlerDumy.HANDLER;
        aVar.f79332x = bArr;
        aVar.f62810w = i11;
        aVar.f62794g = i10 - 1;
        return aVar.c(containerFactory, contentHandlerDumy);
    }

    public Object parse(byte[] bArr, int i10, int i11, ContainerFactory containerFactory, ContentHandler contentHandler) throws ParseException {
        if (this.f62782e == null) {
            this.f62782e = new ki.a(this.f62778a);
        }
        ki.a aVar = this.f62782e;
        aVar.f79332x = bArr;
        aVar.f62810w = i11;
        aVar.f62794g = i10 - 1;
        return aVar.c(containerFactory, contentHandler);
    }

    public Object parse(Reader reader) throws ParseException {
        if (this.f62779b == null) {
            this.f62779b = new c(this.f62778a);
        }
        c cVar = this.f62779b;
        cVar.getClass();
        ContainerFactory containerFactory = ContainerFactory.FACTORY_SIMPLE;
        ContentHandlerDumy contentHandlerDumy = ContentHandlerDumy.HANDLER;
        cVar.f62811w = reader;
        cVar.f62794g = -1;
        return cVar.c(containerFactory, contentHandlerDumy);
    }

    public Object parse(Reader reader, ContainerFactory containerFactory) throws ParseException {
        if (this.f62779b == null) {
            this.f62779b = new c(this.f62778a);
        }
        c cVar = this.f62779b;
        cVar.getClass();
        ContentHandlerDumy contentHandlerDumy = ContentHandlerDumy.HANDLER;
        cVar.f62811w = reader;
        cVar.f62794g = -1;
        return cVar.c(containerFactory, contentHandlerDumy);
    }

    public Object parse(Reader reader, ContainerFactory containerFactory, ContentHandler contentHandler) throws ParseException {
        if (this.f62779b == null) {
            this.f62779b = new c(this.f62778a);
        }
        c cVar = this.f62779b;
        cVar.f62811w = reader;
        cVar.f62794g = -1;
        return cVar.c(containerFactory, contentHandler);
    }

    public Object parse(InputStream inputStream) throws ParseException {
        if (this.f62780c == null) {
            this.f62780c = new a(this.f62778a);
        }
        a aVar = this.f62780c;
        aVar.getClass();
        ContainerFactory containerFactory = ContainerFactory.FACTORY_SIMPLE;
        ContentHandlerDumy contentHandlerDumy = ContentHandlerDumy.HANDLER;
        aVar.f62809w = inputStream;
        aVar.f62794g = -1;
        return aVar.c(containerFactory, contentHandlerDumy);
    }

    public Object parse(InputStream inputStream, ContainerFactory containerFactory) throws ParseException {
        if (this.f62780c == null) {
            this.f62780c = new a(this.f62778a);
        }
        a aVar = this.f62780c;
        aVar.getClass();
        ContentHandlerDumy contentHandlerDumy = ContentHandlerDumy.HANDLER;
        aVar.f62809w = inputStream;
        aVar.f62794g = -1;
        return aVar.c(containerFactory, contentHandlerDumy);
    }

    public Object parse(InputStream inputStream, ContainerFactory containerFactory, ContentHandler contentHandler) throws ParseException {
        if (this.f62780c == null) {
            this.f62780c = new a(this.f62778a);
        }
        a aVar = this.f62780c;
        aVar.f62809w = inputStream;
        aVar.f62794g = -1;
        return aVar.c(containerFactory, contentHandler);
    }
}
