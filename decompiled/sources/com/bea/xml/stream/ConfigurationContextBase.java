package com.bea.xml.stream;

import androidx.constraintlayout.core.parser.a;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLReporter;
import javax.xml.stream.XMLResolver;
import javax.xml.stream.util.XMLEventAllocator;

/* JADX INFO: loaded from: classes9.dex */
public class ConfigurationContextBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f37803b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Hashtable f37804a;

    static {
        HashSet hashSet = new HashSet();
        f37803b = hashSet;
        a.d(hashSet, XMLInputFactory.IS_VALIDATING, XMLInputFactory.IS_COALESCING, XMLInputFactory.IS_REPLACING_ENTITY_REFERENCES, XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES);
        a.d(hashSet, XMLOutputFactory.IS_REPAIRING_NAMESPACES, XMLInputFactory.IS_NAMESPACE_AWARE, XMLInputFactory.SUPPORT_DTD, XMLInputFactory.REPORTER);
        a.d(hashSet, XMLInputFactory.RESOLVER, XMLInputFactory.ALLOCATOR, "javax.xml.stream.notations", "javax.xml.stream.entities");
        hashSet.add("http://java.sun.com/xml/stream/properties/report-cdata-event");
    }

    public ConfigurationContextBase() {
        Hashtable hashtable = new Hashtable();
        this.f37804a = hashtable;
        Boolean bool = Boolean.FALSE;
        hashtable.put(XMLInputFactory.IS_VALIDATING, bool);
        hashtable.put(XMLInputFactory.IS_COALESCING, bool);
        Boolean bool2 = Boolean.TRUE;
        hashtable.put(XMLInputFactory.IS_REPLACING_ENTITY_REFERENCES, bool2);
        hashtable.put(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES, bool);
        hashtable.put(XMLInputFactory.IS_NAMESPACE_AWARE, bool2);
        hashtable.put(XMLInputFactory.SUPPORT_DTD, bool);
        hashtable.put(XMLOutputFactory.IS_REPAIRING_NAMESPACES, bool);
    }

    public void check(String str) {
        if (f37803b.contains(str)) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer("Unable to access unsupported property ");
        stringBuffer.append(str);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public boolean getBool(String str) {
        check(str);
        return ((Boolean) this.f37804a.get(str)).booleanValue();
    }

    public XMLEventAllocator getEventAllocator() {
        return (XMLEventAllocator) this.f37804a.get(XMLInputFactory.ALLOCATOR);
    }

    public Enumeration getProperties() {
        return this.f37804a.keys();
    }

    public Object getProperty(String str) {
        check(str);
        return this.f37804a.get(str);
    }

    public String getVersion() {
        return "1.0";
    }

    public XMLReporter getXMLReporter() {
        return (XMLReporter) this.f37804a.get(XMLInputFactory.REPORTER);
    }

    public XMLResolver getXMLResolver() {
        return (XMLResolver) this.f37804a.get(XMLInputFactory.RESOLVER);
    }

    public boolean isCoalescing() {
        return getBool(XMLInputFactory.IS_COALESCING);
    }

    public boolean isNamespaceAware() {
        return getBool(XMLInputFactory.IS_NAMESPACE_AWARE);
    }

    public boolean isPrefixDefaulting() {
        return getBool(XMLOutputFactory.IS_REPAIRING_NAMESPACES);
    }

    public boolean isPropertySupported(String str) {
        return f37803b.contains(str);
    }

    public boolean isReplacingEntities() {
        return getBool(XMLInputFactory.IS_REPLACING_ENTITY_REFERENCES);
    }

    public boolean isSupportingExternalEntities() {
        return getBool(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES);
    }

    public boolean isValidating() {
        return getBool(XMLInputFactory.IS_VALIDATING);
    }

    public void setBool(String str, boolean z10) {
        check(str);
        this.f37804a.put(str, z10 ? Boolean.TRUE : Boolean.FALSE);
    }

    public void setCoalescing(boolean z10) {
        setBool(XMLInputFactory.IS_COALESCING, z10);
    }

    public void setEventAllocator(XMLEventAllocator xMLEventAllocator) {
        this.f37804a.put(XMLInputFactory.ALLOCATOR, xMLEventAllocator);
    }

    public void setNamespaceAware(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException("This implementation does not allow disabling namespace processing");
        }
    }

    public void setPrefixDefaulting(boolean z10) {
        setBool(XMLOutputFactory.IS_REPAIRING_NAMESPACES, z10);
    }

    public void setProperty(String str, Object obj) {
        if (str.equals(XMLInputFactory.IS_VALIDATING)) {
            setValidating(((Boolean) obj).booleanValue());
            return;
        }
        if (str.equals(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES)) {
            setSupportExternalEntities(((Boolean) obj).booleanValue());
        } else if (str.equals(XMLInputFactory.IS_NAMESPACE_AWARE)) {
            setNamespaceAware(((Boolean) obj).booleanValue());
        } else {
            check(str);
            this.f37804a.put(str, obj);
        }
    }

    public void setReplacingEntities(boolean z10) {
        setBool(XMLInputFactory.IS_REPLACING_ENTITY_REFERENCES, z10);
    }

    public void setSupportExternalEntities(boolean z10) {
        if (z10) {
            throw new IllegalArgumentException("This implementation does not resolve external entities ");
        }
    }

    public void setValidating(boolean z10) {
        if (z10) {
            throw new IllegalArgumentException("This implementation does not support validation");
        }
    }

    public void setXMLReporter(XMLReporter xMLReporter) {
        this.f37804a.put(XMLInputFactory.REPORTER, xMLReporter);
    }

    public void setXMLResolver(XMLResolver xMLResolver) {
        this.f37804a.put(XMLInputFactory.RESOLVER, xMLResolver);
    }
}
