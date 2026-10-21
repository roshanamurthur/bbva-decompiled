package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.ECGOST3410NamedCurveTable;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.field.FiniteField;
import org.bouncycastle.math.field.Polynomial;
import org.bouncycastle.math.field.PolynomialExtensionField;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class EC5Util {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f90030a = new HashMap();

    static {
        Enumeration names = CustomNamedCurves.getNames();
        while (names.hasMoreElements()) {
            String str = (String) names.nextElement();
            X9ECParameters byName = ECNamedCurveTable.getByName(str);
            if (byName != null) {
                f90030a.put(byName.getCurve(), CustomNamedCurves.getByName(str).getCurve());
            }
        }
        ECCurve curve = CustomNamedCurves.getByName("Curve25519").getCurve();
        f90030a.put(new ECCurve.Fp(curve.getField().getCharacteristic(), curve.getA().toBigInteger(), curve.getB().toBigInteger(), curve.getOrder(), curve.getCofactor()), curve);
    }

    public static EllipticCurve convertCurve(ECCurve eCCurve, byte[] bArr) {
        return new EllipticCurve(convertField(eCCurve.getField()), eCCurve.getA().toBigInteger(), eCCurve.getB().toBigInteger(), null);
    }

    public static ECField convertField(FiniteField finiteField) {
        if (ECAlgorithms.isFpField(finiteField)) {
            return new ECFieldFp(finiteField.getCharacteristic());
        }
        Polynomial minimalPolynomial = ((PolynomialExtensionField) finiteField).getMinimalPolynomial();
        int[] exponentsPresent = minimalPolynomial.getExponentsPresent();
        return new ECFieldF2m(minimalPolynomial.getDegree(), Arrays.reverse(Arrays.copyOfRange(exponentsPresent, 1, exponentsPresent.length - 1)));
    }

    public static ECPoint convertPoint(org.bouncycastle.math.ec.ECPoint eCPoint) {
        org.bouncycastle.math.ec.ECPoint eCPointNormalize = eCPoint.normalize();
        return new ECPoint(eCPointNormalize.getAffineXCoord().toBigInteger(), eCPointNormalize.getAffineYCoord().toBigInteger());
    }

    public static ECParameterSpec convertSpec(EllipticCurve ellipticCurve, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        ECPoint eCPointConvertPoint = convertPoint(eCParameterSpec.getG());
        return eCParameterSpec instanceof ECNamedCurveParameterSpec ? new ECNamedCurveSpec(((ECNamedCurveParameterSpec) eCParameterSpec).getName(), ellipticCurve, eCPointConvertPoint, eCParameterSpec.getN(), eCParameterSpec.getH()) : new ECParameterSpec(ellipticCurve, eCPointConvertPoint, eCParameterSpec.getN(), eCParameterSpec.getH().intValue());
    }

    public static ECParameterSpec convertToSpec(X962Parameters x962Parameters, ECCurve eCCurve) {
        ECParameterSpec eCNamedCurveSpec;
        if (x962Parameters.isNamedCurve()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) x962Parameters.getParameters();
            X9ECParameters namedCurveByOid = ECUtil.getNamedCurveByOid(aSN1ObjectIdentifier);
            if (namedCurveByOid == null) {
                Map additionalECParameters = BouncyCastleProvider.CONFIGURATION.getAdditionalECParameters();
                if (!additionalECParameters.isEmpty()) {
                    namedCurveByOid = (X9ECParameters) additionalECParameters.get(aSN1ObjectIdentifier);
                }
            }
            return new ECNamedCurveSpec(ECUtil.getCurveName(aSN1ObjectIdentifier), convertCurve(eCCurve, namedCurveByOid.getSeed()), convertPoint(namedCurveByOid.getG()), namedCurveByOid.getN(), namedCurveByOid.getH());
        }
        if (x962Parameters.isImplicitlyCA()) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(x962Parameters.getParameters());
        if (aSN1Sequence.size() > 3) {
            X9ECParameters x9ECParameters = X9ECParameters.getInstance(aSN1Sequence);
            EllipticCurve ellipticCurveConvertCurve = convertCurve(eCCurve, x9ECParameters.getSeed());
            eCNamedCurveSpec = x9ECParameters.getH() != null ? new ECParameterSpec(ellipticCurveConvertCurve, convertPoint(x9ECParameters.getG()), x9ECParameters.getN(), x9ECParameters.getH().intValue()) : new ECParameterSpec(ellipticCurveConvertCurve, convertPoint(x9ECParameters.getG()), x9ECParameters.getN(), 1);
        } else {
            GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = GOST3410PublicKeyAlgParameters.getInstance(aSN1Sequence);
            ECNamedCurveParameterSpec parameterSpec = ECGOST3410NamedCurveTable.getParameterSpec(ECGOST3410NamedCurves.getName(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet()));
            eCNamedCurveSpec = new ECNamedCurveSpec(ECGOST3410NamedCurves.getName(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet()), convertCurve(parameterSpec.getCurve(), parameterSpec.getSeed()), convertPoint(parameterSpec.getG()), parameterSpec.getN(), parameterSpec.getH());
        }
        return eCNamedCurveSpec;
    }

    public static ECCurve getCurve(ProviderConfiguration providerConfiguration, X962Parameters x962Parameters) {
        Set acceptableNamedCurves = providerConfiguration.getAcceptableNamedCurves();
        if (!x962Parameters.isNamedCurve()) {
            if (x962Parameters.isImplicitlyCA()) {
                return providerConfiguration.getEcImplicitlyCa().getCurve();
            }
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(x962Parameters.getParameters());
            if (acceptableNamedCurves.isEmpty()) {
                return aSN1Sequence.size() > 3 ? X9ECParameters.getInstance(aSN1Sequence).getCurve() : ECGOST3410NamedCurves.getByOID(ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0))).getCurve();
            }
            throw new IllegalStateException("encoded parameters not acceptable");
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(x962Parameters.getParameters());
        if (!acceptableNamedCurves.isEmpty() && !acceptableNamedCurves.contains(aSN1ObjectIdentifier)) {
            throw new IllegalStateException("named curve not acceptable");
        }
        X9ECParameters namedCurveByOid = ECUtil.getNamedCurveByOid(aSN1ObjectIdentifier);
        if (namedCurveByOid == null) {
            namedCurveByOid = (X9ECParameters) providerConfiguration.getAdditionalECParameters().get(aSN1ObjectIdentifier);
        }
        return namedCurveByOid.getCurve();
    }

    public static ECDomainParameters getDomainParameters(ProviderConfiguration providerConfiguration, ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec != null) {
            return ECUtil.getDomainParameters(providerConfiguration, convertSpec(eCParameterSpec));
        }
        org.bouncycastle.jce.spec.ECParameterSpec ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
        return new ECDomainParameters(ecImplicitlyCa.getCurve(), ecImplicitlyCa.getG(), ecImplicitlyCa.getN(), ecImplicitlyCa.getH(), ecImplicitlyCa.getSeed());
    }

    public static ECCurve convertCurve(EllipticCurve ellipticCurve) {
        int i10;
        ECField field = ellipticCurve.getField();
        BigInteger a10 = ellipticCurve.getA();
        BigInteger b10 = ellipticCurve.getB();
        if (field instanceof ECFieldFp) {
            ECCurve.Fp fp = new ECCurve.Fp(((ECFieldFp) field).getP(), a10, b10);
            HashMap map = f90030a;
            return map.containsKey(fp) ? (ECCurve) map.get(fp) : fp;
        }
        ECFieldF2m eCFieldF2m = (ECFieldF2m) field;
        int m = eCFieldF2m.getM();
        int[] midTermsOfReductionPolynomial = eCFieldF2m.getMidTermsOfReductionPolynomial();
        int[] iArr = new int[3];
        if (midTermsOfReductionPolynomial.length == 1) {
            iArr[0] = midTermsOfReductionPolynomial[0];
        } else {
            if (midTermsOfReductionPolynomial.length != 3) {
                throw new IllegalArgumentException("Only Trinomials and pentanomials supported");
            }
            int i11 = midTermsOfReductionPolynomial[0];
            int i12 = midTermsOfReductionPolynomial[1];
            if (i11 >= i12 || i11 >= (i10 = midTermsOfReductionPolynomial[2])) {
                int i13 = midTermsOfReductionPolynomial[2];
                if (i12 < i13) {
                    iArr[0] = i12;
                    int i14 = midTermsOfReductionPolynomial[0];
                    if (i14 < i13) {
                        iArr[1] = i14;
                        iArr[2] = i13;
                    } else {
                        iArr[1] = i13;
                        iArr[2] = i14;
                    }
                } else {
                    iArr[0] = i13;
                    int i15 = midTermsOfReductionPolynomial[0];
                    if (i15 < i12) {
                        iArr[1] = i15;
                        iArr[2] = midTermsOfReductionPolynomial[1];
                    } else {
                        iArr[1] = i12;
                        iArr[2] = i15;
                    }
                }
            } else {
                iArr[0] = i11;
                if (i12 < i10) {
                    iArr[1] = i12;
                    iArr[2] = i10;
                } else {
                    iArr[1] = i10;
                    iArr[2] = midTermsOfReductionPolynomial[1];
                }
            }
        }
        return new ECCurve.F2m(m, iArr[0], iArr[1], iArr[2], a10, b10);
    }

    public static org.bouncycastle.math.ec.ECPoint convertPoint(ECParameterSpec eCParameterSpec, ECPoint eCPoint) {
        return convertPoint(convertCurve(eCParameterSpec.getCurve()), eCPoint);
    }

    public static org.bouncycastle.jce.spec.ECParameterSpec convertSpec(ECParameterSpec eCParameterSpec) {
        ECCurve eCCurveConvertCurve = convertCurve(eCParameterSpec.getCurve());
        org.bouncycastle.math.ec.ECPoint eCPointConvertPoint = convertPoint(eCCurveConvertCurve, eCParameterSpec.getGenerator());
        BigInteger order = eCParameterSpec.getOrder();
        BigInteger bigIntegerValueOf = BigInteger.valueOf(eCParameterSpec.getCofactor());
        byte[] seed = eCParameterSpec.getCurve().getSeed();
        return eCParameterSpec instanceof ECNamedCurveSpec ? new ECNamedCurveParameterSpec(((ECNamedCurveSpec) eCParameterSpec).getName(), eCCurveConvertCurve, eCPointConvertPoint, order, bigIntegerValueOf, seed) : new org.bouncycastle.jce.spec.ECParameterSpec(eCCurveConvertCurve, eCPointConvertPoint, order, bigIntegerValueOf, seed);
    }

    public static ECParameterSpec convertToSpec(X9ECParameters x9ECParameters) {
        return new ECParameterSpec(convertCurve(x9ECParameters.getCurve(), null), convertPoint(x9ECParameters.getG()), x9ECParameters.getN(), x9ECParameters.getH().intValue());
    }

    public static org.bouncycastle.math.ec.ECPoint convertPoint(ECCurve eCCurve, ECPoint eCPoint) {
        return eCCurve.createPoint(eCPoint.getAffineX(), eCPoint.getAffineY());
    }

    public static ECParameterSpec convertToSpec(ECDomainParameters eCDomainParameters) {
        return new ECParameterSpec(convertCurve(eCDomainParameters.getCurve(), null), convertPoint(eCDomainParameters.getG()), eCDomainParameters.getN(), eCDomainParameters.getH().intValue());
    }
}
