package com.mypinpad.tsdk.isolation;

import com.vierge.bluetoothlibrary.BluetoothState;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import org.bouncycastle.crypto.CryptoServicesPermission;

/* JADX INFO: loaded from: classes10.dex */
public final class aku {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<Map<String, Object[]>> f53017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<String, Object[]> f53018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f53019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f53020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReference<ala> f53021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicReference<akm> f53022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53023g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53024h = 1;

    public static class a implements akm {
    }

    public static class b implements ala {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f53025b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f53026c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ThreadLocal<SecureRandom> f53027a = new ThreadLocal<>();

        /* JADX WARN: Code duplicated, block: B:9:0x0033  */
        @Override // com.mypinpad.tsdk.isolation.ala
        public final SecureRandom setDividerPadding() {
            System.identityHashCode(this);
            b bVar = (b) new Object[]{this}[0];
            int i10 = f53025b;
            int i11 = i10 & 113;
            int i12 = i10 | 113;
            int i13 = (i11 & i12) + (i12 | i11);
            f53026c = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 24 / 0;
                if (bVar.f53027a.get() == null) {
                    bVar.f53027a.set(new SecureRandom());
                    int i15 = f53026c;
                    int i16 = i15 & 115;
                    int i17 = (i15 ^ 115) | i16;
                    int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                    f53025b = i18 % 128;
                    int i19 = i18 % 2;
                }
            } else if (bVar.f53027a.get() == null) {
                bVar.f53027a.set(new SecureRandom());
                int i110 = f53026c;
                int i111 = i110 & 115;
                int i112 = (i110 ^ 115) | i111;
                int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
                f53025b = i113 % 128;
                int i114 = i113 % 2;
            }
            SecureRandom secureRandom = bVar.f53027a.get();
            int i20 = f53026c;
            int i21 = i20 & 59;
            int i22 = (i21 - (~((i20 ^ 59) | i21))) - 1;
            f53025b = i22 % 128;
            if (i22 % 2 == 0) {
                return secureRandom;
            }
            throw null;
        }
    }

    public static final class setOnFocusChangeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f53028c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f53029d = 1;
        public static final setOnFocusChangeListener setOnFocusChangeListener = new setOnFocusChangeListener("dhDefaultParams", ana.class);
        public static final setOnFocusChangeListener setY = new setOnFocusChangeListener("dsaDefaultParams", anh.class);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class f53031b;

        static {
            int i10 = ((1 & (-126)) | ((~1) & 125)) + ((1 & 125) << 1);
            f53028c = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        public setOnFocusChangeListener(String str, Class cls) {
            this.f53030a = str;
            this.f53031b = cls;
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ((i10 | i11) * (-470)) + (i11 * 471) + (i10 * 471);
            int i14 = ~i10;
            int i15 = ~i11;
            int i16 = (~(i14 | i15)) | (~(i15 | i12));
            int i17 = ~(i11 | (~i12) | i10);
            if ((((~(i10 | i15 | i12)) | i17) * 470) + ((i16 | i17) * (-470)) + i13 != 1) {
                setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
                int i18 = f53028c;
                int i19 = ((i18 | 69) << 1) - (i18 ^ 69);
                f53029d = i19 % 128;
                int i20 = i19 % 2;
                Class cls = setonfocuschangelistener.f53031b;
                int i21 = i18 & 43;
                int i22 = ((i18 | 43) & (~i21)) + (i21 << 1);
                f53029d = i22 % 128;
                int i23 = i22 % 2;
                return cls;
            }
            setOnFocusChangeListener setonfocuschangelistener2 = (setOnFocusChangeListener) objArr[0];
            int i24 = f53029d + 49;
            int i25 = i24 % 128;
            f53028c = i25;
            int i26 = i24 % 2;
            String str = setonfocuschangelistener2.f53030a;
            int i27 = i25 ^ 19;
            int i28 = ((i25 & 19) | i27) << 1;
            int i29 = -i27;
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            f53029d = i30 % 128;
            int i31 = i30 % 2;
            return str;
        }
    }

    static {
        Logger.getLogger(aku.class.getName());
        new aks(CryptoServicesPermission.GLOBAL_CONFIG);
        new aks(CryptoServicesPermission.THREAD_LOCAL_CONFIG);
        new aks(CryptoServicesPermission.DEFAULT_RANDOM);
        new aks("constraints");
        f53017a = new ThreadLocal<>();
        f53018b = Collections.synchronizedMap(new HashMap());
        f53019c = new b();
        f53020d = new a();
        f53021e = new AtomicReference<>();
        AtomicReference<akm> atomicReference = new AtomicReference<>();
        f53022f = atomicReference;
        anh anhVar = new anh(new BigInteger("fca682ce8e12caba26efccf7110e526db078b05edecbcd1eb4a208f3ae1617ae01f35b91a47e6df63413c5e12ed0899bcd132acd50d99151bdc43ee737592e17", 16), new BigInteger("962eddcc369cba8ebb260ee6b6a126d9346e38c5", 16), new BigInteger("678471b27a9cf44ee91a49c5147db1a9aaf244f05a434d6486931d2d14271b9e35030b71fd73da179069b32e2935630e1c2062354d0da20a6c416e50be794ca4", 16), new anf((byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"b869c82b35d70e1b1ff91b28e37a62ecdc34409b"}, -666540625, 666540626, (int) System.currentTimeMillis()), 123));
        anh anhVar2 = new anh(new BigInteger("e9e642599d355f37c97ffd3567120b8e25c9cd43e927b3a9670fbec5d890141922d2c3b3ad2480093799869d1e846aab49fab0ad26d2ce6a22219d470bce7d777d4a21fbe9c270b57f607002f3cef8393694cf45ee3688c11a8c56ab127a3daf", 16), new BigInteger("9cdbd84c9f1ac2f38d0f80f42ab952e7338bf511", 16), new BigInteger("30470ad5a005fb14ce2d9dcd87e38bc7d1b1c5facbaecbe95f190aa7a31d23c4dbbcbe06174544401a5b2c020965d8c2bd2171d3668445771f74ba084d2029d83c1c158547f3a9f1a2715be23d51ae4d3e5a1f6a7064f316933a346d3f529252", 16), new anf((byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"77d0f8c4dad15eb8c4f2f8d6726cefd96d5bb399"}, -666540625, 666540626, (int) System.currentTimeMillis()), 263));
        anh anhVar3 = new anh(new BigInteger("fd7f53811d75122952df4a9c2eece4e7f611b7523cef4400c31e3f80b6512669455d402251fb593d8d58fabfc5f5ba30f6cb9b556cd7813b801d346ff26660b76b9950a5a49f9fe8047b1022c24fbba9d7feb7c61bf83b57e7c6a8a6150f04fb83f6d3c51ec3023554135a169132f675f3ae2b61d72aeff22203199dd14801c7", 16), new BigInteger("9760508f15230bccb292b982a2eb840bf0581cf5", 16), new BigInteger("f7e1a085d69b3ddecbbcab5c36b857b97994afbbfa3aea82f9574c0b3d0782675159578ebad4594fe67107108180b449167123e84c281613b7cf09328cc8a6e13c167a8b547c8d28e0a3ae1e2bb3a675916ea37f0bfa213562f1fb627a01243bcca4f1bea8519089a883dfe15ae59f06928b665e807b552564014c3bfecf492a", 16), new anf((byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"8d5155894229d5e689ee01e6018a237e2cae64cd"}, -666540625, 666540626, (int) System.currentTimeMillis()), 92));
        anh anhVar4 = new anh(new BigInteger("95475cf5d93e596c3fcd1d902add02f427f5f3c7210313bb45fb4d5bb2e5fe1cbd678cd4bbdd84c9836be1f31c0777725aeb6c2fc38b85f48076fa76bcd8146cc89a6fb2f706dd719898c2083dc8d896f84062e2c9c94d137b054a8d8096adb8d51952398eeca852a0af12df83e475aa65d4ec0c38a9560d5661186ff98b9fc9eb60eee8b030376b236bc73be3acdbd74fd61c1d2475fa3077b8f080467881ff7e1ca56fee066d79506ade51edbb5443a563927dbc4ba520086746175c8885925ebc64c6147906773496990cb714ec667304e261faee33b3cbdf008e0c3fa90650d97d3909c9275bf4ac86ffcb3d03e6dfc8ada5934242dd6d3bcca2a406cb0b", 16), new BigInteger("f8183668ba5fc5bb06b5981e6d8b795d30b8978d43ca0ec572e37e09939a9773", 16), new BigInteger("42debb9da5b3d88cc956e08787ec3f3a09bba5f48b889a74aaf53174aa0fbe7e3c5b8fcd7a53bef563b0e98560328960a9517f4014d3325fc7962bf1e049370d76d1314a76137e792f3f0db859d095e4a5b932024f079ecf2ef09c797452b0770e1350782ed57ddf794979dcef23cb96f183061965c4ebc93c9c71c56b925955a75f94cccf1449ac43d586d0beee43251b0b2287349d68de0d144403f13e802f4146d882e057af19b6f6275c6676c8fa0e3ca2713a3257fd1b27d0639f695e347d8d1cf9ac819a26ca9b04cb0eb9b7b035988d15bbac65212a55239cfc7e58fae38d7250ab9991ffbc97134025fe8ce04c4399ad96569be91a546f4978693c7a", 16), new anf((byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"b0b4417601b59cbc9d8ac8f935cadaec4f5fbb2f23785609ae466748d9b5a536"}, -666540625, 666540626, (int) System.currentTimeMillis()), 497));
        setCompoundDrawableTintBlendMode(new Object[]{setOnFocusChangeListener.setY, new anh[]{anhVar, anhVar2, anhVar3, anhVar4}}, -1135434071, 1135434077, (int) System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new Object[]{setOnFocusChangeListener.setOnFocusChangeListener, new ana[]{(ana) setCompoundDrawableTintBlendMode(new Object[]{anhVar}, 112086283, -112086278, (int) System.currentTimeMillis()), (ana) setCompoundDrawableTintBlendMode(new Object[]{anhVar2}, 112086283, -112086278, (int) System.currentTimeMillis()), (ana) setCompoundDrawableTintBlendMode(new Object[]{anhVar3}, 112086283, -112086278, (int) System.currentTimeMillis()), (ana) setCompoundDrawableTintBlendMode(new Object[]{anhVar4}, 112086283, -112086278, (int) System.currentTimeMillis())}}, -1135434071, 1135434077, (int) System.currentTimeMillis());
        atomicReference.set((akm) setCompoundDrawableTintBlendMode(new Object[0], 734582496, -734582493, (int) System.currentTimeMillis()));
        atomicReference.get();
        int i10 = f53023g;
        int i11 = i10 & 35;
        int i12 = (i10 ^ 35) | i11;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f53024h = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0322  */
    /* JADX WARN: Code duplicated, block: B:48:0x035a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0364  */
    /* JADX WARN: Code duplicated, block: B:51:0x0367  */
    /* JADX WARN: Code duplicated, block: B:53:0x0376  */
    /* JADX WARN: Code duplicated, block: B:55:0x037a  */
    /* JADX WARN: Code duplicated, block: B:57:0x038b  */
    /* JADX WARN: Code duplicated, block: B:58:0x038e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0391  */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        SecureRandom dividerPadding;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = ~i10;
        int i20 = ~i11;
        switch ((((~(i10 | (~i12))) | i20) * 168) + (((~(i11 | i10)) | (~(i10 | i12))) * (-168)) + (((~(i19 | i20)) | (~(i20 | i12))) * 336) + (i11 * (-167)) + (i10 * (-167))) {
            case 1:
                int i21 = f53023g;
                int i22 = i21 | 111;
                int i23 = i22 << 1;
                int i24 = -((~(i21 & 111)) & i22);
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                f53024h = i25 % 128;
                int i26 = i25 % 2;
                AtomicReference<ala> atomicReference = f53021e;
                b bVar = f53019c;
                if (i26 != 0) {
                    while (!atomicReference.compareAndSet(null, bVar) && atomicReference.get() == null) {
                    }
                    dividerPadding = atomicReference.get().setDividerPadding();
                } else {
                    while (!atomicReference.compareAndSet(null, bVar) && atomicReference.get() == null) {
                    }
                    dividerPadding = atomicReference.get().setDividerPadding();
                    int i27 = 47 / 0;
                }
                break;
            case 2:
                dividerPadding = (SecureRandom) objArr[0];
                int i28 = f53023g;
                int i29 = (-2) - (((i28 ^ 38) + ((i28 & 38) << 1)) ^ (-1));
                f53024h = i29 % 128;
                if (i29 % 2 == 0) {
                    throw null;
                }
                if (dividerPadding != null) {
                    int i30 = i28 ^ 69;
                    int i31 = ((i28 & 69) | i30) << 1;
                    int i32 = -i30;
                    int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
                    f53024h = i33 % 128;
                    int i34 = i33 % 2;
                } else {
                    dividerPadding = (SecureRandom) setCompoundDrawableTintBlendMode(new Object[0], -496048399, 496048400, (int) System.currentTimeMillis());
                    int i35 = f53024h;
                    int i36 = (i35 & 23) + (i35 | 23);
                    f53023g = i36 % 128;
                    if (i36 % 2 != 0) {
                        throw null;
                    }
                }
                break;
                break;
            case 3:
                int i37 = f53023g;
                int i38 = ((i37 & 28) + (i37 | 28)) - 1;
                f53024h = i38 % 128;
                if (i38 % 2 == 0) {
                    throw null;
                }
                int i39 = (i37 | 85) << 1;
                int i40 = -(((~i37) & 85) | (i37 & (-86)));
                int i41 = (i39 & i40) + (i40 | i39);
                f53024h = i41 % 128;
                if (i41 % 2 == 0) {
                    int i42 = 92 / 0;
                }
                return f53020d;
            case 4:
                int iIntValue = ((Number) objArr[0]).intValue();
                int i43 = f53023g;
                int i44 = i43 + 121;
                f53024h = i44 % 128;
                if (i44 % 2 == 0) {
                    if (iIntValue > 4323) {
                        i14 = (i43 ^ 53) + ((i43 & 53) << 1);
                        i15 = i14 % 128;
                        f53024h = i15;
                        if (i14 % 2 == 0 ? iIntValue <= 2048 : iIntValue <= 13803) {
                            int i45 = i15 + 71;
                            int i46 = i45 % 128;
                            f53023g = i46;
                            int i47 = i45 % 2;
                            int i48 = i46 & 125;
                            int i49 = -(-((i46 ^ 125) | i48));
                            int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
                            f53024h = i50 % 128;
                            int i51 = i50 % 2;
                            i13 = 224;
                        } else if (iIntValue <= 3072) {
                            i17 = i15 + 87;
                            int i52 = i17 % 128;
                            f53023g = i52;
                            if (i17 % 2 != 0) {
                                i18 = 18808;
                            } else {
                                i18 = 256;
                            }
                            int i53 = (i52 & 97) + (i52 | 97);
                            f53024h = i53 % 128;
                            int i54 = i53 % 2;
                            i13 = i18;
                        } else if (iIntValue <= 7680) {
                            int i55 = i15 & 31;
                            i16 = (i55 - (~(-(-((i15 ^ 31) | i55))))) - 1;
                            f53023g = i16 % 128;
                            if (i16 % 2 != 0) {
                                i13 = 24064;
                            } else {
                                i13 = BluetoothState.REQUEST_CONNECT_DEVICE;
                            }
                        } else {
                            int i56 = i15 ^ 3;
                            int i57 = (((i15 & 3) | i56) << 1) - i56;
                            f53023g = i57 % 128;
                            int i58 = i57 % 2;
                            i13 = 512;
                        }
                    } else {
                        i13 = 11199;
                    }
                } else if (iIntValue > 1024) {
                    i14 = (i43 ^ 53) + ((i43 & 53) << 1);
                    i15 = i14 % 128;
                    f53024h = i15;
                    if (i14 % 2 == 0) {
                        if (iIntValue <= 3072) {
                            i17 = i15 + 87;
                            int i59 = i17 % 128;
                            f53023g = i59;
                            if (i17 % 2 != 0) {
                                i18 = 18808;
                            } else {
                                i18 = 256;
                            }
                            int i510 = (i59 & 97) + (i59 | 97);
                            f53024h = i510 % 128;
                            int i511 = i510 % 2;
                            i13 = i18;
                        } else if (iIntValue <= 7680) {
                            int i512 = i15 & 31;
                            i16 = (i512 - (~(-(-((i15 ^ 31) | i512))))) - 1;
                            f53023g = i16 % 128;
                            if (i16 % 2 != 0) {
                                i13 = 24064;
                            } else {
                                i13 = BluetoothState.REQUEST_CONNECT_DEVICE;
                            }
                        } else {
                            int i513 = i15 ^ 3;
                            int i514 = (((i15 & 3) | i513) << 1) - i513;
                            f53023g = i514 % 128;
                            int i515 = i514 % 2;
                            i13 = 512;
                        }
                    } else if (iIntValue <= 3072) {
                        i17 = i15 + 87;
                        int i516 = i17 % 128;
                        f53023g = i516;
                        if (i17 % 2 != 0) {
                            i18 = 18808;
                        } else {
                            i18 = 256;
                        }
                        int i517 = (i516 & 97) + (i516 | 97);
                        f53024h = i517 % 128;
                        int i518 = i517 % 2;
                        i13 = i18;
                    } else if (iIntValue <= 7680) {
                        int i519 = i15 & 31;
                        i16 = (i519 - (~(-(-((i15 ^ 31) | i519))))) - 1;
                        f53023g = i16 % 128;
                        if (i16 % 2 != 0) {
                            i13 = 24064;
                        } else {
                            i13 = BluetoothState.REQUEST_CONNECT_DEVICE;
                        }
                    } else {
                        int i5110 = i15 ^ 3;
                        int i5111 = (((i15 & 3) | i5110) << 1) - i5110;
                        f53023g = i5111 % 128;
                        int i5112 = i5111 % 2;
                        i13 = 512;
                    }
                } else {
                    i13 = 160;
                }
                int i60 = f53024h + 65;
                f53023g = i60 % 128;
                int i61 = i60 % 2;
                return Integer.valueOf(i13);
            case 5:
                anh anhVar = (anh) objArr[0];
                int iBitLength = ((BigInteger) anh.setOnFocusChangeListener(new Object[]{anhVar}, -1766607053, 1766607053, System.identityHashCode(anhVar))).bitLength();
                int iIntValue2 = ((Integer) setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(iBitLength)}, -2064871046, 2064871050, iBitLength)).intValue();
                BigInteger bigInteger = (BigInteger) anh.setOnFocusChangeListener(new Object[]{anhVar}, -1766607053, 1766607053, System.identityHashCode(anhVar));
                BigInteger bigInteger2 = (BigInteger) anh.setOnFocusChangeListener(new Object[]{anhVar}, -213177263, 213177265, System.identityHashCode(anhVar));
                BigInteger bigInteger3 = (BigInteger) anh.setOnFocusChangeListener(new Object[]{anhVar}, -11125249, 11125252, System.identityHashCode(anhVar));
                anf anfVar = (anf) anh.setOnFocusChangeListener(new Object[]{anhVar}, -291403566, 291403567, System.identityHashCode(anhVar));
                byte[] bArr = (byte[]) anf.setDividerPadding(new Object[]{anfVar}, 1211734093, -1211734093, System.identityHashCode(anfVar));
                anf anfVar2 = (anf) anh.setOnFocusChangeListener(new Object[]{anhVar}, -291403566, 291403567, System.identityHashCode(anhVar));
                ana anaVar = new ana(bigInteger, bigInteger2, bigInteger3, iIntValue2, 0, null, new amz(bArr, ((Integer) anf.setDividerPadding(new Object[]{anfVar2}, 1515847919, -1515847918, System.identityHashCode(anfVar2))).intValue()));
                int i62 = f53024h + 93;
                f53023g = i62 % 128;
                if (i62 % 2 == 0) {
                    return anaVar;
                }
                throw null;
            case 6:
                setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
                Object[] objArr2 = (Object[]) objArr[1];
                int i63 = (-2) - ((f53024h + 102) ^ (-1));
                f53023g = i63 % 128;
                if (i63 % 2 == 0 ? !((Class) setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener}, -540304316, 540304316, (int) System.currentTimeMillis())).isAssignableFrom(objArr2[0].getClass()) : !((Class) setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener}, -540304316, 540304316, (int) System.currentTimeMillis())).isAssignableFrom(objArr2[1].getClass())) {
                    throw new IllegalArgumentException("Bad property value passed");
                }
                setCompoundDrawableTintBlendMode(new Object[]{setonfocuschangelistener, objArr2}, 1753275794, -1753275787, (int) System.currentTimeMillis());
                f53018b.put((String) setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener}, -18217449, 18217450, (int) System.currentTimeMillis()), objArr2);
                int i64 = f53023g + 17;
                f53024h = i64 % 128;
                int i65 = i64 % 2;
                return null;
            case 7:
                setOnFocusChangeListener setonfocuschangelistener2 = (setOnFocusChangeListener) objArr[0];
                Object[] objArr3 = (Object[]) objArr[1];
                int i66 = f53024h;
                int i67 = (i66 & (-32)) | ((~i66) & 31);
                int i68 = (31 & i66) << 1;
                int i69 = ((i67 | i68) << 1) - (i68 ^ i67);
                f53023g = i69 % 128;
                int i70 = i69 % 2;
                ThreadLocal<Map<String, Object[]>> threadLocal = f53017a;
                Map<String, Object[]> map = threadLocal.get();
                if (map == null) {
                    map = new HashMap<>();
                    threadLocal.set(map);
                    int i71 = f53024h;
                    int i72 = i71 & 33;
                    int i73 = (((i71 | 33) & (~i72)) - (~(-(-(i72 << 1))))) - 1;
                    f53023g = i73 % 128;
                    int i74 = i73 % 2;
                }
                map.put((String) setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener2}, -18217449, 18217450, (int) System.currentTimeMillis()), objArr3);
                int i75 = f53024h;
                int i76 = ((i75 ^ 105) | (i75 & 105)) << 1;
                int i77 = -(((~i75) & 105) | (i75 & (-106)));
                int i78 = (i76 & i77) + (i77 | i76);
                f53023g = i78 % 128;
                if (i78 % 2 == 0) {
                    return null;
                }
                throw null;
            default:
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i79 = ~iCurrentTimeMillis;
                int i80 = (-1553228308) ^ i79;
                int i81 = (-1553228308) & i79;
                int i82 = (i81 & i80) | (i80 ^ i81);
                int i83 = ~i82;
                int i84 = (i83 | i82) & i83;
                int i85 = ((~i84) & 479207954) | ((-479207955) & i84);
                int i86 = i84 & 479207954;
                int i87 = (i86 & i85) | (i85 ^ i86);
                int i88 = (i79 & (-537530761)) | (537530760 & iCurrentTimeMillis);
                int i89 = (-537530761) & iCurrentTimeMillis;
                int i90 = (i88 & i89) | (i88 ^ i89);
                int i91 = ~i90;
                int i92 = (i90 | i91) & i91;
                int i93 = ((~i92) & i87) | ((~i87) & i92);
                int i94 = i92 & i87;
                int i95 = ((i94 & i93) | (i93 ^ i94)) * (-502);
                int i96 = ((-14098475) & i95) + (i95 | (-14098475));
                int i97 = (1611551113 & i82) | (i83 & (-1611551114));
                int i98 = i82 & (-1611551114);
                int i99 = ~((i97 & i98) | (i97 ^ i98));
                int i100 = (iCurrentTimeMillis ^ (-537530761)) | i89;
                int i101 = ~i100;
                int i102 = (i100 | i101) & i101;
                int i103 = ((~i102) & i99) | ((~i99) & i102);
                int i104 = i102 & i99;
                int i105 = -(-(((i104 & i103) | (i103 ^ i104)) * 502));
                int i106 = (i96 & i105) + (i105 | i96);
                int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                int i107 = ~iCurrentTimeMillis2;
                int i108 = i107 & (i107 | iCurrentTimeMillis2);
                int i109 = (-2004334848) ^ i108;
                int i110 = (-2004334848) & i108;
                int i111 = ~((i110 & i109) | (i109 ^ i110));
                int i112 = i111 & 1648599048;
                int i113 = ((i111 | 1648599048) & (~i112)) | i112;
                int i114 = 2004860159 & iCurrentTimeMillis2;
                int i115 = (iCurrentTimeMillis2 | 2004860159) & (~i114);
                int i116 = ~((i115 ^ i114) | (i115 & i114));
                int i117 = ((i113 & i116) | (i113 ^ i116)) * (-713);
                int i118 = (-1773522882) & i117;
                int i119 = (((i117 | (-1773522882)) & (~i118)) - (~(i118 << 1))) - 1;
                int i120 = -(-((~(i115 | i114)) * 1426));
                int i121 = i119 & i120;
                int i122 = (i120 | i119) & (~i121);
                int i123 = i121 << 1;
                int i124 = ((i122 | i123) << 1) - (i122 ^ i123);
                int i125 = 1649124360 ^ i108;
                int i126 = 1649124360 & i108;
                int i127 = -(-((~((i126 & i125) | (i125 ^ i126))) * 713));
                int i128 = i124 & i127;
                int i129 = (i128 - (~((i127 ^ i124) | i128))) - 1;
                f53022f.get();
                if (i106 > i129) {
                    throw null;
                }
                int i130 = f53024h;
                int i131 = i130 ^ 87;
                int i132 = (i130 & 87) << 1;
                int i133 = (i131 & i132) + (i132 | i131);
                f53023g = i133 % 128;
                int i134 = i133 % 2;
                return null;
        }
        return dividerPadding;
    }

    public static void setX() {
        setCompoundDrawableTintBlendMode(new Object[0], -825950727, 825950727, (int) System.currentTimeMillis());
    }

    public static SecureRandom setCompoundDrawableTintBlendMode(SecureRandom secureRandom) {
        return (SecureRandom) setCompoundDrawableTintBlendMode(new Object[]{secureRandom}, 1484705821, -1484705819, (int) System.currentTimeMillis());
    }

    public static SecureRandom setCompoundDrawableTintBlendMode() {
        return (SecureRandom) setCompoundDrawableTintBlendMode(new Object[0], -496048399, 496048400, (int) System.currentTimeMillis());
    }
}
