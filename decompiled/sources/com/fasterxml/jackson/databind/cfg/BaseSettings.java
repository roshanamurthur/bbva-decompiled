package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes9.dex */
public final class BaseSettings implements Serializable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final TimeZone f43184p0 = TimeZone.getTimeZone("UTC");
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final ClassIntrospector _classIntrospector;
    protected final DateFormat _dateFormat;
    protected final Base64Variant _defaultBase64;
    protected final HandlerInstantiator _handlerInstantiator;
    protected final Locale _locale;
    protected final PropertyNamingStrategy _propertyNamingStrategy;
    protected final TimeZone _timeZone;
    protected final TypeFactory _typeFactory;
    protected final TypeResolverBuilder<?> _typeResolverBuilder;

    public BaseSettings(ClassIntrospector classIntrospector, AnnotationIntrospector annotationIntrospector, PropertyNamingStrategy propertyNamingStrategy, TypeFactory typeFactory, TypeResolverBuilder<?> typeResolverBuilder, DateFormat dateFormat, HandlerInstantiator handlerInstantiator, Locale locale, TimeZone timeZone, Base64Variant base64Variant) {
        this._classIntrospector = classIntrospector;
        this._annotationIntrospector = annotationIntrospector;
        this._propertyNamingStrategy = propertyNamingStrategy;
        this._typeFactory = typeFactory;
        this._typeResolverBuilder = typeResolverBuilder;
        this._dateFormat = dateFormat;
        this._handlerInstantiator = handlerInstantiator;
        this._locale = locale;
        this._timeZone = timeZone;
        this._defaultBase64 = base64Variant;
    }

    public BaseSettings copy() {
        return new BaseSettings(this._classIntrospector.copy(), this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator, this._locale, this._timeZone, this._defaultBase64);
    }

    public AnnotationIntrospector getAnnotationIntrospector() {
        return this._annotationIntrospector;
    }

    public Base64Variant getBase64Variant() {
        return this._defaultBase64;
    }

    public ClassIntrospector getClassIntrospector() {
        return this._classIntrospector;
    }

    public DateFormat getDateFormat() {
        return this._dateFormat;
    }

    public HandlerInstantiator getHandlerInstantiator() {
        return this._handlerInstantiator;
    }

    public Locale getLocale() {
        return this._locale;
    }

    public PropertyNamingStrategy getPropertyNamingStrategy() {
        return this._propertyNamingStrategy;
    }

    public TimeZone getTimeZone() {
        TimeZone timeZone = this._timeZone;
        return timeZone == null ? f43184p0 : timeZone;
    }

    public TypeFactory getTypeFactory() {
        return this._typeFactory;
    }

    public TypeResolverBuilder<?> getTypeResolverBuilder() {
        return this._typeResolverBuilder;
    }

    public boolean hasExplicitTimeZone() {
        return this._timeZone != null;
    }

    public BaseSettings with(Locale locale) {
        return this._locale == locale ? this : new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator, locale, this._timeZone, this._defaultBase64);
    }

    public BaseSettings withAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        return this._annotationIntrospector == annotationIntrospector ? this : new BaseSettings(this._classIntrospector, annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator, this._locale, this._timeZone, this._defaultBase64);
    }

    public BaseSettings withAppendedAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        return withAnnotationIntrospector(AnnotationIntrospectorPair.create(this._annotationIntrospector, annotationIntrospector));
    }

    public BaseSettings withClassIntrospector(ClassIntrospector classIntrospector) {
        return this._classIntrospector == classIntrospector ? this : new BaseSettings(classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator, this._locale, this._timeZone, this._defaultBase64);
    }

    public BaseSettings withDateFormat(DateFormat dateFormat) {
        if (this._dateFormat == dateFormat) {
            return this;
        }
        if (dateFormat != null && hasExplicitTimeZone()) {
            TimeZone timeZone = this._timeZone;
            if (dateFormat instanceof StdDateFormat) {
                dateFormat = ((StdDateFormat) dateFormat).withTimeZone(timeZone);
            } else {
                dateFormat = (DateFormat) dateFormat.clone();
                dateFormat.setTimeZone(timeZone);
            }
        }
        return new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, dateFormat, this._handlerInstantiator, this._locale, this._timeZone, this._defaultBase64);
    }

    public BaseSettings withHandlerInstantiator(HandlerInstantiator handlerInstantiator) {
        return this._handlerInstantiator == handlerInstantiator ? this : new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, handlerInstantiator, this._locale, this._timeZone, this._defaultBase64);
    }

    public BaseSettings withInsertedAnnotationIntrospector(AnnotationIntrospector annotationIntrospector) {
        return withAnnotationIntrospector(AnnotationIntrospectorPair.create(annotationIntrospector, this._annotationIntrospector));
    }

    public BaseSettings withPropertyNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
        return this._propertyNamingStrategy == propertyNamingStrategy ? this : new BaseSettings(this._classIntrospector, this._annotationIntrospector, propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator, this._locale, this._timeZone, this._defaultBase64);
    }

    public BaseSettings withTypeFactory(TypeFactory typeFactory) {
        return this._typeFactory == typeFactory ? this : new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator, this._locale, this._timeZone, this._defaultBase64);
    }

    public BaseSettings withTypeResolverBuilder(TypeResolverBuilder<?> typeResolverBuilder) {
        return this._typeResolverBuilder == typeResolverBuilder ? this : new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, typeResolverBuilder, this._dateFormat, this._handlerInstantiator, this._locale, this._timeZone, this._defaultBase64);
    }

    public BaseSettings with(TimeZone timeZone) {
        DateFormat dateFormatWithTimeZone;
        if (timeZone != null) {
            if (timeZone == this._timeZone) {
                return this;
            }
            DateFormat dateFormat = this._dateFormat;
            if (dateFormat instanceof StdDateFormat) {
                dateFormatWithTimeZone = ((StdDateFormat) dateFormat).withTimeZone(timeZone);
            } else {
                dateFormatWithTimeZone = (DateFormat) dateFormat.clone();
                dateFormatWithTimeZone.setTimeZone(timeZone);
            }
            return new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, dateFormatWithTimeZone, this._handlerInstantiator, this._locale, timeZone, this._defaultBase64);
        }
        throw new IllegalArgumentException();
    }

    public BaseSettings with(Base64Variant base64Variant) {
        return base64Variant == this._defaultBase64 ? this : new BaseSettings(this._classIntrospector, this._annotationIntrospector, this._propertyNamingStrategy, this._typeFactory, this._typeResolverBuilder, this._dateFormat, this._handlerInstantiator, this._locale, this._timeZone, base64Variant);
    }
}
