package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
public class StdTypeResolverBuilder implements TypeResolverBuilder<StdTypeResolverBuilder> {
    protected TypeIdResolver _customIdResolver;
    protected Class<?> _defaultImpl;
    protected JsonTypeInfo.Id _idType;
    protected JsonTypeInfo.As _includeAs;
    protected boolean _typeIdVisible = false;
    protected String _typeProperty;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f43376b;

        static {
            int[] iArr = new int[JsonTypeInfo.Id.values().length];
            f43376b = iArr;
            try {
                iArr[JsonTypeInfo.Id.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43376b[JsonTypeInfo.Id.MINIMAL_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43376b[JsonTypeInfo.Id.NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43376b[JsonTypeInfo.Id.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43376b[JsonTypeInfo.Id.CUSTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[JsonTypeInfo.As.values().length];
            f43375a = iArr2;
            try {
                iArr2[JsonTypeInfo.As.WRAPPER_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f43375a[JsonTypeInfo.As.PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f43375a[JsonTypeInfo.As.WRAPPER_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f43375a[JsonTypeInfo.As.EXTERNAL_PROPERTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f43375a[JsonTypeInfo.As.EXISTING_PROPERTY.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public StdTypeResolverBuilder() {
    }

    public static StdTypeResolverBuilder noTypeInfoBuilder() {
        return new StdTypeResolverBuilder().init(JsonTypeInfo.Id.NONE, (TypeIdResolver) null);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public TypeDeserializer buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection) {
        if (this._idType == JsonTypeInfo.Id.NONE || javaType.isPrimitive()) {
            return null;
        }
        TypeIdResolver typeIdResolverIdResolver = idResolver(deserializationConfig, javaType, collection, false, true);
        JavaType javaTypeDefineDefaultImpl = defineDefaultImpl(deserializationConfig, javaType);
        int i10 = a.f43375a[this._includeAs.ordinal()];
        if (i10 == 1) {
            return new AsArrayTypeDeserializer(javaType, typeIdResolverIdResolver, this._typeProperty, this._typeIdVisible, javaTypeDefineDefaultImpl);
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return new AsWrapperTypeDeserializer(javaType, typeIdResolverIdResolver, this._typeProperty, this._typeIdVisible, javaTypeDefineDefaultImpl);
            }
            if (i10 == 4) {
                return new AsExternalTypeDeserializer(javaType, typeIdResolverIdResolver, this._typeProperty, this._typeIdVisible, javaTypeDefineDefaultImpl);
            }
            if (i10 != 5) {
                throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this._includeAs);
            }
        }
        return new AsPropertyTypeDeserializer(javaType, typeIdResolverIdResolver, this._typeProperty, this._typeIdVisible, javaTypeDefineDefaultImpl, this._includeAs);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public TypeSerializer buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection) {
        if (this._idType == JsonTypeInfo.Id.NONE || javaType.isPrimitive()) {
            return null;
        }
        TypeIdResolver typeIdResolverIdResolver = idResolver(serializationConfig, javaType, collection, true, false);
        int i10 = a.f43375a[this._includeAs.ordinal()];
        if (i10 == 1) {
            return new AsArrayTypeSerializer(typeIdResolverIdResolver, null);
        }
        if (i10 == 2) {
            return new AsPropertyTypeSerializer(typeIdResolverIdResolver, null, this._typeProperty);
        }
        if (i10 == 3) {
            return new AsWrapperTypeSerializer(typeIdResolverIdResolver, null);
        }
        if (i10 == 4) {
            return new AsExternalTypeSerializer(typeIdResolverIdResolver, null, this._typeProperty);
        }
        if (i10 == 5) {
            return new AsExistingPropertyTypeSerializer(typeIdResolverIdResolver, null, this._typeProperty);
        }
        throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this._includeAs);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public /* bridge */ /* synthetic */ TypeResolverBuilder defaultImpl(Class cls) {
        return defaultImpl((Class<?>) cls);
    }

    public JavaType defineDefaultImpl(DeserializationConfig deserializationConfig, JavaType javaType) {
        Class<?> cls = this._defaultImpl;
        if (cls == null) {
            if (deserializationConfig.isEnabled(MapperFeature.USE_BASE_TYPE_AS_DEFAULT_IMPL) && !javaType.isAbstract()) {
                return javaType;
            }
        } else {
            if (cls == Void.class || cls == NoClass.class) {
                return deserializationConfig.getTypeFactory().constructType(this._defaultImpl);
            }
            if (javaType.hasRawClass(cls)) {
                return javaType;
            }
            if (javaType.isTypeOrSuperTypeOf(this._defaultImpl)) {
                return deserializationConfig.getTypeFactory().constructSpecializedType(javaType, this._defaultImpl);
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public Class<?> getDefaultImpl() {
        return this._defaultImpl;
    }

    public String getTypeProperty() {
        return this._typeProperty;
    }

    public TypeIdResolver idResolver(MapperConfig<?> mapperConfig, JavaType javaType, Collection<NamedType> collection, boolean z10, boolean z11) {
        TypeIdResolver typeIdResolver = this._customIdResolver;
        if (typeIdResolver != null) {
            return typeIdResolver;
        }
        JsonTypeInfo.Id id = this._idType;
        if (id == null) {
            throw new IllegalStateException("Cannot build, 'init()' not yet called");
        }
        int i10 = a.f43376b[id.ordinal()];
        if (i10 == 1) {
            return new ClassNameIdResolver(javaType, mapperConfig.getTypeFactory());
        }
        if (i10 == 2) {
            return new MinimalClassNameIdResolver(javaType, mapperConfig.getTypeFactory());
        }
        if (i10 == 3) {
            return TypeNameIdResolver.construct(mapperConfig, javaType, collection, z10, z11);
        }
        if (i10 == 4) {
            return null;
        }
        throw new IllegalStateException("Do not know how to construct standard type id resolver for idType: " + this._idType);
    }

    public boolean isTypeIdVisible() {
        return this._typeIdVisible;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public StdTypeResolverBuilder defaultImpl(Class<?> cls) {
        this._defaultImpl = cls;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public StdTypeResolverBuilder inclusion(JsonTypeInfo.As as) {
        if (as == null) {
            throw new IllegalArgumentException("includeAs cannot be null");
        }
        this._includeAs = as;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public StdTypeResolverBuilder init(JsonTypeInfo.Id id, TypeIdResolver typeIdResolver) {
        if (id == null) {
            throw new IllegalArgumentException("idType cannot be null");
        }
        this._idType = id;
        this._customIdResolver = typeIdResolver;
        this._typeProperty = id.getDefaultPropertyName();
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public StdTypeResolverBuilder typeIdVisibility(boolean z10) {
        this._typeIdVisible = z10;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public StdTypeResolverBuilder typeProperty(String str) {
        if (str == null || str.length() == 0) {
            str = this._idType.getDefaultPropertyName();
        }
        this._typeProperty = str;
        return this;
    }

    public StdTypeResolverBuilder(JsonTypeInfo.Id id, JsonTypeInfo.As as, String str) {
        this._idType = id;
        this._includeAs = as;
        this._typeProperty = str;
    }
}
