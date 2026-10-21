package com.esotericsoftware.kryo.util;

import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.o1;
import androidx.camera.core.processing.f;
import com.esotericsoftware.kryo.ClassResolver;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Registration;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.minlog.Log;

/* JADX INFO: loaded from: classes9.dex */
public class DefaultClassResolver implements ClassResolver {
    public static final byte NAME = -1;
    protected IdentityObjectIntMap<Class> classToNameId;
    protected Kryo kryo;
    private Class memoizedClass;
    private Registration memoizedClassIdValue;
    private Registration memoizedClassValue;
    protected IntMap<Class> nameIdToClass;
    protected ObjectMap<String, Class> nameToClass;
    protected int nextNameId;
    protected final IntMap<Registration> idToRegistration = new IntMap<>();
    protected final CuckooObjectMap<Class, Registration> classToRegistration = new CuckooObjectMap<>();
    private int memoizedClassId = -1;

    @Override // com.esotericsoftware.kryo.ClassResolver
    public Registration getRegistration(Class cls) {
        if (cls == this.memoizedClass) {
            return this.memoizedClassValue;
        }
        Registration registration = this.classToRegistration.get(cls);
        if (registration != null) {
            this.memoizedClass = cls;
            this.memoizedClassValue = registration;
        }
        return registration;
    }

    public Class getTypeByName(String str) {
        ObjectMap<String, Class> objectMap = this.nameToClass;
        if (objectMap != null) {
            return objectMap.get(str);
        }
        return null;
    }

    @Override // com.esotericsoftware.kryo.ClassResolver
    public Registration readClass(Input input) {
        int varInt = input.readVarInt(true);
        if (varInt == 0) {
            if (Log.TRACE || (Log.DEBUG && this.kryo.getDepth() == 1)) {
                Util.log("Read", null, input.position());
            }
            return null;
        }
        if (varInt == 1) {
            return readName(input);
        }
        if (varInt == this.memoizedClassId) {
            if (Log.TRACE) {
                StringBuilder sb2 = new StringBuilder("Read class ");
                sb2.append(varInt - 2);
                sb2.append(": ");
                sb2.append(Util.className(this.memoizedClassIdValue.getType()));
                sb2.append(Util.pos(input.position()));
                Log.trace("kryo", sb2.toString());
            }
            return this.memoizedClassIdValue;
        }
        int i10 = varInt - 2;
        Registration registration = this.idToRegistration.get(i10);
        if (registration == null) {
            throw new KryoException(g0.c("Encountered unregistered class ID: ", i10));
        }
        if (Log.TRACE) {
            StringBuilder sbC = o1.c("Read class ", i10, ": ");
            sbC.append(Util.className(registration.getType()));
            sbC.append(Util.pos(input.position()));
            Log.trace("kryo", sbC.toString());
        }
        this.memoizedClassId = varInt;
        this.memoizedClassIdValue = registration;
        return registration;
    }

    public Registration readName(Input input) {
        int varInt = input.readVarInt(true);
        if (this.nameIdToClass == null) {
            this.nameIdToClass = new IntMap<>();
        }
        Class<?> cls = this.nameIdToClass.get(varInt);
        if (cls == null) {
            String string = input.readString();
            Class<?> typeByName = getTypeByName(string);
            if (typeByName == null) {
                try {
                    typeByName = Class.forName(string, false, this.kryo.getClassLoader());
                } catch (ClassNotFoundException e5) {
                    try {
                        typeByName = Class.forName(string, false, Kryo.class.getClassLoader());
                    } catch (ClassNotFoundException unused) {
                        throw new KryoException(f.d("Unable to find class: ", string), e5);
                    }
                }
                if (this.nameToClass == null) {
                    this.nameToClass = new ObjectMap<>();
                }
                this.nameToClass.put(string, typeByName);
            }
            this.nameIdToClass.put(varInt, typeByName);
            if (Log.TRACE) {
                Log.trace("kryo", "Read class name: " + string + Util.pos(input.position()));
            }
            cls = typeByName;
        } else if (Log.TRACE) {
            StringBuilder sbC = o1.c("Read class name reference ", varInt, ": ");
            sbC.append(Util.className(cls));
            sbC.append(Util.pos(input.position()));
            Log.trace("kryo", sbC.toString());
        }
        return this.kryo.getRegistration(cls);
    }

