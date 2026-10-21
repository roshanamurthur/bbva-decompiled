package org.bouncycastle.asn1.util;

import androidx.camera.core.impl.utils.c;
import androidx.camera.core.processing.f;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Enumeration;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.asn1.ASN1ApplicationSpecific;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1External;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.BERApplicationSpecific;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERSet;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DERApplicationSpecific;
import org.bouncycastle.asn1.DERBMPString;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERGraphicString;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERT61String;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.DERVideotexString;
import org.bouncycastle.asn1.DERVisibleString;
import org.bouncycastle.asn1.DLApplicationSpecific;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes12.dex */
public class ASN1Dump {
    public static void a(String str, boolean z10, ASN1Primitive aSN1Primitive, StringBuffer stringBuffer) {
        StringBuilder sbD;
        BigInteger value;
        String str2;
        String strD;
        String time;
        StringBuilder sbE;
        int length;
        String str3;
        String str4;
        String strLineSeparator = Strings.lineSeparator();
        if (aSN1Primitive instanceof ASN1Sequence) {
            Enumeration objects = ((ASN1Sequence) aSN1Primitive).getObjects();
            String str5 = str + "    ";
            stringBuffer.append(str);
            if (aSN1Primitive instanceof BERSequence) {
                str4 = "BER Sequence";
            } else {
                str4 = aSN1Primitive instanceof DERSequence ? "DER Sequence" : "Sequence";
            }
            stringBuffer.append(str4);
            while (true) {
                stringBuffer.append(strLineSeparator);
                while (objects.hasMoreElements()) {
                    Object objNextElement = objects.nextElement();
                    if (objNextElement == null || objNextElement.equals(DERNull.INSTANCE)) {
                        stringBuffer.append(str5);
                        stringBuffer.append(VDVideoSelfieConfiguration.NULL);
                    } else {
                        a(str5, z10, objNextElement instanceof ASN1Primitive ? (ASN1Primitive) objNextElement : ((ASN1Encodable) objNextElement).toASN1Primitive(), stringBuffer);
                    }
                }
                return;
            }
        }
        if (aSN1Primitive instanceof ASN1TaggedObject) {
            String str6 = str + "    ";
            stringBuffer.append(str);
            stringBuffer.append(aSN1Primitive instanceof BERTaggedObject ? "BER Tagged [" : "Tagged [");
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive;
            stringBuffer.append(Integer.toString(aSN1TaggedObject.getTagNo()));
            stringBuffer.append(AbstractJsonLexerKt.END_LIST);
            if (!aSN1TaggedObject.isExplicit()) {
                stringBuffer.append(" IMPLICIT ");
            }
            stringBuffer.append(strLineSeparator);
            a(str6, z10, aSN1TaggedObject.getObject(), stringBuffer);
            return;
        }
        if (aSN1Primitive instanceof ASN1Set) {
            Enumeration objects2 = ((ASN1Set) aSN1Primitive).getObjects();
            String str7 = str + "    ";
            stringBuffer.append(str);
            if (aSN1Primitive instanceof BERSet) {
                str3 = "BER Set";
            } else {
                str3 = aSN1Primitive instanceof DERSet ? "DER Set" : "Set";
            }
            stringBuffer.append(str3);
            while (true) {
                stringBuffer.append(strLineSeparator);
                while (objects2.hasMoreElements()) {
                    Object objNextElement2 = objects2.nextElement();
                    if (objNextElement2 == null) {
                        stringBuffer.append(str7);
                        stringBuffer.append(VDVideoSelfieConfiguration.NULL);
                    } else {
                        a(str7, z10, objNextElement2 instanceof ASN1Primitive ? (ASN1Primitive) objNextElement2 : ((ASN1Encodable) objNextElement2).toASN1Primitive(), stringBuffer);
                    }
                }
                return;
            }
        }
        if (aSN1Primitive instanceof ASN1OctetString) {
            ASN1OctetString aSN1OctetString = (ASN1OctetString) aSN1Primitive;
            if (aSN1Primitive instanceof BEROctetString) {
                sbE = f.e(str, "BER Constructed Octet String[");
                length = aSN1OctetString.getOctets().length;
            } else {
                sbE = f.e(str, "DER Octet String[");
                length = aSN1OctetString.getOctets().length;
            }
            sbE.append(length);
            sbE.append("] ");
            stringBuffer.append(sbE.toString());
            if (z10) {
                strD = c(str, aSN1OctetString.getOctets());
                stringBuffer.append(strD);
            }
            stringBuffer.append(strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1ObjectIdentifier) {
            sbD = f.e(str, "ObjectIdentifier(");
            sbD.append(((ASN1ObjectIdentifier) aSN1Primitive).getId());
        } else if (aSN1Primitive instanceof ASN1Boolean) {
            sbD = f.e(str, "Boolean(");
            sbD.append(((ASN1Boolean) aSN1Primitive).isTrue());
        } else {
            if (!(aSN1Primitive instanceof ASN1Integer)) {
                if (aSN1Primitive instanceof DERBitString) {
                    DERBitString dERBitString = (DERBitString) aSN1Primitive;
                    StringBuilder sbE2 = f.e(str, "DER Bit String[");
                    sbE2.append(dERBitString.getBytes().length);
                    sbE2.append(", ");
                    sbE2.append(dERBitString.getPadBits());
                    sbE2.append("] ");
                    stringBuffer.append(sbE2.toString());
                    if (z10) {
                        strD = c(str, dERBitString.getBytes());
                    }
                    stringBuffer.append(strLineSeparator);
                    return;
                }
                if (aSN1Primitive instanceof DERIA5String) {
                    sbD = f.e(str, "IA5String(");
                    time = ((DERIA5String) aSN1Primitive).getString();
                } else if (aSN1Primitive instanceof DERUTF8String) {
                    sbD = f.e(str, "UTF8String(");
                    time = ((DERUTF8String) aSN1Primitive).getString();
                } else if (aSN1Primitive instanceof DERPrintableString) {
                    sbD = f.e(str, "PrintableString(");
                    time = ((DERPrintableString) aSN1Primitive).getString();
                } else if (aSN1Primitive instanceof DERVisibleString) {
                    sbD = f.e(str, "VisibleString(");
                    time = ((DERVisibleString) aSN1Primitive).getString();
                } else if (aSN1Primitive instanceof DERBMPString) {
                    sbD = f.e(str, "BMPString(");
                    time = ((DERBMPString) aSN1Primitive).getString();
                } else if (aSN1Primitive instanceof DERT61String) {
                    sbD = f.e(str, "T61String(");
                    time = ((DERT61String) aSN1Primitive).getString();
                } else if (aSN1Primitive instanceof DERGraphicString) {
                    sbD = f.e(str, "GraphicString(");
                    time = ((DERGraphicString) aSN1Primitive).getString();
                } else if (aSN1Primitive instanceof DERVideotexString) {
                    sbD = f.e(str, "VideotexString(");
                    time = ((DERVideotexString) aSN1Primitive).getString();
                } else if (aSN1Primitive instanceof ASN1UTCTime) {
                    sbD = f.e(str, "UTCTime(");
                    time = ((ASN1UTCTime) aSN1Primitive).getTime();
                } else if (aSN1Primitive instanceof ASN1GeneralizedTime) {
                    sbD = f.e(str, "GeneralizedTime(");
                    time = ((ASN1GeneralizedTime) aSN1Primitive).getTime();
                } else {
                    if (aSN1Primitive instanceof BERApplicationSpecific) {
                        str2 = ASN1Encoding.BER;
                    } else if (aSN1Primitive instanceof DERApplicationSpecific) {
                        str2 = ASN1Encoding.DER;
                    } else if (aSN1Primitive instanceof DLApplicationSpecific) {
                        str2 = "";
                    } else {
                        if (aSN1Primitive instanceof ASN1Enumerated) {
                            sbD = f.e(str, "DER Enumerated(");
                            value = ((ASN1Enumerated) aSN1Primitive).getValue();
                        } else {
                            if (aSN1Primitive instanceof ASN1External) {
                                ASN1External aSN1External = (ASN1External) aSN1Primitive;
                                stringBuffer.append(str + "External " + strLineSeparator);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str);
                                sb2.append("    ");
                                String string = sb2.toString();
                                if (aSN1External.getDirectReference() != null) {
                                    StringBuilder sbE3 = f.e(string, "Direct Reference: ");
                                    sbE3.append(aSN1External.getDirectReference().getId());
                                    sbE3.append(strLineSeparator);
                                    stringBuffer.append(sbE3.toString());
                                }
                                if (aSN1External.getIndirectReference() != null) {
                                    StringBuilder sbE4 = f.e(string, "Indirect Reference: ");
                                    sbE4.append(aSN1External.getIndirectReference().toString());
                                    sbE4.append(strLineSeparator);
                                    stringBuffer.append(sbE4.toString());
                                }
                                if (aSN1External.getDataValueDescriptor() != null) {
                                    a(string, z10, aSN1External.getDataValueDescriptor(), stringBuffer);
                                }
                                StringBuilder sbE5 = f.e(string, "Encoding: ");
                                sbE5.append(aSN1External.getEncoding());
                                sbE5.append(strLineSeparator);
                                stringBuffer.append(sbE5.toString());
                                a(string, z10, aSN1External.getExternalContent(), stringBuffer);
                                return;
                            }
                            sbD = c.d(str);
                            sbD.append(aSN1Primitive.toString());
                        }
                        sbD.append(strLineSeparator);
                        strD = sbD.toString();
                    }
                    strD = d(str2, str, z10, aSN1Primitive, strLineSeparator);
                }
                sbD.append(time);
                sbD.append(") ");
                sbD.append(strLineSeparator);
                strD = sbD.toString();
                stringBuffer.append(strD);
            }
            sbD = f.e(str, "Integer(");
            value = ((ASN1Integer) aSN1Primitive).getValue();
            sbD.append(value);
        }
        sbD.append(")");
        sbD.append(strLineSeparator);
        strD = sbD.toString();
        stringBuffer.append(strD);
    }

