package com.visa;

import com.bbva.tohu.android.product.valkyria.sdk.constants.NotifyProvisionResult;
import com.visa.internal.str1;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/visa/CheckmarkTextOption;", "", "Lkotlin/reflect/KProperty1;", "Lcom/visa/internal/str1;", "", "a", "Lkotlin/reflect/KProperty1;", "getMapValue", "()Lkotlin/reflect/KProperty1;", "mapValue", "APPROVE", NotifyProvisionResult.SUCCESS_RESULT, "COMPLETE", "visa-sensory-branding_release"}, k = 1, mv = {1, 8, 0})
public enum CheckmarkTextOption {
    APPROVE(new PropertyReference1Impl() { // from class: a.v1s
        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
        public final Object get(Object obj) {
            return ((com.visa.internal.str1) obj).f68042a;
        }
    }),
    SUCCESS(new PropertyReference1Impl() { // from class: a.vsb2
        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
        public final Object get(Object obj) {
            return ((com.visa.internal.str1) obj).f68043b;
        }
    }),
    COMPLETE(new PropertyReference1Impl() { // from class: a.ama3
        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
        public final Object get(Object obj) {
            return ((com.visa.internal.str1) obj).f68044c;
        }
    });


    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final KProperty1 mapValue;

    CheckmarkTextOption(PropertyReference1Impl propertyReference1Impl) {
        this.mapValue = propertyReference1Impl;
    }

    public final KProperty1<str1, String> getMapValue() {
        return this.mapValue;
    }
}
