package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.KryoSerializable;
import com.esotericsoftware.kryo.Registration;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.util.Util;
import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.Date;
import java.util.EnumSet;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes9.dex */
public class DefaultSerializers {

    public static class ArraysAsListSerializer extends CollectionSerializer<List> {
        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
        public List create(Kryo kryo, Input input, Class cls, int i10) {
            return new ArrayList(i10);
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
        public List copy(Kryo kryo, List list) {
            Object[] objArr = new Object[list.size()];
            List listAsList = Arrays.asList(objArr);
            kryo.reference(listAsList);
            for (int i10 = 0; i10 < list.size(); i10++) {
                objArr[i10] = kryo.copy(list.get(i10));
            }
            return listAsList;
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer, com.esotericsoftware.kryo.Serializer
        public List read(Kryo kryo, Input input, Class cls) {
            List list = (List) super.read(kryo, input, cls);
            if (list == null) {
                return null;
            }
            return Arrays.asList(list.toArray());
        }
    }

    public static class BigDecimalSerializer extends ImmutableSerializer<BigDecimal> {
        private final BigIntegerSerializer bigIntegerSerializer = new BigIntegerSerializer();

        public BigDecimalSerializer() {
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends BigDecimal>) cls);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public BigDecimal read(Kryo kryo, Input input, Class<? extends BigDecimal> cls) {
            BigInteger bigInteger = this.bigIntegerSerializer.read(kryo, input, BigInteger.class);
            if (bigInteger == null) {
                return null;
            }
            int i10 = input.readInt(false);
            if (cls == BigDecimal.class || cls == null) {
                return (bigInteger == BigInteger.ZERO && i10 == 0) ? BigDecimal.ZERO : new BigDecimal(bigInteger, i10);
            }
            try {
                Constructor<? extends BigDecimal> constructor = cls.getConstructor(BigInteger.class, Integer.TYPE);
                if (!constructor.isAccessible()) {
                    try {
                        constructor.setAccessible(true);
                    } catch (SecurityException unused) {
                    }
                }
                return constructor.newInstance(bigInteger, Integer.valueOf(i10));
            } catch (Exception e5) {
                throw new KryoException(e5);
            }
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, BigDecimal bigDecimal) {
            if (bigDecimal == null) {
                output.writeByte((byte) 0);
            } else if (bigDecimal == BigDecimal.ZERO) {
                this.bigIntegerSerializer.write(kryo, output, BigInteger.ZERO);
                output.writeInt(0, false);
            } else {
                this.bigIntegerSerializer.write(kryo, output, bigDecimal.unscaledValue());
                output.writeInt(bigDecimal.scale(), false);
            }
        }
    }

    public static class BigIntegerSerializer extends ImmutableSerializer<BigInteger> {
        public BigIntegerSerializer() {
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends BigInteger>) cls);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public BigInteger read(Kryo kryo, Input input, Class<? extends BigInteger> cls) {
            int varInt = input.readVarInt(true);
            if (varInt == 0) {
                return null;
            }
            byte[] bytes = input.readBytes(varInt - 1);
            if (cls != BigInteger.class && cls != null) {
                try {
                    Constructor<? extends BigInteger> constructor = cls.getConstructor(byte[].class);
                    if (!constructor.isAccessible()) {
                        try {
                            constructor.setAccessible(true);
                        } catch (SecurityException unused) {
                        }
                    }
                    return constructor.newInstance(bytes);
                } catch (Exception e5) {
                    throw new KryoException(e5);
                }
            }
            if (varInt == 2) {
                byte b10 = bytes[0];
                if (b10 == 0) {
                    return BigInteger.ZERO;
                }
                if (b10 == 1) {
                    return BigInteger.ONE;
                }
                if (b10 == 10) {
                    return BigInteger.TEN;
                }
            }
            return new BigInteger(bytes);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, BigInteger bigInteger) {
            if (bigInteger == null) {
                output.writeByte((byte) 0);
                return;
            }
            if (bigInteger == BigInteger.ZERO) {
                output.writeByte(2);
                output.writeByte(0);
            } else {
                byte[] byteArray = bigInteger.toByteArray();
                output.writeVarInt(byteArray.length + 1, true);
                output.writeBytes(byteArray);
            }
        }
    }

