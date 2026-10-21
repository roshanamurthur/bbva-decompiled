package net.minidev.json.parser;

import java.io.InputStream;
import java.io.Reader;

/* JADX INFO: loaded from: classes12.dex */
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
    public final int f85181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f85182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f85183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public yl.b f85184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public yl.a f85185e;

    static {
        DEFAULT_PERMISSIVE_MODE = System.getProperty("JSON_SMART_SIMPLE") != null ? 960 : -1;
    }

    public JSONParser() {
        this.f85181a = DEFAULT_PERMISSIVE_MODE;
    }

    public Object parse(String str) throws ParseException {
        if (this.f85184d == null) {
            this.f85184d = new yl.b(this.f85181a);
        }
        yl.b bVar = this.f85184d;
        bVar.getClass();
        ContainerFactory containerFactory = ContainerFactory.FACTORY_SIMPLE;
        ContentHandlerDumy contentHandlerDumy = ContentHandlerDumy.HANDLER;
        bVar.f94873x = str;
        bVar.f85213w = str.length();
        bVar.f85197g = -1;
        return bVar.c(containerFactory, contentHandlerDumy);
    }

    public JSONParser(int i10) {
        this.f85181a = i10;
    }

    public Object parse(String str, ContainerFactory containerFactory) throws ParseException {
        if (this.f85184d == null) {
            this.f85184d = new yl.b(this.f85181a);
        }
        yl.b bVar = this.f85184d;
        bVar.getClass();
        ContentHandlerDumy contentHandlerDumy = ContentHandlerDumy.HANDLER;
        bVar.f94873x = str;
        bVar.f85213w = str.length();
        bVar.f85197g = -1;
        return bVar.c(containerFactory, contentHandlerDumy);
    }

    public Object parse(String str, ContainerFactory containerFactory, ContentHandler contentHandler) throws ParseException {
        if (this.f85184d == null) {
            this.f85184d = new yl.b(this.f85181a);
        }
        yl.b bVar = this.f85184d;
        bVar.f94873x = str;
        bVar.f85213w = str.length();
        bVar.f85197g = -1;
        return bVar.c(containerFactory, contentHandler);
    }

    public Object parse(byte[] bArr) throws ParseException {
        if (this.f85185e == null) {
            this.f85185e = new yl.a(this.f85181a);
        }
        yl.a aVar = this.f85185e;
        aVar.getClass();
        ContainerFactory containerFactory = ContainerFactory.FACTORY_SIMPLE;
        ContentHandlerDumy contentHandlerDumy = ContentHandlerDumy.HANDLER;
        aVar.f94872x = bArr;
        aVar.f85213w = bArr.length;
        aVar.f85197g = -1;
        return aVar.c(containerFactory, contentHandlerDumy);
    }

    public Object parse(byte[] bArr, ContainerFactory containerFactory) throws ParseException {
        if (this.f85185e == null) {
            this.f85185e = new yl.a(this.f85181a);
        }
        yl.a aVar = this.f85185e;
        aVar.getClass();
        ContentHandlerDumy contentHandlerDumy = ContentHandlerDumy.HANDLER;
        aVar.f94872x = bArr;
        aVar.f85213w = bArr.length;
        aVar.f85197g = -1;
        return aVar.c(containerFactory, contentHandlerDumy);
    }

    public Object parse(byte[] bArr, ContainerFactory containerFactory, ContentHandler contentHandler) throws ParseException {
        if (this.f85185e == null) {
            this.f85185e = new yl.a(this.f85181a);
        }
        yl.a aVar = this.f85185e;
        aVar.f94872x = bArr;
        aVar.f85213w = bArr.length;
        aVar.f85197g = -1;
        return aVar.c(containerFactory, contentHandler);
    }

    public Object parse(byte[] bArr, int i10, int i11) throws ParseException {
        if (this.f85185e == null) {
            this.f85185e = new yl.a(this.f85181a);
        }
        yl.a aVar = this.f85185e;
        ContainerFactory containerFactory = ContainerFactory.FACTORY_SIMPLE;
        ContentHandlerDumy contentHandlerDumy = ContentHandlerDumy.HANDLER;
        aVar.f94872x = bArr;
        aVar.f85213w = i11;
        aVar.f85197g = i10 - 1;
        return aVar.c(containerFactory, contentHandlerDumy);
    }

    public Object parse(byte[] bArr, int i10, int i11, ContainerFactory containerFactory) throws ParseException {
        if (this.f85185e == null) {
            this.f85185e = new yl.a(this.f85181a);
        }
        yl.a aVar = this.f85185e;
        ContentHandlerDumy contentHandlerDumy = ContentHandlerDumy.HANDLER;
        aVar.f94872x = bArr;
        aVar.f85213w = i11;
        aVar.f85197g = i10 - 1;
        return aVar.c(containerFactory, contentHandlerDumy);
    }

    public Object parse(byte[] bArr, int i10, int i11, ContainerFactory containerFactory, ContentHandler contentHandler) throws ParseException {
        if (this.f85185e == null) {
            this.f85185e = new yl.a(this.f85181a);
        }
        yl.a aVar = this.f85185e;
        aVar.f94872x = bArr;
        aVar.f85213w = i11;
        aVar.f85197g = i10 - 1;
        return aVar.c(containerFactory, contentHandler);
    }

    public Object parse(Reader reader) throws ParseException {
        if (this.f85182b == null) {
            this.f85182b = new c(this.f85181a);
        }
        c cVar = this.f85182b;
        cVar.getClass();
        ContainerFactory containerFactory = ContainerFactory.FACTORY_SIMPLE;
        ContentHandlerDumy contentHandlerDumy = ContentHandlerDumy.HANDLER;
        cVar.f85214w = reader;
        cVar.f85197g = -1;
        return cVar.c(containerFactory, contentHandlerDumy);
    }

    public Object parse(Reader reader, ContainerFactory containerFactory) throws ParseException {
        if (this.f85182b == null) {
            this.f85182b = new c(this.f85181a);
        }
        c cVar = this.f85182b;
        cVar.getClass();
        ContentHandlerDumy contentHandlerDumy = ContentHandlerDumy.HANDLER;
        cVar.f85214w = reader;
        cVar.f85197g = -1;
        return cVar.c(containerFactory, contentHandlerDumy);
    }

    public Object parse(Reader reader, ContainerFactory containerFactory, ContentHandler contentHandler) throws ParseException {
        if (this.f85182b == null) {
            this.f85182b = new c(this.f85181a);
        }
        c cVar = this.f85182b;
        cVar.f85214w = reader;
        cVar.f85197g = -1;
        return cVar.c(containerFactory, contentHandler);
    }

    public Object parse(InputStream inputStream) throws ParseException {
        if (this.f85183c == null) {
            this.f85183c = new a(this.f85181a);
        }
        a aVar = this.f85183c;
        aVar.getClass();
        ContainerFactory containerFactory = ContainerFactory.FACTORY_SIMPLE;
        ContentHandlerDumy contentHandlerDumy = ContentHandlerDumy.HANDLER;
        aVar.f85212w = inputStream;
        aVar.f85197g = -1;
        return aVar.c(containerFactory, contentHandlerDumy);
    }

    public Object parse(InputStream inputStream, ContainerFactory containerFactory) throws ParseException {
        if (this.f85183c == null) {
            this.f85183c = new a(this.f85181a);
        }
        a aVar = this.f85183c;
        aVar.getClass();
        ContentHandlerDumy contentHandlerDumy = ContentHandlerDumy.HANDLER;
        aVar.f85212w = inputStream;
        aVar.f85197g = -1;
        return aVar.c(containerFactory, contentHandlerDumy);
    }

    public Object parse(InputStream inputStream, ContainerFactory containerFactory, ContentHandler contentHandler) throws ParseException {
        if (this.f85183c == null) {
            this.f85183c = new a(this.f85181a);
        }
        a aVar = this.f85183c;
        aVar.f85212w = inputStream;
        aVar.f85197g = -1;
        return aVar.c(containerFactory, contentHandler);
    }
}
