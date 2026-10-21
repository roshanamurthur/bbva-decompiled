package com.bbva.ethermobilesdk.pinning.verifier;

import com.bbva.ethermobile.elogger.LoggerLevel;
import com.bbva.ethermobile.help.kit.result.ResultKt;
import com.bbva.ethermobilesdk.cipher.extension.PublicKeyKt;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import com.bbva.ethermobilesdk.pinning.data.catalog.PinningConfigDTO;
import com.bbva.ethermobilesdk.pinning.data.catalog.SignatureDTO;
import com.bbva.ethermobilesdk.pinning.extension.ExceptionKt;
import com.bbva.ethermobilesdk.pinning.extension.StringKt;
import com.bbva.ethermobilesdk.pinning.logger.LoggerKt;
import com.bbva.ethermobilesdk.pinning.model.result.ErrorType;
import com.bbva.ethermobilesdk.pinning.provider.catalog.Parser;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.PublicKey;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: SignatureVerifier.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/verifier/SignatureVerifier;", "", "()V", "parser", "Lcom/bbva/ethermobilesdk/pinning/provider/catalog/Parser;", "readVerificationData", "Lcom/bbva/ethermobilesdk/pinning/verifier/VerificationData;", "rawCatalog", "Ljava/io/InputStream;", "verify", "", "config", "Lcom/bbva/ethermobilesdk/pinning/data/catalog/PinningConfigDTO;", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SignatureVerifier {

    @NotNull
    private final Parser parser = new Parser();

    private final VerificationData readVerificationData(InputStream rawCatalog) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        Intrinsics.checkNotNullExpressionValue(documentBuilderFactoryNewInstance, "newInstance()");
        DocumentBuilder documentBuilderNewDocumentBuilder = documentBuilderFactoryNewInstance.newDocumentBuilder();
        Intrinsics.checkNotNullExpressionValue(documentBuilderNewDocumentBuilder, "builderFactory.newDocumentBuilder()");
        Document document = documentBuilderNewDocumentBuilder.parse(rawCatalog);
        Intrinsics.checkNotNullExpressionValue(document, "builder.parse(rawCatalog)");
        return SignatureVerifierKt.verificationData(document);
    }

    public final boolean verify(@NotNull PinningConfigDTO config, @NotNull InputStream rawCatalog) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(rawCatalog, "rawCatalog");
        SignatureDTO signature = config.getProperties().getSignature();
        SignatureDTO signature2 = config.getSiteCatalog().getSignature();
        String updatePubKey = config.getProperties().getUpdatePubKey();
        if (signature == null || signature2 == null || updatePubKey == null) {
            ExceptionKt.throwError$default(ErrorType.SignatureIsNotPresent.INSTANCE, (Throwable) null, 2, (Object) null);
            throw new KotlinNothingValueException();
        }
        try {
            PublicKey publicKey = StringKt.toPublicKey(updatePubKey);
            VerificationData verificationData = readVerificationData(rawCatalog);
            String strSerialize = this.parser.serialize(verificationData.getProperties());
            String str = signature.getTimestamp() + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + strSerialize;
            Charset charset = Charsets.UTF_8;
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            boolean zBooleanValue = ((Boolean) ResultKt.getOrThrow(PublicKeyKt.verify(publicKey, bytes, EncodingUtilsKt.base64ToByteArray(signature.getValue()), ConstantKt.ALGORITHM_VERIFY_SIGNATURE))).booleanValue();
            String strSerialize2 = this.parser.serialize(verificationData.getSiteCatalog());
            byte[] bytes2 = (signature2.getTimestamp() + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + strSerialize2).getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
            boolean z10 = zBooleanValue && ((Boolean) ResultKt.getOrThrow(PublicKeyKt.verify(publicKey, bytes2, EncodingUtilsKt.base64ToByteArray(signature2.getValue()), ConstantKt.ALGORITHM_VERIFY_SIGNATURE))).booleanValue();
            LoggerKt.log(LoggerLevel.INFO, "configuration is ".concat(z10 ? "valid" : "not valid"));
            return z10;
        } catch (Throwable th2) {
            LoggerKt.logError("Failed to verify configuration.", th2);
            return false;
        }
    }
}
