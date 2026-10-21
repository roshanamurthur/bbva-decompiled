package com.adobe.marketing.mobile.services.ui;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class AEPMessageSettings implements MessageSettings {
    private final String backdropColor;
    private final float backdropOpacity;
    private final float cornerRadius;
    private final MessageSettings.MessageAnimation dismissAnimation;
    private final MessageSettings.MessageAnimation displayAnimation;
    private final Map<MessageSettings.MessageGesture, String> gestures;
    private final int height;
    private final MessageSettings.MessageAlignment horizontalAlign;
    private final int horizontalInset;
    private final Object parent;
    private final boolean uiTakeover;
    private final MessageSettings.MessageAlignment verticalAlign;
    private final int verticalInset;
    private final int width;

    public static class Builder implements MessageSettings.MessageSettingsBuilder {
        private String backdropColor;
        private float backdropOpacity;
        private float cornerRadius;
        private MessageSettings.MessageAnimation dismissAnimation;
        private MessageSettings.MessageAnimation displayAnimation;
        private Map<MessageSettings.MessageGesture, String> gestures;
        private int height;
        private MessageSettings.MessageAlignment horizontalAlign;
        private int horizontalInset;
        private final Object parent;
        private boolean uiTakeover;
        private MessageSettings.MessageAlignment verticalAlign;
        private int verticalInset;
        private int width;

        public Builder(Object obj) {
            this.parent = obj;
        }

        @Override // com.adobe.marketing.mobile.services.ui.MessageSettings.MessageSettingsBuilder
        public /* bridge */ /* synthetic */ MessageSettings.MessageSettingsBuilder setGestures(Map map) {
            return setGestures((Map<MessageSettings.MessageGesture, String>) map);
        }

        @Override // com.adobe.marketing.mobile.services.ui.MessageSettings.MessageSettingsBuilder
        public AEPMessageSettings build() {
            return new AEPMessageSettings(this);
        }

        @Override // com.adobe.marketing.mobile.services.ui.MessageSettings.MessageSettingsBuilder
        public Builder setBackdropColor(String str) {
            this.backdropColor = str;
            return this;
        }

        @Override // com.adobe.marketing.mobile.services.ui.MessageSettings.MessageSettingsBuilder
        public Builder setBackdropOpacity(float f6) {
            this.backdropOpacity = f6;
            return this;
        }

        @Override // com.adobe.marketing.mobile.services.ui.MessageSettings.MessageSettingsBuilder
        public Builder setCornerRadius(float f6) {
            this.cornerRadius = f6;
            return this;
        }

        @Override // com.adobe.marketing.mobile.services.ui.MessageSettings.MessageSettingsBuilder
        public Builder setDismissAnimation(MessageSettings.MessageAnimation messageAnimation) {
            this.dismissAnimation = messageAnimation;
            return this;
        }

        @Override // com.adobe.marketing.mobile.services.ui.MessageSettings.MessageSettingsBuilder
        public Builder setDisplayAnimation(MessageSettings.MessageAnimation messageAnimation) {
            this.displayAnimation = messageAnimation;
            return this;
        }

        @Override // com.adobe.marketing.mobile.services.ui.MessageSettings.MessageSettingsBuilder
        public Builder setGestures(Map<MessageSettings.MessageGesture, String> map) {
            this.gestures = map;
            return this;
        }

        @Override // com.adobe.marketing.mobile.services.ui.MessageSettings.MessageSettingsBuilder
        public Builder setHeight(int i10) {
            this.height = i10;
            return this;
        }

        @Override // com.adobe.marketing.mobile.services.ui.MessageSettings.MessageSettingsBuilder
        public Builder setHorizontalAlign(MessageSettings.MessageAlignment messageAlignment) {
            this.horizontalAlign = messageAlignment;
            return this;
        }

        @Override // com.adobe.marketing.mobile.services.ui.MessageSettings.MessageSettingsBuilder
        public Builder setHorizontalInset(int i10) {
            this.horizontalInset = i10;
            return this;
        }

        @Override // com.adobe.marketing.mobile.services.ui.MessageSettings.MessageSettingsBuilder
        public Builder setUiTakeover(boolean z10) {
            this.uiTakeover = z10;
            return this;
        }

        @Override // com.adobe.marketing.mobile.services.ui.MessageSettings.MessageSettingsBuilder
        public Builder setVerticalAlign(MessageSettings.MessageAlignment messageAlignment) {
            this.verticalAlign = messageAlignment;
            return this;
        }

        @Override // com.adobe.marketing.mobile.services.ui.MessageSettings.MessageSettingsBuilder
        public Builder setVerticalInset(int i10) {
            this.verticalInset = i10;
            return this;
        }

        @Override // com.adobe.marketing.mobile.services.ui.MessageSettings.MessageSettingsBuilder
        public Builder setWidth(int i10) {
            this.width = i10;
            return this;
        }
    }

    @Override // com.adobe.marketing.mobile.services.ui.MessageSettings
    public String getBackdropColor() {
        return this.backdropColor;
    }

    @Override // com.adobe.marketing.mobile.services.ui.MessageSettings
    public float getBackdropOpacity() {
        return this.backdropOpacity;
    }

    @Override // com.adobe.marketing.mobile.services.ui.MessageSettings
    public float getCornerRadius() {
        return this.cornerRadius;
    }

    @Override // com.adobe.marketing.mobile.services.ui.MessageSettings
    public MessageSettings.MessageAnimation getDismissAnimation() {
        return this.dismissAnimation;
    }

    @Override // com.adobe.marketing.mobile.services.ui.MessageSettings
    public MessageSettings.MessageAnimation getDisplayAnimation() {
        return this.displayAnimation;
    }

    @Override // com.adobe.marketing.mobile.services.ui.MessageSettings
    public Map<MessageSettings.MessageGesture, String> getGestures() {
        return this.gestures;
    }

    @Override // com.adobe.marketing.mobile.services.ui.MessageSettings
    public int getHeight() {
        return this.height;
    }

    @Override // com.adobe.marketing.mobile.services.ui.MessageSettings
    public MessageSettings.MessageAlignment getHorizontalAlign() {
        return this.horizontalAlign;
    }

    @Override // com.adobe.marketing.mobile.services.ui.MessageSettings
    public int getHorizontalInset() {
        return this.horizontalInset;
    }

    @Override // com.adobe.marketing.mobile.services.ui.MessageSettings
    public Object getParent() {
        return this.parent;
    }

    @Override // com.adobe.marketing.mobile.services.ui.MessageSettings
    public boolean getUITakeover() {
        return this.uiTakeover;
    }

    @Override // com.adobe.marketing.mobile.services.ui.MessageSettings
    public MessageSettings.MessageAlignment getVerticalAlign() {
        return this.verticalAlign;
    }

    @Override // com.adobe.marketing.mobile.services.ui.MessageSettings
    public int getVerticalInset() {
        return this.verticalInset;
    }

    @Override // com.adobe.marketing.mobile.services.ui.MessageSettings
    public int getWidth() {
        return this.width;
    }

    private AEPMessageSettings(Builder builder) {
        this.parent = builder.parent;
        this.width = builder.width;
        this.height = builder.height;
        this.verticalAlign = builder.verticalAlign;
        this.horizontalAlign = builder.horizontalAlign;
        this.verticalInset = builder.verticalInset;
        this.horizontalInset = builder.horizontalInset;
        this.uiTakeover = builder.uiTakeover;
        this.displayAnimation = builder.displayAnimation;
        this.dismissAnimation = builder.dismissAnimation;
        this.backdropColor = builder.backdropColor;
        this.backdropOpacity = builder.backdropOpacity;
        this.cornerRadius = builder.cornerRadius;
        this.gestures = builder.gestures;
    }
}
