package com.mypinpad.tsdk.isolation;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.PointerIconCompat;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKeys;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u0004J\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u000fJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\f\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/mypinpad/tsdk/i/setPaddingRelative;", "Lcom/mypinpad/tsdk/i/getScope;", "", "getNavBarTitleString", "()Ljava/lang/String;", "p0", "", "setDividerPadding", "(Ljava/lang/String;)V", "setX", "setY", "setCompoundDrawableTintBlendMode", "setOnFocusChangeListener", "setOnLongClickListener", "p1", "(Ljava/lang/String;Ljava/lang/String;)V", "", "(Z)V", "setNavigationOnClickListener", "()Z", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V"}, k = 1, mv = {1, 5, 1})
public final class setPaddingRelative implements getScope {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f60293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f60294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static char f60296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f60297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f60298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f60299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f60300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f60301j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SharedPreferences f60302a;

    static {
        d();
        f60299h = 0;
        f60300i = 1;
        f60297f = 0;
        f60298g = 1;
        e();
        ViewConfiguration.getTouchSlop();
        Process.getElapsedCpuTime();
        Process.getElapsedCpuTime();
        View.getDefaultSize(0, 0);
        ViewConfiguration.getLongPressTimeout();
        ViewConfiguration.getGlobalActionKeyTimeout();
        Color.green(0);
        View.combineMeasuredStates(0, 0);
        ViewConfiguration.getLongPressTimeout();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        Process.myTid();
        ViewConfiguration.getTouchSlop();
        ViewConfiguration.getMaximumDrawingCacheSize();
        AudioTrack.getMaxVolume();
        INSTANCE = new Companion(null);
        int i10 = f60298g + 39;
        f60297f = i10 % 128;
        int i11 = i10 % 2;
    }

