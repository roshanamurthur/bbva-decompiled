package org.bouncycastle.x509;

import androidx.webkit.ProxyConfig;
import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.x509.AccessDescription;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AuthorityInformationAccess;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.GeneralSubtree;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.NameConstraints;
import org.bouncycastle.asn1.x509.PolicyInformation;
import org.bouncycastle.asn1.x509.qualified.ETSIQCObjectIdentifiers;
import org.bouncycastle.asn1.x509.qualified.MonetaryValue;
import org.bouncycastle.asn1.x509.qualified.QCStatement;
import org.bouncycastle.asn1.x509.qualified.RFC3739QCObjectIdentifiers;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.LocaleString;
import org.bouncycastle.i18n.filter.TrustedInput;
import org.bouncycastle.i18n.filter.UntrustedInput;
import org.bouncycastle.i18n.filter.UntrustedUrlInput;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidator;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException;
import org.bouncycastle.jce.provider.PKIXPolicyNode;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes13.dex */
public class PKIXCertPathReviewer extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f91697b = Extension.qCStatements.getId();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f91698c = Extension.cRLDistributionPoints.getId();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f91699d = Extension.authorityInfoAccess.getId();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f91700a;
    protected CertPath certPath;
    protected List certs;
    protected List[] errors;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f91701n;
    protected List[] notifications;
    protected PKIXParameters pkixParams;
    protected PolicyNode policyTree;
    protected PublicKey subjectPublicKey;
    protected TrustAnchor trustAnchor;
    protected Date validDate;

    public PKIXCertPathReviewer() {
    }

    public static X509CRL d(String str) throws CertPathReviewerException {
        try {
            URL url = new URL(str);
            if (!url.getProtocol().equals(ProxyConfig.MATCH_HTTP) && !url.getProtocol().equals(ProxyConfig.MATCH_HTTPS)) {
                return null;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                return (X509CRL) CertificateFactory.getInstance(ConstantKt.CERTIFICATE_TYPE_X509, BouncyCastleProvider.PROVIDER_NAME).generateCRL(httpURLConnection.getInputStream());
            }
            throw new Exception(httpURLConnection.getResponseMessage());
        } catch (Exception e5) {
            throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.loadCrlDistPointError", new Object[]{new UntrustedInput(str), e5.getMessage(), e5, e5.getClass().getName()}));
        }
    }

    public void addError(ErrorBundle errorBundle) {
        this.errors[0].add(errorBundle);
    }

    public void addNotification(ErrorBundle errorBundle) {
        this.notifications[0].add(errorBundle);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0222 A[Catch: CertPathReviewerException -> 0x00e0, TryCatch #8 {CertPathReviewerException -> 0x00e0, blocks: (B:17:0x006f, B:21:0x007f, B:23:0x008c, B:27:0x009c, B:28:0x00a7, B:30:0x00ad, B:32:0x00ce, B:33:0x00d6, B:35:0x00dc, B:39:0x00e4, B:40:0x00f0, B:44:0x00fc, B:47:0x0103, B:48:0x010c, B:50:0x0112, B:52:0x011c, B:55:0x0123, B:57:0x0127, B:97:0x0213, B:99:0x0219, B:100:0x021c, B:102:0x0222, B:104:0x022e, B:107:0x0236, B:108:0x0239, B:109:0x023c, B:111:0x0242, B:112:0x024b, B:114:0x0251, B:122:0x0274, B:123:0x0280, B:124:0x0281, B:126:0x0285, B:128:0x028d, B:129:0x0291, B:131:0x0297, B:134:0x02b9, B:136:0x02c3, B:137:0x02c8, B:138:0x02d4, B:139:0x02d5, B:140:0x02e1, B:142:0x02e4, B:143:0x02f1, B:145:0x02f7, B:147:0x031d, B:149:0x0335, B:148:0x032c, B:150:0x033c, B:151:0x0342, B:153:0x0348, B:155:0x0350, B:166:0x037a, B:159:0x0358, B:160:0x0364, B:162:0x0366, B:163:0x0375, B:170:0x0388, B:181:0x03a5, B:183:0x03af, B:184:0x03b3, B:186:0x03b9, B:191:0x03c9, B:194:0x03d6, B:197:0x03e3, B:199:0x03ed, B:210:0x042b, B:202:0x03f5, B:203:0x0403, B:204:0x0404, B:205:0x0412, B:207:0x0414, B:208:0x0422, B:61:0x0136, B:62:0x013a, B:64:0x0140, B:66:0x0156, B:68:0x0160, B:69:0x0165, B:71:0x016b, B:72:0x0179, B:74:0x017f, B:76:0x018b, B:80:0x0198, B:81:0x019e, B:83:0x01a4, B:88:0x01bd, B:77:0x018e, B:79:0x0192, B:92:0x01f6, B:95:0x0206, B:96:0x0212, B:212:0x043a, B:213:0x0447, B:214:0x0448, B:218:0x0459, B:220:0x0463, B:221:0x0468, B:223:0x046e, B:226:0x047c, B:233:0x0491, B:310:0x05e1, B:311:0x05ed, B:236:0x049c, B:237:0x04a8, B:238:0x04a9, B:240:0x04af, B:242:0x04b7, B:244:0x04bd, B:246:0x04c7, B:247:0x04ca, B:249:0x04d0, B:251:0x04e0, B:252:0x04e4, B:254:0x04ea, B:255:0x04f2, B:256:0x04f5, B:257:0x04f8, B:258:0x04fc, B:260:0x0502, B:261:0x0510, B:263:0x0518, B:264:0x051b, B:266:0x0521, B:268:0x052d, B:269:0x0531, B:270:0x0534, B:271:0x0537, B:272:0x0543, B:274:0x0548, B:276:0x0552, B:277:0x0555, B:279:0x055b, B:281:0x056b, B:282:0x056f, B:284:0x0575, B:286:0x0585, B:287:0x0589, B:288:0x058c, B:289:0x058f, B:290:0x0595, B:292:0x059b, B:294:0x05ad, B:297:0x05b7, B:299:0x05bd, B:300:0x05c0, B:302:0x05c6, B:304:0x05d2, B:305:0x05d6, B:306:0x05d9, B:312:0x05ee, B:313:0x05fa), top: B:328:0x006f, inners: #0, #1, #2, #3, #4, #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x022e A[Catch: CertPathReviewerException -> 0x00e0, TryCatch #8 {CertPathReviewerException -> 0x00e0, blocks: (B:17:0x006f, B:21:0x007f, B:23:0x008c, B:27:0x009c, B:28:0x00a7, B:30:0x00ad, B:32:0x00ce, B:33:0x00d6, B:35:0x00dc, B:39:0x00e4, B:40:0x00f0, B:44:0x00fc, B:47:0x0103, B:48:0x010c, B:50:0x0112, B:52:0x011c, B:55:0x0123, B:57:0x0127, B:97:0x0213, B:99:0x0219, B:100:0x021c, B:102:0x0222, B:104:0x022e, B:107:0x0236, B:108:0x0239, B:109:0x023c, B:111:0x0242, B:112:0x024b, B:114:0x0251, B:122:0x0274, B:123:0x0280, B:124:0x0281, B:126:0x0285, B:128:0x028d, B:129:0x0291, B:131:0x0297, B:134:0x02b9, B:136:0x02c3, B:137:0x02c8, B:138:0x02d4, B:139:0x02d5, B:140:0x02e1, B:142:0x02e4, B:143:0x02f1, B:145:0x02f7, B:147:0x031d, B:149:0x0335, B:148:0x032c, B:150:0x033c, B:151:0x0342, B:153:0x0348, B:155:0x0350, B:166:0x037a, B:159:0x0358, B:160:0x0364, B:162:0x0366, B:163:0x0375, B:170:0x0388, B:181:0x03a5, B:183:0x03af, B:184:0x03b3, B:186:0x03b9, B:191:0x03c9, B:194:0x03d6, B:197:0x03e3, B:199:0x03ed, B:210:0x042b, B:202:0x03f5, B:203:0x0403, B:204:0x0404, B:205:0x0412, B:207:0x0414, B:208:0x0422, B:61:0x0136, B:62:0x013a, B:64:0x0140, B:66:0x0156, B:68:0x0160, B:69:0x0165, B:71:0x016b, B:72:0x0179, B:74:0x017f, B:76:0x018b, B:80:0x0198, B:81:0x019e, B:83:0x01a4, B:88:0x01bd, B:77:0x018e, B:79:0x0192, B:92:0x01f6, B:95:0x0206, B:96:0x0212, B:212:0x043a, B:213:0x0447, B:214:0x0448, B:218:0x0459, B:220:0x0463, B:221:0x0468, B:223:0x046e, B:226:0x047c, B:233:0x0491, B:310:0x05e1, B:311:0x05ed, B:236:0x049c, B:237:0x04a8, B:238:0x04a9, B:240:0x04af, B:242:0x04b7, B:244:0x04bd, B:246:0x04c7, B:247:0x04ca, B:249:0x04d0, B:251:0x04e0, B:252:0x04e4, B:254:0x04ea, B:255:0x04f2, B:256:0x04f5, B:257:0x04f8, B:258:0x04fc, B:260:0x0502, B:261:0x0510, B:263:0x0518, B:264:0x051b, B:266:0x0521, B:268:0x052d, B:269:0x0531, B:270:0x0534, B:271:0x0537, B:272:0x0543, B:274:0x0548, B:276:0x0552, B:277:0x0555, B:279:0x055b, B:281:0x056b, B:282:0x056f, B:284:0x0575, B:286:0x0585, B:287:0x0589, B:288:0x058c, B:289:0x058f, B:290:0x0595, B:292:0x059b, B:294:0x05ad, B:297:0x05b7, B:299:0x05bd, B:300:0x05c0, B:302:0x05c6, B:304:0x05d2, B:305:0x05d6, B:306:0x05d9, B:312:0x05ee, B:313:0x05fa), top: B:328:0x006f, inners: #0, #1, #2, #3, #4, #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0242 A[Catch: CertPathReviewerException -> 0x00e0, TryCatch #8 {CertPathReviewerException -> 0x00e0, blocks: (B:17:0x006f, B:21:0x007f, B:23:0x008c, B:27:0x009c, B:28:0x00a7, B:30:0x00ad, B:32:0x00ce, B:33:0x00d6, B:35:0x00dc, B:39:0x00e4, B:40:0x00f0, B:44:0x00fc, B:47:0x0103, B:48:0x010c, B:50:0x0112, B:52:0x011c, B:55:0x0123, B:57:0x0127, B:97:0x0213, B:99:0x0219, B:100:0x021c, B:102:0x0222, B:104:0x022e, B:107:0x0236, B:108:0x0239, B:109:0x023c, B:111:0x0242, B:112:0x024b, B:114:0x0251, B:122:0x0274, B:123:0x0280, B:124:0x0281, B:126:0x0285, B:128:0x028d, B:129:0x0291, B:131:0x0297, B:134:0x02b9, B:136:0x02c3, B:137:0x02c8, B:138:0x02d4, B:139:0x02d5, B:140:0x02e1, B:142:0x02e4, B:143:0x02f1, B:145:0x02f7, B:147:0x031d, B:149:0x0335, B:148:0x032c, B:150:0x033c, B:151:0x0342, B:153:0x0348, B:155:0x0350, B:166:0x037a, B:159:0x0358, B:160:0x0364, B:162:0x0366, B:163:0x0375, B:170:0x0388, B:181:0x03a5, B:183:0x03af, B:184:0x03b3, B:186:0x03b9, B:191:0x03c9, B:194:0x03d6, B:197:0x03e3, B:199:0x03ed, B:210:0x042b, B:202:0x03f5, B:203:0x0403, B:204:0x0404, B:205:0x0412, B:207:0x0414, B:208:0x0422, B:61:0x0136, B:62:0x013a, B:64:0x0140, B:66:0x0156, B:68:0x0160, B:69:0x0165, B:71:0x016b, B:72:0x0179, B:74:0x017f, B:76:0x018b, B:80:0x0198, B:81:0x019e, B:83:0x01a4, B:88:0x01bd, B:77:0x018e, B:79:0x0192, B:92:0x01f6, B:95:0x0206, B:96:0x0212, B:212:0x043a, B:213:0x0447, B:214:0x0448, B:218:0x0459, B:220:0x0463, B:221:0x0468, B:223:0x046e, B:226:0x047c, B:233:0x0491, B:310:0x05e1, B:311:0x05ed, B:236:0x049c, B:237:0x04a8, B:238:0x04a9, B:240:0x04af, B:242:0x04b7, B:244:0x04bd, B:246:0x04c7, B:247:0x04ca, B:249:0x04d0, B:251:0x04e0, B:252:0x04e4, B:254:0x04ea, B:255:0x04f2, B:256:0x04f5, B:257:0x04f8, B:258:0x04fc, B:260:0x0502, B:261:0x0510, B:263:0x0518, B:264:0x051b, B:266:0x0521, B:268:0x052d, B:269:0x0531, B:270:0x0534, B:271:0x0537, B:272:0x0543, B:274:0x0548, B:276:0x0552, B:277:0x0555, B:279:0x055b, B:281:0x056b, B:282:0x056f, B:284:0x0575, B:286:0x0585, B:287:0x0589, B:288:0x058c, B:289:0x058f, B:290:0x0595, B:292:0x059b, B:294:0x05ad, B:297:0x05b7, B:299:0x05bd, B:300:0x05c0, B:302:0x05c6, B:304:0x05d2, B:305:0x05d6, B:306:0x05d9, B:312:0x05ee, B:313:0x05fa), top: B:328:0x006f, inners: #0, #1, #2, #3, #4, #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0251 A[Catch: CertPathReviewerException -> 0x00e0, LOOP:6: B:112:0x024b->B:114:0x0251, LOOP_END, TryCatch #8 {CertPathReviewerException -> 0x00e0, blocks: (B:17:0x006f, B:21:0x007f, B:23:0x008c, B:27:0x009c, B:28:0x00a7, B:30:0x00ad, B:32:0x00ce, B:33:0x00d6, B:35:0x00dc, B:39:0x00e4, B:40:0x00f0, B:44:0x00fc, B:47:0x0103, B:48:0x010c, B:50:0x0112, B:52:0x011c, B:55:0x0123, B:57:0x0127, B:97:0x0213, B:99:0x0219, B:100:0x021c, B:102:0x0222, B:104:0x022e, B:107:0x0236, B:108:0x0239, B:109:0x023c, B:111:0x0242, B:112:0x024b, B:114:0x0251, B:122:0x0274, B:123:0x0280, B:124:0x0281, B:126:0x0285, B:128:0x028d, B:129:0x0291, B:131:0x0297, B:134:0x02b9, B:136:0x02c3, B:137:0x02c8, B:138:0x02d4, B:139:0x02d5, B:140:0x02e1, B:142:0x02e4, B:143:0x02f1, B:145:0x02f7, B:147:0x031d, B:149:0x0335, B:148:0x032c, B:150:0x033c, B:151:0x0342, B:153:0x0348, B:155:0x0350, B:166:0x037a, B:159:0x0358, B:160:0x0364, B:162:0x0366, B:163:0x0375, B:170:0x0388, B:181:0x03a5, B:183:0x03af, B:184:0x03b3, B:186:0x03b9, B:191:0x03c9, B:194:0x03d6, B:197:0x03e3, B:199:0x03ed, B:210:0x042b, B:202:0x03f5, B:203:0x0403, B:204:0x0404, B:205:0x0412, B:207:0x0414, B:208:0x0422, B:61:0x0136, B:62:0x013a, B:64:0x0140, B:66:0x0156, B:68:0x0160, B:69:0x0165, B:71:0x016b, B:72:0x0179, B:74:0x017f, B:76:0x018b, B:80:0x0198, B:81:0x019e, B:83:0x01a4, B:88:0x01bd, B:77:0x018e, B:79:0x0192, B:92:0x01f6, B:95:0x0206, B:96:0x0212, B:212:0x043a, B:213:0x0447, B:214:0x0448, B:218:0x0459, B:220:0x0463, B:221:0x0468, B:223:0x046e, B:226:0x047c, B:233:0x0491, B:310:0x05e1, B:311:0x05ed, B:236:0x049c, B:237:0x04a8, B:238:0x04a9, B:240:0x04af, B:242:0x04b7, B:244:0x04bd, B:246:0x04c7, B:247:0x04ca, B:249:0x04d0, B:251:0x04e0, B:252:0x04e4, B:254:0x04ea, B:255:0x04f2, B:256:0x04f5, B:257:0x04f8, B:258:0x04fc, B:260:0x0502, B:261:0x0510, B:263:0x0518, B:264:0x051b, B:266:0x0521, B:268:0x052d, B:269:0x0531, B:270:0x0534, B:271:0x0537, B:272:0x0543, B:274:0x0548, B:276:0x0552, B:277:0x0555, B:279:0x055b, B:281:0x056b, B:282:0x056f, B:284:0x0575, B:286:0x0585, B:287:0x0589, B:288:0x058c, B:289:0x058f, B:290:0x0595, B:292:0x059b, B:294:0x05ad, B:297:0x05b7, B:299:0x05bd, B:300:0x05c0, B:302:0x05c6, B:304:0x05d2, B:305:0x05d6, B:306:0x05d9, B:312:0x05ee, B:313:0x05fa), top: B:328:0x006f, inners: #0, #1, #2, #3, #4, #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:354:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0219 A[Catch: CertPathReviewerException -> 0x00e0, TryCatch #8 {CertPathReviewerException -> 0x00e0, blocks: (B:17:0x006f, B:21:0x007f, B:23:0x008c, B:27:0x009c, B:28:0x00a7, B:30:0x00ad, B:32:0x00ce, B:33:0x00d6, B:35:0x00dc, B:39:0x00e4, B:40:0x00f0, B:44:0x00fc, B:47:0x0103, B:48:0x010c, B:50:0x0112, B:52:0x011c, B:55:0x0123, B:57:0x0127, B:97:0x0213, B:99:0x0219, B:100:0x021c, B:102:0x0222, B:104:0x022e, B:107:0x0236, B:108:0x0239, B:109:0x023c, B:111:0x0242, B:112:0x024b, B:114:0x0251, B:122:0x0274, B:123:0x0280, B:124:0x0281, B:126:0x0285, B:128:0x028d, B:129:0x0291, B:131:0x0297, B:134:0x02b9, B:136:0x02c3, B:137:0x02c8, B:138:0x02d4, B:139:0x02d5, B:140:0x02e1, B:142:0x02e4, B:143:0x02f1, B:145:0x02f7, B:147:0x031d, B:149:0x0335, B:148:0x032c, B:150:0x033c, B:151:0x0342, B:153:0x0348, B:155:0x0350, B:166:0x037a, B:159:0x0358, B:160:0x0364, B:162:0x0366, B:163:0x0375, B:170:0x0388, B:181:0x03a5, B:183:0x03af, B:184:0x03b3, B:186:0x03b9, B:191:0x03c9, B:194:0x03d6, B:197:0x03e3, B:199:0x03ed, B:210:0x042b, B:202:0x03f5, B:203:0x0403, B:204:0x0404, B:205:0x0412, B:207:0x0414, B:208:0x0422, B:61:0x0136, B:62:0x013a, B:64:0x0140, B:66:0x0156, B:68:0x0160, B:69:0x0165, B:71:0x016b, B:72:0x0179, B:74:0x017f, B:76:0x018b, B:80:0x0198, B:81:0x019e, B:83:0x01a4, B:88:0x01bd, B:77:0x018e, B:79:0x0192, B:92:0x01f6, B:95:0x0206, B:96:0x0212, B:212:0x043a, B:213:0x0447, B:214:0x0448, B:218:0x0459, B:220:0x0463, B:221:0x0468, B:223:0x046e, B:226:0x047c, B:233:0x0491, B:310:0x05e1, B:311:0x05ed, B:236:0x049c, B:237:0x04a8, B:238:0x04a9, B:240:0x04af, B:242:0x04b7, B:244:0x04bd, B:246:0x04c7, B:247:0x04ca, B:249:0x04d0, B:251:0x04e0, B:252:0x04e4, B:254:0x04ea, B:255:0x04f2, B:256:0x04f5, B:257:0x04f8, B:258:0x04fc, B:260:0x0502, B:261:0x0510, B:263:0x0518, B:264:0x051b, B:266:0x0521, B:268:0x052d, B:269:0x0531, B:270:0x0534, B:271:0x0537, B:272:0x0543, B:274:0x0548, B:276:0x0552, B:277:0x0555, B:279:0x055b, B:281:0x056b, B:282:0x056f, B:284:0x0575, B:286:0x0585, B:287:0x0589, B:288:0x058c, B:289:0x058f, B:290:0x0595, B:292:0x059b, B:294:0x05ad, B:297:0x05b7, B:299:0x05bd, B:300:0x05c0, B:302:0x05c6, B:304:0x05d2, B:305:0x05d6, B:306:0x05d9, B:312:0x05ee, B:313:0x05fa), top: B:328:0x006f, inners: #0, #1, #2, #3, #4, #6, #9, #10 }] */
    public final void c() {
        int i10;
        int i11;
        int i12;
        PKIXPolicyNode pKIXPolicyNodeRemovePolicyNode;
        String str;
        int i13;
        int i14;
        HashSet hashSet;
        String str2;
        int i15;
        int iIntValueExact;
        int iIntValueExact2;
        String str3;
        HashSet hashSet2;
        String id;
        int i16;
        Set<String> criticalExtensionOIDs;
        boolean zContains;
        ArrayList arrayList;
        int i17;
        ArrayList arrayList2;
        int i18;
        PKIXPolicyNode pKIXPolicyNode;
        PKIXPolicyNode pKIXPolicyNodeRemovePolicyNode2;
        String str4 = "CertPathReviewer.policyExtError";
        Set<String> initialPolicies = this.pkixParams.getInitialPolicies();
        int i19 = this.f91701n + 1;
        ArrayList[] arrayListArr = new ArrayList[i19];
        for (int i20 = 0; i20 < i19; i20++) {
            arrayListArr[i20] = new ArrayList();
        }
        HashSet hashSet3 = new HashSet();
        hashSet3.add("2.5.29.32.0");
        PKIXPolicyNode pKIXPolicyNode2 = new PKIXPolicyNode(new ArrayList(), 0, hashSet3, null, new HashSet(), "2.5.29.32.0", false);
        arrayListArr[0].add(pKIXPolicyNode2);
        if (this.pkixParams.isExplicitPolicyRequired()) {
            i11 = 0;
            i10 = 1;
        } else {
            i10 = 1;
            i11 = this.f91701n + 1;
        }
        int i21 = this.pkixParams.isAnyPolicyInhibited() ? 0 : this.f91701n + i10;
        int i22 = this.pkixParams.isPolicyMappingInhibited() ? 0 : this.f91701n + i10;
        try {
            int size = this.certs.size() - i10;
            PKIXPolicyNode pKIXPolicyNodePrepareNextCertB2 = pKIXPolicyNode2;
            X509Certificate x509Certificate = null;
            HashSet hashSet4 = null;
            while (size >= 0) {
                int i23 = this.f91701n - size;
                X509Certificate x509Certificate2 = (X509Certificate) this.certs.get(size);
                int i24 = i19;
                try {
                    ASN1Sequence aSN1Sequence = (ASN1Sequence) a.getExtensionValue(x509Certificate2, a.CERTIFICATE_POLICIES);
                    if (aSN1Sequence == null || pKIXPolicyNodePrepareNextCertB2 == null) {
                        str = str4;
                        i13 = i21;
                        i14 = i22;
                        pKIXPolicyNodePrepareNextCertB2 = pKIXPolicyNodePrepareNextCertB2;
                    } else {
                        Enumeration objects = aSN1Sequence.getObjects();
                        HashSet hashSet5 = new HashSet();
                        while (objects.hasMoreElements()) {
                            PolicyInformation policyInformation = PolicyInformation.getInstance(objects.nextElement());
                            PKIXPolicyNode pKIXPolicyNode3 = pKIXPolicyNodePrepareNextCertB2;
                            ASN1ObjectIdentifier policyIdentifier = policyInformation.getPolicyIdentifier();
                            String str5 = str4;
                            hashSet5.add(policyIdentifier.getId());
                            if (!"2.5.29.32.0".equals(policyIdentifier.getId())) {
                                try {
                                    Set qualifierSet = a.getQualifierSet(policyInformation.getPolicyQualifiers());
                                    if (!a.processCertD1i(i23, arrayListArr, policyIdentifier, qualifierSet)) {
                                        a.processCertD1ii(i23, arrayListArr, policyIdentifier, qualifierSet);
                                    }
                                } catch (CertPathValidatorException e5) {
                                    throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.policyQualifierError"), e5, this.certPath, size);
                                }
                            }
                            pKIXPolicyNodePrepareNextCertB2 = pKIXPolicyNode3;
                            str4 = str5;
                        }
                        str = str4;
                        PKIXPolicyNode pKIXPolicyNode4 = pKIXPolicyNodePrepareNextCertB2;
                        if (hashSet4 == null || hashSet4.contains("2.5.29.32.0")) {
                            hashSet2 = hashSet5;
                        } else {
                            hashSet2 = new HashSet();
                            for (Object obj : hashSet4) {
                                if (hashSet5.contains(obj)) {
                                    hashSet2.add(obj);
                                }
                            }
                        }
                        if (i21 > 0 || (i23 < this.f91701n && a.isSelfIssued(x509Certificate2))) {
                            Enumeration objects2 = aSN1Sequence.getObjects();
                            while (true) {
                                if (!objects2.hasMoreElements()) {
                                    i13 = i21;
                                    i14 = i22;
                                    break;
                                }
                                PolicyInformation policyInformation2 = PolicyInformation.getInstance(objects2.nextElement());
                                if ("2.5.29.32.0".equals(policyInformation2.getPolicyIdentifier().getId())) {
                                    try {
                                        Set qualifierSet2 = a.getQualifierSet(policyInformation2.getPolicyQualifiers());
                                        ArrayList arrayList3 = arrayListArr[i23 - 1];
                                        for (int i25 = 0; i25 < arrayList3.size(); i25++) {
                                            PKIXPolicyNode pKIXPolicyNode5 = (PKIXPolicyNode) arrayList3.get(i25);
                                            for (Object obj2 : pKIXPolicyNode5.getExpectedPolicies()) {
                                                arrayList3 = arrayList3;
                                                i21 = i21;
                                                if (obj2 instanceof String) {
                                                    id = (String) obj2;
                                                } else if (obj2 instanceof ASN1ObjectIdentifier) {
                                                    id = ((ASN1ObjectIdentifier) obj2).getId();
                                                }
                                                Iterator children = pKIXPolicyNode5.getChildren();
                                                boolean z10 = false;
                                                while (children.hasNext()) {
                                                    Iterator it = children;
                                                    if (id.equals(((PKIXPolicyNode) children.next()).getValidPolicy())) {
                                                        z10 = true;
                                                    }
                                                    children = it;
                                                }
                                                if (!z10) {
                                                    HashSet hashSet6 = new HashSet();
                                                    hashSet6.add(id);
                                                    PKIXPolicyNode pKIXPolicyNode6 = new PKIXPolicyNode(new ArrayList(), i23, hashSet6, pKIXPolicyNode5, qualifierSet2, id, false);
                                                    pKIXPolicyNode5.addChild(pKIXPolicyNode6);
                                                    arrayListArr[i23].add(pKIXPolicyNode6);
                                                }
                                                i22 = i22;
                                            }
                                        }
                                        i13 = i21;
                                        i14 = i22;
                                        break;
                                    } catch (CertPathValidatorException e7) {
                                        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.policyQualifierError"), e7, this.certPath, size);
                                    }
                                }
                            }
                            pKIXPolicyNodePrepareNextCertB2 = pKIXPolicyNode4;
                            for (i16 = i23 - 1; i16 >= 0; i16--) {
                                arrayList2 = arrayListArr[i16];
                                for (i18 = 0; i18 < arrayList2.size(); i18++) {
                                    pKIXPolicyNode = (PKIXPolicyNode) arrayList2.get(i18);
                                    if (!pKIXPolicyNode.hasChildren()) {
                                        pKIXPolicyNodeRemovePolicyNode2 = a.removePolicyNode(pKIXPolicyNodePrepareNextCertB2, arrayListArr, pKIXPolicyNode);
                                        pKIXPolicyNodePrepareNextCertB2 = pKIXPolicyNodeRemovePolicyNode2;
                                        if (pKIXPolicyNodeRemovePolicyNode2 == null) {
                                            break;
                                        }
                                    }
                                }
                            }
                            criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                            if (criticalExtensionOIDs != null) {
                                zContains = criticalExtensionOIDs.contains(a.CERTIFICATE_POLICIES);
                                arrayList = arrayListArr[i23];
                                for (i17 = 0; i17 < arrayList.size(); i17++) {
                                    ((PKIXPolicyNode) arrayList.get(i17)).setCritical(zContains);
                                }
                            }
                            hashSet4 = hashSet2;
                        } else {
                            i13 = i21;
                            i14 = i22;
                            pKIXPolicyNodePrepareNextCertB2 = pKIXPolicyNode4;
                            while (i16 >= 0) {
                                arrayList2 = arrayListArr[i16];
                                while (i18 < arrayList2.size()) {
                                    pKIXPolicyNode = (PKIXPolicyNode) arrayList2.get(i18);
                                    if (!pKIXPolicyNode.hasChildren()) {
                                        pKIXPolicyNodeRemovePolicyNode2 = a.removePolicyNode(pKIXPolicyNodePrepareNextCertB2, arrayListArr, pKIXPolicyNode);
                                        pKIXPolicyNodePrepareNextCertB2 = pKIXPolicyNodeRemovePolicyNode2;
                                        if (pKIXPolicyNodeRemovePolicyNode2 == null) {
                                            break;
                                            break;
                                        }
                                    }
                                }
                            }
                            criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                            if (criticalExtensionOIDs != null) {
                                zContains = criticalExtensionOIDs.contains(a.CERTIFICATE_POLICIES);
                                arrayList = arrayListArr[i23];
                                while (i17 < arrayList.size()) {
                                    ((PKIXPolicyNode) arrayList.get(i17)).setCritical(zContains);
                                }
                            }
                            hashSet4 = hashSet2;
                        }
                    }
                    if (aSN1Sequence == null) {
                        pKIXPolicyNodePrepareNextCertB2 = null;
                    }
                    if (i11 <= 0 && pKIXPolicyNodePrepareNextCertB2 == null) {
                        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noValidPolicyTree"));
                    }
                    if (i23 != this.f91701n) {
                        try {
                            ASN1Primitive extensionValue = a.getExtensionValue(x509Certificate2, a.POLICY_MAPPINGS);
                            if (extensionValue != null) {
                                ASN1Sequence aSN1Sequence2 = (ASN1Sequence) extensionValue;
                                int i26 = 0;
                                while (i26 < aSN1Sequence2.size()) {
                                    ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence2.getObjectAt(i26);
                                    ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) aSN1Sequence3.getObjectAt(0);
                                    ASN1ObjectIdentifier aSN1ObjectIdentifier2 = (ASN1ObjectIdentifier) aSN1Sequence3.getObjectAt(1);
                                    boolean zEquals = "2.5.29.32.0".equals(aSN1ObjectIdentifier.getId());
                                    ASN1Sequence aSN1Sequence4 = aSN1Sequence2;
                                    if (zEquals) {
                                        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.invalidPolicyMapping"), this.certPath, size);
                                    }
                                    if ("2.5.29.32.0".equals(aSN1ObjectIdentifier2.getId())) {
                                        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.invalidPolicyMapping"), this.certPath, size);
                                    }
                                    i26++;
                                    aSN1Sequence2 = aSN1Sequence4;
                                }
                            }
                            if (extensionValue != null) {
                                ASN1Sequence aSN1Sequence5 = (ASN1Sequence) extensionValue;
                                HashMap map = new HashMap();
                                HashSet<String> hashSet7 = new HashSet();
                                int i27 = 0;
                                while (i27 < aSN1Sequence5.size()) {
                                    ASN1Sequence aSN1Sequence6 = (ASN1Sequence) aSN1Sequence5.getObjectAt(i27);
                                    ASN1Sequence aSN1Sequence7 = aSN1Sequence5;
                                    String id2 = ((ASN1ObjectIdentifier) aSN1Sequence6.getObjectAt(0)).getId();
                                    HashSet hashSet8 = hashSet4;
                                    String id3 = ((ASN1ObjectIdentifier) aSN1Sequence6.getObjectAt(1)).getId();
                                    if (map.containsKey(id2)) {
                                        ((Set) map.get(id2)).add(id3);
                                    } else {
                                        HashSet hashSet9 = new HashSet();
                                        hashSet9.add(id3);
                                        map.put(id2, hashSet9);
                                        hashSet7.add(id2);
                                    }
                                    i27++;
                                    aSN1Sequence5 = aSN1Sequence7;
                                    hashSet4 = hashSet8;
                                }
                                hashSet = hashSet4;
                                for (String str6 : hashSet7) {
                                    if (i14 > 0) {
                                        try {
                                            a.prepareNextCertB1(i23, arrayListArr, str6, map, x509Certificate2);
                                            str3 = str;
                                        } catch (CertPathValidatorException e10) {
                                            throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.policyQualifierError"), e10, this.certPath, size);
                                        } catch (AnnotatedException e11) {
                                            throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", str), e11, this.certPath, size);
                                        }
                                    } else {
                                        str3 = str;
                                        if (i14 <= 0) {
                                            pKIXPolicyNodePrepareNextCertB2 = a.prepareNextCertB2(i23, arrayListArr, str6, pKIXPolicyNodePrepareNextCertB2);
                                        }
                                    }
                                    str = str3;
                                }
                            } else {
                                hashSet = hashSet4;
                            }
                            str2 = str;
                            if (a.isSelfIssued(x509Certificate2)) {
                                i15 = i13;
                                i22 = i14;
                            } else {
                                if (i11 != 0) {
                                    i11--;
                                }
                                i22 = i14 != 0 ? i14 - 1 : i14;
                                i15 = i13 != 0 ? i13 - 1 : i13;
                            }
                            try {
                                ASN1Sequence aSN1Sequence8 = (ASN1Sequence) a.getExtensionValue(x509Certificate2, a.POLICY_CONSTRAINTS);
                                if (aSN1Sequence8 != null) {
                                    Enumeration objects3 = aSN1Sequence8.getObjects();
                                    while (objects3.hasMoreElements()) {
                                        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects3.nextElement();
                                        int tagNo = aSN1TaggedObject.getTagNo();
                                        if (tagNo == 0) {
                                            int iIntValueExact3 = ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact();
                                            if (iIntValueExact3 < i11) {
                                                i11 = iIntValueExact3;
                                            }
                                        } else if (tagNo == 1 && (iIntValueExact2 = ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact()) < i22) {
                                            i22 = iIntValueExact2;
                                        }
                                    }
                                }
                                try {
                                    ASN1Integer aSN1Integer = (ASN1Integer) a.getExtensionValue(x509Certificate2, a.INHIBIT_ANY_POLICY);
                                    if (aSN1Integer != null && (iIntValueExact = aSN1Integer.intValueExact()) < i15) {
                                        i15 = iIntValueExact;
                                    }
                                } catch (AnnotatedException unused) {
                                    throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.policyInhibitExtError"), this.certPath, size);
                                }
                            } catch (AnnotatedException unused2) {
                                throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.policyConstExtError"), this.certPath, size);
                            }
                        } catch (AnnotatedException e12) {
                            throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.policyMapExtError"), e12, this.certPath, size);
                        }
                    } else {
                        hashSet = hashSet4;
                        str2 = str;
                        i15 = i13;
                        i22 = i14;
                    }
                    size--;
                    x509Certificate = x509Certificate2;
                    str4 = str2;
                    hashSet4 = hashSet;
                    i19 = i24;
                    i21 = i15;
                    initialPolicies = initialPolicies;
                } catch (AnnotatedException e13) {
                    throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", str4), e13, this.certPath, size);
                }
            }
            Set<String> set = initialPolicies;
            int i28 = i19;
            PKIXPolicyNode pKIXPolicyNode7 = pKIXPolicyNodePrepareNextCertB2;
            if (!a.isSelfIssued(x509Certificate) && i11 > 0) {
                i11--;
            }
            try {
                ASN1Sequence aSN1Sequence9 = (ASN1Sequence) a.getExtensionValue(x509Certificate, a.POLICY_CONSTRAINTS);
                if (aSN1Sequence9 != null) {
                    Enumeration objects4 = aSN1Sequence9.getObjects();
                    int i29 = i11;
                    while (objects4.hasMoreElements()) {
                        ASN1TaggedObject aSN1TaggedObject2 = (ASN1TaggedObject) objects4.nextElement();
                        if (aSN1TaggedObject2.getTagNo() == 0 && ASN1Integer.getInstance(aSN1TaggedObject2, false).intValueExact() == 0) {
                            i29 = 0;
                        }
                    }
                    i12 = 0;
                    i11 = i29;
                } else {
                    i12 = 0;
                }
                if (pKIXPolicyNode7 == null) {
                    if (this.pkixParams.isExplicitPolicyRequired()) {
                        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.explicitPolicy"), this.certPath, size);
                    }
                    pKIXPolicyNodeRemovePolicyNode = null;
                } else if (!a.isAnyPolicy(set)) {
                    HashSet<PKIXPolicyNode> hashSet10 = new HashSet();
                    for (int i30 = i12; i30 < i28; i30++) {
                        ArrayList arrayList4 = arrayListArr[i30];
                        for (int i31 = i12; i31 < arrayList4.size(); i31++) {
                            PKIXPolicyNode pKIXPolicyNode8 = (PKIXPolicyNode) arrayList4.get(i31);
                            if ("2.5.29.32.0".equals(pKIXPolicyNode8.getValidPolicy())) {
                                Iterator children2 = pKIXPolicyNode8.getChildren();
                                while (children2.hasNext()) {
                                    PKIXPolicyNode pKIXPolicyNode9 = (PKIXPolicyNode) children2.next();
                                    if (!"2.5.29.32.0".equals(pKIXPolicyNode9.getValidPolicy())) {
                                        hashSet10.add(pKIXPolicyNode9);
                                    }
                                }
                            }
                        }
                    }
                    pKIXPolicyNodeRemovePolicyNode = pKIXPolicyNode7;
                    for (PKIXPolicyNode pKIXPolicyNode10 : hashSet10) {
                        Set<String> set2 = set;
                        if (!set2.contains(pKIXPolicyNode10.getValidPolicy())) {
                            pKIXPolicyNodeRemovePolicyNode = a.removePolicyNode(pKIXPolicyNodeRemovePolicyNode, arrayListArr, pKIXPolicyNode10);
                        }
                        set = set2;
                    }
                    if (pKIXPolicyNodeRemovePolicyNode != null) {
                        for (int i32 = this.f91701n - 1; i32 >= 0; i32--) {
                            ArrayList arrayList5 = arrayListArr[i32];
                            for (int i33 = i12; i33 < arrayList5.size(); i33++) {
                                PKIXPolicyNode pKIXPolicyNode11 = (PKIXPolicyNode) arrayList5.get(i33);
                                if (!pKIXPolicyNode11.hasChildren()) {
                                    pKIXPolicyNodeRemovePolicyNode = a.removePolicyNode(pKIXPolicyNodeRemovePolicyNode, arrayListArr, pKIXPolicyNode11);
                                }
                            }
                        }
                    }
                } else if (!this.pkixParams.isExplicitPolicyRequired()) {
                    pKIXPolicyNodeRemovePolicyNode = pKIXPolicyNode7;
                } else {
                    if (hashSet4.isEmpty()) {
                        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.explicitPolicy"), this.certPath, size);
                    }
                    HashSet hashSet11 = new HashSet();
                    for (int i34 = i12; i34 < i28; i34++) {
                        ArrayList arrayList6 = arrayListArr[i34];
                        for (int i35 = i12; i35 < arrayList6.size(); i35++) {
                            PKIXPolicyNode pKIXPolicyNode12 = (PKIXPolicyNode) arrayList6.get(i35);
                            if ("2.5.29.32.0".equals(pKIXPolicyNode12.getValidPolicy())) {
                                Iterator children3 = pKIXPolicyNode12.getChildren();
                                while (children3.hasNext()) {
                                    hashSet11.add(children3.next());
                                }
                            }
                        }
                    }
                    Iterator it2 = hashSet11.iterator();
                    while (it2.hasNext()) {
                        hashSet4.contains(((PKIXPolicyNode) it2.next()).getValidPolicy());
                    }
                    pKIXPolicyNodeRemovePolicyNode = pKIXPolicyNode7;
                    for (int i36 = this.f91701n - 1; i36 >= 0; i36--) {
                        ArrayList arrayList7 = arrayListArr[i36];
                        for (int i37 = i12; i37 < arrayList7.size(); i37++) {
                            PKIXPolicyNode pKIXPolicyNode13 = (PKIXPolicyNode) arrayList7.get(i37);
                            if (!pKIXPolicyNode13.hasChildren()) {
                                pKIXPolicyNodeRemovePolicyNode = a.removePolicyNode(pKIXPolicyNodeRemovePolicyNode, arrayListArr, pKIXPolicyNode13);
                            }
                        }
                    }
                }
                if (i11 <= 0 && pKIXPolicyNodeRemovePolicyNode == null) {
                    throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.invalidPolicy"));
                }
            } catch (AnnotatedException unused3) {
                throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.policyConstExtError"), this.certPath, size);
            }
        } catch (CertPathReviewerException e14) {
            addError(e14.getErrorMessage(), e14.getIndex());
        }
    }

    /* JADX WARN: Code duplicated, block: B:94:0x02ba  */
    public void checkCRLs(PKIXParameters pKIXParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, Vector vector, int i10) throws CertPathReviewerException {
        Iterator it;
        X509CRL x509crl;
        X509CRL x509crl2;
        boolean z10;
        boolean z11;
        String str;
        boolean[] keyUsage;
        X509CRL x509crl3;
        Iterator it2;
        boolean z12;
        X509CRLStoreSelector x509CRLStoreSelector = new X509CRLStoreSelector();
        try {
            x509CRLStoreSelector.addIssuerName(a.getEncodedIssuerPrincipal(x509Certificate).getEncoded());
            x509CRLStoreSelector.setCertificateChecking(x509Certificate);
            try {
                a.CRL_UTIL.getClass();
                HashSet hashSetB = d.b(x509CRLStoreSelector, pKIXParameters);
                Iterator it3 = hashSetB.iterator();
                if (hashSetB.isEmpty()) {
                    Iterator it4 = d.b(new X509CRLStoreSelector(), pKIXParameters).iterator();
                    ArrayList arrayList = new ArrayList();
                    while (it4.hasNext()) {
                        arrayList.add(((X509CRL) it4.next()).getIssuerX500Principal());
                    }
                    addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noCrlInCertstore", new Object[]{new UntrustedInput(x509CRLStoreSelector.getIssuerNames()), new UntrustedInput(arrayList), Integers.valueOf(arrayList.size())}), i10);
                }
                it = it3;
                while (true) {
                    if (!it.hasNext()) {
                        x509crl2 = x509crl;
                        z10 = false;
                        break;
                    }
                    x509crl = (X509CRL) it.next();
                    if (x509crl.getNextUpdate() == null || pKIXParameters.getDate().before(x509crl.getNextUpdate())) {
                        addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.localValidCRL", new Object[]{new TrustedInput(x509crl.getThisUpdate()), new TrustedInput(x509crl.getNextUpdate())}), i10);
                        x509crl2 = x509crl;
                        z10 = true;
                        break;
                    }
                    addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.localInvalidCRL", new Object[]{new TrustedInput(x509crl.getThisUpdate()), new TrustedInput(x509crl.getNextUpdate())}), i10);
                }
            } catch (AnnotatedException e5) {
                addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlExtractionError", new Object[]{e5.getCause().getMessage(), e5.getCause(), e5.getCause().getClass().getName()}), i10);
                it = new ArrayList().iterator();
            }
            x509crl = null;
            if (!z10) {
                Iterator it5 = vector.iterator();
                boolean z13 = z10;
                while (true) {
                    if (!it5.hasNext()) {
                        z11 = z13;
                        break;
                    }
                    try {
                        String str2 = (String) it5.next();
                        X509CRL x509crlD = d(str2);
                        if (x509crlD != null) {
                            if (x509Certificate.getIssuerX500Principal().equals(x509crlD.getIssuerX500Principal())) {
                                x509crl3 = x509crl2;
                                it2 = it5;
                                try {
                                    if (x509crlD.getNextUpdate() == null || this.pkixParams.getDate().before(x509crlD.getNextUpdate())) {
                                        try {
                                            addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.onlineValidCRL", new Object[]{new TrustedInput(x509crlD.getThisUpdate()), new TrustedInput(x509crlD.getNextUpdate()), new UntrustedUrlInput(str2)}), i10);
                                            x509crl2 = x509crlD;
                                            z11 = true;
                                            break;
                                        } catch (CertPathReviewerException e7) {
                                            e = e7;
                                            z13 = true;
                                            addNotification(e.getErrorMessage(), i10);
                                            it5 = it2;
                                            x509crl2 = x509crl3;
                                        }
                                    } else {
                                        Object[] objArr = new Object[3];
                                        z12 = z13;
                                        try {
                                            objArr[0] = new TrustedInput(x509crlD.getThisUpdate());
                                            objArr[1] = new TrustedInput(x509crlD.getNextUpdate());
                                            objArr[2] = new UntrustedUrlInput(str2);
                                            addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.onlineInvalidCRL", objArr), i10);
                                            it5 = it2;
                                            x509crl2 = x509crl3;
                                            z13 = z12;
                                        } catch (CertPathReviewerException e10) {
                                            e = e10;
                                            z13 = z12;
                                            addNotification(e.getErrorMessage(), i10);
                                            it5 = it2;
                                            x509crl2 = x509crl3;
                                        }
                                    }
                                } catch (CertPathReviewerException e11) {
                                    e = e11;
                                }
                            } else {
                                try {
                                    x509crl3 = x509crl2;
                                    it2 = it5;
                                    try {
                                        addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.onlineCRLWrongCA", new Object[]{new UntrustedInput(x509crlD.getIssuerX500Principal().getName()), new UntrustedInput(x509Certificate.getIssuerX500Principal().getName()), new UntrustedUrlInput(str2)}), i10);
                                    } catch (CertPathReviewerException e12) {
                                        e = e12;
                                        addNotification(e.getErrorMessage(), i10);
                                        it5 = it2;
                                        x509crl2 = x509crl3;
                                    }
                                } catch (CertPathReviewerException e13) {
                                    e = e13;
                                    x509crl3 = x509crl2;
                                    it2 = it5;
                                }
                            }
                            addNotification(e.getErrorMessage(), i10);
                            it5 = it2;
                            x509crl2 = x509crl3;
                        } else {
                            x509crl3 = x509crl2;
                            it2 = it5;
                        }
                        z12 = z13;
                        it5 = it2;
                        x509crl2 = x509crl3;
                        z13 = z12;
                    } catch (CertPathReviewerException e14) {
                        e = e14;
                        x509crl3 = x509crl2;
                        it2 = it5;
                    }
                }
            } else {
                z11 = z10;
            }
            if (x509crl2 != null) {
                if (x509Certificate2 != null && (keyUsage = x509Certificate2.getKeyUsage()) != null && (keyUsage.length < 7 || !keyUsage[6])) {
                    throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noCrlSigningPermited"));
                }
                if (publicKey == null) {
                    throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlNoIssuerPublicKey"));
                }
                try {
                    x509crl2.verify(publicKey, BouncyCastleProvider.PROVIDER_NAME);
                    X509CRLEntry revokedCertificate = x509crl2.getRevokedCertificate(x509Certificate.getSerialNumber());
                    if (revokedCertificate != null) {
                        if (revokedCertificate.hasExtensions()) {
                            try {
                                ASN1Enumerated aSN1Enumerated = ASN1Enumerated.getInstance(a.getExtensionValue(revokedCertificate, Extension.reasonCode.getId()));
                                if (aSN1Enumerated != null) {
                                    str = a.crlReasons[aSN1Enumerated.intValueExact()];
                                } else {
                                    str = null;
                                }
                            } catch (AnnotatedException e15) {
                                throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlReasonExtError"), e15);
                            }
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = a.crlReasons[7];
                        }
                        LocaleString localeString = new LocaleString("org.bouncycastle.x509.CertPathReviewerMessages", str);
                        if (!date.before(revokedCertificate.getRevocationDate())) {
                            throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.certRevoked", new Object[]{new TrustedInput(revokedCertificate.getRevocationDate()), localeString}));
                        }
                        addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.revokedAfterValidation", new Object[]{new TrustedInput(revokedCertificate.getRevocationDate()), localeString}), i10);
                    } else {
                        addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.notRevoked"), i10);
                    }
                    if (x509crl2.getNextUpdate() != null && x509crl2.getNextUpdate().before(this.pkixParams.getDate())) {
                        addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlUpdateAvailable", new Object[]{new TrustedInput(x509crl2.getNextUpdate())}), i10);
                    }
                    try {
                        ASN1Primitive extensionValue = a.getExtensionValue(x509crl2, a.ISSUING_DISTRIBUTION_POINT);
                        try {
                            ASN1Primitive extensionValue2 = a.getExtensionValue(x509crl2, a.DELTA_CRL_INDICATOR);
                            if (extensionValue2 != null) {
                                X509CRLStoreSelector x509CRLStoreSelector2 = new X509CRLStoreSelector();
                                try {
                                    x509CRLStoreSelector2.addIssuerName(a.getIssuerPrincipal(x509crl2).getEncoded());
                                    x509CRLStoreSelector2.setMinCRLNumber(((ASN1Integer) extensionValue2).getPositiveValue());
                                    try {
                                        x509CRLStoreSelector2.setMaxCRLNumber(((ASN1Integer) a.getExtensionValue(x509crl2, a.CRL_NUMBER)).getPositiveValue().subtract(BigInteger.valueOf(1L)));
                                        try {
                                            a.CRL_UTIL.getClass();
                                            Iterator it6 = d.b(x509CRLStoreSelector2, pKIXParameters).iterator();
                                            while (true) {
                                                if (!it6.hasNext()) {
                                                    throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noBaseCRL"));
                                                }
                                                try {
                                                    ASN1Primitive extensionValue3 = a.getExtensionValue((X509CRL) it6.next(), a.ISSUING_DISTRIBUTION_POINT);
                                                    if (extensionValue == null) {
                                                        if (extensionValue3 == null) {
                                                            break;
                                                        }
                                                    } else if (extensionValue.equals(extensionValue3)) {
                                                        break;
                                                    }
                                                } catch (AnnotatedException e16) {
                                                    throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.distrPtExtError"), e16);
                                                }
                                            }
                                        } catch (AnnotatedException e17) {
                                            throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlExtractionError"), e17);
                                        }
                                    } catch (AnnotatedException e18) {
                                        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlNbrExtError"), e18);
                                    }
                                } catch (IOException e19) {
                                    throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlIssuerException"), e19);
                                }
                            }
                            if (extensionValue != null) {
                                IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(extensionValue);
                                try {
                                    BasicConstraints basicConstraints = BasicConstraints.getInstance(a.getExtensionValue(x509Certificate, a.BASIC_CONSTRAINTS));
                                    if (issuingDistributionPoint.onlyContainsUserCerts() && basicConstraints != null && basicConstraints.isCA()) {
                                        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlOnlyUserCert"));
                                    }
                                    if (issuingDistributionPoint.onlyContainsCACerts() && (basicConstraints == null || !basicConstraints.isCA())) {
                                        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlOnlyCaCert"));
                                    }
                                    if (issuingDistributionPoint.onlyContainsAttributeCerts()) {
                                        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlOnlyAttrCert"));
                                    }
                                } catch (AnnotatedException e20) {
                                    throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlBCExtError"), e20);
                                }
                            }
                        } catch (AnnotatedException unused) {
                            throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.deltaCrlExtError"));
                        }
                    } catch (AnnotatedException unused2) {
                        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.distrPtExtError"));
                    }
                } catch (Exception e21) {
                    throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlVerifyFailed"), e21);
                }
            }
            if (!z11) {
                throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noValidCrlFound"));
            }
        } catch (IOException e22) {
            throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlIssuerException"), e22);
        }
    }

    public void checkRevocation(PKIXParameters pKIXParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, Vector vector, Vector vector2, int i10) throws CertPathReviewerException {
        checkCRLs(pKIXParameters, x509Certificate, date, x509Certificate2, publicKey, vector, i10);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02dd A[Catch: AnnotatedException -> 0x02e2, TRY_LEAVE, TryCatch #19 {AnnotatedException -> 0x02e2, blocks: (B:99:0x02d5, B:101:0x02dd), top: B:297:0x02d5 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:108:0x02ff A[LOOP:2: B:106:0x02f9->B:108:0x02ff, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x0328 A[LOOP:3: B:110:0x0322->B:112:0x0328, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:122:0x036e  */
    /* JADX WARN: Code duplicated, block: B:129:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:136:0x03c6 A[Catch: AnnotatedException -> 0x03e0, TryCatch #21 {AnnotatedException -> 0x03e0, blocks: (B:134:0x03ba, B:136:0x03c6, B:138:0x03cc, B:139:0x03d5), top: B:299:0x03ba }] */
    /* JADX WARN: Code duplicated, block: B:138:0x03cc A[Catch: AnnotatedException -> 0x03e0, TryCatch #21 {AnnotatedException -> 0x03e0, blocks: (B:134:0x03ba, B:136:0x03c6, B:138:0x03cc, B:139:0x03d5), top: B:299:0x03ba }] */
    /* JADX WARN: Code duplicated, block: B:139:0x03d5 A[Catch: AnnotatedException -> 0x03e0, TRY_LEAVE, TryCatch #21 {AnnotatedException -> 0x03e0, blocks: (B:134:0x03ba, B:136:0x03c6, B:138:0x03cc, B:139:0x03d5), top: B:299:0x03ba }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0440 A[Catch: CertPathReviewerException -> 0x048e, TryCatch #24 {CertPathReviewerException -> 0x048e, blocks: (B:155:0x0436, B:157:0x0440, B:159:0x044e, B:160:0x0460, B:161:0x0466, B:162:0x0469, B:163:0x046c, B:166:0x0477, B:168:0x047d, B:169:0x0485, B:174:0x0492, B:175:0x04ab, B:177:0x04ad, B:178:0x04bb, B:180:0x04bd, B:181:0x04db, B:183:0x04dd, B:184:0x04fb, B:186:0x04fd, B:187:0x0516, B:188:0x0517, B:190:0x0521, B:192:0x052b, B:193:0x052e, B:196:0x0535, B:198:0x0538, B:199:0x0540, B:201:0x0545, B:202:0x0553), top: B:303:0x0436, inners: #5, #6, #11, #17, #22, #26 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x044e A[Catch: CertPathReviewerException -> 0x048e, TRY_LEAVE, TryCatch #24 {CertPathReviewerException -> 0x048e, blocks: (B:155:0x0436, B:157:0x0440, B:159:0x044e, B:160:0x0460, B:161:0x0466, B:162:0x0469, B:163:0x046c, B:166:0x0477, B:168:0x047d, B:169:0x0485, B:174:0x0492, B:175:0x04ab, B:177:0x04ad, B:178:0x04bb, B:180:0x04bd, B:181:0x04db, B:183:0x04dd, B:184:0x04fb, B:186:0x04fd, B:187:0x0516, B:188:0x0517, B:190:0x0521, B:192:0x052b, B:193:0x052e, B:196:0x0535, B:198:0x0538, B:199:0x0540, B:201:0x0545, B:202:0x0553), top: B:303:0x0436, inners: #5, #6, #11, #17, #22, #26 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0476  */
    /* JADX WARN: Code duplicated, block: B:168:0x047d A[Catch: CertPathReviewerException -> 0x048e, TRY_LEAVE, TryCatch #24 {CertPathReviewerException -> 0x048e, blocks: (B:155:0x0436, B:157:0x0440, B:159:0x044e, B:160:0x0460, B:161:0x0466, B:162:0x0469, B:163:0x046c, B:166:0x0477, B:168:0x047d, B:169:0x0485, B:174:0x0492, B:175:0x04ab, B:177:0x04ad, B:178:0x04bb, B:180:0x04bd, B:181:0x04db, B:183:0x04dd, B:184:0x04fb, B:186:0x04fd, B:187:0x0516, B:188:0x0517, B:190:0x0521, B:192:0x052b, B:193:0x052e, B:196:0x0535, B:198:0x0538, B:199:0x0540, B:201:0x0545, B:202:0x0553), top: B:303:0x0436, inners: #5, #6, #11, #17, #22, #26 }] */
    /* JADX WARN: Code duplicated, block: B:190:0x0521 A[Catch: CertPathReviewerException -> 0x048e, TRY_ENTER, TryCatch #24 {CertPathReviewerException -> 0x048e, blocks: (B:155:0x0436, B:157:0x0440, B:159:0x044e, B:160:0x0460, B:161:0x0466, B:162:0x0469, B:163:0x046c, B:166:0x0477, B:168:0x047d, B:169:0x0485, B:174:0x0492, B:175:0x04ab, B:177:0x04ad, B:178:0x04bb, B:180:0x04bd, B:181:0x04db, B:183:0x04dd, B:184:0x04fb, B:186:0x04fd, B:187:0x0516, B:188:0x0517, B:190:0x0521, B:192:0x052b, B:193:0x052e, B:196:0x0535, B:198:0x0538, B:199:0x0540, B:201:0x0545, B:202:0x0553), top: B:303:0x0436, inners: #5, #6, #11, #17, #22, #26 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x052b A[Catch: CertPathReviewerException -> 0x048e, TryCatch #24 {CertPathReviewerException -> 0x048e, blocks: (B:155:0x0436, B:157:0x0440, B:159:0x044e, B:160:0x0460, B:161:0x0466, B:162:0x0469, B:163:0x046c, B:166:0x0477, B:168:0x047d, B:169:0x0485, B:174:0x0492, B:175:0x04ab, B:177:0x04ad, B:178:0x04bb, B:180:0x04bd, B:181:0x04db, B:183:0x04dd, B:184:0x04fb, B:186:0x04fd, B:187:0x0516, B:188:0x0517, B:190:0x0521, B:192:0x052b, B:193:0x052e, B:196:0x0535, B:198:0x0538, B:199:0x0540, B:201:0x0545, B:202:0x0553), top: B:303:0x0436, inners: #5, #6, #11, #17, #22, #26 }] */
    /* JADX WARN: Code duplicated, block: B:195:0x0534  */
    /* JADX WARN: Code duplicated, block: B:198:0x0538 A[Catch: CertPathReviewerException -> 0x048e, LOOP:6: B:196:0x0535->B:198:0x0538, LOOP_END, TryCatch #24 {CertPathReviewerException -> 0x048e, blocks: (B:155:0x0436, B:157:0x0440, B:159:0x044e, B:160:0x0460, B:161:0x0466, B:162:0x0469, B:163:0x046c, B:166:0x0477, B:168:0x047d, B:169:0x0485, B:174:0x0492, B:175:0x04ab, B:177:0x04ad, B:178:0x04bb, B:180:0x04bd, B:181:0x04db, B:183:0x04dd, B:184:0x04fb, B:186:0x04fd, B:187:0x0516, B:188:0x0517, B:190:0x0521, B:192:0x052b, B:193:0x052e, B:196:0x0535, B:198:0x0538, B:199:0x0540, B:201:0x0545, B:202:0x0553), top: B:303:0x0436, inners: #5, #6, #11, #17, #22, #26 }] */
    /* JADX WARN: Code duplicated, block: B:206:0x056c  */
    /* JADX WARN: Code duplicated, block: B:208:0x057a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:209:0x057c  */
    /* JADX WARN: Code duplicated, block: B:224:0x05d9 A[Catch: CertPathReviewerException -> 0x05e4, CertPathValidatorException -> 0x05e7, TRY_LEAVE, TryCatch #4 {CertPathValidatorException -> 0x05e7, blocks: (B:222:0x05d3, B:224:0x05d9), top: B:271:0x05d3, outer: #20 }] */
    /* JADX WARN: Code duplicated, block: B:232:0x05f4 A[Catch: CertPathReviewerException -> 0x05e4, TryCatch #20 {CertPathReviewerException -> 0x05e4, blocks: (B:222:0x05d3, B:224:0x05d9, B:230:0x05ea, B:232:0x05f4, B:234:0x0602, B:237:0x060a, B:239:0x0644, B:241:0x064a, B:242:0x064d, B:243:0x0651, B:245:0x0657, B:250:0x068d, B:252:0x0693, B:253:0x0697, B:255:0x069d, B:248:0x0662, B:249:0x068c, B:256:0x06b9, B:257:0x06bd, B:258:0x06e1), top: B:271:0x05d3, inners: #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:252:0x0693 A[Catch: CertPathReviewerException -> 0x05e4, TryCatch #20 {CertPathReviewerException -> 0x05e4, blocks: (B:222:0x05d3, B:224:0x05d9, B:230:0x05ea, B:232:0x05f4, B:234:0x0602, B:237:0x060a, B:239:0x0644, B:241:0x064a, B:242:0x064d, B:243:0x0651, B:245:0x0657, B:250:0x068d, B:252:0x0693, B:253:0x0697, B:255:0x069d, B:248:0x0662, B:249:0x068c, B:256:0x06b9, B:257:0x06bd, B:258:0x06e1), top: B:271:0x05d3, inners: #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:255:0x069d A[Catch: CertPathReviewerException -> 0x05e4, LOOP:11: B:253:0x0697->B:255:0x069d, LOOP_END, TryCatch #20 {CertPathReviewerException -> 0x05e4, blocks: (B:222:0x05d3, B:224:0x05d9, B:230:0x05ea, B:232:0x05f4, B:234:0x0602, B:237:0x060a, B:239:0x0644, B:241:0x064a, B:242:0x064d, B:243:0x0651, B:245:0x0657, B:250:0x068d, B:252:0x0693, B:253:0x0697, B:255:0x069d, B:248:0x0662, B:249:0x068c, B:256:0x06b9, B:257:0x06bd, B:258:0x06e1), top: B:271:0x05d3, inners: #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:265:0x02bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x0657 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x01ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x01ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x0540 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x0540 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x06b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x012d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0133 A[Catch: IllegalArgumentException -> 0x0142, TRY_ENTER, TryCatch #25 {IllegalArgumentException -> 0x0142, blocks: (B:41:0x0133, B:42:0x0138), top: B:305:0x0131 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0138 A[Catch: IllegalArgumentException -> 0x0142, TRY_LEAVE, TryCatch #25 {IllegalArgumentException -> 0x0142, blocks: (B:41:0x0133, B:42:0x0138), top: B:305:0x0131 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0171  */
    /* JADX WARN: Code duplicated, block: B:53:0x0174  */
    /* JADX WARN: Code duplicated, block: B:55:0x017a  */
    /* JADX WARN: Code duplicated, block: B:56:0x017f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0199  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:77:0x021e  */
    /* JADX WARN: Code duplicated, block: B:83:0x024f  */
    /* JADX WARN: Code duplicated, block: B:95:0x02c5 A[Catch: AnnotatedException -> 0x02ca, TRY_LEAVE, TryCatch #0 {AnnotatedException -> 0x02ca, blocks: (B:93:0x02bd, B:95:0x02c5), top: B:265:0x02bd }] */
    /* JADX WARN: Code duplicated, block: B:98:0x02d4  */
    public void doChecks() {
        TrustAnchor trustAnchor;
        TrustAnchor trustAnchor2;
        X500Principal x500Principal;
        X509Certificate trustedCert;
        PublicKey cAPublicKey;
        X509Certificate x509Certificate;
        X500Principal subjectX500Principal;
        PublicKey nextWorkingKey;
        int size;
        PKIXNameConstraintValidator pKIXNameConstraintValidator;
        int i10;
        int size2;
        int i11;
        List<PKIXCertPathChecker> certPathCheckers;
        Iterator<PKIXCertPathChecker> it;
        int size3;
        X509Certificate x509Certificate2;
        Set<String> criticalExtensionOIDs;
        String str;
        Iterator<PKIXCertPathChecker> it2;
        Iterator<String> it3;
        X509Certificate x509Certificate3;
        BasicConstraints basicConstraints;
        BigInteger pathLenConstraint;
        int iIntValue;
        int size4;
        X509Certificate x509Certificate4;
        ASN1Sequence aSN1Sequence;
        GeneralSubtree[] permittedSubtrees;
        GeneralSubtree[] excludedSubtrees;
        int i12;
        X500Principal subjectPrincipal;
        ASN1Sequence aSN1Sequence2;
        int i13;
        GeneralName generalName;
        int i14;
        X509Certificate x509Certificate5;
        ErrorBundle errorBundle;
        ErrorBundle errorBundle2;
        CRLDistPoint cRLDistPoint;
        AuthorityInformationAccess authorityInformationAccess;
        Iterator it4;
        X509Certificate x509Certificate6;
        Iterator it5;
        int i15;
        int i16;
        PublicKey publicKey;
        X500Principal x500Principal2;
        TrustAnchor trustAnchor3;
        X509Certificate x509Certificate7;
        ASN1Primitive extensionValue;
        ASN1Primitive extensionValue2;
        boolean[] keyUsage;
        BasicConstraints basicConstraints2;
        ErrorBundle errorBundle3;
        byte[] extensionValue3;
        AuthorityKeyIdentifier authorityKeyIdentifier;
        GeneralNames authorityCertIssuer;
        GeneralName generalName2;
        BigInteger authorityCertSerialNumber;
        X509Certificate trustedCert2;
        boolean[] keyUsage2;
        if (!this.f91700a) {
            throw new IllegalStateException("Object not initialized. Call init() first.");
        }
        if (this.notifications == null) {
            int i17 = this.f91701n;
            this.notifications = new List[i17 + 1];
            char c10 = 1;
            this.errors = new List[i17 + 1];
            char c11 = 0;
            int i18 = 0;
            while (true) {
                List[] listArr = this.notifications;
                if (i18 >= listArr.length) {
                    break;
                }
                listArr[i18] = new ArrayList();
                this.errors[i18] = new ArrayList();
                i18++;
            }
            char c12 = 2;
            addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.certPathValidDate", new Object[]{new TrustedInput(this.validDate), new TrustedInput(new Date())}));
            try {
                try {
                    List list = this.certs;
                    X509Certificate x509Certificate8 = (X509Certificate) list.get(list.size() - 1);
                    Collection trustAnchors = getTrustAnchors(x509Certificate8, this.pkixParams.getTrustAnchors());
                    if (trustAnchors.size() <= 1) {
                        if (trustAnchors.isEmpty()) {
                            addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noTrustAnchorFound", new Object[]{new UntrustedInput(x509Certificate8.getIssuerX500Principal()), Integers.valueOf(this.pkixParams.getTrustAnchors().size())}));
                        } else {
                            trustAnchor = (TrustAnchor) trustAnchors.iterator().next();
                            try {
                                try {
                                    try {
                                        a.verifyX509Certificate(x509Certificate8, trustAnchor.getTrustedCert() != null ? trustAnchor.getTrustedCert().getPublicKey() : trustAnchor.getCAPublicKey(), this.pkixParams.getSigProvider());
                                    } catch (SignatureException unused) {
                                        addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.trustButInvalidCert"));
                                    } catch (Exception unused2) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.unknown", new Object[]{new UntrustedInput(th.getMessage()), new UntrustedInput(th)}));
                                }
                            } catch (CertPathReviewerException e5) {
                                e = e5;
                                addError(e.getErrorMessage());
                            }
                        }
                        trustAnchor2 = trustAnchor;
                        if (trustAnchor2 != null) {
                            trustedCert2 = trustAnchor2.getTrustedCert();
                            try {
                                if (trustedCert2 != null) {
                                    x500Principal = a.getSubjectPrincipal(trustedCert2);
                                } else {
                                    x500Principal = new X500Principal(trustAnchor2.getCAName());
                                }
                            } catch (IllegalArgumentException unused3) {
                                addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.trustDNInvalid", new Object[]{new UntrustedInput(trustAnchor2.getCAName())}));
                                x500Principal = null;
                            }
                            if (trustedCert2 != null && (keyUsage2 = trustedCert2.getKeyUsage()) != null && !keyUsage2[5]) {
                                addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.trustKeyUsage"));
                            }
                        } else {
                            x500Principal = null;
                        }
                        if (trustAnchor2 != null) {
                            trustedCert = trustAnchor2.getTrustedCert();
                            if (trustedCert != null) {
                                cAPublicKey = trustedCert.getPublicKey();
                            } else {
                                cAPublicKey = trustAnchor2.getCAPublicKey();
                            }
                            try {
                                AlgorithmIdentifier algorithmIdentifier = a.getAlgorithmIdentifier(cAPublicKey);
                                algorithmIdentifier.getAlgorithm();
                                algorithmIdentifier.getParameters();
                            } catch (CertPathValidatorException unused4) {
                                addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.trustPubKeyError"));
                            }
                        } else {
                            trustedCert = null;
                            cAPublicKey = null;
                        }
                        x509Certificate = trustedCert;
                        subjectX500Principal = x500Principal;
                        nextWorkingKey = cAPublicKey;
                        size = this.certs.size() - 1;
                        while (size >= 0) {
                            i14 = this.f91701n - size;
                            x509Certificate5 = (X509Certificate) this.certs.get(size);
                            if (nextWorkingKey != null) {
                                try {
                                    a.verifyX509Certificate(x509Certificate5, nextWorkingKey, this.pkixParams.getSigProvider());
                                } catch (GeneralSecurityException e7) {
                                    Object[] objArr = new Object[3];
                                    objArr[c11] = e7.getMessage();
                                    objArr[c10] = e7;
                                    objArr[c12] = e7.getClass().getName();
                                    errorBundle = new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.signatureNotVerified", objArr);
                                    addError(errorBundle, size);
                                }
                            } else if (a.isSelfIssued(x509Certificate5)) {
                                try {
                                    a.verifyX509Certificate(x509Certificate5, x509Certificate5.getPublicKey(), this.pkixParams.getSigProvider());
                                    addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.rootKeyIsValidButNotATrustAnchor"), size);
                                } catch (GeneralSecurityException e10) {
                                    Object[] objArr2 = new Object[3];
                                    objArr2[c11] = e10.getMessage();
                                    objArr2[c10] = e10;
                                    objArr2[c12] = e10.getClass().getName();
                                    errorBundle = new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.signatureNotVerified", objArr2);
                                    addError(errorBundle, size);
                                }
                            } else {
                                errorBundle3 = new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.NoIssuerPublicKey");
                                extensionValue3 = x509Certificate5.getExtensionValue(Extension.authorityKeyIdentifier.getId());
                                if (extensionValue3 != null && (authorityCertIssuer = (authorityKeyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1OctetString.getInstance(extensionValue3).getOctets())).getAuthorityCertIssuer()) != null) {
                                    generalName2 = authorityCertIssuer.getNames()[c11];
                                    authorityCertSerialNumber = authorityKeyIdentifier.getAuthorityCertSerialNumber();
                                    if (authorityCertSerialNumber != null) {
                                        Object[] objArr3 = new Object[7];
                                        objArr3[c11] = new LocaleString("org.bouncycastle.x509.CertPathReviewerMessages", "missingIssuer");
                                        objArr3[1] = " \"";
                                        objArr3[2] = generalName2;
                                        objArr3[3] = "\" ";
                                        objArr3[4] = new LocaleString("org.bouncycastle.x509.CertPathReviewerMessages", "missingSerial");
                                        objArr3[5] = " ";
                                        objArr3[6] = authorityCertSerialNumber;
                                        errorBundle3.setExtraArguments(objArr3);
                                    }
                                }
                                addError(errorBundle3, size);
                            }
                            try {
                                x509Certificate5.checkValidity(this.validDate);
                            } catch (CertificateExpiredException unused5) {
                                Object[] objArr4 = new Object[1];
                                objArr4[c11] = new TrustedInput(x509Certificate5.getNotAfter());
                                errorBundle2 = new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.certificateExpired", objArr4);
                                addError(errorBundle2, size);
                            } catch (CertificateNotYetValidException unused6) {
                                Object[] objArr5 = new Object[1];
                                objArr5[c11] = new TrustedInput(x509Certificate5.getNotBefore());
                                errorBundle2 = new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.certificateNotYetValid", objArr5);
                                addError(errorBundle2, size);
                            }
                            if (this.pkixParams.isRevocationEnabled()) {
                                try {
                                    extensionValue2 = a.getExtensionValue(x509Certificate5, f91698c);
                                    if (extensionValue2 != null) {
                                        cRLDistPoint = CRLDistPoint.getInstance(extensionValue2);
                                    } else {
                                        cRLDistPoint = null;
                                    }
                                } catch (AnnotatedException unused7) {
                                    addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlDistPtExtError"), size);
                                }
                                try {
                                    extensionValue = a.getExtensionValue(x509Certificate5, f91699d);
                                    if (extensionValue != null) {
                                        authorityInformationAccess = AuthorityInformationAccess.getInstance(extensionValue);
                                    } else {
                                        authorityInformationAccess = null;
                                    }
                                } catch (AnnotatedException unused8) {
                                    addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlAuthInfoAccError"), size);
                                }
                                Vector cRLDistUrls = getCRLDistUrls(cRLDistPoint);
                                Vector oCSPUrls = getOCSPUrls(authorityInformationAccess);
                                it4 = cRLDistUrls.iterator();
                                while (it4.hasNext()) {
                                    Object[] objArr6 = new Object[1];
                                    objArr6[c11] = new UntrustedUrlInput(it4.next());
                                    addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlDistPoint", objArr6), size);
                                    x509Certificate5 = x509Certificate5;
                                }
                                x509Certificate6 = x509Certificate5;
                                it5 = oCSPUrls.iterator();
                                while (it5.hasNext()) {
                                    Object[] objArr7 = new Object[1];
                                    objArr7[c11] = new UntrustedUrlInput(it5.next());
                                    addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.ocspLocation", objArr7), size);
                                }
                                try {
                                    x509Certificate7 = x509Certificate6;
                                    i15 = i14;
                                    i16 = size;
                                    publicKey = nextWorkingKey;
                                    x500Principal2 = subjectX500Principal;
                                    trustAnchor3 = trustAnchor2;
                                    try {
                                        checkRevocation(this.pkixParams, x509Certificate7, this.validDate, x509Certificate, nextWorkingKey, cRLDistUrls, oCSPUrls, i16);
                                    } catch (CertPathReviewerException e11) {
                                        e = e11;
                                        addError(e.getErrorMessage(), i16);
                                    }
                                } catch (CertPathReviewerException e12) {
                                    e = e12;
                                    i15 = i14;
                                    i16 = size;
                                    publicKey = nextWorkingKey;
                                    x500Principal2 = subjectX500Principal;
                                    trustAnchor3 = trustAnchor2;
                                    x509Certificate7 = x509Certificate6;
                                }
                            } else {
                                x509Certificate7 = x509Certificate5;
                                i15 = i14;
                                i16 = size;
                                publicKey = nextWorkingKey;
                                x500Principal2 = subjectX500Principal;
                                trustAnchor3 = trustAnchor2;
                            }
                            if (x500Principal2 != null && !x509Certificate7.getIssuerX500Principal().equals(x500Principal2)) {
                                addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.certWrongIssuer", new Object[]{x500Principal2.getName(), x509Certificate7.getIssuerX500Principal().getName()}), i16);
                            }
                            if (i15 != this.f91701n) {
                                if (x509Certificate7 != null && x509Certificate7.getVersion() == 1) {
                                    addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noCACert"), i16);
                                }
                                try {
                                    basicConstraints2 = BasicConstraints.getInstance(a.getExtensionValue(x509Certificate7, a.BASIC_CONSTRAINTS));
                                    if (basicConstraints2 != null) {
                                        addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noBasicConstraints"), i16);
                                    } else if (!basicConstraints2.isCA()) {
                                        addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noCACert"), i16);
                                    }
                                } catch (AnnotatedException unused9) {
                                    addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.errorProcesingBC"), i16);
                                }
                                keyUsage = x509Certificate7.getKeyUsage();
                                if (keyUsage != null && !keyUsage[5]) {
                                    addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noCertSign"), i16);
                                }
                            }
                            subjectX500Principal = x509Certificate7.getSubjectX500Principal();
                            try {
                                nextWorkingKey = a.getNextWorkingKey(this.certs, i16);
                                try {
                                    AlgorithmIdentifier algorithmIdentifier2 = a.getAlgorithmIdentifier(nextWorkingKey);
                                    algorithmIdentifier2.getAlgorithm();
                                    algorithmIdentifier2.getParameters();
                                } catch (CertPathValidatorException unused10) {
                                    addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.pubKeyError"), i16);
                                }
                            } catch (CertPathValidatorException unused11) {
                                nextWorkingKey = publicKey;
                            }
                            size = i16 - 1;
                            trustAnchor2 = trustAnchor3;
                            x509Certificate = x509Certificate7;
                            c10 = 1;
                            c11 = 0;
                            c12 = 2;
                        }
                        this.trustAnchor = trustAnchor2;
                        this.subjectPublicKey = nextWorkingKey;
                        pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
                        for (size4 = this.certs.size() - 1; size4 > 0; size4--) {
                            x509Certificate4 = (X509Certificate) this.certs.get(size4);
                            if (!a.isSelfIssued(x509Certificate4)) {
                                subjectPrincipal = a.getSubjectPrincipal(x509Certificate4);
                                try {
                                    ASN1Sequence aSN1Sequence3 = (ASN1Sequence) new ASN1InputStream(new ByteArrayInputStream(subjectPrincipal.getEncoded())).readObject();
                                    try {
                                        pKIXNameConstraintValidator.checkPermittedDN(aSN1Sequence3);
                                        try {
                                            pKIXNameConstraintValidator.checkExcludedDN(aSN1Sequence3);
                                            try {
                                                aSN1Sequence2 = (ASN1Sequence) a.getExtensionValue(x509Certificate4, a.SUBJECT_ALTERNATIVE_NAME);
                                                if (aSN1Sequence2 != null) {
                                                    for (i13 = 0; i13 < aSN1Sequence2.size(); i13++) {
                                                        generalName = GeneralName.getInstance(aSN1Sequence2.getObjectAt(i13));
                                                        try {
                                                            pKIXNameConstraintValidator.checkPermitted(generalName);
                                                            pKIXNameConstraintValidator.checkExcluded(generalName);
                                                        } catch (PKIXNameConstraintValidatorException e13) {
                                                            throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.notPermittedEmail", new Object[]{new UntrustedInput(generalName)}), e13, this.certPath, size4);
                                                        }
                                                    }
                                                }
                                            } catch (AnnotatedException e14) {
                                                throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.subjAltNameExtError"), e14, this.certPath, size4);
                                            }
                                        } catch (PKIXNameConstraintValidatorException e15) {
                                            throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.excludedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e15, this.certPath, size4);
                                        }
                                    } catch (PKIXNameConstraintValidatorException e16) {
                                        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.notPermittedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e16, this.certPath, size4);
                                    }
                                } catch (IOException e17) {
                                    throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.ncSubjectNameError", new Object[]{new UntrustedInput(subjectPrincipal)}), e17, this.certPath, size4);
                                }
                            }
                            try {
                                aSN1Sequence = (ASN1Sequence) a.getExtensionValue(x509Certificate4, a.NAME_CONSTRAINTS);
                                if (aSN1Sequence == null) {
                                    NameConstraints nameConstraints = NameConstraints.getInstance(aSN1Sequence);
                                    permittedSubtrees = nameConstraints.getPermittedSubtrees();
                                    if (permittedSubtrees != null) {
                                        pKIXNameConstraintValidator.intersectPermittedSubtree(permittedSubtrees);
                                    }
                                    excludedSubtrees = nameConstraints.getExcludedSubtrees();
                                    if (excludedSubtrees != null) {
                                        for (i12 = 0; i12 != excludedSubtrees.length; i12++) {
                                            pKIXNameConstraintValidator.addExcludedSubtree(excludedSubtrees[i12]);
                                        }
                                    }
                                }
                            } catch (AnnotatedException e18) {
                                throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.ncExtError"), e18, this.certPath, size4);
                            }
                        }
                        i10 = this.f91701n;
                        i11 = 0;
                        for (size2 = this.certs.size() - 1; size2 > 0; size2--) {
                            x509Certificate3 = (X509Certificate) this.certs.get(size2);
                            if (!a.isSelfIssued(x509Certificate3)) {
                                if (i10 <= 0) {
                                    addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.pathLengthExtended"));
                                }
                                i10--;
                                i11++;
                            }
                            try {
                                basicConstraints = BasicConstraints.getInstance(a.getExtensionValue(x509Certificate3, a.BASIC_CONSTRAINTS));
                            } catch (AnnotatedException unused12) {
                                addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.processLengthConstError"), size2);
                                basicConstraints = null;
                            }
                            if (basicConstraints == null && (pathLenConstraint = basicConstraints.getPathLenConstraint()) != null && (iIntValue = pathLenConstraint.intValue()) < i10) {
                                i10 = iIntValue;
                            }
                        }
                        addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.totalPathLength", new Object[]{Integers.valueOf(i11)}));
                        c();
                        certPathCheckers = this.pkixParams.getCertPathCheckers();
                        it = certPathCheckers.iterator();
                        while (it.hasNext()) {
                            try {
                                try {
                                    it.next().init(false);
                                } catch (CertPathValidatorException e19) {
                                    throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.certPathCheckerError", new Object[]{e19.getMessage(), e19, e19.getClass().getName()}), e19);
                                }
                            } catch (CertPathReviewerException e20) {
                                addError(e20.getErrorMessage(), e20.getIndex());
                                return;
                            }
                        }
                        for (size3 = this.certs.size() - 1; size3 >= 0; size3--) {
                            x509Certificate2 = (X509Certificate) this.certs.get(size3);
                            criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                            if (criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty()) {
                                criticalExtensionOIDs.remove(a.KEY_USAGE);
                                criticalExtensionOIDs.remove(a.CERTIFICATE_POLICIES);
                                criticalExtensionOIDs.remove(a.POLICY_MAPPINGS);
                                criticalExtensionOIDs.remove(a.INHIBIT_ANY_POLICY);
                                criticalExtensionOIDs.remove(a.ISSUING_DISTRIBUTION_POINT);
                                criticalExtensionOIDs.remove(a.DELTA_CRL_INDICATOR);
                                criticalExtensionOIDs.remove(a.POLICY_CONSTRAINTS);
                                criticalExtensionOIDs.remove(a.BASIC_CONSTRAINTS);
                                criticalExtensionOIDs.remove(a.SUBJECT_ALTERNATIVE_NAME);
                                criticalExtensionOIDs.remove(a.NAME_CONSTRAINTS);
                                str = f91697b;
                                if (criticalExtensionOIDs.contains(str) && e(x509Certificate2, size3)) {
                                    criticalExtensionOIDs.remove(str);
                                }
                                it2 = certPathCheckers.iterator();
                                while (it2.hasNext()) {
                                    try {
                                        it2.next().check(x509Certificate2, criticalExtensionOIDs);
                                    } catch (CertPathValidatorException e21) {
                                        throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.criticalExtensionError", new Object[]{e21.getMessage(), e21, e21.getClass().getName()}), e21.getCause(), this.certPath, size3);
                                    }
                                }
                                if (!criticalExtensionOIDs.isEmpty()) {
                                    it3 = criticalExtensionOIDs.iterator();
                                    while (it3.hasNext()) {
                                        addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.unknownCriticalExt", new Object[]{new ASN1ObjectIdentifier(it3.next())}), size3);
                                    }
                                }
                            }
                        }
                    }
                    addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.conflictingTrustAnchors", new Object[]{Integers.valueOf(trustAnchors.size()), new UntrustedInput(x509Certificate8.getIssuerX500Principal())}));
                    trustAnchor = null;
                } catch (CertPathReviewerException e22) {
                    e = e22;
                    trustAnchor = null;
                } catch (Throwable th3) {
                    th = th3;
                    trustAnchor = null;
                }
                while (size4 > 0) {
                    x509Certificate4 = (X509Certificate) this.certs.get(size4);
                    if (!a.isSelfIssued(x509Certificate4)) {
                        subjectPrincipal = a.getSubjectPrincipal(x509Certificate4);
                        ASN1Sequence aSN1Sequence4 = (ASN1Sequence) new ASN1InputStream(new ByteArrayInputStream(subjectPrincipal.getEncoded())).readObject();
                        pKIXNameConstraintValidator.checkPermittedDN(aSN1Sequence4);
                        pKIXNameConstraintValidator.checkExcludedDN(aSN1Sequence4);
                        aSN1Sequence2 = (ASN1Sequence) a.getExtensionValue(x509Certificate4, a.SUBJECT_ALTERNATIVE_NAME);
                        if (aSN1Sequence2 != null) {
                            while (i13 < aSN1Sequence2.size()) {
                                generalName = GeneralName.getInstance(aSN1Sequence2.getObjectAt(i13));
                                pKIXNameConstraintValidator.checkPermitted(generalName);
                                pKIXNameConstraintValidator.checkExcluded(generalName);
                            }
                        }
                    }
                    aSN1Sequence = (ASN1Sequence) a.getExtensionValue(x509Certificate4, a.NAME_CONSTRAINTS);
                    if (aSN1Sequence == null) {
                        NameConstraints nameConstraints2 = NameConstraints.getInstance(aSN1Sequence);
                        permittedSubtrees = nameConstraints2.getPermittedSubtrees();
                        if (permittedSubtrees != null) {
                            pKIXNameConstraintValidator.intersectPermittedSubtree(permittedSubtrees);
                        }
                        excludedSubtrees = nameConstraints2.getExcludedSubtrees();
                        if (excludedSubtrees != null) {
                            while (i12 != excludedSubtrees.length) {
                                pKIXNameConstraintValidator.addExcludedSubtree(excludedSubtrees[i12]);
                            }
                        }
                    }
                }
            } catch (CertPathReviewerException e23) {
                addError(e23.getErrorMessage(), e23.getIndex());
            }
            trustAnchor2 = trustAnchor;
            if (trustAnchor2 != null) {
                trustedCert2 = trustAnchor2.getTrustedCert();
                if (trustedCert2 != null) {
                    x500Principal = a.getSubjectPrincipal(trustedCert2);
                } else {
                    x500Principal = new X500Principal(trustAnchor2.getCAName());
                }
                if (trustedCert2 != null) {
                    addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.trustKeyUsage"));
                }
            } else {
                x500Principal = null;
            }
            if (trustAnchor2 != null) {
                trustedCert = trustAnchor2.getTrustedCert();
                if (trustedCert != null) {
                    cAPublicKey = trustedCert.getPublicKey();
                } else {
                    cAPublicKey = trustAnchor2.getCAPublicKey();
                }
                AlgorithmIdentifier algorithmIdentifier3 = a.getAlgorithmIdentifier(cAPublicKey);
                algorithmIdentifier3.getAlgorithm();
                algorithmIdentifier3.getParameters();
            } else {
                trustedCert = null;
                cAPublicKey = null;
            }
            x509Certificate = trustedCert;
            subjectX500Principal = x500Principal;
            nextWorkingKey = cAPublicKey;
            size = this.certs.size() - 1;
            while (size >= 0) {
                i14 = this.f91701n - size;
                x509Certificate5 = (X509Certificate) this.certs.get(size);
                if (nextWorkingKey != null) {
                    a.verifyX509Certificate(x509Certificate5, nextWorkingKey, this.pkixParams.getSigProvider());
                } else if (a.isSelfIssued(x509Certificate5)) {
                    a.verifyX509Certificate(x509Certificate5, x509Certificate5.getPublicKey(), this.pkixParams.getSigProvider());
                    addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.rootKeyIsValidButNotATrustAnchor"), size);
                } else {
                    errorBundle3 = new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.NoIssuerPublicKey");
                    extensionValue3 = x509Certificate5.getExtensionValue(Extension.authorityKeyIdentifier.getId());
                    if (extensionValue3 != null) {
                        generalName2 = authorityCertIssuer.getNames()[c11];
                        authorityCertSerialNumber = authorityKeyIdentifier.getAuthorityCertSerialNumber();
                        if (authorityCertSerialNumber != null) {
                            Object[] objArr8 = new Object[7];
                            objArr8[c11] = new LocaleString("org.bouncycastle.x509.CertPathReviewerMessages", "missingIssuer");
                            objArr8[1] = " \"";
                            objArr8[2] = generalName2;
                            objArr8[3] = "\" ";
                            objArr8[4] = new LocaleString("org.bouncycastle.x509.CertPathReviewerMessages", "missingSerial");
                            objArr8[5] = " ";
                            objArr8[6] = authorityCertSerialNumber;
                            errorBundle3.setExtraArguments(objArr8);
                        }
                    }
                    addError(errorBundle3, size);
                }
                x509Certificate5.checkValidity(this.validDate);
                if (this.pkixParams.isRevocationEnabled()) {
                    extensionValue2 = a.getExtensionValue(x509Certificate5, f91698c);
                    if (extensionValue2 != null) {
                        cRLDistPoint = CRLDistPoint.getInstance(extensionValue2);
                    } else {
                        cRLDistPoint = null;
                    }
                    extensionValue = a.getExtensionValue(x509Certificate5, f91699d);
                    if (extensionValue != null) {
                        authorityInformationAccess = AuthorityInformationAccess.getInstance(extensionValue);
                    } else {
                        authorityInformationAccess = null;
                    }
                    Vector cRLDistUrls2 = getCRLDistUrls(cRLDistPoint);
                    Vector oCSPUrls2 = getOCSPUrls(authorityInformationAccess);
                    it4 = cRLDistUrls2.iterator();
                    while (it4.hasNext()) {
                        Object[] objArr9 = new Object[1];
                        objArr9[c11] = new UntrustedUrlInput(it4.next());
                        addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.crlDistPoint", objArr9), size);
                        x509Certificate5 = x509Certificate5;
                    }
                    x509Certificate6 = x509Certificate5;
                    it5 = oCSPUrls2.iterator();
                    while (it5.hasNext()) {
                        Object[] objArr10 = new Object[1];
                        objArr10[c11] = new UntrustedUrlInput(it5.next());
                        addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.ocspLocation", objArr10), size);
                    }
                    x509Certificate7 = x509Certificate6;
                    i15 = i14;
                    i16 = size;
                    publicKey = nextWorkingKey;
                    x500Principal2 = subjectX500Principal;
                    trustAnchor3 = trustAnchor2;
                    checkRevocation(this.pkixParams, x509Certificate7, this.validDate, x509Certificate, nextWorkingKey, cRLDistUrls2, oCSPUrls2, i16);
                } else {
                    x509Certificate7 = x509Certificate5;
                    i15 = i14;
                    i16 = size;
                    publicKey = nextWorkingKey;
                    x500Principal2 = subjectX500Principal;
                    trustAnchor3 = trustAnchor2;
                }
                if (x500Principal2 != null) {
                    addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.certWrongIssuer", new Object[]{x500Principal2.getName(), x509Certificate7.getIssuerX500Principal().getName()}), i16);
                }
                if (i15 != this.f91701n) {
                    if (x509Certificate7 != null) {
                        addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noCACert"), i16);
                    }
                    basicConstraints2 = BasicConstraints.getInstance(a.getExtensionValue(x509Certificate7, a.BASIC_CONSTRAINTS));
                    if (basicConstraints2 != null) {
                        addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noBasicConstraints"), i16);
                    } else if (!basicConstraints2.isCA()) {
                        addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noCACert"), i16);
                    }
                    keyUsage = x509Certificate7.getKeyUsage();
                    if (keyUsage != null) {
                        addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.noCertSign"), i16);
                    }
                }
                subjectX500Principal = x509Certificate7.getSubjectX500Principal();
                nextWorkingKey = a.getNextWorkingKey(this.certs, i16);
                AlgorithmIdentifier algorithmIdentifier4 = a.getAlgorithmIdentifier(nextWorkingKey);
                algorithmIdentifier4.getAlgorithm();
                algorithmIdentifier4.getParameters();
                size = i16 - 1;
                trustAnchor2 = trustAnchor3;
                x509Certificate = x509Certificate7;
                c10 = 1;
                c11 = 0;
                c12 = 2;
            }
            this.trustAnchor = trustAnchor2;
            this.subjectPublicKey = nextWorkingKey;
            pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
            i10 = this.f91701n;
            i11 = 0;
            while (size2 > 0) {
                x509Certificate3 = (X509Certificate) this.certs.get(size2);
                if (!a.isSelfIssued(x509Certificate3)) {
                    if (i10 <= 0) {
                        addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.pathLengthExtended"));
                    }
                    i10--;
                    i11++;
                }
                basicConstraints = BasicConstraints.getInstance(a.getExtensionValue(x509Certificate3, a.BASIC_CONSTRAINTS));
                if (basicConstraints == null) {
                }
            }
            addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.totalPathLength", new Object[]{Integers.valueOf(i11)}));
            c();
            certPathCheckers = this.pkixParams.getCertPathCheckers();
            it = certPathCheckers.iterator();
            while (it.hasNext()) {
                it.next().init(false);
            }
            while (size3 >= 0) {
                x509Certificate2 = (X509Certificate) this.certs.get(size3);
                criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                if (criticalExtensionOIDs != null) {
                    criticalExtensionOIDs.remove(a.KEY_USAGE);
                    criticalExtensionOIDs.remove(a.CERTIFICATE_POLICIES);
                    criticalExtensionOIDs.remove(a.POLICY_MAPPINGS);
                    criticalExtensionOIDs.remove(a.INHIBIT_ANY_POLICY);
                    criticalExtensionOIDs.remove(a.ISSUING_DISTRIBUTION_POINT);
                    criticalExtensionOIDs.remove(a.DELTA_CRL_INDICATOR);
                    criticalExtensionOIDs.remove(a.POLICY_CONSTRAINTS);
                    criticalExtensionOIDs.remove(a.BASIC_CONSTRAINTS);
                    criticalExtensionOIDs.remove(a.SUBJECT_ALTERNATIVE_NAME);
                    criticalExtensionOIDs.remove(a.NAME_CONSTRAINTS);
                    str = f91697b;
                    if (criticalExtensionOIDs.contains(str)) {
                        criticalExtensionOIDs.remove(str);
                    }
                    it2 = certPathCheckers.iterator();
                    while (it2.hasNext()) {
                        it2.next().check(x509Certificate2, criticalExtensionOIDs);
                    }
                    if (!criticalExtensionOIDs.isEmpty()) {
                        it3 = criticalExtensionOIDs.iterator();
                        while (it3.hasNext()) {
                            addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.unknownCriticalExt", new Object[]{new ASN1ObjectIdentifier(it3.next())}), size3);
                        }
                    }
                }
            }
        }
    }

    public final boolean e(X509Certificate x509Certificate, int i10) {
        ErrorBundle errorBundle;
        try {
            ASN1Sequence aSN1Sequence = (ASN1Sequence) a.getExtensionValue(x509Certificate, f91697b);
            boolean z10 = false;
            for (int i11 = 0; i11 < aSN1Sequence.size(); i11++) {
                QCStatement qCStatement = QCStatement.getInstance(aSN1Sequence.getObjectAt(i11));
                if (ETSIQCObjectIdentifiers.id_etsi_qcs_QcCompliance.equals((ASN1Primitive) qCStatement.getStatementId())) {
                    errorBundle = new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.QcEuCompliance");
                } else {
                    if (!RFC3739QCObjectIdentifiers.id_qcs_pkixQCSyntax_v1.equals((ASN1Primitive) qCStatement.getStatementId())) {
                        if (ETSIQCObjectIdentifiers.id_etsi_qcs_QcSSCD.equals((ASN1Primitive) qCStatement.getStatementId())) {
                            errorBundle = new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.QcSSCD");
                        } else if (ETSIQCObjectIdentifiers.id_etsi_qcs_LimiteValue.equals((ASN1Primitive) qCStatement.getStatementId())) {
                            MonetaryValue monetaryValue = MonetaryValue.getInstance(qCStatement.getStatementInfo());
                            monetaryValue.getCurrency();
                            double dDoubleValue = monetaryValue.getAmount().doubleValue() * Math.pow(10.0d, monetaryValue.getExponent().doubleValue());
                            addNotification(monetaryValue.getCurrency().isAlphabetic() ? new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.QcLimitValueAlpha", new Object[]{monetaryValue.getCurrency().getAlphabetic(), new TrustedInput(new Double(dDoubleValue)), monetaryValue}) : new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.QcLimitValueNum", new Object[]{Integers.valueOf(monetaryValue.getCurrency().getNumeric()), new TrustedInput(new Double(dDoubleValue)), monetaryValue}), i10);
                        } else {
                            addNotification(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.QcUnknownStatement", new Object[]{qCStatement.getStatementId(), new UntrustedInput(qCStatement)}), i10);
                            z10 = true;
                        }
                    }
                }
                addNotification(errorBundle, i10);
            }
            return !z10;
        } catch (AnnotatedException unused) {
            addError(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.QcStatementExtError"), i10);
            return false;
        }
    }

    public Vector getCRLDistUrls(CRLDistPoint cRLDistPoint) {
        Vector vector = new Vector();
        if (cRLDistPoint != null) {
            for (DistributionPoint distributionPoint : cRLDistPoint.getDistributionPoints()) {
                DistributionPointName distributionPoint2 = distributionPoint.getDistributionPoint();
                if (distributionPoint2.getType() == 0) {
                    GeneralName[] names = GeneralNames.getInstance(distributionPoint2.getName()).getNames();
                    for (int i10 = 0; i10 < names.length; i10++) {
                        if (names[i10].getTagNo() == 6) {
                            vector.add(((DERIA5String) names[i10].getName()).getString());
                        }
                    }
                }
            }
        }
        return vector;
    }

    public CertPath getCertPath() {
        return this.certPath;
    }

    public int getCertPathSize() {
        return this.f91701n;
    }

    public List getErrors(int i10) {
        doChecks();
        return this.errors[i10 + 1];
    }

    public List getNotifications(int i10) {
        doChecks();
        return this.notifications[i10 + 1];
    }

    public Vector getOCSPUrls(AuthorityInformationAccess authorityInformationAccess) {
        Vector vector = new Vector();
        if (authorityInformationAccess != null) {
            AccessDescription[] accessDescriptions = authorityInformationAccess.getAccessDescriptions();
            for (int i10 = 0; i10 < accessDescriptions.length; i10++) {
                if (accessDescriptions[i10].getAccessMethod().equals((ASN1Primitive) AccessDescription.id_ad_ocsp)) {
                    GeneralName accessLocation = accessDescriptions[i10].getAccessLocation();
                    if (accessLocation.getTagNo() == 6) {
                        vector.add(((DERIA5String) accessLocation.getName()).getString());
                    }
                }
            }
        }
        return vector;
    }

    public PolicyNode getPolicyTree() {
        doChecks();
        return this.policyTree;
    }

    public PublicKey getSubjectPublicKey() {
        doChecks();
        return this.subjectPublicKey;
    }

    public TrustAnchor getTrustAnchor() {
        doChecks();
        return this.trustAnchor;
    }

    public Collection getTrustAnchors(X509Certificate x509Certificate, Set set) throws CertPathReviewerException {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(a.getEncodedIssuerPrincipal(x509Certificate).getEncoded());
            byte[] extensionValue = x509Certificate.getExtensionValue(Extension.authorityKeyIdentifier.getId());
            if (extensionValue != null) {
                AuthorityKeyIdentifier authorityKeyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1Primitive.fromByteArray(((ASN1OctetString) ASN1Primitive.fromByteArray(extensionValue)).getOctets()));
                x509CertSelector.setSerialNumber(authorityKeyIdentifier.getAuthorityCertSerialNumber());
                byte[] keyIdentifier = authorityKeyIdentifier.getKeyIdentifier();
                if (keyIdentifier != null) {
                    x509CertSelector.setSubjectKeyIdentifier(new DEROctetString(keyIdentifier).getEncoded());
                }
            }
            while (it.hasNext()) {
                TrustAnchor trustAnchor = (TrustAnchor) it.next();
                if (trustAnchor.getTrustedCert() != null) {
                    if (x509CertSelector.match(trustAnchor.getTrustedCert())) {
                        arrayList.add(trustAnchor);
                    }
                } else if (trustAnchor.getCAName() != null && trustAnchor.getCAPublicKey() != null && a.getEncodedIssuerPrincipal(x509Certificate).equals(new X500Principal(trustAnchor.getCAName()))) {
                    arrayList.add(trustAnchor);
                }
            }
            return arrayList;
        } catch (IOException unused) {
            throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.trustAnchorIssuerError"));
        }
    }

    public void init(CertPath certPath, PKIXParameters pKIXParameters) throws CertPathReviewerException {
        if (this.f91700a) {
            throw new IllegalStateException("object is already initialized!");
        }
        this.f91700a = true;
        if (certPath == null) {
            throw new NullPointerException("certPath was null");
        }
        this.certPath = certPath;
        List<? extends Certificate> certificates = certPath.getCertificates();
        this.certs = certificates;
        this.f91701n = certificates.size();
        if (this.certs.isEmpty()) {
            throw new CertPathReviewerException(new ErrorBundle("org.bouncycastle.x509.CertPathReviewerMessages", "CertPathReviewer.emptyCertPath"));
        }
        PKIXParameters pKIXParameters2 = (PKIXParameters) pKIXParameters.clone();
        this.pkixParams = pKIXParameters2;
        this.validDate = a.getValidDate(pKIXParameters2);
        this.notifications = null;
        this.errors = null;
        this.trustAnchor = null;
        this.subjectPublicKey = null;
        this.policyTree = null;
    }

    public boolean isValidCertPath() {
        doChecks();
        int i10 = 0;
        while (true) {
            List[] listArr = this.errors;
            if (i10 >= listArr.length) {
                return true;
            }
            if (!listArr[i10].isEmpty()) {
                return false;
            }
            i10++;
        }
    }

    public PKIXCertPathReviewer(CertPath certPath, PKIXParameters pKIXParameters) throws CertPathReviewerException {
        init(certPath, pKIXParameters);
    }

    public void addError(ErrorBundle errorBundle, int i10) {
        if (i10 < -1 || i10 >= this.f91701n) {
            throw new IndexOutOfBoundsException();
        }
        this.errors[i10 + 1].add(errorBundle);
    }

    public void addNotification(ErrorBundle errorBundle, int i10) {
        if (i10 < -1 || i10 >= this.f91701n) {
            throw new IndexOutOfBoundsException();
        }
        this.notifications[i10 + 1].add(errorBundle);
    }

    public List[] getErrors() {
        doChecks();
        return this.errors;
    }

    public List[] getNotifications() {
        doChecks();
        return this.notifications;
    }
}
