package com.adobe.marketing.mobile.services.ui;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface MessageSettings {

    public enum MessageAlignment {
        CENTER,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM
    }

    public enum MessageAnimation {
        NONE,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        CENTER,
        FADE
    }

    public enum MessageGesture {
        SWIPE_UP("swipeUp"),
        SWIPE_DOWN("swipeDown"),
        SWIPE_LEFT("swipeLeft"),
        SWIPE_RIGHT("swipeRight"),
        BACKGROUND_TAP("backgroundTap");

        private static final Map<String, MessageGesture> gestureStringToGestureEnumMap;
        private String name;

        static {
            HashMap map = new HashMap();
            for (MessageGesture messageGesture : values()) {
                map.put(messageGesture.toString(), messageGesture);
            }
            gestureStringToGestureEnumMap = Collections.unmodifiableMap(map);
        }

        MessageGesture(String str) {
            this.name = str;
        }

        public static MessageGesture get(String str) {
            return gestureStringToGestureEnumMap.get(str);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }
    }

    public interface MessageSettingsBuilder {
        MessageSettings build();

        MessageSettingsBuilder setBackdropColor(String str);

        MessageSettingsBuilder setBackdropOpacity(float f6);

        MessageSettingsBuilder setCornerRadius(float f6);

        MessageSettingsBuilder setDismissAnimation(MessageAnimation messageAnimation);

        MessageSettingsBuilder setDisplayAnimation(MessageAnimation messageAnimation);

        MessageSettingsBuilder setGestures(Map<MessageGesture, String> map);

        MessageSettingsBuilder setHeight(int i10);

        MessageSettingsBuilder setHorizontalAlign(MessageAlignment messageAlignment);

        MessageSettingsBuilder setHorizontalInset(int i10);

        MessageSettingsBuilder setUiTakeover(boolean z10);

        MessageSettingsBuilder setVerticalAlign(MessageAlignment messageAlignment);

        MessageSettingsBuilder setVerticalInset(int i10);

        MessageSettingsBuilder setWidth(int i10);
    }

    String getBackdropColor();

    float getBackdropOpacity();

    float getCornerRadius();

    MessageAnimation getDismissAnimation();

    MessageAnimation getDisplayAnimation();

    Map<MessageGesture, String> getGestures();

    int getHeight();

    MessageAlignment getHorizontalAlign();

    int getHorizontalInset();

    Object getParent();

    boolean getUITakeover();

    MessageAlignment getVerticalAlign();

    int getVerticalInset();

    int getWidth();
}
