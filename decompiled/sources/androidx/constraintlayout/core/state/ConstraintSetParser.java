package androidx.constraintlayout.core.state;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.h0;
import androidx.camera.core.processing.f;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.parser.CLString;
import androidx.constraintlayout.core.state.helpers.BarrierReference;
import androidx.constraintlayout.core.state.helpers.ChainReference;
import androidx.constraintlayout.core.state.helpers.FlowReference;
import androidx.constraintlayout.core.state.helpers.GridReference;
import androidx.constraintlayout.core.state.helpers.GuidelineReference;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.tokencompat.service.RelayedService;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintSetParser {

    public static class DesignElement {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f19006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f19007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public HashMap<String, String> f19008c;

        public DesignElement() {
            throw null;
        }

        public String getId() {
            return this.f19006a;
        }

        public HashMap<String, String> getParams() {
            return this.f19008c;
        }

        public String getType() {
            return this.f19007b;
        }
    }

    public static class LayoutVariables {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap<String, Integer> f19009a = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap<String, b> f19010b = new HashMap<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashMap<String, ArrayList<String>> f19011c = new HashMap<>();

        public final float a(CLElement cLElement) {
            if (!(cLElement instanceof CLString)) {
                if (cLElement instanceof CLNumber) {
                    return ((CLNumber) cLElement).getFloat();
                }
                return 0.0f;
            }
            String strContent = ((CLString) cLElement).content();
            HashMap<String, b> map = this.f19010b;
            if (map.containsKey(strContent)) {
                return map.get(strContent).value();
            }
            HashMap<String, Integer> map2 = this.f19009a;
            if (map2.containsKey(strContent)) {
                return map2.get(strContent).floatValue();
            }
            return 0.0f;
        }

        public void putOverride(String str, float f6) {
            d dVar = new d();
            dVar.f19020a = f6;
            this.f19010b.put(str, dVar);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MotionLayoutDebugFlags {
        private static final /* synthetic */ MotionLayoutDebugFlags[] $VALUES;
        public static final MotionLayoutDebugFlags NONE;
        public static final MotionLayoutDebugFlags SHOW_ALL;
        public static final MotionLayoutDebugFlags UNKNOWN;

        static {
            MotionLayoutDebugFlags motionLayoutDebugFlags = new MotionLayoutDebugFlags(ExpectedUserActionOnPoiTypes.NONE, 0);
            NONE = motionLayoutDebugFlags;
            MotionLayoutDebugFlags motionLayoutDebugFlags2 = new MotionLayoutDebugFlags("SHOW_ALL", 1);
            SHOW_ALL = motionLayoutDebugFlags2;
            MotionLayoutDebugFlags motionLayoutDebugFlags3 = new MotionLayoutDebugFlags("UNKNOWN", 2);
            UNKNOWN = motionLayoutDebugFlags3;
            $VALUES = new MotionLayoutDebugFlags[]{motionLayoutDebugFlags, motionLayoutDebugFlags2, motionLayoutDebugFlags3};
        }

        public MotionLayoutDebugFlags() {
            throw null;
        }

        public static MotionLayoutDebugFlags valueOf(String str) {
            return (MotionLayoutDebugFlags) Enum.valueOf(MotionLayoutDebugFlags.class, str);
        }

        public static MotionLayoutDebugFlags[] values() {
            return (MotionLayoutDebugFlags[]) $VALUES.clone();
        }
    }

    public static class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f19012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f19013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f19014c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f19015d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f19016e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f19017f;

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.b
        public final float value() {
            float f6 = this.f19016e;
            if (f6 >= this.f19017f) {
                this.f19013b = true;
            }
            if (!this.f19013b) {
                this.f19016e = f6 + this.f19012a;
            }
            return this.f19016e;
        }
    }

    public interface b {
        float value();
    }

    public static class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f19018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f19019b;

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.b
        public final float value() {
            float f6 = this.f19019b + this.f19018a;
            this.f19019b = f6;
            return f6;
        }
    }

    public static class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f19020a;

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.b
        public final float value() {
            return this.f19020a;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void a(CLObject cLObject, ConstraintReference constraintReference, LayoutVariables layoutVariables, State state, String str) throws CLParsingException {
        byte b10;
        ArrayList<String> arrayListNames;
        str.getClass();
        switch (str.hashCode()) {
            case -1448775240:
                b10 = str.equals("centerVertically") ? (byte) 0 : (byte) -1;
                break;
            case -1364013995:
                b10 = str.equals("center") ? (byte) 1 : (byte) -1;
                break;
            case -1349088399:
                b10 = str.equals("custom") ? (byte) 2 : (byte) -1;
                break;
            case -1249320806:
                b10 = str.equals("rotationX") ? (byte) 3 : (byte) -1;
                break;
            case -1249320805:
                b10 = str.equals("rotationY") ? (byte) 4 : (byte) -1;
                break;
            case -1249320804:
                b10 = str.equals("rotationZ") ? (byte) 5 : (byte) -1;
                break;
            case -1225497657:
                b10 = str.equals("translationX") ? (byte) 6 : (byte) -1;
                break;
            case -1225497656:
                b10 = str.equals("translationY") ? (byte) 7 : (byte) -1;
                break;
            case -1225497655:
                b10 = str.equals("translationZ") ? (byte) 8 : (byte) -1;
                break;
            case -1221029593:
                b10 = str.equals("height") ? (byte) 9 : (byte) -1;
                break;
            case -1068318794:
                b10 = str.equals("motion") ? (byte) 10 : (byte) -1;
                break;
            case -987906986:
                b10 = str.equals("pivotX") ? (byte) 11 : (byte) -1;
                break;
            case -987906985:
                b10 = str.equals("pivotY") ? (byte) 12 : (byte) -1;
                break;
            case -908189618:
                b10 = str.equals("scaleX") ? (byte) 13 : (byte) -1;
                break;
            case -908189617:
                b10 = str.equals("scaleY") ? Constants.CVR_B1b41_1110_ONLINE_PIN : (byte) -1;
                break;
            case -247669061:
                b10 = str.equals("hRtlBias") ? (byte) 15 : (byte) -1;
                break;
            case -61505906:
                b10 = str.equals("vWeight") ? (byte) 16 : (byte) -1;
                break;
            case 92909918:
                b10 = str.equals("alpha") ? (byte) 17 : (byte) -1;
                break;
            case 98116417:
                b10 = str.equals("hBias") ? MessageUtils.MESSAGE_18_DC2 : (byte) -1;
                break;
            case 111045711:
                b10 = str.equals("vBias") ? (byte) 19 : (byte) -1;
                break;
            case 113126854:
                b10 = str.equals("width") ? (byte) 20 : (byte) -1;
                break;
            case 398344448:
                b10 = str.equals("hWeight") ? MessageUtils.MESSAGE_21_NAK : (byte) -1;
                break;
            case 1404070310:
                b10 = str.equals("centerHorizontally") ? (byte) 22 : (byte) -1;
                break;
            case 1941332754:
                b10 = str.equals("visibility") ? (byte) 23 : (byte) -1;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                String string = cLObject.getString(str);
                boolean zEquals = string.equals("parent");
                Object obj = string;
                if (zEquals) {
                    obj = State.PARENT;
                }
                ConstraintReference constraintReferenceConstraints = state.constraints(obj);
                constraintReference.topToTop(constraintReferenceConstraints);
                constraintReference.bottomToBottom(constraintReferenceConstraints);
                break;
            case 1:
                String string2 = cLObject.getString(str);
                ConstraintReference constraintReferenceConstraints2 = string2.equals("parent") ? state.constraints(State.PARENT) : state.constraints(string2);
                constraintReference.startToStart(constraintReferenceConstraints2);
                constraintReference.endToEnd(constraintReferenceConstraints2);
                constraintReference.topToTop(constraintReferenceConstraints2);
                constraintReference.bottomToBottom(constraintReferenceConstraints2);
                break;
            case 2:
                CLObject objectOrNull = cLObject.getObjectOrNull(str);
                if (objectOrNull != null && (arrayListNames = objectOrNull.names()) != null) {
                    for (String str2 : arrayListNames) {
                        CLElement cLElement = objectOrNull.get(str2);
                        if (cLElement instanceof CLNumber) {
                            constraintReference.addCustomFloat(str2, cLElement.getFloat());
                        } else if (cLElement instanceof CLString) {
                            long jC = c(cLElement.content());
                            if (jC != -1) {
                                constraintReference.addCustomColor(str2, (int) jC);
                            }
                        }
                    }
                }
                break;
            case 3:
                constraintReference.rotationX(layoutVariables.a(cLObject.get(str)));
                break;
            case 4:
                constraintReference.rotationY(layoutVariables.a(cLObject.get(str)));
                break;
            case 5:
                constraintReference.rotationZ(layoutVariables.a(cLObject.get(str)));
                break;
            case 6:
                constraintReference.translationX(state.f19030a.toPixels(layoutVariables.a(cLObject.get(str))));
                break;
            case 7:
                constraintReference.translationY(state.f19030a.toPixels(layoutVariables.a(cLObject.get(str))));
                break;
            case 8:
                constraintReference.translationZ(state.f19030a.toPixels(layoutVariables.a(cLObject.get(str))));
                break;
            case 9:
                constraintReference.setHeight(f(cLObject, str, state, state.f19030a));
                break;
            case 10:
                CLElement cLElement2 = cLObject.get(str);
                if (cLElement2 instanceof CLObject) {
                    CLObject cLObject2 = (CLObject) cLElement2;
                    TypedBundle typedBundle = new TypedBundle();
                    ArrayList<String> arrayListNames2 = cLObject2.names();
                    if (arrayListNames2 != null) {
                        for (String str3 : arrayListNames2) {
                            str3.getClass();
                            switch (str3) {
                                case "stagger":
                                    typedBundle.add(600, cLObject2.getFloat(str3));
                                    break;
                                case "easing":
                                    typedBundle.add(TypedValues.MotionType.TYPE_EASING, cLObject2.getString(str3));
                                    break;
                                case "quantize":
                                    CLElement cLElement3 = cLObject2.get(str3);
                                    if (!(cLElement3 instanceof CLArray)) {
                                        typedBundle.add(TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, cLObject2.getInt(str3));
                                        break;
                                    } else {
                                        CLArray cLArray = (CLArray) cLElement3;
                                        int size = cLArray.size();
                                        if (size > 0) {
                                            typedBundle.add(TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, cLArray.getInt(0));
                                            if (size > 1) {
                                                typedBundle.add(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE, cLArray.getString(1));
                                                if (size > 2) {
                                                    typedBundle.add(602, cLArray.getFloat(2));
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    break;
                                case "pathArc":
                                    String string3 = cLObject2.getString(str3);
                                    String[] strArr = {"none", "startVertical", "startHorizontal", "flip", "below", "above"};
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 >= 6) {
                                            i10 = -1;
                                        } else if (!strArr[i10].equals(string3)) {
                                            i10++;
                                        }
                                    }
                                    if (i10 != -1) {
                                        typedBundle.add(TypedValues.MotionType.TYPE_PATHMOTION_ARC, i10);
                                        break;
                                    } else {
                                        System.err.println(cLObject2.getLine() + " pathArc = '" + string3 + "'");
                                        break;
                                    }
                                    break;
                                case "relativeTo":
                                    typedBundle.add(TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, cLObject2.getString(str3));
                                    break;
                            }
                        }
                        constraintReference.L = typedBundle;
                        break;
                    }
                }
                break;
            case 11:
                constraintReference.pivotX(layoutVariables.a(cLObject.get(str)));
                break;
            case 12:
                constraintReference.pivotY(layoutVariables.a(cLObject.get(str)));
                break;
            case 13:
                constraintReference.scaleX(layoutVariables.a(cLObject.get(str)));
                break;
            case 14:
                constraintReference.scaleY(layoutVariables.a(cLObject.get(str)));
                break;
            case 15:
                float fA = layoutVariables.a(cLObject.get(str));
                if (state.isRtl()) {
                    fA = 1.0f - fA;
                }
                constraintReference.horizontalBias(fA);
                break;
            case 16:
                constraintReference.setVerticalChainWeight(layoutVariables.a(cLObject.get(str)));
                break;
            case 17:
                constraintReference.alpha(layoutVariables.a(cLObject.get(str)));
                break;
            case 18:
                constraintReference.horizontalBias(layoutVariables.a(cLObject.get(str)));
                break;
            case 19:
                constraintReference.verticalBias(layoutVariables.a(cLObject.get(str)));
                break;
            case 20:
                constraintReference.setWidth(f(cLObject, str, state, state.f19030a));
                break;
            case 21:
                constraintReference.setHorizontalChainWeight(layoutVariables.a(cLObject.get(str)));
                break;
            case 22:
                String string4 = cLObject.getString(str);
                boolean zEquals2 = string4.equals("parent");
                Object obj2 = string4;
                if (zEquals2) {
                    obj2 = State.PARENT;
                }
                ConstraintReference constraintReferenceConstraints3 = state.constraints(obj2);
                constraintReference.startToStart(constraintReferenceConstraints3);
                constraintReference.endToEnd(constraintReferenceConstraints3);
                break;
            case 23:
                String string5 = cLObject.getString(str);
                string5.getClass();
                switch (string5) {
                    case "invisible":
                        constraintReference.visibility(4);
                        constraintReference.alpha(0.0f);
                        break;
                    case "gone":
                        constraintReference.visibility(8);
                        break;
                    case "visible":
                        constraintReference.visibility(0);
                        break;
                }
                break;
            default:
                d(cLObject, constraintReference, layoutVariables, state, str);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
    public static void b(int i10, State state, LayoutVariables layoutVariables, CLArray cLArray) throws CLParsingException {
        String strContent;
        ChainReference chainReferenceHorizontalChain = i10 == 0 ? state.horizontalChain() : state.verticalChain();
        CLElement cLElement = cLArray.get(1);
        if (cLElement instanceof CLArray) {
            CLArray cLArray2 = (CLArray) cLElement;
            if (cLArray2.size() < 1) {
                return;
            }
            for (int i11 = 0; i11 < cLArray2.size(); i11++) {
                chainReferenceHorizontalChain.add(cLArray2.getString(i11));
            }
            if (cLArray.size() > 2) {
                CLElement cLElement2 = cLArray.get(2);
                if (cLElement2 instanceof CLObject) {
                    CLObject cLObject = (CLObject) cLElement2;
                    for (String str : cLObject.names()) {
                        str.getClass();
                        if (str.equals("style")) {
                            CLElement cLElement3 = cLObject.get(str);
                            if (cLElement3 instanceof CLArray) {
                                CLArray cLArray3 = (CLArray) cLElement3;
                                if (cLArray3.size() > 1) {
                                    strContent = cLArray3.getString(0);
                                    chainReferenceHorizontalChain.bias(cLArray3.getFloat(1));
                                } else {
                                    strContent = cLElement3.content();
                                }
                            } else {
                                strContent = cLElement3.content();
                            }
                            strContent.getClass();
                            if (strContent.equals("packed")) {
                                chainReferenceHorizontalChain.style(State.Chain.PACKED);
                            } else if (strContent.equals("spread_inside")) {
                                chainReferenceHorizontalChain.style(State.Chain.SPREAD_INSIDE);
                            } else {
                                chainReferenceHorizontalChain.style(State.Chain.SPREAD);
                            }
                        } else {
                            d(cLObject, chainReferenceHorizontalChain, layoutVariables, state, str);
                        }
                    }
                }
            }
        }
    }

    public static long c(String str) {
        if (!str.startsWith("#")) {
            return -1L;
        }
        String strSubstring = str.substring(1);
        if (strSubstring.length() == 6) {
            strSubstring = "FF".concat(strSubstring);
        }
        return Long.parseLong(strSubstring, 16);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:129:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:163:0x0268  */
    /* JADX WARN: Code duplicated, block: B:20:0x0087  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:83:0x0136  */
    /* JADX WARN: Failed to find 'out' block for switch in B:53:0x00d4. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    public static void d(CLObject cLObject, ConstraintReference constraintReference, LayoutVariables layoutVariables, State state, String str) throws CLParsingException {
        char c10;
        boolean z10;
        boolean z11;
        boolean z12;
        ?? r15;
        boolean z13;
        boolean zIsRtl = state.isRtl();
        boolean z14 = !zIsRtl;
        CLArray arrayOrNull = cLObject.getArrayOrNull(str);
        if (arrayOrNull == null || arrayOrNull.size() <= 1) {
            String stringOrNull = cLObject.getStringOrNull(str);
            if (stringOrNull != null) {
                ConstraintReference constraintReferenceConstraints = stringOrNull.equals("parent") ? state.constraints(State.PARENT) : state.constraints(stringOrNull);
                str.getClass();
                switch (str) {
                    case "baseline":
                        state.baselineNeededFor(constraintReference.getKey());
                        state.baselineNeededFor(constraintReferenceConstraints.getKey());
                        constraintReference.baselineToBaseline(constraintReferenceConstraints);
                        break;
                    case "bottom":
                        constraintReference.bottomToBottom(constraintReferenceConstraints);
                        break;
                    case "end":
                        if (z14) {
                            constraintReference.rightToRight(constraintReferenceConstraints);
                            break;
                        } else {
                            constraintReference.leftToLeft(constraintReferenceConstraints);
                            break;
                        }
                        break;
                    case "top":
                        constraintReference.topToTop(constraintReferenceConstraints);
                        break;
                    case "start":
                        if (z14) {
                            constraintReference.leftToLeft(constraintReferenceConstraints);
                            break;
                        } else {
                            constraintReference.rightToRight(constraintReferenceConstraints);
                            break;
                        }
                        break;
                }
                return;
            }
            return;
        }
        String string = arrayOrNull.getString(0);
        String stringOrNull2 = arrayOrNull.getStringOrNull(1);
        float pixels = arrayOrNull.size() > 2 ? state.f19030a.toPixels(layoutVariables.a(arrayOrNull.getOrNull(2))) : 0.0f;
        float pixels2 = arrayOrNull.size() > 3 ? state.f19030a.toPixels(layoutVariables.a(arrayOrNull.getOrNull(3))) : 0.0f;
        ConstraintReference constraintReferenceConstraints2 = string.equals("parent") ? state.constraints(State.PARENT) : state.constraints(string);
        str.getClass();
        switch (str) {
            case "baseline":
                c10 = 2;
                z10 = true;
                stringOrNull2.getClass();
                switch (stringOrNull2) {
                    case "baseline":
                        state.baselineNeededFor(constraintReference.getKey());
                        state.baselineNeededFor(constraintReferenceConstraints2.getKey());
                        constraintReference.baselineToBaseline(constraintReferenceConstraints2);
                        break;
                    case "bottom":
                        state.baselineNeededFor(constraintReference.getKey());
                        constraintReference.baselineToBottom(constraintReferenceConstraints2);
                        break;
                    case "top":
                        state.baselineNeededFor(constraintReference.getKey());
                        constraintReference.baselineToTop(constraintReferenceConstraints2);
                        break;
                }
                z11 = z10;
                z12 = false;
                break;
            case "circular":
                z10 = true;
                constraintReference.circularConstraint(constraintReferenceConstraints2, layoutVariables.a(arrayOrNull.get(1)), arrayOrNull.size() > 2 ? state.f19030a.toPixels(layoutVariables.a(arrayOrNull.getOrNull(2))) : 0.0f);
                c10 = 2;
                z11 = z10;
                z12 = false;
                break;
            case "bottom":
                stringOrNull2.getClass();
                switch (stringOrNull2) {
                    case "baseline":
                        state.baselineNeededFor(constraintReferenceConstraints2.getKey());
                        constraintReference.E = State.Constraint.BOTTOM_TO_BASELINE;
                        constraintReference.f19001x = constraintReferenceConstraints2;
                        break;
                    case "bottom":
                        constraintReference.bottomToBottom(constraintReferenceConstraints2);
                        break;
                    case "top":
                        constraintReference.bottomToTop(constraintReferenceConstraints2);
                        break;
                }
                c10 = 2;
                z10 = true;
                z11 = z10;
                z12 = false;
                break;
            case "end":
                z11 = zIsRtl;
                c10 = 2;
                z10 = true;
                z12 = true;
                break;
            case "top":
                stringOrNull2.getClass();
                switch (stringOrNull2) {
                    case "baseline":
                        state.baselineNeededFor(constraintReferenceConstraints2.getKey());
                        constraintReference.E = State.Constraint.TOP_TO_BASELINE;
                        constraintReference.f19000w = constraintReferenceConstraints2;
                        break;
                    case "bottom":
                        constraintReference.topToBottom(constraintReferenceConstraints2);
                        break;
                    case "top":
                        constraintReference.topToTop(constraintReferenceConstraints2);
                        break;
                }
                c10 = 2;
                z10 = true;
                z11 = z10;
                z12 = false;
                break;
            case "left":
                c10 = 2;
                z11 = true;
                z10 = true;
                z12 = true;
                break;
            case "right":
                c10 = 2;
                z11 = false;
                z10 = true;
                z12 = true;
                break;
            case "start":
                z11 = z14;
                c10 = 2;
                z10 = true;
                z12 = true;
                break;
            default:
                c10 = 2;
                z10 = true;
                z11 = z10;
                z12 = false;
                break;
        }
        if (z12) {
            stringOrNull2.getClass();
            switch (stringOrNull2.hashCode()) {
                case 100571:
                    if (!stringOrNull2.equals("end")) {
                        r15 = -1;
                    } else {
                        r15 = 0;
                    }
                    break;
                case 108511772:
                    if (!stringOrNull2.equals(Parameters.DIRECTION.RIGHT)) {
                        r15 = -1;
                    } else {
                        r15 = z10;
                    }
                    break;
                case 109757538:
                    if (!stringOrNull2.equals(EventDataKeys.Lifecycle.LIFECYCLE_START)) {
                        r15 = -1;
                    } else {
                        r15 = c10;
                    }
                    break;
                default:
                    r15 = -1;
                    break;
            }
            switch (r15) {
                case 0:
                    z13 = zIsRtl;
                    break;
                case 1:
                    z13 = false;
                    break;
                case 2:
                    z13 = z14;
                    break;
                default:
                    z13 = z10;
                    break;
            }
            if (z11) {
                if (z13) {
                    constraintReference.leftToLeft(constraintReferenceConstraints2);
                } else {
                    constraintReference.leftToRight(constraintReferenceConstraints2);
                }
            } else if (z13) {
                constraintReference.rightToLeft(constraintReferenceConstraints2);
            } else {
                constraintReference.rightToRight(constraintReferenceConstraints2);
            }
        }
        constraintReference.margin(Float.valueOf(pixels)).marginGone(Float.valueOf(pixels2));
    }

    public static void e(CoreMotionScene coreMotionScene, CLObject cLObject) throws CLParsingException {
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        for (String str : arrayListNames) {
            CLObject object = cLObject.getObject(str);
            String stringOrNull = object.getStringOrNull("Extends");
            if (stringOrNull == null || stringOrNull.isEmpty()) {
                coreMotionScene.setConstraintSetContent(str, object.toJSON());
            } else {
                String constraintSet = coreMotionScene.getConstraintSet(stringOrNull);
                if (constraintSet != null) {
                    CLObject cLObject2 = CLParser.parse(constraintSet);
                    ArrayList<String> arrayListNames2 = object.names();
                    if (arrayListNames2 != null) {
                        for (String str2 : arrayListNames2) {
                            CLElement cLElement = object.get(str2);
                            if (cLElement instanceof CLObject) {
                                CLObject cLObject3 = (CLObject) cLElement;
                                if (cLObject2.has(str2)) {
                                    CLObject object2 = cLObject2.getObject(str2);
                                    for (String str3 : cLObject3.names()) {
                                        if (str3.equals(ClearCommand.ID)) {
                                            CLArray array = cLObject3.getArray(ClearCommand.ID);
                                            for (int i10 = 0; i10 < array.size(); i10++) {
                                                String stringOrNull2 = array.getStringOrNull(i10);
                                                if (stringOrNull2 != null) {
                                                    switch (stringOrNull2) {
                                                        case "transforms":
                                                            object2.remove("visibility");
                                                            object2.remove("alpha");
                                                            object2.remove("pivotX");
                                                            object2.remove("pivotY");
                                                            object2.remove("rotationX");
                                                            object2.remove("rotationY");
                                                            object2.remove("rotationZ");
                                                            object2.remove("scaleX");
                                                            object2.remove("scaleY");
                                                            object2.remove("translationX");
                                                            object2.remove("translationY");
                                                            break;
                                                        case "constraints":
                                                            object2.remove(EventDataKeys.Lifecycle.LIFECYCLE_START);
                                                            object2.remove("end");
                                                            object2.remove("top");
                                                            object2.remove("bottom");
                                                            object2.remove("baseline");
                                                            object2.remove("center");
                                                            object2.remove("centerHorizontally");
                                                            object2.remove("centerVertically");
                                                            break;
                                                        case "dimensions":
                                                            object2.remove("width");
                                                            object2.remove("height");
                                                            break;
                                                        default:
                                                            object2.remove(stringOrNull2);
                                                            break;
                                                    }
                                                }
                                            }
                                        } else {
                                            object2.put(str3, cLObject3.get(str3));
                                        }
                                    }
                                } else {
                                    cLObject2.put(str2, cLObject3);
                                }
                            }
                        }
                        coreMotionScene.setConstraintSetContent(str, cLObject2.toJSON());
                    }
                }
            }
        }
    }

    public static Dimension f(CLObject cLObject, String str, State state, CorePixelDp corePixelDp) throws CLParsingException {
        CLElement cLElement = cLObject.get(str);
        Dimension dimensionCreateFixed = Dimension.createFixed(0);
        if (cLElement instanceof CLString) {
            return g(cLElement.content());
        }
        if (cLElement instanceof CLNumber) {
            return Dimension.createFixed(state.convertDimension(Float.valueOf(corePixelDp.toPixels(cLObject.getFloat(str)))));
        }
        if (!(cLElement instanceof CLObject)) {
            return dimensionCreateFixed;
        }
        CLObject cLObject2 = (CLObject) cLElement;
        String stringOrNull = cLObject2.getStringOrNull("value");
        if (stringOrNull != null) {
            dimensionCreateFixed = g(stringOrNull);
        }
        CLElement orNull = cLObject2.getOrNull("min");
        if (orNull != null) {
            if (orNull instanceof CLNumber) {
                dimensionCreateFixed.min(state.convertDimension(Float.valueOf(corePixelDp.toPixels(((CLNumber) orNull).getFloat()))));
            } else if (orNull instanceof CLString) {
                dimensionCreateFixed.min(Dimension.WRAP_DIMENSION);
            }
        }
        CLElement orNull2 = cLObject2.getOrNull(VDVideoSelfieConfiguration.MAX);
        if (orNull2 == null) {
            return dimensionCreateFixed;
        }
        if (orNull2 instanceof CLNumber) {
            dimensionCreateFixed.max(state.convertDimension(Float.valueOf(corePixelDp.toPixels(((CLNumber) orNull2).getFloat()))));
            return dimensionCreateFixed;
        }
        if (!(orNull2 instanceof CLString)) {
            return dimensionCreateFixed;
        }
        dimensionCreateFixed.max(Dimension.WRAP_DIMENSION);
        return dimensionCreateFixed;
    }

    public static Dimension g(String str) {
        Dimension dimensionCreateFixed = Dimension.createFixed(0);
        str.getClass();
        switch (str) {
            case "preferWrap":
                return Dimension.createSuggested(Dimension.WRAP_DIMENSION);
            case "parent":
                return Dimension.createParent();
            case "spread":
                return Dimension.createSuggested(Dimension.SPREAD_DIMENSION);
            case "wrap":
                return Dimension.createWrap();
            default:
                if (str.endsWith("%")) {
                    return Dimension.createPercent(0, Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f).suggested(0);
                }
                return str.contains(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER) ? Dimension.createRatio(str).suggested(Dimension.SPREAD_DIMENSION) : dimensionCreateFixed;
        }
    }

    /* JADX WARN: switch over string: strings are not added: [[left]] */
    public static void h(int i10, State state, String str, CLObject cLObject) throws CLParsingException {
        String next;
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        ConstraintReference constraintReferenceConstraints = state.constraints(str);
        if (i10 == 0) {
            state.horizontalGuideline(str);
        } else {
            state.verticalGuideline(str);
        }
        boolean z10 = !state.isRtl() || i10 == 0;
        GuidelineReference guidelineReference = (GuidelineReference) constraintReferenceConstraints.getFacade();
        Iterator<String> it = arrayListNames.iterator();
        float pixels = 0.0f;
        boolean z11 = false;
        while (true) {
            boolean z12 = true;
            while (true) {
                if (!it.hasNext()) {
                    if (z11) {
                        if (z12) {
                            guidelineReference.percent(pixels);
                            return;
                        } else {
                            guidelineReference.percent(1.0f - pixels);
                            return;
                        }
                    }
                    if (z12) {
                        guidelineReference.start(Float.valueOf(pixels));
                        return;
                    } else {
                        guidelineReference.end(Float.valueOf(pixels));
                        return;
                    }
                }
                next = it.next();
                next.getClass();
                switch (next) {
                    case "percent":
                        CLArray arrayOrNull = cLObject.getArrayOrNull(next);
                        if (arrayOrNull != null) {
                            if (arrayOrNull.size() > 1) {
                                String string = arrayOrNull.getString(0);
                                float f6 = arrayOrNull.getFloat(1);
                                string.getClass();
                                switch (string) {
                                    case "end":
                                        z12 = !z10;
                                        pixels = f6;
                                        break;
                                    case "left":
                                        z12 = true;
                                        pixels = f6;
                                        z11 = true;
                                        break;
                                    case "right":
                                        z12 = false;
                                        pixels = f6;
                                        break;
                                    case "start":
                                        z12 = z10;
                                        pixels = f6;
                                        break;
                                    default:
                                        pixels = f6;
                                        break;
                                }
                            }
                            z11 = true;
                            break;
                        } else {
                            pixels = cLObject.getFloat(next);
                            z11 = true;
                            z12 = true;
                            break;
                        }
                        break;
                    case "end":
                        pixels = state.f19030a.toPixels(cLObject.getFloat(next));
                        z12 = !z10;
                        break;
                    case "right":
                        pixels = state.f19030a.toPixels(cLObject.getFloat(next));
                        z12 = false;
                        break;
                    case "start":
                        pixels = state.f19030a.toPixels(cLObject.getFloat(next));
                        z12 = z10;
                        break;
                }
            }
            pixels = state.f19030a.toPixels(cLObject.getFloat(next));
        }
    }

    public static void i(State state, LayoutVariables layoutVariables, String str, CLObject cLObject) throws CLParsingException {
        ConstraintReference constraintReferenceConstraints = state.constraints(str);
        if (constraintReferenceConstraints.getWidth() == null) {
            constraintReferenceConstraints.setWidth(Dimension.createWrap());
        }
        if (constraintReferenceConstraints.getHeight() == null) {
            constraintReferenceConstraints.setHeight(Dimension.createWrap());
        }
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        Iterator<String> it = arrayListNames.iterator();
        while (it.hasNext()) {
            a(cLObject, constraintReferenceConstraints, layoutVariables, state, it.next());
        }
    }

    public static void parseDesignElementsJSON(String str, ArrayList<DesignElement> arrayList) throws CLParsingException {
        CLObject cLObject = CLParser.parse(str);
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames != null && arrayListNames.size() > 0) {
            String str2 = arrayListNames.get(0);
            CLElement cLElement = cLObject.get(str2);
            str2.getClass();
            if (str2.equals("Design") && (cLElement instanceof CLObject)) {
                CLObject cLObject2 = (CLObject) cLElement;
                ArrayList<String> arrayListNames2 = cLObject2.names();
                for (int i10 = 0; i10 < arrayListNames2.size(); i10++) {
                    String str3 = arrayListNames2.get(i10);
                    CLObject cLObject3 = (CLObject) cLObject2.get(str3);
                    System.out.printf(h0.b("element found ", str3, ""), new Object[0]);
                    String stringOrNull = cLObject3.getStringOrNull("type");
                    if (stringOrNull != null) {
                        HashMap<String, String> map = new HashMap<>();
                        int size = cLObject3.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            CLKey cLKey = (CLKey) cLObject3.get(i10);
                            String strContent = cLKey.content();
                            String strContent2 = cLKey.getValue().content();
                            if (strContent2 != null) {
                                map.put(strContent, strContent2);
                            }
                        }
                        DesignElement designElement = new DesignElement();
                        designElement.f19006a = str2;
                        designElement.f19007b = stringOrNull;
                        designElement.f19008c = map;
                        arrayList.add(designElement);
                    }
                }
            }
        }
    }

    public static void parseJSON(String str, Transition transition, int i10) {
        CLObject objectOrNull;
        try {
            CLObject cLObject = CLParser.parse(str);
            ArrayList<String> arrayListNames = cLObject.names();
            if (arrayListNames == null) {
                return;
            }
            for (String str2 : arrayListNames) {
                CLElement cLElement = cLObject.get(str2);
                if ((cLElement instanceof CLObject) && (objectOrNull = ((CLObject) cLElement).getObjectOrNull("custom")) != null) {
                    for (String str3 : objectOrNull.names()) {
                        CLElement cLElement2 = objectOrNull.get(str3);
                        if (cLElement2 instanceof CLNumber) {
                            transition.addCustomFloat(i10, str2, str3, cLElement2.getFloat());
                        } else if (cLElement2 instanceof CLString) {
                            long jC = c(cLElement2.content());
                            if (jC != -1) {
                                transition.addCustomColor(i10, str2, str3, (int) jC);
                            }
                        }
                    }
                }
            }
        } catch (CLParsingException e5) {
            System.err.println("Error parsing JSON " + e5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    public static void parseMotionSceneJSON(CoreMotionScene coreMotionScene, String str) {
        byte b10;
        String stringOrNull;
        try {
            CLObject cLObject = CLParser.parse(str);
            ArrayList<String> arrayListNames = cLObject.names();
            if (arrayListNames == null) {
                return;
            }
            for (String str2 : arrayListNames) {
                CLElement cLElement = cLObject.get(str2);
                if (cLElement instanceof CLObject) {
                    CLObject cLObject2 = (CLObject) cLElement;
                    int iHashCode = str2.hashCode();
                    if (iHashCode != -2137403731) {
                        if (iHashCode != -241441378) {
                            if (iHashCode == 1101852654 && str2.equals("ConstraintSets")) {
                                b10 = 0;
                            } else {
                                b10 = -1;
                            }
                        } else if (str2.equals(TypedValues.TransitionType.NAME)) {
                            b10 = 1;
                        } else {
                            b10 = -1;
                        }
                    } else if (str2.equals("Header")) {
                        b10 = 2;
                    } else {
                        b10 = -1;
                    }
                    if (b10 == 0) {
                        e(coreMotionScene, cLObject2);
                    } else if (b10 == 1) {
                        ArrayList<String> arrayListNames2 = cLObject2.names();
                        if (arrayListNames2 != null) {
                            for (String str3 : arrayListNames2) {
                                coreMotionScene.setTransitionContent(str3, cLObject2.getObject(str3).toJSON());
                            }
                        }
                    } else if (b10 == 2 && (stringOrNull = cLObject2.getStringOrNull("export")) != null) {
                        coreMotionScene.setDebugName(stringOrNull);
                    }
                }
            }
        } catch (CLParsingException e5) {
            System.err.println("Error parsing JSON " + e5);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0160  */
    /* JADX WARN: Code duplicated, block: B:101:0x0162 A[PHI: r22
      0x0162: PHI (r22v28 java.util.Iterator<java.lang.String>) = 
      (r22v14 java.util.Iterator<java.lang.String>)
      (r22v15 java.util.Iterator<java.lang.String>)
      (r22v16 java.util.Iterator<java.lang.String>)
      (r22v17 java.util.Iterator<java.lang.String>)
      (r22v18 java.util.Iterator<java.lang.String>)
      (r22v19 java.util.Iterator<java.lang.String>)
      (r22v20 java.util.Iterator<java.lang.String>)
      (r22v21 java.util.Iterator<java.lang.String>)
      (r22v22 java.util.Iterator<java.lang.String>)
      (r22v23 java.util.Iterator<java.lang.String>)
      (r22v24 java.util.Iterator<java.lang.String>)
      (r22v25 java.util.Iterator<java.lang.String>)
      (r22v26 java.util.Iterator<java.lang.String>)
      (r22v29 java.util.Iterator<java.lang.String>)
     binds: [B:151:0x0215, B:147:0x0207, B:143:0x01f9, B:139:0x01ec, B:135:0x01de, B:131:0x01d0, B:127:0x01c3, B:123:0x01b3, B:119:0x01a6, B:115:0x0197, B:111:0x0188, B:107:0x017b, B:103:0x016e, B:100:0x0160] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x0165  */
    /* JADX WARN: Code duplicated, block: B:105:0x0171  */
    /* JADX WARN: Code duplicated, block: B:106:0x0175  */
    /* JADX WARN: Code duplicated, block: B:109:0x017e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0182  */
    /* JADX WARN: Code duplicated, block: B:113:0x018b  */
    /* JADX WARN: Code duplicated, block: B:114:0x018f  */
    /* JADX WARN: Code duplicated, block: B:117:0x019a  */
    /* JADX WARN: Code duplicated, block: B:118:0x019e  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:129:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:130:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:133:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:134:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:137:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:138:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:142:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:145:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:149:0x020b  */
    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    /* JADX WARN: Code duplicated, block: B:150:0x020d  */
    /* JADX WARN: Code duplicated, block: B:153:0x0219  */
    /* JADX WARN: Code duplicated, block: B:156:0x021f  */
    /* JADX WARN: Code duplicated, block: B:160:0x022d  */
    /* JADX WARN: Code duplicated, block: B:161:0x023d  */
    /* JADX WARN: Code duplicated, block: B:162:0x0249  */
    /* JADX WARN: Code duplicated, block: B:164:0x0257  */
    /* JADX WARN: Code duplicated, block: B:165:0x025c  */
    /* JADX WARN: Code duplicated, block: B:166:0x0266  */
    /* JADX WARN: Code duplicated, block: B:167:0x0272  */
    /* JADX WARN: Code duplicated, block: B:168:0x027e  */
    /* JADX WARN: Code duplicated, block: B:170:0x0286  */
    /* JADX WARN: Code duplicated, block: B:173:0x0294  */
    /* JADX WARN: Code duplicated, block: B:176:0x029b  */
    /* JADX WARN: Code duplicated, block: B:178:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:180:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:182:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:184:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:186:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:188:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:190:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:191:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:193:0x030b  */
    /* JADX WARN: Code duplicated, block: B:194:0x0310  */
    /* JADX WARN: Code duplicated, block: B:197:0x0346  */
    /* JADX WARN: Code duplicated, block: B:199:0x035a  */
    /* JADX WARN: Code duplicated, block: B:201:0x0366  */
    /* JADX WARN: Code duplicated, block: B:203:0x0380  */
    /* JADX WARN: Code duplicated, block: B:204:0x0389  */
    /* JADX WARN: Code duplicated, block: B:208:0x03a2 A[Catch: NumberFormatException -> 0x022a, TryCatch #4 {NumberFormatException -> 0x022a, blocks: (B:206:0x0393, B:208:0x03a2, B:209:0x03a9, B:211:0x03b1, B:273:0x053b, B:275:0x054a, B:276:0x0551, B:278:0x0559), top: B:728:0x0393 }] */
    /* JADX WARN: Code duplicated, block: B:211:0x03b1 A[Catch: NumberFormatException -> 0x022a, TRY_LEAVE, TryCatch #4 {NumberFormatException -> 0x022a, blocks: (B:206:0x0393, B:208:0x03a2, B:209:0x03a9, B:211:0x03b1, B:273:0x053b, B:275:0x054a, B:276:0x0551, B:278:0x0559), top: B:728:0x0393 }] */
    /* JADX WARN: Code duplicated, block: B:213:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:215:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:217:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:219:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:223:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:224:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:226:0x043b  */
    /* JADX WARN: Code duplicated, block: B:228:0x0447  */
    /* JADX WARN: Code duplicated, block: B:230:0x0451  */
    /* JADX WARN: Code duplicated, block: B:232:0x0461  */
    /* JADX WARN: Code duplicated, block: B:233:0x0466  */
    /* JADX WARN: Code duplicated, block: B:234:0x0468  */
    /* JADX WARN: Code duplicated, block: B:237:0x0474  */
    /* JADX WARN: Code duplicated, block: B:240:0x0481  */
    /* JADX WARN: Code duplicated, block: B:243:0x048e  */
    /* JADX WARN: Code duplicated, block: B:244:0x0497  */
    /* JADX WARN: Code duplicated, block: B:247:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:250:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:251:0x04be  */
    /* JADX WARN: Code duplicated, block: B:254:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:255:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:258:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:260:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:261:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:262:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:263:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:264:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:266:0x0502  */
    /* JADX WARN: Code duplicated, block: B:268:0x050e  */
    /* JADX WARN: Code duplicated, block: B:270:0x0528  */
    /* JADX WARN: Code duplicated, block: B:271:0x0531  */
    /* JADX WARN: Code duplicated, block: B:275:0x054a A[Catch: NumberFormatException -> 0x022a, TryCatch #4 {NumberFormatException -> 0x022a, blocks: (B:206:0x0393, B:208:0x03a2, B:209:0x03a9, B:211:0x03b1, B:273:0x053b, B:275:0x054a, B:276:0x0551, B:278:0x0559), top: B:728:0x0393 }] */
    /* JADX WARN: Code duplicated, block: B:278:0x0559 A[Catch: NumberFormatException -> 0x022a, TRY_LEAVE, TryCatch #4 {NumberFormatException -> 0x022a, blocks: (B:206:0x0393, B:208:0x03a2, B:209:0x03a9, B:211:0x03b1, B:273:0x053b, B:275:0x054a, B:276:0x0551, B:278:0x0559), top: B:728:0x0393 }] */
    /* JADX WARN: Code duplicated, block: B:280:0x0562  */
    /* JADX WARN: Code duplicated, block: B:282:0x056e  */
    /* JADX WARN: Code duplicated, block: B:284:0x0578  */
    /* JADX WARN: Code duplicated, block: B:286:0x0588  */
    /* JADX WARN: Code duplicated, block: B:287:0x058d  */
    /* JADX WARN: Code duplicated, block: B:288:0x058f  */
    /* JADX WARN: Code duplicated, block: B:291:0x059b  */
    /* JADX WARN: Code duplicated, block: B:294:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:297:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:298:0x05be  */
    /* JADX WARN: Code duplicated, block: B:300:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:302:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:303:0x05df  */
    /* JADX WARN: Code duplicated, block: B:304:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:307:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:310:0x060d  */
    /* JADX WARN: Code duplicated, block: B:313:0x0617  */
    /* JADX WARN: Code duplicated, block: B:316:0x062c  */
    /* JADX WARN: Code duplicated, block: B:319:0x0635  */
    /* JADX WARN: Code duplicated, block: B:320:0x0637  */
    /* JADX WARN: Code duplicated, block: B:323:0x0640  */
    /* JADX WARN: Code duplicated, block: B:324:0x0642  */
    /* JADX WARN: Code duplicated, block: B:327:0x064b  */
    /* JADX WARN: Code duplicated, block: B:335:0x065d A[LOOP:5: B:333:0x0657->B:335:0x065d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:339:0x0688  */
    /* JADX WARN: Code duplicated, block: B:342:0x0692  */
    /* JADX WARN: Code duplicated, block: B:343:0x0694  */
    /* JADX WARN: Code duplicated, block: B:346:0x069d  */
    /* JADX WARN: Code duplicated, block: B:347:0x069f  */
    /* JADX WARN: Code duplicated, block: B:350:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:351:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:354:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:355:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:358:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:359:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:362:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:378:0x0725  */
    /* JADX WARN: Code duplicated, block: B:380:0x0730  */
    /* JADX WARN: Code duplicated, block: B:381:0x0735  */
    /* JADX WARN: Code duplicated, block: B:385:0x074a  */
    /* JADX WARN: Code duplicated, block: B:388:0x0760  */
    /* JADX WARN: Code duplicated, block: B:391:0x076a  */
    /* JADX WARN: Code duplicated, block: B:392:0x076c  */
    /* JADX WARN: Code duplicated, block: B:395:0x0776  */
    /* JADX WARN: Code duplicated, block: B:396:0x0778  */
    /* JADX WARN: Code duplicated, block: B:399:0x0781  */
    /* JADX WARN: Code duplicated, block: B:400:0x0783  */
    /* JADX WARN: Code duplicated, block: B:403:0x078c  */
    /* JADX WARN: Code duplicated, block: B:404:0x078e  */
    /* JADX WARN: Code duplicated, block: B:407:0x0798  */
    /* JADX WARN: Code duplicated, block: B:408:0x079a  */
    /* JADX WARN: Code duplicated, block: B:411:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:412:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:415:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:416:0x07b0  */
    /* JADX WARN: Code duplicated, block: B:419:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:424:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:426:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:427:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:430:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:432:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:433:0x0800  */
    /* JADX WARN: Code duplicated, block: B:434:0x0806  */
    /* JADX WARN: Code duplicated, block: B:437:0x0814  */
    /* JADX WARN: Code duplicated, block: B:440:0x0820  */
    /* JADX WARN: Code duplicated, block: B:443:0x0827  */
    /* JADX WARN: Code duplicated, block: B:445:0x082f  */
    /* JADX WARN: Code duplicated, block: B:447:0x0837  */
    /* JADX WARN: Code duplicated, block: B:449:0x0849  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:451:0x084c  */
    /* JADX WARN: Code duplicated, block: B:453:0x084f  */
    /* JADX WARN: Code duplicated, block: B:455:0x0852  */
    /* JADX WARN: Code duplicated, block: B:457:0x0858  */
    /* JADX WARN: Code duplicated, block: B:458:0x088e  */
    /* JADX WARN: Code duplicated, block: B:459:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:460:0x08c7  */
    /* JADX WARN: Code duplicated, block: B:462:0x08d9  */
    /* JADX WARN: Code duplicated, block: B:463:0x08df  */
    /* JADX WARN: Code duplicated, block: B:467:0x091c  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:470:0x0935  */
    /* JADX WARN: Code duplicated, block: B:472:0x0945  */
    /* JADX WARN: Code duplicated, block: B:473:0x0948  */
    /* JADX WARN: Code duplicated, block: B:476:0x0951  */
    /* JADX WARN: Code duplicated, block: B:477:0x0955  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:480:0x095e  */
    /* JADX WARN: Code duplicated, block: B:481:0x0962  */
    /* JADX WARN: Code duplicated, block: B:484:0x096b  */
    /* JADX WARN: Code duplicated, block: B:485:0x096f  */
    /* JADX WARN: Code duplicated, block: B:488:0x0979  */
    /* JADX WARN: Code duplicated, block: B:489:0x097d  */
    /* JADX WARN: Code duplicated, block: B:492:0x0987  */
    /* JADX WARN: Code duplicated, block: B:493:0x098a  */
    /* JADX WARN: Code duplicated, block: B:496:0x0993  */
    /* JADX WARN: Code duplicated, block: B:497:0x0995  */
    /* JADX WARN: Code duplicated, block: B:500:0x099c  */
    /* JADX WARN: Code duplicated, block: B:501:0x099f  */
    /* JADX WARN: Code duplicated, block: B:504:0x09a8  */
    /* JADX WARN: Code duplicated, block: B:505:0x09ab  */
    /* JADX WARN: Code duplicated, block: B:508:0x09b4  */
    /* JADX WARN: Code duplicated, block: B:509:0x09b6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:512:0x09bd  */
    /* JADX WARN: Code duplicated, block: B:513:0x09bf  */
    /* JADX WARN: Code duplicated, block: B:516:0x09c9  */
    /* JADX WARN: Code duplicated, block: B:517:0x09cb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00be  */
    /* JADX WARN: Code duplicated, block: B:520:0x09d5  */
    /* JADX WARN: Code duplicated, block: B:532:0x0a05  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:550:0x0a4d A[Catch: Exception -> 0x0a54, TryCatch #2 {Exception -> 0x0a54, blocks: (B:548:0x0a45, B:550:0x0a4d, B:553:0x0a56), top: B:724:0x0a45 }] */
    /* JADX WARN: Code duplicated, block: B:553:0x0a56 A[Catch: Exception -> 0x0a54, TRY_LEAVE, TryCatch #2 {Exception -> 0x0a54, blocks: (B:548:0x0a45, B:550:0x0a4d, B:553:0x0a56), top: B:724:0x0a45 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:561:0x0a7d  */
    /* JADX WARN: Code duplicated, block: B:565:0x0a9f  */
    /* JADX WARN: Code duplicated, block: B:569:0x0abd  */
    /* JADX WARN: Code duplicated, block: B:572:0x0ac4 A[LOOP:9: B:570:0x0abe->B:572:0x0ac4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:575:0x0ae4  */
    /* JADX WARN: Code duplicated, block: B:577:0x0aee  */
    /* JADX WARN: Code duplicated, block: B:579:0x0b00  */
    /* JADX WARN: Code duplicated, block: B:586:0x0b11  */
    /* JADX WARN: Code duplicated, block: B:587:0x0b14  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:590:0x0b62  */
    /* JADX WARN: Code duplicated, block: B:591:0x0b6a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00de  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:695:0x0d87  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:724:0x0a45 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:0x0dd2 A[EDGE_INSN: B:734:0x0dd2->B:716:0x0dd2 BREAK  A[LOOP:6: B:383:0x0744->B:798:0x0744], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:747:0x0dd2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:752:0x05f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:0x0329 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:0x0329 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:762:0x0650 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:763:0x0675 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:764:0x070c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:765:0x0656 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:766:0x06d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:0x06e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:768:0x06e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:769:0x06ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:770:0x06f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:0x0705 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:772:0x06d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:773:0x06d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:774:0x06fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:775:0x06f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:776:0x0716 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:778:0x0611 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:779:0x0611 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:781:0x0611 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0106  */
    /* JADX WARN: Code duplicated, block: B:790:0x0611 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:792:0x0912 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:793:0x08f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:794:0x08f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:795:0x07bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:796:0x07c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:797:0x080c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0108  */
    /* JADX WARN: Code duplicated, block: B:805:0x0adc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:806:0x0b54 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:807:0x09dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:808:0x09e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:809:0x09fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:810:0x0a09 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:811:0x0a1d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:812:0x0a31 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:813:0x0a82 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:814:0x0a95 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:815:0x0aa4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:816:0x0ab7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0111  */
    /* JADX WARN: Code duplicated, block: B:83:0x0113  */
    /* JADX WARN: Code duplicated, block: B:86:0x011a  */
    /* JADX WARN: Code duplicated, block: B:90:0x012a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0130  */
    /* JADX WARN: Code duplicated, block: B:93:0x0139  */
    /* JADX WARN: Code duplicated, block: B:94:0x013b  */
    /* JADX WARN: Code duplicated, block: B:98:0x014e  */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void populateState(@NonNull CLObject cLObject, @NonNull State state, @NonNull LayoutVariables layoutVariables) throws CLParsingException {
        byte b10;
        Iterator<String> it;
        CLObject cLObject2;
        String stringOrNull;
        CLObject cLObject3;
        String stringOrNull2;
        CLObject cLObject4;
        ArrayList<String> arrayListNames;
        CLObject cLObject5;
        ArrayList<String> arrayListNames2;
        String str;
        String str2;
        GridReference grid;
        CLArray arrayOrNull;
        int i10;
        int i11;
        String strContent;
        String strContent2;
        String strContent3;
        int i12;
        String strContent4;
        CLElement cLElement;
        float f6;
        float f10;
        float f11;
        float f12;
        CLArray cLArray;
        String strContent5;
        int i13;
        CLElement cLElement2;
        ChainReference chainReferenceVerticalChain;
        Iterator<String> it2;
        String next;
        CLElement cLElement3;
        CLArray cLArray2;
        int i14;
        CLElement cLElement4;
        CLArray cLArray3;
        int size;
        float pixels;
        float f13;
        float pixels2;
        float pixels3;
        float pixels4;
        CLElement cLElement5;
        String strContent6;
        CLArray cLArray4;
        boolean z10;
        BarrierReference barrierReferenceBarrier;
        ArrayList<String> arrayListNames3;
        float floatOrNaN;
        String string;
        CLArray arrayOrNull2;
        int i15;
        boolean z11;
        FlowReference flow;
        Iterator<String> it3;
        String next2;
        byte b11;
        String str3;
        String strContent7;
        CLElement cLElement6;
        String strContent8;
        String string2;
        String string3;
        CLArray cLArray5;
        CLElement cLElement7;
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        CLArray cLArray6;
        String strContent9;
        CLElement cLElement8;
        String strContent10;
        String string4;
        String string5;
        CLArray cLArray7;
        CLElement cLElement9;
        float f14;
        float f15;
        float f16;
        float f17;
        CLArray cLArray8;
        float f18;
        CLElement cLElement10;
        Float fValueOf4;
        Float fValueOf5;
        Float fValueOf6;
        CLArray cLArray9;
        CLElement cLElement11;
        CLArray cLArray10;
        int i16;
        CLElement cLElement12;
        CLArray cLArray11;
        int size2;
        float f19;
        float pixels5;
        float pixels6;
        float f20;
        ArrayList<String> arrayListNames4 = cLObject.names();
        if (arrayListNames4 == null) {
            return;
        }
        Iterator<String> it4 = arrayListNames4.iterator();
        while (it4.hasNext()) {
            String next3 = it4.next();
            CLElement cLElement13 = cLObject.get(next3);
            next3.getClass();
            int iHashCode = next3.hashCode();
            if (iHashCode != -1824489883) {
                if (iHashCode != 1875016085) {
                    if (iHashCode == 1921490263 && next3.equals("Variables")) {
                        b10 = 2;
                    } else {
                        b10 = -1;
                    }
                } else if (next3.equals("Generate")) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
            } else if (next3.equals("Helpers")) {
                b10 = 0;
            } else {
                b10 = -1;
            }
            if (b10 != 0) {
                String string6 = null;
                if (b10 == 1) {
                    it = it4;
                    if ((cLElement13 instanceof CLObject) && (arrayListNames = (cLObject4 = (CLObject) cLElement13).names()) != null) {
                        for (String str4 : arrayListNames) {
                            CLElement cLElement14 = cLObject4.get(str4);
                            HashMap<String, ArrayList<String>> map = layoutVariables.f19011c;
                            ArrayList<String> arrayList = map.containsKey(str4) ? map.get(str4) : null;
                            if (arrayList != null && (cLElement14 instanceof CLObject)) {
                                Iterator<String> it5 = arrayList.iterator();
                                while (it5.hasNext()) {
                                    i(state, layoutVariables, it5.next(), (CLObject) cLElement14);
                                }
                            }
                        }
                    }
                } else if (b10 == 2) {
                    it = it4;
                    if ((cLElement13 instanceof CLObject) && (arrayListNames2 = (cLObject5 = (CLObject) cLElement13).names()) != null) {
                        for (String str5 : arrayListNames2) {
                            CLElement cLElement15 = cLObject5.get(str5);
                            if (cLElement15 instanceof CLNumber) {
                                layoutVariables.f19009a.put(str5, Integer.valueOf(cLElement15.getInt()));
                            } else if (cLElement15 instanceof CLObject) {
                                CLObject cLObject6 = (CLObject) cLElement15;
                                if (cLObject6.has("from") && cLObject6.has(TypedValues.TransitionType.S_TO)) {
                                    float fA = layoutVariables.a(cLObject6.get("from"));
                                    float fA2 = layoutVariables.a(cLObject6.get(TypedValues.TransitionType.S_TO));
                                    String stringOrNull3 = cLObject6.getStringOrNull("prefix");
                                    String stringOrNull4 = cLObject6.getStringOrNull("postfix");
                                    HashMap<String, b> map2 = layoutVariables.f19010b;
                                    if (!map2.containsKey(str5) || !(map2.get(str5) instanceof d)) {
                                        a aVar = new a();
                                        aVar.f19013b = false;
                                        aVar.f19016e = 0.0f;
                                        aVar.f19012a = 1.0f;
                                        if (stringOrNull3 == null) {
                                            stringOrNull3 = "";
                                        }
                                        aVar.f19014c = stringOrNull3;
                                        if (stringOrNull4 == null) {
                                            stringOrNull4 = "";
                                        }
                                        aVar.f19015d = stringOrNull4;
                                        aVar.f19017f = fA2;
                                        map2.put(str5, aVar);
                                        HashMap<String, ArrayList<String>> map3 = layoutVariables.f19011c;
                                        ArrayList<String> arrayList2 = new ArrayList<>();
                                        int i17 = (int) fA;
                                        int i18 = (int) fA2;
                                        int i19 = i17;
                                        while (i17 <= i18) {
                                            arrayList2.add(aVar.f19014c + i19 + aVar.f19015d);
                                            i19 += (int) aVar.f19012a;
                                            i17++;
                                        }
                                        map3.put(str5, arrayList2);
                                    }
                                } else if (cLObject6.has("from") && cLObject6.has("step")) {
                                    float fA3 = layoutVariables.a(cLObject6.get("from"));
                                    float fA4 = layoutVariables.a(cLObject6.get("step"));
                                    HashMap<String, b> map4 = layoutVariables.f19010b;
                                    if (!map4.containsKey(str5) || !(map4.get(str5) instanceof d)) {
                                        c cVar = new c();
                                        cVar.f19018a = fA4;
                                        cVar.f19019b = fA3;
                                        map4.put(str5, cVar);
                                    }
                                } else if (cLObject6.has(RelayedService.KEY_IDS)) {
                                    CLArray array = cLObject6.getArray(RelayedService.KEY_IDS);
                                    ArrayList<String> arrayList3 = new ArrayList<>();
                                    for (int i20 = 0; i20 < array.size(); i20++) {
                                        arrayList3.add(array.getString(i20));
                                    }
                                    layoutVariables.f19011c.put(str5, arrayList3);
                                } else if (cLObject6.has(LogKeysKt.TAG)) {
                                    layoutVariables.f19011c.put(str5, state.getIdsForTag(cLObject6.getString(LogKeysKt.TAG)));
                                }
                            }
                        }
                    }
                } else if (cLElement13 instanceof CLObject) {
                    CLObject cLObject7 = (CLObject) cLElement13;
                    Iterator<String> it6 = cLObject7.names().iterator();
                    while (it6.hasNext()) {
                        if (it6.next().equals("type")) {
                            string6 = cLObject7.getString("type");
                            str = string6;
                            if (str != null) {
                                str2 = "hFlow";
                                switch (str) {
                                    case "vGuideline":
                                        it = it4;
                                        h(1, state, next3, cLObject7);
                                        continue;
                                        continue;
                                        break;
                                    case "column":
                                    case "row":
                                    case "grid":
                                        it = it4;
                                        grid = state.getGrid(next3, str);
                                        for (String str6 : cLObject7.names()) {
                                            str6.getClass();
                                            switch (str6) {
                                                case "orientation":
                                                    grid.setOrientation(cLObject7.get(str6).getInt());
                                                    break;
                                                case "padding":
                                                    cLElement = cLObject7.get(str6);
                                                    if (cLElement instanceof CLArray) {
                                                        cLArray = (CLArray) cLElement;
                                                        if (cLArray.size() > 1) {
                                                            f6 = cLArray.getInt(0);
                                                            f12 = cLArray.getInt(1);
                                                            if (cLArray.size() > 2) {
                                                                f11 = cLArray.getInt(2);
                                                                try {
                                                                    try {
                                                                        f10 = ((CLArray) cLElement).getInt(3);
                                                                    } catch (ArrayIndexOutOfBoundsException unused) {
                                                                        f10 = 0.0f;
                                                                    }
                                                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                                                }
                                                            } else {
                                                                f11 = f6;
                                                                f10 = f12;
                                                            }
                                                        } else {
                                                            f6 = cLElement.getInt();
                                                            f10 = f6;
                                                            f11 = f10;
                                                            f12 = f11;
                                                        }
                                                    } else {
                                                        f6 = cLElement.getInt();
                                                        f10 = f6;
                                                        f11 = f10;
                                                        f12 = f11;
                                                    }
                                                    grid.setPaddingStart(Math.round(state.f19030a.toPixels(f6)));
                                                    grid.setPaddingTop(Math.round(state.f19030a.toPixels(f12)));
                                                    grid.setPaddingEnd(Math.round(state.f19030a.toPixels(f11)));
                                                    grid.setPaddingBottom(Math.round(state.f19030a.toPixels(f10)));
                                                    break;
                                                case "contains":
                                                    arrayOrNull = cLObject7.getArrayOrNull(str6);
                                                    if (arrayOrNull != null) {
                                                        for (i10 = 0; i10 < arrayOrNull.size(); i10++) {
                                                            grid.add(state.constraints(arrayOrNull.get(i10).content()));
                                                        }
                                                    }
                                                    break;
                                                case "hGap":
                                                    grid.setHorizontalGaps(state.f19030a.toPixels(cLObject7.get(str6).getFloat()));
                                                    break;
                                                case "rows":
                                                    i11 = cLObject7.get(str6).getInt();
                                                    if (i11 > 0) {
                                                        grid.setRowsSet(i11);
                                                    }
                                                    break;
                                                case "vGap":
                                                    grid.setVerticalGaps(state.f19030a.toPixels(cLObject7.get(str6).getFloat()));
                                                    break;
                                                case "flags":
                                                    try {
                                                        cLElement2 = cLObject7.get(str6);
                                                        if (cLElement2 instanceof CLNumber) {
                                                            i13 = cLElement2.getInt();
                                                            strContent5 = "";
                                                        } else {
                                                            strContent5 = cLElement2.content();
                                                            i13 = 0;
                                                        }
                                                    } catch (Exception e5) {
                                                        System.err.println("Error parsing grid flags " + e5);
                                                        strContent5 = "";
                                                    }
                                                    if (strContent5 != null || strContent5.isEmpty()) {
                                                        grid.setFlags(i13);
                                                    } else {
                                                        grid.setFlags(strContent5);
                                                    }
                                                    break;
                                                case "skips":
                                                    strContent = cLObject7.get(str6).content();
                                                    if (strContent != null && strContent.contains(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER)) {
                                                        grid.setSkips(strContent);
                                                    }
                                                    break;
                                                case "spans":
                                                    strContent2 = cLObject7.get(str6).content();
                                                    if (strContent2 != null && strContent2.contains(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER)) {
                                                        grid.setSpans(strContent2);
                                                    }
                                                    break;
                                                case "rowWeights":
                                                    strContent3 = cLObject7.get(str6).content();
                                                    if (strContent3 != null && strContent3.contains(",")) {
                                                        grid.setRowWeights(strContent3);
                                                    }
                                                    break;
                                                case "columns":
                                                    i12 = cLObject7.get(str6).getInt();
                                                    if (i12 > 0) {
                                                        grid.setColumnsSet(i12);
                                                    }
                                                    break;
                                                case "columnWeights":
                                                    strContent4 = cLObject7.get(str6).content();
                                                    if (strContent4 != null && strContent4.contains(",")) {
                                                        grid.setColumnWeights(strContent4);
                                                    }
                                                    break;
                                                default:
                                                    a(cLObject7, state.constraints(next3), layoutVariables, state, str6);
                                                    break;
                                            }
                                        }
                                        continue;
                                        continue;
                                        break;
                                    case "hChain":
                                    case "vChain":
                                        it = it4;
                                        if (str.charAt(0) == 'h') {
                                            chainReferenceVerticalChain = state.horizontalChain();
                                        } else {
                                            chainReferenceVerticalChain = state.verticalChain();
                                        }
                                        chainReferenceVerticalChain.setKey(next3);
                                        it2 = cLObject7.names().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                continue;
                                                continue;
                                            }
                                            next = it2.next();
                                            next.getClass();
                                            next.hashCode();
                                            switch (next) {
                                                case "bottom":
                                                case "end":
                                                case "top":
                                                case "left":
                                                case "right":
                                                case "start":
                                                    d(cLObject7, chainReferenceVerticalChain, layoutVariables, state, next);
                                                    break;
                                                case "contains":
                                                    cLElement3 = cLObject7.get(next);
                                                    if (cLElement3 instanceof CLArray) {
                                                        cLArray2 = (CLArray) cLElement3;
                                                        if (cLArray2.size() < 1) {
                                                            for (i14 = 0; i14 < cLArray2.size(); i14++) {
                                                                cLElement4 = cLArray2.get(i14);
                                                                if (cLElement4 instanceof CLArray) {
                                                                    cLArray3 = (CLArray) cLElement4;
                                                                    if (cLArray3.size() > 0) {
                                                                        String strContent11 = cLArray3.get(0).content();
                                                                        size = cLArray3.size();
                                                                        pixels = Float.NaN;
                                                                        if (size != 2) {
                                                                            if (size != 3) {
                                                                                pixels4 = Float.NaN;
                                                                                pixels3 = Float.NaN;
                                                                                f13 = cLArray3.getFloat(1);
                                                                                pixels = state.f19030a.toPixels(cLArray3.getFloat(2));
                                                                                pixels2 = pixels;
                                                                            } else if (size != 4) {
                                                                                float f21 = cLArray3.getFloat(1);
                                                                                pixels4 = Float.NaN;
                                                                                pixels3 = Float.NaN;
                                                                                pixels = state.f19030a.toPixels(cLArray3.getFloat(2));
                                                                                f13 = f21;
                                                                                pixels2 = state.f19030a.toPixels(cLArray3.getFloat(3));
                                                                            } else if (size != 6) {
                                                                                f13 = Float.NaN;
                                                                                pixels2 = Float.NaN;
                                                                            } else {
                                                                                float f22 = cLArray3.getFloat(1);
                                                                                float pixels7 = state.f19030a.toPixels(cLArray3.getFloat(2));
                                                                                pixels2 = state.f19030a.toPixels(cLArray3.getFloat(3));
                                                                                pixels4 = state.f19030a.toPixels(cLArray3.getFloat(4));
                                                                                pixels3 = state.f19030a.toPixels(cLArray3.getFloat(5));
                                                                                pixels = pixels7;
                                                                                f13 = f22;
                                                                            }
                                                                            chainReferenceVerticalChain.addChainElement(strContent11, f13, pixels, pixels2, pixels4, pixels3);
                                                                        } else {
                                                                            f13 = cLArray3.getFloat(1);
                                                                            pixels2 = Float.NaN;
                                                                        }
                                                                        pixels4 = pixels2;
                                                                        pixels3 = pixels4;
                                                                        chainReferenceVerticalChain.addChainElement(strContent11, f13, pixels, pixels2, pixels4, pixels3);
                                                                    }
                                                                } else {
                                                                    chainReferenceVerticalChain.add(cLElement4.content());
                                                                }
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    PrintStream printStream = System.err;
                                                    StringBuilder sbE = f.e(next3, " contains should be an array \"");
                                                    sbE.append(cLElement3.content());
                                                    sbE.append("\"");
                                                    printStream.println(sbE.toString());
                                                    break;
                                                case "style":
                                                    cLElement5 = cLObject7.get(next);
                                                    if (cLElement5 instanceof CLArray) {
                                                        cLArray4 = (CLArray) cLElement5;
                                                        if (cLArray4.size() > 1) {
                                                            strContent6 = cLArray4.getString(0);
                                                            chainReferenceVerticalChain.bias(cLArray4.getFloat(1));
                                                        } else {
                                                            strContent6 = cLElement5.content();
                                                        }
                                                    } else {
                                                        strContent6 = cLElement5.content();
                                                    }
                                                    strContent6.getClass();
                                                    if (!strContent6.equals("packed")) {
                                                        chainReferenceVerticalChain.style(State.Chain.PACKED);
                                                    } else if (strContent6.equals("spread_inside")) {
                                                        chainReferenceVerticalChain.style(State.Chain.SPREAD_INSIDE);
                                                    } else {
                                                        chainReferenceVerticalChain.style(State.Chain.SPREAD);
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                            break;
                                        }
                                        break;
                                    case "barrier":
                                        it = it4;
                                        z10 = !state.isRtl();
                                        barrierReferenceBarrier = state.barrier(next3, State.Direction.END);
                                        arrayListNames3 = cLObject7.names();
                                        if (arrayListNames3 == null) {
                                            for (String str7 : arrayListNames3) {
                                                str7.getClass();
                                                str7.hashCode();
                                                switch (str7) {
                                                    case "margin":
                                                        floatOrNaN = cLObject7.getFloatOrNaN(str7);
                                                        if (!Float.isNaN(floatOrNaN)) {
                                                            barrierReferenceBarrier.margin(Float.valueOf(state.f19030a.toPixels(floatOrNaN)));
                                                            break;
                                                        } else {
                                                            break;
                                                        }
                                                        break;
                                                    case "direction":
                                                        string = cLObject7.getString(str7);
                                                        string.getClass();
                                                        string.hashCode();
                                                        switch (string) {
                                                            case "bottom":
                                                                barrierReferenceBarrier.setBarrierDirection(State.Direction.BOTTOM);
                                                                break;
                                                            case "end":
                                                                if (!z10) {
                                                                    barrierReferenceBarrier.setBarrierDirection(State.Direction.LEFT);
                                                                    break;
                                                                } else {
                                                                    barrierReferenceBarrier.setBarrierDirection(State.Direction.RIGHT);
                                                                    break;
                                                                }
                                                                break;
                                                            case "top":
                                                                barrierReferenceBarrier.setBarrierDirection(State.Direction.TOP);
                                                                break;
                                                            case "left":
                                                                barrierReferenceBarrier.setBarrierDirection(State.Direction.LEFT);
                                                                break;
                                                            case "right":
                                                                barrierReferenceBarrier.setBarrierDirection(State.Direction.RIGHT);
                                                                break;
                                                            case "start":
                                                                if (!z10) {
                                                                    barrierReferenceBarrier.setBarrierDirection(State.Direction.RIGHT);
                                                                    break;
                                                                } else {
                                                                    barrierReferenceBarrier.setBarrierDirection(State.Direction.LEFT);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                    case "contains":
                                                        arrayOrNull2 = cLObject7.getArrayOrNull(str7);
                                                        if (arrayOrNull2 == null) {
                                                            break;
                                                        } else {
                                                            for (i15 = 0; i15 < arrayOrNull2.size(); i15++) {
                                                                barrierReferenceBarrier.add(state.constraints(arrayOrNull2.get(i15).content()));
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                            continue;
                                            continue;
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                    case "hFlow":
                                    case "vFlow":
                                        if (str.charAt(0) == 'v') {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        flow = state.getFlow(next3, z11);
                                        it3 = cLObject7.names().iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                break;
                                            } else {
                                                next2 = it3.next();
                                                next2.getClass();
                                                switch (next2.hashCode()) {
                                                    case -1254185091:
                                                        it = it4;
                                                        if (next2.equals("hAlign")) {
                                                            b11 = 0;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1237307863:
                                                        it = it4;
                                                        if (next2.equals("hStyle")) {
                                                            b11 = 1;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -1198076529:
                                                        it = it4;
                                                        if (next2.equals("hFlowBias")) {
                                                            b11 = 2;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -853376977:
                                                        it = it4;
                                                        if (next2.equals("vAlign")) {
                                                            b11 = 3;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -836499749:
                                                        it = it4;
                                                        if (next2.equals("vStyle")) {
                                                            b11 = 4;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -806339567:
                                                        it = it4;
                                                        if (next2.equals("padding")) {
                                                            b11 = 5;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -732635235:
                                                        it = it4;
                                                        if (next2.equals("vFlowBias")) {
                                                            b11 = 6;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -567445985:
                                                        it = it4;
                                                        if (next2.equals(SecureSharingCommandFactory.ACTION_CONTAINS_VALUE)) {
                                                            b11 = 7;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case -488900360:
                                                        it = it4;
                                                        if (next2.equals("maxElement")) {
                                                            b11 = 8;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 3169614:
                                                        it = it4;
                                                        if (next2.equals("hGap")) {
                                                            b11 = 9;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 3575610:
                                                        it = it4;
                                                        if (next2.equals("type")) {
                                                            b11 = 10;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 3586688:
                                                        it = it4;
                                                        if (next2.equals("vGap")) {
                                                            b11 = 11;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    case 3657802:
                                                        it = it4;
                                                        if (next2.equals("wrap")) {
                                                            b11 = 12;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                        break;
                                                    default:
                                                        it = it4;
                                                        b11 = -1;
                                                        break;
                                                }
                                                switch (b11) {
                                                    case 0:
                                                        it3 = it3;
                                                        str3 = str2;
                                                        strContent7 = cLObject7.get(next2).content();
                                                        strContent7.getClass();
                                                        if (!strContent7.equals("end")) {
                                                            flow.setHorizontalAlign(1);
                                                        } else if (strContent7.equals(EventDataKeys.Lifecycle.LIFECYCLE_START)) {
                                                            flow.setHorizontalAlign(0);
                                                        } else {
                                                            flow.setHorizontalAlign(2);
                                                        }
                                                        it4 = it;
                                                        it3 = it3;
                                                        str2 = str3;
                                                        break;
                                                    case 1:
                                                        it3 = it3;
                                                        str3 = str2;
                                                        cLElement6 = cLObject7.get(next2);
                                                        if (cLElement6 instanceof CLArray) {
                                                            cLArray5 = (CLArray) cLElement6;
                                                            if (cLArray5.size() > 1) {
                                                                string2 = cLArray5.getString(0);
                                                                strContent8 = cLArray5.getString(1);
                                                                if (cLArray5.size() > 2) {
                                                                    string3 = cLArray5.getString(2);
                                                                } else {
                                                                    string3 = "";
                                                                }
                                                            } else {
                                                                strContent8 = cLElement6.content();
                                                                string2 = "";
                                                                string3 = string2;
                                                            }
                                                        } else {
                                                            strContent8 = cLElement6.content();
                                                            string2 = "";
                                                            string3 = string2;
                                                        }
                                                        if (!strContent8.equals("")) {
                                                            flow.setHorizontalStyle(State.Chain.getValueByString(strContent8));
                                                        }
                                                        if (!string2.equals("")) {
                                                            flow.setFirstHorizontalStyle(State.Chain.getValueByString(string2));
                                                        }
                                                        if (!string3.equals("")) {
                                                            flow.setLastHorizontalStyle(State.Chain.getValueByString(string3));
                                                        }
                                                        it4 = it;
                                                        it3 = it3;
                                                        str2 = str3;
                                                        break;
                                                    case 2:
                                                        it3 = it3;
                                                        str3 = str2;
                                                        cLElement7 = cLObject7.get(next2);
                                                        fValueOf = Float.valueOf(0.5f);
                                                        fValueOf2 = Float.valueOf(0.5f);
                                                        if (cLElement7 instanceof CLArray) {
                                                            cLArray6 = (CLArray) cLElement7;
                                                            if (cLArray6.size() > 1) {
                                                                Float fValueOf7 = Float.valueOf(cLArray6.getFloat(0));
                                                                fValueOf3 = Float.valueOf(cLArray6.getFloat(1));
                                                                fValueOf = fValueOf7;
                                                                if (cLArray6.size() > 2) {
                                                                    fValueOf2 = Float.valueOf(cLArray6.getFloat(2));
                                                                }
                                                            }
                                                            flow.horizontalBias(fValueOf3.floatValue());
                                                            if (fValueOf.floatValue() != 0.5f) {
                                                                flow.setFirstHorizontalBias(fValueOf.floatValue());
                                                            }
                                                            if (fValueOf2.floatValue() != 0.5f) {
                                                                flow.setLastHorizontalBias(fValueOf2.floatValue());
                                                            }
                                                            it4 = it;
                                                            it3 = it3;
                                                            str2 = str3;
                                                            break;
                                                        }
                                                        fValueOf3 = Float.valueOf(cLElement7.getFloat());
                                                        flow.horizontalBias(fValueOf3.floatValue());
                                                        if (fValueOf.floatValue() != 0.5f) {
                                                            flow.setFirstHorizontalBias(fValueOf.floatValue());
                                                        }
                                                        if (fValueOf2.floatValue() != 0.5f) {
                                                            flow.setLastHorizontalBias(fValueOf2.floatValue());
                                                        }
                                                        it4 = it;
                                                        it3 = it3;
                                                        str2 = str3;
                                                        break;
                                                    case 3:
                                                        it3 = it3;
                                                        str3 = str2;
                                                        strContent9 = cLObject7.get(next2).content();
                                                        strContent9.getClass();
                                                        strContent9.hashCode();
                                                        switch (strContent9) {
                                                            case "baseline":
                                                                flow.setVerticalAlign(3);
                                                                break;
                                                            case "bottom":
                                                                flow.setVerticalAlign(1);
                                                                break;
                                                            case "top":
                                                                flow.setVerticalAlign(0);
                                                                break;
                                                            default:
                                                                flow.setVerticalAlign(2);
                                                                break;
                                                        }
                                                        it4 = it;
                                                        it3 = it3;
                                                        str2 = str3;
                                                        break;
                                                    case 4:
                                                        it3 = it3;
                                                        str3 = str2;
                                                        cLElement8 = cLObject7.get(next2);
                                                        if (cLElement8 instanceof CLArray) {
                                                            cLArray7 = (CLArray) cLElement8;
                                                            if (cLArray7.size() > 1) {
                                                                string4 = cLArray7.getString(0);
                                                                strContent10 = cLArray7.getString(1);
                                                                if (cLArray7.size() > 2) {
                                                                    string5 = cLArray7.getString(2);
                                                                } else {
                                                                    string5 = "";
                                                                }
                                                            } else {
                                                                strContent10 = cLElement8.content();
                                                                string4 = "";
                                                                string5 = string4;
                                                            }
                                                        } else {
                                                            strContent10 = cLElement8.content();
                                                            string4 = "";
                                                            string5 = string4;
                                                        }
                                                        if (!strContent10.equals("")) {
                                                            flow.setVerticalStyle(State.Chain.getValueByString(strContent10));
                                                        }
                                                        if (!string4.equals("")) {
                                                            flow.setFirstVerticalStyle(State.Chain.getValueByString(string4));
                                                        }
                                                        if (!string5.equals("")) {
                                                            flow.setLastVerticalStyle(State.Chain.getValueByString(string5));
                                                        }
                                                        it4 = it;
                                                        it3 = it3;
                                                        str2 = str3;
                                                        break;
                                                    case 5:
                                                        it3 = it3;
                                                        str3 = str2;
                                                        cLElement9 = cLObject7.get(next2);
                                                        if (cLElement9 instanceof CLArray) {
                                                            cLArray8 = (CLArray) cLElement9;
                                                            if (cLArray8.size() > 1) {
                                                                f18 = cLArray8.getInt(0);
                                                                f17 = cLArray8.getInt(1);
                                                                if (cLArray8.size() > 2) {
                                                                    f16 = cLArray8.getInt(2);
                                                                    try {
                                                                        f15 = ((CLArray) cLElement9).getInt(3);
                                                                        f14 = f18;
                                                                    } catch (ArrayIndexOutOfBoundsException unused3) {
                                                                        f14 = f18;
                                                                        f15 = 0.0f;
                                                                    }
                                                                } else {
                                                                    f15 = f17;
                                                                    f16 = f18;
                                                                    f14 = f16;
                                                                }
                                                            } else {
                                                                f14 = cLElement9.getInt();
                                                                f15 = f14;
                                                                f16 = f15;
                                                                f17 = f16;
                                                            }
                                                        } else {
                                                            f14 = cLElement9.getInt();
                                                            f15 = f14;
                                                            f16 = f15;
                                                            f17 = f16;
                                                        }
                                                        flow.setPaddingLeft(Math.round(state.f19030a.toPixels(f14)));
                                                        flow.setPaddingTop(Math.round(state.f19030a.toPixels(f17)));
                                                        flow.setPaddingRight(Math.round(state.f19030a.toPixels(f16)));
                                                        flow.setPaddingBottom(Math.round(state.f19030a.toPixels(f15)));
                                                        it4 = it;
                                                        it3 = it3;
                                                        str2 = str3;
                                                        break;
                                                    case 6:
                                                        it3 = it3;
                                                        str3 = str2;
                                                        cLElement10 = cLObject7.get(next2);
                                                        fValueOf4 = Float.valueOf(0.5f);
                                                        fValueOf5 = Float.valueOf(0.5f);
                                                        try {
                                                            if (cLElement10 instanceof CLArray) {
                                                                cLArray9 = (CLArray) cLElement10;
                                                                if (cLArray9.size() > 1) {
                                                                    Float fValueOf8 = Float.valueOf(cLArray9.getFloat(0));
                                                                    fValueOf6 = Float.valueOf(cLArray9.getFloat(1));
                                                                    fValueOf4 = fValueOf8;
                                                                    if (cLArray9.size() > 2) {
                                                                        fValueOf5 = Float.valueOf(cLArray9.getFloat(2));
                                                                    }
                                                                }
                                                                flow.verticalBias(fValueOf6.floatValue());
                                                                if (fValueOf4.floatValue() != 0.5f) {
                                                                    flow.setFirstVerticalBias(fValueOf4.floatValue());
                                                                }
                                                                if (fValueOf5.floatValue() != 0.5f) {
                                                                    flow.setLastVerticalBias(fValueOf5.floatValue());
                                                                }
                                                                it4 = it;
                                                                it3 = it3;
                                                                str2 = str3;
                                                                break;
                                                            }
                                                            flow.verticalBias(fValueOf6.floatValue());
                                                            if (fValueOf4.floatValue() != 0.5f) {
                                                                flow.setFirstVerticalBias(fValueOf4.floatValue());
                                                            }
                                                            if (fValueOf5.floatValue() != 0.5f) {
                                                                flow.setLastVerticalBias(fValueOf5.floatValue());
                                                            }
                                                        } catch (NumberFormatException unused4) {
                                                        }
                                                        fValueOf6 = Float.valueOf(cLElement10.getFloat());
                                                        it4 = it;
                                                        it3 = it3;
                                                        str2 = str3;
                                                        break;
                                                    case 7:
                                                        cLElement11 = cLObject7.get(next2);
                                                        if (cLElement11 instanceof CLArray) {
                                                            cLArray10 = (CLArray) cLElement11;
                                                            if (cLArray10.size() < 1) {
                                                                i16 = 0;
                                                                while (i16 < cLArray10.size()) {
                                                                    cLElement12 = cLArray10.get(i16);
                                                                    if (cLElement12 instanceof CLArray) {
                                                                        cLArray11 = (CLArray) cLElement12;
                                                                        if (cLArray11.size() > 0) {
                                                                            String strContent12 = cLArray11.get(0).content();
                                                                            size2 = cLArray11.size();
                                                                            if (size2 != 2) {
                                                                                if (size2 != 3) {
                                                                                    f20 = cLArray11.getFloat(1);
                                                                                    pixels5 = state.f19030a.toPixels(cLArray11.getFloat(2));
                                                                                    pixels6 = pixels5;
                                                                                } else if (size2 != 4) {
                                                                                    f19 = Float.NaN;
                                                                                    pixels5 = Float.NaN;
                                                                                } else {
                                                                                    f20 = cLArray11.getFloat(1);
                                                                                    pixels6 = state.f19030a.toPixels(cLArray11.getFloat(2));
                                                                                    pixels5 = state.f19030a.toPixels(cLArray11.getFloat(3));
                                                                                }
                                                                                f19 = f20;
                                                                                flow.addFlowElement(strContent12, f19, pixels6, pixels5);
                                                                            } else {
                                                                                f19 = cLArray11.getFloat(1);
                                                                                pixels5 = Float.NaN;
                                                                            }
                                                                            pixels6 = pixels5;
                                                                            flow.addFlowElement(strContent12, f19, pixels6, pixels5);
                                                                        }
                                                                    } else {
                                                                        flow.add(cLElement12.content());
                                                                    }
                                                                    i16++;
                                                                    cLArray10 = cLArray10;
                                                                    str2 = str2;
                                                                }
                                                                str3 = str2;
                                                                it4 = it;
                                                                it3 = it3;
                                                                str2 = str3;
                                                                break;
                                                            }
                                                        }
                                                        PrintStream printStream2 = System.err;
                                                        StringBuilder sbE2 = f.e(next3, " contains should be an array \"");
                                                        sbE2.append(cLElement11.content());
                                                        sbE2.append("\"");
                                                        printStream2.println(sbE2.toString());
                                                        break;
                                                    case 8:
                                                        flow.setMaxElementsWrap(cLObject7.get(next2).getInt());
                                                        str3 = str2;
                                                        it4 = it;
                                                        it3 = it3;
                                                        str2 = str3;
                                                        break;
                                                    case 9:
                                                        flow.setHorizontalGap(cLObject7.get(next2).getInt());
                                                        str3 = str2;
                                                        it4 = it;
                                                        it3 = it3;
                                                        str2 = str3;
                                                        break;
                                                    case 10:
                                                        if (cLObject7.get(next2).content().equals(str2)) {
                                                            flow.setOrientation(0);
                                                            str3 = str2;
                                                        } else {
                                                            flow.setOrientation(1);
                                                            it3 = it3;
                                                            str3 = str2;
                                                        }
                                                        it4 = it;
                                                        it3 = it3;
                                                        str2 = str3;
                                                        break;
                                                    case 11:
                                                        flow.setVerticalGap(cLObject7.get(next2).getInt());
                                                        str3 = str2;
                                                        it4 = it;
                                                        it3 = it3;
                                                        str2 = str3;
                                                        break;
                                                    case 12:
                                                        flow.setWrapMode(State.Wrap.getValueByString(cLObject7.get(next2).content()));
                                                        str3 = str2;
                                                        it4 = it;
                                                        it3 = it3;
                                                        str2 = str3;
                                                        break;
                                                    default:
                                                        a(cLObject7, state.constraints(next3), layoutVariables, state, next2);
                                                        str3 = str2;
                                                        it4 = it;
                                                        it3 = it3;
                                                        str2 = str3;
                                                        break;
                                                }
                                            }
                                        }
                                        break;
                                    case "hGuideline":
                                        h(0, state, next3, cLObject7);
                                        break;
                                }
                                it = it4;
                            } else {
                                it = it4;
                                i(state, layoutVariables, next3, cLObject7);
                            }
                        }
                    }
                    str = string6;
                    if (str != null) {
                        str2 = "hFlow";
                        switch (str) {
                            case -1785507558:
                                if (!str.equals("vGuideline")) {
                                }
                                break;
                            case -1354837162:
                                if (!str.equals("column")) {
                                }
                                break;
                            case -1252464839:
                                if (!str.equals("hChain")) {
                                }
                                break;
                            case -851656725:
                                if (!str.equals("vChain")) {
                                }
                                break;
                            case -333143113:
                                if (!str.equals("barrier")) {
                                }
                                break;
                            case 113114:
                                if (!str.equals("row")) {
                                }
                                break;
                            case 3181382:
                                if (!str.equals("grid")) {
                                }
                                break;
                            case 98238902:
                                if (!str.equals("hFlow")) {
                                }
                                break;
                            case 111168196:
                                if (!str.equals("vFlow")) {
                                }
                                break;
                            case 965681512:
                                if (!str.equals("hGuideline")) {
                                }
                                break;
                            default:
                                break;
                        }
                        /*  JADX ERROR: Method code generation error
                            java.lang.NullPointerException: Switch insn not found in header
                            	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                            	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            */
                        /*
                            Method dump skipped, instruction units count: 3946
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.populateState(androidx.constraintlayout.core.parser.CLObject, androidx.constraintlayout.core.state.State, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables):void");
                    }

                    public static void parseJSON(String str, State state, LayoutVariables layoutVariables) throws CLParsingException {
                        try {
                            populateState(CLParser.parse(str), state, layoutVariables);
                        } catch (CLParsingException e5) {
                            System.err.println("Error parsing JSON " + e5);
                        }
                    }
                }
