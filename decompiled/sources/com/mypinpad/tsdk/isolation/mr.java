package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.google.android.gms.auth.api.phone.SmsRetrieverStatusCodes;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0081\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b"}, d2 = {"Lcom/mypinpad/tsdk/i/mr;", "", "", "toString", "()Ljava/lang/String;", "setOnFocusChangeListener", "setY", "setDividerPadding", "setX", "setCompoundDrawableTintBlendMode", "getNavBarTitleString", "setLayoutDirection", "setOnDragListener", "setLayoutAnimation", "setNavigationOnClickListener", "setOnLongClickListener", "setAlwaysDrawnWithCacheEnabled", "UiMessageCallbackKtWhenMappings", "setZ", "setTextAlignment", "setIncludeFontPadding", "setCompoundDrawablePadding", "setChildDivider", "setTextScaleX", "setOnEditorActionListener", "getAmountFieldTextColor", "getSuppressed", "setImageResource"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInternalLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalLogger.kt\ncom/mypinpad/tsdk/internal/common/logging/LogEntry\n+ 2 DebugFunctions.kt\ncom/mypinpad/tsdk/common/buildconstants/DebugFunctionsKt\n*L\n1#1,105:1\n30#2:106\n14#2:107\n*S KotlinDebug\n*F\n+ 1 InternalLogger.kt\ncom/mypinpad/tsdk/internal/common/logging/LogEntry\n*L\n103#1:106\n103#1:107\n*E\n"})
public final class mr {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int TransactionResult;
    public static final mr UiMessageCallbackKtWhenMappings;
    public static final mr getAmountFieldTextColor;
    public static final mr getNavBarTitleString;
    public static final mr getSuppressed;
    private static long printStackTrace;
    public static final mr setAlwaysDrawnWithCacheEnabled;
    public static final mr setChildDivider;
    public static final mr setCompoundDrawablePadding;
    public static final mr setCompoundDrawableTintBlendMode;
    private static int setCursorVisible;
    public static final mr setDividerPadding;
    public static final mr setImageResource;
    public static final mr setIncludeFontPadding;
    public static final mr setLayoutAnimation;
    private static mr setLayoutDirection;
    private static int[] setMaxEms;
    private static final /* synthetic */ mr[] setMinHeight;
    public static final mr setNavigationOnClickListener;
    public static final mr setOnDragListener;
    public static final mr setOnEditorActionListener;
    public static final mr setOnFocusChangeListener;
    public static final mr setOnLongClickListener;
    public static final mr setTextAlignment;
    public static final mr setTextScaleX;
    private static char setTextSelectHandleRight;
    private static int setViewTranslationCallback;
    public static final mr setX;
    public static final mr setY;
    public static final mr setZ;

