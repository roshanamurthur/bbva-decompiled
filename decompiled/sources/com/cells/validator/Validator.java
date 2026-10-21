package com.cells.validator;

import com.cells.validator.rules.Rule;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class Validator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f39213a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f39214b;

    public static class Builder<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Validator<T> f39215a = new Validator<>();

        public Builder<T> addRule(Rule<T> rule) {
            this.f39215a.f39213a.add(rule);
            return this;
        }

        public Validator build() {
            return this.f39215a;
        }

        public Builder<T> setValue(T t10) {
            this.f39215a.f39214b = t10;
            return this;
        }
    }

    public Validator() {
    }

    public void addRule(Rule<T> rule) {
        this.f39213a.add(rule);
    }

    public boolean validate() {
        Iterator it = this.f39213a.iterator();
        while (it.hasNext()) {
            if (!((Rule) it.next()).isValid(this.f39214b)) {
                return false;
            }
        }
        return true;
    }

    public Validator(T t10) {
        this.f39214b = t10;
    }
}
