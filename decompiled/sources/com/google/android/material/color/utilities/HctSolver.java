package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class HctSolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double[][] f44376a = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double[][] f44377b = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double[] f44378c = {0.2126d, 0.7152d, 0.0722d};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final double[] f44379d = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};

    public static boolean a(double d2, double d3, double d7) {
        return ((d3 - d2) + 25.132741228718345d) % 6.283185307179586d < ((d7 - d2) + 25.132741228718345d) % 6.283185307179586d;
    }

    public static double b(double d2) {
        double dPow = Math.pow(Math.abs(d2), 0.42d);
        return ((((double) MathUtils.signum(d2)) * 400.0d) * dPow) / (dPow + 27.13d);
    }

    public static double c(double[] dArr) {
        double[] dArrMatrixMultiply = MathUtils.matrixMultiply(dArr, f44376a);
        double dB = b(dArrMatrixMultiply[0]);
        double dB2 = b(dArrMatrixMultiply[1]);
        double dB3 = b(dArrMatrixMultiply[2]);
        return Math.atan2(((dB + dB2) - (dB3 * 2.0d)) / 9.0d, ((((-12.0d) * dB2) + (dB * 11.0d)) + dB3) / 11.0d);
    }

    public static double d(double d2) {
        double dAbs = Math.abs(d2);
        double dMax = Math.max(0.0d, (27.13d * dAbs) / (400.0d - dAbs));
        return Math.pow(dMax, 2.380952380952381d) * ((double) MathUtils.signum(d2));
    }

    public static boolean e(double d2) {
        return 0.0d <= d2 && d2 <= 100.0d;
    }

    public static double f(double d2) {
        double d3 = d2 / 100.0d;
        return (d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    public static Cam16 solveToCam(double d2, double d3, double d7) {
        return Cam16.fromInt(solveToInt(d2, d3, d7));
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0360  */
    /* JADX WARN: Code duplicated, block: B:107:0x0363  */
    /* JADX WARN: Code duplicated, block: B:109:0x0369  */
    /* JADX WARN: Code duplicated, block: B:44:0x01c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:48:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:50:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:51:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:56:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:58:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:60:0x020b  */
    /* JADX WARN: Code duplicated, block: B:61:0x021a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0223  */
    /* JADX WARN: Code duplicated, block: B:64:0x022a  */
    /* JADX WARN: Code duplicated, block: B:66:0x023a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0247  */
    /* JADX WARN: Code duplicated, block: B:68:0x024d  */
    /* JADX WARN: Code duplicated, block: B:70:0x025d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0268  */
    /* JADX WARN: Code duplicated, block: B:75:0x0274  */
    /* JADX WARN: Code duplicated, block: B:77:0x027a  */
    /* JADX WARN: Code duplicated, block: B:78:0x027f  */
    /* JADX WARN: Code duplicated, block: B:82:0x028e  */
    /* JADX WARN: Code duplicated, block: B:85:0x029d  */
    /* JADX WARN: Code duplicated, block: B:87:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:92:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:94:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:96:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:98:0x02e6  */
    public static int solveToInt(double d2, double d3, double d7) {
        int iArgbFromLinrgb;
        double[] dArr;
        double[] dArr2;
        boolean z10;
        int i10;
        double d10;
        double d11;
        boolean z11;
        double dC;
        double[] dArr3;
        int i11;
        double d12;
        double d13;
        int iCeil;
        double dFloor;
        int i12;
        int i13;
        int iFloor;
        double[] dArr4;
        double dC2;
        double d14;
        double d15;
        double d16;
        double d17;
        double d18;
        double[] dArr5;
        double d19;
        double d20;
        double dC3;
        double d21;
        if (d3 < 1.0E-4d || d7 < 1.0E-4d || d7 > 99.9999d) {
            return ColorUtils.argbFromLstar(d7);
        }
        double dSanitizeDegreesDouble = (MathUtils.sanitizeDegreesDouble(d2) / 180.0d) * 3.141592653589793d;
        double dYFromLstar = ColorUtils.yFromLstar(d7);
        double dSqrt = Math.sqrt(dYFromLstar) * 11.0d;
        ViewingConditions viewingConditions = ViewingConditions.DEFAULT;
        double dPow = 1.0d / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d);
        double dCos = (Math.cos(dSanitizeDegreesDouble + 2.0d) + 3.8d) * 0.25d * 3846.153846153846d * viewingConditions.f44450e * viewingConditions.f44448c;
        double dSin = Math.sin(dSanitizeDegreesDouble);
        double dCos2 = Math.cos(dSanitizeDegreesDouble);
        int i14 = 0;
        while (true) {
            double[] dArr6 = f44378c;
            if (i14 < 5) {
                double d22 = dSin;
                double d23 = dSqrt / 100.0d;
                double d24 = dCos;
                double dPow2 = Math.pow(((d3 == 0.0d || dSqrt == 0.0d) ? 0.0d : d3 / Math.sqrt(d23)) * dPow, 1.1111111111111112d);
                double d25 = dPow;
                double dPow3 = (Math.pow(d23, (1.0d / viewingConditions.f44449d) / viewingConditions.f44455j) * viewingConditions.getAw()) / viewingConditions.getNbb();
                double d26 = (((0.305d + dPow3) * 23.0d) * dPow2) / (((dPow2 * 108.0d) * d22) + (((dPow2 * 11.0d) * dCos2) + (23.0d * d24)));
                double d27 = d26 * dCos2;
                double d28 = d26 * d22;
                double d29 = dPow3 * 460.0d;
                ViewingConditions viewingConditions2 = viewingConditions;
                double[] dArrMatrixMultiply = MathUtils.matrixMultiply(new double[]{d(((288.0d * d28) + ((451.0d * d27) + d29)) / 1403.0d), d(((d29 - (891.0d * d27)) - (261.0d * d28)) / 1403.0d), d(((d29 - (d27 * 220.0d)) - (d28 * 6300.0d)) / 1403.0d)}, f44377b);
                double d30 = dArrMatrixMultiply[0];
                if (d30 >= 0.0d) {
                    double d31 = dArrMatrixMultiply[1];
                    if (d31 >= 0.0d) {
                        double d32 = dArrMatrixMultiply[2];
                        if (d32 >= 0.0d) {
                            double d33 = (dArr6[2] * d32) + (dArr6[1] * d31) + (dArr6[0] * d30);
                            if (d33 > 0.0d) {
                                if (i14 != 4) {
                                    double d34 = d33 - dYFromLstar;
                                    if (Math.abs(d34) >= 0.002d) {
                                        dSqrt -= (d34 * dSqrt) / (d33 * 2.0d);
                                        i14++;
                                        viewingConditions = viewingConditions2;
                                        dPow = d25;
                                        dSin = d22;
                                        dCos = d24;
                                    }
                                }
                                if (dArrMatrixMultiply[0] <= 100.01d && dArrMatrixMultiply[1] <= 100.01d && dArrMatrixMultiply[2] <= 100.01d) {
                                    iArgbFromLinrgb = ColorUtils.argbFromLinrgb(dArrMatrixMultiply);
                                }
                                if (iArgbFromLinrgb != 0) {
                                    return iArgbFromLinrgb;
                                }
                                dArr = new double[]{-1.0d, -1.0d, -1.0d};
                                dArr2 = dArr;
                                z10 = false;
                                i10 = 0;
                                d10 = 0.0d;
                                d11 = 0.0d;
                                z11 = true;
                                while (i10 < 12) {
                                    d14 = dArr6[0];
                                    d15 = dArr6[1];
                                    d16 = dArr6[2];
                                    if (i10 % 4 <= 1) {
                                        d17 = 0.0d;
                                    } else {
                                        d17 = 100.0d;
                                    }
                                    if (i10 % 2 == 0) {
                                        d18 = 0.0d;
                                    } else {
                                        d18 = 100.0d;
                                    }
                                    if (i10 < 4) {
                                        d21 = ((dYFromLstar - (d15 * d17)) - (d16 * d18)) / d14;
                                        if (e(d21)) {
                                            dArr5 = dArr2;
                                            dArr2 = new double[]{d21, d17, d18};
                                        } else {
                                            dArr5 = dArr2;
                                            dArr2 = new double[]{-1.0d, -1.0d, -1.0d};
                                        }
                                    } else {
                                        dArr5 = dArr2;
                                        if (i10 < 8) {
                                            d20 = ((dYFromLstar - (d14 * d18)) - (d16 * d17)) / d15;
                                            if (e(d20)) {
                                                dArr2 = new double[]{d18, d20, d17};
                                            } else {
                                                dArr2 = new double[]{-1.0d, -1.0d, -1.0d};
                                            }
                                        } else {
                                            d19 = ((dYFromLstar - (d14 * d17)) - (d15 * d18)) / d16;
                                            if (e(d19)) {
                                                dArr2 = new double[]{d17, d18, d19};
                                            } else {
                                                dArr2 = new double[]{-1.0d, -1.0d, -1.0d};
                                            }
                                        }
                                    }
                                    if (dArr2[0] < 0.0d) {
                                        dArr2 = dArr5;
                                    } else {
                                        dC3 = c(dArr2);
                                        if (!z10) {
                                            dArr = dArr2;
                                            d10 = dC3;
                                            d11 = d10;
                                            z10 = true;
                                        } else if (!z11 || a(d10, dC3, d11)) {
                                            if (a(d10, dSanitizeDegreesDouble, dC3)) {
                                                d11 = dC3;
                                            } else {
                                                dArr = dArr2;
                                                d10 = dC3;
                                                dArr2 = dArr5;
                                            }
                                            z11 = false;
                                        } else {
                                            dArr2 = dArr5;
                                        }
                                    }
                                    i10++;
                                    dArr6 = dArr6;
                                }
                                dC = c(dArr);
                                dArr3 = new double[][]{dArr, dArr2}[1];
                                for (i11 = 0; i11 < 3; i11++) {
                                    d12 = dArr[i11];
                                    d13 = dArr3[i11];
                                    if (d12 == d13) {
                                        if (d12 < d13) {
                                            iCeil = (int) Math.floor(f(d12) - 0.5d);
                                            dFloor = Math.ceil(f(dArr3[i11]) - 0.5d);
                                        } else {
                                            iCeil = (int) Math.ceil(f(d12) - 0.5d);
                                            dFloor = Math.floor(f(dArr3[i11]) - 0.5d);
                                        }
                                        i12 = (int) dFloor;
                                        for (i13 = 0; i13 < 8 && Math.abs(i12 - iCeil) > 1; i13++) {
                                            iFloor = (int) Math.floor(((double) (iCeil + i12)) / 2.0d);
                                            double d35 = f44379d[iFloor];
                                            double d36 = dArr[i11];
                                            double d37 = (d35 - d36) / (dArr3[i11] - d36);
                                            double d38 = dArr[0];
                                            double d39 = dArr[1];
                                            double d40 = dArr[2];
                                            dArr4 = new double[]{((dArr3[0] - d38) * d37) + d38, ((dArr3[1] - d39) * d37) + d39, ((dArr3[2] - d40) * d37) + d40};
                                            dC2 = c(dArr4);
                                            if (a(dC, dSanitizeDegreesDouble, dC2)) {
                                                i12 = iFloor;
                                                dArr3 = dArr4;
                                            } else {
                                                iCeil = iFloor;
                                                dArr = dArr4;
                                                dC = dC2;
                                            }
                                        }
                                    }
                                }
                                return ColorUtils.argbFromLinrgb(new double[]{(dArr[0] + dArr3[0]) / 2.0d, (dArr[1] + dArr3[1]) / 2.0d, (dArr[2] + dArr3[2]) / 2.0d});
                            }
                        }
                    }
                }
            }
            iArgbFromLinrgb = 0;
            if (iArgbFromLinrgb != 0) {
                return iArgbFromLinrgb;
            }
            dArr = new double[]{-1.0d, -1.0d, -1.0d};
            dArr2 = dArr;
            z10 = false;
            i10 = 0;
            d10 = 0.0d;
            d11 = 0.0d;
            z11 = true;
            while (i10 < 12) {
                d14 = dArr6[0];
                d15 = dArr6[1];
                d16 = dArr6[2];
                if (i10 % 4 <= 1) {
                    d17 = 0.0d;
                } else {
                    d17 = 100.0d;
                }
                if (i10 % 2 == 0) {
                    d18 = 0.0d;
                } else {
                    d18 = 100.0d;
                }
                if (i10 < 4) {
                    d21 = ((dYFromLstar - (d15 * d17)) - (d16 * d18)) / d14;
                    if (e(d21)) {
                        dArr5 = dArr2;
                        dArr2 = new double[]{d21, d17, d18};
                    } else {
                        dArr5 = dArr2;
                        dArr2 = new double[]{-1.0d, -1.0d, -1.0d};
                    }
                } else {
                    dArr5 = dArr2;
                    if (i10 < 8) {
                        d20 = ((dYFromLstar - (d14 * d18)) - (d16 * d17)) / d15;
                        if (e(d20)) {
                            dArr2 = new double[]{d18, d20, d17};
                        } else {
                            dArr2 = new double[]{-1.0d, -1.0d, -1.0d};
                        }
                    } else {
                        d19 = ((dYFromLstar - (d14 * d17)) - (d15 * d18)) / d16;
                        if (e(d19)) {
                            dArr2 = new double[]{d17, d18, d19};
                        } else {
                            dArr2 = new double[]{-1.0d, -1.0d, -1.0d};
                        }
                    }
                }
                if (dArr2[0] < 0.0d) {
                    dArr2 = dArr5;
                } else {
                    dC3 = c(dArr2);
                    if (!z10) {
                        dArr = dArr2;
                        d10 = dC3;
                        d11 = d10;
                        z10 = true;
                    } else {
                        if (z11) {
                        }
                        if (a(d10, dSanitizeDegreesDouble, dC3)) {
                            d11 = dC3;
                        } else {
                            dArr = dArr2;
                            d10 = dC3;
                            dArr2 = dArr5;
                        }
                        z11 = false;
                    }
                }
                i10++;
                dArr6 = dArr6;
            }
            dC = c(dArr);
            dArr3 = new double[][]{dArr, dArr2}[1];
            while (i11 < 3) {
                d12 = dArr[i11];
                d13 = dArr3[i11];
                if (d12 == d13) {
                    if (d12 < d13) {
                        iCeil = (int) Math.floor(f(d12) - 0.5d);
                        dFloor = Math.ceil(f(dArr3[i11]) - 0.5d);
                    } else {
                        iCeil = (int) Math.ceil(f(d12) - 0.5d);
                        dFloor = Math.floor(f(dArr3[i11]) - 0.5d);
                    }
                    i12 = (int) dFloor;
                    while (i13 < 8) {
                        iFloor = (int) Math.floor(((double) (iCeil + i12)) / 2.0d);
                        double d310 = f44379d[iFloor];
                        double d311 = dArr[i11];
                        double d312 = (d310 - d311) / (dArr3[i11] - d311);
                        double d313 = dArr[0];
                        double d314 = dArr[1];
                        double d41 = dArr[2];
                        dArr4 = new double[]{((dArr3[0] - d313) * d312) + d313, ((dArr3[1] - d314) * d312) + d314, ((dArr3[2] - d41) * d312) + d41};
                        dC2 = c(dArr4);
                        if (a(dC, dSanitizeDegreesDouble, dC2)) {
                            i12 = iFloor;
                            dArr3 = dArr4;
                        } else {
                            iCeil = iFloor;
                            dArr = dArr4;
                            dC = dC2;
                        }
                    }
                }
            }
            return ColorUtils.argbFromLinrgb(new double[]{(dArr[0] + dArr3[0]) / 2.0d, (dArr[1] + dArr3[1]) / 2.0d, (dArr[2] + dArr3[2]) / 2.0d});
        }
    }
}