    static {
        d();
        $10 = 0;
        $11 = 1;
        setViewTranslationCallback = 0;
        setCursorVisible = 1;
        setCompoundDrawableTintBlendMode();
        Object[] objArr = new Object[1];
        a(new int[]{95144282, -1845260513, -442894183, -646006229, 1195395754, 944614999, 1398380988, -166781664, 1383615421, 2070566016}, 21 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
        mr mrVar = new mr(((String) objArr[0]).intern(), 0);
        setOnFocusChangeListener = mrVar;
        Object[] objArr2 = new Object[1];
        a(new int[]{95144282, -1845260513, -442894183, -646006229, 1273508169, -1896675895, 1615161830, -1355308818, 222270931, -578106135, -1296655446, -1384934781}, 23 - View.MeasureSpec.getSize(0), objArr2);
        mr mrVar2 = new mr(((String) objArr2[0]).intern(), 1);
        setY = mrVar2;
        Object[] objArr3 = new Object[1];
        a(new int[]{95144282, -1845260513, -442894183, -646006229, 1398093931, 1981974672, 2074394915, -437874411, 1769166084, -195886998, -1060968986, -494809339}, 20 - Process.getGidForName(""), objArr3);
        mr mrVar3 = new mr(((String) objArr3[0]).intern(), 2);
        setDividerPadding = mrVar3;
        Object[] objArr4 = new Object[1];
        b((char) (Process.getGidForName("") + 29216), "⤆\uea80ᾉ㍲", ViewConfiguration.getTouchSlop() >> 8, "抑䇇ᑺ⒘飀㰳ᅴ羉湍殃炯㏍獻\uebca㉃\ue3e2", objArr4);
        mr mrVar4 = new mr(((String) objArr4[0]).intern(), 3);
        setX = mrVar4;
        Object[] objArr5 = new Object[1];
        b((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), "煌\uf333뱛氰", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1542665073, "쬠⽪쳏\uf0ee灣䪰ſ⫎衒\uee11峜ꌋබ佒\uf018袨ﵹᨎ뱓\uf3c2볔", objArr5);
        mr mrVar5 = new mr(((String) objArr5[0]).intern(), 4);
        setCompoundDrawableTintBlendMode = mrVar5;
        Object[] objArr6 = new Object[1];
        b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), "ᕐ\ueeb1雱롩", (-236015339) - ExpandableListView.getPackedPositionGroup(0L), "ሒ㒠\udaf7㜴岝됓沣ࢌ䭓ꠦ댌⚮肃\u08e2\udb6eﯬힾ受큤㞣䤲", objArr6);
        mr mrVar6 = new mr(((String) objArr6[0]).intern(), 5);
        getNavBarTitleString = mrVar6;
        Object[] objArr7 = new Object[1];
        a(new int[]{-116409667, 1419277392, 509866226, 883801702, -2118491494, 1414567627}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 11, objArr7);
        setLayoutDirection = new mr(((String) objArr7[0]).intern(), 6);
        Object[] objArr8 = new Object[1];
        b((char) ((Process.myPid() >> 22) + 45294), "螳\uee3c\ueeb9械", (-1175569273) - (ViewConfiguration.getPressedStateDuration() >> 16), "蠌ꍾ\uf2b1\ueaaa髃휟渏ܘ\udf3fЪୋ豉㓏숩\ue10b춃먹ᑲẹ濌爔\ueb90\uee1c荧⩣ⸯ़㽄혒", objArr8);
        mr mrVar7 = new mr(((String) objArr8[0]).intern(), 7);
        setOnDragListener = mrVar7;
        Object[] objArr9 = new Object[1];
        a(new int[]{1822039964, 2111973550, -670499387, -970463710, 668658383, -1913775618}, 11 - Drawable.resolveOpacity(0, 0), objArr9);
        mr mrVar8 = new mr(((String) objArr9[0]).intern(), 8);
        setLayoutAnimation = mrVar8;
        Object[] objArr10 = new Object[1];
        a(new int[]{-1011883120, 1666490878, 2039541110, -1750451651}, AndroidCharacter.getMirror('0') - '(', objArr10);
        mr mrVar9 = new mr(((String) objArr10[0]).intern(), 9);
        setNavigationOnClickListener = mrVar9;
        Object[] objArr11 = new Object[1];
        a(new int[]{-1160334790, -2098119239, 267260132, 1487064048, -2081486130, 606106430, -1643694366, 549805982}, 15 - TextUtils.indexOf("", "", 0), objArr11);
        mr mrVar10 = new mr(((String) objArr11[0]).intern(), 10);
        setOnLongClickListener = mrVar10;
        Object[] objArr12 = new Object[1];
        b((char) ExpandableListView.getPackedPositionGroup(0L), "稹蒁걫\uea02", (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), "巾헅\ue629\udacc㿖ꯐ鳭᫉", objArr12);
        mr mrVar11 = new mr(((String) objArr12[0]).intern(), 11);
        setAlwaysDrawnWithCacheEnabled = mrVar11;
        Object[] objArr13 = new Object[1];
        b((char) ((KeyEvent.getMaxKeyCode() >> 16) + SmsRetrieverStatusCodes.PLATFORM_NOT_SUPPORTED), "﬩䲨铪ᾎ", View.combineMeasuredStates(0, 0), "㯁봸\uef71틠璍튂\u173e湚듛㳍釚阙獠ꝇ鳘\uf476", objArr13);
        mr mrVar12 = new mr(((String) objArr13[0]).intern(), 12);
        UiMessageCallbackKtWhenMappings = mrVar12;
        Object[] objArr14 = new Object[1];
        a(new int[]{-444475071, -1945750694, 228349204, 1346455655, 452857729, 1196073538}, 12 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr14);
        mr mrVar13 = new mr(((String) objArr14[0]).intern(), 13);
        setZ = mrVar13;
        Object[] objArr15 = new Object[1];
        a(new int[]{-444475071, -1945750694, 228349204, 1346455655, 810772994, -2090957251, 940238915, -1073667987, 360204110, 282282890}, Color.blue(0) + 20, objArr15);
        mr mrVar14 = new mr(((String) objArr15[0]).intern(), 14);
        setTextAlignment = mrVar14;
        Object[] objArr16 = new Object[1];
        a(new int[]{-1410396429, -1803582888, -887909384, 878127038, 668658383, -1913775618}, 11 - TextUtils.getOffsetAfter("", 0), objArr16);
        mr mrVar15 = new mr(((String) objArr16[0]).intern(), 15);
        setIncludeFontPadding = mrVar15;
        Object[] objArr17 = new Object[1];
        b((char) Color.argb(0, 0, 0, 0), "ڭ룭艋們", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, "떓昛톼Ǭ잣䴙咋첚\u1cc9觇", objArr17);
        mr mrVar16 = new mr(((String) objArr17[0]).intern(), 16);
        setCompoundDrawablePadding = mrVar16;
        Object[] objArr18 = new Object[1];
        a(new int[]{-1410396429, -1803582888, -887909384, 878127038, 267260132, 1487064048, 775860722, 1844016623, 565775389, 1278606449}, 19 - TextUtils.indexOf("", "", 0), objArr18);
        mr mrVar17 = new mr(((String) objArr18[0]).intern(), 17);
        setChildDivider = mrVar17;
        Object[] objArr19 = new Object[1];
        a(new int[]{1822039964, 2111973550, -670499387, -970463710, 267260132, 1487064048, 775860722, 1844016623, 565775389, 1278606449}, 18 - Process.getGidForName(""), objArr19);
        mr mrVar18 = new mr(((String) objArr19[0]).intern(), 18);
        setTextScaleX = mrVar18;
        Object[] objArr20 = new Object[1];
        a(new int[]{-151574943, -1925219182, -2063985092, -383581740, 1387273863, 1080371765, -1726005974, 1888387757, -1290675144, -102259797}, Color.red(0) + 20, objArr20);
        mr mrVar19 = new mr(((String) objArr20[0]).intern(), 19);
        setOnEditorActionListener = mrVar19;
        Object[] objArr21 = new Object[1];
        a(new int[]{-311092382, 1333137068, 187516583, -763847571}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 6, objArr21);
        mr mrVar20 = new mr(((String) objArr21[0]).intern(), 20);
        getAmountFieldTextColor = mrVar20;
        Object[] objArr22 = new Object[1];
        a(new int[]{-224728717, 1273131332, 1181571983, -1124812978, -1551811570, 1970117856}, View.resolveSizeAndState(0, 0, 0) + 10, objArr22);
        mr mrVar21 = new mr(((String) objArr22[0]).intern(), 21);
        getSuppressed = mrVar21;
        Object[] objArr23 = new Object[1];
        b((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "䀍\udda7烡瘟", (-505567424) - (KeyEvent.getMaxKeyCode() >> 16), "䒱ꄶ䱥\ue67e츨崋뿤䪟猍", objArr23);
        mr mrVar22 = new mr(((String) objArr23[0]).intern(), 22);
        setImageResource = mrVar22;
        int i10 = setCursorVisible;
        int i11 = i10 + 81;
        setViewTranslationCallback = i11 % 128;
        int i12 = i11 % 2;
        mr[] mrVarArr = {mrVar, mrVar2, mrVar3, mrVar4, mrVar5, mrVar6, setLayoutDirection, mrVar7, mrVar8, mrVar9, mrVar10, mrVar11, mrVar12, mrVar13, mrVar14, mrVar15, mrVar16, mrVar17, mrVar18, mrVar19, mrVar20, mrVar21, mrVar22};
        int i13 = i10 + 39;
        setViewTranslationCallback = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        setMinHeight = mrVarArr;
        int i14 = i10 + 119;
        setViewTranslationCallback = i14 % 128;
        int i15 = i14 % 2;
    }

