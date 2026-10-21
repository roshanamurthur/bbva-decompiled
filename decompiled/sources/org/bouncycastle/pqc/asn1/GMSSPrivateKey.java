package org.bouncycastle.pqc.asn1;

import com.google.android.gms.measurement.internal.a;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.pqc.crypto.gmss.GMSSLeaf;
import org.bouncycastle.pqc.crypto.gmss.GMSSParameters;
import org.bouncycastle.pqc.crypto.gmss.GMSSRootCalc;
import org.bouncycastle.pqc.crypto.gmss.GMSSRootSig;
import org.bouncycastle.pqc.crypto.gmss.Treehash;

/* JADX INFO: loaded from: classes13.dex */
public class GMSSPrivateKey extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final DERSequence f90891p0;

    public GMSSPrivateKey(int[] iArr, byte[][] bArr, byte[][] bArr2, byte[][][] bArr3, byte[][][] bArr4, Treehash[][] treehashArr, Treehash[][] treehashArr2, Vector[] vectorArr, Vector[] vectorArr2, Vector[][] vectorArr3, Vector[][] vectorArr4, byte[][][] bArr5, GMSSLeaf[] gMSSLeafArr, GMSSLeaf[] gMSSLeafArr2, GMSSLeaf[] gMSSLeafArr3, int[] iArr2, byte[][] bArr6, GMSSRootCalc[] gMSSRootCalcArr, byte[][] bArr7, GMSSRootSig[] gMSSRootSigArr, GMSSParameters gMSSParameters, AlgorithmIdentifier algorithmIdentifier) {
        AlgorithmIdentifier[] algorithmIdentifierArr = {algorithmIdentifier};
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        for (int i10 : iArr) {
            aSN1EncodableVector2.add(new ASN1Integer(i10));
        }
        ASN1EncodableVector aSN1EncodableVectorD = a.d(aSN1EncodableVector2, aSN1EncodableVector);
        for (byte[] bArr8 : bArr) {
            aSN1EncodableVectorD.add(new DEROctetString(bArr8));
        }
        ASN1EncodableVector aSN1EncodableVectorD2 = a.d(aSN1EncodableVectorD, aSN1EncodableVector);
        for (byte[] bArr9 : bArr2) {
            aSN1EncodableVectorD2.add(new DEROctetString(bArr9));
        }
        ASN1EncodableVector aSN1EncodableVectorD3 = a.d(aSN1EncodableVectorD2, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
        for (byte[][] bArr10 : bArr3) {
            int i11 = 0;
            while (true) {
                if (i11 < bArr10.length) {
                    aSN1EncodableVectorD3.add(new DEROctetString(bArr10[i11]));
                    i11++;
                }
            }
            aSN1EncodableVectorD3 = a.d(aSN1EncodableVectorD3, aSN1EncodableVector3);
        }
        ASN1EncodableVector aSN1EncodableVectorD4 = a.d(aSN1EncodableVector3, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
        for (byte[][] bArr11 : bArr4) {
            int i12 = 0;
            while (true) {
                if (i12 < bArr11.length) {
                    aSN1EncodableVectorD4.add(new DEROctetString(bArr11[i12]));
                    i12++;
                }
            }
            aSN1EncodableVectorD4 = a.d(aSN1EncodableVectorD4, aSN1EncodableVector4);
        }
        ASN1EncodableVector aSN1EncodableVectorD5 = a.d(aSN1EncodableVector4, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector5 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector6 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector7 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector8 = new ASN1EncodableVector();
        for (int i13 = 0; i13 < treehashArr.length; i13++) {
            for (int i14 = 0; i14 < treehashArr[i13].length; i14++) {
                aSN1EncodableVector6.add(new DERSequence(algorithmIdentifierArr[0]));
                int i15 = treehashArr[i13][i14].getStatInt()[1];
                aSN1EncodableVector7.add(new DEROctetString(treehashArr[i13][i14].getStatByte()[0]));
                aSN1EncodableVector7.add(new DEROctetString(treehashArr[i13][i14].getStatByte()[1]));
                aSN1EncodableVector7.add(new DEROctetString(treehashArr[i13][i14].getStatByte()[2]));
                for (int i16 = 0; i16 < i15; i16++) {
                    aSN1EncodableVector7.add(new DEROctetString(treehashArr[i13][i14].getStatByte()[i16 + 3]));
                }
                aSN1EncodableVector7 = a.d(aSN1EncodableVector7, aSN1EncodableVector6);
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i13][i14].getStatInt()[0]));
                aSN1EncodableVector8.add(new ASN1Integer(i15));
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i13][i14].getStatInt()[2]));
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i13][i14].getStatInt()[3]));
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i13][i14].getStatInt()[4]));
                aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i13][i14].getStatInt()[5]));
                int i17 = 0;
                while (i17 < i15) {
                    aSN1EncodableVector8.add(new ASN1Integer(treehashArr[i13][i14].getStatInt()[i17 + 6]));
                    i17++;
                    i15 = i15;
                }
                aSN1EncodableVector8 = a.d(aSN1EncodableVector8, aSN1EncodableVector6);
                aSN1EncodableVector6 = a.d(aSN1EncodableVector6, aSN1EncodableVector5);
            }
            aSN1EncodableVector5 = a.d(aSN1EncodableVector5, aSN1EncodableVectorD5);
        }
        ASN1EncodableVector aSN1EncodableVectorD6 = a.d(aSN1EncodableVectorD5, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector9 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector10 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector11 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector12 = new ASN1EncodableVector();
        for (int i18 = 0; i18 < treehashArr2.length; i18++) {
            for (int i19 = 0; i19 < treehashArr2[i18].length; i19++) {
                aSN1EncodableVector10.add(new DERSequence(algorithmIdentifierArr[0]));
                int i20 = treehashArr2[i18][i19].getStatInt()[1];
                aSN1EncodableVector11.add(new DEROctetString(treehashArr2[i18][i19].getStatByte()[0]));
                aSN1EncodableVector11.add(new DEROctetString(treehashArr2[i18][i19].getStatByte()[1]));
                aSN1EncodableVector11.add(new DEROctetString(treehashArr2[i18][i19].getStatByte()[2]));
                for (int i21 = 0; i21 < i20; i21++) {
                    aSN1EncodableVector11.add(new DEROctetString(treehashArr2[i18][i19].getStatByte()[i21 + 3]));
                }
                aSN1EncodableVector11 = a.d(aSN1EncodableVector11, aSN1EncodableVector10);
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr2[i18][i19].getStatInt()[0]));
                aSN1EncodableVector12.add(new ASN1Integer(i20));
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr2[i18][i19].getStatInt()[2]));
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr2[i18][i19].getStatInt()[3]));
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr2[i18][i19].getStatInt()[4]));
                aSN1EncodableVector12.add(new ASN1Integer(treehashArr2[i18][i19].getStatInt()[5]));
                for (int i22 = 0; i22 < i20; i22++) {
                    aSN1EncodableVector12.add(new ASN1Integer(treehashArr2[i18][i19].getStatInt()[i22 + 6]));
                }
                aSN1EncodableVector12 = a.d(aSN1EncodableVector12, aSN1EncodableVector10);
                aSN1EncodableVector10 = a.d(aSN1EncodableVector10, aSN1EncodableVector9);
            }
            aSN1EncodableVectorD6.add(new DERSequence(new DERSequence(aSN1EncodableVector9)));
            aSN1EncodableVector9 = new ASN1EncodableVector();
        }
        ASN1EncodableVector aSN1EncodableVectorD7 = a.d(aSN1EncodableVectorD6, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector13 = new ASN1EncodableVector();
        for (byte[][] bArr12 : bArr5) {
            int i23 = 0;
            while (true) {
                if (i23 < bArr12.length) {
                    aSN1EncodableVectorD7.add(new DEROctetString(bArr12[i23]));
                    i23++;
                }
            }
            aSN1EncodableVectorD7 = a.d(aSN1EncodableVectorD7, aSN1EncodableVector13);
        }
        ASN1EncodableVector aSN1EncodableVectorD8 = a.d(aSN1EncodableVector13, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector14 = new ASN1EncodableVector();
        for (int i24 = 0; i24 < vectorArr.length; i24++) {
            for (int i25 = 0; i25 < vectorArr[i24].size(); i25++) {
                aSN1EncodableVectorD8.add(new DEROctetString((byte[]) vectorArr[i24].elementAt(i25)));
            }
            aSN1EncodableVectorD8 = a.d(aSN1EncodableVectorD8, aSN1EncodableVector14);
        }
        ASN1EncodableVector aSN1EncodableVectorD9 = a.d(aSN1EncodableVector14, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector15 = new ASN1EncodableVector();
        for (int i26 = 0; i26 < vectorArr2.length; i26++) {
            for (int i27 = 0; i27 < vectorArr2[i26].size(); i27++) {
                aSN1EncodableVectorD9.add(new DEROctetString((byte[]) vectorArr2[i26].elementAt(i27)));
            }
            aSN1EncodableVectorD9 = a.d(aSN1EncodableVectorD9, aSN1EncodableVector15);
        }
        ASN1EncodableVector aSN1EncodableVectorD10 = a.d(aSN1EncodableVector15, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector16 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector17 = new ASN1EncodableVector();
        for (int i28 = 0; i28 < vectorArr3.length; i28++) {
            for (int i29 = 0; i29 < vectorArr3[i28].length; i29++) {
                for (int i30 = 0; i30 < vectorArr3[i28][i29].size(); i30++) {
                    aSN1EncodableVectorD10.add(new DEROctetString((byte[]) vectorArr3[i28][i29].elementAt(i30)));
                }
                aSN1EncodableVectorD10 = a.d(aSN1EncodableVectorD10, aSN1EncodableVector16);
            }
            aSN1EncodableVector16 = a.d(aSN1EncodableVector16, aSN1EncodableVector17);
        }
        ASN1EncodableVector aSN1EncodableVectorD11 = a.d(aSN1EncodableVector17, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector18 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector19 = new ASN1EncodableVector();
        for (int i31 = 0; i31 < vectorArr4.length; i31++) {
            for (int i32 = 0; i32 < vectorArr4[i31].length; i32++) {
                for (int i33 = 0; i33 < vectorArr4[i31][i32].size(); i33++) {
                    aSN1EncodableVectorD11.add(new DEROctetString((byte[]) vectorArr4[i31][i32].elementAt(i33)));
                }
                aSN1EncodableVectorD11 = a.d(aSN1EncodableVectorD11, aSN1EncodableVector18);
            }
            aSN1EncodableVector18 = a.d(aSN1EncodableVector18, aSN1EncodableVector19);
        }
        ASN1EncodableVector aSN1EncodableVectorD12 = a.d(aSN1EncodableVector19, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector20 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector21 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector22 = new ASN1EncodableVector();
        for (int i34 = 0; i34 < gMSSLeafArr.length; i34++) {
            aSN1EncodableVector20.add(new DERSequence(algorithmIdentifierArr[0]));
            byte[][] statByte = gMSSLeafArr[i34].getStatByte();
            aSN1EncodableVector21.add(new DEROctetString(statByte[0]));
            aSN1EncodableVector21.add(new DEROctetString(statByte[1]));
            aSN1EncodableVector21.add(new DEROctetString(statByte[2]));
            aSN1EncodableVector21.add(new DEROctetString(statByte[3]));
            aSN1EncodableVector20.add(new DERSequence(aSN1EncodableVector21));
            aSN1EncodableVector21 = new ASN1EncodableVector();
            int[] statInt = gMSSLeafArr[i34].getStatInt();
            aSN1EncodableVector22.add(new ASN1Integer(statInt[0]));
            aSN1EncodableVector22.add(new ASN1Integer(statInt[1]));
            aSN1EncodableVector22.add(new ASN1Integer(statInt[2]));
            aSN1EncodableVector22.add(new ASN1Integer(statInt[3]));
            aSN1EncodableVector20.add(new DERSequence(aSN1EncodableVector22));
            aSN1EncodableVector22 = new ASN1EncodableVector();
            aSN1EncodableVector20 = a.d(aSN1EncodableVector20, aSN1EncodableVectorD12);
        }
        ASN1EncodableVector aSN1EncodableVectorD13 = a.d(aSN1EncodableVectorD12, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector23 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector24 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector25 = new ASN1EncodableVector();
        for (int i35 = 0; i35 < gMSSLeafArr2.length; i35++) {
            aSN1EncodableVector23.add(new DERSequence(algorithmIdentifierArr[0]));
            byte[][] statByte2 = gMSSLeafArr2[i35].getStatByte();
            aSN1EncodableVector24.add(new DEROctetString(statByte2[0]));
            aSN1EncodableVector24.add(new DEROctetString(statByte2[1]));
            aSN1EncodableVector24.add(new DEROctetString(statByte2[2]));
            aSN1EncodableVector24.add(new DEROctetString(statByte2[3]));
            aSN1EncodableVector23.add(new DERSequence(aSN1EncodableVector24));
            aSN1EncodableVector24 = new ASN1EncodableVector();
            int[] statInt2 = gMSSLeafArr2[i35].getStatInt();
            aSN1EncodableVector25.add(new ASN1Integer(statInt2[0]));
            aSN1EncodableVector25.add(new ASN1Integer(statInt2[1]));
            aSN1EncodableVector25.add(new ASN1Integer(statInt2[2]));
            aSN1EncodableVector25.add(new ASN1Integer(statInt2[3]));
            aSN1EncodableVector23.add(new DERSequence(aSN1EncodableVector25));
            aSN1EncodableVector25 = new ASN1EncodableVector();
            aSN1EncodableVector23 = a.d(aSN1EncodableVector23, aSN1EncodableVectorD13);
        }
        ASN1EncodableVector aSN1EncodableVectorD14 = a.d(aSN1EncodableVectorD13, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector26 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector27 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector28 = new ASN1EncodableVector();
        for (int i36 = 0; i36 < gMSSLeafArr3.length; i36++) {
            aSN1EncodableVector26.add(new DERSequence(algorithmIdentifierArr[0]));
            byte[][] statByte3 = gMSSLeafArr3[i36].getStatByte();
            aSN1EncodableVector27.add(new DEROctetString(statByte3[0]));
            aSN1EncodableVector27.add(new DEROctetString(statByte3[1]));
            aSN1EncodableVector27.add(new DEROctetString(statByte3[2]));
            aSN1EncodableVector27.add(new DEROctetString(statByte3[3]));
            aSN1EncodableVector26.add(new DERSequence(aSN1EncodableVector27));
            aSN1EncodableVector27 = new ASN1EncodableVector();
            int[] statInt3 = gMSSLeafArr3[i36].getStatInt();
            aSN1EncodableVector28.add(new ASN1Integer(statInt3[0]));
            aSN1EncodableVector28.add(new ASN1Integer(statInt3[1]));
            aSN1EncodableVector28.add(new ASN1Integer(statInt3[2]));
            aSN1EncodableVector28.add(new ASN1Integer(statInt3[3]));
            aSN1EncodableVector26.add(new DERSequence(aSN1EncodableVector28));
            aSN1EncodableVector28 = new ASN1EncodableVector();
            aSN1EncodableVector26 = a.d(aSN1EncodableVector26, aSN1EncodableVectorD14);
        }
        ASN1EncodableVector aSN1EncodableVectorD15 = a.d(aSN1EncodableVectorD14, aSN1EncodableVector);
        char c10 = 1;
        for (int i37 : iArr2) {
            aSN1EncodableVectorD15.add(new ASN1Integer(i37));
        }
        ASN1EncodableVector aSN1EncodableVectorD16 = a.d(aSN1EncodableVectorD15, aSN1EncodableVector);
        for (byte[] bArr13 : bArr6) {
            aSN1EncodableVectorD16.add(new DEROctetString(bArr13));
        }
        ASN1EncodableVector aSN1EncodableVectorD17 = a.d(aSN1EncodableVectorD16, aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector29 = new ASN1EncodableVector();
        new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector30 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector31 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector32 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector33 = new ASN1EncodableVector();
        int i38 = 0;
        while (i38 < gMSSRootCalcArr.length) {
            aSN1EncodableVector29.add(new DERSequence(algorithmIdentifierArr[0]));
            new ASN1EncodableVector();
            int i39 = gMSSRootCalcArr[i38].getStatInt()[0];
            int i40 = gMSSRootCalcArr[i38].getStatInt()[7];
            aSN1EncodableVector30.add(new DEROctetString(gMSSRootCalcArr[i38].getStatByte()[0]));
            int i41 = 0;
            while (i41 < i39) {
                i41++;
                aSN1EncodableVector30.add(new DEROctetString(gMSSRootCalcArr[i38].getStatByte()[i41]));
            }
            for (int i42 = 0; i42 < i40; i42++) {
                aSN1EncodableVector30.add(new DEROctetString(gMSSRootCalcArr[i38].getStatByte()[i39 + 1 + i42]));
            }
            ASN1EncodableVector aSN1EncodableVectorD18 = a.d(aSN1EncodableVector30, aSN1EncodableVector29);
            aSN1EncodableVector31.add(new ASN1Integer(i39));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i38].getStatInt()[c10]));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i38].getStatInt()[2]));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i38].getStatInt()[3]));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i38].getStatInt()[4]));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i38].getStatInt()[5]));
            aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i38].getStatInt()[6]));
            aSN1EncodableVector31.add(new ASN1Integer(i40));
            int i43 = 0;
            while (i43 < i39) {
                aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i38].getStatInt()[i43 + 8]));
                i43++;
                aSN1EncodableVectorD18 = aSN1EncodableVectorD18;
            }
            ASN1EncodableVector aSN1EncodableVector34 = aSN1EncodableVectorD18;
            for (int i44 = 0; i44 < i40; i44++) {
                aSN1EncodableVector31.add(new ASN1Integer(gMSSRootCalcArr[i38].getStatInt()[i39 + 8 + i44]));
            }
            ASN1EncodableVector aSN1EncodableVectorD19 = a.d(aSN1EncodableVector31, aSN1EncodableVector29);
            ASN1EncodableVector aSN1EncodableVector35 = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector36 = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector37 = new ASN1EncodableVector();
            if (gMSSRootCalcArr[i38].getTreehash() != null) {
                int i45 = 0;
                while (i45 < gMSSRootCalcArr[i38].getTreehash().length) {
                    aSN1EncodableVector35.add(new DERSequence(algorithmIdentifierArr[0]));
                    int i46 = gMSSRootCalcArr[i38].getTreehash()[i45].getStatInt()[1];
                    aSN1EncodableVector36.add(new DEROctetString(gMSSRootCalcArr[i38].getTreehash()[i45].getStatByte()[0]));
                    aSN1EncodableVector36.add(new DEROctetString(gMSSRootCalcArr[i38].getTreehash()[i45].getStatByte()[1]));
                    aSN1EncodableVector36.add(new DEROctetString(gMSSRootCalcArr[i38].getTreehash()[i45].getStatByte()[2]));
                    int i47 = 0;
                    while (i47 < i46) {
                        aSN1EncodableVector36.add(new DEROctetString(gMSSRootCalcArr[i38].getTreehash()[i45].getStatByte()[i47 + 3]));
                        i47++;
                        aSN1EncodableVectorD19 = aSN1EncodableVectorD19;
                    }
                    ASN1EncodableVector aSN1EncodableVector38 = aSN1EncodableVectorD19;
                    aSN1EncodableVector36 = a.d(aSN1EncodableVector36, aSN1EncodableVector35);
                    aSN1EncodableVector37.add(new ASN1Integer(gMSSRootCalcArr[i38].getTreehash()[i45].getStatInt()[0]));
                    aSN1EncodableVector37.add(new ASN1Integer(i46));
                    aSN1EncodableVector37.add(new ASN1Integer(gMSSRootCalcArr[i38].getTreehash()[i45].getStatInt()[2]));
                    aSN1EncodableVector37.add(new ASN1Integer(gMSSRootCalcArr[i38].getTreehash()[i45].getStatInt()[3]));
                    aSN1EncodableVector37.add(new ASN1Integer(gMSSRootCalcArr[i38].getTreehash()[i45].getStatInt()[4]));
                    aSN1EncodableVector37.add(new ASN1Integer(gMSSRootCalcArr[i38].getTreehash()[i45].getStatInt()[5]));
                    int i48 = 0;
                    while (i48 < i46) {
                        aSN1EncodableVector37.add(new ASN1Integer(gMSSRootCalcArr[i38].getTreehash()[i45].getStatInt()[i48 + 6]));
                        i48++;
                        aSN1EncodableVector = aSN1EncodableVector;
                    }
                    aSN1EncodableVector37 = a.d(aSN1EncodableVector37, aSN1EncodableVector35);
                    aSN1EncodableVector35 = a.d(aSN1EncodableVector35, aSN1EncodableVector32);
                    i45++;
                    aSN1EncodableVectorD19 = aSN1EncodableVector38;
                }
            }
            ASN1EncodableVector aSN1EncodableVector39 = aSN1EncodableVectorD19;
            ASN1EncodableVector aSN1EncodableVector40 = aSN1EncodableVector;
            aSN1EncodableVector32 = a.d(aSN1EncodableVector32, aSN1EncodableVector29);
            ASN1EncodableVector aSN1EncodableVector41 = new ASN1EncodableVector();
            if (gMSSRootCalcArr[i38].getRetain() != null) {
                for (int i49 = 0; i49 < gMSSRootCalcArr[i38].getRetain().length; i49++) {
                    for (int i50 = 0; i50 < gMSSRootCalcArr[i38].getRetain()[i49].size(); i50++) {
                        aSN1EncodableVector41.add(new DEROctetString((byte[]) gMSSRootCalcArr[i38].getRetain()[i49].elementAt(i50)));
                    }
                    aSN1EncodableVector41 = a.d(aSN1EncodableVector41, aSN1EncodableVector33);
                }
            }
            aSN1EncodableVector33 = a.d(aSN1EncodableVector33, aSN1EncodableVector29);
            aSN1EncodableVector29 = a.d(aSN1EncodableVector29, aSN1EncodableVectorD17);
            i38++;
            aSN1EncodableVector30 = aSN1EncodableVector34;
            aSN1EncodableVector31 = aSN1EncodableVector39;
            aSN1EncodableVector = aSN1EncodableVector40;
            c10 = 1;
        }
        ASN1EncodableVector aSN1EncodableVector42 = aSN1EncodableVector;
        ASN1EncodableVector aSN1EncodableVectorD20 = a.d(aSN1EncodableVectorD17, aSN1EncodableVector42);
        for (byte[] bArr14 : bArr7) {
            aSN1EncodableVectorD20.add(new DEROctetString(bArr14));
        }
        ASN1EncodableVector aSN1EncodableVectorD21 = a.d(aSN1EncodableVectorD20, aSN1EncodableVector42);
        ASN1EncodableVector aSN1EncodableVector43 = new ASN1EncodableVector();
        new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector44 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector45 = new ASN1EncodableVector();
        for (int i51 = 0; i51 < gMSSRootSigArr.length; i51++) {
            aSN1EncodableVector43.add(new DERSequence(algorithmIdentifierArr[0]));
            new ASN1EncodableVector();
            aSN1EncodableVector44.add(new DEROctetString(gMSSRootSigArr[i51].getStatByte()[0]));
            aSN1EncodableVector44.add(new DEROctetString(gMSSRootSigArr[i51].getStatByte()[1]));
            aSN1EncodableVector44.add(new DEROctetString(gMSSRootSigArr[i51].getStatByte()[2]));
            aSN1EncodableVector44.add(new DEROctetString(gMSSRootSigArr[i51].getStatByte()[3]));
            aSN1EncodableVector44.add(new DEROctetString(gMSSRootSigArr[i51].getStatByte()[4]));
            aSN1EncodableVector43.add(new DERSequence(aSN1EncodableVector44));
            aSN1EncodableVector44 = new ASN1EncodableVector();
            aSN1EncodableVector45.add(new ASN1Integer(gMSSRootSigArr[i51].getStatInt()[0]));
            aSN1EncodableVector45.add(new ASN1Integer(gMSSRootSigArr[i51].getStatInt()[1]));
            aSN1EncodableVector45.add(new ASN1Integer(gMSSRootSigArr[i51].getStatInt()[2]));
            aSN1EncodableVector45.add(new ASN1Integer(gMSSRootSigArr[i51].getStatInt()[3]));
            aSN1EncodableVector45.add(new ASN1Integer(gMSSRootSigArr[i51].getStatInt()[4]));
            aSN1EncodableVector45.add(new ASN1Integer(gMSSRootSigArr[i51].getStatInt()[5]));
            aSN1EncodableVector45.add(new ASN1Integer(gMSSRootSigArr[i51].getStatInt()[6]));
            aSN1EncodableVector45.add(new ASN1Integer(gMSSRootSigArr[i51].getStatInt()[7]));
            aSN1EncodableVector45.add(new ASN1Integer(gMSSRootSigArr[i51].getStatInt()[8]));
            aSN1EncodableVector43.add(new DERSequence(aSN1EncodableVector45));
            aSN1EncodableVector45 = new ASN1EncodableVector();
            aSN1EncodableVector43 = a.d(aSN1EncodableVector43, aSN1EncodableVectorD21);
        }
        ASN1EncodableVector aSN1EncodableVectorD22 = a.d(aSN1EncodableVectorD21, aSN1EncodableVector42);
        ASN1EncodableVector aSN1EncodableVector46 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector47 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector48 = new ASN1EncodableVector();
        for (int i52 = 0; i52 < gMSSParameters.getHeightOfTrees().length; i52++) {
            aSN1EncodableVector46.add(new ASN1Integer(gMSSParameters.getHeightOfTrees()[i52]));
            aSN1EncodableVector47.add(new ASN1Integer(gMSSParameters.getWinternitzParameter()[i52]));
            aSN1EncodableVector48.add(new ASN1Integer(gMSSParameters.getK()[i52]));
        }
        aSN1EncodableVectorD22.add(new ASN1Integer(gMSSParameters.getNumOfLayers()));
        aSN1EncodableVectorD22.add(new DERSequence(aSN1EncodableVector46));
        aSN1EncodableVectorD22.add(new DERSequence(aSN1EncodableVector47));
        aSN1EncodableVectorD22.add(new DERSequence(aSN1EncodableVector48));
        ASN1EncodableVector aSN1EncodableVectorD23 = a.d(aSN1EncodableVectorD22, aSN1EncodableVector42);
        aSN1EncodableVectorD23.add(algorithmIdentifierArr[0]);
        aSN1EncodableVector42.add(new DERSequence(aSN1EncodableVectorD23));
        this.f90891p0 = new DERSequence(aSN1EncodableVector42);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f90891p0;
    }
}