    public static String b(int i10, int i11, byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i12 = i10; i12 != i10 + i11; i12++) {
            byte b10 = bArr[i12];
            if (b10 >= 32 && b10 <= 126) {
                stringBuffer.append((char) b10);
            }
        }
        return stringBuffer.toString();
    }

    public static String c(String str, byte[] bArr) {
        String strB;
        String strLineSeparator = Strings.lineSeparator();
        StringBuffer stringBuffer = new StringBuffer();
        String str2 = str + "    ";
        stringBuffer.append(strLineSeparator);
        for (int i10 = 0; i10 < bArr.length; i10 += 32) {
            int length = bArr.length - i10;
            stringBuffer.append(str2);
            if (length > 32) {
                stringBuffer.append(Strings.fromByteArray(Hex.encode(bArr, i10, 32)));
                stringBuffer.append("    ");
                strB = b(i10, 32, bArr);
            } else {
                stringBuffer.append(Strings.fromByteArray(Hex.encode(bArr, i10, bArr.length - i10)));
                for (int length2 = bArr.length - i10; length2 != 32; length2++) {
                    stringBuffer.append("  ");
                }
                stringBuffer.append("    ");
                strB = b(i10, bArr.length - i10, bArr);
            }
            stringBuffer.append(strB);
            stringBuffer.append(strLineSeparator);
        }
        return stringBuffer.toString();
    }

    public static String d(String str, String str2, boolean z10, ASN1Primitive aSN1Primitive, String str3) {
        ASN1ApplicationSpecific aSN1ApplicationSpecific = ASN1ApplicationSpecific.getInstance(aSN1Primitive);
        StringBuffer stringBuffer = new StringBuffer();
        if (!aSN1ApplicationSpecific.isConstructed()) {
            return str2 + str + " ApplicationSpecific[" + aSN1ApplicationSpecific.getApplicationTag() + "] (" + Strings.fromByteArray(Hex.encode(aSN1ApplicationSpecific.getContents())) + ")" + str3;
        }
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(aSN1ApplicationSpecific.getObject(16));
            stringBuffer.append(str2 + str + " ApplicationSpecific[" + aSN1ApplicationSpecific.getApplicationTag() + Constant.BRACKET_CLOSE + str3);
            Enumeration objects = aSN1Sequence.getObjects();
            while (objects.hasMoreElements()) {
                a(str2 + "    ", z10, (ASN1Primitive) objects.nextElement(), stringBuffer);
            }
        } catch (IOException e5) {
            stringBuffer.append(e5);
        }
        return stringBuffer.toString();
    }

    public static String dumpAsString(Object obj) {
        return dumpAsString(obj, false);
    }

    public static String dumpAsString(Object obj, boolean z10) {
        ASN1Primitive aSN1Primitive;
        StringBuffer stringBuffer = new StringBuffer();
        if (obj instanceof ASN1Primitive) {
            aSN1Primitive = (ASN1Primitive) obj;
        } else {
            if (!(obj instanceof ASN1Encodable)) {
                return "unknown object type " + obj.toString();
            }
            aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
        }
        a("", z10, aSN1Primitive, stringBuffer);
        return stringBuffer.toString();
    }
}