    public mr() {
        throw null;
    }

    public static void a(int[] iArr, int i10, Object[] objArr) throws Throwable {
        String str;
        String str2;
        int length;
        int[] iArr2;
        int i11;
        setOnLongClickListener setonlongclicklistener = new setOnLongClickListener();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = setMaxEms;
        int i12 = 16;
        int i13 = 1;
        long j10 = 0;
        int i14 = 1833429914;
        int i15 = 0;
        if (iArr3 != null) {
            int i16 = $10;
            int i17 = i16 + 89;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i11 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i11 = 0;
            }
            int i18 = i16 + 121;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            int i20 = i11;
            while (i20 < length) {
                try {
                    Object[] objArr2 = new Object[i13];
                    objArr2[i15] = Integer.valueOf(iArr3[i20]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i14));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getMinimumFlingVelocity() >> i12), ExpandableListView.getPackedPositionType(j10) + 44, Gravity.getAbsoluteGravity(i15, i15) + 728);
                        byte b10 = (byte) i15;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        c(b11, b10, b11, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(1833429914, method);
                    }
                    iArr2[i20] = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                    i20++;
                    i12 = 16;
                    i13 = 1;
                    j10 = 0;
                    i14 = 1833429914;
                    i15 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = setMaxEms;
        String str3 = "";
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i21 = 0;
            while (i21 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr5[i21])};
                Map map2 = setTextScaleX.setMaxEms;
                Object method2 = map2.get(1833429914);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) TextUtils.indexOf(str3, str3), TextUtils.indexOf(str3, str3) + 44, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 728);
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    c(b13, b12, b13, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                    map2.put(1833429914, method2);
                }
                iArr6[i21] = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                i21++;
                iArr5 = iArr5;
                length3 = length3;
                str3 = str3;
            }
            str = str3;
            iArr5 = iArr6;
        } else {
            str = "";
        }
        char c10 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        setonlongclicklistener.setDividerPadding = 0;
        while (true) {
            int i22 = setonlongclicklistener.setDividerPadding;
            if (i22 >= iArr.length) {
                break;
            }
            int i23 = iArr[i22];
            char c11 = (char) (i23 >> 16);
            cArr[c10] = c11;
            char c12 = (char) i23;
            cArr[1] = c12;
            int i24 = iArr[i22 + 1];
            char c13 = (char) (i24 >> 16);
            cArr[2] = c13;
            char c14 = (char) i24;
            cArr[3] = c14;
            setonlongclicklistener.setY = (c11 << 16) + c12;
            setonlongclicklistener.setCompoundDrawableTintBlendMode = (c13 << 16) + c14;
            setOnLongClickListener.setX(iArr4);
            int i25 = 0;
            for (int i26 = 16; i25 < i26; i26 = 16) {
                int i27 = setonlongclicklistener.setY ^ iArr4[i25];
                setonlongclicklistener.setY = i27;
                Object[] objArr6 = {setonlongclicklistener, Integer.valueOf(setOnLongClickListener.setCompoundDrawableTintBlendMode(i27)), setonlongclicklistener, setonlongclicklistener};
                Map map3 = setTextScaleX.setMaxEms;
                Object method3 = map3.get(-350984188);
                if (method3 == null) {
                    method3 = ((Class) setTextScaleX.setX((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 41 - (ViewConfiguration.getTapTimeout() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 180)).getMethod("o", Object.class, Integer.TYPE, Object.class, Object.class);
                    map3.put(-350984188, method3);
                }
                int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                setonlongclicklistener.setY = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                setonlongclicklistener.setCompoundDrawableTintBlendMode = iIntValue;
                i25++;
            }
            int i28 = setonlongclicklistener.setY;
            int i29 = setonlongclicklistener.setCompoundDrawableTintBlendMode;
            int i30 = i28 ^ iArr4[16];
            setonlongclicklistener.setCompoundDrawableTintBlendMode = i30;
            int i31 = i29 ^ iArr4[17];
            setonlongclicklistener.setY = i31;
            cArr[0] = (char) (i31 >>> 16);
            cArr[1] = (char) i31;
            cArr[2] = (char) (i30 >>> 16);
            cArr[3] = (char) i30;
            setOnLongClickListener.setX(iArr4);
            int i32 = setonlongclicklistener.setDividerPadding * 2;
            cArr2[i32] = cArr[0];
            cArr2[i32 + 1] = cArr[1];
            cArr2[i32 + 2] = cArr[2];
            cArr2[i32 + 3] = cArr[3];
            Object[] objArr7 = {setonlongclicklistener, setonlongclicklistener};
            Map map4 = setTextScaleX.setMaxEms;
            Object method4 = map4.get(-147294223);
            if (method4 != null) {
                str2 = str;
            } else {
                str2 = str;
                Class cls3 = (Class) setTextScaleX.setX((char) ((-1) - TextUtils.indexOf((CharSequence) str2, '0', 0)), 41 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 483 - (ViewConfiguration.getTapTimeout() >> 16));
                byte b14 = (byte) 0;
                Object[] objArr8 = new Object[1];
                c(b14, b14, (byte) $$a.length, objArr8);
                method4 = cls3.getMethod((String) objArr8[0], Object.class, Object.class);
                map4.put(-147294223, method4);
            }
            ((Method) method4).invoke(null, objArr7);
            str = str2;
            c10 = 0;
        }
        String str4 = new String(cArr2, 0, i10);
        int i33 = $10 + 91;
        $11 = i33 % 128;
        if (i33 % 2 == 0) {
            throw null;
        }
        objArr[0] = str4;
    }

    public static void b(char c10, String str, int i10, String str2, Object[] objArr) throws Throwable {
        char[] charArray;
        char c11;
        char[] charArray2 = str2.toCharArray();
        int i11 = $11 + 1;
        $10 = i11 % 128;
        int i12 = i11 % 2;
        char[] charArray3 = "\u0000\u0000\u0000\u0000".toCharArray();
        int i13 = $10 + 91;
        $11 = i13 % 128;
        int i14 = 0;
        if (i13 % 2 == 0) {
            charArray = str.toCharArray();
            int i15 = 80 / 0;
        } else {
            charArray = str.toCharArray();
        }
        UiMessageCallbackKtWhenMappings uiMessageCallbackKtWhenMappings = new UiMessageCallbackKtWhenMappings();
        int length = charArray.length;
        char[] cArr = new char[length];
        int length2 = charArray3.length;
        char[] cArr2 = new char[length2];
        System.arraycopy(charArray, 0, cArr, 0, length);
        System.arraycopy(charArray3, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c10);
        cArr2[2] = (char) (cArr2[2] + ((char) i10));
        int length3 = charArray2.length;
        char[] cArr3 = new char[length3];
        uiMessageCallbackKtWhenMappings.setX = 0;
        int i16 = $11 + 59;
        $10 = i16 % 128;
        int i17 = i16 % 2;
        while (uiMessageCallbackKtWhenMappings.setX < length3) {
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i14] = uiMessageCallbackKtWhenMappings;
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(20564334);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (View.MeasureSpec.getMode(i14) + 50678), KeyEvent.normalizeMetaState(i14) + 39, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1737);
                    byte b10 = (byte) i14;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    c(b11, b10, (byte) (b11 | 9), objArr3);
                    String str3 = (String) objArr3[i14];
                    Class<?>[] clsArr = new Class[1];
                    clsArr[i14] = Object.class;
                    method = cls.getMethod(str3, clsArr);
                    map.put(20564334, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = new Object[1];
                objArr4[i14] = uiMessageCallbackKtWhenMappings;
                Object method2 = map.get(-68974155);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) ((ExpandableListView.getPackedPositionForChild(i14, i14) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i14, i14) == 0L ? 0 : -1)) + 8126), 36 - Process.getGidForName(""), (ViewConfiguration.getLongPressTimeout() >> 16) + 646);
                    byte b12 = (byte) i14;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    c(b13, b12, (byte) (b13 | 12), objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class);
                    map.put(-68974155, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                Object[] objArr6 = {uiMessageCallbackKtWhenMappings, Integer.valueOf(cArr[uiMessageCallbackKtWhenMappings.setX % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method3 = map.get(-1108711559);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getScrollBarSize() >> 8), 48 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 433);
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr7 = new Object[1];
                    c(b15, b14, (byte) (b15 | 10), objArr7);
                    String str4 = (String) objArr7[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str4, Object.class, cls4, cls4);
                    map.put(-1108711559, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                Object[] objArr8 = {Integer.valueOf(cArr[iIntValue2] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method4 = map.get(533021397);
                if (method4 != null) {
                    c11 = 2;
                } else {
                    Class cls5 = (Class) setTextScaleX.setX((char) (TextUtils.indexOf((CharSequence) "", '0') + 4450), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 43, 1021 - View.combineMeasuredStates(0, 0));
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    Object[] objArr9 = new Object[1];
                    c(b17, b16, (byte) (b17 | 15), objArr9);
                    String str5 = (String) objArr9[0];
                    c11 = 2;
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str5, cls6, cls6);
                    map.put(533021397, method4);
                }
                cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                char c12 = uiMessageCallbackKtWhenMappings.setDividerPadding;
                cArr[iIntValue2] = c12;
                int i18 = uiMessageCallbackKtWhenMappings.setX;
                cArr3[i18] = (char) (((((long) (c12 ^ charArray2[i18])) ^ (printStackTrace ^ (-2443367703579691432L))) ^ ((long) ((int) (((long) TransactionResult) ^ (-2443367703579691432L))))) ^ ((long) ((char) (((long) setTextSelectHandleRight) ^ (-2443367703579691432L)))));
                uiMessageCallbackKtWhenMappings.setX = i18 + 1;
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

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 1
            int r7 = r7 * 3
            int r7 = 3 - r7
            byte[] r0 = com.mypinpad.tsdk.isolation.mr.$$a
            int r8 = r8 + 104
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L36
        L19:
            r3 = r2
        L1a:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2b:
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L36:
            int r6 = r6 + r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.mr.c(int, byte, int, java.lang.Object[]):void");
    }

    public static void d() {
        $$a = new byte[]{Constants.RESP_MSG_TEMPLATE_FORMAT_2, 86, 126, 91};
        $$b = 150;
    }

    public static void setCompoundDrawableTintBlendMode() {
        setMaxEms = new int[]{1285179069, 518889314, 1427326098, 1534671223, 1239361278, -843353554, -36381373, -275208957, -1068246541, 1204333754, -307849146, -1589422709, -589962452, 988773284, 1882603682, 935081385, -1566821629, -80937826};
        setTextSelectHandleRight = (char) 62992;
        printStackTrace = -2443367703579691432L;
        TransactionResult = -461867432;
    }

    public static mr valueOf(String str) {
        int i10 = setViewTranslationCallback + 77;
        setCursorVisible = i10 % 128;
        int i11 = i10 % 2;
        mr mrVar = (mr) Enum.valueOf(mr.class, str);
        int i12 = setViewTranslationCallback + 53;
        setCursorVisible = i12 % 128;
        if (i12 % 2 != 0) {
            return mrVar;
        }
        throw null;
    }

    public static mr[] values() {
        mr[] mrVarArr;
        int i10 = setViewTranslationCallback + 79;
        setCursorVisible = i10 % 128;
        if (i10 % 2 == 0) {
            mrVarArr = (mr[]) setMinHeight.clone();
            int i11 = 36 / 0;
        } else {
            mrVarArr = (mr[]) setMinHeight.clone();
        }
        int i12 = setCursorVisible + 29;
        setViewTranslationCallback = i12 % 128;
        if (i12 % 2 == 0) {
            return mrVarArr;
        }
        throw null;
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        int i10 = setViewTranslationCallback;
        int i11 = i10 + 15;
        setCursorVisible = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 99;
        setCursorVisible = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 93 / 0;
        }
        return "";
    }
}
