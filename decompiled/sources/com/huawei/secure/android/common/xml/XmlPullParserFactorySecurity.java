package com.huawei.secure.android.common.xml;

import com.bea.xml.stream.MXParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes10.dex */
public class XmlPullParserFactorySecurity {
    public static XmlPullParserFactory getInstance() throws XmlPullParserException {
        XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
        xmlPullParserFactoryNewInstance.setFeature(MXParser.FEATURE_PROCESS_NAMESPACES, true);
        xmlPullParserFactoryNewInstance.setFeature("http://xmlpull.org/v1/doc/features.html#report-namespace-prefixes", false);
        xmlPullParserFactoryNewInstance.setFeature(MXParser.FEATURE_PROCESS_DOCDECL, true);
        xmlPullParserFactoryNewInstance.setFeature("http://xmlpull.org/v1/doc/features.html#validation", false);
        return xmlPullParserFactoryNewInstance;
    }
}
