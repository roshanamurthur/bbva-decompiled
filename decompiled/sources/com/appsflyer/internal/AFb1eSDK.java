package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class AFb1eSDK {
    private static long AFInAppEventParameterName = 0;
    private static int AFInAppEventType = 0;
    private static char AFKeystoreWrapper = 0;
    private static char afDebugLog = 0;
    private static int afErrorLog = 0;
    private static char afInfoLog = 0;
    private static int afRDLog = 1;
    private static char valueOf;
    private static char values;

    static {
        values();
        ExpandableListView.getPackedPositionForChild(0, 0);
        Process.getGidForName("");
        Process.getGidForName("");
        ViewConfiguration.getScrollBarFadeDuration();
        ViewConfiguration.getGlobalActionKeyTimeout();
        Color.green(0);
        Color.alpha(0);
        KeyEvent.getDeadChar(0, 0);
        KeyEvent.getMaxKeyCode();
        ViewConfiguration.getFadingEdgeLength();
        ViewConfiguration.getPressedStateDuration();
        Color.argb(0, 0, 0, 0);
        ExpandableListView.getPackedPositionForGroup(0);
        AndroidCharacter.getMirror('0');
        int i10 = afRDLog + 71;
        afErrorLog = i10 % 128;
        int i11 = i10 % 2;
    }

    private static String AFInAppEventParameterName(String str, Long l6) {
        int i10 = afErrorLog;
        int i11 = i10 + 109;
        afRDLog = i11 % 128;
        int i12 = i11 % 2;
        if (str != null) {
            int i13 = i10 + 11;
            afRDLog = i13 % 128;
            int i14 = i13 % 2;
            if (l6 != null && str.length() == 32) {
                StringBuilder sb2 = new StringBuilder(str);
                String string = l6.toString();
                int numericValue = 0;
                for (int i15 = 0; i15 < string.length(); i15++) {
                    numericValue += Character.getNumericValue(string.charAt(i15));
                }
                String hexString = Integer.toHexString(numericValue);
                sb2.replace(7, hexString.length() + 7, hexString);
                long numericValue2 = 0;
                int i16 = 0;
                while (i16 < sb2.length()) {
                    numericValue2 += (long) Character.getNumericValue(sb2.charAt(i16));
                    i16++;
                    int i17 = afErrorLog + 53;
                    afRDLog = i17 % 128;
                    int i18 = i17 % 2;
                }
                while (numericValue2 > 100) {
                    numericValue2 %= 100;
                }
                sb2.insert(23, (int) numericValue2);
                if (numericValue2 < 10) {
                    Object[] objArr = new Object[1];
                    valueOf((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 63594), "\u0000\u0000\u0000\u0000", "㭫爏檵컸", "鄮", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 1250816196, objArr);
                    sb2.insert(23, ((String) objArr[0]).intern());
                }
                return sb2.toString();
            }
        }
        Object[] objArr2 = new Object[1];
        AFInAppEventParameterName("\ude4bี늷뗪ᒓ\udb04휑翭䛢ﶇ\u1ae1솆貇漥룑쏩吐닁\udce1\u3d0e1\ud8b4葬氕߃\uf57e虶\uea14⸰떂ṡ\ue2e1", 32 - View.MeasureSpec.getMode(0), objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        int i19 = afRDLog + 21;
        afErrorLog = i19 % 128;
        int i20 = i19 % 2;
        return strIntern;
    }

    private static String AFInAppEventType(String str) {
        int i10 = afErrorLog + 81;
        afRDLog = i10 % 128;
        if (i10 % 2 != 0) {
            return AFb1zSDK.AFKeystoreWrapper(AFb1zSDK.AFInAppEventParameterName(str));
        }
        int i11 = 8 / 0;
        return AFb1zSDK.AFKeystoreWrapper(AFb1zSDK.AFInAppEventParameterName(str));
    }

    private static String AFKeystoreWrapper(String str, String str2, int i10) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.setCharAt(i10, values(str2).charAt(0));
        String string = sb2.toString();
        int i11 = afErrorLog + 71;
        afRDLog = i11 % 128;
        if (i11 % 2 != 0) {
            return string;
        }
        throw null;
    }

    @Nullable
    public static String valueOf(Context context, long j10) {
        String strIntern;
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        Object[] objArr = new Object[1];
        valueOf((char) View.combineMeasuredStates(0, 0), "\u0000\u0000\u0000\u0000", "\ued0c妅\ue8d6⏡", "愜\u09b3㯓䚦\ud953\u0ec7똋㯲䵱ዀ邵画鏨쇌\ue21b똦軰瞹葈䚈ﰏ色㐃됂徍脎\uda6e覛ꆋꜣ\u0bad✣ﺢ㧗", TextUtils.indexOf("", "", 0, 0), objArr);
        if (AFInAppEventParameterName(((String) objArr[0]).intern())) {
            int i10 = afRDLog + 63;
            afErrorLog = i10 % 128;
            if (i10 % 2 != 0) {
                Object[] objArr2 = new Object[1];
                valueOf((char) (54127 >>> (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", "嬤寏澫ồ", "뾌", ViewConfiguration.getFadingEdgeLength() - 1420046543, objArr2);
                strIntern = ((String) objArr2[0]).intern();
            } else {
                Object[] objArr3 = new Object[1];
                valueOf((char) (54127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", "嬤寏澫ồ", "뾌", (-1420046501) - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr3);
                strIntern = ((String) objArr3[0]).intern();
            }
            int i11 = afErrorLog + 13;
            afRDLog = i11 % 128;
            int i12 = i11 % 2;
        } else {
            Object[] objArr4 = new Object[1];
            valueOf((char) (TextUtils.indexOf((CharSequence) "", '0') + 63595), "\u0000\u0000\u0000\u0000", "㭫爏檵컸", "鄮", (-1250816197) - Color.argb(0, 0, 0, 0), objArr4);
            strIntern = ((String) objArr4[0]).intern();
        }
        sb3.append(strIntern);
        sb2.append(AFKeystoreWrapper(context, sb3));
        try {
            long j11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
            Object[] objArr5 = new Object[1];
            AFInAppEventParameterName("ꁅ㈄ꁅ㈄\ud989柁ᯏ쟗謘飝퓥\uf3ee倠눞䜮撏콌\uf69f", 18 - View.combineMeasuredStates(0, 0), objArr5);
            sb2.append(new SimpleDateFormat(((String) objArr5[0]).intern(), Locale.US).format(new Date(j11)));
            int i13 = afErrorLog + 67;
            afRDLog = i13 % 128;
            int i14 = i13 % 2;
            sb2.append(j10);
            valueOf(sb4);
            return AFInAppEventParameterName(AFKeystoreWrapper(AFKeystoreWrapper(AFInAppEventType(sb2.toString()), sb3.toString(), 17), sb4.toString(), 27), Long.valueOf(j10));
        } catch (PackageManager.NameNotFoundException e5) {
            Object[] objArr6 = new Object[1];
            AFInAppEventParameterName("ꄗ鎜䰵븞ᬲ뱥\uebd7凣ౝ\udfe2핶羚䪤\u05fb⡁響㋶Ⱃ诶ᥛ닷驂⠚뾭矂璲원\ueb26", ImageFormat.getBitsPerPixel(0) + 29, objArr6);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr6[0]).intern(), e5);
            Object[] objArr7 = new Object[1];
            AFInAppEventParameterName("\ude4bี늷뗪ᒓ\udb04휑翭䛢ﶇ\u1ae1솆貇漥룑쏩吐닁\udce1\u3d0e1\ud8b4葬氕߃\uf57e虶\uea14⸰떂ṡ\ue2e1", 32 - TextUtils.indexOf("", "", 0), objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    public static void values() {
        AFInAppEventType = 0;
        AFKeystoreWrapper = (char) 19325;
        AFInAppEventParameterName = 0L;
        values = (char) 55185;
        afDebugLog = (char) 62718;
        valueOf = (char) 51046;
        afInfoLog = (char) 53155;
    }

    private static String values(String str) {
        int i10 = afErrorLog + 15;
        afRDLog = i10 % 128;
        int i11 = i10 % 2;
        String string = Integer.toString(Integer.parseInt(str, 2), 16);
        int i12 = afRDLog + 57;
        afErrorLog = i12 % 128;
        if (i12 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public static class AFa1xSDK extends HashMap<String, Object> {
        private static char[] AFInAppEventType = null;
        private static int afDebugLog = 1;
        private static int afRDLog;
        private static char valueOf;
        private static int[] values;
        private final Map<String, Object> AFInAppEventParameterName;
        private final Context AFKeystoreWrapper;

        static {
            valueOf();
            Process.getThreadPriority(0);
            Color.red(0);
            View.resolveSizeAndState(0, 0, 0);
            TextUtils.indexOf((CharSequence) "", '0', 0);
            ViewConfiguration.getTouchSlop();
            TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            Color.blue(0);
            KeyEvent.getModifierMetaStateMask();
            ViewConfiguration.getEdgeSlop();
            MotionEvent.axisFromString("");
            ViewConfiguration.getScrollDefaultDelay();
            int i10 = afRDLog + 83;
            afDebugLog = i10 % 128;
            int i11 = i10 % 2;
        }

        public AFa1xSDK(Map<String, Object> map, Context context) {
            this.AFInAppEventParameterName = map;
            this.AFKeystoreWrapper = context;
            put(AFInAppEventParameterName(), AFInAppEventType());
        }

        @NonNull
        private String AFInAppEventParameterName() {
            int i10 = afRDLog + 95;
            afDebugLog = i10 % 128;
            int i11 = i10 % 2;
            try {
                String string = Integer.toString(Build.VERSION.SDK_INT);
                Map<String, Object> map = this.AFInAppEventParameterName;
                Object[] objArr = new Object[1];
                AFInAppEventParameterName(new int[]{1778309776, -811727697, -2144580672, 291596461, -328504224, -511155222}, Drawable.resolveOpacity(0, 0) + 12, objArr);
                String string2 = map.get(((String) objArr[0]).intern()).toString();
                Map<String, Object> map2 = this.AFInAppEventParameterName;
                Object[] objArr2 = new Object[1];
                AFInAppEventType((byte) ((Process.myPid() >> 22) + 95), "\u0017\u0007. 㙝", TextUtils.getCapsMode("", 0, 0) + 5, objArr2);
                String string3 = map2.get(((String) objArr2[0]).intern()).toString();
                if (string3 == null) {
                    int i12 = afRDLog + 57;
                    afDebugLog = i12 % 128;
                    int i13 = i12 % 2;
                    Object[] objArr3 = new Object[1];
                    AFInAppEventType((byte) (9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "-\u0001\u0000\u0010\u0005\u000f\u0001+", 8 - Color.argb(0, 0, 0, 0), objArr3);
                    string3 = ((String) objArr3[0]).intern();
                }
                StringBuilder sb2 = new StringBuilder(string2);
                sb2.reverse();
                StringBuilder sbValues = values(string, string3, sb2.toString());
                int length = sbValues.length();
                if (length > 4) {
                    int i14 = afRDLog + 99;
                    afDebugLog = i14 % 128;
                    if (i14 % 2 == 0) {
                        sbValues.delete(3, length);
                    } else {
                        sbValues.delete(4, length);
                    }
                } else {
                    while (length < 4) {
                        length++;
                        sbValues.append('1');
                    }
                }
                Object[] objArr4 = new Object[1];
                AFInAppEventParameterName(new int[]{2088029896, 1668591072}, 3 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
                sbValues.insert(0, ((String) objArr4[0]).intern());
                return sbValues.toString();
            } catch (Exception e5) {
                Object[] objArr5 = new Object[1];
                AFInAppEventType((byte) (75 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), "\u000f\u00170/\u0006*\u0013-\u0010\u0011 &\t\u001d*\f\u000f\u0017.\u001a,\f.\u0004\u000b\u0016\u0017\u000f!*\u001e\u0011!*\u0010\u0011+\u00070 ", 40 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr5);
                AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e5);
                StringBuilder sb3 = new StringBuilder();
                Object[] objArr6 = new Object[1];
                AFInAppEventType((byte) (38 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), " &\t\u001d*\f\u000f\u0017.\u001a,\f.\u0004\u000b\u0016\u0017\u000f!*\u001e\u0011!*\u0010\u0011+\u00070 \u0013,.\u0002+!+\u000b\u000b\u001b\u001e\u0013", 42 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr6);
                sb3.append(((String) objArr6[0]).intern());
                sb3.append(e5);
                AFLogger.afRDLog(sb3.toString());
                Object[] objArr7 = new Object[1];
                AFInAppEventParameterName(new int[]{-1705480036, -41642021, -1744439853, -1046563467}, Process.getGidForName("") + 8, objArr7);
                return ((String) objArr7[0]).intern();
            }
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0204  */
        private String AFInAppEventType() {
            String string;
            int i10;
            try {
                Map<String, Object> map = this.AFInAppEventParameterName;
                Object[] objArr = new Object[1];
                AFInAppEventParameterName(new int[]{1778309776, -811727697, -2144580672, 291596461, -328504224, -511155222}, Color.alpha(0) + 12, objArr);
                String string2 = map.get(((String) objArr[0]).intern()).toString();
                Map<String, Object> map2 = this.AFInAppEventParameterName;
                Object[] objArr2 = new Object[1];
                AFInAppEventType((byte) (2 - (KeyEvent.getMaxKeyCode() >> 16)), "\u001d\n\r\u0010\u0004'($ \u000b\u001d).\u0004㘁", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15, objArr2);
                String string3 = map2.get(((String) objArr2[0]).intern()).toString();
                Object[] objArr3 = new Object[1];
                AFInAppEventParameterName(new int[]{-957037223, -48509119, -781409150, -1864855913}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6, objArr3);
                String strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                AFInAppEventType((byte) ((-16777094) - Color.rgb(0, 0, 0)), "\u0002\r\u0003\u000b㘪", MotionEvent.axisFromString("") + 6, objArr4);
                String strReplaceAll = strIntern.replaceAll(((String) objArr4[0]).intern(), "");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string2);
                sb2.append(string3);
                sb2.append(strReplaceAll);
                String strAFInAppEventParameterName = AFb1zSDK.AFInAppEventParameterName(sb2.toString());
                StringBuilder sb3 = new StringBuilder("");
                sb3.append(strAFInAppEventParameterName.substring(0, 16));
                string = sb3.toString();
            } catch (Exception e5) {
                Object[] objArr5 = new Object[1];
                AFInAppEventParameterName(new int[]{-416946030, 710826945, -721845652, -606805070, -656728386, -824473881, 2061236325, -373006266, -1963241931, 776244818, -1295737303, 1768028883, -1965365971, -1459769893, -1630881150, -1791863435, -1181216282, 1355290083, -1266044688, -1956450597}, 38 - (ViewConfiguration.getTouchSlop() >> 8), objArr5);
                AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e5);
                StringBuilder sb4 = new StringBuilder();
                Object[] objArr6 = new Object[1];
                AFInAppEventType((byte) (98 - Color.blue(0)), " &\t\u001d*\f\u000f\u0017.\u001a,\f.\u0004\u000b\u0016\u0017\u000f!*\u001e\u0011&(\u001c%,\u0013+\u00070 \u0013,.\u0002+!+\u000b\u000b\u001b\u001e\u0013", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43, objArr6);
                sb4.append(((String) objArr6[0]).intern());
                sb4.append(e5);
                AFLogger.afRDLog(sb4.toString());
                StringBuilder sb5 = new StringBuilder("");
                Object[] objArr7 = new Object[1];
                AFInAppEventParameterName(new int[]{-1151461714, 1565074594, -1850512278, 514834606, 1194055798, -1696618900, 1536878782, -1259306217, 1783200123, 1729847339}, 18 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr7);
                sb5.append(((String) objArr7[0]).intern());
                string = sb5.toString();
            }
            String str = string;
            try {
                Context context = this.AFKeystoreWrapper;
                Object[] objArr8 = new Object[1];
                AFInAppEventParameterName(new int[]{2044496534, 528388750, -1686629640, 1835117483, 1770770382, -1235532254, -714927166, 1500939199, -464379084, 560559935, 1727326430, -1030033190, -1619800523, 296789805, 1253235640, -1524000400, 193545974, -652606870, 828608735, -1376456997}, Color.alpha(0) + 37, objArr8);
                Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter(((String) objArr8[0]).intern()));
                int intExtra = -2700;
                if (intentRegisterReceiver != null) {
                    int i11 = afDebugLog + 37;
                    afRDLog = i11 % 128;
                    if (i11 % 2 != 0) {
                        Object[] objArr9 = new Object[1];
                        AFInAppEventType((byte) (64 % ((byte) KeyEvent.getModifierMetaStateMask())), "/0$\u001f,\f.\u0004%\u0007㙈", 77 >>> Color.green(0), objArr9);
                        intExtra = intentRegisterReceiver.getIntExtra(((String) objArr9[0]).intern(), 27046);
                    } else {
                        Object[] objArr10 = new Object[1];
                        AFInAppEventType((byte) (72 - ((byte) KeyEvent.getModifierMetaStateMask())), "/0$\u001f,\f.\u0004%\u0007㙈", Color.green(0) + 11, objArr10);
                        intExtra = intentRegisterReceiver.getIntExtra(((String) objArr10[0]).intern(), -2700);
                    }
                }
                String str2 = this.AFKeystoreWrapper.getApplicationInfo().nativeLibraryDir;
                if (str2 != null) {
                    int i12 = afDebugLog + 33;
                    afRDLog = i12 % 128;
                    int i13 = i12 % 2;
                    Object[] objArr11 = new Object[1];
                    AFInAppEventType((byte) (((Process.getThreadPriority(0) + 20) >> 6) + 18), "/\u0017㖾", View.getDefaultSize(0, 0) + 3, objArr11);
                    if (str2.contains(((String) objArr11[0]).intern())) {
                        int i14 = afDebugLog;
                        int i15 = i14 + 115;
                        afRDLog = i15 % 128;
                        int i16 = i15 % 2;
                        int i17 = i14 + 45;
                        afRDLog = i17 % 128;
                        int i18 = i17 % 2;
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                } else {
                    i10 = 0;
                }
                Context context2 = this.AFKeystoreWrapper;
                Object[] objArr12 = new Object[1];
                AFInAppEventParameterName(new int[]{1742378786, 1923556584, -1407937301, 133347245}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 6, objArr12);
                int size = ((SensorManager) context2.getSystemService(((String) objArr12[0]).intern())).getSensorList(-1).size();
                StringBuilder sb6 = new StringBuilder();
                Object[] objArr13 = new Object[1];
                AFInAppEventParameterName(new int[]{1796820622, 951799376}, 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr13);
                sb6.append(((String) objArr13[0]).intern());
                sb6.append(intExtra);
                Object[] objArr14 = new Object[1];
                AFInAppEventType((byte) (66 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u00170", 1 - MotionEvent.axisFromString(""), objArr14);
                sb6.append(((String) objArr14[0]).intern());
                sb6.append(i10);
                Object[] objArr15 = new Object[1];
                AFInAppEventType((byte) (AndroidCharacter.getMirror('0') + '\r'), "\"\u001b", Color.rgb(0, 0, 0) + 16777218, objArr15);
                sb6.append(((String) objArr15[0]).intern());
                sb6.append(size);
                Object[] objArr16 = new Object[1];
                AFInAppEventType((byte) (Color.argb(0, 0, 0, 0) + 125), "\u0016\"", 1 - MotionEvent.axisFromString(""), objArr16);
                sb6.append(((String) objArr16[0]).intern());
                sb6.append(this.AFInAppEventParameterName.size());
                String string4 = sb6.toString();
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(AFa1ySDK.values(string4));
                return sb7.toString();
            } catch (Exception e7) {
                Object[] objArr17 = new Object[1];
                AFInAppEventType((byte) (TextUtils.getCapsMode("", 0, 0) + 24), "\u001a+*\u0004*\u0006% (*\u0013,㘀㘀\u0007\n", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, objArr17);
                AFLogger.afErrorLogForExcManagerOnly(((String) objArr17[0]).intern(), e7);
                StringBuilder sb8 = new StringBuilder();
                Object[] objArr18 = new Object[1];
                AFInAppEventType((byte) (98 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), " &\t\u001d*\f\u000f\u0017.\u001a,\f.\u0004\u000b\u0016\u0017\u000f!*\u001e\u0011&(\u001c%,\u0013+\u00070 \u0013,.\u0002+!+\u000b\u000b\u001b\u001e\u0013", 44 - Color.argb(0, 0, 0, 0), objArr18);
                sb8.append(((String) objArr18[0]).intern());
                sb8.append(e7);
                AFLogger.afRDLog(sb8.toString());
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                Object[] objArr19 = new Object[1];
                AFInAppEventType((byte) (Gravity.getAbsoluteGravity(0, 0) + 15), "!&\u0013'\u0011\u0019\u001f\u0016\"+.\u0006 0('", '@' - AndroidCharacter.getMirror('0'), objArr19);
                sb9.append(((String) objArr19[0]).intern());
                return sb9.toString();
            }
        }

        public static void valueOf() {
            values = new int[]{323477, -837362401, -1518965032, 1761212227, -1478818744, 1855273808, -1845241240, -1586645423, 2081753500, -1156207946, -933194515, 1757930608, -673555019, -1460093762, 1670218587, 382928275, 847721556, -1279575317};
            valueOf = (char) 7;
            AFInAppEventType = new char[]{13772, 13768, 13765, 13781, 13817, 13740, 13751, 13822, 13811, 13800, 13748, 13774, 13776, 13813, 13784, 13795, 13754, 13777, 13803, 13787, 13801, 13816, 13821, 13744, 13739, 13812, 13730, 13756, 13809, 13802, 13814, 13820, 13782, 13728, 13810, 13807, 13790, 13804, 13815, 13819, 13738, 13773, 13805, 13780, 13794, 13775, 13806, 13823, 13736};
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0055 A[PHI: r7
          0x0055: PHI (r7v6 int) = (r7v4 int), (r7v9 int) binds: [B:16:0x0052, B:13:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
        private static StringBuilder values(@NonNull String... strArr) throws Exception {
            int iCharAt;
            ArrayList arrayList = new ArrayList();
            int length = strArr.length;
            for (int i10 = 0; i10 < 3; i10++) {
                arrayList.add(Integer.valueOf(strArr[i10].length()));
            }
            Collections.sort(arrayList);
            int iIntValue = ((Integer) arrayList.get(0)).intValue();
            StringBuilder sb2 = new StringBuilder();
            int i11 = 0;
            while (i11 < iIntValue) {
                Integer numValueOf = null;
                for (int i12 = 0; i12 < 3; i12++) {
                    int i13 = afRDLog + 79;
                    afDebugLog = i13 % 128;
                    if (i13 % 2 == 0) {
                        iCharAt = strArr[i12].charAt(i11);
                        int i14 = 89 / 0;
                        if (numValueOf != null) {
                            iCharAt ^= numValueOf.intValue();
                        }
                    } else {
                        iCharAt = strArr[i12].charAt(i11);
                        if (numValueOf != null) {
                            iCharAt ^= numValueOf.intValue();
                        }
                    }
                    numValueOf = Integer.valueOf(iCharAt);
                }
                sb2.append(Integer.toHexString(numValueOf.intValue()));
                i11++;
                int i15 = afDebugLog + 105;
                afRDLog = i15 % 128;
                int i16 = i15 % 2;
            }
            return sb2;
        }

        public static class AFa1ySDK {
            private static int AFInAppEventParameterName = 78;
            private static int AFInAppEventType = 1;
            private static int valueOf;

            private static byte[] AFInAppEventParameterName(@NonNull byte[] bArr) throws Exception {
                int i10 = valueOf + 117;
                AFInAppEventType = i10 % 128;
                int i11 = i10 % 2;
                for (int i12 = 0; i12 < bArr.length; i12++) {
                    int i13 = AFInAppEventType + 59;
                    valueOf = i13 % 128;
                    int i14 = i13 % 2;
                    bArr[i12] = (byte) (bArr[i12] ^ ((i12 % 2) + 42));
                }
                return bArr;
            }

            @NonNull
            private static byte[] AFInAppEventType(@NonNull String str) throws Exception {
                int i10 = valueOf + 43;
                AFInAppEventType = i10 % 128;
                int i11 = i10 % 2;
                byte[] bytes = str.getBytes(Charset.defaultCharset());
                int i12 = valueOf + 57;
                AFInAppEventType = i12 % 128;
                if (i12 % 2 != 0) {
                    return bytes;
                }
                throw null;
            }

            @NonNull
            private static String AFKeystoreWrapper(@NonNull byte[] bArr) throws Exception {
                StringBuilder sb2 = new StringBuilder();
                int i10 = valueOf + 125;
                AFInAppEventType = i10 % 128;
                int i11 = i10 % 2;
                for (byte b10 : bArr) {
                    String hexString = Integer.toHexString(b10);
                    if (hexString.length() == 1) {
                        StringBuilder sb3 = new StringBuilder();
                        Object[] objArr = new Object[1];
                        AFInAppEventParameterName(false, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 125, "\u0000", -TextUtils.lastIndexOf("", '0', 0), 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
                        sb3.append(((String) objArr[0]).intern());
                        sb3.append(hexString);
                        hexString = sb3.toString();
                        int i12 = valueOf + 41;
                        AFInAppEventType = i12 % 128;
                        int i13 = i12 % 2;
                    }
                    sb2.append(hexString);
                }
                return sb2.toString();
            }

            @NonNull
            public static String values(String str) throws Exception {
                int i10 = valueOf + 67;
                AFInAppEventType = i10 % 128;
                int i11 = i10 % 2;
                byte[] bArrAFInAppEventType = AFInAppEventType(str);
                if (i11 != 0) {
                    return AFKeystoreWrapper(AFInAppEventParameterName(bArrAFInAppEventType));
                }
                int i12 = 28 / 0;
                return AFKeystoreWrapper(AFInAppEventParameterName(bArrAFInAppEventType));
            }

            private static void AFInAppEventParameterName(boolean z10, int i10, String str, int i11, int i12, Object[] objArr) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (AFg1lSDK.valueOf) {
                    try {
                        char[] cArr2 = new char[i11];
                        AFg1lSDK.AFKeystoreWrapper = 0;
                        while (true) {
                            int i13 = AFg1lSDK.AFKeystoreWrapper;
                            if (i13 >= i11) {
                                break;
                            }
                            AFg1lSDK.AFInAppEventParameterName = cArr[i13];
                            cArr2[AFg1lSDK.AFKeystoreWrapper] = (char) (AFg1lSDK.AFInAppEventParameterName + i10);
                            int i14 = AFg1lSDK.AFKeystoreWrapper;
                            cArr2[i14] = (char) (cArr2[i14] - AFInAppEventParameterName);
                            AFg1lSDK.AFKeystoreWrapper = i14 + 1;
                        }
                        if (i12 > 0) {
                            AFg1lSDK.AFInAppEventType = i12;
                            char[] cArr3 = new char[i11];
                            System.arraycopy(cArr2, 0, cArr3, 0, i11);
                            int i15 = AFg1lSDK.AFInAppEventType;
                            System.arraycopy(cArr3, 0, cArr2, i11 - i15, i15);
                            int i16 = AFg1lSDK.AFInAppEventType;
                            System.arraycopy(cArr3, i16, cArr2, 0, i11 - i16);
                        }
                        if (z10) {
                            char[] cArr4 = new char[i11];
                            AFg1lSDK.AFKeystoreWrapper = 0;
                            while (true) {
                                int i17 = AFg1lSDK.AFKeystoreWrapper;
                                if (i17 >= i11) {
                                    break;
                                }
                                cArr4[i17] = cArr2[(i11 - i17) - 1];
                                AFg1lSDK.AFKeystoreWrapper = i17 + 1;
                            }
                            cArr2 = cArr4;
                        }
                        str2 = new String(cArr2);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                objArr[0] = str2;
            }
        }

        private static void AFInAppEventParameterName(int[] iArr, int i10, Object[] objArr) {
            String str;
            synchronized (AFg1jSDK.values) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) values.clone();
                    AFg1jSDK.AFKeystoreWrapper = 0;
                    while (true) {
                        int i11 = AFg1jSDK.AFKeystoreWrapper;
                        if (i11 < iArr.length) {
                            int i12 = iArr[i11];
                            char c10 = (char) (i12 >> 16);
                            cArr[0] = c10;
                            char c11 = (char) i12;
                            cArr[1] = c11;
                            char c12 = (char) (iArr[i11 + 1] >> 16);
                            cArr[2] = c12;
                            char c13 = (char) iArr[i11 + 1];
                            cArr[3] = c13;
                            AFg1jSDK.valueOf = (c10 << 16) + c11;
                            AFg1jSDK.AFInAppEventType = (c12 << 16) + c13;
                            AFg1jSDK.AFInAppEventParameterName(iArr2);
                            for (int i13 = 0; i13 < 16; i13++) {
                                int i14 = AFg1jSDK.valueOf ^ iArr2[i13];
                                AFg1jSDK.valueOf = i14;
                                AFg1jSDK.AFInAppEventType = AFg1jSDK.AFInAppEventParameterName(i14) ^ AFg1jSDK.AFInAppEventType;
                                int i15 = AFg1jSDK.valueOf;
                                AFg1jSDK.valueOf = AFg1jSDK.AFInAppEventType;
                                AFg1jSDK.AFInAppEventType = i15;
                            }
                            int i16 = AFg1jSDK.valueOf;
                            AFg1jSDK.valueOf = AFg1jSDK.AFInAppEventType;
                            AFg1jSDK.AFInAppEventType = i16;
                            AFg1jSDK.AFInAppEventType = i16 ^ iArr2[16];
                            AFg1jSDK.valueOf ^= iArr2[17];
                            int i17 = AFg1jSDK.AFKeystoreWrapper;
                            int i18 = AFg1jSDK.valueOf;
                            cArr[0] = (char) (i18 >>> 16);
                            cArr[1] = (char) i18;
                            int i19 = AFg1jSDK.AFInAppEventType;
                            cArr[2] = (char) (i19 >>> 16);
                            cArr[3] = (char) i19;
                            AFg1jSDK.AFInAppEventParameterName(iArr2);
                            int i20 = AFg1jSDK.AFKeystoreWrapper;
                            cArr2[i20 << 1] = cArr[0];
                            cArr2[(i20 << 1) + 1] = cArr[1];
                            cArr2[(i20 << 1) + 2] = cArr[2];
                            cArr2[(i20 << 1) + 3] = cArr[3];
                            AFg1jSDK.AFKeystoreWrapper = i20 + 2;
                        } else {
                            str = new String(cArr2, 0, i10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            objArr[0] = str;
        }

        private static void AFInAppEventType(byte b10, String str, int i10, Object[] objArr) {
            int i11;
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (AFg1qSDK.afErrorLog) {
                try {
                    char[] cArr2 = AFInAppEventType;
                    char c10 = valueOf;
                    char[] cArr3 = new char[i10];
                    if (i10 % 2 != 0) {
                        i11 = i10 - 1;
                        cArr3[i11] = (char) (cArr[i11] - b10);
                    } else {
                        i11 = i10;
                    }
                    if (i11 > 1) {
                        AFg1qSDK.AFInAppEventParameterName = 0;
                        while (true) {
                            int i12 = AFg1qSDK.AFInAppEventParameterName;
                            if (i12 >= i11) {
                                break;
                            }
                            AFg1qSDK.AFInAppEventType = cArr[i12];
                            AFg1qSDK.AFKeystoreWrapper = cArr[AFg1qSDK.AFInAppEventParameterName + 1];
                            if (AFg1qSDK.AFInAppEventType == AFg1qSDK.AFKeystoreWrapper) {
                                cArr3[AFg1qSDK.AFInAppEventParameterName] = (char) (AFg1qSDK.AFInAppEventType - b10);
                                cArr3[AFg1qSDK.AFInAppEventParameterName + 1] = (char) (AFg1qSDK.AFKeystoreWrapper - b10);
                            } else {
                                AFg1qSDK.valueOf = AFg1qSDK.AFInAppEventType / c10;
                                AFg1qSDK.afInfoLog = AFg1qSDK.AFInAppEventType % c10;
                                AFg1qSDK.values = AFg1qSDK.AFKeystoreWrapper / c10;
                                AFg1qSDK.afRDLog = AFg1qSDK.AFKeystoreWrapper % c10;
                                if (AFg1qSDK.afInfoLog == AFg1qSDK.afRDLog) {
                                    AFg1qSDK.valueOf = androidx.activity.a.a(AFg1qSDK.valueOf, c10, 1, c10);
                                    AFg1qSDK.values = androidx.activity.a.a(AFg1qSDK.values, c10, 1, c10);
                                    int i13 = (AFg1qSDK.valueOf * c10) + AFg1qSDK.afInfoLog;
                                    int i14 = (AFg1qSDK.values * c10) + AFg1qSDK.afRDLog;
                                    int i15 = AFg1qSDK.AFInAppEventParameterName;
                                    cArr3[i15] = cArr2[i13];
                                    cArr3[i15 + 1] = cArr2[i14];
                                } else if (AFg1qSDK.valueOf == AFg1qSDK.values) {
                                    AFg1qSDK.afInfoLog = androidx.activity.a.a(AFg1qSDK.afInfoLog, c10, 1, c10);
                                    AFg1qSDK.afRDLog = androidx.activity.a.a(AFg1qSDK.afRDLog, c10, 1, c10);
                                    int i16 = (AFg1qSDK.valueOf * c10) + AFg1qSDK.afInfoLog;
                                    int i17 = (AFg1qSDK.values * c10) + AFg1qSDK.afRDLog;
                                    int i18 = AFg1qSDK.AFInAppEventParameterName;
                                    cArr3[i18] = cArr2[i16];
                                    cArr3[i18 + 1] = cArr2[i17];
                                } else {
                                    int i19 = (AFg1qSDK.valueOf * c10) + AFg1qSDK.afRDLog;
                                    int i20 = (AFg1qSDK.values * c10) + AFg1qSDK.afInfoLog;
                                    int i21 = AFg1qSDK.AFInAppEventParameterName;
                                    cArr3[i21] = cArr2[i19];
                                    cArr3[i21 + 1] = cArr2[i20];
                                }
                            }
                            AFg1qSDK.AFInAppEventParameterName += 2;
                        }
                    }
                    for (int i22 = 0; i22 < i10; i22++) {
                        cArr3[i22] = (char) (cArr3[i22] ^ 13722);
                    }
                    str2 = new String(cArr3);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            objArr[0] = str2;
        }
    }

    private static String AFKeystoreWrapper(Context context, StringBuilder sb2) {
        Object obj;
        StringBuilder sb3 = new StringBuilder();
        String packageName = context.getPackageName();
        String strValueOf = valueOf(packageName);
        Object[] objArr = new Object[1];
        valueOf((char) (TextUtils.lastIndexOf("", '0', 0) + 54128), "\u0000\u0000\u0000\u0000", "嬤寏澫ồ", "뾌", (-1420046501) - ExpandableListView.getPackedPositionGroup(0L), objArr);
        sb2.append(((String) objArr[0]).intern());
        sb3.append(strValueOf);
        if (valueOf(context) == null) {
            int i10 = afErrorLog + 113;
            afRDLog = i10 % 128;
            if (i10 % 2 == 0) {
                Object[] objArr2 = new Object[1];
                valueOf((char) (63594 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", "㭫爏檵컸", "鄮", 3947 - AndroidCharacter.getMirror((char) 29), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                valueOf((char) (63594 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", "㭫爏檵컸", "鄮", 3947 - AndroidCharacter.getMirror('0'), objArr3);
                obj = objArr3[0];
            }
            sb2.append(((String) obj).intern());
            sb3.append(packageName);
        } else {
            Object[] objArr4 = new Object[1];
            valueOf((char) (54127 - View.MeasureSpec.getMode(0)), "\u0000\u0000\u0000\u0000", "嬤寏澫ồ", "뾌", (-1420046501) - Color.argb(0, 0, 0, 0), objArr4);
            sb2.append(((String) objArr4[0]).intern());
            sb3.append(packageName);
        }
        String strAFInAppEventType = AFInAppEventType(context);
        if (strAFInAppEventType == null) {
            int i11 = afErrorLog + 31;
            afRDLog = i11 % 128;
            int i12 = i11 % 2;
            Object[] objArr5 = new Object[1];
            valueOf((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 63594), "\u0000\u0000\u0000\u0000", "㭫爏檵컸", "鄮", Drawable.resolveOpacity(0, 0) - 1250816197, objArr5);
            sb2.append(((String) objArr5[0]).intern());
            sb3.append(packageName);
        } else {
            Object[] objArr6 = new Object[1];
            valueOf((char) (54127 - View.MeasureSpec.makeMeasureSpec(0, 0)), "\u0000\u0000\u0000\u0000", "嬤寏澫ồ", "뾌", (-1420046501) - KeyEvent.keyCodeFromString(""), objArr6);
            sb2.append(((String) objArr6[0]).intern());
            sb3.append(strAFInAppEventType);
        }
        sb3.append(Boolean.TRUE.toString());
        String string = sb3.toString();
        int i13 = afRDLog + 49;
        afErrorLog = i13 % 128;
        if (i13 % 2 == 0) {
            return string;
        }
        throw null;
    }

    private static String AFInAppEventType(Context context) {
        int i10 = afRDLog + 31;
        afErrorLog = i10 % 128;
        int i11 = i10 % 2;
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            int i12 = afErrorLog + 53;
            afRDLog = i12 % 128;
            int i13 = i12 % 2;
            return str;
        } catch (PackageManager.NameNotFoundException e5) {
            Object[] objArr = new Object[1];
            valueOf((char) (12412 - View.resolveSize(0, 0)), "\u0000\u0000\u0000\u0000", "\ue309泰籚㔰", "욶䄍ᔌῙ胕崿嗷ొ⤤ꆒ\uf1b6\udf3d肠勖ὦ댶蕕媕쓰赁\udf79嬬\uf130\ude19痼購恑\uf852\ueac0", 1517088995 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr[0]).intern(), e5);
            return null;
        }
    }

    private static boolean AFInAppEventParameterName(String str) {
        int i10 = afRDLog + 101;
        afErrorLog = i10 % 128;
        int i11 = i10 % 2;
        try {
            Class.forName(str);
            int i12 = afRDLog + 49;
            afErrorLog = i12 % 128;
            int i13 = i12 % 2;
            return true;
        } catch (ClassNotFoundException e5) {
            Object[] objArr = new Object[1];
            valueOf((char) (34493 - (ViewConfiguration.getFadingEdgeLength() >> 16)), "\u0000\u0000\u0000\u0000", "塕\ue7cd봇隆", "\uf845돛⥴౿诣ጪ\ue769ᓃ史섓\ue5f2\ud9a8㪅\uf0f5껣⦴䬨訜ƚ", 132631895 - Process.getGidForName(""), objArr);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr[0]).intern(), e5);
            return false;
        }
    }

    private static void AFInAppEventParameterName(String str, int i10, Object[] objArr) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (AFg1kSDK.AFKeystoreWrapper) {
            try {
                char[] cArr2 = new char[cArr.length];
                AFg1kSDK.AFInAppEventType = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = AFg1kSDK.AFInAppEventType;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c10 = cArr3[1];
                            char c11 = cArr3[0];
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + afInfoLog)) ^ ((c11 >>> 5) + afDebugLog)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + valueOf) ^ ((c12 + i12) ^ ((c12 << 4) + values))));
                            i12 -= 40503;
                        }
                        int i14 = AFg1kSDK.AFInAppEventType;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        AFg1kSDK.AFInAppEventType = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str2;
    }

    private static void valueOf(StringBuilder sb2) {
        String strIntern;
        Object obj;
        String strIntern2;
        Object obj2;
        Object[] objArr = new Object[1];
        valueOf((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), "\u0000\u0000\u0000\u0000", "\ud919狮鈭㐗", "㽆꯵\ue38b\uf2ec蝇\ueaae떧᫂尥漛䁶줸\ue5be⣤⚆ਃ▌\uecf7倮ፔ混독\u0ac6썴웣", Color.argb(0, 0, 0, 0) + 762506969, objArr);
        if (!(!AFInAppEventParameterName(((String) objArr[0]).intern()))) {
            Object[] objArr2 = new Object[1];
            valueOf((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 54127), "\u0000\u0000\u0000\u0000", "嬤寏澫ồ", "뾌", (ViewConfiguration.getTapTimeout() >> 16) - 1420046501, objArr2);
            strIntern = ((String) objArr2[0]).intern();
        } else {
            Object[] objArr3 = new Object[1];
            valueOf((char) (63594 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "\u0000\u0000\u0000\u0000", "㭫爏檵컸", "鄮", (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 1250816197, objArr3);
            strIntern = ((String) objArr3[0]).intern();
            int i10 = afRDLog + 97;
            afErrorLog = i10 % 128;
            int i11 = i10 % 2;
        }
        sb2.append(strIntern);
        Object[] objArr4 = new Object[1];
        AFInAppEventParameterName("隢瀨㊈\uda5c谎鑨筆졪˩ཉꍀ즳凎㫫\ud888\uf85f꺻붿뜠ꎁﴗ\ue199ᙀ付", View.MeasureSpec.makeMeasureSpec(0, 0) + 23, objArr4);
        if (AFInAppEventParameterName(((String) objArr4[0]).intern())) {
            int i12 = afErrorLog + 21;
            afRDLog = i12 % 128;
            int i13 = i12 % 2;
            Object[] objArr5 = new Object[1];
            valueOf((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 54126), "\u0000\u0000\u0000\u0000", "嬤寏澫ồ", "뾌", (-1420046500) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr5);
            obj = objArr5[0];
        } else {
            Object[] objArr6 = new Object[1];
            valueOf((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 63593), "\u0000\u0000\u0000\u0000", "㭫爏檵컸", "鄮", (-1267593413) - Color.rgb(0, 0, 0), objArr6);
            obj = objArr6[0];
        }
        sb2.append(((String) obj).intern());
        Object[] objArr7 = new Object[1];
        AFInAppEventParameterName("隢瀨㊈\uda5c谎鑨筆졪ᨓ릞錹\uf249咻彲㪜䙏㟠\uec6c譶ㆻ", (ViewConfiguration.getEdgeSlop() >> 16) + 20, objArr7);
        if (!(!AFInAppEventParameterName(((String) objArr7[0]).intern()))) {
            Object[] objArr8 = new Object[1];
            valueOf((char) (54127 - KeyEvent.normalizeMetaState(0)), "\u0000\u0000\u0000\u0000", "嬤寏澫ồ", "뾌", (-1420046501) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr8);
            strIntern2 = ((String) objArr8[0]).intern();
            int i14 = afErrorLog + 17;
            afRDLog = i14 % 128;
            int i15 = i14 % 2;
        } else {
            Object[] objArr9 = new Object[1];
            valueOf((char) (63594 - View.MeasureSpec.getMode(0)), "\u0000\u0000\u0000\u0000", "㭫爏檵컸", "鄮", (-1250816197) - ExpandableListView.getPackedPositionGroup(0L), objArr9);
            strIntern2 = ((String) objArr9[0]).intern();
        }
        sb2.append(strIntern2);
        Object[] objArr10 = new Object[1];
        valueOf((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35003), "\u0000\u0000\u0000\u0000", "\ueed0㗙뭃ֈ", "윶剐㚑䮧뀑䬂꜆縵뜁Ḽ\ue7ce\uf366\uef0a\ude33䜋", 1127602670 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr10);
        if (AFInAppEventParameterName(((String) objArr10[0]).intern())) {
            int i16 = afRDLog + 7;
            afErrorLog = i16 % 128;
            int i17 = i16 % 2;
            Object[] objArr11 = new Object[1];
            valueOf((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 54126), "\u0000\u0000\u0000\u0000", "嬤寏澫ồ", "뾌", KeyEvent.getDeadChar(0, 0) - 1420046501, objArr11);
            obj2 = objArr11[0];
        } else {
            Object[] objArr12 = new Object[1];
            valueOf((char) (63594 - (ViewConfiguration.getTapTimeout() >> 16)), "\u0000\u0000\u0000\u0000", "㭫爏檵컸", "鄮", (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 1250816197, objArr12);
            obj2 = objArr12[0];
        }
        sb2.append(((String) obj2).intern());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
    
        if ((r0 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        r1 = new java.lang.Object[1];
        AFInAppEventParameterName("㴛膲", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2, r1);
        r8 = r8.split(((java.lang.String) r1[0]).intern());
        r0 = r8.length;
        r1 = new java.lang.StringBuilder();
        r0 = r0 - 1;
        r1.append(r8[r0]);
        r6 = new java.lang.Object[1];
        AFInAppEventParameterName("\ue4bd疿", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), r6);
        r1.append(((java.lang.String) r6[0]).intern());
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0091, code lost:
    
        if (r2 >= r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0093, code lost:
    
        r1.append(r8[r2]);
        r7 = new java.lang.Object[1];
        AFInAppEventParameterName("\ue4bd疿", 1 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), r7);
        r1.append(((java.lang.String) r7[0]).intern());
        r2 = r2 + 1;
        r6 = com.appsflyer.internal.AFb1eSDK.afRDLog + 29;
        com.appsflyer.internal.AFb1eSDK.afErrorLog = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00bd, code lost:
    
        r1.append(r8[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c6, code lost:
    
        return r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        if (r8.contains(((java.lang.String) r1[0]).intern()) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
    
        if (r8.contains(((java.lang.String) r1[0]).intern()) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:
    
        r0 = com.appsflyer.internal.AFb1eSDK.afRDLog + 19;
        com.appsflyer.internal.AFb1eSDK.afErrorLog = r0 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String valueOf(java.lang.String r8) {
        /*
            int r0 = com.appsflyer.internal.AFb1eSDK.afRDLog
            int r0 = r0 + 19
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1eSDK.afErrorLog = r1
            int r0 = r0 % 2
            r1 = 0
            java.lang.String r3 = "\ue4bd疿"
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L2c
            long r6 = android.os.SystemClock.elapsedRealtime()
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            java.lang.Object[] r1 = new java.lang.Object[r5]
            AFInAppEventParameterName(r3, r0, r1)
            r0 = r1[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L54
            goto L45
        L2c:
            long r6 = android.os.SystemClock.elapsedRealtime()
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            java.lang.Object[] r1 = new java.lang.Object[r5]
            AFInAppEventParameterName(r3, r0, r1)
            r0 = r1[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L54
        L45:
            int r0 = com.appsflyer.internal.AFb1eSDK.afRDLog
            int r0 = r0 + 19
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1eSDK.afErrorLog = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L52
            return r8
        L52:
            r8 = 0
            throw r8
        L54:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r4)
            int r0 = r0 + 2
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "㴛膲"
            AFInAppEventParameterName(r2, r0, r1)
            r0 = r1[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String[] r8 = r8.split(r0)
            int r0 = r8.length
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r0 = r0 - r5
            r2 = r8[r0]
            r1.append(r2)
            float r2 = android.view.ViewConfiguration.getScrollFriction()
            r6 = 0
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            java.lang.Object[] r6 = new java.lang.Object[r5]
            AFInAppEventParameterName(r3, r2, r6)
            r2 = r6[r4]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            r1.append(r2)
            r2 = r5
        L91:
            if (r2 >= r0) goto Lbd
            r6 = r8[r2]
            r1.append(r6)
            int r6 = android.view.ViewConfiguration.getFadingEdgeLength()
            int r6 = r6 >> 16
            int r6 = 1 - r6
            java.lang.Object[] r7 = new java.lang.Object[r5]
            AFInAppEventParameterName(r3, r6, r7)
            r6 = r7[r4]
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = r6.intern()
            r1.append(r6)
            int r2 = r2 + 1
            int r6 = com.appsflyer.internal.AFb1eSDK.afRDLog
            int r6 = r6 + 29
            int r7 = r6 % 128
            com.appsflyer.internal.AFb1eSDK.afErrorLog = r7
            int r6 = r6 % 2
            goto L91
        Lbd:
            r8 = r8[r4]
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1eSDK.valueOf(java.lang.String):java.lang.String");
    }

    private static String valueOf(Context context) {
        int i10 = afRDLog + 107;
        afErrorLog = i10 % 128;
        int i11 = i10 % 2;
        Properties properties = System.getProperties();
        Object[] objArr = new Object[1];
        valueOf((char) (45561 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "\u0000\u0000\u0000\u0000", "ꌓ畟\uf85c抱", "鲜둓䡳䘒핕\uf4f3눬㠠‽嘧쟶諕塯㧮", View.combineMeasuredStates(0, 0), objArr);
        if (!properties.containsKey(((String) objArr[0]).intern())) {
            return null;
        }
        try {
            String path = context.getCacheDir().getPath();
            Object[] objArr2 = new Object[1];
            AFInAppEventParameterName("픂뷸랗\udcc1ᬲ뱥", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6, objArr2);
            String strReplace = path.replace(((String) objArr2[0]).intern(), "");
            Object[] objArr3 = new Object[1];
            AFInAppEventParameterName("\u0992\uf00c뤏㐨混喘逥蘿㉇\u0bad", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10, objArr3);
            Matcher matcher = Pattern.compile(((String) objArr3[0]).intern()).matcher(strReplace);
            if (!matcher.find()) {
                return null;
            }
            int i12 = afErrorLog + 69;
            afRDLog = i12 % 128;
            int i13 = i12 % 2;
            return matcher.group(1);
        } catch (Exception e5) {
            Object[] objArr4 = new Object[1];
            AFInAppEventParameterName("ჹⓊ釭쵘퓎ꭗ箯進佉ᨴꄗ鎜\uecb4쵤ಿ\ue2daస䙊屮掾㒪㖍ဴ杔", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23, objArr4);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr4[0]).intern(), e5);
            AFb1wSDK aFb1wSDKAfErrorLogForExcManagerOnly = AFa1dSDK.valueOf().AFInAppEventParameterName().afErrorLogForExcManagerOnly();
            Object[] objArr5 = new Object[1];
            valueOf((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 12695), "\u0000\u0000\u0000\u0000", "㾏ᯝ鞉ܱ", "梧歃狶\ue0d2䀖锺錘띸ᖳ甹\uebbc\ue8f3㹐哈ꘕ喲\ue6ed", (-1994662593) - View.MeasureSpec.getMode(0), objArr5);
            String strIntern = ((String) objArr5[0]).intern();
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            valueOf((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 45032), "\u0000\u0000\u0000\u0000", "◐\ufb0b\ue88e隯", "ᨍ୵ً艅㓘濾礞㧮ဗ䲔\uea71뒖糷㱼튢㟲붂⫩塄혻ܟ\uf7cc誚ἵ蝪糢儗⣓ᆌ锇蘶䍐硙쮶ᦜ뜣楿\ue96d㛽䫆\ud96b", (-1896150235) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr6);
            sb2.append(((String) objArr6[0]).intern());
            sb2.append(e5);
            aFb1wSDKAfErrorLogForExcManagerOnly.AFInAppEventType(strIntern, sb2.toString());
            return null;
        }
    }

    private static void valueOf(char c10, String str, String str2, String str3, int i10, Object[] objArr) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (AFg1pSDK.valueOf) {
            try {
                char[] cArr4 = (char[]) cArr2.clone();
                char[] cArr5 = (char[]) cArr3.clone();
                cArr4[0] = (char) (c10 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                int length = cArr.length;
                char[] cArr6 = new char[length];
                AFg1pSDK.AFInAppEventParameterName = 0;
                while (true) {
                    int i11 = AFg1pSDK.AFInAppEventParameterName;
                    if (i11 < length) {
                        int i12 = (i11 + 2) % 4;
                        int i13 = (i11 + 3) % 4;
                        int i14 = cArr4[i11 % 4] * 32718;
                        char c11 = cArr5[i12];
                        char c12 = (char) ((i14 + c11) % 65535);
                        AFg1pSDK.AFInAppEventType = c12;
                        cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                        cArr4[i13] = c12;
                        int i15 = AFg1pSDK.AFInAppEventParameterName;
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr[i15])) ^ AFInAppEventParameterName) ^ ((long) AFInAppEventType)) ^ ((long) AFKeystoreWrapper));
                        AFg1pSDK.AFInAppEventParameterName = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str4;
    }
}
