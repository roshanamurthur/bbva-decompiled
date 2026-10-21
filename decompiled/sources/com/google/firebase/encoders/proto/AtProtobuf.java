package com.google.firebase.encoders.proto;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes10.dex */
public final class AtProtobuf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f48374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Protobuf.IntEncoding f48375b = Protobuf.IntEncoding.DEFAULT;

    public static final class a implements Protobuf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Protobuf.IntEncoding f48377b;

        public a(int i10, Protobuf.IntEncoding intEncoding) {
            this.f48376a = i10;
            this.f48377b = intEncoding;
        }

        @Override // java.lang.annotation.Annotation
        public final Class<? extends Annotation> annotationType() {
            return Protobuf.class;
        }

        @Override // java.lang.annotation.Annotation
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Protobuf)) {
                return false;
            }
            Protobuf protobuf = (Protobuf) obj;
            return this.f48376a == ((a) protobuf).f48376a && this.f48377b.equals(((a) protobuf).f48377b);
        }

        @Override // java.lang.annotation.Annotation
        public final int hashCode() {
            return (14552422 ^ this.f48376a) + (this.f48377b.hashCode() ^ 2041407134);
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public final Protobuf.IntEncoding intEncoding() {
            return this.f48377b;
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public final int tag() {
            return this.f48376a;
        }

        @Override // java.lang.annotation.Annotation
        public final String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f48376a + "intEncoding=" + this.f48377b + RootService.CLOSE_BRACKET;
        }
    }

    public static AtProtobuf builder() {
        return new AtProtobuf();
    }

    public Protobuf build() {
        return new a(this.f48374a, this.f48375b);
    }

    public AtProtobuf intEncoding(Protobuf.IntEncoding intEncoding) {
        this.f48375b = intEncoding;
        return this;
    }

    public AtProtobuf tag(int i10) {
        this.f48374a = i10;
        return this;
    }
}
