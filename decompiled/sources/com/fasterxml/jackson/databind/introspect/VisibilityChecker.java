package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes9.dex */
public interface VisibilityChecker<T extends VisibilityChecker<T>> {

    public static class Std implements VisibilityChecker<Std>, Serializable {
        protected static final Std DEFAULT;
        protected final JsonAutoDetect.Visibility _creatorMinLevel;
        protected final JsonAutoDetect.Visibility _fieldMinLevel;
        protected final JsonAutoDetect.Visibility _getterMinLevel;
        protected final JsonAutoDetect.Visibility _isGetterMinLevel;
        protected final JsonAutoDetect.Visibility _setterMinLevel;

        static {
            JsonAutoDetect.Visibility visibility = JsonAutoDetect.Visibility.PUBLIC_ONLY;
            JsonAutoDetect.Visibility visibility2 = JsonAutoDetect.Visibility.ANY;
            DEFAULT = new Std(visibility, visibility, visibility2, visibility2, visibility);
        }

        public Std(JsonAutoDetect jsonAutoDetect) {
            this._getterMinLevel = jsonAutoDetect.getterVisibility();
            this._isGetterMinLevel = jsonAutoDetect.isGetterVisibility();
            this._setterMinLevel = jsonAutoDetect.setterVisibility();
            this._creatorMinLevel = jsonAutoDetect.creatorVisibility();
            this._fieldMinLevel = jsonAutoDetect.fieldVisibility();
        }

        public static Std construct(JsonAutoDetect.Value value) {
            return DEFAULT.withOverrides(value);
        }

        public static Std defaultInstance() {
            return DEFAULT;
        }