    public setPaddingRelative(@NotNull Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "");
        Object[] objArr = new Object[1];
        a("㝁㜤ꪍ翩\u175bഈ봬牯挶菌\ue90f\ude2f齣ힲ䕛⨹쭉筽놲相", ViewConfiguration.getEdgeSlop() >> 16, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i10 = f60298g + 29;
        f60297f = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullExpressionValue(MasterKeys.getOrCreate(MasterKeys.AES256_GCM_SPEC), "");
            throw null;
        }
        String orCreate = MasterKeys.getOrCreate(MasterKeys.AES256_GCM_SPEC);
        Intrinsics.checkNotNullExpressionValue(orCreate, "");
        SharedPreferences sharedPreferencesCreate = EncryptedSharedPreferences.create(strIntern, orCreate, context, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
        Intrinsics.checkNotNullExpressionValue(sharedPreferencesCreate, "");
        this.f60302a = sharedPreferencesCreate;
    }

    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        char[] charArray;
        int i11 = f60300i;
        int i12 = i11 + 59;
        f60299h = i12 % 128;
        int i13 = i12 % 2;
        int i14 = i11 + 97;
        f60299h = i14 % 128;
        if (i14 % 2 != 0) {
            charArray = str.toCharArray();
            int i15 = 5 / 0;
        } else {
            charArray = str.toCharArray();
        }
        int i16 = f60299h + 117;
        f60300i = i16 % 128;
        int i17 = i16 % 2;
        setOnDragListener setondraglistener = new setOnDragListener();
        char[] y7 = setOnDragListener.setY(f60293b ^ 2122665171656649951L, charArray, i10);
        setondraglistener.setDividerPadding = 4;
        int i18 = f60300i + 95;
        f60299h = i18 % 128;
        int i19 = i18 % 2;
        while (true) {
            int i20 = setondraglistener.setDividerPadding;
            if (i20 >= y7.length) {
                objArr[0] = new String(y7, 4, y7.length - 4);
                return;
            }
            int i21 = i20 - 4;
            setondraglistener.setX = i21;
            try {
                Object[] objArr2 = {Long.valueOf(y7[i20] ^ y7[i20 % 4]), Long.valueOf(i21), Long.valueOf(f60293b)};
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(2144228148);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (9779 - ExpandableListView.getPackedPositionType(0L)), 43 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 3187);
                    Class<?> cls2 = Long.TYPE;
                    method = cls.getMethod("y", cls2, cls2, cls2);
                    map.put(2144228148, method);
                }
                y7[i20] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setondraglistener, setondraglistener};
                Object method2 = map.get(-62642757);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 52, 3030 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 + 2);
                    Object[] objArr4 = new Object[1];
                    c((byte) (b11 - 3), b10, b11, objArr4);
                    method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(-62642757, method2);
                }
                ((Method) method2).invoke(null, objArr3);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    public static void b(char c10, String str, int i10, String str2, Object[] objArr) throws Throwable {
        char[] charArray;
        char[] charArray2;
        int i11;
        int i12 = f60300i + 19;
        f60299h = i12 % 128;
        int i13 = 2;
        int i14 = 0;
        if (i12 % 2 != 0) {
            charArray = str2.toCharArray();
            int i15 = 32 / 0;
        } else {
            charArray = str2.toCharArray();
        }
        char[] charArray3 = "\u0000\u0000\u0000\u0000".toCharArray();
        int i16 = f60300i + 51;
        f60299h = i16 % 128;
        if (i16 % 2 != 0) {
            charArray2 = str.toCharArray();
            int i17 = 32 / 0;
        } else {
            charArray2 = str.toCharArray();
        }
        UiMessageCallbackKtWhenMappings uiMessageCallbackKtWhenMappings = new UiMessageCallbackKtWhenMappings();
        int length = charArray2.length;
        char[] cArr = new char[length];
        int length2 = charArray3.length;
        char[] cArr2 = new char[length2];
        System.arraycopy(charArray2, 0, cArr, 0, length);
        System.arraycopy(charArray3, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c10);
        cArr2[2] = (char) (cArr2[2] + ((char) i10));
        int length3 = charArray.length;
        char[] cArr3 = new char[length3];
        uiMessageCallbackKtWhenMappings.setX = 0;
        int i18 = f60299h + 45;
        f60300i = i18 % 128;
        int i19 = i18 % 2;
        while (uiMessageCallbackKtWhenMappings.setX < length3) {
            int i20 = f60299h + 61;
            f60300i = i20 % 128;
            int i21 = i20 % i13;
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i14] = uiMessageCallbackKtWhenMappings;
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(20564334);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (TextUtils.indexOf((CharSequence) "", '0', i14) + 50679), 39 - KeyEvent.normalizeMetaState(i14), AndroidCharacter.getMirror('0') + 1689);
                    byte b10 = (byte) i14;
                    Object[] objArr3 = new Object[1];
                    c((byte) (-1), b10, (byte) (b10 | 6), objArr3);
                    method = cls.getMethod((String) objArr3[0], Object.class);
                    map.put(20564334, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = {uiMessageCallbackKtWhenMappings};
                Object method2 = map.get(-68974155);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (Color.rgb(0, 0, 0) + 16785341), 37 - (ViewConfiguration.getTapTimeout() >> 16), 647 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    byte b11 = (byte) 0;
                    byte b12 = (byte) (b11 + 3);
                    Object[] objArr5 = new Object[1];
                    c((byte) (b12 - 4), b11, b12, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class);
                    map.put(-68974155, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                Object[] objArr6 = {uiMessageCallbackKtWhenMappings, Integer.valueOf(cArr[uiMessageCallbackKtWhenMappings.setX % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method3 = map.get(-1108711559);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 49 - KeyEvent.keyCodeFromString(""), 435 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    byte b13 = (byte) 0;
                    Object[] objArr7 = new Object[1];
                    c((byte) (-1), b13, (byte) (b13 + 5), objArr7);
                    String str3 = (String) objArr7[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str3, Object.class, cls4, cls4);
                    map.put(-1108711559, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                Object[] objArr8 = {Integer.valueOf(cArr[iIntValue2] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method4 = map.get(533021397);
                if (method4 != null) {
                    i11 = 2;
                } else {
                    Class cls5 = (Class) setTextScaleX.setX((char) (4449 - KeyEvent.getDeadChar(0, 0)), TextUtils.indexOf("", "", 0) + 42, (ViewConfiguration.getScrollDefaultDelay() >> 16) + PointerIconCompat.TYPE_GRABBING);
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr9 = new Object[1];
                    c((byte) (b15 - 1), b14, b15, objArr9);
                    String str4 = (String) objArr9[0];
                    i11 = 2;
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str4, cls6, cls6);
                    map.put(533021397, method4);
                }
                cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                char c11 = uiMessageCallbackKtWhenMappings.setDividerPadding;
                cArr[iIntValue2] = c11;
                int i22 = uiMessageCallbackKtWhenMappings.setX;
                cArr3[i22] = (char) (((((long) (c11 ^ charArray[i22])) ^ (f60294c ^ (-2443367703579691432L))) ^ ((long) ((int) (((long) f60295d) ^ (-2443367703579691432L))))) ^ ((long) ((char) (((long) f60296e) ^ (-2443367703579691432L)))));
                uiMessageCallbackKtWhenMappings.setX = i22 + 1;
                i13 = i11;
                length3 = length3;
                cArr3 = cArr3;
                i14 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 119 - r8
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.setPaddingRelative.f60301j
            if (r2 != 0) goto L13
            r4 = r8
            r3 = r1
            r8 = r7
            goto L2a
        L13:
            r3 = r1
        L14:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L21:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r2[r6]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r7 = r7 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setPaddingRelative.c(byte, short, short, java.lang.Object[]):void");
    }

    public static void d() {
        f60301j = new byte[]{GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, 52, -84, -118};
    }

    public static void e() {
        f60293b = 3497524877452245461L;
        f60296e = (char) 41146;
        f60294c = -2443367703579691432L;
        f60295d = -461867432;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0104, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0124, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0126, code lost:
    
        r7 = com.mypinpad.tsdk.isolation.setPaddingRelative.f60297f + 67;
        com.mypinpad.tsdk.isolation.setPaddingRelative.f60298g = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x012f, code lost:
    
        if ((r7 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0133, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setX(java.lang.Object[] r7, int r8, int r9, int r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setPaddingRelative.setX(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.getScope
    @NotNull
    public final String getNavBarTitleString() throws Throwable {
        int i10 = f60298g + 41;
        f60297f = i10 % 128;
        int i11 = i10 % 2;
        Object[] objArr = new Object[1];
        b((char) ((-1) - Process.getGidForName("")), "饐뺬ﵒꀼ", 1388227736 - ((byte) KeyEvent.getModifierMetaStateMask()), "턖꜓虲㶔凨谄隘⏻✦裲\ue00b㑿\uec7c㬄ᬩ恺⽗̤䄾䇴墏", objArr);
        String string = this.f60302a.getString(((String) objArr[0]).intern(), "");
        if (string != null) {
            return string;
        }
        int i12 = f60298g + 93;
        int i13 = i12 % 128;
        f60297f = i13;
        int i14 = i12 % 2;
        int i15 = i13 + 67;
        f60298g = i15 % 128;
        if (i15 % 2 != 0) {
            return "";
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.getScope
    @NotNull
    public final String setCompoundDrawableTintBlendMode() throws Throwable {
        Object[] objArr = new Object[1];
        a("ឱែ穱꼞\uf74a楆崬ᘮ䏰匠ओ멟뾌ݞꕚ乷\uebb9ꮆ冤\u128f䝺徾ඇꚧ댊ϊ맱䫎\uef20럿吻ᄺ嫌", View.MeasureSpec.getSize(0), objArr);
        String string = this.f60302a.getString(((String) objArr[0]).intern(), "");
        if (string != null) {
            return string;
        }
        int i10 = f60298g + 105;
        int i11 = i10 % 128;
        f60297f = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        int i12 = i11 + 21;
        f60298g = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 77 / 0;
        }
        return "";
    }

    @Override // com.mypinpad.tsdk.isolation.getScope
    public final void setDividerPadding(@NotNull String p4) throws Throwable {
        int i10 = f60298g + 73;
        f60297f = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(p4, "");
        SharedPreferences.Editor editorEdit = this.f60302a.edit();
        Object[] objArr = new Object[1];
        b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), "饐뺬ﵒꀼ", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1388227736, "턖꜓虲㶔凨谄隘⏻✦裲\ue00b㑿\uec7c㬄ᬩ恺⽗̤䄾䇴墏", objArr);
        editorEdit.putString(((String) objArr[0]).intern(), p4);
        editorEdit.apply();
        int i12 = f60298g + 21;
        f60297f = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.mypinpad.tsdk.isolation.getScope
    public final boolean setNavigationOnClickListener() {
        return ((Boolean) setX(new Object[]{this}, -860947654, 860947656, System.identityHashCode(this))).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006e, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003e, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0062, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0064, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.setPaddingRelative.f60297f + 99;
        com.mypinpad.tsdk.isolation.setPaddingRelative.f60298g = r0 % 128;
        r0 = r0 % 2;
     */
    @Override // com.mypinpad.tsdk.isolation.getScope
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String setOnFocusChangeListener() throws java.lang.Throwable {
        /*
            r10 = this;
            int r0 = com.mypinpad.tsdk.isolation.setPaddingRelative.f60297f
            int r0 = r0 + 13
            int r1 = r0 % 128
            com.mypinpad.tsdk.isolation.setPaddingRelative.f60298g = r1
            int r0 = r0 % 2
            java.lang.String r1 = "ᩑ毿ᐱ粄喴閺⋭吧荦⣼趄輷\ud85e塶\uf845螿\uda9f\uaac5䯺"
            java.lang.String r2 = "冤讻䤝蒚"
            r3 = 0
            r4 = 1
            r5 = 495696673(0x1d8bbb21, float:3.698648E-21)
            r6 = 39498(0x9a4a, float:5.5348E-41)
            android.content.SharedPreferences r7 = r10.f60302a
            java.lang.String r8 = ""
            if (r0 != 0) goto L41
            float r0 = android.view.ViewConfiguration.getScrollFriction()
            r9 = 1073741824(0x40000000, float:2.0)
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            int r6 = r6 % r0
            char r0 = (char) r6
            r6 = 10
            char r6 = android.text.AndroidCharacter.getMirror(r6)
            int r5 = r5 << r6
            java.lang.Object[] r4 = new java.lang.Object[r4]
            b(r0, r2, r5, r1, r4)
            r0 = r4[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r7.getString(r0, r8)
            if (r0 != 0) goto L6f
            goto L64
        L41:
            float r0 = android.view.ViewConfiguration.getScrollFriction()
            r9 = 0
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            int r6 = r6 - r0
            char r0 = (char) r6
            r6 = 48
            char r6 = android.text.AndroidCharacter.getMirror(r6)
            int r6 = r6 + r5
            java.lang.Object[] r4 = new java.lang.Object[r4]
            b(r0, r2, r6, r1, r4)
            r0 = r4[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r7.getString(r0, r8)
            if (r0 != 0) goto L6f
        L64:
            int r0 = com.mypinpad.tsdk.isolation.setPaddingRelative.f60297f
            int r0 = r0 + 99
            int r1 = r0 % 128
            com.mypinpad.tsdk.isolation.setPaddingRelative.f60298g = r1
            int r0 = r0 % 2
            return r8
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setPaddingRelative.setOnFocusChangeListener():java.lang.String");
    }

    @Override // com.mypinpad.tsdk.isolation.getScope
    @NotNull
    public final String setOnLongClickListener() throws Throwable {
        int i10 = f60298g + 93;
        f60297f = i10 % 128;
        int i11 = i10 % 2;
        Object[] objArr = new Object[1];
        a("겦곃콄ᨣ闅邷㾧\ueff6\uf8ed\ue619殗䎗ҟ뉹쟾랱傿ẵ㌡\ueb7eﱵ\uea8f漝彽", Process.myPid() >> 22, objArr);
        String string = this.f60302a.getString(((String) objArr[0]).intern(), "");
        if (string != null) {
            return string;
        }
        int i12 = f60297f + 1;
        f60298g = i12 % 128;
        if (i12 % 2 != 0) {
            return "";
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.getScope
    public final void setY(@NotNull String p4, @NotNull String p10) throws Throwable {
        int i10 = f60298g + 13;
        f60297f = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p10, "");
        SharedPreferences.Editor editorEdit = this.f60302a.edit();
        Object[] objArr = new Object[1];
        a("궅귮锢䁍\uf53a㬆彗䑵流뱢\u0b59\ue829ֱ\ue81dꜰᰜ冔䓔叏", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, objArr);
        editorEdit.putString(((String) objArr[0]).intern(), p4);
        Object[] objArr2 = new Object[1];
        b((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49296), "調Ŧ醫싀", ViewConfiguration.getScrollDefaultDelay() >> 16, "纅쪆곇咰蠇經蠎ⁱ祛觺乬\ue6ee劉ỏ萀隽", objArr2);
        editorEdit.putString(((String) objArr2[0]).intern(), p10);
        editorEdit.apply();
        int i12 = f60298g + 81;
        f60297f = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 95 / 0;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.getScope
    public final void setOnFocusChangeListener(boolean p4) throws Throwable {
        int i10 = f60297f + 3;
        f60298g = i10 % 128;
        int i11 = i10 % 2;
        SharedPreferences.Editor editorEdit = this.f60302a.edit();
        Object[] objArr = new Object[1];
        b((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), "휐\ue822뇶詑", (-152558888) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "宜듊풰窶g趎땑ꊱ愛쾉戀构랈Ꟙᦈ섍ꚫ羾煭澔ˍ", objArr);
        editorEdit.putBoolean(((String) objArr[0]).intern(), p4).apply();
        int i12 = f60298g + 75;
        f60297f = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.mypinpad.tsdk.isolation.getScope
    @NotNull
    public final String setDividerPadding() throws Throwable {
        Object[] objArr = new Object[1];
        a("궅귮锢䁍\uf53a㬆彗䑵流뱢\u0b59\ue829ֱ\ue81dꜰᰜ冔䓔叏", (-1) - TextUtils.lastIndexOf("", '0', 0, 0), objArr);
        String string = this.f60302a.getString(((String) objArr[0]).intern(), "");
        if (string == null) {
            int i10 = f60298g + 119;
            f60297f = i10 % 128;
            int i11 = i10 % 2;
            return "";
        }
        int i12 = f60297f + 13;
        f60298g = i12 % 128;
        int i13 = i12 % 2;
        return string;
    }

    @Override // com.mypinpad.tsdk.isolation.getScope
    public final void setX(@NotNull String p4) throws Throwable {
        int i10 = f60297f + 73;
        f60298g = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(p4, "");
        SharedPreferences.Editor editorEdit = this.f60302a.edit();
        Object[] objArr = new Object[1];
        a("겦곃콄ᨣ闅邷㾧\ueff6\uf8ed\ue619殗䎗ҟ뉹쟾랱傿ẵ㌡\ueb7eﱵ\uea8f漝彽", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
        editorEdit.putString(((String) objArr[0]).intern(), p4).apply();
        int i12 = f60298g + 1;
        f60297f = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.getScope
    public final void setDividerPadding(@NotNull String p4, @NotNull String p10) throws Throwable {
        int i10 = f60297f + 105;
        f60298g = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p10, "");
        SharedPreferences.Editor editorEdit = this.f60302a.edit();
        Object[] objArr = new Object[1];
        b((char) (8881 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), "⚥\ue8c4녶霢", 1994966054 - View.MeasureSpec.getSize(0), "Ⳗ鿦朅姝绂瀀㥯飗䏸⛮＄잛\uf100陌\uf1b2뭃⢠꤉വ", objArr);
        editorEdit.putString(((String) objArr[0]).intern(), p4);
        Object[] objArr2 = new Object[1];
        a("ឱែ穱꼞\uf74a楆崬ᘮ䏰匠ओ멟뾌ݞꕚ乷\uebb9ꮆ冤\u128f䝺徾ඇꚧ댊ϊ맱䫎\uef20럿吻ᄺ嫌", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, objArr2);
        editorEdit.putString(((String) objArr2[0]).intern(), p10);
        editorEdit.apply();
        int i12 = f60298g + 61;
        f60297f = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.mypinpad.tsdk.isolation.getScope
    public final void setY(@NotNull String p4) throws Throwable {
        int i10 = f60297f + 55;
        f60298g = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(p4, "");
        SharedPreferences.Editor editorEdit = this.f60302a.edit();
        Object[] objArr = new Object[1];
        b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 39497), "冤讻䤝蒚", Color.green(0) + 495696721, "ᩑ毿ᐱ粄喴閺⋭吧荦⣼趄輷\ud85e塶\uf845螿\uda9f\uaac5䯺", objArr);
        editorEdit.putString(((String) objArr[0]).intern(), p4);
        editorEdit.apply();
        int i12 = f60298g + 37;
        f60297f = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.getScope
    @NotNull
    public final String setX() {
        return (String) setX(new Object[]{this}, -1331662063, 1331662063, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.getScope
    @NotNull
    public final String setY() {
        return (String) setX(new Object[]{this}, -952063699, 952063700, System.identityHashCode(this));
    }
}
