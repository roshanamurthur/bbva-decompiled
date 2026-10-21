package com.fasterxml.jackson.databind.ext;

import ci.a;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* JADX INFO: loaded from: classes9.dex */
public abstract class DOMDeserializer<T> extends FromStringDeserializer<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final DocumentBuilderFactory f43307p0;

    public static class DocumentDeserializer extends DOMDeserializer<Document> {
        public DocumentDeserializer() {
            super(Document.class);
        }

        @Override // com.fasterxml.jackson.databind.ext.DOMDeserializer, com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public Document _deserialize(String str, DeserializationContext deserializationContext) throws IllegalArgumentException {
            return parse(str);
        }
    }

    public static class NodeDeserializer extends DOMDeserializer<Node> {
        public NodeDeserializer() {
            super(Node.class);
        }

        @Override // com.fasterxml.jackson.databind.ext.DOMDeserializer, com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public Node _deserialize(String str, DeserializationContext deserializationContext) throws IllegalArgumentException {
            return parse(str);
        }
    }

    static {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        documentBuilderFactoryNewInstance.setNamespaceAware(true);
        documentBuilderFactoryNewInstance.setExpandEntityReferences(false);
        try {
            documentBuilderFactoryNewInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        } catch (Error | ParserConfigurationException unused) {
        }
        f43307p0 = documentBuilderFactoryNewInstance;
    }

    public DOMDeserializer(Class<T> cls) {
        super(cls);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public abstract T _deserialize(String str, DeserializationContext deserializationContext);

    public DocumentBuilder documentBuilder() throws ParserConfigurationException {
        return f43307p0.newDocumentBuilder();
    }

    public final Document parse(String str) throws IllegalArgumentException {
        try {
            return documentBuilder().parse(new InputSource(new StringReader(str)));
        } catch (Exception e5) {
            throw new IllegalArgumentException(a.b(e5, new StringBuilder("Failed to parse JSON String as XML: ")), e5);
        }
    }
}
