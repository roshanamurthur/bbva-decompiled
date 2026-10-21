package com.bbva.ethermobilesdk.pinning.provider.catalog;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.pinning.extension.StringKt;
import com.mastercard.sonic.androidsvg.SVGParser;
import java.io.InputStream;
import java.io.StringWriter;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.simpleframework.xml.core.Persister;
import org.w3c.dom.Node;

/* JADX INFO: compiled from: CatalogReader.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u0002H\u0006\"\u0006\b\u0000\u0010\u0006\u0018\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0086\b¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/provider/catalog/Parser;", "", "()V", "serializer", "Lorg/simpleframework/xml/core/Persister;", "deserialize", ExifInterface.GPS_DIRECTION_TRUE, "input", "Ljava/io/InputStream;", "(Ljava/io/InputStream;)Ljava/lang/Object;", "serialize", "", "node", "Lorg/w3c/dom/Node;", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Parser {

    @NotNull
    private final Persister serializer = new Persister();

    public final /* synthetic */ <T> T deserialize(InputStream input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Persister persister = this.serializer;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) persister.read((Class) Object.class, input);
    }

    @NotNull
    public final String serialize(@NotNull Node node) throws TransformerException {
        Intrinsics.checkNotNullParameter(node, "node");
        StringWriter stringWriter = new StringWriter();
        Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
        transformerNewTransformer.setOutputProperty("omit-xml-declaration", "yes");
        transformerNewTransformer.setOutputProperty("indent", SVGParser.XML_STYLESHEET_ATTR_ALTERNATE_NO);
        transformerNewTransformer.setOutputProperty("encoding", "UTF-8");
        transformerNewTransformer.transform(new DOMSource(node), new StreamResult(stringWriter));
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "writer.toString()");
        return StringKt.deleteLineBreak(StringKt.deleteXmlSpaces(string));
    }
}
