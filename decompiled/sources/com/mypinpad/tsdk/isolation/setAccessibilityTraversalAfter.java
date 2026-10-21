package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.a;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'setX' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007R\u0011\u0010\u0005\u001a\u00020\u0002X\u0007¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0004\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\rR\u001a\u0010\u0003\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\t\u0010\u0012j\u0002\b\u000ej\u0002\b\u0005j\u0002\b\tj\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d"}, d2 = {"Lcom/mypinpad/tsdk/i/setAccessibilityTraversalAfter;", "", "", "setOnFocusChangeListener", "Z", "setDividerPadding", "setAlwaysDrawnWithCacheEnabled", "setY", "()Z", "setCompoundDrawableTintBlendMode", "", "getAmountFieldTextColor", "Ljava/lang/String;", "()Ljava/lang/String;", "setX", "", "setChildDivider", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "()I", "setOnLongClickListener", "setNavigationOnClickListener", "setTextScaleX", "setCompoundDrawablePadding", "setOnDragListener", "setLayoutAnimation", "getNavBarTitleString", "setZ", "setTextAlignment", "setIncludeFontPadding", "UiMessageCallbackKtWhenMappings"}, k = 1, mv = {1, 5, 1})
public final class setAccessibilityTraversalAfter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final setAccessibilityTraversalAfter UiMessageCallbackKtWhenMappings;
    public static final setAccessibilityTraversalAfter getNavBarTitleString;
    private static int getSuppressed;
    private static setAccessibilityTraversalAfter setCompoundDrawablePadding;
    public static final setAccessibilityTraversalAfter setCompoundDrawableTintBlendMode;
    public static final setAccessibilityTraversalAfter setDividerPadding;
    private static char setImageResource;
    public static final setAccessibilityTraversalAfter setIncludeFontPadding;
    public static final setAccessibilityTraversalAfter setLayoutAnimation;
    private static int setLayoutDirection;
    private static char[] setMaxEms;
    private static long setMinHeight;
    public static final setAccessibilityTraversalAfter setNavigationOnClickListener;
    public static final setAccessibilityTraversalAfter setOnDragListener;
    private static final /* synthetic */ setAccessibilityTraversalAfter[] setOnEditorActionListener;
    public static final setAccessibilityTraversalAfter setOnLongClickListener;
    public static final setAccessibilityTraversalAfter setTextAlignment;
    private static setAccessibilityTraversalAfter setTextScaleX;
    public static final setAccessibilityTraversalAfter setX;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final setAccessibilityTraversalAfter setZ;

    /* JADX INFO: renamed from: getAmountFieldTextColor, reason: from kotlin metadata */
    @NotNull
    private final String setX;

    /* JADX INFO: renamed from: setAlwaysDrawnWithCacheEnabled, reason: from kotlin metadata */
    private final boolean setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: setChildDivider, reason: from kotlin metadata */
    private final int setOnFocusChangeListener;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    public boolean setDividerPadding;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.setAccessibilityTraversalAfter$setY, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/setAccessibilityTraversalAfter$setY;", "", "", "p0", "Lcom/mypinpad/tsdk/i/setAccessibilityTraversalAfter;", "setDividerPadding", "(Ljava/lang/String;)Lcom/mypinpad/tsdk/i/setAccessibilityTraversalAfter;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f58230a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f58231b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public static setAccessibilityTraversalAfter setDividerPadding(@NotNull String p4) {
            return (setAccessibilityTraversalAfter) setX(new Object[]{p4}, 647307087, -647307087, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws setScrollY {
            setAccessibilityTraversalAfter setaccessibilitytraversalafter;
            int i13 = 0;
            String str = (String) objArr[0];
            int i14 = f58231b;
            int i15 = i14 & 31;
            int i16 = i15 + ((i14 ^ 31) | i15);
            f58230a = i16 % 128;
            int i17 = i16 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            setAccessibilityTraversalAfter[] setaccessibilitytraversalafterArrValues = setAccessibilityTraversalAfter.values();
            int length = setaccessibilitytraversalafterArrValues.length;
            int i18 = f58231b;
            int i19 = i18 & 121;
            int i20 = -(-((i18 ^ 121) | i19));
            int i21 = (i19 & i20) + (i20 | i19);
            f58230a = i21 % 128;
            while (true) {
                int i22 = i21 % 2;
                setaccessibilitytraversalafter = null;
                if (i13 >= length) {
                    int i23 = f58230a;
                    int i24 = (-2) - (((i23 & 106) + (i23 | 106)) ^ (-1));
                    f58231b = i24 % 128;
                    int i25 = i24 % 2;
                    break;
                }
                int i26 = f58231b;
                int i27 = i26 & 43;
                int i28 = ((i26 ^ 43) | i27) << 1;
                int i29 = -((i26 | 43) & (~i27));
                int i30 = (i28 & i29) + (i29 | i28);
                f58230a = i30 % 128;
                if (i30 % 2 != 0) {
                    Intrinsics.areEqual(setaccessibilitytraversalafterArrValues[i13].setDividerPadding(), str);
                    throw null;
                }
                setAccessibilityTraversalAfter setaccessibilitytraversalafter2 = setaccessibilitytraversalafterArrValues[i13];
                if (Intrinsics.areEqual(setaccessibilitytraversalafter2.setDividerPadding(), str)) {
                    int i31 = f58231b + 13;
                    f58230a = i31 % 128;
                    if (i31 % 2 != 0) {
                        throw null;
                    }
                    setaccessibilitytraversalafter = setaccessibilitytraversalafter2;
                    break;
                }
                i13 = ((((i13 ^ 1) | (i13 & 1)) << 1) - (~(-(((~i13) & 1) | (i13 & (-2)))))) - 1;
                int i32 = f58230a;
                int i33 = (i32 & (-40)) | ((~i32) & 39);
                int i34 = (i32 & 39) << 1;
                i21 = (i33 ^ i34) + ((i34 & i33) << 1);
                f58231b = i21 % 128;
            }
            if (setaccessibilitytraversalafter == null) {
                throw new setScrollY();
            }
            int i35 = (-2) - ((f58230a + 32) ^ (-1));
            f58231b = i35 % 128;
            int i36 = i35 % 2;
            return setaccessibilitytraversalafter;
        }
    }

    static {
        d();
        $10 = 0;
        $11 = 1;
        getSuppressed = 0;
        setLayoutDirection = 1;
        e();
        Object[] objArr = new Object[1];
        a("腾脺偹㸹ꔖ社ᾐ㦍皂喊\ued92因\uf032轓㐩", -TextUtils.lastIndexOf("", '0', 0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18, "\u001b \u000b\u0014\u001a\u0017\t\n!\u0001\u001e\f\u001d!\u0012\u0015\t\u001a㘴", (byte) (View.combineMeasuredStates(0, 0) + 53), objArr2);
        setAccessibilityTraversalAfter setaccessibilitytraversalafter = new setAccessibilityTraversalAfter(strIntern, ((String) objArr2[0]).intern(), false, 0, true);
        setX = setaccessibilitytraversalafter;
        Object[] objArr3 = new Object[1];
        a("㘋㙏ᆠ翠ꘜ稴伴軸㝾Ԯ\uee8fٟ䝢캙㜲뻘\u1fd4蘩籗煡", (ViewConfiguration.getEdgeSlop() >> 16) + 1, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        b(24 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u001b \u000b\u0014\u001a\u0017\t\n!\u0001\u001e\f㘹㘹\u0005\u0015\u0018\u0014\u0016\u0006\u0019\u0004\u0002\t", (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 60), objArr4);
        setAccessibilityTraversalAfter setaccessibilitytraversalafter2 = new setAccessibilityTraversalAfter(strIntern2, ((String) objArr4[0]).intern(), false, 1, true);
        setDividerPadding = setaccessibilitytraversalafter2;
        Object[] objArr5 = new Object[1];
        a("ሩቭ퀮빢ꡖ瑮⡔꫞\uf6e3扞\ue0df愯捸༠㥳\ud9a7㯡䞪爆ᘁ\uf00a", 1 - (Process.myPid() >> 22), objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a("끄뀅癢ᠩ欂뜬亗ࢿ傲Ҋ⎖ޤ섨ꥆ館뽸馛\ue1f7녅烓剭♔\u09d9⡛⫔缎쁬\ue1ad\ue34f", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr6);
        setAccessibilityTraversalAfter setaccessibilitytraversalafter3 = new setAccessibilityTraversalAfter(strIntern3, ((String) objArr6[0]).intern(), true, 2, true);
        setCompoundDrawableTintBlendMode = setaccessibilitytraversalafter3;
        Object[] objArr7 = new Object[1];
        b(14 - ((Process.getThreadPriority(0) + 20) >> 6), "\u0003\u0004 \u0018㗸㗸\u0005\u000f\u0016\u0006\u0013\u0015\u001b#", (byte) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10), objArr7);
        String strIntern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        b(View.MeasureSpec.getSize(0) + 22, "\u001b \u000b\u0014\u001a\u0017\t\n\u0003\u0004 \u0018㙓㙓\u0005\u000f\u0016\u0006\u0013\u0015\u001b#", (byte) (100 - TextUtils.lastIndexOf("", '0', 0, 0)), objArr8);
        setAccessibilityTraversalAfter setaccessibilitytraversalafter4 = new setAccessibilityTraversalAfter(strIntern4, ((String) objArr8[0]).intern(), true, 3, true);
        setOnLongClickListener = setaccessibilitytraversalafter4;
        Object[] objArr9 = new Object[1];
        a("ත\u0de1趠\ue3e4ф\ud87bए땚ꭱ䌎䳀䁿糄劎镽\uf8f0⑧ᨨ\ude09㝌\uef98\udda6", 1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr9);
        String strIntern5 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        a("壕墔⧥䞮놌涢샤\ue02e༵諹落觗⦱\uf6c9₥\u3100焊빬毁ﺠ뫄秳퍌\ua62f쉇₅\u1af8濃ை\ue80b", TextUtils.getOffsetAfter("", 0) + 1, objArr10);
        setAccessibilityTraversalAfter setaccessibilitytraversalafter5 = new setAccessibilityTraversalAfter(strIntern5, ((String) objArr10[0]).intern(), false, 4, true);
        setNavigationOnClickListener = setaccessibilitytraversalafter5;
        Object[] objArr11 = new Object[1];
        b(23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\u0016\u0007\"\u0004\t\u001c\u0001\t\u0005\u000f\u0018\u000b\u0016\u001d\u0005\u000f \u0017\"\t\u0012#", (byte) (Color.argb(0, 0, 0, 0) + 3), objArr11);
        String strIntern6 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        b(TextUtils.indexOf("", "") + 30, "\u001b \u000b\u0014\u001a\u0017\t\n\u0016\u0007\"\u0004\t\u001c\u0001\t\u0005\u000f\u0018\u000b\u0016\u001d\u0005\u000f \u0017\"\t\u0012#", (byte) (AndroidCharacter.getMirror('0') - 3), objArr12);
        setTextScaleX = new setAccessibilityTraversalAfter(strIntern6, ((String) objArr12[0]).intern(), true, 5, true);
        Object[] objArr13 = new Object[1];
        b(7 - TextUtils.indexOf((CharSequence) "", '0', 0), "\u0016\u0007\"\u0004\t\u001c\u0005\u000f", (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr13);
        String strIntern7 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        b(16 - (ViewConfiguration.getLongPressTimeout() >> 16), "\u001b \u000b\u0014\u001a\u0017\t\n\u0016\u0007\"\u0004\t\u001c\u0005\u000f", (byte) (57 - Color.blue(0)), objArr14);
        setCompoundDrawablePadding = new setAccessibilityTraversalAfter(strIntern7, ((String) objArr14[0]).intern(), false, 6, true);
        Object[] objArr15 = new Object[1];
        b((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 13, "\u0012\u0001\u0006\"\u000f \u0015\u0000\u001d\u0015\u0015\u0013㙙", (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 118), objArr15);
        String strIntern8 = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        a("혝활煱Ἲ礼ꔒꆵ滦垡\ueba8ㆨ\ue886ꝥ깐\ue801偆￨\ue6feꍠ鿦㐪ⅶᯡ읣䲀", 1 - View.MeasureSpec.getMode(0), objArr16);
        setAccessibilityTraversalAfter setaccessibilitytraversalafter6 = new setAccessibilityTraversalAfter(strIntern8, ((String) objArr16[0]).intern(), true, 7, false);
        setOnDragListener = setaccessibilitytraversalafter6;
        Object[] objArr17 = new Object[1];
        b(KeyEvent.keyCodeFromString("") + 11, "\f\"\f\u0017\u0002!\u0014\u0012\u001c\u0005㙙", (byte) (KeyEvent.getDeadChar(0, 0) + 112), objArr17);
        String strIntern9 = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        b((ViewConfiguration.getFadingEdgeLength() >> 16) + 24, "\u001b \u000b\u0014\u001a\u0017\t\n\f\"\f\u0017\u0002!\u0014\u0012\u001c\u0005\u0005\u0015\u0013\u0015\u0005\u000f", (byte) ((KeyEvent.getMaxKeyCode() >> 16) + 72), objArr18);
        setAccessibilityTraversalAfter setaccessibilitytraversalafter7 = new setAccessibilityTraversalAfter(strIntern9, ((String) objArr18[0]).intern(), false, 8, true);
        setLayoutAnimation = setaccessibilitytraversalafter7;
        Object[] objArr19 = new Object[1];
        a("榠槴朞फ़҅\ud8bdἕ텝䇉唗䰂噸ᣉ렣閿\ueec4䁹\uf09d\udece⅛讗㜊晅秄\uf321", 1 - KeyEvent.keyCodeFromString(""), objArr19);
        String strIntern10 = ((String) objArr19[0]).intern();
        Object[] objArr20 = new Object[1];
        b(KeyEvent.normalizeMetaState(0) + 29, "\u001b \u000b\u0014\u001a\u0017\t\n\u0000\u0004\u0014#\u0015 \u0006\u0004\u001c\u0002\u0001\"\u0000\u001b\t\u0018\u001c\t\u001e\u0006㘻", (byte) (View.MeasureSpec.getSize(0) + 60), objArr20);
        setAccessibilityTraversalAfter setaccessibilitytraversalafter8 = new setAccessibilityTraversalAfter(strIntern10, ((String) objArr20[0]).intern(), false, 9, true);
        getNavBarTitleString = setaccessibilitytraversalafter8;
        Object[] objArr21 = new Object[1];
        b((ViewConfiguration.getDoubleTapTimeout() >> 16) + 17, "\u0011\u0018㗺㗺\u001b#\u0017\u0015\u0019\f\u0005\u0015\u000e\u0017\u001b#㗬", (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2), objArr21);
        String strIntern11 = ((String) objArr21[0]).intern();
        Object[] objArr22 = new Object[1];
        a("킕탖懸ྲ\uf3c4\u2fe3磼桮䜯㋾묐ㆱꇔ뻗拇褌拏\uf66a⦌䚺㊫ㇾ", 1 - View.MeasureSpec.getMode(0), objArr22);
        setAccessibilityTraversalAfter setaccessibilitytraversalafter9 = new setAccessibilityTraversalAfter(strIntern11, ((String) objArr22[0]).intern(), false, 10, true);
        setZ = setaccessibilitytraversalafter9;
        Object[] objArr23 = new Object[1];
        a("\udecb\ude8f\u1fdc熋‹ﰝὋ昍㤀啃械嘵꾏샥", (ViewConfiguration.getLongPressTimeout() >> 16) + 1, objArr23);
        String strIntern12 = ((String) objArr23[0]).intern();
        Object[] objArr24 = new Object[1];
        b(19 - KeyEvent.normalizeMetaState(0), "\u0000\u0004\u0014#\u0015 \u0006\u0004\u0007!\u0015#\u0019\t\u0005\u000f\f\u0006㘝", (byte) (47 - (Process.myTid() >> 22)), objArr24);
        setAccessibilityTraversalAfter setaccessibilitytraversalafter10 = new setAccessibilityTraversalAfter(strIntern12, ((String) objArr24[0]).intern(), true, 11, true);
        setTextAlignment = setaccessibilitytraversalafter10;
        Object[] objArr25 = new Object[1];
        a("\udeb1\udef2鬍\uf547掆뾡恩晊뷚⩫⬫⤁꿴䐥\uf290醔\uf768ಏ만", (Process.myPid() >> 22) + 1, objArr25);
        String strIntern13 = ((String) objArr25[0]).intern();
        Object[] objArr26 = new Object[1];
        a("䩌䨏衬\ue626⼶\uf311ǉ\uf2b7꺻䯋柢䢜㬍坌븆\uf01f掘Ῠ\uf574㾋", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr26);
        setAccessibilityTraversalAfter setaccessibilitytraversalafter11 = new setAccessibilityTraversalAfter(strIntern13, ((String) objArr26[0]).intern(), true, 12, true);
        setIncludeFontPadding = setaccessibilitytraversalafter11;
        Object[] objArr27 = new Object[1];
        a("\ue780\ue7c3ژ棜祯ꕗᎅ彆⁄妎\u31e8嫩雍\ud9a7\ue86c\ue277칚鄖", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr27);
        String strIntern14 = ((String) objArr27[0]).intern();
        Object[] objArr28 = new Object[1];
        a("\ue780\ue7c3ژ棜祯ꕗᎅ彆⁄妎\u31e8嫩雍\ud9a7\ue86c\ue277칚鄖", 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr28);
        setAccessibilityTraversalAfter setaccessibilitytraversalafter12 = new setAccessibilityTraversalAfter(strIntern14, ((String) objArr28[0]).intern(), false, 13, true);
        UiMessageCallbackKtWhenMappings = setaccessibilitytraversalafter12;
        int i10 = getSuppressed;
        int i11 = i10 + 53;
        setLayoutDirection = i11 % 128;
        int i12 = i11 % 2;
        setAccessibilityTraversalAfter[] setaccessibilitytraversalafterArr = {setaccessibilitytraversalafter, setaccessibilitytraversalafter2, setaccessibilitytraversalafter3, setaccessibilitytraversalafter4, setaccessibilitytraversalafter5, setTextScaleX, setCompoundDrawablePadding, setaccessibilitytraversalafter6, setaccessibilitytraversalafter7, setaccessibilitytraversalafter8, setaccessibilitytraversalafter9, setaccessibilitytraversalafter10, setaccessibilitytraversalafter11, setaccessibilitytraversalafter12};
        int i13 = i10 + 105;
        setLayoutDirection = i13 % 128;
        int i14 = i13 % 2;
        setOnEditorActionListener = setaccessibilitytraversalafterArr;
        INSTANCE = new Companion(null);
        int i15 = setLayoutDirection + 45;
        getSuppressed = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    public setAccessibilityTraversalAfter(String str, String str2, boolean z10, int i10, boolean z11) {
        super(str, i10);
        this.setDividerPadding = z10;
        this.setCompoundDrawableTintBlendMode = z11;
        this.setX = str2;
        this.setOnFocusChangeListener = 1;
    }

    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        int i11 = $10;
        int i12 = i11 + 47;
        $11 = i12 % 128;
        int i13 = i12 % 2;
        int i14 = i11 + 107;
        $11 = i14 % 128;
        if (i14 % 2 == 0) {
            str.toCharArray();
            throw null;
        }
        char[] charArray = str.toCharArray();
        setOnDragListener setondraglistener = new setOnDragListener();
        char[] y7 = setOnDragListener.setY(setMinHeight ^ 2122665171656649951L, charArray, i10);
        setondraglistener.setDividerPadding = 4;
        while (true) {
            int i15 = setondraglistener.setDividerPadding;
            if (i15 >= y7.length) {
                objArr[0] = new String(y7, 4, y7.length - 4);
                return;
            }
            int i16 = i15 - 4;
            setondraglistener.setX = i16;
            try {
                Object[] objArr2 = {Long.valueOf(y7[i15] ^ y7[i15 % 4]), Long.valueOf(i16), Long.valueOf(setMinHeight)};
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(2144228148);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (ImageFormat.getBitsPerPixel(0) + 9780), 42 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 3187 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                    Class<?> cls2 = Long.TYPE;
                    method = cls.getMethod("y", cls2, cls2, cls2);
                    map.put(2144228148, method);
                }
                y7[i15] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setondraglistener, setondraglistener};
                Object method2 = map.get(-62642757);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) ExpandableListView.getPackedPositionGroup(0L), MotionEvent.axisFromString("") + 53, 3029 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 - 1);
                    Object[] objArr4 = new Object[1];
                    c(b10, (byte) (b11 & MessageUtils.MESSAGE_18_DC2), b11, objArr4);
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

    public static void b(int i10, String str, byte b10, Object[] objArr) throws Throwable {
        int i11;
        int i12 = $11 + 79;
        $10 = i12 % 128;
        if (i12 % 2 != 0) {
            str.toCharArray();
            throw null;
        }
        char[] charArray = str.toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr = setMaxEms;
        int i13 = 290255894;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i14 = 0;
            while (i14 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i14])};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i13));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.getTrimmedLength("") + 45, 1115 - ExpandableListView.getPackedPositionChild(0L));
                        byte b11 = (byte) 0;
                        byte b12 = (byte) (b11 - 1);
                        Object[] objArr3 = new Object[1];
                        c(b11, (byte) (b12 + 1), b12, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr2[i14] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i14++;
                    i13 = 290255894;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(setImageResource)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (Process.myTid() >> 22), 45 - Color.blue(0), 1116 - Drawable.resolveOpacity(0, 0));
            byte b13 = (byte) 0;
            byte b14 = (byte) (b13 - 1);
            Object[] objArr5 = new Object[1];
            c(b13, (byte) (b14 + 1), b14, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(290255894, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            i11 = i10 - 1;
            cArr3[i11] = (char) (charArray[i11] - b10);
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            setincludefontpadding.setDividerPadding = 0;
            while (true) {
                int i15 = setincludefontpadding.setDividerPadding;
                if (i15 >= i11) {
                    break;
                }
                char c10 = charArray[i15];
                setincludefontpadding.setY = c10;
                int i16 = i15 + 1;
                char c11 = charArray[i16];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c11;
                if (c10 == c11) {
                    int i17 = $11 + 11;
                    $10 = i17 % 128;
                    if (i17 % 2 != 0) {
                        cArr3[i15] = (char) (c10 - b10);
                        cArr3[i15 >>> 1] = (char) (c11 + b10);
                    } else {
                        cArr3[i15] = (char) (c10 - b10);
                        cArr3[i16] = (char) (c11 - b10);
                    }
                } else {
                    Object[] objArr6 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(180437302);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 28 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 2311);
                        byte b15 = (byte) 0;
                        byte b16 = (byte) (b15 - 1);
                        Object[] objArr7 = new Object[1];
                        c(b15, (byte) (b16 + 4), b16, objArr7);
                        String str2 = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(180437302, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i18 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i18) {
                        Object[] objArr8 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method4 = map3.get(1989802713);
                        if (method4 == null) {
                            Class cls5 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 49103), ((Process.getThreadPriority(0) + 20) >> 6) + 35, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2544);
                            byte b17 = (byte) 0;
                            byte b18 = (byte) (b17 - 1);
                            Object[] objArr9 = new Object[1];
                            c(b17, (byte) (b18 & 7), b18, objArr9);
                            String str3 = (String) objArr9[0];
                            Class<?> cls6 = Integer.TYPE;
                            method4 = cls5.getMethod(str3, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(1989802713, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i19 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i20 = setincludefontpadding.setDividerPadding;
                        cArr3[i20] = cArr[iIntValue2];
                        cArr3[i20 + 1] = cArr[i19];
                    } else {
                        int i21 = setincludefontpadding.setX;
                        int i22 = setincludefontpadding.setOnFocusChangeListener;
                        if (i21 == i22) {
                            int i23 = $10 + 51;
                            $11 = i23 % 128;
                            int i24 = i23 % 2;
                            int iA = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding.setOnLongClickListener = iA;
                            int iA2 = a.a(i18, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i25 = (i22 * cCharValue) + iA2;
                            int i26 = setincludefontpadding.setDividerPadding;
                            cArr3[i26] = cArr[(i21 * cCharValue) + iA];
                            cArr3[i26 + 1] = cArr[i25];
                        } else {
                            int i27 = (i21 * cCharValue) + i18;
                            int i28 = (i22 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                            int i29 = setincludefontpadding.setDividerPadding;
                            cArr3[i29] = cArr[i27];
                            cArr3[i29 + 1] = cArr[i28];
                        }
                    }
                }
                setincludefontpadding.setDividerPadding += 2;
            }
        }
        for (int i30 = 0; i30 < i10; i30++) {
            int i31 = $10 + 49;
            $11 = i31 % 128;
            int i32 = i31 % 2;
            cArr3[i30] = (char) (cArr3[i30] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.mypinpad.tsdk.isolation.setAccessibilityTraversalAfter.$$a
            int r7 = r7 + 99
            int r8 = r8 + 4
            int r6 = r6 * 3
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L33
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r8]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L33:
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setAccessibilityTraversalAfter.c(byte, byte, short, java.lang.Object[]):void");
    }

    public static void d() {
        $$a = new byte[]{39, 44, -32, 72};
        $$b = 97;
    }

    public static void e() {
        setMinHeight = 2860133891872211706L;
        setImageResource = (char) 53959;
        setMaxEms = new char[]{59191, 59187, 59152, 59198, 59179, 59151, 59182, 59145, 59199, 59254, 59194, 58560, 59160, 59149, 59154, 58561, 59144, 59176, 59183, 59147, 59186, 59197, 59159, 59177, 59193, 59195, 59162, 59196, 59192, 59188, 59170, 59167, 59190, 59189, 59184, 59161};
    }

    public static setAccessibilityTraversalAfter valueOf(String str) {
        int i10 = setLayoutDirection + 37;
        getSuppressed = i10 % 128;
        int i11 = i10 % 2;
        setAccessibilityTraversalAfter setaccessibilitytraversalafter = (setAccessibilityTraversalAfter) Enum.valueOf(setAccessibilityTraversalAfter.class, str);
        int i12 = getSuppressed + 41;
        setLayoutDirection = i12 % 128;
        int i13 = i12 % 2;
        return setaccessibilitytraversalafter;
    }

    public static setAccessibilityTraversalAfter[] values() {
        int i10 = getSuppressed + 123;
        setLayoutDirection = i10 % 128;
        if (i10 % 2 != 0) {
            return (setAccessibilityTraversalAfter[]) setOnEditorActionListener.clone();
        }
        int i11 = 39 / 0;
        return (setAccessibilityTraversalAfter[]) setOnEditorActionListener.clone();
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final int setCompoundDrawableTintBlendMode() {
        int i10 = getSuppressed + 59;
        int i11 = i10 % 128;
        setLayoutDirection = i11;
        int i12 = i10 % 2;
        int i13 = this.setOnFocusChangeListener;
        int i14 = i11 + 15;
        getSuppressed = i14 % 128;
        if (i14 % 2 == 0) {
            return i13;
        }
        throw null;
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public final String setDividerPadding() {
        int i10 = setLayoutDirection + 77;
        int i11 = i10 % 128;
        getSuppressed = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        String str = this.setX;
        int i12 = i11 + 73;
        setLayoutDirection = i12 % 128;
        if (i12 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @JvmName(name = "setY")
    public final boolean setY() {
        int i10 = getSuppressed;
        int i11 = i10 + 9;
        setLayoutDirection = i11 % 128;
        int i12 = i11 % 2;
        boolean z10 = this.setCompoundDrawableTintBlendMode;
        int i13 = i10 + 123;
        setLayoutDirection = i13 % 128;
        if (i13 % 2 != 0) {
            return z10;
        }
        throw null;
    }
}
