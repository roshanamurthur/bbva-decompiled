package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.g0;
import androidx.camera.core.processing.f;
import androidx.collection.ArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.res.TypedArrayUtils;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import h3.k;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.simpleframework.xml.strategy.Name;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class TransitionInflater {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?>[] f23690b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayMap<String, Constructor<?>> f23691c = new ArrayMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23692a;

    public TransitionInflater(@NonNull Context context) {
        this.f23692a = context;
    }

    @NonNull
    public static TransitionInflater from(@NonNull Context context) {
        return new TransitionInflater(context);
    }

    public final Object a(AttributeSet attributeSet, Class<?> cls, String str) {
        Object objNewInstance;
        Class<? extends U> clsAsSubclass;
        String attributeValue = attributeSet.getAttributeValue(null, Name.LABEL);
        if (attributeValue == null) {
            throw new InflateException(str.concat(" tag must have a 'class' attribute"));
        }
        try {
            ArrayMap<String, Constructor<?>> arrayMap = f23691c;
            synchronized (arrayMap) {
                try {
                    Constructor<?> constructor = arrayMap.get(attributeValue);
                    if (constructor == null && (clsAsSubclass = Class.forName(attributeValue, false, this.f23692a.getClassLoader()).asSubclass(cls)) != 0) {
                        constructor = clsAsSubclass.getConstructor(f23690b);
                        constructor.setAccessible(true);
                        arrayMap.put(attributeValue, constructor);
                    }
                    objNewInstance = constructor.newInstance(this.f23692a, attributeSet);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return objNewInstance;
        } catch (Exception e5) {
            throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e5);
        }
    }

    @Nullable
    public final Transition b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Transition transition) throws XmlPullParserException, IOException {
        Transition transitionSet;
        int depth = xmlResourceParser.getDepth();
        TransitionSet transitionSet2 = transition instanceof TransitionSet ? (TransitionSet) transition : null;
        loop0: while (true) {
            transitionSet = null;
            while (true) {
                int next = xmlResourceParser.next();
                if ((next == 3 && xmlResourceParser.getDepth() <= depth) || next == 1) {
                    break loop0;
                }
                int i10 = 2;
                if (next == 2) {
                    String name = xmlResourceParser.getName();
                    boolean zEquals = "fade".equals(name);
                    Context context = this.f23692a;
                    if (zEquals) {
                        transitionSet = new Fade(context, attributeSet);
                    } else if ("changeBounds".equals(name)) {
                        transitionSet = new ChangeBounds(context, attributeSet);
                    } else if ("slide".equals(name)) {
                        transitionSet = new Slide(context, attributeSet);
                    } else if ("explode".equals(name)) {
                        transitionSet = new Explode(context, attributeSet);
                    } else if ("changeImageTransform".equals(name)) {
                        transitionSet = new ChangeImageTransform(context, attributeSet);
                    } else if ("changeTransform".equals(name)) {
                        transitionSet = new ChangeTransform(context, attributeSet);
                    } else if ("changeClipBounds".equals(name)) {
                        transitionSet = new ChangeClipBounds(context, attributeSet);
                    } else if (TypedValues.TransitionType.S_AUTO_TRANSITION.equals(name)) {
                        transitionSet = new AutoTransition(context, attributeSet);
                    } else if ("changeScroll".equals(name)) {
                        transitionSet = new ChangeScroll(context, attributeSet);
                    } else if ("transitionSet".equals(name)) {
                        transitionSet = new TransitionSet(context, attributeSet);
                    } else if (ConstantsKt.TRANSITION_EXTRA_ID.equals(name)) {
                        transitionSet = (Transition) a(attributeSet, Transition.class, ConstantsKt.TRANSITION_EXTRA_ID);
                    } else if ("targets".equals(name)) {
                        int depth2 = xmlResourceParser.getDepth();
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if ((next2 == 3 && xmlResourceParser.getDepth() <= depth2) || next2 == 1) {
                                break;
                            }
                            if (next2 == i10) {
                                if (!xmlResourceParser.getName().equals("target")) {
                                    throw new RuntimeException("Unknown scene name: " + xmlResourceParser.getName());
                                }
                                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f69315a);
                                int namedResourceId = TypedArrayUtils.getNamedResourceId(typedArrayObtainStyledAttributes, xmlResourceParser, "targetId", 1, 0);
                                if (namedResourceId != 0) {
                                    transition.addTarget(namedResourceId);
                                } else {
                                    int namedResourceId2 = TypedArrayUtils.getNamedResourceId(typedArrayObtainStyledAttributes, xmlResourceParser, "excludeId", i10, 0);
                                    if (namedResourceId2 != 0) {
                                        transition.excludeTarget(namedResourceId2, true);
                                    } else {
                                        String namedString = TypedArrayUtils.getNamedString(typedArrayObtainStyledAttributes, xmlResourceParser, "targetName", 4);
                                        if (namedString != null) {
                                            transition.addTarget(namedString);
                                        } else {
                                            String namedString2 = TypedArrayUtils.getNamedString(typedArrayObtainStyledAttributes, xmlResourceParser, "excludeName", 5);
                                            if (namedString2 != null) {
                                                transition.excludeTarget(namedString2, true);
                                            } else {
                                                String namedString3 = TypedArrayUtils.getNamedString(typedArrayObtainStyledAttributes, xmlResourceParser, "excludeClass", 3);
                                                if (namedString3 != null) {
                                                    try {
                                                        transition.excludeTarget(Class.forName(namedString3), true);
                                                    } catch (ClassNotFoundException e5) {
                                                        typedArrayObtainStyledAttributes.recycle();
                                                        throw new RuntimeException(f.d("Could not create ", namedString3), e5);
                                                    }
                                                } else {
                                                    String namedString4 = TypedArrayUtils.getNamedString(typedArrayObtainStyledAttributes, xmlResourceParser, "targetClass", 0);
                                                    if (namedString4 != null) {
                                                        transition.addTarget(Class.forName(namedString4));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                typedArrayObtainStyledAttributes.recycle();
                                i10 = 2;
                            }
                        }
                    } else if ("arcMotion".equals(name)) {
                        if (transition == null) {
                            throw new RuntimeException("Invalid use of arcMotion element");
                        }
                        transition.setPathMotion(new ArcMotion(context, attributeSet));
                    } else if ("pathMotion".equals(name)) {
                        if (transition == null) {
                            throw new RuntimeException("Invalid use of pathMotion element");
                        }
                        transition.setPathMotion((PathMotion) a(attributeSet, PathMotion.class, "pathMotion"));
                    } else {
                        if (!"patternPathMotion".equals(name)) {
                            throw new RuntimeException("Unknown scene name: " + xmlResourceParser.getName());
                        }
                        if (transition == null) {
                            throw new RuntimeException("Invalid use of patternPathMotion element");
                        }
                        transition.setPathMotion(new PatternPathMotion(context, attributeSet));
                    }
                    if (transitionSet == null) {
                        continue;
                    } else {
                        if (!xmlResourceParser.isEmptyElementTag()) {
                            b(xmlResourceParser, attributeSet, transitionSet);
                        }
                        if (transitionSet2 != null) {
                            break;
                        }
                        if (transition != null) {
                            throw new InflateException("Could not add transition to another transition.");
                        }
                    }
                }
            }
            transitionSet2.addTransition(transitionSet);
        }
        return transitionSet;
    }

    @Nullable
    public final TransitionManager c(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, @NonNull ViewGroup viewGroup) throws XmlPullParserException, IOException {
        Transition transitionInflateTransition;
        int depth = xmlResourceParser.getDepth();
        TransitionManager transitionManager = null;
        while (true) {
            int next = xmlResourceParser.next();
            if ((next == 3 && xmlResourceParser.getDepth() <= depth) || next == 1) {
                break;
            }
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("transitionManager")) {
                    transitionManager = new TransitionManager();
                } else {
                    if (!name.equals(ConstantsKt.TRANSITION_EXTRA_ID) || transitionManager == null) {
                        throw new RuntimeException("Unknown scene name: " + xmlResourceParser.getName());
                    }
                    int[] iArr = k.f69316b;
                    Context context = this.f23692a;
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
                    int namedResourceId = TypedArrayUtils.getNamedResourceId(typedArrayObtainStyledAttributes, xmlResourceParser, ConstantsKt.TRANSITION_EXTRA_ID, 2, -1);
                    int namedResourceId2 = TypedArrayUtils.getNamedResourceId(typedArrayObtainStyledAttributes, xmlResourceParser, "fromScene", 0, -1);
                    Scene sceneForLayout = namedResourceId2 < 0 ? null : Scene.getSceneForLayout(viewGroup, namedResourceId2, context);
                    int namedResourceId3 = TypedArrayUtils.getNamedResourceId(typedArrayObtainStyledAttributes, xmlResourceParser, "toScene", 1, -1);
                    Scene sceneForLayout2 = namedResourceId3 < 0 ? null : Scene.getSceneForLayout(viewGroup, namedResourceId3, context);
                    if (namedResourceId >= 0 && (transitionInflateTransition = inflateTransition(namedResourceId)) != null) {
                        if (sceneForLayout2 == null) {
                            throw new RuntimeException(g0.c("No toScene for transition ID ", namedResourceId));
                        }
                        if (sceneForLayout == null) {
                            transitionManager.setTransition(sceneForLayout2, transitionInflateTransition);
                        } else {
                            transitionManager.setTransition(sceneForLayout, sceneForLayout2, transitionInflateTransition);
                        }
                    }
                    typedArrayObtainStyledAttributes.recycle();
                }
            }
        }
        return transitionManager;
    }

    @Nullable
    public Transition inflateTransition(int i10) {
        XmlResourceParser xml = this.f23692a.getResources().getXml(i10);
        try {
            try {
                Transition transitionB = b(xml, Xml.asAttributeSet(xml), null);
                xml.close();
                return transitionB;
            } catch (IOException e5) {
                throw new InflateException(xml.getPositionDescription() + ": " + e5.getMessage(), e5);
            } catch (XmlPullParserException e7) {
                throw new InflateException(e7.getMessage(), e7);
            }
        } catch (Throwable th2) {
            xml.close();
            throw th2;
        }
    }

    @Nullable
    public TransitionManager inflateTransitionManager(int i10, @NonNull ViewGroup viewGroup) {
        XmlResourceParser xml = this.f23692a.getResources().getXml(i10);
        try {
            try {
                TransitionManager transitionManagerC = c(xml, Xml.asAttributeSet(xml), viewGroup);
                xml.close();
                return transitionManagerC;
            } catch (IOException e5) {
                InflateException inflateException = new InflateException(xml.getPositionDescription() + ": " + e5.getMessage());
                inflateException.initCause(e5);
                throw inflateException;
            } catch (XmlPullParserException e7) {
                InflateException inflateException2 = new InflateException(e7.getMessage());
                inflateException2.initCause(e7);
                throw inflateException2;
            }
        } catch (Throwable th2) {
            xml.close();
            throw th2;
        }
    }
}
