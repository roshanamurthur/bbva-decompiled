package com.bbva.ethermobilesdk.pinning.verifier;

import javax.xml.namespace.QName;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/* JADX INFO: compiled from: SignatureVerifier.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0001H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"getSignatureNode", "Lorg/w3c/dom/Node;", "node", "removeSignature", "", "verificationData", "Lcom/bbva/ethermobilesdk/pinning/verifier/VerificationData;", "Lorg/w3c/dom/Document;", "pinning_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SignatureVerifierKt {
    private static final Node getSignatureNode(Node node) {
        int length = node.getChildNodes().getLength();
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                Node child = node.getChildNodes().item(i10);
                if (Intrinsics.areEqual(child.getNodeName(), "signature")) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    return child;
                }
                if (i10 != length) {
                    i10++;
                }
            }
        }
        throw new IllegalStateException("Signature node not found".toString());
    }

    private static final void removeSignature(Node node) {
        node.removeChild(getSignatureNode(node));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationData verificationData(Document document) throws XPathExpressionException {
        XPath xPathNewXPath = XPathFactory.newInstance().newXPath();
        Intrinsics.checkNotNullExpressionValue(xPathNewXPath, "newInstance().newXPath()");
        XPathExpression xPathExpressionCompile = xPathNewXPath.compile("/sslpinningconfig/properties");
        QName qName = XPathConstants.NODE;
        Object objEvaluate = xPathExpressionCompile.evaluate(document, qName);
        Intrinsics.checkNotNull(objEvaluate, "null cannot be cast to non-null type org.w3c.dom.Node");
        Node node = (Node) objEvaluate;
        Object objEvaluate2 = xPathNewXPath.compile("/sslpinningconfig/sitecatalog").evaluate(document, qName);
        Intrinsics.checkNotNull(objEvaluate2, "null cannot be cast to non-null type org.w3c.dom.Node");
        Node node2 = (Node) objEvaluate2;
        removeSignature(node);
        removeSignature(node2);
        return new VerificationData(node, node2);
    }
}
