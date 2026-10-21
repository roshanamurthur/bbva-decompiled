package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.CodedInputStream;
import androidx.datastore.preferences.protobuf.ExtensionRegistryLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import androidx.datastore.preferences.protobuf.MessageLiteOrBuilder;
import androidx.datastore.preferences.protobuf.Parser;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class PreferencesProto {

    public static final class PreferenceMap extends GeneratedMessageLite<PreferenceMap, Builder> implements PreferenceMapOrBuilder {
        private static final PreferenceMap DEFAULT_INSTANCE;
        private static volatile Parser<PreferenceMap> PARSER = null;
        public static final int PREFERENCES_FIELD_NUMBER = 1;
        private MapFieldLite<String, Value> preferences_ = MapFieldLite.emptyMapField();

        public static final class Builder extends GeneratedMessageLite.Builder<PreferenceMap, Builder> implements PreferenceMapOrBuilder {
            public Builder() {
                super(PreferenceMap.DEFAULT_INSTANCE);
            }

            public Builder clearPreferences() {
                copyOnWrite();
                PreferenceMap.l((PreferenceMap) this.instance).clear();
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
            public boolean containsPreferences(String str) {
                str.getClass();
                return ((PreferenceMap) this.instance).getPreferencesMap().containsKey(str);
            }

            @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
            @Deprecated
            public Map<String, Value> getPreferences() {
                return getPreferencesMap();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
            public int getPreferencesCount() {
                return ((PreferenceMap) this.instance).getPreferencesMap().size();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
            public Map<String, Value> getPreferencesMap() {
                return Collections.unmodifiableMap(((PreferenceMap) this.instance).getPreferencesMap());
            }

            @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
            public Value getPreferencesOrDefault(String str, Value value) {
                str.getClass();
                Map<String, Value> preferencesMap = ((PreferenceMap) this.instance).getPreferencesMap();
                return preferencesMap.containsKey(str) ? preferencesMap.get(str) : value;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
            public Value getPreferencesOrThrow(String str) {
                str.getClass();
                Map<String, Value> preferencesMap = ((PreferenceMap) this.instance).getPreferencesMap();
                if (preferencesMap.containsKey(str)) {
                    return preferencesMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            public Builder putAllPreferences(Map<String, Value> map) {
                copyOnWrite();
                PreferenceMap.l((PreferenceMap) this.instance).putAll(map);
                return this;
            }

            public Builder putPreferences(String str, Value value) {
                str.getClass();
                value.getClass();
                copyOnWrite();
                PreferenceMap.l((PreferenceMap) this.instance).put(str, value);
                return this;
            }

            public Builder removePreferences(String str) {
                str.getClass();
                copyOnWrite();
                PreferenceMap.l((PreferenceMap) this.instance).remove(str);
                return this;
            }
        }

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final MapEntryLite<String, Value> f20770a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Value.getDefaultInstance());
        }

        static {
            PreferenceMap preferenceMap = new PreferenceMap();
            DEFAULT_INSTANCE = preferenceMap;
            GeneratedMessageLite.registerDefaultInstance(PreferenceMap.class, preferenceMap);
        }

        public static PreferenceMap getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static MapFieldLite l(PreferenceMap preferenceMap) {
            if (!preferenceMap.preferences_.isMutable()) {
                preferenceMap.preferences_ = preferenceMap.preferences_.mutableCopy();
            }
            return preferenceMap.preferences_;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PreferenceMap parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PreferenceMap) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PreferenceMap parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<PreferenceMap> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
        public boolean containsPreferences(String str) {
            str.getClass();
            return this.preferences_.containsKey(str);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.f20771a[methodToInvoke.ordinal()]) {
                case 1:
                    return new PreferenceMap();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", a.f20770a});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PreferenceMap> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (PreferenceMap.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
        @Deprecated
        public Map<String, Value> getPreferences() {
            return getPreferencesMap();
        }

        @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
        public int getPreferencesCount() {
            return this.preferences_.size();
        }

        @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
        public Map<String, Value> getPreferencesMap() {
            return Collections.unmodifiableMap(this.preferences_);
        }

        @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
        public Value getPreferencesOrDefault(String str, Value value) {
            str.getClass();
            MapFieldLite<String, Value> mapFieldLite = this.preferences_;
            return mapFieldLite.containsKey(str) ? mapFieldLite.get(str) : value;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.PreferenceMapOrBuilder
        public Value getPreferencesOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, Value> mapFieldLite = this.preferences_;
            if (mapFieldLite.containsKey(str)) {
                return mapFieldLite.get(str);
            }
            throw new IllegalArgumentException();
        }

        public static Builder newBuilder(PreferenceMap preferenceMap) {
            return DEFAULT_INSTANCE.createBuilder(preferenceMap);
        }

        public static PreferenceMap parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PreferenceMap) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PreferenceMap parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PreferenceMap parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PreferenceMap parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PreferenceMap parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PreferenceMap parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PreferenceMap parseFrom(InputStream inputStream) throws IOException {
            return (PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PreferenceMap parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PreferenceMap parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PreferenceMap parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PreferenceMap) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface PreferenceMapOrBuilder extends MessageLiteOrBuilder {
        boolean containsPreferences(String str);

        @Deprecated
        Map<String, Value> getPreferences();

        int getPreferencesCount();

        Map<String, Value> getPreferencesMap();

        Value getPreferencesOrDefault(String str, Value value);

        Value getPreferencesOrThrow(String str);
    }

    public static final class StringSet extends GeneratedMessageLite<StringSet, Builder> implements StringSetOrBuilder {
        private static final StringSet DEFAULT_INSTANCE;
        private static volatile Parser<StringSet> PARSER = null;
        public static final int STRINGS_FIELD_NUMBER = 1;
        private Internal.ProtobufList<String> strings_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder<StringSet, Builder> implements StringSetOrBuilder {
            public Builder() {
                super(StringSet.DEFAULT_INSTANCE);
            }

            public Builder addAllStrings(Iterable<String> iterable) {
                copyOnWrite();
                StringSet.n((StringSet) this.instance, iterable);
                return this;
            }

            public Builder addStrings(String str) {
                copyOnWrite();
                StringSet.m((StringSet) this.instance, str);
                return this;
            }

            public Builder addStringsBytes(ByteString byteString) {
                copyOnWrite();
                StringSet.p((StringSet) this.instance, byteString);
                return this;
            }

            public Builder clearStrings() {
                copyOnWrite();
                StringSet.o((StringSet) this.instance);
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
            public String getStrings(int i10) {
                return ((StringSet) this.instance).getStrings(i10);
            }

            @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
            public ByteString getStringsBytes(int i10) {
                return ((StringSet) this.instance).getStringsBytes(i10);
            }

            @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
            public int getStringsCount() {
                return ((StringSet) this.instance).getStringsCount();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
            public List<String> getStringsList() {
                return Collections.unmodifiableList(((StringSet) this.instance).getStringsList());
            }

            public Builder setStrings(int i10, String str) {
                copyOnWrite();
                StringSet.l((StringSet) this.instance, i10, str);
                return this;
            }
        }

        static {
            StringSet stringSet = new StringSet();
            DEFAULT_INSTANCE = stringSet;
            GeneratedMessageLite.registerDefaultInstance(StringSet.class, stringSet);
        }

        public static StringSet getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static void l(StringSet stringSet, int i10, String str) {
            stringSet.getClass();
            str.getClass();
            stringSet.q();
            stringSet.strings_.set(i10, str);
        }

        public static void m(StringSet stringSet, String str) {
            stringSet.getClass();
            str.getClass();
            stringSet.q();
            stringSet.strings_.add(str);
        }

        public static void n(StringSet stringSet, Iterable iterable) {
            stringSet.q();
            AbstractMessageLite.addAll(iterable, (List) stringSet.strings_);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static void o(StringSet stringSet) {
            stringSet.getClass();
            stringSet.strings_ = GeneratedMessageLite.emptyProtobufList();
        }

        public static void p(StringSet stringSet, ByteString byteString) {
            stringSet.getClass();
            byteString.getClass();
            stringSet.q();
            stringSet.strings_.add(byteString.toStringUtf8());
        }

        public static StringSet parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (StringSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StringSet parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StringSet> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.f20771a[methodToInvoke.ordinal()]) {
                case 1:
                    return new StringSet();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<StringSet> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (StringSet.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
        public String getStrings(int i10) {
            return this.strings_.get(i10);
        }

        @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
        public ByteString getStringsBytes(int i10) {
            return ByteString.copyFromUtf8(this.strings_.get(i10));
        }

        @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
        public int getStringsCount() {
            return this.strings_.size();
        }

        @Override // androidx.datastore.preferences.PreferencesProto.StringSetOrBuilder
        public List<String> getStringsList() {
            return this.strings_;
        }

        public final void q() {
            if (this.strings_.isModifiable()) {
                return;
            }
            this.strings_ = GeneratedMessageLite.mutableCopy(this.strings_);
        }

        public static Builder newBuilder(StringSet stringSet) {
            return DEFAULT_INSTANCE.createBuilder(stringSet);
        }

        public static StringSet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StringSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StringSet parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static StringSet parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StringSet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StringSet parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StringSet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StringSet parseFrom(InputStream inputStream) throws IOException {
            return (StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StringSet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StringSet parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StringSet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (StringSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface StringSetOrBuilder extends MessageLiteOrBuilder {
        String getStrings(int i10);

        ByteString getStringsBytes(int i10);

        int getStringsCount();

        List<String> getStringsList();
    }

    public static final class Value extends GeneratedMessageLite<Value, Builder> implements ValueOrBuilder {
        public static final int BOOLEAN_FIELD_NUMBER = 1;
        private static final Value DEFAULT_INSTANCE;
        public static final int DOUBLE_FIELD_NUMBER = 7;
        public static final int FLOAT_FIELD_NUMBER = 2;
        public static final int INTEGER_FIELD_NUMBER = 3;
        public static final int LONG_FIELD_NUMBER = 4;
        private static volatile Parser<Value> PARSER = null;
        public static final int STRING_FIELD_NUMBER = 5;
        public static final int STRING_SET_FIELD_NUMBER = 6;
        private int bitField0_;
        private int valueCase_ = 0;
        private Object value_;

        public enum ValueCase {
            BOOLEAN(1),
            FLOAT(2),
            INTEGER(3),
            LONG(4),
            STRING(5),
            STRING_SET(6),
            DOUBLE(7),
            VALUE_NOT_SET(0);

            private final int value;

            ValueCase(int i10) {
                this.value = i10;
            }

            public static ValueCase forNumber(int i10) {
                switch (i10) {
                    case 0:
                        return VALUE_NOT_SET;
                    case 1:
                        return BOOLEAN;
                    case 2:
                        return FLOAT;
                    case 3:
                        return INTEGER;
                    case 4:
                        return LONG;
                    case 5:
                        return STRING;
                    case 6:
                        return STRING_SET;
                    case 7:
                        return DOUBLE;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ValueCase valueOf(int i10) {
                return forNumber(i10);
            }
        }

        static {
            Value value = new Value();
            DEFAULT_INSTANCE = value;
            GeneratedMessageLite.registerDefaultInstance(Value.class, value);
        }

        public static void A(Value value, float f6) {
            value.valueCase_ = 2;
            value.value_ = Float.valueOf(f6);
        }

        public static void B(Value value) {
            if (value.valueCase_ == 2) {
                value.valueCase_ = 0;
                value.value_ = null;
            }
        }

        public static void C(Value value, int i10) {
            value.valueCase_ = 3;
            value.value_ = Integer.valueOf(i10);
        }

        public static Value getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static void k(Value value) {
            if (value.valueCase_ == 3) {
                value.valueCase_ = 0;
                value.value_ = null;
            }
        }

        public static void l(Value value, long j10) {
            value.valueCase_ = 4;
            value.value_ = Long.valueOf(j10);
        }

        public static void m(Value value) {
            if (value.valueCase_ == 4) {
                value.valueCase_ = 0;
                value.value_ = null;
            }
        }

        public static void n(String str, Value value) {
            value.getClass();
            str.getClass();
            value.valueCase_ = 5;
            value.value_ = str;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static void o(Value value) {
            if (value.valueCase_ == 5) {
                value.valueCase_ = 0;
                value.value_ = null;
            }
        }

        public static void p(Value value, ByteString byteString) {
            value.getClass();
            byteString.getClass();
            value.valueCase_ = 5;
            value.value_ = byteString.toStringUtf8();
        }

        public static Value parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Value parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Value> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static void q(Value value, StringSet stringSet) {
            value.getClass();
            stringSet.getClass();
            value.value_ = stringSet;
            value.valueCase_ = 6;
        }

        public static void r(Value value, StringSet.Builder builder) {
            value.getClass();
            value.value_ = builder.build();
            value.valueCase_ = 6;
        }

        public static void s(Value value, StringSet stringSet) {
            value.getClass();
            stringSet.getClass();
            if (value.valueCase_ != 6 || value.value_ == StringSet.getDefaultInstance()) {
                value.value_ = stringSet;
            } else {
                value.value_ = StringSet.newBuilder((StringSet) value.value_).mergeFrom(stringSet).buildPartial();
            }
            value.valueCase_ = 6;
        }

        public static void t(Value value) {
            if (value.valueCase_ == 6) {
                value.valueCase_ = 0;
                value.value_ = null;
            }
        }

        public static void u(Value value, double d2) {
            value.valueCase_ = 7;
            value.value_ = Double.valueOf(d2);
        }

        public static void v(Value value) {
            if (value.valueCase_ == 7) {
                value.valueCase_ = 0;
                value.value_ = null;
            }
        }

        public static void x(Value value) {
            value.valueCase_ = 0;
            value.value_ = null;
        }

        public static void y(Value value, boolean z10) {
            value.valueCase_ = 1;
            value.value_ = Boolean.valueOf(z10);
        }

        public static void z(Value value) {
            if (value.valueCase_ == 1) {
                value.valueCase_ = 0;
                value.value_ = null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.f20771a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Value();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", StringSet.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Value> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Value.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public boolean getBoolean() {
            if (this.valueCase_ == 1) {
                return ((Boolean) this.value_).booleanValue();
            }
            return false;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public double getDouble() {
            if (this.valueCase_ == 7) {
                return ((Double) this.value_).doubleValue();
            }
            return 0.0d;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public float getFloat() {
            if (this.valueCase_ == 2) {
                return ((Float) this.value_).floatValue();
            }
            return 0.0f;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public int getInteger() {
            if (this.valueCase_ == 3) {
                return ((Integer) this.value_).intValue();
            }
            return 0;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public long getLong() {
            if (this.valueCase_ == 4) {
                return ((Long) this.value_).longValue();
            }
            return 0L;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public String getString() {
            return this.valueCase_ == 5 ? (String) this.value_ : "";
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public ByteString getStringBytes() {
            return ByteString.copyFromUtf8(this.valueCase_ == 5 ? (String) this.value_ : "");
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public StringSet getStringSet() {
            return this.valueCase_ == 6 ? (StringSet) this.value_ : StringSet.getDefaultInstance();
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public ValueCase getValueCase() {
            return ValueCase.forNumber(this.valueCase_);
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public boolean hasBoolean() {
            return this.valueCase_ == 1;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public boolean hasDouble() {
            return this.valueCase_ == 7;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public boolean hasFloat() {
            return this.valueCase_ == 2;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public boolean hasInteger() {
            return this.valueCase_ == 3;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public boolean hasLong() {
            return this.valueCase_ == 4;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public boolean hasString() {
            return this.valueCase_ == 5;
        }

        @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
        public boolean hasStringSet() {
            return this.valueCase_ == 6;
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {
            public Builder() {
                super(Value.DEFAULT_INSTANCE);
            }

            public Builder clearBoolean() {
                copyOnWrite();
                Value.z((Value) this.instance);
                return this;
            }

            public Builder clearDouble() {
                copyOnWrite();
                Value.v((Value) this.instance);
                return this;
            }

            public Builder clearFloat() {
                copyOnWrite();
                Value.B((Value) this.instance);
                return this;
            }

            public Builder clearInteger() {
                copyOnWrite();
                Value.k((Value) this.instance);
                return this;
            }

            public Builder clearLong() {
                copyOnWrite();
                Value.m((Value) this.instance);
                return this;
            }

            public Builder clearString() {
                copyOnWrite();
                Value.o((Value) this.instance);
                return this;
            }

            public Builder clearStringSet() {
                copyOnWrite();
                Value.t((Value) this.instance);
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                Value.x((Value) this.instance);
                return this;
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public boolean getBoolean() {
                return ((Value) this.instance).getBoolean();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public double getDouble() {
                return ((Value) this.instance).getDouble();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public float getFloat() {
                return ((Value) this.instance).getFloat();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public int getInteger() {
                return ((Value) this.instance).getInteger();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public long getLong() {
                return ((Value) this.instance).getLong();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public String getString() {
                return ((Value) this.instance).getString();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public ByteString getStringBytes() {
                return ((Value) this.instance).getStringBytes();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public StringSet getStringSet() {
                return ((Value) this.instance).getStringSet();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public ValueCase getValueCase() {
                return ((Value) this.instance).getValueCase();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public boolean hasBoolean() {
                return ((Value) this.instance).hasBoolean();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public boolean hasDouble() {
                return ((Value) this.instance).hasDouble();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public boolean hasFloat() {
                return ((Value) this.instance).hasFloat();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public boolean hasInteger() {
                return ((Value) this.instance).hasInteger();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public boolean hasLong() {
                return ((Value) this.instance).hasLong();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public boolean hasString() {
                return ((Value) this.instance).hasString();
            }

            @Override // androidx.datastore.preferences.PreferencesProto.ValueOrBuilder
            public boolean hasStringSet() {
                return ((Value) this.instance).hasStringSet();
            }

            public Builder mergeStringSet(StringSet stringSet) {
                copyOnWrite();
                Value.s((Value) this.instance, stringSet);
                return this;
            }

            public Builder setBoolean(boolean z10) {
                copyOnWrite();
                Value.y((Value) this.instance, z10);
                return this;
            }

            public Builder setDouble(double d2) {
                copyOnWrite();
                Value.u((Value) this.instance, d2);
                return this;
            }

            public Builder setFloat(float f6) {
                copyOnWrite();
                Value.A((Value) this.instance, f6);
                return this;
            }

            public Builder setInteger(int i10) {
                copyOnWrite();
                Value.C((Value) this.instance, i10);
                return this;
            }

            public Builder setLong(long j10) {
                copyOnWrite();
                Value.l((Value) this.instance, j10);
                return this;
            }

            public Builder setString(String str) {
                copyOnWrite();
                Value.n(str, (Value) this.instance);
                return this;
            }

            public Builder setStringBytes(ByteString byteString) {
                copyOnWrite();
                Value.p((Value) this.instance, byteString);
                return this;
            }

            public Builder setStringSet(StringSet stringSet) {
                copyOnWrite();
                Value.q((Value) this.instance, stringSet);
                return this;
            }

            public Builder setStringSet(StringSet.Builder builder) {
                copyOnWrite();
                Value.r((Value) this.instance, builder);
                return this;
            }
        }

        public static Builder newBuilder(Value value) {
            return DEFAULT_INSTANCE.createBuilder(value);
        }

        public static Value parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Value parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Value parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Value parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Value parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Value parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Value parseFrom(InputStream inputStream) throws IOException {
            return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Value parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Value parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Value parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ValueOrBuilder extends MessageLiteOrBuilder {
        boolean getBoolean();

        double getDouble();

        float getFloat();

        int getInteger();

        long getLong();

        String getString();

        ByteString getStringBytes();

        StringSet getStringSet();

        Value.ValueCase getValueCase();

        boolean hasBoolean();

        boolean hasDouble();

        boolean hasFloat();

        boolean hasInteger();

        boolean hasLong();

        boolean hasString();

        boolean hasStringSet();
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20771a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f20771a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20771a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20771a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20771a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20771a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20771a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20771a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