    public static class BitSetSerializer extends Serializer<BitSet> {
        @Override // com.esotericsoftware.kryo.Serializer
        public BitSet copy(Kryo kryo, BitSet bitSet) {
            return BitSet.valueOf(bitSet.toLongArray());
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public BitSet read(Kryo kryo, Input input, Class<? extends BitSet> cls) {
            return BitSet.valueOf(input.readLongs(input.readVarInt(true)));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, BitSet bitSet) {
            long[] longArray = bitSet.toLongArray();
            output.writeVarInt(longArray.length, true);
            output.writeLongs(longArray, 0, longArray.length);
        }
    }

    public static class BooleanSerializer extends ImmutableSerializer<Boolean> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends Boolean>) cls);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Boolean read(Kryo kryo, Input input, Class<? extends Boolean> cls) {
            return Boolean.valueOf(input.readBoolean());
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Boolean bool) {
            output.writeBoolean(bool.booleanValue());
        }
    }

    public static class ByteSerializer extends ImmutableSerializer<Byte> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends Byte>) cls);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Byte read(Kryo kryo, Input input, Class<? extends Byte> cls) {
            return Byte.valueOf(input.readByte());
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Byte b10) {
            output.writeByte(b10.byteValue());
        }
    }

    public static class CalendarSerializer extends Serializer<Calendar> {
        private static final long DEFAULT_GREGORIAN_CUTOVER = -12219292800000L;
        TimeZoneSerializer timeZoneSerializer = new TimeZoneSerializer();

        @Override // com.esotericsoftware.kryo.Serializer
        public Calendar copy(Kryo kryo, Calendar calendar) {
            return (Calendar) calendar.clone();
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Calendar read(Kryo kryo, Input input, Class<? extends Calendar> cls) {
            Calendar calendar = Calendar.getInstance(this.timeZoneSerializer.read(kryo, input, TimeZone.class));
            calendar.setTimeInMillis(input.readVarLong(true));
            calendar.setLenient(input.readBoolean());
            calendar.setFirstDayOfWeek(input.readInt(true));
            calendar.setMinimalDaysInFirstWeek(input.readInt(true));
            long varLong = input.readVarLong(false);
            if (varLong != DEFAULT_GREGORIAN_CUTOVER && (calendar instanceof GregorianCalendar)) {
                ((GregorianCalendar) calendar).setGregorianChange(new Date(varLong));
            }
            return calendar;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Calendar calendar) {
            this.timeZoneSerializer.write(kryo, output, calendar.getTimeZone());
            output.writeVarLong(calendar.getTimeInMillis(), true);
            output.writeBoolean(calendar.isLenient());
            output.writeInt(calendar.getFirstDayOfWeek(), true);
            output.writeInt(calendar.getMinimalDaysInFirstWeek(), true);
            if (calendar instanceof GregorianCalendar) {
                output.writeVarLong(((GregorianCalendar) calendar).getGregorianChange().getTime(), false);
            } else {
                output.writeVarLong(DEFAULT_GREGORIAN_CUTOVER, false);
            }
        }
    }

    public static class CharSerializer extends ImmutableSerializer<Character> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends Character>) cls);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Character read(Kryo kryo, Input input, Class<? extends Character> cls) {
            return Character.valueOf(input.readChar());
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Character ch2) {
            output.writeChar(ch2.charValue());
        }
    }

    public static class CharsetSerializer extends ImmutableSerializer<Charset> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends Charset>) cls);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Charset read(Kryo kryo, Input input, Class<? extends Charset> cls) {
            return Charset.forName(input.readString());
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Charset charset) {
            output.writeString(charset.name());
        }
    }

    public static class ClassSerializer extends ImmutableSerializer<Class> {
        public ClassSerializer() {
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends Class>) cls);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Class read(Kryo kryo, Input input, Class<? extends Class> cls) {
            Registration registration = kryo.readClass(input);
            if (registration == null) {
                return null;
            }
            Class type = registration.getType();
            return (!type.isPrimitive() || input.readBoolean()) ? type : Util.getWrapperClass(type);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Class cls) {
            kryo.writeClass(output, cls);
            if (cls != null) {
                if (cls.isPrimitive() || Util.isWrapperClass(cls)) {
                    output.writeBoolean(cls.isPrimitive());
                }
            }
        }
    }

    public static class CollectionsEmptyListSerializer extends ImmutableSerializer<Collection> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends Collection>) cls);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Collection collection) {
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Collection read(Kryo kryo, Input input, Class<? extends Collection> cls) {
            return Collections.EMPTY_LIST;
        }
    }

    public static class CollectionsEmptyMapSerializer extends ImmutableSerializer<Map> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends Map>) cls);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Map map) {
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Map read(Kryo kryo, Input input, Class<? extends Map> cls) {
            return Collections.EMPTY_MAP;
        }
    }

    public static class CollectionsEmptySetSerializer extends ImmutableSerializer<Set> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends Set>) cls);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Set set) {
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Set read(Kryo kryo, Input input, Class<? extends Set> cls) {
            return Collections.EMPTY_SET;
        }
    }

    public static class CollectionsSingletonListSerializer extends Serializer<List> {
        @Override // com.esotericsoftware.kryo.Serializer
        public List copy(Kryo kryo, List list) {
            return Collections.singletonList(kryo.copy(list.get(0)));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public List read(Kryo kryo, Input input, Class<? extends List> cls) {
            return Collections.singletonList(kryo.readClassAndObject(input));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, List list) {
            kryo.writeClassAndObject(output, list.get(0));
        }
    }

    public static class CollectionsSingletonMapSerializer extends Serializer<Map> {
        @Override // com.esotericsoftware.kryo.Serializer
        public Map copy(Kryo kryo, Map map) {
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            return Collections.singletonMap(kryo.copy(entry.getKey()), kryo.copy(entry.getValue()));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Map read(Kryo kryo, Input input, Class<? extends Map> cls) {
            return Collections.singletonMap(kryo.readClassAndObject(input), kryo.readClassAndObject(input));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Map map) {
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            kryo.writeClassAndObject(output, entry.getKey());
            kryo.writeClassAndObject(output, entry.getValue());
        }
    }

    public static class CollectionsSingletonSetSerializer extends Serializer<Set> {
        @Override // com.esotericsoftware.kryo.Serializer
        public Set copy(Kryo kryo, Set set) {
            return Collections.singleton(kryo.copy(set.iterator().next()));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Set read(Kryo kryo, Input input, Class<? extends Set> cls) {
            return Collections.singleton(kryo.readClassAndObject(input));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Set set) {
            kryo.writeClassAndObject(output, set.iterator().next());
        }
    }

    public static class ConcurrentSkipListMapSerializer extends MapSerializer<ConcurrentSkipListMap> {
        private ConcurrentSkipListMap createConcurrentSkipListMap(Class<? extends ConcurrentSkipListMap> cls, Comparator comparator) {
            if (cls == ConcurrentSkipListMap.class || cls == null) {
                return new ConcurrentSkipListMap(comparator);
            }
            try {
                Constructor<? extends ConcurrentSkipListMap> constructor = cls.getConstructor(Comparator.class);
                if (!constructor.isAccessible()) {
                    try {
                        constructor.setAccessible(true);
                    } catch (SecurityException unused) {
                    }
                }
                return constructor.newInstance(comparator);
            } catch (Exception e5) {
                throw new KryoException(e5);
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.MapSerializer
        public /* bridge */ /* synthetic */ Map create(Kryo kryo, Input input, Class cls, int i10) {
            return create(kryo, input, (Class<? extends ConcurrentSkipListMap>) cls, i10);
        }

        @Override // com.esotericsoftware.kryo.serializers.MapSerializer
        public ConcurrentSkipListMap create(Kryo kryo, Input input, Class<? extends ConcurrentSkipListMap> cls, int i10) {
            return createConcurrentSkipListMap(cls, (Comparator) kryo.readClassAndObject(input));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.esotericsoftware.kryo.serializers.MapSerializer
        public ConcurrentSkipListMap createCopy(Kryo kryo, ConcurrentSkipListMap concurrentSkipListMap) {
            return createConcurrentSkipListMap(concurrentSkipListMap.getClass(), concurrentSkipListMap.comparator());
        }

        @Override // com.esotericsoftware.kryo.serializers.MapSerializer
        public void writeHeader(Kryo kryo, Output output, ConcurrentSkipListMap concurrentSkipListMap) {
            kryo.writeClassAndObject(output, concurrentSkipListMap.comparator());
        }
    }

    public static class CurrencySerializer extends ImmutableSerializer<Currency> {
        public CurrencySerializer() {
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends Currency>) cls);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Currency read(Kryo kryo, Input input, Class<? extends Currency> cls) {
            String string = input.readString();
            if (string == null) {
                return null;
            }
            return Currency.getInstance(string);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Currency currency) {
            output.writeString(currency == null ? null : currency.getCurrencyCode());
        }
    }

    public static class DateSerializer extends Serializer<Date> {
        private Date create(Kryo kryo, Class<? extends Date> cls, long j10) throws KryoException {
            if (cls == Date.class || cls == null) {
                return new Date(j10);
            }
            if (cls == Timestamp.class) {
                return new Timestamp(j10);
            }
            if (cls == java.sql.Date.class) {
                return new java.sql.Date(j10);
            }
            if (cls == Time.class) {
                return new Time(j10);
            }
            try {
                Constructor<? extends Date> constructor = cls.getConstructor(Long.TYPE);
                if (!constructor.isAccessible()) {
                    try {
                        constructor.setAccessible(true);
                    } catch (SecurityException unused) {
                    }
                }
                return constructor.newInstance(Long.valueOf(j10));
            } catch (Exception unused2) {
                Date date = (Date) kryo.newInstance(cls);
                date.setTime(j10);
                return date;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.esotericsoftware.kryo.Serializer
        public Date copy(Kryo kryo, Date date) {
            return create(kryo, date.getClass(), date.getTime());
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Date read(Kryo kryo, Input input, Class<? extends Date> cls) {
            return create(kryo, cls, input.readVarLong(true));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Date date) {
            output.writeVarLong(date.getTime(), true);
        }
    }

    public static class DoubleSerializer extends ImmutableSerializer<Double> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends Double>) cls);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Double read(Kryo kryo, Input input, Class<? extends Double> cls) {
            return Double.valueOf(input.readDouble());
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Double d2) {
            output.writeDouble(d2.doubleValue());
        }
    }

    public static class EnumSerializer extends ImmutableSerializer<Enum> {
        private Object[] enumConstants;

        public EnumSerializer(Class<? extends Enum> cls) {
            setAcceptsNull(true);
            Object[] enumConstants = cls.getEnumConstants();
            this.enumConstants = enumConstants;
            if (enumConstants == null && !Enum.class.equals(cls)) {
                throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.q.c("The type must be an enum: ", cls));
            }
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends Enum>) cls);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Enum read(Kryo kryo, Input input, Class<? extends Enum> cls) {
            int varInt = input.readVarInt(true);
            if (varInt == 0) {
                return null;
            }
            int i10 = varInt - 1;
            if (i10 >= 0) {
                Object[] objArr = this.enumConstants;
                if (i10 <= objArr.length - 1) {
                    return (Enum) objArr[i10];
                }
            }
            throw new KryoException("Invalid ordinal for enum \"" + cls.getName() + "\": " + i10);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Enum r3) {
            if (r3 == null) {
                output.writeVarInt(0, true);
            } else {
                output.writeVarInt(r3.ordinal() + 1, true);
            }
        }
    }

    public static class EnumSetSerializer extends Serializer<EnumSet> {
        @Override // com.esotericsoftware.kryo.Serializer
        public EnumSet copy(Kryo kryo, EnumSet enumSet) {
            return EnumSet.copyOf(enumSet);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public EnumSet read(Kryo kryo, Input input, Class<? extends EnumSet> cls) {
            Registration registration = kryo.readClass(input);
            EnumSet enumSetNoneOf = EnumSet.noneOf(registration.getType());
            Serializer serializer = registration.getSerializer();
            int varInt = input.readVarInt(true);
            for (int i10 = 0; i10 < varInt; i10++) {
                enumSetNoneOf.add(serializer.read(kryo, input, null));
            }
            return enumSetNoneOf;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, EnumSet enumSet) {
            Serializer serializer;
            if (enumSet.isEmpty()) {
                EnumSet enumSetComplementOf = EnumSet.complementOf(enumSet);
                if (enumSetComplementOf.isEmpty()) {
                    throw new KryoException("An EnumSet must have a defined Enum to be serialized.");
                }
                serializer = kryo.writeClass(output, enumSetComplementOf.iterator().next().getClass()).getSerializer();
            } else {
                serializer = kryo.writeClass(output, enumSet.iterator().next().getClass()).getSerializer();
            }
            output.writeVarInt(enumSet.size(), true);
            Iterator it = enumSet.iterator();
            while (it.hasNext()) {
                serializer.write(kryo, output, it.next());
            }
        }
    }

    public static class FloatSerializer extends ImmutableSerializer<Float> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends Float>) cls);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Float read(Kryo kryo, Input input, Class<? extends Float> cls) {
            return Float.valueOf(input.readFloat());
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Float f6) {
            output.writeFloat(f6.floatValue());
        }
    }

    public static class IntSerializer extends ImmutableSerializer<Integer> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends Integer>) cls);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Integer read(Kryo kryo, Input input, Class<? extends Integer> cls) {
            return Integer.valueOf(input.readInt(false));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Integer num) {
            output.writeInt(num.intValue(), false);
        }
    }

    public static class KryoSerializableSerializer extends Serializer<KryoSerializable> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.esotericsoftware.kryo.Serializer
        public KryoSerializable read(Kryo kryo, Input input, Class<? extends KryoSerializable> cls) {
            KryoSerializable kryoSerializable = (KryoSerializable) kryo.newInstance(cls);
            kryo.reference(kryoSerializable);
            kryoSerializable.read(kryo, input);
            return kryoSerializable;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, KryoSerializable kryoSerializable) {
            kryoSerializable.write(kryo, output);
        }
    }

    public static class LocaleSerializer extends ImmutableSerializer<Locale> {
        public static final Locale SPANISH = new Locale("es", "", "");
        public static final Locale SPAIN = new Locale("es", "ES", "");

        public static boolean isSameLocale(Locale locale, String str, String str2, String str3) {
            return locale.getLanguage().equals(str) && locale.getCountry().equals(str2) && locale.getVariant().equals(str3);
        }

        public Locale create(String str, String str2, String str3) {
            Locale locale = Locale.getDefault();
            if (isSameLocale(locale, str, str2, str3)) {
                return locale;
            }
            Locale locale2 = Locale.US;
            if (locale != locale2 && isSameLocale(locale2, str, str2, str3)) {
                return locale2;
            }
            Locale locale3 = Locale.ENGLISH;
            if (isSameLocale(locale3, str, str2, str3)) {
                return locale3;
            }
            Locale locale4 = Locale.GERMAN;
            if (isSameLocale(locale4, str, str2, str3)) {
                return locale4;
            }
            Locale locale5 = SPANISH;
            if (isSameLocale(locale5, str, str2, str3)) {
                return locale5;
            }
            Locale locale6 = Locale.FRENCH;
            if (isSameLocale(locale6, str, str2, str3)) {
                return locale6;
            }
            Locale locale7 = Locale.ITALIAN;
            if (isSameLocale(locale7, str, str2, str3)) {
                return locale7;
            }
            Locale locale8 = Locale.JAPANESE;
            if (isSameLocale(locale8, str, str2, str3)) {
                return locale8;
            }
            Locale locale9 = Locale.KOREAN;
            if (isSameLocale(locale9, str, str2, str3)) {
                return locale9;
            }
            Locale locale10 = Locale.SIMPLIFIED_CHINESE;
            if (isSameLocale(locale10, str, str2, str3)) {
                return locale10;
            }
            Locale locale11 = Locale.CHINESE;
            if (isSameLocale(locale11, str, str2, str3)) {
                return locale11;
            }
            Locale locale12 = Locale.TRADITIONAL_CHINESE;
            if (isSameLocale(locale12, str, str2, str3)) {
                return locale12;
            }
            Locale locale13 = Locale.UK;
            if (isSameLocale(locale13, str, str2, str3)) {
                return locale13;
            }
            Locale locale14 = Locale.GERMANY;
            if (isSameLocale(locale14, str, str2, str3)) {
                return locale14;
            }
            Locale locale15 = SPAIN;
            if (isSameLocale(locale15, str, str2, str3)) {
                return locale15;
            }
            Locale locale16 = Locale.FRANCE;
            if (isSameLocale(locale16, str, str2, str3)) {
                return locale16;
            }
            Locale locale17 = Locale.ITALY;
            if (isSameLocale(locale17, str, str2, str3)) {
                return locale17;
            }
            Locale locale18 = Locale.JAPAN;
            if (isSameLocale(locale18, str, str2, str3)) {
                return locale18;
            }
            Locale locale19 = Locale.KOREA;
            if (isSameLocale(locale19, str, str2, str3)) {
                return locale19;
            }
            Locale locale20 = Locale.CANADA;
            if (isSameLocale(locale20, str, str2, str3)) {
                return locale20;
            }
            Locale locale21 = Locale.CANADA_FRENCH;
            return isSameLocale(locale21, str, str2, str3) ? locale21 : new Locale(str, str2, str3);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends Locale>) cls);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Locale read(Kryo kryo, Input input, Class<? extends Locale> cls) {
            return create(input.readString(), input.readString(), input.readString());
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Locale locale) {
            output.writeAscii(locale.getLanguage());
            output.writeAscii(locale.getCountry());
            output.writeString(locale.getVariant());
        }
    }

    public static class LongSerializer extends ImmutableSerializer<Long> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends Long>) cls);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Long read(Kryo kryo, Input input, Class<? extends Long> cls) {
            return Long.valueOf(input.readVarLong(false));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Long l6) {
            output.writeVarLong(l6.longValue(), false);
        }
    }

    public static class PriorityQueueSerializer extends CollectionSerializer<PriorityQueue> {
        private PriorityQueue createPriorityQueue(Class<? extends Collection> cls, int i10, Comparator comparator) {
            if (cls == PriorityQueue.class || cls == null) {
                return new PriorityQueue(i10, comparator);
            }
            try {
                Constructor<? extends Collection> constructor = cls.getConstructor(Integer.TYPE, Comparator.class);
                if (!constructor.isAccessible()) {
                    try {
                        constructor.setAccessible(true);
                    } catch (SecurityException unused) {
                    }
                }
                return (PriorityQueue) constructor.newInstance(comparator);
            } catch (Exception e5) {
                throw new KryoException(e5);
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
        public /* bridge */ /* synthetic */ Collection create(Kryo kryo, Input input, Class cls, int i10) {
            return create(kryo, input, (Class<? extends PriorityQueue>) cls, i10);
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
        public PriorityQueue create(Kryo kryo, Input input, Class<? extends PriorityQueue> cls, int i10) {
            return createPriorityQueue(cls, i10, (Comparator) kryo.readClassAndObject(input));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
        public PriorityQueue createCopy(Kryo kryo, PriorityQueue priorityQueue) {
            return createPriorityQueue(priorityQueue.getClass(), priorityQueue.size(), priorityQueue.comparator());
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
        public void writeHeader(Kryo kryo, Output output, PriorityQueue priorityQueue) {
            kryo.writeClassAndObject(output, priorityQueue.comparator());
        }
    }

    public static class ShortSerializer extends ImmutableSerializer<Short> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends Short>) cls);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Short read(Kryo kryo, Input input, Class<? extends Short> cls) {
            return Short.valueOf(input.readShort());
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Short sh2) {
            output.writeShort(sh2.shortValue());
        }
    }

    public static class StringBufferSerializer extends Serializer<StringBuffer> {
        public StringBufferSerializer() {
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public StringBuffer copy(Kryo kryo, StringBuffer stringBuffer) {
            return new StringBuffer(stringBuffer);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public StringBuffer read(Kryo kryo, Input input, Class<? extends StringBuffer> cls) {
            String string = input.readString();
            if (string == null) {
                return null;
            }
            return new StringBuffer(string);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, StringBuffer stringBuffer) {
            output.writeString(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    public static class StringBuilderSerializer extends Serializer<StringBuilder> {
        public StringBuilderSerializer() {
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public StringBuilder copy(Kryo kryo, StringBuilder sb2) {
            return new StringBuilder(sb2);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public StringBuilder read(Kryo kryo, Input input, Class<? extends StringBuilder> cls) {
            return input.readStringBuilder();
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, StringBuilder sb2) {
            output.writeString(sb2 == null ? null : sb2.toString());
        }
    }

    public static class StringSerializer extends ImmutableSerializer<String> {
        public StringSerializer() {
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends String>) cls);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public String read(Kryo kryo, Input input, Class<? extends String> cls) {
            return input.readString();
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, String str) {
            output.writeString(str);
        }
    }

    public static class TimeZoneSerializer extends ImmutableSerializer<TimeZone> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends TimeZone>) cls);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public TimeZone read(Kryo kryo, Input input, Class<? extends TimeZone> cls) {
            return TimeZone.getTimeZone(input.readString());
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, TimeZone timeZone) {
            output.writeString(timeZone.getID());
        }
    }

    public static class TreeMapSerializer extends MapSerializer<TreeMap> {
        private TreeMap createTreeMap(Class<? extends TreeMap> cls, Comparator comparator) {
            if (cls == TreeMap.class || cls == null) {
                return new TreeMap(comparator);
            }
            try {
                Constructor<? extends TreeMap> constructor = cls.getConstructor(Comparator.class);
                if (!constructor.isAccessible()) {
                    try {
                        constructor.setAccessible(true);
                    } catch (SecurityException unused) {
                    }
                }
                return constructor.newInstance(comparator);
            } catch (Exception e5) {
                throw new KryoException(e5);
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.MapSerializer
        public /* bridge */ /* synthetic */ Map create(Kryo kryo, Input input, Class cls, int i10) {
            return create(kryo, input, (Class<? extends TreeMap>) cls, i10);
        }

        @Override // com.esotericsoftware.kryo.serializers.MapSerializer
        public TreeMap create(Kryo kryo, Input input, Class<? extends TreeMap> cls, int i10) {
            return createTreeMap(cls, (Comparator) kryo.readClassAndObject(input));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.esotericsoftware.kryo.serializers.MapSerializer
        public TreeMap createCopy(Kryo kryo, TreeMap treeMap) {
            return createTreeMap(treeMap.getClass(), treeMap.comparator());
        }

        @Override // com.esotericsoftware.kryo.serializers.MapSerializer
        public void writeHeader(Kryo kryo, Output output, TreeMap treeMap) {
            kryo.writeClassAndObject(output, treeMap.comparator());
        }
    }

    public static class TreeSetSerializer extends CollectionSerializer<TreeSet> {
        private TreeSet createTreeSet(Class<? extends Collection> cls, Comparator comparator) {
            if (cls == TreeSet.class || cls == null) {
                return new TreeSet(comparator);
            }
            try {
                Constructor<? extends Collection> constructor = cls.getConstructor(Comparator.class);
                if (!constructor.isAccessible()) {
                    try {
                        constructor.setAccessible(true);
                    } catch (SecurityException unused) {
                    }
                }
                return (TreeSet) constructor.newInstance(comparator);
            } catch (Exception e5) {
                throw new KryoException(e5);
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
        public /* bridge */ /* synthetic */ Collection create(Kryo kryo, Input input, Class cls, int i10) {
            return create(kryo, input, (Class<? extends TreeSet>) cls, i10);
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
        public TreeSet create(Kryo kryo, Input input, Class<? extends TreeSet> cls, int i10) {
            return createTreeSet(cls, (Comparator) kryo.readClassAndObject(input));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
        public TreeSet createCopy(Kryo kryo, TreeSet treeSet) {
            return createTreeSet(treeSet.getClass(), treeSet.comparator());
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
        public void writeHeader(Kryo kryo, Output output, TreeSet treeSet) {
            kryo.writeClassAndObject(output, treeSet.comparator());
        }
    }

    public static class URLSerializer extends ImmutableSerializer<URL> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends URL>) cls);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public URL read(Kryo kryo, Input input, Class<? extends URL> cls) {
            try {
                return new URL(input.readString());
            } catch (MalformedURLException e5) {
                throw new KryoException(e5);
            }
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, URL url) {
            output.writeString(url.toExternalForm());
        }
    }

    public static class VoidSerializer extends ImmutableSerializer {
        @Override // com.esotericsoftware.kryo.Serializer
        public Object read(Kryo kryo, Input input, Class cls) {
            return null;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Object obj) {
        }
    }
}