        public Std _with(JsonAutoDetect.Visibility visibility, JsonAutoDetect.Visibility visibility2, JsonAutoDetect.Visibility visibility3, JsonAutoDetect.Visibility visibility4, JsonAutoDetect.Visibility visibility5) {
            return (visibility == this._getterMinLevel && visibility2 == this._isGetterMinLevel && visibility3 == this._setterMinLevel && visibility4 == this._creatorMinLevel && visibility5 == this._fieldMinLevel) ? this : new Std(visibility, visibility2, visibility3, visibility4, visibility5);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public boolean isCreatorVisible(Member member) {
            return this._creatorMinLevel.isVisible(member);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public boolean isFieldVisible(Field field) {
            return this._fieldMinLevel.isVisible(field);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public boolean isGetterVisible(Method method) {
            return this._getterMinLevel.isVisible(method);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public boolean isIsGetterVisible(Method method) {
            return this._isGetterMinLevel.isVisible(method);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public boolean isSetterVisible(Method method) {
            return this._setterMinLevel.isVisible(method);
        }

        public String toString() {
            return String.format("[Visibility: getter=%s,isGetter=%s,setter=%s,creator=%s,field=%s]", this._getterMinLevel, this._isGetterMinLevel, this._setterMinLevel, this._creatorMinLevel, this._fieldMinLevel);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public boolean isCreatorVisible(AnnotatedMember annotatedMember) {
            return isCreatorVisible(annotatedMember.getMember());
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public boolean isFieldVisible(AnnotatedField annotatedField) {
            return isFieldVisible(annotatedField.getAnnotated());
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public boolean isGetterVisible(AnnotatedMethod annotatedMethod) {
            return isGetterVisible(annotatedMethod.getAnnotated());
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public boolean isIsGetterVisible(AnnotatedMethod annotatedMethod) {
            return isIsGetterVisible(annotatedMethod.getAnnotated());
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public boolean isSetterVisible(AnnotatedMethod annotatedMethod) {
            return isSetterVisible(annotatedMethod.getAnnotated());
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public Std withCreatorVisibility(JsonAutoDetect.Visibility visibility) {
            if (visibility == JsonAutoDetect.Visibility.DEFAULT) {
                visibility = DEFAULT._creatorMinLevel;
            }
            JsonAutoDetect.Visibility visibility2 = visibility;
            return this._creatorMinLevel == visibility2 ? this : new Std(this._getterMinLevel, this._isGetterMinLevel, this._setterMinLevel, visibility2, this._fieldMinLevel);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public Std withFieldVisibility(JsonAutoDetect.Visibility visibility) {
            if (visibility == JsonAutoDetect.Visibility.DEFAULT) {
                visibility = DEFAULT._fieldMinLevel;
            }
            JsonAutoDetect.Visibility visibility2 = visibility;
            return this._fieldMinLevel == visibility2 ? this : new Std(this._getterMinLevel, this._isGetterMinLevel, this._setterMinLevel, this._creatorMinLevel, visibility2);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public Std withGetterVisibility(JsonAutoDetect.Visibility visibility) {
            if (visibility == JsonAutoDetect.Visibility.DEFAULT) {
                visibility = DEFAULT._getterMinLevel;
            }
            JsonAutoDetect.Visibility visibility2 = visibility;
            return this._getterMinLevel == visibility2 ? this : new Std(visibility2, this._isGetterMinLevel, this._setterMinLevel, this._creatorMinLevel, this._fieldMinLevel);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public Std withIsGetterVisibility(JsonAutoDetect.Visibility visibility) {
            if (visibility == JsonAutoDetect.Visibility.DEFAULT) {
                visibility = DEFAULT._isGetterMinLevel;
            }
            JsonAutoDetect.Visibility visibility2 = visibility;
            return this._isGetterMinLevel == visibility2 ? this : new Std(this._getterMinLevel, visibility2, this._setterMinLevel, this._creatorMinLevel, this._fieldMinLevel);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public Std withOverrides(JsonAutoDetect.Value value) {
            if (value == null) {
                return this;
            }
            JsonAutoDetect.Visibility visibility = this._getterMinLevel;
            JsonAutoDetect.Visibility getterVisibility = value.getGetterVisibility();
            JsonAutoDetect.Visibility visibility2 = JsonAutoDetect.Visibility.DEFAULT;
            JsonAutoDetect.Visibility visibility3 = getterVisibility == visibility2 ? visibility : getterVisibility;
            JsonAutoDetect.Visibility visibility4 = this._isGetterMinLevel;
            JsonAutoDetect.Visibility isGetterVisibility = value.getIsGetterVisibility();
            JsonAutoDetect.Visibility visibility5 = isGetterVisibility == visibility2 ? visibility4 : isGetterVisibility;
            JsonAutoDetect.Visibility visibility6 = this._setterMinLevel;
            JsonAutoDetect.Visibility setterVisibility = value.getSetterVisibility();
            JsonAutoDetect.Visibility visibility7 = setterVisibility == visibility2 ? visibility6 : setterVisibility;
            JsonAutoDetect.Visibility visibility8 = this._creatorMinLevel;
            JsonAutoDetect.Visibility creatorVisibility = value.getCreatorVisibility();
            JsonAutoDetect.Visibility visibility9 = creatorVisibility == visibility2 ? visibility8 : creatorVisibility;
            JsonAutoDetect.Visibility visibility10 = this._fieldMinLevel;
            JsonAutoDetect.Visibility fieldVisibility = value.getFieldVisibility();
            return _with(visibility3, visibility5, visibility7, visibility9, fieldVisibility == visibility2 ? visibility10 : fieldVisibility);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public Std withSetterVisibility(JsonAutoDetect.Visibility visibility) {
            if (visibility == JsonAutoDetect.Visibility.DEFAULT) {
                visibility = DEFAULT._setterMinLevel;
            }
            JsonAutoDetect.Visibility visibility2 = visibility;
            return this._setterMinLevel == visibility2 ? this : new Std(this._getterMinLevel, this._isGetterMinLevel, visibility2, this._creatorMinLevel, this._fieldMinLevel);
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public Std withVisibility(PropertyAccessor propertyAccessor, JsonAutoDetect.Visibility visibility) {
            switch (a.f43369a[propertyAccessor.ordinal()]) {
                case 1:
                    return withGetterVisibility(visibility);
                case 2:
                    return withSetterVisibility(visibility);
                case 3:
                    return withCreatorVisibility(visibility);
                case 4:
                    return withFieldVisibility(visibility);
                case 5:
                    return withIsGetterVisibility(visibility);
                case 6:
                    return with(visibility);
                default:
                    return this;
            }
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public Std with(JsonAutoDetect jsonAutoDetect) {
            if (jsonAutoDetect == null) {
                return this;
            }
            JsonAutoDetect.Visibility visibility = this._getterMinLevel;
            JsonAutoDetect.Visibility visibility2 = jsonAutoDetect.getterVisibility();
            JsonAutoDetect.Visibility visibility3 = JsonAutoDetect.Visibility.DEFAULT;
            JsonAutoDetect.Visibility visibility4 = visibility2 == visibility3 ? visibility : visibility2;
            JsonAutoDetect.Visibility visibility5 = this._isGetterMinLevel;
            JsonAutoDetect.Visibility visibilityIsGetterVisibility = jsonAutoDetect.isGetterVisibility();
            JsonAutoDetect.Visibility visibility6 = visibilityIsGetterVisibility == visibility3 ? visibility5 : visibilityIsGetterVisibility;
            JsonAutoDetect.Visibility visibility7 = this._setterMinLevel;
            JsonAutoDetect.Visibility visibility8 = jsonAutoDetect.setterVisibility();
            JsonAutoDetect.Visibility visibility9 = visibility8 == visibility3 ? visibility7 : visibility8;
            JsonAutoDetect.Visibility visibility10 = this._creatorMinLevel;
            JsonAutoDetect.Visibility visibilityCreatorVisibility = jsonAutoDetect.creatorVisibility();
            JsonAutoDetect.Visibility visibility11 = visibilityCreatorVisibility == visibility3 ? visibility10 : visibilityCreatorVisibility;
            JsonAutoDetect.Visibility visibility12 = this._fieldMinLevel;
            JsonAutoDetect.Visibility visibilityFieldVisibility = jsonAutoDetect.fieldVisibility();
            return _with(visibility4, visibility6, visibility9, visibility11, visibilityFieldVisibility == visibility3 ? visibility12 : visibilityFieldVisibility);
        }

        public Std(JsonAutoDetect.Visibility visibility, JsonAutoDetect.Visibility visibility2, JsonAutoDetect.Visibility visibility3, JsonAutoDetect.Visibility visibility4, JsonAutoDetect.Visibility visibility5) {
            this._getterMinLevel = visibility;
            this._isGetterMinLevel = visibility2;
            this._setterMinLevel = visibility3;
            this._creatorMinLevel = visibility4;
            this._fieldMinLevel = visibility5;
        }

        @Override // com.fasterxml.jackson.databind.introspect.VisibilityChecker
        public Std with(JsonAutoDetect.Visibility visibility) {
            if (visibility == JsonAutoDetect.Visibility.DEFAULT) {
                return DEFAULT;
            }
            return new Std(visibility);
        }

        public Std(JsonAutoDetect.Visibility visibility) {
            if (visibility == JsonAutoDetect.Visibility.DEFAULT) {
                Std std = DEFAULT;
                this._getterMinLevel = std._getterMinLevel;
                this._isGetterMinLevel = std._isGetterMinLevel;
                this._setterMinLevel = std._setterMinLevel;
                this._creatorMinLevel = std._creatorMinLevel;
                this._fieldMinLevel = std._fieldMinLevel;
                return;
            }
            this._getterMinLevel = visibility;
            this._isGetterMinLevel = visibility;
            this._setterMinLevel = visibility;
            this._creatorMinLevel = visibility;
            this._fieldMinLevel = visibility;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43369a;

        static {
            int[] iArr = new int[PropertyAccessor.values().length];
            f43369a = iArr;
            try {
                iArr[PropertyAccessor.GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43369a[PropertyAccessor.SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43369a[PropertyAccessor.CREATOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43369a[PropertyAccessor.FIELD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43369a[PropertyAccessor.IS_GETTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f43369a[PropertyAccessor.ALL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    boolean isCreatorVisible(AnnotatedMember annotatedMember);

    boolean isCreatorVisible(Member member);

    boolean isFieldVisible(AnnotatedField annotatedField);

    boolean isFieldVisible(Field field);

    boolean isGetterVisible(AnnotatedMethod annotatedMethod);

    boolean isGetterVisible(Method method);

    boolean isIsGetterVisible(AnnotatedMethod annotatedMethod);

    boolean isIsGetterVisible(Method method);

    boolean isSetterVisible(AnnotatedMethod annotatedMethod);

    boolean isSetterVisible(Method method);

    T with(JsonAutoDetect.Visibility visibility);

    T with(JsonAutoDetect jsonAutoDetect);

    T withCreatorVisibility(JsonAutoDetect.Visibility visibility);

    T withFieldVisibility(JsonAutoDetect.Visibility visibility);

    T withGetterVisibility(JsonAutoDetect.Visibility visibility);

    T withIsGetterVisibility(JsonAutoDetect.Visibility visibility);

    T withOverrides(JsonAutoDetect.Value value);

    T withSetterVisibility(JsonAutoDetect.Visibility visibility);

    T withVisibility(PropertyAccessor propertyAccessor, JsonAutoDetect.Visibility visibility);
}
