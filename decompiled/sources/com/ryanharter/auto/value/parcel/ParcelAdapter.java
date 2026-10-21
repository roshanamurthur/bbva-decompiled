package com.ryanharter.auto.value.parcel;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes11.dex */
@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.SOURCE)
public @interface ParcelAdapter {
    Class<? extends TypeAdapter<?>> value();
}