    @Override // com.esotericsoftware.kryo.ClassResolver
    public Registration register(Registration registration) {
        this.memoizedClassId = -1;
        this.memoizedClass = null;
        if (registration == null) {
            throw new IllegalArgumentException("registration cannot be null.");
        }
        if (registration.getId() != -1) {
            if (Log.TRACE) {
                Log.trace("kryo", "Register class ID " + registration.getId() + ": " + Util.className(registration.getType()) + " (" + registration.getSerializer().getClass().getName() + ")");
            }
            this.idToRegistration.put(registration.getId(), registration);
        } else if (Log.TRACE) {
            Log.trace("kryo", "Register class name: " + Util.className(registration.getType()) + " (" + registration.getSerializer().getClass().getName() + ")");
        }
        this.classToRegistration.put(registration.getType(), registration);
        Class wrapperClass = Util.getWrapperClass(registration.getType());
        if (wrapperClass != registration.getType()) {
            this.classToRegistration.put(wrapperClass, registration);
        }
        return registration;
    }

    @Override // com.esotericsoftware.kryo.ClassResolver
    public Registration registerImplicit(Class cls) {
        return register(new Registration(cls, this.kryo.getDefaultSerializer(cls), -1));
    }

    @Override // com.esotericsoftware.kryo.ClassResolver
    public void reset() {
        if (this.kryo.isRegistrationRequired()) {
            return;
        }
        IdentityObjectIntMap<Class> identityObjectIntMap = this.classToNameId;
        if (identityObjectIntMap != null) {
            identityObjectIntMap.clear(2048);
        }
        IntMap<Class> intMap = this.nameIdToClass;
        if (intMap != null) {
            intMap.clear();
        }
        this.nextNameId = 0;
    }

    @Override // com.esotericsoftware.kryo.ClassResolver
    public void setKryo(Kryo kryo) {
        this.kryo = kryo;
    }

    @Override // com.esotericsoftware.kryo.ClassResolver
    public Registration unregister(int i10) {
        Registration registrationRemove = this.idToRegistration.remove(i10);
        if (registrationRemove != null) {
            this.classToRegistration.remove(registrationRemove.getType());
            this.memoizedClassId = -1;
            this.memoizedClass = null;
            Class wrapperClass = Util.getWrapperClass(registrationRemove.getType());
            if (wrapperClass != registrationRemove.getType()) {
                this.classToRegistration.remove(wrapperClass);
            }
        }
        return registrationRemove;
    }

    @Override // com.esotericsoftware.kryo.ClassResolver
    public Registration writeClass(Output output, Class cls) {
        if (cls == null) {
            if (Log.TRACE || (Log.DEBUG && this.kryo.getDepth() == 1)) {
                Util.log("Write", null, output.position());
            }
            output.writeByte((byte) 0);
            return null;
        }
        Registration registration = this.kryo.getRegistration(cls);
        if (registration.getId() == -1) {
            writeName(output, cls, registration);
        } else {
            if (Log.TRACE) {
                Log.trace("kryo", "Write class " + registration.getId() + ": " + Util.className(cls) + Util.pos(output.position()));
            }
            output.writeVarInt(registration.getId() + 2, true);
        }
        return registration;
    }

    public void writeName(Output output, Class cls, Registration registration) {
        int i10;
        output.writeByte(1);
        IdentityObjectIntMap<Class> identityObjectIntMap = this.classToNameId;
        if (identityObjectIntMap != null && (i10 = identityObjectIntMap.get(cls, -1)) != -1) {
            if (Log.TRACE) {
                StringBuilder sbC = o1.c("Write class name reference ", i10, ": ");
                sbC.append(Util.className(cls));
                sbC.append(Util.pos(output.position()));
                Log.trace("kryo", sbC.toString());
            }
            output.writeVarInt(i10, true);
            return;
        }
        if (Log.TRACE) {
            Log.trace("kryo", "Write class name: " + Util.className(cls) + Util.pos(output.position()));
        }
        int i11 = this.nextNameId;
        this.nextNameId = i11 + 1;
        if (this.classToNameId == null) {
            this.classToNameId = new IdentityObjectIntMap<>();
        }
        this.classToNameId.put(cls, i11);
        output.writeVarInt(i11, true);
        if (registration.isTypeNameAscii()) {
            output.writeAscii(cls.getName());
        } else {
            output.writeString(cls.getName());
        }
    }

    @Override // com.esotericsoftware.kryo.ClassResolver
    public Registration getRegistration(int i10) {
        return this.idToRegistration.get(i10);
    }
}
