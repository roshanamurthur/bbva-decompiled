package androidx.constraintlayout.widget;

import ad.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.exifinterface.media.ExifInterface;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import mx.openpay.library.domain.util.Constant;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintSet {
    public static final int BASELINE = 5;
    public static final int BOTTOM = 4;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static final int CIRCLE_REFERENCE = 8;
    public static final int END = 7;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int HORIZONTAL_GUIDELINE = 0;
    public static final int INVISIBLE = 4;
    public static final int LEFT = 1;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int PARENT_ID = 0;
    public static final int RIGHT = 2;
    public static final int ROTATE_LEFT_OF_PORTRATE = 4;
    public static final int ROTATE_NONE = 0;
    public static final int ROTATE_PORTRATE_OF_LEFT = 2;
    public static final int ROTATE_PORTRATE_OF_RIGHT = 1;
    public static final int ROTATE_RIGHT_OF_PORTRATE = 3;
    public static final int START = 6;
    public static final int TOP = 3;
    public static final int UNSET = -1;
    public static final int VERTICAL = 1;
    public static final int VERTICAL_GUIDELINE = 1;
    public static final int VISIBILITY_MODE_IGNORE = 1;
    public static final int VISIBILITY_MODE_NORMAL = 0;
    public static final int VISIBLE = 0;
    public static final int WRAP_CONTENT = -2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f19756f = {0, 4, 8};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final SparseIntArray f19757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SparseIntArray f19758h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19759a;
    public String mIdString;
    public String derivedState = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f19760b = new String[0];
    public int mRotate = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, ConstraintAttribute> f19761c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19762d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap<Integer, Constraint> f19763e = new HashMap<>();

    public static class Constraint {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f19765b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f19766c;
        public final PropertySet propertySet = new PropertySet();
        public final Motion motion = new Motion();
        public final Layout layout = new Layout();
        public final Transform transform = new Transform();
        public HashMap<String, ConstraintAttribute> mCustomConstraints = new HashMap<>();

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int[] f19767a = new int[10];

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int[] f19768b = new int[10];

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f19769c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int[] f19770d = new int[10];

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public float[] f19771e = new float[10];

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f19772f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int[] f19773g = new int[5];

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public String[] f19774h = new String[5];

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public int f19775i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int[] f19776j = new int[4];

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public boolean[] f19777k = new boolean[4];

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f19778l = 0;

            public final void a(int i10, float f6) {
                int i11 = this.f19772f;
                int[] iArr = this.f19770d;
                if (i11 >= iArr.length) {
                    this.f19770d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f19771e;
                    this.f19771e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f19770d;
                int i12 = this.f19772f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f19771e;
                this.f19772f = i12 + 1;
                fArr2[i12] = f6;
            }

            public final void b(int i10, int i11) {
                int i12 = this.f19769c;
                int[] iArr = this.f19767a;
                if (i12 >= iArr.length) {
                    this.f19767a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f19768b;
                    this.f19768b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f19767a;
                int i13 = this.f19769c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f19768b;
                this.f19769c = i13 + 1;
                iArr4[i13] = i11;
            }

            public final void c(int i10, String str) {
                int i11 = this.f19775i;
                int[] iArr = this.f19773g;
                if (i11 >= iArr.length) {
                    this.f19773g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f19774h;
                    this.f19774h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f19773g;
                int i12 = this.f19775i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f19774h;
                this.f19775i = i12 + 1;
                strArr2[i12] = str;
            }

            public final void d(int i10, boolean z10) {
                int i11 = this.f19778l;
                int[] iArr = this.f19776j;
                if (i11 >= iArr.length) {
                    this.f19776j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f19777k;
                    this.f19777k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f19776j;
                int i12 = this.f19778l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f19777k;
                this.f19778l = i12 + 1;
                zArr2[i12] = z10;
            }

            public final void e(Constraint constraint) {
                for (int i10 = 0; i10 < this.f19769c; i10++) {
                    int i11 = this.f19767a[i10];
                    int i12 = this.f19768b[i10];
                    int i13 = ConstraintSet.ROTATE_NONE;
                    if (i11 == 6) {
                        constraint.layout.editorAbsoluteX = i12;
                    } else if (i11 == 7) {
                        constraint.layout.editorAbsoluteY = i12;
                    } else if (i11 == 8) {
                        constraint.layout.endMargin = i12;
                    } else if (i11 == 27) {
                        constraint.layout.orientation = i12;
                    } else if (i11 == 28) {
                        constraint.layout.rightMargin = i12;
                    } else if (i11 == 41) {
                        constraint.layout.horizontalChainStyle = i12;
                    } else if (i11 == 42) {
                        constraint.layout.verticalChainStyle = i12;
                    } else if (i11 == 61) {
                        constraint.layout.circleConstraint = i12;
                    } else if (i11 == 62) {
                        constraint.layout.circleRadius = i12;
                    } else if (i11 == 72) {
                        constraint.layout.mBarrierDirection = i12;
                    } else if (i11 == 73) {
                        constraint.layout.mBarrierMargin = i12;
                    } else if (i11 == 2) {
                        constraint.layout.bottomMargin = i12;
                    } else if (i11 == 31) {
                        constraint.layout.startMargin = i12;
                    } else if (i11 == 34) {
                        constraint.layout.topMargin = i12;
                    } else if (i11 == 38) {
                        constraint.f19764a = i12;
                    } else if (i11 == 64) {
                        constraint.motion.mAnimateRelativeTo = i12;
                    } else if (i11 == 66) {
                        constraint.motion.mDrawPath = i12;
                    } else if (i11 == 76) {
                        constraint.motion.mPathMotionArc = i12;
                    } else if (i11 == 78) {
                        constraint.propertySet.mVisibilityMode = i12;
                    } else if (i11 == 97) {
                        constraint.layout.mWrapBehavior = i12;
                    } else if (i11 == 93) {
                        constraint.layout.baselineMargin = i12;
                    } else if (i11 != 94) {
                        switch (i11) {
                            case 11:
                                constraint.layout.goneBottomMargin = i12;
                                break;
                            case 12:
                                constraint.layout.goneEndMargin = i12;
                                break;
                            case 13:
                                constraint.layout.goneLeftMargin = i12;
                                break;
                            case 14:
                                constraint.layout.goneRightMargin = i12;
                                break;
                            case 15:
                                constraint.layout.goneStartMargin = i12;
                                break;
                            case 16:
                                constraint.layout.goneTopMargin = i12;
                                break;
                            case 17:
                                constraint.layout.guideBegin = i12;
                                break;
                            case 18:
                                constraint.layout.guideEnd = i12;
                                break;
                            default:
                                switch (i11) {
                                    case 21:
                                        constraint.layout.mHeight = i12;
                                        break;
                                    case 22:
                                        constraint.propertySet.visibility = i12;
                                        break;
                                    case 23:
                                        constraint.layout.mWidth = i12;
                                        break;
                                    case 24:
                                        constraint.layout.leftMargin = i12;
                                        break;
                                    default:
                                        switch (i11) {
                                            case 54:
                                                constraint.layout.widthDefault = i12;
                                                break;
                                            case 55:
                                                constraint.layout.heightDefault = i12;
                                                break;
                                            case 56:
                                                constraint.layout.widthMax = i12;
                                                break;
                                            case 57:
                                                constraint.layout.heightMax = i12;
                                                break;
                                            case 58:
                                                constraint.layout.widthMin = i12;
                                                break;
                                            case 59:
                                                constraint.layout.heightMin = i12;
                                                break;
                                            default:
                                                switch (i11) {
                                                    case 82:
                                                        constraint.motion.mAnimateCircleAngleTo = i12;
                                                        break;
                                                    case 83:
                                                        constraint.transform.transformPivotTarget = i12;
                                                        break;
                                                    case 84:
                                                        constraint.motion.mQuantizeMotionSteps = i12;
                                                        break;
                                                    default:
                                                        switch (i11) {
                                                            case 87:
                                                                break;
                                                            case 88:
                                                                constraint.motion.mQuantizeInterpolatorType = i12;
                                                                break;
                                                            case 89:
                                                                constraint.motion.mQuantizeInterpolatorID = i12;
                                                                break;
                                                            default:
                                                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        constraint.layout.goneBaselineMargin = i12;
                    }
                }
                for (int i14 = 0; i14 < this.f19772f; i14++) {
                    int i15 = this.f19770d[i14];
                    float f6 = this.f19771e[i14];
                    int i16 = ConstraintSet.ROTATE_NONE;
                    if (i15 == 19) {
                        constraint.layout.guidePercent = f6;
                    } else if (i15 == 20) {
                        constraint.layout.horizontalBias = f6;
                    } else if (i15 == 37) {
                        constraint.layout.verticalBias = f6;
                    } else if (i15 == 60) {
                        constraint.transform.rotation = f6;
                    } else if (i15 == 63) {
                        constraint.layout.circleAngle = f6;
                    } else if (i15 == 79) {
                        constraint.motion.mMotionStagger = f6;
                    } else if (i15 == 85) {
                        constraint.motion.mQuantizeMotionPhase = f6;
                    } else if (i15 != 87) {
                        if (i15 == 39) {
                            constraint.layout.horizontalWeight = f6;
                        } else if (i15 != 40) {
                            switch (i15) {
                                case 43:
                                    constraint.propertySet.alpha = f6;
                                    break;
                                case 44:
                                    Transform transform = constraint.transform;
                                    transform.elevation = f6;
                                    transform.applyElevation = true;
                                    break;
                                case 45:
                                    constraint.transform.rotationX = f6;
                                    break;
                                case 46:
                                    constraint.transform.rotationY = f6;
                                    break;
                                case 47:
                                    constraint.transform.scaleX = f6;
                                    break;
                                case 48:
                                    constraint.transform.scaleY = f6;
                                    break;
                                case 49:
                                    constraint.transform.transformPivotX = f6;
                                    break;
                                case 50:
                                    constraint.transform.transformPivotY = f6;
                                    break;
                                case 51:
                                    constraint.transform.translationX = f6;
                                    break;
                                case 52:
                                    constraint.transform.translationY = f6;
                                    break;
                                case 53:
                                    constraint.transform.translationZ = f6;
                                    break;
                                default:
                                    switch (i15) {
                                        case 67:
                                            constraint.motion.mPathRotate = f6;
                                            break;
                                        case 68:
                                            constraint.propertySet.mProgress = f6;
                                            break;
                                        case 69:
                                            constraint.layout.widthPercent = f6;
                                            break;
                                        case 70:
                                            constraint.layout.heightPercent = f6;
                                            break;
                                        default:
                                            Log.w("ConstraintSet", "Unknown attribute 0x");
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            constraint.layout.verticalWeight = f6;
                        }
                    }
                }
                for (int i17 = 0; i17 < this.f19775i; i17++) {
                    int i18 = this.f19773g[i17];
                    String str = this.f19774h[i17];
                    int i19 = ConstraintSet.ROTATE_NONE;
                    if (i18 == 5) {
                        constraint.layout.dimensionRatio = str;
                    } else if (i18 == 65) {
                        constraint.motion.mTransitionEasing = str;
                    } else if (i18 == 74) {
                        Layout layout = constraint.layout;
                        layout.mReferenceIdString = str;
                        layout.mReferenceIds = null;
                    } else if (i18 == 77) {
                        constraint.layout.mConstraintTag = str;
                    } else if (i18 != 87) {
                        if (i18 != 90) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            constraint.motion.mQuantizeInterpolatorString = str;
                        }
                    }
                }
                for (int i20 = 0; i20 < this.f19778l; i20++) {
                    int i21 = this.f19776j[i20];
                    boolean z10 = this.f19777k[i20];
                    int i22 = ConstraintSet.ROTATE_NONE;
                    if (i21 == 44) {
                        constraint.transform.applyElevation = z10;
                    } else if (i21 == 75) {
                        constraint.layout.mBarrierAllowsGoneWidgets = z10;
                    } else if (i21 != 87) {
                        if (i21 == 80) {
                            constraint.layout.constrainedWidth = z10;
                        } else if (i21 != 81) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            constraint.layout.constrainedHeight = z10;
                        }
                    }
                }
            }
        }

        public final void a(int i10, ConstraintLayout.LayoutParams layoutParams) {
            this.f19764a = i10;
            Layout layout = this.layout;
            layout.leftToLeft = layoutParams.leftToLeft;
            layout.leftToRight = layoutParams.leftToRight;
            layout.rightToLeft = layoutParams.rightToLeft;
            layout.rightToRight = layoutParams.rightToRight;
            layout.topToTop = layoutParams.topToTop;
            layout.topToBottom = layoutParams.topToBottom;
            layout.bottomToTop = layoutParams.bottomToTop;
            layout.bottomToBottom = layoutParams.bottomToBottom;
            layout.baselineToBaseline = layoutParams.baselineToBaseline;
            layout.baselineToTop = layoutParams.baselineToTop;
            layout.baselineToBottom = layoutParams.baselineToBottom;
            layout.startToEnd = layoutParams.startToEnd;
            layout.startToStart = layoutParams.startToStart;
            layout.endToStart = layoutParams.endToStart;
            layout.endToEnd = layoutParams.endToEnd;
            layout.horizontalBias = layoutParams.horizontalBias;
            layout.verticalBias = layoutParams.verticalBias;
            layout.dimensionRatio = layoutParams.dimensionRatio;
            layout.circleConstraint = layoutParams.circleConstraint;
            layout.circleRadius = layoutParams.circleRadius;
            layout.circleAngle = layoutParams.circleAngle;
            layout.editorAbsoluteX = layoutParams.editorAbsoluteX;
            layout.editorAbsoluteY = layoutParams.editorAbsoluteY;
            layout.orientation = layoutParams.orientation;
            layout.guidePercent = layoutParams.guidePercent;
            layout.guideBegin = layoutParams.guideBegin;
            layout.guideEnd = layoutParams.guideEnd;
            layout.mWidth = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            layout.mHeight = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            layout.leftMargin = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            layout.rightMargin = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            layout.topMargin = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            layout.bottomMargin = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            layout.baselineMargin = layoutParams.baselineMargin;
            layout.verticalWeight = layoutParams.verticalWeight;
            layout.horizontalWeight = layoutParams.horizontalWeight;
            layout.verticalChainStyle = layoutParams.verticalChainStyle;
            layout.horizontalChainStyle = layoutParams.horizontalChainStyle;
            layout.constrainedWidth = layoutParams.constrainedWidth;
            layout.constrainedHeight = layoutParams.constrainedHeight;
            layout.widthDefault = layoutParams.matchConstraintDefaultWidth;
            layout.heightDefault = layoutParams.matchConstraintDefaultHeight;
            layout.widthMax = layoutParams.matchConstraintMaxWidth;
            layout.heightMax = layoutParams.matchConstraintMaxHeight;
            layout.widthMin = layoutParams.matchConstraintMinWidth;
            layout.heightMin = layoutParams.matchConstraintMinHeight;
            layout.widthPercent = layoutParams.matchConstraintPercentWidth;
            layout.heightPercent = layoutParams.matchConstraintPercentHeight;
            layout.mConstraintTag = layoutParams.constraintTag;
            layout.goneTopMargin = layoutParams.goneTopMargin;
            layout.goneBottomMargin = layoutParams.goneBottomMargin;
            layout.goneLeftMargin = layoutParams.goneLeftMargin;
            layout.goneRightMargin = layoutParams.goneRightMargin;
            layout.goneStartMargin = layoutParams.goneStartMargin;
            layout.goneEndMargin = layoutParams.goneEndMargin;
            layout.goneBaselineMargin = layoutParams.goneBaselineMargin;
            layout.mWrapBehavior = layoutParams.wrapBehaviorInParent;
            layout.endMargin = layoutParams.getMarginEnd();
            this.layout.startMargin = layoutParams.getMarginStart();
        }

        public void applyDelta(Constraint constraint) {
            a aVar = this.f19766c;
            if (aVar != null) {
                aVar.e(constraint);
            }
        }

        public void applyTo(ConstraintLayout.LayoutParams layoutParams) {
            Layout layout = this.layout;
            layoutParams.leftToLeft = layout.leftToLeft;
            layoutParams.leftToRight = layout.leftToRight;
            layoutParams.rightToLeft = layout.rightToLeft;
            layoutParams.rightToRight = layout.rightToRight;
            layoutParams.topToTop = layout.topToTop;
            layoutParams.topToBottom = layout.topToBottom;
            layoutParams.bottomToTop = layout.bottomToTop;
            layoutParams.bottomToBottom = layout.bottomToBottom;
            layoutParams.baselineToBaseline = layout.baselineToBaseline;
            layoutParams.baselineToTop = layout.baselineToTop;
            layoutParams.baselineToBottom = layout.baselineToBottom;
            layoutParams.startToEnd = layout.startToEnd;
            layoutParams.startToStart = layout.startToStart;
            layoutParams.endToStart = layout.endToStart;
            layoutParams.endToEnd = layout.endToEnd;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = layout.leftMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = layout.rightMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = layout.topMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = layout.bottomMargin;
            layoutParams.goneStartMargin = layout.goneStartMargin;
            layoutParams.goneEndMargin = layout.goneEndMargin;
            layoutParams.goneTopMargin = layout.goneTopMargin;
            layoutParams.goneBottomMargin = layout.goneBottomMargin;
            layoutParams.horizontalBias = layout.horizontalBias;
            layoutParams.verticalBias = layout.verticalBias;
            layoutParams.circleConstraint = layout.circleConstraint;
            layoutParams.circleRadius = layout.circleRadius;
            layoutParams.circleAngle = layout.circleAngle;
            layoutParams.dimensionRatio = layout.dimensionRatio;
            layoutParams.editorAbsoluteX = layout.editorAbsoluteX;
            layoutParams.editorAbsoluteY = layout.editorAbsoluteY;
            layoutParams.verticalWeight = layout.verticalWeight;
            layoutParams.horizontalWeight = layout.horizontalWeight;
            layoutParams.verticalChainStyle = layout.verticalChainStyle;
            layoutParams.horizontalChainStyle = layout.horizontalChainStyle;
            layoutParams.constrainedWidth = layout.constrainedWidth;
            layoutParams.constrainedHeight = layout.constrainedHeight;
            layoutParams.matchConstraintDefaultWidth = layout.widthDefault;
            layoutParams.matchConstraintDefaultHeight = layout.heightDefault;
            layoutParams.matchConstraintMaxWidth = layout.widthMax;
            layoutParams.matchConstraintMaxHeight = layout.heightMax;
            layoutParams.matchConstraintMinWidth = layout.widthMin;
            layoutParams.matchConstraintMinHeight = layout.heightMin;
            layoutParams.matchConstraintPercentWidth = layout.widthPercent;
            layoutParams.matchConstraintPercentHeight = layout.heightPercent;
            layoutParams.orientation = layout.orientation;
            layoutParams.guidePercent = layout.guidePercent;
            layoutParams.guideBegin = layout.guideBegin;
            layoutParams.guideEnd = layout.guideEnd;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = layout.mWidth;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = layout.mHeight;
            String str = layout.mConstraintTag;
            if (str != null) {
                layoutParams.constraintTag = str;
            }
            layoutParams.wrapBehaviorInParent = layout.mWrapBehavior;
            layoutParams.setMarginStart(layout.startMargin);
            layoutParams.setMarginEnd(this.layout.endMargin);
            layoutParams.validate();
        }

        public final void b(int i10, Constraints.LayoutParams layoutParams) {
            a(i10, layoutParams);
            this.propertySet.alpha = layoutParams.alpha;
            Transform transform = this.transform;
            transform.rotation = layoutParams.rotation;
            transform.rotationX = layoutParams.rotationX;
            transform.rotationY = layoutParams.rotationY;
            transform.scaleX = layoutParams.scaleX;
            transform.scaleY = layoutParams.scaleY;
            transform.transformPivotX = layoutParams.transformPivotX;
            transform.transformPivotY = layoutParams.transformPivotY;
            transform.translationX = layoutParams.translationX;
            transform.translationY = layoutParams.translationY;
            transform.translationZ = layoutParams.translationZ;
            transform.elevation = layoutParams.elevation;
            transform.applyElevation = layoutParams.applyElevation;
        }

        public final ConstraintAttribute c(String str, ConstraintAttribute.AttributeType attributeType) {
            if (!this.mCustomConstraints.containsKey(str)) {
                ConstraintAttribute constraintAttribute = new ConstraintAttribute(str, attributeType);
                this.mCustomConstraints.put(str, constraintAttribute);
                return constraintAttribute;
            }
            ConstraintAttribute constraintAttribute2 = this.mCustomConstraints.get(str);
            if (constraintAttribute2.getType() == attributeType) {
                return constraintAttribute2;
            }
            throw new IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute2.getType().name());
        }

        public void printDelta(String str) {
            a aVar = this.f19766c;
            if (aVar != null) {
                for (int i10 = 0; i10 < aVar.f19769c; i10++) {
                    int i11 = aVar.f19767a[i10];
                    int i12 = aVar.f19768b[i10];
                }
                for (int i13 = 0; i13 < aVar.f19772f; i13++) {
                    int i14 = aVar.f19770d[i13];
                    float f6 = aVar.f19771e[i13];
                }
                for (int i15 = 0; i15 < aVar.f19775i; i15++) {
                    int i16 = aVar.f19773g[i15];
                    String str2 = aVar.f19774h[i15];
                }
                for (int i17 = 0; i17 < aVar.f19778l; i17++) {
                    int i18 = aVar.f19776j[i17];
                    boolean z10 = aVar.f19777k[i17];
                }
            }
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public Constraint m4636clone() {
            Constraint constraint = new Constraint();
            constraint.layout.copyFrom(this.layout);
            constraint.motion.copyFrom(this.motion);
            constraint.propertySet.copyFrom(this.propertySet);
            constraint.transform.copyFrom(this.transform);
            constraint.f19764a = this.f19764a;
            constraint.f19766c = this.f19766c;
            return constraint;
        }
    }

    public static class Layout {
        public static final int UNSET = -1;
        public static final int UNSET_GONE_MARGIN = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f19779a;
        public String mConstraintTag;
        public int mHeight;
        public String mReferenceIdString;
        public int[] mReferenceIds;
        public int mWidth;
        public boolean mIsGuideline = false;
        public boolean mApply = false;
        public boolean mOverride = false;
        public int guideBegin = -1;
        public int guideEnd = -1;
        public float guidePercent = -1.0f;
        public boolean guidelineUseRtl = true;
        public int leftToLeft = -1;
        public int leftToRight = -1;
        public int rightToLeft = -1;
        public int rightToRight = -1;
        public int topToTop = -1;
        public int topToBottom = -1;
        public int bottomToTop = -1;
        public int bottomToBottom = -1;
        public int baselineToBaseline = -1;
        public int baselineToTop = -1;
        public int baselineToBottom = -1;
        public int startToEnd = -1;
        public int startToStart = -1;
        public int endToStart = -1;
        public int endToEnd = -1;
        public float horizontalBias = 0.5f;
        public float verticalBias = 0.5f;
        public String dimensionRatio = null;
        public int circleConstraint = -1;
        public int circleRadius = 0;
        public float circleAngle = 0.0f;
        public int editorAbsoluteX = -1;
        public int editorAbsoluteY = -1;
        public int orientation = -1;
        public int leftMargin = 0;
        public int rightMargin = 0;
        public int topMargin = 0;
        public int bottomMargin = 0;
        public int endMargin = 0;
        public int startMargin = 0;
        public int baselineMargin = 0;
        public int goneLeftMargin = Integer.MIN_VALUE;
        public int goneTopMargin = Integer.MIN_VALUE;
        public int goneRightMargin = Integer.MIN_VALUE;
        public int goneBottomMargin = Integer.MIN_VALUE;
        public int goneEndMargin = Integer.MIN_VALUE;
        public int goneStartMargin = Integer.MIN_VALUE;
        public int goneBaselineMargin = Integer.MIN_VALUE;
        public float verticalWeight = -1.0f;
        public float horizontalWeight = -1.0f;
        public int horizontalChainStyle = 0;
        public int verticalChainStyle = 0;
        public int widthDefault = 0;
        public int heightDefault = 0;
        public int widthMax = 0;
        public int heightMax = 0;
        public int widthMin = 0;
        public int heightMin = 0;
        public float widthPercent = 1.0f;
        public float heightPercent = 1.0f;
        public int mBarrierDirection = -1;
        public int mBarrierMargin = 0;
        public int mHelperType = -1;
        public boolean constrainedWidth = false;
        public boolean constrainedHeight = false;
        public boolean mBarrierAllowsGoneWidgets = true;
        public int mWrapBehavior = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f19779a = sparseIntArray;
            sparseIntArray.append(R.styleable.Layout_layout_constraintLeft_toLeftOf, 24);
            sparseIntArray.append(R.styleable.Layout_layout_constraintLeft_toRightOf, 25);
            sparseIntArray.append(R.styleable.Layout_layout_constraintRight_toLeftOf, 28);
            sparseIntArray.append(R.styleable.Layout_layout_constraintRight_toRightOf, 29);
            sparseIntArray.append(R.styleable.Layout_layout_constraintTop_toTopOf, 35);
            sparseIntArray.append(R.styleable.Layout_layout_constraintTop_toBottomOf, 34);
            sparseIntArray.append(R.styleable.Layout_layout_constraintBottom_toTopOf, 4);
            sparseIntArray.append(R.styleable.Layout_layout_constraintBottom_toBottomOf, 3);
            sparseIntArray.append(R.styleable.Layout_layout_constraintBaseline_toBaselineOf, 1);
            sparseIntArray.append(R.styleable.Layout_layout_editor_absoluteX, 6);
            sparseIntArray.append(R.styleable.Layout_layout_editor_absoluteY, 7);
            sparseIntArray.append(R.styleable.Layout_layout_constraintGuide_begin, 17);
            sparseIntArray.append(R.styleable.Layout_layout_constraintGuide_end, 18);
            sparseIntArray.append(R.styleable.Layout_layout_constraintGuide_percent, 19);
            int i10 = R.styleable.Layout_guidelineUseRtl;
            sparseIntArray.append(i10, 90);
            sparseIntArray.append(R.styleable.Layout_android_orientation, 26);
            sparseIntArray.append(R.styleable.Layout_layout_constraintStart_toEndOf, 31);
            sparseIntArray.append(R.styleable.Layout_layout_constraintStart_toStartOf, 32);
            sparseIntArray.append(R.styleable.Layout_layout_constraintEnd_toStartOf, 10);
            sparseIntArray.append(R.styleable.Layout_layout_constraintEnd_toEndOf, 9);
            sparseIntArray.append(R.styleable.Layout_layout_goneMarginLeft, 13);
            sparseIntArray.append(R.styleable.Layout_layout_goneMarginTop, 16);
            sparseIntArray.append(R.styleable.Layout_layout_goneMarginRight, 14);
            sparseIntArray.append(R.styleable.Layout_layout_goneMarginBottom, 11);
            sparseIntArray.append(R.styleable.Layout_layout_goneMarginStart, 15);
            sparseIntArray.append(R.styleable.Layout_layout_goneMarginEnd, 12);
            sparseIntArray.append(R.styleable.Layout_layout_constraintVertical_weight, 38);
            sparseIntArray.append(R.styleable.Layout_layout_constraintHorizontal_weight, 37);
            sparseIntArray.append(R.styleable.Layout_layout_constraintHorizontal_chainStyle, 39);
            sparseIntArray.append(R.styleable.Layout_layout_constraintVertical_chainStyle, 40);
            sparseIntArray.append(R.styleable.Layout_layout_constraintHorizontal_bias, 20);
            sparseIntArray.append(R.styleable.Layout_layout_constraintVertical_bias, 36);
            sparseIntArray.append(R.styleable.Layout_layout_constraintDimensionRatio, 5);
            sparseIntArray.append(R.styleable.Layout_layout_constraintLeft_creator, 91);
            sparseIntArray.append(R.styleable.Layout_layout_constraintTop_creator, 91);
            sparseIntArray.append(R.styleable.Layout_layout_constraintRight_creator, 91);
            sparseIntArray.append(R.styleable.Layout_layout_constraintBottom_creator, 91);
            sparseIntArray.append(R.styleable.Layout_layout_constraintBaseline_creator, 91);
            sparseIntArray.append(R.styleable.Layout_android_layout_marginLeft, 23);
            sparseIntArray.append(R.styleable.Layout_android_layout_marginRight, 27);
            sparseIntArray.append(R.styleable.Layout_android_layout_marginStart, 30);
            sparseIntArray.append(R.styleable.Layout_android_layout_marginEnd, 8);
            sparseIntArray.append(R.styleable.Layout_android_layout_marginTop, 33);
            sparseIntArray.append(R.styleable.Layout_android_layout_marginBottom, 2);
            sparseIntArray.append(R.styleable.Layout_android_layout_width, 22);
            sparseIntArray.append(R.styleable.Layout_android_layout_height, 21);
            int i11 = R.styleable.Layout_layout_constraintWidth;
            sparseIntArray.append(i11, 41);
            int i12 = R.styleable.Layout_layout_constraintHeight;
            sparseIntArray.append(i12, 42);
            sparseIntArray.append(R.styleable.Layout_layout_constrainedWidth, 87);
            sparseIntArray.append(R.styleable.Layout_layout_constrainedHeight, 88);
            sparseIntArray.append(R.styleable.Layout_layout_wrapBehaviorInParent, 76);
            sparseIntArray.append(R.styleable.Layout_layout_constraintCircle, 61);
            sparseIntArray.append(R.styleable.Layout_layout_constraintCircleRadius, 62);
            sparseIntArray.append(R.styleable.Layout_layout_constraintCircleAngle, 63);
            sparseIntArray.append(R.styleable.Layout_layout_constraintWidth_percent, 69);
            sparseIntArray.append(R.styleable.Layout_layout_constraintHeight_percent, 70);
            sparseIntArray.append(R.styleable.Layout_chainUseRtl, 71);
            sparseIntArray.append(R.styleable.Layout_barrierDirection, 72);
            sparseIntArray.append(R.styleable.Layout_barrierMargin, 73);
            sparseIntArray.append(R.styleable.Layout_constraint_referenced_ids, 74);
            sparseIntArray.append(R.styleable.Layout_barrierAllowsGoneWidgets, 75);
            int i13 = R.styleable.Layout_layout_constraintWidth_max;
            sparseIntArray.append(i13, 84);
            sparseIntArray.append(R.styleable.Layout_layout_constraintWidth_min, 86);
            sparseIntArray.append(i13, 83);
            sparseIntArray.append(R.styleable.Layout_layout_constraintHeight_min, 85);
            sparseIntArray.append(i11, 87);
            sparseIntArray.append(i12, 88);
            sparseIntArray.append(R.styleable.ConstraintLayout_Layout_layout_constraintTag, 89);
            sparseIntArray.append(i10, 90);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Layout);
            this.mApply = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                SparseIntArray sparseIntArray = f19779a;
                int i11 = sparseIntArray.get(index);
                switch (i11) {
                    case 1:
                        this.baselineToBaseline = ConstraintSet.g(typedArrayObtainStyledAttributes, index, this.baselineToBaseline);
                        break;
                    case 2:
                        this.bottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.bottomMargin);
                        break;
                    case 3:
                        this.bottomToBottom = ConstraintSet.g(typedArrayObtainStyledAttributes, index, this.bottomToBottom);
                        break;
                    case 4:
                        this.bottomToTop = ConstraintSet.g(typedArrayObtainStyledAttributes, index, this.bottomToTop);
                        break;
                    case 5:
                        this.dimensionRatio = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.editorAbsoluteX = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteX);
                        break;
                    case 7:
                        this.editorAbsoluteY = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteY);
                        break;
                    case 8:
                        this.endMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.endMargin);
                        break;
                    case 9:
                        this.endToEnd = ConstraintSet.g(typedArrayObtainStyledAttributes, index, this.endToEnd);
                        break;
                    case 10:
                        this.endToStart = ConstraintSet.g(typedArrayObtainStyledAttributes, index, this.endToStart);
                        break;
                    case 11:
                        this.goneBottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneBottomMargin);
                        break;
                    case 12:
                        this.goneEndMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneEndMargin);
                        break;
                    case 13:
                        this.goneLeftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneLeftMargin);
                        break;
                    case 14:
                        this.goneRightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneRightMargin);
                        break;
                    case 15:
                        this.goneStartMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneStartMargin);
                        break;
                    case 16:
                        this.goneTopMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneTopMargin);
                        break;
                    case 17:
                        this.guideBegin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.guideBegin);
                        break;
                    case 18:
                        this.guideEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.guideEnd);
                        break;
                    case 19:
                        this.guidePercent = typedArrayObtainStyledAttributes.getFloat(index, this.guidePercent);
                        break;
                    case 20:
                        this.horizontalBias = typedArrayObtainStyledAttributes.getFloat(index, this.horizontalBias);
                        break;
                    case 21:
                        this.mHeight = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.mHeight);
                        break;
                    case 22:
                        this.mWidth = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.mWidth);
                        break;
                    case 23:
                        this.leftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.leftMargin);
                        break;
                    case 24:
                        this.leftToLeft = ConstraintSet.g(typedArrayObtainStyledAttributes, index, this.leftToLeft);
                        break;
                    case 25:
                        this.leftToRight = ConstraintSet.g(typedArrayObtainStyledAttributes, index, this.leftToRight);
                        break;
                    case 26:
                        this.orientation = typedArrayObtainStyledAttributes.getInt(index, this.orientation);
                        break;
                    case 27:
                        this.rightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.rightMargin);
                        break;
                    case 28:
                        this.rightToLeft = ConstraintSet.g(typedArrayObtainStyledAttributes, index, this.rightToLeft);
                        break;
                    case 29:
                        this.rightToRight = ConstraintSet.g(typedArrayObtainStyledAttributes, index, this.rightToRight);
                        break;
                    case 30:
                        this.startMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.startMargin);
                        break;
                    case 31:
                        this.startToEnd = ConstraintSet.g(typedArrayObtainStyledAttributes, index, this.startToEnd);
                        break;
                    case 32:
                        this.startToStart = ConstraintSet.g(typedArrayObtainStyledAttributes, index, this.startToStart);
                        break;
                    case 33:
                        this.topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.topMargin);
                        break;
                    case 34:
                        this.topToBottom = ConstraintSet.g(typedArrayObtainStyledAttributes, index, this.topToBottom);
                        break;
                    case 35:
                        this.topToTop = ConstraintSet.g(typedArrayObtainStyledAttributes, index, this.topToTop);
                        break;
                    case 36:
                        this.verticalBias = typedArrayObtainStyledAttributes.getFloat(index, this.verticalBias);
                        break;
                    case 37:
                        this.horizontalWeight = typedArrayObtainStyledAttributes.getFloat(index, this.horizontalWeight);
                        break;
                    case 38:
                        this.verticalWeight = typedArrayObtainStyledAttributes.getFloat(index, this.verticalWeight);
                        break;
                    case 39:
                        this.horizontalChainStyle = typedArrayObtainStyledAttributes.getInt(index, this.horizontalChainStyle);
                        break;
                    case 40:
                        this.verticalChainStyle = typedArrayObtainStyledAttributes.getInt(index, this.verticalChainStyle);
                        break;
                    case 41:
                        ConstraintSet.h(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        ConstraintSet.h(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.circleConstraint = ConstraintSet.g(typedArrayObtainStyledAttributes, index, this.circleConstraint);
                                break;
                            case 62:
                                this.circleRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.circleRadius);
                                break;
                            case 63:
                                this.circleAngle = typedArrayObtainStyledAttributes.getFloat(index, this.circleAngle);
                                break;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.widthPercent = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.heightPercent = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        break;
                                    case 72:
                                        this.mBarrierDirection = typedArrayObtainStyledAttributes.getInt(index, this.mBarrierDirection);
                                        break;
                                    case 73:
                                        this.mBarrierMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.mBarrierMargin);
                                        break;
                                    case 74:
                                        this.mReferenceIdString = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.mBarrierAllowsGoneWidgets = typedArrayObtainStyledAttributes.getBoolean(index, this.mBarrierAllowsGoneWidgets);
                                        break;
                                    case 76:
                                        this.mWrapBehavior = typedArrayObtainStyledAttributes.getInt(index, this.mWrapBehavior);
                                        break;
                                    case 77:
                                        this.baselineToTop = ConstraintSet.g(typedArrayObtainStyledAttributes, index, this.baselineToTop);
                                        break;
                                    case 78:
                                        this.baselineToBottom = ConstraintSet.g(typedArrayObtainStyledAttributes, index, this.baselineToBottom);
                                        break;
                                    case 79:
                                        this.goneBaselineMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneBaselineMargin);
                                        break;
                                    case 80:
                                        this.baselineMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.baselineMargin);
                                        break;
                                    case 81:
                                        this.widthDefault = typedArrayObtainStyledAttributes.getInt(index, this.widthDefault);
                                        break;
                                    case 82:
                                        this.heightDefault = typedArrayObtainStyledAttributes.getInt(index, this.heightDefault);
                                        break;
                                    case 83:
                                        this.heightMax = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.heightMax);
                                        break;
                                    case 84:
                                        this.widthMax = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.widthMax);
                                        break;
                                    case 85:
                                        this.heightMin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.heightMin);
                                        break;
                                    case 86:
                                        this.widthMin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.widthMin);
                                        break;
                                    case 87:
                                        this.constrainedWidth = typedArrayObtainStyledAttributes.getBoolean(index, this.constrainedWidth);
                                        break;
                                    case 88:
                                        this.constrainedHeight = typedArrayObtainStyledAttributes.getBoolean(index, this.constrainedHeight);
                                        break;
                                    case 89:
                                        this.mConstraintTag = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.guidelineUseRtl = typedArrayObtainStyledAttributes.getBoolean(index, this.guidelineUseRtl);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void copyFrom(Layout layout) {
            this.mIsGuideline = layout.mIsGuideline;
            this.mWidth = layout.mWidth;
            this.mApply = layout.mApply;
            this.mHeight = layout.mHeight;
            this.guideBegin = layout.guideBegin;
            this.guideEnd = layout.guideEnd;
            this.guidePercent = layout.guidePercent;
            this.guidelineUseRtl = layout.guidelineUseRtl;
            this.leftToLeft = layout.leftToLeft;
            this.leftToRight = layout.leftToRight;
            this.rightToLeft = layout.rightToLeft;
            this.rightToRight = layout.rightToRight;
            this.topToTop = layout.topToTop;
            this.topToBottom = layout.topToBottom;
            this.bottomToTop = layout.bottomToTop;
            this.bottomToBottom = layout.bottomToBottom;
            this.baselineToBaseline = layout.baselineToBaseline;
            this.baselineToTop = layout.baselineToTop;
            this.baselineToBottom = layout.baselineToBottom;
            this.startToEnd = layout.startToEnd;
            this.startToStart = layout.startToStart;
            this.endToStart = layout.endToStart;
            this.endToEnd = layout.endToEnd;
            this.horizontalBias = layout.horizontalBias;
            this.verticalBias = layout.verticalBias;
            this.dimensionRatio = layout.dimensionRatio;
            this.circleConstraint = layout.circleConstraint;
            this.circleRadius = layout.circleRadius;
            this.circleAngle = layout.circleAngle;
            this.editorAbsoluteX = layout.editorAbsoluteX;
            this.editorAbsoluteY = layout.editorAbsoluteY;
            this.orientation = layout.orientation;
            this.leftMargin = layout.leftMargin;
            this.rightMargin = layout.rightMargin;
            this.topMargin = layout.topMargin;
            this.bottomMargin = layout.bottomMargin;
            this.endMargin = layout.endMargin;
            this.startMargin = layout.startMargin;
            this.baselineMargin = layout.baselineMargin;
            this.goneLeftMargin = layout.goneLeftMargin;
            this.goneTopMargin = layout.goneTopMargin;
            this.goneRightMargin = layout.goneRightMargin;
            this.goneBottomMargin = layout.goneBottomMargin;
            this.goneEndMargin = layout.goneEndMargin;
            this.goneStartMargin = layout.goneStartMargin;
            this.goneBaselineMargin = layout.goneBaselineMargin;
            this.verticalWeight = layout.verticalWeight;
            this.horizontalWeight = layout.horizontalWeight;
            this.horizontalChainStyle = layout.horizontalChainStyle;
            this.verticalChainStyle = layout.verticalChainStyle;
            this.widthDefault = layout.widthDefault;
            this.heightDefault = layout.heightDefault;
            this.widthMax = layout.widthMax;
            this.heightMax = layout.heightMax;
            this.widthMin = layout.widthMin;
            this.heightMin = layout.heightMin;
            this.widthPercent = layout.widthPercent;
            this.heightPercent = layout.heightPercent;
            this.mBarrierDirection = layout.mBarrierDirection;
            this.mBarrierMargin = layout.mBarrierMargin;
            this.mHelperType = layout.mHelperType;
            this.mConstraintTag = layout.mConstraintTag;
            int[] iArr = layout.mReferenceIds;
            if (iArr == null || layout.mReferenceIdString != null) {
                this.mReferenceIds = null;
            } else {
                this.mReferenceIds = Arrays.copyOf(iArr, iArr.length);
            }
            this.mReferenceIdString = layout.mReferenceIdString;
            this.constrainedWidth = layout.constrainedWidth;
            this.constrainedHeight = layout.constrainedHeight;
            this.mBarrierAllowsGoneWidgets = layout.mBarrierAllowsGoneWidgets;
            this.mWrapBehavior = layout.mWrapBehavior;
        }

        public void dump(MotionScene motionScene, StringBuilder sb2) {
            Field[] declaredFields = getClass().getDeclaredFields();
            sb2.append(RootService.LINE_BREAK);
            for (Field field : declaredFields) {
                String name = field.getName();
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        Object obj = field.get(this);
                        Class<?> type = field.getType();
                        if (type == Integer.TYPE) {
                            Integer num = (Integer) obj;
                            if (num.intValue() != -1) {
                                Object objLookUpConstraintName = motionScene.lookUpConstraintName(num.intValue());
                                sb2.append("    ");
                                sb2.append(name);
                                sb2.append(" = \"");
                                sb2.append(objLookUpConstraintName == null ? num : objLookUpConstraintName);
                                sb2.append("\"\n");
                            }
                        } else if (type == Float.TYPE) {
                            Float f6 = (Float) obj;
                            if (f6.floatValue() != -1.0f) {
                                sb2.append("    ");
                                sb2.append(name);
                                sb2.append(" = \"");
                                sb2.append(f6);
                                sb2.append("\"\n");
                            }
                        }
                    } catch (IllegalAccessException unused) {
                    }
                }
            }
        }
    }

    public static class Motion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f19780a;
        public boolean mApply = false;
        public int mAnimateRelativeTo = -1;
        public int mAnimateCircleAngleTo = 0;
        public String mTransitionEasing = null;
        public int mPathMotionArc = -1;
        public int mDrawPath = 0;
        public float mMotionStagger = Float.NaN;
        public int mPolarRelativeTo = -1;
        public float mPathRotate = Float.NaN;
        public float mQuantizeMotionPhase = Float.NaN;
        public int mQuantizeMotionSteps = -1;
        public String mQuantizeInterpolatorString = null;
        public int mQuantizeInterpolatorType = -3;
        public int mQuantizeInterpolatorID = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f19780a = sparseIntArray;
            sparseIntArray.append(R.styleable.Motion_motionPathRotate, 1);
            sparseIntArray.append(R.styleable.Motion_pathMotionArc, 2);
            sparseIntArray.append(R.styleable.Motion_transitionEasing, 3);
            sparseIntArray.append(R.styleable.Motion_drawPath, 4);
            sparseIntArray.append(R.styleable.Motion_animateRelativeTo, 5);
            sparseIntArray.append(R.styleable.Motion_animateCircleAngleTo, 6);
            sparseIntArray.append(R.styleable.Motion_motionStagger, 7);
            sparseIntArray.append(R.styleable.Motion_quantizeMotionSteps, 8);
            sparseIntArray.append(R.styleable.Motion_quantizeMotionPhase, 9);
            sparseIntArray.append(R.styleable.Motion_quantizeMotionInterpolator, 10);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Motion);
            this.mApply = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f19780a.get(index)) {
                    case 1:
                        this.mPathRotate = typedArrayObtainStyledAttributes.getFloat(index, this.mPathRotate);
                        break;
                    case 2:
                        this.mPathMotionArc = typedArrayObtainStyledAttributes.getInt(index, this.mPathMotionArc);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.mTransitionEasing = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.mTransitionEasing = Easing.NAMED_EASING[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.mDrawPath = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.mAnimateRelativeTo = ConstraintSet.g(typedArrayObtainStyledAttributes, index, this.mAnimateRelativeTo);
                        break;
                    case 6:
                        this.mAnimateCircleAngleTo = typedArrayObtainStyledAttributes.getInteger(index, this.mAnimateCircleAngleTo);
                        break;
                    case 7:
                        this.mMotionStagger = typedArrayObtainStyledAttributes.getFloat(index, this.mMotionStagger);
                        break;
                    case 8:
                        this.mQuantizeMotionSteps = typedArrayObtainStyledAttributes.getInteger(index, this.mQuantizeMotionSteps);
                        break;
                    case 9:
                        this.mQuantizeMotionPhase = typedArrayObtainStyledAttributes.getFloat(index, this.mQuantizeMotionPhase);
                        break;
                    case 10:
                        int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.mQuantizeInterpolatorID = resourceId;
                            if (resourceId != -1) {
                                this.mQuantizeInterpolatorType = -2;
                            }
                        } else if (i11 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.mQuantizeInterpolatorString = string;
                            if (string.indexOf("/") > 0) {
                                this.mQuantizeInterpolatorID = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.mQuantizeInterpolatorType = -2;
                            } else {
                                this.mQuantizeInterpolatorType = -1;
                            }
                        } else {
                            this.mQuantizeInterpolatorType = typedArrayObtainStyledAttributes.getInteger(index, this.mQuantizeInterpolatorID);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void copyFrom(Motion motion) {
            this.mApply = motion.mApply;
            this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
            this.mTransitionEasing = motion.mTransitionEasing;
            this.mPathMotionArc = motion.mPathMotionArc;
            this.mDrawPath = motion.mDrawPath;
            this.mPathRotate = motion.mPathRotate;
            this.mMotionStagger = motion.mMotionStagger;
            this.mPolarRelativeTo = motion.mPolarRelativeTo;
        }
    }

    public static class PropertySet {
        public boolean mApply = false;
        public int visibility = 0;
        public int mVisibilityMode = 0;
        public float alpha = 1.0f;
        public float mProgress = Float.NaN;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PropertySet);
            this.mApply = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.PropertySet_android_alpha) {
                    this.alpha = typedArrayObtainStyledAttributes.getFloat(index, this.alpha);
                } else if (index == R.styleable.PropertySet_android_visibility) {
                    int i11 = typedArrayObtainStyledAttributes.getInt(index, this.visibility);
                    this.visibility = i11;
                    this.visibility = ConstraintSet.f19756f[i11];
                } else if (index == R.styleable.PropertySet_visibilityMode) {
                    this.mVisibilityMode = typedArrayObtainStyledAttributes.getInt(index, this.mVisibilityMode);
                } else if (index == R.styleable.PropertySet_motionProgress) {
                    this.mProgress = typedArrayObtainStyledAttributes.getFloat(index, this.mProgress);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void copyFrom(PropertySet propertySet) {
            this.mApply = propertySet.mApply;
            this.visibility = propertySet.visibility;
            this.alpha = propertySet.alpha;
            this.mProgress = propertySet.mProgress;
            this.mVisibilityMode = propertySet.mVisibilityMode;
        }
    }

    public static class Transform {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f19781a;
        public boolean mApply = false;
        public float rotation = 0.0f;
        public float rotationX = 0.0f;
        public float rotationY = 0.0f;
        public float scaleX = 1.0f;
        public float scaleY = 1.0f;
        public float transformPivotX = Float.NaN;
        public float transformPivotY = Float.NaN;
        public int transformPivotTarget = -1;
        public float translationX = 0.0f;
        public float translationY = 0.0f;
        public float translationZ = 0.0f;
        public boolean applyElevation = false;
        public float elevation = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f19781a = sparseIntArray;
            sparseIntArray.append(R.styleable.Transform_android_rotation, 1);
            sparseIntArray.append(R.styleable.Transform_android_rotationX, 2);
            sparseIntArray.append(R.styleable.Transform_android_rotationY, 3);
            sparseIntArray.append(R.styleable.Transform_android_scaleX, 4);
            sparseIntArray.append(R.styleable.Transform_android_scaleY, 5);
            sparseIntArray.append(R.styleable.Transform_android_transformPivotX, 6);
            sparseIntArray.append(R.styleable.Transform_android_transformPivotY, 7);
            sparseIntArray.append(R.styleable.Transform_android_translationX, 8);
            sparseIntArray.append(R.styleable.Transform_android_translationY, 9);
            sparseIntArray.append(R.styleable.Transform_android_translationZ, 10);
            sparseIntArray.append(R.styleable.Transform_android_elevation, 11);
            sparseIntArray.append(R.styleable.Transform_transformPivotTarget, 12);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Transform);
            this.mApply = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f19781a.get(index)) {
                    case 1:
                        this.rotation = typedArrayObtainStyledAttributes.getFloat(index, this.rotation);
                        break;
                    case 2:
                        this.rotationX = typedArrayObtainStyledAttributes.getFloat(index, this.rotationX);
                        break;
                    case 3:
                        this.rotationY = typedArrayObtainStyledAttributes.getFloat(index, this.rotationY);
                        break;
                    case 4:
                        this.scaleX = typedArrayObtainStyledAttributes.getFloat(index, this.scaleX);
                        break;
                    case 5:
                        this.scaleY = typedArrayObtainStyledAttributes.getFloat(index, this.scaleY);
                        break;
                    case 6:
                        this.transformPivotX = typedArrayObtainStyledAttributes.getDimension(index, this.transformPivotX);
                        break;
                    case 7:
                        this.transformPivotY = typedArrayObtainStyledAttributes.getDimension(index, this.transformPivotY);
                        break;
                    case 8:
                        this.translationX = typedArrayObtainStyledAttributes.getDimension(index, this.translationX);
                        break;
                    case 9:
                        this.translationY = typedArrayObtainStyledAttributes.getDimension(index, this.translationY);
                        break;
                    case 10:
                        this.translationZ = typedArrayObtainStyledAttributes.getDimension(index, this.translationZ);
                        break;
                    case 11:
                        this.applyElevation = true;
                        this.elevation = typedArrayObtainStyledAttributes.getDimension(index, this.elevation);
                        break;
                    case 12:
                        this.transformPivotTarget = ConstraintSet.g(typedArrayObtainStyledAttributes, index, this.transformPivotTarget);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void copyFrom(Transform transform) {
            this.mApply = transform.mApply;
            this.rotation = transform.rotation;
            this.rotationX = transform.rotationX;
            this.rotationY = transform.rotationY;
            this.scaleX = transform.scaleX;
            this.scaleY = transform.scaleY;
            this.transformPivotX = transform.transformPivotX;
            this.transformPivotY = transform.transformPivotY;
            this.transformPivotTarget = transform.transformPivotTarget;
            this.translationX = transform.translationX;
            this.translationY = transform.translationY;
            this.translationZ = transform.translationZ;
            this.applyElevation = transform.applyElevation;
            this.elevation = transform.elevation;
        }
    }

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Writer f19782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f19783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19784c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final HashMap<Integer, String> f19785d = new HashMap<>();

        public a(ConstraintSet constraintSet, Writer writer, ConstraintLayout constraintLayout) throws IOException {
            this.f19782a = writer;
            this.f19783b = constraintLayout.getContext();
        }

        public final String a(int i10) {
            String string;
            HashMap<Integer, String> map = this.f19785d;
            if (map.containsKey(Integer.valueOf(i10))) {
                return d.f(new StringBuilder("'"), map.get(Integer.valueOf(i10)), "'");
            }
            if (i10 == 0) {
                return "'parent'";
            }
            try {
                if (i10 != -1) {
                    string = this.f19783b.getResources().getResourceEntryName(i10);
                } else {
                    StringBuilder sb2 = new StringBuilder("unknown");
                    int i11 = this.f19784c + 1;
                    this.f19784c = i11;
                    sb2.append(i11);
                    string = sb2.toString();
                }
            } catch (Exception unused) {
                StringBuilder sb3 = new StringBuilder("unknown");
                int i12 = this.f19784c + 1;
                this.f19784c = i12;
                sb3.append(i12);
                string = sb3.toString();
            }
            map.put(Integer.valueOf(i10), string);
            return "'" + string + "'";
        }

        public final void b(int i10, int i11, String str, String str2) throws IOException {
            if (i10 == -1) {
                return;
            }
            String strConcat = "       ".concat(str);
            Writer writer = this.f19782a;
            writer.write(strConcat);
            writer.write(":[");
            writer.write(a(i10));
            writer.write(" , ");
            writer.write(str2);
            if (i11 != 0) {
                writer.write(" , " + i11);
            }
            writer.write("],\n");
        }

        public final void c(String str, int i10, int i11, float f6, int i12, int i13) throws IOException {
            Writer writer = this.f19782a;
            if (i10 != 0) {
                if (i10 == -2) {
                    writer.write("       " + str + ": 'wrap'\n");
                    return;
                }
                if (i10 == -1) {
                    writer.write("       " + str + ": 'parent'\n");
                    return;
                }
                writer.write("       " + str + ": " + i10 + ",\n");
                return;
            }
            if (i13 == -1 && i12 == -1) {
                if (i11 == 1) {
                    writer.write("       " + str + ": '???????????',\n");
                    return;
                }
                if (i11 != 2) {
                    return;
                }
                writer.write("       " + str + ": '" + f6 + "%',\n");
                return;
            }
            if (i11 == 0) {
                writer.write("       " + str + ": {'spread' ," + i12 + ", " + i13 + "}\n");
                return;
            }
            if (i11 == 1) {
                writer.write("       " + str + ": {'wrap' ," + i12 + ", " + i13 + "}\n");
                return;
            }
            if (i11 != 2) {
                return;
            }
            writer.write("       " + str + ": {'" + f6 + "'% ," + i12 + ", " + i13 + "}\n");
        }

        public final void d(float f6, String str) throws IOException {
            if (f6 == -1.0f) {
                return;
            }
            String strConcat = "       ".concat(str);
            Writer writer = this.f19782a;
            writer.write(strConcat);
            writer.write(": " + f6);
            writer.write(",\n");
        }

        public final void e(int i10, String str) throws IOException {
            if (i10 == 0 || i10 == -1) {
                return;
            }
            String strConcat = "       ".concat(str);
            Writer writer = this.f19782a;
            writer.write(strConcat);
            writer.write(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
            writer.write(", " + i10);
            writer.write(RootService.LINE_BREAK);
        }

        public final void f(String str, float f6) throws IOException {
            if (f6 == 0.5f) {
                return;
            }
            String strConcat = "       ".concat(str);
            Writer writer = this.f19782a;
            writer.write(strConcat);
            writer.write(": " + f6);
            writer.write(",\n");
        }

        public final void g(String str, String str2) throws IOException {
            if (str2 == null) {
                return;
            }
            String strConcat = "       ".concat(str);
            Writer writer = this.f19782a;
            writer.write(strConcat);
            writer.write(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
            writer.write(", ".concat(str2));
            writer.write(RootService.LINE_BREAK);
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Writer f19786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f19787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19788c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final HashMap<Integer, String> f19789d = new HashMap<>();

        public b(ConstraintSet constraintSet, Writer writer, ConstraintLayout constraintLayout) throws IOException {
            this.f19786a = writer;
            this.f19787b = constraintLayout.getContext();
        }

        public final String a(int i10) {
            String string;
            HashMap<Integer, String> map = this.f19789d;
            if (map.containsKey(Integer.valueOf(i10))) {
                return d.f(new StringBuilder("@+id/"), map.get(Integer.valueOf(i10)), "");
            }
            if (i10 == 0) {
                return "parent";
            }
            try {
                if (i10 != -1) {
                    string = this.f19787b.getResources().getResourceEntryName(i10);
                } else {
                    StringBuilder sb2 = new StringBuilder("unknown");
                    int i11 = this.f19788c + 1;
                    this.f19788c = i11;
                    sb2.append(i11);
                    string = sb2.toString();
                }
            } catch (Exception unused) {
                StringBuilder sb3 = new StringBuilder("unknown");
                int i12 = this.f19788c + 1;
                this.f19788c = i12;
                sb3.append(i12);
                string = sb3.toString();
            }
            map.put(Integer.valueOf(i10), string);
            return "@+id/" + string + "";
        }

        public final void b(int i10, String str) throws IOException {
            if (i10 != -5) {
                Writer writer = this.f19786a;
                if (i10 == -2) {
                    writer.write("\n       " + str + "=\"wrap_content\"");
                    return;
                }
                if (i10 == -1) {
                    writer.write("\n       " + str + "=\"match_parent\"");
                    return;
                }
                writer.write("\n       " + str + "=\"" + i10 + "dp\"");
            }
        }

        public final void c(String str, boolean z10, boolean z11) throws IOException {
            if (z10 != z11) {
                this.f19786a.write("\n       " + str + "=\"" + z10 + "dp\"");
            }
        }

        public final void d(int i10, int i11, String str) throws IOException {
            if (i10 != i11) {
                this.f19786a.write("\n       " + str + "=\"" + i10 + "dp\"");
            }
        }

        public final void e(int i10, int i11, String str, String[] strArr) throws IOException {
            if (i10 != i11) {
                this.f19786a.write(d.f(ci.a.d("\n       ", str, "=\""), strArr[i10], "\""));
            }
        }

        public final void f(int i10, String str) throws IOException {
            if (i10 == 0 || i10 == -1) {
                return;
            }
            this.f19786a.write("\n       " + str + "=\"" + i10 + "\"\n");
        }

        public final void g(String str, float f6, float f10) throws IOException {
            if (f6 == f10) {
                return;
            }
            String strConcat = "\n       ".concat(str);
            Writer writer = this.f19786a;
            writer.write(strConcat);
            writer.write("=\"" + f6 + "\"");
        }

        public final void h(String str, String str2) throws IOException {
            if (str2 == null || str2.equals(null)) {
                return;
            }
            String strConcat = "\n       ".concat(str);
            Writer writer = this.f19786a;
            writer.write(strConcat);
            writer.write("=\"" + str2 + "\"");
        }

        public final void i(int i10, String str) throws IOException {
            if (i10 == -1) {
                return;
            }
            String strConcat = "\n       ".concat(str);
            Writer writer = this.f19786a;
            writer.write(strConcat);
            writer.write("=\"" + a(i10) + "\"");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19757g = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f19758h = sparseIntArray2;
        sparseIntArray.append(R.styleable.Constraint_layout_constraintLeft_toLeftOf, 25);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintLeft_toRightOf, 26);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintRight_toLeftOf, 29);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintRight_toRightOf, 30);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintTop_toTopOf, 36);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintTop_toBottomOf, 35);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintBottom_toTopOf, 4);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintBottom_toBottomOf, 3);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintBaseline_toTopOf, 91);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintBaseline_toBottomOf, 92);
        sparseIntArray.append(R.styleable.Constraint_layout_editor_absoluteX, 6);
        sparseIntArray.append(R.styleable.Constraint_layout_editor_absoluteY, 7);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintGuide_begin, 17);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintGuide_end, 18);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintGuide_percent, 19);
        sparseIntArray.append(R.styleable.Constraint_guidelineUseRtl, 99);
        sparseIntArray.append(R.styleable.Constraint_android_orientation, 27);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintStart_toEndOf, 32);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintStart_toStartOf, 33);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintEnd_toStartOf, 10);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintEnd_toEndOf, 9);
        sparseIntArray.append(R.styleable.Constraint_layout_goneMarginLeft, 13);
        sparseIntArray.append(R.styleable.Constraint_layout_goneMarginTop, 16);
        sparseIntArray.append(R.styleable.Constraint_layout_goneMarginRight, 14);
        sparseIntArray.append(R.styleable.Constraint_layout_goneMarginBottom, 11);
        sparseIntArray.append(R.styleable.Constraint_layout_goneMarginStart, 15);
        sparseIntArray.append(R.styleable.Constraint_layout_goneMarginEnd, 12);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintVertical_weight, 40);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintHorizontal_weight, 39);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintVertical_chainStyle, 42);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintHorizontal_bias, 20);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintVertical_bias, 37);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintDimensionRatio, 5);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintLeft_creator, 87);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintTop_creator, 87);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintRight_creator, 87);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintBottom_creator, 87);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintBaseline_creator, 87);
        sparseIntArray.append(R.styleable.Constraint_android_layout_marginLeft, 24);
        sparseIntArray.append(R.styleable.Constraint_android_layout_marginRight, 28);
        sparseIntArray.append(R.styleable.Constraint_android_layout_marginStart, 31);
        sparseIntArray.append(R.styleable.Constraint_android_layout_marginEnd, 8);
        sparseIntArray.append(R.styleable.Constraint_android_layout_marginTop, 34);
        sparseIntArray.append(R.styleable.Constraint_android_layout_marginBottom, 2);
        sparseIntArray.append(R.styleable.Constraint_android_layout_width, 23);
        sparseIntArray.append(R.styleable.Constraint_android_layout_height, 21);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintWidth, 95);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintHeight, 96);
        sparseIntArray.append(R.styleable.Constraint_android_visibility, 22);
        sparseIntArray.append(R.styleable.Constraint_android_alpha, 43);
        sparseIntArray.append(R.styleable.Constraint_android_elevation, 44);
        sparseIntArray.append(R.styleable.Constraint_android_rotationX, 45);
        sparseIntArray.append(R.styleable.Constraint_android_rotationY, 46);
        sparseIntArray.append(R.styleable.Constraint_android_rotation, 60);
        sparseIntArray.append(R.styleable.Constraint_android_scaleX, 47);
        sparseIntArray.append(R.styleable.Constraint_android_scaleY, 48);
        sparseIntArray.append(R.styleable.Constraint_android_transformPivotX, 49);
        sparseIntArray.append(R.styleable.Constraint_android_transformPivotY, 50);
        sparseIntArray.append(R.styleable.Constraint_android_translationX, 51);
        sparseIntArray.append(R.styleable.Constraint_android_translationY, 52);
        sparseIntArray.append(R.styleable.Constraint_android_translationZ, 53);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintWidth_default, 54);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintHeight_default, 55);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintWidth_max, 56);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintHeight_max, 57);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintWidth_min, 58);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintHeight_min, 59);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintCircle, 61);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintCircleRadius, 62);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintCircleAngle, 63);
        sparseIntArray.append(R.styleable.Constraint_animateRelativeTo, 64);
        sparseIntArray.append(R.styleable.Constraint_transitionEasing, 65);
        sparseIntArray.append(R.styleable.Constraint_drawPath, 66);
        sparseIntArray.append(R.styleable.Constraint_transitionPathRotate, 67);
        sparseIntArray.append(R.styleable.Constraint_motionStagger, 79);
        sparseIntArray.append(R.styleable.Constraint_android_id, 38);
        sparseIntArray.append(R.styleable.Constraint_motionProgress, 68);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintWidth_percent, 69);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintHeight_percent, 70);
        sparseIntArray.append(R.styleable.Constraint_layout_wrapBehaviorInParent, 97);
        sparseIntArray.append(R.styleable.Constraint_chainUseRtl, 71);
        sparseIntArray.append(R.styleable.Constraint_barrierDirection, 72);
        sparseIntArray.append(R.styleable.Constraint_barrierMargin, 73);
        sparseIntArray.append(R.styleable.Constraint_constraint_referenced_ids, 74);
        sparseIntArray.append(R.styleable.Constraint_barrierAllowsGoneWidgets, 75);
        sparseIntArray.append(R.styleable.Constraint_pathMotionArc, 76);
        sparseIntArray.append(R.styleable.Constraint_layout_constraintTag, 77);
        sparseIntArray.append(R.styleable.Constraint_visibilityMode, 78);
        sparseIntArray.append(R.styleable.Constraint_layout_constrainedWidth, 80);
        sparseIntArray.append(R.styleable.Constraint_layout_constrainedHeight, 81);
        sparseIntArray.append(R.styleable.Constraint_polarRelativeTo, 82);
        sparseIntArray.append(R.styleable.Constraint_transformPivotTarget, 83);
        sparseIntArray.append(R.styleable.Constraint_quantizeMotionSteps, 84);
        sparseIntArray.append(R.styleable.Constraint_quantizeMotionPhase, 85);
        sparseIntArray.append(R.styleable.Constraint_quantizeMotionInterpolator, 86);
        int i10 = R.styleable.ConstraintOverride_layout_editor_absoluteY;
        sparseIntArray2.append(i10, 6);
        sparseIntArray2.append(i10, 7);
        sparseIntArray2.append(R.styleable.ConstraintOverride_android_orientation, 27);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_goneMarginLeft, 13);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_goneMarginTop, 16);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_goneMarginRight, 14);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_goneMarginBottom, 11);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_goneMarginStart, 15);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_goneMarginEnd, 12);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_constraintVertical_weight, 40);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_constraintVertical_bias, 37);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_constraintDimensionRatio, 5);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_constraintLeft_creator, 87);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_constraintTop_creator, 87);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_constraintRight_creator, 87);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_constraintBottom_creator, 87);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_constraintBaseline_creator, 87);
        sparseIntArray2.append(R.styleable.ConstraintOverride_android_layout_marginLeft, 24);
        sparseIntArray2.append(R.styleable.ConstraintOverride_android_layout_marginRight, 28);
        sparseIntArray2.append(R.styleable.ConstraintOverride_android_layout_marginStart, 31);
        sparseIntArray2.append(R.styleable.ConstraintOverride_android_layout_marginEnd, 8);
        sparseIntArray2.append(R.styleable.ConstraintOverride_android_layout_marginTop, 34);
        sparseIntArray2.append(R.styleable.ConstraintOverride_android_layout_marginBottom, 2);
        sparseIntArray2.append(R.styleable.ConstraintOverride_android_layout_width, 23);
        sparseIntArray2.append(R.styleable.ConstraintOverride_android_layout_height, 21);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_constraintWidth, 95);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_constraintHeight, 96);
        sparseIntArray2.append(R.styleable.ConstraintOverride_android_visibility, 22);
        sparseIntArray2.append(R.styleable.ConstraintOverride_android_alpha, 43);
        sparseIntArray2.append(R.styleable.ConstraintOverride_android_elevation, 44);
        sparseIntArray2.append(R.styleable.ConstraintOverride_android_rotationX, 45);
        sparseIntArray2.append(R.styleable.ConstraintOverride_android_rotationY, 46);
        sparseIntArray2.append(R.styleable.ConstraintOverride_android_rotation, 60);
        sparseIntArray2.append(R.styleable.ConstraintOverride_android_scaleX, 47);
        sparseIntArray2.append(R.styleable.ConstraintOverride_android_scaleY, 48);
        sparseIntArray2.append(R.styleable.ConstraintOverride_android_transformPivotX, 49);
        sparseIntArray2.append(R.styleable.ConstraintOverride_android_transformPivotY, 50);
        sparseIntArray2.append(R.styleable.ConstraintOverride_android_translationX, 51);
        sparseIntArray2.append(R.styleable.ConstraintOverride_android_translationY, 52);
        sparseIntArray2.append(R.styleable.ConstraintOverride_android_translationZ, 53);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_constraintWidth_default, 54);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_constraintHeight_default, 55);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_constraintWidth_max, 56);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_constraintHeight_max, 57);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_constraintWidth_min, 58);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_constraintHeight_min, 59);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_constraintCircleRadius, 62);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_constraintCircleAngle, 63);
        sparseIntArray2.append(R.styleable.ConstraintOverride_animateRelativeTo, 64);
        sparseIntArray2.append(R.styleable.ConstraintOverride_transitionEasing, 65);
        sparseIntArray2.append(R.styleable.ConstraintOverride_drawPath, 66);
        sparseIntArray2.append(R.styleable.ConstraintOverride_transitionPathRotate, 67);
        sparseIntArray2.append(R.styleable.ConstraintOverride_motionStagger, 79);
        sparseIntArray2.append(R.styleable.ConstraintOverride_android_id, 38);
        sparseIntArray2.append(R.styleable.ConstraintOverride_motionTarget, 98);
        sparseIntArray2.append(R.styleable.ConstraintOverride_motionProgress, 68);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_constraintWidth_percent, 69);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_constraintHeight_percent, 70);
        sparseIntArray2.append(R.styleable.ConstraintOverride_chainUseRtl, 71);
        sparseIntArray2.append(R.styleable.ConstraintOverride_barrierDirection, 72);
        sparseIntArray2.append(R.styleable.ConstraintOverride_barrierMargin, 73);
        sparseIntArray2.append(R.styleable.ConstraintOverride_constraint_referenced_ids, 74);
        sparseIntArray2.append(R.styleable.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        sparseIntArray2.append(R.styleable.ConstraintOverride_pathMotionArc, 76);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_constraintTag, 77);
        sparseIntArray2.append(R.styleable.ConstraintOverride_visibilityMode, 78);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_constrainedWidth, 80);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_constrainedHeight, 81);
        sparseIntArray2.append(R.styleable.ConstraintOverride_polarRelativeTo, 82);
        sparseIntArray2.append(R.styleable.ConstraintOverride_transformPivotTarget, 83);
        sparseIntArray2.append(R.styleable.ConstraintOverride_quantizeMotionSteps, 84);
        sparseIntArray2.append(R.styleable.ConstraintOverride_quantizeMotionPhase, 85);
        sparseIntArray2.append(R.styleable.ConstraintOverride_quantizeMotionInterpolator, 86);
        sparseIntArray2.append(R.styleable.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    public static Constraint buildDelta(Context context, XmlPullParser xmlPullParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        Constraint constraint = new Constraint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, R.styleable.ConstraintOverride);
        j(constraint, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return constraint;
    }

    public static int[] c(Barrier barrier, String str) {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            try {
                iIntValue = R.id.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) barrier.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    public static Constraint e(Context context, AttributeSet attributeSet, boolean z10) {
        Constraint constraint = new Constraint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? R.styleable.ConstraintOverride : R.styleable.Constraint);
        if (z10) {
            j(constraint, typedArrayObtainStyledAttributes);
        } else {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index != R.styleable.Constraint_android_id && R.styleable.Constraint_android_layout_marginStart != index && R.styleable.Constraint_android_layout_marginEnd != index) {
                    constraint.motion.mApply = true;
                    constraint.layout.mApply = true;
                    constraint.propertySet.mApply = true;
                    constraint.transform.mApply = true;
                }
                SparseIntArray sparseIntArray = f19757g;
                switch (sparseIntArray.get(index)) {
                    case 1:
                        Layout layout = constraint.layout;
                        layout.baselineToBaseline = g(typedArrayObtainStyledAttributes, index, layout.baselineToBaseline);
                        break;
                    case 2:
                        Layout layout2 = constraint.layout;
                        layout2.bottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout2.bottomMargin);
                        break;
                    case 3:
                        Layout layout3 = constraint.layout;
                        layout3.bottomToBottom = g(typedArrayObtainStyledAttributes, index, layout3.bottomToBottom);
                        break;
                    case 4:
                        Layout layout4 = constraint.layout;
                        layout4.bottomToTop = g(typedArrayObtainStyledAttributes, index, layout4.bottomToTop);
                        break;
                    case 5:
                        constraint.layout.dimensionRatio = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        Layout layout5 = constraint.layout;
                        layout5.editorAbsoluteX = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, layout5.editorAbsoluteX);
                        break;
                    case 7:
                        Layout layout6 = constraint.layout;
                        layout6.editorAbsoluteY = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, layout6.editorAbsoluteY);
                        break;
                    case 8:
                        Layout layout7 = constraint.layout;
                        layout7.endMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout7.endMargin);
                        break;
                    case 9:
                        Layout layout8 = constraint.layout;
                        layout8.endToEnd = g(typedArrayObtainStyledAttributes, index, layout8.endToEnd);
                        break;
                    case 10:
                        Layout layout9 = constraint.layout;
                        layout9.endToStart = g(typedArrayObtainStyledAttributes, index, layout9.endToStart);
                        break;
                    case 11:
                        Layout layout10 = constraint.layout;
                        layout10.goneBottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout10.goneBottomMargin);
                        break;
                    case 12:
                        Layout layout11 = constraint.layout;
                        layout11.goneEndMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout11.goneEndMargin);
                        break;
                    case 13:
                        Layout layout12 = constraint.layout;
                        layout12.goneLeftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout12.goneLeftMargin);
                        break;
                    case 14:
                        Layout layout13 = constraint.layout;
                        layout13.goneRightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout13.goneRightMargin);
                        break;
                    case 15:
                        Layout layout14 = constraint.layout;
                        layout14.goneStartMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout14.goneStartMargin);
                        break;
                    case 16:
                        Layout layout15 = constraint.layout;
                        layout15.goneTopMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout15.goneTopMargin);
                        break;
                    case 17:
                        Layout layout16 = constraint.layout;
                        layout16.guideBegin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, layout16.guideBegin);
                        break;
                    case 18:
                        Layout layout17 = constraint.layout;
                        layout17.guideEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, layout17.guideEnd);
                        break;
                    case 19:
                        Layout layout18 = constraint.layout;
                        layout18.guidePercent = typedArrayObtainStyledAttributes.getFloat(index, layout18.guidePercent);
                        break;
                    case 20:
                        Layout layout19 = constraint.layout;
                        layout19.horizontalBias = typedArrayObtainStyledAttributes.getFloat(index, layout19.horizontalBias);
                        break;
                    case 21:
                        Layout layout20 = constraint.layout;
                        layout20.mHeight = typedArrayObtainStyledAttributes.getLayoutDimension(index, layout20.mHeight);
                        break;
                    case 22:
                        PropertySet propertySet = constraint.propertySet;
                        propertySet.visibility = typedArrayObtainStyledAttributes.getInt(index, propertySet.visibility);
                        PropertySet propertySet2 = constraint.propertySet;
                        propertySet2.visibility = f19756f[propertySet2.visibility];
                        break;
                    case 23:
                        Layout layout21 = constraint.layout;
                        layout21.mWidth = typedArrayObtainStyledAttributes.getLayoutDimension(index, layout21.mWidth);
                        break;
                    case 24:
                        Layout layout22 = constraint.layout;
                        layout22.leftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout22.leftMargin);
                        break;
                    case 25:
                        Layout layout23 = constraint.layout;
                        layout23.leftToLeft = g(typedArrayObtainStyledAttributes, index, layout23.leftToLeft);
                        break;
                    case 26:
                        Layout layout24 = constraint.layout;
                        layout24.leftToRight = g(typedArrayObtainStyledAttributes, index, layout24.leftToRight);
                        break;
                    case 27:
                        Layout layout25 = constraint.layout;
                        layout25.orientation = typedArrayObtainStyledAttributes.getInt(index, layout25.orientation);
                        break;
                    case 28:
                        Layout layout26 = constraint.layout;
                        layout26.rightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout26.rightMargin);
                        break;
                    case 29:
                        Layout layout27 = constraint.layout;
                        layout27.rightToLeft = g(typedArrayObtainStyledAttributes, index, layout27.rightToLeft);
                        break;
                    case 30:
                        Layout layout28 = constraint.layout;
                        layout28.rightToRight = g(typedArrayObtainStyledAttributes, index, layout28.rightToRight);
                        break;
                    case 31:
                        Layout layout29 = constraint.layout;
                        layout29.startMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout29.startMargin);
                        break;
                    case 32:
                        Layout layout30 = constraint.layout;
                        layout30.startToEnd = g(typedArrayObtainStyledAttributes, index, layout30.startToEnd);
                        break;
                    case 33:
                        Layout layout31 = constraint.layout;
                        layout31.startToStart = g(typedArrayObtainStyledAttributes, index, layout31.startToStart);
                        break;
                    case 34:
                        Layout layout32 = constraint.layout;
                        layout32.topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout32.topMargin);
                        break;
                    case 35:
                        Layout layout33 = constraint.layout;
                        layout33.topToBottom = g(typedArrayObtainStyledAttributes, index, layout33.topToBottom);
                        break;
                    case 36:
                        Layout layout34 = constraint.layout;
                        layout34.topToTop = g(typedArrayObtainStyledAttributes, index, layout34.topToTop);
                        break;
                    case 37:
                        Layout layout35 = constraint.layout;
                        layout35.verticalBias = typedArrayObtainStyledAttributes.getFloat(index, layout35.verticalBias);
                        break;
                    case 38:
                        constraint.f19764a = typedArrayObtainStyledAttributes.getResourceId(index, constraint.f19764a);
                        break;
                    case 39:
                        Layout layout36 = constraint.layout;
                        layout36.horizontalWeight = typedArrayObtainStyledAttributes.getFloat(index, layout36.horizontalWeight);
                        break;
                    case 40:
                        Layout layout37 = constraint.layout;
                        layout37.verticalWeight = typedArrayObtainStyledAttributes.getFloat(index, layout37.verticalWeight);
                        break;
                    case 41:
                        Layout layout38 = constraint.layout;
                        layout38.horizontalChainStyle = typedArrayObtainStyledAttributes.getInt(index, layout38.horizontalChainStyle);
                        break;
                    case 42:
                        Layout layout39 = constraint.layout;
                        layout39.verticalChainStyle = typedArrayObtainStyledAttributes.getInt(index, layout39.verticalChainStyle);
                        break;
                    case 43:
                        PropertySet propertySet3 = constraint.propertySet;
                        propertySet3.alpha = typedArrayObtainStyledAttributes.getFloat(index, propertySet3.alpha);
                        break;
                    case 44:
                        Transform transform = constraint.transform;
                        transform.applyElevation = true;
                        transform.elevation = typedArrayObtainStyledAttributes.getDimension(index, transform.elevation);
                        break;
                    case 45:
                        Transform transform2 = constraint.transform;
                        transform2.rotationX = typedArrayObtainStyledAttributes.getFloat(index, transform2.rotationX);
                        break;
                    case 46:
                        Transform transform3 = constraint.transform;
                        transform3.rotationY = typedArrayObtainStyledAttributes.getFloat(index, transform3.rotationY);
                        break;
                    case 47:
                        Transform transform4 = constraint.transform;
                        transform4.scaleX = typedArrayObtainStyledAttributes.getFloat(index, transform4.scaleX);
                        break;
                    case 48:
                        Transform transform5 = constraint.transform;
                        transform5.scaleY = typedArrayObtainStyledAttributes.getFloat(index, transform5.scaleY);
                        break;
                    case 49:
                        Transform transform6 = constraint.transform;
                        transform6.transformPivotX = typedArrayObtainStyledAttributes.getDimension(index, transform6.transformPivotX);
                        break;
                    case 50:
                        Transform transform7 = constraint.transform;
                        transform7.transformPivotY = typedArrayObtainStyledAttributes.getDimension(index, transform7.transformPivotY);
                        break;
                    case 51:
                        Transform transform8 = constraint.transform;
                        transform8.translationX = typedArrayObtainStyledAttributes.getDimension(index, transform8.translationX);
                        break;
                    case 52:
                        Transform transform9 = constraint.transform;
                        transform9.translationY = typedArrayObtainStyledAttributes.getDimension(index, transform9.translationY);
                        break;
                    case 53:
                        Transform transform10 = constraint.transform;
                        transform10.translationZ = typedArrayObtainStyledAttributes.getDimension(index, transform10.translationZ);
                        break;
                    case 54:
                        Layout layout40 = constraint.layout;
                        layout40.widthDefault = typedArrayObtainStyledAttributes.getInt(index, layout40.widthDefault);
                        break;
                    case 55:
                        Layout layout41 = constraint.layout;
                        layout41.heightDefault = typedArrayObtainStyledAttributes.getInt(index, layout41.heightDefault);
                        break;
                    case 56:
                        Layout layout42 = constraint.layout;
                        layout42.widthMax = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout42.widthMax);
                        break;
                    case 57:
                        Layout layout43 = constraint.layout;
                        layout43.heightMax = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout43.heightMax);
                        break;
                    case 58:
                        Layout layout44 = constraint.layout;
                        layout44.widthMin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout44.widthMin);
                        break;
                    case 59:
                        Layout layout45 = constraint.layout;
                        layout45.heightMin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout45.heightMin);
                        break;
                    case 60:
                        Transform transform11 = constraint.transform;
                        transform11.rotation = typedArrayObtainStyledAttributes.getFloat(index, transform11.rotation);
                        break;
                    case 61:
                        Layout layout46 = constraint.layout;
                        layout46.circleConstraint = g(typedArrayObtainStyledAttributes, index, layout46.circleConstraint);
                        break;
                    case 62:
                        Layout layout47 = constraint.layout;
                        layout47.circleRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout47.circleRadius);
                        break;
                    case 63:
                        Layout layout48 = constraint.layout;
                        layout48.circleAngle = typedArrayObtainStyledAttributes.getFloat(index, layout48.circleAngle);
                        break;
                    case 64:
                        Motion motion = constraint.motion;
                        motion.mAnimateRelativeTo = g(typedArrayObtainStyledAttributes, index, motion.mAnimateRelativeTo);
                        break;
                    case 65:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            constraint.motion.mTransitionEasing = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            constraint.motion.mTransitionEasing = Easing.NAMED_EASING[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 66:
                        constraint.motion.mDrawPath = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 67:
                        Motion motion2 = constraint.motion;
                        motion2.mPathRotate = typedArrayObtainStyledAttributes.getFloat(index, motion2.mPathRotate);
                        break;
                    case 68:
                        PropertySet propertySet4 = constraint.propertySet;
                        propertySet4.mProgress = typedArrayObtainStyledAttributes.getFloat(index, propertySet4.mProgress);
                        break;
                    case 69:
                        constraint.layout.widthPercent = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 70:
                        constraint.layout.heightPercent = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 71:
                        break;
                    case 72:
                        Layout layout49 = constraint.layout;
                        layout49.mBarrierDirection = typedArrayObtainStyledAttributes.getInt(index, layout49.mBarrierDirection);
                        break;
                    case 73:
                        Layout layout50 = constraint.layout;
                        layout50.mBarrierMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout50.mBarrierMargin);
                        break;
                    case 74:
                        constraint.layout.mReferenceIdString = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 75:
                        Layout layout51 = constraint.layout;
                        layout51.mBarrierAllowsGoneWidgets = typedArrayObtainStyledAttributes.getBoolean(index, layout51.mBarrierAllowsGoneWidgets);
                        break;
                    case 76:
                        Motion motion3 = constraint.motion;
                        motion3.mPathMotionArc = typedArrayObtainStyledAttributes.getInt(index, motion3.mPathMotionArc);
                        break;
                    case 77:
                        constraint.layout.mConstraintTag = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 78:
                        PropertySet propertySet5 = constraint.propertySet;
                        propertySet5.mVisibilityMode = typedArrayObtainStyledAttributes.getInt(index, propertySet5.mVisibilityMode);
                        break;
                    case 79:
                        Motion motion4 = constraint.motion;
                        motion4.mMotionStagger = typedArrayObtainStyledAttributes.getFloat(index, motion4.mMotionStagger);
                        break;
                    case 80:
                        Layout layout52 = constraint.layout;
                        layout52.constrainedWidth = typedArrayObtainStyledAttributes.getBoolean(index, layout52.constrainedWidth);
                        break;
                    case 81:
                        Layout layout53 = constraint.layout;
                        layout53.constrainedHeight = typedArrayObtainStyledAttributes.getBoolean(index, layout53.constrainedHeight);
                        break;
                    case 82:
                        Motion motion5 = constraint.motion;
                        motion5.mAnimateCircleAngleTo = typedArrayObtainStyledAttributes.getInteger(index, motion5.mAnimateCircleAngleTo);
                        break;
                    case 83:
                        Transform transform12 = constraint.transform;
                        transform12.transformPivotTarget = g(typedArrayObtainStyledAttributes, index, transform12.transformPivotTarget);
                        break;
                    case 84:
                        Motion motion6 = constraint.motion;
                        motion6.mQuantizeMotionSteps = typedArrayObtainStyledAttributes.getInteger(index, motion6.mQuantizeMotionSteps);
                        break;
                    case 85:
                        Motion motion7 = constraint.motion;
                        motion7.mQuantizeMotionPhase = typedArrayObtainStyledAttributes.getFloat(index, motion7.mQuantizeMotionPhase);
                        break;
                    case 86:
                        int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            constraint.motion.mQuantizeInterpolatorID = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            Motion motion8 = constraint.motion;
                            if (motion8.mQuantizeInterpolatorID != -1) {
                                motion8.mQuantizeInterpolatorType = -2;
                            }
                        } else if (i11 == 3) {
                            constraint.motion.mQuantizeInterpolatorString = typedArrayObtainStyledAttributes.getString(index);
                            if (constraint.motion.mQuantizeInterpolatorString.indexOf("/") > 0) {
                                constraint.motion.mQuantizeInterpolatorID = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                constraint.motion.mQuantizeInterpolatorType = -2;
                            } else {
                                constraint.motion.mQuantizeInterpolatorType = -1;
                            }
                        } else {
                            Motion motion9 = constraint.motion;
                            motion9.mQuantizeInterpolatorType = typedArrayObtainStyledAttributes.getInteger(index, motion9.mQuantizeInterpolatorID);
                        }
                        break;
                    case 87:
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 91:
                        Layout layout54 = constraint.layout;
                        layout54.baselineToTop = g(typedArrayObtainStyledAttributes, index, layout54.baselineToTop);
                        break;
                    case 92:
                        Layout layout55 = constraint.layout;
                        layout55.baselineToBottom = g(typedArrayObtainStyledAttributes, index, layout55.baselineToBottom);
                        break;
                    case 93:
                        Layout layout56 = constraint.layout;
                        layout56.baselineMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout56.baselineMargin);
                        break;
                    case 94:
                        Layout layout57 = constraint.layout;
                        layout57.goneBaselineMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout57.goneBaselineMargin);
                        break;
                    case 95:
                        h(constraint.layout, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        h(constraint.layout, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        Layout layout58 = constraint.layout;
                        layout58.mWrapBehavior = typedArrayObtainStyledAttributes.getInt(index, layout58.mWrapBehavior);
                        break;
                }
            }
            Layout layout59 = constraint.layout;
            if (layout59.mReferenceIdString != null) {
                layout59.mReferenceIds = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return constraint;
    }

    public static int g(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0035  */
    /* JADX WARN: Code duplicated, block: B:22:0x0039  */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    public static void h(Object obj, TypedArray typedArray, int i10, int i11) {
        int dimensionPixelSize;
        Constraint.a aVar;
        Layout layout;
        ConstraintLayout.LayoutParams layoutParams;
        if (obj == null) {
            return;
        }
        int i12 = typedArray.peekValue(i10).type;
        boolean z10 = true;
        int i13 = 0;
        if (i12 != 3) {
            if (i12 != 5) {
                dimensionPixelSize = typedArray.getInt(i10, 0);
                if (dimensionPixelSize == -4) {
                    i13 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z10 = false;
                }
                if (obj instanceof ConstraintLayout.LayoutParams) {
                    layoutParams = (ConstraintLayout.LayoutParams) obj;
                    if (i11 == 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = i13;
                        layoutParams.constrainedWidth = z10;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = i13;
                        layoutParams.constrainedHeight = z10;
                        return;
                    }
                }
                if (obj instanceof Layout) {
                    layout = (Layout) obj;
                    if (i11 == 0) {
                        layout.mWidth = i13;
                        layout.constrainedWidth = z10;
                        return;
                    } else {
                        layout.mHeight = i13;
                        layout.constrainedHeight = z10;
                        return;
                    }
                }
                if (obj instanceof Constraint.a) {
                    aVar = (Constraint.a) obj;
                    if (i11 == 0) {
                        aVar.b(23, i13);
                        aVar.d(80, z10);
                        return;
                    } else {
                        aVar.b(21, i13);
                        aVar.d(81, z10);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i10, 0);
            z10 = false;
            i13 = dimensionPixelSize;
            if (obj instanceof ConstraintLayout.LayoutParams) {
                layoutParams = (ConstraintLayout.LayoutParams) obj;
                if (i11 == 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = i13;
                    layoutParams.constrainedWidth = z10;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = i13;
                    layoutParams.constrainedHeight = z10;
                    return;
                }
            }
            if (obj instanceof Layout) {
                layout = (Layout) obj;
                if (i11 == 0) {
                    layout.mWidth = i13;
                    layout.constrainedWidth = z10;
                    return;
                } else {
                    layout.mHeight = i13;
                    layout.constrainedHeight = z10;
                    return;
                }
            }
            if (obj instanceof Constraint.a) {
                aVar = (Constraint.a) obj;
                if (i11 == 0) {
                    aVar.b(23, i13);
                    aVar.d(80, z10);
                    return;
                } else {
                    aVar.b(21, i13);
                    aVar.d(81, z10);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i10);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.LayoutParams) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) obj;
                    if (i11 == 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                    }
                    i(layoutParams2, strTrim2);
                    return;
                }
                if (obj instanceof Layout) {
                    ((Layout) obj).dimensionRatio = strTrim2;
                    return;
                } else {
                    if (obj instanceof Constraint.a) {
                        ((Constraint.a) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f6 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) obj;
                        if (i11 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).width = 0;
                            layoutParams3.horizontalWeight = f6;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
                            layoutParams3.verticalWeight = f6;
                        }
                    } else if (obj instanceof Layout) {
                        Layout layout2 = (Layout) obj;
                        if (i11 == 0) {
                            layout2.mWidth = 0;
                            layout2.horizontalWeight = f6;
                        } else {
                            layout2.mHeight = 0;
                            layout2.verticalWeight = f6;
                        }
                    } else if (obj instanceof Constraint.a) {
                        Constraint.a aVar2 = (Constraint.a) obj;
                        if (i11 == 0) {
                            aVar2.b(23, 0);
                            aVar2.a(39, f6);
                        } else {
                            aVar2.b(21, 0);
                            aVar2.a(40, f6);
                        }
                    }
                } else {
                    if (!"parent".equalsIgnoreCase(strTrim)) {
                        return;
                    }
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) obj;
                        if (i11 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams4).width = 0;
                            layoutParams4.matchConstraintPercentWidth = fMax;
                            layoutParams4.matchConstraintDefaultWidth = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams4).height = 0;
                            layoutParams4.matchConstraintPercentHeight = fMax;
                            layoutParams4.matchConstraintDefaultHeight = 2;
                        }
                    } else if (obj instanceof Layout) {
                        Layout layout3 = (Layout) obj;
                        if (i11 == 0) {
                            layout3.mWidth = 0;
                            layout3.widthPercent = fMax;
                            layout3.widthDefault = 2;
                        } else {
                            layout3.mHeight = 0;
                            layout3.heightPercent = fMax;
                            layout3.heightDefault = 2;
                        }
                    } else if (obj instanceof Constraint.a) {
                        Constraint.a aVar3 = (Constraint.a) obj;
                        if (i11 == 0) {
                            aVar3.b(23, 0);
                            aVar3.b(54, 2);
                        } else {
                            aVar3.b(21, 0);
                            aVar3.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void i(ConstraintLayout.LayoutParams layoutParams, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            byte b10 = -1;
            int i10 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase(ExifInterface.LONGITUDE_WEST)) {
                    b10 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    b10 = 1;
                }
                i10 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i10);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i10, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f6 = Float.parseFloat(strSubstring3);
                        float f10 = Float.parseFloat(strSubstring4);
                        if (f6 > 0.0f && f10 > 0.0f) {
                            if (b10 == 1) {
                                Math.abs(f10 / f6);
                            } else {
                                Math.abs(f6 / f10);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        layoutParams.dimensionRatio = str;
    }

    public static void j(Constraint constraint, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        Constraint.a aVar = new Constraint.a();
        constraint.f19766c = aVar;
        constraint.motion.mApply = false;
        constraint.layout.mApply = false;
        constraint.propertySet.mApply = false;
        constraint.transform.mApply = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            int i11 = f19758h.get(index);
            SparseIntArray sparseIntArray = f19757g;
            switch (i11) {
                case 2:
                    aVar.b(2, typedArray.getDimensionPixelSize(index, constraint.layout.bottomMargin));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                case 5:
                    aVar.c(5, typedArray.getString(index));
                    break;
                case 6:
                    aVar.b(6, typedArray.getDimensionPixelOffset(index, constraint.layout.editorAbsoluteX));
                    break;
                case 7:
                    aVar.b(7, typedArray.getDimensionPixelOffset(index, constraint.layout.editorAbsoluteY));
                    break;
                case 8:
                    aVar.b(8, typedArray.getDimensionPixelSize(index, constraint.layout.endMargin));
                    break;
                case 11:
                    aVar.b(11, typedArray.getDimensionPixelSize(index, constraint.layout.goneBottomMargin));
                    break;
                case 12:
                    aVar.b(12, typedArray.getDimensionPixelSize(index, constraint.layout.goneEndMargin));
                    break;
                case 13:
                    aVar.b(13, typedArray.getDimensionPixelSize(index, constraint.layout.goneLeftMargin));
                    break;
                case 14:
                    aVar.b(14, typedArray.getDimensionPixelSize(index, constraint.layout.goneRightMargin));
                    break;
                case 15:
                    aVar.b(15, typedArray.getDimensionPixelSize(index, constraint.layout.goneStartMargin));
                    break;
                case 16:
                    aVar.b(16, typedArray.getDimensionPixelSize(index, constraint.layout.goneTopMargin));
                    break;
                case 17:
                    aVar.b(17, typedArray.getDimensionPixelOffset(index, constraint.layout.guideBegin));
                    break;
                case 18:
                    aVar.b(18, typedArray.getDimensionPixelOffset(index, constraint.layout.guideEnd));
                    break;
                case 19:
                    aVar.a(19, typedArray.getFloat(index, constraint.layout.guidePercent));
                    break;
                case 20:
                    aVar.a(20, typedArray.getFloat(index, constraint.layout.horizontalBias));
                    break;
                case 21:
                    aVar.b(21, typedArray.getLayoutDimension(index, constraint.layout.mHeight));
                    break;
                case 22:
                    aVar.b(22, f19756f[typedArray.getInt(index, constraint.propertySet.visibility)]);
                    break;
                case 23:
                    aVar.b(23, typedArray.getLayoutDimension(index, constraint.layout.mWidth));
                    break;
                case 24:
                    aVar.b(24, typedArray.getDimensionPixelSize(index, constraint.layout.leftMargin));
                    break;
                case 27:
                    aVar.b(27, typedArray.getInt(index, constraint.layout.orientation));
                    break;
                case 28:
                    aVar.b(28, typedArray.getDimensionPixelSize(index, constraint.layout.rightMargin));
                    break;
                case 31:
                    aVar.b(31, typedArray.getDimensionPixelSize(index, constraint.layout.startMargin));
                    break;
                case 34:
                    aVar.b(34, typedArray.getDimensionPixelSize(index, constraint.layout.topMargin));
                    break;
                case 37:
                    aVar.a(37, typedArray.getFloat(index, constraint.layout.verticalBias));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, constraint.f19764a);
                    constraint.f19764a = resourceId;
                    aVar.b(38, resourceId);
                    break;
                case 39:
                    aVar.a(39, typedArray.getFloat(index, constraint.layout.horizontalWeight));
                    break;
                case 40:
                    aVar.a(40, typedArray.getFloat(index, constraint.layout.verticalWeight));
                    break;
                case 41:
                    aVar.b(41, typedArray.getInt(index, constraint.layout.horizontalChainStyle));
                    break;
                case 42:
                    aVar.b(42, typedArray.getInt(index, constraint.layout.verticalChainStyle));
                    break;
                case 43:
                    aVar.a(43, typedArray.getFloat(index, constraint.propertySet.alpha));
                    break;
                case 44:
                    aVar.d(44, true);
                    aVar.a(44, typedArray.getDimension(index, constraint.transform.elevation));
                    break;
                case 45:
                    aVar.a(45, typedArray.getFloat(index, constraint.transform.rotationX));
                    break;
                case 46:
                    aVar.a(46, typedArray.getFloat(index, constraint.transform.rotationY));
                    break;
                case 47:
                    aVar.a(47, typedArray.getFloat(index, constraint.transform.scaleX));
                    break;
                case 48:
                    aVar.a(48, typedArray.getFloat(index, constraint.transform.scaleY));
                    break;
                case 49:
                    aVar.a(49, typedArray.getDimension(index, constraint.transform.transformPivotX));
                    break;
                case 50:
                    aVar.a(50, typedArray.getDimension(index, constraint.transform.transformPivotY));
                    break;
                case 51:
                    aVar.a(51, typedArray.getDimension(index, constraint.transform.translationX));
                    break;
                case 52:
                    aVar.a(52, typedArray.getDimension(index, constraint.transform.translationY));
                    break;
                case 53:
                    aVar.a(53, typedArray.getDimension(index, constraint.transform.translationZ));
                    break;
                case 54:
                    aVar.b(54, typedArray.getInt(index, constraint.layout.widthDefault));
                    break;
                case 55:
                    aVar.b(55, typedArray.getInt(index, constraint.layout.heightDefault));
                    break;
                case 56:
                    aVar.b(56, typedArray.getDimensionPixelSize(index, constraint.layout.widthMax));
                    break;
                case 57:
                    aVar.b(57, typedArray.getDimensionPixelSize(index, constraint.layout.heightMax));
                    break;
                case 58:
                    aVar.b(58, typedArray.getDimensionPixelSize(index, constraint.layout.widthMin));
                    break;
                case 59:
                    aVar.b(59, typedArray.getDimensionPixelSize(index, constraint.layout.heightMin));
                    break;
                case 60:
                    aVar.a(60, typedArray.getFloat(index, constraint.transform.rotation));
                    break;
                case 62:
                    aVar.b(62, typedArray.getDimensionPixelSize(index, constraint.layout.circleRadius));
                    break;
                case 63:
                    aVar.a(63, typedArray.getFloat(index, constraint.layout.circleAngle));
                    break;
                case 64:
                    aVar.b(64, g(typedArray, index, constraint.motion.mAnimateRelativeTo));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.c(65, typedArray.getString(index));
                    } else {
                        aVar.c(65, Easing.NAMED_EASING[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    aVar.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    aVar.a(67, typedArray.getFloat(index, constraint.motion.mPathRotate));
                    break;
                case 68:
                    aVar.a(68, typedArray.getFloat(index, constraint.propertySet.mProgress));
                    break;
                case 69:
                    aVar.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    aVar.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    break;
                case 72:
                    aVar.b(72, typedArray.getInt(index, constraint.layout.mBarrierDirection));
                    break;
                case 73:
                    aVar.b(73, typedArray.getDimensionPixelSize(index, constraint.layout.mBarrierMargin));
                    break;
                case 74:
                    aVar.c(74, typedArray.getString(index));
                    break;
                case 75:
                    aVar.d(75, typedArray.getBoolean(index, constraint.layout.mBarrierAllowsGoneWidgets));
                    break;
                case 76:
                    aVar.b(76, typedArray.getInt(index, constraint.motion.mPathMotionArc));
                    break;
                case 77:
                    aVar.c(77, typedArray.getString(index));
                    break;
                case 78:
                    aVar.b(78, typedArray.getInt(index, constraint.propertySet.mVisibilityMode));
                    break;
                case 79:
                    aVar.a(79, typedArray.getFloat(index, constraint.motion.mMotionStagger));
                    break;
                case 80:
                    aVar.d(80, typedArray.getBoolean(index, constraint.layout.constrainedWidth));
                    break;
                case 81:
                    aVar.d(81, typedArray.getBoolean(index, constraint.layout.constrainedHeight));
                    break;
                case 82:
                    aVar.b(82, typedArray.getInteger(index, constraint.motion.mAnimateCircleAngleTo));
                    break;
                case 83:
                    aVar.b(83, g(typedArray, index, constraint.transform.transformPivotTarget));
                    break;
                case 84:
                    aVar.b(84, typedArray.getInteger(index, constraint.motion.mQuantizeMotionSteps));
                    break;
                case 85:
                    aVar.a(85, typedArray.getFloat(index, constraint.motion.mQuantizeMotionPhase));
                    break;
                case 86:
                    int i12 = typedArray.peekValue(index).type;
                    if (i12 == 1) {
                        constraint.motion.mQuantizeInterpolatorID = typedArray.getResourceId(index, -1);
                        aVar.b(89, constraint.motion.mQuantizeInterpolatorID);
                        Motion motion = constraint.motion;
                        if (motion.mQuantizeInterpolatorID != -1) {
                            motion.mQuantizeInterpolatorType = -2;
                            aVar.b(88, -2);
                        }
                    } else if (i12 == 3) {
                        constraint.motion.mQuantizeInterpolatorString = typedArray.getString(index);
                        aVar.c(90, constraint.motion.mQuantizeInterpolatorString);
                        if (constraint.motion.mQuantizeInterpolatorString.indexOf("/") > 0) {
                            constraint.motion.mQuantizeInterpolatorID = typedArray.getResourceId(index, -1);
                            aVar.b(89, constraint.motion.mQuantizeInterpolatorID);
                            constraint.motion.mQuantizeInterpolatorType = -2;
                            aVar.b(88, -2);
                        } else {
                            constraint.motion.mQuantizeInterpolatorType = -1;
                            aVar.b(88, -1);
                        }
                    } else {
                        Motion motion2 = constraint.motion;
                        motion2.mQuantizeInterpolatorType = typedArray.getInteger(index, motion2.mQuantizeInterpolatorID);
                        aVar.b(88, constraint.motion.mQuantizeInterpolatorType);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                case 93:
                    aVar.b(93, typedArray.getDimensionPixelSize(index, constraint.layout.baselineMargin));
                    break;
                case 94:
                    aVar.b(94, typedArray.getDimensionPixelSize(index, constraint.layout.goneBaselineMargin));
                    break;
                case 95:
                    h(aVar, typedArray, index, 0);
                    break;
                case 96:
                    h(aVar, typedArray, index, 1);
                    break;
                case 97:
                    aVar.b(97, typedArray.getInt(index, constraint.layout.mWrapBehavior));
                    break;
                case 98:
                    if (MotionLayout.IS_IN_EDIT_MODE) {
                        int resourceId2 = typedArray.getResourceId(index, constraint.f19764a);
                        constraint.f19764a = resourceId2;
                        if (resourceId2 == -1) {
                            constraint.f19765b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        constraint.f19765b = typedArray.getString(index);
                    } else {
                        constraint.f19764a = typedArray.getResourceId(index, constraint.f19764a);
                    }
                    break;
                case 99:
                    aVar.d(99, typedArray.getBoolean(index, constraint.layout.guidelineUseRtl));
                    break;
            }
        }
    }

    public static String k(int i10) {
        switch (i10) {
            case 1:
                return Parameters.DIRECTION.LEFT;
            case 2:
                return Parameters.DIRECTION.RIGHT;
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return EventDataKeys.Lifecycle.LIFECYCLE_START;
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public final void a(ConstraintAttribute.AttributeType attributeType, String... strArr) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            HashMap<String, ConstraintAttribute> map = this.f19761c;
            if (map.containsKey(strArr[i10])) {
                ConstraintAttribute constraintAttribute = map.get(strArr[i10]);
                if (constraintAttribute != null && constraintAttribute.getType() != attributeType) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute.getType().name());
                }
            } else {
                map.put(strArr[i10], new ConstraintAttribute(strArr[i10], attributeType));
            }
        }
    }

    public void addColorAttributes(String... strArr) {
        a(ConstraintAttribute.AttributeType.COLOR_TYPE, strArr);
    }

    public void addFloatAttributes(String... strArr) {
        a(ConstraintAttribute.AttributeType.FLOAT_TYPE, strArr);
    }

    public void addIntAttributes(String... strArr) {
        a(ConstraintAttribute.AttributeType.INT_TYPE, strArr);
    }

    public void addStringAttributes(String... strArr) {
        a(ConstraintAttribute.AttributeType.STRING_TYPE, strArr);
    }

    public void addToHorizontalChain(int i10, int i11, int i12) {
        connect(i10, 1, i11, i11 == 0 ? 1 : 2, 0);
        connect(i10, 2, i12, i12 == 0 ? 2 : 1, 0);
        if (i11 != 0) {
            connect(i11, 2, i10, 1, 0);
        }
        if (i12 != 0) {
            connect(i12, 1, i10, 2, 0);
        }
    }

    public void addToHorizontalChainRTL(int i10, int i11, int i12) {
        connect(i10, 6, i11, i11 == 0 ? 6 : 7, 0);
        connect(i10, 7, i12, i12 == 0 ? 7 : 6, 0);
        if (i11 != 0) {
            connect(i11, 7, i10, 6, 0);
        }
        if (i12 != 0) {
            connect(i12, 6, i10, 7, 0);
        }
    }

    public void addToVerticalChain(int i10, int i11, int i12) {
        connect(i10, 3, i11, i11 == 0 ? 3 : 4, 0);
        connect(i10, 4, i12, i12 == 0 ? 4 : 3, 0);
        if (i11 != 0) {
            connect(i11, 4, i10, 3, 0);
        }
        if (i12 != 0) {
            connect(i12, 3, i10, 4, 0);
        }
    }

    public void applyCustomAttributes(ConstraintLayout constraintLayout) {
        Constraint constraint;
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id = childAt.getId();
            HashMap<Integer, Constraint> map = this.f19763e;
            if (!map.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + Debug.getName(childAt));
            } else {
                if (this.f19762d && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (map.containsKey(Integer.valueOf(id)) && (constraint = map.get(Integer.valueOf(id))) != null) {
                    ConstraintAttribute.setAttributes(childAt, constraint.mCustomConstraints);
                }
            }
        }
    }

    public void applyDeltaFrom(ConstraintSet constraintSet) {
        for (Constraint constraint : constraintSet.f19763e.values()) {
            if (constraint.f19766c != null) {
                if (constraint.f19765b == null) {
                    constraint.f19766c.e(getConstraint(constraint.f19764a));
                } else {
                    Iterator<Integer> it = this.f19763e.keySet().iterator();
                    while (it.hasNext()) {
                        Constraint constraint2 = getConstraint(it.next().intValue());
                        String str = constraint2.layout.mConstraintTag;
                        if (str != null && constraint.f19765b.matches(str)) {
                            constraint.f19766c.e(constraint2);
                            constraint2.mCustomConstraints.putAll((HashMap) constraint.mCustomConstraints.clone());
                        }
                    }
                }
            }
        }
    }

    public void applyTo(ConstraintLayout constraintLayout) {
        b(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void applyToHelper(ConstraintHelper constraintHelper, ConstraintWidget constraintWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        Constraint constraint;
        int id = constraintHelper.getId();
        HashMap<Integer, Constraint> map = this.f19763e;
        if (map.containsKey(Integer.valueOf(id)) && (constraint = map.get(Integer.valueOf(id))) != null && (constraintWidget instanceof HelperWidget)) {
            constraintHelper.loadParameters(constraint, (HelperWidget) constraintWidget, layoutParams, sparseArray);
        }
    }

    public void applyToLayoutParams(int i10, ConstraintLayout.LayoutParams layoutParams) {
        Constraint constraint;
        HashMap<Integer, Constraint> map = this.f19763e;
        if (!map.containsKey(Integer.valueOf(i10)) || (constraint = map.get(Integer.valueOf(i10))) == null) {
            return;
        }
        constraint.applyTo(layoutParams);
    }

    public void applyToWithoutCustom(ConstraintLayout constraintLayout) {
        b(constraintLayout, false);
        constraintLayout.setConstraintSet(null);
    }

    public final void b(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, Constraint> map = this.f19763e;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + Debug.getName(childAt));
            } else {
                if (this.f19762d && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && map.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    Constraint constraint = map.get(Integer.valueOf(id));
                    if (constraint != null) {
                        if (childAt instanceof Barrier) {
                            constraint.layout.mHelperType = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(constraint.layout.mBarrierDirection);
                            barrier.setMargin(constraint.layout.mBarrierMargin);
                            barrier.setAllowsGoneWidget(constraint.layout.mBarrierAllowsGoneWidgets);
                            Layout layout = constraint.layout;
                            int[] iArr = layout.mReferenceIds;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = layout.mReferenceIdString;
                                if (str != null) {
                                    layout.mReferenceIds = c(barrier, str);
                                    barrier.setReferencedIds(constraint.layout.mReferenceIds);
                                }
                            }
                        }
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                        layoutParams.validate();
                        constraint.applyTo(layoutParams);
                        if (z10) {
                            ConstraintAttribute.setAttributes(childAt, constraint.mCustomConstraints);
                        }
                        childAt.setLayoutParams(layoutParams);
                        PropertySet propertySet = constraint.propertySet;
                        if (propertySet.mVisibilityMode == 0) {
                            childAt.setVisibility(propertySet.visibility);
                        }
                        childAt.setAlpha(constraint.propertySet.alpha);
                        childAt.setRotation(constraint.transform.rotation);
                        childAt.setRotationX(constraint.transform.rotationX);
                        childAt.setRotationY(constraint.transform.rotationY);
                        childAt.setScaleX(constraint.transform.scaleX);
                        childAt.setScaleY(constraint.transform.scaleY);
                        Transform transform = constraint.transform;
                        if (transform.transformPivotTarget != -1) {
                            View viewFindViewById = ((View) childAt.getParent()).findViewById(constraint.transform.transformPivotTarget);
                            if (viewFindViewById != null) {
                                float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    float left = right - childAt.getLeft();
                                    float top = bottom - childAt.getTop();
                                    childAt.setPivotX(left);
                                    childAt.setPivotY(top);
                                }
                            }
                        } else {
                            if (!Float.isNaN(transform.transformPivotX)) {
                                childAt.setPivotX(constraint.transform.transformPivotX);
                            }
                            if (!Float.isNaN(constraint.transform.transformPivotY)) {
                                childAt.setPivotY(constraint.transform.transformPivotY);
                            }
                        }
                        childAt.setTranslationX(constraint.transform.translationX);
                        childAt.setTranslationY(constraint.transform.translationY);
                        childAt.setTranslationZ(constraint.transform.translationZ);
                        Transform transform2 = constraint.transform;
                        if (transform2.applyElevation) {
                            childAt.setElevation(transform2.elevation);
                        }
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            Constraint constraint2 = map.get(num);
            if (constraint2 != null) {
                if (constraint2.layout.mHelperType == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    Layout layout2 = constraint2.layout;
                    int[] iArr2 = layout2.mReferenceIds;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = layout2.mReferenceIdString;
                        if (str2 != null) {
                            layout2.mReferenceIds = c(barrier2, str2);
                            barrier2.setReferencedIds(constraint2.layout.mReferenceIds);
                        }
                    }
                    barrier2.setType(constraint2.layout.mBarrierDirection);
                    barrier2.setMargin(constraint2.layout.mBarrierMargin);
                    ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.validateParams();
                    constraint2.applyTo(layoutParamsGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, layoutParamsGenerateDefaultLayoutParams);
                }
                if (constraint2.layout.mIsGuideline) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    constraint2.applyTo(layoutParamsGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, layoutParamsGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).applyLayoutFeaturesInConstraintSet(constraintLayout);
            }
        }
    }

    public void center(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f6) {
        if (i13 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (i16 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (f6 <= 0.0f || f6 > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        HashMap<Integer, Constraint> map = this.f19763e;
        if (i12 == 1 || i12 == 2) {
            connect(i10, 1, i11, i12, i13);
            connect(i10, 2, i14, i15, i16);
            Constraint constraint = map.get(Integer.valueOf(i10));
            if (constraint != null) {
                constraint.layout.horizontalBias = f6;
                return;
            }
            return;
        }
        if (i12 == 6 || i12 == 7) {
            connect(i10, 6, i11, i12, i13);
            connect(i10, 7, i14, i15, i16);
            Constraint constraint2 = map.get(Integer.valueOf(i10));
            if (constraint2 != null) {
                constraint2.layout.horizontalBias = f6;
                return;
            }
            return;
        }
        connect(i10, 3, i11, i12, i13);
        connect(i10, 4, i14, i15, i16);
        Constraint constraint3 = map.get(Integer.valueOf(i10));
        if (constraint3 != null) {
            constraint3.layout.verticalBias = f6;
        }
    }

    public void centerHorizontally(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f6) {
        connect(i10, 1, i11, i12, i13);
        connect(i10, 2, i14, i15, i16);
        Constraint constraint = this.f19763e.get(Integer.valueOf(i10));
        if (constraint != null) {
            constraint.layout.horizontalBias = f6;
        }
    }

    public void centerHorizontallyRtl(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f6) {
        connect(i10, 6, i11, i12, i13);
        connect(i10, 7, i14, i15, i16);
        Constraint constraint = this.f19763e.get(Integer.valueOf(i10));
        if (constraint != null) {
            constraint.layout.horizontalBias = f6;
        }
    }

    public void centerVertically(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f6) {
        connect(i10, 3, i11, i12, i13);
        connect(i10, 4, i14, i15, i16);
        Constraint constraint = this.f19763e.get(Integer.valueOf(i10));
        if (constraint != null) {
            constraint.layout.verticalBias = f6;
        }
    }

    public void clear(int i10) {
        this.f19763e.remove(Integer.valueOf(i10));
    }

    public void clone(Context context, int i10) {
        clone((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void connect(int i10, int i11, int i12, int i13, int i14) {
        HashMap<Integer, Constraint> map = this.f19763e;
        if (!map.containsKey(Integer.valueOf(i10))) {
            map.put(Integer.valueOf(i10), new Constraint());
        }
        Constraint constraint = map.get(Integer.valueOf(i10));
        if (constraint == null) {
            return;
        }
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    Layout layout = constraint.layout;
                    layout.leftToLeft = i12;
                    layout.leftToRight = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("Left to " + k(i13) + " undefined");
                    }
                    Layout layout2 = constraint.layout;
                    layout2.leftToRight = i12;
                    layout2.leftToLeft = -1;
                }
                constraint.layout.leftMargin = i14;
                return;
            case 2:
                if (i13 == 1) {
                    Layout layout3 = constraint.layout;
                    layout3.rightToLeft = i12;
                    layout3.rightToRight = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("right to " + k(i13) + " undefined");
                    }
                    Layout layout4 = constraint.layout;
                    layout4.rightToRight = i12;
                    layout4.rightToLeft = -1;
                }
                constraint.layout.rightMargin = i14;
                return;
            case 3:
                if (i13 == 3) {
                    Layout layout5 = constraint.layout;
                    layout5.topToTop = i12;
                    layout5.topToBottom = -1;
                    layout5.baselineToBaseline = -1;
                    layout5.baselineToTop = -1;
                    layout5.baselineToBottom = -1;
                } else {
                    if (i13 != 4) {
                        throw new IllegalArgumentException("right to " + k(i13) + " undefined");
                    }
                    Layout layout6 = constraint.layout;
                    layout6.topToBottom = i12;
                    layout6.topToTop = -1;
                    layout6.baselineToBaseline = -1;
                    layout6.baselineToTop = -1;
                    layout6.baselineToBottom = -1;
                }
                constraint.layout.topMargin = i14;
                return;
            case 4:
                if (i13 == 4) {
                    Layout layout7 = constraint.layout;
                    layout7.bottomToBottom = i12;
                    layout7.bottomToTop = -1;
                    layout7.baselineToBaseline = -1;
                    layout7.baselineToTop = -1;
                    layout7.baselineToBottom = -1;
                } else {
                    if (i13 != 3) {
                        throw new IllegalArgumentException("right to " + k(i13) + " undefined");
                    }
                    Layout layout8 = constraint.layout;
                    layout8.bottomToTop = i12;
                    layout8.bottomToBottom = -1;
                    layout8.baselineToBaseline = -1;
                    layout8.baselineToTop = -1;
                    layout8.baselineToBottom = -1;
                }
                constraint.layout.bottomMargin = i14;
                return;
            case 5:
                if (i13 == 5) {
                    Layout layout9 = constraint.layout;
                    layout9.baselineToBaseline = i12;
                    layout9.bottomToBottom = -1;
                    layout9.bottomToTop = -1;
                    layout9.topToTop = -1;
                    layout9.topToBottom = -1;
                    return;
                }
                if (i13 == 3) {
                    Layout layout10 = constraint.layout;
                    layout10.baselineToTop = i12;
                    layout10.bottomToBottom = -1;
                    layout10.bottomToTop = -1;
                    layout10.topToTop = -1;
                    layout10.topToBottom = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + k(i13) + " undefined");
                }
                Layout layout11 = constraint.layout;
                layout11.baselineToBottom = i12;
                layout11.bottomToBottom = -1;
                layout11.bottomToTop = -1;
                layout11.topToTop = -1;
                layout11.topToBottom = -1;
                return;
            case 6:
                if (i13 == 6) {
                    Layout layout12 = constraint.layout;
                    layout12.startToStart = i12;
                    layout12.startToEnd = -1;
                } else {
                    if (i13 != 7) {
                        throw new IllegalArgumentException("right to " + k(i13) + " undefined");
                    }
                    Layout layout13 = constraint.layout;
                    layout13.startToEnd = i12;
                    layout13.startToStart = -1;
                }
                constraint.layout.startMargin = i14;
                return;
            case 7:
                if (i13 == 7) {
                    Layout layout14 = constraint.layout;
                    layout14.endToEnd = i12;
                    layout14.endToStart = -1;
                } else {
                    if (i13 != 6) {
                        throw new IllegalArgumentException("right to " + k(i13) + " undefined");
                    }
                    Layout layout15 = constraint.layout;
                    layout15.endToStart = i12;
                    layout15.endToEnd = -1;
                }
                constraint.layout.endMargin = i14;
                return;
            default:
                throw new IllegalArgumentException(k(i11) + " to " + k(i13) + " unknown");
        }
    }

    public void constrainCircle(int i10, int i11, int i12, float f6) {
        Layout layout = f(i10).layout;
        layout.circleConstraint = i11;
        layout.circleRadius = i12;
        layout.circleAngle = f6;
    }

    public void constrainDefaultHeight(int i10, int i11) {
        f(i10).layout.heightDefault = i11;
    }

    public void constrainDefaultWidth(int i10, int i11) {
        f(i10).layout.widthDefault = i11;
    }

    public void constrainHeight(int i10, int i11) {
        f(i10).layout.mHeight = i11;
    }

    public void constrainMaxHeight(int i10, int i11) {
        f(i10).layout.heightMax = i11;
    }

    public void constrainMaxWidth(int i10, int i11) {
        f(i10).layout.widthMax = i11;
    }

    public void constrainMinHeight(int i10, int i11) {
        f(i10).layout.heightMin = i11;
    }

    public void constrainMinWidth(int i10, int i11) {
        f(i10).layout.widthMin = i11;
    }

    public void constrainPercentHeight(int i10, float f6) {
        f(i10).layout.heightPercent = f6;
    }

    public void constrainPercentWidth(int i10, float f6) {
        f(i10).layout.widthPercent = f6;
    }

    public void constrainWidth(int i10, int i11) {
        f(i10).layout.mWidth = i11;
    }

    public void constrainedHeight(int i10, boolean z10) {
        f(i10).layout.constrainedHeight = z10;
    }

    public void constrainedWidth(int i10, boolean z10) {
        f(i10).layout.constrainedWidth = z10;
    }

    public void create(int i10, int i11) {
        Layout layout = f(i10).layout;
        layout.mIsGuideline = true;
        layout.orientation = i11;
    }

    public void createBarrier(int i10, int i11, int i12, int... iArr) {
        Layout layout = f(i10).layout;
        layout.mHelperType = 1;
        layout.mBarrierDirection = i11;
        layout.mBarrierMargin = i12;
        layout.mIsGuideline = false;
        layout.mReferenceIds = iArr;
    }

    public void createHorizontalChain(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14) {
        d(i10, i11, i12, i13, iArr, fArr, i14, 1, 2);
    }

    public void createHorizontalChainRtl(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14) {
        d(i10, i11, i12, i13, iArr, fArr, i14, 6, 7);
    }

    public void createVerticalChain(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            f(iArr[0]).layout.verticalWeight = fArr[0];
        }
        f(iArr[0]).layout.verticalChainStyle = i14;
        connect(iArr[0], 3, i10, i11, 0);
        for (int i15 = 1; i15 < iArr.length; i15++) {
            int i16 = i15 - 1;
            connect(iArr[i15], 3, iArr[i16], 4, 0);
            connect(iArr[i16], 4, iArr[i15], 3, 0);
            if (fArr != null) {
                f(iArr[i15]).layout.verticalWeight = fArr[i15];
            }
        }
        connect(iArr[iArr.length - 1], 4, i12, i13, 0);
    }

    public final void d(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14, int i15, int i16) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            f(iArr[0]).layout.horizontalWeight = fArr[0];
        }
        f(iArr[0]).layout.horizontalChainStyle = i14;
        connect(iArr[0], i15, i10, i11, -1);
        for (int i17 = 1; i17 < iArr.length; i17++) {
            int i18 = i17 - 1;
            connect(iArr[i17], i15, iArr[i18], i16, -1);
            connect(iArr[i18], i16, iArr[i17], i15, -1);
            if (fArr != null) {
                f(iArr[i17]).layout.horizontalWeight = fArr[i17];
            }
        }
        connect(iArr[iArr.length - 1], i16, i12, i13, -1);
    }

    public void dump(MotionScene motionScene, int... iArr) {
        HashSet hashSet;
        HashMap<Integer, Constraint> map = this.f19763e;
        Set<Integer> setKeySet = map.keySet();
        if (iArr.length != 0) {
            hashSet = new HashSet();
            for (int i10 : iArr) {
                hashSet.add(Integer.valueOf(i10));
            }
        } else {
            hashSet = new HashSet(setKeySet);
        }
        System.out.println(hashSet.size() + " constraints");
        StringBuilder sb2 = new StringBuilder();
        for (Integer num : (Integer[]) hashSet.toArray(new Integer[0])) {
            Constraint constraint = map.get(num);
            if (constraint != null) {
                sb2.append("<Constraint id=");
                sb2.append(num);
                sb2.append(" \n");
                constraint.layout.dump(motionScene, sb2);
                sb2.append("/>\n");
            }
        }
        System.out.println(sb2.toString());
    }

    public final Constraint f(int i10) {
        HashMap<Integer, Constraint> map = this.f19763e;
        if (!map.containsKey(Integer.valueOf(i10))) {
            map.put(Integer.valueOf(i10), new Constraint());
        }
        return map.get(Integer.valueOf(i10));
    }

    public boolean getApplyElevation(int i10) {
        return f(i10).transform.applyElevation;
    }

    public Constraint getConstraint(int i10) {
        HashMap<Integer, Constraint> map = this.f19763e;
        if (map.containsKey(Integer.valueOf(i10))) {
            return map.get(Integer.valueOf(i10));
        }
        return null;
    }

    public HashMap<String, ConstraintAttribute> getCustomAttributeSet() {
        return this.f19761c;
    }

    public int getHeight(int i10) {
        return f(i10).layout.mHeight;
    }

    public int[] getKnownIds() {
        Integer[] numArr = (Integer[]) this.f19763e.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = numArr[i10].intValue();
        }
        return iArr;
    }

    public Constraint getParameters(int i10) {
        return f(i10);
    }

    public int[] getReferencedIds(int i10) {
        int[] iArr = f(i10).layout.mReferenceIds;
        return iArr == null ? new int[0] : Arrays.copyOf(iArr, iArr.length);
    }

    public String[] getStateLabels() {
        String[] strArr = this.f19760b;
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public int getVisibility(int i10) {
        return f(i10).propertySet.visibility;
    }

    public int getVisibilityMode(int i10) {
        return f(i10).propertySet.mVisibilityMode;
    }

    public int getWidth(int i10) {
        return f(i10).layout.mWidth;
    }

    public boolean isForceId() {
        return this.f19762d;
    }

    public boolean isValidateOnParse() {
        return this.f19759a;
    }

    public void load(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    Constraint constraintE = e(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        constraintE.layout.mIsGuideline = true;
                    }
                    this.f19763e.put(Integer.valueOf(constraintE.f19764a), constraintE);
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public boolean matchesLabels(String... strArr) {
        for (String str : strArr) {
            for (String str2 : this.f19760b) {
                if (str2.equals(str)) {
                }
            }
            return false;
        }
        return true;
    }

    public void parseColorAttributes(Constraint constraint, String str) {
        String[] strArrSplit = str.split(",");
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String[] strArrSplit2 = strArrSplit[i10].split("=");
            if (strArrSplit2.length != 2) {
                Log.w("ConstraintSet", " Unable to parse " + strArrSplit[i10]);
            } else {
                constraint.c(strArrSplit2[0], ConstraintAttribute.AttributeType.COLOR_TYPE).setColorValue(Color.parseColor(strArrSplit2[1]));
            }
        }
    }

    public void parseFloatAttributes(Constraint constraint, String str) {
        String[] strArrSplit = str.split(",");
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String[] strArrSplit2 = strArrSplit[i10].split("=");
            if (strArrSplit2.length != 2) {
                Log.w("ConstraintSet", " Unable to parse " + strArrSplit[i10]);
            } else {
                constraint.c(strArrSplit2[0], ConstraintAttribute.AttributeType.FLOAT_TYPE).setFloatValue(Float.parseFloat(strArrSplit2[1]));
            }
        }
    }

    public void parseIntAttributes(Constraint constraint, String str) {
        String[] strArrSplit = str.split(",");
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String[] strArrSplit2 = strArrSplit[i10].split("=");
            if (strArrSplit2.length != 2) {
                Log.w("ConstraintSet", " Unable to parse " + strArrSplit[i10]);
            } else {
                constraint.c(strArrSplit2[0], ConstraintAttribute.AttributeType.FLOAT_TYPE).setFloatValue(Integer.decode(strArrSplit2[1]).intValue());
            }
        }
    }

    public void parseStringAttributes(Constraint constraint, String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        boolean z10 = false;
        for (int i11 = 0; i11 < charArray.length; i11++) {
            char c10 = charArray[i11];
            if (c10 == ',' && !z10) {
                arrayList.add(new String(charArray, i10, i11 - i10));
                i10 = i11 + 1;
            } else if (c10 == '\"') {
                z10 = !z10;
            }
        }
        arrayList.add(new String(charArray, i10, charArray.length - i10));
        String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        for (int i12 = 0; i12 < strArr.length; i12++) {
            String[] strArrSplit = strArr[i12].split("=");
            Log.w("ConstraintSet", " Unable to parse " + strArr[i12]);
            constraint.c(strArrSplit[0], ConstraintAttribute.AttributeType.STRING_TYPE).setStringValue(strArrSplit[1]);
        }
    }

    public void readFallback(ConstraintSet constraintSet) {
        for (Integer num : constraintSet.f19763e.keySet()) {
            int iIntValue = num.intValue();
            Constraint constraint = constraintSet.f19763e.get(num);
            HashMap<Integer, Constraint> map = this.f19763e;
            if (!map.containsKey(Integer.valueOf(iIntValue))) {
                map.put(Integer.valueOf(iIntValue), new Constraint());
            }
            Constraint constraint2 = map.get(Integer.valueOf(iIntValue));
            if (constraint2 != null) {
                Layout layout = constraint2.layout;
                if (!layout.mApply) {
                    layout.copyFrom(constraint.layout);
                }
                PropertySet propertySet = constraint2.propertySet;
                if (!propertySet.mApply) {
                    propertySet.copyFrom(constraint.propertySet);
                }
                Transform transform = constraint2.transform;
                if (!transform.mApply) {
                    transform.copyFrom(constraint.transform);
                }
                Motion motion = constraint2.motion;
                if (!motion.mApply) {
                    motion.copyFrom(constraint.motion);
                }
                for (String str : constraint.mCustomConstraints.keySet()) {
                    if (!constraint2.mCustomConstraints.containsKey(str)) {
                        constraint2.mCustomConstraints.put(str, constraint.mCustomConstraints.get(str));
                    }
                }
            }
        }
    }

    public void removeAttribute(String str) {
        this.f19761c.remove(str);
    }

    public void removeFromHorizontalChain(int i10) {
        Constraint constraint;
        HashMap<Integer, Constraint> map = this.f19763e;
        if (!map.containsKey(Integer.valueOf(i10)) || (constraint = map.get(Integer.valueOf(i10))) == null) {
            return;
        }
        Layout layout = constraint.layout;
        int i11 = layout.leftToRight;
        int i12 = layout.rightToLeft;
        if (i11 != -1 || i12 != -1) {
            if (i11 == -1 || i12 == -1) {
                int i13 = layout.rightToRight;
                if (i13 != -1) {
                    connect(i11, 2, i13, 2, 0);
                } else {
                    int i14 = layout.leftToLeft;
                    if (i14 != -1) {
                        connect(i12, 1, i14, 1, 0);
                    }
                }
            } else {
                connect(i11, 2, i12, 1, 0);
                connect(i12, 1, i11, 2, 0);
            }
            clear(i10, 1);
            clear(i10, 2);
            return;
        }
        int i15 = layout.startToEnd;
        int i16 = layout.endToStart;
        if (i15 != -1 || i16 != -1) {
            if (i15 != -1 && i16 != -1) {
                connect(i15, 7, i16, 6, 0);
                connect(i16, 6, i11, 7, 0);
            } else if (i16 != -1) {
                int i17 = layout.rightToRight;
                if (i17 != -1) {
                    connect(i11, 7, i17, 7, 0);
                } else {
                    int i18 = layout.leftToLeft;
                    if (i18 != -1) {
                        connect(i16, 6, i18, 6, 0);
                    }
                }
            }
        }
        clear(i10, 6);
        clear(i10, 7);
    }

    public void removeFromVerticalChain(int i10) {
        HashMap<Integer, Constraint> map = this.f19763e;
        if (map.containsKey(Integer.valueOf(i10))) {
            Constraint constraint = map.get(Integer.valueOf(i10));
            if (constraint == null) {
                return;
            }
            Layout layout = constraint.layout;
            int i11 = layout.topToBottom;
            int i12 = layout.bottomToTop;
            if (i11 != -1 || i12 != -1) {
                if (i11 == -1 || i12 == -1) {
                    int i13 = layout.bottomToBottom;
                    if (i13 != -1) {
                        connect(i11, 4, i13, 4, 0);
                    } else {
                        int i14 = layout.topToTop;
                        if (i14 != -1) {
                            connect(i12, 3, i14, 3, 0);
                        }
                    }
                } else {
                    connect(i11, 4, i12, 3, 0);
                    connect(i12, 3, i11, 4, 0);
                }
            }
        }
        clear(i10, 3);
        clear(i10, 4);
    }

    public void setAlpha(int i10, float f6) {
        f(i10).propertySet.alpha = f6;
    }

    public void setApplyElevation(int i10, boolean z10) {
        f(i10).transform.applyElevation = z10;
    }

    public void setBarrierType(int i10, int i11) {
        f(i10).layout.mHelperType = i11;
    }

    public void setColorValue(int i10, String str, int i11) {
        f(i10).c(str, ConstraintAttribute.AttributeType.COLOR_TYPE).setColorValue(i11);
    }

    public void setDimensionRatio(int i10, String str) {
        f(i10).layout.dimensionRatio = str;
    }

    public void setEditorAbsoluteX(int i10, int i11) {
        f(i10).layout.editorAbsoluteX = i11;
    }

    public void setEditorAbsoluteY(int i10, int i11) {
        f(i10).layout.editorAbsoluteY = i11;
    }

    public void setElevation(int i10, float f6) {
        f(i10).transform.elevation = f6;
        f(i10).transform.applyElevation = true;
    }

    public void setFloatValue(int i10, String str, float f6) {
        f(i10).c(str, ConstraintAttribute.AttributeType.FLOAT_TYPE).setFloatValue(f6);
    }

    public void setForceId(boolean z10) {
        this.f19762d = z10;
    }

    public void setGoneMargin(int i10, int i11, int i12) {
        Constraint constraintF = f(i10);
        switch (i11) {
            case 1:
                constraintF.layout.goneLeftMargin = i12;
                return;
            case 2:
                constraintF.layout.goneRightMargin = i12;
                return;
            case 3:
                constraintF.layout.goneTopMargin = i12;
                return;
            case 4:
                constraintF.layout.goneBottomMargin = i12;
                return;
            case 5:
                constraintF.layout.goneBaselineMargin = i12;
                return;
            case 6:
                constraintF.layout.goneStartMargin = i12;
                return;
            case 7:
                constraintF.layout.goneEndMargin = i12;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void setGuidelineBegin(int i10, int i11) {
        f(i10).layout.guideBegin = i11;
        f(i10).layout.guideEnd = -1;
        f(i10).layout.guidePercent = -1.0f;
    }

    public void setGuidelineEnd(int i10, int i11) {
        f(i10).layout.guideEnd = i11;
        f(i10).layout.guideBegin = -1;
        f(i10).layout.guidePercent = -1.0f;
    }

    public void setGuidelinePercent(int i10, float f6) {
        f(i10).layout.guidePercent = f6;
        f(i10).layout.guideEnd = -1;
        f(i10).layout.guideBegin = -1;
    }

    public void setHorizontalBias(int i10, float f6) {
        f(i10).layout.horizontalBias = f6;
    }

    public void setHorizontalChainStyle(int i10, int i11) {
        f(i10).layout.horizontalChainStyle = i11;
    }

    public void setHorizontalWeight(int i10, float f6) {
        f(i10).layout.horizontalWeight = f6;
    }

    public void setIntValue(int i10, String str, int i11) {
        f(i10).c(str, ConstraintAttribute.AttributeType.INT_TYPE).setIntValue(i11);
    }

    public void setLayoutWrapBehavior(int i10, int i11) {
        if (i11 < 0 || i11 > 3) {
            return;
        }
        f(i10).layout.mWrapBehavior = i11;
    }

    public void setMargin(int i10, int i11, int i12) {
        Constraint constraintF = f(i10);
        switch (i11) {
            case 1:
                constraintF.layout.leftMargin = i12;
                return;
            case 2:
                constraintF.layout.rightMargin = i12;
                return;
            case 3:
                constraintF.layout.topMargin = i12;
                return;
            case 4:
                constraintF.layout.bottomMargin = i12;
                return;
            case 5:
                constraintF.layout.baselineMargin = i12;
                return;
            case 6:
                constraintF.layout.startMargin = i12;
                return;
            case 7:
                constraintF.layout.endMargin = i12;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void setReferencedIds(int i10, int... iArr) {
        f(i10).layout.mReferenceIds = iArr;
    }

    public void setRotation(int i10, float f6) {
        f(i10).transform.rotation = f6;
    }

    public void setRotationX(int i10, float f6) {
        f(i10).transform.rotationX = f6;
    }

    public void setRotationY(int i10, float f6) {
        f(i10).transform.rotationY = f6;
    }

    public void setScaleX(int i10, float f6) {
        f(i10).transform.scaleX = f6;
    }

    public void setScaleY(int i10, float f6) {
        f(i10).transform.scaleY = f6;
    }

    public void setStateLabels(String str) {
        this.f19760b = str.split(",");
        int i10 = 0;
        while (true) {
            String[] strArr = this.f19760b;
            if (i10 >= strArr.length) {
                return;
            }
            strArr[i10] = strArr[i10].trim();
            i10++;
        }
    }

    public void setStateLabelsList(String... strArr) {
        this.f19760b = strArr;
        int i10 = 0;
        while (true) {
            String[] strArr2 = this.f19760b;
            if (i10 >= strArr2.length) {
                return;
            }
            strArr2[i10] = strArr2[i10].trim();
            i10++;
        }
    }

    public void setStringValue(int i10, String str, String str2) {
        f(i10).c(str, ConstraintAttribute.AttributeType.STRING_TYPE).setStringValue(str2);
    }

    public void setTransformPivot(int i10, float f6, float f10) {
        Transform transform = f(i10).transform;
        transform.transformPivotY = f10;
        transform.transformPivotX = f6;
    }

    public void setTransformPivotX(int i10, float f6) {
        f(i10).transform.transformPivotX = f6;
    }

    public void setTransformPivotY(int i10, float f6) {
        f(i10).transform.transformPivotY = f6;
    }

    public void setTranslation(int i10, float f6, float f10) {
        Transform transform = f(i10).transform;
        transform.translationX = f6;
        transform.translationY = f10;
    }

    public void setTranslationX(int i10, float f6) {
        f(i10).transform.translationX = f6;
    }

    public void setTranslationY(int i10, float f6) {
        f(i10).transform.translationY = f6;
    }

    public void setTranslationZ(int i10, float f6) {
        f(i10).transform.translationZ = f6;
    }

    public void setValidateOnParse(boolean z10) {
        this.f19759a = z10;
    }

    public void setVerticalBias(int i10, float f6) {
        f(i10).layout.verticalBias = f6;
    }

    public void setVerticalChainStyle(int i10, int i11) {
        f(i10).layout.verticalChainStyle = i11;
    }

    public void setVerticalWeight(int i10, float f6) {
        f(i10).layout.verticalWeight = f6;
    }

    public void setVisibility(int i10, int i11) {
        f(i10).propertySet.visibility = i11;
    }

    public void setVisibilityMode(int i10, int i11) {
        f(i10).propertySet.mVisibilityMode = i11;
    }

    public void writeState(Writer writer, ConstraintLayout constraintLayout, int i10) throws IOException {
        String str;
        String str2;
        String str3 = "\n---------------------------------------------\n";
        writer.write("\n---------------------------------------------\n");
        int i11 = i10 & 1;
        HashMap<Integer, Constraint> map = this.f19763e;
        String str4 = ", ";
        String str5 = Constant.BRACKET_OPEN;
        if (i11 == 1) {
            b bVar = new b(this, writer, constraintLayout);
            Writer writer2 = bVar.f19786a;
            writer2.write("\n<ConstraintSet>\n");
            Iterator<Integer> it = map.keySet().iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                Constraint constraint = map.get(next);
                String strA = bVar.a(next.intValue());
                writer2.write("  <Constraint");
                writer2.write("\n       android:id=\"" + strA + "\"");
                Layout layout = constraint.layout;
                bVar.b(layout.mWidth, "android:layout_width");
                bVar.b(layout.mHeight, "android:layout_height");
                bVar.g("app:layout_constraintGuide_begin", layout.guideBegin, -1.0f);
                bVar.g("app:layout_constraintGuide_end", layout.guideEnd, -1.0f);
                bVar.g("app:layout_constraintGuide_percent", layout.guidePercent, -1.0f);
                bVar.g("app:layout_constraintHorizontal_bias", layout.horizontalBias, 0.5f);
                bVar.g("app:layout_constraintVertical_bias", layout.verticalBias, 0.5f);
                bVar.h("app:layout_constraintDimensionRatio", layout.dimensionRatio);
                bVar.i(layout.circleConstraint, "app:layout_constraintCircle");
                bVar.g("app:layout_constraintCircleRadius", layout.circleRadius, 0.0f);
                bVar.g("app:layout_constraintCircleAngle", layout.circleAngle, 0.0f);
                bVar.g("android:orientation", layout.orientation, -1.0f);
                bVar.g("app:layout_constraintVertical_weight", layout.verticalWeight, -1.0f);
                bVar.g("app:layout_constraintHorizontal_weight", layout.horizontalWeight, -1.0f);
                bVar.g("app:layout_constraintHorizontal_chainStyle", layout.horizontalChainStyle, 0.0f);
                String str6 = str5;
                bVar.g("app:layout_constraintVertical_chainStyle", layout.verticalChainStyle, 0.0f);
                Iterator<Integer> it2 = it;
                bVar.g("app:barrierDirection", layout.mBarrierDirection, -1.0f);
                String str7 = str3;
                bVar.g("app:barrierMargin", layout.mBarrierMargin, 0.0f);
                bVar.d(layout.leftMargin, 0, "app:layout_marginLeft");
                bVar.d(layout.goneLeftMargin, Integer.MIN_VALUE, "app:layout_goneMarginLeft");
                bVar.d(layout.rightMargin, 0, "app:layout_marginRight");
                bVar.d(layout.goneRightMargin, Integer.MIN_VALUE, "app:layout_goneMarginRight");
                bVar.d(layout.startMargin, 0, "app:layout_marginStart");
                bVar.d(layout.goneStartMargin, Integer.MIN_VALUE, "app:layout_goneMarginStart");
                bVar.d(layout.endMargin, 0, "app:layout_marginEnd");
                bVar.d(layout.goneEndMargin, Integer.MIN_VALUE, "app:layout_goneMarginEnd");
                bVar.d(layout.topMargin, 0, "app:layout_marginTop");
                bVar.d(layout.goneTopMargin, Integer.MIN_VALUE, "app:layout_goneMarginTop");
                bVar.d(layout.bottomMargin, 0, "app:layout_marginBottom");
                bVar.d(layout.goneBottomMargin, Integer.MIN_VALUE, "app:layout_goneMarginBottom");
                bVar.d(layout.goneBaselineMargin, Integer.MIN_VALUE, "app:goneBaselineMargin");
                bVar.d(layout.baselineMargin, 0, "app:baselineMargin");
                bVar.c("app:layout_constrainedWidth", layout.constrainedWidth, false);
                bVar.c("app:layout_constrainedHeight", layout.constrainedHeight, false);
                bVar.c("app:barrierAllowsGoneWidgets", layout.mBarrierAllowsGoneWidgets, true);
                bVar.g("app:layout_wrapBehaviorInParent", layout.mWrapBehavior, 0.0f);
                bVar.i(layout.baselineToBaseline, "app:baselineToBaseline");
                bVar.i(layout.baselineToBottom, "app:baselineToBottom");
                bVar.i(layout.baselineToTop, "app:baselineToTop");
                bVar.i(layout.bottomToBottom, "app:layout_constraintBottom_toBottomOf");
                bVar.i(layout.bottomToTop, "app:layout_constraintBottom_toTopOf");
                bVar.i(layout.endToEnd, "app:layout_constraintEnd_toEndOf");
                bVar.i(layout.endToStart, "app:layout_constraintEnd_toStartOf");
                bVar.i(layout.leftToLeft, "app:layout_constraintLeft_toLeftOf");
                bVar.i(layout.leftToRight, "app:layout_constraintLeft_toRightOf");
                bVar.i(layout.rightToLeft, "app:layout_constraintRight_toLeftOf");
                bVar.i(layout.rightToRight, "app:layout_constraintRight_toRightOf");
                bVar.i(layout.startToEnd, "app:layout_constraintStart_toEndOf");
                bVar.i(layout.startToStart, "app:layout_constraintStart_toStartOf");
                bVar.i(layout.topToBottom, "app:layout_constraintTop_toBottomOf");
                bVar.i(layout.topToTop, "app:layout_constraintTop_toTopOf");
                String[] strArr = {"spread", "wrap", "percent"};
                String str8 = str4;
                bVar.e(layout.heightDefault, 0, "app:layout_constraintHeight_default", strArr);
                bVar.g("app:layout_constraintHeight_percent", layout.heightPercent, 1.0f);
                bVar.d(layout.heightMin, 0, "app:layout_constraintHeight_min");
                bVar.d(layout.heightMax, 0, "app:layout_constraintHeight_max");
                bVar.c("android:layout_constrainedHeight", layout.constrainedHeight, false);
                bVar.e(layout.widthDefault, 0, "app:layout_constraintWidth_default", strArr);
                bVar.g("app:layout_constraintWidth_percent", layout.widthPercent, 1.0f);
                bVar.d(layout.widthMin, 0, "app:layout_constraintWidth_min");
                bVar.d(layout.widthMax, 0, "app:layout_constraintWidth_max");
                bVar.c("android:layout_constrainedWidth", layout.constrainedWidth, false);
                bVar.g("app:layout_constraintVertical_weight", layout.verticalWeight, -1.0f);
                bVar.g("app:layout_constraintHorizontal_weight", layout.horizontalWeight, -1.0f);
                bVar.f(layout.horizontalChainStyle, "app:layout_constraintHorizontal_chainStyle");
                bVar.f(layout.verticalChainStyle, "app:layout_constraintVertical_chainStyle");
                bVar.e(layout.mBarrierDirection, -1, "app:barrierDirection", new String[]{Parameters.DIRECTION.LEFT, Parameters.DIRECTION.RIGHT, "top", "bottom", EventDataKeys.Lifecycle.LIFECYCLE_START, "end"});
                bVar.h("app:layout_constraintTag", layout.mConstraintTag);
                int[] iArr = layout.mReferenceIds;
                if (iArr != null) {
                    writer2.write("\n       'ReferenceIds'");
                    writer2.write(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                    int i12 = 0;
                    while (i12 < iArr.length) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i12 == 0 ? str6 : str8);
                        sb2.append(bVar.a(iArr[i12]));
                        writer2.write(sb2.toString());
                        i12++;
                    }
                    writer2.write("],\n");
                }
                writer2.write(" />\n");
                str5 = str6;
                str4 = str8;
                it = it2;
                str3 = str7;
            }
            str = str3;
            writer2.write("</ConstraintSet>\n");
        } else {
            str = "\n---------------------------------------------\n";
            String str9 = ", ";
            a aVar = new a(this, writer, constraintLayout);
            Writer writer3 = aVar.f19782a;
            writer3.write("\n'ConstraintSet':{\n");
            for (Integer num : map.keySet()) {
                Constraint constraint2 = map.get(num);
                writer3.write(aVar.a(num.intValue()) + ":{\n");
                Layout layout2 = constraint2.layout;
                aVar.c("height", layout2.mHeight, layout2.heightDefault, layout2.heightPercent, layout2.heightMin, layout2.heightMax);
                aVar.c("width", layout2.mWidth, layout2.widthDefault, layout2.widthPercent, layout2.widthMin, layout2.widthMax);
                aVar.b(layout2.leftToLeft, layout2.leftMargin, "'left'", "'left'");
                aVar.b(layout2.leftToRight, layout2.leftMargin, "'left'", "'right'");
                aVar.b(layout2.rightToLeft, layout2.rightMargin, "'right'", "'left'");
                aVar.b(layout2.rightToRight, layout2.rightMargin, "'right'", "'right'");
                aVar.b(layout2.baselineToBaseline, -1, "'baseline'", "'baseline'");
                aVar.b(layout2.baselineToTop, -1, "'baseline'", "'top'");
                aVar.b(layout2.baselineToBottom, -1, "'baseline'", "'bottom'");
                aVar.b(layout2.topToBottom, layout2.topMargin, "'top'", "'bottom'");
                aVar.b(layout2.topToTop, layout2.topMargin, "'top'", "'top'");
                aVar.b(layout2.bottomToBottom, layout2.bottomMargin, "'bottom'", "'bottom'");
                aVar.b(layout2.bottomToTop, layout2.bottomMargin, "'bottom'", "'top'");
                aVar.b(layout2.startToStart, layout2.startMargin, "'start'", "'start'");
                aVar.b(layout2.startToEnd, layout2.startMargin, "'start'", "'end'");
                aVar.b(layout2.endToStart, layout2.endMargin, "'end'", "'start'");
                aVar.b(layout2.endToEnd, layout2.endMargin, "'end'", "'end'");
                aVar.f("'horizontalBias'", layout2.horizontalBias);
                aVar.f("'verticalBias'", layout2.verticalBias);
                int i13 = layout2.circleConstraint;
                float f6 = layout2.circleAngle;
                int i14 = layout2.circleRadius;
                if (i13 == -1) {
                    str2 = str9;
                } else {
                    writer3.write("       circle");
                    writer3.write(":[");
                    writer3.write(aVar.a(i13));
                    str2 = str9;
                    writer3.write(str2 + f6);
                    writer3.write(i14 + Constant.BRACKET_CLOSE);
                }
                int i15 = layout2.orientation;
                int i16 = layout2.guideBegin;
                int i17 = layout2.guideEnd;
                float f10 = layout2.guidePercent;
                aVar.e(i15, "'orientation'");
                aVar.e(i16, "'guideBegin'");
                aVar.e(i17, "'guideEnd'");
                aVar.d(f10, "'guidePercent'");
                aVar.g("'dimensionRatio'", layout2.dimensionRatio);
                aVar.e(layout2.mBarrierMargin, "'barrierMargin'");
                aVar.e(layout2.mHelperType, "'type'");
                aVar.g("'ReferenceId'", layout2.mReferenceIdString);
                boolean z10 = layout2.mBarrierAllowsGoneWidgets;
                if (!z10) {
                    writer3.write("       'mBarrierAllowsGoneWidgets'");
                    writer3.write(": " + z10);
                    writer3.write(",\n");
                }
                aVar.e(layout2.mWrapBehavior, "'WrapBehavior'");
                aVar.d(layout2.verticalWeight, "'verticalWeight'");
                aVar.d(layout2.horizontalWeight, "'horizontalWeight'");
                aVar.e(layout2.horizontalChainStyle, "'horizontalChainStyle'");
                aVar.e(layout2.verticalChainStyle, "'verticalChainStyle'");
                aVar.e(layout2.mBarrierDirection, "'barrierDirection'");
                int[] iArr2 = layout2.mReferenceIds;
                if (iArr2 != null) {
                    writer3.write("       'ReferenceIds'");
                    writer3.write(": ");
                    int i18 = 0;
                    while (i18 < iArr2.length) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i18 == 0 ? Constant.BRACKET_OPEN : str2);
                        sb3.append(aVar.a(iArr2[i18]));
                        writer3.write(sb3.toString());
                        i18++;
                    }
                    writer3.write("],\n");
                }
                writer3.write("}\n");
                str9 = str2;
            }
            writer3.write("}\n");
        }
        writer.write(str);
    }

    public void clear(int i10, int i11) {
        Constraint constraint;
        HashMap<Integer, Constraint> map = this.f19763e;
        if (!map.containsKey(Integer.valueOf(i10)) || (constraint = map.get(Integer.valueOf(i10))) == null) {
            return;
        }
        switch (i11) {
            case 1:
                Layout layout = constraint.layout;
                layout.leftToRight = -1;
                layout.leftToLeft = -1;
                layout.leftMargin = -1;
                layout.goneLeftMargin = Integer.MIN_VALUE;
                return;
            case 2:
                Layout layout2 = constraint.layout;
                layout2.rightToRight = -1;
                layout2.rightToLeft = -1;
                layout2.rightMargin = -1;
                layout2.goneRightMargin = Integer.MIN_VALUE;
                return;
            case 3:
                Layout layout3 = constraint.layout;
                layout3.topToBottom = -1;
                layout3.topToTop = -1;
                layout3.topMargin = 0;
                layout3.goneTopMargin = Integer.MIN_VALUE;
                return;
            case 4:
                Layout layout4 = constraint.layout;
                layout4.bottomToTop = -1;
                layout4.bottomToBottom = -1;
                layout4.bottomMargin = 0;
                layout4.goneBottomMargin = Integer.MIN_VALUE;
                return;
            case 5:
                Layout layout5 = constraint.layout;
                layout5.baselineToBaseline = -1;
                layout5.baselineToTop = -1;
                layout5.baselineToBottom = -1;
                layout5.baselineMargin = 0;
                layout5.goneBaselineMargin = Integer.MIN_VALUE;
                return;
            case 6:
                Layout layout6 = constraint.layout;
                layout6.startToEnd = -1;
                layout6.startToStart = -1;
                layout6.startMargin = 0;
                layout6.goneStartMargin = Integer.MIN_VALUE;
                return;
            case 7:
                Layout layout7 = constraint.layout;
                layout7.endToStart = -1;
                layout7.endToEnd = -1;
                layout7.endMargin = 0;
                layout7.goneEndMargin = Integer.MIN_VALUE;
                return;
            case 8:
                Layout layout8 = constraint.layout;
                layout8.circleAngle = -1.0f;
                layout8.circleRadius = -1;
                layout8.circleConstraint = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void clone(ConstraintSet constraintSet) {
        HashMap<Integer, Constraint> map = this.f19763e;
        map.clear();
        for (Integer num : constraintSet.f19763e.keySet()) {
            Constraint constraint = constraintSet.f19763e.get(num);
            if (constraint != null) {
                map.put(num, constraint.m4636clone());
            }
        }
    }

    public void centerHorizontally(int i10, int i11) {
        if (i11 == 0) {
            center(i10, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            center(i10, i11, 2, 0, i11, 1, 0, 0.5f);
        }
    }

    public void centerHorizontallyRtl(int i10, int i11) {
        if (i11 == 0) {
            center(i10, 0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            center(i10, i11, 7, 0, i11, 6, 0, 0.5f);
        }
    }

    public void centerVertically(int i10, int i11) {
        if (i11 == 0) {
            center(i10, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            center(i10, i11, 4, 0, i11, 3, 0, 0.5f);
        }
    }

    public void clone(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, Constraint> map = this.f19763e;
        map.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f19762d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new Constraint());
            }
            Constraint constraint = map.get(Integer.valueOf(id));
            if (constraint != null) {
                constraint.mCustomConstraints = ConstraintAttribute.extractAttributes(this.f19761c, childAt);
                constraint.a(id, layoutParams);
                constraint.propertySet.visibility = childAt.getVisibility();
                constraint.propertySet.alpha = childAt.getAlpha();
                constraint.transform.rotation = childAt.getRotation();
                constraint.transform.rotationX = childAt.getRotationX();
                constraint.transform.rotationY = childAt.getRotationY();
                constraint.transform.scaleX = childAt.getScaleX();
                constraint.transform.scaleY = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    Transform transform = constraint.transform;
                    transform.transformPivotX = pivotX;
                    transform.transformPivotY = pivotY;
                }
                constraint.transform.translationX = childAt.getTranslationX();
                constraint.transform.translationY = childAt.getTranslationY();
                constraint.transform.translationZ = childAt.getTranslationZ();
                Transform transform2 = constraint.transform;
                if (transform2.applyElevation) {
                    transform2.elevation = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    constraint.layout.mBarrierAllowsGoneWidgets = barrier.getAllowsGoneWidget();
                    constraint.layout.mReferenceIds = barrier.getReferencedIds();
                    constraint.layout.mBarrierDirection = barrier.getType();
                    constraint.layout.mBarrierMargin = barrier.getMargin();
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void load(Context context, XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            Constraint constraintE = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    switch (xmlPullParser.getName()) {
                        case "Constraint":
                            constraintE = e(context, Xml.asAttributeSet(xmlPullParser), false);
                            break;
                        case "ConstraintOverride":
                            constraintE = e(context, Xml.asAttributeSet(xmlPullParser), true);
                            break;
                        case "Guideline":
                            constraintE = e(context, Xml.asAttributeSet(xmlPullParser), false);
                            Layout layout = constraintE.layout;
                            layout.mIsGuideline = true;
                            layout.mApply = true;
                            break;
                        case "Barrier":
                            constraintE = e(context, Xml.asAttributeSet(xmlPullParser), false);
                            constraintE.layout.mHelperType = 1;
                            break;
                        case "PropertySet":
                            if (constraintE != null) {
                                constraintE.propertySet.a(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            } else {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            break;
                        case "Transform":
                            if (constraintE != null) {
                                constraintE.transform.a(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            } else {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            break;
                        case "Layout":
                            if (constraintE != null) {
                                constraintE.layout.a(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            } else {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            break;
                        case "Motion":
                            if (constraintE != null) {
                                constraintE.motion.a(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            } else {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            break;
                        case "CustomAttribute":
                        case "CustomMethod":
                            if (constraintE != null) {
                                ConstraintAttribute.parse(context, xmlPullParser, constraintE.mCustomConstraints);
                                break;
                            } else {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            break;
                    }
                } else if (eventType == 3) {
                    String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (lowerCase.equals("guideline")) {
                            }
                            break;
                        case -190376483:
                            if (lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (lowerCase.equals("constraintset")) {
                            }
                            break;
                    }
                    if (r4 == 0) {
                        return;
                    }
                    if (r4 == 1 || r4 == 2 || r4 == 3) {
                        this.f19763e.put(Integer.valueOf(constraintE.f19764a), constraintE);
                        constraintE = null;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public void readFallback(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f19762d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            HashMap<Integer, Constraint> map = this.f19763e;
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new Constraint());
            }
            Constraint constraint = map.get(Integer.valueOf(id));
            if (constraint != null) {
                if (!constraint.layout.mApply) {
                    constraint.a(id, layoutParams);
                    if (childAt instanceof ConstraintHelper) {
                        constraint.layout.mReferenceIds = ((ConstraintHelper) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            constraint.layout.mBarrierAllowsGoneWidgets = barrier.getAllowsGoneWidget();
                            constraint.layout.mBarrierDirection = barrier.getType();
                            constraint.layout.mBarrierMargin = barrier.getMargin();
                        }
                    }
                    constraint.layout.mApply = true;
                }
                PropertySet propertySet = constraint.propertySet;
                if (!propertySet.mApply) {
                    propertySet.visibility = childAt.getVisibility();
                    constraint.propertySet.alpha = childAt.getAlpha();
                    constraint.propertySet.mApply = true;
                }
                Transform transform = constraint.transform;
                if (!transform.mApply) {
                    transform.mApply = true;
                    transform.rotation = childAt.getRotation();
                    constraint.transform.rotationX = childAt.getRotationX();
                    constraint.transform.rotationY = childAt.getRotationY();
                    constraint.transform.scaleX = childAt.getScaleX();
                    constraint.transform.scaleY = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        Transform transform2 = constraint.transform;
                        transform2.transformPivotX = pivotX;
                        transform2.transformPivotY = pivotY;
                    }
                    constraint.transform.translationX = childAt.getTranslationX();
                    constraint.transform.translationY = childAt.getTranslationY();
                    constraint.transform.translationZ = childAt.getTranslationZ();
                    Transform transform3 = constraint.transform;
                    if (transform3.applyElevation) {
                        transform3.elevation = childAt.getElevation();
                    }
                }
            }
        }
    }

    public void clone(Constraints constraints) {
        int childCount = constraints.getChildCount();
        HashMap<Integer, Constraint> map = this.f19763e;
        map.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraints.getChildAt(i10);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f19762d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new Constraint());
            }
            Constraint constraint = map.get(Integer.valueOf(id));
            if (constraint != null) {
                if (childAt instanceof ConstraintHelper) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) childAt;
                    constraint.b(id, layoutParams);
                    if (constraintHelper instanceof Barrier) {
                        Layout layout = constraint.layout;
                        layout.mHelperType = 1;
                        Barrier barrier = (Barrier) constraintHelper;
                        layout.mBarrierDirection = barrier.getType();
                        constraint.layout.mReferenceIds = barrier.getReferencedIds();
                        constraint.layout.mBarrierMargin = barrier.getMargin();
                    }
                }
                constraint.b(id, layoutParams);
            }
        }
    }

    public void connect(int i10, int i11, int i12, int i13) {
        HashMap<Integer, Constraint> map = this.f19763e;
        if (!map.containsKey(Integer.valueOf(i10))) {
            map.put(Integer.valueOf(i10), new Constraint());
        }
        Constraint constraint = map.get(Integer.valueOf(i10));
        if (constraint == null) {
            return;
        }
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    Layout layout = constraint.layout;
                    layout.leftToLeft = i12;
                    layout.leftToRight = -1;
                    return;
                } else if (i13 == 2) {
                    Layout layout2 = constraint.layout;
                    layout2.leftToRight = i12;
                    layout2.leftToLeft = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + k(i13) + " undefined");
                }
            case 2:
                if (i13 == 1) {
                    Layout layout3 = constraint.layout;
                    layout3.rightToLeft = i12;
                    layout3.rightToRight = -1;
                    return;
                } else if (i13 == 2) {
                    Layout layout4 = constraint.layout;
                    layout4.rightToRight = i12;
                    layout4.rightToLeft = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + k(i13) + " undefined");
                }
            case 3:
                if (i13 == 3) {
                    Layout layout5 = constraint.layout;
                    layout5.topToTop = i12;
                    layout5.topToBottom = -1;
                    layout5.baselineToBaseline = -1;
                    layout5.baselineToTop = -1;
                    layout5.baselineToBottom = -1;
                    return;
                }
                if (i13 == 4) {
                    Layout layout6 = constraint.layout;
                    layout6.topToBottom = i12;
                    layout6.topToTop = -1;
                    layout6.baselineToBaseline = -1;
                    layout6.baselineToTop = -1;
                    layout6.baselineToBottom = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + k(i13) + " undefined");
            case 4:
                if (i13 == 4) {
                    Layout layout7 = constraint.layout;
                    layout7.bottomToBottom = i12;
                    layout7.bottomToTop = -1;
                    layout7.baselineToBaseline = -1;
                    layout7.baselineToTop = -1;
                    layout7.baselineToBottom = -1;
                    return;
                }
                if (i13 == 3) {
                    Layout layout8 = constraint.layout;
                    layout8.bottomToTop = i12;
                    layout8.bottomToBottom = -1;
                    layout8.baselineToBaseline = -1;
                    layout8.baselineToTop = -1;
                    layout8.baselineToBottom = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + k(i13) + " undefined");
            case 5:
                if (i13 == 5) {
                    Layout layout9 = constraint.layout;
                    layout9.baselineToBaseline = i12;
                    layout9.bottomToBottom = -1;
                    layout9.bottomToTop = -1;
                    layout9.topToTop = -1;
                    layout9.topToBottom = -1;
                    return;
                }
                if (i13 == 3) {
                    Layout layout10 = constraint.layout;
                    layout10.baselineToTop = i12;
                    layout10.bottomToBottom = -1;
                    layout10.bottomToTop = -1;
                    layout10.topToTop = -1;
                    layout10.topToBottom = -1;
                    return;
                }
                if (i13 == 4) {
                    Layout layout11 = constraint.layout;
                    layout11.baselineToBottom = i12;
                    layout11.bottomToBottom = -1;
                    layout11.bottomToTop = -1;
                    layout11.topToTop = -1;
                    layout11.topToBottom = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + k(i13) + " undefined");
            case 6:
                if (i13 == 6) {
                    Layout layout12 = constraint.layout;
                    layout12.startToStart = i12;
                    layout12.startToEnd = -1;
                    return;
                } else if (i13 == 7) {
                    Layout layout13 = constraint.layout;
                    layout13.startToEnd = i12;
                    layout13.startToStart = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + k(i13) + " undefined");
                }
            case 7:
                if (i13 == 7) {
                    Layout layout14 = constraint.layout;
                    layout14.endToEnd = i12;
                    layout14.endToStart = -1;
                    return;
                } else if (i13 == 6) {
                    Layout layout15 = constraint.layout;
                    layout15.endToStart = i12;
                    layout15.endToEnd = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + k(i13) + " undefined");
                }
            default:
                throw new IllegalArgumentException(k(i11) + " to " + k(i13) + " unknown");
        }
    }
}
