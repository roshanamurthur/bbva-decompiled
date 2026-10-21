package com.mypinpad.tsdk.isolation;

import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import java.io.IOException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes10.dex */
public final class apc extends Provider {
    public static final String[] E0;
    public static final String[] F0;
    public static final String[] G0;
    public static int H0 = 0;
    public static int I0 = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final Logger f53445q0 = Logger.getLogger(apc.class.getName());

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f53446r0 = "BouncyCastle Security Provider v1.75";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final HashMap f53447s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final Class f53448t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final String[] f53449u0;
    public static final String[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final akl[] f53450w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final String[] f53451x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final String[] f53452y0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ConcurrentHashMap f53453p0;

    public class a implements PrivilegedAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ apc f53454a;

        @Override // java.security.PrivilegedAction
        public final Object run() throws IOException {
            System.identityHashCode(this);
            a aVar = (a) new Object[]{this}[0];
            System.identityHashCode(aVar);
            int iIdentityHashCode = System.identityHashCode(aVar);
            int i10 = 1957071350 & iIdentityHashCode;
            int i11 = (~i10) & (1957071350 | iIdentityHashCode);
            int i12 = (i11 & i10) | (i11 ^ i10);
            int i13 = ~i12;
            int i14 = (i12 | i13) & i13;
            int i15 = (-1442671185) & i14;
            int i16 = (i14 | (-1442671185)) & (~i15);
            int i17 = -(~(((i16 & i15) | (i16 ^ i15)) * (-220)));
            int i18 = ((-145781350) & i17) + (i17 | (-145781350));
            int i19 = (iIdentityHashCode ^ 1957071350) | i10;
            int i20 = ~i19;
            int i21 = (i19 | i20) & i20;
            int i22 = (-1979706359) & i21;
            int i23 = (((i18 ^ (-1)) + (i18 << 1)) - (~((((i21 | (-1979706359)) & (~i22)) | i22) * 220))) - 1;
            int i24 = i23 & 1434177876;
            int i25 = (i24 - (~(-(-((1434177876 ^ i23) | i24))))) - 1;
            apc apcVar = aVar.f53454a;
            Object[] objArr = new Object[1];
            if (-1411941065 <= i25) {
                objArr[0] = apcVar;
                apc.setOnFocusChangeListener(objArr, -331955763, 331955765, (int) System.currentTimeMillis());
                return null;
            }
            objArr[0] = apcVar;
            apc.setOnFocusChangeListener(objArr, -331955763, 331955765, (int) System.currentTimeMillis());
            int i26 = 39 / 0;
            return null;
        }
    }

    public static class b implements akl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53455a;

        public b(String str) {
            this.f53455a = str;
        }

