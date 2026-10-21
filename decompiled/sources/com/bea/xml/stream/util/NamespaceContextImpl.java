package com.bea.xml.stream.util;

import java.io.PrintStream;
import java.util.Iterator;
import javax.xml.XMLConstants;
import javax.xml.namespace.NamespaceContext;

/* JADX INFO: loaded from: classes9.dex */
public class NamespaceContextImpl implements NamespaceContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SymbolTable f37908a = new SymbolTable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SymbolTable f37909b = new SymbolTable();

    public NamespaceContextImpl() {
        init();
    }

    public static void main(String[] strArr) throws Exception {
        NamespaceContextImpl namespaceContextImpl = new NamespaceContextImpl();
        namespaceContextImpl.openScope();
        namespaceContextImpl.bindNamespace("a", "uri");
        namespaceContextImpl.bindNamespace("b", "uri");
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer("a=");
        stringBuffer.append(namespaceContextImpl.getNamespaceURI("a"));
        printStream.println(stringBuffer.toString());
        StringBuffer stringBuffer2 = new StringBuffer("uri=");
        stringBuffer2.append(namespaceContextImpl.getPrefix("uri"));
        printStream.println(stringBuffer2.toString());
        Iterator prefixes = namespaceContextImpl.getPrefixes("uri");
        while (prefixes.hasNext()) {
            PrintStream printStream2 = System.out;
            StringBuffer stringBuffer3 = new StringBuffer("1 uri->");
            stringBuffer3.append(prefixes.next());
            printStream2.println(stringBuffer3.toString());
        }
        namespaceContextImpl.openScope();
        namespaceContextImpl.bindNamespace("a", "uri2");
        Iterator prefixes2 = namespaceContextImpl.getPrefixes("uri");
        while (prefixes2.hasNext()) {
            PrintStream printStream3 = System.out;
            StringBuffer stringBuffer4 = new StringBuffer("2 uri->");
            stringBuffer4.append(prefixes2.next());
            printStream3.println(stringBuffer4.toString());
        }
        namespaceContextImpl.closeScope();
        namespaceContextImpl.closeScope();
    }

    public void bindDefaultNameSpace(String str) {
        bindNamespace("", str);
    }

    public void bindNamespace(String str, String str2) {
        this.f37908a.put(str, str2);
        this.f37909b.put(str2, str);
    }

    public void closeScope() {
        this.f37908a.closeScope();
        this.f37909b.closeScope();
    }

    public String getDefaultNameSpace() {
        return getNamespaceURI("");
    }

    public int getDepth() {
        return this.f37908a.getDepth();
    }

    @Override // javax.xml.namespace.NamespaceContext
    public String getNamespaceURI(String str) {
        return this.f37908a.get(str);
    }

    @Override // javax.xml.namespace.NamespaceContext
    public String getPrefix(String str) {
        return this.f37909b.get(str);
    }

    @Override // javax.xml.namespace.NamespaceContext
    public Iterator getPrefixes(String str) {
        return this.f37909b.getAll(str).iterator();
    }

    public void init() {
        bindNamespace("xml", XMLConstants.XML_NS_URI);
        bindNamespace(XMLConstants.XMLNS_ATTRIBUTE, XMLConstants.XML_NS_URI);
    }

    public void openScope() {
        this.f37908a.openScope();
        this.f37909b.openScope();
    }

    public void unbindDefaultNameSpace() {
        bindNamespace("", null);
    }

    public void unbindNamespace(String str, String str2) {
        SymbolTable symbolTable = this.f37908a;
        symbolTable.put(str, null);
        symbolTable.put(str2, null);
    }

    public NamespaceContextImpl(NamespaceContext namespaceContext) {
        init();
    }
}
