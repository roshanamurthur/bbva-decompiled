package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import java.security.NoSuchProviderException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encoding;

/* JADX INFO: loaded from: classes10.dex */
public final class aok extends CertPath {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final List f53426q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static char[] f53427r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static long f53428s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f53429t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f53430u0;
    public static final byte[] v0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final List f53431p0;

    static {
        c();
        f53429t0 = 0;
        f53430u0 = 1;
        g();
        ArrayList arrayList = new ArrayList();
        arrayList.add("PkiPath");
        arrayList.add("PEM");
        Object[] objArr = new Object[1];
        a((char) (46340 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (Process.getThreadPriority(0) + 20) >> 6, TextUtils.indexOf((CharSequence) "", '0', 0) + 6, objArr);
        arrayList.add(((String) objArr[0]).intern());
        f53426q0 = Collections.unmodifiableList(arrayList);
        int i10 = f53430u0 + 21;
        f53429t0 = i10 % 128;
        int i11 = i10 % 2;
    }

    public aok(InputStream inputStream, String str) throws Throwable {
        super(ConstantKt.CERTIFICATE_TYPE_X509);
        aow aowVar = new aow();
        try {
            if (!str.equalsIgnoreCase("PkiPath")) {
                Object[] objArr = new Object[1];
                a((char) (AndroidCharacter.getMirror('0') + 46292), View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 5, objArr);
                if (!str.equalsIgnoreCase(((String) objArr[0]).intern()) && !str.equalsIgnoreCase("PEM")) {
                    throw new CertificateException("unsupported encoding: ".concat(str));
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                this.f53431p0 = new ArrayList();
                CertificateFactory dividerPadding = aowVar.setDividerPadding(ConstantKt.CERTIFICATE_TYPE_X509);
                while (true) {
                    Certificate certificateGenerateCertificate = dividerPadding.generateCertificate(bufferedInputStream);
                    if (certificateGenerateCertificate == null) {
                        break;
                    } else {
                        this.f53431p0.add(certificateGenerateCertificate);
                    }
                }
            } else {
                adq adqVar = new adq(inputStream);
                ady adyVar = (ady) adq.setOnFocusChangeListener(new Object[]{adqVar}, -1818946624, 1818946633, System.identityHashCode(adqVar));
                if (!(adyVar instanceof aed)) {
                    throw new CertificateException("input stream does not contain a ASN1 SEQUENCE while reading PkiPath encoded data to load CertPath");
                }
                Enumeration dividerPadding2 = ((aed) adyVar).setDividerPadding();
                this.f53431p0 = new ArrayList();
                CertificateFactory dividerPadding3 = aowVar.setDividerPadding(ConstantKt.CERTIFICATE_TYPE_X509);
                while (dividerPadding2.hasMoreElements()) {
                    ady adyVarUiMessageCallbackKtWhenMappings = ((add) dividerPadding2.nextElement()).UiMessageCallbackKtWhenMappings();
                    this.f53431p0.add(0, dividerPadding3.generateCertificate(new ByteArrayInputStream((byte[]) adw.setOnLongClickListener(new Object[]{adyVarUiMessageCallbackKtWhenMappings, ASN1Encoding.DER}, -2049344731, 2049344731, System.identityHashCode(adyVarUiMessageCallbackKtWhenMappings)))));
                }
            }
            this.f53431p0 = e(this.f53431p0);
        } catch (IOException e5) {
            StringBuilder sb2 = new StringBuilder("IOException throw while decoding CertPath:\n");
            sb2.append(e5.toString());
            throw new CertificateException(sb2.toString());
        } catch (NoSuchProviderException e7) {
            StringBuilder sb3 = new StringBuilder("BouncyCastle provider not found while trying to get a CertificateFactory:\n");
            sb3.append(e7.toString());
            throw new CertificateException(sb3.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:39:0x01e5  */
    public static void a(char c10, int i10, int i11, Object[] objArr) throws Throwable {
        long j10;
        Throwable cause;
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode();
        long[] jArr = new long[i11];
        int i12 = 0;
        setcompounddrawabletintblendmode.setDividerPadding = 0;
        while (true) {
            int i13 = setcompounddrawabletintblendmode.setDividerPadding;
            j10 = 0;
            if (i13 >= i11) {
                break;
            }
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i12] = Integer.valueOf(f53427r0[i10 + i13]);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(1832327647);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 44 - Drawable.resolveOpacity(i12, i12), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 727);
                    byte b10 = (byte) i12;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    b(b10, b11, b11, objArr3);
                    String str = (String) objArr3[i12];
                    Class<?>[] clsArr = new Class[1];
                    clsArr[i12] = Integer.TYPE;
                    method = cls.getMethod(str, clsArr);
                    map.put(1832327647, method);
                }
                Object[] objArr4 = {Long.valueOf(((Long) ((Method) method).invoke(null, objArr2)).longValue()), Long.valueOf(setcompounddrawabletintblendmode.setDividerPadding), Long.valueOf(f53428s0), Integer.valueOf(c10)};
                Object method2 = map.get(2012362404);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 46117), (ViewConfiguration.getPressedStateDuration() >> 16) + 43, 1775 - TextUtils.indexOf((CharSequence) "", '0', 0));
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    b(b12, b13, (byte) (b13 + 1), objArr5);
                    String str2 = (String) objArr5[0];
                    Class<?> cls3 = Long.TYPE;
                    method2 = cls2.getMethod(str2, cls3, cls3, cls3, Integer.TYPE);
                    map.put(2012362404, method2);
                }
                jArr[i13] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                Object[] objArr6 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                Object method3 = map.get(1606688712);
                if (method3 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.blue(0) + 27, ((Process.getThreadPriority(0) + 20) >> 6) + 2311);
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr7 = new Object[1];
                    b(b14, b15, (byte) (b15 + 5), objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map.put(1606688712, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                i12 = 0;
            } catch (Throwable th2) {
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr = new char[i11];
        setcompounddrawabletintblendmode.setDividerPadding = 0;
        while (true) {
            int i14 = setcompounddrawabletintblendmode.setDividerPadding;
            if (i14 >= i11) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i14] = (char) jArr[i14];
            Object[] objArr8 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
            Map map2 = setTextScaleX.setMaxEms;
            Object method4 = map2.get(1606688712);
            if (method4 == null) {
                Class cls5 = (Class) setTextScaleX.setX((char) ((-1) - Process.getGidForName("")), 27 - TextUtils.getTrimmedLength(""), (SystemClock.elapsedRealtime() > j10 ? 1 : (SystemClock.elapsedRealtime() == j10 ? 0 : -1)) + 2310);
                byte b16 = (byte) 0;
                byte b17 = b16;
                Object[] objArr9 = new Object[1];
                b(b16, b17, (byte) (b17 + 5), objArr9);
                method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                map2.put(1606688712, method4);
            }
            ((Method) method4).invoke(null, objArr8);
            j10 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 67
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r7 = r7 * 3
            int r7 = 3 - r7
            byte[] r0 = new byte[r8]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.aok.v0
            if (r2 != 0) goto L19
            r9 = r8
            r4 = r1
            r3 = r2
            r8 = r7
            r2 = r0
            r0 = r10
            r10 = r9
            goto L34
        L19:
            r3 = r1
        L1a:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r0[r3] = r5
            if (r4 != r8) goto L2b
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r1)
            r10[r1] = r7
            return
        L2b:
            r3 = r2[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r6
        L34:
            int r9 = r9 + r7
            r7 = r8
            r8 = r10
            r10 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aok.b(byte, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        v0 = new byte[]{85, -69, 57, -93};
    }

    public static ady d(X509Certificate x509Certificate) throws CertificateEncodingException {
        try {
            adq adqVar = new adq(x509Certificate.getEncoded());
            ady adyVar = (ady) adq.setOnFocusChangeListener(new Object[]{adqVar}, -1818946624, 1818946633, System.identityHashCode(adqVar));
            int i10 = f53430u0 + 99;
            f53429t0 = i10 % 128;
            int i11 = i10 % 2;
            return adyVar;
        } catch (Exception e5) {
            StringBuilder sb2 = new StringBuilder("Exception while encoding certificate: ");
            sb2.append(e5.toString());
            throw new CertificateEncodingException(sb2.toString());
        }
    }

    public static List e(List list) {
        if (list.size() < 2) {
            int i10 = f53429t0 + 87;
            f53430u0 = i10 % 128;
            if (i10 % 2 != 0) {
                return list;
            }
            throw null;
        }
        X500Principal issuerX500Principal = ((X509Certificate) list.get(0)).getIssuerX500Principal();
        for (int i11 = 1; i11 != list.size(); i11++) {
            if (!issuerX500Principal.equals(((X509Certificate) list.get(i11)).getSubjectX500Principal())) {
                int i12 = f53429t0 + 69;
                f53430u0 = i12 % 128;
                int i13 = i12 % 2;
                ArrayList arrayList = new ArrayList(list.size());
                ArrayList arrayList2 = new ArrayList(list);
                int i14 = f53430u0 + 99;
                f53429t0 = i14 % 128;
                int i15 = i14 % 2;
                for (int i16 = 0; i16 < list.size(); i16++) {
                    int i17 = f53429t0 + 101;
                    f53430u0 = i17 % 128;
                    int i18 = i17 % 2;
                    X509Certificate x509Certificate = (X509Certificate) list.get(i16);
                    X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
                    int i19 = 0;
                    while (true) {
                        if (i19 == list.size()) {
                            int i20 = f53430u0 + 109;
                            f53429t0 = i20 % 128;
                            int i21 = i20 % 2;
                            arrayList.add(x509Certificate);
                            list.remove(i16);
                            break;
                        }
                        if (((X509Certificate) list.get(i19)).getIssuerX500Principal().equals(subjectX500Principal)) {
                            break;
                        }
                        i19++;
                    }
                }
                if (arrayList.size() > 1) {
                    return arrayList2;
                }
                for (int i22 = 0; i22 != arrayList.size(); i22++) {
                    X500Principal issuerX500Principal2 = ((X509Certificate) arrayList.get(i22)).getIssuerX500Principal();
                    for (int i23 = 0; i23 < list.size(); i23++) {
                        X509Certificate x509Certificate2 = (X509Certificate) list.get(i23);
                        if (issuerX500Principal2.equals(x509Certificate2.getSubjectX500Principal())) {
                            arrayList.add(x509Certificate2);
                            list.remove(i23);
                            break;
                        }
                    }
                }
                return list.size() > 0 ? arrayList2 : arrayList;
            }
            int i24 = f53430u0 + 15;
            f53429t0 = i24 % 128;
            if (i24 % 2 != 0) {
                ((X509Certificate) list.get(i11)).getIssuerX500Principal();
                throw null;
            }
            issuerX500Principal = ((X509Certificate) list.get(i11)).getIssuerX500Principal();
        }
        return list;
    }

    public static byte[] f(adw adwVar) throws CertificateEncodingException {
        int i10 = f53430u0 + 61;
        f53429t0 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                ady adyVarUiMessageCallbackKtWhenMappings = adwVar.UiMessageCallbackKtWhenMappings();
                throw null;
            }
            ady adyVarUiMessageCallbackKtWhenMappings2 = adwVar.UiMessageCallbackKtWhenMappings();
            byte[] bArr = (byte[]) adw.setOnLongClickListener(new Object[]{adyVarUiMessageCallbackKtWhenMappings2, ASN1Encoding.DER}, -2049344731, 2049344731, System.identityHashCode(adyVarUiMessageCallbackKtWhenMappings2));
            int i11 = f53430u0 + 19;
            f53429t0 = i11 % 128;
            int i12 = i11 % 2;
            return bArr;
        } catch (IOException e5) {
            throw new CertificateEncodingException("Exception thrown: ".concat(String.valueOf(e5)));
        }
    }

    public static void g() {
        f53428s0 = 5653888104194844063L;
        f53427r0 = new char[]{29512, 37072, 46173, 55746, 64803};
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        aok aokVar = (aok) objArr[0];
        Iterator encodings = aokVar.getEncodings();
        if (encodings.hasNext()) {
            int i13 = f53430u0 + 21;
            f53429t0 = i13 % 128;
            int i14 = i13 % 2;
            Object next = encodings.next();
            if (!(!(next instanceof String))) {
                int i15 = f53430u0 + 33;
                f53429t0 = i15 % 128;
                int i16 = i15 % 2;
                return aokVar.getEncoded((String) next);
            }
        }
        int i17 = f53429t0 + 83;
        f53430u0 = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 13 / 0;
        }
        return null;
    }