        @Override // com.mypinpad.tsdk.isolation.akl
        public final String setCompoundDrawableTintBlendMode() {
            Object[] objArr = {this};
            System.identityHashCode(this);
            return ((b) objArr[0]).f53455a;
        }
    }

    static {
        new n1();
        f53447s0 = new HashMap();
        f53448t0 = (Class) aor.setOnFocusChangeListener(new Object[]{apc.class, "java.security.cert.PKIXRevocationChecker"}, 1745662709, -1745662709, (int) System.currentTimeMillis());
        f53449u0 = new String[]{"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};
        v0 = new String[]{"SipHash", "SipHash128", "Poly1305"};
        f53450w0 = new akl[]{(akl) setOnFocusChangeListener(new Object[]{"AES", 256}, 770788748, -770788742, 256), (akl) setOnFocusChangeListener(new Object[]{"ARC4", 20}, 770788748, -770788742, 20), (akl) setOnFocusChangeListener(new Object[]{"ARIA", 256}, 770788748, -770788742, 256), (akl) setOnFocusChangeListener(new Object[]{"Blowfish", 128}, 770788748, -770788742, 128), (akl) setOnFocusChangeListener(new Object[]{"Camellia", 256}, 770788748, -770788742, 256), (akl) setOnFocusChangeListener(new Object[]{"CAST5", 128}, 770788748, -770788742, 128), (akl) setOnFocusChangeListener(new Object[]{"CAST6", 256}, 770788748, -770788742, 256), (akl) setOnFocusChangeListener(new Object[]{"ChaCha", 128}, 770788748, -770788742, 128), (akl) setOnFocusChangeListener(new Object[]{"DES", 56}, 770788748, -770788742, 56), (akl) setOnFocusChangeListener(new Object[]{"DESede", 112}, 770788748, -770788742, 112), (akl) setOnFocusChangeListener(new Object[]{"GOST28147", 128}, 770788748, -770788742, 128), (akl) setOnFocusChangeListener(new Object[]{"Grainv1", 128}, 770788748, -770788742, 128), (akl) setOnFocusChangeListener(new Object[]{"Grain128", 128}, 770788748, -770788742, 128), (akl) setOnFocusChangeListener(new Object[]{"HC128", 128}, 770788748, -770788742, 128), (akl) setOnFocusChangeListener(new Object[]{"HC256", 256}, 770788748, -770788742, 256), (akl) setOnFocusChangeListener(new Object[]{"IDEA", 128}, 770788748, -770788742, 128), (akl) setOnFocusChangeListener(new Object[]{"Noekeon", 128}, 770788748, -770788742, 128), (akl) setOnFocusChangeListener(new Object[]{"RC2", 128}, 770788748, -770788742, 128), (akl) setOnFocusChangeListener(new Object[]{"RC5", 128}, 770788748, -770788742, 128), (akl) setOnFocusChangeListener(new Object[]{"RC6", 256}, 770788748, -770788742, 256), (akl) setOnFocusChangeListener(new Object[]{"Rijndael", 256}, 770788748, -770788742, 256), (akl) setOnFocusChangeListener(new Object[]{"Salsa20", 128}, 770788748, -770788742, 128), (akl) setOnFocusChangeListener(new Object[]{"SEED", 128}, 770788748, -770788742, 128), (akl) setOnFocusChangeListener(new Object[]{"Serpent", 256}, 770788748, -770788742, 256), (akl) setOnFocusChangeListener(new Object[]{"Shacal2", 128}, 770788748, -770788742, 128), (akl) setOnFocusChangeListener(new Object[]{"Skipjack", 80}, 770788748, -770788742, 80), (akl) setOnFocusChangeListener(new Object[]{"SM4", 128}, 770788748, -770788742, 128), (akl) setOnFocusChangeListener(new Object[]{"TEA", 128}, 770788748, -770788742, 128), (akl) setOnFocusChangeListener(new Object[]{"Twofish", 256}, 770788748, -770788742, 256), (akl) setOnFocusChangeListener(new Object[]{"Threefish", 128}, 770788748, -770788742, 128), (akl) setOnFocusChangeListener(new Object[]{"VMPC", 128}, 770788748, -770788742, 128), (akl) setOnFocusChangeListener(new Object[]{"VMPCKSA3", 128}, 770788748, -770788742, 128), (akl) setOnFocusChangeListener(new Object[]{"XTEA", 128}, 770788748, -770788742, 128), (akl) setOnFocusChangeListener(new Object[]{"XSalsa20", 128}, 770788748, -770788742, 128), (akl) setOnFocusChangeListener(new Object[]{"OpenSSLPBKDF", 128}, 770788748, -770788742, 128), (akl) setOnFocusChangeListener(new Object[]{"DSTU7624", 256}, 770788748, -770788742, 256), (akl) setOnFocusChangeListener(new Object[]{"GOST3412_2015", 256}, 770788748, -770788742, 256), (akl) setOnFocusChangeListener(new Object[]{"Zuc", 128}, 770788748, -770788742, 128)};
        f53451x0 = new String[]{"X509", "IES", "COMPOSITE", "EXTERNAL"};
        f53452y0 = new String[]{"DSA", "DH", LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC, "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC", "LMS", "SPHINCSPlus", "Dilithium", "Falcon", "NTRU"};
        E0 = new String[]{"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka", "Blake3"};
        F0 = new String[]{BouncyCastleProvider.PROVIDER_NAME, "BCFKS", "PKCS12"};
        G0 = new String[]{"DRBG"};
        int i10 = H0;
        int i11 = (-2) - (((i10 ^ 12) + ((i10 & 12) << 1)) ^ (-1));
        I0 = i11 % 128;
        int i12 = i11 % 2;
    }

    public apc() {
        super(BouncyCastleProvider.PROVIDER_NAME, 1.75d, f53446r0);
        this.f53453p0 = new ConcurrentHashMap();
        a aVar = new a();
        aVar.f53454a = this;
        AccessController.doPrivileged(aVar);
    }

    public static /* synthetic */ void a(Object[] objArr) {
        adu aduVar = (adu) objArr[0];
        aox aoxVar = (aox) objArr[1];
        HashMap map = f53447s0;
        synchronized (map) {
            map.put(aduVar, aoxVar);
        }
    }

    public static /* synthetic */ Provider.Service b(Object[] objArr) {
        Provider.Service service;
        apc apcVar = (apc) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) bez.setX(new Object[]{str2}, -925397906, 925397910, (int) System.currentTimeMillis());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(Constant.DOT_STRING);
        sb2.append(str3);
        String string = sb2.toString();
        Provider.Service service2 = (Provider.Service) apcVar.f53453p0.get(string);
        if (service2 == null) {
            synchronized (apcVar) {
                try {
                    if (apcVar.f53453p0.containsKey(string)) {
                        service = (Provider.Service) apcVar.f53453p0.get(string);
                    } else {
                        service = super.getService(str, str2);
                        if (service == null) {
                            return null;
                        }
                        apcVar.f53453p0.put(string, service);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(service.getType());
                        sb3.append(Constant.DOT_STRING);
                        sb3.append(service.getAlgorithm());
                        apcVar.remove(sb3.toString());
                        apcVar.putService(service);
                    }
                    service2 = service;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return service2;
    }

    public static /* synthetic */ void c(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        sb2.append("$Mappings");
        Class cls = (Class) aor.setOnFocusChangeListener(new Object[]{apc.class, sb2.toString()}, 1745662709, -1745662709, (int) System.currentTimeMillis());
        if (cls == null) {
            int i10 = H0;
            int i11 = ((i10 | 3) << 1) - (i10 ^ 3);
            I0 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i12 = H0;
        int i13 = ((i12 ^ 58) + ((i12 & 58) << 1)) - 1;
        I0 = i13 % 128;
        int i14 = i13 % 2;
        try {
            int i15 = H0;
            int i16 = ((((i15 ^ 101) | (i15 & 101)) << 1) - (~(-(((~i15) & 101) | (i15 & (-102)))))) - 1;
            I0 = i16 % 128;
            int i17 = i16 % 2;
        } catch (Exception e5) {
            StringBuilder sb3 = new StringBuilder("cannot create instance of ");
            sb3.append(str);
            sb3.append(str2);
            sb3.append("$Mappings : ");
            sb3.append(e5);
            throw new InternalError(sb3.toString());
        }
    }

    public static /* synthetic */ void d(Object[] objArr) throws IOException {
        int i10;
        String str = (String) objArr[1];
        akl[] aklVarArr = (akl[]) objArr[2];
        int i11 = H0;
        int i12 = i11 & 107;
        int i13 = i12 + ((i11 ^ 107) | i12);
        I0 = i13 % 128;
        int i14 = i13 % 2;
        int i15 = i11 & 119;
        int i16 = (i11 ^ 119) | i15;
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        I0 = i17 % 128;
        int i18 = i17 % 2;
        int i19 = 0;
        while (i19 != aklVarArr.length) {
            int i20 = H0;
            int i21 = ((i20 & 88) + (i20 | 88)) - 1;
            I0 = i21 % 128;
            int i22 = i21 % 2;
            akl aklVar = aklVarArr[i19];
            try {
                aku.setCompoundDrawableTintBlendMode(new Object[0], -825950727, 825950727, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{str, aklVar.setCompoundDrawableTintBlendMode()}, 1503799490, -1503799483, (int) System.currentTimeMillis());
                int i23 = I0;
                i10 = ((i23 & (-42)) | ((~i23) & 41)) + ((i23 & 41) << 1);
            } catch (ako unused) {
                Level level = Level.FINE;
                Logger logger = f53445q0;
                if (logger.isLoggable(level)) {
                    StringBuilder sb2 = new StringBuilder("service for ");
                    sb2.append(aklVar.setCompoundDrawableTintBlendMode());
                    sb2.append(" ignored due to constraints");
                    logger.fine(sb2.toString());
                    int i24 = I0;
                    i10 = ((i24 | 121) << 1) - (i24 ^ 121);
                }
                int i25 = i19 & 1;
                int i26 = (i19 ^ 1) | i25;
                i19 = ((i25 | i26) << 1) - (i26 ^ i25);
                int i27 = H0;
                int i28 = ((i27 & (-54)) | ((~i27) & 53)) + ((i27 & 53) << 1);
                I0 = i28 % 128;
                int i29 = i28 % 2;
            }
            H0 = i10 % 128;
            int i30 = i10 % 2;
            int i210 = i19 & 1;
            int i211 = (i19 ^ 1) | i210;
            i19 = ((i210 | i211) << 1) - (i211 ^ i210);
            int i212 = H0;
            int i213 = ((i212 & (-54)) | ((~i212) & 53)) + ((i212 & 53) << 1);
            I0 = i213 % 128;
            int i214 = i213 % 2;
        }
        int i31 = I0;
        int i32 = (i31 ^ 7) + ((i31 & 7) << 1);
        H0 = i32 % 128;
        int i33 = i32 % 2;
    }

    public static /* synthetic */ void setCompoundDrawableTintBlendMode() throws IOException {
        setOnFocusChangeListener(new Object[]{ahb.setSmoothScrollbarEnabled, new bdf()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.setAdapter, new bdf()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.setCacheColorHint, new bdf()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.setFilterTouchesWhenObscured, new bdf()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.setSelectedChildViewEnabled, new bdf()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.getError, new bdf()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.getPreferredLanguage, new bdf()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.setImageTintMode, new bdf()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.setRendererPriorityPolicy, new bdf()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.setSaveEnabled, new bdf()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.TsdkManualInitializerinit1, new bdf()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.getType, new bdf()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.setError, new bdf()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.setTitleMarginEnd, new bdf()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.UiMessageCallbackKt, new bdf()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.setHint, new bdf()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.setTooltipText, new bdf()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.setWebChromeClient, new bdf()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.setImageState, new bdf()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{avq.setX, new bdc()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{avq.setDividerPadding, new bcp()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{avq.setLayoutAnimation, new bdj()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahl.setCompoundDrawableTintBlendMode, new bdj()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{avq.setNavigationOnClickListener, new bdk()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahl.setOnFocusChangeListener, new bdk()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahv.setMinHeight, new bcq()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.f52655d1, new bcx()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.setPadding, new bci()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.setActivated, new bci()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.getReason, new bcg()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.setNextClusterForwardId, new bcg()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.getPinGridButtonBgColor, new bcg()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.setAccessibilityLiveRegion, new bcg()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.getDesignatorAfterValue, new bcg()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.setOnScrollChangeListener, new bcg()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.TransactionApproved, new bcj()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.setChoiceMode, new bcj()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.setStackTrace, new bcj()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.getGeneralBgColor, new bcj()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.TransactionNotAuthorised, new bcj()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.setLineSpacing, new bcj()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.setPersistentDrawingCache, new bcv()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.setAlpha, new bcv()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.SessionActivationFailure, new bcv()}, 443579943, -443579939, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{ahb.setImportantForContentCapture, new bcv()}, 443579943, -443579939, (int) System.currentTimeMillis());
        int i10 = H0;
        int i11 = i10 & 65;
        int i12 = ((i10 | 65) & (~i11)) + (i11 << 1);
        I0 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws IOException {
        aox aoxVar;
        int i13 = (i11 * (-667)) + (i10 * (-1335));
        int i14 = ~i11;
        int i15 = i10 | i12;
        switch (((i14 | i15) * 668) + ((i10 | (~(i12 | i14))) * 1336) + (((~i15) | i14) * (-668)) + i13) {
            case 1:
                setCompoundDrawableTintBlendMode();
                return null;
            case 2:
                apc apcVar = (apc) objArr[0];
                int i16 = I0;
                int i17 = i16 & 59;
                int i18 = -(-(i16 | 59));
                int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                H0 = i19 % 128;
                int i20 = i19 % 2;
                setOnFocusChangeListener(new Object[]{apcVar}, -437911234, 437911234, System.identityHashCode(apcVar));
                System.currentTimeMillis();
                System.currentTimeMillis();
                return null;
            case 3:
                return b(objArr);
            case 4:
                a(objArr);
                return null;
            case 5:
                d(objArr);
                return null;
            case 6:
                String str = (String) objArr[0];
                ((Number) objArr[1]).intValue();
                b bVar = new b(str);
                int i21 = I0;
                int i22 = i21 & 29;
                int i23 = (i21 ^ 29) | i22;
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                H0 = i24 % 128;
                int i25 = i24 % 2;
                return bVar;
            case 7:
                c(objArr);
                return null;
            case 8:
                ajj ajjVar = (ajj) objArr[0];
                int i26 = H0 + 91;
                I0 = i26 % 128;
                if (i26 % 2 == 0) {
                    aiw aiwVar = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar}, 912478577, -912478575, System.identityHashCode(ajjVar));
                    adu aduVar = (adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -661220858, 661220861, System.identityHashCode(aiwVar));
                    ((Boolean) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar, ahb.f52655d1}, 304857301, -304857297, System.identityHashCode(aduVar))).booleanValue();
                    throw null;
                }
                aiw aiwVar2 = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar}, 912478577, -912478575, System.identityHashCode(ajjVar));
                adu aduVar2 = (adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar2}, -661220858, 661220861, System.identityHashCode(aiwVar2));
                if (((Boolean) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar2, ahb.f52655d1}, 304857301, -304857297, System.identityHashCode(aduVar2))).booleanValue()) {
                    bcx bcxVar = new bcx();
                    PublicKey publicKey = (PublicKey) bcx.setOnFocusChangeListener(new Object[]{bcxVar, ajjVar}, 2100229097, -2100229096, System.identityHashCode(bcxVar));
                    int i27 = H0;
                    int i28 = (i27 & (-12)) | ((~i27) & 11);
                    int i29 = -(-((i27 & 11) << 1));
                    int i30 = (i28 & i29) + (i29 | i28);
                    I0 = i30 % 128;
                    if (i30 % 2 != 0) {
                        return publicKey;
                    }
                    int i31 = 93 / 0;
                    return publicKey;
                }
                aiw aiwVar3 = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar}, 912478577, -912478575, System.identityHashCode(ajjVar));
                aox aoxVar2 = (aox) setOnFocusChangeListener(new Object[]{(adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar3}, -661220858, 661220861, System.identityHashCode(aiwVar3))}, -854509411, 854509421, (int) System.currentTimeMillis());
                if (aoxVar2 != null) {
                    PublicKey x4 = aoxVar2.setX(ajjVar);
                    int i32 = I0;
                    int i33 = i32 & 61;
                    int i34 = (i32 | 61) & (~i33);
                    int i35 = -(-(i33 << 1));
                    int i36 = (i34 & i35) + (i34 | i35);
                    H0 = i36 % 128;
                    int i37 = i36 % 2;
                    return x4;
                }
                int i38 = I0;
                int i39 = i38 & 77;
                int i40 = -(-((i38 ^ 77) | i39));
                int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                int i42 = i41 % 128;
                H0 = i42;
                int i43 = i41 % 2;
                int i44 = i42 + 125;
                I0 = i44 % 128;
                if (i44 % 2 != 0) {
                    return null;
                }
                throw null;
            case 9:
                String str2 = (String) objArr[1];
                String[] strArr = (String[]) objArr[2];
                int i45 = H0;
                int i46 = ((i45 | 71) << 1) - (i45 ^ 71);
                int i47 = i46 % 128;
                I0 = i47;
                int i48 = i46 % 2;
                int i49 = i47 & 27;
                int i50 = (((i47 | 27) & (~i49)) - (~(-(-(i49 << 1))))) - 1;
                H0 = i50 % 128;
                int i51 = i50 % 2;
                int i52 = 0;
                while (i52 != strArr.length) {
                    int i53 = H0 + 44;
                    int i54 = (i53 ^ (-1)) + (i53 << 1);
                    I0 = i54 % 128;
                    int i55 = i54 % 2;
                    setOnFocusChangeListener(new Object[]{str2, strArr[i52]}, 1503799490, -1503799483, (int) System.currentTimeMillis());
                    int i56 = (i52 | 1) << 1;
                    int i57 = -(((~i52) & 1) | (i52 & (-2)));
                    i52 = ((i57 & i56) << 1) + (i56 ^ i57);
                    int i58 = I0;
                    int i59 = ((i58 ^ 69) | (i58 & 69)) << 1;
                    int i60 = -(((~i58) & 69) | (i58 & (-70)));
                    int i61 = ((i59 | i60) << 1) - (i60 ^ i59);
                    H0 = i61 % 128;
                    int i62 = i61 % 2;
                }
                int i63 = H0;
                int i64 = i63 & 67;
                int i65 = i64 + ((i63 ^ 67) | i64);
                I0 = i65 % 128;
                if (i65 % 2 != 0) {
                    return null;
                }
                throw null;
            case 10:
                adu aduVar3 = (adu) objArr[0];
                HashMap map = f53447s0;
                synchronized (map) {
                    aoxVar = (aox) map.get(aduVar3);
                    break;
                }
                return aoxVar;
            default:
                apc apcVar2 = (apc) objArr[0];
                int i66 = H0 + 107;
                I0 = i66 % 128;
                int i67 = i66 % 2;
                setOnFocusChangeListener(new Object[]{apcVar2, "org.bouncycastle.jcajce.provider.digest.", E0}, 970498672, -970498663, System.identityHashCode(apcVar2));
                setOnFocusChangeListener(new Object[]{apcVar2, "org.bouncycastle.jcajce.provider.symmetric.", f53449u0}, 970498672, -970498663, System.identityHashCode(apcVar2));
                setOnFocusChangeListener(new Object[]{apcVar2, "org.bouncycastle.jcajce.provider.symmetric.", v0}, 970498672, -970498663, System.identityHashCode(apcVar2));
                setOnFocusChangeListener(new Object[]{apcVar2, "org.bouncycastle.jcajce.provider.symmetric.", f53450w0}, 1865372046, -1865372041, System.identityHashCode(apcVar2));
                setOnFocusChangeListener(new Object[]{apcVar2, "org.bouncycastle.jcajce.provider.asymmetric.", f53451x0}, 970498672, -970498663, System.identityHashCode(apcVar2));
                setOnFocusChangeListener(new Object[]{apcVar2, "org.bouncycastle.jcajce.provider.asymmetric.", f53452y0}, 970498672, -970498663, System.identityHashCode(apcVar2));
                setOnFocusChangeListener(new Object[]{apcVar2, "org.bouncycastle.jcajce.provider.keystore.", F0}, 970498672, -970498663, System.identityHashCode(apcVar2));
                setOnFocusChangeListener(new Object[]{apcVar2, "org.bouncycastle.jcajce.provider.drbg.", G0}, 970498672, -970498663, System.identityHashCode(apcVar2));
                setOnFocusChangeListener(new Object[0], 127842030, -127842029, (int) System.currentTimeMillis());
                apcVar2.put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
                apcVar2.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
                apcVar2.put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
                apcVar2.put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
                apcVar2.put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
                apcVar2.put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
                apcVar2.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
                apcVar2.put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
                apcVar2.put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
                apcVar2.put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
                apcVar2.put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
                apcVar2.put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
                apcVar2.put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
                apcVar2.put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
                apcVar2.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
                if (f53448t0 != null) {
                    int i68 = I0;
                    int i69 = i68 & 7;
                    int i70 = -(-((i68 ^ 7) | i69));
                    int i71 = (i69 ^ i70) + ((i70 & i69) << 1);
                    H0 = i71 % 128;
                    int i72 = i71 % 2;
                    apcVar2.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
                    apcVar2.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
                    apcVar2.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
                    apcVar2.put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8");
                    apcVar2.put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
                    apcVar2.put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8");
                    int i73 = H0 + 13;
                    I0 = i73 % 128;
                    int i74 = i73 % 2;
                } else {
                    apcVar2.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
                    apcVar2.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
                    apcVar2.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
                    apcVar2.put("CertPathBuilder.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
                    apcVar2.put("CertPathValidator.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
                    apcVar2.put("CertPathBuilder.PKIX", "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
                    int i75 = H0;
                    int i76 = ((i75 ^ 95) | (i75 & 95)) << 1;
                    int i77 = -(((~i75) & 95) | (i75 & (-96)));
                    int i78 = (i76 ^ i77) + ((i77 & i76) << 1);
                    I0 = i78 % 128;
                    int i79 = i78 % 2;
                }
                apcVar2.put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
                apcVar2.put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
                apcVar2.put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
                apcVar2.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
                apcVar2.getService("SecureRandom", "DEFAULT");
                int i80 = I0;
                int i81 = i80 & 17;
                int i82 = ((((i80 ^ 17) | i81) << 1) - (~(-((i80 | 17) & (~i81))))) - 1;
                H0 = i82 % 128;
                if (i82 % 2 == 0) {
                    return null;
                }
                int i83 = 54 / 0;
                return null;
        }
    }

    @Override // java.security.Provider
    public final Provider.Service getService(String str, String str2) {
        return (Provider.Service) setOnFocusChangeListener(new Object[]{this, str, str2}, -452827653, 452827656, System.identityHashCode(this));
    }

    public static PublicKey setCompoundDrawableTintBlendMode(ajj ajjVar) throws IOException {
        return (PublicKey) setOnFocusChangeListener(new Object[]{ajjVar}, -334014382, 334014390, (int) System.currentTimeMillis());
    }
}
