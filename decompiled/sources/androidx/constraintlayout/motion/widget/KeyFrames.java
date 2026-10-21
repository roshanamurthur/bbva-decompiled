package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Xml;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class KeyFrames {
    public static final int UNSET = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap<String, Constructor<? extends Key>> f19338b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<Integer, ArrayList<Key>> f19339a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends Key>> map = new HashMap<>();
        f19338b = map;
        try {
            map.put("KeyAttribute", KeyAttributes.class.getConstructor(new Class[0]));
            map.put(TypedValues.PositionType.NAME, KeyPosition.class.getConstructor(new Class[0]));
            map.put(TypedValues.CycleType.NAME, KeyCycle.class.getConstructor(new Class[0]));
            map.put("KeyTimeCycle", KeyTimeCycle.class.getConstructor(new Class[0]));
            map.put(TypedValues.TriggerType.NAME, KeyTrigger.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException unused) {
        }
    }

    public KeyFrames() {
    }

    public void addAllFrames(MotionController motionController) {
        ArrayList<Key> arrayList = this.f19339a.get(-1);
        if (arrayList != null) {
            motionController.f19409w.addAll(arrayList);
        }
    }

    public void addFrames(MotionController motionController) {
        HashMap<Integer, ArrayList<Key>> map = this.f19339a;
        ArrayList<Key> arrayList = map.get(Integer.valueOf(motionController.f19390c));
        if (arrayList != null) {
            motionController.f19409w.addAll(arrayList);
        }
        ArrayList<Key> arrayList2 = map.get(-1);
        if (arrayList2 != null) {
            for (Key key : arrayList2) {
                String str = ((ConstraintLayout.LayoutParams) motionController.f19389b.getLayoutParams()).constraintTag;
                String str2 = key.f19302c;
                if (str2 != null && str != null && str.matches(str2)) {
                    motionController.addKey(key);
                }
            }
        }
    }

    public void addKey(Key key) {
        Integer numValueOf = Integer.valueOf(key.f19301b);
        HashMap<Integer, ArrayList<Key>> map = this.f19339a;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(key.f19301b), new ArrayList<>());
        }
        ArrayList<Key> arrayList = map.get(Integer.valueOf(key.f19301b));
        if (arrayList != null) {
            arrayList.add(key);
        }
    }

    public ArrayList<Key> getKeyFramesForView(int i10) {
        return this.f19339a.get(Integer.valueOf(i10));
    }

    public Set<Integer> getKeys() {
        return this.f19339a.keySet();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public KeyFrames(Context context, XmlPullParser xmlPullParser) {
        HashMap<String, ConstraintAttribute> map;
        HashMap<String, ConstraintAttribute> map2;
        byte b10;
        Key keyAttributes;
        try {
            int eventType = xmlPullParser.getEventType();
            Key key = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && ViewTransition.KEY_FRAME_SET_TAG.equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    if (f19338b.containsKey(name)) {
                        switch (name.hashCode()) {
                            case -300573030:
                                if (!name.equals("KeyTimeCycle")) {
                                    b10 = -1;
                                } else {
                                    b10 = 3;
                                }
                                break;
                            case -298435811:
                                if (!name.equals("KeyAttribute")) {
                                    b10 = -1;
                                } else {
                                    b10 = 0;
                                }
                                break;
                            case 540053991:
                                if (!name.equals(TypedValues.CycleType.NAME)) {
                                    b10 = -1;
                                } else {
                                    b10 = 2;
                                }
                                break;
                            case 1153397896:
                                if (!name.equals(TypedValues.PositionType.NAME)) {
                                    b10 = -1;
                                } else {
                                    b10 = 1;
                                }
                                break;
                            case 1308496505:
                                if (!name.equals(TypedValues.TriggerType.NAME)) {
                                    b10 = -1;
                                } else {
                                    b10 = 4;
                                }
                                break;
                            default:
                                b10 = -1;
                                break;
                        }
                        if (b10 == 0) {
                            keyAttributes = new KeyAttributes();
                        } else if (b10 == 1) {
                            keyAttributes = new KeyPosition();
                        } else if (b10 == 2) {
                            keyAttributes = new KeyCycle();
                        } else if (b10 == 3) {
                            keyAttributes = new KeyTimeCycle();
                        } else if (b10 == 4) {
                            keyAttributes = new KeyTrigger();
                        } else {
                            throw new NullPointerException("Key " + name + " not found");
                        }
                        keyAttributes.load(context, Xml.asAttributeSet(xmlPullParser));
                        addKey(keyAttributes);
                        key = keyAttributes;
                    } else if (name.equalsIgnoreCase(ViewTransition.CUSTOM_ATTRIBUTE)) {
                        if (key != null && (map2 = key.f19303d) != null) {
                            ConstraintAttribute.parse(context, xmlPullParser, map2);
                        }
                    } else if (name.equalsIgnoreCase(ViewTransition.CUSTOM_METHOD) && key != null && (map = key.f19303d) != null) {
                        ConstraintAttribute.parse(context, xmlPullParser, map);
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }
}
