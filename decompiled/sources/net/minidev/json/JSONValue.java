package net.minidev.json;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import net.minidev.json.parser.ContainerFactory;
import net.minidev.json.parser.ContentHandler;
import net.minidev.json.parser.ContentHandlerCompressor;
import net.minidev.json.parser.FakeContainerFactory;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;
import net.minidev.json.reader.JsonWriter;
import net.minidev.json.reader.JsonWriterI;

/* JADX INFO: loaded from: classes12.dex */
public class JSONValue {
    public static JSONStyle COMPRESSION = JSONStyle.NO_COMPRESS;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FakeContainerFactory f85171a = new FakeContainerFactory();
    public static JsonWriter defaultWriter = new JsonWriter();

    public static void SAXParse(InputStream inputStream, ContentHandler contentHandler) throws ParseException, IOException {
        new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(inputStream, f85171a, contentHandler);
    }

    public static String compress(String str, JSONStyle jSONStyle) {
        try {
            StringBuilder sb2 = new StringBuilder();
            new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(str, f85171a, new ContentHandlerCompressor(sb2, jSONStyle));
            return sb2.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static String escape(String str) {
        return escape(str, COMPRESSION);
    }

    public static boolean isValidJson(Reader reader) throws IOException {
        try {
            new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(reader, f85171a);
            return true;
        } catch (ParseException unused) {
            return false;
        }
    }

    public static boolean isValidJsonStrict(Reader reader) throws IOException {
        try {
            new JSONParser(400).parse(reader, f85171a);
            return true;
        } catch (ParseException unused) {
            return false;
        }
    }

    public static Object parse(byte[] bArr) {
        try {
            return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object parseKeepingOrder(byte[] bArr) {
        try {
            return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(bArr, ContainerFactory.FACTORY_ORDERED);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object parseStrict(InputStream inputStream) throws ParseException, IOException {
        return new JSONParser(400).parse(inputStream, ContainerFactory.FACTORY_SIMPLE);
    }

    public static Object parseWithException(byte[] bArr) throws ParseException, IOException {
        return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(bArr, ContainerFactory.FACTORY_SIMPLE);
    }

    public static String toJSONString(Object obj) {
        return toJSONString(obj, COMPRESSION);
    }

    public static String uncompress(String str) {
        return compress(str, JSONStyle.NO_COMPRESS);
    }

    public static void writeJSONString(Object obj, Appendable appendable) throws IOException {
        writeJSONString(obj, appendable, COMPRESSION);
    }

    public static String escape(String str, JSONStyle jSONStyle) {
        if (str == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        jSONStyle.escape(str, sb2);
        return sb2.toString();
    }

    public static boolean isValidJson(String str) {
        try {
            new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(str, f85171a);
            return true;
        } catch (ParseException unused) {
            return false;
        }
    }

    public static boolean isValidJsonStrict(String str) {
        try {
            new JSONParser(400).parse(str, f85171a);
            return true;
        } catch (ParseException unused) {
            return false;
        }
    }

    public static Object parse(byte[] bArr, int i10, int i11) {
        try {
            return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(bArr, i10, i11);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object parseKeepingOrder(byte[] bArr, int i10, int i11) {
        try {
            return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(bArr, i10, i11, ContainerFactory.FACTORY_ORDERED);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object parseStrict(Reader reader) throws ParseException, IOException {
        return new JSONParser(400).parse(reader, ContainerFactory.FACTORY_SIMPLE);
    }

    public static Object parseWithException(byte[] bArr, int i10, int i11) throws ParseException, IOException {
        return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(bArr, i10, i11, ContainerFactory.FACTORY_SIMPLE);
    }

    public static String toJSONString(Object obj, JSONStyle jSONStyle) {
        StringBuilder sb2 = new StringBuilder();
        try {
            writeJSONString(obj, sb2, jSONStyle);
        } catch (IOException unused) {
        }
        return sb2.toString();
    }

    public static void writeJSONString(Object obj, Appendable appendable, JSONStyle jSONStyle) throws IOException {
        if (obj == null) {
            appendable.append(AbstractJsonLexerKt.NULL);
            return;
        }
        Class<?> cls = obj.getClass();
        JsonWriterI<Object> write = defaultWriter.getWrite(cls);
        if (write == null) {
            if (cls.isArray()) {
                write = JsonWriter.arrayWriter;
            } else {
                write = defaultWriter.getWriterByInterface(obj.getClass());
                if (write == null) {
                    write = JsonWriter.beansWriter;
                }
            }
            defaultWriter.registerWriter(write, cls);
        }
        write.writeJSONString(obj, appendable, jSONStyle);
    }

    public static void SAXParse(Reader reader, ContentHandler contentHandler) throws ParseException, IOException {
        new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(reader, f85171a, contentHandler);
    }

    public static Object parse(InputStream inputStream) {
        try {
            return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(inputStream);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object parseKeepingOrder(InputStream inputStream) {
        try {
            return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(inputStream, ContainerFactory.FACTORY_ORDERED);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object parseStrict(String str) throws ParseException {
        return new JSONParser(400).parse(str, ContainerFactory.FACTORY_SIMPLE);
    }

    public static Object parseWithException(InputStream inputStream) throws ParseException, IOException {
        return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(inputStream, ContainerFactory.FACTORY_SIMPLE);
    }

    public static Object parse(Reader reader) {
        try {
            return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(reader);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object parseKeepingOrder(Reader reader) {
        try {
            return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(reader, ContainerFactory.FACTORY_ORDERED);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object parseStrict(byte[] bArr) throws ParseException {
        return new JSONParser(400).parse(bArr, ContainerFactory.FACTORY_SIMPLE);
    }

    public static Object parseWithException(Reader reader) throws ParseException, IOException {
        return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(reader, ContainerFactory.FACTORY_SIMPLE);
    }

    public static void SAXParse(String str, ContentHandler contentHandler) throws ParseException {
        new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(str, f85171a, contentHandler);
    }

    public static void escape(String str, Appendable appendable) {
        escape(str, appendable, COMPRESSION);
    }

    public static Object parse(String str) {
        try {
            return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object parseKeepingOrder(String str) {
        try {
            return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(str, ContainerFactory.FACTORY_ORDERED);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object parseStrict(byte[] bArr, int i10, int i11) throws ParseException {
        return new JSONParser(400).parse(bArr, i10, i11, ContainerFactory.FACTORY_SIMPLE);
    }

    public static Object parseWithException(String str) throws ParseException {
        return new JSONParser(JSONParser.DEFAULT_PERMISSIVE_MODE).parse(str, ContainerFactory.FACTORY_SIMPLE);
    }

    public static String compress(String str) {
        return compress(str, JSONStyle.MAX_COMPRESS);
    }

    public static void escape(String str, Appendable appendable, JSONStyle jSONStyle) {
        if (str == null) {
            return;
        }
        jSONStyle.escape(str, appendable);
    }
}