    @Override // java.security.cert.CertPath
    public final List getCertificates() {
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(this.f53431p0));
        int i10 = f53430u0 + 3;
        f53429t0 = i10 % 128;
        int i11 = i10 % 2;
        return listUnmodifiableList;
    }

    @Override // java.security.cert.CertPath
    public final byte[] getEncoded(String str) throws Throwable {
        boolean zEqualsIgnoreCase = str.equalsIgnoreCase("PkiPath");
        List list = this.f53431p0;
        if (zEqualsIgnoreCase) {
            adh adhVar = new adh();
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                int i10 = f53430u0 + 91;
                f53429t0 = i10 % 128;
                if (i10 % 2 != 0) {
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, d((X509Certificate) listIterator.previous())}, 240298319, -240298315, System.identityHashCode(adhVar));
                    throw null;
                }
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, d((X509Certificate) listIterator.previous())}, 240298319, -240298315, System.identityHashCode(adhVar));
            }
            byte[] bArrF = f(new afv(adhVar));
            int i11 = f53430u0 + 49;
            f53429t0 = i11 % 128;
            int i12 = i11 % 2;
            return bArrF;
        }
        Object[] objArr = new Object[1];
        a((char) (46340 - Color.green(0)), ExpandableListView.getPackedPositionType(0L), 5 - Gravity.getAbsoluteGravity(0, 0), objArr);
        if (str.equalsIgnoreCase(((String) objArr[0]).intern())) {
            ahq ahqVar = new ahq(ahv.setZ, null);
            adh adhVar2 = new adh();
            for (int i13 = 0; i13 != list.size(); i13++) {
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar2, d((X509Certificate) list.get(i13))}, 240298319, -240298315, System.identityHashCode(adhVar2));
            }
            return f(new ahq(ahv.setAlwaysDrawnWithCacheEnabled, new ahz(new adp(1L), new afz(), ahqVar, new afz(adhVar2), new afz())));
        }
        if (!str.equalsIgnoreCase("PEM")) {
            throw new CertificateEncodingException("unsupported encoding: ".concat(str));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bfg bfgVar = new bfg(new OutputStreamWriter(byteArrayOutputStream));
        int i14 = f53429t0 + 77;
        f53430u0 = i14 % 128;
        int i15 = i14 % 2;
        for (int i16 = 0; i16 != list.size(); i16++) {
            try {
                bfg.setDividerPadding(new Object[]{bfgVar, new bfj("CERTIFICATE", ((X509Certificate) list.get(i16)).getEncoded())}, 1704319995, -1704319994, System.identityHashCode(bfgVar));
            } catch (Exception unused) {
                throw new CertificateEncodingException("can't encode certificate for PEM encoded path");
            }
        }
        bfgVar.close();
        int i17 = f53430u0 + 95;
        f53429t0 = i17 % 128;
        int i18 = i17 % 2;
        return byteArrayOutputStream.toByteArray();
    }

    @Override // java.security.cert.CertPath
    public final Iterator getEncodings() {
        int i10 = f53429t0 + 73;
        f53430u0 = i10 % 128;
        int i11 = i10 % 2;
        Iterator it = f53426q0.iterator();
        int i12 = f53430u0 + 91;
        f53429t0 = i12 % 128;
        int i13 = i12 % 2;
        return it;
    }

    public aok(List list) {
        super(ConstantKt.CERTIFICATE_TYPE_X509);
        new aow();
        this.f53431p0 = e(new ArrayList(list));
    }

    @Override // java.security.cert.CertPath
    public final byte[] getEncoded() throws CertificateEncodingException {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, -946036861, 946036861, System.identityHashCode(this));
    }
}
