package org.junit.experimental.theories;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes13.dex */
public abstract class PotentialAssignment {

    public static class CouldNotGenerateValueException extends Exception {
        public CouldNotGenerateValueException() {
        }

        public CouldNotGenerateValueException(Throwable th2) {
            super(th2);
        }
    }

    public static class a extends PotentialAssignment {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f91819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f91820b;

        public a(Object obj, String str) {
            this.f91819a = obj;
            this.f91820b = str;
        }

        @Override // org.junit.experimental.theories.PotentialAssignment
        public final String getDescription() {
            String str;
            Object obj = this.f91819a;
            if (obj == null) {
                str = AbstractJsonLexerKt.NULL;
            } else {
                try {
                    str = String.format("\"%s\"", obj);
                } catch (Throwable th2) {
                    str = String.format("[toString() threw %s: %s]", th2.getClass().getSimpleName(), th2.getMessage());
                }
            }
            return String.format("%s <from %s>", str, this.f91820b);
        }

        @Override // org.junit.experimental.theories.PotentialAssignment
        public final Object getValue() {
            return this.f91819a;
        }

        public final String toString() {
            return String.format("[%s]", this.f91819a);
        }
    }

    public static PotentialAssignment forValue(String str, Object obj) {
        return new a(obj, str);
    }

    public abstract String getDescription() throws CouldNotGenerateValueException;

    public abstract Object getValue() throws CouldNotGenerateValueException;
}
